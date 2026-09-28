package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import defpackage.kuk0;
import defpackage.slk0;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends slk0 implements b {
    @Override // com.google.android.gms.common.internal.b
    public final Account zzb() {
        Parcel parcelA = a(b(), 2);
        Account account = (Account) kuk0.a(parcelA, Account.CREATOR);
        parcelA.recycle();
        return account;
    }
}
