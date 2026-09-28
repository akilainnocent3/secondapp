package com.sportybet.android.instantwin.router.ticketdetail;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.gmf0;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/sportybet/android/instantwin/router/ticketdetail/InstantWinTicketDetailInput;", "Landroid/os/Parcelable;", "b", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class InstantWinTicketDetailInput implements Parcelable {
    public static final Parcelable.Creator<InstantWinTicketDetailInput> CREATOR = new a();
    public final String a;
    public final String b;
    public final b c;

    public static final class a implements Parcelable.Creator<InstantWinTicketDetailInput> {
        @Override // android.os.Parcelable.Creator
        public final InstantWinTicketDetailInput createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new InstantWinTicketDetailInput(parcel.readString(), parcel.readString(), b.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final InstantWinTicketDetailInput[] newArray(int i) {
            return new InstantWinTicketDetailInput[i];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b a;
        public static final b b;
        public static final /* synthetic */ b[] c;

        static {
            b bVar = new b("HIDDEN", 0);
            a = bVar;
            b bVar2 = new b("VISIBLE", 1);
            b = bVar2;
            c = new b[]{bVar, bVar2};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) c.clone();
        }
    }

    public InstantWinTicketDetailInput(String str, String str2, b bVar) {
        str.getClass();
        str2.getClass();
        bVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = bVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstantWinTicketDetailInput)) {
            return false;
        }
        InstantWinTicketDetailInput instantWinTicketDetailInput = (InstantWinTicketDetailInput) obj;
        return Intrinsics.g(this.a, instantWinTicketDetailInput.a) && Intrinsics.g(this.b, instantWinTicketDetailInput.b) && this.c == instantWinTicketDetailInput.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("InstantWinTicketDetailInput(sportId=", this.a, ", ticketId=", this.b, ", topAppBarState=");
        sbA.append(this.c);
        sbA.append(")");
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c.name());
    }

    public /* synthetic */ InstantWinTicketDetailInput(String str, String str2) {
        this(str, str2, b.b);
    }
}
