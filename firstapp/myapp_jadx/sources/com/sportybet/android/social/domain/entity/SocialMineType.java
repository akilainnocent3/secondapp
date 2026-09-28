package com.sportybet.android.social.domain.entity;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.om2;
import defpackage.tag;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bj\u0010\b\u0005\u0012\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0005j\u0010\b\b\u0012\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\bj\u0010\b\t\u0012\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\tÊ\u0001\u0002\b\u0012Ê\u0001\u0002\b\u0013¨\u0006\u0011"}, d2 = {"Lcom/sportybet/android/social/domain/entity/SocialMineType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "MINE", "Lcom/google/gson/annotations/SerializedName;", "value", "NOT_MINE", "INVALID", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "africa-bet-android", "Landroidx/annotation/Keep;", "Lkotlinx/parcelize/Parcelize;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public enum SocialMineType implements Parcelable {
    MINE,
    NOT_MINE,
    INVALID;

    private static final /* synthetic */ tag $ENTRIES = om2.a(values());
    public static final Parcelable.Creator<SocialMineType> CREATOR = new a();

    public static final class a implements Parcelable.Creator<SocialMineType> {
        @Override // android.os.Parcelable.Creator
        public final SocialMineType createFromParcel(Parcel parcel) {
            parcel.getClass();
            return SocialMineType.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SocialMineType[] newArray(int i) {
            return new SocialMineType[i];
        }
    }

    public static tag<SocialMineType> getEntries() {
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
