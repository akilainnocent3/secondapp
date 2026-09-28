package com.sportybet.feature.luckynumber.lobby.data.dto;

import com.appsflyer.internal.x;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.f87;
import defpackage.hxa;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003JI\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0014\u0010\u001e\u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010 \u001a\u00020!HÖ\u0081\u0004J\n\u0010\"\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0016Ê\u0001\u0002\b$Ê\u0001\f\b%\u0012\b\b&\u0012\u0004\b\u0003\u0010\u0000¨\u0006#"}, d2 = {"Lcom/sportybet/feature/luckynumber/lobby/data/dto/LNResultDrawDTO;", "", AnalyticsParam.EVENT_PARAM_ID, "", "drawTime", "", "mainNumbers", "bonusNumbers", "lottery", "Lcom/sportybet/feature/luckynumber/lobby/data/dto/LNLotteryInfoDTO;", "isCanceled", "", "<init>", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lcom/sportybet/feature/luckynumber/lobby/data/dto/LNLotteryInfoDTO;Z)V", "getId", "()Ljava/lang/String;", "getDrawTime", "()J", "getMainNumbers", "getBonusNumbers", "getLottery", "()Lcom/sportybet/feature/luckynumber/lobby/data/dto/LNLotteryInfoDTO;", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "luckynumber", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LNResultDrawDTO {
    public static final int $stable = LNLotteryInfoDTO.$stable;
    private final String bonusNumbers;
    private final long drawTime;
    private final String id;
    private final boolean isCanceled;
    private final LNLotteryInfoDTO lottery;
    private final String mainNumbers;

    public LNResultDrawDTO(String str, long j, String str2, String str3, LNLotteryInfoDTO lNLotteryInfoDTO, boolean z) {
        str.getClass();
        lNLotteryInfoDTO.getClass();
        this.id = str;
        this.drawTime = j;
        this.mainNumbers = str2;
        this.bonusNumbers = str3;
        this.lottery = lNLotteryInfoDTO;
        this.isCanceled = z;
    }

    public static /* synthetic */ LNResultDrawDTO copy$default(LNResultDrawDTO lNResultDrawDTO, String str, long j, String str2, String str3, LNLotteryInfoDTO lNLotteryInfoDTO, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lNResultDrawDTO.id;
        }
        if ((i & 2) != 0) {
            j = lNResultDrawDTO.drawTime;
        }
        if ((i & 4) != 0) {
            str2 = lNResultDrawDTO.mainNumbers;
        }
        if ((i & 8) != 0) {
            str3 = lNResultDrawDTO.bonusNumbers;
        }
        if ((i & 16) != 0) {
            lNLotteryInfoDTO = lNResultDrawDTO.lottery;
        }
        if ((i & 32) != 0) {
            z = lNResultDrawDTO.isCanceled;
        }
        return lNResultDrawDTO.copy(str, j, str2, str3, lNLotteryInfoDTO, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getDrawTime() {
        return this.drawTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMainNumbers() {
        return this.mainNumbers;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBonusNumbers() {
        return this.bonusNumbers;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final LNLotteryInfoDTO getLottery() {
        return this.lottery;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsCanceled() {
        return this.isCanceled;
    }

    public final LNResultDrawDTO copy(String id, long drawTime, String mainNumbers, String bonusNumbers, LNLotteryInfoDTO lottery, boolean isCanceled) {
        id.getClass();
        lottery.getClass();
        return new LNResultDrawDTO(id, drawTime, mainNumbers, bonusNumbers, lottery, isCanceled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LNResultDrawDTO)) {
            return false;
        }
        LNResultDrawDTO lNResultDrawDTO = (LNResultDrawDTO) other;
        return Intrinsics.g(this.id, lNResultDrawDTO.id) && this.drawTime == lNResultDrawDTO.drawTime && Intrinsics.g(this.mainNumbers, lNResultDrawDTO.mainNumbers) && Intrinsics.g(this.bonusNumbers, lNResultDrawDTO.bonusNumbers) && Intrinsics.g(this.lottery, lNResultDrawDTO.lottery) && this.isCanceled == lNResultDrawDTO.isCanceled;
    }

    public final String getBonusNumbers() {
        return this.bonusNumbers;
    }

    public final long getDrawTime() {
        return this.drawTime;
    }

    public final String getId() {
        return this.id;
    }

    public final LNLotteryInfoDTO getLottery() {
        return this.lottery;
    }

    public final String getMainNumbers() {
        return this.mainNumbers;
    }

    public int hashCode() {
        int iA = f87.a(this.id.hashCode() * 31, this.drawTime, 31);
        String str = this.mainNumbers;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.bonusNumbers;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        return Boolean.hashCode(this.isCanceled) + ((this.lottery.hashCode() + ((iHashCode + iHashCode2) * 31)) * 31);
    }

    public final boolean isCanceled() {
        return this.isCanceled;
    }

    public String toString() {
        String str = this.id;
        long j = this.drawTime;
        String str2 = this.mainNumbers;
        String str3 = this.bonusNumbers;
        LNLotteryInfoDTO lNLotteryInfoDTO = this.lottery;
        boolean z = this.isCanceled;
        StringBuilder sbA = x.a(j, "LNResultDrawDTO(id=", str, ", drawTime=");
        hxa.c(sbA, ", mainNumbers=", str2, ", bonusNumbers=", str3);
        sbA.append(", lottery=");
        sbA.append(lNLotteryInfoDTO);
        sbA.append(", isCanceled=");
        sbA.append(z);
        sbA.append(")");
        return sbA.toString();
    }

    public /* synthetic */ LNResultDrawDTO(String str, long j, String str2, String str3, LNLotteryInfoDTO lNLotteryInfoDTO, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, str2, str3, lNLotteryInfoDTO, (i & 32) != 0 ? false : z);
    }
}
