package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.hce0;
import defpackage.ib5;
import defpackage.osl0;
import defpackage.ox0;
import defpackage.uif;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzs extends zzbz {
    public static final Parcelable.Creator<zzs> CREATOR = new osl0();
    public static final ox0 i;
    public final int a;
    public final List b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;

    static {
        ox0 ox0Var = new ox0();
        i = ox0Var;
        ox0Var.put("registered", FastJsonResponse.Field.G0(2, "registered"));
        ox0Var.put("in_progress", FastJsonResponse.Field.G0(3, "in_progress"));
        ox0Var.put(AnalyticsParam.EVENT_PARAM_SUCCESS, FastJsonResponse.Field.G0(4, AnalyticsParam.EVENT_PARAM_SUCCESS));
        ox0Var.put("failed", FastJsonResponse.Field.G0(5, "failed"));
        ox0Var.put("escrowed", FastJsonResponse.Field.G0(6, "escrowed"));
    }

    public zzs(int i2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5) {
        this.a = i2;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = arrayList3;
        this.e = arrayList4;
        this.f = arrayList5;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Map a() {
        return i;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Object e(FastJsonResponse.Field field) {
        int i2 = field.i;
        switch (i2) {
            case 1:
                return Integer.valueOf(this.a);
            case 2:
                return this.b;
            case 3:
                return this.c;
            case 4:
                return this.d;
            case 5:
                return this.e;
            case 6:
                return this.f;
            default:
                ib5.a(hce0.a(i2, "Unknown SafeParcelable id="));
                return null;
        }
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean h(FastJsonResponse.Field field) {
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM = uif.m(parcel, 20293);
        uif.o(parcel, 1, 4);
        parcel.writeInt(this.a);
        uif.j(parcel, 2, this.b);
        uif.j(parcel, 3, this.c);
        uif.j(parcel, 4, this.d);
        uif.j(parcel, 5, this.e);
        uif.j(parcel, 6, this.f);
        uif.n(parcel, iM);
    }

    public zzs() {
        this.a = 1;
    }
}
