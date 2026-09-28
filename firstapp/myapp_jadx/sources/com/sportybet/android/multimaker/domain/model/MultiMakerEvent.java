package com.sportybet.android.multimaker.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.IUw.QWvyvNzGsBpRT;
import com.appsflyer.internal.m;
import defpackage.f87;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.qn4;
import defpackage.to10;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/android/multimaker/domain/model/MultiMakerEvent;", "Landroid/os/Parcelable;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class MultiMakerEvent implements Parcelable {
    public static final Parcelable.Creator<MultiMakerEvent> CREATOR = new a();
    public final String a;
    public final String b;
    public final long c;
    public final int d;
    public final String e;
    public final String f;
    public final String i;
    public final String v;
    public final String w;
    public final String y;

    public static final class a implements Parcelable.Creator<MultiMakerEvent> {
        @Override // android.os.Parcelable.Creator
        public final MultiMakerEvent createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new MultiMakerEvent(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final MultiMakerEvent[] newArray(int i) {
            return new MultiMakerEvent[i];
        }
    }

    public MultiMakerEvent(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, long j, int i) {
        qn4.b(str, str2, str3, str4, str5);
        m.a(str6, str7, str8);
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = i;
        this.e = str3;
        this.f = str4;
        this.i = str5;
        this.v = str6;
        this.w = str7;
        this.y = str8;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiMakerEvent)) {
            return false;
        }
        MultiMakerEvent multiMakerEvent = (MultiMakerEvent) obj;
        return Intrinsics.g(this.a, multiMakerEvent.a) && Intrinsics.g(this.b, multiMakerEvent.b) && this.c == multiMakerEvent.c && this.d == multiMakerEvent.d && Intrinsics.g(this.e, multiMakerEvent.e) && Intrinsics.g(this.f, multiMakerEvent.f) && Intrinsics.g(this.i, multiMakerEvent.i) && Intrinsics.g(this.v, multiMakerEvent.v) && Intrinsics.g(this.w, multiMakerEvent.w) && Intrinsics.g(this.y, multiMakerEvent.y);
    }

    public final int hashCode() {
        return this.y.hashCode() + gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gpp.a(this.d, f87.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), this.c, 31), 31), 31, this.e), 31, this.f), 31, this.i), 31, this.v), 31, this.w);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.i);
        parcel.writeString(this.v);
        parcel.writeString(this.w);
        parcel.writeString(this.y);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("MultiMakerEvent(eventId=", this.a, QWvyvNzGsBpRT.fbkbwrnhmyulI, this.b, ", estimateStartTime=");
        to10.a(sbA, this.c, ", status=", this.d);
        hxa.c(sbA, ", matchStatus=", this.e, ", homeTeamName=", this.f);
        hxa.c(sbA, ", awayTeamName=", this.i, ", sportId=", this.v);
        hxa.c(sbA, ", categoryId=", this.w, ", tournamentId=", this.y);
        sbA.append(")");
        return sbA.toString();
    }

    public MultiMakerEvent() {
        this(0);
    }

    public /* synthetic */ MultiMakerEvent(int i) {
        this("", "", "", "", "", "", "", "", 0L, 0);
    }
}
