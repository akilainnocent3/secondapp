package com.sporty.android.core.model.worldcuptournament;

import com.appsflyer.internal.m;
import defpackage.gmf0;
import defpackage.mtg0;
import defpackage.nyf;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bÊ\u0001\u0002\b\u001b¨\u0006\u001a"}, d2 = {"Lcom/sporty/android/core/model/worldcuptournament/WorldCupTournamentPageGroup;", "", "groupId", "", "groupTournamentId", "groupsBetNowDisabled", "", "groupName", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getGroupId", "()Ljava/lang/String;", "getGroupTournamentId", "getGroupsBetNowDisabled", "()Z", "getGroupName", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class WorldCupTournamentPageGroup {
    private final String groupId;
    private final String groupName;
    private final String groupTournamentId;
    private final boolean groupsBetNowDisabled;

    public WorldCupTournamentPageGroup(String str, String str2, boolean z, String str3) {
        m.a(str, str2, str3);
        this.groupId = str;
        this.groupTournamentId = str2;
        this.groupsBetNowDisabled = z;
        this.groupName = str3;
    }

    public static /* synthetic */ WorldCupTournamentPageGroup copy$default(WorldCupTournamentPageGroup worldCupTournamentPageGroup, String str, String str2, boolean z, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = worldCupTournamentPageGroup.groupId;
        }
        if ((i & 2) != 0) {
            str2 = worldCupTournamentPageGroup.groupTournamentId;
        }
        if ((i & 4) != 0) {
            z = worldCupTournamentPageGroup.groupsBetNowDisabled;
        }
        if ((i & 8) != 0) {
            str3 = worldCupTournamentPageGroup.groupName;
        }
        return worldCupTournamentPageGroup.copy(str, str2, z, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getGroupId() {
        return this.groupId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getGroupTournamentId() {
        return this.groupTournamentId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getGroupsBetNowDisabled() {
        return this.groupsBetNowDisabled;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getGroupName() {
        return this.groupName;
    }

    public final WorldCupTournamentPageGroup copy(String groupId, String groupTournamentId, boolean groupsBetNowDisabled, String groupName) {
        groupId.getClass();
        groupTournamentId.getClass();
        groupName.getClass();
        return new WorldCupTournamentPageGroup(groupId, groupTournamentId, groupsBetNowDisabled, groupName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WorldCupTournamentPageGroup)) {
            return false;
        }
        WorldCupTournamentPageGroup worldCupTournamentPageGroup = (WorldCupTournamentPageGroup) other;
        return Intrinsics.g(this.groupId, worldCupTournamentPageGroup.groupId) && Intrinsics.g(this.groupTournamentId, worldCupTournamentPageGroup.groupTournamentId) && this.groupsBetNowDisabled == worldCupTournamentPageGroup.groupsBetNowDisabled && Intrinsics.g(this.groupName, worldCupTournamentPageGroup.groupName);
    }

    public final String getGroupId() {
        return this.groupId;
    }

    public final String getGroupName() {
        return this.groupName;
    }

    public final String getGroupTournamentId() {
        return this.groupTournamentId;
    }

    public final boolean getGroupsBetNowDisabled() {
        return this.groupsBetNowDisabled;
    }

    public int hashCode() {
        return this.groupName.hashCode() + mtg0.a(gmf0.a(this.groupId.hashCode() * 31, 31, this.groupTournamentId), 31, this.groupsBetNowDisabled);
    }

    public String toString() {
        String str = this.groupId;
        String str2 = this.groupTournamentId;
        return nyf.a(", groupName=", this.groupName, ")", ux5.a("WorldCupTournamentPageGroup(groupId=", str, ", groupTournamentId=", str2, ", groupsBetNowDisabled="), this.groupsBetNowDisabled);
    }
}
