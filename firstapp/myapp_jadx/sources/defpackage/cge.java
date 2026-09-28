package defpackage;

import androidx.navigation.fragment.a;
import androidx.navigation.fragment.b;

/* JADX INFO: loaded from: classes6.dex */
public final class cge implements bge {
    @Override // defpackage.bge
    public final void a(ghx ghxVar) {
        ghx ghxVar2 = new ghx(ghxVar.i, "device_management_route", "device_management_navigation");
        wkx wkxVar = ghxVar2.i;
        wkxVar.getClass();
        b bVar = new b((a) wkxVar.b(wkx.a.a(a.class)), "device_management_route", jq40.a(tfe.class));
        bVar.e = "DeviceManagementFragment";
        ghxVar2.m.add(bVar.a());
        ghxVar.m.add(ghxVar2.a());
    }

    @Override // defpackage.bge
    public final void b(yfx yfxVar) {
        yfx.i(yfxVar, "device_management_navigation", bjx.a(new r8a(1, new kkx())), 4);
    }
}
