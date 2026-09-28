package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes6.dex */
public final class d8l extends RecyclerView.n {
    public int a;
    public Paint b;
    public TextPaint c;
    public r47 d;

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void f(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
        super.f(rect, view, recyclerView, zVar);
        int iP = RecyclerView.P(view);
        if (iP != 0) {
            r47 r47Var = this.d;
            if (!(iP != 0 ? true ^ r47Var.a(iP - 1).equals(r47Var.a(iP)) : true)) {
                return;
            }
        }
        rect.top = this.a;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0043  */
    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void g(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        r47 r47Var = this.d;
        TextPaint textPaint = this.c;
        int childCount = recyclerView.getChildCount();
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int iP = RecyclerView.P(childAt);
            String strA = r47Var.a(iP);
            if (iP == 0) {
                canvas.drawRect(paddingLeft, childAt.getTop() - this.a, width, childAt.getTop(), this.b);
                Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
                float top = childAt.getTop();
                float f = this.a;
                float f2 = fontMetrics.bottom;
                canvas.drawText(strA, zch0.a(recyclerView.getContext(), 20), (top - ((f - (f2 - fontMetrics.top)) / 2.0f)) - f2, textPaint);
            } else if (iP != 0 ? true ^ r47Var.a(iP - 1).equals(r47Var.a(iP)) : true) {
                canvas.drawRect(paddingLeft, childAt.getTop() - this.a, width, childAt.getTop(), this.b);
                Paint.FontMetrics fontMetrics2 = textPaint.getFontMetrics();
                float top2 = childAt.getTop();
                float f3 = this.a;
                float f4 = fontMetrics2.bottom;
                canvas.drawText(strA, zch0.a(recyclerView.getContext(), 20), (top2 - ((f3 - (f4 - fontMetrics2.top)) / 2.0f)) - f4, textPaint);
            }
        }
    }
}
