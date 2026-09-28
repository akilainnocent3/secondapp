package com.google.android.material.circularreveal;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import defpackage.bdv;

/* JADX INFO: loaded from: classes4.dex */
public final class b {
    public final a a;
    public final ViewGroup b;
    public final Paint c;
    public c.d d;
    public Drawable e;

    public interface a {
        void c(Canvas canvas);

        boolean d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(a aVar) {
        this.a = aVar;
        View view = (View) aVar;
        this.b = (ViewGroup) view;
        view.setWillNotDraw(false);
        new Path();
        new Paint(7);
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setColor(0);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    public final void a(Canvas canvas) {
        Canvas canvas2;
        c.d dVar = this.d;
        boolean z = dVar == null || dVar.c == Float.MAX_VALUE;
        Paint paint = this.c;
        ViewGroup viewGroup = this.b;
        a aVar = this.a;
        if (z) {
            aVar.c(canvas);
            if (Color.alpha(paint.getColor()) != 0) {
                float width = viewGroup.getWidth();
                float height = viewGroup.getHeight();
                canvas2 = canvas;
                canvas2.drawRect(0.0f, 0.0f, width, height, paint);
            } else {
                canvas2 = canvas;
            }
        } else {
            aVar.c(canvas);
            if (Color.alpha(paint.getColor()) != 0) {
                float width2 = viewGroup.getWidth();
                float height2 = viewGroup.getHeight();
                canvas2 = canvas;
                canvas2.drawRect(0.0f, 0.0f, width2, height2, paint);
            } else {
                canvas2 = canvas;
            }
        }
        Drawable drawable = this.e;
        if (drawable == null || this.d == null) {
            return;
        }
        Rect bounds = drawable.getBounds();
        float fWidth = this.d.a - (bounds.width() / 2.0f);
        float fHeight = this.d.b - (bounds.height() / 2.0f);
        canvas2.translate(fWidth, fHeight);
        this.e.draw(canvas2);
        canvas2.translate(-fWidth, -fHeight);
    }

    public final c.d b() {
        c.d dVar = this.d;
        if (dVar == null) {
            return null;
        }
        c.d dVar2 = new c.d(dVar);
        if (dVar2.c == Float.MAX_VALUE) {
            float f = dVar2.a;
            float f2 = dVar2.b;
            ViewGroup viewGroup = this.b;
            dVar2.c = bdv.b(f, f2, viewGroup.getWidth(), viewGroup.getHeight());
        }
        return dVar2;
    }

    public final boolean c() {
        if (this.a.d()) {
            c.d dVar = this.d;
            if (dVar == null || dVar.c == Float.MAX_VALUE) {
                return true;
            }
        }
        return false;
    }

    public final void d(Drawable drawable) {
        this.e = drawable;
        this.b.invalidate();
    }

    public final void e(int i) {
        this.c.setColor(i);
        this.b.invalidate();
    }

    public final void f(c.d dVar) {
        ViewGroup viewGroup = this.b;
        if (dVar == null) {
            this.d = null;
        } else {
            c.d dVar2 = this.d;
            if (dVar2 == null) {
                this.d = new c.d(dVar);
            } else {
                float f = dVar.a;
                float f2 = dVar.b;
                float f3 = dVar.c;
                dVar2.a = f;
                dVar2.b = f2;
                dVar2.c = f3;
            }
            if (dVar.c + 1.0E-4f >= bdv.b(dVar.a, dVar.b, viewGroup.getWidth(), viewGroup.getHeight())) {
                this.d.c = Float.MAX_VALUE;
            }
        }
        viewGroup.invalidate();
    }
}
