package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class c31 implements d31 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f147533h = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fh f147534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yg f147535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wg f147536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f147537d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public tg f147538e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e31 f147539f = e31.f148478b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f147540g;

    public c31(Context context, fh fhVar, yg ygVar, wg wgVar, bj1 bj1Var) {
        this.f147534a = fhVar;
        this.f147535b = ygVar;
        this.f147536c = wgVar;
        this.f147537d = context.getApplicationContext();
        this.f147540g = bj1Var.a();
    }

    public final void a(tg tgVar) {
        synchronized (f147533h) {
            try {
                this.f147535b.getClass();
                String str = tgVar.f155882a;
                String str2 = tgVar.f155883b;
                String str3 = tgVar.f155884c;
                boolean z10 = true;
                if (!(str3 == null || str3.length() == 0)) {
                    if (!(str == null || str.length() == 0)) {
                        if (str2 != null && str2.length() != 0) {
                            z10 = false;
                        }
                        if (!z10) {
                            this.f147538e = tgVar;
                        }
                    }
                }
                dr.w2 w2Var = dr.w2.f79517a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a() {
        wg wgVar = this.f147536c;
        Context context = this.f147537d;
        ug ugVar = wgVar.f157367a;
        synchronized (ugVar.f156415a) {
            ugVar.f156416b.add(this);
        }
        try {
            wgVar.a(context);
        } catch (Throwable unused) {
            wgVar.c();
            boolean z10 = ad1.f146762a;
        }
    }
}
