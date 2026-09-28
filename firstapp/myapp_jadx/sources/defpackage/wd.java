package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class wd extends vd<String[], Uri> {
    @Override // defpackage.vd
    public final Intent a(Object obj, Context context) {
        String[] strArr = (String[]) obj;
        strArr.getClass();
        Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", strArr).setType("*/*");
        type.getClass();
        return type;
    }

    @Override // defpackage.vd
    public final vd.a b(Object obj, Context context) {
        ((String[]) obj).getClass();
        return null;
    }

    @Override // defpackage.vd
    public final Object c(Intent intent, int i) {
        if (i != -1) {
            intent = null;
        }
        if (intent != null) {
            return intent.getData();
        }
        return null;
    }
}
