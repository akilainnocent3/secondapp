package com.sportybet.feature.loyalty.impl.bettingstreak.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.t24;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/feature/loyalty/impl/bettingstreak/domain/model/BettingStreakMissionUpdate;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BettingStreakMissionUpdate implements Parcelable {
    public static final Parcelable.Creator<BettingStreakMissionUpdate> CREATOR = new a();
    public final t24 a;

    public static final class a implements Parcelable.Creator<BettingStreakMissionUpdate> {
        @Override // android.os.Parcelable.Creator
        public final BettingStreakMissionUpdate createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new BettingStreakMissionUpdate(t24.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final BettingStreakMissionUpdate[] newArray(int i) {
            return new BettingStreakMissionUpdate[i];
        }
    }

    public BettingStreakMissionUpdate(t24 t24Var) {
        t24Var.getClass();
        this.a = t24Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BettingStreakMissionUpdate) && this.a == ((BettingStreakMissionUpdate) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BettingStreakMissionUpdate(type=" + this.a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a.name());
    }

    public BettingStreakMissionUpdate() {
        this(0);
    }

    public /* synthetic */ BettingStreakMissionUpdate(int i) {
        this(t24.PlaceWagerMissionEarned);
    }
}
