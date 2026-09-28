package com.sportygames.campaign.presentation;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.o8i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010#J\u0010\u00105\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010&J\u0010\u00106\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010)J\u0011\u00107\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\u0011\u00108\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0011HÆ\u0003J\u009e\u0001\u00109\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0011HÆ\u0001¢\u0006\u0002\u0010:J\u0013\u0010;\u001a\u00020\u000f2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020\rHÖ\u0001J\t\u0010>\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001b\"\u0004\b\u001e\u0010\u001fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010*\u001a\u0004\b(\u0010)R\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0019\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b-\u0010,¨\u0006?"}, d2 = {"Lcom/sportygames/campaign/presentation/TournamentBannerConfig;", "", AnalyticsParam.EVENT_PARAM_ID, "", "name", "", "currency", AnalyticsParam.EVENT_STATUS, "startTime", "endTime", "totalPrize", "", "maxParticipants", "", "maxParticipantsReached", "", "prizeInfo", "", "Lcom/sportygames/campaign/presentation/TournamentPrizeInfo;", "eligibilityCriteria", "Lcom/sportygames/campaign/presentation/TournamentEligibilityCriteria;", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;)V", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getName", "()Ljava/lang/String;", "getCurrency", "getStatus", "setStatus", "(Ljava/lang/String;)V", "getStartTime", "getEndTime", "getTotalPrize", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getMaxParticipants", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMaxParticipantsReached", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPrizeInfo", "()Ljava/util/List;", "getEligibilityCriteria", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;)Lcom/sportygames/campaign/presentation/TournamentBannerConfig;", "equals", "other", "hashCode", "toString", "campaign_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TournamentBannerConfig {
    public static final int $stable = 8;
    private final String currency;
    private final List<TournamentEligibilityCriteria> eligibilityCriteria;
    private final String endTime;
    private final Long id;
    private final Integer maxParticipants;
    private final Boolean maxParticipantsReached;
    private final String name;
    private final List<TournamentPrizeInfo> prizeInfo;
    private final String startTime;
    private String status;
    private final Double totalPrize;

    public TournamentBannerConfig(Long l, String str, String str2, String str3, String str4, String str5, Double d, Integer num, Boolean bool, List<TournamentPrizeInfo> list, List<TournamentEligibilityCriteria> list2) {
        this.id = l;
        this.name = str;
        this.currency = str2;
        this.status = str3;
        this.startTime = str4;
        this.endTime = str5;
        this.totalPrize = d;
        this.maxParticipants = num;
        this.maxParticipantsReached = bool;
        this.prizeInfo = list;
        this.eligibilityCriteria = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TournamentBannerConfig copy$default(TournamentBannerConfig tournamentBannerConfig, Long l, String str, String str2, String str3, String str4, String str5, Double d, Integer num, Boolean bool, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            l = tournamentBannerConfig.id;
        }
        if ((i & 2) != 0) {
            str = tournamentBannerConfig.name;
        }
        if ((i & 4) != 0) {
            str2 = tournamentBannerConfig.currency;
        }
        if ((i & 8) != 0) {
            str3 = tournamentBannerConfig.status;
        }
        if ((i & 16) != 0) {
            str4 = tournamentBannerConfig.startTime;
        }
        if ((i & 32) != 0) {
            str5 = tournamentBannerConfig.endTime;
        }
        if ((i & 64) != 0) {
            d = tournamentBannerConfig.totalPrize;
        }
        if ((i & 128) != 0) {
            num = tournamentBannerConfig.maxParticipants;
        }
        if ((i & 256) != 0) {
            bool = tournamentBannerConfig.maxParticipantsReached;
        }
        if ((i & 512) != 0) {
            list = tournamentBannerConfig.prizeInfo;
        }
        if ((i & 1024) != 0) {
            list2 = tournamentBannerConfig.eligibilityCriteria;
        }
        List list3 = list;
        List list4 = list2;
        Integer num2 = num;
        Boolean bool2 = bool;
        String str6 = str5;
        Double d2 = d;
        String str7 = str4;
        String str8 = str2;
        return tournamentBannerConfig.copy(l, str, str8, str3, str7, str6, d2, num2, bool2, list3, list4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getId() {
        return this.id;
    }

    public final List<TournamentPrizeInfo> component10() {
        return this.prizeInfo;
    }

    public final List<TournamentEligibilityCriteria> component11() {
        return this.eligibilityCriteria;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Double getTotalPrize() {
        return this.totalPrize;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getMaxParticipants() {
        return this.maxParticipants;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getMaxParticipantsReached() {
        return this.maxParticipantsReached;
    }

    public final TournamentBannerConfig copy(Long id, String name, String currency, String status, String startTime, String endTime, Double totalPrize, Integer maxParticipants, Boolean maxParticipantsReached, List<TournamentPrizeInfo> prizeInfo, List<TournamentEligibilityCriteria> eligibilityCriteria) {
        return new TournamentBannerConfig(id, name, currency, status, startTime, endTime, totalPrize, maxParticipants, maxParticipantsReached, prizeInfo, eligibilityCriteria);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TournamentBannerConfig)) {
            return false;
        }
        TournamentBannerConfig tournamentBannerConfig = (TournamentBannerConfig) other;
        return Intrinsics.g(this.id, tournamentBannerConfig.id) && Intrinsics.g(this.name, tournamentBannerConfig.name) && Intrinsics.g(this.currency, tournamentBannerConfig.currency) && Intrinsics.g(this.status, tournamentBannerConfig.status) && Intrinsics.g(this.startTime, tournamentBannerConfig.startTime) && Intrinsics.g(this.endTime, tournamentBannerConfig.endTime) && Intrinsics.g(this.totalPrize, tournamentBannerConfig.totalPrize) && Intrinsics.g(this.maxParticipants, tournamentBannerConfig.maxParticipants) && Intrinsics.g(this.maxParticipantsReached, tournamentBannerConfig.maxParticipantsReached) && Intrinsics.g(this.prizeInfo, tournamentBannerConfig.prizeInfo) && Intrinsics.g(this.eligibilityCriteria, tournamentBannerConfig.eligibilityCriteria);
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final List<TournamentEligibilityCriteria> getEligibilityCriteria() {
        return this.eligibilityCriteria;
    }

    public final String getEndTime() {
        return this.endTime;
    }

    public final Long getId() {
        return this.id;
    }

    public final Integer getMaxParticipants() {
        return this.maxParticipants;
    }

    public final Boolean getMaxParticipantsReached() {
        return this.maxParticipantsReached;
    }

    public final String getName() {
        return this.name;
    }

    public final List<TournamentPrizeInfo> getPrizeInfo() {
        return this.prizeInfo;
    }

    public final String getStartTime() {
        return this.startTime;
    }

    public final String getStatus() {
        return this.status;
    }

    public final Double getTotalPrize() {
        return this.totalPrize;
    }

    public int hashCode() {
        Long l = this.id;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.currency;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.status;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.startTime;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.endTime;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Double d = this.totalPrize;
        int iHashCode7 = (iHashCode6 + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.maxParticipants;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.maxParticipantsReached;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<TournamentPrizeInfo> list = this.prizeInfo;
        int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        List<TournamentEligibilityCriteria> list2 = this.eligibilityCriteria;
        return iHashCode10 + (list2 != null ? list2.hashCode() : 0);
    }

    public final void setStatus(String str) {
        this.status = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TournamentBannerConfig(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", currency=");
        sb.append(this.currency);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", startTime=");
        sb.append(this.startTime);
        sb.append(", endTime=");
        sb.append(this.endTime);
        sb.append(", totalPrize=");
        sb.append(this.totalPrize);
        sb.append(", maxParticipants=");
        sb.append(this.maxParticipants);
        sb.append(", maxParticipantsReached=");
        sb.append(this.maxParticipantsReached);
        sb.append(", prizeInfo=");
        sb.append(this.prizeInfo);
        sb.append(", eligibilityCriteria=");
        return o8i.a(sb, this.eligibilityCriteria, ')');
    }
}
