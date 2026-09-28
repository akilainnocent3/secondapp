package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class uj50 {
    public static final zi50.b a(Throwable th) {
        th.getClass();
        return new zi50.b(th);
    }

    public static final void b(Object obj) {
        if (obj instanceof zi50.b) {
            throw ((zi50.b) obj).a;
        }
    }
}
