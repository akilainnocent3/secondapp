package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.ParcelFileDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class dsz implements wg50<ParcelFileDescriptor, Bitmap> {
    public final c7f a;

    public dsz(c7f c7fVar) {
        this.a = c7fVar;
    }

    @Override // defpackage.wg50
    public final boolean a(ParcelFileDescriptor parcelFileDescriptor, s2z s2zVar) {
        ParcelFileDescriptor parcelFileDescriptor2 = parcelFileDescriptor;
        String str = Build.MANUFACTURER;
        return (!("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor2.getStatSize() <= 536870912) && !"robolectric".equals(Build.FINGERPRINT);
    }

    @Override // defpackage.wg50
    public final qg50<Bitmap> b(ParcelFileDescriptor parcelFileDescriptor, int i, int i2, s2z s2zVar) {
        c7f c7fVar = this.a;
        return c7fVar.a(new ian.c(parcelFileDescriptor, c7fVar.d, c7fVar.c), i, i2, s2zVar, c7f.k);
    }
}
