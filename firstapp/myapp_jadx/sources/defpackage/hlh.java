package defpackage;

import android.graphics.Bitmap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class hlh implements bpp<kmh0> {
    @Override // defpackage.bpp
    public final String a(kmh0 kmh0Var, u2z u2zVar) {
        String strC;
        kmh0 kmh0Var2 = kmh0Var;
        String str = kmh0Var2.c;
        if ((str != null && !str.equals("file")) || kmh0Var2.e == null) {
            return null;
        }
        Bitmap.Config[] configArr = vsh0.a;
        if ((Intrinsics.g(kmh0Var2.c, "file") && Intrinsics.g(CollectionsKt.firstOrNull(tl9.d(kmh0Var2)), "android_asset")) || !((Boolean) q4h.b(u2zVar, uan.c)).booleanValue() || (strC = tl9.c(kmh0Var2)) == null) {
            return null;
        }
        blh blhVar = u2zVar.f;
        String str2 = cxz.b;
        Long l = blhVar.metadata(cxz.a.a(strC)).f;
        StringBuilder sb = new StringBuilder();
        sb.append(kmh0Var2);
        sb.append('-');
        sb.append(l);
        return sb.toString();
    }
}
