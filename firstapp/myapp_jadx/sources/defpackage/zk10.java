package defpackage;

import android.graphics.Typeface;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class zk10 implements xk10 {
    public static Typeface c(String str, t9i t9iVar, int i) {
        if (i == 0 && Intrinsics.g(t9iVar, t9i.B) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), t9iVar.a, i == 1);
    }

    @Override // defpackage.xk10
    public final Typeface a(t9i t9iVar, int i) {
        return c(null, t9iVar, i);
    }

    @Override // defpackage.xk10
    public final Typeface b(v1k v1kVar, t9i t9iVar, int i) {
        return c(v1kVar.f, t9iVar, i);
    }
}
