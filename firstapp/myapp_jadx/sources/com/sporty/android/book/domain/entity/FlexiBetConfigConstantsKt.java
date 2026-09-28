package com.sporty.android.book.domain.entity;

import java.math.BigDecimal;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0003"}, d2 = {"normalizeFlexiWeightedRtpMultiplier", "Ljava/math/BigDecimal;", "normalizeFlexiAverageWeightedMinEffectiveRtp", "sportybook"}, k = 2, mv = {2, 4, 0}, xi = 48)
public final class FlexiBetConfigConstantsKt {
    public static final BigDecimal normalizeFlexiAverageWeightedMinEffectiveRtp(BigDecimal bigDecimal) {
        bigDecimal.getClass();
        FlexiBetConfigConstants flexiBetConfigConstants = FlexiBetConfigConstants.INSTANCE;
        return (bigDecimal.compareTo(flexiBetConfigConstants.getMIN_EFFECTIVE_WEIGHTED_RTP_MIN()) < 0 || bigDecimal.compareTo(flexiBetConfigConstants.getMIN_EFFECTIVE_WEIGHTED_RTP_MAX()) > 0) ? flexiBetConfigConstants.getDEFAULT_MIN_EFFECTIVE_WEIGHTED_RTP() : bigDecimal;
    }

    public static final BigDecimal normalizeFlexiWeightedRtpMultiplier(BigDecimal bigDecimal) {
        bigDecimal.getClass();
        FlexiBetConfigConstants flexiBetConfigConstants = FlexiBetConfigConstants.INSTANCE;
        return (bigDecimal.compareTo(flexiBetConfigConstants.getMIN_WEIGHTED_RTP_MULTIPLIER()) < 0 || bigDecimal.compareTo(flexiBetConfigConstants.getMAX_WEIGHTED_RTP_MULTIPLIER()) > 0) ? flexiBetConfigConstants.getDEFAULT_WEIGHTED_RTP_MULTIPLIER() : bigDecimal;
    }
}
