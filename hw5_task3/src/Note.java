import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Note
{
    ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
    ReentrantReadWriteLock.WriteLock wl = rwl.writeLock();
    ReentrantReadWriteLock.ReadLock rl = rwl.readLock();
    public final List<String> notes = new ArrayList<String>();

    public void addNote(int index, String note) {
        wl.lock();
        try {
            System.out.println("Сейчас будет добавлена заметка [" + note + "] На позицию " + index);
            notes.add(index, note);
            System.out.println("Уже добавлена заметка [" + note + "]");
            wl.unlock();
        }
        finally {
            wl.unlock();
        }
    }

    public void removeNote(int index) {
        wl.lock();
        try {
            System.out.println("Сейчас будет удалена заметка с позиции " + index);
            String note;
            note = notes.remove(index);
            System.out.println("Уже удалена заметка [" + note + "] с позиции " + index);
        } finally {
            wl.unlock();
        }
    }

    public void readNote(int index)
    {
        rl.lock();
        try {
            System.out.println("Сейчас будет прочтена заметка с позиции " + index);
            String note;
            note = notes.get(index);
            System.out.println("Прочтена заметка [" + note + "] с позиции " + index);
            rl.lock();
        } finally {
            rl.unlock();
        }
    }
}
