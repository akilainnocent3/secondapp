package defpackage;

import android.os.Parcel;
import android.util.Base64;

/* JADX INFO: loaded from: classes4.dex */
public final class t4d {
    public final Object a;

    public /* synthetic */ t4d(s7l0 s7l0Var) {
        qcl0 qcl0Var = new qcl0(s7l0Var);
        this.a = lnk0.a(new lal0(lnk0.a(new rih(lnk0.a(new asl0(qcl0Var, lnk0.a(new vsl0(qcl0Var)))), lnk0.a(new jwk0(qcl0Var)), qcl0Var))));
    }

    public long a() {
        int i = j58.n;
        long j = ((Parcel) this.a).readLong();
        long j2 = 63 & j;
        if (j2 >= 16) {
            j = (j & (-64)) | (j2 + 1);
        }
        nbh0.a aVar = nbh0.b;
        return j;
    }

    public long b() {
        long j;
        Parcel parcel = (Parcel) this.a;
        byte b = parcel.readByte();
        if (b == 1) {
            j = 4294967296L;
        } else {
            j = b == 2 ? 8589934592L : 0L;
        }
        return pmf0.a(j, 0L) ? omf0.c : d2l.g(parcel.readFloat(), j);
    }

    public t4d(String str) {
        Parcel parcelObtain = Parcel.obtain();
        this.a = parcelObtain;
        byte[] bArrDecode = Base64.decode(str, 0);
        parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
        parcelObtain.setDataPosition(0);
    }
}
