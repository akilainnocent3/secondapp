package defpackage;

import com.esotericsoftware.spine.android.b;
import com.sportybet.android.gp.tz.R;
import com.sportygames.roulette.activities.RouletteActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class z6e implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z6e(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(uc8.c.a);
                return Unit.a;
            case 1:
                RouletteActivity rouletteActivity = (RouletteActivity) obj;
                int[] iArr = RouletteActivity.A0;
                rouletteActivity.L.setVisibility(0);
                rouletteActivity.N.setVisibility(0);
                rouletteActivity.N.setText(R.string.sg_game_roulette__next_round_about_to_start);
                rouletteActivity.M.setVisibility(0);
                rouletteActivity.M.setEnabled(false);
                rouletteActivity.u1();
                return null;
            default:
                return (b) obj;
        }
    }
}
