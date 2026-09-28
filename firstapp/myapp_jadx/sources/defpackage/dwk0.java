package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes4.dex */
public final class dwk0 extends mtk0 implements zwk0 {
    public dwk0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // defpackage.zwk0
    public final void D(long j, Bundle bundle, String str, String str2) {
        Parcel parcelB = b();
        parcelB.writeString(str);
        parcelB.writeString(str2);
        ptk0.b(parcelB, bundle);
        parcelB.writeLong(j);
        d(parcelB, 1);
    }

    @Override // defpackage.zwk0
    public final int zzf() {
        Parcel parcelA = a(b(), 2);
        int i = parcelA.readInt();
        parcelA.recycle();
        return i;
    }
}
