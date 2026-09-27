package yads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class wq1 implements dw.p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wq1 f157478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ dw.l2 f157479b;

    static {
        wq1 wq1Var = new wq1();
        f157478a = wq1Var;
        dw.l2 l2Var = new dw.l2("com.monetization.ads.core.initializer.validation.adapters.MediationNetworkData", wq1Var, 4);
        l2Var.o("name", false);
        l2Var.o("id", false);
        l2Var.o("version", false);
        l2Var.o("adapters", false);
        f157479b = l2Var;
    }

    @Override // dw.p0
    public final zv.j[] childSerializers() {
        zv.j[] jVarArr = br1.f147309e;
        dw.c3 c3Var = dw.c3.f79541a;
        return new zv.j[]{c3Var, c3Var, aw.a.v(c3Var), jVarArr[3]};
    }

    @Override // zv.e
    public final Object deserialize(cw.f fVar) {
        int i10;
        String str;
        String str2;
        String str3;
        List list;
        dw.l2 l2Var = f157479b;
        cw.d dVarB = fVar.b(l2Var);
        zv.j[] jVarArr = br1.f147309e;
        String strJ = null;
        if (dVarB.h()) {
            String strJ2 = dVarB.J(l2Var, 0);
            String strJ3 = dVarB.J(l2Var, 1);
            String str4 = (String) dVarB.u(l2Var, 2, dw.c3.f79541a, null);
            list = (List) dVarB.x(l2Var, 3, jVarArr[3], null);
            str = strJ2;
            str3 = str4;
            i10 = 15;
            str2 = strJ3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            String strJ4 = null;
            String str5 = null;
            List list2 = null;
            while (z10) {
                int iZ = dVarB.z(l2Var);
                if (iZ == -1) {
                    z10 = false;
                } else if (iZ == 0) {
                    strJ = dVarB.J(l2Var, 0);
                    i11 |= 1;
                } else if (iZ == 1) {
                    strJ4 = dVarB.J(l2Var, 1);
                    i11 |= 2;
                } else if (iZ == 2) {
                    str5 = (String) dVarB.u(l2Var, 2, dw.c3.f79541a, str5);
                    i11 |= 4;
                } else {
                    if (iZ != 3) {
                        throw new zv.t0(iZ);
                    }
                    list2 = (List) dVarB.x(l2Var, 3, jVarArr[3], list2);
                    i11 |= 8;
                }
            }
            i10 = i11;
            str = strJ;
            str2 = strJ4;
            str3 = str5;
            list = list2;
        }
        dVarB.c(l2Var);
        return new br1(i10, str, str2, str3, list);
    }

    @Override // zv.j, zv.d0, zv.e
    public final bw.f getDescriptor() {
        return f157479b;
    }

    @Override // zv.d0
    public final void serialize(cw.h hVar, Object obj) {
        br1 br1Var = (br1) obj;
        dw.l2 l2Var = f157479b;
        cw.e eVarB = hVar.b(l2Var);
        zv.j[] jVarArr = br1.f147309e;
        eVarB.v(l2Var, 0, br1Var.f147310a);
        eVarB.v(l2Var, 1, br1Var.f147311b);
        eVarB.i(l2Var, 2, dw.c3.f79541a, br1Var.f147312c);
        eVarB.f(l2Var, 3, jVarArr[3], br1Var.f147313d);
        eVarB.c(l2Var);
    }

    @Override // dw.p0
    public final zv.j[] typeParametersSerializers() {
        return dw.p0.a.a(this);
    }
}
