package defpackage;

import com.sportybet.feature.loyalty.impl.bettingstreak.BettingStreakActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class l04 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l04(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int i2 = BettingStreakActivity.c;
                ((BettingStreakActivity) obj).finish();
                break;
            case 1:
                wwd0 wwd0Var = ((mfr) obj).C;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, Integer.valueOf(((Number) value).intValue() + 1)));
                break;
            default:
                ((k0w) obj).d.invoke();
                break;
        }
        return Unit.a;
    }
}
