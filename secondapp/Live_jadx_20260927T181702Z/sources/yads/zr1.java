package yads;

import com.ironsource.Q6;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class zr1 implements dw.p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zr1 f159005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ dw.l2 f159006b;

    static {
        zr1 zr1Var = new zr1();
        f159005a = zr1Var;
        dw.l2 l2Var = new dw.l2("com.monetization.ads.base.model.mediation.prefetch.config.MediationPrefetchNetwork", zr1Var, 2);
        l2Var.o(Q6.G1, false);
        l2Var.o("network_data", false);
        f159006b = l2Var;
    }

    @Override // dw.p0
    public final zv.j[] childSerializers() {
        return new zv.j[]{dw.c3.f79541a, cs1.f147883d[1]};
    }

    @Override // zv.e
    public final Object deserialize(cw.f fVar) {
        int i10;
        String strJ;
        Map map;
        dw.l2 l2Var = f159006b;
        cw.d dVarB = fVar.b(l2Var);
        zv.j[] jVarArr = cs1.f147883d;
        String strJ2 = null;
        if (dVarB.h()) {
            strJ = dVarB.J(l2Var, 0);
            map = (Map) dVarB.x(l2Var, 1, jVarArr[1], null);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            Map map2 = null;
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
                    map2 = (Map) dVarB.x(l2Var, 1, jVarArr[1], map2);
                    i11 |= 2;
                }
            }
            i10 = i11;
            strJ = strJ2;
            map = map2;
        }
        dVarB.c(l2Var);
        return new cs1(i10, strJ, map);
    }

    @Override // zv.j, zv.d0, zv.e
    public final bw.f getDescriptor() {
        return f159006b;
    }

    @Override // zv.d0
    public final void serialize(cw.h hVar, Object obj) {
        cs1 cs1Var = (cs1) obj;
        dw.l2 l2Var = f159006b;
        cw.e eVarB = hVar.b(l2Var);
        zv.j[] jVarArr = cs1.f147883d;
        eVarB.v(l2Var, 0, cs1Var.f147884b);
        eVarB.f(l2Var, 1, jVarArr[1], cs1Var.f147885c);
        eVarB.c(l2Var);
    }

    @Override // dw.p0
    public final zv.j[] typeParametersSerializers() {
        return dw.p0.a.a(this);
    }
}
