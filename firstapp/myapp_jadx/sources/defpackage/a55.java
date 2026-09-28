package defpackage;

import com.sporty.android.sportytv.ui.SportyTvFragment;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a55 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a55(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                lb80.c((pb80) obj, (String) obj2);
                break;
            default:
                SportyTvFragment sportyTvFragment = (SportyTvFragment) obj2;
                wyf0 wyf0Var = (wyf0) obj;
                vyf0 vyf0Var = wyf0Var.a;
                if (vyf0Var instanceof vyf0.a) {
                    sportyTvFragment.n0(sn5.d(sportyTvFragment, R.string.sporty_tv__sporty_tv_notification_add, new Object[0]));
                } else if (vyf0Var instanceof vyf0.c) {
                    sportyTvFragment.n0(sn5.d(sportyTvFragment, R.string.sporty_tv__sporty_tv_notification_error, new Object[0]));
                    sportyTvFragment.y0(((vyf0.c) wyf0Var.a).a, false);
                } else {
                    sportyTvFragment.n0(sn5.d(sportyTvFragment, R.string.sporty_tv__sporty_tv_notification_error, new Object[0]));
                }
                break;
        }
        return Unit.a;
    }
}
