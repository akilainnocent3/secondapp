package defpackage;

import android.content.Context;
import android.content.Intent;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.OneUpTwoUpSwitch;
import com.sportybet.plugin.realsports.prematch.PreMatchSportActivity;
import com.sportybet.plugin.realsports.sportsmenu.SportsMenuActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class dvy implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ dvy(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Context context = this.b;
        switch (i) {
            case 0:
                int i2 = OneUpTwoUpSwitch.W;
                return context.getDrawable(R.drawable.ic_1_up_2_up_center_circle);
            default:
                SportsMenuActivity sportsMenuActivity = (SportsMenuActivity) context;
                int i3 = SportsMenuActivity.i;
                Intent intent = new Intent(hp0.A, (Class<?>) PreMatchSportActivity.class);
                intent.putExtra("key_sport_id", (String) sportsMenuActivity.B1().i.a.getValue());
                intent.putExtra("key_sport_time", -1L);
                yrh0.s(sportsMenuActivity, intent, true);
                sportsMenuActivity.E1("Sports_Menu_TodayGames");
                return Unit.a;
        }
    }
}
