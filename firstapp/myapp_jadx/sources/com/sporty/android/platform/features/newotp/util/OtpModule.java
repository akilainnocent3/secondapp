package com.sporty.android.platform.features.newotp.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.sporty.android.platform.features.newotp.util.OtpData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/sporty/android/platform/features/newotp/util/OtpModule;", "Lcom/sporty/android/platform/features/newotp/util/OtpData;", "T", "Landroid/os/Parcelable;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class OtpModule<T extends OtpData> implements Parcelable {
    public static final Parcelable.Creator<OtpModule<?>> CREATOR = new a();
    public final T a;
    public final OtpViewModelClasses<T> b;

    public static final class a implements Parcelable.Creator<OtpModule<?>> {
        @Override // android.os.Parcelable.Creator
        public final OtpModule<?> createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new OtpModule<>((OtpData) parcel.readParcelable(OtpModule.class.getClassLoader()), OtpViewModelClasses.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final OtpModule<?>[] newArray(int i) {
            return new OtpModule[i];
        }
    }

    public OtpModule(T t, OtpViewModelClasses<T> otpViewModelClasses) {
        t.getClass();
        otpViewModelClasses.getClass();
        this.a = t;
        this.b = otpViewModelClasses;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OtpModule)) {
            return false;
        }
        OtpModule otpModule = (OtpModule) obj;
        return Intrinsics.g(this.a, otpModule.a) && Intrinsics.g(this.b, otpModule.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OtpModule(otpData=" + this.a + ", viewModules=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
        this.b.writeToParcel(parcel, i);
    }
}
