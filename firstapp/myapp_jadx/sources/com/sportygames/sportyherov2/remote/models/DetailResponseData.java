package com.sportygames.sportyherov2.remote.models;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0002\u0010\u0015R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0004\u0010\u0015R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0005\u0010\u0015R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0006\u0010\u0015R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0007\u0010\u0015R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\b\u0010\u0015R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u0010\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0011\u0010\u0015R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0015¨\u0006#"}, d2 = {"Lcom/sportygames/sportyherov2/remote/models/DetailResponseData;", "", "isSideBetsEnabled", "", "isOverUnderEnabled", "isRangeEnabled", "isManualSeedAllowed", "isChristmasTheme", "isValentineTheme", "gameDetails", "", "Lcom/sportygames/sportyherov2/remote/models/DetailResponse;", "sideBetConfigs", "Lcom/sportygames/sportyherov2/remote/models/SideBetConfigsList;", "ouMinFBGUsageThreshold", "", "rangeMinFBGUsageThreshold", "isFuguIntegrationEnabled", "isWorldCupThemeEnabled", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;DDLjava/lang/Boolean;Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getGameDetails", "()Ljava/util/List;", "setGameDetails", "(Ljava/util/List;)V", "getSideBetConfigs", "setSideBetConfigs", "getOuMinFBGUsageThreshold", "()D", "setOuMinFBGUsageThreshold", "(D)V", "getRangeMinFBGUsageThreshold", "setRangeMinFBGUsageThreshold", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DetailResponseData {
    public static final int $stable = 8;
    private List<DetailResponse> gameDetails;
    private final Boolean isChristmasTheme;
    private final Boolean isFuguIntegrationEnabled;
    private final Boolean isManualSeedAllowed;
    private final Boolean isOverUnderEnabled;
    private final Boolean isRangeEnabled;
    private final Boolean isSideBetsEnabled;
    private final Boolean isValentineTheme;
    private final Boolean isWorldCupThemeEnabled;
    private double ouMinFBGUsageThreshold;
    private double rangeMinFBGUsageThreshold;
    private List<SideBetConfigsList> sideBetConfigs;

    public /* synthetic */ DetailResponseData(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, List list, List list2, double d, double d2, Boolean bool7, Boolean bool8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? Boolean.FALSE : bool2, (i & 4) != 0 ? Boolean.FALSE : bool3, (i & 8) != 0 ? Boolean.FALSE : bool4, (i & 16) != 0 ? Boolean.FALSE : bool5, (i & 32) != 0 ? Boolean.FALSE : bool6, list, list2, (i & 256) != 0 ? 0.0d : d, (i & 512) != 0 ? 0.0d : d2, (i & 1024) != 0 ? Boolean.FALSE : bool7, (i & 2048) != 0 ? Boolean.FALSE : bool8);
    }

    public final List<DetailResponse> getGameDetails() {
        return this.gameDetails;
    }

    public final double getOuMinFBGUsageThreshold() {
        return this.ouMinFBGUsageThreshold;
    }

    public final double getRangeMinFBGUsageThreshold() {
        return this.rangeMinFBGUsageThreshold;
    }

    public final List<SideBetConfigsList> getSideBetConfigs() {
        return this.sideBetConfigs;
    }

    /* JADX INFO: renamed from: isChristmasTheme, reason: from getter */
    public final Boolean getIsChristmasTheme() {
        return this.isChristmasTheme;
    }

    /* JADX INFO: renamed from: isFuguIntegrationEnabled, reason: from getter */
    public final Boolean getIsFuguIntegrationEnabled() {
        return this.isFuguIntegrationEnabled;
    }

    /* JADX INFO: renamed from: isManualSeedAllowed, reason: from getter */
    public final Boolean getIsManualSeedAllowed() {
        return this.isManualSeedAllowed;
    }

    /* JADX INFO: renamed from: isOverUnderEnabled, reason: from getter */
    public final Boolean getIsOverUnderEnabled() {
        return this.isOverUnderEnabled;
    }

    /* JADX INFO: renamed from: isRangeEnabled, reason: from getter */
    public final Boolean getIsRangeEnabled() {
        return this.isRangeEnabled;
    }

    /* JADX INFO: renamed from: isSideBetsEnabled, reason: from getter */
    public final Boolean getIsSideBetsEnabled() {
        return this.isSideBetsEnabled;
    }

    /* JADX INFO: renamed from: isValentineTheme, reason: from getter */
    public final Boolean getIsValentineTheme() {
        return this.isValentineTheme;
    }

    /* JADX INFO: renamed from: isWorldCupThemeEnabled, reason: from getter */
    public final Boolean getIsWorldCupThemeEnabled() {
        return this.isWorldCupThemeEnabled;
    }

    public final void setGameDetails(List<DetailResponse> list) {
        list.getClass();
        this.gameDetails = list;
    }

    public final void setOuMinFBGUsageThreshold(double d) {
        this.ouMinFBGUsageThreshold = d;
    }

    public final void setRangeMinFBGUsageThreshold(double d) {
        this.rangeMinFBGUsageThreshold = d;
    }

    public final void setSideBetConfigs(List<SideBetConfigsList> list) {
        list.getClass();
        this.sideBetConfigs = list;
    }

    public DetailResponseData(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, List<DetailResponse> list, List<SideBetConfigsList> list2, double d, double d2, Boolean bool7, Boolean bool8) {
        list.getClass();
        list2.getClass();
        this.isSideBetsEnabled = bool;
        this.isOverUnderEnabled = bool2;
        this.isRangeEnabled = bool3;
        this.isManualSeedAllowed = bool4;
        this.isChristmasTheme = bool5;
        this.isValentineTheme = bool6;
        this.gameDetails = list;
        this.sideBetConfigs = list2;
        this.ouMinFBGUsageThreshold = d;
        this.rangeMinFBGUsageThreshold = d2;
        this.isFuguIntegrationEnabled = bool7;
        this.isWorldCupThemeEnabled = bool8;
    }
}
