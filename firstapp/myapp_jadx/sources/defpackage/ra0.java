package defpackage;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ra0 implements bpp<kmh0> {
    @Override // defpackage.bpp
    public final String a(kmh0 kmh0Var, u2z u2zVar) {
        kmh0 kmh0Var2 = kmh0Var;
        if (!Intrinsics.g(kmh0Var2.c, "android.resource")) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(kmh0Var2);
        sb.append(':');
        Configuration configuration = u2zVar.a.getResources().getConfiguration();
        Bitmap.Config[] configArr = vsh0.a;
        sb.append(configuration.uiMode & 48);
        return sb.toString();
    }
}
