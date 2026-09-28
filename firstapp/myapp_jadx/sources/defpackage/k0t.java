package defpackage;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class k0t implements Runnable {
    public final /* synthetic */ m0t a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Bundle d;

    public /* synthetic */ k0t(m0t m0tVar, boolean z, boolean z2, Bundle bundle) {
        this.a = m0tVar;
        this.b = z;
        this.c = z2;
        this.d = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Fragment lobbyV2Fragment;
        Bundle bundle = this.d;
        m0t m0tVar = this.a;
        boolean zIsAdded = m0tVar.isAdded();
        String str = m0tVar.C;
        if (!zIsAdded || m0tVar.getView() == null) {
            return;
        }
        try {
            m0tVar.o0();
            FragmentManager childFragmentManager = m0tVar.getChildFragmentManager();
            childFragmentManager.getClass();
            childFragmentManager.C(true);
            childFragmentManager.J();
            Fragment fragmentH = childFragmentManager.H(str);
            if (fragmentH != null) {
                a aVar = new a(childFragmentManager);
                aVar.p(fragmentH);
                aVar.k(true, true);
            }
            if (this.b) {
                lobbyV2Fragment = SportyGamesManager.getInstance().getLobbyV2FallbackFragment();
            } else {
                lobbyV2Fragment = this.c ? SportyGamesManager.getInstance().getLobbyV2Fragment() : SportyGamesManager.getInstance().getLobbyFragment();
            }
            lobbyV2Fragment.setArguments(bundle);
            if (m0tVar.A != null) {
                a aVar2 = new a(childFragmentManager);
                aVar2.f(R.id.lobby_fragment_container, lobbyV2Fragment, str);
                aVar2.k(true, true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
