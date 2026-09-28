package com.sporty.android.platform.features.loyalty.footballgame;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.internal.m;
import defpackage.gmf0;
import defpackage.ux5;
import defpackage.x9d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sporty/android/platform/features/loyalty/footballgame/FootballData;", "Landroid/os/Parcelable;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class FootballData implements Parcelable {
    public static final Parcelable.Creator<FootballData> CREATOR = new a();
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public static final class a implements Parcelable.Creator<FootballData> {
        @Override // android.os.Parcelable.Creator
        public final FootballData createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new FootballData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final FootballData[] newArray(int i) {
            return new FootballData[i];
        }
    }

    public FootballData(String str, String str2, String str3, boolean z) {
        m.a(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FootballData)) {
            return false;
        }
        FootballData footballData = (FootballData) obj;
        return Intrinsics.g(this.a, footballData.a) && Intrinsics.g(this.b, footballData.b) && Intrinsics.g(this.c, footballData.c) && this.d == footballData.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return x9d.a(this.c, ", shouldSkipBallFlicking=", ")", ux5.a("FootballData(date=", this.a, ", reward=", this.b, ", batchId="), this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
    }

    public FootballData() {
        this(0);
    }

    public /* synthetic */ FootballData(int i) {
        this("", "", "", false);
    }
}
