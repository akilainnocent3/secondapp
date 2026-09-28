package com.sporty.android.book.domain.entity;

import defpackage.ai50;
import defpackage.m2g;
import defpackage.ux5;
import defpackage.v9d;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0001#BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0003J[\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0001J\u0014\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010 \u001a\u00020!HÖ\u0081\u0004J\n\u0010\"\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013Ê\u0001\f\b%\u0012\b\b&\u0012\u0004\b\u0003\u0010\u0000¨\u0006$"}, d2 = {"Lcom/sporty/android/book/domain/entity/SimpleMarket;", "", "marketId", "", "specifier", "outcome", "Lcom/sporty/android/book/domain/entity/OutcomeList;", "outcomeIds", "", "baseMarketIds", "banSpecifiers", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/sporty/android/book/domain/entity/OutcomeList;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getMarketId", "()Ljava/lang/String;", "getSpecifier", "getOutcome", "()Lcom/sporty/android/book/domain/entity/OutcomeList;", "getOutcomeIds", "()Ljava/util/List;", "getBaseMarketIds", "getBanSpecifiers", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "sportybook", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SimpleMarket {
    private final List<String> banSpecifiers;
    private final List<String> baseMarketIds;
    private final String marketId;
    private final OutcomeList outcome;
    private final List<String> outcomeIds;
    private final String specifier;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = OutcomeList.$stable;

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/sporty/android/book/domain/entity/SimpleMarket$Companion;", "", "<init>", "()V", "mock", "Lcom/sporty/android/book/domain/entity/SimpleMarket;", "sportybook"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SimpleMarket mock() {
            return new SimpleMarket("1", null, new OutcomeList(OutcomeList.Kind.ALLOW, b.k("1", "2", "3")), b.k("1", "2", "3"), null, null, 50, null);
        }

        private Companion() {
        }
    }

    public SimpleMarket(String str, String str2, OutcomeList outcomeList, List<String> list, List<String> list2, List<String> list3) {
        str.getClass();
        outcomeList.getClass();
        list.getClass();
        list2.getClass();
        this.marketId = str;
        this.specifier = str2;
        this.outcome = outcomeList;
        this.outcomeIds = list;
        this.baseMarketIds = list2;
        this.banSpecifiers = list3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SimpleMarket copy$default(SimpleMarket simpleMarket, String str, String str2, OutcomeList outcomeList, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = simpleMarket.marketId;
        }
        if ((i & 2) != 0) {
            str2 = simpleMarket.specifier;
        }
        if ((i & 4) != 0) {
            outcomeList = simpleMarket.outcome;
        }
        if ((i & 8) != 0) {
            list = simpleMarket.outcomeIds;
        }
        if ((i & 16) != 0) {
            list2 = simpleMarket.baseMarketIds;
        }
        if ((i & 32) != 0) {
            list3 = simpleMarket.banSpecifiers;
        }
        List list4 = list2;
        List list5 = list3;
        return simpleMarket.copy(str, str2, outcomeList, list, list4, list5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMarketId() {
        return this.marketId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSpecifier() {
        return this.specifier;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final OutcomeList getOutcome() {
        return this.outcome;
    }

    public final List<String> component4() {
        return this.outcomeIds;
    }

    public final List<String> component5() {
        return this.baseMarketIds;
    }

    public final List<String> component6() {
        return this.banSpecifiers;
    }

    public final SimpleMarket copy(String marketId, String specifier, OutcomeList outcome, List<String> outcomeIds, List<String> baseMarketIds, List<String> banSpecifiers) {
        marketId.getClass();
        outcome.getClass();
        outcomeIds.getClass();
        baseMarketIds.getClass();
        return new SimpleMarket(marketId, specifier, outcome, outcomeIds, baseMarketIds, banSpecifiers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SimpleMarket)) {
            return false;
        }
        SimpleMarket simpleMarket = (SimpleMarket) other;
        return Intrinsics.g(this.marketId, simpleMarket.marketId) && Intrinsics.g(this.specifier, simpleMarket.specifier) && Intrinsics.g(this.outcome, simpleMarket.outcome) && Intrinsics.g(this.outcomeIds, simpleMarket.outcomeIds) && Intrinsics.g(this.baseMarketIds, simpleMarket.baseMarketIds) && Intrinsics.g(this.banSpecifiers, simpleMarket.banSpecifiers);
    }

    public final List<String> getBanSpecifiers() {
        return this.banSpecifiers;
    }

    public final List<String> getBaseMarketIds() {
        return this.baseMarketIds;
    }

    public final String getMarketId() {
        return this.marketId;
    }

    public final OutcomeList getOutcome() {
        return this.outcome;
    }

    public final List<String> getOutcomeIds() {
        return this.outcomeIds;
    }

    public final String getSpecifier() {
        return this.specifier;
    }

    public int hashCode() {
        int iHashCode = this.marketId.hashCode() * 31;
        String str = this.specifier;
        int iA = ai50.a(ai50.a((this.outcome.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.outcomeIds), 31, this.baseMarketIds);
        List<String> list = this.banSpecifiers;
        return iA + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.marketId;
        String str2 = this.specifier;
        OutcomeList outcomeList = this.outcome;
        List<String> list = this.outcomeIds;
        List<String> list2 = this.baseMarketIds;
        List<String> list3 = this.banSpecifiers;
        StringBuilder sbA = ux5.a("SimpleMarket(marketId=", str, ", specifier=", str2, ", outcome=");
        sbA.append(outcomeList);
        sbA.append(", outcomeIds=");
        sbA.append(list);
        sbA.append(", baseMarketIds=");
        return v9d.a(", banSpecifiers=", ")", sbA, list2, list3);
    }

    public SimpleMarket(String str, String str2, OutcomeList outcomeList, List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, outcomeList, list, (i & 16) != 0 ? m2g.a : list2, (i & 32) != 0 ? null : list3);
    }
}
