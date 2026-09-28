package com.sporty.android.platform.features.newotp.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0001:\u0003\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/sporty/android/platform/features/newotp/util/OTPResult;", "Landroid/os/Parcelable;", "T", "NoResult", "Success", "Failed", "Lcom/sporty/android/platform/features/newotp/util/OTPResult$Failed;", "Lcom/sporty/android/platform/features/newotp/util/OTPResult$NoResult;", "Lcom/sporty/android/platform/features/newotp/util/OTPResult$Success;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface OTPResult<T extends Parcelable> extends Parcelable {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000*\n\b\u0001\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003:\u0002\u0004\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/sporty/android/platform/features/newotp/util/OTPResult$Failed;", "Landroid/os/Parcelable;", "T", "Lcom/sporty/android/platform/features/newotp/util/OTPResult;", "APIError", "OtherError", "Lcom/sporty/android/platform/features/newotp/util/OTPResult$Failed$APIError;", "Lcom/sporty/android/platform/features/newotp/util/OTPResult$Failed$OtherError;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public interface Failed<T extends Parcelable> extends OTPResult<T> {

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/sporty/android/platform/features/newotp/util/OTPResult$Failed$APIError;", "Lcom/sporty/android/platform/features/newotp/util/OTPResult$Failed;", "", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final /* data */ class APIError implements Failed {
            public static final Parcelable.Creator<APIError> CREATOR = new a();
            public final int a;
            public final UiText b;

            public static final class a implements Parcelable.Creator<APIError> {
                @Override // android.os.Parcelable.Creator
                public final APIError createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new APIError(parcel.readInt(), (UiText) parcel.readParcelable(APIError.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final APIError[] newArray(int i) {
                    return new APIError[i];
                }
            }

            public APIError(int i, UiText uiText) {
                uiText.getClass();
                this.a = i;
                this.b = uiText;
            }

            @Override // com.sporty.android.platform.features.newotp.util.OTPResult.Failed
            /* JADX INFO: renamed from: d1, reason: from getter */
            public final UiText getB() {
                return this.b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof APIError)) {
                    return false;
                }
                APIError aPIError = (APIError) obj;
                return this.a == aPIError.a && Intrinsics.g(this.b, aPIError.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
            }

            public final String toString() {
                return "APIError(errorCode=" + this.a + ", errorText=" + this.b + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(this.a);
                parcel.writeParcelable(this.b, i);
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/sporty/android/platform/features/newotp/util/OTPResult$Failed$OtherError;", "Lcom/sporty/android/platform/features/newotp/util/OTPResult$Failed;", "", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final /* data */ class OtherError implements Failed {
            public static final Parcelable.Creator<OtherError> CREATOR = new a();
            public final String a;
            public final UiText b;

            public static final class a implements Parcelable.Creator<OtherError> {
                @Override // android.os.Parcelable.Creator
                public final OtherError createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new OtherError((UiText) parcel.readParcelable(OtherError.class.getClassLoader()), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final OtherError[] newArray(int i) {
                    return new OtherError[i];
                }
            }

            public OtherError(UiText uiText, String str) {
                str.getClass();
                uiText.getClass();
                this.a = str;
                this.b = uiText;
            }

            @Override // com.sporty.android.platform.features.newotp.util.OTPResult.Failed
            /* JADX INFO: renamed from: d1, reason: from getter */
            public final UiText getB() {
                return this.b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OtherError)) {
                    return false;
                }
                OtherError otherError = (OtherError) obj;
                return Intrinsics.g(this.a, otherError.a) && Intrinsics.g(this.b, otherError.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "OtherError(cause=" + this.a + ", errorText=" + this.b + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.a);
                parcel.writeParcelable(this.b, i);
            }
        }

        /* JADX INFO: renamed from: d1 */
        UiText getB();
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sporty/android/platform/features/newotp/util/OTPResult$NoResult;", "Lcom/sporty/android/platform/features/newotp/util/OTPResult;", "", "<init>", "()V", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class NoResult implements OTPResult {
        public static final NoResult a = new NoResult();
        public static final Parcelable.Creator<NoResult> CREATOR = new a();

        public static final class a implements Parcelable.Creator<NoResult> {
            @Override // android.os.Parcelable.Creator
            public final NoResult createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return NoResult.a;
            }

            @Override // android.os.Parcelable.Creator
            public final NoResult[] newArray(int i) {
                return new NoResult[i];
            }
        }

        private NoResult() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NoResult);
        }

        public final int hashCode() {
            return -934078370;
        }

        public final String toString() {
            return "NoResult";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u0000*\n\b\u0001\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sporty/android/platform/features/newotp/util/OTPResult$Success;", "Landroid/os/Parcelable;", "T", "Lcom/sporty/android/platform/features/newotp/util/OTPResult;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Success<T extends Parcelable> implements OTPResult<T> {
        public static final Parcelable.Creator<Success<?>> CREATOR = new a();
        public final T a;

        public static final class a implements Parcelable.Creator<Success<?>> {
            @Override // android.os.Parcelable.Creator
            public final Success<?> createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new Success<>(parcel.readParcelable(Success.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Success<?>[] newArray(int i) {
                return new Success[i];
            }
        }

        public Success(T t) {
            t.getClass();
            this.a = t;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.g(this.a, ((Success) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Success(data=" + this.a + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.a, i);
        }
    }
}
