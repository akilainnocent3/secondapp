package com.sporty.android.core.model.patron;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.f78;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.kwi;
import defpackage.ux5;
import defpackage.wd7;
import defpackage.wxa;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003Ju\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0014\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010*\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010+\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011Ê\u0001\u0002\b-¨\u0006,"}, d2 = {"Lcom/sporty/android/core/model/patron/UserCertInfo;", "", "bvnStatus", "", "createTime", "dataSource", "", "email", "firstName", "lastName", "operator", AnalyticsParam.EVENT_STATUS, "updateTime", "userId", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getBvnStatus", "()Ljava/lang/String;", "getCreateTime", "getDataSource", "()I", "getEmail", "getFirstName", "getLastName", "getOperator", "getStatus", "getUpdateTime", "getUserId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class UserCertInfo {
    private final String bvnStatus;
    private final String createTime;
    private final int dataSource;
    private final String email;
    private final String firstName;
    private final String lastName;
    private final String operator;
    private final int status;
    private final String updateTime;
    private final String userId;

    public /* synthetic */ UserCertInfo(String str, String str2, int i, String str3, String str4, String str5, String str6, int i2, String str7, String str8, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? "" : str3, (i3 & 16) != 0 ? "" : str4, (i3 & 32) != 0 ? "" : str5, (i3 & 64) != 0 ? "" : str6, (i3 & 128) != 0 ? 0 : i2, (i3 & 256) != 0 ? "" : str7, (i3 & 512) != 0 ? "" : str8);
    }

    public static /* synthetic */ UserCertInfo copy$default(UserCertInfo userCertInfo, String str, String str2, int i, String str3, String str4, String str5, String str6, int i2, String str7, String str8, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = userCertInfo.bvnStatus;
        }
        if ((i3 & 2) != 0) {
            str2 = userCertInfo.createTime;
        }
        if ((i3 & 4) != 0) {
            i = userCertInfo.dataSource;
        }
        if ((i3 & 8) != 0) {
            str3 = userCertInfo.email;
        }
        if ((i3 & 16) != 0) {
            str4 = userCertInfo.firstName;
        }
        if ((i3 & 32) != 0) {
            str5 = userCertInfo.lastName;
        }
        if ((i3 & 64) != 0) {
            str6 = userCertInfo.operator;
        }
        if ((i3 & 128) != 0) {
            i2 = userCertInfo.status;
        }
        if ((i3 & 256) != 0) {
            str7 = userCertInfo.updateTime;
        }
        if ((i3 & 512) != 0) {
            str8 = userCertInfo.userId;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str6;
        int i4 = i2;
        String str12 = str4;
        String str13 = str5;
        return userCertInfo.copy(str, str2, i, str3, str12, str13, str11, i4, str9, str10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBvnStatus() {
        return this.bvnStatus;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCreateTime() {
        return this.createTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDataSource() {
        return this.dataSource;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getOperator() {
        return this.operator;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getUpdateTime() {
        return this.updateTime;
    }

    public final UserCertInfo copy(String bvnStatus, String createTime, int dataSource, String email, String firstName, String lastName, String operator, int status, String updateTime, String userId) {
        bvnStatus.getClass();
        createTime.getClass();
        updateTime.getClass();
        userId.getClass();
        return new UserCertInfo(bvnStatus, createTime, dataSource, email, firstName, lastName, operator, status, updateTime, userId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserCertInfo)) {
            return false;
        }
        UserCertInfo userCertInfo = (UserCertInfo) other;
        return Intrinsics.g(this.bvnStatus, userCertInfo.bvnStatus) && Intrinsics.g(this.createTime, userCertInfo.createTime) && this.dataSource == userCertInfo.dataSource && Intrinsics.g(this.email, userCertInfo.email) && Intrinsics.g(this.firstName, userCertInfo.firstName) && Intrinsics.g(this.lastName, userCertInfo.lastName) && Intrinsics.g(this.operator, userCertInfo.operator) && this.status == userCertInfo.status && Intrinsics.g(this.updateTime, userCertInfo.updateTime) && Intrinsics.g(this.userId, userCertInfo.userId);
    }

    public final String getBvnStatus() {
        return this.bvnStatus;
    }

    public final String getCreateTime() {
        return this.createTime;
    }

    public final int getDataSource() {
        return this.dataSource;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getOperator() {
        return this.operator;
    }

    public final int getStatus() {
        return this.status;
    }

    public final String getUpdateTime() {
        return this.updateTime;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iA = gpp.a(this.dataSource, gmf0.a(this.bvnStatus.hashCode() * 31, 31, this.createTime), 31);
        String str = this.email;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.firstName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lastName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.operator;
        return this.userId.hashCode() + gmf0.a(gpp.a(this.status, (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31, 31), 31, this.updateTime);
    }

    public String toString() {
        String str = this.bvnStatus;
        String str2 = this.createTime;
        int i = this.dataSource;
        String str3 = this.email;
        String str4 = this.firstName;
        String str5 = this.lastName;
        String str6 = this.operator;
        int i2 = this.status;
        String str7 = this.updateTime;
        String str8 = this.userId;
        StringBuilder sbA = ux5.a("UserCertInfo(bvnStatus=", str, ", createTime=", str2, ", dataSource=");
        f78.b(i, ", email=", str3, ", firstName=", sbA);
        hxa.c(sbA, str4, ", lastName=", str5, ", operator=");
        wxa.b(i2, str6, ", status=", ", updateTime=", sbA);
        return kwi.a(sbA, str7, ", userId=", str8, ")");
    }

    public UserCertInfo(String str, String str2, int i, String str3, String str4, String str5, String str6, int i2, String str7, String str8) {
        wd7.a(str, str2, str7, str8);
        this.bvnStatus = str;
        this.createTime = str2;
        this.dataSource = i;
        this.email = str3;
        this.firstName = str4;
        this.lastName = str5;
        this.operator = str6;
        this.status = i2;
        this.updateTime = str7;
        this.userId = str8;
    }

    public UserCertInfo() {
        this(null, null, 0, null, null, null, null, 0, null, null, 1023, null);
    }
}
