package com.sporty.android.common.uievent;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b6c;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/sporty/android/common/uievent/CustomAlertDialogCallbackType;", "Landroid/os/Parcelable;", "Positive", "Negative", "HyperlinkInMessage", "Cancel", "Lcom/sporty/android/common/uievent/CustomAlertDialogCallbackType$Cancel;", "Lcom/sporty/android/common/uievent/CustomAlertDialogCallbackType$HyperlinkInMessage;", "Lcom/sporty/android/common/uievent/CustomAlertDialogCallbackType$Negative;", "Lcom/sporty/android/common/uievent/CustomAlertDialogCallbackType$Positive;", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface CustomAlertDialogCallbackType extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sporty/android/common/uievent/CustomAlertDialogCallbackType$Cancel;", "Lcom/sporty/android/common/uievent/CustomAlertDialogCallbackType;", "Landroid/os/Parcelable;", "<init>", "()V", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Cancel implements CustomAlertDialogCallbackType, Parcelable {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sporty/android/common/uievent/CustomAlertDialogCallbackType$HyperlinkInMessage;", "Lcom/sporty/android/common/uievent/CustomAlertDialogCallbackType;", "Landroid/os/Parcelable;", "<init>", "()V", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class HyperlinkInMessage implements CustomAlertDialogCallbackType, Parcelable {
        public static final HyperlinkInMessage a = new HyperlinkInMessage();
        public static final Parcelable.Creator<HyperlinkInMessage> CREATOR = new a();

        public static final class a implements Parcelable.Creator<HyperlinkInMessage> {
            @Override // android.os.Parcelable.Creator
            public final HyperlinkInMessage createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return HyperlinkInMessage.a;
            }

            @Override // android.os.Parcelable.Creator
            public final HyperlinkInMessage[] newArray(int i) {
                return new HyperlinkInMessage[i];
            }
        }

        private HyperlinkInMessage() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sporty/android/common/uievent/CustomAlertDialogCallbackType$Negative;", "Lcom/sporty/android/common/uievent/CustomAlertDialogCallbackType;", "Landroid/os/Parcelable;", "<init>", "()V", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Negative implements CustomAlertDialogCallbackType, Parcelable {
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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/sporty/android/common/uievent/CustomAlertDialogCallbackType$Positive;", "Lcom/sporty/android/common/uievent/CustomAlertDialogCallbackType;", "Landroid/os/Parcelable;", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Positive implements CustomAlertDialogCallbackType, Parcelable {
        public static final Parcelable.Creator<Positive> CREATOR = new a();
        public final boolean a;

        public static final class a implements Parcelable.Creator<Positive> {
            @Override // android.os.Parcelable.Creator
            public final Positive createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new Positive(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Positive[] newArray(int i) {
                return new Positive[i];
            }
        }

        public Positive(boolean z) {
            this.a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Positive) && this.a == ((Positive) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return b6c.a("Positive(isCheckBoxChecked=", ")", this.a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.a ? 1 : 0);
        }

        public Positive() {
            this(false);
        }
    }
}
