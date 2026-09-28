package com.sporty.android.platform.features.newotp.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import defpackage.gmf0;
import defpackage.m2g;
import defpackage.p200;
import defpackage.uf00;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sporty/android/platform/features/newotp/util/OTPInternalData;", "Landroid/os/Parcelable;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class OTPInternalData implements Parcelable {
    public static final Parcelable.Creator<OTPInternalData> CREATOR = new a();
    public final List<OtpSelection> a;
    public final String b;
    public final OTPResponse c;

    public static final class a implements Parcelable.Creator<OTPInternalData> {
        @Override // android.os.Parcelable.Creator
        public final OTPInternalData createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = p200.a(OtpSelection.CREATOR, parcel, arrayList, iA, 1);
            }
            return new OTPInternalData(arrayList, parcel.readString(), (OTPResponse) parcel.readParcelable(OTPInternalData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final OTPInternalData[] newArray(int i) {
            return new OTPInternalData[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OTPInternalData(List<? extends OtpSelection> list, String str, OTPResponse oTPResponse) {
        list.getClass();
        str.getClass();
        oTPResponse.getClass();
        this.a = list;
        this.b = str;
        this.c = oTPResponse;
    }

    public static OTPInternalData a(OTPInternalData oTPInternalData, uf00 uf00Var, String str, OTPResponse oTPResponse, int i) {
        List<OtpSelection> list = uf00Var;
        if ((i & 1) != 0) {
            list = oTPInternalData.a;
        }
        if ((i & 2) != 0) {
            str = oTPInternalData.b;
        }
        if ((i & 4) != 0) {
            oTPResponse = oTPInternalData.c;
        }
        list.getClass();
        str.getClass();
        oTPResponse.getClass();
        return new OTPInternalData(list, str, oTPResponse);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OTPInternalData)) {
            return false;
        }
        OTPInternalData oTPInternalData = (OTPInternalData) obj;
        return Intrinsics.g(this.a, oTPInternalData.a) && Intrinsics.g(this.b, oTPInternalData.b) && Intrinsics.g(this.c, oTPInternalData.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "OTPInternalData(otpSelectionList=" + this.a + ", sessionToken=" + this.b + ", otpResponse=" + this.c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        List<OtpSelection> list = this.a;
        parcel.writeInt(list.size());
        Iterator<OtpSelection> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
    }

    public OTPInternalData() {
        this(null, 7);
    }

    public OTPInternalData(String str, int i) {
        this(m2g.a, (i & 2) != 0 ? "" : str, OTPResponse.NoResponse.a);
    }
}
