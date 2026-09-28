package com.sporty.android.core.model.bookingcode;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR'\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fÊ\u0001\u0002\b\u001b¨\u0006\u001a"}, d2 = {"Lcom/sporty/android/core/model/bookingcode/CategoryDto;", "", AnalyticsParam.EVENT_PARAM_ID, "", "name", "tournament", "Lcom/sporty/android/core/model/bookingcode/TournamentDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/sporty/android/core/model/bookingcode/TournamentDto;)V", "getId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getName", "getTournament", "()Lcom/sporty/android/core/model/bookingcode/TournamentDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CategoryDto {

    @SerializedName(AnalyticsParam.EVENT_PARAM_ID)
    private final String id;

    @SerializedName("name")
    private final String name;

    @SerializedName("tournament")
    private final TournamentDto tournament;

    public /* synthetic */ CategoryDto(String str, String str2, TournamentDto tournamentDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : tournamentDto);
    }

    public static /* synthetic */ CategoryDto copy$default(CategoryDto categoryDto, String str, String str2, TournamentDto tournamentDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = categoryDto.id;
        }
        if ((i & 2) != 0) {
            str2 = categoryDto.name;
        }
        if ((i & 4) != 0) {
            tournamentDto = categoryDto.tournament;
        }
        return categoryDto.copy(str, str2, tournamentDto);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TournamentDto getTournament() {
        return this.tournament;
    }

    public final CategoryDto copy(String id, String name, TournamentDto tournament) {
        return new CategoryDto(id, name, tournament);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CategoryDto)) {
            return false;
        }
        CategoryDto categoryDto = (CategoryDto) other;
        return Intrinsics.g(this.id, categoryDto.id) && Intrinsics.g(this.name, categoryDto.name) && Intrinsics.g(this.tournament, categoryDto.tournament);
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final TournamentDto getTournament() {
        return this.tournament;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        TournamentDto tournamentDto = this.tournament;
        return iHashCode2 + (tournamentDto != null ? tournamentDto.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        TournamentDto tournamentDto = this.tournament;
        StringBuilder sbA = ux5.a("CategoryDto(id=", str, ", name=", str2, ", tournament=");
        sbA.append(tournamentDto);
        sbA.append(")");
        return sbA.toString();
    }

    public CategoryDto(String str, String str2, TournamentDto tournamentDto) {
        this.id = str;
        this.name = str2;
        this.tournament = tournamentDto;
    }

    public CategoryDto() {
        this(null, null, null, 7, null);
    }
}
