package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.hm20;
import defpackage.uif;
import defpackage.vel0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class DetectedActivity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DetectedActivity> CREATOR = new vel0();
    public final int a;
    public final int b;

    public DetectedActivity(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DetectedActivity) {
            DetectedActivity detectedActivity = (DetectedActivity) obj;
            if (this.a == detectedActivity.a && this.b == detectedActivity.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b)});
    }

    public final String toString() {
        String string;
        int i = this.a;
        if (i > 22 || i < 0) {
            i = 4;
        }
        if (i == 0) {
            string = "IN_VEHICLE";
        } else if (i == 1) {
            string = "ON_BICYCLE";
        } else if (i == 2) {
            string = "ON_FOOT";
        } else if (i == 3) {
            string = "STILL";
        } else if (i == 4) {
            string = "UNKNOWN";
        } else if (i == 5) {
            string = "TILTING";
        } else if (i == 7) {
            string = "WALKING";
        } else if (i == 8) {
            string = "RUNNING";
        } else if (i != 16) {
            string = i != 17 ? Integer.toString(i) : "IN_RAIL_VEHICLE";
        } else {
            string = "IN_ROAD_VEHICLE";
        }
        int length = String.valueOf(string).length();
        int i2 = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + length + 36 + 1);
        sb.append("DetectedActivity [type=");
        sb.append(string);
        sb.append(", confidence=");
        sb.append(i2);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        hm20.h(parcel);
        int iM = uif.m(parcel, 20293);
        uif.o(parcel, 1, 4);
        parcel.writeInt(this.a);
        uif.o(parcel, 2, 4);
        parcel.writeInt(this.b);
        uif.n(parcel, iM);
    }
}
