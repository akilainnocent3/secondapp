package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.zzo;
import com.google.android.gms.common.zzq;
import com.google.android.gms.common.zzs;

/* JADX INFO: loaded from: classes4.dex */
public final class nnk0 extends slk0 implements bok0 {
    @Override // defpackage.bok0
    public final zzq G(zzo zzoVar) {
        Parcel parcelB = b();
        int i = kuk0.a;
        parcelB.writeInt(1);
        zzoVar.writeToParcel(parcelB, 0);
        Parcel parcelA = a(parcelB, 6);
        zzq zzqVar = (zzq) kuk0.a(parcelA, zzq.CREATOR);
        parcelA.recycle();
        return zzqVar;
    }

    @Override // defpackage.bok0
    public final boolean M(zzs zzsVar, rcy rcyVar) {
        Parcel parcelB = b();
        int i = kuk0.a;
        parcelB.writeInt(1);
        zzsVar.writeToParcel(parcelB, 0);
        kuk0.c(parcelB, rcyVar);
        Parcel parcelA = a(parcelB, 5);
        boolean z = parcelA.readInt() != 0;
        parcelA.recycle();
        return z;
    }

    @Override // defpackage.bok0
    public final boolean zzi() {
        Parcel parcelA = a(b(), 7);
        int i = kuk0.a;
        boolean z = parcelA.readInt() != 0;
        parcelA.recycle();
        return z;
    }
}
