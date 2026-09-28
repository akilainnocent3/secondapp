package defpackage;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class cub {
    public static final liv a = new liv();

    public static <T> Task<T> a(Task<T> task, Task<T> task2) {
        final CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        Continuation<T, Task<TContinuationResult>> continuation = new Continuation() { // from class: bub
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task3) {
                boolean zIsSuccessful = task3.isSuccessful();
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                if (zIsSuccessful) {
                    taskCompletionSource2.trySetResult(task3.getResult());
                } else if (task3.getException() != null) {
                    taskCompletionSource2.trySetException(task3.getException());
                } else if (atomicBoolean.getAndSet(true)) {
                    cancellationTokenSource.cancel();
                }
                return Tasks.forResult(null);
            }
        };
        liv livVar = a;
        task.continueWithTask(livVar, continuation);
        task2.continueWithTask(livVar, continuation);
        return taskCompletionSource.getTask();
    }
}
