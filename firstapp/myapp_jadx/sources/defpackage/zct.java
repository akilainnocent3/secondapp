package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class zct {
    public static final una a = new una(a.a);

    public static final class a extends qlr implements Function1<xma, Activity> {
        public static final a a = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Activity invoke(xma xmaVar) {
            Context baseContext = (Context) xmaVar.a(AndroidCompositionLocals_androidKt.b);
            while (baseContext instanceof ContextWrapper) {
                if (baseContext instanceof Activity) {
                    return (Activity) baseContext;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            baseContext = null;
            return (Activity) baseContext;
        }
    }
}
