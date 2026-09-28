package defpackage;

import android.content.Context;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.OneUpTwoUpSwitch;
import com.sportybet.plugin.realsports.sportsmenu.SportsMenuActivity;
import com.sportybet.plugin.realsports.sportsmenu.SportsMenuTabItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class h7u implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h7u(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(new nvp.f(3, (uf00) null));
                return Unit.a;
            case 1:
                int i2 = OneUpTwoUpSwitch.W;
                return ((Context) obj).getDrawable(R.drawable.ic_2up_on);
            default:
                SportsMenuActivity sportsMenuActivity = (SportsMenuActivity) obj;
                return ((SportsMenuTabItem) sportsMenuActivity.d.get(sportsMenuActivity.c)).getTitle();
        }
    }
}
