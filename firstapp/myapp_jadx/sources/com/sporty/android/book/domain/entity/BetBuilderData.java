package com.sporty.android.book.domain.entity;

import defpackage.ai50;
import defpackage.gmf0;
import defpackage.hxa;
import defpackage.kwi;
import defpackage.mtg0;
import defpackage.ux5;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u0000 72\u00020\u0001:\u00017BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\bHÆ\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jc\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u00102\u001a\u00020\b2\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00104\u001a\u000205HÖ\u0081\u0004J\n\u00106\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0011\u0010\u001b\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u001f\u001a\u0004\u0018\u00010 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010#\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b$\u0010\u001eR\u0013\u0010%\u001a\u0004\u0018\u00010&8F¢\u0006\u0006\u001a\u0004\b'\u0010(Ê\u0001\f\b9\u0012\b\b:\u0012\u0004\b\u0003\u0010\u0000¨\u00068"}, d2 = {"Lcom/sporty/android/book/domain/entity/BetBuilderData;", "", "odds", "", "probability", "marketId", "outcomeId", "valid", "", "incompatibleMarkets", "", "Lcom/sporty/android/book/domain/entity/SimpleMarket;", "failureType", "failureReason", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getOdds", "()Ljava/lang/String;", "getProbability", "getMarketId", "getOutcomeId", "getValid", "()Z", "getIncompatibleMarkets", "()Ljava/util/List;", "getFailureType", "getFailureReason", "oddsDouble", "", "getOddsDouble", "()D", "oddsDecimal", "Ljava/math/BigDecimal;", "getOddsDecimal", "()Ljava/math/BigDecimal;", "probabilityDouble", "getProbabilityDouble", "failureTypeEnum", "Lcom/sporty/android/book/domain/entity/BetBuilderOddsFailureType;", "getFailureTypeEnum", "()Lcom/sporty/android/book/domain/entity/BetBuilderOddsFailureType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "sportybook", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BetBuilderData {
    private final String failureReason;
    private final String failureType;
    private final List<SimpleMarket> incompatibleMarkets;
    private final String marketId;
    private final String odds;
    private final String outcomeId;
    private final String probability;
    private final boolean valid;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/sporty/android/book/domain/entity/BetBuilderData$Companion;", "", "<init>", "()V", "mock", "Lcom/sporty/android/book/domain/entity/BetBuilderData;", "sportybook"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final BetBuilderData mock() {
            return new BetBuilderData("11.56", "0.5456564", "1", "1", true, a.c(SimpleMarket.INSTANCE.mock()), null, null);
        }

        private Companion() {
        }
    }

    public BetBuilderData(String str, String str2, String str3, String str4, boolean z, List<SimpleMarket> list, String str5, String str6) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        list.getClass();
        this.odds = str;
        this.probability = str2;
        this.marketId = str3;
        this.outcomeId = str4;
        this.valid = z;
        this.incompatibleMarkets = list;
        this.failureType = str5;
        this.failureReason = str6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BetBuilderData copy$default(BetBuilderData betBuilderData, String str, String str2, String str3, String str4, boolean z, List list, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = betBuilderData.odds;
        }
        if ((i & 2) != 0) {
            str2 = betBuilderData.probability;
        }
        if ((i & 4) != 0) {
            str3 = betBuilderData.marketId;
        }
        if ((i & 8) != 0) {
            str4 = betBuilderData.outcomeId;
        }
        if ((i & 16) != 0) {
            z = betBuilderData.valid;
        }
        if ((i & 32) != 0) {
            list = betBuilderData.incompatibleMarkets;
        }
        if ((i & 64) != 0) {
            str5 = betBuilderData.failureType;
        }
        if ((i & 128) != 0) {
            str6 = betBuilderData.failureReason;
        }
        String str7 = str5;
        String str8 = str6;
        boolean z2 = z;
        List list2 = list;
        return betBuilderData.copy(str, str2, str3, str4, z2, list2, str7, str8);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOdds() {
        return this.odds;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getProbability() {
        return this.probability;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMarketId() {
        return this.marketId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOutcomeId() {
        return this.outcomeId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getValid() {
        return this.valid;
    }

    public final List<SimpleMarket> component6() {
        return this.incompatibleMarkets;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getFailureType() {
        return this.failureType;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getFailureReason() {
        return this.failureReason;
    }

    public final BetBuilderData copy(String odds, String probability, String marketId, String outcomeId, boolean valid, List<SimpleMarket> incompatibleMarkets, String failureType, String failureReason) {
        odds.getClass();
        probability.getClass();
        marketId.getClass();
        outcomeId.getClass();
        incompatibleMarkets.getClass();
        return new BetBuilderData(odds, probability, marketId, outcomeId, valid, incompatibleMarkets, failureType, failureReason);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BetBuilderData)) {
            return false;
        }
        BetBuilderData betBuilderData = (BetBuilderData) other;
        return Intrinsics.g(this.odds, betBuilderData.odds) && Intrinsics.g(this.probability, betBuilderData.probability) && Intrinsics.g(this.marketId, betBuilderData.marketId) && Intrinsics.g(this.outcomeId, betBuilderData.outcomeId) && this.valid == betBuilderData.valid && Intrinsics.g(this.incompatibleMarkets, betBuilderData.incompatibleMarkets) && Intrinsics.g(this.failureType, betBuilderData.failureType) && Intrinsics.g(this.failureReason, betBuilderData.failureReason);
    }

    public final String getFailureReason() {
        return this.failureReason;
    }

    public final String getFailureType() {
        return this.failureType;
    }

    public final BetBuilderOddsFailureType getFailureTypeEnum() {
        String str = this.failureType;
        if (str == null || StringsKt.U(str)) {
            return null;
        }
        return BetBuilderOddsFailureType.INSTANCE.from(this.failureType);
    }

    public final List<SimpleMarket> getIncompatibleMarkets() {
        return this.incompatibleMarkets;
    }

    public final String getMarketId() {
        return this.marketId;
    }

    public final String getOdds() {
        return this.odds;
    }

    public final BigDecimal getOddsDecimal() {
        return b.g(this.odds);
    }

    public final double getOddsDouble() {
        return Double.parseDouble(this.odds);
    }

    public final String getOutcomeId() {
        return this.outcomeId;
    }

    public final String getProbability() {
        return this.probability;
    }

    public final double getProbabilityDouble() {
        return Double.parseDouble(this.probability);
    }

    public final boolean getValid() {
        return this.valid;
    }

    public int hashCode() {
        int iA = ai50.a(mtg0.a(gmf0.a(gmf0.a(gmf0.a(this.odds.hashCode() * 31, 31, this.probability), 31, this.marketId), 31, this.outcomeId), 31, this.valid), 31, this.incompatibleMarkets);
        String str = this.failureType;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.failureReason;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.odds;
        String str2 = this.probability;
        String str3 = this.marketId;
        String str4 = this.outcomeId;
        boolean z = this.valid;
        List<SimpleMarket> list = this.incompatibleMarkets;
        String str5 = this.failureType;
        String str6 = this.failureReason;
        StringBuilder sbA = ux5.a("BetBuilderData(odds=", str, ", probability=", str2, ", marketId=");
        hxa.c(sbA, str3, ", outcomeId=", str4, ", valid=");
        sbA.append(z);
        sbA.append(", incompatibleMarkets=");
        sbA.append(list);
        sbA.append(", failureType=");
        return kwi.a(sbA, str5, ", failureReason=", str6, ")");
    }
}
