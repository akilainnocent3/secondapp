package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes7.dex */
public final class g0e0 extends uz1 {
    public int d;
    public int e;
    public int f;
    public g8l g;
    public TextPaint h;
    public Paint i;

    public static class a {
        public g0e0 a;

        public static a a(g8l g8lVar) {
            a aVar = new a();
            g0e0 g0e0Var = new g0e0();
            g0e0Var.d = -1;
            g0e0Var.e = 10;
            g0e0Var.f = 40;
            g0e0Var.g = g8lVar;
            Paint paint = new Paint();
            g0e0Var.i = paint;
            paint.setColor(g0e0Var.a);
            TextPaint textPaint = new TextPaint();
            g0e0Var.h = textPaint;
            textPaint.setAntiAlias(true);
            textPaint.setTextSize(g0e0Var.f);
            textPaint.setColor(g0e0Var.d);
            textPaint.setTextAlign(Paint.Align.LEFT);
            aVar.a = g0e0Var;
            return aVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005c  */
    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        float f;
        TextPaint textPaint = this.h;
        int iB = zVar.b();
        int childCount = recyclerView.getChildCount();
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        String str = null;
        int i = 0;
        while (i < childCount) {
            View childAt = recyclerView.getChildAt(i);
            int iP = RecyclerView.P(childAt);
            String strJ = j(iP);
            if (strJ != null && !TextUtils.equals(strJ, str)) {
                float fMax = Math.max(this.b, childAt.getTop());
                int i2 = iP + 1;
                if (i2 < iB) {
                    String strJ2 = j(i2);
                    int bottom = childAt.getBottom();
                    if (strJ.equals(strJ2)) {
                        f = fMax;
                    } else {
                        float f2 = bottom;
                        if (f2 < fMax) {
                            f = f2;
                        } else {
                            f = fMax;
                        }
                    }
                } else {
                    f = fMax;
                }
                float f3 = width;
                canvas.drawRect(paddingLeft, f - this.b, f3, f, this.i);
                Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
                float f4 = this.b;
                float f5 = fontMetrics.bottom;
                float f6 = (f - ((f4 - (f5 - fontMetrics.top)) / 2.0f)) - f5;
                float fMeasureText = this.c ? 0.0f : f3 - textPaint.measureText(strJ);
                int iAbs = Math.abs(this.e);
                this.e = iAbs;
                if (!this.c) {
                    iAbs = -iAbs;
                }
                this.e = iAbs;
                canvas.drawText(strJ, iAbs + paddingLeft + fMeasureText, f6, textPaint);
            }
            i++;
            str = strJ;
        }
    }

    @Override // defpackage.uz1
    public final String j(int i) {
        g8l g8lVar = this.g;
        if (g8lVar != null) {
            return g8lVar.a(i);
        }
        return null;
    }
}
