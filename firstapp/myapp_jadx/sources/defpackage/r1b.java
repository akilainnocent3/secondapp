package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class r1b {
    public static final Drawable a(Context context, int i) {
        Drawable drawableA = gr0.a(context, i);
        if (drawableA != null) {
            return drawableA;
        }
        q1b.a(hce0.a(i, "Invalid resource ID: "));
        return null;
    }
}
