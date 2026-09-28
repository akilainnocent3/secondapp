package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes8.dex */
public final class o760 {
    public static volatile gp0 a;

    public static qm70 a(Callable<qm70> callable) {
        try {
            qm70 qm70VarCall = callable.call();
            yby.b(qm70VarCall, "Scheduler Callable result can't be null");
            return qm70VarCall;
        } catch (Throwable th) {
            throw otg.c(th);
        }
    }

    public static void b(Throwable th) {
        gp0 gp0Var = a;
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!(th instanceof eoy) && !(th instanceof sqv) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof gma)) {
            th = new idh0(a320.a("The exception could not be delivered to the consumer because it has already canceled/disposed the flow or the exception has nowhere to go to begin with. Further reading: https://github.com/ReactiveX/RxJava/wiki/What's-different-in-2.0#error-handling | ", th), th);
        }
        if (gp0Var != null) {
            try {
                gp0Var.accept(th);
                return;
            } catch (Throwable th2) {
                th2.printStackTrace();
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
            }
        }
        th.printStackTrace();
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }
}
