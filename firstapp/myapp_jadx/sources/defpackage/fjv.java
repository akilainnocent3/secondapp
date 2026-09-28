package defpackage;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fjv implements ijv.d {
    @Override // ijv.d
    public final int a(Object obj) {
        String str = ((ziv) obj).a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (Build.VERSION.SDK_INT >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }
}
