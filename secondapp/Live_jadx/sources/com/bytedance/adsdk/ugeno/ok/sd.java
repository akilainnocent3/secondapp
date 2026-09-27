package com.bytedance.adsdk.ugeno.ok;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class sd extends ViewGroup {
    private boolean aed;
    private boolean aeg;
    private int blh;

    /* JADX INFO: renamed from: bq, reason: collision with root package name */
    private hv f32560bq;

    /* JADX INFO: renamed from: bs, reason: collision with root package name */
    private Drawable f32561bs;

    /* JADX INFO: renamed from: ce, reason: collision with root package name */
    private boolean f32562ce;

    /* JADX INFO: renamed from: cj, reason: collision with root package name */
    private int f32563cj;

    /* JADX INFO: renamed from: eb, reason: collision with root package name */
    private List<Object> f32564eb;
    private int ece;

    /* JADX INFO: renamed from: ed, reason: collision with root package name */
    private Scroller f32565ed;

    /* JADX INFO: renamed from: ep, reason: collision with root package name */
    private vy f32566ep;

    /* JADX INFO: renamed from: et, reason: collision with root package name */
    private EdgeEffect f32567et;

    /* JADX INFO: renamed from: fp, reason: collision with root package name */
    private ArrayList<View> f32568fp;
    private boolean fxi;
    private boolean grv;
    private VelocityTracker gvr;
    private float hnv;
    private int hwp;
    private int hww;

    /* JADX INFO: renamed from: ji, reason: collision with root package name */
    private List<vy> f32569ji;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private int f32570jk;
    private int jpb;
    private boolean khx;
    private int kub;

    /* JADX INFO: renamed from: kv, reason: collision with root package name */
    private int f32571kv;

    /* JADX INFO: renamed from: mg, reason: collision with root package name */
    private boolean f32572mg;
    private int mrs;

    /* JADX INFO: renamed from: mw, reason: collision with root package name */
    private boolean f32573mw;
    private int nod;
    private int npz;
    private final Runnable nuc;

    /* JADX INFO: renamed from: ny, reason: collision with root package name */
    private ClassLoader f32574ny;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private final tq f32575ok;
    private float omn;
    private int oxu;

    /* JADX INFO: renamed from: qm, reason: collision with root package name */
    private int f32576qm;

    /* JADX INFO: renamed from: qt, reason: collision with root package name */
    private float f32577qt;
    private float rpd;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private final Rect f32578rs;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    com.bytedance.adsdk.ugeno.ok.tq f32579sd;
    private float syb;
    private final ArrayList<tq> vgm;
    private Parcelable vhb;
    int vy;
    private int wal;
    private int wdz;
    private hu weu;
    private int wgt;
    private vy wyi;
    private boolean xas;

    /* JADX INFO: renamed from: xe, reason: collision with root package name */
    private int f32580xe;

    /* JADX INFO: renamed from: yt, reason: collision with root package name */
    private float f32581yt;
    private EdgeEffect ytm;

    /* JADX INFO: renamed from: za, reason: collision with root package name */
    private boolean f32582za;
    private int zeu;
    private int zvy;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    static final int[] f32559tq = {R.attr.layout_gravity};

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private static final Comparator<tq> f32558hv = new Comparator<tq>() { // from class: com.bytedance.adsdk.ugeno.ok.sd.1
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: hww, reason: merged with bridge method [inline-methods] */
        public int compare(tq tqVar, tq tqVar2) {
            return tqVar.f32589tq - tqVar2.f32589tq;
        }
    };

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private static final Interpolator f32557hu = new Interpolator() { // from class: com.bytedance.adsdk.ugeno.ok.sd.2
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    };
    private static final ok icx = new ok();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class hu extends DataSetObserver {
        public hu() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            sd.this.tq();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            sd.this.tq();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface hv {
        void hww(View view, float f10);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface hww {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class ok implements Comparator<View> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: hww, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            C0302sd c0302sd = (C0302sd) view.getLayoutParams();
            C0302sd c0302sd2 = (C0302sd) view2.getLayoutParams();
            boolean z10 = c0302sd.hww;
            if (z10 != c0302sd2.hww) {
                return z10 ? 1 : -1;
            }
            return c0302sd.f32584hv - c0302sd2.f32584hv;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class tq {

        /* JADX INFO: renamed from: hv, reason: collision with root package name */
        float f32587hv;
        Object hww;

        /* JADX INFO: renamed from: sd, reason: collision with root package name */
        boolean f32588sd;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        int f32589tq;
        float vy;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class vgm extends com.bytedance.adsdk.ugeno.ok.hww {
        public static final Parcelable.Creator<vgm> CREATOR = new Parcelable.ClassLoaderCreator<vgm>() { // from class: com.bytedance.adsdk.ugeno.ok.sd.vgm.1
            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: hww, reason: merged with bridge method [inline-methods] */
            public vgm createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new vgm(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: hww, reason: merged with bridge method [inline-methods] */
            public vgm createFromParcel(Parcel parcel) {
                return new vgm(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: hww, reason: merged with bridge method [inline-methods] */
            public vgm[] newArray(int i10) {
                return new vgm[i10];
            }
        };

        /* JADX INFO: renamed from: sd, reason: collision with root package name */
        Parcelable f32590sd;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        int f32591tq;
        ClassLoader vy;

        public vgm(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f32591tq + "}";
        }

        @Override // com.bytedance.adsdk.ugeno.ok.hww, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f32591tq);
            parcel.writeParcelable(this.f32590sd, i10);
        }

        public vgm(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f32591tq = parcel.readInt();
            this.f32590sd = parcel.readParcelable(classLoader);
            this.vy = classLoader;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface vy {
        void hww(int i10, float f10, int i11);

        void ny(int i10);

        void vhb(int i10);
    }

    public sd(Context context) {
        super(context);
        this.vgm = new ArrayList<>();
        this.f32575ok = new tq();
        this.f32578rs = new Rect();
        this.nod = -1;
        this.vhb = null;
        this.f32574ny = null;
        this.omn = -3.4028235E38f;
        this.hnv = Float.MAX_VALUE;
        this.zvy = 1;
        this.wdz = -1;
        this.xas = true;
        this.f32572mg = false;
        this.nuc = new Runnable() { // from class: com.bytedance.adsdk.ugeno.ok.sd.3
            @Override // java.lang.Runnable
            public void run() {
                sd.this.setScrollState(0);
                sd.this.sd();
            }
        };
        this.ece = 0;
        hww();
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void hu() {
        int i10 = 0;
        while (i10 < getChildCount()) {
            if (!((C0302sd) getChildAt(i10).getLayoutParams()).hww) {
                removeViewAt(i10);
                i10--;
            }
            i10++;
        }
    }

    private void hv(int i10) {
        vy vyVar = this.f32566ep;
        if (vyVar != null) {
            vyVar.vhb(i10);
        }
        List<vy> list = this.f32569ji;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                vy vyVar2 = this.f32569ji.get(i11);
                if (vyVar2 != null) {
                    vyVar2.vhb(i10);
                }
            }
        }
        vy vyVar3 = this.wyi;
        if (vyVar3 != null) {
            vyVar3.vhb(i10);
        }
    }

    private void nod() {
        this.f32573mw = false;
        this.f32582za = false;
        VelocityTracker velocityTracker = this.gvr;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.gvr = null;
        }
    }

    private boolean ok() {
        this.wdz = -1;
        nod();
        this.ytm.onRelease();
        this.f32567et.onRelease();
        return this.ytm.isFinished() || this.f32567et.isFinished();
    }

    private tq rs() {
        int i10;
        int clientWidth = getClientWidth();
        float f10 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f11 = clientWidth > 0 ? this.wgt / clientWidth : 0.0f;
        int i11 = 0;
        boolean z10 = true;
        tq tqVar = null;
        int i12 = -1;
        float f12 = 0.0f;
        while (i11 < this.vgm.size()) {
            tq tqVar2 = this.vgm.get(i11);
            if (!z10 && tqVar2.f32589tq != (i10 = i12 + 1)) {
                tqVar2 = this.f32575ok;
                tqVar2.f32587hv = f10 + f12 + f11;
                tqVar2.f32589tq = i10;
                tqVar2.vy = this.f32579sd.hww(i10);
                i11--;
            }
            tq tqVar3 = tqVar2;
            f10 = tqVar3.f32587hv;
            float f13 = tqVar3.vy + f10 + f11;
            if (!z10 && scrollX < f10) {
                break;
            }
            if (scrollX < f13 || i11 == this.vgm.size() - 1) {
                return tqVar3;
            }
            int i13 = tqVar3.f32589tq;
            float f14 = tqVar3.vy;
            i11++;
            i12 = i13;
            f12 = f14;
            tqVar = tqVar3;
            z10 = false;
        }
        return tqVar;
    }

    private void setScrollingCacheEnabled(boolean z10) {
        if (this.grv != z10) {
            this.grv = z10;
        }
    }

    private void vgm() {
        if (this.wal != 0) {
            ArrayList<View> arrayList = this.f32568fp;
            if (arrayList == null) {
                this.f32568fp = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.f32568fp.add(getChildAt(i10));
            }
            Collections.sort(this.f32568fp, icx);
        }
    }

    private boolean vy(int i10) {
        if (this.vgm.size() == 0) {
            if (this.xas) {
                return false;
            }
            this.fxi = false;
            hww(0, 0.0f, 0);
            if (this.fxi) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        tq tqVarRs = rs();
        int clientWidth = getClientWidth();
        int i11 = this.wgt;
        int i12 = clientWidth + i11;
        float f10 = clientWidth;
        int i13 = tqVarRs.f32589tq;
        float f11 = ((i10 / f10) - tqVarRs.f32587hv) / (tqVarRs.vy + (i11 / f10));
        this.fxi = false;
        hww(i13, f11, (int) (i12 * f11));
        if (this.fxi) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        tq tqVarHww;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0 && (tqVarHww = hww(childAt)) != null && tqVarHww.f32589tq == this.vy) {
                    childAt.addFocusables(arrayList, i10, i11);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i11 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        tq tqVarHww;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (tqVarHww = hww(childAt)) != null && tqVarHww.f32589tq == this.vy) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C0302sd c0302sd = (C0302sd) layoutParams;
        boolean zSd = c0302sd.hww | sd(view);
        c0302sd.hww = zSd;
        if (!this.aeg) {
            super.addView(view, i10, layoutParams);
        } else {
            if (zSd) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            c0302sd.vy = true;
            addViewInLayout(view, i10, layoutParams);
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        if (this.f32579sd == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i10 < 0) {
            return scrollX > ((int) (((float) clientWidth) * this.omn));
        }
        return i10 > 0 && scrollX < ((int) (((float) clientWidth) * this.hnv));
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0302sd) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.khx = true;
        if (this.f32565ed.isFinished() || !this.f32565ed.computeScrollOffset()) {
            hww(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f32565ed.getCurrX();
        int currY = this.f32565ed.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!vy(currX)) {
                this.f32565ed.abortAnimation();
                scrollTo(0, currY);
            }
        }
        postInvalidateOnAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || hww(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        tq tqVarHww;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (tqVarHww = hww(childAt)) != null && tqVarHww.f32589tq == this.vy && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        com.bytedance.adsdk.ugeno.ok.tq tqVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (tqVar = this.f32579sd) != null && tqVar.hww() > 1)) {
            if (!this.ytm.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.omn * width);
                this.ytm.setSize(height, width);
                zDraw = this.ytm.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.f32567et.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.hnv + 1.0f)) * width2);
                this.f32567et.setSize(height2, width2);
                zDraw |= this.f32567et.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.ytm.finish();
            this.f32567et.finish();
        }
        if (zDraw) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f32561bs;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0302sd();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public com.bytedance.adsdk.ugeno.ok.tq getAdapter() {
        return this.f32579sd;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i10, int i11) {
        if (this.wal == 2) {
            i11 = (i10 - 1) - i11;
        }
        return ((C0302sd) this.f32568fp.get(i11).getLayoutParams()).f32583hu;
    }

    public int getCurrentItem() {
        return this.vy;
    }

    public int getOffscreenPageLimit() {
        return this.zvy;
    }

    public int getPageMargin() {
        return this.wgt;
    }

    public void hww() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f32565ed = new Scroller(context, f32557hu);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.hwp = viewConfiguration.getScaledPagingTouchSlop();
        this.f32576qm = (int) (400.0f * f10);
        this.npz = viewConfiguration.getScaledMaximumFlingVelocity();
        this.ytm = new EdgeEffect(context);
        this.f32567et = new EdgeEffect(context);
        this.f32563cj = (int) (25.0f * f10);
        this.zeu = (int) (2.0f * f10);
        this.blh = (int) (f10 * 16.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.xas = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.nuc);
        Scroller scroller = this.f32565ed;
        if (scroller != null && !scroller.isFinished()) {
            this.f32565ed.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i10;
        float f10;
        super.onDraw(canvas);
        if (this.wgt <= 0 || this.f32561bs == null || this.vgm.size() <= 0 || this.f32579sd == null) {
            return;
        }
        int scrollX = getScrollX();
        int width = getWidth();
        float f11 = width;
        float f12 = this.wgt / f11;
        int i11 = 0;
        tq tqVar = this.vgm.get(0);
        float f13 = tqVar.f32587hv;
        int size = this.vgm.size();
        int i12 = tqVar.f32589tq;
        int i13 = this.vgm.get(size - 1).f32589tq;
        while (i12 < i13) {
            while (true) {
                i10 = tqVar.f32589tq;
                if (i12 <= i10 || i11 >= size) {
                    break;
                }
                i11++;
                tqVar = this.vgm.get(i11);
            }
            if (i12 == i10) {
                float f14 = tqVar.f32587hv;
                float f15 = tqVar.vy;
                f10 = (f14 + f15) * f11;
                f13 = f14 + f15 + f12;
            } else {
                float fHww = this.f32579sd.hww(i12);
                f10 = (f13 + fHww) * f11;
                f13 += fHww + f12;
            }
            if (this.wgt + f10 > scrollX) {
                this.f32561bs.setBounds(Math.round(f10), this.jpb, Math.round(this.wgt + f10), this.mrs);
                this.f32561bs.draw(canvas);
            }
            if (f10 > scrollX + width) {
                return;
            }
            i12++;
            scrollX = scrollX;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int iFindPointerIndex;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            ok();
            return false;
        }
        if (action != 0) {
            if (this.f32573mw) {
                return true;
            }
            if (this.f32582za) {
                return false;
            }
        }
        if (action == 0) {
            float x10 = motionEvent.getX();
            this.rpd = x10;
            this.f32581yt = x10;
            float y10 = motionEvent.getY();
            this.f32577qt = y10;
            this.syb = y10;
            this.wdz = motionEvent.getPointerId(0);
            this.f32582za = false;
            this.khx = true;
            this.f32565ed.computeScrollOffset();
            if (this.ece != 2 || Math.abs(this.f32565ed.getFinalX() - this.f32565ed.getCurrX()) <= this.zeu) {
                hww(false);
                this.f32573mw = false;
            } else {
                this.f32565ed.abortAnimation();
                this.aed = false;
                sd();
                this.f32573mw = true;
                sd(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i10 = this.wdz;
            if (i10 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i10)) != -1) {
                float x11 = motionEvent.getX(iFindPointerIndex);
                float f10 = x11 - this.f32581yt;
                float fAbs = Math.abs(f10);
                float y11 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y11 - this.f32577qt);
                if (f10 != 0.0f && !hww(this.f32581yt, f10) && hww(this, false, (int) f10, (int) x11, (int) y11)) {
                    this.f32581yt = x11;
                    this.syb = y11;
                    this.f32582za = true;
                    return false;
                }
                int i11 = this.hwp;
                if (fAbs > i11 && fAbs * 0.5f > fAbs2) {
                    this.f32573mw = true;
                    sd(true);
                    setScrollState(1);
                    this.f32581yt = f10 > 0.0f ? this.rpd + this.hwp : this.rpd - this.hwp;
                    this.syb = y11;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > i11) {
                    this.f32582za = true;
                }
                if (this.f32573mw && tq(x11)) {
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            hww(motionEvent);
        }
        if (this.gvr == null) {
            this.gvr = VelocityTracker.obtain();
        }
        this.gvr.addMovement(motionEvent);
        return this.f32573mw;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    /* JADX WARN: Code duplicated, block: B:24:0x0076  */
    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        tq tqVarHww;
        int iMax;
        int measuredWidth;
        int iMax2;
        int measuredHeight;
        int childCount = getChildCount();
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                C0302sd c0302sd = (C0302sd) childAt.getLayoutParams();
                if (c0302sd.hww) {
                    int i18 = c0302sd.f32586tq;
                    int i19 = i18 & 7;
                    int i20 = i18 & 112;
                    if (i19 != 1) {
                        if (i19 == 3) {
                            measuredWidth = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i19 != 5) {
                            measuredWidth = paddingLeft;
                        } else {
                            iMax = (i14 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i20 != 16) {
                            if (i20 != 48) {
                                measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i20 != 80) {
                                measuredHeight = paddingTop;
                            } else {
                                iMax2 = (i15 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i21 = paddingLeft + scrollX;
                            childAt.layout(i21, paddingTop, childAt.getMeasuredWidth() + i21, paddingTop + childAt.getMeasuredHeight());
                            i16++;
                            paddingTop = measuredHeight;
                            paddingLeft = measuredWidth;
                        } else {
                            iMax2 = Math.max((i15 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i22 = iMax2;
                        measuredHeight = paddingTop;
                        paddingTop = i22;
                        int i23 = paddingLeft + scrollX;
                        childAt.layout(i23, paddingTop, childAt.getMeasuredWidth() + i23, paddingTop + childAt.getMeasuredHeight());
                        i16++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax = Math.max((i14 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i24 = iMax;
                    measuredWidth = paddingLeft;
                    paddingLeft = i24;
                    if (i20 != 16) {
                        if (i20 != 48) {
                            measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                        } else if (i20 != 80) {
                            measuredHeight = paddingTop;
                        } else {
                            iMax2 = (i15 - paddingBottom) - childAt.getMeasuredHeight();
                            paddingBottom += childAt.getMeasuredHeight();
                        }
                        int i25 = paddingLeft + scrollX;
                        childAt.layout(i25, paddingTop, childAt.getMeasuredWidth() + i25, paddingTop + childAt.getMeasuredHeight());
                        i16++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax2 = Math.max((i15 - childAt.getMeasuredHeight()) / 2, paddingTop);
                    }
                    int i26 = iMax2;
                    measuredHeight = paddingTop;
                    paddingTop = i26;
                    int i27 = paddingLeft + scrollX;
                    childAt.layout(i27, paddingTop, childAt.getMeasuredWidth() + i27, paddingTop + childAt.getMeasuredHeight());
                    i16++;
                    paddingTop = measuredHeight;
                    paddingLeft = measuredWidth;
                }
            }
        }
        int i28 = (i14 - paddingLeft) - paddingRight;
        for (int i29 = 0; i29 < childCount; i29++) {
            View childAt2 = getChildAt(i29);
            if (childAt2.getVisibility() != 8) {
                C0302sd c0302sd2 = (C0302sd) childAt2.getLayoutParams();
                if (!c0302sd2.hww && (tqVarHww = hww(childAt2)) != null) {
                    float f10 = i28;
                    int i30 = ((int) (tqVarHww.f32587hv * f10)) + paddingLeft;
                    if (c0302sd2.vy) {
                        c0302sd2.vy = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f10 * c0302sd2.f32585sd), 1073741824), View.MeasureSpec.makeMeasureSpec((i15 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i30, paddingTop, childAt2.getMeasuredWidth() + i30, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.jpb = paddingTop;
        this.mrs = i15 - paddingBottom;
        this.f32580xe = i16;
        if (this.xas) {
            z11 = false;
            hww(this.vy, false, 0, false);
        } else {
            z11 = false;
        }
        this.xas = z11;
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        C0302sd c0302sd;
        C0302sd c0302sd2;
        int i12;
        setMeasuredDimension(View.getDefaultSize(0, i10), View.getDefaultSize(0, i11));
        int measuredWidth = getMeasuredWidth();
        this.oxu = Math.min(measuredWidth / 10, this.blh);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            boolean z10 = true;
            int i14 = 1073741824;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8 && (c0302sd2 = (C0302sd) childAt.getLayoutParams()) != null && c0302sd2.hww) {
                int i15 = c0302sd2.f32586tq;
                int i16 = i15 & 7;
                int i17 = i15 & 112;
                boolean z11 = i17 == 48 || i17 == 80;
                if (i16 != 3 && i16 != 5) {
                    z10 = false;
                }
                int i18 = Integer.MIN_VALUE;
                if (z11) {
                    i12 = Integer.MIN_VALUE;
                    i18 = 1073741824;
                } else {
                    i12 = z10 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i19 = ((ViewGroup.LayoutParams) c0302sd2).width;
                if (i19 != -2) {
                    if (i19 == -1) {
                        i19 = paddingLeft;
                    }
                    i18 = 1073741824;
                } else {
                    i19 = paddingLeft;
                }
                int i20 = ((ViewGroup.LayoutParams) c0302sd2).height;
                if (i20 == -2) {
                    i20 = measuredHeight;
                    i14 = i12;
                } else if (i20 == -1) {
                    i20 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i19, i18), View.MeasureSpec.makeMeasureSpec(i20, i14));
                if (z11) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z10) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i13++;
        }
        this.f32571kv = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.kub = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.aeg = true;
        sd();
        this.aeg = false;
        int childCount2 = getChildCount();
        for (int i21 = 0; i21 < childCount2; i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8 && ((c0302sd = (C0302sd) childAt2.getLayoutParams()) == null || !c0302sd.hww)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * c0302sd.f32585sd), 1073741824), this.kub);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11;
        int i12;
        int i13;
        tq tqVarHww;
        int childCount = getChildCount();
        if ((i10 & 2) != 0) {
            i12 = childCount;
            i11 = 0;
            i13 = 1;
        } else {
            i11 = childCount - 1;
            i12 = -1;
            i13 = -1;
        }
        while (i11 != i12) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (tqVarHww = hww(childAt)) != null && tqVarHww.f32589tq == this.vy && childAt.requestFocus(i10, rect)) {
                return true;
            }
            i11 += i13;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof vgm)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        vgm vgmVar = (vgm) parcelable;
        super.onRestoreInstanceState(vgmVar.hww());
        if (this.f32579sd != null) {
            hww(vgmVar.f32591tq, false, true);
            return;
        }
        this.nod = vgmVar.f32591tq;
        this.vhb = vgmVar.f32590sd;
        this.f32574ny = vgmVar.vy;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        vgm vgmVar = new vgm(super.onSaveInstanceState());
        vgmVar.f32591tq = this.vy;
        com.bytedance.adsdk.ugeno.ok.tq tqVar = this.f32579sd;
        if (tqVar != null) {
            vgmVar.f32590sd = tqVar.tq();
        }
        return vgmVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            int i14 = this.wgt;
            hww(i10, i12, i14, i14);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        com.bytedance.adsdk.ugeno.ok.tq tqVar;
        int iFindPointerIndex;
        if (this.f32562ce) {
            return true;
        }
        boolean zOk = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (tqVar = this.f32579sd) == null || tqVar.hww() == 0) {
            return false;
        }
        if (this.gvr == null) {
            this.gvr = VelocityTracker.obtain();
        }
        this.gvr.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f32565ed.abortAnimation();
            this.aed = false;
            sd();
            float x10 = motionEvent.getX();
            this.rpd = x10;
            this.f32581yt = x10;
            float y10 = motionEvent.getY();
            this.f32577qt = y10;
            this.syb = y10;
            this.wdz = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (actionIndex != -1) {
                            this.f32581yt = motionEvent.getX(actionIndex);
                            this.wdz = motionEvent.getPointerId(actionIndex);
                        }
                    } else if (action == 6) {
                        hww(motionEvent);
                        int iFindPointerIndex2 = motionEvent.findPointerIndex(this.wdz);
                        if (iFindPointerIndex2 != -1) {
                            this.f32581yt = motionEvent.getX(iFindPointerIndex2);
                        }
                    }
                } else if (this.f32573mw) {
                    hww(this.vy, true, 0, false);
                    zOk = ok();
                }
            } else if (!this.f32573mw) {
                int iFindPointerIndex3 = motionEvent.findPointerIndex(this.wdz);
                if (iFindPointerIndex3 == -1) {
                    zOk = ok();
                } else {
                    float x11 = motionEvent.getX(iFindPointerIndex3);
                    float fAbs = Math.abs(x11 - this.f32581yt);
                    float y11 = motionEvent.getY(iFindPointerIndex3);
                    float fAbs2 = Math.abs(y11 - this.syb);
                    if (fAbs > this.hwp && fAbs > fAbs2) {
                        this.f32573mw = true;
                        sd(true);
                        float f10 = this.rpd;
                        this.f32581yt = x11 - f10 > 0.0f ? f10 + this.hwp : f10 - this.hwp;
                        this.syb = y11;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (this.f32573mw) {
                        zOk = tq(motionEvent.getX(iFindPointerIndex));
                    }
                }
            } else if (this.f32573mw && (iFindPointerIndex = motionEvent.findPointerIndex(this.wdz)) != -1) {
                zOk = tq(motionEvent.getX(iFindPointerIndex));
            }
        } else if (this.f32573mw) {
            VelocityTracker velocityTracker = this.gvr;
            velocityTracker.computeCurrentVelocity(1000, this.npz);
            int xVelocity = (int) velocityTracker.getXVelocity(this.wdz);
            this.aed = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            tq tqVarRs = rs();
            float f11 = clientWidth;
            float f12 = this.wgt / f11;
            int i10 = tqVarRs.f32589tq;
            float f13 = ((scrollX / f11) - tqVarRs.f32587hv) / (tqVarRs.vy + f12);
            int iFindPointerIndex4 = motionEvent.findPointerIndex(this.wdz);
            if (iFindPointerIndex4 != -1) {
                hww(hww(i10, f13, xVelocity, (int) (motionEvent.getX(iFindPointerIndex4) - this.rpd)), true, true, xVelocity);
                zOk = ok();
            }
        }
        if (zOk) {
            postInvalidateOnAnimation();
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.aeg) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void sd() {
        hww(this.vy);
    }

    public void setAdapter(com.bytedance.adsdk.ugeno.ok.tq tqVar) {
        com.bytedance.adsdk.ugeno.ok.tq tqVar2 = this.f32579sd;
        if (tqVar2 != null) {
            tqVar2.hww((DataSetObserver) null);
            for (int i10 = 0; i10 < this.vgm.size(); i10++) {
                tq tqVar3 = this.vgm.get(i10);
                this.f32579sd.hww((ViewGroup) this, tqVar3.f32589tq, tqVar3.hww);
            }
            this.vgm.clear();
            hu();
            this.vy = 0;
            scrollTo(0, 0);
        }
        this.f32579sd = tqVar;
        this.hww = 0;
        if (tqVar != null) {
            if (this.weu == null) {
                this.weu = new hu();
            }
            this.f32579sd.hww((DataSetObserver) this.weu);
            this.aed = false;
            boolean z10 = this.xas;
            this.xas = true;
            this.hww = this.f32579sd.hww();
            int i11 = this.nod;
            if (i11 >= 0) {
                hww(i11, false, true);
                this.nod = -1;
                this.vhb = null;
                this.f32574ny = null;
            } else if (z10) {
                requestLayout();
            } else {
                sd();
            }
        }
        List<Object> list = this.f32564eb;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.f32564eb.size();
        for (int i12 = 0; i12 < size; i12++) {
            this.f32564eb.get(i12);
        }
    }

    public void setCurrentItem(int i10) {
        this.aed = false;
        hww(i10, !this.xas, false);
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 <= 0) {
            Log.w("ViewPager", "Requested offscreen page limit " + i10 + " too small; defaulting to 1");
            i10 = 1;
        }
        if (i10 != this.zvy) {
            this.zvy = i10;
            sd();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(vy vyVar) {
        this.f32566ep = vyVar;
    }

    public void setPageMargin(int i10) {
        int i11 = this.wgt;
        this.wgt = i10;
        int width = getWidth();
        hww(width, width, i10, i11);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f32561bs = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i10) {
        if (this.ece == i10) {
            return;
        }
        this.ece = i10;
        if (this.f32560bq != null) {
            tq(i10 != 0);
        }
        hu(i10);
    }

    public void setScroller(Scroller scroller) {
        this.f32565ed = scroller;
    }

    public void tq(vy vyVar) {
        List<vy> list = this.f32569ji;
        if (list != null) {
            list.remove(vyVar);
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f32561bs;
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ok.sd$sd, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class C0302sd extends ViewGroup.LayoutParams {

        /* JADX INFO: renamed from: hu, reason: collision with root package name */
        int f32583hu;

        /* JADX INFO: renamed from: hv, reason: collision with root package name */
        int f32584hv;
        public boolean hww;

        /* JADX INFO: renamed from: sd, reason: collision with root package name */
        float f32585sd;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        public int f32586tq;
        boolean vy;

        public C0302sd() {
            super(-1, -1);
            this.f32585sd = 0.0f;
        }

        public C0302sd(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f32585sd = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sd.f32559tq);
            this.f32586tq = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private static boolean sd(View view) {
        return view.getClass().getAnnotation(hww.class) != null;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0302sd(getContext(), attributeSet);
    }

    public void tq() {
        int iHww = this.f32579sd.hww();
        this.hww = iHww;
        boolean z10 = this.vgm.size() < (this.zvy * 2) + 1 && this.vgm.size() < iHww;
        int iMax = this.vy;
        int i10 = 0;
        while (i10 < this.vgm.size()) {
            tq tqVar = this.vgm.get(i10);
            int iHww2 = this.f32579sd.hww(tqVar.hww);
            if (iHww2 != -1) {
                if (iHww2 == -2) {
                    this.vgm.remove(i10);
                    i10--;
                    this.f32579sd.hww((ViewGroup) this, tqVar.f32589tq, tqVar.hww);
                    int i11 = this.vy;
                    if (i11 == tqVar.f32589tq) {
                        iMax = Math.max(0, Math.min(i11, iHww - 1));
                    }
                } else {
                    int i12 = tqVar.f32589tq;
                    if (i12 != iHww2) {
                        if (i12 == this.vy) {
                            iMax = iHww2;
                        }
                        tqVar.f32589tq = iHww2;
                    }
                }
                z10 = true;
            }
            i10++;
        }
        Collections.sort(this.vgm, f32558hv);
        if (z10) {
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                C0302sd c0302sd = (C0302sd) getChildAt(i13).getLayoutParams();
                if (!c0302sd.hww) {
                    c0302sd.f32585sd = 0.0f;
                }
            }
            hww(iMax, false, true);
            requestLayout();
        }
    }

    private void sd(boolean z10) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    public void setPageMarginDrawable(int i10) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i10));
    }

    private void hu(int i10) {
        vy vyVar = this.f32566ep;
        if (vyVar != null) {
            vyVar.ny(i10);
        }
        List<vy> list = this.f32569ji;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                vy vyVar2 = this.f32569ji.get(i11);
                if (vyVar2 != null) {
                    vyVar2.ny(i10);
                }
            }
        }
        vy vyVar3 = this.wyi;
        if (vyVar3 != null) {
            vyVar3.ny(i10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b9  */
    public boolean sd(int i10) {
        boolean zVy;
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
            break;
        }
        if (viewFindFocus != null) {
            ViewParent parent = viewFindFocus.getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(viewFindFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        sb2.append(" => ");
                        sb2.append(parent2.getClass().getSimpleName());
                    }
                    Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + sb2.toString());
                    viewFindFocus = null;
                    break;
                }
                if (parent == this) {
                    break;
                }
                parent = parent.getParent();
            }
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i10);
        if (viewFindNextFocus == null || viewFindNextFocus == viewFindFocus) {
            if (i10 == 17 || i10 == 1) {
                zVy = vy();
            } else if (i10 == 66 || i10 == 2) {
                zVy = hv();
            } else {
                zVy = false;
            }
        } else if (i10 == 17) {
            int i11 = hww(this.f32578rs, viewFindNextFocus).left;
            int i12 = hww(this.f32578rs, viewFindFocus).left;
            if (viewFindFocus != null && i11 >= i12) {
                zVy = vy();
            } else {
                zVy = viewFindNextFocus.requestFocus();
            }
        } else if (i10 == 66) {
            int i13 = hww(this.f32578rs, viewFindNextFocus).left;
            int i14 = hww(this.f32578rs, viewFindFocus).left;
            if (viewFindFocus == null || i13 > i14) {
                zVy = viewFindNextFocus.requestFocus();
            } else {
                zVy = hv();
            }
        } else {
            zVy = false;
        }
        if (zVy) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i10));
        }
        return zVy;
    }

    public boolean hv() {
        com.bytedance.adsdk.ugeno.ok.tq tqVar = this.f32579sd;
        if (tqVar == null || this.vy >= tqVar.hww() - 1) {
            return false;
        }
        hww(this.vy + 1, true);
        return true;
    }

    public void hww(int i10, boolean z10) {
        this.aed = false;
        hww(i10, z10, false);
    }

    public boolean vy() {
        int i10 = this.vy;
        if (i10 <= 0) {
            return false;
        }
        hww(i10 - 1, true);
        return true;
    }

    public void hww(int i10, boolean z10, boolean z11) {
        hww(i10, z10, z11, 0);
    }

    public void hww(int i10, boolean z10, boolean z11, int i11) {
        com.bytedance.adsdk.ugeno.ok.tq tqVar = this.f32579sd;
        if (tqVar != null && tqVar.hww() > 0) {
            if (!z11 && this.vy == i10 && this.vgm.size() != 0) {
                setScrollingCacheEnabled(false);
                return;
            }
            if (i10 < 0) {
                i10 = 0;
            } else if (i10 >= this.f32579sd.hww()) {
                i10 = this.f32579sd.hww() - 1;
            }
            int i12 = this.zvy;
            int i13 = this.vy;
            if (i10 > i13 + i12 || i10 < i13 - i12) {
                for (int i14 = 0; i14 < this.vgm.size(); i14++) {
                    this.vgm.get(i14).f32588sd = true;
                }
            }
            boolean z12 = this.vy != i10;
            if (this.xas) {
                this.vy = i10;
                if (z12) {
                    hv(i10);
                }
                requestLayout();
                return;
            }
            hww(i10);
            hww(i10, z10, i11, z12);
            return;
        }
        setScrollingCacheEnabled(false);
    }

    public tq tq(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent != this) {
                if (parent == null || !(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } else {
                return hww(view);
            }
        }
    }

    public tq tq(int i10) {
        for (int i11 = 0; i11 < this.vgm.size(); i11++) {
            tq tqVar = this.vgm.get(i11);
            if (tqVar.f32589tq == i10) {
                return tqVar;
            }
        }
        return null;
    }

    private void tq(int i10, float f10, int i11) {
        vy vyVar = this.f32566ep;
        if (vyVar != null) {
            vyVar.hww(i10, f10, i11);
        }
        List<vy> list = this.f32569ji;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                vy vyVar2 = this.f32569ji.get(i12);
                if (vyVar2 != null) {
                    vyVar2.hww(i10, f10, i11);
                }
            }
        }
        vy vyVar3 = this.wyi;
        if (vyVar3 != null) {
            vyVar3.hww(i10, f10, i11);
        }
    }

    private void hww(int i10, boolean z10, int i11, boolean z11) {
        tq tqVarTq = tq(i10);
        int clientWidth = tqVarTq != null ? (int) (getClientWidth() * Math.max(this.omn, Math.min(tqVarTq.f32587hv, this.hnv))) : 0;
        if (z10) {
            hww(clientWidth, 0, i11);
            if (z11) {
                hv(i10);
                return;
            }
            return;
        }
        if (z11) {
            hv(i10);
        }
        hww(false);
        scrollTo(clientWidth, 0);
        vy(clientWidth);
    }

    private void tq(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).setLayerType(z10 ? this.f32570jk : 0, null);
        }
    }

    private boolean tq(float f10) {
        boolean z10;
        boolean z11;
        float f11 = this.f32581yt - f10;
        this.f32581yt = f10;
        float scrollX = getScrollX() + f11;
        float clientWidth = getClientWidth();
        float f12 = this.omn * clientWidth;
        float f13 = this.hnv * clientWidth;
        boolean z12 = false;
        tq tqVar = this.vgm.get(0);
        ArrayList<tq> arrayList = this.vgm;
        tq tqVar2 = arrayList.get(arrayList.size() - 1);
        if (tqVar.f32589tq != 0) {
            f12 = tqVar.f32587hv * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (tqVar2.f32589tq != this.f32579sd.hww() - 1) {
            f13 = tqVar2.f32587hv * clientWidth;
            z11 = false;
        } else {
            z11 = true;
        }
        if (scrollX < f12) {
            if (z10) {
                this.ytm.onPull(Math.abs(f12 - scrollX) / clientWidth);
                z12 = true;
            }
            scrollX = f12;
        } else if (scrollX > f13) {
            if (z11) {
                this.f32567et.onPull(Math.abs(scrollX - f13) / clientWidth);
                z12 = true;
            }
            scrollX = f13;
        }
        int i10 = (int) scrollX;
        this.f32581yt += scrollX - i10;
        scrollTo(i10, getScrollY());
        vy(i10);
        return z12;
    }

    public void hww(vy vyVar) {
        if (this.f32569ji == null) {
            this.f32569ji = new ArrayList();
        }
        this.f32569ji.add(vyVar);
    }

    public void hww(boolean z10, hv hvVar) {
        hww(z10, hvVar, 2);
    }

    public void hww(boolean z10, hv hvVar, int i10) {
        boolean z11 = hvVar != null;
        boolean z12 = z11 != (this.f32560bq != null);
        this.f32560bq = hvVar;
        setChildrenDrawingOrderEnabled(z11);
        if (z11) {
            this.wal = z10 ? 2 : 1;
            this.f32570jk = i10;
        } else {
            this.wal = 0;
        }
        if (z12) {
            sd();
        }
    }

    public float hww(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    public void hww(int i10, int i11, int i12) {
        int scrollX;
        int iAbs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f32565ed;
        if (scroller != null && !scroller.isFinished()) {
            scrollX = this.khx ? this.f32565ed.getCurrX() : this.f32565ed.getStartX();
            this.f32565ed.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i13 = scrollX;
        int scrollY = getScrollY();
        int i14 = i10 - i13;
        int i15 = i11 - scrollY;
        if (i14 == 0 && i15 == 0) {
            hww(false);
            sd();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i16 = clientWidth / 2;
        float f10 = clientWidth;
        float f11 = i16;
        float fHww = f11 + (hww(Math.min(1.0f, (Math.abs(i14) * 1.0f) / f10)) * f11);
        int iAbs2 = Math.abs(i12);
        if (iAbs2 > 0) {
            iAbs = Math.round(Math.abs(fHww / iAbs2) * 1000.0f) * 4;
        } else {
            iAbs = (int) (((Math.abs(i14) / ((f10 * this.f32579sd.hww(this.vy)) + this.wgt)) + 1.0f) * 100.0f);
        }
        int iMin = Math.min(iAbs, 600);
        this.khx = false;
        this.f32565ed.startScroll(i13, scrollY, i14, i15, iMin);
        postInvalidateOnAnimation();
    }

    public tq hww(int i10, int i11) {
        tq tqVar = new tq();
        tqVar.f32589tq = i10;
        tqVar.hww = this.f32579sd.hww((ViewGroup) this, i10);
        tqVar.vy = this.f32579sd.hww(i10);
        if (i11 >= 0 && i11 < this.vgm.size()) {
            this.vgm.add(i11, tqVar);
            return tqVar;
        }
        this.vgm.add(tqVar);
        return tqVar;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00c6 A[PHI: r7 r10 r15
      0x00c6: PHI (r7v6 int) = (r7v5 int), (r7v4 int), (r7v9 int) binds: [B:63:0x00ea, B:60:0x00d4, B:52:0x00bb] A[DONT_GENERATE, DONT_INLINE]
      0x00c6: PHI (r10v9 int) = (r10v1 int), (r10v8 int), (r10v12 int) binds: [B:63:0x00ea, B:60:0x00d4, B:52:0x00bb] A[DONT_GENERATE, DONT_INLINE]
      0x00c6: PHI (r15v7 float) = (r15v5 float), (r15v6 float), (r15v4 float) binds: [B:63:0x00ea, B:60:0x00d4, B:52:0x00bb] A[DONT_GENERATE, DONT_INLINE]] */
    public void hww(int i10) {
        tq tqVarTq;
        String hexString;
        tq tqVarHww;
        tq tqVarHww2;
        tq tqVar;
        int i11 = this.vy;
        if (i11 != i10) {
            tqVarTq = tq(i11);
            this.vy = i10;
        } else {
            tqVarTq = null;
        }
        if (this.f32579sd == null) {
            vgm();
            return;
        }
        if (this.aed) {
            vgm();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        int i12 = this.zvy;
        int iMax = Math.max(0, this.vy - i12);
        int iHww = this.f32579sd.hww();
        int iMin = Math.min(iHww - 1, this.vy + i12);
        if (iHww == this.hww) {
            int i13 = 0;
            while (true) {
                if (i13 < this.vgm.size()) {
                    tqVarHww = this.vgm.get(i13);
                    int i14 = tqVarHww.f32589tq;
                    int i15 = this.vy;
                    if (i14 >= i15) {
                        if (i14 != i15) {
                            break;
                        } else {
                            break;
                        }
                    }
                    i13++;
                }
                tqVarHww = null;
                break;
            }
            if (tqVarHww == null && iHww > 0) {
                tqVarHww = hww(this.vy, i13);
            }
            if (tqVarHww != null) {
                int i16 = i13 - 1;
                tq tqVar2 = i16 >= 0 ? this.vgm.get(i16) : null;
                int clientWidth = getClientWidth();
                float paddingLeft = clientWidth <= 0 ? 0.0f : (2.0f - tqVarHww.vy) + (getPaddingLeft() / clientWidth);
                float f10 = 0.0f;
                for (int i17 = this.vy - 1; i17 >= 0; i17--) {
                    if (f10 >= paddingLeft && i17 < iMax) {
                        if (tqVar2 == null) {
                            break;
                        }
                        if (i17 == tqVar2.f32589tq && !tqVar2.f32588sd) {
                            this.vgm.remove(i16);
                            this.f32579sd.hww((ViewGroup) this, i17, tqVar2.hww);
                            i16--;
                            i13--;
                            if (i16 >= 0) {
                                tqVar = this.vgm.get(i16);
                            } else {
                                tqVar = null;
                            }
                            tqVar2 = tqVar;
                        }
                    } else {
                        if (tqVar2 != null && i17 == tqVar2.f32589tq) {
                            f10 += tqVar2.vy;
                            i16--;
                            if (i16 >= 0) {
                                tqVar = this.vgm.get(i16);
                            } else {
                                tqVar = null;
                            }
                        } else {
                            f10 += hww(i17, i16 + 1).vy;
                            i13++;
                            if (i16 >= 0) {
                                tqVar = this.vgm.get(i16);
                            } else {
                                tqVar = null;
                            }
                        }
                        tqVar2 = tqVar;
                    }
                }
                float f11 = tqVarHww.vy;
                int i18 = i13 + 1;
                if (f11 < 2.0f) {
                    tq tqVar3 = i18 < this.vgm.size() ? this.vgm.get(i18) : null;
                    float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                    int i19 = this.vy;
                    while (true) {
                        i19++;
                        if (i19 >= iHww) {
                            break;
                        }
                        if (f11 >= paddingRight && i19 > iMin) {
                            if (tqVar3 == null) {
                                break;
                            }
                            if (i19 == tqVar3.f32589tq && !tqVar3.f32588sd) {
                                this.vgm.remove(i18);
                                this.f32579sd.hww((ViewGroup) this, i19, tqVar3.hww);
                                if (i18 < this.vgm.size()) {
                                    tqVar3 = this.vgm.get(i18);
                                }
                            }
                        } else if (tqVar3 != null && i19 == tqVar3.f32589tq) {
                            f11 += tqVar3.vy;
                            i18++;
                            if (i18 < this.vgm.size()) {
                                tqVar3 = this.vgm.get(i18);
                            }
                        } else {
                            tq tqVarHww3 = hww(i19, i18);
                            i18++;
                            f11 += tqVarHww3.vy;
                            tqVar3 = i18 < this.vgm.size() ? this.vgm.get(i18) : null;
                        }
                    }
                }
                hww(tqVarHww, i13, tqVarTq);
            }
            int childCount = getChildCount();
            for (int i20 = 0; i20 < childCount; i20++) {
                View childAt = getChildAt(i20);
                C0302sd c0302sd = (C0302sd) childAt.getLayoutParams();
                c0302sd.f32583hu = i20;
                if (!c0302sd.hww && c0302sd.f32585sd == 0.0f && (tqVarHww2 = hww(childAt)) != null) {
                    c0302sd.f32585sd = tqVarHww2.vy;
                    c0302sd.f32584hv = tqVarHww2.f32589tq;
                }
            }
            vgm();
            if (hasFocus()) {
                View viewFindFocus = findFocus();
                tq tqVarTq2 = viewFindFocus != null ? tq(viewFindFocus) : null;
                if (tqVarTq2 == null || tqVarTq2.f32589tq != this.vy) {
                    for (int i21 = 0; i21 < getChildCount(); i21++) {
                        View childAt2 = getChildAt(i21);
                        tq tqVarHww4 = hww(childAt2);
                        if (tqVarHww4 != null && tqVarHww4.f32589tq == this.vy && childAt2.requestFocus(2)) {
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        try {
            hexString = getResources().getResourceName(getId());
        } catch (Resources.NotFoundException unused) {
            hexString = Integer.toHexString(getId());
        }
        throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.hww + ", found: " + iHww + " Pager id: " + hexString + " Pager class: " + getClass() + " Problematic adapter: " + this.f32579sd.getClass());
    }

    private void hww(tq tqVar, int i10, tq tqVar2) {
        int i11;
        int i12;
        tq tqVar3;
        tq tqVar4;
        int iHww = this.f32579sd.hww();
        int clientWidth = getClientWidth();
        float f10 = clientWidth > 0 ? this.wgt / clientWidth : 0.0f;
        if (tqVar2 != null) {
            int i13 = tqVar2.f32589tq;
            int i14 = tqVar.f32589tq;
            if (i13 < i14) {
                float fHww = tqVar2.f32587hv + tqVar2.vy + f10;
                int i15 = i13 + 1;
                int i16 = 0;
                while (i15 <= tqVar.f32589tq && i16 < this.vgm.size()) {
                    tq tqVar5 = this.vgm.get(i16);
                    while (true) {
                        tqVar4 = tqVar5;
                        if (i15 <= tqVar4.f32589tq || i16 >= this.vgm.size() - 1) {
                            break;
                        }
                        i16++;
                        tqVar5 = this.vgm.get(i16);
                    }
                    while (i15 < tqVar4.f32589tq) {
                        fHww += this.f32579sd.hww(i15) + f10;
                        i15++;
                    }
                    tqVar4.f32587hv = fHww;
                    fHww += tqVar4.vy + f10;
                    i15++;
                }
            } else if (i13 > i14) {
                int size = this.vgm.size() - 1;
                float fHww2 = tqVar2.f32587hv;
                while (true) {
                    i13--;
                    if (i13 < tqVar.f32589tq || size < 0) {
                        break;
                    }
                    tq tqVar6 = this.vgm.get(size);
                    while (true) {
                        tqVar3 = tqVar6;
                        if (i13 >= tqVar3.f32589tq || size <= 0) {
                            break;
                        }
                        size--;
                        tqVar6 = this.vgm.get(size);
                    }
                    while (i13 > tqVar3.f32589tq) {
                        fHww2 -= this.f32579sd.hww(i13) + f10;
                        i13--;
                    }
                    fHww2 -= tqVar3.vy + f10;
                    tqVar3.f32587hv = fHww2;
                }
            }
        }
        int size2 = this.vgm.size();
        float fHww3 = tqVar.f32587hv;
        int i17 = tqVar.f32589tq;
        int i18 = i17 - 1;
        this.omn = i17 == 0 ? fHww3 : -3.4028235E38f;
        int i19 = iHww - 1;
        this.hnv = i17 == i19 ? (tqVar.vy + fHww3) - 1.0f : Float.MAX_VALUE;
        int i20 = i10 - 1;
        while (i20 >= 0) {
            tq tqVar7 = this.vgm.get(i20);
            while (true) {
                i12 = tqVar7.f32589tq;
                if (i18 <= i12) {
                    break;
                }
                fHww3 -= this.f32579sd.hww(i18) + f10;
                i18--;
            }
            fHww3 -= tqVar7.vy + f10;
            tqVar7.f32587hv = fHww3;
            if (i12 == 0) {
                this.omn = fHww3;
            }
            i20--;
            i18--;
        }
        float fHww4 = tqVar.f32587hv + tqVar.vy + f10;
        int i21 = tqVar.f32589tq + 1;
        int i22 = i10 + 1;
        while (i22 < size2) {
            tq tqVar8 = this.vgm.get(i22);
            while (true) {
                i11 = tqVar8.f32589tq;
                if (i21 >= i11) {
                    break;
                }
                fHww4 += this.f32579sd.hww(i21) + f10;
                i21++;
            }
            if (i11 == i19) {
                this.hnv = (tqVar8.vy + fHww4) - 1.0f;
            }
            tqVar8.f32587hv = fHww4;
            fHww4 += tqVar8.vy + f10;
            i22++;
            i21++;
        }
        this.f32572mg = false;
    }

    public tq hww(View view) {
        for (int i10 = 0; i10 < this.vgm.size(); i10++) {
            tq tqVar = this.vgm.get(i10);
            if (this.f32579sd.hww(view, tqVar.hww)) {
                return tqVar;
            }
        }
        return null;
    }

    private void hww(int i10, int i11, int i12, int i13) {
        if (i11 > 0 && !this.vgm.isEmpty()) {
            if (!this.f32565ed.isFinished()) {
                this.f32565ed.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i11 - getPaddingLeft()) - getPaddingRight()) + i13)) * (((i10 - getPaddingLeft()) - getPaddingRight()) + i12)), getScrollY());
                return;
            }
        }
        tq tqVarTq = tq(this.vy);
        int iMin = (int) ((tqVarTq != null ? Math.min(tqVarTq.f32587hv, this.hnv) : 0.0f) * ((i10 - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            hww(false);
            scrollTo(iMin, getScrollY());
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0064  */
    public void hww(int i10, float f10, int i11) {
        int iMax;
        int width;
        int left;
        if (this.f32580xe > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = getWidth();
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                C0302sd c0302sd = (C0302sd) childAt.getLayoutParams();
                if (c0302sd.hww) {
                    int i13 = c0302sd.f32586tq & 7;
                    if (i13 == 1) {
                        iMax = Math.max((width2 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    } else {
                        if (i13 == 3) {
                            width = childAt.getWidth() + paddingLeft;
                        } else if (i13 != 5) {
                            width = paddingLeft;
                        } else {
                            iMax = (width2 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = width;
                    }
                    int i14 = iMax;
                    width = paddingLeft;
                    paddingLeft = i14;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                    paddingLeft = width;
                }
            }
        }
        tq(i10, f10, i11);
        if (this.f32560bq != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i15 = 0; i15 < childCount2; i15++) {
                View childAt2 = getChildAt(i15);
                if (!((C0302sd) childAt2.getLayoutParams()).hww) {
                    this.f32560bq.hww(childAt2, (childAt2.getLeft() - scrollX2) / getClientWidth());
                }
            }
        }
        this.fxi = true;
    }

    private void hww(boolean z10) {
        boolean z11 = this.ece == 2;
        if (z11) {
            setScrollingCacheEnabled(false);
            if (!this.f32565ed.isFinished()) {
                this.f32565ed.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f32565ed.getCurrX();
                int currY = this.f32565ed.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        vy(currX);
                    }
                }
            }
        }
        this.aed = false;
        for (int i10 = 0; i10 < this.vgm.size(); i10++) {
            tq tqVar = this.vgm.get(i10);
            if (tqVar.f32588sd) {
                tqVar.f32588sd = false;
                z11 = true;
            }
        }
        if (z11) {
            if (z10) {
                postOnAnimation(this.nuc);
            } else {
                this.nuc.run();
            }
        }
    }

    private boolean hww(float f10, float f11) {
        if (f10 >= this.oxu || f11 <= 0.0f) {
            return f10 > ((float) (getWidth() - this.oxu)) && f11 < 0.0f;
        }
        return true;
    }

    private int hww(int i10, float f10, int i11, int i12) {
        if (Math.abs(i12) <= this.f32563cj || Math.abs(i11) <= this.f32576qm) {
            i10 += (int) (f10 + (i10 >= this.vy ? 0.4f : 0.6f));
        } else if (i11 <= 0) {
            i10++;
        }
        if (this.vgm.size() <= 0) {
            return i10;
        }
        tq tqVar = this.vgm.get(0);
        ArrayList<tq> arrayList = this.vgm;
        return Math.max(tqVar.f32589tq, Math.min(i10, arrayList.get(arrayList.size() - 1).f32589tq));
    }

    private void hww(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.wdz) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f32581yt = motionEvent.getX(i10);
            this.wdz = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.gvr;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean hww(View view, boolean z10, int i10, int i11, int i12) {
        int i13;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i14 = i11 + scrollX;
                if (i14 >= childAt.getLeft() && i14 < childAt.getRight() && (i13 = i12 + scrollY) >= childAt.getTop() && i13 < childAt.getBottom() && hww(childAt, true, i10, i14 - childAt.getLeft(), i13 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z10 && view.canScrollHorizontally(-i10);
    }

    public boolean hww(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 21) {
            if (keyEvent.hasModifiers(2)) {
                return vy();
            }
            return sd(17);
        }
        if (keyCode == 22) {
            if (keyEvent.hasModifiers(2)) {
                return hv();
            }
            return sd(66);
        }
        if (keyCode != 61) {
            return false;
        }
        if (keyEvent.hasNoModifiers()) {
            return sd(2);
        }
        if (keyEvent.hasModifiers(1)) {
            return sd(1);
        }
        return false;
    }

    private Rect hww(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }
}
