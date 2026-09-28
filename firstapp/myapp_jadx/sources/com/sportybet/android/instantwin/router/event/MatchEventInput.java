package com.sportybet.android.instantwin.router.event;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b6c;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/android/instantwin/router/event/MatchEventInput;", "Landroid/os/Parcelable;", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class MatchEventInput implements Parcelable {
    public static final Parcelable.Creator<MatchEventInput> CREATOR = new a();
    public final boolean a;

    public static final class a implements Parcelable.Creator<MatchEventInput> {
        @Override // android.os.Parcelable.Creator
        public final MatchEventInput createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new MatchEventInput(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final MatchEventInput[] newArray(int i) {
            return new MatchEventInput[i];
        }
    }

    public MatchEventInput(boolean z) {
        this.a = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MatchEventInput) && this.a == ((MatchEventInput) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return b6c.a("MatchEventInput(isBetBuilderMode=", ")", this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a ? 1 : 0);
    }
}
