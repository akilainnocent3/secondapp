package defpackage;

import android.os.Parcel;
import com.google.android.gms.internal.identity.zzl;

/* JADX INFO: loaded from: classes4.dex */
public abstract class mpl0 extends irk0 implements xql0 {
    public mpl0() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    @Override // defpackage.irk0
    public final boolean a(Parcel parcel, int i) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            zze();
            return true;
        }
        zzl zzlVar = (zzl) luk0.a(parcel, zzl.CREATOR);
        luk0.b(parcel);
        p(zzlVar);
        return true;
    }
}
