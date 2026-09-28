package defpackage;

import android.content.Context;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes4.dex */
public final class ch7 {
    public static final ch7 a = new ch7();

    public static final String a(Context context, int i) {
        context.getClass();
        return sn5.b(context, R.string.live__chat_count, i > 99 ? "99+" : String.valueOf(i));
    }
}
