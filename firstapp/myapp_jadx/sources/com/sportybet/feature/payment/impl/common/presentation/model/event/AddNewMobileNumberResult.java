package com.sportybet.feature.payment.impl.common.presentation.model.event;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005Ê\u0001\u0002\b\u0007¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/sportybet/feature/payment/impl/common/presentation/model/event/AddNewMobileNumberResult;", "Landroid/os/Parcelable;", "Success", "Cancel", "Lcom/sportybet/feature/payment/impl/common/presentation/model/event/AddNewMobileNumberResult$Cancel;", "Lcom/sportybet/feature/payment/impl/common/presentation/model/event/AddNewMobileNumberResult$Success;", "impl", "Lkotlinx/parcelize/Parcelize;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface AddNewMobileNumberResult extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sportybet/feature/payment/impl/common/presentation/model/event/AddNewMobileNumberResult$Cancel;", "Lcom/sportybet/feature/payment/impl/common/presentation/model/event/AddNewMobileNumberResult;", "Landroid/os/Parcelable;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Cancel implements AddNewMobileNumberResult, Parcelable {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sportybet/feature/payment/impl/common/presentation/model/event/AddNewMobileNumberResult$Success;", "Lcom/sportybet/feature/payment/impl/common/presentation/model/event/AddNewMobileNumberResult;", "Landroid/os/Parcelable;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Success implements AddNewMobileNumberResult, Parcelable {
        public static final Success a = new Success();
        public static final Parcelable.Creator<Success> CREATOR = new a();

        public static final class a implements Parcelable.Creator<Success> {
            @Override // android.os.Parcelable.Creator
            public final Success createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return Success.a;
            }

            @Override // android.os.Parcelable.Creator
            public final Success[] newArray(int i) {
                return new Success[i];
            }
        }

        private Success() {
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
