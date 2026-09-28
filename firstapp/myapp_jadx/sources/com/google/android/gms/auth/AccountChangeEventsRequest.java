package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ork0;
import defpackage.uif;

/* JADX INFO: loaded from: classes4.dex */
public class AccountChangeEventsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEventsRequest> CREATOR = new ork0();
    public final int a;
    public final int b;

    @Deprecated
    public final String c;
    public final Account d;

    public AccountChangeEventsRequest(int i, int i2, String str, Account account) {
        this.a = i;
        this.b = i2;
        this.c = str;
        if (account != null || TextUtils.isEmpty(str)) {
            this.d = account;
        } else {
            this.d = new Account(str, "com.google");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = uif.m(parcel, 20293);
        uif.o(parcel, 1, 4);
        parcel.writeInt(this.a);
        uif.o(parcel, 2, 4);
        parcel.writeInt(this.b);
        uif.i(parcel, 3, this.c, false);
        uif.h(parcel, 4, this.d, i, false);
        uif.n(parcel, iM);
    }

    public AccountChangeEventsRequest() {
        this.a = 1;
    }
}
