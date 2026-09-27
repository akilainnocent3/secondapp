package yads;

import com.applovin.mediation.AppLovinUtils;
import com.ironsource.Q6;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ur1 implements dw.p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ur1 f156560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ dw.l2 f156561b;

    static {
        ur1 ur1Var = new ur1();
        f156560a = ur1Var;
        dw.l2 l2Var = new dw.l2("com.monetization.ads.base.model.mediation.prefetch.config.MediationPrefetchAdUnit", ur1Var, 2);
        l2Var.o(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, false);
        l2Var.o(Q6.E1, false);
        f156561b = l2Var;
    }

    @Override // dw.p0
    public final zv.j[] childSerializers() {
        return new zv.j[]{dw.c3.f79541a, xr1.f157972d[1]};
    }

    @Override // zv.e
    public final Object deserialize(cw.f fVar) {
        int i10;
        String strJ;
        List list;
        dw.l2 l2Var = f156561b;
        cw.d dVarB = fVar.b(l2Var);
        zv.j[] jVarArr = xr1.f157972d;
        String strJ2 = null;
        if (dVarB.h()) {
            strJ = dVarB.J(l2Var, 0);
            list = (List) dVarB.x(l2Var, 1, jVarArr[1], null);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            List list2 = null;
            while (z10) {
                int iZ = dVarB.z(l2Var);
                if (iZ == -1) {
                    z10 = false;
                } else if (iZ == 0) {
                    strJ2 = dVarB.J(l2Var, 0);
                    i11 |= 1;
                } else {
                    if (iZ != 1) {
                        throw new zv.t0(iZ);
                    }
                    list2 = (List) dVarB.x(l2Var, 1, jVarArr[1], list2);
                    i11 |= 2;
                }
            }
            i10 = i11;
            strJ = strJ2;
            list = list2;
        }
        dVarB.c(l2Var);
        return new xr1(i10, strJ, list);
    }

    @Override // zv.j, zv.d0, zv.e
    public final bw.f getDescriptor() {
        return f156561b;
    }

    @Override // zv.d0
    public final void serialize(cw.h hVar, Object obj) {
        xr1 xr1Var = (xr1) obj;
        dw.l2 l2Var = f156561b;
        cw.e eVarB = hVar.b(l2Var);
        zv.j[] jVarArr = xr1.f157972d;
        eVarB.v(l2Var, 0, xr1Var.f157973b);
        eVarB.f(l2Var, 1, jVarArr[1], xr1Var.f157974c);
        eVarB.c(l2Var);
    }

    @Override // dw.p0
    public final zv.j[] typeParametersSerializers() {
        return dw.p0.a.a(this);
    }
}
