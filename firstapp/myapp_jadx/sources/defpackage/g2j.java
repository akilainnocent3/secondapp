package defpackage;

import androidx.fragment.app.e;
import com.sportygames.roulette.activities.RouletteActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class g2j implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;

    public /* synthetic */ g2j(e eVar, int i) {
        this.a = i;
        this.b = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        e eVar = this.b;
        switch (i) {
            case 0:
                eVar.finish();
                return Unit.a;
            default:
                RouletteActivity rouletteActivity = (RouletteActivity) eVar;
                int[] iArr = RouletteActivity.A0;
                h51 h51Var = rouletteActivity.X;
                if (h51Var == null) {
                    rouletteActivity.L.setVisibility(8);
                    rouletteActivity.K.performClick();
                } else if (h51Var.a() > 1) {
                    rouletteActivity.R1();
                    rouletteActivity.L.setVisibility(8);
                }
                rouletteActivity.X = null;
                return null;
        }
    }
}
