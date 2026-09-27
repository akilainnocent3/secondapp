package yads;

import com.ironsource.Q6;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class f40 implements dw.p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f40 f148965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ dw.l2 f148966b;

    static {
        f40 f40Var = new f40();
        f148965a = f40Var;
        dw.l2 l2Var = new dw.l2("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelAdUnitBiddingMediation", f40Var, 5);
        l2Var.o(Q6.G1, true);
        l2Var.o("network_name", false);
        l2Var.o("bidding_parameters", false);
        l2Var.o("network_ad_unit_id", true);
        l2Var.o("network_ad_unit_id_name", true);
        f148966b = l2Var;
    }

    @Override // dw.p0
    public final zv.j[] childSerializers() {
        zv.j[] jVarArr = h40.f149921f;
        dw.c3 c3Var = dw.c3.f79541a;
        return new zv.j[]{aw.a.v(c3Var), c3Var, jVarArr[2], aw.a.v(c3Var), aw.a.v(c3Var)};
    }

    @Override // zv.e
    public final Object deserialize(cw.f fVar) {
        int i10;
        String str;
        String str2;
        List list;
        String str3;
        String str4;
        dw.l2 l2Var = f148966b;
        cw.d dVarB = fVar.b(l2Var);
        zv.j[] jVarArr = h40.f149921f;
        String str5 = null;
        if (dVarB.h()) {
            dw.c3 c3Var = dw.c3.f79541a;
            String str6 = (String) dVarB.u(l2Var, 0, c3Var, null);
            String strJ = dVarB.J(l2Var, 1);
            List list2 = (List) dVarB.x(l2Var, 2, jVarArr[2], null);
            String str7 = (String) dVarB.u(l2Var, 3, c3Var, null);
            list = list2;
            str4 = (String) dVarB.u(l2Var, 4, c3Var, null);
            str3 = str7;
            i10 = 31;
            str2 = strJ;
            str = str6;
        } else {
            boolean z10 = true;
            int i11 = 0;
            String strJ2 = null;
            List list3 = null;
            String str8 = null;
            String str9 = null;
            while (z10) {
                int iZ = dVarB.z(l2Var);
                if (iZ == -1) {
                    z10 = false;
                } else if (iZ == 0) {
                    str5 = (String) dVarB.u(l2Var, 0, dw.c3.f79541a, str5);
                    i11 |= 1;
                } else if (iZ == 1) {
                    strJ2 = dVarB.J(l2Var, 1);
                    i11 |= 2;
                } else if (iZ == 2) {
                    list3 = (List) dVarB.x(l2Var, 2, jVarArr[2], list3);
                    i11 |= 4;
                } else if (iZ == 3) {
                    str8 = (String) dVarB.u(l2Var, 3, dw.c3.f79541a, str8);
                    i11 |= 8;
                } else {
                    if (iZ != 4) {
                        throw new zv.t0(iZ);
                    }
                    str9 = (String) dVarB.u(l2Var, 4, dw.c3.f79541a, str9);
                    i11 |= 16;
                }
            }
            i10 = i11;
            str = str5;
            str2 = strJ2;
            list = list3;
            str3 = str8;
            str4 = str9;
        }
        dVarB.c(l2Var);
        return new h40(i10, str, str2, list, str3, str4);
    }

    @Override // zv.j, zv.d0, zv.e
    public final bw.f getDescriptor() {
        return f148966b;
    }

    @Override // zv.d0
    public final void serialize(cw.h hVar, Object obj) {
        h40 h40Var = (h40) obj;
        dw.l2 l2Var = f148966b;
        cw.e eVarB = hVar.b(l2Var);
        zv.j[] jVarArr = h40.f149921f;
        if (eVarB.q(l2Var, 0) || h40Var.f149922a != null) {
            eVarB.i(l2Var, 0, dw.c3.f79541a, h40Var.f149922a);
        }
        eVarB.v(l2Var, 1, h40Var.f149923b);
        eVarB.f(l2Var, 2, jVarArr[2], h40Var.f149924c);
        if (eVarB.q(l2Var, 3) || h40Var.f149925d != null) {
            eVarB.i(l2Var, 3, dw.c3.f79541a, h40Var.f149925d);
        }
        if (eVarB.q(l2Var, 4) || h40Var.f149926e != null) {
            eVarB.i(l2Var, 4, dw.c3.f79541a, h40Var.f149926e);
        }
        eVarB.c(l2Var);
    }

    @Override // dw.p0
    public final zv.j[] typeParametersSerializers() {
        return dw.p0.a.a(this);
    }
}
