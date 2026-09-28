package com.sportybet.feature.payment.impl.withdraw.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.sporty.android.common_ui.uitext.UiText;
import defpackage.vch0;
import defpackage.xh8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0003\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/sportybet/feature/payment/impl/withdraw/domain/model/WithdrawAlertHintStatus;", "Landroid/os/Parcelable;", "WithAlertContent", "WithProviderName", "Gone", "DropAlert", "CustomHint", "Lcom/sportybet/feature/payment/impl/withdraw/domain/model/WithdrawAlertHintStatus$Gone;", "Lcom/sportybet/feature/payment/impl/withdraw/domain/model/WithdrawAlertHintStatus$WithAlertContent;", "Lcom/sportybet/feature/payment/impl/withdraw/domain/model/WithdrawAlertHintStatus$WithProviderName;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface WithdrawAlertHintStatus extends Parcelable {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/feature/payment/impl/withdraw/domain/model/WithdrawAlertHintStatus$CustomHint;", "Lcom/sportybet/feature/payment/impl/withdraw/domain/model/WithdrawAlertHintStatus$WithAlertContent;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class CustomHint implements WithAlertContent {
        public static final Parcelable.Creator<CustomHint> CREATOR = new a();
        public final String a;
        public final UiText b;

        public static final class a implements Parcelable.Creator<CustomHint> {
            @Override // android.os.Parcelable.Creator
            public final CustomHint createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new CustomHint((UiText) parcel.readParcelable(CustomHint.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final CustomHint[] newArray(int i) {
                return new CustomHint[i];
            }
        }

        public CustomHint(UiText uiText, String str) {
            uiText.getClass();
            this.a = str;
            this.b = uiText;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CustomHint)) {
                return false;
            }
            CustomHint customHint = (CustomHint) obj;
            return Intrinsics.g(this.a, customHint.a) && Intrinsics.g(this.b, customHint.b);
        }

        public final int hashCode() {
            String str = this.a;
            return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @Override // com.sportybet.feature.payment.impl.withdraw.domain.model.WithdrawAlertHintStatus.WithAlertContent
        /* JADX INFO: renamed from: l, reason: from getter */
        public final UiText getB() {
            return this.b;
        }

        public final String toString() {
            return "CustomHint(providerName=" + this.a + ", alertContent=" + this.b + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.a);
            parcel.writeParcelable(this.b, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sportybet/feature/payment/impl/withdraw/domain/model/WithdrawAlertHintStatus$Gone;", "Lcom/sportybet/feature/payment/impl/withdraw/domain/model/WithdrawAlertHintStatus;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Gone implements WithdrawAlertHintStatus {
        public static final Gone a = new Gone();
        public static final Parcelable.Creator<Gone> CREATOR = new a();

        public static final class a implements Parcelable.Creator<Gone> {
            @Override // android.os.Parcelable.Creator
            public final Gone createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return Gone.a;
            }

            @Override // android.os.Parcelable.Creator
            public final Gone[] newArray(int i) {
                return new Gone[i];
            }
        }

        private Gone() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Gone);
        }

        public final int hashCode() {
            return 886437164;
        }

        public final String toString() {
            return "Gone";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/sportybet/feature/payment/impl/withdraw/domain/model/WithdrawAlertHintStatus$WithAlertContent;", "Lcom/sportybet/feature/payment/impl/withdraw/domain/model/WithdrawAlertHintStatus;", "Lcom/sportybet/feature/payment/impl/withdraw/domain/model/WithdrawAlertHintStatus$CustomHint;", "Lcom/sportybet/feature/payment/impl/withdraw/domain/model/WithdrawAlertHintStatus$DropAlert;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public interface WithAlertContent extends WithdrawAlertHintStatus {
        /* JADX INFO: renamed from: l */
        UiText getB();
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/sportybet/feature/payment/impl/withdraw/domain/model/WithdrawAlertHintStatus$WithProviderName;", "Lcom/sportybet/feature/payment/impl/withdraw/domain/model/WithdrawAlertHintStatus;", "Lcom/sportybet/feature/payment/impl/withdraw/domain/model/WithdrawAlertHintStatus$DropAlert$Bank;", "Lcom/sportybet/feature/payment/impl/withdraw/domain/model/WithdrawAlertHintStatus$DropAlert$Momo;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public interface WithProviderName extends WithdrawAlertHintStatus {
        /* JADX INFO: renamed from: getProviderName */
        String getA();
    }

    default boolean isVisible() {
        return !(this instanceof Gone);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/sportybet/feature/payment/impl/withdraw/domain/model/WithdrawAlertHintStatus$DropAlert;", "Lcom/sportybet/feature/payment/impl/withdraw/domain/model/WithdrawAlertHintStatus$WithAlertContent;", "Bank", "Momo", "IntInfra", "Lcom/sportybet/feature/payment/impl/withdraw/domain/model/WithdrawAlertHintStatus$DropAlert$Bank;", "Lcom/sportybet/feature/payment/impl/withdraw/domain/model/WithdrawAlertHintStatus$DropAlert$IntInfra;", "Lcom/sportybet/feature/payment/impl/withdraw/domain/model/WithdrawAlertHintStatus$DropAlert$Momo;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public interface DropAlert extends WithAlertContent {

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/sportybet/feature/payment/impl/withdraw/domain/model/WithdrawAlertHintStatus$DropAlert$Bank;", "Lcom/sportybet/feature/payment/impl/withdraw/domain/model/WithdrawAlertHintStatus$DropAlert;", "Lcom/sportybet/feature/payment/impl/withdraw/domain/model/WithdrawAlertHintStatus$WithProviderName;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final /* data */ class Bank implements DropAlert, WithProviderName {
            public static final Parcelable.Creator<Bank> CREATOR = new a();
            public final String a;
            public final UiText b;

            public static final class a implements Parcelable.Creator<Bank> {
                @Override // android.os.Parcelable.Creator
                public final Bank createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new Bank((UiText) parcel.readParcelable(Bank.class.getClassLoader()), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Bank[] newArray(int i) {
                    return new Bank[i];
                }
            }

            public Bank(UiText uiText, String str) {
                str.getClass();
                uiText.getClass();
                this.a = str;
                this.b = uiText;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Bank)) {
                    return false;
                }
                Bank bank = (Bank) obj;
                return Intrinsics.g(this.a, bank.a) && Intrinsics.g(this.b, bank.b);
            }

            @Override // com.sportybet.feature.payment.impl.withdraw.domain.model.WithdrawAlertHintStatus.WithProviderName
            /* JADX INFO: renamed from: getProviderName, reason: from getter */
            public final String getA() {
                return this.a;
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            @Override // com.sportybet.feature.payment.impl.withdraw.domain.model.WithdrawAlertHintStatus.WithAlertContent
            /* JADX INFO: renamed from: l, reason: from getter */
            public final UiText getB() {
                return this.b;
            }

            public final String toString() {
                return "Bank(providerName=" + this.a + ", alertContent=" + this.b + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.a);
                parcel.writeParcelable(this.b, i);
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/sportybet/feature/payment/impl/withdraw/domain/model/WithdrawAlertHintStatus$DropAlert$Momo;", "Lcom/sportybet/feature/payment/impl/withdraw/domain/model/WithdrawAlertHintStatus$DropAlert;", "Lcom/sportybet/feature/payment/impl/withdraw/domain/model/WithdrawAlertHintStatus$WithProviderName;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final /* data */ class Momo implements DropAlert, WithProviderName {
            public static final Parcelable.Creator<Momo> CREATOR = new a();
            public final String a;
            public final UiText b;

            public static final class a implements Parcelable.Creator<Momo> {
                @Override // android.os.Parcelable.Creator
                public final Momo createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new Momo((UiText) parcel.readParcelable(Momo.class.getClassLoader()), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Momo[] newArray(int i) {
                    return new Momo[i];
                }
            }

            public Momo(UiText uiText, String str) {
                str.getClass();
                uiText.getClass();
                this.a = str;
                this.b = uiText;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Momo)) {
                    return false;
                }
                Momo momo = (Momo) obj;
                return Intrinsics.g(this.a, momo.a) && Intrinsics.g(this.b, momo.b);
            }

            @Override // com.sportybet.feature.payment.impl.withdraw.domain.model.WithdrawAlertHintStatus.WithProviderName
            /* JADX INFO: renamed from: getProviderName, reason: from getter */
            public final String getA() {
                return this.a;
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            @Override // com.sportybet.feature.payment.impl.withdraw.domain.model.WithdrawAlertHintStatus.WithAlertContent
            /* JADX INFO: renamed from: l, reason: from getter */
            public final UiText getB() {
                return this.b;
            }

            public final String toString() {
                return "Momo(providerName=" + this.a + ", alertContent=" + this.b + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.a);
                parcel.writeParcelable(this.b, i);
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/feature/payment/impl/withdraw/domain/model/WithdrawAlertHintStatus$DropAlert$IntInfra;", "Lcom/sportybet/feature/payment/impl/withdraw/domain/model/WithdrawAlertHintStatus$DropAlert;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final /* data */ class IntInfra implements DropAlert {
            public static final Parcelable.Creator<IntInfra> CREATOR = new a();
            public final UiText a;

            public static final class a implements Parcelable.Creator<IntInfra> {
                @Override // android.os.Parcelable.Creator
                public final IntInfra createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new IntInfra((UiText) parcel.readParcelable(IntInfra.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final IntInfra[] newArray(int i) {
                    return new IntInfra[i];
                }
            }

            public IntInfra(UiText uiText) {
                uiText.getClass();
                this.a = uiText;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof IntInfra) && Intrinsics.g(this.a, ((IntInfra) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            @Override // com.sportybet.feature.payment.impl.withdraw.domain.model.WithdrawAlertHintStatus.WithAlertContent
            /* JADX INFO: renamed from: l, reason: from getter */
            public final UiText getB() {
                return this.a;
            }

            public final String toString() {
                return xh8.a(this.a, "IntInfra(alertContent=", ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeParcelable(this.a, i);
            }

            public IntInfra() {
                this(vch0.a);
            }
        }
    }
}
