package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import kotlin.text.c;

/* JADX INFO: loaded from: classes7.dex */
public final class vxo {
    @fae
    public static final <T> T a(Intent intent, String str, Class<T> cls) {
        intent.getClass();
        return Build.VERSION.SDK_INT >= 33 ? (T) intent.getParcelableExtra(str, cls) : (T) intent.getParcelableExtra(str);
    }

    public static final void b(Context context, String str) {
        context.getClass();
        str.getClass();
        Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:".concat(c.p(str, "#", "%23", false))));
        intent.setFlags(268435456);
        context.startActivity(intent);
    }
}
