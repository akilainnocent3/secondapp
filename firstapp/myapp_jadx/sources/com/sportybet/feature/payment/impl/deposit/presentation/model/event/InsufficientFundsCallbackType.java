package com.sportybet.feature.payment.impl.deposit.presentation.model.event;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/sportybet/feature/payment/impl/deposit/presentation/model/event/InsufficientFundsCallbackType;", "Landroid/os/Parcelable;", "Positive", "Negative", "Cancel", "Lcom/sportybet/feature/payment/impl/deposit/presentation/model/event/InsufficientFundsCallbackType$Cancel;", "Lcom/sportybet/feature/payment/impl/deposit/presentation/model/event/InsufficientFundsCallbackType$Negative;", "Lcom/sportybet/feature/payment/impl/deposit/presentation/model/event/InsufficientFundsCallbackType$Positive;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface InsufficientFundsCallbackType extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sportybet/feature/payment/impl/deposit/presentation/model/event/InsufficientFundsCallbackType$Cancel;", "Lcom/sportybet/feature/payment/impl/deposit/presentation/model/event/InsufficientFundsCallbackType;", "Landroid/os/Parcelable;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Cancel implements InsufficientFundsCallbackType, Parcelable {
        public static final Cancel a = new Cancel();
        public static final Parcelable.Creator<Cancel> CREATOR = new a();

        public static final class a implements Parcelable.Creator<Cancel> {
            @Override // android.os.Parcelable.Creator
            public final Cancel createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return Cancel.a;
            }

            @Override // android.os.Parcelable.Creator
            public final Cancel[] newArray(int i) {
                return new Cancel[i];
            }
        }

        private Cancel() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sportybet/feature/payment/impl/deposit/presentation/model/event/InsufficientFundsCallbackType$Negative;", "Lcom/sportybet/feature/payment/impl/deposit/presentation/model/event/InsufficientFundsCallbackType;", "Landroid/os/Parcelable;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Negative implements InsufficientFundsCallbackType, Parcelable {
        public static final Negative a = new Negative();
        public static final Parcelable.Creator<Negative> CREATOR = new a();

        public static final class a implements Parcelable.Creator<Negative> {
            @Override // android.os.Parcelable.Creator
            public final Negative createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return Negative.a;
            }

            @Override // android.os.Parcelable.Creator
            public final Negative[] newArray(int i) {
                return new Negative[i];
            }
        }

        private Negative() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sportybet/feature/payment/impl/deposit/presentation/model/event/InsufficientFundsCallbackType$Positive;", "Lcom/sportybet/feature/payment/impl/deposit/presentation/model/event/InsufficientFundsCallbackType;", "Landroid/os/Parcelable;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Positive implements InsufficientFundsCallbackType, Parcelable {
        public static final Positive a = new Positive();
        public static final Parcelable.Creator<Positive> CREATOR = new a();

        public static final class a implements Parcelable.Creator<Positive> {
            @Override // android.os.Parcelable.Creator
            public final Positive createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return Positive.a;
            }

            @Override // android.os.Parcelable.Creator
            public final Positive[] newArray(int i) {
                return new Positive[i];
            }
        }

        private Positive() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }
}
