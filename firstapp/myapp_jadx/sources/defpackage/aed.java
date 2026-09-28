package defpackage;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class aed implements viv.b {
    public final Context a;

    public aed(Context context) {
        this.a = context;
    }

    @Override // viv.b
    public final viv a(viv.a aVar) {
        Context context;
        int i = Build.VERSION.SDK_INT;
        if (i < 31 && ((context = this.a) == null || i < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            return new spe0.a().a(aVar);
        }
        int iH = gqv.h(aVar.c.n);
        cft.e("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(jrh0.E(iH)));
        return new f11.a(new d11(iH), new e11(iH)).a(aVar);
    }
}
