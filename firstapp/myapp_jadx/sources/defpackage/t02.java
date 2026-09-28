package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes7.dex */
public abstract class t02 extends RecyclerView.n {
    public final Paint a;
    public final Context b;

    public t02(Context context) {
        this.b = context;
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setStyle(Paint.Style.FILL);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void f(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
        ((RecyclerView.LayoutParams) view.getLayoutParams()).a.getLayoutPosition();
        mte mteVarJ = j();
        pd90 pd90Var = mteVarJ.a;
        boolean z = pd90Var.a;
        Context context = this.b;
        int iA = z ? e7f.a(pd90Var.c, context) : 0;
        pd90 pd90Var2 = mteVarJ.b;
        int iA2 = pd90Var2.a ? e7f.a(pd90Var2.c, context) : 0;
        pd90 pd90Var3 = mteVarJ.c;
        int iA3 = pd90Var3.a ? e7f.a(pd90Var3.c, context) : 0;
        pd90 pd90Var4 = mteVarJ.d;
        rect.set(iA, iA2, iA3, pd90Var4.a ? e7f.a(pd90Var4.c, context) : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void g(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        Paint paint;
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            ((RecyclerView.LayoutParams) childAt.getLayoutParams()).a.getLayoutPosition();
            mte mteVarJ = j();
            pd90 pd90Var = mteVarJ.d;
            pd90 pd90Var2 = mteVarJ.c;
            pd90 pd90Var3 = mteVarJ.b;
            pd90 pd90Var4 = mteVarJ.a;
            boolean z = pd90Var4.a;
            Paint paint2 = this.a;
            Context context = this.b;
            if (z) {
                int iA = e7f.a(pd90Var4.c, context);
                int iA2 = e7f.a(0.0f, context);
                int iA3 = e7f.a(0.0f, context);
                int i2 = pd90Var4.b;
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
            if (pd90Var3.a) {
                int iA4 = e7f.a(pd90Var3.c, context);
                int iA5 = e7f.a(0.0f, context);
                int iA6 = e7f.a(0.0f, context);
                int i4 = pd90Var3.b;
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
            if (pd90Var2.a) {
                int iA7 = e7f.a(pd90Var2.c, context);
                int iA8 = e7f.a(0.0f, context);
                int iA9 = e7f.a(0.0f, context);
                int i6 = pd90Var2.b;
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
            if (pd90Var.a) {
                int iA10 = e7f.a(pd90Var.c, context);
                int iA11 = e7f.a(0.0f, context);
                int iA12 = e7f.a(0.0f, context);
                int i8 = pd90Var.b;
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

    public abstract mte j();
}
