package com.sporty.android.platform.features.newotp.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sportybet.android.limits.reached.Cw.rarBonoqWB;
import defpackage.c7z;
import defpackage.ecf0;
import defpackage.goi0;
import defpackage.nq50;
import defpackage.p0g;
import defpackage.x2a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/sporty/android/platform/features/newotp/util/OtpViewModelClasses;", "Lcom/sporty/android/platform/features/newotp/util/OtpData;", "T", "Landroid/os/Parcelable;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class OtpViewModelClasses<T extends OtpData> implements Parcelable {
    public static final Parcelable.Creator<OtpViewModelClasses<?>> CREATOR = new a();
    public final Class<? extends c7z<T>> a;
    public final Class<? extends x2a0<T>> b;
    public final Class<? extends goi0<T>> c;
    public final Class<? extends nq50<T>> d;
    public final Class<? extends ecf0<T>> e;
    public final Class<? extends p0g<T>> f;

    /* JADX INFO: loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator<OtpViewModelClasses<?>> {
        @Override // android.os.Parcelable.Creator
        public final OtpViewModelClasses<?> createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new OtpViewModelClasses<>((Class) parcel.readSerializable(), (Class) parcel.readSerializable(), (Class) parcel.readSerializable(), (Class) parcel.readSerializable(), (Class) parcel.readSerializable(), (Class) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final OtpViewModelClasses<?>[] newArray(int i) {
            return new OtpViewModelClasses[i];
        }
    }

    public OtpViewModelClasses(Class<? extends c7z<T>> cls, Class<? extends x2a0<T>> cls2, Class<? extends goi0<T>> cls3, Class<? extends nq50<T>> cls4, Class<? extends ecf0<T>> cls5, Class<? extends p0g<T>> cls6) {
        cls.getClass();
        cls2.getClass();
        cls3.getClass();
        cls4.getClass();
        cls5.getClass();
        cls6.getClass();
        this.a = cls;
        this.b = cls2;
        this.c = cls3;
        this.d = cls4;
        this.e = cls5;
        this.f = cls6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OtpViewModelClasses)) {
            return false;
        }
        OtpViewModelClasses otpViewModelClasses = (OtpViewModelClasses) obj;
        return Intrinsics.g(this.a, otpViewModelClasses.a) && Intrinsics.g(this.b, otpViewModelClasses.b) && Intrinsics.g(this.c, otpViewModelClasses.c) && Intrinsics.g(this.d, otpViewModelClasses.d) && Intrinsics.g(this.e, otpViewModelClasses.e) && Intrinsics.g(this.f, otpViewModelClasses.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "OtpViewModelClasses(otpSelectorViewModelClass=" + this.a + ", smsViewModelClass=" + this.b + ", voiceViewModelClass=" + this.c + rarBonoqWB.qfMmTjbIcyHni + this.d + ", telegramViewModelClass=" + this.e + ", emailViewModelClass=" + this.f + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeSerializable(this.a);
        parcel.writeSerializable(this.b);
        parcel.writeSerializable(this.c);
        parcel.writeSerializable(this.d);
        parcel.writeSerializable(this.e);
        parcel.writeSerializable(this.f);
    }
}
