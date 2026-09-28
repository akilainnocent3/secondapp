package com.sportybet.feature.worldcup.tournament.data.model;

import defpackage.d5d;
import defpackage.gpp;
import defpackage.mq0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001Bs\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u000fHÆ\u0003Jw\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0014\u0010,\u001a\u00020\u000f2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010.\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010/\u001a\u000200HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fÊ\u0001\u0002\b2Ê\u0001\f\b3\u0012\b\b4\u0012\u0004\b\u0003\u0010\u0000¨\u00061"}, d2 = {"Lcom/sportybet/feature/worldcup/tournament/data/model/StandingDto;", "", "position", "", "team", "Lcom/sportybet/feature/worldcup/tournament/data/model/TeamDto;", "mp", "w", "d", "l", "gf", "ga", "gd", "pts", "stillInTournament", "", "<init>", "(ILcom/sportybet/feature/worldcup/tournament/data/model/TeamDto;IIIIIIIIZ)V", "getPosition", "()I", "getTeam", "()Lcom/sportybet/feature/worldcup/tournament/data/model/TeamDto;", "getMp", "getW", "getD", "getL", "getGf", "getGa", "getGd", "getPts", "getStillInTournament", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "toString", "", "world-cup", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class StandingDto {
    public static final int $stable = TeamDto.$stable;
    private final int d;
    private final int ga;
    private final int gd;
    private final int gf;
    private final int l;
    private final int mp;
    private final int position;
    private final int pts;
    private final boolean stillInTournament;
    private final TeamDto team;
    private final int w;

    public /* synthetic */ StandingDto(int i, TeamDto teamDto, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0 : i, teamDto, (i10 & 4) != 0 ? 0 : i2, (i10 & 8) != 0 ? 0 : i3, (i10 & 16) != 0 ? 0 : i4, (i10 & 32) != 0 ? 0 : i5, (i10 & 64) != 0 ? 0 : i6, (i10 & 128) != 0 ? 0 : i7, (i10 & 256) != 0 ? 0 : i8, (i10 & 512) != 0 ? 0 : i9, (i10 & 1024) != 0 ? true : z);
    }

    public static /* synthetic */ StandingDto copy$default(StandingDto standingDto, int i, TeamDto teamDto, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = standingDto.position;
        }
        if ((i10 & 2) != 0) {
            teamDto = standingDto.team;
        }
        if ((i10 & 4) != 0) {
            i2 = standingDto.mp;
        }
        if ((i10 & 8) != 0) {
            i3 = standingDto.w;
        }
        if ((i10 & 16) != 0) {
            i4 = standingDto.d;
        }
        if ((i10 & 32) != 0) {
            i5 = standingDto.l;
        }
        if ((i10 & 64) != 0) {
            i6 = standingDto.gf;
        }
        if ((i10 & 128) != 0) {
            i7 = standingDto.ga;
        }
        if ((i10 & 256) != 0) {
            i8 = standingDto.gd;
        }
        if ((i10 & 512) != 0) {
            i9 = standingDto.pts;
        }
        if ((i10 & 1024) != 0) {
            z = standingDto.stillInTournament;
        }
        int i11 = i9;
        boolean z2 = z;
        int i12 = i7;
        int i13 = i8;
        int i14 = i5;
        int i15 = i6;
        int i16 = i4;
        int i17 = i2;
        return standingDto.copy(i, teamDto, i17, i3, i16, i14, i15, i12, i13, i11, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getPosition() {
        return this.position;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getPts() {
        return this.pts;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getStillInTournament() {
        return this.stillInTournament;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TeamDto getTeam() {
        return this.team;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMp() {
        return this.mp;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getW() {
        return this.w;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getL() {
        return this.l;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getGf() {
        return this.gf;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getGa() {
        return this.ga;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getGd() {
        return this.gd;
    }

    public final StandingDto copy(int position, TeamDto team, int mp, int w, int d, int l, int gf, int ga, int gd, int pts, boolean stillInTournament) {
        team.getClass();
        return new StandingDto(position, team, mp, w, d, l, gf, ga, gd, pts, stillInTournament);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StandingDto)) {
            return false;
        }
        StandingDto standingDto = (StandingDto) other;
        return this.position == standingDto.position && Intrinsics.g(this.team, standingDto.team) && this.mp == standingDto.mp && this.w == standingDto.w && this.d == standingDto.d && this.l == standingDto.l && this.gf == standingDto.gf && this.ga == standingDto.ga && this.gd == standingDto.gd && this.pts == standingDto.pts && this.stillInTournament == standingDto.stillInTournament;
    }

    public final int getD() {
        return this.d;
    }

    public final int getGa() {
        return this.ga;
    }

    public final int getGd() {
        return this.gd;
    }

    public final int getGf() {
        return this.gf;
    }

    public final int getL() {
        return this.l;
    }

    public final int getMp() {
        return this.mp;
    }

    public final int getPosition() {
        return this.position;
    }

    public final int getPts() {
        return this.pts;
    }

    public final boolean getStillInTournament() {
        return this.stillInTournament;
    }

    public final TeamDto getTeam() {
        return this.team;
    }

    public final int getW() {
        return this.w;
    }

    public int hashCode() {
        return Boolean.hashCode(this.stillInTournament) + gpp.a(this.pts, gpp.a(this.gd, gpp.a(this.ga, gpp.a(this.gf, gpp.a(this.l, gpp.a(this.d, gpp.a(this.w, gpp.a(this.mp, (this.team.hashCode() + (Integer.hashCode(this.position) * 31)) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public String toString() {
        int i = this.position;
        TeamDto teamDto = this.team;
        int i2 = this.mp;
        int i3 = this.w;
        int i4 = this.d;
        int i5 = this.l;
        int i6 = this.gf;
        int i7 = this.ga;
        int i8 = this.gd;
        int i9 = this.pts;
        boolean z = this.stillInTournament;
        StringBuilder sb = new StringBuilder("StandingDto(position=");
        sb.append(i);
        sb.append(", team=");
        sb.append(teamDto);
        sb.append(", mp=");
        d5d.a(sb, i2, ", w=", i3, ", d=");
        d5d.a(sb, i4, ", l=", i5, ", gf=");
        d5d.a(sb, i6, ", ga=", i7, ", gd=");
        d5d.a(sb, i8, ", pts=", i9, ", stillInTournament=");
        return mq0.a(sb, z, ")");
    }

    public StandingDto(int i, TeamDto teamDto, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z) {
        teamDto.getClass();
        this.position = i;
        this.team = teamDto;
        this.mp = i2;
        this.w = i3;
        this.d = i4;
        this.l = i5;
        this.gf = i6;
        this.ga = i7;
        this.gd = i8;
        this.pts = i9;
        this.stillInTournament = z;
    }
}
