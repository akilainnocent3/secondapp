package defpackage;

import com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout;
import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;
import com.sportygames.lobby.views.fragment.GamesLobbyMainFragment;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ivj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ivj(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                cn80 cn80Var = (cn80) ((GamesLobbyMainFragment) obj).b;
                if (cn80Var != null) {
                    cn80Var.z.setVisibility(8);
                }
                break;
            default:
                ConsecutiveScrollerLayout consecutiveScrollerLayout = ((PreMatchEventActivity) obj).q1;
                if (consecutiveScrollerLayout != null) {
                    consecutiveScrollerLayout.D(consecutiveScrollerLayout.getChildAt(0));
                }
                break;
        }
    }
}
