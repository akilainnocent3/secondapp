package yads;

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

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class mp2 implements Parcelable {
    public static final Parcelable.Creator<mp2> CREATOR = new lp2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f152599b;

    public mp2(int i10) {
        this.f152599b = (i10 & 2) != 0 ? i10 | 1 : i10;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004c  */
    public final int a(Context context) {
        int i10;
        Intent intentRegisterReceiver;
        int intExtra;
        if ((this.f152599b & 1) != 0) {
            Object systemService = context.getSystemService("connectivity");
            systemService.getClass();
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                i10 = this.f152599b & 3;
            } else {
                if (ib3.f150516a >= 24) {
                    Network activeNetwork = connectivityManager.getActiveNetwork();
                    if (activeNetwork != null) {
                        try {
                            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
                            if (networkCapabilities == null || !networkCapabilities.hasCapability(16)) {
                            }
                        } catch (SecurityException unused) {
                        }
                    }
                    i10 = this.f152599b & 3;
                }
                if ((this.f152599b & 2) == 0 || !connectivityManager.isActiveNetworkMetered()) {
                    i10 = 0;
                } else {
                    i10 = 2;
                }
            }
        } else {
            i10 = 0;
        }
        if ((this.f152599b & 8) != 0 && ((intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"))) == null || ((intExtra = intentRegisterReceiver.getIntExtra("status", -1)) != 2 && intExtra != 5))) {
            i10 |= 8;
        }
        if ((this.f152599b & 4) != 0) {
            Object systemService2 = context.getSystemService("power");
            systemService2.getClass();
            PowerManager powerManager = (PowerManager) systemService2;
            int i11 = ib3.f150516a;
            if (i11 < 23 ? i11 < 20 ? powerManager.isScreenOn() : powerManager.isInteractive() : !powerManager.isDeviceIdleMode()) {
                i10 |= 4;
            }
        }
        return ((this.f152599b & 16) == 0 || context.registerReceiver(null, new IntentFilter("android.intent.action.DEVICE_STORAGE_LOW")) == null) ? i10 : i10 | 16;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && mp2.class == obj.getClass() && this.f152599b == ((mp2) obj).f152599b;
    }

    public final int hashCode() {
        return this.f152599b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f152599b);
    }
}
