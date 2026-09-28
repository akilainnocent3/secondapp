package com.sportybet.plugin.realsports.data;

import defpackage.ai50;
import defpackage.bt6;
import defpackage.gmf0;
import defpackage.hxa;
import defpackage.kya0;
import defpackage.m2g;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003J]\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0014\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010$\u001a\u00020%HÖ\u0081\u0004J\n\u0010&\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018Ê\u0001\f\b(\u0012\b\b)\u0012\u0004\b\u0003\u0010\u0000¨\u0006'"}, d2 = {"Lcom/sportybet/plugin/realsports/data/FeaturedResponse;", "", "sportId", "", "sportName", "tournamentId", "tournamentName", "tournamentIcon", "eventVOS", "", "Lcom/sportybet/plugin/realsports/data/Event;", "pcbbReplacementMarket", "Lcom/sportybet/plugin/realsports/data/Market;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/sportybet/plugin/realsports/data/Market;)V", "getSportId", "()Ljava/lang/String;", "getSportName", "getTournamentId", "getTournamentName", "getTournamentIcon", "getEventVOS", "()Ljava/util/List;", "getPcbbReplacementMarket", "()Lcom/sportybet/plugin/realsports/data/Market;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class FeaturedResponse {
    public static final int $stable = 8;
    private final List<Event> eventVOS;
    private final Market pcbbReplacementMarket;
    private final String sportId;
    private final String sportName;
    private final String tournamentIcon;
    private final String tournamentId;
    private final String tournamentName;

    /* JADX WARN: Multi-variable type inference failed */
    public FeaturedResponse(String str, String str2, String str3, String str4, String str5, List<? extends Event> list, Market market) {
        bt6.a(str, str2, list);
        this.sportId = str;
        this.sportName = str2;
        this.tournamentId = str3;
        this.tournamentName = str4;
        this.tournamentIcon = str5;
        this.eventVOS = list;
        this.pcbbReplacementMarket = market;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FeaturedResponse copy$default(FeaturedResponse featuredResponse, String str, String str2, String str3, String str4, String str5, List list, Market market, int i, Object obj) {
        if ((i & 1) != 0) {
            str = featuredResponse.sportId;
        }
        if ((i & 2) != 0) {
            str2 = featuredResponse.sportName;
        }
        if ((i & 4) != 0) {
            str3 = featuredResponse.tournamentId;
        }
        if ((i & 8) != 0) {
            str4 = featuredResponse.tournamentName;
        }
        if ((i & 16) != 0) {
            str5 = featuredResponse.tournamentIcon;
        }
        if ((i & 32) != 0) {
            list = featuredResponse.eventVOS;
        }
        if ((i & 64) != 0) {
            market = featuredResponse.pcbbReplacementMarket;
        }
        List list2 = list;
        Market market2 = market;
        String str6 = str5;
        String str7 = str3;
        return featuredResponse.copy(str, str2, str7, str4, str6, list2, market2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSportId() {
        return this.sportId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSportName() {
        return this.sportName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTournamentId() {
        return this.tournamentId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTournamentName() {
        return this.tournamentName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTournamentIcon() {
        return this.tournamentIcon;
    }

    public final List<Event> component6() {
        return this.eventVOS;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Market getPcbbReplacementMarket() {
        return this.pcbbReplacementMarket;
    }

    public final FeaturedResponse copy(String sportId, String sportName, String tournamentId, String tournamentName, String tournamentIcon, List<? extends Event> eventVOS, Market pcbbReplacementMarket) {
        sportId.getClass();
        sportName.getClass();
        eventVOS.getClass();
        return new FeaturedResponse(sportId, sportName, tournamentId, tournamentName, tournamentIcon, eventVOS, pcbbReplacementMarket);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeaturedResponse)) {
            return false;
        }
        FeaturedResponse featuredResponse = (FeaturedResponse) other;
        return Intrinsics.g(this.sportId, featuredResponse.sportId) && Intrinsics.g(this.sportName, featuredResponse.sportName) && Intrinsics.g(this.tournamentId, featuredResponse.tournamentId) && Intrinsics.g(this.tournamentName, featuredResponse.tournamentName) && Intrinsics.g(this.tournamentIcon, featuredResponse.tournamentIcon) && Intrinsics.g(this.eventVOS, featuredResponse.eventVOS) && Intrinsics.g(this.pcbbReplacementMarket, featuredResponse.pcbbReplacementMarket);
    }

    public final List<Event> getEventVOS() {
        return this.eventVOS;
    }

    public final Market getPcbbReplacementMarket() {
        return this.pcbbReplacementMarket;
    }

    public final String getSportId() {
        return this.sportId;
    }

    public final String getSportName() {
        return this.sportName;
    }

    public final String getTournamentIcon() {
        return this.tournamentIcon;
    }

    public final String getTournamentId() {
        return this.tournamentId;
    }

    public final String getTournamentName() {
        return this.tournamentName;
    }

    public int hashCode() {
        int iA = gmf0.a(this.sportId.hashCode() * 31, 31, this.sportName);
        String str = this.tournamentId;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.tournamentName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tournamentIcon;
        int iA2 = ai50.a((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.eventVOS);
        Market market = this.pcbbReplacementMarket;
        return iA2 + (market != null ? market.hashCode() : 0);
    }

    public String toString() {
        String str = this.sportId;
        String str2 = this.sportName;
        String str3 = this.tournamentId;
        String str4 = this.tournamentName;
        String str5 = this.tournamentIcon;
        List<Event> list = this.eventVOS;
        Market market = this.pcbbReplacementMarket;
        StringBuilder sbA = ux5.a("FeaturedResponse(sportId=", str, ", sportName=", str2, ", tournamentId=");
        hxa.c(sbA, str3, ", tournamentName=", str4, ", tournamentIcon=");
        kya0.b(str5, ", eventVOS=", ", pcbbReplacementMarket=", sbA, list);
        sbA.append(market);
        sbA.append(")");
        return sbA.toString();
    }

    public FeaturedResponse(String str, String str2, String str3, String str4, String str5, List list, Market market, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, (i & 32) != 0 ? m2g.a : list, market);
    }
}
