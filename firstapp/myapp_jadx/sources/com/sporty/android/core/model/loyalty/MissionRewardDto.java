package com.sporty.android.core.model.loyalty;

import defpackage.ai50;
import defpackage.em5;
import defpackage.f87;
import defpackage.gmf0;
import defpackage.qjk;
import defpackage.uqe0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 32\u00020\u0001:\u00013Bq\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030\nHÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030\nHÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030\nHÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u008a\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010-J\u0014\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00101\u001a\u00020\u0003HÖ\u0081\u0004J\n\u00102\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0015\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b \u0010\u001eR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b!\u0010\u001e¨\u00064"}, d2 = {"Lcom/sporty/android/core/model/loyalty/MissionRewardDto;", "", "rewardType", "", "referenceId", "", "rewardAmount", "", "currency", "realSportBizTypeIdList", "", "instantVirtualBizTypeIdList", "gameBizTypeIdList", "multiplier", "days", "pickAmount", "<init>", "(ILjava/lang/String;JLjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getRewardType", "()I", "getReferenceId", "()Ljava/lang/String;", "getRewardAmount", "()J", "getCurrency", "getRealSportBizTypeIdList", "()Ljava/util/List;", "getInstantVirtualBizTypeIdList", "getGameBizTypeIdList", "getMultiplier", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDays", "getPickAmount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(ILjava/lang/String;JLjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sporty/android/core/model/loyalty/MissionRewardDto;", "equals", "", "other", "hashCode", "toString", "Companion", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class MissionRewardDto {
    public static final int REWARD_TYPE_BETSLIP_THEME = 10;
    public static final int REWARD_TYPE_FREEBET_GIFT = 1;
    public static final int REWARD_TYPE_RAKEBACK_BOOST_GIFT = 7;
    public static final int REWARD_TYPE_SPORTY_TV_WORLD_CUP_PASS = 9;
    private final String currency;
    private final Integer days;
    private final List<Integer> gameBizTypeIdList;
    private final List<Integer> instantVirtualBizTypeIdList;
    private final Integer multiplier;
    private final Integer pickAmount;
    private final List<Integer> realSportBizTypeIdList;
    private final String referenceId;
    private final long rewardAmount;
    private final int rewardType;

    public MissionRewardDto(int i, String str, long j, String str2, List<Integer> list, List<Integer> list2, List<Integer> list3, Integer num, Integer num2, Integer num3) {
        str.getClass();
        str2.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.rewardType = i;
        this.referenceId = str;
        this.rewardAmount = j;
        this.currency = str2;
        this.realSportBizTypeIdList = list;
        this.instantVirtualBizTypeIdList = list2;
        this.gameBizTypeIdList = list3;
        this.multiplier = num;
        this.days = num2;
        this.pickAmount = num3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MissionRewardDto copy$default(MissionRewardDto missionRewardDto, int i, String str, long j, String str2, List list, List list2, List list3, Integer num, Integer num2, Integer num3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = missionRewardDto.rewardType;
        }
        if ((i2 & 2) != 0) {
            str = missionRewardDto.referenceId;
        }
        if ((i2 & 4) != 0) {
            j = missionRewardDto.rewardAmount;
        }
        if ((i2 & 8) != 0) {
            str2 = missionRewardDto.currency;
        }
        if ((i2 & 16) != 0) {
            list = missionRewardDto.realSportBizTypeIdList;
        }
        if ((i2 & 32) != 0) {
            list2 = missionRewardDto.instantVirtualBizTypeIdList;
        }
        if ((i2 & 64) != 0) {
            list3 = missionRewardDto.gameBizTypeIdList;
        }
        if ((i2 & 128) != 0) {
            num = missionRewardDto.multiplier;
        }
        if ((i2 & 256) != 0) {
            num2 = missionRewardDto.days;
        }
        if ((i2 & 512) != 0) {
            num3 = missionRewardDto.pickAmount;
        }
        Integer num4 = num2;
        Integer num5 = num3;
        Integer num6 = num;
        List list4 = list2;
        String str3 = str2;
        long j2 = j;
        return missionRewardDto.copy(i, str, j2, str3, list, list4, list3, num6, num4, num5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getRewardType() {
        return this.rewardType;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getPickAmount() {
        return this.pickAmount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getReferenceId() {
        return this.referenceId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getRewardAmount() {
        return this.rewardAmount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    public final List<Integer> component5() {
        return this.realSportBizTypeIdList;
    }

    public final List<Integer> component6() {
        return this.instantVirtualBizTypeIdList;
    }

    public final List<Integer> component7() {
        return this.gameBizTypeIdList;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getMultiplier() {
        return this.multiplier;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getDays() {
        return this.days;
    }

    public final MissionRewardDto copy(int rewardType, String referenceId, long rewardAmount, String currency, List<Integer> realSportBizTypeIdList, List<Integer> instantVirtualBizTypeIdList, List<Integer> gameBizTypeIdList, Integer multiplier, Integer days, Integer pickAmount) {
        referenceId.getClass();
        currency.getClass();
        realSportBizTypeIdList.getClass();
        instantVirtualBizTypeIdList.getClass();
        gameBizTypeIdList.getClass();
        return new MissionRewardDto(rewardType, referenceId, rewardAmount, currency, realSportBizTypeIdList, instantVirtualBizTypeIdList, gameBizTypeIdList, multiplier, days, pickAmount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MissionRewardDto)) {
            return false;
        }
        MissionRewardDto missionRewardDto = (MissionRewardDto) other;
        return this.rewardType == missionRewardDto.rewardType && Intrinsics.g(this.referenceId, missionRewardDto.referenceId) && this.rewardAmount == missionRewardDto.rewardAmount && Intrinsics.g(this.currency, missionRewardDto.currency) && Intrinsics.g(this.realSportBizTypeIdList, missionRewardDto.realSportBizTypeIdList) && Intrinsics.g(this.instantVirtualBizTypeIdList, missionRewardDto.instantVirtualBizTypeIdList) && Intrinsics.g(this.gameBizTypeIdList, missionRewardDto.gameBizTypeIdList) && Intrinsics.g(this.multiplier, missionRewardDto.multiplier) && Intrinsics.g(this.days, missionRewardDto.days) && Intrinsics.g(this.pickAmount, missionRewardDto.pickAmount);
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final Integer getDays() {
        return this.days;
    }

    public final List<Integer> getGameBizTypeIdList() {
        return this.gameBizTypeIdList;
    }

    public final List<Integer> getInstantVirtualBizTypeIdList() {
        return this.instantVirtualBizTypeIdList;
    }

    public final Integer getMultiplier() {
        return this.multiplier;
    }

    public final Integer getPickAmount() {
        return this.pickAmount;
    }

    public final List<Integer> getRealSportBizTypeIdList() {
        return this.realSportBizTypeIdList;
    }

    public final String getReferenceId() {
        return this.referenceId;
    }

    public final long getRewardAmount() {
        return this.rewardAmount;
    }

    public final int getRewardType() {
        return this.rewardType;
    }

    public int hashCode() {
        int iA = ai50.a(ai50.a(ai50.a(gmf0.a(f87.a(gmf0.a(Integer.hashCode(this.rewardType) * 31, 31, this.referenceId), this.rewardAmount, 31), 31, this.currency), 31, this.realSportBizTypeIdList), 31, this.instantVirtualBizTypeIdList), 31, this.gameBizTypeIdList);
        Integer num = this.multiplier;
        int iHashCode = (iA + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.days;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.pickAmount;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public String toString() {
        int i = this.rewardType;
        String str = this.referenceId;
        long j = this.rewardAmount;
        String str2 = this.currency;
        List<Integer> list = this.realSportBizTypeIdList;
        List<Integer> list2 = this.instantVirtualBizTypeIdList;
        List<Integer> list3 = this.gameBizTypeIdList;
        Integer num = this.multiplier;
        Integer num2 = this.days;
        Integer num3 = this.pickAmount;
        StringBuilder sbA = uqe0.a(i, "MissionRewardDto(rewardType=", ", referenceId=", str, ", rewardAmount=");
        em5.a(j, ", currency=", str2, sbA);
        qjk.a(", realSportBizTypeIdList=", ", instantVirtualBizTypeIdList=", sbA, list, list2);
        sbA.append(", gameBizTypeIdList=");
        sbA.append(list3);
        sbA.append(", multiplier=");
        sbA.append(num);
        sbA.append(", days=");
        sbA.append(num2);
        sbA.append(", pickAmount=");
        sbA.append(num3);
        sbA.append(")");
        return sbA.toString();
    }

    public /* synthetic */ MissionRewardDto(int i, String str, long j, String str2, List list, List list2, List list3, Integer num, Integer num2, Integer num3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, j, str2, list, list2, list3, num, num2, (i2 & 512) != 0 ? null : num3);
    }
}
