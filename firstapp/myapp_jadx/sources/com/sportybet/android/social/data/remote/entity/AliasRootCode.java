package com.sportybet.android.social.data.remote.entity;

import com.twilio.voice.EventKeys;
import defpackage.gmf0;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000eJ:\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0014\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0006\u0010\u000eÊ\u0001\u0002\b\u001cÊ\u0001\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u001b"}, d2 = {"Lcom/sportybet/android/social/data/remote/entity/AliasRootCode;", "", EventKeys.ERROR_CODE, "", "countryCode", "userId", "isCreator", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getCode", "()Ljava/lang/String;", "getCountryCode", "getUserId", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/sportybet/android/social/data/remote/entity/AliasRootCode;", "equals", "other", "hashCode", "", "toString", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class AliasRootCode {
    public static final int $stable = 0;
    private final String code;
    private final String countryCode;
    private final Boolean isCreator;
    private final String userId;

    public AliasRootCode(String str, String str2, String str3, Boolean bool) {
        str.getClass();
        str2.getClass();
        this.code = str;
        this.countryCode = str2;
        this.userId = str3;
        this.isCreator = bool;
    }

    public static /* synthetic */ AliasRootCode copy$default(AliasRootCode aliasRootCode, String str, String str2, String str3, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aliasRootCode.code;
        }
        if ((i & 2) != 0) {
            str2 = aliasRootCode.countryCode;
        }
        if ((i & 4) != 0) {
            str3 = aliasRootCode.userId;
        }
        if ((i & 8) != 0) {
            bool = aliasRootCode.isCreator;
        }
        return aliasRootCode.copy(str, str2, str3, bool);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getIsCreator() {
        return this.isCreator;
    }

    public final AliasRootCode copy(String code, String countryCode, String userId, Boolean isCreator) {
        code.getClass();
        countryCode.getClass();
        return new AliasRootCode(code, countryCode, userId, isCreator);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AliasRootCode)) {
            return false;
        }
        AliasRootCode aliasRootCode = (AliasRootCode) other;
        return Intrinsics.g(this.code, aliasRootCode.code) && Intrinsics.g(this.countryCode, aliasRootCode.countryCode) && Intrinsics.g(this.userId, aliasRootCode.userId) && Intrinsics.g(this.isCreator, aliasRootCode.isCreator);
    }

    public final String getCode() {
        return this.code;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iA = gmf0.a(this.code.hashCode() * 31, 31, this.countryCode);
        String str = this.userId;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isCreator;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean isCreator() {
        return this.isCreator;
    }

    public String toString() {
        String str = this.code;
        String str2 = this.countryCode;
        String str3 = this.userId;
        Boolean bool = this.isCreator;
        StringBuilder sbA = ux5.a("AliasRootCode(code=", str, ", countryCode=", str2, ", userId=");
        sbA.append(str3);
        sbA.append(", isCreator=");
        sbA.append(bool);
        sbA.append(")");
        return sbA.toString();
    }
}
