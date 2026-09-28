package com.sporty.android.core.model.worldcuptournament;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.gmf0;
import defpackage.hxa;
import defpackage.mq0;
import defpackage.ux5;
import defpackage.wd7;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0014\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0010Ê\u0001\u0002\b\u001d¨\u0006\u001c"}, d2 = {"Lcom/sporty/android/core/model/worldcuptournament/WorldCupTeam;", "", "nameCmsKey", "", AnalyticsParam.EVENT_PARAM_ID, "flagUrl", "countryCode", "isTeamEliminated", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getNameCmsKey", "()Ljava/lang/String;", "getId", "getFlagUrl", "getCountryCode", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class WorldCupTeam {
    private final String countryCode;
    private final String flagUrl;
    private final String id;
    private final boolean isTeamEliminated;
    private final String nameCmsKey;

    public WorldCupTeam(String str, String str2, String str3, String str4, boolean z) {
        wd7.a(str, str2, str3, str4);
        this.nameCmsKey = str;
        this.id = str2;
        this.flagUrl = str3;
        this.countryCode = str4;
        this.isTeamEliminated = z;
    }

    public static /* synthetic */ WorldCupTeam copy$default(WorldCupTeam worldCupTeam, String str, String str2, String str3, String str4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = worldCupTeam.nameCmsKey;
        }
        if ((i & 2) != 0) {
            str2 = worldCupTeam.id;
        }
        if ((i & 4) != 0) {
            str3 = worldCupTeam.flagUrl;
        }
        if ((i & 8) != 0) {
            str4 = worldCupTeam.countryCode;
        }
        if ((i & 16) != 0) {
            z = worldCupTeam.isTeamEliminated;
        }
        boolean z2 = z;
        String str5 = str3;
        return worldCupTeam.copy(str, str2, str5, str4, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNameCmsKey() {
        return this.nameCmsKey;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFlagUrl() {
        return this.flagUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsTeamEliminated() {
        return this.isTeamEliminated;
    }

    public final WorldCupTeam copy(String nameCmsKey, String id, String flagUrl, String countryCode, boolean isTeamEliminated) {
        nameCmsKey.getClass();
        id.getClass();
        flagUrl.getClass();
        countryCode.getClass();
        return new WorldCupTeam(nameCmsKey, id, flagUrl, countryCode, isTeamEliminated);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WorldCupTeam)) {
            return false;
        }
        WorldCupTeam worldCupTeam = (WorldCupTeam) other;
        return Intrinsics.g(this.nameCmsKey, worldCupTeam.nameCmsKey) && Intrinsics.g(this.id, worldCupTeam.id) && Intrinsics.g(this.flagUrl, worldCupTeam.flagUrl) && Intrinsics.g(this.countryCode, worldCupTeam.countryCode) && this.isTeamEliminated == worldCupTeam.isTeamEliminated;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getFlagUrl() {
        return this.flagUrl;
    }

    public final String getId() {
        return this.id;
    }

    public final String getNameCmsKey() {
        return this.nameCmsKey;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isTeamEliminated) + gmf0.a(gmf0.a(gmf0.a(this.nameCmsKey.hashCode() * 31, 31, this.id), 31, this.flagUrl), 31, this.countryCode);
    }

    public final boolean isTeamEliminated() {
        return this.isTeamEliminated;
    }

    public String toString() {
        String str = this.nameCmsKey;
        String str2 = this.id;
        String str3 = this.flagUrl;
        String str4 = this.countryCode;
        boolean z = this.isTeamEliminated;
        StringBuilder sbA = ux5.a("WorldCupTeam(nameCmsKey=", str, ", id=", str2, ", flagUrl=");
        hxa.c(sbA, str3, ", countryCode=", str4, ", isTeamEliminated=");
        return mq0.a(sbA, z, ")");
    }

    public /* synthetic */ WorldCupTeam(String str, String str2, String str3, String str4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? false : z);
    }
}
