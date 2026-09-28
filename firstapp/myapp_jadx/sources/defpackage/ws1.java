package defpackage;

import com.sportybet.feature.loyalty.impl.challenge.presentation.ChallengeActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ws1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ws1(Object obj, int i) {
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
                ((ytw) obj).setValue(Boolean.FALSE);
                break;
            case 1:
                int i2 = ChallengeActivity.e;
                ((ChallengeActivity) obj).finish();
                break;
            default:
                wwd0 wwd0Var = (wwd0) obj;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, cfy.c((p8q) value)));
                break;
        }
        return Unit.a;
    }
}
