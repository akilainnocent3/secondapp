package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import defpackage.c7;
import defpackage.dy5;
import defpackage.g9i0;
import defpackage.hb5;
import defpackage.hce0;
import defpackage.r6i0;
import defpackage.zk1;
import defpackage.zkh;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public static final Set<Integer> e0 = Collections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, 130)));
    public boolean T;
    public int U;
    public int[] V;
    public View[] W;
    public final SparseIntArray X;
    public final SparseIntArray Y;
    public b Z;
    public final Rect a0;
    public int b0;
    public int c0;
    public int d0;

    public static final class a extends b {
        @Override // androidx.recyclerview.widget.GridLayoutManager.b
        public final int getSpanIndex(int i, int i2) {
            return i % i2;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.b
        public final int getSpanSize(int i) {
            return 1;
        }
    }

    public static abstract class b {
        final SparseIntArray mSpanIndexCache = new SparseIntArray();
        final SparseIntArray mSpanGroupIndexCache = new SparseIntArray();
        private boolean mCacheSpanIndices = false;
        private boolean mCacheSpanGroupIndices = false;

        public static int findFirstKeyLessThan(SparseIntArray sparseIntArray, int i) {
            int size = sparseIntArray.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (sparseIntArray.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 < 0 || i4 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i4);
        }

        public int getCachedSpanGroupIndex(int i, int i2) {
            if (!this.mCacheSpanGroupIndices) {
                return getSpanGroupIndex(i, i2);
            }
            int i3 = this.mSpanGroupIndexCache.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int spanGroupIndex = getSpanGroupIndex(i, i2);
            this.mSpanGroupIndexCache.put(i, spanGroupIndex);
            return spanGroupIndex;
        }

        public int getCachedSpanIndex(int i, int i2) {
            if (!this.mCacheSpanIndices) {
                return getSpanIndex(i, i2);
            }
            int i3 = this.mSpanIndexCache.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int spanIndex = getSpanIndex(i, i2);
            this.mSpanIndexCache.put(i, spanIndex);
            return spanIndex;
        }

        public int getSpanGroupIndex(int i, int i2) {
            int spanSize;
            int i3;
            int i4;
            int iFindFirstKeyLessThan;
            if (!this.mCacheSpanGroupIndices || (iFindFirstKeyLessThan = findFirstKeyLessThan(this.mSpanGroupIndexCache, i)) == -1) {
                spanSize = 0;
                i3 = 0;
                i4 = 0;
            } else {
                i3 = this.mSpanGroupIndexCache.get(iFindFirstKeyLessThan);
                i4 = iFindFirstKeyLessThan + 1;
                spanSize = getSpanSize(iFindFirstKeyLessThan) + getCachedSpanIndex(iFindFirstKeyLessThan, i2);
                if (spanSize == i2) {
                    i3++;
                    spanSize = 0;
                }
            }
            int spanSize2 = getSpanSize(i);
            while (i4 < i) {
                int spanSize3 = getSpanSize(i4);
                spanSize += spanSize3;
                if (spanSize == i2) {
                    i3++;
                    spanSize = 0;
                } else if (spanSize > i2) {
                    i3++;
                    spanSize = spanSize3;
                }
                i4++;
            }
            return spanSize + spanSize2 > i2 ? i3 + 1 : i3;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0024  */
        /* JADX WARN: Code duplicated, block: B:14:0x002b  */
        /* JADX WARN: Code duplicated, block: B:15:0x002d A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:16:0x002f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x002b -> B:17:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002d -> B:17:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x002f -> B:17:0x0030). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public int getSpanIndex(int r6, int r7) {
            /*
                r5 = this;
                int r0 = r5.getSpanSize(r6)
                r1 = 0
                if (r0 != r7) goto L8
                goto L37
            L8:
                boolean r2 = r5.mCacheSpanIndices
                if (r2 == 0) goto L20
                android.util.SparseIntArray r2 = r5.mSpanIndexCache
                int r2 = findFirstKeyLessThan(r2, r6)
                if (r2 < 0) goto L20
                android.util.SparseIntArray r3 = r5.mSpanIndexCache
                int r3 = r3.get(r2)
                int r4 = r5.getSpanSize(r2)
                int r4 = r4 + r3
                goto L30
            L20:
                r2 = r1
                r4 = r2
            L22:
                if (r2 >= r6) goto L33
                int r3 = r5.getSpanSize(r2)
                int r4 = r4 + r3
                if (r4 != r7) goto L2d
                r4 = r1
                goto L30
            L2d:
                if (r4 <= r7) goto L30
                r4 = r3
            L30:
                int r2 = r2 + 1
                goto L22
            L33:
                int r0 = r0 + r4
                if (r0 > r7) goto L37
                return r4
            L37:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.b.getSpanIndex(int, int):int");
        }

        public abstract int getSpanSize(int i);

        public void invalidateSpanGroupIndexCache() {
            this.mSpanGroupIndexCache.clear();
        }

        public void invalidateSpanIndexCache() {
            this.mSpanIndexCache.clear();
        }

        public boolean isSpanGroupIndexCacheEnabled() {
            return this.mCacheSpanGroupIndices;
        }

        public boolean isSpanIndexCacheEnabled() {
            return this.mCacheSpanIndices;
        }

        public void setSpanGroupIndexCacheEnabled(boolean z) {
            if (!z) {
                this.mSpanGroupIndexCache.clear();
            }
            this.mCacheSpanGroupIndices = z;
        }

        public void setSpanIndexCacheEnabled(boolean z) {
            if (!z) {
                this.mSpanGroupIndexCache.clear();
            }
            this.mCacheSpanIndices = z;
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.T = false;
        this.U = -1;
        this.X = new SparseIntArray();
        this.Y = new SparseIntArray();
        this.Z = new a();
        this.a0 = new Rect();
        this.b0 = -1;
        this.c0 = -1;
        this.d0 = -1;
        N1(RecyclerView.o.V(context, attributeSet, i, i2).b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final int A(RecyclerView.z zVar) {
        return Y0(zVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final int C(RecyclerView.z zVar) {
        return X0(zVar);
    }

    public final void C1(int i) {
        int i2;
        int[] iArr = this.V;
        int i3 = this.U;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.V = iArr;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final int D(RecyclerView.z zVar) {
        return Y0(zVar);
    }

    public final void D1() {
        View[] viewArr = this.W;
        if (viewArr == null || viewArr.length != this.U) {
            this.W = new View[this.U];
        }
    }

    public final int E1(int i) {
        int i2 = this.E;
        RecyclerView recyclerView = this.b;
        return i2 == 0 ? J1(i, recyclerView.c, recyclerView.x0) : K1(i, recyclerView.c, recyclerView.x0);
    }

    public final int F1(int i) {
        int i2 = this.E;
        RecyclerView recyclerView = this.b;
        return i2 == 1 ? J1(i, recyclerView.c, recyclerView.x0) : K1(i, recyclerView.c, recyclerView.x0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.LayoutParams G() {
        return this.E == 0 ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final int G0(int i, RecyclerView.u uVar, RecyclerView.z zVar) {
        O1();
        D1();
        return super.G0(i, uVar, zVar);
    }

    public final HashSet G1(int i) {
        return H1(F1(i), i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final RecyclerView.LayoutParams H(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    public final HashSet H1(int i, int i2) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.b;
        int iL1 = L1(i2, recyclerView.c, recyclerView.x0);
        for (int i3 = i; i3 < i + iL1; i3++) {
            hashSet.add(Integer.valueOf(i3));
        }
        return hashSet;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final RecyclerView.LayoutParams I(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            LayoutParams layoutParams2 = new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            layoutParams2.e = -1;
            layoutParams2.f = 0;
            return layoutParams2;
        }
        LayoutParams layoutParams3 = new LayoutParams(layoutParams);
        layoutParams3.e = -1;
        layoutParams3.f = 0;
        return layoutParams3;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final int I0(int i, RecyclerView.u uVar, RecyclerView.z zVar) {
        O1();
        D1();
        return super.I0(i, uVar, zVar);
    }

    public final int I1(int i, int i2) {
        if (this.E != 1 || !p1()) {
            int[] iArr = this.V;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.V;
        int i3 = this.U;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    public final int J1(int i, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (!zVar.g) {
            return this.Z.getCachedSpanGroupIndex(i, this.U);
        }
        int iB = uVar.b(i);
        if (iB != -1) {
            return this.Z.getCachedSpanGroupIndex(iB, this.U);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    public final int K1(int i, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (!zVar.g) {
            return this.Z.getCachedSpanIndex(i, this.U);
        }
        int i2 = this.Y.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iB = uVar.b(i);
        if (iB != -1) {
            return this.Z.getCachedSpanIndex(iB, this.U);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void L0(Rect rect, int i, int i2) {
        int iV;
        int iV2;
        if (this.V == null) {
            super.L0(rect, i, i2);
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.E == 1) {
            int iHeight = rect.height() + paddingBottom;
            RecyclerView recyclerView = this.b;
            WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
            iV2 = RecyclerView.o.v(i2, iHeight, recyclerView.getMinimumHeight());
            int[] iArr = this.V;
            iV = RecyclerView.o.v(i, iArr[iArr.length - 1] + paddingRight, this.b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + paddingRight;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap<View, g9i0> weakHashMap2 = r6i0.a;
            iV = RecyclerView.o.v(i, iWidth, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.V;
            iV2 = RecyclerView.o.v(i2, iArr2[iArr2.length - 1] + paddingBottom, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(iV, iV2);
    }

    public final int L1(int i, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (!zVar.g) {
            return this.Z.getSpanSize(i);
        }
        int i2 = this.X.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iB = uVar.b(i);
        if (iB != -1) {
            return this.Z.getSpanSize(iB);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int M(RecyclerView.u uVar, RecyclerView.z zVar) {
        if (this.E == 1) {
            return Math.min(this.U, a());
        }
        if (zVar.b() < 1) {
            return 0;
        }
        return J1(zVar.b() - 1, uVar, zVar) + 1;
    }

    public final void M1(View view, int i, boolean z) {
        int iL;
        int iL2;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect = layoutParams.b;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        int iI1 = I1(layoutParams.e, layoutParams.f);
        if (this.E == 1) {
            iL2 = RecyclerView.o.L(false, iI1, i, i3, ((ViewGroup.MarginLayoutParams) layoutParams).width);
            iL = RecyclerView.o.L(true, this.G.l(), this.B, i2, ((ViewGroup.MarginLayoutParams) layoutParams).height);
        } else {
            int iL3 = RecyclerView.o.L(false, iI1, i, i2, ((ViewGroup.MarginLayoutParams) layoutParams).height);
            int iL4 = RecyclerView.o.L(true, this.G.l(), this.A, i3, ((ViewGroup.MarginLayoutParams) layoutParams).width);
            iL = iL3;
            iL2 = iL4;
        }
        RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (z ? Q0(view, iL2, iL, layoutParams2) : O0(view, iL2, iL, layoutParams2)) {
            view.measure(iL2, iL);
        }
    }

    public final void N1(int i) {
        if (i == this.U) {
            return;
        }
        this.T = true;
        if (i < 1) {
            hb5.a(hce0.a(i, "Span count should be at least 1. Provided "));
            return;
        }
        this.U = i;
        this.Z.invalidateSpanIndexCache();
        F0();
    }

    public final void O1() {
        int paddingBottom;
        int paddingTop;
        if (this.E == 1) {
            paddingBottom = this.C - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            paddingBottom = this.D - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        C1(paddingBottom - paddingTop);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final boolean T0() {
        return this.O == null && !this.T;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void V0(RecyclerView.z zVar, LinearLayoutManager.c cVar, q.b bVar) {
        int i;
        int spanSize = this.U;
        for (int i2 = 0; i2 < this.U && (i = cVar.d) >= 0 && i < zVar.b() && spanSize > 0; i2++) {
            int i3 = cVar.d;
            bVar.a(i3, Math.max(0, cVar.g));
            spanSize -= this.Z.getSpanSize(i3);
            cVar.d += cVar.e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int W(RecyclerView.u uVar, RecyclerView.z zVar) {
        if (this.E == 0) {
            return Math.min(this.U, a());
        }
        if (zVar.b() < 1) {
            return 0;
        }
        return J1(zVar.b() - 1, uVar, zVar) + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e0, code lost:
    
        if (r13 == (r2 > r15)) goto L57;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View i0(android.view.View r23, int r24, androidx.recyclerview.widget.RecyclerView.u r25, androidx.recyclerview.widget.RecyclerView.z r26) {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.i0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$z):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final void k0(RecyclerView.u uVar, RecyclerView.z zVar, c7 c7Var) {
        super.k0(uVar, zVar, c7Var);
        c7Var.l(GridView.class.getName());
        RecyclerView.f fVar = this.b.B;
        if (fVar == null || fVar.getItemCount() <= 1) {
            return;
        }
        c7Var.b(c7.a.u);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View k1(RecyclerView.u uVar, RecyclerView.z zVar, boolean z, boolean z2) {
        int i;
        int iK;
        int iK2 = K();
        int i2 = 1;
        if (z2) {
            iK = K() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = iK2;
            iK = 0;
        }
        int iB = zVar.b();
        a1();
        int iK3 = this.G.k();
        int iG = this.G.g();
        View view = null;
        View view2 = null;
        while (iK != i) {
            View viewJ = J(iK);
            int iU = RecyclerView.o.U(viewJ);
            if (iU >= 0 && iU < iB && K1(iU, uVar, zVar) == 0) {
                if (((RecyclerView.LayoutParams) viewJ.getLayoutParams()).a.isRemoved()) {
                    if (view2 == null) {
                        view2 = viewJ;
                    }
                } else {
                    if (this.G.e(viewJ) < iG && this.G.b(viewJ) >= iK3) {
                        return viewJ;
                    }
                    if (view == null) {
                        view = viewJ;
                    }
                }
            }
            iK += i2;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void m0(RecyclerView.u uVar, RecyclerView.z zVar, View view, c7 c7Var) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            l0(view, c7Var);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        int iJ1 = J1(layoutParams2.a.getLayoutPosition(), uVar, zVar);
        int i = this.E;
        int i2 = layoutParams2.e;
        int i3 = layoutParams2.f;
        if (i == 0) {
            c7Var.n(c7.f.a(i2, i3, iJ1, 1, false, false));
        } else {
            c7Var.n(c7.f.a(iJ1, 1, i2, i3, false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void n0(int i, int i2) {
        this.Z.invalidateSpanIndexCache();
        this.Z.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void o0() {
        this.Z.invalidateSpanIndexCache();
        this.Z.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void p0(int i, int i2) {
        this.Z.invalidateSpanIndexCache();
        this.Z.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void q0(int i, int i2) {
        this.Z.invalidateSpanIndexCache();
        this.Z.invalidateSpanGroupIndexCache();
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0242  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void q1(RecyclerView.u uVar, RecyclerView.z zVar, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        int i;
        int i2;
        int i3;
        int paddingLeft;
        int i4;
        int iD;
        int paddingLeft2;
        int iL;
        int iL2;
        boolean z;
        int i5;
        View viewB;
        GridLayoutManager gridLayoutManager = this;
        int iJ = gridLayoutManager.G.j();
        boolean z2 = iJ != 1073741824;
        int i6 = gridLayoutManager.K() > 0 ? gridLayoutManager.V[gridLayoutManager.U] : 0;
        if (z2) {
            gridLayoutManager.O1();
        }
        boolean z3 = cVar.e == 1;
        int iK1 = gridLayoutManager.U;
        if (!z3) {
            iK1 = gridLayoutManager.K1(cVar.d, uVar, zVar) + gridLayoutManager.L1(cVar.d, uVar, zVar);
        }
        int i7 = 0;
        while (i7 < gridLayoutManager.U && (i5 = cVar.d) >= 0 && i5 < zVar.b() && iK1 > 0) {
            int i8 = cVar.d;
            int iL1 = gridLayoutManager.L1(i8, uVar, zVar);
            if (iL1 > gridLayoutManager.U) {
                hb5.a(zk1.a(gridLayoutManager.U, " spans.", dy5.a("Item at position ", i8, iL1, " requires ", " spans but GridLayoutManager has only ")));
                return;
            }
            iK1 -= iL1;
            if (iK1 < 0 || (viewB = cVar.b(uVar)) == null) {
                break;
            }
            gridLayoutManager.W[i7] = viewB;
            i7++;
        }
        if (i7 == 0) {
            bVar.b = true;
            return;
        }
        if (z3) {
            i3 = 1;
            i2 = i7;
            i = 0;
        } else {
            i = i7 - 1;
            i2 = -1;
            i3 = -1;
        }
        int i9 = 0;
        while (i != i2) {
            View view = gridLayoutManager.W[i];
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int iL3 = gridLayoutManager.L1(RecyclerView.o.U(view), uVar, zVar);
            layoutParams.f = iL3;
            layoutParams.e = i9;
            i9 += iL3;
            i += i3;
        }
        float f = 0.0f;
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            View view2 = gridLayoutManager.W[i11];
            if (cVar.k != null) {
                z = false;
                if (z3) {
                    gridLayoutManager.p(view2, -1, true);
                } else {
                    gridLayoutManager.p(view2, 0, true);
                }
            } else if (z3) {
                z = false;
                gridLayoutManager.p(view2, -1, false);
            } else {
                z = false;
                gridLayoutManager.p(view2, 0, false);
            }
            gridLayoutManager.r(gridLayoutManager.a0, view2);
            gridLayoutManager.M1(view2, iJ, z);
            int iC = gridLayoutManager.G.c(view2);
            if (iC > i10) {
                i10 = iC;
            }
            float fD = (gridLayoutManager.G.d(view2) * 1.0f) / ((LayoutParams) view2.getLayoutParams()).f;
            if (fD > f) {
                f = fD;
            }
        }
        if (z2) {
            gridLayoutManager.C1(Math.max(Math.round(f * gridLayoutManager.U), i6));
            i10 = 0;
            for (int i12 = 0; i12 < i7; i12++) {
                View view3 = gridLayoutManager.W[i12];
                gridLayoutManager.M1(view3, 1073741824, true);
                int iC2 = gridLayoutManager.G.c(view3);
                if (iC2 > i10) {
                    i10 = iC2;
                }
            }
        }
        for (int i13 = 0; i13 < i7; i13++) {
            View view4 = gridLayoutManager.W[i13];
            if (gridLayoutManager.G.c(view4) != i10) {
                LayoutParams layoutParams2 = (LayoutParams) view4.getLayoutParams();
                Rect rect = layoutParams2.b;
                int i14 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                int i15 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                int iI1 = gridLayoutManager.I1(layoutParams2.e, layoutParams2.f);
                if (gridLayoutManager.E == 1) {
                    iL2 = RecyclerView.o.L(false, iI1, 1073741824, i15, ((ViewGroup.MarginLayoutParams) layoutParams2).width);
                    iL = View.MeasureSpec.makeMeasureSpec(i10 - i14, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10 - i15, 1073741824);
                    iL = RecyclerView.o.L(false, iI1, 1073741824, i14, ((ViewGroup.MarginLayoutParams) layoutParams2).height);
                    iL2 = iMakeMeasureSpec;
                }
                if (gridLayoutManager.Q0(view4, iL2, iL, (RecyclerView.LayoutParams) view4.getLayoutParams())) {
                    view4.measure(iL2, iL);
                }
            }
        }
        int paddingTop = 0;
        bVar.a = i10;
        int i16 = gridLayoutManager.E;
        int i17 = cVar.f;
        int iD2 = cVar.b;
        if (i16 != 1) {
            if (i17 == -1) {
                i4 = iD2 - i10;
                paddingLeft = iD2;
            } else {
                paddingLeft = iD2 + i10;
                i4 = iD2;
            }
            iD2 = paddingTop;
        } else if (i17 == -1) {
            paddingTop = iD2 - i10;
            i4 = 0;
            paddingLeft = 0;
        } else {
            paddingLeft = 0;
            paddingTop = iD2;
            iD2 += i10;
            i4 = 0;
        }
        while (true) {
            View[] viewArr = gridLayoutManager.W;
            if (paddingTop >= i7) {
                Arrays.fill(viewArr, (Object) null);
                return;
            }
            int iD3 = i4;
            View view5 = viewArr[paddingTop];
            LayoutParams layoutParams3 = (LayoutParams) view5.getLayoutParams();
            if (gridLayoutManager.E == 1) {
                if (gridLayoutManager.p1()) {
                    paddingLeft = gridLayoutManager.getPaddingLeft() + gridLayoutManager.V[gridLayoutManager.U - layoutParams3.e];
                    iD3 = paddingLeft - gridLayoutManager.G.d(view5);
                } else {
                    paddingLeft2 = gridLayoutManager.getPaddingLeft() + gridLayoutManager.V[layoutParams3.e];
                    iD = gridLayoutManager.G.d(view5) + paddingLeft2;
                }
                int i18 = iD2;
                gridLayoutManager.b0(view5, paddingLeft2, paddingTop, iD, i18);
                i4 = paddingLeft2;
                paddingLeft = iD;
                iD2 = i18;
                if (layoutParams3.a.isRemoved() || layoutParams3.a.isUpdated()) {
                    bVar.c = true;
                }
                bVar.d = view5.hasFocusable() | bVar.d;
                paddingTop++;
                gridLayoutManager = this;
            } else {
                paddingTop = gridLayoutManager.getPaddingTop() + gridLayoutManager.V[layoutParams3.e];
                iD2 = gridLayoutManager.G.d(view5) + paddingTop;
            }
            iD = paddingLeft;
            paddingLeft2 = iD3;
            int i19 = iD2;
            gridLayoutManager.b0(view5, paddingLeft2, paddingTop, iD, i19);
            i4 = paddingLeft2;
            paddingLeft = iD;
            iD2 = i19;
            if (layoutParams3.a.isRemoved()) {
                bVar.c = true;
            } else {
                bVar.c = true;
            }
            bVar.d = view5.hasFocusable() | bVar.d;
            paddingTop++;
            gridLayoutManager = this;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void r1(RecyclerView.u uVar, RecyclerView.z zVar, LinearLayoutManager.a aVar, int i) {
        O1();
        if (zVar.b() > 0 && !zVar.g) {
            boolean z = i == 1;
            int iK1 = K1(aVar.b, uVar, zVar);
            if (z) {
                while (iK1 > 0) {
                    int i2 = aVar.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    aVar.b = i3;
                    iK1 = K1(i3, uVar, zVar);
                }
            } else {
                int iB = zVar.b() - 1;
                int i4 = aVar.b;
                while (i4 < iB) {
                    int i5 = i4 + 1;
                    int iK2 = K1(i5, uVar, zVar);
                    if (iK2 <= iK1) {
                        break;
                    }
                    i4 = i5;
                    iK1 = iK2;
                }
                aVar.b = i4;
            }
        }
        D1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void s0(RecyclerView recyclerView, int i, int i2) {
        this.Z.invalidateSpanIndexCache();
        this.Z.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public void t0(RecyclerView.u uVar, RecyclerView.z zVar) {
        boolean z = zVar.g;
        SparseIntArray sparseIntArray = this.Y;
        SparseIntArray sparseIntArray2 = this.X;
        if (z) {
            int iK = K();
            for (int i = 0; i < iK; i++) {
                LayoutParams layoutParams = (LayoutParams) J(i).getLayoutParams();
                int layoutPosition = layoutParams.a.getLayoutPosition();
                sparseIntArray2.put(layoutPosition, layoutParams.f);
                sparseIntArray.put(layoutPosition, layoutParams.e);
            }
        }
        super.t0(uVar, zVar);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean u(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final void u0(RecyclerView.z zVar) {
        View viewF;
        super.u0(zVar);
        this.T = false;
        int i = this.b0;
        if (i == -1 || (viewF = F(i)) == null) {
            return;
        }
        viewF.sendAccessibilityEvent(67108864);
        this.b0 = -1;
    }

    /* JADX WARN: Code duplicated, block: B:118:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:121:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:122:0x01a9 A[EDGE_INSN: B:122:0x01a9->B:166:0x027c BREAK  A[LOOP:2: B:126:0x01b9->B:135:0x01e2, LOOP_LABEL: LOOP:2: B:126:0x01b9->B:135:0x01e2]] */
    /* JADX WARN: Code duplicated, block: B:123:0x01ac A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:128:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:131:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:134:0x01da A[LOOP:3: B:129:0x01c7->B:134:0x01da, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:139:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:142:0x0213  */
    /* JADX WARN: Code duplicated, block: B:143:0x0215  */
    /* JADX WARN: Code duplicated, block: B:145:0x0218 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:150:0x0227  */
    /* JADX WARN: Code duplicated, block: B:153:0x0235  */
    /* JADX WARN: Code duplicated, block: B:156:0x0243  */
    /* JADX WARN: Code duplicated, block: B:163:0x0262  */
    /* JADX WARN: Code duplicated, block: B:167:0x027e  */
    /* JADX WARN: Code duplicated, block: B:206:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x01e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x01e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x01ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:? A[LOOP:4: B:137:0x01ed->B:211:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x0254 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x0251 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x0249 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x022f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x026e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:? A[LOOP:7: B:161:0x025c->B:221:?, LOOP_END, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final boolean y0(int i, Bundle bundle) {
        View viewJ;
        RecyclerView.d0 d0VarQ;
        int iIntValue;
        int i2;
        TreeMap treeMap;
        int i3;
        Iterator it;
        Integer num;
        int iIntValue2;
        Iterator it2;
        Integer num2;
        TreeMap treeMap2;
        int i4;
        Iterator it3;
        Integer num3;
        int iIntValue3;
        Iterator it4;
        Integer num4;
        if (i == c7.a.u.a() && i != -1) {
            int i5 = 0;
            while (true) {
                if (i5 >= K()) {
                    viewJ = null;
                    break;
                }
                View viewJ2 = J(i5);
                Objects.requireNonNull(viewJ2);
                if (viewJ2.isAccessibilityFocused()) {
                    viewJ = J(i5);
                    break;
                }
                i5++;
            }
            if (viewJ != null && bundle != null) {
                int i6 = bundle.getInt("android.view.accessibility.action.ARGUMENT_DIRECTION_INT", -1);
                if (e0.contains(Integer.valueOf(i6)) && (d0VarQ = this.b.Q(viewJ)) != null) {
                    int absoluteAdapterPosition = d0VarQ.getAbsoluteAdapterPosition();
                    int iF1 = F1(absoluteAdapterPosition);
                    int iE1 = E1(absoluteAdapterPosition);
                    if (iF1 >= 0 && iE1 >= 0) {
                        if (!G1(absoluteAdapterPosition).contains(Integer.valueOf(this.c0)) || !H1(E1(absoluteAdapterPosition), absoluteAdapterPosition).contains(Integer.valueOf(this.d0))) {
                            this.c0 = iF1;
                            this.d0 = iE1;
                        }
                        int i7 = this.c0;
                        if (i7 == -1) {
                            i7 = iF1;
                        }
                        int i8 = this.d0;
                        if (i8 != -1) {
                            iE1 = i8;
                        }
                        if (i6 == 17) {
                            iIntValue = absoluteAdapterPosition - 1;
                            while (true) {
                                if (iIntValue >= 0) {
                                    int iF2 = F1(iIntValue);
                                    int iE2 = E1(iIntValue);
                                    if (iF2 >= 0 && iE2 >= 0) {
                                        if (this.E != 1) {
                                            if (G1(iIntValue).contains(Integer.valueOf(i7)) && iE2 < iE1) {
                                                this.d0 = iE2;
                                                break;
                                            }
                                            iIntValue--;
                                        } else {
                                            if ((iF2 == i7 && iE2 < iE1) || iF2 < i7) {
                                                this.c0 = iF2;
                                                this.d0 = iE2;
                                                break;
                                            }
                                            iIntValue--;
                                        }
                                    }
                                }
                                iIntValue = -1;
                                break;
                            }
                            if (iIntValue == -1) {
                                if (i6 == 17) {
                                    if (i6 == 66) {
                                        if (iF1 < 0) {
                                            treeMap = new TreeMap();
                                            i3 = 0;
                                            loop5: while (true) {
                                                if (i3 < a()) {
                                                    it2 = G1(i3).iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            num2 = (Integer) it2.next();
                                                            if (num2.intValue() < 0) {
                                                                if (!treeMap.containsKey(num2)) {
                                                                    treeMap.put(num2, Integer.valueOf(i3));
                                                                }
                                                            }
                                                        } else {
                                                            i3++;
                                                        }
                                                    }
                                                } else {
                                                    it = treeMap.keySet().iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            num = (Integer) it.next();
                                                            iIntValue2 = num.intValue();
                                                            if (iIntValue2 > iF1) {
                                                                iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                                this.c0 = iIntValue2;
                                                                this.d0 = 0;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                                iIntValue = -1;
                                                break loop2;
                                            }
                                        }
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                } else {
                                    if (iF1 < 0) {
                                        treeMap2 = new TreeMap(Collections.reverseOrder());
                                        i4 = 0;
                                        loop2: while (true) {
                                            if (i4 < a()) {
                                                it4 = G1(i4).iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        num4 = (Integer) it4.next();
                                                        if (num4.intValue() < 0) {
                                                            treeMap2.put(num4, Integer.valueOf(i4));
                                                        }
                                                    } else {
                                                        i4++;
                                                    }
                                                }
                                            } else {
                                                it3 = treeMap2.keySet().iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        num3 = (Integer) it3.next();
                                                        iIntValue3 = num3.intValue();
                                                        if (iIntValue3 < iF1) {
                                                            iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                            this.c0 = iIntValue3;
                                                            this.d0 = E1(iIntValue);
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                    }
                                    iIntValue = -1;
                                    break loop2;
                                }
                            }
                            if (iIntValue != -1) {
                                H0(iIntValue);
                                this.b0 = iIntValue;
                                return true;
                            }
                        } else if (i6 == 33) {
                            iIntValue = absoluteAdapterPosition - 1;
                            while (true) {
                                if (iIntValue >= 0) {
                                    int iF3 = F1(iIntValue);
                                    int iE3 = E1(iIntValue);
                                    if (iF3 >= 0 && iE3 >= 0) {
                                        if (this.E != 1) {
                                            if (iF3 < i7 && iE3 == iE1) {
                                                this.c0 = ((Integer) Collections.max(G1(iIntValue))).intValue();
                                                break;
                                            }
                                            iIntValue--;
                                        } else {
                                            if (iF3 < i7 && H1(E1(iIntValue), iIntValue).contains(Integer.valueOf(iE1))) {
                                                this.c0 = iF3;
                                                break;
                                            }
                                            iIntValue--;
                                        }
                                    }
                                }
                                iIntValue = -1;
                                break;
                            }
                            if (iIntValue == -1) {
                                if (i6 == 17) {
                                    if (i6 == 66) {
                                        if (iF1 < 0) {
                                            treeMap = new TreeMap();
                                            i3 = 0;
                                            loop5: while (true) {
                                                if (i3 < a()) {
                                                    it2 = G1(i3).iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            num2 = (Integer) it2.next();
                                                            if (num2.intValue() < 0) {
                                                                if (!treeMap.containsKey(num2)) {
                                                                    treeMap.put(num2, Integer.valueOf(i3));
                                                                }
                                                            }
                                                        } else {
                                                            i3++;
                                                        }
                                                    }
                                                } else {
                                                    it = treeMap.keySet().iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            num = (Integer) it.next();
                                                            iIntValue2 = num.intValue();
                                                            if (iIntValue2 > iF1) {
                                                                iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                                this.c0 = iIntValue2;
                                                                this.d0 = 0;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                                iIntValue = -1;
                                                break loop2;
                                            }
                                        }
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                } else {
                                    if (iF1 < 0) {
                                        treeMap2 = new TreeMap(Collections.reverseOrder());
                                        i4 = 0;
                                        loop2: while (true) {
                                            if (i4 < a()) {
                                                it4 = G1(i4).iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        num4 = (Integer) it4.next();
                                                        if (num4.intValue() < 0) {
                                                            treeMap2.put(num4, Integer.valueOf(i4));
                                                        }
                                                    } else {
                                                        i4++;
                                                    }
                                                }
                                            } else {
                                                it3 = treeMap2.keySet().iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        num3 = (Integer) it3.next();
                                                        iIntValue3 = num3.intValue();
                                                        if (iIntValue3 < iF1) {
                                                            iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                            this.c0 = iIntValue3;
                                                            this.d0 = E1(iIntValue);
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                    }
                                    iIntValue = -1;
                                    break loop2;
                                }
                            }
                            if (iIntValue != -1) {
                                H0(iIntValue);
                                this.b0 = iIntValue;
                                return true;
                            }
                        } else if (i6 == 66) {
                            iIntValue = absoluteAdapterPosition + 1;
                            while (true) {
                                if (iIntValue < a()) {
                                    int iF4 = F1(iIntValue);
                                    int iE4 = E1(iIntValue);
                                    if (iF4 >= 0 && iE4 >= 0) {
                                        if (this.E != 1) {
                                            if (iE4 > iE1 && G1(iIntValue).contains(Integer.valueOf(i7))) {
                                                this.d0 = iE4;
                                                break;
                                            }
                                            iIntValue++;
                                        } else {
                                            if ((iF4 == i7 && iE4 > iE1) || iF4 > i7) {
                                                this.c0 = iF4;
                                                this.d0 = iE4;
                                                break;
                                            }
                                            iIntValue++;
                                        }
                                    }
                                }
                                iIntValue = -1;
                                break;
                            }
                            if (iIntValue == -1) {
                                if (i6 == 17) {
                                    if (i6 == 66) {
                                        if (iF1 < 0) {
                                            treeMap = new TreeMap();
                                            i3 = 0;
                                            loop5: while (true) {
                                                if (i3 < a()) {
                                                    it2 = G1(i3).iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            num2 = (Integer) it2.next();
                                                            if (num2.intValue() < 0) {
                                                                if (!treeMap.containsKey(num2)) {
                                                                    treeMap.put(num2, Integer.valueOf(i3));
                                                                }
                                                            }
                                                        } else {
                                                            i3++;
                                                        }
                                                    }
                                                } else {
                                                    it = treeMap.keySet().iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            num = (Integer) it.next();
                                                            iIntValue2 = num.intValue();
                                                            if (iIntValue2 > iF1) {
                                                                iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                                this.c0 = iIntValue2;
                                                                this.d0 = 0;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                                iIntValue = -1;
                                                break loop2;
                                            }
                                        }
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                } else {
                                    if (iF1 < 0) {
                                        treeMap2 = new TreeMap(Collections.reverseOrder());
                                        i4 = 0;
                                        loop2: while (true) {
                                            if (i4 < a()) {
                                                it4 = G1(i4).iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        num4 = (Integer) it4.next();
                                                        if (num4.intValue() < 0) {
                                                            treeMap2.put(num4, Integer.valueOf(i4));
                                                        }
                                                    } else {
                                                        i4++;
                                                    }
                                                }
                                            } else {
                                                it3 = treeMap2.keySet().iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        num3 = (Integer) it3.next();
                                                        iIntValue3 = num3.intValue();
                                                        if (iIntValue3 < iF1) {
                                                            iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                            this.c0 = iIntValue3;
                                                            this.d0 = E1(iIntValue);
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                    }
                                    iIntValue = -1;
                                    break loop2;
                                }
                            }
                            if (iIntValue != -1) {
                                H0(iIntValue);
                                this.b0 = iIntValue;
                                return true;
                            }
                        } else if (i6 == 130) {
                            iIntValue = absoluteAdapterPosition + 1;
                            while (true) {
                                if (iIntValue < a()) {
                                    int iF5 = F1(iIntValue);
                                    int iE5 = E1(iIntValue);
                                    if (iF5 >= 0 && iE5 >= 0) {
                                        if (this.E != 1) {
                                            if (iF5 > i7 && iE5 == iE1) {
                                                this.c0 = F1(iIntValue);
                                                break;
                                            }
                                            iIntValue++;
                                        } else {
                                            if (iF5 > i7 && (iE5 == iE1 || H1(E1(iIntValue), iIntValue).contains(Integer.valueOf(iE1)))) {
                                                this.c0 = iF5;
                                                break;
                                            }
                                            iIntValue++;
                                        }
                                    }
                                }
                                iIntValue = -1;
                                break;
                            }
                            if (iIntValue == -1 && (i2 = this.E) == 0) {
                                if (i6 == 17) {
                                    if (i6 == 66) {
                                        if (iF1 < 0 || i2 == 1) {
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                        treeMap = new TreeMap();
                                        i3 = 0;
                                        loop5: while (true) {
                                            if (i3 < a()) {
                                                it2 = G1(i3).iterator();
                                                while (true) {
                                                    if (it2.hasNext()) {
                                                        num2 = (Integer) it2.next();
                                                        if (num2.intValue() < 0) {
                                                            if (!treeMap.containsKey(num2)) {
                                                                treeMap.put(num2, Integer.valueOf(i3));
                                                            }
                                                        }
                                                    } else {
                                                        i3++;
                                                    }
                                                }
                                            } else {
                                                it = treeMap.keySet().iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        num = (Integer) it.next();
                                                        iIntValue2 = num.intValue();
                                                        if (iIntValue2 > iF1) {
                                                            iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                            this.c0 = iIntValue2;
                                                            this.d0 = 0;
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                    }
                                } else {
                                    if (iF1 < 0 || i2 == 1) {
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                    treeMap2 = new TreeMap(Collections.reverseOrder());
                                    i4 = 0;
                                    loop2: while (true) {
                                        if (i4 < a()) {
                                            it4 = G1(i4).iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    num4 = (Integer) it4.next();
                                                    if (num4.intValue() < 0) {
                                                        treeMap2.put(num4, Integer.valueOf(i4));
                                                    }
                                                } else {
                                                    i4++;
                                                }
                                            }
                                        } else {
                                            it3 = treeMap2.keySet().iterator();
                                            while (true) {
                                                if (it3.hasNext()) {
                                                    num3 = (Integer) it3.next();
                                                    iIntValue3 = num3.intValue();
                                                    if (iIntValue3 < iF1) {
                                                        iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                        this.c0 = iIntValue3;
                                                        this.d0 = E1(iIntValue);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                }
                            }
                            if (iIntValue != -1) {
                                H0(iIntValue);
                                this.b0 = iIntValue;
                                return true;
                            }
                        }
                    }
                }
            }
        } else {
            if (i != 16908343 || bundle == null) {
                return super.y0(i, bundle);
            }
            int i9 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
            int i10 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
            if (i9 != -1 && i10 != -1) {
                int itemCount = this.b.B.getItemCount();
                int i11 = 0;
                while (true) {
                    if (i11 >= itemCount) {
                        i11 = -1;
                        break;
                    }
                    RecyclerView recyclerView = this.b;
                    int iK1 = K1(i11, recyclerView.c, recyclerView.x0);
                    RecyclerView recyclerView2 = this.b;
                    int iJ1 = J1(i11, recyclerView2.c, recyclerView2.x0);
                    if (this.E != 1) {
                        if (iK1 == i9 && iJ1 == i10) {
                            break;
                        }
                        i11++;
                    } else {
                        if (iK1 == i10 && iJ1 == i9) {
                            break;
                        }
                        i11++;
                    }
                }
                if (i11 > -1) {
                    w1(i11, 0);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void y1(boolean z) {
        if (z) {
            zkh.a("GridLayoutManager does not support stack from end. Consider using reverse layout");
        } else {
            super.y1(false);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final int z(RecyclerView.z zVar) {
        return X0(zVar);
    }

    public static class LayoutParams extends RecyclerView.LayoutParams {
        public int e;
        public int f;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.e = -1;
            this.f = 0;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.e = -1;
            this.f = 0;
        }
    }

    public GridLayoutManager(int i) {
        this.T = false;
        this.U = -1;
        this.X = new SparseIntArray();
        this.Y = new SparseIntArray();
        this.Z = new a();
        this.a0 = new Rect();
        this.b0 = -1;
        this.c0 = -1;
        this.d0 = -1;
        N1(i);
    }

    public GridLayoutManager(int i, int i2) {
        super(i2, false);
        this.T = false;
        this.U = -1;
        this.X = new SparseIntArray();
        this.Y = new SparseIntArray();
        this.Z = new a();
        this.a0 = new Rect();
        this.b0 = -1;
        this.c0 = -1;
        this.d0 = -1;
        N1(i);
    }
}
