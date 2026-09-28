package com.sportybet.feature.worldcup.tournament.data.model;

import com.appsflyer.internal.x;
import defpackage.f87;
import defpackage.ka1;
import defpackage.m2g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010Ê\u0001\u0002\b\u001cÊ\u0001\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u001b"}, d2 = {"Lcom/sportybet/feature/worldcup/tournament/data/model/TournamentKnockoutsResponseDto;", "", "tournamentId", "", "lastUpdated", "", "stages", "", "Lcom/sportybet/feature/worldcup/tournament/data/model/StageDto;", "<init>", "(Ljava/lang/String;JLjava/util/List;)V", "getTournamentId", "()Ljava/lang/String;", "getLastUpdated", "()J", "getStages", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "world-cup", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class TournamentKnockoutsResponseDto {
    public static final int $stable = 8;
    private final long lastUpdated;
    private final List<StageDto> stages;
    private final String tournamentId;

    public TournamentKnockoutsResponseDto(String str, long j, List<StageDto> list) {
        str.getClass();
        list.getClass();
        this.tournamentId = str;
        this.lastUpdated = j;
        this.stages = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TournamentKnockoutsResponseDto copy$default(TournamentKnockoutsResponseDto tournamentKnockoutsResponseDto, String str, long j, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tournamentKnockoutsResponseDto.tournamentId;
        }
        if ((i & 2) != 0) {
            j = tournamentKnockoutsResponseDto.lastUpdated;
        }
        if ((i & 4) != 0) {
            list = tournamentKnockoutsResponseDto.stages;
        }
        return tournamentKnockoutsResponseDto.copy(str, j, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTournamentId() {
        return this.tournamentId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getLastUpdated() {
        return this.lastUpdated;
    }

    public final List<StageDto> component3() {
        return this.stages;
    }

    public final TournamentKnockoutsResponseDto copy(String tournamentId, long lastUpdated, List<StageDto> stages) {
        tournamentId.getClass();
        stages.getClass();
        return new TournamentKnockoutsResponseDto(tournamentId, lastUpdated, stages);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TournamentKnockoutsResponseDto)) {
            return false;
        }
        TournamentKnockoutsResponseDto tournamentKnockoutsResponseDto = (TournamentKnockoutsResponseDto) other;
        return Intrinsics.g(this.tournamentId, tournamentKnockoutsResponseDto.tournamentId) && this.lastUpdated == tournamentKnockoutsResponseDto.lastUpdated && Intrinsics.g(this.stages, tournamentKnockoutsResponseDto.stages);
    }

    public final long getLastUpdated() {
        return this.lastUpdated;
    }

    public final List<StageDto> getStages() {
        return this.stages;
    }

    public final String getTournamentId() {
        return this.tournamentId;
    }

    public int hashCode() {
        return this.stages.hashCode() + f87.a(this.tournamentId.hashCode() * 31, this.lastUpdated, 31);
    }

    public String toString() {
        String str = this.tournamentId;
        long j = this.lastUpdated;
        return ka1.a(x.a(j, "TournamentKnockoutsResponseDto(tournamentId=", str, ", lastUpdated="), ", stages=", this.stages, ")");
    }

    public TournamentKnockoutsResponseDto(String str, long j, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? m2g.a : list);
    }
}
