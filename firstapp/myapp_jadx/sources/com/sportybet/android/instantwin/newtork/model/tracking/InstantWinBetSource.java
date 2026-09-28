package com.sportybet.android.instantwin.newtork.model.tracking;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.om2;
import defpackage.tag;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nÊ\u0001\u0002\b\u0013¨\u0006\u0012"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/tracking/InstantWinBetSource;", "Landroid/os/Parcelable;", "", "trackingValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getTrackingValue", "()Ljava/lang/String;", "BETSLIP", "QUICK_BET", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "instantWin", "Lkotlinx/parcelize/Parcelize;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public enum InstantWinBetSource implements Parcelable {
    BETSLIP("betslip"),
    QUICK_BET("quick_bet");

    private final String trackingValue;
    private static final /* synthetic */ tag $ENTRIES = om2.a(values());
    public static final Parcelable.Creator<InstantWinBetSource> CREATOR = new Parcelable.Creator<InstantWinBetSource>() { // from class: com.sportybet.android.instantwin.newtork.model.tracking.InstantWinBetSource.Creator
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InstantWinBetSource createFromParcel(Parcel parcel) {
            parcel.getClass();
            return InstantWinBetSource.valueOf(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InstantWinBetSource[] newArray(int i) {
            return new InstantWinBetSource[i];
        }
    };

    InstantWinBetSource(String str) {
        this.trackingValue = str;
    }

    public static tag<InstantWinBetSource> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getTrackingValue() {
        return this.trackingValue;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(name());
    }
}
