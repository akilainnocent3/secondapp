package com.sportybet.feature.payment.impl.deposit.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.sporty.android.common_ui.uitext.UiText;
import defpackage.xh8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/sportybet/feature/payment/impl/deposit/domain/model/DepositDropAlertStatus;", "Landroid/os/Parcelable;", "<init>", "()V", "Unavailable", "Gone", "a", "MaintenanceAlert", "DropAlert", "CustomHint", "Lcom/sportybet/feature/payment/impl/deposit/domain/model/DepositDropAlertStatus$CustomHint;", "Lcom/sportybet/feature/payment/impl/deposit/domain/model/DepositDropAlertStatus$DropAlert;", "Lcom/sportybet/feature/payment/impl/deposit/domain/model/DepositDropAlertStatus$Gone;", "Lcom/sportybet/feature/payment/impl/deposit/domain/model/DepositDropAlertStatus$MaintenanceAlert;", "Lcom/sportybet/feature/payment/impl/deposit/domain/model/DepositDropAlertStatus$Unavailable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class DepositDropAlertStatus implements Parcelable {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/sportybet/feature/payment/impl/deposit/domain/model/DepositDropAlertStatus$CustomHint;", "Lcom/sportybet/feature/payment/impl/deposit/domain/model/DepositDropAlertStatus;", "Lcom/sportybet/feature/payment/impl/deposit/domain/model/DepositDropAlertStatus$a;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class CustomHint extends DepositDropAlertStatus implements a {
        public static final Parcelable.Creator<CustomHint> CREATOR = new a();
        public final UiText a;

        public static final class a implements Parcelable.Creator<CustomHint> {
            @Override // android.os.Parcelable.Creator
            public final CustomHint createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new CustomHint((UiText) parcel.readParcelable(CustomHint.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final CustomHint[] newArray(int i) {
                return new CustomHint[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CustomHint(UiText uiText) {
            super(0);
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
            return (obj instanceof CustomHint) && Intrinsics.g(this.a, ((CustomHint) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // com.sportybet.feature.payment.impl.deposit.domain.model.DepositDropAlertStatus.a
        /* JADX INFO: renamed from: l, reason: from getter */
        public final UiText getA() {
            return this.a;
        }

        public final String toString() {
            return xh8.a(this.a, "CustomHint(alertContent=", ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/sportybet/feature/payment/impl/deposit/domain/model/DepositDropAlertStatus$DropAlert;", "Lcom/sportybet/feature/payment/impl/deposit/domain/model/DepositDropAlertStatus;", "Lcom/sportybet/feature/payment/impl/deposit/domain/model/DepositDropAlertStatus$a;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class DropAlert extends DepositDropAlertStatus implements a {
        public static final Parcelable.Creator<DropAlert> CREATOR = new a();
        public final UiText a;

        public static final class a implements Parcelable.Creator<DropAlert> {
            @Override // android.os.Parcelable.Creator
            public final DropAlert createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new DropAlert((UiText) parcel.readParcelable(DropAlert.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final DropAlert[] newArray(int i) {
                return new DropAlert[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DropAlert(UiText uiText) {
            super(0);
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
            return (obj instanceof DropAlert) && Intrinsics.g(this.a, ((DropAlert) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // com.sportybet.feature.payment.impl.deposit.domain.model.DepositDropAlertStatus.a
        /* JADX INFO: renamed from: l, reason: from getter */
        public final UiText getA() {
            return this.a;
        }

        public final String toString() {
            return xh8.a(this.a, "DropAlert(alertContent=", ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sportybet/feature/payment/impl/deposit/domain/model/DepositDropAlertStatus$Gone;", "Lcom/sportybet/feature/payment/impl/deposit/domain/model/DepositDropAlertStatus;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Gone extends DepositDropAlertStatus {
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
            super(0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Gone);
        }

        public final int hashCode() {
            return 1461403532;
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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/sportybet/feature/payment/impl/deposit/domain/model/DepositDropAlertStatus$MaintenanceAlert;", "Lcom/sportybet/feature/payment/impl/deposit/domain/model/DepositDropAlertStatus;", "Lcom/sportybet/feature/payment/impl/deposit/domain/model/DepositDropAlertStatus$a;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class MaintenanceAlert extends DepositDropAlertStatus implements a {
        public static final Parcelable.Creator<MaintenanceAlert> CREATOR = new a();
        public final UiText a;
        public final String b;

        public static final class a implements Parcelable.Creator<MaintenanceAlert> {
            @Override // android.os.Parcelable.Creator
            public final MaintenanceAlert createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new MaintenanceAlert((UiText) parcel.readParcelable(MaintenanceAlert.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final MaintenanceAlert[] newArray(int i) {
                return new MaintenanceAlert[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MaintenanceAlert(UiText uiText, String str) {
            super(0);
            uiText.getClass();
            str.getClass();
            this.a = uiText;
            this.b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MaintenanceAlert)) {
                return false;
            }
            MaintenanceAlert maintenanceAlert = (MaintenanceAlert) obj;
            return Intrinsics.g(this.a, maintenanceAlert.a) && Intrinsics.g(this.b, maintenanceAlert.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        @Override // com.sportybet.feature.payment.impl.deposit.domain.model.DepositDropAlertStatus.a
        /* JADX INFO: renamed from: l, reason: from getter */
        public final UiText getA() {
            return this.a;
        }

        public final String toString() {
            return "MaintenanceAlert(alertContent=" + this.a + ", estimatedEndTime=" + this.b + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.a, i);
            parcel.writeString(this.b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sportybet/feature/payment/impl/deposit/domain/model/DepositDropAlertStatus$Unavailable;", "Lcom/sportybet/feature/payment/impl/deposit/domain/model/DepositDropAlertStatus;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Unavailable extends DepositDropAlertStatus {
        public static final Unavailable a = new Unavailable();
        public static final Parcelable.Creator<Unavailable> CREATOR = new a();

        public static final class a implements Parcelable.Creator<Unavailable> {
            @Override // android.os.Parcelable.Creator
            public final Unavailable createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return Unavailable.a;
            }

            @Override // android.os.Parcelable.Creator
            public final Unavailable[] newArray(int i) {
                return new Unavailable[i];
            }
        }

        private Unavailable() {
            super(0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Unavailable);
        }

        public final int hashCode() {
            return 284157123;
        }

        public final String toString() {
            return "Unavailable";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public interface a {
        /* JADX INFO: renamed from: l */
        UiText getA();
    }

    public /* synthetic */ DepositDropAlertStatus(int i) {
        this();
    }

    private DepositDropAlertStatus() {
    }
}
