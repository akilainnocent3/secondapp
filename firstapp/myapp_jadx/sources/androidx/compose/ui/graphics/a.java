package androidx.compose.ui.graphics;

import androidx.compose.ui.d;
import defpackage.a7l;
import defpackage.b7l;
import defpackage.jsg0;
import defpackage.qx80;
import defpackage.zk40;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final d a(d dVar, Function1<? super a7l, Unit> function1) {
        return dVar.n(new BlockGraphicsLayerElement(function1));
    }

    public static d b(d dVar, float f, float f2, float f3, float f4, qx80 qx80Var, int i) {
        float f5 = (i & 1) != 0 ? 1.0f : f;
        float f6 = (i & 2) != 0 ? 1.0f : f2;
        float f7 = (i & 4) != 0 ? 1.0f : f3;
        float f8 = (i & 32) != 0 ? 0.0f : f4;
        long j = jsg0.b;
        qx80 qx80Var2 = (i & 2048) != 0 ? zk40.a : qx80Var;
        long j2 = b7l.a;
        return dVar.n(new GraphicsLayerElement(f5, f6, f7, 0.0f, 0.0f, f8, 0.0f, 0.0f, j, qx80Var2, false, j2, j2, 0));
    }

    public static d c(d dVar, float f, float f2, float f3, float f4, float f5, float f6, long j, qx80 qx80Var, int i) {
        float f7 = (i & 1) != 0 ? 1.0f : f;
        float f8 = (i & 2) != 0 ? 1.0f : f2;
        float f9 = (i & 4) != 0 ? 1.0f : f3;
        float f10 = (i & 8) != 0 ? 0.0f : f4;
        float f11 = (i & 16) != 0 ? 0.0f : f5;
        float f12 = (i & 128) != 0 ? 0.0f : 180.0f;
        float f13 = (i & 256) != 0 ? 0.0f : f6;
        long j2 = (i & 1024) != 0 ? jsg0.b : j;
        qx80 qx80Var2 = (i & 2048) != 0 ? zk40.a : qx80Var;
        boolean z = (i & 4096) == 0;
        long j3 = b7l.a;
        return dVar.n(new GraphicsLayerElement(f7, f8, f9, f10, f11, 0.0f, f12, f13, j2, qx80Var2, z, j3, j3, (i & 65536) != 0 ? 0 : 1));
    }
}
