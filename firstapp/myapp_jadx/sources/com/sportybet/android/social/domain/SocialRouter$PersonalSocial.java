package com.sportybet.android.social.domain;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.social.domain.entity.SocialMineType;
import com.twilio.voice.EventKeys;
import defpackage.d5d;
import defpackage.dja0;
import defpackage.djx;
import defpackage.eal;
import defpackage.ffx;
import defpackage.gfx;
import defpackage.gpp;
import defpackage.mtg0;
import defpackage.nex;
import defpackage.nng;
import defpackage.nyf;
import defpackage.ohx;
import defpackage.vj5;
import defpackage.z620;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class SocialRouter$PersonalSocial implements ohx {
    public static final SocialRouter$PersonalSocial a = new SocialRouter$PersonalSocial();

    public static final class a extends djx<Data> {
        @Override // defpackage.djx
        public final Object a(String str, Bundle bundle) {
            bundle.getClass();
            str.getClass();
            return (Data) bundle.getParcelable(str);
        }

        @Override // defpackage.djx
        /* JADX INFO: renamed from: d */
        public final Data h(String str) {
            str.getClass();
            Object objE = new eal().e(Uri.decode(str), Data.class);
            objE.getClass();
            return (Data) objE;
        }

        @Override // defpackage.djx
        public final void e(Bundle bundle, String str, Data data) {
            str.getClass();
            bundle.putParcelable(str, data);
        }
    }

    public static Bundle a(Data data) {
        return vj5.a(new Pair("arg_personal_social_data", data));
    }

    @Override // defpackage.cjx
    public final List<nex> G0() {
        gfx gfxVar = new gfx();
        a aVar = new a(true);
        ffx.a aVar2 = gfxVar.a;
        aVar2.a = aVar;
        aVar2.b = true;
        Unit unit = Unit.a;
        return kotlin.collections.a.c(new nex("arg_personal_social_data", aVar2.a()));
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof SocialRouter$PersonalSocial);
    }

    public final int hashCode() {
        return -97353874;
    }

    public final String toString() {
        return "PersonalSocial";
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b\u0019\b\u0087\b\u0018\u0000 R2\u00020\u0001:\u0001SB©\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0010¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010#J\u0010\u0010)\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b)\u0010%J\u0010\u0010*\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b*\u0010%J\u0012\u0010+\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b-\u0010,J\u0012\u0010.\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b.\u0010,J\u0012\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010#J\u0010\u00100\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b0\u0010\u001bJ\u0010\u00101\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b1\u0010\u001bJ\u0010\u00102\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b2\u0010%J\u0010\u00103\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b5\u0010%J\u0012\u00106\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b6\u0010#J¼\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b9\u0010#J\u0010\u0010:\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b:\u0010\u001bJ\u001a\u0010=\u001a\u00020\u00042\b\u0010<\u001a\u0004\u0018\u00010;HÖ\u0003¢\u0006\u0004\b=\u0010>R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010?\u001a\u0004\b@\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010A\u001a\u0004\bB\u0010%R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010C\u001a\u0004\bD\u0010'R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010?\u001a\u0004\bE\u0010#R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010A\u001a\u0004\b\t\u0010%R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010A\u001a\u0004\bF\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010G\u001a\u0004\bH\u0010,R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010G\u001a\u0004\bI\u0010,R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010G\u001a\u0004\bJ\u0010,R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010?\u001a\u0004\bK\u0010#R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010L\u001a\u0004\bM\u0010\u001bR\u0017\u0010\u0012\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010L\u001a\u0004\bN\u0010\u001bR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010A\u001a\u0004\b\u0013\u0010%R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010O\u001a\u0004\bP\u00104R\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010A\u001a\u0004\b\u0016\u0010%R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010?\u001a\u0004\bQ\u0010#¨\u0006T"}, d2 = {"Lcom/sportybet/android/social/domain/SocialRouter$PersonalSocial$Data;", "Landroid/os/Parcelable;", "", "username", "", "fromCreation", "Lcom/sportybet/android/social/domain/entity/SocialMineType;", "mineType", "bookingCode", "isCodeLive", "previewCode", "Lcom/sporty/android/core/model/service/CountryCodeName;", "countryCode", "currentCountryCode", EventKeys.REGION, "avatarUrl", "", "followers", "followings", "isFollowed", "Ldja0;", "userType", "isCreator", "initialTab", "<init>", "(Ljava/lang/String;ZLcom/sportybet/android/social/domain/entity/SocialMineType;Ljava/lang/String;ZZLcom/sporty/android/core/model/service/CountryCodeName;Lcom/sporty/android/core/model/service/CountryCodeName;Lcom/sporty/android/core/model/service/CountryCodeName;Ljava/lang/String;IIZLdja0;ZLjava/lang/String;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "()Lcom/sportybet/android/social/domain/entity/SocialMineType;", "component4", "component5", "component6", "component7", "()Lcom/sporty/android/core/model/service/CountryCodeName;", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "()Ldja0;", "component15", "component16", "copy", "(Ljava/lang/String;ZLcom/sportybet/android/social/domain/entity/SocialMineType;Ljava/lang/String;ZZLcom/sporty/android/core/model/service/CountryCodeName;Lcom/sporty/android/core/model/service/CountryCodeName;Lcom/sporty/android/core/model/service/CountryCodeName;Ljava/lang/String;IIZLdja0;ZLjava/lang/String;)Lcom/sportybet/android/social/domain/SocialRouter$PersonalSocial$Data;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUsername", "Z", "getFromCreation", "Lcom/sportybet/android/social/domain/entity/SocialMineType;", "getMineType", "getBookingCode", "getPreviewCode", "Lcom/sporty/android/core/model/service/CountryCodeName;", "getCountryCode", "getCurrentCountryCode", "getRegion", "getAvatarUrl", "I", "getFollowers", "getFollowings", "Ldja0;", "getUserType", "getInitialTab", "Companion", "a", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Data implements Parcelable {
        public static final int $stable = 8;
        private final String avatarUrl;
        private final String bookingCode;
        private final CountryCodeName countryCode;
        private final CountryCodeName currentCountryCode;
        private final int followers;
        private final int followings;
        private final boolean fromCreation;
        private final String initialTab;
        private final boolean isCodeLive;
        private final boolean isCreator;
        private final boolean isFollowed;
        private final SocialMineType mineType;
        private final boolean previewCode;
        private final CountryCodeName region;
        private final dja0 userType;
        private final String username;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Parcelable.Creator<Data> CREATOR = new b();
        private static final Data EMPTY = new Data("", false, SocialMineType.NOT_MINE, null, false, false, null, null, null, null, 0, 0, false, dja0.b, false, null);

        /* JADX INFO: renamed from: com.sportybet.android.social.domain.SocialRouter$PersonalSocial$Data$a, reason: from kotlin metadata */
        public static final class Companion {
        }

        public static final class b implements Parcelable.Creator<Data> {
            @Override // android.os.Parcelable.Creator
            public final Data createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                parcel.getClass();
                String string = parcel.readString();
                boolean z3 = parcel.readInt() != 0;
                SocialMineType socialMineTypeCreateFromParcel = SocialMineType.CREATOR.createFromParcel(parcel);
                String string2 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z = false;
                    z2 = true;
                } else {
                    z = false;
                    z2 = false;
                }
                boolean z4 = parcel.readInt() != 0 ? true : z;
                CountryCodeName countryCodeNameValueOf = parcel.readInt() == 0 ? null : CountryCodeName.valueOf(parcel.readString());
                CountryCodeName countryCodeNameValueOf2 = parcel.readInt() == 0 ? null : CountryCodeName.valueOf(parcel.readString());
                CountryCodeName countryCodeNameValueOf3 = parcel.readInt() != 0 ? CountryCodeName.valueOf(parcel.readString()) : null;
                String string3 = parcel.readString();
                boolean z5 = z;
                CountryCodeName countryCodeName = countryCodeNameValueOf2;
                int i = parcel.readInt();
                CountryCodeName countryCodeName2 = countryCodeNameValueOf;
                CountryCodeName countryCodeName3 = countryCodeNameValueOf3;
                int i2 = parcel.readInt();
                if (parcel.readInt() != 0) {
                    z5 = true;
                }
                dja0 dja0VarValueOf = dja0.valueOf(parcel.readString());
                if (parcel.readInt() != 0) {
                    z5 = true;
                }
                return new Data(string, z3, socialMineTypeCreateFromParcel, string2, z2, z4, countryCodeName2, countryCodeName, countryCodeName3, string3, i, i2, z5, dja0VarValueOf, z5, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Data[] newArray(int i) {
                return new Data[i];
            }
        }

        public /* synthetic */ Data(String str, boolean z, SocialMineType socialMineType, String str2, boolean z2, boolean z3, CountryCodeName countryCodeName, CountryCodeName countryCodeName2, CountryCodeName countryCodeName3, String str3, int i, int i2, boolean z4, dja0 dja0Var, boolean z5, String str4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i3 & 2) != 0 ? false : z, (i3 & 4) != 0 ? SocialMineType.NOT_MINE : socialMineType, (i3 & 8) != 0 ? null : str2, (i3 & 16) != 0 ? false : z2, (i3 & 32) != 0 ? false : z3, countryCodeName, countryCodeName2, countryCodeName3, (i3 & 512) != 0 ? null : str3, (i3 & 1024) != 0 ? 0 : i, (i3 & 2048) != 0 ? 0 : i2, (i3 & 4096) != 0 ? false : z4, (i3 & 8192) != 0 ? dja0.b : dja0Var, z5, (i3 & 32768) != 0 ? null : str4);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUsername() {
            return this.username;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final String getAvatarUrl() {
            return this.avatarUrl;
        }

        /* JADX INFO: renamed from: component11, reason: from getter */
        public final int getFollowers() {
            return this.followers;
        }

        /* JADX INFO: renamed from: component12, reason: from getter */
        public final int getFollowings() {
            return this.followings;
        }

        /* JADX INFO: renamed from: component13, reason: from getter */
        public final boolean getIsFollowed() {
            return this.isFollowed;
        }

        /* JADX INFO: renamed from: component14, reason: from getter */
        public final dja0 getUserType() {
            return this.userType;
        }

        /* JADX INFO: renamed from: component15, reason: from getter */
        public final boolean getIsCreator() {
            return this.isCreator;
        }

        /* JADX INFO: renamed from: component16, reason: from getter */
        public final String getInitialTab() {
            return this.initialTab;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getFromCreation() {
            return this.fromCreation;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final SocialMineType getMineType() {
            return this.mineType;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getBookingCode() {
            return this.bookingCode;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final boolean getIsCodeLive() {
            return this.isCodeLive;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final boolean getPreviewCode() {
            return this.previewCode;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final CountryCodeName getCountryCode() {
            return this.countryCode;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final CountryCodeName getCurrentCountryCode() {
            return this.currentCountryCode;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final CountryCodeName getRegion() {
            return this.region;
        }

        public final Data copy(String username, boolean fromCreation, SocialMineType mineType, String bookingCode, boolean isCodeLive, boolean previewCode, CountryCodeName countryCode, CountryCodeName currentCountryCode, CountryCodeName region, String avatarUrl, int followers, int followings, boolean isFollowed, dja0 userType, boolean isCreator, String initialTab) {
            username.getClass();
            mineType.getClass();
            userType.getClass();
            return new Data(username, fromCreation, mineType, bookingCode, isCodeLive, previewCode, countryCode, currentCountryCode, region, avatarUrl, followers, followings, isFollowed, userType, isCreator, initialTab);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return Intrinsics.g(this.username, data.username) && this.fromCreation == data.fromCreation && this.mineType == data.mineType && Intrinsics.g(this.bookingCode, data.bookingCode) && this.isCodeLive == data.isCodeLive && this.previewCode == data.previewCode && this.countryCode == data.countryCode && this.currentCountryCode == data.currentCountryCode && this.region == data.region && Intrinsics.g(this.avatarUrl, data.avatarUrl) && this.followers == data.followers && this.followings == data.followings && this.isFollowed == data.isFollowed && this.userType == data.userType && this.isCreator == data.isCreator && Intrinsics.g(this.initialTab, data.initialTab);
        }

        public final String getAvatarUrl() {
            return this.avatarUrl;
        }

        public final String getBookingCode() {
            return this.bookingCode;
        }

        public final CountryCodeName getCountryCode() {
            return this.countryCode;
        }

        public final CountryCodeName getCurrentCountryCode() {
            return this.currentCountryCode;
        }

        public final int getFollowers() {
            return this.followers;
        }

        public final int getFollowings() {
            return this.followings;
        }

        public final boolean getFromCreation() {
            return this.fromCreation;
        }

        public final String getInitialTab() {
            return this.initialTab;
        }

        public final SocialMineType getMineType() {
            return this.mineType;
        }

        public final boolean getPreviewCode() {
            return this.previewCode;
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
            int iHashCode = (this.mineType.hashCode() + mtg0.a(this.username.hashCode() * 31, 31, this.fromCreation)) * 31;
            String str = this.bookingCode;
            int iA = mtg0.a(mtg0.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.isCodeLive), 31, this.previewCode);
            CountryCodeName countryCodeName = this.countryCode;
            int iHashCode2 = (iA + (countryCodeName == null ? 0 : countryCodeName.hashCode())) * 31;
            CountryCodeName countryCodeName2 = this.currentCountryCode;
            int iHashCode3 = (iHashCode2 + (countryCodeName2 == null ? 0 : countryCodeName2.hashCode())) * 31;
            CountryCodeName countryCodeName3 = this.region;
            int iHashCode4 = (iHashCode3 + (countryCodeName3 == null ? 0 : countryCodeName3.hashCode())) * 31;
            String str2 = this.avatarUrl;
            int iA2 = mtg0.a((this.userType.hashCode() + mtg0.a(gpp.a(this.followings, gpp.a(this.followers, (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31), 31, this.isFollowed)) * 31, 31, this.isCreator);
            String str3 = this.initialTab;
            return iA2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final boolean isCodeLive() {
            return this.isCodeLive;
        }

        public final boolean isCreator() {
            return this.isCreator;
        }

        public final boolean isFollowed() {
            return this.isFollowed;
        }

        public String toString() {
            String str = this.username;
            boolean z = this.fromCreation;
            SocialMineType socialMineType = this.mineType;
            String str2 = this.bookingCode;
            boolean z2 = this.isCodeLive;
            boolean z3 = this.previewCode;
            CountryCodeName countryCodeName = this.countryCode;
            CountryCodeName countryCodeName2 = this.currentCountryCode;
            CountryCodeName countryCodeName3 = this.region;
            String str3 = this.avatarUrl;
            int i = this.followers;
            int i2 = this.followings;
            boolean z4 = this.isFollowed;
            dja0 dja0Var = this.userType;
            boolean z5 = this.isCreator;
            String str4 = this.initialTab;
            StringBuilder sbA = z620.a("Data(username=", str, ", fromCreation=", ", mineType=", z);
            sbA.append(socialMineType);
            sbA.append(", bookingCode=");
            sbA.append(str2);
            sbA.append(", isCodeLive=");
            nng.a(", previewCode=", ", countryCode=", sbA, z2, z3);
            sbA.append(countryCodeName);
            sbA.append(", currentCountryCode=");
            sbA.append(countryCodeName2);
            sbA.append(", region=");
            sbA.append(countryCodeName3);
            sbA.append(", avatarUrl=");
            sbA.append(str3);
            sbA.append(", followers=");
            d5d.a(sbA, i, ", followings=", i2, ", isFollowed=");
            sbA.append(z4);
            sbA.append(", userType=");
            sbA.append(dja0Var);
            sbA.append(", isCreator=");
            return nyf.a(", initialTab=", str4, ")", sbA, z5);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeString(this.username);
            dest.writeInt(this.fromCreation ? 1 : 0);
            this.mineType.writeToParcel(dest, flags);
            dest.writeString(this.bookingCode);
            dest.writeInt(this.isCodeLive ? 1 : 0);
            dest.writeInt(this.previewCode ? 1 : 0);
            CountryCodeName countryCodeName = this.countryCode;
            if (countryCodeName == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(countryCodeName.name());
            }
            CountryCodeName countryCodeName2 = this.currentCountryCode;
            if (countryCodeName2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(countryCodeName2.name());
            }
            CountryCodeName countryCodeName3 = this.region;
            if (countryCodeName3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(countryCodeName3.name());
            }
            dest.writeString(this.avatarUrl);
            dest.writeInt(this.followers);
            dest.writeInt(this.followings);
            dest.writeInt(this.isFollowed ? 1 : 0);
            dest.writeString(this.userType.name());
            dest.writeInt(this.isCreator ? 1 : 0);
            dest.writeString(this.initialTab);
        }

        public Data(String str, boolean z, SocialMineType socialMineType, String str2, boolean z2, boolean z3, CountryCodeName countryCodeName, CountryCodeName countryCodeName2, CountryCodeName countryCodeName3, String str3, int i, int i2, boolean z4, dja0 dja0Var, boolean z5, String str4) {
            str.getClass();
            socialMineType.getClass();
            dja0Var.getClass();
            this.username = str;
            this.fromCreation = z;
            this.mineType = socialMineType;
            this.bookingCode = str2;
            this.isCodeLive = z2;
            this.previewCode = z3;
            this.countryCode = countryCodeName;
            this.currentCountryCode = countryCodeName2;
            this.region = countryCodeName3;
            this.avatarUrl = str3;
            this.followers = i;
            this.followings = i2;
            this.isFollowed = z4;
            this.userType = dja0Var;
            this.isCreator = z5;
            this.initialTab = str4;
        }
    }
}
