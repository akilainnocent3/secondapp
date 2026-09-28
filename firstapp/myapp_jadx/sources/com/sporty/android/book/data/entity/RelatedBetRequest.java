package com.sporty.android.book.data.entity;

import com.appsflyer.internal.m;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.ai50;
import defpackage.gmf0;
import defpackage.hxa;
import defpackage.kwi;
import defpackage.kya0;
import defpackage.l48;
import defpackage.qn4;
import defpackage.ux5;
import defpackage.w9d;
import defpackage.x9d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0019\u001aB#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\u000f\u001a\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\rHÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00038F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\nÊ\u0001\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u001b"}, d2 = {"Lcom/sporty/android/book/data/entity/RelatedBetRequest;", "", "selections", "", "Lcom/sporty/android/book/data/entity/RelatedBetRequest$Selection;", "betBuilderSelections", "Lcom/sporty/android/book/data/entity/RelatedBetRequest$BetBuilderSelection;", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getSelections", "()Ljava/util/List;", "getBetBuilderSelections", "uniqueIds", "", "getUniqueIds", "appendSelections", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Selection", "BetBuilderSelection", "sportybook", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class RelatedBetRequest {
    public static final int $stable = 0;
    private final List<BetBuilderSelection> betBuilderSelections;
    private final List<Selection> selections;

    public RelatedBetRequest(List<Selection> list, List<BetBuilderSelection> list2) {
        list.getClass();
        list2.getClass();
        this.selections = list;
        this.betBuilderSelections = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RelatedBetRequest copy$default(RelatedBetRequest relatedBetRequest, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = relatedBetRequest.selections;
        }
        if ((i & 2) != 0) {
            list2 = relatedBetRequest.betBuilderSelections;
        }
        return relatedBetRequest.copy(list, list2);
    }

    public final RelatedBetRequest appendSelections(List<Selection> selections) {
        selections.getClass();
        return copy$default(this, CollectionsKt.i0(selections, this.selections), null, 2, null);
    }

    public final List<Selection> component1() {
        return this.selections;
    }

    public final List<BetBuilderSelection> component2() {
        return this.betBuilderSelections;
    }

    public final RelatedBetRequest copy(List<Selection> selections, List<BetBuilderSelection> betBuilderSelections) {
        selections.getClass();
        betBuilderSelections.getClass();
        return new RelatedBetRequest(selections, betBuilderSelections);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RelatedBetRequest)) {
            return false;
        }
        RelatedBetRequest relatedBetRequest = (RelatedBetRequest) other;
        return Intrinsics.g(this.selections, relatedBetRequest.selections) && Intrinsics.g(this.betBuilderSelections, relatedBetRequest.betBuilderSelections);
    }

    public final List<BetBuilderSelection> getBetBuilderSelections() {
        return this.betBuilderSelections;
    }

    public final List<Selection> getSelections() {
        return this.selections;
    }

    public final List<String> getUniqueIds() {
        List<Selection> list = this.selections;
        ArrayList arrayList = new ArrayList(l48.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Selection) it.next()).getUniqueId());
        }
        List<BetBuilderSelection> list2 = this.betBuilderSelections;
        ArrayList arrayList2 = new ArrayList(l48.r(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((BetBuilderSelection) it2.next()).getUniqueId());
        }
        return CollectionsKt.i0(arrayList2, arrayList);
    }

    public int hashCode() {
        return this.betBuilderSelections.hashCode() + (this.selections.hashCode() * 31);
    }

    public String toString() {
        return w9d.a("RelatedBetRequest(selections=", ", betBuilderSelections=", ")", this.selections, this.betBuilderSelections);
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J[\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0014\u0010\"\u001a\u00020\u000b2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010$\u001a\u00020%HÖ\u0081\u0004J\n\u0010&\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000fÊ\u0001\f\b(\u0012\b\b)\u0012\u0004\b\u0003\u0010\u0002¨\u0006'"}, d2 = {"Lcom/sporty/android/book/data/entity/RelatedBetRequest$Selection;", "", "sportId", "", "tournamentId", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "marketId", "outcomeId", "specifier", "odds", "isRelatedBet", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getSportId", "()Ljava/lang/String;", "getTournamentId", "getEventId", "getMarketId", "getOutcomeId", "getSpecifier", "getOdds", "()Z", "uniqueId", "getUniqueId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "sportybook", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Selection {
        public static final int $stable = 0;
        private final String eventId;
        private final boolean isRelatedBet;
        private final String marketId;
        private final String odds;
        private final String outcomeId;
        private final String specifier;
        private final String sportId;
        private final String tournamentId;

        public Selection(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
            qn4.b(str, str2, str3, str4, str5);
            str7.getClass();
            this.sportId = str;
            this.tournamentId = str2;
            this.eventId = str3;
            this.marketId = str4;
            this.outcomeId = str5;
            this.specifier = str6;
            this.odds = str7;
            this.isRelatedBet = z;
        }

        public static /* synthetic */ Selection copy$default(Selection selection, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = selection.sportId;
            }
            if ((i & 2) != 0) {
                str2 = selection.tournamentId;
            }
            if ((i & 4) != 0) {
                str3 = selection.eventId;
            }
            if ((i & 8) != 0) {
                str4 = selection.marketId;
            }
            if ((i & 16) != 0) {
                str5 = selection.outcomeId;
            }
            if ((i & 32) != 0) {
                str6 = selection.specifier;
            }
            if ((i & 64) != 0) {
                str7 = selection.odds;
            }
            if ((i & 128) != 0) {
                z = selection.isRelatedBet;
            }
            String str8 = str7;
            boolean z2 = z;
            String str9 = str5;
            String str10 = str6;
            return selection.copy(str, str2, str3, str4, str9, str10, str8, z2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getSportId() {
            return this.sportId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getTournamentId() {
            return this.tournamentId;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getEventId() {
            return this.eventId;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getMarketId() {
            return this.marketId;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getOutcomeId() {
            return this.outcomeId;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getSpecifier() {
            return this.specifier;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getOdds() {
            return this.odds;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final boolean getIsRelatedBet() {
            return this.isRelatedBet;
        }

        public final Selection copy(String sportId, String tournamentId, String eventId, String marketId, String outcomeId, String specifier, String odds, boolean isRelatedBet) {
            qn4.b(sportId, tournamentId, eventId, marketId, outcomeId);
            odds.getClass();
            return new Selection(sportId, tournamentId, eventId, marketId, outcomeId, specifier, odds, isRelatedBet);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Selection)) {
                return false;
            }
            Selection selection = (Selection) other;
            return Intrinsics.g(this.sportId, selection.sportId) && Intrinsics.g(this.tournamentId, selection.tournamentId) && Intrinsics.g(this.eventId, selection.eventId) && Intrinsics.g(this.marketId, selection.marketId) && Intrinsics.g(this.outcomeId, selection.outcomeId) && Intrinsics.g(this.specifier, selection.specifier) && Intrinsics.g(this.odds, selection.odds) && this.isRelatedBet == selection.isRelatedBet;
        }

        public final String getEventId() {
            return this.eventId;
        }

        public final String getMarketId() {
            return this.marketId;
        }

        public final String getOdds() {
            return this.odds;
        }

        public final String getOutcomeId() {
            return this.outcomeId;
        }

        public final String getSpecifier() {
            return this.specifier;
        }

        public final String getSportId() {
            return this.sportId;
        }

        public final String getTournamentId() {
            return this.tournamentId;
        }

        public final String getUniqueId() {
            return this.eventId + "-" + this.marketId + "-" + this.outcomeId;
        }

        public int hashCode() {
            int iA = gmf0.a(gmf0.a(gmf0.a(gmf0.a(this.sportId.hashCode() * 31, 31, this.tournamentId), 31, this.eventId), 31, this.marketId), 31, this.outcomeId);
            String str = this.specifier;
            return Boolean.hashCode(this.isRelatedBet) + gmf0.a((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.odds);
        }

        public final boolean isRelatedBet() {
            return this.isRelatedBet;
        }

        public String toString() {
            String str = this.sportId;
            String str2 = this.tournamentId;
            String str3 = this.eventId;
            String str4 = this.marketId;
            String str5 = this.outcomeId;
            String str6 = this.specifier;
            String str7 = this.odds;
            boolean z = this.isRelatedBet;
            StringBuilder sbA = ux5.a("Selection(sportId=", str, ", tournamentId=", str2, ", eventId=");
            hxa.c(sbA, str3, ", marketId=", str4, ", outcomeId=");
            hxa.c(sbA, str5, ", specifier=", str6, ", odds=");
            return x9d.a(str7, ", isRelatedBet=", ")", sbA, z);
        }

        public /* synthetic */ Selection(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, str5, str6, str7, (i & 128) != 0 ? false : z);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001:\u0001'B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003JK\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0014\u0010\"\u001a\u00020\u000b2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010$\u001a\u00020%HÖ\u0081\u0004J\n\u0010&\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0015R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000fÊ\u0001\f\b)\u0012\b\b*\u0012\u0004\b\u0003\u0010\u0000¨\u0006("}, d2 = {"Lcom/sporty/android/book/data/entity/RelatedBetRequest$BetBuilderSelection;", "", "sportId", "", "tournamentId", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "markets", "", "Lcom/sporty/android/book/data/entity/RelatedBetRequest$BetBuilderSelection$Market;", "odds", "isRelatedBet", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Z)V", "getSportId", "()Ljava/lang/String;", "getTournamentId", "getEventId", "getMarkets", "()Ljava/util/List;", "getOdds", "()Z", "primaryMarket", "getPrimaryMarket", "()Lcom/sporty/android/book/data/entity/RelatedBetRequest$BetBuilderSelection$Market;", "uniqueId", "getUniqueId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "Market", "sportybook", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class BetBuilderSelection {
        public static final int $stable = 8;
        private final String eventId;
        private final boolean isRelatedBet;
        private final List<Market> markets;
        private final String odds;
        private final String sportId;
        private final String tournamentId;

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nÊ\u0001\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0019"}, d2 = {"Lcom/sporty/android/book/data/entity/RelatedBetRequest$BetBuilderSelection$Market;", "", "marketId", "", "outcomeId", "specifier", "odds", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMarketId", "()Ljava/lang/String;", "getOutcomeId", "getSpecifier", "getOdds", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "sportybook", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final /* data */ class Market {
            public static final int $stable = 0;
            private final String marketId;
            private final String odds;
            private final String outcomeId;
            private final String specifier;

            public Market(String str, String str2, String str3, String str4) {
                m.a(str, str2, str4);
                this.marketId = str;
                this.outcomeId = str2;
                this.specifier = str3;
                this.odds = str4;
            }

            public static /* synthetic */ Market copy$default(Market market, String str, String str2, String str3, String str4, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = market.marketId;
                }
                if ((i & 2) != 0) {
                    str2 = market.outcomeId;
                }
                if ((i & 4) != 0) {
                    str3 = market.specifier;
                }
                if ((i & 8) != 0) {
                    str4 = market.odds;
                }
                return market.copy(str, str2, str3, str4);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getMarketId() {
                return this.marketId;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getOutcomeId() {
                return this.outcomeId;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final String getSpecifier() {
                return this.specifier;
            }

            /* JADX INFO: renamed from: component4, reason: from getter */
            public final String getOdds() {
                return this.odds;
            }

            public final Market copy(String marketId, String outcomeId, String specifier, String odds) {
                marketId.getClass();
                outcomeId.getClass();
                odds.getClass();
                return new Market(marketId, outcomeId, specifier, odds);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Market)) {
                    return false;
                }
                Market market = (Market) other;
                return Intrinsics.g(this.marketId, market.marketId) && Intrinsics.g(this.outcomeId, market.outcomeId) && Intrinsics.g(this.specifier, market.specifier) && Intrinsics.g(this.odds, market.odds);
            }

            public final String getMarketId() {
                return this.marketId;
            }

            public final String getOdds() {
                return this.odds;
            }

            public final String getOutcomeId() {
                return this.outcomeId;
            }

            public final String getSpecifier() {
                return this.specifier;
            }

            public int hashCode() {
                int iA = gmf0.a(this.marketId.hashCode() * 31, 31, this.outcomeId);
                String str = this.specifier;
                return this.odds.hashCode() + ((iA + (str == null ? 0 : str.hashCode())) * 31);
            }

            public String toString() {
                String str = this.marketId;
                String str2 = this.outcomeId;
                return kwi.a(ux5.a("Market(marketId=", str, ", outcomeId=", str2, ", specifier="), this.specifier, ", odds=", this.odds, ")");
            }
        }

        public BetBuilderSelection(String str, String str2, String str3, List<Market> list, String str4, boolean z) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            list.getClass();
            str4.getClass();
            this.sportId = str;
            this.tournamentId = str2;
            this.eventId = str3;
            this.markets = list;
            this.odds = str4;
            this.isRelatedBet = z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ BetBuilderSelection copy$default(BetBuilderSelection betBuilderSelection, String str, String str2, String str3, List list, String str4, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = betBuilderSelection.sportId;
            }
            if ((i & 2) != 0) {
                str2 = betBuilderSelection.tournamentId;
            }
            if ((i & 4) != 0) {
                str3 = betBuilderSelection.eventId;
            }
            if ((i & 8) != 0) {
                list = betBuilderSelection.markets;
            }
            if ((i & 16) != 0) {
                str4 = betBuilderSelection.odds;
            }
            if ((i & 32) != 0) {
                z = betBuilderSelection.isRelatedBet;
            }
            String str5 = str4;
            boolean z2 = z;
            return betBuilderSelection.copy(str, str2, str3, list, str5, z2);
        }

        private final Market getPrimaryMarket() {
            return (Market) CollectionsKt.firstOrNull(this.markets);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getSportId() {
            return this.sportId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getTournamentId() {
            return this.tournamentId;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getEventId() {
            return this.eventId;
        }

        public final List<Market> component4() {
            return this.markets;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getOdds() {
            return this.odds;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final boolean getIsRelatedBet() {
            return this.isRelatedBet;
        }

        public final BetBuilderSelection copy(String sportId, String tournamentId, String eventId, List<Market> markets, String odds, boolean isRelatedBet) {
            sportId.getClass();
            tournamentId.getClass();
            eventId.getClass();
            markets.getClass();
            odds.getClass();
            return new BetBuilderSelection(sportId, tournamentId, eventId, markets, odds, isRelatedBet);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BetBuilderSelection)) {
                return false;
            }
            BetBuilderSelection betBuilderSelection = (BetBuilderSelection) other;
            return Intrinsics.g(this.sportId, betBuilderSelection.sportId) && Intrinsics.g(this.tournamentId, betBuilderSelection.tournamentId) && Intrinsics.g(this.eventId, betBuilderSelection.eventId) && Intrinsics.g(this.markets, betBuilderSelection.markets) && Intrinsics.g(this.odds, betBuilderSelection.odds) && this.isRelatedBet == betBuilderSelection.isRelatedBet;
        }

        public final String getEventId() {
            return this.eventId;
        }

        public final List<Market> getMarkets() {
            return this.markets;
        }

        public final String getOdds() {
            return this.odds;
        }

        public final String getSportId() {
            return this.sportId;
        }

        public final String getTournamentId() {
            return this.tournamentId;
        }

        public final String getUniqueId() {
            String str = this.eventId;
            Market primaryMarket = getPrimaryMarket();
            String marketId = primaryMarket != null ? primaryMarket.getMarketId() : null;
            Market primaryMarket2 = getPrimaryMarket();
            return str + "-" + marketId + "-" + (primaryMarket2 != null ? primaryMarket2.getOutcomeId() : null);
        }

        public int hashCode() {
            return Boolean.hashCode(this.isRelatedBet) + gmf0.a(ai50.a(gmf0.a(gmf0.a(this.sportId.hashCode() * 31, 31, this.tournamentId), 31, this.eventId), 31, this.markets), 31, this.odds);
        }

        public final boolean isRelatedBet() {
            return this.isRelatedBet;
        }

        public String toString() {
            String str = this.sportId;
            String str2 = this.tournamentId;
            String str3 = this.eventId;
            List<Market> list = this.markets;
            String str4 = this.odds;
            boolean z = this.isRelatedBet;
            StringBuilder sbA = ux5.a("BetBuilderSelection(sportId=", str, ", tournamentId=", str2, ", eventId=");
            kya0.b(str3, ", markets=", ", odds=", sbA, list);
            return x9d.a(str4, ", isRelatedBet=", ")", sbA, z);
        }

        public /* synthetic */ BetBuilderSelection(String str, String str2, String str3, List list, String str4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, list, str4, (i & 32) != 0 ? false : z);
        }
    }
}
