package com.sportygames.commons.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.sportybet.feature.dedicatedteampage.team.data.model.Vc.ACKxwYRsuWyGz;
import defpackage.hib0;
import defpackage.nrg0;
import defpackage.uf80;
import defpackage.ux5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003JM\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001cHÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001cR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006("}, d2 = {"Lcom/sportygames/commons/models/GPSData;", "Landroid/os/Parcelable;", "gpsCity", "", "gpsRegion", "gpsCountry", "gpsLatitude", "", "gpsLongitude", "gpsPostalCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDLjava/lang/String;)V", "getGpsCity", "()Ljava/lang/String;", "getGpsRegion", "getGpsCountry", "getGpsLatitude", "()D", "getGpsLongitude", "getGpsPostalCode", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GPSData implements Parcelable {
    private final String gpsCity;
    private final String gpsCountry;
    private final double gpsLatitude;
    private final double gpsLongitude;
    private final String gpsPostalCode;
    private final String gpsRegion;
    public static final Parcelable.Creator<GPSData> CREATOR = new Creator();
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes7.dex */
    @kotlin.Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GPSData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GPSData createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new GPSData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readDouble(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GPSData[] newArray(int i) {
            return new GPSData[i];
        }
    }

    public GPSData(String str, String str2, String str3, double d, double d2, String str4) {
        this.gpsCity = str;
        this.gpsRegion = str2;
        this.gpsCountry = str3;
        this.gpsLatitude = d;
        this.gpsLongitude = d2;
        this.gpsPostalCode = str4;
    }

    public static /* synthetic */ GPSData copy$default(GPSData gPSData, String str, String str2, String str3, double d, double d2, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gPSData.gpsCity;
        }
        if ((i & 2) != 0) {
            str2 = gPSData.gpsRegion;
        }
        if ((i & 4) != 0) {
            str3 = gPSData.gpsCountry;
        }
        if ((i & 8) != 0) {
            d = gPSData.gpsLatitude;
        }
        if ((i & 16) != 0) {
            d2 = gPSData.gpsLongitude;
        }
        if ((i & 32) != 0) {
            str4 = gPSData.gpsPostalCode;
        }
        String str5 = str4;
        double d3 = d2;
        String str6 = str3;
        return gPSData.copy(str, str2, str6, d, d3, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getGpsCity() {
        return this.gpsCity;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getGpsRegion() {
        return this.gpsRegion;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getGpsCountry() {
        return this.gpsCountry;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getGpsLatitude() {
        return this.gpsLatitude;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getGpsLongitude() {
        return this.gpsLongitude;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getGpsPostalCode() {
        return this.gpsPostalCode;
    }

    public final GPSData copy(String gpsCity, String gpsRegion, String gpsCountry, double gpsLatitude, double gpsLongitude, String gpsPostalCode) {
        return new GPSData(gpsCity, gpsRegion, gpsCountry, gpsLatitude, gpsLongitude, gpsPostalCode);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GPSData)) {
            return false;
        }
        GPSData gPSData = (GPSData) other;
        return Intrinsics.g(this.gpsCity, gPSData.gpsCity) && Intrinsics.g(this.gpsRegion, gPSData.gpsRegion) && Intrinsics.g(this.gpsCountry, gPSData.gpsCountry) && Double.compare(this.gpsLatitude, gPSData.gpsLatitude) == 0 && Double.compare(this.gpsLongitude, gPSData.gpsLongitude) == 0 && Intrinsics.g(this.gpsPostalCode, gPSData.gpsPostalCode);
    }

    public final String getGpsCity() {
        return this.gpsCity;
    }

    public final String getGpsCountry() {
        return this.gpsCountry;
    }

    public final double getGpsLatitude() {
        return this.gpsLatitude;
    }

    public final double getGpsLongitude() {
        return this.gpsLongitude;
    }

    public final String getGpsPostalCode() {
        return this.gpsPostalCode;
    }

    public final String getGpsRegion() {
        return this.gpsRegion;
    }

    public int hashCode() {
        String str = this.gpsCity;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.gpsRegion;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.gpsCountry;
        int iA = nrg0.a(nrg0.a((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.gpsLatitude), 31, this.gpsLongitude);
        String str4 = this.gpsPostalCode;
        return iA + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.gpsCity);
        dest.writeString(this.gpsRegion);
        dest.writeString(this.gpsCountry);
        dest.writeDouble(this.gpsLatitude);
        dest.writeDouble(this.gpsLongitude);
        dest.writeString(this.gpsPostalCode);
    }

    public String toString() {
        String str = this.gpsCity;
        String str2 = this.gpsRegion;
        String str3 = this.gpsCountry;
        double d = this.gpsLatitude;
        double d2 = this.gpsLongitude;
        String str4 = this.gpsPostalCode;
        StringBuilder sbA = ux5.a("GPSData(gpsCity=", str, ACKxwYRsuWyGz.hfZJfS, str2, ", gpsCountry=");
        sbA.append(str3);
        sbA.append(", gpsLatitude=");
        sbA.append(d);
        hib0.b(d2, ", gpsLongitude=", ", gpsPostalCode=", sbA);
        return uf80.a(sbA, str4, ")");
    }
}
