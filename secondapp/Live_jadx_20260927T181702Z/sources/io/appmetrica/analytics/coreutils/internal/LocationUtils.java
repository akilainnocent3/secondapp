package io.appmetrica.analytics.coreutils.internal;

import android.location.Location;
import android.os.Parcel;
import cs.o;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class LocationUtils {

    @l
    public static final LocationUtils INSTANCE = new LocationUtils();

    private LocationUtils() {
    }

    @o
    @m
    public static final Location bytesToLocation(@m byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            Location location = (Location) parcelObtain.readValue(Location.class.getClassLoader());
            parcelObtain.recycle();
            return location;
        } catch (Throwable unused) {
            parcelObtain.recycle();
            return null;
        }
    }

    @o
    @m
    public static final byte[] locationToBytes(@m Location location) {
        if (location == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeValue(location);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            return bArrMarshall;
        } catch (Throwable unused) {
            parcelObtain.recycle();
            return null;
        }
    }
}
