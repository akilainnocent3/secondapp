package com.sportybet.android.social.domain.entity;

import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.instantwin.presentation.buildandgo.sTE.siPCzPFw;
import com.twilio.voice.EventKeys;
import defpackage.d5d;
import defpackage.dja0;
import defpackage.gpp;
import defpackage.mtg0;
import defpackage.uf80;
import defpackage.z620;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b-\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0016J\u0010\u0010\u001f\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010\u0018J\u0010\u0010#\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u0016J\u0082\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u0016J\u0010\u0010)\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b)\u0010 J\u001a\u0010+\u001a\u00020\u00042\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010\u001aR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u0010\u001cR\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b5\u0010\u001cR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b6\u0010\u0016R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00107\u001a\u0004\b8\u0010 R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000e\u00107\u001a\u0004\b9\u0010 R\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010/\u001a\u0004\b\u000f\u0010\u0018R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010:\u001a\u0004\b;\u0010$R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010-\u001a\u0004\b<\u0010\u0016¨\u0006="}, d2 = {"Lcom/sportybet/android/social/domain/entity/SocialProfileState;", "", "", "username", "", "nameVerified", "Lcom/sportybet/android/social/domain/entity/SocialMineType;", "mineType", "Lcom/sporty/android/core/model/service/CountryCodeName;", "countryCode", EventKeys.REGION, "avatarUrl", "", "followings", "followers", "isFollowed", "Ldja0;", "userType", "bio", "<init>", "(Ljava/lang/String;ZLcom/sportybet/android/social/domain/entity/SocialMineType;Lcom/sporty/android/core/model/service/CountryCodeName;Lcom/sporty/android/core/model/service/CountryCodeName;Ljava/lang/String;IIZLdja0;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "()Lcom/sportybet/android/social/domain/entity/SocialMineType;", "component4", "()Lcom/sporty/android/core/model/service/CountryCodeName;", "component5", "component6", "component7", "()I", "component8", "component9", "component10", "()Ldja0;", "component11", "copy", "(Ljava/lang/String;ZLcom/sportybet/android/social/domain/entity/SocialMineType;Lcom/sporty/android/core/model/service/CountryCodeName;Lcom/sporty/android/core/model/service/CountryCodeName;Ljava/lang/String;IIZLdja0;Ljava/lang/String;)Lcom/sportybet/android/social/domain/entity/SocialProfileState;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUsername", "Z", "getNameVerified", "Lcom/sportybet/android/social/domain/entity/SocialMineType;", "getMineType", "Lcom/sporty/android/core/model/service/CountryCodeName;", "getCountryCode", "getRegion", "getAvatarUrl", "I", "getFollowings", "getFollowers", "Ldja0;", "getUserType", "getBio", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SocialProfileState {
    public static final int $stable = 0;
    private final String avatarUrl;
    private final String bio;
    private final CountryCodeName countryCode;
    private final int followers;
    private final int followings;
    private final boolean isFollowed;
    private final SocialMineType mineType;
    private final boolean nameVerified;
    private final CountryCodeName region;
    private final dja0 userType;
    private final String username;

    public SocialProfileState(String str, boolean z, SocialMineType socialMineType, CountryCodeName countryCodeName, CountryCodeName countryCodeName2, String str2, int i, int i2, boolean z2, dja0 dja0Var, String str3) {
        str.getClass();
        socialMineType.getClass();
        countryCodeName.getClass();
        countryCodeName2.getClass();
        dja0Var.getClass();
        this.username = str;
        this.nameVerified = z;
        this.mineType = socialMineType;
        this.countryCode = countryCodeName;
        this.region = countryCodeName2;
        this.avatarUrl = str2;
        this.followings = i;
        this.followers = i2;
        this.isFollowed = z2;
        this.userType = dja0Var;
        this.bio = str3;
    }

    public static /* synthetic */ SocialProfileState copy$default(SocialProfileState socialProfileState, String str, boolean z, SocialMineType socialMineType, CountryCodeName countryCodeName, CountryCodeName countryCodeName2, String str2, int i, int i2, boolean z2, dja0 dja0Var, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = socialProfileState.username;
        }
        if ((i3 & 2) != 0) {
            z = socialProfileState.nameVerified;
        }
        if ((i3 & 4) != 0) {
            socialMineType = socialProfileState.mineType;
        }
        if ((i3 & 8) != 0) {
            countryCodeName = socialProfileState.countryCode;
        }
        if ((i3 & 16) != 0) {
            countryCodeName2 = socialProfileState.region;
        }
        if ((i3 & 32) != 0) {
            str2 = socialProfileState.avatarUrl;
        }
        if ((i3 & 64) != 0) {
            i = socialProfileState.followings;
        }
        if ((i3 & 128) != 0) {
            i2 = socialProfileState.followers;
        }
        if ((i3 & 256) != 0) {
            z2 = socialProfileState.isFollowed;
        }
        if ((i3 & 512) != 0) {
            dja0Var = socialProfileState.userType;
        }
        if ((i3 & 1024) != 0) {
            str3 = socialProfileState.bio;
        }
        dja0 dja0Var2 = dja0Var;
        String str4 = str3;
        int i4 = i2;
        boolean z3 = z2;
        String str5 = str2;
        int i5 = i;
        CountryCodeName countryCodeName3 = countryCodeName2;
        SocialMineType socialMineType2 = socialMineType;
        return socialProfileState.copy(str, z, socialMineType2, countryCodeName, countryCodeName3, str5, i5, i4, z3, dja0Var2, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final dja0 getUserType() {
        return this.userType;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getBio() {
        return this.bio;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getNameVerified() {
        return this.nameVerified;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SocialMineType getMineType() {
        return this.mineType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final CountryCodeName getCountryCode() {
        return this.countryCode;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final CountryCodeName getRegion() {
        return this.region;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getFollowings() {
        return this.followings;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getFollowers() {
        return this.followers;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIsFollowed() {
        return this.isFollowed;
    }

    public final SocialProfileState copy(String username, boolean nameVerified, SocialMineType mineType, CountryCodeName countryCode, CountryCodeName region, String avatarUrl, int followings, int followers, boolean isFollowed, dja0 userType, String bio) {
        username.getClass();
        mineType.getClass();
        countryCode.getClass();
        region.getClass();
        userType.getClass();
        return new SocialProfileState(username, nameVerified, mineType, countryCode, region, avatarUrl, followings, followers, isFollowed, userType, bio);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SocialProfileState)) {
            return false;
        }
        SocialProfileState socialProfileState = (SocialProfileState) other;
        return Intrinsics.g(this.username, socialProfileState.username) && this.nameVerified == socialProfileState.nameVerified && this.mineType == socialProfileState.mineType && this.countryCode == socialProfileState.countryCode && this.region == socialProfileState.region && Intrinsics.g(this.avatarUrl, socialProfileState.avatarUrl) && this.followings == socialProfileState.followings && this.followers == socialProfileState.followers && this.isFollowed == socialProfileState.isFollowed && this.userType == socialProfileState.userType && Intrinsics.g(this.bio, socialProfileState.bio);
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getBio() {
        return this.bio;
    }

    public final CountryCodeName getCountryCode() {
        return this.countryCode;
    }

    public final int getFollowers() {
        return this.followers;
    }

    public final int getFollowings() {
        return this.followings;
    }

    public final SocialMineType getMineType() {
        return this.mineType;
    }

    public final boolean getNameVerified() {
        return this.nameVerified;
    }

    public final CountryCodeName getRegion() {
        return this.region;
    }

    public final dja0 getUserType() {
        return this.userType;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        int iHashCode = (this.region.hashCode() + ((this.countryCode.hashCode() + ((this.mineType.hashCode() + mtg0.a(this.username.hashCode() * 31, 31, this.nameVerified)) * 31)) * 31)) * 31;
        String str = this.avatarUrl;
        int iHashCode2 = (this.userType.hashCode() + mtg0.a(gpp.a(this.followers, gpp.a(this.followings, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31, this.isFollowed)) * 31;
        String str2 = this.bio;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean isFollowed() {
        return this.isFollowed;
    }

    public String toString() {
        String str = this.username;
        boolean z = this.nameVerified;
        SocialMineType socialMineType = this.mineType;
        CountryCodeName countryCodeName = this.countryCode;
        CountryCodeName countryCodeName2 = this.region;
        String str2 = this.avatarUrl;
        int i = this.followings;
        int i2 = this.followers;
        boolean z2 = this.isFollowed;
        dja0 dja0Var = this.userType;
        String str3 = this.bio;
        StringBuilder sbA = z620.a("SocialProfileState(username=", str, ", nameVerified=", ", mineType=", z);
        sbA.append(socialMineType);
        sbA.append(", countryCode=");
        sbA.append(countryCodeName);
        sbA.append(", region=");
        sbA.append(countryCodeName2);
        sbA.append(siPCzPFw.uDsFZWU);
        sbA.append(str2);
        sbA.append(", followings=");
        d5d.a(sbA, i, ", followers=", i2, ", isFollowed=");
        sbA.append(z2);
        sbA.append(", userType=");
        sbA.append(dja0Var);
        sbA.append(", bio=");
        return uf80.a(sbA, str3, ")");
    }
}
