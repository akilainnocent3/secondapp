package androidx.compose.foundation.layout;

import defpackage.asr;
import defpackage.omz;
import defpackage.qmz;
import defpackage.tmz;
import defpackage.umz;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    public static umz a(int i, float f, float f2) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return new umz(f, f2, f, f2);
    }

    public static umz b(float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        return new umz(f, f2, f3, f4);
    }

    public static final float c(tmz tmzVar, asr asrVar) {
        return asrVar == asr.a ? tmzVar.c(asrVar) : tmzVar.b(asrVar);
    }

    public static final float d(tmz tmzVar, asr asrVar) {
        return asrVar == asr.a ? tmzVar.b(asrVar) : tmzVar.c(asrVar);
    }

    public static final androidx.compose.ui.d e(androidx.compose.ui.d dVar, tmz tmzVar) {
        return dVar.n(new PaddingValuesElement(tmzVar, new omz(tmzVar, 0)));
    }

    public static final androidx.compose.ui.d f(androidx.compose.ui.d dVar, float f) {
        return dVar.n(new PaddingElement(f, f, f, f, new qmz()));
    }

    public static final androidx.compose.ui.d g(androidx.compose.ui.d dVar, final float f, final float f2) {
        return dVar.n(new PaddingElement(f, f2, f, f2, new Function1() { // from class: pmz
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                knn knnVar = (knn) obj;
                knnVar.getClass();
                xuh0 xuh0Var = knnVar.a;
                xuh0Var.b(new g7f(f), "horizontal");
                xuh0Var.b(new g7f(f2), "vertical");
                return Unit.a;
            }
        }));
    }

    public static androidx.compose.ui.d h(androidx.compose.ui.d dVar, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return g(dVar, f, f2);
    }

    public static final androidx.compose.ui.d i(androidx.compose.ui.d dVar, final float f, final float f2, final float f3, final float f4) {
        return dVar.n(new PaddingElement(f, f2, f3, f4, new Function1() { // from class: nmz
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                knn knnVar = (knn) obj;
                knnVar.getClass();
                xuh0 xuh0Var = knnVar.a;
                xuh0Var.b(new g7f(f), "start");
                xuh0Var.b(new g7f(f2), "top");
                xuh0Var.b(new g7f(f3), "end");
                xuh0Var.b(new g7f(f4), "bottom");
                return Unit.a;
            }
        }));
    }

    public static androidx.compose.ui.d j(androidx.compose.ui.d dVar, float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        return i(dVar, f, f2, f3, f4);
    }
}
