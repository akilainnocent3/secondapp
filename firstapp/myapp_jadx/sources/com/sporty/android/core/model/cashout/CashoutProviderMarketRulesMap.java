package com.sporty.android.core.model.cashout;

import com.sporty.android.core.model.common.MapWrapper;
import defpackage.kwi;
import defpackage.nf;
import defpackage.o2g;
import defpackage.pq6;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\u0014B#\u0012\u001a\b\u0002\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0006HÆ\u0003J%\u0010\f\u001a\u00020\u00002\u001a\b\u0002\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0006HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0002HÖ\u0081\u0004R&\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/sporty/android/core/model/cashout/CashoutProviderMarketRulesMap;", "Lcom/sporty/android/core/model/common/MapWrapper;", "", "", "Lcom/sporty/android/core/model/cashout/CashoutProviderMarketRulesMap$Action;", "map", "", "<init>", "(Ljava/util/Map;)V", "getMap", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Action", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CashoutProviderMarketRulesMap implements MapWrapper<String, List<? extends Action>> {
    private final Map<String, List<Action>> map;

    /* JADX WARN: Illegal instructions before constructor call */
    public CashoutProviderMarketRulesMap(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            map = o2g.a;
            map.getClass();
        }
        this(map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CashoutProviderMarketRulesMap copy$default(CashoutProviderMarketRulesMap cashoutProviderMarketRulesMap, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = cashoutProviderMarketRulesMap.map;
        }
        return cashoutProviderMarketRulesMap.copy(map);
    }

    public final Map<String, List<Action>> component1() {
        return this.map;
    }

    public final CashoutProviderMarketRulesMap copy(Map<String, ? extends List<Action>> map) {
        map.getClass();
        return new CashoutProviderMarketRulesMap(map);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CashoutProviderMarketRulesMap) && Intrinsics.g(this.map, ((CashoutProviderMarketRulesMap) other).map);
    }

    @Override // com.sporty.android.core.model.common.MapWrapper
    public Map<String, List<? extends Action>> getMap() {
        return this.map;
    }

    public int hashCode() {
        return this.map.hashCode();
    }

    public String toString() {
        return "CashoutProviderMarketRulesMap(map=" + this.map + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CashoutProviderMarketRulesMap(Map<String, ? extends List<Action>> map) {
        map.getClass();
        this.map = map;
    }

    public CashoutProviderMarketRulesMap() {
        this(null, 1, null);
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/sporty/android/core/model/cashout/CashoutProviderMarketRulesMap$Action;", "", "action", "", "markets", "", "Lcom/sporty/android/core/model/cashout/CashoutProviderMarketRulesMap$Action$MarketRule;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getAction", "()Ljava/lang/String;", "getMarkets", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "MarketRule", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Action {
        private final String action;
        private final List<MarketRule> markets;

        public Action(String str, List<MarketRule> list) {
            str.getClass();
            list.getClass();
            this.action = str;
            this.markets = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Action copy$default(Action action, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = action.action;
            }
            if ((i & 2) != 0) {
                list = action.markets;
            }
            return action.copy(str, list);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getAction() {
            return this.action;
        }

        public final List<MarketRule> component2() {
            return this.markets;
        }

        public final Action copy(String action, List<MarketRule> markets) {
            action.getClass();
            markets.getClass();
            return new Action(action, markets);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Action)) {
                return false;
            }
            Action action = (Action) other;
            return Intrinsics.g(this.action, action.action) && Intrinsics.g(this.markets, action.markets);
        }

        public final String getAction() {
            return this.action;
        }

        public final List<MarketRule> getMarkets() {
            return this.markets;
        }

        public int hashCode() {
            return this.markets.hashCode() + (this.action.hashCode() * 31);
        }

        public String toString() {
            return nf.b("Action(action=", this.action, ", markets=", ")", this.markets);
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J>\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0005HÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/sporty/android/core/model/cashout/CashoutProviderMarketRulesMap$Action$MarketRule;", "", "betType", "", "sportId", "", "marketId", "specifier", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBetType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSportId", "()Ljava/lang/String;", "getMarketId", "getSpecifier", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/sporty/android/core/model/cashout/CashoutProviderMarketRulesMap$Action$MarketRule;", "equals", "", "other", "hashCode", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final /* data */ class MarketRule {
            private final Integer betType;
            private final String marketId;
            private final String specifier;
            private final String sportId;

            public /* synthetic */ MarketRule(Integer num, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
            }

            public static /* synthetic */ MarketRule copy$default(MarketRule marketRule, Integer num, String str, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    num = marketRule.betType;
                }
                if ((i & 2) != 0) {
                    str = marketRule.sportId;
                }
                if ((i & 4) != 0) {
                    str2 = marketRule.marketId;
                }
                if ((i & 8) != 0) {
                    str3 = marketRule.specifier;
                }
                return marketRule.copy(num, str, str2, str3);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Integer getBetType() {
                return this.betType;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getSportId() {
                return this.sportId;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final String getMarketId() {
                return this.marketId;
            }

            /* JADX INFO: renamed from: component4, reason: from getter */
            public final String getSpecifier() {
                return this.specifier;
            }

            public final MarketRule copy(Integer betType, String sportId, String marketId, String specifier) {
                return new MarketRule(betType, sportId, marketId, specifier);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof MarketRule)) {
                    return false;
                }
                MarketRule marketRule = (MarketRule) other;
                return Intrinsics.g(this.betType, marketRule.betType) && Intrinsics.g(this.sportId, marketRule.sportId) && Intrinsics.g(this.marketId, marketRule.marketId) && Intrinsics.g(this.specifier, marketRule.specifier);
            }

            public final Integer getBetType() {
                return this.betType;
            }

            public final String getMarketId() {
                return this.marketId;
            }

            public final String getSpecifier() {
                return this.specifier;
            }

            public final String getSportId() {
                return this.sportId;
            }

            public int hashCode() {
                Integer num = this.betType;
                int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
                String str = this.sportId;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.marketId;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.specifier;
                return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
            }

            public String toString() {
                Integer num = this.betType;
                String str = this.sportId;
                return kwi.a(pq6.a(num, "MarketRule(betType=", ", sportId=", str, ", marketId="), this.marketId, ", specifier=", this.specifier, ")");
            }

            public MarketRule(Integer num, String str, String str2, String str3) {
                this.betType = num;
                this.sportId = str;
                this.marketId = str2;
                this.specifier = str3;
            }

            public MarketRule() {
                this(null, null, null, null, 15, null);
            }
        }
    }
}
