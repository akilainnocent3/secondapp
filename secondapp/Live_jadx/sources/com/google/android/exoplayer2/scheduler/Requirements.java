package com.google.android.exoplayer2.scheduler;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import androidx.annotation.Nullable;
import eh.o1;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class Requirements implements Parcelable {
    public static final Parcelable.Creator<Requirements> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f48661c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f48662d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f48663e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f48664f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f48665g = 16;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f48666b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Parcelable.Creator<Requirements> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Requirements createFromParcel(Parcel parcel) {
            return new Requirements(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Requirements[] newArray(int i10) {
            return new Requirements[i10];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public Requirements(int i10) {
        this.f48666b = (i10 & 2) != 0 ? i10 | 1 : i10;
    }

    public static boolean k(ConnectivityManager connectivityManager) {
        if (o1.f81142a < 24) {
            return true;
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            return false;
        }
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
            return networkCapabilities != null && networkCapabilities.hasCapability(16);
        } catch (SecurityException unused) {
            return true;
        }
    }

    public boolean a(Context context) {
        return d(context) == 0;
    }

    public Requirements b(int i10) {
        int i11 = this.f48666b;
        int i12 = i10 & i11;
        return i12 == i11 ? this : new Requirements(i12);
    }

    public final int c(Context context) {
        if (!l()) {
            return 0;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) eh.a.g(context.getSystemService("connectivity"));
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected() && k(connectivityManager)) {
            return (o() && connectivityManager.isActiveNetworkMetered()) ? 2 : 0;
        }
        return this.f48666b & 3;
    }

    public int d(Context context) {
        int iC = c(context);
        if (f() && !g(context)) {
            iC |= 8;
        }
        if (j() && !h(context)) {
            iC |= 4;
        }
        return (!n() || m(context)) ? iC : iC | 16;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int e() {
        return this.f48666b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && Requirements.class == obj.getClass() && this.f48666b == ((Requirements) obj).f48666b;
    }

    public boolean f() {
        return (this.f48666b & 8) != 0;
    }

    public final boolean g(Context context) {
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            return false;
        }
        int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    public final boolean h(Context context) {
        PowerManager powerManager = (PowerManager) eh.a.g(context.getSystemService("power"));
        int i10 = o1.f81142a;
        if (i10 >= 23) {
            return powerManager.isDeviceIdleMode();
        }
        if (i10 >= 20) {
            return !powerManager.isInteractive();
        }
        return !powerManager.isScreenOn();
    }

    public int hashCode() {
        return this.f48666b;
    }

    public boolean j() {
        return (this.f48666b & 4) != 0;
    }

    public boolean l() {
        return (this.f48666b & 1) != 0;
    }

    public final boolean m(Context context) {
        return context.registerReceiver(null, new IntentFilter("android.intent.action.DEVICE_STORAGE_LOW")) == null;
    }

    public boolean n() {
        return (this.f48666b & 16) != 0;
    }

    public boolean o() {
        return (this.f48666b & 2) != 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f48666b);
    }
}
