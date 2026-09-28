package com.sportybet.android.data;

import com.sporty.android.book.domain.entity.BetTypeAnyWinConfig;
import com.sporty.android.book.domain.entity.BetTypeFlexiBetConfig;
import com.sportybet.plugin.realsports.betslip.Selection;
import defpackage.gpp;
import defpackage.mtg0;
import defpackage.uf80;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010\u0019\u001a\u00020\u000fHÆ\u0003J[\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0014\u0010\u001b\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u000fHÖ\u0081\u0004R\u0017\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u0092\u0002\u0002\b\u0012¢\u0006\u0002\n\u0000R\u0017\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u0092\u0002\u0002\b\u0012¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u0092\u0002\u0002\b\u0012¢\u0006\u0002\n\u0000R\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u0092\u0002\u0002\b\u0012¢\u0006\u0002\n\u0000R\u0019\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u0092\u0002\u0002\b\u0012¢\u0006\u0002\n\u0000R\u0019\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e\u0092\u0002\u0002\b\u0012¢\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e\u0092\u0002\u0002\b\u0012¢\u0006\u0002\n\u0000Ê\u0001\f\b \u0012\b\b!\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u001f"}, d2 = {"Lcom/sportybet/android/data/GetInsureBetOddsData;", "", "flexibleCount", "", "isSimMode", "", "betType", "selections", "", "Lcom/sportybet/plugin/realsports/betslip/Selection;", "flexiBetConfig", "Lcom/sporty/android/book/domain/entity/BetTypeFlexiBetConfig;", "anyWinBetConfig", "Lcom/sporty/android/book/domain/entity/BetTypeAnyWinConfig;", "currentAppVersion", "", "<init>", "(IZILjava/util/List;Lcom/sporty/android/book/domain/entity/BetTypeFlexiBetConfig;Lcom/sporty/android/book/domain/entity/BetTypeAnyWinConfig;Ljava/lang/String;)V", "Lkotlin/jvm/JvmField;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class GetInsureBetOddsData {
    public static final int $stable = 8;
    public BetTypeAnyWinConfig anyWinBetConfig;
    public int betType;
    public String currentAppVersion;
    public BetTypeFlexiBetConfig flexiBetConfig;
    public int flexibleCount;
    public boolean isSimMode;
    public List<? extends Selection> selections;

    public /* synthetic */ GetInsureBetOddsData(int i, boolean z, int i2, List list, BetTypeFlexiBetConfig betTypeFlexiBetConfig, BetTypeAnyWinConfig betTypeAnyWinConfig, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? false : z, (i3 & 4) != 0 ? 4 : i2, (i3 & 8) != 0 ? null : list, (i3 & 16) != 0 ? null : betTypeFlexiBetConfig, (i3 & 32) != 0 ? null : betTypeAnyWinConfig, (i3 & 64) != 0 ? "1.82.2" : str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetInsureBetOddsData copy$default(GetInsureBetOddsData getInsureBetOddsData, int i, boolean z, int i2, List list, BetTypeFlexiBetConfig betTypeFlexiBetConfig, BetTypeAnyWinConfig betTypeAnyWinConfig, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = getInsureBetOddsData.flexibleCount;
        }
        if ((i3 & 2) != 0) {
            z = getInsureBetOddsData.isSimMode;
        }
        if ((i3 & 4) != 0) {
            i2 = getInsureBetOddsData.betType;
        }
        if ((i3 & 8) != 0) {
            list = getInsureBetOddsData.selections;
        }
        if ((i3 & 16) != 0) {
            betTypeFlexiBetConfig = getInsureBetOddsData.flexiBetConfig;
        }
        if ((i3 & 32) != 0) {
            betTypeAnyWinConfig = getInsureBetOddsData.anyWinBetConfig;
        }
        if ((i3 & 64) != 0) {
            str = getInsureBetOddsData.currentAppVersion;
        }
        BetTypeAnyWinConfig betTypeAnyWinConfig2 = betTypeAnyWinConfig;
        String str2 = str;
        BetTypeFlexiBetConfig betTypeFlexiBetConfig2 = betTypeFlexiBetConfig;
        int i4 = i2;
        return getInsureBetOddsData.copy(i, z, i4, list, betTypeFlexiBetConfig2, betTypeAnyWinConfig2, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getFlexibleCount() {
        return this.flexibleCount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsSimMode() {
        return this.isSimMode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getBetType() {
        return this.betType;
    }

    public final List<Selection> component4() {
        return this.selections;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BetTypeFlexiBetConfig getFlexiBetConfig() {
        return this.flexiBetConfig;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BetTypeAnyWinConfig getAnyWinBetConfig() {
        return this.anyWinBetConfig;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCurrentAppVersion() {
        return this.currentAppVersion;
    }

    public final GetInsureBetOddsData copy(int flexibleCount, boolean isSimMode, int betType, List<? extends Selection> selections, BetTypeFlexiBetConfig flexiBetConfig, BetTypeAnyWinConfig anyWinBetConfig, String currentAppVersion) {
        currentAppVersion.getClass();
        return new GetInsureBetOddsData(flexibleCount, isSimMode, betType, selections, flexiBetConfig, anyWinBetConfig, currentAppVersion);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetInsureBetOddsData)) {
            return false;
        }
        GetInsureBetOddsData getInsureBetOddsData = (GetInsureBetOddsData) other;
        return this.flexibleCount == getInsureBetOddsData.flexibleCount && this.isSimMode == getInsureBetOddsData.isSimMode && this.betType == getInsureBetOddsData.betType && Intrinsics.g(this.selections, getInsureBetOddsData.selections) && Intrinsics.g(this.flexiBetConfig, getInsureBetOddsData.flexiBetConfig) && Intrinsics.g(this.anyWinBetConfig, getInsureBetOddsData.anyWinBetConfig) && Intrinsics.g(this.currentAppVersion, getInsureBetOddsData.currentAppVersion);
    }

    public int hashCode() {
        int iA = gpp.a(this.betType, mtg0.a(Integer.hashCode(this.flexibleCount) * 31, 31, this.isSimMode), 31);
        List<? extends Selection> list = this.selections;
        int iHashCode = (iA + (list == null ? 0 : list.hashCode())) * 31;
        BetTypeFlexiBetConfig betTypeFlexiBetConfig = this.flexiBetConfig;
        int iHashCode2 = (iHashCode + (betTypeFlexiBetConfig == null ? 0 : betTypeFlexiBetConfig.hashCode())) * 31;
        BetTypeAnyWinConfig betTypeAnyWinConfig = this.anyWinBetConfig;
        return this.currentAppVersion.hashCode() + ((iHashCode2 + (betTypeAnyWinConfig != null ? betTypeAnyWinConfig.hashCode() : 0)) * 31);
    }

    public String toString() {
        int i = this.flexibleCount;
        boolean z = this.isSimMode;
        int i2 = this.betType;
        List<? extends Selection> list = this.selections;
        BetTypeFlexiBetConfig betTypeFlexiBetConfig = this.flexiBetConfig;
        BetTypeAnyWinConfig betTypeAnyWinConfig = this.anyWinBetConfig;
        String str = this.currentAppVersion;
        StringBuilder sb = new StringBuilder("GetInsureBetOddsData(flexibleCount=");
        sb.append(i);
        sb.append(", isSimMode=");
        sb.append(z);
        sb.append(", betType=");
        sb.append(i2);
        sb.append(", selections=");
        sb.append(list);
        sb.append(", flexiBetConfig=");
        sb.append(betTypeFlexiBetConfig);
        sb.append(", anyWinBetConfig=");
        sb.append(betTypeAnyWinConfig);
        sb.append(", currentAppVersion=");
        return uf80.a(sb, str, ")");
    }

    public GetInsureBetOddsData(int i, boolean z, int i2, List<? extends Selection> list, BetTypeFlexiBetConfig betTypeFlexiBetConfig, BetTypeAnyWinConfig betTypeAnyWinConfig, String str) {
        str.getClass();
        this.flexibleCount = i;
        this.isSimMode = z;
        this.betType = i2;
        this.selections = list;
        this.flexiBetConfig = betTypeFlexiBetConfig;
        this.anyWinBetConfig = betTypeAnyWinConfig;
        this.currentAppVersion = str;
    }

    public GetInsureBetOddsData() {
        this(0, false, 0, null, null, null, null, 127, null);
    }
}
