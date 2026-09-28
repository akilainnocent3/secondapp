package defpackage;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class nw90 {
    public static final b01 a(Object obj, a aVar) {
        return c01.a(obj, qw90.a((Context) aVar.O(AndroidCompositionLocals_androidKt.b)), b01.L, d0b.a.b, aVar, 0);
    }

    public static final b01 b(String str, Function1 function1, a aVar, int i) {
        g01 g01Var = new g01(str, (zz0) aVar.O(cdt.a), qw90.a((Context) aVar.O(AndroidCompositionLocals_androidKt.b)));
        int i2 = qsh0.b;
        return c01.b(g01Var, b01.L, function1 != null ? new ish0(null, function1, null) : null, d0b.a.b, aVar);
    }
}
