package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import defpackage.gtl0;
import defpackage.hce0;
import defpackage.ib5;
import defpackage.uif;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzu extends zzbz {
    public static final Parcelable.Creator<zzu> CREATOR = new gtl0();
    public static final HashMap i;
    public final HashSet a;
    public final int b;
    public final zzw c;
    public final String d;
    public final String e;
    public final String f;

    static {
        HashMap map = new HashMap();
        i = map;
        map.put("authenticatorInfo", new FastJsonResponse.Field(11, false, 11, false, "authenticatorInfo", 2, zzw.class));
        map.put("signature", new FastJsonResponse.Field(7, false, 7, false, "signature", 3, null));
        map.put("package", new FastJsonResponse.Field(7, false, 7, false, "package", 4, null));
    }

    public zzu(HashSet hashSet, int i2, zzw zzwVar, String str, String str2, String str3) {
        this.a = hashSet;
        this.b = i2;
        this.c = zzwVar;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final /* synthetic */ Map a() {
        return i;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Object e(FastJsonResponse.Field field) {
        int i2 = field.i;
        if (i2 == 1) {
            return Integer.valueOf(this.b);
        }
        if (i2 == 2) {
            return this.c;
        }
        if (i2 == 3) {
            return this.d;
        }
        if (i2 == 4) {
            return this.e;
        }
        ib5.a(hce0.a(i2, "Unknown SafeParcelable id="));
        return null;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean h(FastJsonResponse.Field field) {
        return this.a.contains(Integer.valueOf(field.i));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM = uif.m(parcel, 20293);
        HashSet hashSet = this.a;
        if (hashSet.contains(1)) {
            uif.o(parcel, 1, 4);
            parcel.writeInt(this.b);
        }
        if (hashSet.contains(2)) {
            uif.h(parcel, 2, this.c, i2, true);
        }
        if (hashSet.contains(3)) {
            uif.i(parcel, 3, this.d, true);
        }
        if (hashSet.contains(4)) {
            uif.i(parcel, 4, this.e, true);
        }
        if (hashSet.contains(5)) {
            uif.i(parcel, 5, this.f, true);
        }
        uif.n(parcel, iM);
    }

    public zzu() {
        this.a = new HashSet(3);
        this.b = 1;
    }
}
