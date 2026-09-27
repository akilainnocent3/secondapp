package yads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class h80 implements dw.p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h80 f149968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ dw.l2 f149969b;

    static {
        h80 h80Var = new h80();
        f149968a = h80Var;
        dw.l2 l2Var = new dw.l2("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelRemoteData", h80Var, 7);
        l2Var.o("page_id", true);
        l2Var.o("latest_sdk_version", true);
        l2Var.o("app_ads_txt_url", true);
        l2Var.o("app_status", true);
        l2Var.o("alerts", true);
        l2Var.o("ad_units", true);
        l2Var.o("mediation_networks", false);
        f149969b = l2Var;
    }

    @Override // dw.p0
    public final zv.j[] childSerializers() {
        zv.j[] jVarArr = j80.f150962h;
        dw.c3 c3Var = dw.c3.f79541a;
        return new zv.j[]{aw.a.v(c3Var), aw.a.v(c3Var), aw.a.v(c3Var), aw.a.v(c3Var), aw.a.v(jVarArr[4]), aw.a.v(jVarArr[5]), jVarArr[6]};
    }

    @Override // zv.e
    public final Object deserialize(cw.f fVar) {
        int i10;
        List list;
        List list2;
        String str;
        String str2;
        String str3;
        String str4;
        List list3;
        dw.l2 l2Var = f149969b;
        cw.d dVarB = fVar.b(l2Var);
        zv.j[] jVarArr = j80.f150962h;
        int i11 = 3;
        String str5 = null;
        if (dVarB.h()) {
            dw.c3 c3Var = dw.c3.f79541a;
            String str6 = (String) dVarB.u(l2Var, 0, c3Var, null);
            String str7 = (String) dVarB.u(l2Var, 1, c3Var, null);
            String str8 = (String) dVarB.u(l2Var, 2, c3Var, null);
            String str9 = (String) dVarB.u(l2Var, 3, c3Var, null);
            List list4 = (List) dVarB.u(l2Var, 4, jVarArr[4], null);
            List list5 = (List) dVarB.u(l2Var, 5, jVarArr[5], null);
            list = (List) dVarB.x(l2Var, 6, jVarArr[6], null);
            str4 = str9;
            list3 = list4;
            str3 = str8;
            i10 = 127;
            list2 = list5;
            str2 = str7;
            str = str6;
        } else {
            boolean z10 = true;
            int i12 = 0;
            List list6 = null;
            List list7 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            List list8 = null;
            while (z10) {
                int iZ = dVarB.z(l2Var);
                switch (iZ) {
                    case -1:
                        z10 = false;
                        i11 = 3;
                        break;
                    case 0:
                        str5 = (String) dVarB.u(l2Var, 0, dw.c3.f79541a, str5);
                        i12 |= 1;
                        i11 = 3;
                        break;
                    case 1:
                        str10 = (String) dVarB.u(l2Var, 1, dw.c3.f79541a, str10);
                        i12 |= 2;
                        i11 = 3;
                        break;
                    case 2:
                        str11 = (String) dVarB.u(l2Var, 2, dw.c3.f79541a, str11);
                        i12 |= 4;
                        i11 = 3;
                        break;
                    case 3:
                        str12 = (String) dVarB.u(l2Var, i11, dw.c3.f79541a, str12);
                        i12 |= 8;
                        break;
                    case 4:
                        list8 = (List) dVarB.u(l2Var, 4, jVarArr[4], list8);
                        i12 |= 16;
                        break;
                    case 5:
                        list7 = (List) dVarB.u(l2Var, 5, jVarArr[5], list7);
                        i12 |= 32;
                        break;
                    case 6:
                        list6 = (List) dVarB.x(l2Var, 6, jVarArr[6], list6);
                        i12 |= 64;
                        break;
                    default:
                        throw new zv.t0(iZ);
                }
            }
            i10 = i12;
            list = list6;
            list2 = list7;
            str = str5;
            str2 = str10;
            str3 = str11;
            str4 = str12;
            list3 = list8;
        }
        dVarB.c(l2Var);
        return new j80(i10, str, str2, str3, str4, list3, list2, list);
    }

    @Override // zv.j, zv.d0, zv.e
    public final bw.f getDescriptor() {
        return f149969b;
    }

    @Override // zv.d0
    public final void serialize(cw.h hVar, Object obj) {
        j80 j80Var = (j80) obj;
        dw.l2 l2Var = f149969b;
        cw.e eVarB = hVar.b(l2Var);
        zv.j[] jVarArr = j80.f150962h;
        if (eVarB.q(l2Var, 0) || j80Var.f150963a != null) {
            eVarB.i(l2Var, 0, dw.c3.f79541a, j80Var.f150963a);
        }
        if (eVarB.q(l2Var, 1) || j80Var.f150964b != null) {
            eVarB.i(l2Var, 1, dw.c3.f79541a, j80Var.f150964b);
        }
        if (eVarB.q(l2Var, 2) || j80Var.f150965c != null) {
            eVarB.i(l2Var, 2, dw.c3.f79541a, j80Var.f150965c);
        }
        if (eVarB.q(l2Var, 3) || j80Var.f150966d != null) {
            eVarB.i(l2Var, 3, dw.c3.f79541a, j80Var.f150966d);
        }
        if (eVarB.q(l2Var, 4) || j80Var.f150967e != null) {
            eVarB.i(l2Var, 4, jVarArr[4], j80Var.f150967e);
        }
        if (eVarB.q(l2Var, 5) || j80Var.f150968f != null) {
            eVarB.i(l2Var, 5, jVarArr[5], j80Var.f150968f);
        }
        eVarB.f(l2Var, 6, jVarArr[6], j80Var.f150969g);
        eVarB.c(l2Var);
    }

    @Override // dw.p0
    public final zv.j[] typeParametersSerializers() {
        return dw.p0.a.a(this);
    }
}
