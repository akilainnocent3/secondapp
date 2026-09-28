package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes7.dex */
public abstract class u02 extends RecyclerView.n {
    public final Paint a;
    public final Context b;

    public u02(Context context) {
        this.b = context;
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setStyle(Paint.Style.FILL);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void f(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
        nte nteVarJ = j(((RecyclerView.LayoutParams) view.getLayoutParams()).a.getLayoutPosition());
        qd90 qd90Var = nteVarJ.a;
        boolean z = qd90Var.a;
        Context context = this.b;
        int iA = z ? f7f.a(qd90Var.c, context) : 0;
        qd90 qd90Var2 = nteVarJ.b;
        int iA2 = qd90Var2.a ? f7f.a(qd90Var2.c, context) : 0;
        qd90 qd90Var3 = nteVarJ.c;
        int iA3 = qd90Var3.a ? f7f.a(qd90Var3.c, context) : 0;
        qd90 qd90Var4 = nteVarJ.d;
        rect.set(iA, iA2, iA3, qd90Var4.a ? f7f.a(qd90Var4.c, context) : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void g(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        Paint paint;
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            nte nteVarJ = j(((RecyclerView.LayoutParams) childAt.getLayoutParams()).a.getLayoutPosition());
            qd90 qd90Var = nteVarJ.a;
            qd90 qd90Var2 = nteVarJ.d;
            qd90 qd90Var3 = nteVarJ.c;
            qd90 qd90Var4 = nteVarJ.b;
            boolean z = qd90Var.a;
            Paint paint2 = this.a;
            Context context = this.b;
            if (z) {
                int iA = f7f.a(qd90Var.c, context);
                int iA2 = f7f.a(qd90Var.d, context);
                int iA3 = f7f.a(0.0f, context);
                int i2 = qd90Var.b;
                if (iA2 <= 0) {
                    iA2 = -iA;
                }
                int i3 = iA3 <= 0 ? iA : -iA3;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) childAt.getLayoutParams();
                int top = (childAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) + iA2;
                int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + i3;
                int left = childAt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                paint2.setColor(i2);
                canvas.drawRect(left - iA, top, left, bottom, paint2);
                paint = paint2;
            } else {
                paint = paint2;
            }
            if (qd90Var4.a) {
                int iA4 = f7f.a(qd90Var4.c, context);
                int iA5 = f7f.a(qd90Var4.d, context);
                int iA6 = f7f.a(0.0f, context);
                int i4 = qd90Var4.b;
                if (iA5 <= 0) {
                    iA5 = -iA4;
                }
                int i5 = iA6 <= 0 ? iA4 : -iA6;
                RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) childAt.getLayoutParams();
                int left2 = (childAt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin) + iA5;
                int right = childAt.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin + i5;
                int top2 = childAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
                paint.setColor(i4);
                canvas.drawRect(left2, top2 - iA4, right, top2, paint);
            }
            if (qd90Var3.a) {
                int iA7 = f7f.a(qd90Var3.c, context);
                int iA8 = f7f.a(qd90Var3.d, context);
                int iA9 = f7f.a(0.0f, context);
                int i6 = qd90Var3.b;
                if (iA8 <= 0) {
                    iA8 = -iA7;
                }
                int i7 = iA9 <= 0 ? iA7 : -iA9;
                RecyclerView.LayoutParams layoutParams3 = (RecyclerView.LayoutParams) childAt.getLayoutParams();
                int top3 = (childAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin) + iA8;
                int bottom2 = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin + i7;
                int right2 = childAt.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin;
                paint.setColor(i6);
                canvas.drawRect(right2, top3, iA7 + right2, bottom2, paint);
            }
            if (qd90Var2.a) {
                int iA10 = f7f.a(qd90Var2.c, context);
                int iA11 = f7f.a(qd90Var2.d, context);
                int iA12 = f7f.a(0.0f, context);
                int i8 = qd90Var2.b;
                if (iA11 <= 0) {
                    iA11 = -iA10;
                }
                int i9 = iA12 <= 0 ? iA10 : -iA12;
                RecyclerView.LayoutParams layoutParams4 = (RecyclerView.LayoutParams) childAt.getLayoutParams();
                int left3 = (childAt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams4).leftMargin) + iA11;
                int right3 = childAt.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams4).rightMargin + i9;
                int bottom3 = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin;
                paint.setColor(i8);
                canvas.drawRect(left3, bottom3, right3, iA10 + bottom3, paint);
            }
        }
    }

    public abstract nte j(int i);
}
