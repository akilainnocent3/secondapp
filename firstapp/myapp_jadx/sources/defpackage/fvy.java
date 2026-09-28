package defpackage;

import android.content.Intent;
import android.view.KeyEvent;
import com.sportybet.android.widget.OneUpTwoUpSwitch;
import com.sportybet.plugin.realsports.prematch.PreMatchSportActivity;
import com.sportybet.plugin.realsports.sportsmenu.SportsMenuActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class fvy implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ fvy(KeyEvent.Callback callback, int i) {
        this.a = i;
        this.b = callback;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        KeyEvent.Callback callback = this.b;
        switch (i) {
            case 0:
                int i2 = OneUpTwoUpSwitch.W;
                ((OneUpTwoUpSwitch) callback).d();
                break;
            default:
                SportsMenuActivity sportsMenuActivity = (SportsMenuActivity) callback;
                int i3 = SportsMenuActivity.i;
                Intent intent = new Intent(hp0.A, (Class<?>) PreMatchSportActivity.class);
                intent.putExtra("key_sport_id", (String) sportsMenuActivity.B1().i.a.getValue());
                yrh0.s(sportsMenuActivity, intent, true);
                sportsMenuActivity.E1("Sports_Menu_All_Games");
                break;
        }
        return Unit.a;
    }
}
