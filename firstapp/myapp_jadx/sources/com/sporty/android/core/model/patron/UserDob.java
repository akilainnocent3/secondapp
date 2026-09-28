package com.sporty.android.core.model.patron;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.hxa;
import defpackage.ux5;
import defpackage.zk1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\fHÆ\u0003Js\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0014\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010'\u001a\u00020\fHÖ\u0081\u0004J\n\u0010(\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019Ê\u0001\u0002\b*¨\u0006)"}, d2 = {"Lcom/sporty/android/core/model/patron/UserDob;", "", "birthDate", "", "bvn", "dob", "firstName", AnalyticsParam.EVENT_PARAM_ID, "lastName", "mobile", "userId", "verifyFailureCount", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getBirthDate", "()Ljava/lang/String;", "getBvn", "getDob", "getFirstName", "getId", "getLastName", "getMobile", "getUserId", "getVerifyFailureCount", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class UserDob {
    private final String birthDate;
    private final String bvn;
    private final String dob;
    private final String firstName;
    private final String id;
    private final String lastName;
    private final String mobile;
    private final String userId;
    private final int verifyFailureCount;

    public UserDob(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i) {
        this.birthDate = str;
        this.bvn = str2;
        this.dob = str3;
        this.firstName = str4;
        this.id = str5;
        this.lastName = str6;
        this.mobile = str7;
        this.userId = str8;
        this.verifyFailureCount = i;
    }

    public static /* synthetic */ UserDob copy$default(UserDob userDob, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = userDob.birthDate;
        }
        if ((i2 & 2) != 0) {
            str2 = userDob.bvn;
        }
        if ((i2 & 4) != 0) {
            str3 = userDob.dob;
        }
        if ((i2 & 8) != 0) {
            str4 = userDob.firstName;
        }
        if ((i2 & 16) != 0) {
            str5 = userDob.id;
        }
        if ((i2 & 32) != 0) {
            str6 = userDob.lastName;
        }
        if ((i2 & 64) != 0) {
            str7 = userDob.mobile;
        }
        if ((i2 & 128) != 0) {
            str8 = userDob.userId;
        }
        if ((i2 & 256) != 0) {
            i = userDob.verifyFailureCount;
        }
        String str9 = str8;
        int i3 = i;
        String str10 = str6;
        String str11 = str7;
        String str12 = str5;
        String str13 = str3;
        return userDob.copy(str, str2, str13, str4, str12, str10, str11, str9, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBirthDate() {
        return this.birthDate;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBvn() {
        return this.bvn;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDob() {
        return this.dob;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getMobile() {
        return this.mobile;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getVerifyFailureCount() {
        return this.verifyFailureCount;
    }

    public final UserDob copy(String birthDate, String bvn, String dob, String firstName, String id, String lastName, String mobile, String userId, int verifyFailureCount) {
        return new UserDob(birthDate, bvn, dob, firstName, id, lastName, mobile, userId, verifyFailureCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserDob)) {
            return false;
        }
        UserDob userDob = (UserDob) other;
        return Intrinsics.g(this.birthDate, userDob.birthDate) && Intrinsics.g(this.bvn, userDob.bvn) && Intrinsics.g(this.dob, userDob.dob) && Intrinsics.g(this.firstName, userDob.firstName) && Intrinsics.g(this.id, userDob.id) && Intrinsics.g(this.lastName, userDob.lastName) && Intrinsics.g(this.mobile, userDob.mobile) && Intrinsics.g(this.userId, userDob.userId) && this.verifyFailureCount == userDob.verifyFailureCount;
    }

    public final String getBirthDate() {
        return this.birthDate;
    }

    public final String getBvn() {
        return this.bvn;
    }

    public final String getDob() {
        return this.dob;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getMobile() {
        return this.mobile;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final int getVerifyFailureCount() {
        return this.verifyFailureCount;
    }

    public int hashCode() {
        String str = this.birthDate;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.bvn;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.dob;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.firstName;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.id;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.lastName;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.mobile;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.userId;
        return Integer.hashCode(this.verifyFailureCount) + ((iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.birthDate;
        String str2 = this.bvn;
        String str3 = this.dob;
        String str4 = this.firstName;
        String str5 = this.id;
        String str6 = this.lastName;
        String str7 = this.mobile;
        String str8 = this.userId;
        int i = this.verifyFailureCount;
        StringBuilder sbA = ux5.a("UserDob(birthDate=", str, ", bvn=", str2, ", dob=");
        hxa.c(sbA, str3, ", firstName=", str4, ", id=");
        hxa.c(sbA, str5, ", lastName=", str6, ", mobile=");
        hxa.c(sbA, str7, ", userId=", str8, ", verifyFailureCount=");
        return zk1.a(i, ")", sbA);
    }
}
