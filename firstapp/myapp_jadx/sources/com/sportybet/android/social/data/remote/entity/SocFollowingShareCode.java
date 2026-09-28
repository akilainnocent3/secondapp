package com.sportybet.android.social.data.remote.entity;

import com.twilio.voice.EventKeys;
import defpackage.gmf0;
import defpackage.hxa;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011Ê\u0001\u0002\b\u001fÊ\u0001\f\b \u0012\b\b!\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u001e"}, d2 = {"Lcom/sportybet/android/social/data/remote/entity/SocFollowingShareCode;", "", "nickname", "", "avatar", "country", "userType", EventKeys.ERROR_CODE, "Lcom/sportybet/android/social/data/remote/entity/SocShareCode;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sportybet/android/social/data/remote/entity/SocShareCode;)V", "getNickname", "()Ljava/lang/String;", "getAvatar", "getCountry", "getUserType", "getCode", "()Lcom/sportybet/android/social/data/remote/entity/SocShareCode;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SocFollowingShareCode {
    public static final int $stable = SocShareCode.$stable;
    private final String avatar;
    private final SocShareCode code;
    private final String country;
    private final String nickname;
    private final String userType;

    public SocFollowingShareCode(String str, String str2, String str3, String str4, SocShareCode socShareCode) {
        str.getClass();
        str3.getClass();
        str4.getClass();
        socShareCode.getClass();
        this.nickname = str;
        this.avatar = str2;
        this.country = str3;
        this.userType = str4;
        this.code = socShareCode;
    }

    public static /* synthetic */ SocFollowingShareCode copy$default(SocFollowingShareCode socFollowingShareCode, String str, String str2, String str3, String str4, SocShareCode socShareCode, int i, Object obj) {
        if ((i & 1) != 0) {
            str = socFollowingShareCode.nickname;
        }
        if ((i & 2) != 0) {
            str2 = socFollowingShareCode.avatar;
        }
        if ((i & 4) != 0) {
            str3 = socFollowingShareCode.country;
        }
        if ((i & 8) != 0) {
            str4 = socFollowingShareCode.userType;
        }
        if ((i & 16) != 0) {
            socShareCode = socFollowingShareCode.code;
        }
        SocShareCode socShareCode2 = socShareCode;
        String str5 = str3;
        return socFollowingShareCode.copy(str, str2, str5, str4, socShareCode2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUserType() {
        return this.userType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final SocShareCode getCode() {
        return this.code;
    }

    public final SocFollowingShareCode copy(String nickname, String avatar, String country, String userType, SocShareCode code) {
        nickname.getClass();
        country.getClass();
        userType.getClass();
        code.getClass();
        return new SocFollowingShareCode(nickname, avatar, country, userType, code);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SocFollowingShareCode)) {
            return false;
        }
        SocFollowingShareCode socFollowingShareCode = (SocFollowingShareCode) other;
        return Intrinsics.g(this.nickname, socFollowingShareCode.nickname) && Intrinsics.g(this.avatar, socFollowingShareCode.avatar) && Intrinsics.g(this.country, socFollowingShareCode.country) && Intrinsics.g(this.userType, socFollowingShareCode.userType) && Intrinsics.g(this.code, socFollowingShareCode.code);
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final SocShareCode getCode() {
        return this.code;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getUserType() {
        return this.userType;
    }

    public int hashCode() {
        int iHashCode = this.nickname.hashCode() * 31;
        String str = this.avatar;
        return this.code.hashCode() + gmf0.a(gmf0.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.country), 31, this.userType);
    }

    public String toString() {
        String str = this.nickname;
        String str2 = this.avatar;
        String str3 = this.country;
        String str4 = this.userType;
        SocShareCode socShareCode = this.code;
        StringBuilder sbA = ux5.a("SocFollowingShareCode(nickname=", str, ", avatar=", str2, ", country=");
        hxa.c(sbA, str3, ", userType=", str4, ", code=");
        sbA.append(socShareCode);
        sbA.append(")");
        return sbA.toString();
    }

    public /* synthetic */ SocFollowingShareCode(String str, String str2, String str3, String str4, SocShareCode socShareCode, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, str3, str4, socShareCode);
    }
}
