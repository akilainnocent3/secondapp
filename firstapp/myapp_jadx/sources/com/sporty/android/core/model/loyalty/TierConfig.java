package com.sporty.android.core.model.loyalty;

import com.appsflyer.internal.b0;
import defpackage.ai50;
import defpackage.ew7;
import defpackage.f87;
import defpackage.g41;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.tvh;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b(\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\nHÆ\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\t\u00101\u001a\u00020\u000fHÆ\u0003J\t\u00102\u001a\u00020\u000fHÆ\u0003J\t\u00103\u001a\u00020\u000fHÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010(J\u0088\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0002\u00106J\u0014\u00107\u001a\u00020\u00132\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00109\u001a\u00020\nHÖ\u0081\u0004J\n\u0010:\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0010\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0011\u0010\u0011\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010$R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\n\n\u0002\u0010)\u001a\u0004\b'\u0010(Ê\u0001\u0002\b<¨\u0006;"}, d2 = {"Lcom/sporty/android/core/model/loyalty/TierConfig;", "", "ccf", "", "currency", "", "minLifeTimeWager", "minMonthWager", "rtp", "tier", "", "tierRewardList", "", "Lcom/sporty/android/core/model/loyalty/TierReward;", "game", "", "instantWin", "realSport", "quickUpgradeEnabled", "", "<init>", "(JLjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;JILjava/util/List;FFFLjava/lang/Boolean;)V", "getCcf", "()J", "getCurrency", "()Ljava/lang/String;", "getMinLifeTimeWager", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getMinMonthWager", "getRtp", "getTier", "()I", "getTierRewardList", "()Ljava/util/List;", "getGame", "()F", "getInstantWin", "getRealSport", "getQuickUpgradeEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(JLjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;JILjava/util/List;FFFLjava/lang/Boolean;)Lcom/sporty/android/core/model/loyalty/TierConfig;", "equals", "other", "hashCode", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class TierConfig {
    private final long ccf;
    private final String currency;
    private final float game;
    private final float instantWin;
    private final Long minLifeTimeWager;
    private final Long minMonthWager;
    private final Boolean quickUpgradeEnabled;
    private final float realSport;
    private final long rtp;
    private final int tier;
    private final List<TierReward> tierRewardList;

    public TierConfig(long j, String str, Long l, Long l2, long j2, int i, List<TierReward> list, float f, float f2, float f3, Boolean bool) {
        str.getClass();
        list.getClass();
        this.ccf = j;
        this.currency = str;
        this.minLifeTimeWager = l;
        this.minMonthWager = l2;
        this.rtp = j2;
        this.tier = i;
        this.tierRewardList = list;
        this.game = f;
        this.instantWin = f2;
        this.realSport = f3;
        this.quickUpgradeEnabled = bool;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getCcf() {
        return this.ccf;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final float getRealSport() {
        return this.realSport;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Boolean getQuickUpgradeEnabled() {
        return this.quickUpgradeEnabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getMinLifeTimeWager() {
        return this.minLifeTimeWager;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getMinMonthWager() {
        return this.minMonthWager;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getRtp() {
        return this.rtp;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getTier() {
        return this.tier;
    }

    public final List<TierReward> component7() {
        return this.tierRewardList;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final float getGame() {
        return this.game;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final float getInstantWin() {
        return this.instantWin;
    }

    public final TierConfig copy(long ccf, String currency, Long minLifeTimeWager, Long minMonthWager, long rtp, int tier, List<TierReward> tierRewardList, float game, float instantWin, float realSport, Boolean quickUpgradeEnabled) {
        currency.getClass();
        tierRewardList.getClass();
        return new TierConfig(ccf, currency, minLifeTimeWager, minMonthWager, rtp, tier, tierRewardList, game, instantWin, realSport, quickUpgradeEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TierConfig)) {
            return false;
        }
        TierConfig tierConfig = (TierConfig) other;
        return this.ccf == tierConfig.ccf && Intrinsics.g(this.currency, tierConfig.currency) && Intrinsics.g(this.minLifeTimeWager, tierConfig.minLifeTimeWager) && Intrinsics.g(this.minMonthWager, tierConfig.minMonthWager) && this.rtp == tierConfig.rtp && this.tier == tierConfig.tier && Intrinsics.g(this.tierRewardList, tierConfig.tierRewardList) && Float.compare(this.game, tierConfig.game) == 0 && Float.compare(this.instantWin, tierConfig.instantWin) == 0 && Float.compare(this.realSport, tierConfig.realSport) == 0 && Intrinsics.g(this.quickUpgradeEnabled, tierConfig.quickUpgradeEnabled);
    }

    public final long getCcf() {
        return this.ccf;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final float getGame() {
        return this.game;
    }

    public final float getInstantWin() {
        return this.instantWin;
    }

    public final Long getMinLifeTimeWager() {
        return this.minLifeTimeWager;
    }

    public final Long getMinMonthWager() {
        return this.minMonthWager;
    }

    public final Boolean getQuickUpgradeEnabled() {
        return this.quickUpgradeEnabled;
    }

    public final float getRealSport() {
        return this.realSport;
    }

    public final long getRtp() {
        return this.rtp;
    }

    public final int getTier() {
        return this.tier;
    }

    public final List<TierReward> getTierRewardList() {
        return this.tierRewardList;
    }

    public int hashCode() {
        int iA = gmf0.a(Long.hashCode(this.ccf) * 31, 31, this.currency);
        Long l = this.minLifeTimeWager;
        int iHashCode = (iA + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.minMonthWager;
        int iA2 = tvh.a(this.realSport, tvh.a(this.instantWin, tvh.a(this.game, ai50.a(gpp.a(this.tier, f87.a((iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31, this.rtp, 31), 31), 31, this.tierRewardList), 31), 31), 31);
        Boolean bool = this.quickUpgradeEnabled;
        return iA2 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        long j = this.ccf;
        String str = this.currency;
        Long l = this.minLifeTimeWager;
        Long l2 = this.minMonthWager;
        long j2 = this.rtp;
        int i = this.tier;
        List<TierReward> list = this.tierRewardList;
        float f = this.game;
        float f2 = this.instantWin;
        float f3 = this.realSport;
        Boolean bool = this.quickUpgradeEnabled;
        StringBuilder sbA = b0.a(j, "TierConfig(ccf=", ", currency=", str);
        sbA.append(", minLifeTimeWager=");
        sbA.append(l);
        sbA.append(", minMonthWager=");
        sbA.append(l2);
        g41.a(j2, ", rtp=", ", tier=", sbA);
        sbA.append(i);
        sbA.append(", tierRewardList=");
        sbA.append(list);
        sbA.append(", game=");
        ew7.b(sbA, f, ", instantWin=", f2, ", realSport=");
        sbA.append(f3);
        sbA.append(", quickUpgradeEnabled=");
        sbA.append(bool);
        sbA.append(")");
        return sbA.toString();
    }
}
