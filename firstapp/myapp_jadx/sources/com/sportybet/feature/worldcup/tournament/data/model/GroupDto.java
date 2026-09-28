package com.sportybet.feature.worldcup.tournament.data.model;

import defpackage.at6;
import defpackage.bt6;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.m2g;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J7\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012Ê\u0001\u0002\b\u001eÊ\u0001\f\b\u001f\u0012\b\b \u0012\u0004\b\u0003\u0010\u0000¨\u0006\u001d"}, d2 = {"Lcom/sportybet/feature/worldcup/tournament/data/model/GroupDto;", "", "groupId", "", "name", "displayOrder", "", "standings", "", "Lcom/sportybet/feature/worldcup/tournament/data/model/StandingDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)V", "getGroupId", "()Ljava/lang/String;", "getName", "getDisplayOrder", "()I", "getStandings", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "world-cup", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class GroupDto {
    public static final int $stable = 8;
    private final int displayOrder;
    private final String groupId;
    private final String name;
    private final List<StandingDto> standings;

    public GroupDto(String str, String str2, int i, List<StandingDto> list) {
        bt6.a(str, str2, list);
        this.groupId = str;
        this.name = str2;
        this.displayOrder = i;
        this.standings = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GroupDto copy$default(GroupDto groupDto, String str, String str2, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = groupDto.groupId;
        }
        if ((i2 & 2) != 0) {
            str2 = groupDto.name;
        }
        if ((i2 & 4) != 0) {
            i = groupDto.displayOrder;
        }
        if ((i2 & 8) != 0) {
            list = groupDto.standings;
        }
        return groupDto.copy(str, str2, i, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getGroupId() {
        return this.groupId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDisplayOrder() {
        return this.displayOrder;
    }

    public final List<StandingDto> component4() {
        return this.standings;
    }

    public final GroupDto copy(String groupId, String name, int displayOrder, List<StandingDto> standings) {
        groupId.getClass();
        name.getClass();
        standings.getClass();
        return new GroupDto(groupId, name, displayOrder, standings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GroupDto)) {
            return false;
        }
        GroupDto groupDto = (GroupDto) other;
        return Intrinsics.g(this.groupId, groupDto.groupId) && Intrinsics.g(this.name, groupDto.name) && this.displayOrder == groupDto.displayOrder && Intrinsics.g(this.standings, groupDto.standings);
    }

    public final int getDisplayOrder() {
        return this.displayOrder;
    }

    public final String getGroupId() {
        return this.groupId;
    }

    public final String getName() {
        return this.name;
    }

    public final List<StandingDto> getStandings() {
        return this.standings;
    }

    public int hashCode() {
        return this.standings.hashCode() + gpp.a(this.displayOrder, gmf0.a(this.groupId.hashCode() * 31, 31, this.name), 31);
    }

    public String toString() {
        String str = this.groupId;
        String str2 = this.name;
        return at6.b(ux5.a("GroupDto(groupId=", str, ", name=", str2, ", displayOrder="), this.displayOrder, ", standings=", this.standings, ")");
    }

    public GroupDto(String str, String str2, int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? m2g.a : list);
    }
}
