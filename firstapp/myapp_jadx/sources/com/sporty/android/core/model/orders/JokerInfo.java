package com.sporty.android.core.model.orders;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.tug;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u000bHÖ\u0081\u0004J\n\u0010\u0011\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007Ê\u0001\u0002\b\u0018¨\u0006\u0017"}, d2 = {"Lcom/sporty/android/core/model/orders/JokerInfo;", "Landroid/os/Parcelable;", "actualOutcomeOdds", "", "<init>", "(Ljava/lang/String;)V", "getActualOutcomeOdds", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model", "Lkotlinx/parcelize/Parcelize;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class JokerInfo implements Parcelable {
    public static final Parcelable.Creator<JokerInfo> CREATOR = new Creator();
    private final String actualOutcomeOdds;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<JokerInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final JokerInfo createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new JokerInfo(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final JokerInfo[] newArray(int i) {
            return new JokerInfo[i];
        }
    }

    public JokerInfo(String str) {
        str.getClass();
        this.actualOutcomeOdds = str;
    }

    public static /* synthetic */ JokerInfo copy$default(JokerInfo jokerInfo, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = jokerInfo.actualOutcomeOdds;
        }
        return jokerInfo.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getActualOutcomeOdds() {
        return this.actualOutcomeOdds;
    }

    public final JokerInfo copy(String actualOutcomeOdds) {
        actualOutcomeOdds.getClass();
        return new JokerInfo(actualOutcomeOdds);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof JokerInfo) && Intrinsics.g(this.actualOutcomeOdds, ((JokerInfo) other).actualOutcomeOdds);
    }

    public final String getActualOutcomeOdds() {
        return this.actualOutcomeOdds;
    }

    public int hashCode() {
        return this.actualOutcomeOdds.hashCode();
    }

    public String toString() {
        return tug.a("JokerInfo(actualOutcomeOdds=", this.actualOutcomeOdds, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.actualOutcomeOdds);
    }
}
