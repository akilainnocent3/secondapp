package defpackage;

import com.sportygames.roulette.activities.RouletteActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class on10 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ on10(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ytw) obj).setValue(Boolean.FALSE);
                return Unit.a;
            case 1:
                RouletteActivity rouletteActivity = (RouletteActivity) obj;
                int[] iArr = RouletteActivity.A0;
                rouletteActivity.R1();
                rouletteActivity.L.setVisibility(8);
                rouletteActivity.X = null;
                return null;
            default:
                oda0 oda0Var = (oda0) obj;
                yfx yfxVar = oda0Var.v;
                if (yfxVar != null) {
                    wix.c(yfxVar, oda0Var.getActivity());
                    return Unit.a;
                }
                Intrinsics.n("navController");
                throw null;
        }
    }
}
