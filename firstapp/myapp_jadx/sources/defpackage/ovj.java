package defpackage;

import androidx.fragment.app.e;
import com.sportygames.lobby.views.fragment.GamesLobbyMainFragment;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes7.dex */
public final class ovj extends TimerTask {
    public final /* synthetic */ GamesLobbyMainFragment a;

    public ovj(GamesLobbyMainFragment gamesLobbyMainFragment) {
        this.a = gamesLobbyMainFragment;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        wuj wujVar;
        GamesLobbyMainFragment gamesLobbyMainFragment = this.a;
        e activity = gamesLobbyMainFragment.getActivity();
        if (activity == null || !activity.hasWindowFocus() || (wujVar = gamesLobbyMainFragment.K) == null) {
            return;
        }
        gamesLobbyMainFragment.J.post(wujVar);
    }
}
