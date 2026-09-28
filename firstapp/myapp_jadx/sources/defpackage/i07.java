package defpackage;

import com.sportybet.feature.loyalty.impl.challenge.domain.model.ChallengeType;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class i07 implements Function0 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                ChallengeType[] challengeTypeArrValues = ChallengeType.values();
                challengeTypeArrValues.getClass();
                return new wag("com.sportybet.feature.loyalty.impl.challenge.domain.model.ChallengeType", challengeTypeArrValues);
            default:
                return sh8.b();
        }
    }
}
