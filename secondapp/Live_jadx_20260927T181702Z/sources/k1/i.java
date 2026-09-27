package k1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import dr.w2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class i {
    public static final void a(@oy.l Canvas canvas, float f10, float f11, float f12, float f13, @oy.l ds.l<? super Canvas, w2> lVar) {
        int iSave = canvas.save();
        canvas.clipRect(f10, f11, f12, f13);
        try {
            lVar.invoke(canvas);
        } finally {
            kotlin.jvm.internal.j0.d(1);
            canvas.restoreToCount(iSave);
            kotlin.jvm.internal.j0.c(1);
        }
    }

    public static final void b(@oy.l Canvas canvas, int i10, int i11, int i12, int i13, @oy.l ds.l<? super Canvas, w2> lVar) {
        int iSave = canvas.save();
        canvas.clipRect(i10, i11, i12, i13);
        try {
            lVar.invoke(canvas);
        } finally {
            kotlin.jvm.internal.j0.d(1);
            canvas.restoreToCount(iSave);
            kotlin.jvm.internal.j0.c(1);
        }
    }

    public static final void c(@oy.l Canvas canvas, @oy.l Path path, @oy.l ds.l<? super Canvas, w2> lVar) {
        int iSave = canvas.save();
        canvas.clipPath(path);
        try {
            lVar.invoke(canvas);
        } finally {
            kotlin.jvm.internal.j0.d(1);
            canvas.restoreToCount(iSave);
            kotlin.jvm.internal.j0.c(1);
        }
    }

    public static final void d(@oy.l Canvas canvas, @oy.l Rect rect, @oy.l ds.l<? super Canvas, w2> lVar) {
        int iSave = canvas.save();
        canvas.clipRect(rect);
        try {
            lVar.invoke(canvas);
        } finally {
            kotlin.jvm.internal.j0.d(1);
            canvas.restoreToCount(iSave);
            kotlin.jvm.internal.j0.c(1);
        }
    }

    public static final void e(@oy.l Canvas canvas, @oy.l RectF rectF, @oy.l ds.l<? super Canvas, w2> lVar) {
        int iSave = canvas.save();
        canvas.clipRect(rectF);
        try {
            lVar.invoke(canvas);
        } finally {
            kotlin.jvm.internal.j0.d(1);
            canvas.restoreToCount(iSave);
            kotlin.jvm.internal.j0.c(1);
        }
    }

    public static final void f(@oy.l Canvas canvas, @oy.l Matrix matrix, @oy.l ds.l<? super Canvas, w2> lVar) {
        int iSave = canvas.save();
        canvas.concat(matrix);
        try {
            lVar.invoke(canvas);
        } finally {
            kotlin.jvm.internal.j0.d(1);
            canvas.restoreToCount(iSave);
            kotlin.jvm.internal.j0.c(1);
        }
    }

    public static /* synthetic */ void g(Canvas canvas, Matrix matrix, ds.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            matrix = new Matrix();
        }
        int iSave = canvas.save();
        canvas.concat(matrix);
        try {
            lVar.invoke(canvas);
        } finally {
            kotlin.jvm.internal.j0.d(1);
            canvas.restoreToCount(iSave);
            kotlin.jvm.internal.j0.c(1);
        }
    }

    public static final void h(@oy.l Canvas canvas, float f10, float f11, float f12, @oy.l ds.l<? super Canvas, w2> lVar) {
        int iSave = canvas.save();
        canvas.rotate(f10, f11, f12);
        try {
            lVar.invoke(canvas);
        } finally {
            kotlin.jvm.internal.j0.d(1);
            canvas.restoreToCount(iSave);
            kotlin.jvm.internal.j0.c(1);
        }
    }

    public static /* synthetic */ void i(Canvas canvas, float f10, float f11, float f12, ds.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            f12 = 0.0f;
        }
        int iSave = canvas.save();
        canvas.rotate(f10, f11, f12);
        try {
            lVar.invoke(canvas);
        } finally {
            kotlin.jvm.internal.j0.d(1);
            canvas.restoreToCount(iSave);
            kotlin.jvm.internal.j0.c(1);
        }
    }

    public static final void j(@oy.l Canvas canvas, @oy.l ds.l<? super Canvas, w2> lVar) {
        int iSave = canvas.save();
        try {
            lVar.invoke(canvas);
        } finally {
            kotlin.jvm.internal.j0.d(1);
            canvas.restoreToCount(iSave);
            kotlin.jvm.internal.j0.c(1);
        }
    }

    public static final void k(@oy.l Canvas canvas, float f10, float f11, float f12, float f13, @oy.l ds.l<? super Canvas, w2> lVar) {
        int iSave = canvas.save();
        canvas.scale(f10, f11, f12, f13);
        try {
            lVar.invoke(canvas);
        } finally {
            kotlin.jvm.internal.j0.d(1);
            canvas.restoreToCount(iSave);
            kotlin.jvm.internal.j0.c(1);
        }
    }

    public static /* synthetic */ void l(Canvas canvas, float f10, float f11, float f12, float f13, ds.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 1.0f;
        }
        if ((i10 & 4) != 0) {
            f12 = 0.0f;
        }
        if ((i10 & 8) != 0) {
            f13 = 0.0f;
        }
        int iSave = canvas.save();
        canvas.scale(f10, f11, f12, f13);
        try {
            lVar.invoke(canvas);
        } finally {
            kotlin.jvm.internal.j0.d(1);
            canvas.restoreToCount(iSave);
            kotlin.jvm.internal.j0.c(1);
        }
    }

    public static final void m(@oy.l Canvas canvas, float f10, float f11, @oy.l ds.l<? super Canvas, w2> lVar) {
        int iSave = canvas.save();
        canvas.skew(f10, f11);
        try {
            lVar.invoke(canvas);
        } finally {
            kotlin.jvm.internal.j0.d(1);
            canvas.restoreToCount(iSave);
            kotlin.jvm.internal.j0.c(1);
        }
    }

    public static /* synthetic */ void n(Canvas canvas, float f10, float f11, ds.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        int iSave = canvas.save();
        canvas.skew(f10, f11);
        try {
            lVar.invoke(canvas);
        } finally {
            kotlin.jvm.internal.j0.d(1);
            canvas.restoreToCount(iSave);
            kotlin.jvm.internal.j0.c(1);
        }
    }

    public static final void o(@oy.l Canvas canvas, float f10, float f11, @oy.l ds.l<? super Canvas, w2> lVar) {
        int iSave = canvas.save();
        canvas.translate(f10, f11);
        try {
            lVar.invoke(canvas);
        } finally {
            kotlin.jvm.internal.j0.d(1);
            canvas.restoreToCount(iSave);
            kotlin.jvm.internal.j0.c(1);
        }
    }

    public static /* synthetic */ void p(Canvas canvas, float f10, float f11, ds.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        int iSave = canvas.save();
        canvas.translate(f10, f11);
        try {
            lVar.invoke(canvas);
        } finally {
            kotlin.jvm.internal.j0.d(1);
            canvas.restoreToCount(iSave);
            kotlin.jvm.internal.j0.c(1);
        }
    }
}
