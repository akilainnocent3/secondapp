package com.sporty.android.book.domain.entity;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.twilio.voice.EventKeys;
import defpackage.ai50;
import defpackage.f78;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.ml5;
import defpackage.ng1;
import defpackage.qn4;
import defpackage.qpu;
import defpackage.wxa;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0001:B\u008b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0010\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u000f\u0012\u0010\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003J\u0013\u00102\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u000fHÆ\u0003J\u0013\u00103\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u000fHÆ\u0003J§\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0012\b\u0002\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u000f2\u0012\b\u0002\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u000fHÆ\u0001J\u0014\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00108\u001a\u00020\u0005HÖ\u0081\u0004J\n\u00109\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001b\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u001b\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010$Ê\u0001\f\b<\u0012\b\b=\u0012\u0004\b\u0003\u0010\u0002¨\u0006;"}, d2 = {"Lcom/sporty/android/book/domain/entity/Market;", "", AnalyticsParam.EVENT_PARAM_ID, "", "product", "", "desc", AnalyticsParam.EVENT_STATUS, EventKeys.EVENT_GROUP, "groupId", "marketGuide", "title", "favourite", "specifier", "outcomes", "", "Lcom/sporty/android/book/domain/entity/Outcome;", "marketExtendVOS", "Lcom/sporty/android/book/domain/entity/MarketExtend;", "earlyPayoutMarkets", "Lcom/sporty/android/book/domain/entity/EarlyPayoutMarket;", "<init>", "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getProduct", "()I", "getDesc", "getStatus", "getGroup", "getGroupId", "getMarketGuide", "getTitle", "getFavourite", "getSpecifier", "getOutcomes", "()Ljava/util/List;", "getMarketExtendVOS", "getEarlyPayoutMarkets", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "sportybook", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class Market {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String desc;
    private final List<EarlyPayoutMarket> earlyPayoutMarkets;
    private final int favourite;
    private final String group;
    private final String groupId;
    private final String id;
    private final List<MarketExtend> marketExtendVOS;
    private final String marketGuide;
    private final List<Outcome> outcomes;
    private final int product;
    private final String specifier;
    private final int status;
    private final String title;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/sporty/android/book/domain/entity/Market$Companion;", "", "<init>", "()V", "mock", "Lcom/sporty/android/book/domain/entity/Market;", AnalyticsParam.EVENT_PARAM_ID, "", "sportybook"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Market mock(String id) {
            id.getClass();
            return new Market(id, 3, "1X2", 0, "Player", "200309054024MGI07914676", "Which team will win the match. Overtime not included.", "1,X,2", 0, null, a.c(Outcome.INSTANCE.mock("1")), null, null);
        }

        private Companion() {
        }
    }

    public Market(String str, int i, String str2, int i2, String str3, String str4, String str5, String str6, int i3, String str7, List<Outcome> list, List<MarketExtend> list2, List<EarlyPayoutMarket> list3) {
        qn4.b(str, str2, str3, str4, str5);
        str6.getClass();
        list.getClass();
        this.id = str;
        this.product = i;
        this.desc = str2;
        this.status = i2;
        this.group = str3;
        this.groupId = str4;
        this.marketGuide = str5;
        this.title = str6;
        this.favourite = i3;
        this.specifier = str7;
        this.outcomes = list;
        this.marketExtendVOS = list2;
        this.earlyPayoutMarkets = list3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Market copy$default(Market market, String str, int i, String str2, int i2, String str3, String str4, String str5, String str6, int i3, String str7, List list, List list2, List list3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = market.id;
        }
        return market.copy(str, (i4 & 2) != 0 ? market.product : i, (i4 & 4) != 0 ? market.desc : str2, (i4 & 8) != 0 ? market.status : i2, (i4 & 16) != 0 ? market.group : str3, (i4 & 32) != 0 ? market.groupId : str4, (i4 & 64) != 0 ? market.marketGuide : str5, (i4 & 128) != 0 ? market.title : str6, (i4 & 256) != 0 ? market.favourite : i3, (i4 & 512) != 0 ? market.specifier : str7, (i4 & 1024) != 0 ? market.outcomes : list, (i4 & 2048) != 0 ? market.marketExtendVOS : list2, (i4 & 4096) != 0 ? market.earlyPayoutMarkets : list3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getSpecifier() {
        return this.specifier;
    }

    public final List<Outcome> component11() {
        return this.outcomes;
    }

    public final List<MarketExtend> component12() {
        return this.marketExtendVOS;
    }

    public final List<EarlyPayoutMarket> component13() {
        return this.earlyPayoutMarkets;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getProduct() {
        return this.product;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getGroup() {
        return this.group;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getGroupId() {
        return this.groupId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getMarketGuide() {
        return this.marketGuide;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getFavourite() {
        return this.favourite;
    }

    public final Market copy(String id, int product, String desc, int status, String group, String groupId, String marketGuide, String title, int favourite, String specifier, List<Outcome> outcomes, List<MarketExtend> marketExtendVOS, List<EarlyPayoutMarket> earlyPayoutMarkets) {
        qn4.b(id, desc, group, groupId, marketGuide);
        title.getClass();
        outcomes.getClass();
        return new Market(id, product, desc, status, group, groupId, marketGuide, title, favourite, specifier, outcomes, marketExtendVOS, earlyPayoutMarkets);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Market)) {
            return false;
        }
        Market market = (Market) other;
        return Intrinsics.g(this.id, market.id) && this.product == market.product && Intrinsics.g(this.desc, market.desc) && this.status == market.status && Intrinsics.g(this.group, market.group) && Intrinsics.g(this.groupId, market.groupId) && Intrinsics.g(this.marketGuide, market.marketGuide) && Intrinsics.g(this.title, market.title) && this.favourite == market.favourite && Intrinsics.g(this.specifier, market.specifier) && Intrinsics.g(this.outcomes, market.outcomes) && Intrinsics.g(this.marketExtendVOS, market.marketExtendVOS) && Intrinsics.g(this.earlyPayoutMarkets, market.earlyPayoutMarkets);
    }

    public final String getDesc() {
        return this.desc;
    }

    public final List<EarlyPayoutMarket> getEarlyPayoutMarkets() {
        return this.earlyPayoutMarkets;
    }

    public final int getFavourite() {
        return this.favourite;
    }

    public final String getGroup() {
        return this.group;
    }

    public final String getGroupId() {
        return this.groupId;
    }

    public final String getId() {
        return this.id;
    }

    public final List<MarketExtend> getMarketExtendVOS() {
        return this.marketExtendVOS;
    }

    public final String getMarketGuide() {
        return this.marketGuide;
    }

    public final List<Outcome> getOutcomes() {
        return this.outcomes;
    }

    public final int getProduct() {
        return this.product;
    }

    public final String getSpecifier() {
        return this.specifier;
    }

    public final int getStatus() {
        return this.status;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iA = gpp.a(this.favourite, gmf0.a(gmf0.a(gmf0.a(gmf0.a(gpp.a(this.status, gmf0.a(gpp.a(this.product, this.id.hashCode() * 31, 31), 31, this.desc), 31), 31, this.group), 31, this.groupId), 31, this.marketGuide), 31, this.title), 31);
        String str = this.specifier;
        int iA2 = ai50.a((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.outcomes);
        List<MarketExtend> list = this.marketExtendVOS;
        int iHashCode = (iA2 + (list == null ? 0 : list.hashCode())) * 31;
        List<EarlyPayoutMarket> list2 = this.earlyPayoutMarkets;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        int i = this.product;
        String str2 = this.desc;
        int i2 = this.status;
        String str3 = this.group;
        String str4 = this.groupId;
        String str5 = this.marketGuide;
        String str6 = this.title;
        int i3 = this.favourite;
        String str7 = this.specifier;
        List<Outcome> list = this.outcomes;
        List<MarketExtend> list2 = this.marketExtendVOS;
        List<EarlyPayoutMarket> list3 = this.earlyPayoutMarkets;
        StringBuilder sbA = ml5.a(i, "Market(id=", str, ", product=", ", desc=");
        wxa.b(i2, str2, ", status=", ", group=", sbA);
        hxa.c(sbA, str3, ", groupId=", str4, ", marketGuide=");
        hxa.c(sbA, str5, ", title=", str6, ", favourite=");
        f78.b(i3, ", specifier=", str7, ", outcomes=", sbA);
        qpu.a(", marketExtendVOS=", ", earlyPayoutMarkets=", sbA, list, list2);
        return ng1.a(sbA, list3, ")");
    }
}
