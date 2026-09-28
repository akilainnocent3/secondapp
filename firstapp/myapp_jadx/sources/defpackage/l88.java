package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated
public final class l88 extends u4s {
    public static volatile l88 b;

    public l88() {
        super(0);
    }

    public static l88 f() {
        if (b == null) {
            synchronized (l88.class) {
                try {
                    if (b == null) {
                        b = new l88();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    @Override // defpackage.u4s
    public final hqc b() {
        return null;
    }
}
