package defpackage;

import com.sportybet.feature.loyalty.impl.challenge.presentation.ChallengeActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ys1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ys1(Object obj, int i) {
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
            default:
                ChallengeActivity challengeActivity = (ChallengeActivity) obj;
                esm esmVar = challengeActivity.d;
                if (esmVar != null) {
                    esmVar.a(challengeActivity);
                    return Unit.a;
                }
                Intrinsics.n("socialRouter");
                throw null;
        }
    }
}
