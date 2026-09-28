package com.sportybet.plugin.realsports.data;

import com.sporty.android.book.domain.entity.SimpleMarket;
import defpackage.nf;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fÊ\u0001\u0002\b\u0017Ê\u0001\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0016"}, d2 = {"Lcom/sportybet/plugin/realsports/data/BetBuilderMarket;", "", "sportId", "", "markets", "", "Lcom/sporty/android/book/domain/entity/SimpleMarket;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getSportId", "()Ljava/lang/String;", "getMarkets", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BetBuilderMarket {
    public static final int $stable = 8;
    private final List<SimpleMarket> markets;
    private final String sportId;

    public BetBuilderMarket(String str, List<SimpleMarket> list) {
        str.getClass();
        list.getClass();
        this.sportId = str;
        this.markets = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BetBuilderMarket copy$default(BetBuilderMarket betBuilderMarket, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = betBuilderMarket.sportId;
        }
        if ((i & 2) != 0) {
            list = betBuilderMarket.markets;
        }
        return betBuilderMarket.copy(str, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSportId() {
        return this.sportId;
    }

    public final List<SimpleMarket> component2() {
        return this.markets;
    }

    public final BetBuilderMarket copy(String sportId, List<SimpleMarket> markets) {
        sportId.getClass();
        markets.getClass();
        return new BetBuilderMarket(sportId, markets);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BetBuilderMarket)) {
            return false;
        }
        BetBuilderMarket betBuilderMarket = (BetBuilderMarket) other;
        return Intrinsics.g(this.sportId, betBuilderMarket.sportId) && Intrinsics.g(this.markets, betBuilderMarket.markets);
    }

    public final List<SimpleMarket> getMarkets() {
        return this.markets;
    }

    public final String getSportId() {
        return this.sportId;
    }

    public int hashCode() {
        return this.markets.hashCode() + (this.sportId.hashCode() * 31);
    }

    public String toString() {
        return nf.b("BetBuilderMarket(sportId=", this.sportId, ", markets=", ")", this.markets);
    }
}
