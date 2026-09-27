package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class bj1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f147218c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cj1 f147219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aj1 f147220b = new aj1();

    public bj1(rg1 rg1Var) {
        this.f147219a = new cj1(rg1Var);
    }

    public final String a() {
        String strA;
        synchronized (f147218c) {
            strA = this.f147219a.a();
            if (strA == null) {
                this.f147220b.getClass();
                strA = aj1.a();
                this.f147219a.a(strA);
            }
        }
        return strA;
    }
}
