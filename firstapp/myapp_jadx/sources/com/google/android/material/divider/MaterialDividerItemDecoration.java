package com.google.android.material.divider;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import defpackage.ecv;
import defpackage.gof0;
import defpackage.hb5;
import defpackage.pe4;
import defpackage.pk30;

/* JADX INFO: loaded from: classes4.dex */
public class MaterialDividerItemDecoration extends RecyclerView.n {
    public final ShapeDrawable a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final Rect h = new Rect();

    public MaterialDividerItemDecoration(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayD = gof0.d(context, attributeSet, pk30.I, R.attr.materialDividerStyle, R.style.Widget_MaterialComponents_MaterialDivider, new int[0]);
        this.c = ecv.a(0, context, typedArrayD).getDefaultColor();
        this.b = typedArrayD.getDimensionPixelSize(3, context.getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.e = typedArrayD.getDimensionPixelOffset(2, 0);
        this.f = typedArrayD.getDimensionPixelOffset(1, 0);
        this.g = typedArrayD.getBoolean(4, true);
        typedArrayD.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        int i2 = this.c;
        this.c = i2;
        this.a = shapeDrawable;
        shapeDrawable.setTint(i2);
        if (i == 0 || i == 1) {
            this.d = i;
        } else {
            hb5.a(pe4.b(i, "Invalid orientation: ", ". It should be either HORIZONTAL or VERTICAL"));
            throw null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void f(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
        rect.set(0, 0, 0, 0);
        if (j(recyclerView, view)) {
            int i = this.d;
            int i2 = this.b;
            if (i == 1) {
                rect.bottom = i2;
            } else if (recyclerView.getLayoutDirection() == 1) {
                rect.left = i2;
            } else {
                rect.right = i2;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void g(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        int height;
        int paddingTop;
        boolean z;
        int i;
        int i2;
        int width;
        int paddingLeft;
        if (recyclerView.getLayoutManager() == null) {
            return;
        }
        int i3 = this.d;
        ShapeDrawable shapeDrawable = this.a;
        int i4 = this.b;
        int i5 = 0;
        int i6 = this.f;
        int i7 = this.e;
        Rect rect = this.h;
        if (i3 == 1) {
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                paddingLeft = recyclerView.getPaddingLeft();
                width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
            } else {
                width = recyclerView.getWidth();
                paddingLeft = 0;
            }
            z = recyclerView.getLayoutDirection() == 1;
            int i8 = paddingLeft + (z ? i6 : i7);
            if (z) {
                i6 = i7;
            }
            int i9 = width - i6;
            int childCount = recyclerView.getChildCount();
            while (i5 < childCount) {
                View childAt = recyclerView.getChildAt(i5);
                if (j(recyclerView, childAt)) {
                    recyclerView.getLayoutManager().O(rect, childAt);
                    int iRound = Math.round(childAt.getTranslationY()) + rect.bottom;
                    shapeDrawable.setBounds(i8, iRound - i4, i9, iRound);
                    shapeDrawable.setAlpha(Math.round(childAt.getAlpha() * 255.0f));
                    shapeDrawable.draw(canvas);
                }
                i5++;
            }
            canvas.restore();
            return;
        }
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingTop = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            paddingTop = 0;
        }
        int i10 = paddingTop + i7;
        int i11 = height - i6;
        z = recyclerView.getLayoutDirection() == 1;
        int childCount2 = recyclerView.getChildCount();
        while (i5 < childCount2) {
            View childAt2 = recyclerView.getChildAt(i5);
            if (j(recyclerView, childAt2)) {
                recyclerView.getLayoutManager().O(rect, childAt2);
                int iRound2 = Math.round(childAt2.getTranslationX());
                if (z) {
                    i2 = rect.left + iRound2;
                    i = i2 + i4;
                } else {
                    i = iRound2 + rect.right;
                    i2 = i - i4;
                }
                shapeDrawable.setBounds(i2, i10, i, i11);
                shapeDrawable.setAlpha(Math.round(childAt2.getAlpha() * 255.0f));
                shapeDrawable.draw(canvas);
            }
            i5++;
        }
        canvas.restore();
    }

    public final boolean j(RecyclerView recyclerView, View view) {
        int iP = RecyclerView.P(view);
        RecyclerView.f adapter = recyclerView.getAdapter();
        return iP != -1 && (!(adapter != null && iP == adapter.getItemCount() - 1) || this.g);
    }
}
