package com.sportybet.android.instantwin.model.scheduledfootball;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/android/instantwin/model/scheduledfootball/ScheduledFootballServerTime;", "Landroid/os/Parcelable;", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ScheduledFootballServerTime implements Parcelable {
    public static final Parcelable.Creator<ScheduledFootballServerTime> CREATOR = new a();
    public final long a;
    public final long b;

    public static final class a implements Parcelable.Creator<ScheduledFootballServerTime> {
        @Override // android.os.Parcelable.Creator
        public final ScheduledFootballServerTime createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new ScheduledFootballServerTime(parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final ScheduledFootballServerTime[] newArray(int i) {
            return new ScheduledFootballServerTime[i];
        }
    }

    public ScheduledFootballServerTime(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }
}
