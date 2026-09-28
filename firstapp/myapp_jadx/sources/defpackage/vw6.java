package defpackage;

import com.sportybet.feature.loyalty.impl.challenge.presentation.ChallengeActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class vw6 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vw6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ChallengeActivity challengeActivity = (ChallengeActivity) obj;
                int i2 = ChallengeActivity.e;
                challengeActivity.getAccountHelper().demandAccount(challengeActivity, new ww6());
                break;
            case 1:
                ((Function1) obj).invoke(igm.d.c.a);
                break;
            case 2:
                ((wwd0) obj).setValue(p8q.a.a);
                break;
            default:
                ((b8b0) obj).s0();
                break;
        }
        return Unit.a;
    }
}
