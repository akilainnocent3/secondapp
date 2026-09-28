package com.sportybet.android.social.data.remote.entity;

import com.twilio.voice.EventKeys;
import defpackage.dja0;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.kwi;
import defpackage.mtg0;
import defpackage.ux5;
import defpackage.wxa;
import defpackage.zi50;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0013J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0013Jf\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0013J\u0010\u0010 \u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b \u0010\u0017J\u001a\u0010\"\u001a\u00020\t2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b'\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b*\u0010\u0017R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b\n\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b,\u0010\u0013R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b-\u0010\u0013¨\u0006."}, d2 = {"Lcom/sportybet/android/social/data/remote/entity/SocialMetaData;", "", "", "country", EventKeys.REGION, "avatar", "", "followings", "followers", "", "isFollowed", "userType", "bio", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZLjava/lang/String;Ljava/lang/String;)V", "Ldja0;", "getSocialUserType", "()Ldja0;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()I", "component5", "component6", "()Z", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZLjava/lang/String;Ljava/lang/String;)Lcom/sportybet/android/social/data/remote/entity/SocialMetaData;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCountry", "getRegion", "getAvatar", "I", "getFollowings", "getFollowers", "Z", "getUserType", "getBio", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SocialMetaData {
    public static final int $stable = 0;
    private final String avatar;
    private final String bio;
    private final String country;
    private final int followers;
    private final int followings;
    private final boolean isFollowed;
    private final String region;
    private final String userType;

    public SocialMetaData(String str, String str2, String str3, int i, int i2, boolean z, String str4, String str5) {
        str.getClass();
        str4.getClass();
        this.country = str;
        this.region = str2;
        this.avatar = str3;
        this.followings = i;
        this.followers = i2;
        this.isFollowed = z;
        this.userType = str4;
        this.bio = str5;
    }

    public static /* synthetic */ SocialMetaData copy$default(SocialMetaData socialMetaData, String str, String str2, String str3, int i, int i2, boolean z, String str4, String str5, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = socialMetaData.country;
        }
        if ((i3 & 2) != 0) {
            str2 = socialMetaData.region;
        }
        if ((i3 & 4) != 0) {
            str3 = socialMetaData.avatar;
        }
        if ((i3 & 8) != 0) {
            i = socialMetaData.followings;
        }
        if ((i3 & 16) != 0) {
            i2 = socialMetaData.followers;
        }
        if ((i3 & 32) != 0) {
            z = socialMetaData.isFollowed;
        }
        if ((i3 & 64) != 0) {
            str4 = socialMetaData.userType;
        }
        if ((i3 & 128) != 0) {
            str5 = socialMetaData.bio;
        }
        String str6 = str4;
        String str7 = str5;
        int i4 = i2;
        boolean z2 = z;
        return socialMetaData.copy(str, str2, str3, i, i4, z2, str6, str7);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRegion() {
        return this.region;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getFollowings() {
        return this.followings;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getFollowers() {
        return this.followers;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsFollowed() {
        return this.isFollowed;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getUserType() {
        return this.userType;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getBio() {
        return this.bio;
    }

    public final SocialMetaData copy(String country, String region, String avatar, int followings, int followers, boolean isFollowed, String userType, String bio) {
        country.getClass();
        userType.getClass();
        return new SocialMetaData(country, region, avatar, followings, followers, isFollowed, userType, bio);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SocialMetaData)) {
            return false;
        }
        SocialMetaData socialMetaData = (SocialMetaData) other;
        return Intrinsics.g(this.country, socialMetaData.country) && Intrinsics.g(this.region, socialMetaData.region) && Intrinsics.g(this.avatar, socialMetaData.avatar) && this.followings == socialMetaData.followings && this.followers == socialMetaData.followers && this.isFollowed == socialMetaData.isFollowed && Intrinsics.g(this.userType, socialMetaData.userType) && Intrinsics.g(this.bio, socialMetaData.bio);
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final String getBio() {
        return this.bio;
    }

    public final String getCountry() {
        return this.country;
    }

    public final int getFollowers() {
        return this.followers;
    }

    public final int getFollowings() {
        return this.followings;
    }

    public final String getRegion() {
        return this.region;
    }

    public final dja0 getSocialUserType() {
        Object bVar;
        try {
            zi50.a aVar = zi50.b;
            String upperCase = this.userType.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            bVar = dja0.valueOf(upperCase);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (zi50.a(bVar) != null) {
            bVar = dja0.b;
        }
        return (dja0) bVar;
    }

    public final String getUserType() {
        return this.userType;
    }

    public int hashCode() {
        int iHashCode = this.country.hashCode() * 31;
        String str = this.region;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.avatar;
        int iA = gmf0.a(mtg0.a(gpp.a(this.followers, gpp.a(this.followings, (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31), 31, this.isFollowed), 31, this.userType);
        String str3 = this.bio;
        return iA + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean isFollowed() {
        return this.isFollowed;
    }

    public String toString() {
        String str = this.country;
        String str2 = this.region;
        String str3 = this.avatar;
        int i = this.followings;
        int i2 = this.followers;
        boolean z = this.isFollowed;
        String str4 = this.userType;
        String str5 = this.bio;
        StringBuilder sbA = ux5.a("SocialMetaData(country=", str, ", region=", str2, ", avatar=");
        wxa.b(i, str3, ", followings=", ", followers=", sbA);
        sbA.append(i2);
        sbA.append(", isFollowed=");
        sbA.append(z);
        sbA.append(", userType=");
        return kwi.a(sbA, str4, ", bio=", str5, ")");
    }

    public /* synthetic */ SocialMetaData(String str, String str2, String str3, int i, int i2, boolean z, String str4, String str5, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i3 & 4) != 0 ? null : str3, i, i2, z, str4, str5);
    }
}
