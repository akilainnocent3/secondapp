package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.hm20;
import defpackage.n5l0;
import defpackage.scy;
import defpackage.uif;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class RegisterRequestParams extends RequestParams {
    public static final Parcelable.Creator<RegisterRequestParams> CREATOR = new n5l0();
    public final Integer a;
    public final Double b;
    public final Uri c;
    public final List d;
    public final List e;
    public final ChannelIdValue f;
    public final String i;

    public RegisterRequestParams(Integer num, Double d, Uri uri, ArrayList arrayList, ArrayList arrayList2, ChannelIdValue channelIdValue, String str) {
        this.a = num;
        this.b = d;
        this.c = uri;
        hm20.a("empty list of register requests is provided", (arrayList == null || arrayList.isEmpty()) ? false : true);
        this.d = arrayList;
        this.e = arrayList2;
        this.f = channelIdValue;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            RegisterRequest registerRequest = (RegisterRequest) obj;
            hm20.a("register request has null appId and no request appId is provided", (uri == null && registerRequest.d == null) ? false : true);
            String str2 = registerRequest.d;
            if (str2 != null) {
                hashSet.add(Uri.parse(str2));
            }
        }
        int size2 = arrayList2.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            RegisteredKey registeredKey = (RegisteredKey) obj2;
            hm20.a("registered key has null appId and no request appId is provided", (uri == null && registeredKey.b == null) ? false : true);
            String str3 = registeredKey.b;
            if (str3 != null) {
                hashSet.add(Uri.parse(str3));
            }
        }
        hm20.a("Display Hint cannot be longer than 80 characters", str == null || str.length() <= 80);
        this.i = str;
    }

    public final boolean equals(Object obj) {
        List list;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterRequestParams)) {
            return false;
        }
        RegisterRequestParams registerRequestParams = (RegisterRequestParams) obj;
        List list2 = registerRequestParams.e;
        return scy.a(this.a, registerRequestParams.a) && scy.a(this.b, registerRequestParams.b) && scy.a(this.c, registerRequestParams.c) && scy.a(this.d, registerRequestParams.d) && (((list = this.e) == null && list2 == null) || (list != null && list2 != null && list.containsAll(list2) && list2.containsAll(list))) && scy.a(this.f, registerRequestParams.f) && scy.a(this.i, registerRequestParams.i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, this.b, this.d, this.e, this.f, this.i});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = uif.m(parcel, 20293);
        uif.f(parcel, 2, this.a);
        uif.c(parcel, 3, this.b);
        uif.h(parcel, 4, this.c, i, false);
        uif.l(parcel, 5, this.d, false);
        uif.l(parcel, 6, this.e, false);
        uif.h(parcel, 7, this.f, i, false);
        uif.i(parcel, 8, this.i, false);
        uif.n(parcel, iM);
    }
}
