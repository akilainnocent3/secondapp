package com.sporty.android.core.model.pay.security;

import defpackage.tug;
import defpackage.tx5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \r2\u00020\u0001:\u0005\t\n\u000b\f\rB\u0013\b\u0004\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0004\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/sporty/android/core/model/pay/security/NameUpdateStatus;", "", "statusCode", "", "<init>", "(Ljava/lang/Integer;)V", "getStatusCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "Pending", "Approved", "Rejected", "Unknown", "Companion", "Lcom/sporty/android/core/model/pay/security/NameUpdateStatus$Approved;", "Lcom/sporty/android/core/model/pay/security/NameUpdateStatus$Pending;", "Lcom/sporty/android/core/model/pay/security/NameUpdateStatus$Rejected;", "Lcom/sporty/android/core/model/pay/security/NameUpdateStatus$Unknown;", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class NameUpdateStatus {
    public static final int NAME_UPDATE_STATUS_CODE_APPROVED = 30;
    public static final int NAME_UPDATE_STATUS_CODE_PENDING = 20;
    public static final int NAME_UPDATE_STATUS_CODE_REJECTED = 40;
    private final Integer statusCode;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/sporty/android/core/model/pay/security/NameUpdateStatus$Approved;", "Lcom/sporty/android/core/model/pay/security/NameUpdateStatus;", "name", "", "<init>", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Approved extends NameUpdateStatus {
        private final String name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Approved(String str) {
            super(30, null);
            str.getClass();
            this.name = str;
        }

        public static /* synthetic */ Approved copy$default(Approved approved, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = approved.name;
            }
            return approved.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final Approved copy(String name) {
            name.getClass();
            return new Approved(name);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Approved) && Intrinsics.g(this.name, ((Approved) other).name);
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.name.hashCode();
        }

        public String toString() {
            return tug.a("Approved(name=", this.name, ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sporty/android/core/model/pay/security/NameUpdateStatus$Pending;", "Lcom/sporty/android/core/model/pay/security/NameUpdateStatus;", "<init>", "()V", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Pending extends NameUpdateStatus {
        public static final Pending INSTANCE = new Pending();

        private Pending() {
            super(20, null);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/sporty/android/core/model/pay/security/NameUpdateStatus$Rejected;", "Lcom/sporty/android/core/model/pay/security/NameUpdateStatus;", "reasonTitle", "", "reasonDetail", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getReasonTitle", "()Ljava/lang/String;", "getReasonDetail", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Rejected extends NameUpdateStatus {
        private final String reasonDetail;
        private final String reasonTitle;

        public Rejected(String str, String str2) {
            super(40, null);
            this.reasonTitle = str;
            this.reasonDetail = str2;
        }

        public static /* synthetic */ Rejected copy$default(Rejected rejected, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = rejected.reasonTitle;
            }
            if ((i & 2) != 0) {
                str2 = rejected.reasonDetail;
            }
            return rejected.copy(str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getReasonTitle() {
            return this.reasonTitle;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getReasonDetail() {
            return this.reasonDetail;
        }

        public final Rejected copy(String reasonTitle, String reasonDetail) {
            return new Rejected(reasonTitle, reasonDetail);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Rejected)) {
                return false;
            }
            Rejected rejected = (Rejected) other;
            return Intrinsics.g(this.reasonTitle, rejected.reasonTitle) && Intrinsics.g(this.reasonDetail, rejected.reasonDetail);
        }

        public final String getReasonDetail() {
            return this.reasonDetail;
        }

        public final String getReasonTitle() {
            return this.reasonTitle;
        }

        public int hashCode() {
            String str = this.reasonTitle;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.reasonDetail;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return tx5.a("Rejected(reasonTitle=", this.reasonTitle, ", reasonDetail=", this.reasonDetail, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/sporty/android/core/model/pay/security/NameUpdateStatus$Unknown;", "Lcom/sporty/android/core/model/pay/security/NameUpdateStatus;", "statusCode", "", "<init>", "(Ljava/lang/Integer;)V", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Unknown extends NameUpdateStatus {
        public Unknown(Integer num) {
            super(num, null);
        }
    }

    private NameUpdateStatus(Integer num) {
        this.statusCode = num;
    }

    public final Integer getStatusCode() {
        return this.statusCode;
    }

    public /* synthetic */ NameUpdateStatus(Integer num, DefaultConstructorMarker defaultConstructorMarker) {
        this(num);
    }
}
