package com.sporty.android.book.domain.entity;

import java.math.BigDecimal;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0010\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000bR\u0011\u0010\u0015\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000bR\u000e\u0010\u0017\u001a\u00020\u0018X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0019\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000bR\u0011\u0010\u001b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u000bÊ\u0001\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u001d"}, d2 = {"Lcom/sporty/android/book/domain/entity/FlexiBetConfigConstants;", "", "<init>", "()V", "FLEXIBET_ON", "", "FLEXIBET_NOTLIVE", "FLEXIBET_DISABLE", "MIN_WEIGHTED_RTP_MULTIPLIER", "Ljava/math/BigDecimal;", "getMIN_WEIGHTED_RTP_MULTIPLIER", "()Ljava/math/BigDecimal;", "MAX_WEIGHTED_RTP_MULTIPLIER", "getMAX_WEIGHTED_RTP_MULTIPLIER", "MIN_EFFECTIVE_WEIGHTED_RTP_MIN", "getMIN_EFFECTIVE_WEIGHTED_RTP_MIN", "MIN_EFFECTIVE_WEIGHTED_RTP_MAX", "getMIN_EFFECTIVE_WEIGHTED_RTP_MAX", "DEFAULT_STATUS", "DEFAULT_ODDS_KEY", "getDEFAULT_ODDS_KEY", "DEFAULT_MIN_ODDS", "getDEFAULT_MIN_ODDS", "DEFAULT_WEIGHTED_RTP_ENABLED", "", "DEFAULT_WEIGHTED_RTP_MULTIPLIER", "getDEFAULT_WEIGHTED_RTP_MULTIPLIER", "DEFAULT_MIN_EFFECTIVE_WEIGHTED_RTP", "getDEFAULT_MIN_EFFECTIVE_WEIGHTED_RTP", "sportybook", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class FlexiBetConfigConstants {
    public static final int $stable = 0;
    private static final BigDecimal DEFAULT_MIN_EFFECTIVE_WEIGHTED_RTP;
    private static final BigDecimal DEFAULT_MIN_ODDS;
    private static final BigDecimal DEFAULT_ODDS_KEY;
    public static final int DEFAULT_STATUS = 2;
    public static final boolean DEFAULT_WEIGHTED_RTP_ENABLED = false;
    private static final BigDecimal DEFAULT_WEIGHTED_RTP_MULTIPLIER;
    public static final int FLEXIBET_DISABLE = 2;
    public static final int FLEXIBET_NOTLIVE = 1;
    public static final int FLEXIBET_ON = 0;
    public static final FlexiBetConfigConstants INSTANCE = new FlexiBetConfigConstants();
    private static final BigDecimal MAX_WEIGHTED_RTP_MULTIPLIER;
    private static final BigDecimal MIN_EFFECTIVE_WEIGHTED_RTP_MAX;
    private static final BigDecimal MIN_EFFECTIVE_WEIGHTED_RTP_MIN;
    private static final BigDecimal MIN_WEIGHTED_RTP_MULTIPLIER;

    static {
        BigDecimal bigDecimal = BigDecimal.ONE;
        bigDecimal.getClass();
        MIN_WEIGHTED_RTP_MULTIPLIER = bigDecimal;
        BigDecimal bigDecimal2 = BigDecimal.TEN;
        bigDecimal2.getClass();
        MAX_WEIGHTED_RTP_MULTIPLIER = bigDecimal2;
        MIN_EFFECTIVE_WEIGHTED_RTP_MIN = new BigDecimal("0.5");
        MIN_EFFECTIVE_WEIGHTED_RTP_MAX = new BigDecimal("0.9");
        DEFAULT_ODDS_KEY = new BigDecimal("0.8");
        DEFAULT_MIN_ODDS = new BigDecimal("1.05");
        DEFAULT_WEIGHTED_RTP_MULTIPLIER = new BigDecimal("2.5");
        DEFAULT_MIN_EFFECTIVE_WEIGHTED_RTP = new BigDecimal("0.8");
    }

    private FlexiBetConfigConstants() {
    }

    public final BigDecimal getDEFAULT_MIN_EFFECTIVE_WEIGHTED_RTP() {
        return DEFAULT_MIN_EFFECTIVE_WEIGHTED_RTP;
    }

    public final BigDecimal getDEFAULT_MIN_ODDS() {
        return DEFAULT_MIN_ODDS;
    }

    public final BigDecimal getDEFAULT_ODDS_KEY() {
        return DEFAULT_ODDS_KEY;
    }

    public final BigDecimal getDEFAULT_WEIGHTED_RTP_MULTIPLIER() {
        return DEFAULT_WEIGHTED_RTP_MULTIPLIER;
    }

    public final BigDecimal getMAX_WEIGHTED_RTP_MULTIPLIER() {
        return MAX_WEIGHTED_RTP_MULTIPLIER;
    }

    public final BigDecimal getMIN_EFFECTIVE_WEIGHTED_RTP_MAX() {
        return MIN_EFFECTIVE_WEIGHTED_RTP_MAX;
    }

    public final BigDecimal getMIN_EFFECTIVE_WEIGHTED_RTP_MIN() {
        return MIN_EFFECTIVE_WEIGHTED_RTP_MIN;
    }

    public final BigDecimal getMIN_WEIGHTED_RTP_MULTIPLIER() {
        return MIN_WEIGHTED_RTP_MULTIPLIER;
    }
}
