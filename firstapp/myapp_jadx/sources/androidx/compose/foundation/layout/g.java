package androidx.compose.foundation.layout;

import defpackage.iwo;
import defpackage.mmd;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar, final float f, final float f2) {
        return dVar.n(new OffsetElement(f, f2, false, new Function1() { // from class: lly
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                knn knnVar = (knn) obj;
                knnVar.getClass();
                xuh0 xuh0Var = knnVar.a;
                xuh0Var.b(new g7f(f), "x");
                xuh0Var.b(new g7f(f2), "y");
                return Unit.a;
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kly] */
    public static final androidx.compose.ui.d b(androidx.compose.ui.d dVar, final Function1<? super mmd, iwo> function1) {
        return dVar.n(new OffsetPxElement(function1, new Function1() { // from class: kly
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                knn knnVar = (knn) obj;
                knnVar.getClass();
                knnVar.a.b(function1, "offset");
                return Unit.a;
            }
        }));
    }

    public static final androidx.compose.ui.d c(androidx.compose.ui.d dVar, final float f, final float f2) {
        return dVar.n(new OffsetElement(f, f2, true, new Function1() { // from class: jly
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                knn knnVar = (knn) obj;
                knnVar.getClass();
                xuh0 xuh0Var = knnVar.a;
                xuh0Var.b(new g7f(f), "x");
                xuh0Var.b(new g7f(f2), "y");
                return Unit.a;
            }
        }));
    }

    public static androidx.compose.ui.d d(androidx.compose.ui.d dVar, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return c(dVar, f, f2);
    }
}
