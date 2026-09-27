package com.bytedance.adsdk.ugeno.yoga.tq;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.hww.ok;
import com.bytedance.adsdk.ugeno.hww.vgm;
import com.bytedance.adsdk.ugeno.vy;
import com.bytedance.adsdk.ugeno.yoga.ed;
import com.bytedance.adsdk.ugeno.yoga.hu;
import com.bytedance.adsdk.ugeno.yoga.hv;
import com.bytedance.adsdk.ugeno.yoga.khx;
import com.bytedance.adsdk.ugeno.yoga.nod;
import com.bytedance.adsdk.ugeno.yoga.rs;
import com.bytedance.adsdk.ugeno.yoga.vhb;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class sd extends ViewGroup implements vgm, com.bytedance.adsdk.ugeno.tq.tq {
    private final Map<View, nod> hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private vy f32831sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final nod f32832tq;
    private ok vy;

    public sd(Context context) {
        this(context, null, 0);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        nod nodVarHww;
        this.f32832tq.hww((com.bytedance.adsdk.ugeno.yoga.vgm) null);
        if (view instanceof com.bytedance.adsdk.ugeno.yoga.tq.tq) {
            throw null;
        }
        super.addView(view, i10, layoutParams);
        if (this.hww.containsKey(view)) {
            return;
        }
        if (view instanceof sd) {
            nodVarHww = ((sd) view).getYogaNode();
        } else {
            nodVarHww = this.hww.containsKey(view) ? this.hww.get(view) : vhb.hww();
            nodVarHww.hww(view);
            nodVarHww.hww((com.bytedance.adsdk.ugeno.yoga.vgm) new tq());
        }
        hww((hww) view.getLayoutParams(), nodVarHww, view);
        this.hww.put(view, nodVarHww);
        if (view.getVisibility() == 8) {
            view.setTag(151060224, Integer.valueOf(this.f32832tq.hww()));
        } else {
            nod nodVar = this.f32832tq;
            nodVar.hww(nodVarHww, nodVar.hww());
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof hww;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        vy vyVar = this.f32831sd;
        if (vyVar != null) {
            vyVar.tq(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new hww(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new hww(layoutParams);
    }

    public float getBorderRadius() {
        return this.vy.hww();
    }

    @Override // com.bytedance.adsdk.ugeno.hww.vgm
    public float getRipple() {
        return this.vy.getRipple();
    }

    @Override // com.bytedance.adsdk.ugeno.hww.vgm
    public float getRubIn() {
        return this.vy.getRubIn();
    }

    @Override // com.bytedance.adsdk.ugeno.hww.vgm
    public float getShine() {
        return this.vy.getShine();
    }

    @Override // com.bytedance.adsdk.ugeno.hww.vgm
    public float getStretch() {
        return this.vy.getStretch();
    }

    public nod getYogaNode() {
        return this.f32832tq;
    }

    public nod hww(View view) {
        return this.hww.get(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        vy vyVar = this.f32831sd;
        if (vyVar != null) {
            vyVar.vgm();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        vy vyVar = this.f32831sd;
        if (vyVar != null) {
            vyVar.ok();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        vy vyVar = this.f32831sd;
        if (vyVar != null) {
            vyVar.hww(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        vy vyVar = this.f32831sd;
        if (vyVar != null) {
            vyVar.hu();
        }
        if (!(getParent() instanceof sd)) {
            hww(View.MeasureSpec.makeMeasureSpec(i12 - i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i13 - i11, 1073741824));
        }
        hww(this.f32832tq, 0.0f, 0.0f);
        vy vyVar2 = this.f32831sd;
        if (vyVar2 != null) {
            vyVar2.hww(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (!(getParent() instanceof sd)) {
            hww(i10, i11);
        }
        vy vyVar = this.f32831sd;
        if (vyVar != null) {
            int[] iArrHww = vyVar.hww(i10, i11);
            setMeasuredDimension(iArrHww[0], iArrHww[1]);
        } else {
            setMeasuredDimension(Math.round(this.f32832tq.ok()), Math.round(this.f32832tq.rs()));
        }
        vy vyVar2 = this.f32831sd;
        if (vyVar2 != null) {
            vyVar2.hv();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        vy vyVar = this.f32831sd;
        if (vyVar != null) {
            vyVar.tq(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            hww(getChildAt(i10), false);
        }
        super.removeAllViews();
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            hww(getChildAt(i10), true);
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        hww(view, false);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i10) {
        hww(getChildAt(i10), false);
        super.removeViewAt(i10);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        hww(view, true);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            hww(getChildAt(i12), false);
        }
        super.removeViews(i10, i11);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            hww(getChildAt(i12), true);
        }
        super.removeViewsInLayout(i10, i11);
    }

    @Override // com.bytedance.adsdk.ugeno.tq.tq
    public void sd(View view, int i10) {
        vy(view, i10);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.vy.hww(i10);
    }

    public void setBorderRadius(float f10) {
        this.vy.hww(f10);
    }

    public void setRipple(float f10) {
        ok okVar = this.vy;
        if (okVar != null) {
            okVar.tq(f10);
        }
    }

    public void setRubIn(float f10) {
        ok okVar = this.vy;
        if (okVar != null) {
            okVar.hv(f10);
        }
    }

    public void setShine(float f10) {
        ok okVar = this.vy;
        if (okVar != null) {
            okVar.sd(f10);
        }
    }

    public void setStretch(float f10) {
        ok okVar = this.vy;
        if (okVar != null) {
            okVar.vy(f10);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.tq.tq
    public void tq(int i10) {
        nod nodVar = this.f32832tq;
        if (nodVar != null) {
            tq(nodVar, i10);
            requestLayout();
        }
    }

    public void vy(View view, int i10) {
        int iHww;
        view.setVisibility(i10);
        try {
            nod nodVar = this.hww.get(view);
            Object tag = view.getTag(151060224);
            if (i10 != 0) {
                if (i10 != 8 || (iHww = this.f32832tq.hww(nodVar)) == -1) {
                    return;
                }
                this.f32832tq.tq(iHww);
                view.setTag(151060224, Integer.valueOf(iHww));
                hww(this.f32832tq);
                return;
            }
            if (tag == null || this.f32832tq.hww(nodVar) != -1) {
                return;
            }
            int iIntValue = ((Integer) tag).intValue();
            if (iIntValue < this.f32832tq.hww()) {
                this.f32832tq.hww(this.hww.get(view), iIntValue);
            } else {
                this.f32832tq.hww(this.hww.get(view), this.f32832tq.hww());
            }
            hww(this.f32832tq);
        } catch (Throwable unused) {
        }
    }

    public sd(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.vy = new ok(this);
        nod nodVarHww = vhb.hww();
        this.f32832tq = nodVarHww;
        this.hww = new HashMap();
        nodVarHww.hww(this);
        nodVarHww.hww((com.bytedance.adsdk.ugeno.yoga.vgm) new tq());
        hww((hww) generateDefaultLayoutParams(), nodVarHww, this);
    }

    @Override // com.bytedance.adsdk.ugeno.tq.tq
    public void hww(int i10) {
        nod nodVar = this.f32832tq;
        if (nodVar != null) {
            hww(nodVar, i10);
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.tq.tq
    public void tq(View view, int i10) {
        nod nodVarHww;
        if (view == null || (nodVarHww = hww(view)) == null) {
            return;
        }
        tq(nodVarHww, i10);
        view.requestLayout();
    }

    @Override // com.bytedance.adsdk.ugeno.tq.tq
    public void hww(View view, int i10) {
        nod nodVarHww;
        if (view == null || (nodVarHww = hww(view)) == null) {
            return;
        }
        hww(nodVarHww, i10);
        view.requestLayout();
    }

    private void tq(nod nodVar, int i10) {
        if (i10 == -1) {
            nodVar.vgm(100.0f);
        } else if (i10 == -2) {
            nodVar.hv();
        } else {
            nodVar.hu(i10);
        }
    }

    private void hww(nod nodVar, int i10) {
        if (i10 == -1) {
            nodVar.hv(100.0f);
        } else if (i10 == -2) {
            nodVar.vy();
        } else {
            nodVar.vy(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class tq implements com.bytedance.adsdk.ugeno.yoga.vgm {
        @Override // com.bytedance.adsdk.ugeno.yoga.vgm
        public long hww(nod nodVar, float f10, com.bytedance.adsdk.ugeno.yoga.ok okVar, float f11, com.bytedance.adsdk.ugeno.yoga.ok okVar2) {
            View view = (View) nodVar.nod();
            if (view == null || (view instanceof sd)) {
                return rs.hww(0, 0);
            }
            view.measure(View.MeasureSpec.makeMeasureSpec((int) f10, hww(okVar)), View.MeasureSpec.makeMeasureSpec((int) f11, hww(okVar2)));
            return rs.hww(view.getMeasuredWidth(), view.getMeasuredHeight());
        }

        private int hww(com.bytedance.adsdk.ugeno.yoga.ok okVar) {
            if (okVar == com.bytedance.adsdk.ugeno.yoga.ok.AT_MOST) {
                return Integer.MIN_VALUE;
            }
            return okVar == com.bytedance.adsdk.ugeno.yoga.ok.EXACTLY ? 1073741824 : 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class hww extends ViewGroup.LayoutParams {

        /* JADX INFO: renamed from: bs, reason: collision with root package name */
        private float f32833bs;

        /* JADX INFO: renamed from: ed, reason: collision with root package name */
        private float f32834ed;

        /* JADX INFO: renamed from: hu, reason: collision with root package name */
        private float f32835hu;

        /* JADX INFO: renamed from: hv, reason: collision with root package name */
        private float f32836hv;
        SparseArray<Float> hww;
        private float jpb;
        private float khx;
        private float mrs;
        private float nod;

        /* JADX INFO: renamed from: ny, reason: collision with root package name */
        private float f32837ny;

        /* JADX INFO: renamed from: ok, reason: collision with root package name */
        private float f32838ok;

        /* JADX INFO: renamed from: rs, reason: collision with root package name */
        private float f32839rs;

        /* JADX INFO: renamed from: sd, reason: collision with root package name */
        private float f32840sd;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        SparseArray<String> f32841tq;
        private float vgm;
        private float vhb;
        private float vy;
        private float weu;
        private float wgt;

        public hww(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            if (layoutParams instanceof hww) {
                hww hwwVar = (hww) layoutParams;
                this.hww = hwwVar.hww.clone();
                this.f32841tq = hwwVar.f32841tq.clone();
                return;
            }
            this.hww = new SparseArray<>();
            this.f32841tq = new SparseArray<>();
            if (layoutParams.width >= 0) {
                this.hww.put(15, Float.valueOf(((ViewGroup.LayoutParams) this).width));
            }
            if (layoutParams.height >= 0) {
                this.hww.put(16, Float.valueOf(((ViewGroup.LayoutParams) this).height));
            }
        }

        public void bs(float f10) {
            this.mrs = f10;
            this.hww.put(28, Float.valueOf(f10));
        }

        public void ed(float f10) {
            this.f32836hv = f10;
            this.hww.put(19, Float.valueOf(f10));
        }

        public void hu(float f10) {
            this.f32837ny = f10;
            this.hww.put(14, Float.valueOf(f10));
        }

        public void hv(float f10) {
            this.vhb = f10;
            this.hww.put(9, Float.valueOf(f10));
        }

        public void hww(float f10) {
            this.vgm = f10;
            this.hww.put(5, Float.valueOf(f10));
        }

        public void khx(float f10) {
            this.f32835hu = f10;
            this.hww.put(20, Float.valueOf(f10));
        }

        public void nod(float f10) {
            this.wgt = f10;
            this.hww.put(13, Float.valueOf(f10));
        }

        public void ny(float f10) {
            this.vy = f10;
            this.hww.put(18, Float.valueOf(f10));
        }

        public void ok(float f10) {
            this.khx = f10;
            this.hww.put(11, Float.valueOf(f10));
        }

        public void rs(float f10) {
            this.weu = f10;
            this.hww.put(12, Float.valueOf(f10));
        }

        public void sd(float f10) {
            this.f32839rs = f10;
            this.hww.put(7, Float.valueOf(f10));
        }

        public void tq(float f10) {
            this.f32838ok = f10;
            this.hww.put(6, Float.valueOf(f10));
        }

        public void vgm(float f10) {
            this.f32834ed = f10;
            this.hww.put(10, Float.valueOf(f10));
        }

        public void vhb(float f10) {
            this.f32840sd = f10;
            this.hww.put(17, Float.valueOf(f10));
        }

        public void vy(float f10) {
            this.nod = f10;
            this.hww.put(8, Float.valueOf(f10));
        }

        public void weu(float f10) {
            this.f32833bs = f10;
            this.hww.put(25, Float.valueOf(f10));
        }

        public void wgt(float f10) {
            this.jpb = f10;
            this.hww.put(27, Float.valueOf(f10));
        }

        public hww(int i10, int i11) {
            super(i10, i11);
            this.hww = new SparseArray<>();
            this.f32841tq = new SparseArray<>();
            if (i10 == -2 || i10 == -1 || i10 >= 0) {
                this.hww.put(15, Float.valueOf(i10));
            }
            if (i11 == -2 || i11 == -1 || i11 >= 0) {
                this.hww.put(16, Float.valueOf(i11));
            }
        }
    }

    private void hww(nod nodVar) {
        if (nodVar.tq() != null) {
            hww(nodVar.tq());
        } else {
            nodVar.hww(Float.NaN, Float.NaN);
        }
    }

    private void hww(View view, boolean z10) {
        try {
            nod nodVar = this.hww.get(view);
            if (nodVar == null) {
                return;
            }
            nod nodVarTq = nodVar.tq();
            for (int i10 = 0; i10 < nodVarTq.hww(); i10++) {
                if (nodVarTq.hww(i10).equals(nodVar)) {
                    nodVarTq.tq(i10);
                    break;
                }
            }
            nodVar.hww((Object) null);
            this.hww.remove(view);
            if (z10) {
                this.f32832tq.hww(Float.NaN, Float.NaN);
            }
        } catch (Throwable unused) {
        }
    }

    private void hww(nod nodVar, float f10, float f11) {
        View view = (View) nodVar.nod();
        if (view != null && view != this) {
            if (view.getVisibility() == 8) {
                return;
            }
            int iRound = Math.round(nodVar.hu() + f10);
            int iRound2 = Math.round(nodVar.vgm() + f11);
            view.measure(View.MeasureSpec.makeMeasureSpec(Math.round(nodVar.ok()), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.round(nodVar.rs()), 1073741824));
            view.layout(iRound, iRound2, view.getMeasuredWidth() + iRound, view.getMeasuredHeight() + iRound2);
        }
        int iHww = nodVar.hww();
        for (int i10 = 0; i10 < iHww; i10++) {
            if (equals(view)) {
                hww(nodVar.hww(i10), f10, f11);
            } else if (!(view instanceof sd)) {
                hww(nodVar.hww(i10), nodVar.hu() + f10, nodVar.vgm() + f11);
            }
        }
    }

    private void hww(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        if (mode2 == 1073741824) {
            this.f32832tq.hu(size2);
        }
        if (mode == 1073741824) {
            this.f32832tq.vy(size);
        }
        if (mode2 == Integer.MIN_VALUE) {
            this.f32832tq.vhb(size2);
        }
        if (mode == Integer.MIN_VALUE) {
            this.f32832tq.nod(size);
        }
        this.f32832tq.hww(Float.NaN, Float.NaN);
    }

    public static void hww(hww hwwVar, nod nodVar, View view) {
        if (view.getResources().getConfiguration().getLayoutDirection() == 1) {
            nodVar.hww(com.bytedance.adsdk.ugeno.yoga.sd.RTL);
        }
        Drawable background = view.getBackground();
        if (background != null) {
            Rect rect = new Rect();
            if (background.getPadding(rect)) {
                nodVar.tq(com.bytedance.adsdk.ugeno.yoga.vy.LEFT, rect.left);
                nodVar.tq(com.bytedance.adsdk.ugeno.yoga.vy.TOP, rect.top);
                nodVar.tq(com.bytedance.adsdk.ugeno.yoga.vy.RIGHT, rect.right);
                nodVar.tq(com.bytedance.adsdk.ugeno.yoga.vy.BOTTOM, rect.bottom);
            }
        }
        for (int i10 = 0; i10 < hwwVar.hww.size(); i10++) {
            int iKeyAt = hwwVar.hww.keyAt(i10);
            float fFloatValue = hwwVar.hww.valueAt(i10).floatValue();
            if (iKeyAt == 4) {
                nodVar.sd(com.bytedance.adsdk.ugeno.yoga.hww.hww(Math.round(fFloatValue)));
            } else if (iKeyAt == 0) {
                nodVar.hww(com.bytedance.adsdk.ugeno.yoga.hww.hww(Math.round(fFloatValue)));
            } else if (iKeyAt == 9) {
                nodVar.tq(com.bytedance.adsdk.ugeno.yoga.hww.hww(Math.round(fFloatValue)));
            } else if (iKeyAt == 25) {
                nodVar.ny(fFloatValue);
            } else if (iKeyAt == 8) {
                if (fFloatValue < 0.0f) {
                    nodVar.sd();
                } else {
                    nodVar.sd(fFloatValue);
                }
            } else if (iKeyAt == 1) {
                nodVar.hww(hv.hww(Math.round(fFloatValue)));
            } else if (iKeyAt == 6) {
                nodVar.hww(fFloatValue);
            } else if (iKeyAt == 7) {
                nodVar.tq(fFloatValue);
            } else if (iKeyAt == 16) {
                if (fFloatValue == -1.0f) {
                    nodVar.vgm(100.0f);
                } else if (fFloatValue == -2.0f) {
                    nodVar.hv();
                } else {
                    nodVar.hu(fFloatValue);
                }
            } else if (iKeyAt == 18) {
                nodVar.hww(com.bytedance.adsdk.ugeno.yoga.vy.LEFT, fFloatValue);
            } else if (iKeyAt == 3) {
                nodVar.hww(hu.hww(Math.round(fFloatValue)));
            } else if (iKeyAt == 17) {
                nodVar.hww(com.bytedance.adsdk.ugeno.yoga.vy.TOP, fFloatValue);
            } else if (iKeyAt == 20) {
                nodVar.hww(com.bytedance.adsdk.ugeno.yoga.vy.RIGHT, fFloatValue);
            } else if (iKeyAt == 19) {
                nodVar.hww(com.bytedance.adsdk.ugeno.yoga.vy.BOTTOM, fFloatValue);
            } else if (iKeyAt == 28) {
                nodVar.rs(fFloatValue);
            } else if (iKeyAt == 27) {
                nodVar.ok(fFloatValue);
            } else if (iKeyAt == 22) {
                nodVar.tq(com.bytedance.adsdk.ugeno.yoga.vy.LEFT, fFloatValue);
            } else if (iKeyAt == 21) {
                nodVar.tq(com.bytedance.adsdk.ugeno.yoga.vy.TOP, fFloatValue);
            } else if (iKeyAt == 24) {
                nodVar.tq(com.bytedance.adsdk.ugeno.yoga.vy.RIGHT, fFloatValue);
            } else if (iKeyAt == 23) {
                nodVar.tq(com.bytedance.adsdk.ugeno.yoga.vy.BOTTOM, fFloatValue);
            } else if (iKeyAt == 11) {
                nodVar.sd(com.bytedance.adsdk.ugeno.yoga.vy.LEFT, fFloatValue);
            } else if (iKeyAt == 10) {
                nodVar.sd(com.bytedance.adsdk.ugeno.yoga.vy.TOP, fFloatValue);
            } else if (iKeyAt == 13) {
                nodVar.sd(com.bytedance.adsdk.ugeno.yoga.vy.RIGHT, fFloatValue);
            } else if (iKeyAt == 12) {
                nodVar.sd(com.bytedance.adsdk.ugeno.yoga.vy.BOTTOM, fFloatValue);
            } else if (iKeyAt == 14) {
                nodVar.hww(ed.hww(Math.round(fFloatValue)));
            } else if (iKeyAt == 15) {
                if (fFloatValue == -1.0f) {
                    nodVar.hv(100.0f);
                } else if (fFloatValue == -2.0f) {
                    nodVar.vy();
                } else {
                    nodVar.vy(fFloatValue);
                }
            } else if (iKeyAt == 2) {
                nodVar.hww(khx.hww(Math.round(fFloatValue)));
            }
        }
    }

    public void hww(com.bytedance.adsdk.ugeno.tq.sd sdVar) {
        this.f32831sd = sdVar;
    }
}
