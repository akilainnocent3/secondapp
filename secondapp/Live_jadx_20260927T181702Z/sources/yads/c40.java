package yads;

import com.applovin.mediation.AppLovinUtils;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class c40 implements dw.p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c40 f147555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ dw.l2 f147556b;

    static {
        c40 c40Var = new c40();
        f147555a = c40Var;
        dw.l2 l2Var = new dw.l2("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelAdUnit", c40Var, 4);
        l2Var.o("name", false);
        l2Var.o("ad_type", false);
        l2Var.o(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, false);
        l2Var.o("mediation", true);
        f147556b = l2Var;
    }

    @Override // dw.p0
    public final zv.j[] childSerializers() {
        zv.j jVarV = aw.a.v(k40.f151382a);
        dw.c3 c3Var = dw.c3.f79541a;
        return new zv.j[]{c3Var, c3Var, c3Var, jVarV};
    }

    @Override // zv.e
    public final Object deserialize(cw.f fVar) {
        int i10;
        String str;
        String str2;
        String str3;
        m40 m40Var;
        dw.l2 l2Var = f147556b;
        cw.d dVarB = fVar.b(l2Var);
        String strJ = null;
        if (dVarB.h()) {
            String strJ2 = dVarB.J(l2Var, 0);
            String strJ3 = dVarB.J(l2Var, 1);
            String strJ4 = dVarB.J(l2Var, 2);
            str = strJ2;
            m40Var = (m40) dVarB.u(l2Var, 3, k40.f151382a, null);
            str3 = strJ4;
            str2 = strJ3;
            i10 = 15;
        } else {
            boolean z10 = true;
            int i11 = 0;
            String strJ5 = null;
            String strJ6 = null;
            m40 m40Var2 = null;
            while (z10) {
                int iZ = dVarB.z(l2Var);
                if (iZ == -1) {
                    z10 = false;
                } else if (iZ == 0) {
                    strJ = dVarB.J(l2Var, 0);
                    i11 |= 1;
                } else if (iZ == 1) {
                    strJ5 = dVarB.J(l2Var, 1);
                    i11 |= 2;
                } else if (iZ == 2) {
                    strJ6 = dVarB.J(l2Var, 2);
                    i11 |= 4;
                } else {
                    if (iZ != 3) {
                        throw new zv.t0(iZ);
                    }
                    m40Var2 = (m40) dVarB.u(l2Var, 3, k40.f151382a, m40Var2);
                    i11 |= 8;
                }
            }
            i10 = i11;
            str = strJ;
            str2 = strJ5;
            str3 = strJ6;
            m40Var = m40Var2;
        }
        dVarB.c(l2Var);
        return new e40(i10, str, str2, str3, m40Var);
    }

    @Override // zv.j, zv.d0, zv.e
    public final bw.f getDescriptor() {
        return f147556b;
    }

    @Override // zv.d0
    public final void serialize(cw.h hVar, Object obj) {
        e40 e40Var = (e40) obj;
        dw.l2 l2Var = f147556b;
        cw.e eVarB = hVar.b(l2Var);
        eVarB.v(l2Var, 0, e40Var.f148491a);
        eVarB.v(l2Var, 1, e40Var.f148492b);
        eVarB.v(l2Var, 2, e40Var.f148493c);
        if (eVarB.q(l2Var, 3) || e40Var.f148494d != null) {
            eVarB.i(l2Var, 3, k40.f151382a, e40Var.f148494d);
        }
        eVarB.c(l2Var);
    }

    @Override // dw.p0
    public final zv.j[] typeParametersSerializers() {
        return dw.p0.a.a(this);
    }
}
