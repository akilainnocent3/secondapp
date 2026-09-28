package defpackage;

import com.google.android.material.tabs.TabLayout;
import com.sportygames.lobby.views.fragment.GamesLobbyMainFragment;

/* JADX INFO: loaded from: classes7.dex */
public final class rvj implements TabLayout.d {
    public final /* synthetic */ GamesLobbyMainFragment a;

    public rvj(GamesLobbyMainFragment gamesLobbyMainFragment) {
        this.a = gamesLobbyMainFragment;
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void A0(TabLayout.g gVar) {
        gVar.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (r0.isConnectedOrConnecting() != false) goto L22;
     */
    @Override // com.google.android.material.tabs.TabLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G(com.google.android.material.tabs.TabLayout.g r4) {
        /*
            r3 = this;
            com.sportygames.lobby.views.fragment.GamesLobbyMainFragment r3 = r3.a
            r4.getClass()
            android.content.Context r0 = r3.getContext()     // Catch: java.lang.Exception -> La5
            if (r0 == 0) goto L61
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Exception -> La5
            r0.getClass()     // Catch: java.lang.Exception -> La5
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch: java.lang.Exception -> La5
            android.net.Network r1 = r0.getActiveNetwork()     // Catch: java.lang.Exception -> La5
            if (r1 != 0) goto L1d
            goto L61
        L1d:
            android.net.NetworkCapabilities r1 = r0.getNetworkCapabilities(r1)     // Catch: java.lang.Exception -> La5
            if (r1 != 0) goto L24
            goto L61
        L24:
            r2 = 0
            boolean r2 = r1.hasTransport(r2)     // Catch: java.lang.Exception -> La5
            if (r2 != 0) goto L4d
            r2 = 3
            boolean r2 = r1.hasTransport(r2)     // Catch: java.lang.Exception -> La5
            if (r2 != 0) goto L4d
            r2 = 1
            boolean r1 = r1.hasTransport(r2)     // Catch: java.lang.Exception -> La5
            if (r1 == 0) goto L3a
            goto L4d
        L3a:
            android.net.NetworkInfo r1 = r0.getActiveNetworkInfo()     // Catch: java.lang.Exception -> La5
            if (r1 == 0) goto L61
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch: java.lang.Exception -> La5
            r0.getClass()     // Catch: java.lang.Exception -> La5
            boolean r0 = r0.isConnectedOrConnecting()     // Catch: java.lang.Exception -> La5
            if (r0 == 0) goto L61
        L4d:
            r3.G0()     // Catch: java.lang.Exception -> La5
            B extends g6i0 r0 = r3.b     // Catch: java.lang.Exception -> La5
            cn80 r0 = (defpackage.cn80) r0     // Catch: java.lang.Exception -> La5
            if (r0 == 0) goto L5d
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r0 = r0.F     // Catch: java.lang.Exception -> La5
            r1 = 8
            r0.setVisibility(r1)     // Catch: java.lang.Exception -> La5
        L5d:
            r3.v0(r4)     // Catch: java.lang.Exception -> La5
            return
        L61:
            boolean r0 = r3.W     // Catch: java.lang.Exception -> La5
            if (r0 != 0) goto La2
            r3.r0()     // Catch: java.lang.Exception -> La5
            op5 r4 = defpackage.op5.a     // Catch: java.lang.Exception -> La5
            r0 = 2132024773(0x7f141dc5, float:1.9688032E38)
            java.lang.String r0 = r3.getString(r0)     // Catch: java.lang.Exception -> La5
            r0.getClass()     // Catch: java.lang.Exception -> La5
            r1 = 2132021504(0x7f141100, float:1.9681401E38)
            java.lang.String r1 = r3.getString(r1)     // Catch: java.lang.Exception -> La5
            r1.getClass()     // Catch: java.lang.Exception -> La5
            r4.getClass()     // Catch: java.lang.Exception -> La5
            r4 = 0
            java.lang.String r0 = defpackage.op5.b(r0, r1, r4)     // Catch: java.lang.Exception -> La5
            r1 = 2132024772(0x7f141dc4, float:1.968803E38)
            java.lang.String r1 = r3.getString(r1)     // Catch: java.lang.Exception -> La5
            r1.getClass()     // Catch: java.lang.Exception -> La5
            r2 = 2132021503(0x7f1410ff, float:1.96814E38)
            java.lang.String r2 = r3.getString(r2)     // Catch: java.lang.Exception -> La5
            r2.getClass()     // Catch: java.lang.Exception -> La5
            java.lang.String r4 = defpackage.op5.b(r1, r2, r4)     // Catch: java.lang.Exception -> La5
            r3.F0(r0, r4)     // Catch: java.lang.Exception -> La5
            return
        La2:
            r3.v0(r4)     // Catch: java.lang.Exception -> La5
        La5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rvj.G(com.google.android.material.tabs.TabLayout$g):void");
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void g0(TabLayout.g gVar) {
        gVar.getClass();
        this.a.C = String.valueOf(gVar.a);
    }
}
