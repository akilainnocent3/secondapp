package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class de extends vd<Uri, Boolean> {
    @Override // defpackage.vd
    public final Intent a(Object obj, Context context) {
        Uri uri = (Uri) obj;
        uri.getClass();
        Intent intentPutExtra = new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", uri);
        intentPutExtra.getClass();
        return intentPutExtra;
    }

    @Override // defpackage.vd
    public final vd.a b(Object obj, Context context) {
        ((Uri) obj).getClass();
        return null;
    }

    @Override // defpackage.vd
    public final Object c(Intent intent, int i) {
        return Boolean.valueOf(i == -1);
    }
}
