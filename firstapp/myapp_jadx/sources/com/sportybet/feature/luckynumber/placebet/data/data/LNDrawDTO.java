package com.sportybet.feature.luckynumber.placebet.data.data;

import com.appsflyer.internal.x;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.feature.luckynumber.lobby.data.dto.LNLotteryBallColorDTO;
import defpackage.ai50;
import defpackage.f87;
import defpackage.gpp;
import defpackage.ka1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00100\u000bHÆ\u0003J]\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000bHÆ\u0001J\u0014\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010+\u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010,\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cÊ\u0001\u0002\b.Ê\u0001\f\b/\u0012\b\b0\u0012\u0004\b\u0003\u0010\u0000¨\u0006-"}, d2 = {"Lcom/sportybet/feature/luckynumber/placebet/data/data/LNDrawDTO;", "", AnalyticsParam.EVENT_PARAM_ID, "", "drawTime", "", AnalyticsParam.EVENT_STATUS, "", "lottery", "Lcom/sportybet/feature/luckynumber/placebet/data/data/LNDrawLotteryDTO;", "colors", "", "Lcom/sportybet/feature/luckynumber/lobby/data/dto/LNLotteryBallColorDTO;", "statisticsNumbers", "Lcom/sportybet/feature/luckynumber/placebet/data/data/LNStatisticsNumbersDTO;", "markets", "Lcom/sportybet/feature/luckynumber/placebet/data/data/LNMarketDTO;", "<init>", "(Ljava/lang/String;JILcom/sportybet/feature/luckynumber/placebet/data/data/LNDrawLotteryDTO;Ljava/util/List;Lcom/sportybet/feature/luckynumber/placebet/data/data/LNStatisticsNumbersDTO;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getDrawTime", "()J", "getStatus", "()I", "getLottery", "()Lcom/sportybet/feature/luckynumber/placebet/data/data/LNDrawLotteryDTO;", "getColors", "()Ljava/util/List;", "getStatisticsNumbers", "()Lcom/sportybet/feature/luckynumber/placebet/data/data/LNStatisticsNumbersDTO;", "getMarkets", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "luckynumber", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LNDrawDTO {
    public static final int $stable = LNStatisticsNumbersDTO.$stable | LNDrawLotteryDTO.$stable;
    private final List<LNLotteryBallColorDTO> colors;
    private final long drawTime;
    private final String id;
    private final LNDrawLotteryDTO lottery;
    private final List<LNMarketDTO> markets;
    private final LNStatisticsNumbersDTO statisticsNumbers;
    private final int status;

    public LNDrawDTO(String str, long j, int i, LNDrawLotteryDTO lNDrawLotteryDTO, List<LNLotteryBallColorDTO> list, LNStatisticsNumbersDTO lNStatisticsNumbersDTO, List<LNMarketDTO> list2) {
        str.getClass();
        lNDrawLotteryDTO.getClass();
        list.getClass();
        list2.getClass();
        this.id = str;
        this.drawTime = j;
        this.status = i;
        this.lottery = lNDrawLotteryDTO;
        this.colors = list;
        this.statisticsNumbers = lNStatisticsNumbersDTO;
        this.markets = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LNDrawDTO copy$default(LNDrawDTO lNDrawDTO, String str, long j, int i, LNDrawLotteryDTO lNDrawLotteryDTO, List list, LNStatisticsNumbersDTO lNStatisticsNumbersDTO, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = lNDrawDTO.id;
        }
        if ((i2 & 2) != 0) {
            j = lNDrawDTO.drawTime;
        }
        if ((i2 & 4) != 0) {
            i = lNDrawDTO.status;
        }
        if ((i2 & 8) != 0) {
            lNDrawLotteryDTO = lNDrawDTO.lottery;
        }
        if ((i2 & 16) != 0) {
            list = lNDrawDTO.colors;
        }
        if ((i2 & 32) != 0) {
            lNStatisticsNumbersDTO = lNDrawDTO.statisticsNumbers;
        }
        if ((i2 & 64) != 0) {
            list2 = lNDrawDTO.markets;
        }
        List list3 = list2;
        List list4 = list;
        int i3 = i;
        return lNDrawDTO.copy(str, j, i3, lNDrawLotteryDTO, list4, lNStatisticsNumbersDTO, list3);
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
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final LNDrawLotteryDTO getLottery() {
        return this.lottery;
    }

    public final List<LNLotteryBallColorDTO> component5() {
        return this.colors;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final LNStatisticsNumbersDTO getStatisticsNumbers() {
        return this.statisticsNumbers;
    }

    public final List<LNMarketDTO> component7() {
        return this.markets;
    }

    public final LNDrawDTO copy(String id, long drawTime, int status, LNDrawLotteryDTO lottery, List<LNLotteryBallColorDTO> colors, LNStatisticsNumbersDTO statisticsNumbers, List<LNMarketDTO> markets) {
        id.getClass();
        lottery.getClass();
        colors.getClass();
        markets.getClass();
        return new LNDrawDTO(id, drawTime, status, lottery, colors, statisticsNumbers, markets);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LNDrawDTO)) {
            return false;
        }
        LNDrawDTO lNDrawDTO = (LNDrawDTO) other;
        return Intrinsics.g(this.id, lNDrawDTO.id) && this.drawTime == lNDrawDTO.drawTime && this.status == lNDrawDTO.status && Intrinsics.g(this.lottery, lNDrawDTO.lottery) && Intrinsics.g(this.colors, lNDrawDTO.colors) && Intrinsics.g(this.statisticsNumbers, lNDrawDTO.statisticsNumbers) && Intrinsics.g(this.markets, lNDrawDTO.markets);
    }

    public final List<LNLotteryBallColorDTO> getColors() {
        return this.colors;
    }

    public final long getDrawTime() {
        return this.drawTime;
    }

    public final String getId() {
        return this.id;
    }

    public final LNDrawLotteryDTO getLottery() {
        return this.lottery;
    }

    public final List<LNMarketDTO> getMarkets() {
        return this.markets;
    }

    public final LNStatisticsNumbersDTO getStatisticsNumbers() {
        return this.statisticsNumbers;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iA = ai50.a((this.lottery.hashCode() + gpp.a(this.status, f87.a(this.id.hashCode() * 31, this.drawTime, 31), 31)) * 31, 31, this.colors);
        LNStatisticsNumbersDTO lNStatisticsNumbersDTO = this.statisticsNumbers;
        return this.markets.hashCode() + ((iA + (lNStatisticsNumbersDTO == null ? 0 : lNStatisticsNumbersDTO.hashCode())) * 31);
    }

    public String toString() {
        String str = this.id;
        long j = this.drawTime;
        int i = this.status;
        LNDrawLotteryDTO lNDrawLotteryDTO = this.lottery;
        List<LNLotteryBallColorDTO> list = this.colors;
        LNStatisticsNumbersDTO lNStatisticsNumbersDTO = this.statisticsNumbers;
        List<LNMarketDTO> list2 = this.markets;
        StringBuilder sbA = x.a(j, "LNDrawDTO(id=", str, ", drawTime=");
        sbA.append(", status=");
        sbA.append(i);
        sbA.append(", lottery=");
        sbA.append(lNDrawLotteryDTO);
        sbA.append(", colors=");
        sbA.append(list);
        sbA.append(", statisticsNumbers=");
        sbA.append(lNStatisticsNumbersDTO);
        return ka1.a(sbA, ", markets=", list2, ")");
    }
}
