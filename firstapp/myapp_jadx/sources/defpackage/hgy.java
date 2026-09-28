package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.widget.Toast;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes6.dex */
public final class hgy {
    public static final hgy a = new hgy();

    public static final void a(Context context, String str) {
        context.getClass();
        str.getClass();
        Object systemService = context.getSystemService("clipboard");
        systemService.getClass();
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(null, str));
        Toast.makeText(context, sn5.b(context, R.string.common_feedback__successfully_copied, new Object[0]), 0).show();
    }
}
