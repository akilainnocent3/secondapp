package defpackage;

import com.sportybet.feature.luckynumber.featurematch.domain.data.LNLastMinuteCard;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class v5u implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        LNLastMinuteCard lNLastMinuteCard = (LNLastMinuteCard) obj;
        LNLastMinuteCard lNLastMinuteCard2 = (LNLastMinuteCard) obj2;
        return Boolean.valueOf(Intrinsics.g(lNLastMinuteCard != null ? lNLastMinuteCard.d : null, lNLastMinuteCard2 != null ? lNLastMinuteCard2.d : null));
    }
}
