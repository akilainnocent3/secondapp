package com.sportybet.plugin.realsports.searchv2.domain.model;

import defpackage.dy5;
import defpackage.gpp;
import defpackage.mq0;
import defpackage.mtg0;
import defpackage.nng;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003Jc\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u0007HÆ\u0001J\u0014\u0010$\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010&\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010'\u001a\u00020(HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014Ê\u0001\u0002\b*Ê\u0001\f\b+\u0012\b\b,\u0012\u0004\b\u0003\u0010\u0002¨\u0006)"}, d2 = {"Lcom/sportybet/plugin/realsports/searchv2/domain/model/SearchFeatureConfig;", "", "minQueryLength", "", "maxQueryLength", "debounceTime", "showTooltip", "", "matchesSectionEnabled", "teamsSectionEnabled", "leaguesSectionEnabled", "playersSectionEnabled", "gamesSectionEnabled", "<init>", "(IIIZZZZZZ)V", "getMinQueryLength", "()I", "getMaxQueryLength", "getDebounceTime", "getShowTooltip", "()Z", "getMatchesSectionEnabled", "getTeamsSectionEnabled", "getLeaguesSectionEnabled", "getPlayersSectionEnabled", "getGamesSectionEnabled", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SearchFeatureConfig {
    public static final int $stable = 0;
    private final int debounceTime;
    private final boolean gamesSectionEnabled;
    private final boolean leaguesSectionEnabled;
    private final boolean matchesSectionEnabled;
    private final int maxQueryLength;
    private final int minQueryLength;
    private final boolean playersSectionEnabled;
    private final boolean showTooltip;
    private final boolean teamsSectionEnabled;

    public /* synthetic */ SearchFeatureConfig(int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 3 : i, (i4 & 2) != 0 ? 100 : i2, (i4 & 4) != 0 ? 300 : i3, (i4 & 8) != 0 ? true : z, (i4 & 16) != 0 ? true : z2, (i4 & 32) != 0 ? true : z3, (i4 & 64) != 0 ? true : z4, (i4 & 128) != 0 ? true : z5, (i4 & 256) != 0 ? true : z6);
    }

    public static /* synthetic */ SearchFeatureConfig copy$default(SearchFeatureConfig searchFeatureConfig, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = searchFeatureConfig.minQueryLength;
        }
        if ((i4 & 2) != 0) {
            i2 = searchFeatureConfig.maxQueryLength;
        }
        if ((i4 & 4) != 0) {
            i3 = searchFeatureConfig.debounceTime;
        }
        if ((i4 & 8) != 0) {
            z = searchFeatureConfig.showTooltip;
        }
        if ((i4 & 16) != 0) {
            z2 = searchFeatureConfig.matchesSectionEnabled;
        }
        if ((i4 & 32) != 0) {
            z3 = searchFeatureConfig.teamsSectionEnabled;
        }
        if ((i4 & 64) != 0) {
            z4 = searchFeatureConfig.leaguesSectionEnabled;
        }
        if ((i4 & 128) != 0) {
            z5 = searchFeatureConfig.playersSectionEnabled;
        }
        if ((i4 & 256) != 0) {
            z6 = searchFeatureConfig.gamesSectionEnabled;
        }
        boolean z7 = z5;
        boolean z8 = z6;
        boolean z9 = z3;
        boolean z10 = z4;
        boolean z11 = z2;
        int i5 = i3;
        return searchFeatureConfig.copy(i, i2, i5, z, z11, z9, z10, z7, z8);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMinQueryLength() {
        return this.minQueryLength;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMaxQueryLength() {
        return this.maxQueryLength;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDebounceTime() {
        return this.debounceTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getShowTooltip() {
        return this.showTooltip;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getMatchesSectionEnabled() {
        return this.matchesSectionEnabled;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getTeamsSectionEnabled() {
        return this.teamsSectionEnabled;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getLeaguesSectionEnabled() {
        return this.leaguesSectionEnabled;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getPlayersSectionEnabled() {
        return this.playersSectionEnabled;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getGamesSectionEnabled() {
        return this.gamesSectionEnabled;
    }

    public final SearchFeatureConfig copy(int minQueryLength, int maxQueryLength, int debounceTime, boolean showTooltip, boolean matchesSectionEnabled, boolean teamsSectionEnabled, boolean leaguesSectionEnabled, boolean playersSectionEnabled, boolean gamesSectionEnabled) {
        return new SearchFeatureConfig(minQueryLength, maxQueryLength, debounceTime, showTooltip, matchesSectionEnabled, teamsSectionEnabled, leaguesSectionEnabled, playersSectionEnabled, gamesSectionEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchFeatureConfig)) {
            return false;
        }
        SearchFeatureConfig searchFeatureConfig = (SearchFeatureConfig) other;
        return this.minQueryLength == searchFeatureConfig.minQueryLength && this.maxQueryLength == searchFeatureConfig.maxQueryLength && this.debounceTime == searchFeatureConfig.debounceTime && this.showTooltip == searchFeatureConfig.showTooltip && this.matchesSectionEnabled == searchFeatureConfig.matchesSectionEnabled && this.teamsSectionEnabled == searchFeatureConfig.teamsSectionEnabled && this.leaguesSectionEnabled == searchFeatureConfig.leaguesSectionEnabled && this.playersSectionEnabled == searchFeatureConfig.playersSectionEnabled && this.gamesSectionEnabled == searchFeatureConfig.gamesSectionEnabled;
    }

    public final int getDebounceTime() {
        return this.debounceTime;
    }

    public final boolean getGamesSectionEnabled() {
        return this.gamesSectionEnabled;
    }

    public final boolean getLeaguesSectionEnabled() {
        return this.leaguesSectionEnabled;
    }

    public final boolean getMatchesSectionEnabled() {
        return this.matchesSectionEnabled;
    }

    public final int getMaxQueryLength() {
        return this.maxQueryLength;
    }

    public final int getMinQueryLength() {
        return this.minQueryLength;
    }

    public final boolean getPlayersSectionEnabled() {
        return this.playersSectionEnabled;
    }

    public final boolean getShowTooltip() {
        return this.showTooltip;
    }

    public final boolean getTeamsSectionEnabled() {
        return this.teamsSectionEnabled;
    }

    public int hashCode() {
        return Boolean.hashCode(this.gamesSectionEnabled) + mtg0.a(mtg0.a(mtg0.a(mtg0.a(mtg0.a(gpp.a(this.debounceTime, gpp.a(this.maxQueryLength, Integer.hashCode(this.minQueryLength) * 31, 31), 31), 31, this.showTooltip), 31, this.matchesSectionEnabled), 31, this.teamsSectionEnabled), 31, this.leaguesSectionEnabled), 31, this.playersSectionEnabled);
    }

    public String toString() {
        int i = this.minQueryLength;
        int i2 = this.maxQueryLength;
        int i3 = this.debounceTime;
        boolean z = this.showTooltip;
        boolean z2 = this.matchesSectionEnabled;
        boolean z3 = this.teamsSectionEnabled;
        boolean z4 = this.leaguesSectionEnabled;
        boolean z5 = this.playersSectionEnabled;
        boolean z6 = this.gamesSectionEnabled;
        StringBuilder sbA = dy5.a("SearchFeatureConfig(minQueryLength=", i, i2, ", maxQueryLength=", ", debounceTime=");
        sbA.append(i3);
        sbA.append(", showTooltip=");
        sbA.append(z);
        sbA.append(", matchesSectionEnabled=");
        nng.a(", teamsSectionEnabled=", ", leaguesSectionEnabled=", sbA, z2, z3);
        nng.a(", playersSectionEnabled=", ", gamesSectionEnabled=", sbA, z4, z5);
        return mq0.a(sbA, z6, ")");
    }

    public SearchFeatureConfig(int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.minQueryLength = i;
        this.maxQueryLength = i2;
        this.debounceTime = i3;
        this.showTooltip = z;
        this.matchesSectionEnabled = z2;
        this.teamsSectionEnabled = z3;
        this.leaguesSectionEnabled = z4;
        this.playersSectionEnabled = z5;
        this.gamesSectionEnabled = z6;
    }

    public SearchFeatureConfig() {
        this(0, 0, 0, false, false, false, false, false, false, 511, null);
    }
}
