package yads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class zn3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hb2 f158973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wz2 f158974b = new wz2();

    public zn3(hb2 hb2Var) {
        this.f158973a = hb2Var;
    }

    public final void a(final Map map) {
        wz2 wz2Var = this.f158974b;
        Runnable runnable = new Runnable() { // from class: yads.wf4
            @Override // java.lang.Runnable
            public final void run() {
                zn3.a(this.f157364b, map);
            }
        };
        synchronized (wz2Var.f157590a) {
            if (wz2Var.f157591b) {
                return;
            }
            wz2Var.f157591b = true;
            dr.w2 w2Var = dr.w2.f79517a;
            runnable.run();
        }
    }

    public static final void a(zn3 zn3Var, Map map) {
        zn3Var.f158973a.setVisibility(0);
        boolean z10 = ad1.f146762a;
        hb2 hb2Var = zn3Var.f158973a;
        o11 o11Var = hb2Var.f150047g;
        if (o11Var != null) {
            o11Var.a(hb2Var, map);
        }
    }
}
