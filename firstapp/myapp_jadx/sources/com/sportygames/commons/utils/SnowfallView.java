package com.sportygames.commons.utils;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.r;
import com.sportygames.commons.utils.SnowfallView;
import com.sportygames.commons.utils.a;
import defpackage.tk30;
import defpackage.xx30;
import defpackage.zdf;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/sportygames/commons/utils/SnowfallView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SnowfallView extends View {
    public final int a;
    public final Bitmap b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int i;
    public final boolean v;
    public final boolean w;
    public a y;
    public com.sportygames.commons.utils.a[] z;

    public static final class a extends HandlerThread {
        public final Handler a;

        public a() {
            super("SnowflakesComputations");
            start();
            this.a = new Handler(getLooper());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnowfallView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tk30.s);
        typedArrayObtainStyledAttributes.getClass();
        try {
            this.a = typedArrayObtainStyledAttributes.getInt(10, 50);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(3);
            this.b = drawable != null ? zdf.a(drawable) : null;
            this.c = typedArrayObtainStyledAttributes.getInt(1, 10);
            this.d = typedArrayObtainStyledAttributes.getInt(0, r.d.DEFAULT_DRAG_ANIMATION_DURATION);
            this.e = typedArrayObtainStyledAttributes.getInt(2, 15);
            this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, (int) (2.0f * getResources().getDisplayMetrics().density));
            this.i = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, (int) (4.0f * getResources().getDisplayMetrics().density));
            typedArrayObtainStyledAttributes.getInt(7, 3);
            typedArrayObtainStyledAttributes.getInt(6, 3);
            this.v = typedArrayObtainStyledAttributes.getBoolean(9, false);
            this.w = typedArrayObtainStyledAttributes.getBoolean(8, false);
            setLayerType(2, null);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.y = new a();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        a aVar = this.y;
        if (aVar == null) {
            Intrinsics.n("updateSnowflakesThread");
            throw null;
        }
        aVar.quit();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z;
        ArrayList arrayList;
        canvas.getClass();
        super.onDraw(canvas);
        if (isInEditMode()) {
            return;
        }
        com.sportygames.commons.utils.a[] aVarArr = this.z;
        int i = 0;
        if (aVarArr != null) {
            int length = aVarArr.length;
            int i2 = 0;
            z = false;
            while (i2 < length) {
                com.sportygames.commons.utils.a aVar = aVarArr[i2];
                aVar.getClass();
                aVar.a(canvas);
                i2++;
                z = true;
            }
        } else {
            z = false;
        }
        if (z) {
            a aVar2 = this.y;
            if (aVar2 == null) {
                Intrinsics.n("updateSnowflakesThread");
                throw null;
            }
            aVar2.a.post(new Runnable() { // from class: k7a0
                @Override // java.lang.Runnable
                public final void run() {
                    SnowfallView snowfallView = this.a;
                    a[] aVarArr2 = snowfallView.z;
                    if (aVarArr2 == null) {
                        return;
                    }
                    int length2 = aVarArr2.length;
                    int i3 = 0;
                    boolean z2 = false;
                    while (i3 < length2) {
                        a aVar3 = aVarArr2[i3];
                        aVar3.getClass();
                        aVar3.h += aVar3.f;
                        double d = aVar3.i + aVar3.g;
                        aVar3.i = d;
                        a.C0438a c0438a = aVar3.b;
                        int i4 = c0438a.b;
                        if (d > i4) {
                            if (aVar3.k) {
                                aVar3.k = false;
                                aVar3.c(null);
                            } else {
                                aVar3.c(Double.valueOf(-aVar3.c));
                            }
                        }
                        if (c0438a.i) {
                            aVar3.b().setAlpha((int) ((((float) (((double) i4) - aVar3.i)) / i4) * aVar3.d));
                        }
                        i3++;
                        z2 = true;
                    }
                    if (z2) {
                        snowfallView.postInvalidateOnAnimation();
                    }
                }
            });
        } else {
            setVisibility(8);
        }
        com.sportygames.commons.utils.a[] aVarArr2 = this.z;
        if (aVarArr2 != null) {
            arrayList = new ArrayList();
            for (com.sportygames.commons.utils.a aVar3 : aVarArr2) {
                aVar3.getClass();
                arrayList.add(aVar3);
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null || !(!arrayList.isEmpty())) {
            setVisibility(8);
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((com.sportygames.commons.utils.a) obj).a(canvas);
        }
        a aVar4 = this.y;
        if (aVar4 == null) {
            Intrinsics.n("updateSnowflakesThread");
            throw null;
        }
        aVar4.a.post(new Runnable() { // from class: k7a0
            @Override // java.lang.Runnable
            public final void run() {
                SnowfallView snowfallView = this.a;
                a[] aVarArr3 = snowfallView.z;
                if (aVarArr3 == null) {
                    return;
                }
                int length2 = aVarArr3.length;
                int i3 = 0;
                boolean z2 = false;
                while (i3 < length2) {
                    a aVar5 = aVarArr3[i3];
                    aVar5.getClass();
                    aVar5.h += aVar5.f;
                    double d = aVar5.i + aVar5.g;
                    aVar5.i = d;
                    a.C0438a c0438a = aVar5.b;
                    int i4 = c0438a.b;
                    if (d > i4) {
                        if (aVar5.k) {
                            aVar5.k = false;
                            aVar5.c(null);
                        } else {
                            aVar5.c(Double.valueOf(-aVar5.c));
                        }
                    }
                    if (c0438a.i) {
                        aVar5.b().setAlpha((int) ((((float) (((double) i4) - aVar5.i)) / i4) * aVar5.d));
                    }
                    i3++;
                    z2 = true;
                }
                if (z2) {
                    snowfallView.postInvalidateOnAnimation();
                }
            }
        });
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        xx30 xx30Var = new xx30();
        com.sportygames.commons.utils.a.C0438a c0438a = new com.sportygames.commons.utils.a.C0438a(getWidth(), getHeight(), this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w);
        int i5 = this.a;
        com.sportygames.commons.utils.a[] aVarArr = new com.sportygames.commons.utils.a[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            aVarArr[i6] = new com.sportygames.commons.utils.a(xx30Var, c0438a);
        }
        this.z = aVarArr;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        com.sportygames.commons.utils.a[] aVarArr;
        view.getClass();
        super.onVisibilityChanged(view, i);
        if (view == this && i == 8 && (aVarArr = this.z) != null) {
            for (com.sportygames.commons.utils.a aVar : aVarArr) {
                aVar.c(null);
            }
        }
    }
}
