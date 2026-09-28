package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class cug {
    public static final a b = new a();
    public static volatile cug c;
    public final mpe0 a = hwr.b(new bug());

    public static final class a {
    }

    public static final cug a() {
        cug cugVar;
        a aVar = b;
        cug cugVar2 = c;
        if (cugVar2 != null) {
            return cugVar2;
        }
        synchronized (aVar) {
            cugVar = c;
            if (cugVar == null) {
                cugVar = new cug();
                c = cugVar;
            }
        }
        return cugVar;
    }
}
