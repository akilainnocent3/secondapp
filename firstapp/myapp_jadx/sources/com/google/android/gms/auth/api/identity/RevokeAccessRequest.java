package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bmy;
import defpackage.ckk0;
import defpackage.dlk0;
import defpackage.ekk0;
import defpackage.fkk0;
import defpackage.scy;
import defpackage.t7l;
import defpackage.uif;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class RevokeAccessRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<RevokeAccessRequest> CREATOR = new dlk0();
    public final ekk0 a;
    public final Account b;
    public final String c;

    public RevokeAccessRequest(ArrayList arrayList, Account account, String str) {
        ckk0 ckk0Var = ekk0.b;
        Object[] array = arrayList.toArray();
        int length = array.length;
        for (int i = 0; i < length; i++) {
            if (array[i] == null) {
                bmy.a(t7l.b(i, "at index ", new StringBuilder(String.valueOf(i).length() + 9)));
                throw null;
            }
        }
        int length2 = array.length;
        this.a = length2 == 0 ? fkk0.e : new fkk0(length2, array);
        this.b = account;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof RevokeAccessRequest) {
            RevokeAccessRequest revokeAccessRequest = (RevokeAccessRequest) obj;
            ekk0 ekk0Var = this.a;
            int size = ekk0Var.size();
            ekk0 ekk0Var2 = revokeAccessRequest.a;
            if (size == ekk0Var2.size() && ekk0Var.containsAll(ekk0Var2) && scy.a(this.b, revokeAccessRequest.b) && scy.a(this.c, revokeAccessRequest.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = uif.m(parcel, 20293);
        uif.l(parcel, 1, this.a, false);
        uif.h(parcel, 2, this.b, i, false);
        uif.i(parcel, 3, this.c, false);
        uif.n(parcel, iM);
    }
}
