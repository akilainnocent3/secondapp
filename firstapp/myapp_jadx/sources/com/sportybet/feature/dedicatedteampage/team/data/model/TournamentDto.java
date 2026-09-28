package com.sportybet.feature.dedicatedteampage.team.data.model;

import com.appsflyer.internal.m;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.gmf0;
import defpackage.hxa;
import defpackage.uf80;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J?\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bÊ\u0001\u0002\b\u001dÊ\u0001\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u001c"}, d2 = {"Lcom/sportybet/feature/dedicatedteampage/team/data/model/TournamentDto;", "", AnalyticsParam.EVENT_PARAM_ID, "", "radarId", "name", "logoUri", "displayName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getRadarId", "getName", "getLogoUri", "getDisplayName", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "dedicated-team-page", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class TournamentDto {
    public static final int $stable = 0;
    private final String displayName;
    private final String id;
    private final String logoUri;
    private final String name;
    private final String radarId;

    public TournamentDto(String str, String str2, String str3, String str4, String str5) {
        m.a(str, str2, str3);
        this.id = str;
        this.radarId = str2;
        this.name = str3;
        this.logoUri = str4;
        this.displayName = str5;
    }

    public static /* synthetic */ TournamentDto copy$default(TournamentDto tournamentDto, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tournamentDto.id;
        }
        if ((i & 2) != 0) {
            str2 = tournamentDto.radarId;
        }
        if ((i & 4) != 0) {
            str3 = tournamentDto.name;
        }
        if ((i & 8) != 0) {
            str4 = tournamentDto.logoUri;
        }
        if ((i & 16) != 0) {
            str5 = tournamentDto.displayName;
        }
        String str6 = str5;
        String str7 = str3;
        return tournamentDto.copy(str, str2, str7, str4, str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRadarId() {
        return this.radarId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLogoUri() {
        return this.logoUri;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    public final TournamentDto copy(String id, String radarId, String name, String logoUri, String displayName) {
        id.getClass();
        radarId.getClass();
        name.getClass();
        return new TournamentDto(id, radarId, name, logoUri, displayName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TournamentDto)) {
            return false;
        }
        TournamentDto tournamentDto = (TournamentDto) other;
        return Intrinsics.g(this.id, tournamentDto.id) && Intrinsics.g(this.radarId, tournamentDto.radarId) && Intrinsics.g(this.name, tournamentDto.name) && Intrinsics.g(this.logoUri, tournamentDto.logoUri) && Intrinsics.g(this.displayName, tournamentDto.displayName);
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLogoUri() {
        return this.logoUri;
    }

    public final String getName() {
        return this.name;
    }

    public final String getRadarId() {
        return this.radarId;
    }

    public int hashCode() {
        int iA = gmf0.a(gmf0.a(this.id.hashCode() * 31, 31, this.radarId), 31, this.name);
        String str = this.logoUri;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.displayName;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.radarId;
        String str3 = this.name;
        String str4 = this.logoUri;
        String str5 = this.displayName;
        StringBuilder sbA = ux5.a("TournamentDto(id=", str, ", radarId=", str2, ", name=");
        hxa.c(sbA, str3, ", logoUri=", str4, ", displayName=");
        return uf80.a(sbA, str5, ")");
    }
}
