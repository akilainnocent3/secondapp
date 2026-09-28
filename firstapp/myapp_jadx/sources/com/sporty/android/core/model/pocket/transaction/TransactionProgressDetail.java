package com.sporty.android.core.model.pocket.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.ew7;
import defpackage.f78;
import defpackage.w03;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0014JJ\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0006\u0010\u001d\u001a\u00020\u0005J\u0014\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0083\u0004J\n\u0010\"\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010#\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014Ê\u0001\u0002\b*¨\u0006)"}, d2 = {"Lcom/sporty/android/core/model/pocket/transaction/TransactionProgressDetail;", "Landroid/os/Parcelable;", "progress", "", "order", "", AnalyticsParam.EVENT_STATUS, "content", "updateTime", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;)V", "getProgress", "()Ljava/lang/String;", "getOrder", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStatus", "getContent", "getUpdateTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;)Lcom/sporty/android/core/model/pocket/transaction/TransactionProgressDetail;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model", "Lkotlinx/parcelize/Parcelize;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class TransactionProgressDetail implements Parcelable {
    public static final Parcelable.Creator<TransactionProgressDetail> CREATOR = new Creator();
    private final String content;
    private final Integer order;
    private final String progress;
    private final Integer status;
    private final Long updateTime;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TransactionProgressDetail> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransactionProgressDetail createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new TransactionProgressDetail(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransactionProgressDetail[] newArray(int i) {
            return new TransactionProgressDetail[i];
        }
    }

    public /* synthetic */ TransactionProgressDetail(String str, Integer num, Integer num2, String str2, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, num, num2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : l);
    }

    public static /* synthetic */ TransactionProgressDetail copy$default(TransactionProgressDetail transactionProgressDetail, String str, Integer num, Integer num2, String str2, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = transactionProgressDetail.progress;
        }
        if ((i & 2) != 0) {
            num = transactionProgressDetail.order;
        }
        if ((i & 4) != 0) {
            num2 = transactionProgressDetail.status;
        }
        if ((i & 8) != 0) {
            str2 = transactionProgressDetail.content;
        }
        if ((i & 16) != 0) {
            l = transactionProgressDetail.updateTime;
        }
        Long l2 = l;
        Integer num3 = num2;
        return transactionProgressDetail.copy(str, num, num3, str2, l2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getProgress() {
        return this.progress;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getOrder() {
        return this.order;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getUpdateTime() {
        return this.updateTime;
    }

    public final TransactionProgressDetail copy(String progress, Integer order, Integer status, String content, Long updateTime) {
        return new TransactionProgressDetail(progress, order, status, content, updateTime);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionProgressDetail)) {
            return false;
        }
        TransactionProgressDetail transactionProgressDetail = (TransactionProgressDetail) other;
        return Intrinsics.g(this.progress, transactionProgressDetail.progress) && Intrinsics.g(this.order, transactionProgressDetail.order) && Intrinsics.g(this.status, transactionProgressDetail.status) && Intrinsics.g(this.content, transactionProgressDetail.content) && Intrinsics.g(this.updateTime, transactionProgressDetail.updateTime);
    }

    public final String getContent() {
        return this.content;
    }

    public final Integer getOrder() {
        return this.order;
    }

    public final String getProgress() {
        return this.progress;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public final Long getUpdateTime() {
        return this.updateTime;
    }

    public int hashCode() {
        String str = this.progress;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.order;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.status;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.content;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.updateTime;
        return iHashCode4 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        String str = this.progress;
        Integer num = this.order;
        Integer num2 = this.status;
        String str2 = this.content;
        Long l = this.updateTime;
        StringBuilder sbA = ew7.a(num, "TransactionProgressDetail(progress=", str, ", order=", ", status=");
        w03.a(num2, ", content=", str2, ", updateTime=", sbA);
        sbA.append(l);
        sbA.append(")");
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.progress);
        Integer num = this.order;
        if (num == null) {
            dest.writeInt(0);
        } else {
            f78.c(dest, 1, num);
        }
        Integer num2 = this.status;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            f78.c(dest, 1, num2);
        }
        dest.writeString(this.content);
        Long l = this.updateTime;
        if (l == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l.longValue());
        }
    }

    public TransactionProgressDetail(String str, Integer num, Integer num2, String str2, Long l) {
        this.progress = str;
        this.order = num;
        this.status = num2;
        this.content = str2;
        this.updateTime = l;
    }
}
