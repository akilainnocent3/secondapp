package yads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class e80 implements dw.p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e80 f148565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ dw.l2 f148566b;

    static {
        e80 e80Var = new e80();
        f148565a = e80Var;
        dw.l2 l2Var = new dw.l2("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelMediationNetwork", e80Var, 6);
        l2Var.o("id", true);
        l2Var.o("name", false);
        l2Var.o("logo_url", true);
        l2Var.o("adapter_status", true);
        l2Var.o("adapters", false);
        l2Var.o("latest_adapter_version", true);
        f148566b = l2Var;
    }

    @Override // dw.p0
    public final zv.j[] childSerializers() {
        zv.j[] jVarArr = g80.f149455g;
        dw.c3 c3Var = dw.c3.f79541a;
        return new zv.j[]{aw.a.v(c3Var), c3Var, aw.a.v(c3Var), aw.a.v(c3Var), jVarArr[4], aw.a.v(c3Var)};
    }

    @Override // zv.e
    public final Object deserialize(cw.f fVar) {
        int i10;
        String str;
        String str2;
        String str3;
        String str4;
        List list;
        String str5;
        dw.l2 l2Var = f148566b;
        cw.d dVarB = fVar.b(l2Var);
        zv.j[] jVarArr = g80.f149455g;
        int i11 = 5;
        String str6 = null;
        if (dVarB.h()) {
            dw.c3 c3Var = dw.c3.f79541a;
            String str7 = (String) dVarB.u(l2Var, 0, c3Var, null);
            String strJ = dVarB.J(l2Var, 1);
            String str8 = (String) dVarB.u(l2Var, 2, c3Var, null);
            String str9 = (String) dVarB.u(l2Var, 3, c3Var, null);
            list = (List) dVarB.x(l2Var, 4, jVarArr[4], null);
            str5 = (String) dVarB.u(l2Var, 5, c3Var, null);
            i10 = 63;
            str4 = str9;
            str3 = str8;
            str2 = strJ;
            str = str7;
        } else {
            boolean z10 = true;
            int i12 = 0;
            String strJ2 = null;
            String str10 = null;
            String str11 = null;
            List list2 = null;
            String str12 = null;
            while (z10) {
                int iZ = dVarB.z(l2Var);
                switch (iZ) {
                    case -1:
                        z10 = false;
                        i11 = 5;
                        break;
                    case 0:
                        str6 = (String) dVarB.u(l2Var, 0, dw.c3.f79541a, str6);
                        i12 |= 1;
                        i11 = 5;
                        break;
                    case 1:
                        strJ2 = dVarB.J(l2Var, 1);
                        i12 |= 2;
                        break;
                    case 2:
                        str10 = (String) dVarB.u(l2Var, 2, dw.c3.f79541a, str10);
                        i12 |= 4;
                        break;
                    case 3:
                        str11 = (String) dVarB.u(l2Var, 3, dw.c3.f79541a, str11);
                        i12 |= 8;
                        break;
                    case 4:
                        list2 = (List) dVarB.x(l2Var, 4, jVarArr[4], list2);
                        i12 |= 16;
                        break;
                    case 5:
                        str12 = (String) dVarB.u(l2Var, i11, dw.c3.f79541a, str12);
                        i12 |= 32;
                        break;
                    default:
                        throw new zv.t0(iZ);
                }
            }
            i10 = i12;
            str = str6;
            str2 = strJ2;
            str3 = str10;
            str4 = str11;
            list = list2;
            str5 = str12;
        }
        dVarB.c(l2Var);
        return new g80(i10, str, str2, str3, str4, list, str5);
    }

    @Override // zv.j, zv.d0, zv.e
    public final bw.f getDescriptor() {
        return f148566b;
    }

    @Override // zv.d0
    public final void serialize(cw.h hVar, Object obj) {
        g80 g80Var = (g80) obj;
        dw.l2 l2Var = f148566b;
        cw.e eVarB = hVar.b(l2Var);
        zv.j[] jVarArr = g80.f149455g;
        if (eVarB.q(l2Var, 0) || g80Var.f149456a != null) {
            eVarB.i(l2Var, 0, dw.c3.f79541a, g80Var.f149456a);
        }
        eVarB.v(l2Var, 1, g80Var.f149457b);
        if (eVarB.q(l2Var, 2) || g80Var.f149458c != null) {
            eVarB.i(l2Var, 2, dw.c3.f79541a, g80Var.f149458c);
        }
        if (eVarB.q(l2Var, 3) || g80Var.f149459d != null) {
            eVarB.i(l2Var, 3, dw.c3.f79541a, g80Var.f149459d);
        }
        eVarB.f(l2Var, 4, jVarArr[4], g80Var.f149460e);
        if (eVarB.q(l2Var, 5) || g80Var.f149461f != null) {
            eVarB.i(l2Var, 5, dw.c3.f79541a, g80Var.f149461f);
        }
        eVarB.c(l2Var);
    }

    @Override // dw.p0
    public final zv.j[] typeParametersSerializers() {
        return dw.p0.a.a(this);
    }
}
