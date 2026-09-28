package com.sporty.android.core.model.gift;

import android.os.Parcel;
import android.os.Parcelable;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.ml5;
import defpackage.mtg0;
import defpackage.nng;
import defpackage.nyf;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\"\u001a\u00020\fJ\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010)\u001a\u00020\fHÆ\u0003J\t\u0010*\u001a\u00020\fHÆ\u0003J\t\u0010+\u001a\u00020\fHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jw\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010.\u001a\u00020\u0005J\u0014\u0010/\u001a\u00020\f2\b\u00100\u001a\u0004\u0018\u000101HÖ\u0083\u0004J\n\u00102\u001a\u00020\u0005HÖ\u0081\u0004J\n\u00103\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u001aR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0013Ê\u0001\u0002\b:¨\u00069"}, d2 = {"Lcom/sporty/android/core/model/gift/SelectedGiftData;", "Landroid/os/Parcelable;", "giftValue", "", "giftKind", "", "giftId", "giftLimit", "giftCount", "rawGift", "Lcom/sporty/android/core/model/gift/GiftDetails;", "addToStake", "", AnalyticsParam.EVENT_STATUS_CHECKED, "userSelect", "totalStake", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILcom/sporty/android/core/model/gift/GiftDetails;ZZZLjava/lang/String;)V", "getGiftValue", "()Ljava/lang/String;", "getGiftKind", "()I", "getGiftId", "getGiftLimit", "getGiftCount", "setGiftCount", "(I)V", "getRawGift", "()Lcom/sporty/android/core/model/gift/GiftDetails;", "getAddToStake", "()Z", "getChecked", "getUserSelect", "getTotalStake", "hasGift", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model", "Lkotlinx/parcelize/Parcelize;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SelectedGiftData implements Parcelable {
    public static final Parcelable.Creator<SelectedGiftData> CREATOR = new Creator();
    private final boolean addToStake;
    private final boolean checked;
    private int giftCount;
    private final String giftId;
    private final int giftKind;
    private final String giftLimit;
    private final String giftValue;
    private final GiftDetails rawGift;
    private final String totalStake;
    private final boolean userSelect;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SelectedGiftData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SelectedGiftData createFromParcel(Parcel parcel) {
            parcel.getClass();
            String string = parcel.readString();
            int i = parcel.readInt();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i2 = parcel.readInt();
            GiftDetails giftDetailsCreateFromParcel = parcel.readInt() == 0 ? null : GiftDetails.CREATOR.createFromParcel(parcel);
            boolean z = false;
            boolean z2 = true;
            if (parcel.readInt() != 0) {
                z = true;
            }
            if (parcel.readInt() == 0) {
                z2 = z;
            }
            return new SelectedGiftData(string, i, string2, string3, i2, giftDetailsCreateFromParcel, z, z2, parcel.readInt() != 0, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SelectedGiftData[] newArray(int i) {
            return new SelectedGiftData[i];
        }
    }

    public SelectedGiftData(String str, int i, String str2, String str3, int i2, GiftDetails giftDetails, boolean z, boolean z2, boolean z3, String str4) {
        this.giftValue = str;
        this.giftKind = i;
        this.giftId = str2;
        this.giftLimit = str3;
        this.giftCount = i2;
        this.rawGift = giftDetails;
        this.addToStake = z;
        this.checked = z2;
        this.userSelect = z3;
        this.totalStake = str4;
    }

    public static /* synthetic */ SelectedGiftData copy$default(SelectedGiftData selectedGiftData, String str, int i, String str2, String str3, int i2, GiftDetails giftDetails, boolean z, boolean z2, boolean z3, String str4, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = selectedGiftData.giftValue;
        }
        if ((i3 & 2) != 0) {
            i = selectedGiftData.giftKind;
        }
        if ((i3 & 4) != 0) {
            str2 = selectedGiftData.giftId;
        }
        if ((i3 & 8) != 0) {
            str3 = selectedGiftData.giftLimit;
        }
        if ((i3 & 16) != 0) {
            i2 = selectedGiftData.giftCount;
        }
        if ((i3 & 32) != 0) {
            giftDetails = selectedGiftData.rawGift;
        }
        if ((i3 & 64) != 0) {
            z = selectedGiftData.addToStake;
        }
        if ((i3 & 128) != 0) {
            z2 = selectedGiftData.checked;
        }
        if ((i3 & 256) != 0) {
            z3 = selectedGiftData.userSelect;
        }
        if ((i3 & 512) != 0) {
            str4 = selectedGiftData.totalStake;
        }
        boolean z4 = z3;
        String str5 = str4;
        boolean z5 = z;
        boolean z6 = z2;
        int i4 = i2;
        GiftDetails giftDetails2 = giftDetails;
        return selectedGiftData.copy(str, i, str2, str3, i4, giftDetails2, z5, z6, z4, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getGiftValue() {
        return this.giftValue;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getTotalStake() {
        return this.totalStake;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getGiftKind() {
        return this.giftKind;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getGiftId() {
        return this.giftId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getGiftLimit() {
        return this.giftLimit;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getGiftCount() {
        return this.giftCount;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final GiftDetails getRawGift() {
        return this.rawGift;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getAddToStake() {
        return this.addToStake;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getChecked() {
        return this.checked;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getUserSelect() {
        return this.userSelect;
    }

    public final SelectedGiftData copy(String giftValue, int giftKind, String giftId, String giftLimit, int giftCount, GiftDetails rawGift, boolean addToStake, boolean checked, boolean userSelect, String totalStake) {
        return new SelectedGiftData(giftValue, giftKind, giftId, giftLimit, giftCount, rawGift, addToStake, checked, userSelect, totalStake);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectedGiftData)) {
            return false;
        }
        SelectedGiftData selectedGiftData = (SelectedGiftData) other;
        return Intrinsics.g(this.giftValue, selectedGiftData.giftValue) && this.giftKind == selectedGiftData.giftKind && Intrinsics.g(this.giftId, selectedGiftData.giftId) && Intrinsics.g(this.giftLimit, selectedGiftData.giftLimit) && this.giftCount == selectedGiftData.giftCount && Intrinsics.g(this.rawGift, selectedGiftData.rawGift) && this.addToStake == selectedGiftData.addToStake && this.checked == selectedGiftData.checked && this.userSelect == selectedGiftData.userSelect && Intrinsics.g(this.totalStake, selectedGiftData.totalStake);
    }

    public final boolean getAddToStake() {
        return this.addToStake;
    }

    public final boolean getChecked() {
        return this.checked;
    }

    public final int getGiftCount() {
        return this.giftCount;
    }

    public final String getGiftId() {
        return this.giftId;
    }

    public final int getGiftKind() {
        return this.giftKind;
    }

    public final String getGiftLimit() {
        return this.giftLimit;
    }

    public final String getGiftValue() {
        return this.giftValue;
    }

    public final GiftDetails getRawGift() {
        return this.rawGift;
    }

    public final String getTotalStake() {
        return this.totalStake;
    }

    public final boolean getUserSelect() {
        return this.userSelect;
    }

    public final boolean hasGift() {
        return this.rawGift != null;
    }

    public int hashCode() {
        String str = this.giftValue;
        int iA = gpp.a(this.giftKind, (str == null ? 0 : str.hashCode()) * 31, 31);
        String str2 = this.giftId;
        int iHashCode = (iA + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.giftLimit;
        int iA2 = gpp.a(this.giftCount, (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        GiftDetails giftDetails = this.rawGift;
        int iA3 = mtg0.a(mtg0.a(mtg0.a((iA2 + (giftDetails == null ? 0 : giftDetails.hashCode())) * 31, 31, this.addToStake), 31, this.checked), 31, this.userSelect);
        String str4 = this.totalStake;
        return iA3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setGiftCount(int i) {
        this.giftCount = i;
    }

    public String toString() {
        String str = this.giftValue;
        int i = this.giftKind;
        String str2 = this.giftId;
        String str3 = this.giftLimit;
        int i2 = this.giftCount;
        GiftDetails giftDetails = this.rawGift;
        boolean z = this.addToStake;
        boolean z2 = this.checked;
        boolean z3 = this.userSelect;
        String str4 = this.totalStake;
        StringBuilder sbA = ml5.a(i, "SelectedGiftData(giftValue=", str, ", giftKind=", ", giftId=");
        hxa.c(sbA, str2, ", giftLimit=", str3, ", giftCount=");
        sbA.append(i2);
        sbA.append(", rawGift=");
        sbA.append(giftDetails);
        sbA.append(", addToStake=");
        nng.a(", checked=", ", userSelect=", sbA, z, z2);
        return nyf.a(", totalStake=", str4, ")", sbA, z3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.giftValue);
        dest.writeInt(this.giftKind);
        dest.writeString(this.giftId);
        dest.writeString(this.giftLimit);
        dest.writeInt(this.giftCount);
        GiftDetails giftDetails = this.rawGift;
        if (giftDetails == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            giftDetails.writeToParcel(dest, flags);
        }
        dest.writeInt(this.addToStake ? 1 : 0);
        dest.writeInt(this.checked ? 1 : 0);
        dest.writeInt(this.userSelect ? 1 : 0);
        dest.writeString(this.totalStake);
    }

    public /* synthetic */ SelectedGiftData(String str, int i, String str2, String str3, int i2, GiftDetails giftDetails, boolean z, boolean z2, boolean z3, String str4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, str3, i2, giftDetails, (i3 & 64) != 0 ? false : z, (i3 & 128) != 0 ? true : z2, (i3 & 256) != 0 ? false : z3, str4);
    }
}
