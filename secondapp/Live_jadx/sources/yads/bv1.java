package yads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class bv1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static bv1 f147356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f147357c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fr.m f147358a = new fr.m();

    public final void a(du1 du1Var, String str, String str2) {
        if (eu1.f148844a.a()) {
            zu1 zu1Var = new zu1(System.currentTimeMillis(), du1Var.name(), str, str2);
            synchronized (f147357c) {
                try {
                    if (this.f147358a.size() > 5000) {
                        this.f147358a.removeFirst();
                    }
                    this.f147358a.add(zu1Var);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final List b() {
        List listA6;
        synchronized (f147357c) {
            listA6 = fr.r0.a6(this.f147358a);
        }
        return listA6;
    }

    public final void a() {
        synchronized (f147357c) {
            this.f147358a.clear();
            dr.w2 w2Var = dr.w2.f79517a;
        }
    }
}
