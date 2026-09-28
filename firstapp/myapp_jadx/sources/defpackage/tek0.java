package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes4.dex */
public final class tek0 extends hdk0 implements vek0 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vek0
    public final void c(Bundle bundle, zek0 zek0Var) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.b);
        int i = jek0.a;
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(zek0Var);
        a(parcelObtain, 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vek0
    public final void i(Bundle bundle, xek0 xek0Var) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.b);
        int i = jek0.a;
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(xek0Var);
        a(parcelObtain, 2);
    }
}
