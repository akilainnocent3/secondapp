package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.protobuf.Reader;
import defpackage.avh;
import defpackage.g9i0;
import defpackage.hb5;
import defpackage.hce0;
import defpackage.ib5;
import defpackage.iyi;
import defpackage.nk30;
import defpackage.r6i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: loaded from: classes.dex */
public class FlexboxLayout extends ViewGroup implements avh {
    public int A;
    public int[] B;
    public SparseIntArray C;
    public final b D;
    public List<a> E;
    public final b.a F;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public Drawable i;
    public Drawable v;
    public int w;
    public int y;
    public int z;

    public FlexboxLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = -1;
        this.D = new b(this);
        this.E = new ArrayList();
        this.F = new b.a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nk30.a, i, 0);
        this.a = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.b = typedArrayObtainStyledAttributes.getInt(6, 0);
        this.c = typedArrayObtainStyledAttributes.getInt(7, 0);
        this.d = typedArrayObtainStyledAttributes.getInt(1, 0);
        this.e = typedArrayObtainStyledAttributes.getInt(0, 0);
        this.f = typedArrayObtainStyledAttributes.getInt(8, -1);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(2);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(3);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(4);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i2 = typedArrayObtainStyledAttributes.getInt(9, 0);
        if (i2 != 0) {
            this.y = i2;
            this.w = i2;
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(11, 0);
        if (i3 != 0) {
            this.y = i3;
        }
        int i4 = typedArrayObtainStyledAttributes.getInt(10, 0);
        if (i4 != 0) {
            this.w = i4;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a(Canvas canvas, boolean z, boolean z2) {
        int paddingLeft = getPaddingLeft();
        int iMax = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.E.size();
        for (int i = 0; i < size; i++) {
            a aVar = this.E.get(i);
            for (int i2 = 0; i2 < aVar.h; i2++) {
                int i3 = aVar.o + i2;
                View viewN = n(i3);
                if (viewN != null && viewN.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) viewN.getLayoutParams();
                    if (p(i3, i2)) {
                        h(canvas, z ? viewN.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : (viewN.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.A, aVar.b, aVar.g);
                    }
                    if (i2 == aVar.h - 1 && (this.y & 4) > 0) {
                        h(canvas, z ? (viewN.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.A : viewN.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, aVar.b, aVar.g);
                    }
                }
            }
            if (q(i)) {
                d(canvas, paddingLeft, z2 ? aVar.d : aVar.b - this.z, iMax);
            }
            if (r(i) && (this.w & 4) > 0) {
                d(canvas, paddingLeft, z2 ? aVar.b - this.z : aVar.d, iMax);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        SparseIntArray sparseIntArray = this.C;
        if (sparseIntArray == null) {
            sparseIntArray = new SparseIntArray(getChildCount());
            this.C = sparseIntArray;
        }
        b bVar = this.D;
        avh avhVar = bVar.a;
        int flexItemCount = avhVar.getFlexItemCount();
        ArrayList arrayListF = bVar.f(flexItemCount);
        b.C0189b c0189b = new b.C0189b();
        if (view == null || !(layoutParams instanceof FlexItem)) {
            c0189b.b = 1;
        } else {
            c0189b.b = ((FlexItem) layoutParams).getOrder();
        }
        if (i == -1 || i == flexItemCount || i >= avhVar.getFlexItemCount()) {
            c0189b.a = flexItemCount;
        } else {
            c0189b.a = i;
            for (int i2 = i; i2 < flexItemCount; i2++) {
                ((b.C0189b) arrayListF.get(i2)).a++;
            }
        }
        arrayListF.add(c0189b);
        this.B = b.r(flexItemCount + 1, arrayListF, sparseIntArray);
        super.addView(view, i, layoutParams);
    }

    public final void b(Canvas canvas, boolean z, boolean z2) {
        int paddingTop = getPaddingTop();
        int iMax = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.E.size();
        for (int i = 0; i < size; i++) {
            a aVar = this.E.get(i);
            for (int i2 = 0; i2 < aVar.h; i2++) {
                int i3 = aVar.o + i2;
                View viewN = n(i3);
                if (viewN != null && viewN.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) viewN.getLayoutParams();
                    if (p(i3, i2)) {
                        d(canvas, aVar.a, z2 ? viewN.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : (viewN.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.z, aVar.g);
                    }
                    if (i2 == aVar.h - 1 && (this.w & 4) > 0) {
                        d(canvas, aVar.a, z2 ? (viewN.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.z : viewN.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, aVar.g);
                    }
                }
            }
            if (q(i)) {
                h(canvas, z ? aVar.c : aVar.a - this.A, paddingTop, iMax);
            }
            if (r(i) && (this.y & 4) > 0) {
                h(canvas, z ? aVar.a - this.A : aVar.c, paddingTop, iMax);
            }
        }
    }

    @Override // defpackage.avh
    public final void c(View view, int i, int i2, a aVar) {
        if (p(i, i2)) {
            boolean zO = o();
            int i3 = aVar.e;
            if (zO) {
                int i4 = this.A;
                aVar.e = i3 + i4;
                aVar.f += i4;
            } else {
                int i5 = this.z;
                aVar.e = i3 + i5;
                aVar.f += i5;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public final void d(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.i;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, i3 + i, this.z + i2);
        this.i.draw(canvas);
    }

    @Override // defpackage.avh
    public final int e(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    @Override // defpackage.avh
    public final View f(int i) {
        return getChildAt(i);
    }

    @Override // defpackage.avh
    public final int g(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            LayoutParams layoutParams3 = new LayoutParams(layoutParams2);
            layoutParams3.a = 1;
            layoutParams3.b = 0.0f;
            layoutParams3.c = 1.0f;
            layoutParams3.d = -1;
            layoutParams3.e = -1.0f;
            layoutParams3.f = -1;
            layoutParams3.i = -1;
            layoutParams3.v = 16777215;
            layoutParams3.w = 16777215;
            layoutParams3.a = layoutParams2.a;
            layoutParams3.b = layoutParams2.b;
            layoutParams3.c = layoutParams2.c;
            layoutParams3.d = layoutParams2.d;
            layoutParams3.e = layoutParams2.e;
            layoutParams3.f = layoutParams2.f;
            layoutParams3.i = layoutParams2.i;
            layoutParams3.v = layoutParams2.v;
            layoutParams3.w = layoutParams2.w;
            layoutParams3.y = layoutParams2.y;
            return layoutParams3;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            LayoutParams layoutParams4 = new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            layoutParams4.a = 1;
            layoutParams4.b = 0.0f;
            layoutParams4.c = 1.0f;
            layoutParams4.d = -1;
            layoutParams4.e = -1.0f;
            layoutParams4.f = -1;
            layoutParams4.i = -1;
            layoutParams4.v = 16777215;
            layoutParams4.w = 16777215;
            return layoutParams4;
        }
        LayoutParams layoutParams5 = new LayoutParams(layoutParams);
        layoutParams5.a = 1;
        layoutParams5.b = 0.0f;
        layoutParams5.c = 1.0f;
        layoutParams5.d = -1;
        layoutParams5.e = -1.0f;
        layoutParams5.f = -1;
        layoutParams5.i = -1;
        layoutParams5.v = 16777215;
        layoutParams5.w = 16777215;
        return layoutParams5;
    }

    @Override // defpackage.avh
    public int getAlignContent() {
        return this.e;
    }

    @Override // defpackage.avh
    public int getAlignItems() {
        return this.d;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.i;
    }

    public Drawable getDividerDrawableVertical() {
        return this.v;
    }

    @Override // defpackage.avh
    public int getFlexDirection() {
        return this.a;
    }

    @Override // defpackage.avh
    public int getFlexItemCount() {
        return getChildCount();
    }

    public List<a> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.E.size());
        for (a aVar : this.E) {
            if (aVar.a() != 0) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    @Override // defpackage.avh
    public List<a> getFlexLinesInternal() {
        return this.E;
    }

    @Override // defpackage.avh
    public int getFlexWrap() {
        return this.b;
    }

    public int getJustifyContent() {
        return this.c;
    }

    @Override // defpackage.avh
    public int getLargestMainSize() {
        Iterator<a> it = this.E.iterator();
        int iMax = Integer.MIN_VALUE;
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().e);
        }
        return iMax;
    }

    @Override // defpackage.avh
    public int getMaxLine() {
        return this.f;
    }

    public int getShowDividerHorizontal() {
        return this.w;
    }

    public int getShowDividerVertical() {
        return this.y;
    }

    @Override // defpackage.avh
    public int getSumOfCrossSize() {
        int size = this.E.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            a aVar = this.E.get(i2);
            if (q(i2)) {
                i += o() ? this.z : this.A;
            }
            if (r(i2)) {
                i += o() ? this.z : this.A;
            }
            i += aVar.g;
        }
        return i;
    }

    public final void h(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.v;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, this.A + i, i3 + i2);
        this.v.draw(canvas);
    }

    @Override // defpackage.avh
    public final int i(View view) {
        return 0;
    }

    @Override // defpackage.avh
    public final void j(a aVar) {
        if (o()) {
            if ((this.y & 4) > 0) {
                int i = aVar.e;
                int i2 = this.A;
                aVar.e = i + i2;
                aVar.f += i2;
                return;
            }
            return;
        }
        if ((this.w & 4) > 0) {
            int i3 = aVar.e;
            int i4 = this.z;
            aVar.e = i3 + i4;
            aVar.f += i4;
        }
    }

    @Override // defpackage.avh
    public final View k(int i) {
        return n(i);
    }

    @Override // defpackage.avh
    public final void l(int i, View view) {
    }

    @Override // defpackage.avh
    public final int m(View view, int i, int i2) {
        int i3;
        int i4;
        if (o()) {
            i3 = p(i, i2) ? this.A : 0;
            if ((this.y & 4) <= 0) {
                return i3;
            }
            i4 = this.A;
        } else {
            i3 = p(i, i2) ? this.z : 0;
            if ((this.w & 4) <= 0) {
                return i3;
            }
            i4 = this.z;
        }
        return i3 + i4;
    }

    public final View n(int i) {
        if (i < 0) {
            return null;
        }
        int[] iArr = this.B;
        if (i >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i]);
    }

    @Override // defpackage.avh
    public final boolean o() {
        int i = this.a;
        return i == 0 || i == 1;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.v == null && this.i == null) {
            return;
        }
        if (this.w == 0 && this.y == 0) {
            return;
        }
        WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
        int layoutDirection = getLayoutDirection();
        int i = this.a;
        if (i == 0) {
            a(canvas, layoutDirection == 1, this.b == 2);
            return;
        }
        if (i == 1) {
            a(canvas, layoutDirection != 1, this.b == 2);
            return;
        }
        if (i == 2) {
            boolean z = layoutDirection == 1;
            if (this.b == 2) {
                z = !z;
            }
            b(canvas, z, false);
            return;
        }
        if (i != 3) {
            return;
        }
        boolean z2 = layoutDirection == 1;
        if (this.b == 2) {
            z2 = !z2;
        }
        b(canvas, z2, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
        int layoutDirection = getLayoutDirection();
        int i5 = this.a;
        if (i5 == 0) {
            s(layoutDirection == 1, i, i2, i3, i4);
            return;
        }
        if (i5 == 1) {
            s(layoutDirection != 1, i, i2, i3, i4);
            return;
        }
        if (i5 == 2) {
            z2 = layoutDirection == 1;
            if (this.b == 2) {
                z2 = !z2;
            }
            t(i, i2, i3, i4, z2, false);
            return;
        }
        if (i5 != 3) {
            iyi.a(this.a, "Invalid flex direction is set: ");
            return;
        }
        z2 = layoutDirection == 1;
        if (this.b == 2) {
            z2 = !z2;
        }
        t(i, i2, i3, i4, z2, true);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        SparseIntArray sparseIntArray = this.C;
        if (sparseIntArray == null) {
            sparseIntArray = new SparseIntArray(getChildCount());
            this.C = sparseIntArray;
        }
        b bVar = this.D;
        avh avhVar = bVar.a;
        int flexItemCount = avhVar.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            SparseIntArray sparseIntArray2 = this.C;
            int flexItemCount2 = bVar.a.getFlexItemCount();
            this.B = b.r(flexItemCount2, bVar.f(flexItemCount2), sparseIntArray2);
            break;
        }
        for (int i3 = 0; i3 < flexItemCount; i3++) {
            View viewF = avhVar.f(i3);
            if (viewF != null && ((FlexItem) viewF.getLayoutParams()).getOrder() != sparseIntArray.get(i3)) {
                SparseIntArray sparseIntArray3 = this.C;
                int flexItemCount3 = bVar.a.getFlexItemCount();
                this.B = b.r(flexItemCount3, bVar.f(flexItemCount3), sparseIntArray3);
                break;
            }
        }
        int i4 = this.a;
        b.a aVar = this.F;
        if (i4 != 0 && i4 != 1) {
            if (i4 != 2 && i4 != 3) {
                iyi.a(this.a, "Invalid value for the flex direction is set: ");
                return;
            }
            this.E.clear();
            aVar.a = null;
            aVar.b = 0;
            this.D.b(this.F, i2, i, Reader.READ_DONE, 0, -1, null);
            this.E = aVar.a;
            bVar.h(i, i2, 0);
            bVar.g(i, i2, getPaddingRight() + getPaddingLeft());
            bVar.u(0);
            u(this.a, i, i2, aVar.b);
            return;
        }
        this.E.clear();
        aVar.a = null;
        aVar.b = 0;
        this.D.b(this.F, i, i2, Reader.READ_DONE, 0, -1, null);
        this.E = aVar.a;
        bVar.h(i, i2, 0);
        if (this.d == 3) {
            for (a aVar2 : this.E) {
                int iMax = Integer.MIN_VALUE;
                for (int i5 = 0; i5 < aVar2.h; i5++) {
                    View viewN = n(aVar2.o + i5);
                    if (viewN != null && viewN.getVisibility() != 8) {
                        LayoutParams layoutParams = (LayoutParams) viewN.getLayoutParams();
                        int i6 = this.b;
                        int i7 = aVar2.l;
                        iMax = i6 != 2 ? Math.max(iMax, viewN.getMeasuredHeight() + Math.max(i7 - viewN.getBaseline(), ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) : Math.max(iMax, viewN.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + Math.max(viewN.getBaseline() + (i7 - viewN.getMeasuredHeight()), ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin));
                    }
                }
                aVar2.g = iMax;
            }
        }
        bVar.g(i, i2, getPaddingBottom() + getPaddingTop());
        bVar.u(0);
        u(this.a, i, i2, aVar.b);
    }

    public final boolean p(int i, int i2) {
        for (int i3 = 1; i3 <= i2; i3++) {
            View viewN = n(i - i3);
            if (viewN != null && viewN.getVisibility() != 8) {
                if (o()) {
                    return (this.y & 2) != 0;
                }
                return (this.w & 2) != 0;
            }
        }
        if (o()) {
            return (this.y & 1) != 0;
        }
        return (this.w & 1) != 0;
    }

    public final boolean q(int i) {
        if (i >= 0 && i < this.E.size()) {
            for (int i2 = 0; i2 < i; i2++) {
                if (this.E.get(i2).a() > 0) {
                    if (o()) {
                        return (this.w & 2) != 0;
                    }
                    return (this.y & 2) != 0;
                }
            }
            if (o()) {
                return (this.w & 1) != 0;
            }
            if ((this.y & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean r(int i) {
        if (i >= 0 && i < this.E.size()) {
            for (int i2 = i + 1; i2 < this.E.size(); i2++) {
                if (this.E.get(i2).a() > 0) {
                    return false;
                }
            }
            if (o()) {
                return (this.w & 4) != 0;
            }
            if ((this.y & 4) != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00db  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:51:0x0103  */
    /* JADX WARN: Code duplicated, block: B:57:0x0117  */
    /* JADX WARN: Code duplicated, block: B:60:0x011d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0122  */
    /* JADX WARN: Code duplicated, block: B:64:0x0147  */
    /* JADX WARN: Code duplicated, block: B:65:0x0169  */
    /* JADX WARN: Code duplicated, block: B:67:0x0179  */
    /* JADX WARN: Code duplicated, block: B:68:0x0191  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x01df  */
    public final void s(boolean z, int i, int i2, int i3, int i4) {
        float measuredWidth;
        float f;
        float f2;
        float fMax;
        int i5;
        int i6;
        View viewN;
        boolean z2;
        int i7;
        int i8;
        float f3;
        float f4;
        int i9;
        float f5;
        int i10;
        View view;
        b bVar;
        a aVar;
        b bVar2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i11 = i3 - i;
        int paddingBottom = (i4 - i2) - getPaddingBottom();
        int paddingTop = getPaddingTop();
        int size = this.E.size();
        for (int i12 = 0; i12 < size; i12++) {
            a aVar2 = this.E.get(i12);
            if (q(i12)) {
                int i13 = this.z;
                paddingBottom -= i13;
                paddingTop += i13;
            }
            int i14 = paddingBottom;
            int i15 = this.c;
            char c = 4;
            int i16 = 2;
            boolean z3 = true;
            if (i15 == 0) {
                measuredWidth = paddingLeft;
                f = i11 - paddingRight;
            } else if (i15 != 1) {
                if (i15 == 2) {
                    int i17 = aVar2.e;
                    measuredWidth = paddingLeft + ((i11 - i17) / 2.0f);
                    f = (i11 - paddingRight) - ((i11 - i17) / 2.0f);
                } else if (i15 == 3) {
                    measuredWidth = paddingLeft;
                    int iA = aVar2.a();
                    f2 = (i11 - aVar2.e) / (iA != 1 ? iA - 1 : 1.0f);
                    f = i11 - paddingRight;
                } else if (i15 == 4) {
                    int iA2 = aVar2.a();
                    float f6 = iA2 != 0 ? (i11 - aVar2.e) / iA2 : 0.0f;
                    float f7 = f6 / 2.0f;
                    measuredWidth = paddingLeft + f7;
                    float f8 = (i11 - paddingRight) - f7;
                    f2 = f6;
                    f = f8;
                } else {
                    if (i15 != 5) {
                        iyi.a(this.c, "Invalid justifyContent is set: ");
                        return;
                    }
                    int iA3 = aVar2.a();
                    f2 = iA3 != 0 ? (i11 - aVar2.e) / (iA3 + 1) : 0.0f;
                    measuredWidth = paddingLeft + f2;
                    f = (i11 - paddingRight) - f2;
                }
                fMax = Math.max(f2, 0.0f);
                i5 = 0;
                while (i5 < aVar2.h) {
                    i6 = aVar2.o + i5;
                    viewN = n(i6);
                    char c2 = c;
                    if (viewN != null) {
                        z2 = z3;
                        if (viewN.getVisibility() == 8) {
                            z2 = z2;
                        } else {
                            LayoutParams layoutParams = (LayoutParams) viewN.getLayoutParams();
                            f3 = measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                            f4 = f - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                            if (p(i6, i5)) {
                                int i18 = this.A;
                                float f9 = i18;
                                f3 += f9;
                                f4 -= f9;
                                i9 = i18;
                            } else {
                                i9 = 0;
                            }
                            f5 = f4;
                            if (i5 == aVar2.h - 1 || (this.y & 4) <= 0) {
                                i10 = 0;
                            } else {
                                i10 = this.A;
                            }
                            if (this.b == i16) {
                                i8 = i16;
                                bVar2 = this.D;
                                if (z) {
                                    view = viewN;
                                    bVar2.o(view, aVar2, Math.round(f5) - viewN.getMeasuredWidth(), i14 - viewN.getMeasuredHeight(), Math.round(f5), i14);
                                } else {
                                    view = viewN;
                                    bVar2.o(view, aVar2, Math.round(f3), i14 - view.getMeasuredHeight(), view.getMeasuredWidth() + Math.round(f3), i14);
                                }
                                i7 = i14;
                            } else {
                                i5 = i5;
                                view = viewN;
                                z2 = z2;
                                i8 = i16;
                                i7 = i14;
                                bVar = this.D;
                                if (z) {
                                    bVar.o(view, aVar2, Math.round(f5) - view.getMeasuredWidth(), paddingTop, Math.round(f5), view.getMeasuredHeight() + paddingTop);
                                } else {
                                    int i19 = paddingTop;
                                    bVar.o(view, aVar2, Math.round(f3), i19, view.getMeasuredWidth() + Math.round(f3), view.getMeasuredHeight() + i19);
                                    paddingTop = i19;
                                }
                            }
                            measuredWidth = f3 + view.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                            float measuredWidth2 = f5 - ((view.getMeasuredWidth() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
                            if (z) {
                                aVar = aVar2;
                                aVar.b(view, i10, 0, i9, 0);
                            } else {
                                aVar = aVar2;
                                aVar.b(view, i9, 0, i10, 0);
                            }
                            aVar2 = aVar;
                            f = measuredWidth2;
                        }
                        i5++;
                        c = c2;
                        i16 = i8;
                        z3 = z2;
                        i14 = i7;
                    } else {
                        z2 = z3;
                    }
                    i8 = i16;
                    i5 = i5;
                    i7 = i14;
                    i5++;
                    c = c2;
                    i16 = i8;
                    z3 = z2;
                    i14 = i7;
                }
                int i20 = aVar2.g;
                paddingTop += i20;
                paddingBottom = i14 - i20;
            } else {
                int i21 = aVar2.e;
                f = i21 - paddingLeft;
                measuredWidth = (i11 - i21) + paddingRight;
            }
            f2 = 0.0f;
            fMax = Math.max(f2, 0.0f);
            i5 = 0;
            while (i5 < aVar2.h) {
                i6 = aVar2.o + i5;
                viewN = n(i6);
                char c3 = c;
                if (viewN != null) {
                    z2 = z3;
                    if (viewN.getVisibility() == 8) {
                        z2 = z2;
                    } else {
                        LayoutParams layoutParams2 = (LayoutParams) viewN.getLayoutParams();
                        f3 = measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin;
                        f4 = f - ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                        if (p(i6, i5)) {
                            int i110 = this.A;
                            float f10 = i110;
                            f3 += f10;
                            f4 -= f10;
                            i9 = i110;
                        } else {
                            i9 = 0;
                        }
                        f5 = f4;
                        if (i5 == aVar2.h - 1) {
                            i10 = 0;
                        } else {
                            i10 = 0;
                        }
                        if (this.b == i16) {
                            i8 = i16;
                            bVar2 = this.D;
                            if (z) {
                                view = viewN;
                                bVar2.o(view, aVar2, Math.round(f5) - viewN.getMeasuredWidth(), i14 - viewN.getMeasuredHeight(), Math.round(f5), i14);
                            } else {
                                view = viewN;
                                bVar2.o(view, aVar2, Math.round(f3), i14 - view.getMeasuredHeight(), view.getMeasuredWidth() + Math.round(f3), i14);
                            }
                            i7 = i14;
                        } else {
                            i5 = i5;
                            view = viewN;
                            z2 = z2;
                            i8 = i16;
                            i7 = i14;
                            bVar = this.D;
                            if (z) {
                                bVar.o(view, aVar2, Math.round(f5) - view.getMeasuredWidth(), paddingTop, Math.round(f5), view.getMeasuredHeight() + paddingTop);
                            } else {
                                int i111 = paddingTop;
                                bVar.o(view, aVar2, Math.round(f3), i111, view.getMeasuredWidth() + Math.round(f3), view.getMeasuredHeight() + i111);
                                paddingTop = i111;
                            }
                        }
                        measuredWidth = f3 + view.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                        float measuredWidth3 = f5 - ((view.getMeasuredWidth() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin);
                        if (z) {
                            aVar = aVar2;
                            aVar.b(view, i10, 0, i9, 0);
                        } else {
                            aVar = aVar2;
                            aVar.b(view, i9, 0, i10, 0);
                        }
                        aVar2 = aVar;
                        f = measuredWidth3;
                    }
                    i5++;
                    c = c3;
                    i16 = i8;
                    z3 = z2;
                    i14 = i7;
                } else {
                    z2 = z3;
                }
                i8 = i16;
                i5 = i5;
                i7 = i14;
                i5++;
                c = c3;
                i16 = i8;
                z3 = z2;
                i14 = i7;
            }
            int i22 = aVar2.g;
            paddingTop += i22;
            paddingBottom = i14 - i22;
        }
    }

    public void setAlignContent(int i) {
        if (this.e != i) {
            this.e = i;
            requestLayout();
        }
    }

    public void setAlignItems(int i) {
        if (this.d != i) {
            this.d = i;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable == this.i) {
            return;
        }
        this.i = drawable;
        if (drawable != null) {
            this.z = drawable.getIntrinsicHeight();
        } else {
            this.z = 0;
        }
        if (this.i == null && this.v == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
        requestLayout();
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable == this.v) {
            return;
        }
        this.v = drawable;
        if (drawable != null) {
            this.A = drawable.getIntrinsicWidth();
        } else {
            this.A = 0;
        }
        if (this.i == null && this.v == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
        requestLayout();
    }

    public void setFlexDirection(int i) {
        if (this.a != i) {
            this.a = i;
            requestLayout();
        }
    }

    @Override // defpackage.avh
    public void setFlexLines(List<a> list) {
        this.E = list;
    }

    public void setFlexWrap(int i) {
        if (this.b != i) {
            this.b = i;
            requestLayout();
        }
    }

    public void setJustifyContent(int i) {
        if (this.c != i) {
            this.c = i;
            requestLayout();
        }
    }

    public void setMaxLine(int i) {
        if (this.f != i) {
            this.f = i;
            requestLayout();
        }
    }

    public void setShowDivider(int i) {
        setShowDividerVertical(i);
        setShowDividerHorizontal(i);
    }

    public void setShowDividerHorizontal(int i) {
        if (i != this.w) {
            this.w = i;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i) {
        if (i != this.y) {
            this.y = i;
            requestLayout();
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00de  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:57:0x010d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0114 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x0116  */
    /* JADX WARN: Code duplicated, block: B:63:0x0137  */
    /* JADX WARN: Code duplicated, block: B:64:0x0154  */
    /* JADX WARN: Code duplicated, block: B:66:0x015c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0176  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:72:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:74:0x01c3  */
    public final void t(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        float measuredHeight;
        float f;
        float f2;
        float fMax;
        int i5;
        int i6;
        int i7;
        View viewN;
        char c;
        int i8;
        int i9;
        float f3;
        float f4;
        int i10;
        float f5;
        int i11;
        b bVar;
        a aVar;
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingRight = getPaddingRight();
        int paddingLeft = getPaddingLeft();
        int i12 = i4 - i2;
        int i13 = (i3 - i) - paddingRight;
        int size = this.E.size();
        for (int i14 = 0; i14 < size; i14++) {
            a aVar2 = this.E.get(i14);
            if (q(i14)) {
                int i15 = this.A;
                paddingLeft += i15;
                i13 -= i15;
            }
            int i16 = i13;
            int i17 = this.c;
            char c2 = 4;
            int i18 = 1;
            if (i17 == 0) {
                measuredHeight = paddingTop;
                f = i12 - paddingBottom;
            } else if (i17 != 1) {
                if (i17 == 2) {
                    float f6 = (i12 - aVar2.e) / 2.0f;
                    measuredHeight = paddingTop + f6;
                    f = (i12 - paddingBottom) - f6;
                } else if (i17 == 3) {
                    measuredHeight = paddingTop;
                    int iA = aVar2.a();
                    f2 = (i12 - aVar2.e) / (iA != 1 ? iA - 1 : 1.0f);
                    f = i12 - paddingBottom;
                } else if (i17 == 4) {
                    int iA2 = aVar2.a();
                    f2 = iA2 != 0 ? (i12 - aVar2.e) / iA2 : 0.0f;
                    float f7 = f2 / 2.0f;
                    measuredHeight = paddingTop + f7;
                    f = (i12 - paddingBottom) - f7;
                } else {
                    if (i17 != 5) {
                        iyi.a(this.c, "Invalid justifyContent is set: ");
                        return;
                    }
                    int iA3 = aVar2.a();
                    f2 = iA3 != 0 ? (i12 - aVar2.e) / (iA3 + 1) : 0.0f;
                    measuredHeight = paddingTop + f2;
                    f = (i12 - paddingBottom) - f2;
                }
                fMax = Math.max(f2, 0.0f);
                i5 = 0;
                while (i5 < aVar2.h) {
                    i6 = aVar2.o + i5;
                    i7 = i18;
                    viewN = n(i6);
                    if (viewN != null) {
                        c = c2;
                        if (viewN.getVisibility() == 8) {
                            LayoutParams layoutParams = (LayoutParams) viewN.getLayoutParams();
                            f3 = measuredHeight + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                            f4 = f - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                            if (p(i6, i5)) {
                                i10 = this.z;
                                float f8 = i10;
                                f3 += f8;
                                f4 -= f8;
                            } else {
                                i10 = 0;
                            }
                            f5 = f4;
                            if (i5 == aVar2.h - i7 || (this.w & 4) <= 0) {
                                i11 = 0;
                            } else {
                                i11 = this.z;
                            }
                            i9 = i5;
                            bVar = this.D;
                            if (z) {
                                if (z2) {
                                    bVar.p(viewN, aVar2, true, i16 - viewN.getMeasuredWidth(), Math.round(f5) - viewN.getMeasuredHeight(), i16, Math.round(f5));
                                } else {
                                    bVar.p(viewN, aVar2, true, i16 - viewN.getMeasuredWidth(), Math.round(f3), i16, viewN.getMeasuredHeight() + Math.round(f3));
                                }
                                i8 = i16;
                            } else {
                                i9 = i9;
                                i7 = i7;
                                i8 = i16;
                                if (z2) {
                                    bVar.p(viewN, aVar2, false, paddingLeft, Math.round(f5) - viewN.getMeasuredHeight(), viewN.getMeasuredWidth() + paddingLeft, Math.round(f5));
                                } else {
                                    int i19 = paddingLeft;
                                    bVar.p(viewN, aVar2, false, i19, Math.round(f3), viewN.getMeasuredWidth() + i19, viewN.getMeasuredHeight() + Math.round(f3));
                                    paddingLeft = i19;
                                }
                            }
                            measuredHeight = f3 + viewN.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                            float measuredHeight2 = f5 - ((viewN.getMeasuredHeight() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin);
                            if (z2) {
                                aVar = aVar2;
                                aVar.b(viewN, 0, i11, 0, i10);
                            } else {
                                aVar = aVar2;
                                aVar.b(viewN, 0, i10, 0, i11);
                            }
                            aVar2 = aVar;
                            f = measuredHeight2;
                        }
                        i5 = i9 + 1;
                        c2 = c;
                        i18 = i7;
                        i16 = i8;
                    } else {
                        c = c2;
                    }
                    i9 = i5;
                    i7 = i7;
                    i8 = i16;
                    i5 = i9 + 1;
                    c2 = c;
                    i18 = i7;
                    i16 = i8;
                }
                int i20 = aVar2.g;
                paddingLeft += i20;
                i13 = i16 - i20;
            } else {
                int i21 = aVar2.e;
                f = i21 - paddingTop;
                measuredHeight = (i12 - i21) + paddingBottom;
            }
            f2 = 0.0f;
            fMax = Math.max(f2, 0.0f);
            i5 = 0;
            while (i5 < aVar2.h) {
                i6 = aVar2.o + i5;
                i7 = i18;
                viewN = n(i6);
                if (viewN != null) {
                    c = c2;
                    if (viewN.getVisibility() == 8) {
                        LayoutParams layoutParams2 = (LayoutParams) viewN.getLayoutParams();
                        f3 = measuredHeight + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
                        f4 = f - ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                        if (p(i6, i5)) {
                            i10 = this.z;
                            float f9 = i10;
                            f3 += f9;
                            f4 -= f9;
                        } else {
                            i10 = 0;
                        }
                        f5 = f4;
                        if (i5 == aVar2.h - i7) {
                            i11 = 0;
                        } else {
                            i11 = 0;
                        }
                        i9 = i5;
                        bVar = this.D;
                        if (z) {
                            if (z2) {
                                bVar.p(viewN, aVar2, true, i16 - viewN.getMeasuredWidth(), Math.round(f5) - viewN.getMeasuredHeight(), i16, Math.round(f5));
                            } else {
                                bVar.p(viewN, aVar2, true, i16 - viewN.getMeasuredWidth(), Math.round(f3), i16, viewN.getMeasuredHeight() + Math.round(f3));
                            }
                            i8 = i16;
                        } else {
                            i9 = i9;
                            i7 = i7;
                            i8 = i16;
                            if (z2) {
                                bVar.p(viewN, aVar2, false, paddingLeft, Math.round(f5) - viewN.getMeasuredHeight(), viewN.getMeasuredWidth() + paddingLeft, Math.round(f5));
                            } else {
                                int i110 = paddingLeft;
                                bVar.p(viewN, aVar2, false, i110, Math.round(f3), viewN.getMeasuredWidth() + i110, viewN.getMeasuredHeight() + Math.round(f3));
                                paddingLeft = i110;
                            }
                        }
                        measuredHeight = f3 + viewN.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                        float measuredHeight3 = f5 - ((viewN.getMeasuredHeight() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin);
                        if (z2) {
                            aVar = aVar2;
                            aVar.b(viewN, 0, i11, 0, i10);
                        } else {
                            aVar = aVar2;
                            aVar.b(viewN, 0, i10, 0, i11);
                        }
                        aVar2 = aVar;
                        f = measuredHeight3;
                    }
                    i5 = i9 + 1;
                    c2 = c;
                    i18 = i7;
                    i16 = i8;
                } else {
                    c = c2;
                }
                i9 = i5;
                i7 = i7;
                i8 = i16;
                i5 = i9 + 1;
                c2 = c;
                i18 = i7;
                i16 = i8;
            }
            int i22 = aVar2.g;
            paddingLeft += i22;
            i13 = i16 - i22;
        }
    }

    public final void u(int i, int i2, int i3, int i4) {
        int paddingBottom;
        int largestMainSize;
        int iResolveSizeAndState;
        int iResolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (i == 0 || i == 1) {
            paddingBottom = getPaddingBottom() + getPaddingTop() + getSumOfCrossSize();
            largestMainSize = getLargestMainSize();
        } else {
            if (i != 2 && i != 3) {
                hb5.a(hce0.a(i, "Invalid flex direction: "));
                return;
            }
            paddingBottom = getLargestMainSize();
            largestMainSize = getPaddingRight() + getPaddingLeft() + getSumOfCrossSize();
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < largestMainSize) {
                i4 = View.combineMeasuredStates(i4, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
            } else {
                size = largestMainSize;
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        } else if (mode == 0) {
            iResolveSizeAndState = View.resolveSizeAndState(largestMainSize, i2, i4);
        } else if (mode != 1073741824) {
            ib5.a(hce0.a(mode, "Unknown width mode is set: "));
            return;
        } else {
            if (size < largestMainSize) {
                i4 = View.combineMeasuredStates(i4, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < paddingBottom) {
                i4 = View.combineMeasuredStates(i4, 256);
            } else {
                size2 = paddingBottom;
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        } else if (mode2 == 0) {
            iResolveSizeAndState2 = View.resolveSizeAndState(paddingBottom, i3, i4);
        } else if (mode2 != 1073741824) {
            ib5.a(hce0.a(mode2, "Unknown height mode is set: "));
            return;
        } else {
            if (size2 < paddingBottom) {
                i4 = View.combineMeasuredStates(i4, 256);
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        }
        setMeasuredDimension(iResolveSizeAndState, iResolveSizeAndState2);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new a();
        public int a;
        public float b;
        public float c;
        public int d;
        public float e;
        public int f;
        public int i;
        public int v;
        public int w;
        public boolean y;

        public class a implements Parcelable.Creator<LayoutParams> {
            @Override // android.os.Parcelable.Creator
            public final LayoutParams createFromParcel(Parcel parcel) {
                LayoutParams layoutParams = new LayoutParams(0, 0);
                layoutParams.a = 1;
                layoutParams.b = 0.0f;
                layoutParams.c = 1.0f;
                layoutParams.d = -1;
                layoutParams.e = -1.0f;
                layoutParams.f = -1;
                layoutParams.i = -1;
                layoutParams.v = 16777215;
                layoutParams.w = 16777215;
                layoutParams.a = parcel.readInt();
                layoutParams.b = parcel.readFloat();
                layoutParams.c = parcel.readFloat();
                layoutParams.d = parcel.readInt();
                layoutParams.e = parcel.readFloat();
                layoutParams.f = parcel.readInt();
                layoutParams.i = parcel.readInt();
                layoutParams.v = parcel.readInt();
                layoutParams.w = parcel.readInt();
                layoutParams.y = parcel.readByte() != 0;
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) layoutParams).height = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) layoutParams).width = parcel.readInt();
                return layoutParams;
            }

            @Override // android.os.Parcelable.Creator
            public final LayoutParams[] newArray(int i) {
                return new LayoutParams[i];
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 1;
            this.b = 0.0f;
            this.c = 1.0f;
            this.d = -1;
            this.e = -1.0f;
            this.f = -1;
            this.i = -1;
            this.v = 16777215;
            this.w = 16777215;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nk30.b);
            this.a = typedArrayObtainStyledAttributes.getInt(8, 1);
            this.b = typedArrayObtainStyledAttributes.getFloat(2, 0.0f);
            this.c = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
            this.d = typedArrayObtainStyledAttributes.getInt(0, -1);
            this.e = typedArrayObtainStyledAttributes.getFraction(1, 1, 1, -1.0f);
            this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
            this.i = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, -1);
            this.v = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 16777215);
            this.w = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 16777215);
            this.y = typedArrayObtainStyledAttributes.getBoolean(9, false);
            typedArrayObtainStyledAttributes.recycle();
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int A1() {
            return this.w;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int F() {
            return this.d;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float H() {
            return this.c;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int J() {
            return this.f;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int V() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final void W0(int i) {
            this.f = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int X0() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final void Y(int i) {
            this.i = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int a1() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int b() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float b0() {
            return this.b;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int c() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int getOrder() {
            return this.a;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float h0() {
            return this.e;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final boolean n0() {
            return this.y;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int u0() {
            return this.v;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int v1() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeFloat(this.b);
            parcel.writeFloat(this.c);
            parcel.writeInt(this.d);
            parcel.writeFloat(this.e);
            parcel.writeInt(this.f);
            parcel.writeInt(this.i);
            parcel.writeInt(this.v);
            parcel.writeInt(this.w);
            parcel.writeByte(this.y ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int x1() {
            return this.i;
        }

        public LayoutParams(int i, int i2) {
            super(new ViewGroup.LayoutParams(i, i2));
            this.a = 1;
            this.b = 0.0f;
            this.c = 1.0f;
            this.d = -1;
            this.e = -1.0f;
            this.f = -1;
            this.i = -1;
            this.v = 16777215;
            this.w = 16777215;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlexboxLayout(Context context) {
        this(context, null);
    }
}
