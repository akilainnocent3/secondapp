package com.sporty.android.core.model.security.sportypin;

import com.appsflyer.internal.x;
import com.sporty.android.core.model.patron.UserCertConstants;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.f87;
import defpackage.gpp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J=\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0014\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010'\u001a\u00020\tHÖ\u0081\u0004J\n\u0010(\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006)"}, d2 = {"Lcom/sporty/android/core/model/security/sportypin/WithdrawalPinStatusInfo;", "", AnalyticsParam.EVENT_STATUS, "", "leftTimeToUnblock", "", "config", "Lcom/sporty/android/core/model/security/sportypin/WithdrawalPinStatusConfig;", UserCertConstants.CONFIRM_NAME_USAGE, "", "fingerprintStatus", "<init>", "(Ljava/lang/String;JLcom/sporty/android/core/model/security/sportypin/WithdrawalPinStatusConfig;II)V", "getStatus", "()Ljava/lang/String;", "getLeftTimeToUnblock", "()J", "getConfig", "()Lcom/sporty/android/core/model/security/sportypin/WithdrawalPinStatusConfig;", "getUsage", "()I", "getFingerprintStatus", "sportyPinStatus", "Lcom/sporty/android/core/model/security/sportypin/SportyPinStatus;", "getSportyPinStatus", "()Lcom/sporty/android/core/model/security/sportypin/SportyPinStatus;", "sportyPinUsage", "Lcom/sporty/android/core/model/security/sportypin/SportyPinUsage;", "getSportyPinUsage", "()Lcom/sporty/android/core/model/security/sportypin/SportyPinUsage;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class WithdrawalPinStatusInfo {
    private final WithdrawalPinStatusConfig config;
    private final int fingerprintStatus;
    private final long leftTimeToUnblock;
    private final String status;
    private final int usage;

    public /* synthetic */ WithdrawalPinStatusInfo(String str, long j, WithdrawalPinStatusConfig withdrawalPinStatusConfig, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? SportyPinStatus.Disabled.getValue() : str, (i3 & 2) != 0 ? 0L : j, (i3 & 4) != 0 ? null : withdrawalPinStatusConfig, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? 0 : i2);
    }

    public static /* synthetic */ WithdrawalPinStatusInfo copy$default(WithdrawalPinStatusInfo withdrawalPinStatusInfo, String str, long j, WithdrawalPinStatusConfig withdrawalPinStatusConfig, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = withdrawalPinStatusInfo.status;
        }
        if ((i3 & 2) != 0) {
            j = withdrawalPinStatusInfo.leftTimeToUnblock;
        }
        if ((i3 & 4) != 0) {
            withdrawalPinStatusConfig = withdrawalPinStatusInfo.config;
        }
        if ((i3 & 8) != 0) {
            i = withdrawalPinStatusInfo.usage;
        }
        if ((i3 & 16) != 0) {
            i2 = withdrawalPinStatusInfo.fingerprintStatus;
        }
        int i4 = i2;
        WithdrawalPinStatusConfig withdrawalPinStatusConfig2 = withdrawalPinStatusConfig;
        return withdrawalPinStatusInfo.copy(str, j, withdrawalPinStatusConfig2, i, i4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getLeftTimeToUnblock() {
        return this.leftTimeToUnblock;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final WithdrawalPinStatusConfig getConfig() {
        return this.config;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getUsage() {
        return this.usage;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getFingerprintStatus() {
        return this.fingerprintStatus;
    }

    public final WithdrawalPinStatusInfo copy(String status, long leftTimeToUnblock, WithdrawalPinStatusConfig config, int usage, int fingerprintStatus) {
        status.getClass();
        return new WithdrawalPinStatusInfo(status, leftTimeToUnblock, config, usage, fingerprintStatus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WithdrawalPinStatusInfo)) {
            return false;
        }
        WithdrawalPinStatusInfo withdrawalPinStatusInfo = (WithdrawalPinStatusInfo) other;
        return Intrinsics.g(this.status, withdrawalPinStatusInfo.status) && this.leftTimeToUnblock == withdrawalPinStatusInfo.leftTimeToUnblock && Intrinsics.g(this.config, withdrawalPinStatusInfo.config) && this.usage == withdrawalPinStatusInfo.usage && this.fingerprintStatus == withdrawalPinStatusInfo.fingerprintStatus;
    }

    public final WithdrawalPinStatusConfig getConfig() {
        return this.config;
    }

    public final int getFingerprintStatus() {
        return this.fingerprintStatus;
    }

    public final long getLeftTimeToUnblock() {
        return this.leftTimeToUnblock;
    }

    public final SportyPinStatus getSportyPinStatus() {
        return SportyPinStatus.INSTANCE.fromValue(this.status);
    }

    public final SportyPinUsage getSportyPinUsage() {
        return SportyPinUsage.INSTANCE.fromCode(this.usage);
    }

    public final String getStatus() {
        return this.status;
    }

    public final int getUsage() {
        return this.usage;
    }

    public int hashCode() {
        int iA = f87.a(this.status.hashCode() * 31, this.leftTimeToUnblock, 31);
        WithdrawalPinStatusConfig withdrawalPinStatusConfig = this.config;
        return Integer.hashCode(this.fingerprintStatus) + gpp.a(this.usage, (iA + (withdrawalPinStatusConfig == null ? 0 : withdrawalPinStatusConfig.hashCode())) * 31, 31);
    }

    public String toString() {
        String str = this.status;
        long j = this.leftTimeToUnblock;
        WithdrawalPinStatusConfig withdrawalPinStatusConfig = this.config;
        int i = this.usage;
        int i2 = this.fingerprintStatus;
        StringBuilder sbA = x.a(j, "WithdrawalPinStatusInfo(status=", str, ", leftTimeToUnblock=");
        sbA.append(", config=");
        sbA.append(withdrawalPinStatusConfig);
        sbA.append(", usage=");
        sbA.append(i);
        sbA.append(", fingerprintStatus=");
        sbA.append(i2);
        sbA.append(")");
        return sbA.toString();
    }

    public WithdrawalPinStatusInfo(String str, long j, WithdrawalPinStatusConfig withdrawalPinStatusConfig, int i, int i2) {
        str.getClass();
        this.status = str;
        this.leftTimeToUnblock = j;
        this.config = withdrawalPinStatusConfig;
        this.usage = i;
        this.fingerprintStatus = i2;
    }

    public WithdrawalPinStatusInfo() {
        this(null, 0L, null, 0, 0, 31, null);
    }
}
