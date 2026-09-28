package com.sporty.android.core.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.internal.x;
import defpackage.f87;
import defpackage.g41;
import defpackage.gmf0;
import defpackage.u4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/sporty/android/core/model/EligibleActivity;", "", "PaydayGift", "Lcom/sporty/android/core/model/EligibleActivity$PaydayGift;", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface EligibleActivity {

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003JE\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0014\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0083\u0004J\n\u0010$\u001a\u00020\u001fHÖ\u0081\u0004J\n\u0010%\u001a\u00020\u0004HÖ\u0081\u0004J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016Ê\u0001\u0002\b,¨\u0006+"}, d2 = {"Lcom/sporty/android/core/model/EligibleActivity$PaydayGift;", "Lcom/sporty/android/core/model/EligibleActivity;", "Landroid/os/Parcelable;", "depositCurrency", "", "minDepositAmount", "", "rewardCurrency", "rewardAmount", "endTime", "variant", "Lcom/sporty/android/core/model/PaydayPromoModalVariantDomain;", "<init>", "(Ljava/lang/String;JLjava/lang/String;JJLcom/sporty/android/core/model/PaydayPromoModalVariantDomain;)V", "getDepositCurrency", "()Ljava/lang/String;", "getMinDepositAmount", "()J", "getRewardCurrency", "getRewardAmount", "getEndTime", "getVariant", "()Lcom/sporty/android/core/model/PaydayPromoModalVariantDomain;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model", "Lkotlinx/parcelize/Parcelize;"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class PaydayGift implements EligibleActivity, Parcelable {
        public static final Parcelable.Creator<PaydayGift> CREATOR = new Creator();
        private final String depositCurrency;
        private final long endTime;
        private final long minDepositAmount;
        private final long rewardAmount;
        private final String rewardCurrency;
        private final PaydayPromoModalVariantDomain variant;

        /* JADX INFO: loaded from: classes4.dex */
        @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PaydayGift> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaydayGift createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new PaydayGift(parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readLong(), parcel.readLong(), PaydayPromoModalVariantDomain.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaydayGift[] newArray(int i) {
                return new PaydayGift[i];
            }
        }

        public PaydayGift(String str, long j, String str2, long j2, long j3, PaydayPromoModalVariantDomain paydayPromoModalVariantDomain) {
            str.getClass();
            str2.getClass();
            paydayPromoModalVariantDomain.getClass();
            this.depositCurrency = str;
            this.minDepositAmount = j;
            this.rewardCurrency = str2;
            this.rewardAmount = j2;
            this.endTime = j3;
            this.variant = paydayPromoModalVariantDomain;
        }

        public static /* synthetic */ PaydayGift copy$default(PaydayGift paydayGift, String str, long j, String str2, long j2, long j3, PaydayPromoModalVariantDomain paydayPromoModalVariantDomain, int i, Object obj) {
            if ((i & 1) != 0) {
                str = paydayGift.depositCurrency;
            }
            if ((i & 2) != 0) {
                j = paydayGift.minDepositAmount;
            }
            if ((i & 4) != 0) {
                str2 = paydayGift.rewardCurrency;
            }
            if ((i & 8) != 0) {
                j2 = paydayGift.rewardAmount;
            }
            if ((i & 16) != 0) {
                j3 = paydayGift.endTime;
            }
            if ((i & 32) != 0) {
                paydayPromoModalVariantDomain = paydayGift.variant;
            }
            PaydayPromoModalVariantDomain paydayPromoModalVariantDomain2 = paydayPromoModalVariantDomain;
            String str3 = str2;
            return paydayGift.copy(str, j, str3, j2, j3, paydayPromoModalVariantDomain2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getDepositCurrency() {
            return this.depositCurrency;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getMinDepositAmount() {
            return this.minDepositAmount;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getRewardCurrency() {
            return this.rewardCurrency;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final long getRewardAmount() {
            return this.rewardAmount;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final long getEndTime() {
            return this.endTime;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final PaydayPromoModalVariantDomain getVariant() {
            return this.variant;
        }

        public final PaydayGift copy(String depositCurrency, long minDepositAmount, String rewardCurrency, long rewardAmount, long endTime, PaydayPromoModalVariantDomain variant) {
            depositCurrency.getClass();
            rewardCurrency.getClass();
            variant.getClass();
            return new PaydayGift(depositCurrency, minDepositAmount, rewardCurrency, rewardAmount, endTime, variant);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaydayGift)) {
                return false;
            }
            PaydayGift paydayGift = (PaydayGift) other;
            return Intrinsics.g(this.depositCurrency, paydayGift.depositCurrency) && this.minDepositAmount == paydayGift.minDepositAmount && Intrinsics.g(this.rewardCurrency, paydayGift.rewardCurrency) && this.rewardAmount == paydayGift.rewardAmount && this.endTime == paydayGift.endTime && this.variant == paydayGift.variant;
        }

        public final String getDepositCurrency() {
            return this.depositCurrency;
        }

        public final long getEndTime() {
            return this.endTime;
        }

        public final long getMinDepositAmount() {
            return this.minDepositAmount;
        }

        public final long getRewardAmount() {
            return this.rewardAmount;
        }

        public final String getRewardCurrency() {
            return this.rewardCurrency;
        }

        public final PaydayPromoModalVariantDomain getVariant() {
            return this.variant;
        }

        public int hashCode() {
            return this.variant.hashCode() + f87.a(f87.a(gmf0.a(f87.a(this.depositCurrency.hashCode() * 31, this.minDepositAmount, 31), 31, this.rewardCurrency), this.rewardAmount, 31), this.endTime, 31);
        }

        public String toString() {
            String str = this.depositCurrency;
            long j = this.minDepositAmount;
            String str2 = this.rewardCurrency;
            long j2 = this.rewardAmount;
            long j3 = this.endTime;
            PaydayPromoModalVariantDomain paydayPromoModalVariantDomain = this.variant;
            StringBuilder sbA = x.a(j, "PaydayGift(depositCurrency=", str, ", minDepositAmount=");
            u4.a(sbA, ", rewardCurrency=", str2, ", rewardAmount=");
            sbA.append(j2);
            g41.a(j3, ", endTime=", ", variant=", sbA);
            sbA.append(paydayPromoModalVariantDomain);
            sbA.append(")");
            return sbA.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeString(this.depositCurrency);
            dest.writeLong(this.minDepositAmount);
            dest.writeString(this.rewardCurrency);
            dest.writeLong(this.rewardAmount);
            dest.writeLong(this.endTime);
            dest.writeString(this.variant.name());
        }
    }
}
