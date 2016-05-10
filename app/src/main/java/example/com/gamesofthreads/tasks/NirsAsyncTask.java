package example.com.gamesofthreads.tasks;

/**
 * Created by Nir on 5/10/2016.
 */
public class NirsAsyncTask implements Runnable {


    @Override
    public void run() {
        android.os.Process.setThreadPriority(android.os.Process.THREAD_PRIORITY_BACKGROUND);

    }
}
