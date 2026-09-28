package com.sportybet.android.instantwin.router.openbet;

import android.os.Parcel;
import android.os.Parcelable;
import com.sportybet.android.instantwin.model.scheduledfootball.ScheduledFootballServerTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/android/instantwin/router/openbet/ScheduledFootballOpenBetsInput;", "Landroid/os/Parcelable;", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class ScheduledFootballOpenBetsInput implements Parcelable {
    public static final Parcelable.Creator<ScheduledFootballOpenBetsInput> CREATOR = new a();
    public final String a;
    public final ScheduledFootballServerTime b;

    public static final class a implements Parcelable.Creator<ScheduledFootballOpenBetsInput> {
        @Override // android.os.Parcelable.Creator
        public final ScheduledFootballOpenBetsInput createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new ScheduledFootballOpenBetsInput(parcel.readString(), ScheduledFootballServerTime.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ScheduledFootballOpenBetsInput[] newArray(int i) {
            return new ScheduledFootballOpenBetsInput[i];
        }
    }

    public ScheduledFootballOpenBetsInput(String str, ScheduledFootballServerTime scheduledFootballServerTime) {
        str.getClass();
        scheduledFootballServerTime.getClass();
        this.a = str;
        this.b = scheduledFootballServerTime;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScheduledFootballOpenBetsInput)) {
            return false;
        }
        ScheduledFootballOpenBetsInput scheduledFootballOpenBetsInput = (ScheduledFootballOpenBetsInput) obj;
        return Intrinsics.g(this.a, scheduledFootballOpenBetsInput.a) && Intrinsics.g(this.b, scheduledFootballOpenBetsInput.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ScheduledFootballOpenBetsInput(sportId=" + this.a + ", scheduledFootballServerTime=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        this.b.writeToParcel(parcel, i);
    }
}
