package defpackage;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class ege0 implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(final Runnable runnable) {
        PrivilegedAction privilegedAction = new PrivilegedAction() { // from class: jge0
            @Override // java.security.PrivilegedAction
            public final Object run() {
                Thread thread = new Thread(runnable, "supportability_metrics_reporter");
                thread.setDaemon(true);
                thread.setContextClassLoader(null);
                return thread;
            }
        };
        return (Thread) (System.getSecurityManager() == null ? privilegedAction.run() : AccessController.doPrivileged(privilegedAction));
    }
}
