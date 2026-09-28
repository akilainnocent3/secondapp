package defpackage;

import android.os.Parcel;

/* JADX INFO: loaded from: classes4.dex */
public final class lyk0 extends ntk0 implements cwk0 {
    public final /* synthetic */ wkl0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lyk0(nyk0 nyk0Var, wkl0 wkl0Var) {
        super("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
        this.a = wkl0Var;
    }

    @Override // defpackage.ntk0
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        zze();
        return true;
    }

    @Override // defpackage.cwk0
    public final void zze() {
        this.a.run();
    }
}
