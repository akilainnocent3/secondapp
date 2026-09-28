package com.sportybet.android.bookingcode.presentation.smartremix;

import android.os.Parcel;
import android.os.Parcelable;
import com.sportybet.android.bookingcode.presentation.uistate.HighLiabilityItemUiState;
import defpackage.ew7;
import defpackage.f78;
import defpackage.p200;
import defpackage.vt5;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/android/bookingcode/presentation/smartremix/SmartRemixConfirmationUiState;", "Landroid/os/Parcelable;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SmartRemixConfirmationUiState implements Parcelable {
    public static final Parcelable.Creator<SmartRemixConfirmationUiState> CREATOR = new a();
    public final String a;
    public final Integer b;
    public final ArrayList c;
    public final ArrayList d;
    public final ArrayList e;

    public static final class a implements Parcelable.Creator<SmartRemixConfirmationUiState> {
        @Override // android.os.Parcelable.Creator
        public final SmartRemixConfirmationUiState createFromParcel(Parcel parcel) {
            parcel.getClass();
            String string = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(SmartRemixConfirmationUiState.class.getClassLoader()));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            int iA2 = 0;
            while (iA2 != i3) {
                iA2 = p200.a(HighLiabilityItemUiState.CREATOR, parcel, arrayList2, iA2, 1);
            }
            int i4 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i4);
            while (iA != i4) {
                iA = p200.a(HighLiabilityItemUiState.CREATOR, parcel, arrayList3, iA, 1);
            }
            return new SmartRemixConfirmationUiState(string, numValueOf, arrayList, arrayList2, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final SmartRemixConfirmationUiState[] newArray(int i) {
            return new SmartRemixConfirmationUiState[i];
        }
    }

    public SmartRemixConfirmationUiState(String str, Integer num, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.a = str;
        this.b = num;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmartRemixConfirmationUiState)) {
            return false;
        }
        SmartRemixConfirmationUiState smartRemixConfirmationUiState = (SmartRemixConfirmationUiState) obj;
        return Intrinsics.g(this.a, smartRemixConfirmationUiState.a) && Intrinsics.g(this.b, smartRemixConfirmationUiState.b) && this.c.equals(smartRemixConfirmationUiState.c) && this.d.equals(smartRemixConfirmationUiState.d) && this.e.equals(smartRemixConfirmationUiState.e);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        return this.e.hashCode() + vt5.a(this.d, vt5.a(this.c, (iHashCode + (num != null ? num.hashCode() : 0)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbA = ew7.a(this.b, "SmartRemixConfirmationUiState(shareCode=", this.a, ", orderType=", ", selections=");
        sbA.append(this.c);
        sbA.append(", removing=");
        sbA.append(this.d);
        sbA.append(", adding=");
        sbA.append(this.e);
        sbA.append(")");
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        int i2 = 0;
        Integer num = this.b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            f78.c(parcel, 1, num);
        }
        ArrayList arrayList = this.c;
        parcel.writeInt(arrayList.size());
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            parcel.writeParcelable((Parcelable) obj, i);
        }
        ArrayList arrayList2 = this.d;
        parcel.writeInt(arrayList2.size());
        int size2 = arrayList2.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList2.get(i4);
            i4++;
            ((HighLiabilityItemUiState) obj2).writeToParcel(parcel, i);
        }
        ArrayList arrayList3 = this.e;
        parcel.writeInt(arrayList3.size());
        int size3 = arrayList3.size();
        while (i2 < size3) {
            Object obj3 = arrayList3.get(i2);
            i2++;
            ((HighLiabilityItemUiState) obj3).writeToParcel(parcel, i);
        }
    }
}
