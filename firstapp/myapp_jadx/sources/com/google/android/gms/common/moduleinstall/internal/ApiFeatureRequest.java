package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.hm20;
import defpackage.scy;
import defpackage.tgk0;
import defpackage.uif;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ApiFeatureRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ApiFeatureRequest> CREATOR = new tgk0();
    public final List a;
    public final boolean b;
    public final String c;
    public final String d;

    public ApiFeatureRequest(ArrayList arrayList, boolean z, String str, String str2) {
        hm20.h(arrayList);
        this.a = arrayList;
        this.b = z;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ApiFeatureRequest)) {
            return false;
        }
        ApiFeatureRequest apiFeatureRequest = (ApiFeatureRequest) obj;
        return this.b == apiFeatureRequest.b && scy.a(this.a, apiFeatureRequest.a) && scy.a(this.c, apiFeatureRequest.c) && scy.a(this.d, apiFeatureRequest.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.b), this.a, this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = uif.m(parcel, 20293);
        uif.l(parcel, 1, this.a, false);
        uif.o(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        uif.i(parcel, 3, this.c, false);
        uif.i(parcel, 4, this.d, false);
        uif.n(parcel, iM);
    }
}
