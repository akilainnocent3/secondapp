package defpackage;

import android.os.Parcel;

/* JADX INFO: loaded from: classes4.dex */
public final class ytl0 extends slk0 implements nmk0 {
    @Override // defpackage.nmk0
    public final int zzc() {
        Parcel parcelA = a(b(), 2);
        int i = parcelA.readInt();
        parcelA.recycle();
        return i;
    }

    @Override // defpackage.nmk0
    public final eym zzd() {
        Parcel parcelA = a(b(), 1);
        eym eymVarB = eym.a.b(parcelA.readStrongBinder());
        parcelA.recycle();
        return eymVarB;
    }
}
