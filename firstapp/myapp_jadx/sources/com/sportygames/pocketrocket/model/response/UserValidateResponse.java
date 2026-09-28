package com.sportygames.pocketrocket.model.response;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.mng;
import defpackage.mtg0;
import defpackage.qn4;
import defpackage.uf80;
import defpackage.wxa;
import defpackage.z620;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J}\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010)\u001a\u00020\u00052\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\nHÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0013R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013¨\u0006-"}, d2 = {"Lcom/sportygames/pocketrocket/model/response/UserValidateResponse;", "", "currency", "", "isBlocked", "", "isChristmasTheme", "avatar", "nickName", AnalyticsParam.EVENT_PARAM_ID, "", "patronId", "phone", "seed", "isSeedRandom", "countryCode", "<init>", "(Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCurrency", "()Ljava/lang/String;", "()Z", "getAvatar", "getNickName", "getId", "()I", "getPatronId", "getPhone", "getSeed", "getCountryCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UserValidateResponse {
    public static final int $stable = 0;
    private final String avatar;
    private final String countryCode;
    private final String currency;
    private final int id;
    private final boolean isBlocked;
    private final boolean isChristmasTheme;
    private final String isSeedRandom;
    private final String nickName;
    private final String patronId;
    private final String phone;
    private final String seed;

    public UserValidateResponse(String str, boolean z, boolean z2, String str2, String str3, int i, String str4, String str5, String str6, String str7, String str8) {
        qn4.b(str, str4, str5, str7, str8);
        this.currency = str;
        this.isBlocked = z;
        this.isChristmasTheme = z2;
        this.avatar = str2;
        this.nickName = str3;
        this.id = i;
        this.patronId = str4;
        this.phone = str5;
        this.seed = str6;
        this.isSeedRandom = str7;
        this.countryCode = str8;
    }

    public static /* synthetic */ UserValidateResponse copy$default(UserValidateResponse userValidateResponse, String str, boolean z, boolean z2, String str2, String str3, int i, String str4, String str5, String str6, String str7, String str8, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = userValidateResponse.currency;
        }
        if ((i2 & 2) != 0) {
            z = userValidateResponse.isBlocked;
        }
        if ((i2 & 4) != 0) {
            z2 = userValidateResponse.isChristmasTheme;
        }
        if ((i2 & 8) != 0) {
            str2 = userValidateResponse.avatar;
        }
        if ((i2 & 16) != 0) {
            str3 = userValidateResponse.nickName;
        }
        if ((i2 & 32) != 0) {
            i = userValidateResponse.id;
        }
        if ((i2 & 64) != 0) {
            str4 = userValidateResponse.patronId;
        }
        if ((i2 & 128) != 0) {
            str5 = userValidateResponse.phone;
        }
        if ((i2 & 256) != 0) {
            str6 = userValidateResponse.seed;
        }
        if ((i2 & 512) != 0) {
            str7 = userValidateResponse.isSeedRandom;
        }
        if ((i2 & 1024) != 0) {
            str8 = userValidateResponse.countryCode;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        int i3 = i;
        String str13 = str4;
        String str14 = str3;
        boolean z3 = z2;
        return userValidateResponse.copy(str, z, z3, str2, str14, i3, str13, str11, str12, str9, str10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getIsSeedRandom() {
        return this.isSeedRandom;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsBlocked() {
        return this.isBlocked;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsChristmasTheme() {
        return this.isChristmasTheme;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPatronId() {
        return this.patronId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getSeed() {
        return this.seed;
    }

    public final UserValidateResponse copy(String currency, boolean isBlocked, boolean isChristmasTheme, String avatar, String nickName, int id, String patronId, String phone, String seed, String isSeedRandom, String countryCode) {
        currency.getClass();
        patronId.getClass();
        phone.getClass();
        isSeedRandom.getClass();
        countryCode.getClass();
        return new UserValidateResponse(currency, isBlocked, isChristmasTheme, avatar, nickName, id, patronId, phone, seed, isSeedRandom, countryCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserValidateResponse)) {
            return false;
        }
        UserValidateResponse userValidateResponse = (UserValidateResponse) other;
        return Intrinsics.g(this.currency, userValidateResponse.currency) && this.isBlocked == userValidateResponse.isBlocked && this.isChristmasTheme == userValidateResponse.isChristmasTheme && Intrinsics.g(this.avatar, userValidateResponse.avatar) && Intrinsics.g(this.nickName, userValidateResponse.nickName) && this.id == userValidateResponse.id && Intrinsics.g(this.patronId, userValidateResponse.patronId) && Intrinsics.g(this.phone, userValidateResponse.phone) && Intrinsics.g(this.seed, userValidateResponse.seed) && Intrinsics.g(this.isSeedRandom, userValidateResponse.isSeedRandom) && Intrinsics.g(this.countryCode, userValidateResponse.countryCode);
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final int getId() {
        return this.id;
    }

    public final String getNickName() {
        return this.nickName;
    }

    public final String getPatronId() {
        return this.patronId;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getSeed() {
        return this.seed;
    }

    public int hashCode() {
        int iA = mtg0.a(mtg0.a(this.currency.hashCode() * 31, 31, this.isBlocked), 31, this.isChristmasTheme);
        String str = this.avatar;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.nickName;
        int iA2 = gmf0.a(gmf0.a(gpp.a(this.id, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31, this.patronId), 31, this.phone);
        String str3 = this.seed;
        return this.countryCode.hashCode() + gmf0.a((iA2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.isSeedRandom);
    }

    public final boolean isBlocked() {
        return this.isBlocked;
    }

    public final boolean isChristmasTheme() {
        return this.isChristmasTheme;
    }

    public final String isSeedRandom() {
        return this.isSeedRandom;
    }

    public String toString() {
        String str = this.currency;
        boolean z = this.isBlocked;
        boolean z2 = this.isChristmasTheme;
        String str2 = this.avatar;
        String str3 = this.nickName;
        int i = this.id;
        String str4 = this.patronId;
        String str5 = this.phone;
        String str6 = this.seed;
        String str7 = this.isSeedRandom;
        String str8 = this.countryCode;
        StringBuilder sbA = z620.a("UserValidateResponse(currency=", str, ", isBlocked=", ", isChristmasTheme=", z);
        mng.a(", avatar=", str2, ", nickName=", sbA, z2);
        wxa.b(i, str3, ", id=", ", patronId=", sbA);
        hxa.c(sbA, str4, ", phone=", str5, ", seed=");
        hxa.c(sbA, str6, ", isSeedRandom=", str7, ", countryCode=");
        return uf80.a(sbA, str8, ")");
    }
}
