package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes4.dex */
public final class oek0 extends hdk0 implements qek0 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qek0
    public final void c(Bundle bundle, zek0 zek0Var) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.b);
        int i = jek0.a;
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(zek0Var);
        a(parcelObtain, 6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qek0
    public final void m(Bundle bundle, sek0 sek0Var) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.b);
        int i = jek0.a;
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(sek0Var);
        a(parcelObtain, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qek0
    public final void w(Bundle bundle, sek0 sek0Var) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.b);
        int i = jek0.a;
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(sek0Var);
        a(parcelObtain, 3);
    }
}
