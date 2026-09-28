package com.sportybet.feature.worldcup.tournament.data.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bÊ\u0001\u0002\b\u0016Ê\u0001\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0015"}, d2 = {"Lcom/sportybet/feature/worldcup/tournament/data/model/SlotDto;", "", "placeholder", "", "team", "Lcom/sportybet/feature/worldcup/tournament/data/model/TeamDto;", "<init>", "(Ljava/lang/String;Lcom/sportybet/feature/worldcup/tournament/data/model/TeamDto;)V", "getPlaceholder", "()Ljava/lang/String;", "getTeam", "()Lcom/sportybet/feature/worldcup/tournament/data/model/TeamDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "world-cup", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SlotDto {
    public static final int $stable = TeamDto.$stable;
    private final String placeholder;
    private final TeamDto team;

    public /* synthetic */ SlotDto(String str, TeamDto teamDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : teamDto);
    }

    public static /* synthetic */ SlotDto copy$default(SlotDto slotDto, String str, TeamDto teamDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = slotDto.placeholder;
        }
        if ((i & 2) != 0) {
            teamDto = slotDto.team;
        }
        return slotDto.copy(str, teamDto);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TeamDto getTeam() {
        return this.team;
    }

    public final SlotDto copy(String placeholder, TeamDto team) {
        return new SlotDto(placeholder, team);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SlotDto)) {
            return false;
        }
        SlotDto slotDto = (SlotDto) other;
        return Intrinsics.g(this.placeholder, slotDto.placeholder) && Intrinsics.g(this.team, slotDto.team);
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    public final TeamDto getTeam() {
        return this.team;
    }

    public int hashCode() {
        String str = this.placeholder;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        TeamDto teamDto = this.team;
        return iHashCode + (teamDto != null ? teamDto.hashCode() : 0);
    }

    public String toString() {
        return "SlotDto(placeholder=" + this.placeholder + ", team=" + this.team + ")";
    }

    public SlotDto(String str, TeamDto teamDto) {
        this.placeholder = str;
        this.team = teamDto;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SlotDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
