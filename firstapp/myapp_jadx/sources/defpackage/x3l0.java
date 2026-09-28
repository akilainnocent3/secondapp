package defpackage;

import android.os.Parcel;
import com.google.android.gms.measurement.internal.zzoq;

/* JADX INFO: loaded from: classes4.dex */
public abstract class x3l0 extends ntk0 implements z3l0 {
    @Override // defpackage.ntk0
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        zzoq zzoqVar = (zzoq) ptk0.a(parcel, zzoq.CREATOR);
        ptk0.d(parcel);
        ((shl0) this).S(zzoqVar);
        return true;
    }
}
