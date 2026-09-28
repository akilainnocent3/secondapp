package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class j7l0 implements Thread.UncaughtExceptionHandler {
    public final String a;
    public final /* synthetic */ p7l0 b;

    public j7l0(p7l0 p7l0Var, String str) {
        this.b = p7l0Var;
        this.a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        y4l0 y4l0Var = this.b.a.f;
        k8l0.m(y4l0Var);
        y4l0Var.f.b(th, this.a);
    }
}
