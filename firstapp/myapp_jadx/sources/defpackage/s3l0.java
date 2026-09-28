package defpackage;

import android.os.Parcel;
import com.google.android.gms.measurement.internal.zzoh;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public abstract class s3l0 extends ntk0 implements u3l0 {
    @Override // defpackage.ntk0
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(zzoh.CREATOR);
        ptk0.d(parcel);
        ((phl0) this).x(arrayListCreateTypedArrayList);
        return true;
    }
}
