package com.sportygames.campaign.presentation;

import defpackage.o8i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/sportygames/campaign/presentation/TournamentBannerFetchResponse;", "", "tournamentConfigVOList", "", "Lcom/sportygames/campaign/presentation/TournamentBannerConfig;", "userPlayInfoVOList", "Lcom/sportygames/campaign/presentation/TournamentUserPlayInfo;", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getTournamentConfigVOList", "()Ljava/util/List;", "getUserPlayInfoVOList", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "campaign_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TournamentBannerFetchResponse {
    public static final int $stable = 8;
    private final List<TournamentBannerConfig> tournamentConfigVOList;
    private final List<TournamentUserPlayInfo> userPlayInfoVOList;

    public TournamentBannerFetchResponse(List<TournamentBannerConfig> list, List<TournamentUserPlayInfo> list2) {
        this.tournamentConfigVOList = list;
        this.userPlayInfoVOList = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TournamentBannerFetchResponse copy$default(TournamentBannerFetchResponse tournamentBannerFetchResponse, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = tournamentBannerFetchResponse.tournamentConfigVOList;
        }
        if ((i & 2) != 0) {
            list2 = tournamentBannerFetchResponse.userPlayInfoVOList;
        }
        return tournamentBannerFetchResponse.copy(list, list2);
    }

    public final List<TournamentBannerConfig> component1() {
        return this.tournamentConfigVOList;
    }

    public final List<TournamentUserPlayInfo> component2() {
        return this.userPlayInfoVOList;
    }

    public final TournamentBannerFetchResponse copy(List<TournamentBannerConfig> tournamentConfigVOList, List<TournamentUserPlayInfo> userPlayInfoVOList) {
        return new TournamentBannerFetchResponse(tournamentConfigVOList, userPlayInfoVOList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TournamentBannerFetchResponse)) {
            return false;
        }
        TournamentBannerFetchResponse tournamentBannerFetchResponse = (TournamentBannerFetchResponse) other;
        return Intrinsics.g(this.tournamentConfigVOList, tournamentBannerFetchResponse.tournamentConfigVOList) && Intrinsics.g(this.userPlayInfoVOList, tournamentBannerFetchResponse.userPlayInfoVOList);
    }

    public final List<TournamentBannerConfig> getTournamentConfigVOList() {
        return this.tournamentConfigVOList;
    }

    public final List<TournamentUserPlayInfo> getUserPlayInfoVOList() {
        return this.userPlayInfoVOList;
    }

    public int hashCode() {
        List<TournamentBannerConfig> list = this.tournamentConfigVOList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<TournamentUserPlayInfo> list2 = this.userPlayInfoVOList;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TournamentBannerFetchResponse(tournamentConfigVOList=");
        sb.append(this.tournamentConfigVOList);
        sb.append(", userPlayInfoVOList=");
        return o8i.a(sb, this.userPlayInfoVOList, ')');
    }
}
