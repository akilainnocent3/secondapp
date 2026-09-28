package defpackage;

import com.sportybet.android.instantwin.presentation.bethistory2.a;
import com.sportygames.roulette.activities.RouletteActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class cco implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cco(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(a.h.b.a);
                return Unit.a;
            case 1:
                RouletteActivity rouletteActivity = RouletteActivity.this;
                rouletteActivity.L.setVisibility(8);
                rouletteActivity.R1();
                rouletteActivity.X = null;
                return null;
            default:
                ((Function0) obj).invoke();
                return Unit.a;
        }
    }
}
