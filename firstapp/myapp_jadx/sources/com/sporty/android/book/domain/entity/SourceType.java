package com.sporty.android.book.domain.entity;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.om2;
import defpackage.tag;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bj\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tÊ\u0001\u0002\b\u0012¨\u0006\u0011"}, d2 = {"Lcom/sporty/android/book/domain/entity/SourceType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "BET_RADAR", "BET_GENIUS", "BETER", "SPORTING_RISK", "LSPORTS", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "sportybook", "Lkotlinx/parcelize/Parcelize;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public enum SourceType implements Parcelable {
    BET_RADAR,
    BET_GENIUS,
    BETER,
    SPORTING_RISK,
    LSPORTS;

    private static final /* synthetic */ tag $ENTRIES = om2.a(values());
    public static final Parcelable.Creator<SourceType> CREATOR = new Parcelable.Creator<SourceType>() { // from class: com.sporty.android.book.domain.entity.SourceType.Creator
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SourceType createFromParcel(Parcel parcel) {
            parcel.getClass();
            return SourceType.valueOf(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SourceType[] newArray(int i) {
            return new SourceType[i];
        }
    };

    public static tag<SourceType> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(name());
    }
}
