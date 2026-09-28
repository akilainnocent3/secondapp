package com.sportybet.android.globalpay.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.em5;
import defpackage.f78;
import defpackage.f87;
import defpackage.g41;
import defpackage.gpp;
import defpackage.ux5;
import defpackage.wxa;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u0000 92\u00020\u0001:\u00019Bi\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012B\u0011\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\u0011\u0010\u0015J\u0018\u0010$\u001a\u00020%2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u0007H\u0016J\b\u0010'\u001a\u00020\u0007H\u0016J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0007HÆ\u0003J\t\u0010,\u001a\u00020\u0007HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u000bHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00100\u001a\u00020\u000bHÆ\u0003J\t\u00101\u001a\u00020\u000bHÆ\u0003J\t\u00102\u001a\u00020\u0010HÆ\u0003J\u0081\u0001\u00103\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0014\u00104\u001a\u00020\u00102\b\u00105\u001a\u0004\u0018\u000106HÖ\u0083\u0004J\n\u00107\u001a\u00020\u0007HÖ\u0081\u0004J\n\u00108\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0011\u0010\r\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010#Ê\u0001\f\b;\u0012\b\b<\u0012\u0004\b\u0003\u0010\u0002¨\u0006:"}, d2 = {"Lcom/sportybet/android/globalpay/data/AccumulatedAmount;", "Landroid/os/Parcelable;", AnalyticsParam.EVENT_PARAM_ID, "", "userId", "payChId", "summaryType", "", "periodType", "currency", "summaryAmount", "", "summaryInterval", "createTime", "updateTime", "isDel", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;JLjava/lang/String;JJZ)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getId", "()Ljava/lang/String;", "getUserId", "getPayChId", "getSummaryType", "()I", "getPeriodType", "getCurrency", "getSummaryAmount", "()J", "getSummaryInterval", "getCreateTime", "getUpdateTime", "()Z", "writeToParcel", "", "flags", "describeContents", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "", "hashCode", "toString", "CREATOR", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class AccumulatedAmount implements Parcelable {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final long createTime;
    private final String currency;
    private final String id;
    private final boolean isDel;
    private final String payChId;
    private final int periodType;
    private final long summaryAmount;
    private final String summaryInterval;
    private final int summaryType;
    private final long updateTime;
    private final String userId;

    /* JADX INFO: renamed from: com.sportybet.android.globalpay.data.AccumulatedAmount$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/sportybet/android/globalpay/data/AccumulatedAmount$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/sportybet/android/globalpay/data/AccumulatedAmount;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/sportybet/android/globalpay/data/AccumulatedAmount;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<AccumulatedAmount> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AccumulatedAmount createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new AccumulatedAmount(parcel);
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AccumulatedAmount[] newArray(int size) {
            return new AccumulatedAmount[size];
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AccumulatedAmount(Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readByte() != 0);
        parcel.getClass();
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getIsDel() {
        return this.isDel;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPayChId() {
        return this.payChId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getSummaryType() {
        return this.summaryType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getPeriodType() {
        return this.periodType;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getSummaryAmount() {
        return this.summaryAmount;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSummaryInterval() {
        return this.summaryInterval;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    public final AccumulatedAmount copy(String id, String userId, String payChId, int summaryType, int periodType, String currency, long summaryAmount, String summaryInterval, long createTime, long updateTime, boolean isDel) {
        return new AccumulatedAmount(id, userId, payChId, summaryType, periodType, currency, summaryAmount, summaryInterval, createTime, updateTime, isDel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccumulatedAmount)) {
            return false;
        }
        AccumulatedAmount accumulatedAmount = (AccumulatedAmount) other;
        return Intrinsics.g(this.id, accumulatedAmount.id) && Intrinsics.g(this.userId, accumulatedAmount.userId) && Intrinsics.g(this.payChId, accumulatedAmount.payChId) && this.summaryType == accumulatedAmount.summaryType && this.periodType == accumulatedAmount.periodType && Intrinsics.g(this.currency, accumulatedAmount.currency) && this.summaryAmount == accumulatedAmount.summaryAmount && Intrinsics.g(this.summaryInterval, accumulatedAmount.summaryInterval) && this.createTime == accumulatedAmount.createTime && this.updateTime == accumulatedAmount.updateTime && this.isDel == accumulatedAmount.isDel;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getId() {
        return this.id;
    }

    public final String getPayChId() {
        return this.payChId;
    }

    public final int getPeriodType() {
        return this.periodType;
    }

    public final long getSummaryAmount() {
        return this.summaryAmount;
    }

    public final String getSummaryInterval() {
        return this.summaryInterval;
    }

    public final int getSummaryType() {
        return this.summaryType;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.userId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.payChId;
        int iA = gpp.a(this.periodType, gpp.a(this.summaryType, (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31);
        String str4 = this.currency;
        int iA2 = f87.a((iA + (str4 == null ? 0 : str4.hashCode())) * 31, this.summaryAmount, 31);
        String str5 = this.summaryInterval;
        return Boolean.hashCode(this.isDel) + f87.a(f87.a((iA2 + (str5 != null ? str5.hashCode() : 0)) * 31, this.createTime, 31), this.updateTime, 31);
    }

    public final boolean isDel() {
        return this.isDel;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.userId;
        String str3 = this.payChId;
        int i = this.summaryType;
        int i2 = this.periodType;
        String str4 = this.currency;
        long j = this.summaryAmount;
        String str5 = this.summaryInterval;
        long j2 = this.createTime;
        long j3 = this.updateTime;
        boolean z = this.isDel;
        StringBuilder sbA = ux5.a("AccumulatedAmount(id=", str, ", userId=", str2, ", payChId=");
        wxa.b(i, str3, ", summaryType=", ", periodType=", sbA);
        f78.b(i2, ", currency=", str4, ", summaryAmount=", sbA);
        em5.a(j, ", summaryInterval=", str5, sbA);
        g41.a(j2, ", createTime=", ", updateTime=", sbA);
        sbA.append(j3);
        sbA.append(", isDel=");
        sbA.append(z);
        sbA.append(")");
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.id);
        parcel.writeString(this.userId);
        parcel.writeString(this.payChId);
        parcel.writeInt(this.summaryType);
        parcel.writeInt(this.periodType);
        parcel.writeString(this.currency);
        parcel.writeLong(this.summaryAmount);
        parcel.writeString(this.summaryInterval);
        parcel.writeLong(this.createTime);
        parcel.writeLong(this.updateTime);
        parcel.writeByte(this.isDel ? (byte) 1 : (byte) 0);
    }

    public AccumulatedAmount(String str, String str2, String str3, int i, int i2, String str4, long j, String str5, long j2, long j3, boolean z) {
        this.id = str;
        this.userId = str2;
        this.payChId = str3;
        this.summaryType = i;
        this.periodType = i2;
        this.currency = str4;
        this.summaryAmount = j;
        this.summaryInterval = str5;
        this.createTime = j2;
        this.updateTime = j3;
        this.isDel = z;
    }
}
