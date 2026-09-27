package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import f2.z1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_DRAW_CONSTRAINTS = false;
    public static final int DESIGN_INFO_ID = 0;
    private static final boolean OPTIMIZE_HEIGHT_CHANGE = false;
    private static final String TAG = "ConstraintLayout";
    private static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final String VERSION = "ConstraintLayout-2.2.0-alpha04";
    private static n sSharedValues;
    SparseArray<View> mChildrenByIds;
    private ArrayList<androidx.constraintlayout.widget.c> mConstraintHelpers;
    protected androidx.constraintlayout.widget.d mConstraintLayoutSpec;
    private g mConstraintSet;
    private int mConstraintSetId;
    private HashMap<String, Integer> mDesignIds;
    protected boolean mDirtyHierarchy;
    private int mLastMeasureHeight;
    int mLastMeasureHeightMode;
    int mLastMeasureHeightSize;
    private int mLastMeasureWidth;
    int mLastMeasureWidthMode;
    int mLastMeasureWidthSize;
    protected s0.f mLayoutWidget;
    private int mMaxHeight;
    private int mMaxWidth;
    c mMeasurer;
    private i0.f mMetrics;
    private int mMinHeight;
    private int mMinWidth;
    private ArrayList<d> mModifiers;
    private int mOnMeasureHeightMeasureSpec;
    private int mOnMeasureWidthMeasureSpec;
    private int mOptimizationLevel;
    private SparseArray<s0.e> mTempMapIdToWidget;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7782a;

        static {
            int[] iArr = new int[s0.e.b.values().length];
            f7782a = iArr;
            try {
                iArr[s0.e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7782a[s0.e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7782a[s0.e.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7782a[s0.e.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class c implements t0.b.InterfaceC1394b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ConstraintLayout f7870a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f7871b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f7872c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f7873d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f7874e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f7875f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f7876g;

        public c(ConstraintLayout constraintLayout) {
            this.f7870a = constraintLayout;
        }

        @Override // t0.b.InterfaceC1394b
        public final void a() {
            int childCount = this.f7870a.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.f7870a.getChildAt(i10);
                if (childAt instanceof k) {
                    ((k) childAt).b(this.f7870a);
                }
            }
            int size = this.f7870a.mConstraintHelpers.size();
            if (size > 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    ((androidx.constraintlayout.widget.c) this.f7870a.mConstraintHelpers.get(i11)).G(this.f7870a);
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:111:0x01cf  */
        /* JADX WARN: Code duplicated, block: B:112:0x01d1  */
        /* JADX WARN: Code duplicated, block: B:114:0x01d4  */
        /* JADX WARN: Code duplicated, block: B:115:0x01d6  */
        /* JADX WARN: Code duplicated, block: B:122:0x01e2  */
        /* JADX WARN: Code duplicated, block: B:128:0x01ec  */
        /* JADX WARN: Code duplicated, block: B:134:0x01f8  */
        /* JADX WARN: Code duplicated, block: B:139:0x0203  */
        /* JADX WARN: Code duplicated, block: B:142:0x0208  */
        /* JADX WARN: Code duplicated, block: B:154:0x022f  */
        /* JADX WARN: Code duplicated, block: B:156:0x0233  */
        /* JADX WARN: Code duplicated, block: B:159:0x0241  */
        /* JADX WARN: Code duplicated, block: B:162:0x0257  */
        /* JADX WARN: Code duplicated, block: B:164:0x025e  */
        /* JADX WARN: Code duplicated, block: B:167:0x0264  */
        /* JADX WARN: Code duplicated, block: B:170:0x026c  */
        /* JADX WARN: Code duplicated, block: B:172:0x0273  */
        /* JADX WARN: Code duplicated, block: B:175:0x0279  */
        /* JADX WARN: Code duplicated, block: B:178:0x028c  */
        /* JADX WARN: Code duplicated, block: B:180:0x0290 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:182:0x0299 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:183:0x029b A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:186:0x02a5 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:189:0x02aa  */
        /* JADX WARN: Code duplicated, block: B:191:0x02ae  */
        /* JADX WARN: Code duplicated, block: B:192:0x02b3  */
        /* JADX WARN: Code duplicated, block: B:194:0x02b7  */
        /* JADX WARN: Code duplicated, block: B:195:0x02bc  */
        /* JADX WARN: Code duplicated, block: B:198:0x02d3  */
        /* JADX WARN: Code duplicated, block: B:199:0x02d5  */
        /* JADX WARN: Code duplicated, block: B:206:0x02e1  */
        /* JADX WARN: Code duplicated, block: B:209:0x02e8  */
        /* JADX WARN: Code duplicated, block: B:218:0x0307  */
        /* JADX WARN: Code duplicated, block: B:220:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:223:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:55:0x00de  */
        /* JADX WARN: Code duplicated, block: B:57:0x00e1  */
        /* JADX WARN: Code duplicated, block: B:59:0x00e4  */
        /* JADX WARN: Code duplicated, block: B:61:0x00e7  */
        /* JADX WARN: Code duplicated, block: B:62:0x00e9  */
        /* JADX WARN: Code duplicated, block: B:64:0x00f4  */
        /* JADX WARN: Code duplicated, block: B:65:0x00f6  */
        /* JADX WARN: Code duplicated, block: B:70:0x0101  */
        /* JADX WARN: Code duplicated, block: B:72:0x010b  */
        /* JADX WARN: Code duplicated, block: B:73:0x010d  */
        /* JADX WARN: Code duplicated, block: B:76:0x0114 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:83:0x0124  */
        /* JADX WARN: Code duplicated, block: B:84:0x012f  */
        /* JADX WARN: Code duplicated, block: B:85:0x013e  */
        /* JADX WARN: Code duplicated, block: B:86:0x0148  */
        @Override // t0.b.InterfaceC1394b
        @SuppressLint({"WrongCall"})
        public final void b(s0.e eVar, t0.b.a aVar) {
            long jNanoTime;
            int iMakeMeasureSpec;
            int childMeasureSpec;
            int i10;
            int iMakeMeasureSpec2;
            s0.f fVar;
            s0.e.b bVar;
            boolean z10;
            boolean z11;
            s0.e.b bVar2;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            b bVar3;
            int i11;
            int measuredWidth;
            int measuredHeight;
            int baseline;
            int i12;
            int measuredWidth2;
            int i13;
            int i14;
            int i15;
            int measuredHeight2;
            int i16;
            int i17;
            int iMakeMeasureSpec3;
            int iMakeMeasureSpec4;
            int i18;
            boolean z16;
            boolean z17;
            boolean z18;
            int i19;
            boolean z19;
            if (eVar == null) {
                return;
            }
            if (eVar.l0() == 8 && !eVar.C0()) {
                aVar.f135875e = 0;
                aVar.f135876f = 0;
                aVar.f135877g = 0;
                return;
            }
            if (eVar.U() == null) {
                return;
            }
            if (ConstraintLayout.this.mMetrics != null) {
                ConstraintLayout.this.mMetrics.N++;
                jNanoTime = System.nanoTime();
            } else {
                jNanoTime = 0;
            }
            s0.e.b bVar4 = aVar.f135871a;
            s0.e.b bVar5 = aVar.f135872b;
            int i20 = aVar.f135873c;
            int i21 = aVar.f135874d;
            int i22 = this.f7871b + this.f7872c;
            int i23 = this.f7873d;
            View view = (View) eVar.w();
            int[] iArr = a.f7782a;
            int i24 = iArr[bVar4.ordinal()];
            if (i24 == 1) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i20, 1073741824);
            } else if (i24 == 2) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f7875f, i23, -2);
            } else {
                if (i24 != 3) {
                    if (i24 != 4) {
                        childMeasureSpec = 0;
                    } else {
                        childMeasureSpec = ViewGroup.getChildMeasureSpec(this.f7875f, i23, -2);
                        boolean z20 = eVar.f128268w == 1;
                        int i25 = aVar.f135880j;
                        if (i25 == t0.b.a.f135869l || i25 == t0.b.a.f135870m) {
                            boolean z21 = view.getMeasuredHeight() == eVar.D();
                            if (aVar.f135880j == t0.b.a.f135870m || !z20 || ((z20 && z21) || (view instanceof k) || eVar.G0())) {
                                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(eVar.m0(), 1073741824);
                            }
                        }
                    }
                    i10 = iArr[bVar5.ordinal()];
                    if (i10 != 1) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i21, 1073741824);
                    } else if (i10 != 2) {
                        iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f7876g, i22, -2);
                    } else if (i10 != 3) {
                        iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f7876g, i22 + eVar.k0(), -1);
                    } else if (i10 != 4) {
                        iMakeMeasureSpec2 = 0;
                    } else {
                        iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f7876g, i22, -2);
                        if (eVar.f128270x == 1) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        i19 = aVar.f135880j;
                        if (i19 != t0.b.a.f135869l || i19 == t0.b.a.f135870m) {
                            if (view.getMeasuredWidth() == eVar.m0()) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            if (aVar.f135880j != t0.b.a.f135870m || !z18 || ((z18 && z19) || (view instanceof k) || eVar.H0())) {
                                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(eVar.D(), 1073741824);
                            }
                        }
                    }
                    fVar = (s0.f) eVar.U();
                    if (fVar == null && s0.k.b(ConstraintLayout.this.mOptimizationLevel, 256) && view.getMeasuredWidth() == eVar.m0() && view.getMeasuredWidth() < fVar.m0() && view.getMeasuredHeight() == eVar.D() && view.getMeasuredHeight() < fVar.D() && view.getBaseline() == eVar.t() && !eVar.F0() && d(eVar.J(), childMeasureSpec, eVar.m0()) && d(eVar.K(), iMakeMeasureSpec2, eVar.D())) {
                        aVar.f135875e = eVar.m0();
                        aVar.f135876f = eVar.D();
                        aVar.f135877g = eVar.t();
                        return;
                    }
                    bVar = s0.e.b.MATCH_CONSTRAINT;
                    if (bVar4 == bVar) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (bVar5 == bVar) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    bVar2 = s0.e.b.MATCH_PARENT;
                    if (bVar5 != bVar2 || bVar5 == s0.e.b.FIXED) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (bVar4 != bVar2 || bVar4 == s0.e.b.FIXED) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z10 || eVar.f128235f0 <= 0.0f) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    if (z11 || eVar.f128235f0 <= 0.0f) {
                        z15 = false;
                    } else {
                        z15 = true;
                    }
                    if (view == null) {
                        return;
                    }
                    bVar3 = (b) view.getLayoutParams();
                    i11 = aVar.f135880j;
                    boolean z22 = z13;
                    if (i11 == t0.b.a.f135869l && i11 != t0.b.a.f135870m && z10 && eVar.f128268w == 0 && z11 && eVar.f128270x == 0) {
                        measuredHeight2 = 0;
                        i18 = -1;
                        baseline = 0;
                        measuredWidth2 = 0;
                    } else {
                        if ((view instanceof p) || !(eVar instanceof s0.n)) {
                            view.measure(childMeasureSpec, iMakeMeasureSpec2);
                        } else {
                            ((p) view).L((s0.n) eVar, childMeasureSpec, iMakeMeasureSpec2);
                        }
                        eVar.K1(childMeasureSpec, iMakeMeasureSpec2);
                        measuredWidth = view.getMeasuredWidth();
                        measuredHeight = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                        i12 = eVar.f128274z;
                        if (i12 > 0) {
                            measuredWidth2 = Math.max(i12, measuredWidth);
                        } else {
                            measuredWidth2 = measuredWidth;
                        }
                        i13 = iMakeMeasureSpec2;
                        i14 = eVar.A;
                        if (i14 > 0) {
                            measuredWidth2 = Math.min(i14, measuredWidth2);
                        }
                        i15 = eVar.C;
                        if (i15 > 0) {
                            measuredHeight2 = Math.max(i15, measuredHeight);
                        } else {
                            measuredHeight2 = measuredHeight;
                        }
                        i16 = childMeasureSpec;
                        i17 = eVar.D;
                        if (i17 > 0) {
                            measuredHeight2 = Math.min(i17, measuredHeight2);
                        }
                        if (!s0.k.b(ConstraintLayout.this.mOptimizationLevel, 1)) {
                            if (!z14 && z12) {
                                measuredWidth2 = (int) ((measuredHeight2 * eVar.f128235f0) + 0.5f);
                            } else if (z15 && z22) {
                                measuredHeight2 = (int) ((measuredWidth2 / eVar.f128235f0) + 0.5f);
                            }
                        }
                        if (measuredWidth == measuredWidth2 || measuredHeight != measuredHeight2) {
                            if (measuredWidth != measuredWidth2) {
                                iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                            } else {
                                iMakeMeasureSpec3 = i16;
                            }
                            if (measuredHeight != measuredHeight2) {
                                iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                            } else {
                                iMakeMeasureSpec4 = i13;
                            }
                            view.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
                            eVar.K1(iMakeMeasureSpec3, iMakeMeasureSpec4);
                            measuredWidth2 = view.getMeasuredWidth();
                            measuredHeight2 = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                        }
                        i18 = -1;
                    }
                    if (baseline != i18) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (measuredWidth2 == aVar.f135873c || measuredHeight2 != aVar.f135874d) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    aVar.f135879i = z17;
                    if (bVar3.f7799g0) {
                        z16 = true;
                    }
                    if (z16 && baseline != -1 && eVar.t() != baseline) {
                        aVar.f135879i = true;
                    }
                    aVar.f135875e = measuredWidth2;
                    aVar.f135876f = measuredHeight2;
                    aVar.f135878h = z16;
                    aVar.f135877g = baseline;
                    if (ConstraintLayout.this.mMetrics != null) {
                        long jNanoTime2 = System.nanoTime();
                        ConstraintLayout.this.mMetrics.f90198a += jNanoTime2 - jNanoTime;
                    }
                }
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f7875f, i23 + eVar.I(), -1);
            }
            childMeasureSpec = iMakeMeasureSpec;
            i10 = iArr[bVar5.ordinal()];
            if (i10 != 1) {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i21, 1073741824);
            } else if (i10 != 2) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f7876g, i22, -2);
            } else if (i10 != 3) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f7876g, i22 + eVar.k0(), -1);
            } else if (i10 != 4) {
                iMakeMeasureSpec2 = 0;
            } else {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f7876g, i22, -2);
                if (eVar.f128270x == 1) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                i19 = aVar.f135880j;
                if (i19 != t0.b.a.f135869l) {
                    if (view.getMeasuredWidth() == eVar.m0()) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    if (aVar.f135880j != t0.b.a.f135870m) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(eVar.D(), 1073741824);
                    } else {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(eVar.D(), 1073741824);
                    }
                } else {
                    if (view.getMeasuredWidth() == eVar.m0()) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    if (aVar.f135880j != t0.b.a.f135870m) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(eVar.D(), 1073741824);
                    } else {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(eVar.D(), 1073741824);
                    }
                }
            }
            fVar = (s0.f) eVar.U();
            if (fVar == null) {
            }
            bVar = s0.e.b.MATCH_CONSTRAINT;
            if (bVar4 == bVar) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (bVar5 == bVar) {
                z11 = true;
            } else {
                z11 = false;
            }
            bVar2 = s0.e.b.MATCH_PARENT;
            if (bVar5 != bVar2) {
                z12 = true;
            } else {
                z12 = true;
            }
            if (bVar4 != bVar2) {
                z13 = true;
            } else {
                z13 = true;
            }
            if (z10) {
                z14 = false;
            } else {
                z14 = false;
            }
            if (z11) {
                z15 = false;
            } else {
                z15 = false;
            }
            if (view == null) {
                return;
            }
            bVar3 = (b) view.getLayoutParams();
            i11 = aVar.f135880j;
            boolean z23 = z13;
            if (i11 == t0.b.a.f135869l) {
                if (view instanceof p) {
                    view.measure(childMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(childMeasureSpec, iMakeMeasureSpec2);
                }
                eVar.K1(childMeasureSpec, iMakeMeasureSpec2);
                measuredWidth = view.getMeasuredWidth();
                measuredHeight = view.getMeasuredHeight();
                baseline = view.getBaseline();
                i12 = eVar.f128274z;
                if (i12 > 0) {
                    measuredWidth2 = Math.max(i12, measuredWidth);
                } else {
                    measuredWidth2 = measuredWidth;
                }
                i13 = iMakeMeasureSpec2;
                i14 = eVar.A;
                if (i14 > 0) {
                    measuredWidth2 = Math.min(i14, measuredWidth2);
                }
                i15 = eVar.C;
                if (i15 > 0) {
                    measuredHeight2 = Math.max(i15, measuredHeight);
                } else {
                    measuredHeight2 = measuredHeight;
                }
                i16 = childMeasureSpec;
                i17 = eVar.D;
                if (i17 > 0) {
                    measuredHeight2 = Math.min(i17, measuredHeight2);
                }
                if (!s0.k.b(ConstraintLayout.this.mOptimizationLevel, 1)) {
                    if (!z14) {
                        if (z15) {
                            measuredHeight2 = (int) ((measuredWidth2 / eVar.f128235f0) + 0.5f);
                        }
                    } else if (z15) {
                        measuredHeight2 = (int) ((measuredWidth2 / eVar.f128235f0) + 0.5f);
                    }
                }
                if (measuredWidth == measuredWidth2) {
                    if (measuredWidth != measuredWidth2) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                    } else {
                        iMakeMeasureSpec3 = i16;
                    }
                    if (measuredHeight != measuredHeight2) {
                        iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                    } else {
                        iMakeMeasureSpec4 = i13;
                    }
                    view.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
                    eVar.K1(iMakeMeasureSpec3, iMakeMeasureSpec4);
                    measuredWidth2 = view.getMeasuredWidth();
                    measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                } else {
                    if (measuredWidth != measuredWidth2) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                    } else {
                        iMakeMeasureSpec3 = i16;
                    }
                    if (measuredHeight != measuredHeight2) {
                        iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                    } else {
                        iMakeMeasureSpec4 = i13;
                    }
                    view.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
                    eVar.K1(iMakeMeasureSpec3, iMakeMeasureSpec4);
                    measuredWidth2 = view.getMeasuredWidth();
                    measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
                i18 = -1;
            } else {
                if (view instanceof p) {
                    view.measure(childMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(childMeasureSpec, iMakeMeasureSpec2);
                }
                eVar.K1(childMeasureSpec, iMakeMeasureSpec2);
                measuredWidth = view.getMeasuredWidth();
                measuredHeight = view.getMeasuredHeight();
                baseline = view.getBaseline();
                i12 = eVar.f128274z;
                if (i12 > 0) {
                    measuredWidth2 = Math.max(i12, measuredWidth);
                } else {
                    measuredWidth2 = measuredWidth;
                }
                i13 = iMakeMeasureSpec2;
                i14 = eVar.A;
                if (i14 > 0) {
                    measuredWidth2 = Math.min(i14, measuredWidth2);
                }
                i15 = eVar.C;
                if (i15 > 0) {
                    measuredHeight2 = Math.max(i15, measuredHeight);
                } else {
                    measuredHeight2 = measuredHeight;
                }
                i16 = childMeasureSpec;
                i17 = eVar.D;
                if (i17 > 0) {
                    measuredHeight2 = Math.min(i17, measuredHeight2);
                }
                if (!s0.k.b(ConstraintLayout.this.mOptimizationLevel, 1)) {
                    if (!z14) {
                        if (z15) {
                            measuredHeight2 = (int) ((measuredWidth2 / eVar.f128235f0) + 0.5f);
                        }
                    } else if (z15) {
                        measuredHeight2 = (int) ((measuredWidth2 / eVar.f128235f0) + 0.5f);
                    }
                }
                if (measuredWidth == measuredWidth2) {
                    if (measuredWidth != measuredWidth2) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                    } else {
                        iMakeMeasureSpec3 = i16;
                    }
                    if (measuredHeight != measuredHeight2) {
                        iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                    } else {
                        iMakeMeasureSpec4 = i13;
                    }
                    view.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
                    eVar.K1(iMakeMeasureSpec3, iMakeMeasureSpec4);
                    measuredWidth2 = view.getMeasuredWidth();
                    measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                } else {
                    if (measuredWidth != measuredWidth2) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                    } else {
                        iMakeMeasureSpec3 = i16;
                    }
                    if (measuredHeight != measuredHeight2) {
                        iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                    } else {
                        iMakeMeasureSpec4 = i13;
                    }
                    view.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
                    eVar.K1(iMakeMeasureSpec3, iMakeMeasureSpec4);
                    measuredWidth2 = view.getMeasuredWidth();
                    measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
                i18 = -1;
            }
            if (baseline != i18) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (measuredWidth2 == aVar.f135873c) {
                z17 = true;
            } else {
                z17 = true;
            }
            aVar.f135879i = z17;
            if (bVar3.f7799g0) {
                z16 = true;
            }
            if (z16) {
                aVar.f135879i = true;
            }
            aVar.f135875e = measuredWidth2;
            aVar.f135876f = measuredHeight2;
            aVar.f135878h = z16;
            aVar.f135877g = baseline;
            if (ConstraintLayout.this.mMetrics != null) {
                long jNanoTime3 = System.nanoTime();
                ConstraintLayout.this.mMetrics.f90198a += jNanoTime3 - jNanoTime;
            }
        }

        public void c(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f7871b = i12;
            this.f7872c = i13;
            this.f7873d = i14;
            this.f7874e = i15;
            this.f7875f = i10;
            this.f7876g = i11;
        }

        public final boolean d(int i10, int i11, int i12) {
            if (i10 == i11) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i12 == size;
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface d {
        boolean a(int i10, int i11, int i12, View view, b bVar);
    }

    public ConstraintLayout(@NonNull Context context) {
        super(context);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new s0.f();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new c(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        h(null, 0, 0);
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int iMax2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static n getSharedValues() {
        if (sSharedValues == null) {
            sSharedValues = new n();
        }
        return sSharedValues;
    }

    public void addValueModifier(d dVar) {
        if (this.mModifiers == null) {
            this.mModifiers = new ArrayList<>();
        }
        this.mModifiers.add(dVar);
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0174  */
    /* JADX WARN: Code duplicated, block: B:78:0x017d  */
    public void applyConstraintsFromLayoutParams(boolean z10, View view, s0.e eVar, b bVar, SparseArray<s0.e> sparseArray) {
        s0.e eVar2;
        s0.e eVar3;
        s0.e eVar4;
        s0.e eVar5;
        b bVar2;
        s0.e eVar6;
        float f10;
        int i10;
        bVar.e();
        bVar.f7831w0 = false;
        eVar.c2(view.getVisibility());
        if (bVar.f7805j0) {
            eVar.I1(true);
            eVar.c2(8);
        }
        eVar.i1(view);
        if (view instanceof androidx.constraintlayout.widget.c) {
            ((androidx.constraintlayout.widget.c) view).D(eVar, this.mLayoutWidget.P2());
        }
        if (bVar.f7801h0) {
            s0.h hVar = (s0.h) eVar;
            int i11 = bVar.f7823s0;
            int i12 = bVar.f7825t0;
            float f11 = bVar.f7827u0;
            if (f11 != -1.0f) {
                hVar.A2(f11);
                return;
            } else if (i11 != -1) {
                hVar.y2(i11);
                return;
            } else {
                if (i12 != -1) {
                    hVar.z2(i12);
                    return;
                }
                return;
            }
        }
        int i13 = bVar.f7809l0;
        int i14 = bVar.f7811m0;
        int i15 = bVar.f7813n0;
        int i16 = bVar.f7815o0;
        int i17 = bVar.f7817p0;
        int i18 = bVar.f7819q0;
        float f12 = bVar.f7821r0;
        int i19 = bVar.f7816p;
        if (i19 != -1) {
            s0.e eVar7 = sparseArray.get(i19);
            if (eVar7 != null) {
                eVar.m(eVar7, bVar.f7820r, bVar.f7818q);
            }
            eVar6 = eVar;
            bVar2 = bVar;
        } else {
            if (i13 != -1) {
                s0.e eVar8 = sparseArray.get(i13);
                if (eVar8 != null) {
                    s0.d.a aVar = s0.d.a.LEFT;
                    eVar.v0(aVar, eVar8, aVar, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i17);
                }
            } else if (i14 != -1 && (eVar2 = sparseArray.get(i14)) != null) {
                eVar.v0(s0.d.a.LEFT, eVar2, s0.d.a.RIGHT, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i17);
            }
            if (i15 != -1) {
                s0.e eVar9 = sparseArray.get(i15);
                if (eVar9 != null) {
                    eVar.v0(s0.d.a.RIGHT, eVar9, s0.d.a.LEFT, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i18);
                }
            } else if (i16 != -1 && (eVar3 = sparseArray.get(i16)) != null) {
                s0.d.a aVar2 = s0.d.a.RIGHT;
                eVar.v0(aVar2, eVar3, aVar2, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i18);
            }
            int i20 = bVar.f7802i;
            if (i20 != -1) {
                s0.e eVar10 = sparseArray.get(i20);
                if (eVar10 != null) {
                    s0.d.a aVar3 = s0.d.a.TOP;
                    eVar.v0(aVar3, eVar10, aVar3, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.f7832x);
                }
            } else {
                int i21 = bVar.f7804j;
                if (i21 != -1 && (eVar4 = sparseArray.get(i21)) != null) {
                    eVar.v0(s0.d.a.TOP, eVar4, s0.d.a.BOTTOM, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.f7832x);
                }
            }
            int i22 = bVar.f7806k;
            if (i22 != -1) {
                s0.e eVar11 = sparseArray.get(i22);
                if (eVar11 != null) {
                    eVar.v0(s0.d.a.BOTTOM, eVar11, s0.d.a.TOP, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.f7834z);
                }
            } else {
                int i23 = bVar.f7808l;
                if (i23 != -1 && (eVar5 = sparseArray.get(i23)) != null) {
                    s0.d.a aVar4 = s0.d.a.BOTTOM;
                    eVar.v0(aVar4, eVar5, aVar4, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.f7834z);
                }
            }
            int i24 = bVar.f7810m;
            if (i24 != -1) {
                bVar2 = bVar;
                n(eVar, bVar2, sparseArray, i24, s0.d.a.BASELINE);
            } else {
                bVar2 = bVar;
                int i25 = bVar2.f7812n;
                if (i25 != -1) {
                    n(eVar, bVar2, sparseArray, i25, s0.d.a.TOP);
                } else {
                    int i26 = bVar2.f7814o;
                    if (i26 != -1) {
                        n(eVar, bVar2, sparseArray, i26, s0.d.a.BOTTOM);
                        eVar6 = eVar;
                    }
                    if (f12 >= 0.0f) {
                        eVar6.B1(f12);
                    }
                    f10 = bVar2.H;
                    if (f10 >= 0.0f) {
                        eVar6.W1(f10);
                    }
                }
            }
            eVar6 = eVar;
            if (f12 >= 0.0f) {
                eVar6.B1(f12);
            }
            f10 = bVar2.H;
            if (f10 >= 0.0f) {
                eVar6.W1(f10);
            }
        }
        if (z10 && ((i10 = bVar2.X) != -1 || bVar2.Y != -1)) {
            eVar6.S1(i10, bVar2.Y);
        }
        if (bVar2.f7795e0) {
            eVar6.E1(s0.e.b.FIXED);
            eVar6.d2(((ViewGroup.MarginLayoutParams) bVar2).width);
            if (((ViewGroup.MarginLayoutParams) bVar2).width == -2) {
                eVar6.E1(s0.e.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) bVar2).width == -1) {
            if (bVar2.f7787a0) {
                eVar6.E1(s0.e.b.MATCH_CONSTRAINT);
            } else {
                eVar6.E1(s0.e.b.MATCH_PARENT);
            }
            eVar6.r(s0.d.a.LEFT).f128185g = ((ViewGroup.MarginLayoutParams) bVar2).leftMargin;
            eVar6.r(s0.d.a.RIGHT).f128185g = ((ViewGroup.MarginLayoutParams) bVar2).rightMargin;
        } else {
            eVar6.E1(s0.e.b.MATCH_CONSTRAINT);
            eVar6.d2(0);
        }
        if (bVar2.f7797f0) {
            eVar6.Z1(s0.e.b.FIXED);
            eVar6.z1(((ViewGroup.MarginLayoutParams) bVar2).height);
            if (((ViewGroup.MarginLayoutParams) bVar2).height == -2) {
                eVar6.Z1(s0.e.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) bVar2).height == -1) {
            if (bVar2.f7789b0) {
                eVar6.Z1(s0.e.b.MATCH_CONSTRAINT);
            } else {
                eVar6.Z1(s0.e.b.MATCH_PARENT);
            }
            eVar6.r(s0.d.a.TOP).f128185g = ((ViewGroup.MarginLayoutParams) bVar2).topMargin;
            eVar6.r(s0.d.a.BOTTOM).f128185g = ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin;
        } else {
            eVar6.Z1(s0.e.b.MATCH_CONSTRAINT);
            eVar6.z1(0);
        }
        eVar6.o1(bVar2.I);
        eVar6.G1(bVar2.L);
        eVar6.b2(bVar2.M);
        eVar6.C1(bVar2.N);
        eVar6.X1(bVar2.O);
        eVar6.f2(bVar2.f7793d0);
        eVar6.F1(bVar2.P, bVar2.R, bVar2.T, bVar2.V);
        eVar6.a2(bVar2.Q, bVar2.S, bVar2.U, bVar2.W);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<androidx.constraintlayout.widget.c> arrayList = this.mConstraintHelpers;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                this.mConstraintHelpers.get(i10).H(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i12 = Integer.parseInt(strArrSplit[0]);
                        int i13 = Integer.parseInt(strArrSplit[1]);
                        int i14 = Integer.parseInt(strArrSplit[2]);
                        int i15 = (int) ((i12 / 1080.0f) * width);
                        int i16 = (int) ((i13 / 1920.0f) * height);
                        int i17 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(p1.a.f120313c);
                        float f10 = i15;
                        float f11 = i16;
                        float f12 = i15 + ((int) ((i14 / 1080.0f) * width));
                        canvas.drawLine(f10, f11, f12, f11, paint);
                        float f13 = i16 + i17;
                        canvas.drawLine(f12, f11, f12, f13, paint);
                        canvas.drawLine(f12, f13, f10, f13, paint);
                        canvas.drawLine(f10, f13, f10, f11, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f10, f11, f12, f13, paint);
                        canvas.drawLine(f10, f13, f12, f11, paint);
                    }
                }
            }
        }
    }

    public boolean dynamicUpdateConstraints(int i10, int i11) {
        boolean zA = false;
        if (this.mModifiers == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        for (d dVar : this.mModifiers) {
            Iterator<s0.e> it = this.mLayoutWidget.m2().iterator();
            while (it.hasNext()) {
                View view = (View) it.next().w();
                zA |= dVar.a(size, size2, view.getId(), view, (b) view.getLayoutParams());
            }
        }
        return zA;
    }

    public void fillMetrics(i0.f fVar) {
        this.mMetrics = fVar;
        this.mLayoutWidget.F2(fVar);
    }

    @Override // android.view.View
    public void forceLayout() {
        i();
        super.forceLayout();
    }

    public final s0.e g(int i10) {
        if (i10 == 0) {
            return this.mLayoutWidget;
        }
        View viewFindViewById = this.mChildrenByIds.get(i10);
        if (viewFindViewById == null && (viewFindViewById = findViewById(i10)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
            onViewAdded(viewFindViewById);
        }
        if (viewFindViewById == this) {
            return this.mLayoutWidget;
        }
        if (viewFindViewById == null) {
            return null;
        }
        return ((b) viewFindViewById.getLayoutParams()).f7829v0;
    }

    public Object getDesignInformation(int i10, Object obj) {
        if (i10 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> map = this.mDesignIds;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.mDesignIds.get(str);
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.I2();
    }

    public String getSceneString() {
        int id2;
        StringBuilder sb2 = new StringBuilder();
        if (this.mLayoutWidget.f128252o == null) {
            int id3 = getId();
            if (id3 != -1) {
                this.mLayoutWidget.f128252o = getContext().getResources().getResourceEntryName(id3);
            } else {
                this.mLayoutWidget.f128252o = g.W1;
            }
        }
        if (this.mLayoutWidget.y() == null) {
            s0.f fVar = this.mLayoutWidget;
            fVar.k1(fVar.f128252o);
            Log.v(TAG, " setDebugName " + this.mLayoutWidget.y());
        }
        for (s0.e eVar : this.mLayoutWidget.m2()) {
            View view = (View) eVar.w();
            if (view != null) {
                if (eVar.f128252o == null && (id2 = view.getId()) != -1) {
                    eVar.f128252o = getContext().getResources().getResourceEntryName(id2);
                }
                if (eVar.y() == null) {
                    eVar.k1(eVar.f128252o);
                    Log.v(TAG, " setDebugName " + eVar.y());
                }
            }
        }
        this.mLayoutWidget.b0(sb2);
        return sb2.toString();
    }

    public View getViewById(int i10) {
        return this.mChildrenByIds.get(i10);
    }

    public final s0.e getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof b) {
            return ((b) view.getLayoutParams()).f7829v0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof b) {
            return ((b) view.getLayoutParams()).f7829v0;
        }
        return null;
    }

    public final void h(AttributeSet attributeSet, int i10, int i11) {
        this.mLayoutWidget.i1(this);
        this.mLayoutWidget.V2(this.mMeasurer);
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, l.c.H1, i10, i11);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i12 = 0; i12 < indexCount; i12++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i12);
                if (index == l.c.Y1) {
                    this.mMinWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMinWidth);
                } else if (index == l.c.Z1) {
                    this.mMinHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMinHeight);
                } else if (index == l.c.W1) {
                    this.mMaxWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxWidth);
                } else if (index == l.c.X1) {
                    this.mMaxHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxHeight);
                } else if (index == l.c.R3) {
                    this.mOptimizationLevel = typedArrayObtainStyledAttributes.getInt(index, this.mOptimizationLevel);
                } else if (index == l.c.M2) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            parseLayoutDescription(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.mConstraintLayoutSpec = null;
                        }
                    }
                } else if (index == l.c.f8743q2) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        g gVar = new g();
                        this.mConstraintSet = gVar;
                        gVar.y0(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.mLayoutWidget.W2(this.mOptimizationLevel);
    }

    public final void i() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
    }

    public boolean isRtl() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    public final void l() {
        boolean zIsInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            s0.e viewWidget = getViewWidget(getChildAt(i10));
            if (viewWidget != null) {
                viewWidget.R0();
            }
        }
        if (zIsInEditMode) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                    int iIndexOf = resourceName.indexOf(47);
                    if (iIndexOf != -1) {
                        resourceName = resourceName.substring(iIndexOf + 1);
                    }
                    g(childAt.getId()).k1(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.mConstraintSetId != -1) {
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt2 = getChildAt(i12);
                if (childAt2.getId() == this.mConstraintSetId && (childAt2 instanceof h)) {
                    this.mConstraintSet = ((h) childAt2).getConstraintSet();
                }
            }
        }
        g gVar = this.mConstraintSet;
        if (gVar != null) {
            gVar.t(this, true);
        }
        this.mLayoutWidget.q2();
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i13 = 0; i13 < size; i13++) {
                this.mConstraintHelpers.get(i13).I(this);
            }
        }
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt3 = getChildAt(i14);
            if (childAt3 instanceof k) {
                ((k) childAt3).c(this);
            }
        }
        this.mTempMapIdToWidget.clear();
        this.mTempMapIdToWidget.put(0, this.mLayoutWidget);
        this.mTempMapIdToWidget.put(getId(), this.mLayoutWidget);
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt4 = getChildAt(i15);
            this.mTempMapIdToWidget.put(childAt4.getId(), getViewWidget(childAt4));
        }
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt5 = getChildAt(i16);
            s0.e viewWidget2 = getViewWidget(childAt5);
            if (viewWidget2 != null) {
                b bVar = (b) childAt5.getLayoutParams();
                this.mLayoutWidget.b(viewWidget2);
                applyConstraintsFromLayoutParams(zIsInEditMode, childAt5, viewWidget2, bVar, this.mTempMapIdToWidget);
            }
        }
    }

    public void loadLayoutDescription(int i10) {
        if (i10 == 0) {
            this.mConstraintLayoutSpec = null;
            return;
        }
        try {
            this.mConstraintLayoutSpec = new androidx.constraintlayout.widget.d(getContext(), this, i10);
        } catch (Resources.NotFoundException unused) {
            this.mConstraintLayoutSpec = null;
        }
    }

    public final void n(s0.e eVar, b bVar, SparseArray<s0.e> sparseArray, int i10, s0.d.a aVar) {
        View view = this.mChildrenByIds.get(i10);
        s0.e eVar2 = sparseArray.get(i10);
        if (eVar2 == null || view == null || !(view.getLayoutParams() instanceof b)) {
            return;
        }
        bVar.f7799g0 = true;
        s0.d.a aVar2 = s0.d.a.BASELINE;
        if (aVar == aVar2) {
            b bVar2 = (b) view.getLayoutParams();
            bVar2.f7799g0 = true;
            bVar2.f7829v0.y1(true);
        }
        eVar.r(aVar2).b(eVar2.r(aVar), bVar.D, bVar.C, true);
        eVar.y1(true);
        eVar.r(s0.d.a.TOP).x();
        eVar.r(s0.d.a.BOTTOM).x();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View content;
        i0.f fVar = this.mMetrics;
        if (fVar != null) {
            fVar.M++;
        }
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            b bVar = (b) childAt.getLayoutParams();
            s0.e eVar = bVar.f7829v0;
            if ((childAt.getVisibility() != 8 || bVar.f7801h0 || bVar.f7803i0 || bVar.f7807k0 || zIsInEditMode) && !bVar.f7805j0) {
                int iO0 = eVar.o0();
                int iP0 = eVar.p0();
                int iM0 = eVar.m0() + iO0;
                int iD = eVar.D() + iP0;
                childAt.layout(iO0, iP0, iM0, iD);
                if ((childAt instanceof k) && (content = ((k) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(iO0, iP0, iM0, iD);
                }
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i15 = 0; i15 < size; i15++) {
                this.mConstraintHelpers.get(i15).F(this);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        long jNanoTime;
        if (this.mMetrics != null) {
            jNanoTime = System.nanoTime();
            this.mMetrics.P = getChildCount();
            this.mMetrics.Q++;
        } else {
            jNanoTime = 0;
        }
        boolean zDynamicUpdateConstraints = this.mDirtyHierarchy | dynamicUpdateConstraints(i10, i11);
        this.mDirtyHierarchy = zDynamicUpdateConstraints;
        if (!zDynamicUpdateConstraints) {
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                if (getChildAt(i12).isLayoutRequested()) {
                    this.mDirtyHierarchy = true;
                    break;
                }
            }
        }
        this.mOnMeasureWidthMeasureSpec = i10;
        this.mOnMeasureHeightMeasureSpec = i11;
        this.mLayoutWidget.Z2(isRtl());
        if (this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            if (p()) {
                this.mLayoutWidget.b3();
            }
        }
        this.mLayoutWidget.F2(this.mMetrics);
        resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, i10, i11);
        resolveMeasuredDimension(i10, i11, this.mLayoutWidget.m0(), this.mLayoutWidget.D(), this.mLayoutWidget.Q2(), this.mLayoutWidget.O2());
        i0.f fVar = this.mMetrics;
        if (fVar != null) {
            fVar.O += System.nanoTime() - jNanoTime;
        }
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        s0.e viewWidget = getViewWidget(view);
        if ((view instanceof Guideline) && !(viewWidget instanceof s0.h)) {
            b bVar = (b) view.getLayoutParams();
            s0.h hVar = new s0.h();
            bVar.f7829v0 = hVar;
            bVar.f7801h0 = true;
            hVar.D2(bVar.Z);
        }
        if (view instanceof androidx.constraintlayout.widget.c) {
            androidx.constraintlayout.widget.c cVar = (androidx.constraintlayout.widget.c) view;
            cVar.K();
            ((b) view.getLayoutParams()).f7803i0 = true;
            if (!this.mConstraintHelpers.contains(cVar)) {
                this.mConstraintHelpers.add(cVar);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.mChildrenByIds.remove(view.getId());
        this.mLayoutWidget.p2(getViewWidget(view));
        this.mConstraintHelpers.remove(view);
        this.mDirtyHierarchy = true;
    }

    public final boolean p() {
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            if (getChildAt(i10).isLayoutRequested()) {
                z10 = true;
                break;
            }
        }
        if (z10) {
            l();
        }
        return z10;
    }

    public void parseLayoutDescription(int i10) {
        this.mConstraintLayoutSpec = new androidx.constraintlayout.widget.d(getContext(), this, i10);
    }

    public void removeValueModifier(d dVar) {
        if (dVar == null) {
            return;
        }
        this.mModifiers.remove(dVar);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        i();
        super.requestLayout();
    }

    public void resolveMeasuredDimension(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        c cVar = this.mMeasurer;
        int i14 = cVar.f7874e;
        int iResolveSizeAndState = View.resolveSizeAndState(i12 + cVar.f7873d, i10, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i13 + i14, i11, 0);
        int i15 = iResolveSizeAndState & z1.f82662x;
        int i16 = iResolveSizeAndState2 & z1.f82662x;
        int iMin = Math.min(this.mMaxWidth, i15);
        int iMin2 = Math.min(this.mMaxHeight, i16);
        if (z10) {
            iMin |= 16777216;
        }
        if (z11) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
        this.mLastMeasureWidth = iMin;
        this.mLastMeasureHeight = iMin2;
    }

    public void resolveSystem(s0.f fVar, int i10, int i11, int i12) {
        int i13;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        int iMax = Math.max(0, getPaddingTop());
        int iMax2 = Math.max(0, getPaddingBottom());
        int i14 = iMax + iMax2;
        int paddingWidth = getPaddingWidth();
        this.mMeasurer.c(i11, i12, iMax, iMax2, paddingWidth, i14);
        int iMax3 = Math.max(0, getPaddingStart());
        int iMax4 = Math.max(0, getPaddingEnd());
        if (iMax3 > 0 || iMax4 > 0) {
            if (isRtl()) {
                i13 = iMax4;
            }
            int i15 = size - paddingWidth;
            int i16 = size2 - i14;
            setSelfDimensionBehaviour(fVar, mode, i15, mode2, i16);
            fVar.R2(i10, mode, i15, mode2, i16, this.mLastMeasureWidth, this.mLastMeasureHeight, i13, iMax);
        }
        iMax3 = Math.max(0, getPaddingLeft());
        i13 = iMax3;
        int i17 = size - paddingWidth;
        int i18 = size2 - i14;
        setSelfDimensionBehaviour(fVar, mode, i17, mode2, i18);
        fVar.R2(i10, mode, i17, mode2, i18, this.mLastMeasureWidth, this.mLastMeasureHeight, i13, iMax);
    }

    public void setConstraintSet(g gVar) {
        this.mConstraintSet = gVar;
    }

    public void setDesignInformation(int i10, Object obj, Object obj2) {
        if (i10 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.mDesignIds == null) {
                this.mDesignIds = new HashMap<>();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf(to.c.userBaseDel);
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            this.mDesignIds.put(strSubstring, (Integer) obj2);
        }
    }

    @Override // android.view.View
    public void setId(int i10) {
        this.mChildrenByIds.remove(getId());
        super.setId(i10);
        this.mChildrenByIds.put(getId(), this);
    }

    public void setMaxHeight(int i10) {
        if (i10 == this.mMaxHeight) {
            return;
        }
        this.mMaxHeight = i10;
        requestLayout();
    }

    public void setMaxWidth(int i10) {
        if (i10 == this.mMaxWidth) {
            return;
        }
        this.mMaxWidth = i10;
        requestLayout();
    }

    public void setMinHeight(int i10) {
        if (i10 == this.mMinHeight) {
            return;
        }
        this.mMinHeight = i10;
        requestLayout();
    }

    public void setMinWidth(int i10) {
        if (i10 == this.mMinWidth) {
            return;
        }
        this.mMinWidth = i10;
        requestLayout();
    }

    public void setOnConstraintsChanged(i iVar) {
        androidx.constraintlayout.widget.d dVar = this.mConstraintLayoutSpec;
        if (dVar != null) {
            dVar.d(iVar);
        }
    }

    public void setOptimizationLevel(int i10) {
        this.mOptimizationLevel = i10;
        this.mLayoutWidget.W2(i10);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003e A[PHI: r2
      0x003e: PHI (r2v4 s0.e$b) = (r2v3 s0.e$b), (r2v0 s0.e$b) binds: [B:21:0x004a, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    public void setSelfDimensionBehaviour(s0.f fVar, int i10, int i11, int i12, int i13) {
        s0.e.b bVar;
        c cVar = this.mMeasurer;
        int i14 = cVar.f7874e;
        int i15 = cVar.f7873d;
        s0.e.b bVar2 = s0.e.b.FIXED;
        int childCount = getChildCount();
        if (i10 == Integer.MIN_VALUE) {
            bVar = s0.e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i11 = Math.max(0, this.mMinWidth);
            }
        } else if (i10 == 0) {
            bVar = s0.e.b.WRAP_CONTENT;
            i11 = childCount == 0 ? Math.max(0, this.mMinWidth) : 0;
        } else if (i10 != 1073741824) {
            bVar = bVar2;
        } else {
            i11 = Math.min(this.mMaxWidth - i15, i11);
            bVar = bVar2;
        }
        if (i12 == Integer.MIN_VALUE) {
            bVar2 = s0.e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i13 = Math.max(0, this.mMinHeight);
            }
        } else if (i12 == 0) {
            bVar2 = s0.e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i13 = Math.max(0, this.mMinHeight);
            } else {
                i13 = 0;
            }
        } else if (i12 != 1073741824) {
            i13 = 0;
        } else {
            i13 = Math.min(this.mMaxHeight - i14, i13);
        }
        if (i11 != fVar.m0() || i13 != fVar.D()) {
            fVar.N2();
        }
        fVar.g2(0);
        fVar.h2(0);
        fVar.N1(this.mMaxWidth - i15);
        fVar.M1(this.mMaxHeight - i14);
        fVar.Q1(0);
        fVar.P1(0);
        fVar.E1(bVar);
        fVar.d2(i11);
        fVar.Z1(bVar2);
        fVar.z1(i13);
        fVar.Q1(this.mMinWidth - i15);
        fVar.P1(this.mMinHeight - i14);
    }

    public void setState(int i10, int i11, int i12) {
        androidx.constraintlayout.widget.d dVar = this.mConstraintLayoutSpec;
        if (dVar != null) {
            dVar.e(i10, i11, i12);
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // android.view.ViewGroup
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public ConstraintLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new s0.f();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new c(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        h(attributeSet, 0, 0);
    }

    public ConstraintLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new s0.f();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new c(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        h(attributeSet, i10, 0);
    }

    @TargetApi(21)
    public ConstraintLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new s0.f();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new c(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        h(attributeSet, i10, i11);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b extends ViewGroup.MarginLayoutParams {
        public static final int A0 = Integer.MIN_VALUE;
        public static final int B0 = 0;
        public static final int C0 = 1;
        public static final int D0 = 1;
        public static final int E0 = 2;
        public static final int F0 = 3;
        public static final int G0 = 4;
        public static final int H0 = 5;
        public static final int I0 = 6;
        public static final int J0 = 7;
        public static final int K0 = 8;
        public static final int L0 = 1;
        public static final int M0 = 0;
        public static final int N0 = 2;
        public static final int O0 = 0;
        public static final int P0 = 1;
        public static final int Q0 = 2;
        public static final int R0 = 0;
        public static final int S0 = 1;
        public static final int T0 = 2;
        public static final int U0 = 3;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public static final int f7783x0 = 0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public static final int f7784y0 = 0;

        /* JADX INFO: renamed from: z0, reason: collision with root package name */
        public static final int f7785z0 = -1;
        public int A;
        public int B;
        public int C;
        public int D;
        public boolean E;
        public boolean F;
        public float G;
        public float H;
        public String I;
        public float J;
        public int K;
        public float L;
        public float M;
        public int N;
        public int O;
        public int P;
        public int Q;
        public int R;
        public int S;
        public int T;
        public int U;
        public float V;
        public float W;
        public int X;
        public int Y;
        public int Z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f7786a;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public boolean f7787a0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f7788b;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        public boolean f7789b0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f7790c;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        public String f7791c0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f7792d;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        public int f7793d0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f7794e;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        public boolean f7795e0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f7796f;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        public boolean f7797f0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f7798g;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        public boolean f7799g0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f7800h;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        public boolean f7801h0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f7802i;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        public boolean f7803i0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f7804j;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        public boolean f7805j0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f7806k;

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        public boolean f7807k0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f7808l;

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        public int f7809l0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f7810m;

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        public int f7811m0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f7812n;

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        public int f7813n0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f7814o;

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        public int f7815o0;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f7816p;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f7817p0;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f7818q;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f7819q0;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public float f7820r;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public float f7821r0;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f7822s;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f7823s0;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f7824t;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f7825t0;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f7826u;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public float f7827u0;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f7828v;

        /* JADX INFO: renamed from: v0, reason: collision with root package name */
        public s0.e f7829v0;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f7830w;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public boolean f7831w0;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f7832x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f7833y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f7834z;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static class a {
            public static final int A = 26;
            public static final int B = 27;
            public static final int C = 28;
            public static final int D = 29;
            public static final int E = 30;
            public static final int F = 31;
            public static final int G = 32;
            public static final int H = 33;
            public static final int I = 34;
            public static final int J = 35;
            public static final int K = 36;
            public static final int L = 37;
            public static final int M = 38;
            public static final int N = 39;
            public static final int O = 40;
            public static final int P = 41;
            public static final int Q = 42;
            public static final int R = 43;
            public static final int S = 44;
            public static final int T = 45;
            public static final int U = 46;
            public static final int V = 47;
            public static final int W = 48;
            public static final int X = 49;
            public static final int Y = 50;
            public static final int Z = 51;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int f7835a = 0;

            /* JADX INFO: renamed from: a0, reason: collision with root package name */
            public static final int f7836a0 = 52;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f7837b = 1;

            /* JADX INFO: renamed from: b0, reason: collision with root package name */
            public static final int f7838b0 = 53;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f7839c = 2;

            /* JADX INFO: renamed from: c0, reason: collision with root package name */
            public static final int f7840c0 = 54;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f7841d = 3;

            /* JADX INFO: renamed from: d0, reason: collision with root package name */
            public static final int f7842d0 = 55;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f7843e = 4;

            /* JADX INFO: renamed from: e0, reason: collision with root package name */
            public static final int f7844e0 = 64;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final int f7845f = 5;

            /* JADX INFO: renamed from: f0, reason: collision with root package name */
            public static final int f7846f0 = 65;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final int f7847g = 6;

            /* JADX INFO: renamed from: g0, reason: collision with root package name */
            public static final int f7848g0 = 66;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static final int f7849h = 7;

            /* JADX INFO: renamed from: h0, reason: collision with root package name */
            public static final int f7850h0 = 67;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public static final int f7851i = 8;

            /* JADX INFO: renamed from: i0, reason: collision with root package name */
            public static final SparseIntArray f7852i0;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public static final int f7853j = 9;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public static final int f7854k = 10;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public static final int f7855l = 11;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public static final int f7856m = 12;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final int f7857n = 13;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public static final int f7858o = 14;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public static final int f7859p = 15;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public static final int f7860q = 16;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public static final int f7861r = 17;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public static final int f7862s = 18;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public static final int f7863t = 19;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public static final int f7864u = 20;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public static final int f7865v = 21;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public static final int f7866w = 22;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public static final int f7867x = 23;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            public static final int f7868y = 24;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            public static final int f7869z = 25;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f7852i0 = sparseIntArray;
                sparseIntArray.append(l.c.C3, 64);
                sparseIntArray.append(l.c.f8558f3, 65);
                sparseIntArray.append(l.c.f8710o3, 8);
                sparseIntArray.append(l.c.f8727p3, 9);
                sparseIntArray.append(l.c.f8761r3, 10);
                sparseIntArray.append(l.c.f8778s3, 11);
                sparseIntArray.append(l.c.f8880y3, 12);
                sparseIntArray.append(l.c.f8863x3, 13);
                sparseIntArray.append(l.c.V2, 14);
                sparseIntArray.append(l.c.U2, 15);
                sparseIntArray.append(l.c.Q2, 16);
                sparseIntArray.append(l.c.S2, 52);
                sparseIntArray.append(l.c.R2, 53);
                sparseIntArray.append(l.c.W2, 2);
                sparseIntArray.append(l.c.Y2, 3);
                sparseIntArray.append(l.c.X2, 4);
                sparseIntArray.append(l.c.H3, 49);
                sparseIntArray.append(l.c.I3, 50);
                sparseIntArray.append(l.c.f8507c3, 5);
                sparseIntArray.append(l.c.f8524d3, 6);
                sparseIntArray.append(l.c.f8541e3, 7);
                sparseIntArray.append(l.c.L2, 67);
                sparseIntArray.append(l.c.I1, 1);
                sparseIntArray.append(l.c.f8795t3, 17);
                sparseIntArray.append(l.c.f8812u3, 18);
                sparseIntArray.append(l.c.f8490b3, 19);
                sparseIntArray.append(l.c.f8473a3, 20);
                sparseIntArray.append(l.c.M3, 21);
                sparseIntArray.append(l.c.P3, 22);
                sparseIntArray.append(l.c.N3, 23);
                sparseIntArray.append(l.c.K3, 24);
                sparseIntArray.append(l.c.O3, 25);
                sparseIntArray.append(l.c.L3, 26);
                sparseIntArray.append(l.c.J3, 55);
                sparseIntArray.append(l.c.Q3, 54);
                sparseIntArray.append(l.c.f8642k3, 29);
                sparseIntArray.append(l.c.f8897z3, 30);
                sparseIntArray.append(l.c.Z2, 44);
                sparseIntArray.append(l.c.f8676m3, 45);
                sparseIntArray.append(l.c.B3, 46);
                sparseIntArray.append(l.c.f8659l3, 47);
                sparseIntArray.append(l.c.A3, 48);
                sparseIntArray.append(l.c.O2, 27);
                sparseIntArray.append(l.c.N2, 28);
                sparseIntArray.append(l.c.D3, 31);
                sparseIntArray.append(l.c.f8575g3, 32);
                sparseIntArray.append(l.c.F3, 33);
                sparseIntArray.append(l.c.E3, 34);
                sparseIntArray.append(l.c.G3, 35);
                sparseIntArray.append(l.c.f8609i3, 36);
                sparseIntArray.append(l.c.f8592h3, 37);
                sparseIntArray.append(l.c.f8625j3, 38);
                sparseIntArray.append(l.c.f8693n3, 39);
                sparseIntArray.append(l.c.f8846w3, 40);
                sparseIntArray.append(l.c.f8744q3, 41);
                sparseIntArray.append(l.c.T2, 42);
                sparseIntArray.append(l.c.P2, 43);
                sparseIntArray.append(l.c.f8829v3, 51);
                sparseIntArray.append(l.c.S3, 66);
            }
        }

        @SuppressLint({"ClassVerificationFailure"})
        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f7786a = -1;
            this.f7788b = -1;
            this.f7790c = -1.0f;
            this.f7792d = true;
            this.f7794e = -1;
            this.f7796f = -1;
            this.f7798g = -1;
            this.f7800h = -1;
            this.f7802i = -1;
            this.f7804j = -1;
            this.f7806k = -1;
            this.f7808l = -1;
            this.f7810m = -1;
            this.f7812n = -1;
            this.f7814o = -1;
            this.f7816p = -1;
            this.f7818q = 0;
            this.f7820r = 0.0f;
            this.f7822s = -1;
            this.f7824t = -1;
            this.f7826u = -1;
            this.f7828v = -1;
            this.f7830w = Integer.MIN_VALUE;
            this.f7832x = Integer.MIN_VALUE;
            this.f7833y = Integer.MIN_VALUE;
            this.f7834z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = 0.0f;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.f7787a0 = false;
            this.f7789b0 = false;
            this.f7791c0 = null;
            this.f7793d0 = 0;
            this.f7795e0 = true;
            this.f7797f0 = true;
            this.f7799g0 = false;
            this.f7801h0 = false;
            this.f7803i0 = false;
            this.f7805j0 = false;
            this.f7807k0 = false;
            this.f7809l0 = -1;
            this.f7811m0 = -1;
            this.f7813n0 = -1;
            this.f7815o0 = -1;
            this.f7817p0 = Integer.MIN_VALUE;
            this.f7819q0 = Integer.MIN_VALUE;
            this.f7821r0 = 0.5f;
            this.f7829v0 = new s0.e();
            this.f7831w0 = false;
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
                ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
                ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
                ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
                setMarginStart(marginLayoutParams.getMarginStart());
                setMarginEnd(marginLayoutParams.getMarginEnd());
            }
            if (layoutParams instanceof b) {
                b bVar = (b) layoutParams;
                this.f7786a = bVar.f7786a;
                this.f7788b = bVar.f7788b;
                this.f7790c = bVar.f7790c;
                this.f7792d = bVar.f7792d;
                this.f7794e = bVar.f7794e;
                this.f7796f = bVar.f7796f;
                this.f7798g = bVar.f7798g;
                this.f7800h = bVar.f7800h;
                this.f7802i = bVar.f7802i;
                this.f7804j = bVar.f7804j;
                this.f7806k = bVar.f7806k;
                this.f7808l = bVar.f7808l;
                this.f7810m = bVar.f7810m;
                this.f7812n = bVar.f7812n;
                this.f7814o = bVar.f7814o;
                this.f7816p = bVar.f7816p;
                this.f7818q = bVar.f7818q;
                this.f7820r = bVar.f7820r;
                this.f7822s = bVar.f7822s;
                this.f7824t = bVar.f7824t;
                this.f7826u = bVar.f7826u;
                this.f7828v = bVar.f7828v;
                this.f7830w = bVar.f7830w;
                this.f7832x = bVar.f7832x;
                this.f7833y = bVar.f7833y;
                this.f7834z = bVar.f7834z;
                this.A = bVar.A;
                this.B = bVar.B;
                this.C = bVar.C;
                this.D = bVar.D;
                this.G = bVar.G;
                this.H = bVar.H;
                this.I = bVar.I;
                this.J = bVar.J;
                this.K = bVar.K;
                this.L = bVar.L;
                this.M = bVar.M;
                this.N = bVar.N;
                this.O = bVar.O;
                this.f7787a0 = bVar.f7787a0;
                this.f7789b0 = bVar.f7789b0;
                this.P = bVar.P;
                this.Q = bVar.Q;
                this.R = bVar.R;
                this.T = bVar.T;
                this.S = bVar.S;
                this.U = bVar.U;
                this.V = bVar.V;
                this.W = bVar.W;
                this.X = bVar.X;
                this.Y = bVar.Y;
                this.Z = bVar.Z;
                this.f7795e0 = bVar.f7795e0;
                this.f7797f0 = bVar.f7797f0;
                this.f7799g0 = bVar.f7799g0;
                this.f7801h0 = bVar.f7801h0;
                this.f7809l0 = bVar.f7809l0;
                this.f7811m0 = bVar.f7811m0;
                this.f7813n0 = bVar.f7813n0;
                this.f7815o0 = bVar.f7815o0;
                this.f7817p0 = bVar.f7817p0;
                this.f7819q0 = bVar.f7819q0;
                this.f7821r0 = bVar.f7821r0;
                this.f7791c0 = bVar.f7791c0;
                this.f7793d0 = bVar.f7793d0;
                this.f7829v0 = bVar.f7829v0;
                this.E = bVar.E;
                this.F = bVar.F;
            }
        }

        public String a() {
            return this.f7791c0;
        }

        public s0.e b() {
            return this.f7829v0;
        }

        public void c() {
            s0.e eVar = this.f7829v0;
            if (eVar != null) {
                eVar.R0();
            }
        }

        public void d(String str) {
            this.f7829v0.k1(str);
        }

        public void e() {
            this.f7801h0 = false;
            this.f7795e0 = true;
            this.f7797f0 = true;
            int i10 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i10 == -2 && this.f7787a0) {
                this.f7795e0 = false;
                if (this.P == 0) {
                    this.P = 1;
                }
            }
            int i11 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i11 == -2 && this.f7789b0) {
                this.f7797f0 = false;
                if (this.Q == 0) {
                    this.Q = 1;
                }
            }
            if (i10 == 0 || i10 == -1) {
                this.f7795e0 = false;
                if (i10 == 0 && this.P == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f7787a0 = true;
                }
            }
            if (i11 == 0 || i11 == -1) {
                this.f7797f0 = false;
                if (i11 == 0 && this.Q == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f7789b0 = true;
                }
            }
            if (this.f7790c == -1.0f && this.f7786a == -1 && this.f7788b == -1) {
                return;
            }
            this.f7801h0 = true;
            this.f7795e0 = true;
            this.f7797f0 = true;
            if (!(this.f7829v0 instanceof s0.h)) {
                this.f7829v0 = new s0.h();
            }
            ((s0.h) this.f7829v0).D2(this.Z);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x004a  */
        /* JADX WARN: Code duplicated, block: B:20:0x0051  */
        /* JADX WARN: Code duplicated, block: B:23:0x0058  */
        /* JADX WARN: Code duplicated, block: B:26:0x005e  */
        /* JADX WARN: Code duplicated, block: B:29:0x0064  */
        /* JADX WARN: Code duplicated, block: B:38:0x007a  */
        /* JADX WARN: Code duplicated, block: B:39:0x0082 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:40:0x0084  */
        /* JADX WARN: Code duplicated, block: B:41:0x008b A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:42:0x008d  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        public void resolveLayoutDirection(int i10) {
            int i11;
            int i12;
            int i13;
            int i14;
            int i15 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
            int i16 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
            super.resolveLayoutDirection(i10);
            boolean z10 = false;
            boolean z11 = 1 == getLayoutDirection();
            this.f7813n0 = -1;
            this.f7815o0 = -1;
            this.f7809l0 = -1;
            this.f7811m0 = -1;
            this.f7817p0 = this.f7830w;
            this.f7819q0 = this.f7833y;
            float f10 = this.G;
            this.f7821r0 = f10;
            int i17 = this.f7786a;
            this.f7823s0 = i17;
            int i18 = this.f7788b;
            this.f7825t0 = i18;
            float f11 = this.f7790c;
            this.f7827u0 = f11;
            if (z11) {
                int i19 = this.f7822s;
                if (i19 != -1) {
                    this.f7813n0 = i19;
                } else {
                    int i20 = this.f7824t;
                    if (i20 != -1) {
                        this.f7815o0 = i20;
                    } else {
                        i11 = this.f7826u;
                        if (i11 != -1) {
                            this.f7811m0 = i11;
                            z10 = true;
                        }
                        i12 = this.f7828v;
                        if (i12 != -1) {
                            this.f7809l0 = i12;
                            z10 = true;
                        }
                        i13 = this.A;
                        if (i13 != Integer.MIN_VALUE) {
                            this.f7819q0 = i13;
                        }
                        i14 = this.B;
                        if (i14 != Integer.MIN_VALUE) {
                            this.f7817p0 = i14;
                        }
                        if (z10) {
                            this.f7821r0 = 1.0f - f10;
                        }
                        if (this.f7801h0 && this.Z == 1 && this.f7792d) {
                            if (f11 != -1.0f) {
                                this.f7827u0 = 1.0f - f11;
                                this.f7823s0 = -1;
                                this.f7825t0 = -1;
                            } else if (i17 != -1) {
                                this.f7825t0 = i17;
                                this.f7823s0 = -1;
                                this.f7827u0 = -1.0f;
                            } else if (i18 != -1) {
                                this.f7823s0 = i18;
                                this.f7825t0 = -1;
                                this.f7827u0 = -1.0f;
                            }
                        }
                    }
                }
                z10 = true;
                i11 = this.f7826u;
                if (i11 != -1) {
                    this.f7811m0 = i11;
                    z10 = true;
                }
                i12 = this.f7828v;
                if (i12 != -1) {
                    this.f7809l0 = i12;
                    z10 = true;
                }
                i13 = this.A;
                if (i13 != Integer.MIN_VALUE) {
                    this.f7819q0 = i13;
                }
                i14 = this.B;
                if (i14 != Integer.MIN_VALUE) {
                    this.f7817p0 = i14;
                }
                if (z10) {
                    this.f7821r0 = 1.0f - f10;
                }
                if (this.f7801h0) {
                    if (f11 != -1.0f) {
                        this.f7827u0 = 1.0f - f11;
                        this.f7823s0 = -1;
                        this.f7825t0 = -1;
                    } else if (i17 != -1) {
                        this.f7825t0 = i17;
                        this.f7823s0 = -1;
                        this.f7827u0 = -1.0f;
                    } else if (i18 != -1) {
                        this.f7823s0 = i18;
                        this.f7825t0 = -1;
                        this.f7827u0 = -1.0f;
                    }
                }
            } else {
                int i21 = this.f7822s;
                if (i21 != -1) {
                    this.f7811m0 = i21;
                }
                int i22 = this.f7824t;
                if (i22 != -1) {
                    this.f7809l0 = i22;
                }
                int i23 = this.f7826u;
                if (i23 != -1) {
                    this.f7813n0 = i23;
                }
                int i24 = this.f7828v;
                if (i24 != -1) {
                    this.f7815o0 = i24;
                }
                int i25 = this.A;
                if (i25 != Integer.MIN_VALUE) {
                    this.f7817p0 = i25;
                }
                int i26 = this.B;
                if (i26 != Integer.MIN_VALUE) {
                    this.f7819q0 = i26;
                }
            }
            if (this.f7826u == -1 && this.f7828v == -1 && this.f7824t == -1 && this.f7822s == -1) {
                int i27 = this.f7798g;
                if (i27 != -1) {
                    this.f7813n0 = i27;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i16 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i16;
                    }
                } else {
                    int i28 = this.f7800h;
                    if (i28 != -1) {
                        this.f7815o0 = i28;
                        if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i16 > 0) {
                            ((ViewGroup.MarginLayoutParams) this).rightMargin = i16;
                        }
                    }
                }
                int i29 = this.f7794e;
                if (i29 != -1) {
                    this.f7809l0 = i29;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i15 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i15;
                    return;
                }
                int i30 = this.f7796f;
                if (i30 != -1) {
                    this.f7811m0 = i30;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i15 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i15;
                }
            }
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f7786a = -1;
            this.f7788b = -1;
            this.f7790c = -1.0f;
            this.f7792d = true;
            this.f7794e = -1;
            this.f7796f = -1;
            this.f7798g = -1;
            this.f7800h = -1;
            this.f7802i = -1;
            this.f7804j = -1;
            this.f7806k = -1;
            this.f7808l = -1;
            this.f7810m = -1;
            this.f7812n = -1;
            this.f7814o = -1;
            this.f7816p = -1;
            this.f7818q = 0;
            this.f7820r = 0.0f;
            this.f7822s = -1;
            this.f7824t = -1;
            this.f7826u = -1;
            this.f7828v = -1;
            this.f7830w = Integer.MIN_VALUE;
            this.f7832x = Integer.MIN_VALUE;
            this.f7833y = Integer.MIN_VALUE;
            this.f7834z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = 0.0f;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.f7787a0 = false;
            this.f7789b0 = false;
            this.f7791c0 = null;
            this.f7793d0 = 0;
            this.f7795e0 = true;
            this.f7797f0 = true;
            this.f7799g0 = false;
            this.f7801h0 = false;
            this.f7803i0 = false;
            this.f7805j0 = false;
            this.f7807k0 = false;
            this.f7809l0 = -1;
            this.f7811m0 = -1;
            this.f7813n0 = -1;
            this.f7815o0 = -1;
            this.f7817p0 = Integer.MIN_VALUE;
            this.f7819q0 = Integer.MIN_VALUE;
            this.f7821r0 = 0.5f;
            this.f7829v0 = new s0.e();
            this.f7831w0 = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.c.H1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                int i11 = a.f7852i0.get(index);
                switch (i11) {
                    case 1:
                        this.Z = typedArrayObtainStyledAttributes.getInt(index, this.Z);
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f7816p);
                        this.f7816p = resourceId;
                        if (resourceId == -1) {
                            this.f7816p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 3:
                        this.f7818q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7818q);
                        break;
                    case 4:
                        float f10 = typedArrayObtainStyledAttributes.getFloat(index, this.f7820r) % 360.0f;
                        this.f7820r = f10;
                        if (f10 < 0.0f) {
                            this.f7820r = (360.0f - f10) % 360.0f;
                        }
                        break;
                    case 5:
                        this.f7786a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f7786a);
                        break;
                    case 6:
                        this.f7788b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f7788b);
                        break;
                    case 7:
                        this.f7790c = typedArrayObtainStyledAttributes.getFloat(index, this.f7790c);
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f7794e);
                        this.f7794e = resourceId2;
                        if (resourceId2 == -1) {
                            this.f7794e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f7796f);
                        this.f7796f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f7796f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f7798g);
                        this.f7798g = resourceId4;
                        if (resourceId4 == -1) {
                            this.f7798g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.f7800h);
                        this.f7800h = resourceId5;
                        if (resourceId5 == -1) {
                            this.f7800h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f7802i);
                        this.f7802i = resourceId6;
                        if (resourceId6 == -1) {
                            this.f7802i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f7804j);
                        this.f7804j = resourceId7;
                        if (resourceId7 == -1) {
                            this.f7804j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.f7806k);
                        this.f7806k = resourceId8;
                        if (resourceId8 == -1) {
                            this.f7806k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.f7808l);
                        this.f7808l = resourceId9;
                        if (resourceId9 == -1) {
                            this.f7808l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.f7810m);
                        this.f7810m = resourceId10;
                        if (resourceId10 == -1) {
                            this.f7810m = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.f7822s);
                        this.f7822s = resourceId11;
                        if (resourceId11 == -1) {
                            this.f7822s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.f7824t);
                        this.f7824t = resourceId12;
                        if (resourceId12 == -1) {
                            this.f7824t = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.f7826u);
                        this.f7826u = resourceId13;
                        if (resourceId13 == -1) {
                            this.f7826u = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.f7828v);
                        this.f7828v = resourceId14;
                        if (resourceId14 == -1) {
                            this.f7828v = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 21:
                        this.f7830w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7830w);
                        break;
                    case 22:
                        this.f7832x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7832x);
                        break;
                    case 23:
                        this.f7833y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7833y);
                        break;
                    case 24:
                        this.f7834z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7834z);
                        break;
                    case 25:
                        this.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.A);
                        break;
                    case 26:
                        this.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.B);
                        break;
                    case 27:
                        this.f7787a0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f7787a0);
                        break;
                    case 28:
                        this.f7789b0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f7789b0);
                        break;
                    case 29:
                        this.G = typedArrayObtainStyledAttributes.getFloat(index, this.G);
                        break;
                    case 30:
                        this.H = typedArrayObtainStyledAttributes.getFloat(index, this.H);
                        break;
                    case 31:
                        int i12 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.P = i12;
                        if (i12 == 1) {
                            Log.e(ConstraintLayout.TAG, "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        }
                        break;
                    case 32:
                        int i13 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.Q = i13;
                        if (i13 == 1) {
                            Log.e(ConstraintLayout.TAG, "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        }
                        break;
                    case 33:
                        try {
                            this.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.R) == -2) {
                                this.R = -2;
                            }
                        }
                        break;
                    case 34:
                        try {
                            this.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.T);
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.T) == -2) {
                                this.T = -2;
                            }
                        }
                        break;
                    case 35:
                        this.V = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.V));
                        this.P = 2;
                        break;
                    case 36:
                        try {
                            this.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.S);
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.S) == -2) {
                                this.S = -2;
                            }
                        }
                        break;
                    case 37:
                        try {
                            this.U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.U);
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.U) == -2) {
                                this.U = -2;
                            }
                        }
                        break;
                    case 38:
                        this.W = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.W));
                        this.Q = 2;
                        break;
                    default:
                        switch (i11) {
                            case 44:
                                g.F0(this, typedArrayObtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.L = typedArrayObtainStyledAttributes.getFloat(index, this.L);
                                break;
                            case 46:
                                this.M = typedArrayObtainStyledAttributes.getFloat(index, this.M);
                                break;
                            case 47:
                                this.N = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.O = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.X = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.X);
                                break;
                            case 50:
                                this.Y = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.Y);
                                break;
                            case 51:
                                this.f7791c0 = typedArrayObtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, this.f7812n);
                                this.f7812n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.f7812n = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 53:
                                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, this.f7814o);
                                this.f7814o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.f7814o = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 54:
                                this.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.D);
                                break;
                            case 55:
                                this.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                break;
                            default:
                                switch (i11) {
                                    case 64:
                                        g.D0(this, typedArrayObtainStyledAttributes, index, 0);
                                        this.E = true;
                                        break;
                                    case 65:
                                        g.D0(this, typedArrayObtainStyledAttributes, index, 1);
                                        this.F = true;
                                        break;
                                    case 66:
                                        this.f7793d0 = typedArrayObtainStyledAttributes.getInt(index, this.f7793d0);
                                        break;
                                    case 67:
                                        this.f7792d = typedArrayObtainStyledAttributes.getBoolean(index, this.f7792d);
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            e();
        }

        public b(int i10, int i11) {
            super(i10, i11);
            this.f7786a = -1;
            this.f7788b = -1;
            this.f7790c = -1.0f;
            this.f7792d = true;
            this.f7794e = -1;
            this.f7796f = -1;
            this.f7798g = -1;
            this.f7800h = -1;
            this.f7802i = -1;
            this.f7804j = -1;
            this.f7806k = -1;
            this.f7808l = -1;
            this.f7810m = -1;
            this.f7812n = -1;
            this.f7814o = -1;
            this.f7816p = -1;
            this.f7818q = 0;
            this.f7820r = 0.0f;
            this.f7822s = -1;
            this.f7824t = -1;
            this.f7826u = -1;
            this.f7828v = -1;
            this.f7830w = Integer.MIN_VALUE;
            this.f7832x = Integer.MIN_VALUE;
            this.f7833y = Integer.MIN_VALUE;
            this.f7834z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = 0.0f;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.f7787a0 = false;
            this.f7789b0 = false;
            this.f7791c0 = null;
            this.f7793d0 = 0;
            this.f7795e0 = true;
            this.f7797f0 = true;
            this.f7799g0 = false;
            this.f7801h0 = false;
            this.f7803i0 = false;
            this.f7805j0 = false;
            this.f7807k0 = false;
            this.f7809l0 = -1;
            this.f7811m0 = -1;
            this.f7813n0 = -1;
            this.f7815o0 = -1;
            this.f7817p0 = Integer.MIN_VALUE;
            this.f7819q0 = Integer.MIN_VALUE;
            this.f7821r0 = 0.5f;
            this.f7829v0 = new s0.e();
            this.f7831w0 = false;
        }
    }
}
