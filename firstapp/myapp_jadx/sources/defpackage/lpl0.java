package defpackage;

import android.os.Parcel;

/* JADX INFO: loaded from: classes4.dex */
public final class lpl0 extends slk0 {
    public final eym Z(rcy rcyVar, String str, int i, rcy rcyVar2) {
        Parcel parcelB = b();
        kuk0.c(parcelB, rcyVar);
        parcelB.writeString(str);
        parcelB.writeInt(i);
        kuk0.c(parcelB, rcyVar2);
        Parcel parcelA = a(parcelB, 3);
        eym eymVarB = eym.a.b(parcelA.readStrongBinder());
        parcelA.recycle();
        return eymVarB;
    }

    public final eym d(rcy rcyVar, String str, int i, rcy rcyVar2) {
        Parcel parcelB = b();
        kuk0.c(parcelB, rcyVar);
        parcelB.writeString(str);
        parcelB.writeInt(i);
        kuk0.c(parcelB, rcyVar2);
        Parcel parcelA = a(parcelB, 2);
        eym eymVarB = eym.a.b(parcelA.readStrongBinder());
        parcelA.recycle();
        return eymVarB;
    }
}
