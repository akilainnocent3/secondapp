package defpackage;

import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class lvw implements TabLayout.d {
    public final /* synthetic */ nvw a;

    public lvw(nvw nvwVar) {
        this.a = nvwVar;
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void G(TabLayout.g gVar) {
        int i = gVar.e;
        nvw nvwVar = this.a;
        nvwVar.E = i;
        nvwVar.z.setList(nvw.m0(i, nvwVar.A));
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void A0(TabLayout.g gVar) {
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void g0(TabLayout.g gVar) {
    }
}
