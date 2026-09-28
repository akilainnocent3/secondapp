package defpackage;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes4.dex */
public final class z5f0 {
    public static final Object a(Task task, x1b x1bVar) throws Exception {
        if (!task.isComplete()) {
            bc6 bc6Var = new bc6(1, yzo.b(x1bVar));
            bc6Var.q();
            task.addOnCompleteListener(mqe.a, new y5f0(bc6Var));
            Object objO = bc6Var.o();
            y5b y5bVar = y5b.a;
            return objO;
        }
        Exception exception = task.getException();
        if (exception != null) {
            throw exception;
        }
        if (!task.isCanceled()) {
            return task.getResult();
        }
        throw new CancellationException("Task " + task + " was cancelled normally.");
    }
}
