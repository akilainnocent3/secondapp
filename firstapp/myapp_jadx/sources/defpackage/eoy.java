package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class eoy extends RuntimeException {
    public eoy(Throwable th) {
        super(a320.a("The exception was not handled due to missing onError handler in the subscribe() method call. Further reading: https://github.com/ReactiveX/RxJava/wiki/Error-Handling | ", th), th == null ? new NullPointerException() : th);
    }
}
