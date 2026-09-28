package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.d580;
import defpackage.ghl0;
import defpackage.hb5;
import defpackage.uif;
import defpackage.uvh;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class DeviceOrientation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DeviceOrientation> CREATOR = new ghl0();
    public final float[] a;
    public final float b;
    public final float c;
    public final long d;
    public final byte e;
    public final float f;
    public final float i;

    public DeviceOrientation(float[] fArr, float f, float f2, long j, byte b, float f3, float f4) {
        if (!(fArr != null && fArr.length == 4)) {
            hb5.a("Input attitude array should be of length 4.");
            throw null;
        }
        if (!((Float.isNaN(fArr[0]) || Float.isNaN(fArr[1]) || Float.isNaN(fArr[2]) || Float.isNaN(fArr[3])) ? false : true)) {
            hb5.a("Input attitude cannot contain NaNs.");
            throw null;
        }
        if (f < 0.0f || f >= 360.0f) {
            d580.a();
            throw null;
        }
        if (f2 < 0.0f || f2 > 180.0f) {
            d580.a();
            throw null;
        }
        if (f4 < 0.0f || f4 > 180.0f) {
            d580.a();
            throw null;
        }
        if (j < 0) {
            d580.a();
            throw null;
        }
        this.a = fArr;
        this.b = f;
        this.c = f2;
        this.f = f3;
        this.i = f4;
        this.d = j;
        this.e = (byte) (((byte) (((byte) (b | 16)) | 4)) | 8);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DeviceOrientation) {
                DeviceOrientation deviceOrientation = (DeviceOrientation) obj;
                byte b = deviceOrientation.e;
                byte b2 = this.e;
                boolean z = ((b2 & 32) != 0) == ((b & 32) != 0) && ((b2 & 32) == 0 || Float.compare(this.f, deviceOrientation.f) == 0);
                boolean z2 = ((b2 & 64) != 0) == ((b & 64) != 0) && ((b2 & 64) == 0 || Float.compare(this.i, deviceOrientation.i) == 0);
                if (Float.compare(this.b, deviceOrientation.b) != 0 || Float.compare(this.c, deviceOrientation.c) != 0 || !z || !z2 || this.d != deviceOrientation.d || !Arrays.equals(this.a, deviceOrientation.a)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.b), Float.valueOf(this.c), Float.valueOf(this.i), Long.valueOf(this.d), this.a, Byte.valueOf(this.e)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceOrientation[attitude=");
        sb.append(Arrays.toString(this.a));
        sb.append(", headingDegrees=");
        sb.append(this.b);
        sb.append(", headingErrorDegrees=");
        sb.append(this.c);
        if ((this.e & 64) != 0) {
            sb.append(", conservativeHeadingErrorDegrees=");
            sb.append(this.i);
        }
        sb.append(", elapsedRealtimeNs=");
        return uvh.a(sb, this.d, ']');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = uif.m(parcel, 20293);
        float[] fArr = (float[]) this.a.clone();
        int iM2 = uif.m(parcel, 1);
        parcel.writeFloatArray(fArr);
        uif.n(parcel, iM2);
        uif.o(parcel, 4, 4);
        parcel.writeFloat(this.b);
        uif.o(parcel, 5, 4);
        parcel.writeFloat(this.c);
        uif.o(parcel, 6, 8);
        parcel.writeLong(this.d);
        uif.o(parcel, 7, 4);
        parcel.writeInt(this.e);
        uif.o(parcel, 8, 4);
        parcel.writeFloat(this.f);
        uif.o(parcel, 9, 4);
        parcel.writeFloat(this.i);
        uif.n(parcel, iM);
    }
}
