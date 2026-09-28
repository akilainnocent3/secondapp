package com.sportygames.fruithunt.network.models;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.rg2;
import defpackage.ux5;
import defpackage.w03;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0014JJ\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lcom/sportygames/fruithunt/network/models/FHUserDataResponse;", "", "avatarUrl", "", "nickName", AnalyticsParam.EVENT_PARAM_ID, "", "patronId", "fixedOdds", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;)V", "getAvatarUrl", "()Ljava/lang/String;", "getNickName", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPatronId", "getFixedOdds", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/sportygames/fruithunt/network/models/FHUserDataResponse;", "equals", "other", "hashCode", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FHUserDataResponse {
    public static final int $stable = 0;
    private final String avatarUrl;
    private final Boolean fixedOdds;
    private final Integer id;
    private final String nickName;
    private final String patronId;

    public /* synthetic */ FHUserDataResponse(String str, String str2, Integer num, String str3, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str3, bool);
    }

    public static /* synthetic */ FHUserDataResponse copy$default(FHUserDataResponse fHUserDataResponse, String str, String str2, Integer num, String str3, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fHUserDataResponse.avatarUrl;
        }
        if ((i & 2) != 0) {
            str2 = fHUserDataResponse.nickName;
        }
        if ((i & 4) != 0) {
            num = fHUserDataResponse.id;
        }
        if ((i & 8) != 0) {
            str3 = fHUserDataResponse.patronId;
        }
        if ((i & 16) != 0) {
            bool = fHUserDataResponse.fixedOdds;
        }
        Boolean bool2 = bool;
        Integer num2 = num;
        return fHUserDataResponse.copy(str, str2, num2, str3, bool2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPatronId() {
        return this.patronId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getFixedOdds() {
        return this.fixedOdds;
    }

    public final FHUserDataResponse copy(String avatarUrl, String nickName, Integer id, String patronId, Boolean fixedOdds) {
        return new FHUserDataResponse(avatarUrl, nickName, id, patronId, fixedOdds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FHUserDataResponse)) {
            return false;
        }
        FHUserDataResponse fHUserDataResponse = (FHUserDataResponse) other;
        return Intrinsics.g(this.avatarUrl, fHUserDataResponse.avatarUrl) && Intrinsics.g(this.nickName, fHUserDataResponse.nickName) && Intrinsics.g(this.id, fHUserDataResponse.id) && Intrinsics.g(this.patronId, fHUserDataResponse.patronId) && Intrinsics.g(this.fixedOdds, fHUserDataResponse.fixedOdds);
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final Boolean getFixedOdds() {
        return this.fixedOdds;
    }

    public final Integer getId() {
        return this.id;
    }

    public final String getNickName() {
        return this.nickName;
    }

    public final String getPatronId() {
        return this.patronId;
    }

    public int hashCode() {
        String str = this.avatarUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.nickName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.id;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.patronId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.fixedOdds;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        String str = this.avatarUrl;
        String str2 = this.nickName;
        Integer num = this.id;
        String str3 = this.patronId;
        Boolean bool = this.fixedOdds;
        StringBuilder sbA = ux5.a("FHUserDataResponse(avatarUrl=", str, ", nickName=", str2, ", id=");
        w03.a(num, ", patronId=", str3, ", fixedOdds=", sbA);
        return rg2.a(sbA, bool, ")");
    }

    public FHUserDataResponse(String str, String str2, Integer num, String str3, Boolean bool) {
        this.avatarUrl = str;
        this.nickName = str2;
        this.id = num;
        this.patronId = str3;
        this.fixedOdds = bool;
    }
}
