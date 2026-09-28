package defpackage;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class quj implements Runnable {
    public final /* synthetic */ suj a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Bundle d;

    public /* synthetic */ quj(suj sujVar, boolean z, boolean z2, Bundle bundle) {
        this.a = sujVar;
        this.b = z;
        this.c = z2;
        this.d = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Fragment lobbyV2Fragment;
        Bundle bundle = this.d;
        suj sujVar = this.a;
        boolean zIsAdded = sujVar.isAdded();
        String str = sujVar.v;
        if (!zIsAdded || sujVar.getView() == null) {
            return;
        }
        try {
            sujVar.n0();
            FragmentManager childFragmentManager = sujVar.getChildFragmentManager();
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
                lobbyV2Fragment = SportyGamesManager.getInstance().getLobbyV2FallbackFragment(null);
            } else {
                lobbyV2Fragment = this.c ? SportyGamesManager.getInstance().getLobbyV2Fragment(null) : SportyGamesManager.getInstance().getLobbyFragment();
            }
            lobbyV2Fragment.setArguments(bundle);
            if (sujVar.i != null) {
                a aVar2 = new a(childFragmentManager);
                aVar2.f(R.id.lobby_fragment_container, lobbyV2Fragment, str);
                aVar2.k(true, true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
