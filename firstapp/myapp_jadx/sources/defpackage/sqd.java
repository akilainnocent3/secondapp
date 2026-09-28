package defpackage;

import androidx.fragment.app.Fragment;
import com.sporty.android.sportytv.ui.MySportyTvListFragment;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class sqd implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ sqd(Fragment fragment, int i) {
        this.a = i;
        this.b = fragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Fragment fragment = this.b;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                wwd0 wwd0Var = ((lrd) fragment).V;
                wwd0Var.getClass();
                wwd0Var.k(null, bool);
                break;
            default:
                MySportyTvListFragment mySportyTvListFragment = (MySportyTvListFragment) fragment;
                wyf0 wyf0Var = (wyf0) obj;
                vyf0 vyf0Var = wyf0Var.a;
                if (vyf0Var instanceof vyf0.b) {
                    mySportyTvListFragment.n0(sn5.d(mySportyTvListFragment, R.string.sporty_tv__sporty_tv_notification_remove, new Object[0]));
                } else if (vyf0Var instanceof vyf0.c) {
                    mySportyTvListFragment.n0(sn5.d(mySportyTvListFragment, R.string.sporty_tv__sporty_tv_notification_error, new Object[0]));
                    mySportyTvListFragment.t0(((vyf0.c) wyf0Var.a).a, true);
                } else {
                    mySportyTvListFragment.n0(sn5.d(mySportyTvListFragment, R.string.sporty_tv__sporty_tv_notification_error, new Object[0]));
                }
                break;
        }
        return Unit.a;
    }
}
