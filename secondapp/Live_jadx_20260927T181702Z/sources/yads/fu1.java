package yads;

import com.ironsource.Ne;
import com.vungle.ads.internal.ui.AdActivity;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class fu1 implements dw.p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fu1 f149246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ dw.l2 f149247b;

    static {
        fu1 fu1Var = new fu1();
        f149246a = fu1Var;
        dw.l2 l2Var = new dw.l2("com.monetization.ads.utils.logger.model.MobileAdsNetworkLog", fu1Var, 2);
        l2Var.o(AdActivity.REQUEST_KEY_EXTRA, false);
        l2Var.o(Ne.f59595n, false);
        f149247b = l2Var;
    }

    @Override // dw.p0
    public final zv.j[] childSerializers() {
        return new zv.j[]{ku1.f151714a, aw.a.v(nu1.f153204a)};
    }

    @Override // zv.e
    public final Object deserialize(cw.f fVar) {
        int i10;
        mu1 mu1Var;
        pu1 pu1Var;
        dw.l2 l2Var = f149247b;
        cw.d dVarB = fVar.b(l2Var);
        mu1 mu1Var2 = null;
        if (dVarB.h()) {
            mu1Var = (mu1) dVarB.x(l2Var, 0, ku1.f151714a, null);
            pu1Var = (pu1) dVarB.u(l2Var, 1, nu1.f153204a, null);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            pu1 pu1Var2 = null;
            while (z10) {
                int iZ = dVarB.z(l2Var);
                if (iZ == -1) {
                    z10 = false;
                } else if (iZ == 0) {
                    mu1Var2 = (mu1) dVarB.x(l2Var, 0, ku1.f151714a, mu1Var2);
                    i11 |= 1;
                } else {
                    if (iZ != 1) {
                        throw new zv.t0(iZ);
                    }
                    pu1Var2 = (pu1) dVarB.u(l2Var, 1, nu1.f153204a, pu1Var2);
                    i11 |= 2;
                }
            }
            i10 = i11;
            mu1Var = mu1Var2;
            pu1Var = pu1Var2;
        }
        dVarB.c(l2Var);
        return new hu1(i10, mu1Var, pu1Var);
    }

    @Override // zv.j, zv.d0, zv.e
    public final bw.f getDescriptor() {
        return f149247b;
    }

    @Override // zv.d0
    public final void serialize(cw.h hVar, Object obj) {
        hu1 hu1Var = (hu1) obj;
        dw.l2 l2Var = f149247b;
        cw.e eVarB = hVar.b(l2Var);
        eVarB.f(l2Var, 0, ku1.f151714a, hu1Var.f150306a);
        eVarB.i(l2Var, 1, nu1.f153204a, hu1Var.f150307b);
        eVarB.c(l2Var);
    }

    @Override // dw.p0
    public final zv.j[] typeParametersSerializers() {
        return dw.p0.a.a(this);
    }
}
