package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: classes.dex */
public final class c68 {
    public static final long a(int i, a aVar) {
        Context context = (Context) aVar.O(AndroidCompositionLocals_androidKt.b);
        Resources resources = (Resources) aVar.O(AndroidCompositionLocals_androidKt.c);
        Resources.Theme theme = context.getTheme();
        ThreadLocal<TypedValue> threadLocal = th50.a;
        return r58.b(resources.getColor(i, theme));
    }
}
