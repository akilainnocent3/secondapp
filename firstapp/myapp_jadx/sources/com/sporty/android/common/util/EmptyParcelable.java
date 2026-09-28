package com.sporty.android.common.util;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sporty/android/common/util/EmptyParcelable;", "Landroid/os/Parcelable;", "<init>", "()V", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class EmptyParcelable implements Parcelable {
    public static final EmptyParcelable a = new EmptyParcelable();
    public static final Parcelable.Creator<EmptyParcelable> CREATOR = new a();

    public static final class a implements Parcelable.Creator<EmptyParcelable> {
        @Override // android.os.Parcelable.Creator
        public final EmptyParcelable createFromParcel(Parcel parcel) {
            parcel.getClass();
            parcel.readInt();
            return EmptyParcelable.a;
        }

        @Override // android.os.Parcelable.Creator
        public final EmptyParcelable[] newArray(int i) {
            return new EmptyParcelable[i];
        }
    }

    private EmptyParcelable() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
