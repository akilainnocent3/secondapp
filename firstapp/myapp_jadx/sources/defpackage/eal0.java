package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public abstract class eal0 extends hrk0 implements nmk0 {
    public static final /* synthetic */ int b = 0;
    public final int a;

    public eal0(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        hm20.b(bArr.length == 25);
        this.a = Arrays.hashCode(bArr);
    }

    public static byte[] b(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            jb5.a(e);
            return null;
        }
    }

    @Override // defpackage.hrk0
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            eym eymVarZzd = zzd();
            parcel2.writeNoException();
            kuk0.c(parcel2, eymVarZzd);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.a);
        return true;
    }

    public abstract byte[] d();

    public final boolean equals(Object obj) {
        eym eymVarZzd;
        if (obj != null && (obj instanceof nmk0)) {
            try {
                nmk0 nmk0Var = (nmk0) obj;
                if (nmk0Var.zzc() == this.a && (eymVarZzd = nmk0Var.zzd()) != null) {
                    return Arrays.equals(d(), (byte[]) rcy.d(eymVarZzd));
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    @Override // defpackage.nmk0
    public final int zzc() {
        return this.a;
    }

    @Override // defpackage.nmk0
    public final eym zzd() {
        return new rcy(d());
    }
}
