package defpackage;

import android.content.Intent;
import com.sportybet.plugin.realsports.live.livepage.LivePageActivity;
import com.sportybet.plugin.realsports.sportsmenu.SportsMenuActivity;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class t72 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t72(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                tmh0 tmh0VarB = ((u72) obj).a.b();
                return kpu.f(new Pair("https://placeholder.api.sportybet.com/", tmh0VarB.d), new Pair("https://placeholder.base.sportybet.com/", tmh0VarB.b), new Pair("https://placeholder.root.sportybet.com/", tmh0VarB.c), new Pair("https://placeholder.sporty.com/", tmh0VarB.f), new Pair("https://placeholder.resource.sportybet.com/", tmh0VarB.e));
            default:
                SportsMenuActivity sportsMenuActivity = (SportsMenuActivity) obj;
                int i2 = SportsMenuActivity.i;
                Intent intent = new Intent(hp0.A, (Class<?>) LivePageActivity.class);
                intent.putExtra("key_sport_id", (String) sportsMenuActivity.B1().i.a.getValue());
                yrh0.s(sportsMenuActivity, intent, true);
                sportsMenuActivity.E1("Sports_Menu_Live");
                return Unit.a;
        }
    }
}
