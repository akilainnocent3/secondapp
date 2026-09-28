package defpackage;

import android.os.Parcel;

/* JADX INFO: loaded from: classes4.dex */
public final class pnl0 extends slk0 {
    public final eym Z(rcy rcyVar, String str, int i, rcy rcyVar2) {
        Parcel parcelB = b();
        kuk0.c(parcelB, rcyVar);
        parcelB.writeString(str);
        parcelB.writeInt(i);
        kuk0.c(parcelB, rcyVar2);
        Parcel parcelA = a(parcelB, 8);
        eym eymVarB = eym.a.b(parcelA.readStrongBinder());
        parcelA.recycle();
        return eymVarB;
    }

    public final eym a0(rcy rcyVar, String str, int i) {
        Parcel parcelB = b();
        kuk0.c(parcelB, rcyVar);
        parcelB.writeString(str);
        parcelB.writeInt(i);
        Parcel parcelA = a(parcelB, 4);
        eym eymVarB = eym.a.b(parcelA.readStrongBinder());
        parcelA.recycle();
        return eymVarB;
    }

    public final eym b0(rcy rcyVar, String str, boolean z, long j) {
        Parcel parcelB = b();
        kuk0.c(parcelB, rcyVar);
        parcelB.writeString(str);
        parcelB.writeInt(z ? 1 : 0);
        parcelB.writeLong(j);
        Parcel parcelA = a(parcelB, 7);
        eym eymVarB = eym.a.b(parcelA.readStrongBinder());
        parcelA.recycle();
        return eymVarB;
    }

    public final eym d(rcy rcyVar, String str, int i) {
        Parcel parcelB = b();
        kuk0.c(parcelB, rcyVar);
        parcelB.writeString(str);
        parcelB.writeInt(i);
        Parcel parcelA = a(parcelB, 2);
        eym eymVarB = eym.a.b(parcelA.readStrongBinder());
        parcelA.recycle();
        return eymVarB;
    }
}
