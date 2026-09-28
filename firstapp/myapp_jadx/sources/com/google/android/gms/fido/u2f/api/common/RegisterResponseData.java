package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ksk0;
import defpackage.lok0;
import defpackage.m8j;
import defpackage.qok0;
import defpackage.scy;
import defpackage.uif;
import defpackage.xsk0;
import defpackage.y7l0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class RegisterResponseData extends ResponseData {
    public static final Parcelable.Creator<RegisterResponseData> CREATOR = new y7l0();
    public final byte[] a;
    public final ProtocolVersion b;
    public final String c;

    public RegisterResponseData(String str, String str2, byte[] bArr) {
        this.a = bArr;
        try {
            this.b = ProtocolVersion.a(str);
            this.c = str2;
        } catch (ProtocolVersion.a e) {
            m8j.a(e);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RegisterResponseData)) {
            return false;
        }
        RegisterResponseData registerResponseData = (RegisterResponseData) obj;
        return scy.a(this.b, registerResponseData.b) && Arrays.equals(this.a, registerResponseData.a) && scy.a(this.c, registerResponseData.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Integer.valueOf(Arrays.hashCode(this.a)), this.c});
    }

    public final String toString() {
        lok0 lok0VarA = qok0.a(this);
        lok0VarA.a(this.b, "protocolVersion");
        ksk0 ksk0Var = xsk0.a;
        byte[] bArr = this.a;
        lok0VarA.a(ksk0Var.b(bArr.length, bArr), "registerData");
        String str = this.c;
        if (str != null) {
            lok0VarA.a(str, "clientDataString");
        }
        return lok0VarA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = uif.m(parcel, 20293);
        uif.b(parcel, 2, this.a, false);
        uif.i(parcel, 3, this.b.a, false);
        uif.i(parcel, 4, this.c, false);
        uif.n(parcel, iM);
    }
}
