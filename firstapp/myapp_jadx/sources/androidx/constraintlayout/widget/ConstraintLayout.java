package androidx.constraintlayout.widget;

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
import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.Reader;
import com.google.protobuf.RuntimeVersion;
import com.sporty.android.core.model.patron.KYCBannerItem;
import defpackage.ewa;
import defpackage.g2z;
import defpackage.ixa;
import defpackage.jxa;
import defpackage.mxa;
import defpackage.n92;
import defpackage.ofs;
import defpackage.owa;
import defpackage.qal;
import defpackage.rfi0;
import defpackage.wk30;
import defpackage.yil;
import java.util.ArrayList;
import java.util.HashMap;
import okhttp3.internal.http.HttpStatusCodesKt;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public static c E;
    public int A;
    public HashMap<String, Integer> B;
    public SparseArray<ixa> C;
    public a D;
    public SparseArray<View> a;
    public ArrayList<ConstraintHelper> b;
    public jxa c;
    public int d;
    public int e;
    public int f;
    public int i;
    public boolean v;
    public int w;
    public b y;
    public owa z;

    public class a implements n92.b {
        public final ConstraintLayout a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;

        public a(ConstraintLayout constraintLayout) {
            this.a = constraintLayout;
        }

        public static boolean c(int i, int i2, int i3) {
            if (i == i2) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
            }
            return false;
        }

        @Override // n92.b
        public final void a() {
            ConstraintLayout constraintLayout = this.a;
            ArrayList<ConstraintHelper> arrayList = constraintLayout.b;
            int childCount = constraintLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = constraintLayout.getChildAt(i);
                if (childAt instanceof Placeholder) {
                    Placeholder placeholder = (Placeholder) childAt;
                    if (placeholder.b != null) {
                        LayoutParams layoutParams = (LayoutParams) placeholder.getLayoutParams();
                        LayoutParams layoutParams2 = (LayoutParams) placeholder.b.getLayoutParams();
                        ixa ixaVar = layoutParams2.q0;
                        ixaVar.j0 = 0;
                        ixa ixaVar2 = layoutParams.q0;
                        ixa.a aVar = ixaVar2.V[0];
                        ixa.a aVar2 = ixa.a.a;
                        if (aVar != aVar2) {
                            ixaVar2.T(ixaVar.s());
                        }
                        ixa ixaVar3 = layoutParams.q0;
                        if (ixaVar3.V[1] != aVar2) {
                            ixaVar3.O(layoutParams2.q0.m());
                        }
                        layoutParams2.q0.j0 = 8;
                    }
                }
            }
            int size = arrayList.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList.get(i2).getClass();
                }
            }
        }

        @Override // n92.b
        public final void b(ixa ixaVar, n92.a aVar) {
            int iMakeMeasureSpec;
            int iMakeMeasureSpec2;
            int iMax;
            int iMax2;
            boolean z;
            int baseline;
            int i;
            if (ixaVar == null) {
                return;
            }
            ewa ewaVar = ixaVar.M;
            ewa ewaVar2 = ixaVar.K;
            if (ixaVar.j0 == 8 && !ixaVar.G) {
                aVar.e = 0;
                aVar.f = 0;
                aVar.g = 0;
                return;
            }
            if (ixaVar.W == null) {
                return;
            }
            ixa.a aVar2 = aVar.a;
            ixa.a aVar3 = aVar.b;
            int i2 = aVar.c;
            int i3 = aVar.d;
            int i4 = this.b + this.c;
            int i5 = this.d;
            View view = (View) ixaVar.i0;
            int iOrdinal = aVar2.ordinal();
            if (iOrdinal == 0) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
            } else if (iOrdinal == 1) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i5, -2);
            } else if (iOrdinal == 2) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i5, -2);
                boolean z2 = ixaVar.s == 1;
                int i6 = aVar.j;
                if (i6 == 1 || i6 == 2) {
                    boolean z3 = view.getMeasuredHeight() == ixaVar.m();
                    if (aVar.j == 2 || !z2 || ((z2 && z3) || (view instanceof Placeholder) || ixaVar.C())) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(ixaVar.s(), 1073741824);
                    }
                }
            } else if (iOrdinal != 3) {
                iMakeMeasureSpec = 0;
            } else {
                int i7 = this.f;
                int i8 = ewaVar2 != null ? ewaVar2.g : 0;
                if (ewaVar != null) {
                    i8 += ewaVar.g;
                }
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i7, i5 + i8, -1);
            }
            int iOrdinal2 = aVar3.ordinal();
            if (iOrdinal2 == 0) {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            } else if (iOrdinal2 == 1) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i4, -2);
            } else if (iOrdinal2 == 2) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i4, -2);
                boolean z4 = ixaVar.t == 1;
                int i9 = aVar.j;
                if (i9 == 1 || i9 == 2) {
                    boolean z5 = view.getMeasuredWidth() == ixaVar.s();
                    if (aVar.j == 2 || !z4 || ((z4 && z5) || (view instanceof Placeholder) || ixaVar.D())) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(ixaVar.m(), 1073741824);
                    }
                }
            } else if (iOrdinal2 != 3) {
                iMakeMeasureSpec2 = 0;
            } else {
                int i10 = this.g;
                int i11 = ewaVar2 != null ? ixaVar.L.g : 0;
                if (ewaVar != null) {
                    i11 += ixaVar.N.g;
                }
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i10, i4 + i11, -1);
            }
            jxa jxaVar = (jxa) ixaVar.W;
            ConstraintLayout constraintLayout = ConstraintLayout.this;
            if (jxaVar != null && g2z.b(constraintLayout.w, 256) && view.getMeasuredWidth() == ixaVar.s() && view.getMeasuredWidth() < jxaVar.s() && view.getMeasuredHeight() == ixaVar.m() && view.getMeasuredHeight() < jxaVar.m() && view.getBaseline() == ixaVar.d0 && !ixaVar.B() && c(ixaVar.I, iMakeMeasureSpec, ixaVar.s()) && c(ixaVar.J, iMakeMeasureSpec2, ixaVar.m())) {
                aVar.e = ixaVar.s();
                aVar.f = ixaVar.m();
                aVar.g = ixaVar.d0;
                return;
            }
            ixa.a aVar4 = ixa.a.c;
            boolean z6 = aVar2 == aVar4;
            boolean z7 = aVar3 == aVar4;
            ixa.a aVar5 = ixa.a.a;
            ixa.a aVar6 = ixa.a.d;
            boolean z8 = aVar3 == aVar6 || aVar3 == aVar5;
            boolean z9 = aVar2 == aVar6 || aVar2 == aVar5;
            boolean z10 = z6 && ixaVar.Z > 0.0f;
            boolean z11 = z7 && ixaVar.Z > 0.0f;
            if (view == null) {
                return;
            }
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int i12 = aVar.j;
            if (i12 != 1 && i12 != 2 && z6 && ixaVar.s == 0 && z7 && ixaVar.t == 0) {
                i = -1;
                z = false;
                baseline = 0;
                iMax = 0;
                iMax2 = 0;
            } else {
                if ((view instanceof VirtualLayout) && (ixaVar instanceof rfi0)) {
                    ((VirtualLayout) view).u((rfi0) ixaVar, iMakeMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                ixaVar.I = iMakeMeasureSpec;
                ixaVar.J = iMakeMeasureSpec2;
                ixaVar.g = false;
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                int baseline2 = view.getBaseline();
                int i13 = ixaVar.v;
                iMax = i13 > 0 ? Math.max(i13, measuredWidth) : measuredWidth;
                int i14 = ixaVar.w;
                if (i14 > 0) {
                    iMax = Math.min(i14, iMax);
                }
                int i15 = ixaVar.y;
                iMax2 = i15 > 0 ? Math.max(i15, measuredHeight) : measuredHeight;
                int i16 = iMakeMeasureSpec2;
                int i17 = ixaVar.z;
                if (i17 > 0) {
                    iMax2 = Math.min(i17, iMax2);
                }
                if (!g2z.b(constraintLayout.w, 1)) {
                    if (z10 && z8) {
                        iMax = (int) ((iMax2 * ixaVar.Z) + 0.5f);
                    } else if (z11 && z9) {
                        iMax2 = (int) ((iMax / ixaVar.Z) + 0.5f);
                    }
                }
                if (measuredWidth == iMax && measuredHeight == iMax2) {
                    baseline = baseline2;
                    i = -1;
                    z = false;
                } else {
                    if (measuredWidth != iMax) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    }
                    int iMakeMeasureSpec3 = measuredHeight != iMax2 ? View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824) : i16;
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
                    ixaVar.I = iMakeMeasureSpec;
                    ixaVar.J = iMakeMeasureSpec3;
                    z = false;
                    ixaVar.g = false;
                    int measuredWidth2 = view.getMeasuredWidth();
                    int measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    iMax = measuredWidth2;
                    iMax2 = measuredHeight2;
                    i = -1;
                }
            }
            boolean z12 = baseline != i ? true : z;
            aVar.i = (iMax == aVar.c && iMax2 == aVar.d) ? z : true;
            boolean z13 = layoutParams.c0 ? true : z12;
            if (z13 && baseline != -1 && ixaVar.d0 != baseline) {
                aVar.i = true;
            }
            aVar.e = iMax;
            aVar.f = iMax2;
            aVar.h = z13;
            aVar.g = baseline;
        }
    }

    public ConstraintLayout(Context context) {
        super(context);
        this.a = new SparseArray<>();
        this.b = new ArrayList<>(4);
        this.c = new jxa();
        this.d = 0;
        this.e = 0;
        this.f = Reader.READ_DONE;
        this.i = Reader.READ_DONE;
        this.v = true;
        this.w = 257;
        this.y = null;
        this.z = null;
        this.A = -1;
        this.B = new HashMap<>();
        this.C = new SparseArray<>();
        this.D = new a(this);
        x(null, 0);
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static c getSharedValues() {
        c cVar = E;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        new SparseIntArray();
        cVar2.a = new HashMap<>();
        E = cVar2;
        return cVar2;
    }

    public final void A(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        a aVar = this.D;
        int i5 = aVar.e;
        int iResolveSizeAndState = View.resolveSizeAndState(i3 + aVar.d, i, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i4 + i5, i2, 0) & 16777215;
        int iMin = Math.min(this.f, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.i, iResolveSizeAndState2);
        if (z) {
            iMin |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        }
        if (z2) {
            iMin2 |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        }
        setMeasuredDimension(iMin, iMin2);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00be  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:44:0x0100  */
    /* JADX WARN: Code duplicated, block: B:45:0x0103  */
    /* JADX WARN: Code duplicated, block: B:48:0x010a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0112  */
    public final void B(jxa jxaVar, int i, int i2, int i3) {
        int iMax;
        ixa.a aVar;
        int iMax2;
        int i4;
        int i5;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int iMax3 = Math.max(0, getPaddingTop());
        int iMax4 = Math.max(0, getPaddingBottom());
        int i6 = iMax3 + iMax4;
        int paddingWidth = getPaddingWidth();
        a aVar2 = this.D;
        aVar2.b = iMax3;
        aVar2.c = iMax4;
        aVar2.d = paddingWidth;
        aVar2.e = i6;
        aVar2.f = i2;
        aVar2.g = i3;
        int iMax5 = Math.max(0, getPaddingStart());
        int iMax6 = Math.max(0, getPaddingEnd());
        if (iMax5 <= 0 && iMax6 <= 0) {
            iMax5 = Math.max(0, getPaddingLeft());
        } else if (y()) {
            iMax5 = iMax6;
        }
        int i7 = size - paddingWidth;
        int i8 = size2 - i6;
        int i9 = aVar2.e;
        int i10 = aVar2.d;
        int childCount = getChildCount();
        ixa.a aVar3 = ixa.a.b;
        ixa.a aVar4 = ixa.a.a;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                iMax = mode != 1073741824 ? 0 : Math.min(this.f - i10, i7);
                aVar = aVar4;
            } else {
                iMax = childCount == 0 ? Math.max(0, this.d) : 0;
            }
            if (mode2 != Integer.MIN_VALUE) {
                if (mode2 != 0) {
                    if (mode2 != 1073741824) {
                        iMax2 = 0;
                    } else {
                        iMax2 = Math.min(this.i - i9, i8);
                    }
                    aVar3 = aVar4;
                } else if (childCount == 0) {
                    iMax2 = Math.max(0, this.e);
                } else {
                    iMax2 = 0;
                }
            } else if (childCount == 0) {
                iMax2 = Math.max(0, this.e);
            } else {
                iMax2 = i8;
            }
            if (iMax == jxaVar.s() || iMax2 != jxaVar.m()) {
                jxaVar.x0.c = true;
            }
            jxaVar.b0 = 0;
            jxaVar.c0 = 0;
            int i11 = this.f - i10;
            int[] iArr = jxaVar.D;
            iArr[0] = i11;
            iArr[1] = this.i - i9;
            jxaVar.e0 = 0;
            jxaVar.f0 = 0;
            jxaVar.P(aVar);
            jxaVar.T(iMax);
            jxaVar.R(aVar3);
            jxaVar.O(iMax2);
            i4 = this.d - i10;
            if (i4 < 0) {
                jxaVar.e0 = 0;
            } else {
                jxaVar.e0 = i4;
            }
            i5 = this.e - i9;
            if (i5 < 0) {
                jxaVar.f0 = 0;
            } else {
                jxaVar.f0 = i5;
            }
            jxaVar.b0(i, mode, i7, mode2, i8, iMax5, iMax3);
        }
        iMax = childCount == 0 ? Math.max(0, this.d) : i7;
        aVar = aVar3;
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 0) {
                if (mode2 != 1073741824) {
                    iMax2 = 0;
                } else {
                    iMax2 = Math.min(this.i - i9, i8);
                }
                aVar3 = aVar4;
            } else if (childCount == 0) {
                iMax2 = Math.max(0, this.e);
            } else {
                iMax2 = 0;
            }
        } else if (childCount == 0) {
            iMax2 = Math.max(0, this.e);
        } else {
            iMax2 = i8;
        }
        if (iMax == jxaVar.s()) {
            jxaVar.x0.c = true;
        } else {
            jxaVar.x0.c = true;
        }
        jxaVar.b0 = 0;
        jxaVar.c0 = 0;
        int i12 = this.f - i10;
        int[] iArr2 = jxaVar.D;
        iArr2[0] = i12;
        iArr2[1] = this.i - i9;
        jxaVar.e0 = 0;
        jxaVar.f0 = 0;
        jxaVar.P(aVar);
        jxaVar.T(iMax);
        jxaVar.R(aVar3);
        jxaVar.O(iMax2);
        i4 = this.d - i10;
        if (i4 < 0) {
            jxaVar.e0 = 0;
        } else {
            jxaVar.e0 = i4;
        }
        i5 = this.e - i9;
        if (i5 < 0) {
            jxaVar.f0 = 0;
        } else {
            jxaVar.f0 = i5;
        }
        jxaVar.b0(i, mode, i7, mode2, i8, iMax5, iMax3);
    }

    public final void D(ixa ixaVar, LayoutParams layoutParams, SparseArray<ixa> sparseArray, int i, ewa.a aVar) {
        View view = this.a.get(i);
        ixa ixaVar2 = sparseArray.get(i);
        if (ixaVar2 == null || view == null || !(view.getLayoutParams() instanceof LayoutParams)) {
            return;
        }
        layoutParams.c0 = true;
        ewa.a aVar2 = ewa.a.e;
        if (aVar == aVar2) {
            LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
            layoutParams2.c0 = true;
            layoutParams2.q0.F = true;
        }
        ixaVar.k(aVar2).b(ixaVar2.k(aVar), layoutParams.D, layoutParams.C, true);
        ixaVar.F = true;
        ixaVar.k(ewa.a.b).j();
        ixaVar.k(ewa.a.d).j();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<ConstraintHelper> arrayList = this.b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                arrayList.get(i).r(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        int i5 = Integer.parseInt(strArrSplit[2]);
                        int i6 = (int) ((i3 / 1080.0f) * width);
                        int i7 = (int) ((i4 / 1920.0f) * height);
                        int i8 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i6;
                        float f2 = i7;
                        float f3 = i6 + ((int) ((i5 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float f4 = i7 + i8;
                        canvas.drawLine(f3, f2, f3, f4, paint);
                        canvas.drawLine(f3, f4, f, f4, paint);
                        canvas.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, f4, paint);
                        canvas.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.v = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public int getMaxHeight() {
        return this.i;
    }

    public int getMaxWidth() {
        return this.f;
    }

    public int getMinHeight() {
        return this.e;
    }

    public int getMinWidth() {
        return this.d;
    }

    public int getOptimizationLevel() {
        return this.c.I0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        jxa jxaVar = this.c;
        if (jxaVar.k == null) {
            int id2 = getId();
            if (id2 != -1) {
                jxaVar.k = getContext().getResources().getResourceEntryName(id2);
            } else {
                jxaVar.k = "parent";
            }
        }
        if (jxaVar.l0 == null) {
            jxaVar.l0 = jxaVar.k;
            Log.v("ConstraintLayout", " setDebugName " + jxaVar.l0);
        }
        ArrayList<ixa> arrayList = jxaVar.v0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            ixa ixaVar = arrayList.get(i);
            i++;
            ixa ixaVar2 = ixaVar;
            View view = (View) ixaVar2.i0;
            if (view != null) {
                if (ixaVar2.k == null && (id = view.getId()) != -1) {
                    ixaVar2.k = getContext().getResources().getResourceEntryName(id);
                }
                if (ixaVar2.l0 == null) {
                    ixaVar2.l0 = ixaVar2.k;
                    Log.v("ConstraintLayout", " setDebugName " + ixaVar2.l0);
                }
            }
        }
        jxaVar.p(sb);
        return sb.toString();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        ArrayList<ConstraintHelper> arrayList = this.b;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            ixa ixaVar = layoutParams.q0;
            if ((childAt.getVisibility() != 8 || layoutParams.d0 || layoutParams.e0 || zIsInEditMode) && !layoutParams.f0) {
                int iT = ixaVar.t();
                int iU = ixaVar.u();
                int iS = ixaVar.s() + iT;
                int iM = ixaVar.m() + iU;
                childAt.layout(iT, iU, iS, iM);
                if ((childAt instanceof Placeholder) && (content = ((Placeholder) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(iT, iU, iS, iM);
                }
            }
        }
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                arrayList.get(i6).q();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01a3  */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        boolean z2;
        String str;
        int iK;
        ixa ixaVar;
        SparseArray<ixa> sparseArray = this.C;
        jxa jxaVar = this.c;
        boolean z3 = this.v;
        this.v = z3;
        int i3 = 0;
        if (!z3) {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                if (getChildAt(i4).isLayoutRequested()) {
                    this.v = true;
                    break;
                }
            }
        }
        jxaVar.A0 = y();
        if (this.v) {
            this.v = false;
            int childCount2 = getChildCount();
            int i5 = 0;
            while (true) {
                if (i5 >= childCount2) {
                    z = false;
                    break;
                } else {
                    if (getChildAt(i5).isLayoutRequested()) {
                        z = true;
                        break;
                    }
                    i5++;
                }
            }
            if (z) {
                ArrayList<ConstraintHelper> arrayList = this.b;
                boolean zIsInEditMode = isInEditMode();
                int childCount3 = getChildCount();
                for (int i6 = 0; i6 < childCount3; i6++) {
                    ixa ixaVarW = w(getChildAt(i6));
                    if (ixaVarW != null) {
                        ixaVarW.E();
                    }
                }
                if (zIsInEditMode) {
                    for (int i7 = 0; i7 < childCount3; i7++) {
                        View childAt = getChildAt(i7);
                        try {
                            String resourceName = getResources().getResourceName(childAt.getId());
                            setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                            int iIndexOf = resourceName.indexOf(47);
                            if (iIndexOf != -1) {
                                resourceName = resourceName.substring(iIndexOf + 1);
                            }
                            int id = childAt.getId();
                            if (id != 0) {
                                View viewFindViewById = this.a.get(id);
                                if (viewFindViewById == null && (viewFindViewById = findViewById(id)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
                                    onViewAdded(viewFindViewById);
                                }
                                ixaVar = viewFindViewById == this ? jxaVar : viewFindViewById == null ? null : ((LayoutParams) viewFindViewById.getLayoutParams()).q0;
                            }
                            ixaVar.l0 = resourceName;
                        } catch (Resources.NotFoundException unused) {
                        }
                    }
                }
                if (this.A != -1) {
                    for (int i8 = 0; i8 < childCount3; i8++) {
                        View childAt2 = getChildAt(i8);
                        if (childAt2.getId() == this.A && (childAt2 instanceof Constraints)) {
                            this.y = ((Constraints) childAt2).getConstraintSet();
                        }
                    }
                }
                b bVar = this.y;
                if (bVar != null) {
                    bVar.c(this);
                }
                jxaVar.v0.clear();
                int size = arrayList.size();
                if (size > 0) {
                    int i9 = 0;
                    while (i9 < size) {
                        ConstraintHelper constraintHelper = arrayList.get(i9);
                        HashMap<Integer, String> map = constraintHelper.w;
                        if (constraintHelper.isInEditMode()) {
                            constraintHelper.setIds(constraintHelper.f);
                        }
                        yil yilVar = constraintHelper.d;
                        if (yilVar != null) {
                            yilVar.Y();
                            for (int i10 = i3; i10 < constraintHelper.b; i10++) {
                                int i11 = constraintHelper.a[i10];
                                View viewV = v(i11);
                                if (viewV == null && (iK = constraintHelper.k(this, (str = map.get(Integer.valueOf(i11))))) != 0) {
                                    constraintHelper.a[i10] = iK;
                                    map.put(Integer.valueOf(iK), str);
                                    viewV = v(iK);
                                }
                                View view = viewV;
                                if (view != null) {
                                    constraintHelper.d.W(w(view));
                                }
                            }
                            constraintHelper.d.Z();
                        }
                        i9++;
                        i3 = 0;
                    }
                }
                for (int i12 = 0; i12 < childCount3; i12++) {
                    View childAt3 = getChildAt(i12);
                    if (childAt3 instanceof Placeholder) {
                        Placeholder placeholder = (Placeholder) childAt3;
                        if (placeholder.a == -1 && !placeholder.isInEditMode()) {
                            placeholder.setVisibility(placeholder.c);
                        }
                        View viewFindViewById2 = findViewById(placeholder.a);
                        placeholder.b = viewFindViewById2;
                        if (viewFindViewById2 != null) {
                            ((LayoutParams) viewFindViewById2.getLayoutParams()).f0 = true;
                            placeholder.b.setVisibility(0);
                            placeholder.setVisibility(0);
                        }
                    }
                }
                int i13 = 0;
                sparseArray.clear();
                sparseArray.put(0, jxaVar);
                sparseArray.put(getId(), jxaVar);
                for (int i14 = 0; i14 < childCount3; i14++) {
                    View childAt4 = getChildAt(i14);
                    sparseArray.put(childAt4.getId(), w(childAt4));
                }
                while (i13 < childCount3) {
                    View childAt5 = getChildAt(i13);
                    ixa ixaVarW2 = w(childAt5);
                    if (ixaVarW2 == null) {
                        z2 = zIsInEditMode;
                    } else {
                        LayoutParams layoutParams = (LayoutParams) childAt5.getLayoutParams();
                        jxaVar.W(ixaVarW2);
                        z2 = zIsInEditMode;
                        u(z2, childAt5, ixaVarW2, layoutParams, sparseArray);
                    }
                    i13++;
                    zIsInEditMode = z2;
                }
            }
            if (z) {
                jxaVar.w0.c(jxaVar);
            }
        }
        jxaVar.B0.getClass();
        B(jxaVar, this.w, i, i2);
        A(i, i2, jxaVar.s(), jxaVar.m(), jxaVar.J0, jxaVar.K0);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        ArrayList<ConstraintHelper> arrayList = this.b;
        super.onViewAdded(view);
        ixa ixaVarW = w(view);
        if ((view instanceof Guideline) && !(ixaVarW instanceof qal)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            qal qalVar = new qal();
            layoutParams.q0 = qalVar;
            layoutParams.d0 = true;
            qalVar.X(layoutParams.V);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.t();
            ((LayoutParams) view.getLayoutParams()).e0 = true;
            if (!arrayList.contains(constraintHelper)) {
                arrayList.add(constraintHelper);
            }
        }
        this.a.put(view.getId(), view);
        this.v = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.a.remove(view.getId());
        ixa ixaVarW = w(view);
        this.c.v0.remove(ixaVarW);
        ixaVarW.E();
        this.b.remove(view);
        this.v = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.v = true;
        super.requestLayout();
    }

    public void setConstraintSet(b bVar) {
        this.y = bVar;
    }

    public void setDesignInformation(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.B == null) {
                this.B = new HashMap<>();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            this.B.put(strSubstring, (Integer) obj2);
        }
    }

    @Override // android.view.View
    public void setId(int i) {
        SparseArray<View> sparseArray = this.a;
        sparseArray.remove(getId());
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.i) {
            return;
        }
        this.i = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f) {
            return;
        }
        this.f = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.e) {
            return;
        }
        this.e = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.d) {
            return;
        }
        this.d = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(mxa mxaVar) {
        owa owaVar = this.z;
        if (owaVar != null) {
            owaVar.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.w = i;
        jxa jxaVar = this.c;
        jxaVar.I0 = i;
        ofs.q = jxaVar.d0(512);
    }

    public void setState(int i, int i2, int i3) {
        owa owaVar = this.z;
        if (owaVar != null) {
            owaVar.b(i, i2, i3);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:54:0x0106  */
    /* JADX WARN: Code duplicated, block: B:56:0x010f  */
    /* JADX WARN: Code duplicated, block: B:57:0x011d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0123  */
    /* JADX WARN: Code duplicated, block: B:66:0x0146  */
    /* JADX WARN: Code duplicated, block: B:68:0x014f  */
    /* JADX WARN: Code duplicated, block: B:71:0x015b  */
    /* JADX WARN: Code duplicated, block: B:73:0x0160  */
    /* JADX WARN: Code duplicated, block: B:78:0x0178  */
    /* JADX WARN: Code duplicated, block: B:80:0x0186  */
    /* JADX WARN: Code duplicated, block: B:82:0x018b  */
    /* JADX WARN: Code duplicated, block: B:83:0x0196  */
    /* JADX WARN: Code duplicated, block: B:85:0x019a  */
    /* JADX WARN: Code duplicated, block: B:88:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:91:0x01b3  */
    public final void u(boolean z, View view, ixa ixaVar, LayoutParams layoutParams, SparseArray<ixa> sparseArray) {
        ConstraintLayout constraintLayout;
        ewa.a aVar;
        ixa ixaVar2;
        ewa.a aVar2;
        ewa.a aVar3;
        ewa.a aVar4;
        ixa ixaVar3;
        ewa.a aVar5;
        int i;
        ewa.a aVar6;
        int i2;
        ixa ixaVar4;
        ewa.a aVar7;
        ewa.a aVar8;
        int i3;
        ewa.a aVar9;
        int i4;
        ixa ixaVar5;
        ewa.a aVar10;
        int i5;
        LayoutParams layoutParams2;
        int i6;
        int i7;
        ixa ixaVar6;
        ewa.a aVar11;
        float f;
        ixa ixaVar7;
        ixa ixaVar8;
        ixa ixaVar9;
        int i8;
        ixa ixaVar10 = ixaVar;
        layoutParams.a();
        ixaVar10.j0 = view.getVisibility();
        if (layoutParams.f0) {
            ixaVar10.G = true;
            ixaVar10.j0 = 8;
        }
        ixaVar10.i0 = view;
        if (view instanceof ConstraintHelper) {
            constraintLayout = this;
            ((ConstraintHelper) view).p(ixaVar10, constraintLayout.c.A0);
        } else {
            constraintLayout = this;
        }
        if (layoutParams.d0) {
            qal qalVar = (qal) ixaVar10;
            int i9 = layoutParams.n0;
            int i10 = layoutParams.o0;
            float f2 = layoutParams.p0;
            if (f2 != -1.0f) {
                if (f2 > -1.0f) {
                    qalVar.v0 = f2;
                    qalVar.w0 = -1;
                    qalVar.x0 = -1;
                    return;
                }
                return;
            }
            if (i9 != -1) {
                if (i9 > -1) {
                    qalVar.v0 = -1.0f;
                    qalVar.w0 = i9;
                    qalVar.x0 = -1;
                    return;
                }
                return;
            }
            if (i10 == -1 || i10 <= -1) {
                return;
            }
            qalVar.v0 = -1.0f;
            qalVar.w0 = -1;
            qalVar.x0 = i10;
            return;
        }
        int i11 = layoutParams.g0;
        int i12 = layoutParams.h0;
        int i13 = layoutParams.i0;
        int i14 = layoutParams.j0;
        int i15 = layoutParams.k0;
        int i16 = layoutParams.l0;
        float f3 = layoutParams.m0;
        int i17 = layoutParams.p;
        ewa.a aVar12 = ewa.a.c;
        ewa.a aVar13 = ewa.a.a;
        ewa.a aVar14 = ewa.a.d;
        ewa.a aVar15 = ewa.a.b;
        if (i17 != -1) {
            ixa ixaVar11 = sparseArray.get(i17);
            if (ixaVar11 != null) {
                float f4 = layoutParams.r;
                int i18 = layoutParams.q;
                ewa.a aVar16 = ewa.a.f;
                ixaVar.x(aVar16, ixaVar11, aVar16, i18, 0);
                ixaVar10 = ixaVar;
                ixaVar10.E = f4;
            }
            ixaVar6 = ixaVar10;
            layoutParams2 = layoutParams;
            aVar5 = aVar12;
            aVar4 = aVar13;
            aVar11 = aVar14;
            aVar9 = aVar15;
        } else {
            if (i11 != -1) {
                ixa ixaVar12 = sparseArray.get(i11);
                if (ixaVar12 != null) {
                    aVar = aVar13;
                    ixaVar10.x(aVar, ixaVar12, aVar13, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i15);
                } else {
                    aVar = aVar13;
                }
            } else {
                aVar = aVar13;
                if (i12 != -1 && (ixaVar2 = sparseArray.get(i12)) != null) {
                    ixaVar.x(aVar, ixaVar2, aVar12, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i15);
                    aVar2 = aVar;
                    aVar3 = aVar12;
                }
                if (i13 != -1) {
                    ixaVar9 = sparseArray.get(i13);
                    if (ixaVar9 != null) {
                        ixaVar.x(aVar3, ixaVar9, aVar2, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i16);
                    }
                    aVar4 = aVar2;
                } else {
                    aVar4 = aVar2;
                    if (i14 != -1 && (ixaVar3 = sparseArray.get(i14)) != null) {
                        ixaVar.x(aVar3, ixaVar3, aVar3, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i16);
                    }
                }
                aVar5 = aVar3;
                i = layoutParams.i;
                if (i != -1) {
                    ixaVar8 = sparseArray.get(i);
                    if (ixaVar8 != null) {
                        aVar6 = aVar15;
                        ixaVar.x(aVar6, ixaVar8, aVar15, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.x);
                    } else {
                        aVar6 = aVar15;
                    }
                } else {
                    aVar6 = aVar15;
                    i2 = layoutParams.j;
                    if (i2 == -1 && (ixaVar4 = sparseArray.get(i2)) != null) {
                        ixaVar.x(aVar6, ixaVar4, aVar14, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.x);
                        aVar7 = aVar6;
                        aVar8 = aVar14;
                    }
                    i3 = layoutParams.k;
                    if (i3 != -1) {
                        ixaVar7 = sparseArray.get(i3);
                        if (ixaVar7 != null) {
                            ixaVar.x(aVar8, ixaVar7, aVar7, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.z);
                        }
                        aVar9 = aVar7;
                    } else {
                        aVar9 = aVar7;
                        i4 = layoutParams.l;
                        if (i4 != -1 && (ixaVar5 = sparseArray.get(i4)) != null) {
                            ixaVar.x(aVar8, ixaVar5, aVar8, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.z);
                        }
                    }
                    aVar10 = aVar8;
                    i5 = layoutParams.m;
                    if (i5 != -1) {
                        layoutParams2 = layoutParams;
                        constraintLayout.D(ixaVar, layoutParams2, sparseArray, i5, ewa.a.e);
                    } else {
                        layoutParams2 = layoutParams;
                        i6 = layoutParams2.n;
                        if (i6 != -1) {
                            D(ixaVar, layoutParams2, sparseArray, i6, aVar9);
                        } else {
                            i7 = layoutParams2.o;
                            if (i7 != -1) {
                                D(ixaVar, layoutParams2, sparseArray, i7, aVar10);
                                ixaVar6 = ixaVar;
                                aVar11 = aVar10;
                            }
                            if (f3 >= 0.0f) {
                                ixaVar6.g0 = f3;
                            }
                            f = layoutParams2.F;
                            if (f >= 0.0f) {
                                ixaVar6.h0 = f;
                            }
                        }
                    }
                    ixaVar6 = ixaVar;
                    aVar11 = aVar10;
                    if (f3 >= 0.0f) {
                        ixaVar6.g0 = f3;
                    }
                    f = layoutParams2.F;
                    if (f >= 0.0f) {
                        ixaVar6.h0 = f;
                    }
                }
                aVar7 = aVar6;
                aVar8 = aVar14;
                i3 = layoutParams.k;
                if (i3 != -1) {
                    ixaVar7 = sparseArray.get(i3);
                    if (ixaVar7 != null) {
                        ixaVar.x(aVar8, ixaVar7, aVar7, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.z);
                    }
                    aVar9 = aVar7;
                } else {
                    aVar9 = aVar7;
                    i4 = layoutParams.l;
                    if (i4 != -1) {
                        ixaVar.x(aVar8, ixaVar5, aVar8, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.z);
                    }
                }
                aVar10 = aVar8;
                i5 = layoutParams.m;
                if (i5 != -1) {
                    layoutParams2 = layoutParams;
                    constraintLayout.D(ixaVar, layoutParams2, sparseArray, i5, ewa.a.e);
                } else {
                    layoutParams2 = layoutParams;
                    i6 = layoutParams2.n;
                    if (i6 != -1) {
                        D(ixaVar, layoutParams2, sparseArray, i6, aVar9);
                    } else {
                        i7 = layoutParams2.o;
                        if (i7 != -1) {
                            D(ixaVar, layoutParams2, sparseArray, i7, aVar10);
                            ixaVar6 = ixaVar;
                            aVar11 = aVar10;
                        }
                        if (f3 >= 0.0f) {
                            ixaVar6.g0 = f3;
                        }
                        f = layoutParams2.F;
                        if (f >= 0.0f) {
                            ixaVar6.h0 = f;
                        }
                    }
                }
                ixaVar6 = ixaVar;
                aVar11 = aVar10;
                if (f3 >= 0.0f) {
                    ixaVar6.g0 = f3;
                }
                f = layoutParams2.F;
                if (f >= 0.0f) {
                    ixaVar6.h0 = f;
                }
            }
            aVar2 = aVar;
            aVar3 = aVar12;
            if (i13 != -1) {
                ixaVar9 = sparseArray.get(i13);
                if (ixaVar9 != null) {
                    ixaVar.x(aVar3, ixaVar9, aVar2, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i16);
                }
                aVar4 = aVar2;
            } else {
                aVar4 = aVar2;
                if (i14 != -1) {
                    ixaVar.x(aVar3, ixaVar3, aVar3, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i16);
                }
            }
            aVar5 = aVar3;
            i = layoutParams.i;
            if (i != -1) {
                ixaVar8 = sparseArray.get(i);
                if (ixaVar8 != null) {
                    aVar6 = aVar15;
                    ixaVar.x(aVar6, ixaVar8, aVar15, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.x);
                } else {
                    aVar6 = aVar15;
                }
            } else {
                aVar6 = aVar15;
                i2 = layoutParams.j;
                if (i2 == -1) {
                }
                i3 = layoutParams.k;
                if (i3 != -1) {
                    ixaVar7 = sparseArray.get(i3);
                    if (ixaVar7 != null) {
                        ixaVar.x(aVar8, ixaVar7, aVar7, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.z);
                    }
                    aVar9 = aVar7;
                } else {
                    aVar9 = aVar7;
                    i4 = layoutParams.l;
                    if (i4 != -1) {
                        ixaVar.x(aVar8, ixaVar5, aVar8, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.z);
                    }
                }
                aVar10 = aVar8;
                i5 = layoutParams.m;
                if (i5 != -1) {
                    layoutParams2 = layoutParams;
                    constraintLayout.D(ixaVar, layoutParams2, sparseArray, i5, ewa.a.e);
                } else {
                    layoutParams2 = layoutParams;
                    i6 = layoutParams2.n;
                    if (i6 != -1) {
                        D(ixaVar, layoutParams2, sparseArray, i6, aVar9);
                    } else {
                        i7 = layoutParams2.o;
                        if (i7 != -1) {
                            D(ixaVar, layoutParams2, sparseArray, i7, aVar10);
                            ixaVar6 = ixaVar;
                            aVar11 = aVar10;
                        }
                        if (f3 >= 0.0f) {
                            ixaVar6.g0 = f3;
                        }
                        f = layoutParams2.F;
                        if (f >= 0.0f) {
                            ixaVar6.h0 = f;
                        }
                    }
                }
                ixaVar6 = ixaVar;
                aVar11 = aVar10;
                if (f3 >= 0.0f) {
                    ixaVar6.g0 = f3;
                }
                f = layoutParams2.F;
                if (f >= 0.0f) {
                    ixaVar6.h0 = f;
                }
            }
            aVar7 = aVar6;
            aVar8 = aVar14;
            i3 = layoutParams.k;
            if (i3 != -1) {
                ixaVar7 = sparseArray.get(i3);
                if (ixaVar7 != null) {
                    ixaVar.x(aVar8, ixaVar7, aVar7, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.z);
                }
                aVar9 = aVar7;
            } else {
                aVar9 = aVar7;
                i4 = layoutParams.l;
                if (i4 != -1) {
                    ixaVar.x(aVar8, ixaVar5, aVar8, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.z);
                }
            }
            aVar10 = aVar8;
            i5 = layoutParams.m;
            if (i5 != -1) {
                layoutParams2 = layoutParams;
                constraintLayout.D(ixaVar, layoutParams2, sparseArray, i5, ewa.a.e);
            } else {
                layoutParams2 = layoutParams;
                i6 = layoutParams2.n;
                if (i6 != -1) {
                    D(ixaVar, layoutParams2, sparseArray, i6, aVar9);
                } else {
                    i7 = layoutParams2.o;
                    if (i7 != -1) {
                        D(ixaVar, layoutParams2, sparseArray, i7, aVar10);
                        ixaVar6 = ixaVar;
                        aVar11 = aVar10;
                    }
                    if (f3 >= 0.0f) {
                        ixaVar6.g0 = f3;
                    }
                    f = layoutParams2.F;
                    if (f >= 0.0f) {
                        ixaVar6.h0 = f;
                    }
                }
            }
            ixaVar6 = ixaVar;
            aVar11 = aVar10;
            if (f3 >= 0.0f) {
                ixaVar6.g0 = f3;
            }
            f = layoutParams2.F;
            if (f >= 0.0f) {
                ixaVar6.h0 = f;
            }
        }
        if (z && ((i8 = layoutParams2.T) != -1 || layoutParams2.U != -1)) {
            int i19 = layoutParams2.U;
            ixaVar6.b0 = i8;
            ixaVar6.c0 = i19;
        }
        boolean z2 = layoutParams2.a0;
        ixa.a aVar17 = ixa.a.b;
        ixa.a aVar18 = ixa.a.a;
        ixa.a aVar19 = ixa.a.d;
        ixa.a aVar20 = ixa.a.c;
        if (z2) {
            ixaVar6.P(aVar18);
            ixaVar6.T(((ViewGroup.MarginLayoutParams) layoutParams2).width);
            if (((ViewGroup.MarginLayoutParams) layoutParams2).width == -2) {
                ixaVar6.P(aVar17);
            }
        } else if (((ViewGroup.MarginLayoutParams) layoutParams2).width == -1) {
            if (layoutParams2.W) {
                ixaVar6.P(aVar20);
            } else {
                ixaVar6.P(aVar19);
            }
            ixaVar6.k(aVar4).g = ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin;
            ixaVar6.k(aVar5).g = ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
        } else {
            ixaVar6.P(aVar20);
            ixaVar6.T(0);
        }
        if (layoutParams2.b0) {
            ixaVar6.R(aVar18);
            ixaVar6.O(((ViewGroup.MarginLayoutParams) layoutParams2).height);
            if (((ViewGroup.MarginLayoutParams) layoutParams2).height == -2) {
                ixaVar6.R(aVar17);
            }
        } else if (((ViewGroup.MarginLayoutParams) layoutParams2).height == -1) {
            if (layoutParams2.X) {
                ixaVar6.R(aVar20);
            } else {
                ixaVar6.R(aVar19);
            }
            ixaVar6.k(aVar9).g = ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
            ixaVar6.k(aVar11).g = ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
        } else {
            ixaVar6.R(aVar20);
            ixaVar6.O(0);
        }
        ixaVar6.L(layoutParams2.G);
        float f5 = layoutParams2.H;
        float[] fArr = ixaVar6.o0;
        fArr[0] = f5;
        fArr[1] = layoutParams2.I;
        ixaVar6.m0 = layoutParams2.J;
        ixaVar6.n0 = layoutParams2.K;
        int i20 = layoutParams2.Z;
        if (i20 >= 0 && i20 <= 3) {
            ixaVar6.r = i20;
        }
        ixaVar6.Q(layoutParams2.R, layoutParams2.L, layoutParams2.N, layoutParams2.P);
        ixaVar6.S(layoutParams2.S, layoutParams2.M, layoutParams2.O, layoutParams2.Q);
    }

    public final View v(int i) {
        return this.a.get(i);
    }

    public final ixa w(View view) {
        if (view == this) {
            return this.c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof LayoutParams) {
            return ((LayoutParams) view.getLayoutParams()).q0;
        }
        view.setLayoutParams(new LayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof LayoutParams) {
            return ((LayoutParams) view.getLayoutParams()).q0;
        }
        return null;
    }

    public final void x(AttributeSet attributeSet, int i) {
        jxa jxaVar = this.c;
        jxaVar.i0 = this;
        a aVar = this.D;
        jxaVar.z0 = aVar;
        jxaVar.x0.f = aVar;
        this.a.put(getId(), this);
        this.y = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, wk30.c, i, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == 16) {
                    this.d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.d);
                } else if (index == 17) {
                    this.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                } else if (index == 14) {
                    this.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                } else if (index == 15) {
                    this.i = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.i);
                } else if (index == 113) {
                    this.w = typedArrayObtainStyledAttributes.getInt(index, this.w);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            z(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.z = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        b bVar = new b();
                        this.y = bVar;
                        bVar.q(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.y = null;
                    }
                    this.A = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        jxaVar.I0 = this.w;
        ofs.q = jxaVar.d0(512);
    }

    public final boolean y() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    public void z(int i) {
        this.z = new owa(getContext(), this, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new SparseArray<>();
        this.b = new ArrayList<>(4);
        this.c = new jxa();
        this.d = 0;
        this.e = 0;
        this.f = Reader.READ_DONE;
        this.i = Reader.READ_DONE;
        this.v = true;
        this.w = 257;
        this.y = null;
        this.z = null;
        this.A = -1;
        this.B = new HashMap<>();
        this.C = new SparseArray<>();
        this.D = new a(this);
        x(attributeSet, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new SparseArray<>();
        this.b = new ArrayList<>(4);
        this.c = new jxa();
        this.d = 0;
        this.e = 0;
        this.f = Reader.READ_DONE;
        this.i = Reader.READ_DONE;
        this.v = true;
        this.w = 257;
        this.y = null;
        this.z = null;
        this.A = -1;
        this.B = new HashMap<>();
        this.C = new SparseArray<>();
        this.D = new a(this);
        x(attributeSet, i);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public int A;
        public int B;
        public final int C;
        public final int D;
        public float E;
        public float F;
        public String G;
        public float H;
        public float I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public int O;
        public int P;
        public int Q;
        public float R;
        public float S;
        public int T;
        public int U;
        public int V;
        public boolean W;
        public boolean X;
        public String Y;
        public int Z;
        public int a;
        public boolean a0;
        public int b;
        public boolean b0;
        public float c;
        public boolean c0;
        public final boolean d;
        public boolean d0;
        public int e;
        public boolean e0;
        public int f;
        public boolean f0;
        public int g;
        public int g0;
        public int h;
        public int h0;
        public int i;
        public int i0;
        public int j;
        public int j0;
        public int k;
        public int k0;
        public int l;
        public int l0;
        public int m;
        public float m0;
        public int n;
        public int n0;
        public int o;
        public int o0;
        public int p;
        public float p0;
        public int q;
        public ixa q0;
        public float r;
        public int s;
        public int t;
        public int u;
        public int v;
        public final int w;
        public int x;
        public final int y;
        public int z;

        public static class a {
            public static final SparseIntArray a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                a = sparseIntArray;
                sparseIntArray.append(98, 64);
                sparseIntArray.append(75, 65);
                sparseIntArray.append(84, 8);
                sparseIntArray.append(85, 9);
                sparseIntArray.append(87, 10);
                sparseIntArray.append(88, 11);
                sparseIntArray.append(94, 12);
                sparseIntArray.append(93, 13);
                sparseIntArray.append(65, 14);
                sparseIntArray.append(64, 15);
                sparseIntArray.append(60, 16);
                sparseIntArray.append(62, 52);
                sparseIntArray.append(61, 53);
                sparseIntArray.append(66, 2);
                sparseIntArray.append(68, 3);
                sparseIntArray.append(67, 4);
                sparseIntArray.append(HttpStatusCodesKt.HTTP_EARLY_HINTS, 49);
                sparseIntArray.append(104, 50);
                sparseIntArray.append(72, 5);
                sparseIntArray.append(73, 6);
                sparseIntArray.append(74, 7);
                sparseIntArray.append(55, 67);
                sparseIntArray.append(0, 1);
                sparseIntArray.append(89, 17);
                sparseIntArray.append(90, 18);
                sparseIntArray.append(71, 19);
                sparseIntArray.append(70, 20);
                sparseIntArray.append(108, 21);
                sparseIntArray.append(111, 22);
                sparseIntArray.append(109, 23);
                sparseIntArray.append(106, 24);
                sparseIntArray.append(110, 25);
                sparseIntArray.append(107, 26);
                sparseIntArray.append(105, 55);
                sparseIntArray.append(112, 54);
                sparseIntArray.append(80, 29);
                sparseIntArray.append(95, 30);
                sparseIntArray.append(69, 44);
                sparseIntArray.append(82, 45);
                sparseIntArray.append(97, 46);
                sparseIntArray.append(81, 47);
                sparseIntArray.append(96, 48);
                sparseIntArray.append(58, 27);
                sparseIntArray.append(57, 28);
                sparseIntArray.append(99, 31);
                sparseIntArray.append(76, 32);
                sparseIntArray.append(HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS, 33);
                sparseIntArray.append(100, 34);
                sparseIntArray.append(HttpStatusCodesKt.HTTP_PROCESSING, 35);
                sparseIntArray.append(78, 36);
                sparseIntArray.append(77, 37);
                sparseIntArray.append(79, 38);
                sparseIntArray.append(83, 39);
                sparseIntArray.append(92, 40);
                sparseIntArray.append(86, 41);
                sparseIntArray.append(63, 42);
                sparseIntArray.append(59, 43);
                sparseIntArray.append(91, 51);
                sparseIntArray.append(114, 66);
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = true;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = 0;
            this.r = 0.0f;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = Integer.MIN_VALUE;
            this.x = Integer.MIN_VALUE;
            this.y = Integer.MIN_VALUE;
            this.z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.a0 = true;
            this.b0 = true;
            this.c0 = false;
            this.d0 = false;
            this.e0 = false;
            this.f0 = false;
            this.g0 = -1;
            this.h0 = -1;
            this.i0 = -1;
            this.j0 = -1;
            this.k0 = Integer.MIN_VALUE;
            this.l0 = Integer.MIN_VALUE;
            this.m0 = 0.5f;
            this.q0 = new ixa();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wk30.c);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                int i2 = a.a.get(index);
                switch (i2) {
                    case 1:
                        this.V = typedArrayObtainStyledAttributes.getInt(index, this.V);
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.p);
                        this.p = resourceId;
                        if (resourceId == -1) {
                            this.p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 3:
                        this.q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.q);
                        break;
                    case 4:
                        float f = typedArrayObtainStyledAttributes.getFloat(index, this.r) % 360.0f;
                        this.r = f;
                        if (f < 0.0f) {
                            this.r = (360.0f - f) % 360.0f;
                        }
                        break;
                    case 5:
                        this.a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.a);
                        break;
                    case 6:
                        this.b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.b);
                        break;
                    case 7:
                        this.c = typedArrayObtainStyledAttributes.getFloat(index, this.c);
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.e);
                        this.e = resourceId2;
                        if (resourceId2 == -1) {
                            this.e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f);
                        this.f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.g);
                        this.g = resourceId4;
                        if (resourceId4 == -1) {
                            this.g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.h);
                        this.h = resourceId5;
                        if (resourceId5 == -1) {
                            this.h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.i);
                        this.i = resourceId6;
                        if (resourceId6 == -1) {
                            this.i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.j);
                        this.j = resourceId7;
                        if (resourceId7 == -1) {
                            this.j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.k);
                        this.k = resourceId8;
                        if (resourceId8 == -1) {
                            this.k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.l);
                        this.l = resourceId9;
                        if (resourceId9 == -1) {
                            this.l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.m);
                        this.m = resourceId10;
                        if (resourceId10 == -1) {
                            this.m = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.s);
                        this.s = resourceId11;
                        if (resourceId11 == -1) {
                            this.s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.t);
                        this.t = resourceId12;
                        if (resourceId12 == -1) {
                            this.t = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.u);
                        this.u = resourceId13;
                        if (resourceId13 == -1) {
                            this.u = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.v);
                        this.v = resourceId14;
                        if (resourceId14 == -1) {
                            this.v = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 21:
                        this.w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.w);
                        break;
                    case 22:
                        this.x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.x);
                        break;
                    case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                        this.y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.y);
                        break;
                    case 24:
                        this.z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.z);
                        break;
                    case KYCBannerItem.STATUS_DEPRECATE /* 25 */:
                        this.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.A);
                        break;
                    case RuntimeVersion.MINOR /* 26 */:
                        this.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.B);
                        break;
                    case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                        this.W = typedArrayObtainStyledAttributes.getBoolean(index, this.W);
                        break;
                    case 28:
                        this.X = typedArrayObtainStyledAttributes.getBoolean(index, this.X);
                        break;
                    case 29:
                        this.E = typedArrayObtainStyledAttributes.getFloat(index, this.E);
                        break;
                    case 30:
                        this.F = typedArrayObtainStyledAttributes.getFloat(index, this.F);
                        break;
                    case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                        int i3 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.L = i3;
                        if (i3 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        }
                        break;
                    case 32:
                        int i4 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.M = i4;
                        if (i4 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        }
                        break;
                    case 33:
                        try {
                            this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.N);
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.N) == -2) {
                                this.N = -2;
                            }
                        }
                        break;
                    case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                        try {
                            this.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.P) == -2) {
                                this.P = -2;
                            }
                        }
                        break;
                    case 35:
                        this.R = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.R));
                        this.L = 2;
                        break;
                    case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                        try {
                            this.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.O) == -2) {
                                this.O = -2;
                            }
                        }
                        break;
                    case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                        try {
                            this.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.Q) == -2) {
                                this.Q = -2;
                            }
                        }
                        break;
                    case 38:
                        this.S = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.S));
                        this.M = 2;
                        break;
                    default:
                        switch (i2) {
                            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                b.u(this, typedArrayObtainStyledAttributes.getString(index));
                                break;
                            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                this.H = typedArrayObtainStyledAttributes.getFloat(index, this.H);
                                break;
                            case 46:
                                this.I = typedArrayObtainStyledAttributes.getFloat(index, this.I);
                                break;
                            case 47:
                                this.J = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.K = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.T = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.T);
                                break;
                            case 50:
                                this.U = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.U);
                                break;
                            case 51:
                                this.Y = typedArrayObtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, this.n);
                                this.n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.n = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 53:
                                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, this.o);
                                this.o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.o = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 54:
                                this.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.D);
                                break;
                            case 55:
                                this.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                break;
                            default:
                                switch (i2) {
                                    case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                                        b.t(this, typedArrayObtainStyledAttributes, index, 0);
                                        break;
                                    case 65:
                                        b.t(this, typedArrayObtainStyledAttributes, index, 1);
                                        break;
                                    case 66:
                                        this.Z = typedArrayObtainStyledAttributes.getInt(index, this.Z);
                                        break;
                                    case 67:
                                        this.d = typedArrayObtainStyledAttributes.getBoolean(index, this.d);
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            a();
        }

        public final void a() {
            this.d0 = false;
            this.a0 = true;
            this.b0 = true;
            int i = ((ViewGroup.MarginLayoutParams) this).width;
            if (i == -2 && this.W) {
                this.a0 = false;
                if (this.L == 0) {
                    this.L = 1;
                }
            }
            int i2 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i2 == -2 && this.X) {
                this.b0 = false;
                if (this.M == 0) {
                    this.M = 1;
                }
            }
            if (i == 0 || i == -1) {
                this.a0 = false;
                if (i == 0 && this.L == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.W = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.b0 = false;
                if (i2 == 0 && this.M == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.X = true;
                }
            }
            if (this.c == -1.0f && this.a == -1 && this.b == -1) {
                return;
            }
            this.d0 = true;
            this.a0 = true;
            this.b0 = true;
            ixa qalVar = this.q0;
            if (!(qalVar instanceof qal)) {
                qalVar = new qal();
                this.q0 = qalVar;
            }
            ((qal) qalVar).X(this.V);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x004a  */
        /* JADX WARN: Code duplicated, block: B:19:0x0051  */
        /* JADX WARN: Code duplicated, block: B:22:0x0058  */
        /* JADX WARN: Code duplicated, block: B:25:0x005e  */
        /* JADX WARN: Code duplicated, block: B:28:0x0064  */
        /* JADX WARN: Code duplicated, block: B:37:0x007a  */
        /* JADX WARN: Code duplicated, block: B:38:0x0082 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:39:0x0084  */
        /* JADX WARN: Code duplicated, block: B:40:0x008b A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:41:0x008d  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        public final void resolveLayoutDirection(int i) {
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
            int i7 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
            super.resolveLayoutDirection(i);
            boolean z = false;
            boolean z2 = 1 == getLayoutDirection();
            this.i0 = -1;
            this.j0 = -1;
            this.g0 = -1;
            this.h0 = -1;
            this.k0 = this.w;
            this.l0 = this.y;
            float f = this.E;
            this.m0 = f;
            int i8 = this.a;
            this.n0 = i8;
            int i9 = this.b;
            this.o0 = i9;
            float f2 = this.c;
            this.p0 = f2;
            int i10 = this.s;
            if (z2) {
                if (i10 != -1) {
                    this.i0 = i10;
                } else {
                    int i11 = this.t;
                    if (i11 != -1) {
                        this.j0 = i11;
                    } else {
                        i2 = this.u;
                        if (i2 != -1) {
                            this.h0 = i2;
                            z = true;
                        }
                        i3 = this.v;
                        if (i3 != -1) {
                            this.g0 = i3;
                            z = true;
                        }
                        i4 = this.A;
                        if (i4 != Integer.MIN_VALUE) {
                            this.l0 = i4;
                        }
                        i5 = this.B;
                        if (i5 != Integer.MIN_VALUE) {
                            this.k0 = i5;
                        }
                        if (z) {
                            this.m0 = 1.0f - f;
                        }
                        if (this.d0 && this.V == 1 && this.d) {
                            if (f2 != -1.0f) {
                                this.p0 = 1.0f - f2;
                                this.n0 = -1;
                                this.o0 = -1;
                            } else if (i8 != -1) {
                                this.o0 = i8;
                                this.n0 = -1;
                                this.p0 = -1.0f;
                            } else if (i9 != -1) {
                                this.n0 = i9;
                                this.o0 = -1;
                                this.p0 = -1.0f;
                            }
                        }
                    }
                }
                z = true;
                i2 = this.u;
                if (i2 != -1) {
                    this.h0 = i2;
                    z = true;
                }
                i3 = this.v;
                if (i3 != -1) {
                    this.g0 = i3;
                    z = true;
                }
                i4 = this.A;
                if (i4 != Integer.MIN_VALUE) {
                    this.l0 = i4;
                }
                i5 = this.B;
                if (i5 != Integer.MIN_VALUE) {
                    this.k0 = i5;
                }
                if (z) {
                    this.m0 = 1.0f - f;
                }
                if (this.d0) {
                    if (f2 != -1.0f) {
                        this.p0 = 1.0f - f2;
                        this.n0 = -1;
                        this.o0 = -1;
                    } else if (i8 != -1) {
                        this.o0 = i8;
                        this.n0 = -1;
                        this.p0 = -1.0f;
                    } else if (i9 != -1) {
                        this.n0 = i9;
                        this.o0 = -1;
                        this.p0 = -1.0f;
                    }
                }
            } else {
                if (i10 != -1) {
                    this.h0 = i10;
                }
                int i12 = this.t;
                if (i12 != -1) {
                    this.g0 = i12;
                }
                i2 = this.u;
                if (i2 != -1) {
                    this.i0 = i2;
                }
                i3 = this.v;
                if (i3 != -1) {
                    this.j0 = i3;
                }
                int i13 = this.A;
                if (i13 != Integer.MIN_VALUE) {
                    this.k0 = i13;
                }
                int i14 = this.B;
                if (i14 != Integer.MIN_VALUE) {
                    this.l0 = i14;
                }
            }
            if (i2 == -1 && i3 == -1 && this.t == -1 && i10 == -1) {
                int i15 = this.g;
                if (i15 != -1) {
                    this.i0 = i15;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                    }
                } else {
                    int i16 = this.h;
                    if (i16 != -1) {
                        this.j0 = i16;
                        if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                            ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                        }
                    }
                }
                int i17 = this.e;
                if (i17 != -1) {
                    this.g0 = i17;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                    return;
                }
                int i18 = this.f;
                if (i18 != -1) {
                    this.h0 = i18;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                }
            }
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = true;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = 0;
            this.r = 0.0f;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = Integer.MIN_VALUE;
            this.x = Integer.MIN_VALUE;
            this.y = Integer.MIN_VALUE;
            this.z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.a0 = true;
            this.b0 = true;
            this.c0 = false;
            this.d0 = false;
            this.e0 = false;
            this.f0 = false;
            this.g0 = -1;
            this.h0 = -1;
            this.i0 = -1;
            this.j0 = -1;
            this.k0 = Integer.MIN_VALUE;
            this.l0 = Integer.MIN_VALUE;
            this.m0 = 0.5f;
            this.q0 = new ixa();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
                ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
                ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
                ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
                setMarginStart(marginLayoutParams.getMarginStart());
                setMarginEnd(marginLayoutParams.getMarginEnd());
            }
            if (layoutParams instanceof LayoutParams) {
                LayoutParams layoutParams2 = (LayoutParams) layoutParams;
                this.a = layoutParams2.a;
                this.b = layoutParams2.b;
                this.c = layoutParams2.c;
                this.d = layoutParams2.d;
                this.e = layoutParams2.e;
                this.f = layoutParams2.f;
                this.g = layoutParams2.g;
                this.h = layoutParams2.h;
                this.i = layoutParams2.i;
                this.j = layoutParams2.j;
                this.k = layoutParams2.k;
                this.l = layoutParams2.l;
                this.m = layoutParams2.m;
                this.n = layoutParams2.n;
                this.o = layoutParams2.o;
                this.p = layoutParams2.p;
                this.q = layoutParams2.q;
                this.r = layoutParams2.r;
                this.s = layoutParams2.s;
                this.t = layoutParams2.t;
                this.u = layoutParams2.u;
                this.v = layoutParams2.v;
                this.w = layoutParams2.w;
                this.x = layoutParams2.x;
                this.y = layoutParams2.y;
                this.z = layoutParams2.z;
                this.A = layoutParams2.A;
                this.B = layoutParams2.B;
                this.C = layoutParams2.C;
                this.D = layoutParams2.D;
                this.E = layoutParams2.E;
                this.F = layoutParams2.F;
                this.G = layoutParams2.G;
                this.H = layoutParams2.H;
                this.I = layoutParams2.I;
                this.J = layoutParams2.J;
                this.K = layoutParams2.K;
                this.W = layoutParams2.W;
                this.X = layoutParams2.X;
                this.L = layoutParams2.L;
                this.M = layoutParams2.M;
                this.N = layoutParams2.N;
                this.P = layoutParams2.P;
                this.O = layoutParams2.O;
                this.Q = layoutParams2.Q;
                this.R = layoutParams2.R;
                this.S = layoutParams2.S;
                this.T = layoutParams2.T;
                this.U = layoutParams2.U;
                this.V = layoutParams2.V;
                this.a0 = layoutParams2.a0;
                this.b0 = layoutParams2.b0;
                this.c0 = layoutParams2.c0;
                this.d0 = layoutParams2.d0;
                this.g0 = layoutParams2.g0;
                this.h0 = layoutParams2.h0;
                this.i0 = layoutParams2.i0;
                this.j0 = layoutParams2.j0;
                this.k0 = layoutParams2.k0;
                this.l0 = layoutParams2.l0;
                this.m0 = layoutParams2.m0;
                this.Y = layoutParams2.Y;
                this.Z = layoutParams2.Z;
                this.q0 = layoutParams2.q0;
            }
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = true;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = 0;
            this.r = 0.0f;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = Integer.MIN_VALUE;
            this.x = Integer.MIN_VALUE;
            this.y = Integer.MIN_VALUE;
            this.z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.a0 = true;
            this.b0 = true;
            this.c0 = false;
            this.d0 = false;
            this.e0 = false;
            this.f0 = false;
            this.g0 = -1;
            this.h0 = -1;
            this.i0 = -1;
            this.j0 = -1;
            this.k0 = Integer.MIN_VALUE;
            this.l0 = Integer.MIN_VALUE;
            this.m0 = 0.5f;
            this.q0 = new ixa();
        }
    }
}
