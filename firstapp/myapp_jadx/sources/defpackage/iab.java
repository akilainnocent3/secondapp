package defpackage;

import android.content.Intent;
import com.sportybet.plugin.realsports.prematch.PreMatchSportActivity;
import com.sportybet.plugin.realsports.sportsmenu.SportsMenuActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class iab implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ iab(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((fgb) obj).M0();
                return Unit.a;
            case 1:
                return uzh.b(new ruy.b(new ruy.a((uwd0) ((ruy) obj).b.getValue())));
            default:
                SportsMenuActivity sportsMenuActivity = (SportsMenuActivity) obj;
                int i2 = SportsMenuActivity.i;
                Intent intent = new Intent(hp0.A, (Class<?>) PreMatchSportActivity.class);
                intent.putExtra("key_sport_id", (String) sportsMenuActivity.B1().i.a.getValue());
                intent.putExtra("key_is_outright", true);
                yrh0.s(sportsMenuActivity, intent, true);
                sportsMenuActivity.E1("Sports_Menu_Outrights");
                return Unit.a;
        }
    }
}
