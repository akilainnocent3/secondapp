package com.sportybet.feature.luckynumber.historydetail.data;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.f87;
import defpackage.g41;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.qn4;
import defpackage.uf80;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b1\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u0010>\u001a\u00020\u0012HÆ\u0003J\t\u0010?\u001a\u00020\u0014HÆ\u0003J\t\u0010@\u001a\u00020\u0014HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003JÃ\u0001\u0010D\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u0003HÆ\u0001J\u0014\u0010E\u001a\u00020F2\b\u0010G\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010H\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010I\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u0015\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b.\u0010-R\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001cR\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001cR\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001cÊ\u0001\u0002\bKÊ\u0001\f\bL\u0012\b\bM\u0012\u0004\b\u0003\u0010\u0000¨\u0006J"}, d2 = {"Lcom/sportybet/feature/luckynumber/historydetail/data/LNBetSelectionDTO;", "", AnalyticsParam.EVENT_PARAM_ID, "", "drawId", "lotteryId", "lotteryTitle", "marketId", "marketTitle", "marketType", "outcomeId", "odds", "prob", "outcomeNumber", "Lcom/sportybet/feature/luckynumber/historydetail/data/LNBetOutcomeNumberDTO;", "drawResult", "Lcom/sportybet/feature/luckynumber/historydetail/data/LNBetDrawResultDTO;", AnalyticsParam.EVENT_STATUS, "", "resultTime", "", "createTime", "outcomeTitle", "correctOutcomeTitle", "marketGroupId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sportybet/feature/luckynumber/historydetail/data/LNBetOutcomeNumberDTO;Lcom/sportybet/feature/luckynumber/historydetail/data/LNBetDrawResultDTO;IJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getDrawId", "getLotteryId", "getLotteryTitle", "getMarketId", "getMarketTitle", "getMarketType", "getOutcomeId", "getOdds", "getProb", "getOutcomeNumber", "()Lcom/sportybet/feature/luckynumber/historydetail/data/LNBetOutcomeNumberDTO;", "getDrawResult", "()Lcom/sportybet/feature/luckynumber/historydetail/data/LNBetDrawResultDTO;", "getStatus", "()I", "getResultTime", "()J", "getCreateTime", "getOutcomeTitle", "getCorrectOutcomeTitle", "getMarketGroupId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "equals", "", "other", "hashCode", "toString", "luckynumber", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LNBetSelectionDTO {
    public static final int $stable = LNBetDrawResultDTO.$stable | LNBetOutcomeNumberDTO.$stable;
    private final String correctOutcomeTitle;
    private final long createTime;
    private final String drawId;
    private final LNBetDrawResultDTO drawResult;
    private final String id;
    private final String lotteryId;
    private final String lotteryTitle;
    private final String marketGroupId;
    private final String marketId;
    private final String marketTitle;
    private final String marketType;
    private final String odds;
    private final String outcomeId;
    private final LNBetOutcomeNumberDTO outcomeNumber;
    private final String outcomeTitle;
    private final String prob;
    private final long resultTime;
    private final int status;

    public LNBetSelectionDTO(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, LNBetOutcomeNumberDTO lNBetOutcomeNumberDTO, LNBetDrawResultDTO lNBetDrawResultDTO, int i, long j, long j2, String str11, String str12, String str13) {
        qn4.b(str, str2, str3, str5, str6);
        qn4.b(str7, str8, str9, str10, str11);
        str12.getClass();
        str13.getClass();
        this.id = str;
        this.drawId = str2;
        this.lotteryId = str3;
        this.lotteryTitle = str4;
        this.marketId = str5;
        this.marketTitle = str6;
        this.marketType = str7;
        this.outcomeId = str8;
        this.odds = str9;
        this.prob = str10;
        this.outcomeNumber = lNBetOutcomeNumberDTO;
        this.drawResult = lNBetDrawResultDTO;
        this.status = i;
        this.resultTime = j;
        this.createTime = j2;
        this.outcomeTitle = str11;
        this.correctOutcomeTitle = str12;
        this.marketGroupId = str13;
    }

    public static /* synthetic */ LNBetSelectionDTO copy$default(LNBetSelectionDTO lNBetSelectionDTO, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, LNBetOutcomeNumberDTO lNBetOutcomeNumberDTO, LNBetDrawResultDTO lNBetDrawResultDTO, int i, long j, long j2, String str11, String str12, String str13, int i2, Object obj) {
        String str14;
        long j3;
        String str15 = (i2 & 1) != 0 ? lNBetSelectionDTO.id : str;
        String str16 = (i2 & 2) != 0 ? lNBetSelectionDTO.drawId : str2;
        String str17 = (i2 & 4) != 0 ? lNBetSelectionDTO.lotteryId : str3;
        String str18 = (i2 & 8) != 0 ? lNBetSelectionDTO.lotteryTitle : str4;
        String str19 = (i2 & 16) != 0 ? lNBetSelectionDTO.marketId : str5;
        String str20 = (i2 & 32) != 0 ? lNBetSelectionDTO.marketTitle : str6;
        String str21 = (i2 & 64) != 0 ? lNBetSelectionDTO.marketType : str7;
        String str22 = (i2 & 128) != 0 ? lNBetSelectionDTO.outcomeId : str8;
        String str23 = (i2 & 256) != 0 ? lNBetSelectionDTO.odds : str9;
        String str24 = (i2 & 512) != 0 ? lNBetSelectionDTO.prob : str10;
        LNBetOutcomeNumberDTO lNBetOutcomeNumberDTO2 = (i2 & 1024) != 0 ? lNBetSelectionDTO.outcomeNumber : lNBetOutcomeNumberDTO;
        LNBetDrawResultDTO lNBetDrawResultDTO2 = (i2 & 2048) != 0 ? lNBetSelectionDTO.drawResult : lNBetDrawResultDTO;
        int i3 = (i2 & 4096) != 0 ? lNBetSelectionDTO.status : i;
        String str25 = str15;
        String str26 = str16;
        long j4 = (i2 & 8192) != 0 ? lNBetSelectionDTO.resultTime : j;
        long j5 = (i2 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? lNBetSelectionDTO.createTime : j2;
        String str27 = (i2 & 32768) != 0 ? lNBetSelectionDTO.outcomeTitle : str11;
        String str28 = (i2 & 65536) != 0 ? lNBetSelectionDTO.correctOutcomeTitle : str12;
        if ((i2 & 131072) != 0) {
            j3 = j5;
            str14 = lNBetSelectionDTO.marketGroupId;
        } else {
            str14 = str13;
            j3 = j5;
        }
        return lNBetSelectionDTO.copy(str25, str26, str17, str18, str19, str20, str21, str22, str23, str24, lNBetOutcomeNumberDTO2, lNBetDrawResultDTO2, i3, j4, j3, str27, str28, str14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getProb() {
        return this.prob;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final LNBetOutcomeNumberDTO getOutcomeNumber() {
        return this.outcomeNumber;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final LNBetDrawResultDTO getDrawResult() {
        return this.drawResult;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final long getResultTime() {
        return this.resultTime;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getOutcomeTitle() {
        return this.outcomeTitle;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getCorrectOutcomeTitle() {
        return this.correctOutcomeTitle;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getMarketGroupId() {
        return this.marketGroupId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDrawId() {
        return this.drawId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLotteryId() {
        return this.lotteryId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLotteryTitle() {
        return this.lotteryTitle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMarketId() {
        return this.marketId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMarketTitle() {
        return this.marketTitle;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getMarketType() {
        return this.marketType;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getOutcomeId() {
        return this.outcomeId;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getOdds() {
        return this.odds;
    }

    public final LNBetSelectionDTO copy(String id, String drawId, String lotteryId, String lotteryTitle, String marketId, String marketTitle, String marketType, String outcomeId, String odds, String prob, LNBetOutcomeNumberDTO outcomeNumber, LNBetDrawResultDTO drawResult, int status, long resultTime, long createTime, String outcomeTitle, String correctOutcomeTitle, String marketGroupId) {
        qn4.b(id, drawId, lotteryId, marketId, marketTitle);
        qn4.b(marketType, outcomeId, odds, prob, outcomeTitle);
        correctOutcomeTitle.getClass();
        marketGroupId.getClass();
        return new LNBetSelectionDTO(id, drawId, lotteryId, lotteryTitle, marketId, marketTitle, marketType, outcomeId, odds, prob, outcomeNumber, drawResult, status, resultTime, createTime, outcomeTitle, correctOutcomeTitle, marketGroupId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LNBetSelectionDTO)) {
            return false;
        }
        LNBetSelectionDTO lNBetSelectionDTO = (LNBetSelectionDTO) other;
        return Intrinsics.g(this.id, lNBetSelectionDTO.id) && Intrinsics.g(this.drawId, lNBetSelectionDTO.drawId) && Intrinsics.g(this.lotteryId, lNBetSelectionDTO.lotteryId) && Intrinsics.g(this.lotteryTitle, lNBetSelectionDTO.lotteryTitle) && Intrinsics.g(this.marketId, lNBetSelectionDTO.marketId) && Intrinsics.g(this.marketTitle, lNBetSelectionDTO.marketTitle) && Intrinsics.g(this.marketType, lNBetSelectionDTO.marketType) && Intrinsics.g(this.outcomeId, lNBetSelectionDTO.outcomeId) && Intrinsics.g(this.odds, lNBetSelectionDTO.odds) && Intrinsics.g(this.prob, lNBetSelectionDTO.prob) && Intrinsics.g(this.outcomeNumber, lNBetSelectionDTO.outcomeNumber) && Intrinsics.g(this.drawResult, lNBetSelectionDTO.drawResult) && this.status == lNBetSelectionDTO.status && this.resultTime == lNBetSelectionDTO.resultTime && this.createTime == lNBetSelectionDTO.createTime && Intrinsics.g(this.outcomeTitle, lNBetSelectionDTO.outcomeTitle) && Intrinsics.g(this.correctOutcomeTitle, lNBetSelectionDTO.correctOutcomeTitle) && Intrinsics.g(this.marketGroupId, lNBetSelectionDTO.marketGroupId);
    }

    public final String getCorrectOutcomeTitle() {
        return this.correctOutcomeTitle;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final String getDrawId() {
        return this.drawId;
    }

    public final LNBetDrawResultDTO getDrawResult() {
        return this.drawResult;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLotteryId() {
        return this.lotteryId;
    }

    public final String getLotteryTitle() {
        return this.lotteryTitle;
    }

    public final String getMarketGroupId() {
        return this.marketGroupId;
    }

    public final String getMarketId() {
        return this.marketId;
    }

    public final String getMarketTitle() {
        return this.marketTitle;
    }

    public final String getMarketType() {
        return this.marketType;
    }

    public final String getOdds() {
        return this.odds;
    }

    public final String getOutcomeId() {
        return this.outcomeId;
    }

    public final LNBetOutcomeNumberDTO getOutcomeNumber() {
        return this.outcomeNumber;
    }

    public final String getOutcomeTitle() {
        return this.outcomeTitle;
    }

    public final String getProb() {
        return this.prob;
    }

    public final long getResultTime() {
        return this.resultTime;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iA = gmf0.a(gmf0.a(this.id.hashCode() * 31, 31, this.drawId), 31, this.lotteryId);
        String str = this.lotteryTitle;
        int iA2 = gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.marketId), 31, this.marketTitle), 31, this.marketType), 31, this.outcomeId), 31, this.odds), 31, this.prob);
        LNBetOutcomeNumberDTO lNBetOutcomeNumberDTO = this.outcomeNumber;
        int iHashCode = (iA2 + (lNBetOutcomeNumberDTO == null ? 0 : lNBetOutcomeNumberDTO.hashCode())) * 31;
        LNBetDrawResultDTO lNBetDrawResultDTO = this.drawResult;
        return this.marketGroupId.hashCode() + gmf0.a(gmf0.a(f87.a(f87.a(gpp.a(this.status, (iHashCode + (lNBetDrawResultDTO != null ? lNBetDrawResultDTO.hashCode() : 0)) * 31, 31), this.resultTime, 31), this.createTime, 31), 31, this.outcomeTitle), 31, this.correctOutcomeTitle);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.drawId;
        String str3 = this.lotteryId;
        String str4 = this.lotteryTitle;
        String str5 = this.marketId;
        String str6 = this.marketTitle;
        String str7 = this.marketType;
        String str8 = this.outcomeId;
        String str9 = this.odds;
        String str10 = this.prob;
        LNBetOutcomeNumberDTO lNBetOutcomeNumberDTO = this.outcomeNumber;
        LNBetDrawResultDTO lNBetDrawResultDTO = this.drawResult;
        int i = this.status;
        long j = this.resultTime;
        long j2 = this.createTime;
        String str11 = this.outcomeTitle;
        String str12 = this.correctOutcomeTitle;
        String str13 = this.marketGroupId;
        StringBuilder sbA = ux5.a("LNBetSelectionDTO(id=", str, ", drawId=", str2, ", lotteryId=");
        hxa.c(sbA, str3, ", lotteryTitle=", str4, ", marketId=");
        hxa.c(sbA, str5, ", marketTitle=", str6, ", marketType=");
        hxa.c(sbA, str7, ", outcomeId=", str8, ", odds=");
        hxa.c(sbA, str9, ", prob=", str10, ", outcomeNumber=");
        sbA.append(lNBetOutcomeNumberDTO);
        sbA.append(", drawResult=");
        sbA.append(lNBetDrawResultDTO);
        sbA.append(", status=");
        sbA.append(i);
        sbA.append(", resultTime=");
        sbA.append(j);
        g41.a(j2, ", createTime=", ", outcomeTitle=", sbA);
        hxa.c(sbA, str11, ", correctOutcomeTitle=", str12, ", marketGroupId=");
        return uf80.a(sbA, str13, ")");
    }
}
