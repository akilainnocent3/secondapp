package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.hm20;
import defpackage.scy;
import defpackage.uif;
import defpackage.ujk0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class AuthorizationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<AuthorizationRequest> CREATOR = new ujk0();
    public final List a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final Account e;
    public final String f;
    public final String i;
    public final boolean v;
    public final Bundle w;
    public final boolean y;

    public AuthorizationRequest(ArrayList arrayList, String str, boolean z, boolean z2, Account account, String str2, String str3, boolean z3, Bundle bundle, boolean z4) {
        boolean z5 = false;
        if (arrayList != null && !arrayList.isEmpty()) {
            z5 = true;
        }
        hm20.a("requestedScopes cannot be null or empty", z5);
        this.a = arrayList;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = account;
        this.f = str2;
        this.i = str3;
        this.v = z3;
        this.w = bundle;
        this.y = z4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthorizationRequest)) {
            return false;
        }
        AuthorizationRequest authorizationRequest = (AuthorizationRequest) obj;
        List list = this.a;
        int size = list.size();
        List list2 = authorizationRequest.a;
        if (size == list2.size() && list.containsAll(list2)) {
            Bundle bundle = authorizationRequest.w;
            Bundle bundle2 = this.w;
            if (bundle2 == null) {
                if (bundle == null) {
                    bundle = null;
                }
                return false;
            }
            if (bundle2 == null || bundle != null) {
                if (bundle2 != null) {
                    if (bundle2.size() != bundle.size()) {
                        return false;
                    }
                    for (String str : bundle2.keySet()) {
                        if (!scy.a(bundle2.getString(str), bundle.getString(str))) {
                            return false;
                        }
                    }
                }
                if (this.c == authorizationRequest.c && this.v == authorizationRequest.v && this.d == authorizationRequest.d && this.y == authorizationRequest.y && scy.a(this.b, authorizationRequest.b) && scy.a(this.e, authorizationRequest.e) && scy.a(this.f, authorizationRequest.f) && scy.a(this.i, authorizationRequest.i)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.c), Boolean.valueOf(this.v), Boolean.valueOf(this.d), this.e, this.f, this.i, this.w, Boolean.valueOf(this.y)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = uif.m(parcel, 20293);
        uif.l(parcel, 1, this.a, false);
        uif.i(parcel, 2, this.b, false);
        uif.o(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        uif.o(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        uif.h(parcel, 5, this.e, i, false);
        uif.i(parcel, 6, this.f, false);
        uif.i(parcel, 7, this.i, false);
        uif.o(parcel, 8, 4);
        parcel.writeInt(this.v ? 1 : 0);
        uif.a(parcel, 9, this.w);
        uif.o(parcel, 10, 4);
        parcel.writeInt(this.y ? 1 : 0);
        uif.n(parcel, iM);
    }
}
