package defpackage;

import com.sporty.android.sportytv.ui.SportyTvFragment;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class pxn implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pxn(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                String str2 = (String) obj;
                str2.getClass();
                n8v n8vVarE = ((Regex) obj2).e(str2);
                if (n8vVarE == null || (str = (String) ((n8v.a) n8vVarE.a()).get(1)) == null) {
                    return null;
                }
                return Integer.valueOf(Integer.parseInt(str));
            default:
                SportyTvFragment sportyTvFragment = (SportyTvFragment) obj2;
                wyf0 wyf0Var = (wyf0) obj;
                vyf0 vyf0Var = wyf0Var.a;
                if (vyf0Var instanceof vyf0.b) {
                    sportyTvFragment.n0(sn5.d(sportyTvFragment, R.string.sporty_tv__sporty_tv_notification_remove, new Object[0]));
                } else if (vyf0Var instanceof vyf0.c) {
                    sportyTvFragment.n0(sn5.d(sportyTvFragment, R.string.sporty_tv__sporty_tv_notification_error, new Object[0]));
                    sportyTvFragment.y0(((vyf0.c) wyf0Var.a).a, true);
                } else {
                    sportyTvFragment.n0(sn5.d(sportyTvFragment, R.string.sporty_tv__sporty_tv_notification_error, new Object[0]));
                }
                return Unit.a;
        }
    }
}
