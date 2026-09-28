package com.sportybet.android.instantwin.newtork.model.response.simulation;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.sportysim.NetworkSpeedControllerConfig;
import com.sporty.android.core.model.sportysim.SIMMultiBetBonusData;
import com.sporty.android.core.model.sportysim.SimSportSupData;
import defpackage.hxa;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010%J\u0011\u00107\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u0098\u0001\u0010<\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÆ\u0001¢\u0006\u0002\u0010=J\u0014\u0010>\u001a\u00020\u00032\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010@\u001a\u00020\u000bHÖ\u0081\u0004J\n\u0010A\u001a\u00020\u0005HÖ\u0081\u0004R)\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0002\u0010\u0019R'\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR'\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR'\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR'\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u0092\u0002\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R)\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u0092\u0002\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\n¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R-\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006X\u0087\u0004\u0092\u0002\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R'\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004\u0092\u0002\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u000f¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R'\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004\u0092\u0002\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0011¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R'\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004\u0092\u0002\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0013¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R'\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004\u0092\u0002\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0015¢\u0006\b\n\u0000\u001a\u0004\b/\u00100Ê\u0001\f\bC\u0012\b\bD\u0012\u0004\b\u0003\u0010\u0000¨\u0006B"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/simulation/NetworkSimulationConfigData;", "", "isSimulatedActive", "", "minStake", "", "maxStake", "maxPayout", "multiBetBonus", "Lcom/sporty/android/core/model/sportysim/SIMMultiBetBonusData;", "maxSelection", "", "sports", "", "Lcom/sporty/android/core/model/sportysim/SimSportSupData;", "autoBet", "Lcom/sportybet/android/instantwin/newtork/model/response/simulation/NetworkSimulationAutoBetConfig;", "speedControllerConfig", "Lcom/sporty/android/core/model/sportysim/NetworkSpeedControllerConfig;", "gift", "Lcom/sportybet/android/instantwin/newtork/model/response/simulation/GiftConfigVO;", "addToStake", "Lcom/sportybet/android/instantwin/newtork/model/response/simulation/AddToStakeConfigVO;", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sporty/android/core/model/sportysim/SIMMultiBetBonusData;Ljava/lang/Integer;Ljava/util/List;Lcom/sportybet/android/instantwin/newtork/model/response/simulation/NetworkSimulationAutoBetConfig;Lcom/sporty/android/core/model/sportysim/NetworkSpeedControllerConfig;Lcom/sportybet/android/instantwin/newtork/model/response/simulation/GiftConfigVO;Lcom/sportybet/android/instantwin/newtork/model/response/simulation/AddToStakeConfigVO;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "Lcom/google/gson/annotations/SerializedName;", "value", "active", "getMinStake", "()Ljava/lang/String;", "getMaxStake", "getMaxPayout", "getMultiBetBonus", "()Lcom/sporty/android/core/model/sportysim/SIMMultiBetBonusData;", "getMaxSelection", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSports", "()Ljava/util/List;", "getAutoBet", "()Lcom/sportybet/android/instantwin/newtork/model/response/simulation/NetworkSimulationAutoBetConfig;", "getSpeedControllerConfig", "()Lcom/sporty/android/core/model/sportysim/NetworkSpeedControllerConfig;", "getGift", "()Lcom/sportybet/android/instantwin/newtork/model/response/simulation/GiftConfigVO;", "getAddToStake", "()Lcom/sportybet/android/instantwin/newtork/model/response/simulation/AddToStakeConfigVO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sporty/android/core/model/sportysim/SIMMultiBetBonusData;Ljava/lang/Integer;Ljava/util/List;Lcom/sportybet/android/instantwin/newtork/model/response/simulation/NetworkSimulationAutoBetConfig;Lcom/sporty/android/core/model/sportysim/NetworkSpeedControllerConfig;Lcom/sportybet/android/instantwin/newtork/model/response/simulation/GiftConfigVO;Lcom/sportybet/android/instantwin/newtork/model/response/simulation/AddToStakeConfigVO;)Lcom/sportybet/android/instantwin/newtork/model/response/simulation/NetworkSimulationConfigData;", "equals", "other", "hashCode", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkSimulationConfigData {
    public static final int $stable = 8;

    @SerializedName("addToStake")
    private final AddToStakeConfigVO addToStake;

    @SerializedName("autoBet")
    private final NetworkSimulationAutoBetConfig autoBet;

    @SerializedName("gift")
    private final GiftConfigVO gift;

    @SerializedName("active")
    private final Boolean isSimulatedActive;

    @SerializedName("maxPayout")
    private final String maxPayout;

    @SerializedName("maxSelection")
    private final Integer maxSelection;

    @SerializedName("maxStake")
    private final String maxStake;

    @SerializedName("minStake")
    private final String minStake;

    @SerializedName("multiBetBonus")
    private final SIMMultiBetBonusData multiBetBonus;

    @SerializedName("speedControllerConfig")
    private final NetworkSpeedControllerConfig speedControllerConfig;

    @SerializedName("sports")
    private final List<SimSportSupData> sports;

    public NetworkSimulationConfigData(Boolean bool, String str, String str2, String str3, SIMMultiBetBonusData sIMMultiBetBonusData, Integer num, List<SimSportSupData> list, NetworkSimulationAutoBetConfig networkSimulationAutoBetConfig, NetworkSpeedControllerConfig networkSpeedControllerConfig, GiftConfigVO giftConfigVO, AddToStakeConfigVO addToStakeConfigVO) {
        this.isSimulatedActive = bool;
        this.minStake = str;
        this.maxStake = str2;
        this.maxPayout = str3;
        this.multiBetBonus = sIMMultiBetBonusData;
        this.maxSelection = num;
        this.sports = list;
        this.autoBet = networkSimulationAutoBetConfig;
        this.speedControllerConfig = networkSpeedControllerConfig;
        this.gift = giftConfigVO;
        this.addToStake = addToStakeConfigVO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkSimulationConfigData copy$default(NetworkSimulationConfigData networkSimulationConfigData, Boolean bool, String str, String str2, String str3, SIMMultiBetBonusData sIMMultiBetBonusData, Integer num, List list, NetworkSimulationAutoBetConfig networkSimulationAutoBetConfig, NetworkSpeedControllerConfig networkSpeedControllerConfig, GiftConfigVO giftConfigVO, AddToStakeConfigVO addToStakeConfigVO, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = networkSimulationConfigData.isSimulatedActive;
        }
        if ((i & 2) != 0) {
            str = networkSimulationConfigData.minStake;
        }
        if ((i & 4) != 0) {
            str2 = networkSimulationConfigData.maxStake;
        }
        if ((i & 8) != 0) {
            str3 = networkSimulationConfigData.maxPayout;
        }
        if ((i & 16) != 0) {
            sIMMultiBetBonusData = networkSimulationConfigData.multiBetBonus;
        }
        if ((i & 32) != 0) {
            num = networkSimulationConfigData.maxSelection;
        }
        if ((i & 64) != 0) {
            list = networkSimulationConfigData.sports;
        }
        if ((i & 128) != 0) {
            networkSimulationAutoBetConfig = networkSimulationConfigData.autoBet;
        }
        if ((i & 256) != 0) {
            networkSpeedControllerConfig = networkSimulationConfigData.speedControllerConfig;
        }
        if ((i & 512) != 0) {
            giftConfigVO = networkSimulationConfigData.gift;
        }
        if ((i & 1024) != 0) {
            addToStakeConfigVO = networkSimulationConfigData.addToStake;
        }
        GiftConfigVO giftConfigVO2 = giftConfigVO;
        AddToStakeConfigVO addToStakeConfigVO2 = addToStakeConfigVO;
        NetworkSimulationAutoBetConfig networkSimulationAutoBetConfig2 = networkSimulationAutoBetConfig;
        NetworkSpeedControllerConfig networkSpeedControllerConfig2 = networkSpeedControllerConfig;
        Integer num2 = num;
        List list2 = list;
        SIMMultiBetBonusData sIMMultiBetBonusData2 = sIMMultiBetBonusData;
        String str4 = str2;
        return networkSimulationConfigData.copy(bool, str, str4, str3, sIMMultiBetBonusData2, num2, list2, networkSimulationAutoBetConfig2, networkSpeedControllerConfig2, giftConfigVO2, addToStakeConfigVO2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getIsSimulatedActive() {
        return this.isSimulatedActive;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final GiftConfigVO getGift() {
        return this.gift;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final AddToStakeConfigVO getAddToStake() {
        return this.addToStake;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMinStake() {
        return this.minStake;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMaxStake() {
        return this.maxStake;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMaxPayout() {
        return this.maxPayout;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final SIMMultiBetBonusData getMultiBetBonus() {
        return this.multiBetBonus;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getMaxSelection() {
        return this.maxSelection;
    }

    public final List<SimSportSupData> component7() {
        return this.sports;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final NetworkSimulationAutoBetConfig getAutoBet() {
        return this.autoBet;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final NetworkSpeedControllerConfig getSpeedControllerConfig() {
        return this.speedControllerConfig;
    }

    public final NetworkSimulationConfigData copy(Boolean isSimulatedActive, String minStake, String maxStake, String maxPayout, SIMMultiBetBonusData multiBetBonus, Integer maxSelection, List<SimSportSupData> sports, NetworkSimulationAutoBetConfig autoBet, NetworkSpeedControllerConfig speedControllerConfig, GiftConfigVO gift, AddToStakeConfigVO addToStake) {
        return new NetworkSimulationConfigData(isSimulatedActive, minStake, maxStake, maxPayout, multiBetBonus, maxSelection, sports, autoBet, speedControllerConfig, gift, addToStake);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkSimulationConfigData)) {
            return false;
        }
        NetworkSimulationConfigData networkSimulationConfigData = (NetworkSimulationConfigData) other;
        return Intrinsics.g(this.isSimulatedActive, networkSimulationConfigData.isSimulatedActive) && Intrinsics.g(this.minStake, networkSimulationConfigData.minStake) && Intrinsics.g(this.maxStake, networkSimulationConfigData.maxStake) && Intrinsics.g(this.maxPayout, networkSimulationConfigData.maxPayout) && Intrinsics.g(this.multiBetBonus, networkSimulationConfigData.multiBetBonus) && Intrinsics.g(this.maxSelection, networkSimulationConfigData.maxSelection) && Intrinsics.g(this.sports, networkSimulationConfigData.sports) && Intrinsics.g(this.autoBet, networkSimulationConfigData.autoBet) && Intrinsics.g(this.speedControllerConfig, networkSimulationConfigData.speedControllerConfig) && Intrinsics.g(this.gift, networkSimulationConfigData.gift) && Intrinsics.g(this.addToStake, networkSimulationConfigData.addToStake);
    }

    public final AddToStakeConfigVO getAddToStake() {
        return this.addToStake;
    }

    public final NetworkSimulationAutoBetConfig getAutoBet() {
        return this.autoBet;
    }

    public final GiftConfigVO getGift() {
        return this.gift;
    }

    public final String getMaxPayout() {
        return this.maxPayout;
    }

    public final Integer getMaxSelection() {
        return this.maxSelection;
    }

    public final String getMaxStake() {
        return this.maxStake;
    }

    public final String getMinStake() {
        return this.minStake;
    }

    public final SIMMultiBetBonusData getMultiBetBonus() {
        return this.multiBetBonus;
    }

    public final NetworkSpeedControllerConfig getSpeedControllerConfig() {
        return this.speedControllerConfig;
    }

    public final List<SimSportSupData> getSports() {
        return this.sports;
    }

    public int hashCode() {
        Boolean bool = this.isSimulatedActive;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.minStake;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.maxStake;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.maxPayout;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        SIMMultiBetBonusData sIMMultiBetBonusData = this.multiBetBonus;
        int iHashCode5 = (iHashCode4 + (sIMMultiBetBonusData == null ? 0 : sIMMultiBetBonusData.hashCode())) * 31;
        Integer num = this.maxSelection;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        List<SimSportSupData> list = this.sports;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        NetworkSimulationAutoBetConfig networkSimulationAutoBetConfig = this.autoBet;
        int iHashCode8 = (iHashCode7 + (networkSimulationAutoBetConfig == null ? 0 : networkSimulationAutoBetConfig.hashCode())) * 31;
        NetworkSpeedControllerConfig networkSpeedControllerConfig = this.speedControllerConfig;
        int iHashCode9 = (iHashCode8 + (networkSpeedControllerConfig == null ? 0 : networkSpeedControllerConfig.hashCode())) * 31;
        GiftConfigVO giftConfigVO = this.gift;
        int iHashCode10 = (iHashCode9 + (giftConfigVO == null ? 0 : giftConfigVO.hashCode())) * 31;
        AddToStakeConfigVO addToStakeConfigVO = this.addToStake;
        return iHashCode10 + (addToStakeConfigVO != null ? addToStakeConfigVO.hashCode() : 0);
    }

    public final Boolean isSimulatedActive() {
        return this.isSimulatedActive;
    }

    public String toString() {
        Boolean bool = this.isSimulatedActive;
        String str = this.minStake;
        String str2 = this.maxStake;
        String str3 = this.maxPayout;
        SIMMultiBetBonusData sIMMultiBetBonusData = this.multiBetBonus;
        Integer num = this.maxSelection;
        List<SimSportSupData> list = this.sports;
        NetworkSimulationAutoBetConfig networkSimulationAutoBetConfig = this.autoBet;
        NetworkSpeedControllerConfig networkSpeedControllerConfig = this.speedControllerConfig;
        GiftConfigVO giftConfigVO = this.gift;
        AddToStakeConfigVO addToStakeConfigVO = this.addToStake;
        StringBuilder sb = new StringBuilder("NetworkSimulationConfigData(isSimulatedActive=");
        sb.append(bool);
        sb.append(", minStake=");
        sb.append(str);
        sb.append(", maxStake=");
        hxa.c(sb, str2, ", maxPayout=", str3, ", multiBetBonus=");
        sb.append(sIMMultiBetBonusData);
        sb.append(", maxSelection=");
        sb.append(num);
        sb.append(", sports=");
        sb.append(list);
        sb.append(", autoBet=");
        sb.append(networkSimulationAutoBetConfig);
        sb.append(", speedControllerConfig=");
        sb.append(networkSpeedControllerConfig);
        sb.append(", gift=");
        sb.append(giftConfigVO);
        sb.append(", addToStake=");
        sb.append(addToStakeConfigVO);
        sb.append(")");
        return sb.toString();
    }
}
