package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.BaseInterpolator;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.customview.view.AbsSavedState;
import com.google.protobuf.Reader;
import defpackage.alf;
import defpackage.b7i0;
import defpackage.c7;
import defpackage.dy5;
import defpackage.e6;
import defpackage.efe0;
import defpackage.ek30;
import defpackage.f87;
import defpackage.fl40;
import defpackage.g9i0;
import defpackage.hb5;
import defpackage.ib5;
import defpackage.lpd0;
import defpackage.lx5;
import defpackage.mq0;
import defpackage.mrh0;
import defpackage.nj90;
import defpackage.nrh0;
import defpackage.ojh;
import defpackage.plx;
import defpackage.qkt;
import defpackage.qlx;
import defpackage.r6i0;
import defpackage.r7i0;
import defpackage.rcp;
import defpackage.ruw;
import defpackage.t39;
import defpackage.t7i0;
import defpackage.tpe;
import defpackage.upe;
import defpackage.vig0;
import defpackage.wue;
import defpackage.yr70;
import defpackage.z120;
import defpackage.z9l;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements yr70, plx {
    public static boolean S0 = false;
    public static boolean T0 = false;
    public static final int[] U0 = {R.attr.nestedScrollingEnabled};
    public static final float V0 = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final boolean W0 = true;
    public static final boolean X0 = true;
    public static final Class<?>[] Y0;
    public static final c Z0;
    public static final a0 a1;
    public final RectF A;
    public boolean A0;
    public f B;
    public boolean B0;
    public o C;
    public final m C0;
    public v D;
    public boolean D0;
    public final ArrayList E;
    public g0 E0;
    public final ArrayList<n> F;
    public final int[] F0;
    public final ArrayList<r> G;
    public qlx G0;
    public r H;
    public final int[] H0;
    public boolean I;
    public final int[] I0;
    public boolean J;
    public final int[] J0;
    public boolean K;
    public final ArrayList K0;
    public int L;
    public final b L0;
    public boolean M;
    public boolean M0;
    public boolean N;
    public int N0;
    public boolean O;
    public int O0;
    public int P;
    public final boolean P0;
    public boolean Q;
    public final d Q0;
    public final AccessibilityManager R;
    public final tpe R0;
    public ArrayList S;
    public boolean T;
    public boolean U;
    public int V;
    public int W;
    public final float a;
    public k a0;
    public final w b;
    public EdgeEffect b0;
    public final u c;
    public EdgeEffect c0;
    public SavedState d;
    public EdgeEffect d0;
    public final androidx.recyclerview.widget.a e;
    public EdgeEffect e0;
    public final androidx.recyclerview.widget.e f;
    public l f0;
    public int g0;
    public int h0;
    public final n0 i;
    public VelocityTracker i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public int n0;
    public q o0;
    public final int p0;
    public final int q0;
    public final float r0;
    public final float s0;
    public boolean t0;
    public final c0 u0;
    public boolean v;
    public androidx.recyclerview.widget.q v0;
    public final a w;
    public final androidx.recyclerview.widget.q.b w0;
    public final z x0;
    public final Rect y;
    public s y0;
    public final Rect z;
    public ArrayList z0;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.K || recyclerView.isLayoutRequested()) {
                return;
            }
            if (!recyclerView.I) {
                recyclerView.requestLayout();
            } else if (recyclerView.N) {
                recyclerView.M = true;
            } else {
                recyclerView.q();
            }
        }
    }

    public static class a0 extends k {
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RecyclerView recyclerView = RecyclerView.this;
            l lVar = recyclerView.f0;
            if (lVar != null) {
                lVar.l();
            }
            recyclerView.D0 = false;
        }
    }

    public static abstract class b0 {
    }

    public class c implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    public class c0 implements Runnable {
        public int a;
        public int b;
        public OverScroller c;
        public Interpolator d;
        public boolean e;
        public boolean f;

        public c0() {
            c cVar = RecyclerView.Z0;
            this.d = cVar;
            this.e = false;
            this.f = false;
            this.c = new OverScroller(RecyclerView.this.getContext(), cVar);
        }

        public final void a(int i, int i2) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.setScrollState(2);
            this.b = 0;
            this.a = 0;
            Interpolator interpolator = this.d;
            c cVar = RecyclerView.Z0;
            if (interpolator != cVar) {
                this.d = cVar;
                this.c = new OverScroller(recyclerView.getContext(), cVar);
            }
            this.c.fling(0, 0, i, i2, Integer.MIN_VALUE, Reader.READ_DONE, Integer.MIN_VALUE, Reader.READ_DONE);
            b();
        }

        public final void b() {
            if (this.e) {
                this.f = true;
                return;
            }
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.removeCallbacks(this);
            WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
            recyclerView.postOnAnimation(this);
        }

        public final void c(int i, int i2, int i3, Interpolator interpolator) {
            RecyclerView recyclerView = RecyclerView.this;
            if (i3 == Integer.MIN_VALUE) {
                int iAbs = Math.abs(i);
                int iAbs2 = Math.abs(i2);
                boolean z = iAbs > iAbs2;
                int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
                if (!z) {
                    iAbs = iAbs2;
                }
                i3 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.Z0;
            }
            if (this.d != interpolator) {
                this.d = interpolator;
                this.c = new OverScroller(recyclerView.getContext(), interpolator);
            }
            this.b = 0;
            this.a = 0;
            recyclerView.setScrollState(2);
            this.c.startScroll(0, 0, i, i2, i4);
            b();
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            RecyclerView recyclerView = RecyclerView.this;
            int[] iArr = recyclerView.J0;
            if (recyclerView.C == null) {
                recyclerView.removeCallbacks(this);
                this.c.abortAnimation();
                return;
            }
            this.f = false;
            this.e = true;
            recyclerView.q();
            OverScroller overScroller = this.c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i6 = currX - this.a;
                int i7 = currY - this.b;
                this.a = currX;
                this.b = currY;
                int iP = RecyclerView.p(i6, recyclerView.b0, recyclerView.d0, recyclerView.getWidth());
                int iP2 = RecyclerView.p(i7, recyclerView.c0, recyclerView.e0, recyclerView.getHeight());
                int[] iArr2 = recyclerView.J0;
                iArr2[0] = 0;
                iArr2[1] = 0;
                if (recyclerView.w(iP, iP2, 1, iArr2, null)) {
                    iP -= iArr[0];
                    iP2 -= iArr[1];
                }
                if (recyclerView.getOverScrollMode() != 2) {
                    recyclerView.o(iP, iP2);
                }
                if (recyclerView.B != null) {
                    iArr[0] = 0;
                    iArr[1] = 0;
                    recyclerView.n0(iP, iP2, iArr);
                    int i8 = iArr[0];
                    int i9 = iArr[1];
                    int i10 = iP - i8;
                    int i11 = iP2 - i9;
                    y yVar = recyclerView.C.e;
                    if (yVar != null && !yVar.d && yVar.e) {
                        int iB = recyclerView.x0.b();
                        if (iB == 0) {
                            yVar.g();
                        } else if (yVar.a >= iB) {
                            yVar.a = iB - 1;
                            yVar.b(i8, i9);
                        } else {
                            yVar.b(i8, i9);
                        }
                    }
                    i = i10;
                    i3 = i8;
                    i2 = i11;
                    i4 = i9;
                } else {
                    i = iP;
                    i2 = iP2;
                    i3 = 0;
                    i4 = 0;
                }
                if (!recyclerView.F.isEmpty()) {
                    recyclerView.invalidate();
                }
                int[] iArr3 = recyclerView.J0;
                iArr3[0] = 0;
                iArr3[1] = 0;
                recyclerView.x(i3, i4, i, i2, null, 1, iArr3);
                int i12 = i - iArr[0];
                int i13 = i2 - iArr[1];
                if (i3 != 0 || i4 != 0) {
                    recyclerView.y(i3, i4);
                }
                if (!recyclerView.awakenScrollBars()) {
                    recyclerView.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i12 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i13 != 0));
                y yVar2 = recyclerView.C.e;
                if ((yVar2 == null || !yVar2.d) && z) {
                    if (recyclerView.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i12 < 0) {
                            i5 = -currVelocity;
                        } else {
                            i5 = i12 > 0 ? currVelocity : 0;
                        }
                        if (i13 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i13 <= 0) {
                            currVelocity = 0;
                        }
                        if (i5 < 0) {
                            recyclerView.A();
                            if (recyclerView.b0.isFinished()) {
                                recyclerView.b0.onAbsorb(-i5);
                            }
                        } else if (i5 > 0) {
                            recyclerView.B();
                            if (recyclerView.d0.isFinished()) {
                                recyclerView.d0.onAbsorb(i5);
                            }
                        }
                        if (currVelocity < 0) {
                            recyclerView.C();
                            if (recyclerView.c0.isFinished()) {
                                recyclerView.c0.onAbsorb(-currVelocity);
                            }
                        } else if (currVelocity > 0) {
                            recyclerView.z();
                            if (recyclerView.e0.isFinished()) {
                                recyclerView.e0.onAbsorb(currVelocity);
                            }
                        }
                        if (i5 != 0 || currVelocity != 0) {
                            recyclerView.postInvalidateOnAnimation();
                        }
                    }
                    if (RecyclerView.X0) {
                        androidx.recyclerview.widget.q.b bVar = recyclerView.w0;
                        int[] iArr4 = bVar.c;
                        if (iArr4 != null) {
                            Arrays.fill(iArr4, -1);
                        }
                        bVar.d = 0;
                    }
                } else {
                    b();
                    androidx.recyclerview.widget.q qVar = recyclerView.v0;
                    if (qVar != null) {
                        qVar.a(recyclerView, i3, i4);
                    }
                }
                if (Build.VERSION.SDK_INT >= 35) {
                    i.a(recyclerView, Math.abs(overScroller.getCurrVelocity()));
                }
            }
            y yVar3 = recyclerView.C.e;
            if (yVar3 != null && yVar3.d) {
                yVar3.b(0, 0);
            }
            this.e = false;
            if (!this.f) {
                recyclerView.setScrollState(0);
                recyclerView.w0(1);
            } else {
                recyclerView.removeCallbacks(this);
                WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
                recyclerView.postOnAnimation(this);
            }
        }
    }

    public class d {
        public d() {
        }
    }

    public static abstract class d0 {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.EMPTY_LIST;
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
        public final View itemView;
        f<? extends d0> mBindingAdapter;
        int mFlags;
        WeakReference<RecyclerView> mNestedRecyclerView;
        RecyclerView mOwnerRecyclerView;
        int mPosition = -1;
        int mOldPosition = -1;
        long mItemId = -1;
        int mItemViewType = -1;
        int mPreLayoutPosition = -1;
        d0 mShadowedHolder = null;
        d0 mShadowingHolder = null;
        List<Object> mPayloads = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        u mScrapContainer = null;
        boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;
        int mPendingAccessibilityState = -1;

        public d0(View view) {
            if (view != null) {
                this.itemView = view;
            } else {
                hb5.a("itemView may not be null");
                throw null;
            }
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        public void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(FLAG_ADAPTER_FULLUPDATE);
            } else if ((FLAG_ADAPTER_FULLUPDATE & this.mFlags) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        public void addFlags(int i) {
            this.mFlags = i | this.mFlags;
        }

        public void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        public void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        public void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        public void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        public boolean doesTransientStatePreventRecycling() {
            if ((this.mFlags & 16) != 0) {
                return false;
            }
            View view = this.itemView;
            WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
            return view.hasTransientState();
        }

        public void flagRemovedAndOffsetPosition(int i, int i2, boolean z) {
            addFlags(8);
            offsetPosition(i2, z);
            this.mPosition = i;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.N(this);
        }

        @Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        public final f<? extends d0> getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            f adapter;
            int iN;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (iN = this.mOwnerRecyclerView.N(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, iN);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        public List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & FLAG_ADAPTER_FULLUPDATE) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            List<Object> list = this.mPayloads;
            return (list == null || list.size() == 0) ? FULLUPDATE_PAYLOADS : this.mUnmodifiedPayloads;
        }

        public boolean hasAnyOfTheFlags(int i) {
            return (this.mFlags & i) != 0;
        }

        public boolean isAdapterPositionUnknown() {
            return (this.mFlags & FLAG_ADAPTER_POSITION_UNKNOWN) != 0 || isInvalid();
        }

        public boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        public boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        public boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            if ((this.mFlags & 16) != 0) {
                return false;
            }
            View view = this.itemView;
            WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
            return !view.hasTransientState();
        }

        public boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        public boolean isScrap() {
            return this.mScrapContainer != null;
        }

        public boolean isTmpDetached() {
            return (this.mFlags & FLAG_TMP_DETACHED) != 0;
        }

        public boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        public boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        public void offsetPosition(int i, boolean z) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            int i2 = this.mPreLayoutPosition;
            if (i2 == -1) {
                i2 = this.mPosition;
                this.mPreLayoutPosition = i2;
            }
            if (z) {
                this.mPreLayoutPosition = i2 + i;
            }
            this.mPosition += i;
            if (this.itemView.getLayoutParams() != null) {
                ((LayoutParams) this.itemView.getLayoutParams()).c = true;
            }
        }

        public void onEnteredHiddenState(RecyclerView recyclerView) {
            int i = this.mPendingAccessibilityState;
            if (i != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = this.itemView.getImportantForAccessibility();
            }
            if (!recyclerView.V()) {
                this.itemView.setImportantForAccessibility(4);
            } else {
                this.mPendingAccessibilityState = 4;
                recyclerView.K0.add(this);
            }
        }

        public void onLeftHiddenState(RecyclerView recyclerView) {
            int i = this.mWasImportantForAccessibilityBeforeHidden;
            if (recyclerView.V()) {
                this.mPendingAccessibilityState = i;
                recyclerView.K0.add(this);
            } else {
                this.itemView.setImportantForAccessibility(i);
            }
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        public void resetInternal() {
            if (RecyclerView.S0 && isTmpDetached()) {
                lx5.b(this, "Attempting to reset temp-detached ViewHolder: ", ". ViewHolders should be fully detached before resetting.");
                return;
            }
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.m(this);
        }

        public void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        public void setFlags(int i, int i2) {
            this.mFlags = (i & i2) | (this.mFlags & (~i2));
        }

        public final void setIsRecyclable(boolean z) {
            int i = this.mIsRecyclableCount;
            int i2 = z ? i - 1 : i + 1;
            this.mIsRecyclableCount = i2;
            if (i2 < 0) {
                this.mIsRecyclableCount = 0;
                if (RecyclerView.S0) {
                    ojh.a(this, "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
                    return;
                } else {
                    Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                }
            } else if (!z && i2 == 1) {
                this.mFlags |= 16;
            } else if (z && i2 == 0) {
                this.mFlags &= -17;
            }
            if (RecyclerView.T0) {
                Log.d("RecyclerView", "setIsRecyclable val:" + z + ":" + this);
            }
        }

        public void setScrapContainer(u uVar, boolean z) {
            this.mScrapContainer = uVar;
            this.mInChangeScrap = z;
        }

        public boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        public boolean shouldIgnore() {
            return (this.mFlags & 128) != 0;
        }

        public void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            StringBuilder sbB = mq0.b(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
            sbB.append(Integer.toHexString(hashCode()));
            sbB.append(" position=");
            sbB.append(this.mPosition);
            sbB.append(" id=");
            sbB.append(this.mItemId);
            sbB.append(", oldPos=");
            sbB.append(this.mOldPosition);
            sbB.append(", pLpos:");
            sbB.append(this.mPreLayoutPosition);
            StringBuilder sb = new StringBuilder(sbB.toString());
            if (isScrap()) {
                sb.append(" scrap ");
                sb.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb.append(" invalid");
            }
            if (!isBound()) {
                sb.append(" unbound");
            }
            if (needsUpdate()) {
                sb.append(" update");
            }
            if (isRemoved()) {
                sb.append(" removed");
            }
            if (shouldIgnore()) {
                sb.append(" ignored");
            }
            if (isTmpDetached()) {
                sb.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        public void unScrap() {
            this.mScrapContainer.m(this);
        }

        public boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }
    }

    public class e implements upe {
        public e() {
        }

        @Override // defpackage.upe
        public final boolean a(float f) {
            int i;
            int i2;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.C.t()) {
                i2 = (int) f;
                i = 0;
            } else if (recyclerView.C.s()) {
                i = (int) f;
                i2 = 0;
            } else {
                i = 0;
                i2 = 0;
            }
            if (i == 0 && i2 == 0) {
                return false;
            }
            recyclerView.x0();
            return recyclerView.M(i, i2, 0, Reader.READ_DONE);
        }

        @Override // defpackage.upe
        public final float b() {
            float f;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.C.t()) {
                f = recyclerView.s0;
            } else {
                if (!recyclerView.C.s()) {
                    return 0.0f;
                }
                f = recyclerView.r0;
            }
            return -f;
        }

        @Override // defpackage.upe
        public final void c() {
            RecyclerView.this.x0();
        }
    }

    public static class g extends Observable<h> {
        public final boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public final void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((h) ((Observable) this).mObservers.get(size)).a();
            }
        }

        public final void c(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((h) ((Observable) this).mObservers.get(size)).e(i, i2);
            }
        }

        public final void d(int i, int i2, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((h) ((Observable) this).mObservers.get(size)).c(i, i2, obj);
            }
        }

        public final void e(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((h) ((Observable) this).mObservers.get(size)).d(i, i2);
            }
        }

        public final void f(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((h) ((Observable) this).mObservers.get(size)).f(i, i2);
            }
        }

        public final void g() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((h) ((Observable) this).mObservers.get(size)).g();
            }
        }
    }

    public static final class i {
        public static void a(View view, float f) {
            try {
                view.setFrameContentVelocity(f);
            } catch (LinkageError unused) {
            }
        }
    }

    public interface j {
    }

    public static class k {
    }

    public static abstract class l {
        public m a = null;
        public final ArrayList<a> b = new ArrayList<>();
        public final long c = 120;
        public final long d = 120;
        public final long e = 250;
        public long f = 250;

        public interface a {
            void a();
        }

        public static class b {
            public int a;
            public int b;

            public final void a(d0 d0Var) {
                View view = d0Var.itemView;
                this.a = view.getLeft();
                this.b = view.getTop();
                view.getRight();
                view.getBottom();
            }
        }

        public static void e(d0 d0Var) {
            int i = d0Var.mFlags;
            if (!d0Var.isInvalid() && (i & 4) == 0) {
                d0Var.getOldPosition();
                d0Var.getAbsoluteAdapterPosition();
            }
        }

        public abstract boolean a(d0 d0Var, b bVar, b bVar2);

        public abstract boolean b(d0 d0Var, d0 d0Var2, b bVar, b bVar2);

        public abstract boolean c(d0 d0Var, b bVar, b bVar2);

        public abstract boolean d(d0 d0Var, b bVar, b bVar2);

        public abstract boolean f(d0 d0Var);

        public boolean g(d0 d0Var, List<Object> list) {
            return f(d0Var);
        }

        /* JADX WARN: Code duplicated, block: B:32:0x0066  */
        /* JADX WARN: Code duplicated, block: B:34:0x0074  */
        /* JADX WARN: Instruction removed from duplicated block: B:34:0x0074, please report this as an issue */
        public final void h(d0 d0Var) {
            m mVar = this.a;
            if (mVar != null) {
                RecyclerView recyclerView = RecyclerView.this;
                boolean z = true;
                d0Var.setIsRecyclable(true);
                if (d0Var.mShadowedHolder != null && d0Var.mShadowingHolder == null) {
                    d0Var.mShadowedHolder = null;
                }
                d0Var.mShadowingHolder = null;
                if (d0Var.shouldBeKeptAsChild()) {
                    return;
                }
                View view = d0Var.itemView;
                u uVar = recyclerView.c;
                recyclerView.t0();
                androidx.recyclerview.widget.e eVar = recyclerView.f;
                androidx.recyclerview.widget.e.a aVar = eVar.b;
                e0 e0Var = eVar.a;
                int i = eVar.d;
                if (i != 1) {
                    if (i == 2) {
                        ib5.a("Cannot call removeViewIfHidden within removeViewIfHidden");
                        return;
                    }
                    try {
                        eVar.d = 2;
                        int iIndexOfChild = e0Var.a.indexOfChild(view);
                        if (iIndexOfChild == -1) {
                            eVar.k(view);
                        } else if (aVar.d(iIndexOfChild)) {
                            aVar.f(iIndexOfChild);
                            eVar.k(view);
                            e0Var.a(iIndexOfChild);
                        } else {
                            eVar.d = 0;
                        }
                        eVar.d = 0;
                        if (z) {
                            d0 d0VarR = RecyclerView.R(view);
                            uVar.m(d0VarR);
                            uVar.j(d0VarR);
                            if (RecyclerView.T0) {
                                Log.d("RecyclerView", "after removing animated view: " + view + ", " + recyclerView);
                            }
                        }
                        recyclerView.v0(!z);
                        if (z && d0Var.isTmpDetached()) {
                            recyclerView.removeDetachedView(d0Var.itemView, false);
                            return;
                        }
                    } catch (Throwable th) {
                        eVar.d = 0;
                        throw th;
                    }
                }
                if (eVar.e != view) {
                    ib5.a("Cannot call removeViewIfHidden within removeView(At) for a different view");
                    return;
                }
                z = false;
                if (z) {
                    d0 d0VarR2 = RecyclerView.R(view);
                    uVar.m(d0VarR2);
                    uVar.j(d0VarR2);
                    if (RecyclerView.T0) {
                        Log.d("RecyclerView", "after removing animated view: " + view + ", " + recyclerView);
                    }
                }
                recyclerView.v0(!z);
                if (z) {
                }
            }
        }

        public abstract void i(d0 d0Var);

        public abstract void j();

        public abstract boolean k();

        public abstract void l();
    }

    public class m {
        public m() {
        }
    }

    public static abstract class n {
        public void f(Rect rect, View view, RecyclerView recyclerView, z zVar) {
            ((LayoutParams) view.getLayoutParams()).a.getLayoutPosition();
            rect.set(0, 0, 0, 0);
        }

        public void g(Canvas canvas, RecyclerView recyclerView, z zVar) {
        }

        @Deprecated
        public void h(Canvas canvas, RecyclerView recyclerView) {
        }

        public void i(Canvas canvas, RecyclerView recyclerView, z zVar) {
            h(canvas, recyclerView);
        }
    }

    public interface p {
        void b(View view);

        void d(View view);
    }

    public static abstract class q {
    }

    public interface r {
        void a(RecyclerView recyclerView, MotionEvent motionEvent);

        boolean c(RecyclerView recyclerView, MotionEvent motionEvent);

        void e(boolean z);
    }

    public static abstract class s {
        public void a(RecyclerView recyclerView, int i) {
        }

        public void b(RecyclerView recyclerView, int i, int i2) {
        }
    }

    public static class t {
        public SparseArray<a> a;
        public int b;
        public Set<f<?>> c;

        public static class a {
            public final ArrayList<d0> a = new ArrayList<>();
            public int b = 5;
            public long c = 0;
            public long d = 0;
        }

        public final a a(int i) {
            SparseArray<a> sparseArray = this.a;
            a aVar = sparseArray.get(i);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            sparseArray.put(i, aVar2);
            return aVar2;
        }
    }

    public final class u {
        public final ArrayList<d0> a;
        public ArrayList<d0> b;
        public final ArrayList<d0> c;
        public final List<d0> d;
        public int e;
        public int f;
        public t g;

        public u() {
            ArrayList<d0> arrayList = new ArrayList<>();
            this.a = arrayList;
            this.b = null;
            this.c = new ArrayList<>();
            this.d = Collections.unmodifiableList(arrayList);
            this.e = 2;
            this.f = 2;
        }

        public final void a(d0 d0Var, boolean z) {
            RecyclerView.m(d0Var);
            View view = d0Var.itemView;
            RecyclerView recyclerView = RecyclerView.this;
            g0 g0Var = recyclerView.E0;
            if (g0Var != null) {
                g0.a aVar = g0Var.e;
                r6i0.p(view, aVar != null ? (e6) aVar.e.remove(view) : null);
            }
            if (z) {
                v vVar = recyclerView.D;
                ArrayList arrayList = recyclerView.E;
                if (vVar != null) {
                    vVar.a();
                }
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((v) arrayList.get(i)).a();
                }
                f fVar = recyclerView.B;
                if (fVar != null) {
                    fVar.onViewRecycled(d0Var);
                }
                if (recyclerView.x0 != null) {
                    recyclerView.i.d(d0Var);
                }
                if (RecyclerView.T0) {
                    Log.d("RecyclerView", "dispatchViewRecycled: " + d0Var);
                }
            }
            d0Var.mBindingAdapter = null;
            d0Var.mOwnerRecyclerView = null;
            t tVarC = c();
            tVarC.getClass();
            int itemViewType = d0Var.getItemViewType();
            ArrayList<d0> arrayList2 = tVarC.a(itemViewType).a;
            if (tVarC.a.get(itemViewType).b <= arrayList2.size()) {
                wue.a(d0Var.itemView);
            } else if (RecyclerView.S0 && arrayList2.contains(d0Var)) {
                hb5.a("this scrap item already exists");
            } else {
                d0Var.resetInternal();
                arrayList2.add(d0Var);
            }
        }

        public final int b(int i) {
            RecyclerView recyclerView = RecyclerView.this;
            z zVar = recyclerView.x0;
            if (i >= 0 && i < zVar.b()) {
                return !zVar.g ? i : recyclerView.e.f(i, 0);
            }
            StringBuilder sbA = efe0.a(i, "invalid position ", ". State item count is ");
            sbA.append(zVar.b());
            sbA.append(recyclerView.D());
            throw new IndexOutOfBoundsException(sbA.toString());
        }

        public final t c() {
            if (this.g == null) {
                t tVar = new t();
                tVar.a = new SparseArray<>();
                tVar.b = 0;
                tVar.c = Collections.newSetFromMap(new IdentityHashMap());
                this.g = tVar;
                e();
            }
            return this.g;
        }

        public final View d(int i) {
            return l(i, Long.MAX_VALUE).itemView;
        }

        public final void e() {
            RecyclerView recyclerView;
            f<?> fVar;
            t tVar = this.g;
            if (tVar == null || (fVar = (recyclerView = RecyclerView.this).B) == null || !recyclerView.I) {
                return;
            }
            tVar.c.add(fVar);
        }

        public final void f(f<?> fVar, boolean z) {
            t tVar = this.g;
            if (tVar != null) {
                SparseArray<t.a> sparseArray = tVar.a;
                Set<f<?>> set = tVar.c;
                set.remove(fVar);
                if (set.size() != 0 || z) {
                    return;
                }
                for (int i = 0; i < sparseArray.size(); i++) {
                    ArrayList<d0> arrayList = sparseArray.get(sparseArray.keyAt(i)).a;
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        wue.a(arrayList.get(i2).itemView);
                    }
                }
            }
        }

        public final void g() {
            ArrayList<d0> arrayList = this.c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                h(size);
            }
            arrayList.clear();
            if (RecyclerView.X0) {
                androidx.recyclerview.widget.q.b bVar = RecyclerView.this.w0;
                int[] iArr = bVar.c;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                bVar.d = 0;
            }
        }

        public final void h(int i) {
            if (RecyclerView.T0) {
                Log.d("RecyclerView", "Recycling cached view at index " + i);
            }
            ArrayList<d0> arrayList = this.c;
            d0 d0Var = arrayList.get(i);
            if (RecyclerView.T0) {
                Log.d("RecyclerView", "CachedViewHolder to be recycled: " + d0Var);
            }
            a(d0Var, true);
            arrayList.remove(i);
        }

        public final void i(View view) {
            d0 d0VarR = RecyclerView.R(view);
            boolean zIsTmpDetached = d0VarR.isTmpDetached();
            RecyclerView recyclerView = RecyclerView.this;
            if (zIsTmpDetached) {
                recyclerView.removeDetachedView(view, false);
            }
            if (d0VarR.isScrap()) {
                d0VarR.unScrap();
            } else if (d0VarR.wasReturnedFromScrap()) {
                d0VarR.clearReturnedFromScrapFlag();
            }
            j(d0VarR);
            if (recyclerView.f0 == null || d0VarR.isRecyclable()) {
                return;
            }
            recyclerView.f0.i(d0VarR);
        }

        /* JADX WARN: Code duplicated, block: B:54:0x00af  */
        /* JADX WARN: Code duplicated, block: B:56:0x00bb  */
        /* JADX WARN: Code duplicated, block: B:58:0x00c2  */
        /* JADX WARN: Code duplicated, block: B:61:0x00cb A[LOOP:2: B:57:0x00c0->B:61:0x00cb, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:87:0x00ce A[EDGE_INSN: B:87:0x00ce->B:62:0x00ce BREAK  A[LOOP:1: B:53:0x00ad->B:60:0x00c8], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:88:0x00ce A[EDGE_INSN: B:88:0x00ce->B:62:0x00ce BREAK  A[LOOP:1: B:53:0x00ad->B:60:0x00c8, LOOP_LABEL: LOOP:1: B:53:0x00ad->B:60:0x00c8], SYNTHETIC] */
        public final void j(d0 d0Var) {
            boolean z;
            int i;
            int i2;
            int i3;
            int i4;
            RecyclerView recyclerView = RecyclerView.this;
            androidx.recyclerview.widget.q.b bVar = recyclerView.w0;
            boolean z2 = false;
            boolean z3 = true;
            if (d0Var.isScrap() || d0Var.itemView.getParent() != null) {
                StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(d0Var.isScrap());
                sb.append(" isAttached:");
                sb.append(d0Var.itemView.getParent() != null);
                sb.append(recyclerView.D());
                throw new IllegalArgumentException(sb.toString());
            }
            if (d0Var.isTmpDetached()) {
                StringBuilder sb2 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
                sb2.append(d0Var);
                f87.b(sb2, recyclerView.D());
                return;
            }
            if (d0Var.shouldIgnore()) {
                hb5.a("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.".concat(recyclerView.D()));
                return;
            }
            boolean zDoesTransientStatePreventRecycling = d0Var.doesTransientStatePreventRecycling();
            f fVar = recyclerView.B;
            boolean z4 = fVar != null && zDoesTransientStatePreventRecycling && fVar.onFailedToRecycleView(d0Var);
            boolean z5 = RecyclerView.S0;
            ArrayList<d0> arrayList = this.c;
            if (z5 && arrayList.contains(d0Var)) {
                StringBuilder sb3 = new StringBuilder("cached view received recycle internal? ");
                sb3.append(d0Var);
                f87.b(sb3, recyclerView.D());
                return;
            }
            if (z4 || d0Var.isRecyclable()) {
                if (this.f <= 0 || d0Var.hasAnyOfTheFlags(526)) {
                    z = false;
                } else {
                    int size = arrayList.size();
                    if (size >= this.f && size > 0) {
                        h(0);
                        size--;
                    }
                    if (RecyclerView.X0 && size > 0) {
                        int i5 = d0Var.mPosition;
                        if (bVar.c != null) {
                            int i6 = bVar.d * 2;
                            int i7 = 0;
                            while (true) {
                                if (i7 >= i6) {
                                    i = size - 1;
                                    loop1: while (i >= 0) {
                                        i2 = arrayList.get(i).mPosition;
                                        if (bVar.c != null) {
                                            break;
                                        }
                                        i3 = bVar.d * 2;
                                        i4 = 0;
                                        while (true) {
                                            if (i4 < i3) {
                                                break loop1;
                                            } else if (bVar.c[i4] == i2) {
                                                break;
                                            } else {
                                                i4 += 2;
                                            }
                                        }
                                        i--;
                                    }
                                    size = i + 1;
                                } else if (bVar.c[i7] != i5) {
                                    i7 += 2;
                                }
                            }
                        } else {
                            i = size - 1;
                            loop1: while (i >= 0) {
                                i2 = arrayList.get(i).mPosition;
                                if (bVar.c != null) {
                                    break;
                                    break;
                                }
                                i3 = bVar.d * 2;
                                i4 = 0;
                                while (true) {
                                    if (i4 < i3) {
                                        break loop1;
                                        break loop1;
                                    } else if (bVar.c[i4] == i2) {
                                        break;
                                    } else {
                                        i4 += 2;
                                    }
                                }
                                i--;
                            }
                            size = i + 1;
                        }
                    }
                    arrayList.add(size, d0Var);
                    z = true;
                }
                if (z) {
                    z3 = false;
                } else {
                    a(d0Var, true);
                }
                z2 = z;
            } else {
                if (RecyclerView.T0) {
                    Log.d("RecyclerView", "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists".concat(recyclerView.D()));
                }
                z3 = false;
            }
            recyclerView.i.d(d0Var);
            if (z2 || z3 || !zDoesTransientStatePreventRecycling) {
                return;
            }
            wue.a(d0Var.itemView);
            d0Var.mBindingAdapter = null;
            d0Var.mOwnerRecyclerView = null;
        }

        public final void k(View view) {
            l lVar;
            d0 d0VarR = RecyclerView.R(view);
            boolean zHasAnyOfTheFlags = d0VarR.hasAnyOfTheFlags(12);
            RecyclerView recyclerView = RecyclerView.this;
            if (!zHasAnyOfTheFlags && d0VarR.isUpdated() && (lVar = recyclerView.f0) != null && !lVar.g(d0VarR, d0VarR.getUnmodifiedPayloads())) {
                if (this.b == null) {
                    this.b = new ArrayList<>();
                }
                d0VarR.setScrapContainer(this, true);
                this.b.add(d0VarR);
                return;
            }
            if (d0VarR.isInvalid() && !d0VarR.isRemoved() && !recyclerView.B.hasStableIds()) {
                hb5.a("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(recyclerView.D()));
            } else {
                d0VarR.setScrapContainer(this, false);
                this.a.add(d0VarR);
            }
        }

        /* JADX WARN: Code duplicated, block: B:102:0x01a6  */
        /* JADX WARN: Code duplicated, block: B:104:0x01ac  */
        /* JADX WARN: Code duplicated, block: B:112:0x01c6  */
        /* JADX WARN: Code duplicated, block: B:127:0x0202  */
        /* JADX WARN: Code duplicated, block: B:129:0x020c  */
        /* JADX WARN: Code duplicated, block: B:130:0x0215  */
        /* JADX WARN: Code duplicated, block: B:132:0x021b  */
        /* JADX WARN: Code duplicated, block: B:134:0x0223  */
        /* JADX WARN: Code duplicated, block: B:137:0x0241  */
        /* JADX WARN: Code duplicated, block: B:140:0x024c  */
        /* JADX WARN: Code duplicated, block: B:142:0x0254  */
        /* JADX WARN: Code duplicated, block: B:144:0x025e  */
        /* JADX WARN: Code duplicated, block: B:146:0x026c  */
        /* JADX WARN: Code duplicated, block: B:148:0x027a  */
        /* JADX WARN: Code duplicated, block: B:161:0x02c4  */
        /* JADX WARN: Code duplicated, block: B:165:0x02d3  */
        /* JADX WARN: Code duplicated, block: B:176:0x02fc  */
        /* JADX WARN: Code duplicated, block: B:177:0x0301  */
        /* JADX WARN: Code duplicated, block: B:179:0x0305  */
        /* JADX WARN: Code duplicated, block: B:181:0x0309  */
        /* JADX WARN: Code duplicated, block: B:184:0x032d  */
        /* JADX WARN: Code duplicated, block: B:186:0x0335  */
        /* JADX WARN: Code duplicated, block: B:188:0x033d  */
        /* JADX WARN: Code duplicated, block: B:191:0x0350 A[LOOP:3: B:187:0x033b->B:191:0x0350, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:192:0x0353 A[EDGE_INSN: B:192:0x0353->B:193:0x0354 BREAK  A[LOOP:3: B:187:0x033b->B:191:0x0350]] */
        /* JADX WARN: Code duplicated, block: B:194:0x0356  */
        /* JADX WARN: Code duplicated, block: B:197:0x035e  */
        /* JADX WARN: Code duplicated, block: B:199:0x0366  */
        /* JADX WARN: Code duplicated, block: B:213:0x03a4  */
        /* JADX WARN: Code duplicated, block: B:216:0x03b1  */
        /* JADX WARN: Code duplicated, block: B:220:0x03da  */
        /* JADX WARN: Code duplicated, block: B:228:0x03f3  */
        /* JADX WARN: Code duplicated, block: B:234:0x0416  */
        /* JADX WARN: Code duplicated, block: B:236:0x041c  */
        /* JADX WARN: Code duplicated, block: B:242:0x042e  */
        /* JADX WARN: Code duplicated, block: B:244:0x0432  */
        /* JADX WARN: Code duplicated, block: B:251:0x0461  */
        /* JADX WARN: Code duplicated, block: B:253:0x046d  */
        /* JADX WARN: Code duplicated, block: B:257:0x0478  */
        /* JADX WARN: Code duplicated, block: B:258:0x048a  */
        /* JADX WARN: Code duplicated, block: B:261:0x0492  */
        /* JADX WARN: Code duplicated, block: B:265:0x04ad  */
        /* JADX WARN: Code duplicated, block: B:268:0x04ba  */
        /* JADX WARN: Code duplicated, block: B:290:0x04fb  */
        /* JADX WARN: Code duplicated, block: B:293:0x0501  */
        /* JADX WARN: Code duplicated, block: B:297:0x050c  */
        /* JADX WARN: Code duplicated, block: B:298:0x0518  */
        /* JADX WARN: Code duplicated, block: B:300:0x051e  */
        /* JADX WARN: Code duplicated, block: B:301:0x052a  */
        /* JADX WARN: Code duplicated, block: B:304:0x0530 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:306:0x0534  */
        /* JADX WARN: Code duplicated, block: B:317:0x00c3 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:322:0x02c9 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:326:0x0353 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:327:0x0349 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:328:0x02f5 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:332:0x00f0 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:337:0x01a3 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:35:0x0080 A[EDGE_INSN: B:35:0x0080->B:36:0x0081 BREAK  A[LOOP:0: B:14:0x0024->B:20:0x003e]] */
        /* JADX WARN: Code duplicated, block: B:42:0x008f  */
        /* JADX WARN: Code duplicated, block: B:44:0x0096  */
        /* JADX WARN: Code duplicated, block: B:58:0x00ce  */
        /* JADX WARN: Code duplicated, block: B:68:0x00f5  */
        /* JADX WARN: Code duplicated, block: B:70:0x0107  */
        /* JADX WARN: Code duplicated, block: B:72:0x010d  */
        /* JADX WARN: Code duplicated, block: B:77:0x0129  */
        /* JADX WARN: Code duplicated, block: B:80:0x0132 A[EDGE_INSN: B:80:0x0132->B:101:0x01a4 BREAK  A[LOOP:1: B:43:0x0094->B:55:0x00c0]] */
        /* JADX WARN: Code duplicated, block: B:81:0x0141  */
        /* JADX WARN: Code duplicated, block: B:83:0x0153  */
        /* JADX WARN: Code duplicated, block: B:85:0x0159  */
        /* JADX WARN: Code duplicated, block: B:87:0x015f  */
        /* JADX WARN: Code duplicated, block: B:89:0x0166  */
        /* JADX WARN: Instruction removed from duplicated block: B:181:0x0309, please report this as an issue */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v11 */
        /* JADX WARN: Type inference failed for: r7v12, types: [boolean] */
        /* JADX WARN: Type inference failed for: r7v13 */
        /* JADX WARN: Type inference failed for: r7v45 */
        /* JADX WARN: Type inference failed for: r7v48 */
        /* JADX WARN: Type inference failed for: r7v51 */
        /* JADX WARN: Type inference failed for: r7v59 */
        public final d0 l(int i, long j) {
            d0 d0Var;
            int i2;
            ArrayList<d0> arrayList;
            ArrayList<d0> arrayList2;
            int i3;
            long j2;
            long j3;
            int itemViewType;
            int i4;
            long nanoTime;
            long j4;
            AccessibilityManager accessibilityManager;
            int i5;
            int i6;
            long j5;
            ViewGroup.LayoutParams layoutParams;
            LayoutParams layoutParams2;
            ?? r7;
            int iF;
            int itemViewType2;
            d0 d0VarCreateViewHolder;
            long nanoTime2;
            long j6;
            RecyclerView recyclerViewJ;
            long j7;
            t.a aVar;
            d0 d0VarRemove;
            ArrayList<d0> arrayList3;
            int size;
            long itemId;
            int size2;
            int size3;
            d0 d0Var2;
            d0 d0Var3;
            int size4;
            int i7;
            ArrayList arrayList4;
            int size5;
            int i8;
            View view;
            int size6;
            int i9;
            d0 d0Var4;
            d0 d0VarR;
            androidx.recyclerview.widget.e eVar;
            androidx.recyclerview.widget.e.a aVar2;
            int iIndexOfChild;
            androidx.recyclerview.widget.e.a aVar3;
            int iIndexOfChild2;
            int iB;
            d0 d0VarR2;
            int i10;
            ?? r8;
            d0 d0Var5;
            int size7;
            int iF2;
            RecyclerView recyclerView = RecyclerView.this;
            z zVar = recyclerView.x0;
            if (i < 0 || i >= zVar.b()) {
                StringBuilder sbA = dy5.a("Invalid item position ", i, i, "(", "). Item count:");
                sbA.append(zVar.b());
                sbA.append(recyclerView.D());
                throw new IndexOutOfBoundsException(sbA.toString());
            }
            e6 e6Var = null;
            if (zVar.g) {
                ArrayList<d0> arrayList5 = this.b;
                if (arrayList5 != null && (size7 = arrayList5.size()) != 0) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size7) {
                            if (recyclerView.B.hasStableIds() && (iF2 = recyclerView.e.f(i, 0)) > 0 && iF2 < recyclerView.B.getItemCount()) {
                                long itemId2 = recyclerView.B.getItemId(iF2);
                                int i12 = 0;
                                while (true) {
                                    if (i12 >= size7) {
                                        d0Var = null;
                                        break;
                                    }
                                    d0 d0Var6 = this.b.get(i12);
                                    if (!d0Var6.wasReturnedFromScrap() && d0Var6.getItemId() == itemId2) {
                                        d0Var6.addFlags(32);
                                        d0Var = d0Var6;
                                        break;
                                    }
                                    i12++;
                                }
                            } else {
                                d0Var = null;
                                break;
                            }
                        } else {
                            d0Var = this.b.get(i11);
                            if (!d0Var.wasReturnedFromScrap() && d0Var.getLayoutPosition() == i) {
                                d0Var.addFlags(32);
                                break;
                            }
                            i11++;
                        }
                    }
                } else {
                    d0Var = null;
                    break;
                }
                if (d0Var != null) {
                    i2 = 1;
                }
                arrayList = this.a;
                arrayList2 = this.c;
                if (d0Var == null) {
                    size4 = arrayList.size();
                    i7 = 0;
                    while (true) {
                        if (i7 < size4) {
                            arrayList4 = recyclerView.f.c;
                            size5 = arrayList4.size();
                            i8 = 0;
                            while (true) {
                                if (i8 < size5) {
                                    i3 = 1;
                                    view = null;
                                    break;
                                }
                                view = (View) arrayList4.get(i8);
                                d0VarR2 = RecyclerView.R(view);
                                i3 = 1;
                                if (d0VarR2.getLayoutPosition() != i && !d0VarR2.isInvalid() && !d0VarR2.isRemoved()) {
                                    break;
                                }
                                i8++;
                            }
                            if (view != null) {
                                size6 = arrayList2.size();
                                i9 = 0;
                                while (true) {
                                    if (i9 < size6) {
                                        d0Var = null;
                                        break;
                                    }
                                    d0Var4 = arrayList2.get(i9);
                                    if (d0Var4.isInvalid() && d0Var4.getLayoutPosition() == i && !d0Var4.isAttachedToTransitionOverlay()) {
                                        arrayList2.remove(i9);
                                        if (RecyclerView.T0) {
                                            Log.d("RecyclerView", "getScrapOrHiddenOrCachedHolderForPosition(" + i + ") found match in cache: " + d0Var4);
                                        }
                                        d0Var = d0Var4;
                                        break;
                                    }
                                    i9++;
                                }
                            } else {
                                d0VarR = RecyclerView.R(view);
                                eVar = recyclerView.f;
                                aVar2 = eVar.b;
                                iIndexOfChild = eVar.a.a.indexOfChild(view);
                                if (iIndexOfChild >= 0) {
                                    z9l.a(view, "view is not a child, cannot hide ");
                                    return null;
                                }
                                if (aVar2.d(iIndexOfChild)) {
                                    ojh.a(view, "trying to unhide a view that was not hidden");
                                    return null;
                                }
                                aVar2.a(iIndexOfChild);
                                eVar.k(view);
                                androidx.recyclerview.widget.e eVar2 = recyclerView.f;
                                aVar3 = eVar2.b;
                                iIndexOfChild2 = eVar2.a.a.indexOfChild(view);
                                if (iIndexOfChild2 == -1 && !aVar3.d(iIndexOfChild2)) {
                                    iB = iIndexOfChild2 - aVar3.b(iIndexOfChild2);
                                } else {
                                    iB = -1;
                                }
                                if (iB != -1) {
                                    StringBuilder sb = new StringBuilder("layout index should not be -1 after unhiding a view:");
                                    sb.append(d0VarR);
                                    lpd0.a(sb, recyclerView.D());
                                    return null;
                                }
                                recyclerView.f.c(iB);
                                k(view);
                                d0VarR.addFlags(8224);
                                d0Var = d0VarR;
                                break;
                            }
                        } else {
                            d0Var5 = arrayList.get(i7);
                            if (d0Var5.wasReturnedFromScrap() && d0Var5.getLayoutPosition() == i && !d0Var5.isInvalid() && (zVar.g || !d0Var5.isRemoved())) {
                                d0Var5.addFlags(32);
                                d0Var = d0Var5;
                                i3 = 1;
                                break;
                            }
                            i7++;
                        }
                    }
                    if (d0Var != null) {
                        if (d0Var.isRemoved()) {
                            i10 = d0Var.mPosition;
                            if (i10 >= 0 || i10 >= recyclerView.B.getItemCount()) {
                                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + d0Var + recyclerView.D());
                            }
                            r8 = ((zVar.g || recyclerView.B.getItemViewType(d0Var.mPosition) == d0Var.getItemViewType()) && (!recyclerView.B.hasStableIds() || d0Var.getItemId() == recyclerView.B.getItemId(d0Var.mPosition))) ? i3 : 0;
                        } else {
                            if (!RecyclerView.S0 && !zVar.g) {
                                ib5.a("should not receive a removed view unless it is pre layout".concat(recyclerView.D()));
                                return null;
                            }
                            r8 = zVar.g;
                        }
                        if (r8 == 0) {
                            d0Var.addFlags(4);
                            if (d0Var.isScrap()) {
                                recyclerView.removeDetachedView(d0Var.itemView, false);
                                d0Var.unScrap();
                            } else if (d0Var.wasReturnedFromScrap()) {
                                d0Var.clearReturnedFromScrapFlag();
                            }
                            j(d0Var);
                            d0Var = null;
                        } else {
                            i2 = i3;
                        }
                    }
                } else {
                    i3 = 1;
                }
                if (d0Var == null) {
                    iF = recyclerView.e.f(i, 0);
                    if (iF >= 0) {
                        j2 = 3;
                        if (iF < recyclerView.B.getItemCount()) {
                            itemViewType2 = recyclerView.B.getItemViewType(iF);
                            if (recyclerView.B.hasStableIds()) {
                                itemId = recyclerView.B.getItemId(iF);
                                size2 = arrayList.size() - 1;
                                while (true) {
                                    if (size2 >= 0) {
                                        j3 = 4;
                                        size3 = arrayList2.size() - 1;
                                        while (true) {
                                            if (size3 >= 0) {
                                                d0Var2 = arrayList2.get(size3);
                                                if (d0Var2.getItemId() == itemId || d0Var2.isAttachedToTransitionOverlay()) {
                                                    size3--;
                                                } else {
                                                    if (itemViewType2 == d0Var2.getItemViewType()) {
                                                        arrayList2.remove(size3);
                                                        d0Var = d0Var2;
                                                        break;
                                                    }
                                                    h(size3);
                                                }
                                            }
                                            d0Var = null;
                                            break;
                                        }
                                    }
                                    d0Var3 = arrayList.get(size2);
                                    if (d0Var3.getItemId() != itemId && !d0Var3.wasReturnedFromScrap()) {
                                        j3 = 4;
                                        if (itemViewType2 == d0Var3.getItemViewType()) {
                                            d0Var3.addFlags(32);
                                            if (d0Var3.isRemoved() && !zVar.g) {
                                                d0Var3.setFlags(2, 14);
                                            }
                                            d0Var = d0Var3;
                                            break;
                                        }
                                        arrayList.remove(size2);
                                        recyclerView.removeDetachedView(d0Var3.itemView, false);
                                        d0 d0VarR3 = RecyclerView.R(d0Var3.itemView);
                                        d0VarR3.mScrapContainer = null;
                                        d0VarR3.mInChangeScrap = false;
                                        d0VarR3.clearReturnedFromScrapFlag();
                                        j(d0VarR3);
                                    }
                                    size2--;
                                }
                                if (d0Var != null) {
                                    d0Var.mPosition = iF;
                                    i2 = i3;
                                }
                            } else {
                                j3 = 4;
                            }
                            if (d0Var == null) {
                                if (RecyclerView.T0) {
                                    Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline(" + i + ") fetching from shared pool");
                                }
                                aVar = c().a.get(itemViewType2);
                                if (aVar != null) {
                                    d0VarRemove = null;
                                    break;
                                }
                                arrayList3 = aVar.a;
                                if (arrayList3.isEmpty()) {
                                    size = arrayList3.size() - 1;
                                    while (true) {
                                        if (size >= 0) {
                                            d0VarRemove = null;
                                            break;
                                        }
                                        if (!arrayList3.get(size).isAttachedToTransitionOverlay()) {
                                            d0VarRemove = arrayList3.remove(size);
                                            break;
                                        }
                                        size--;
                                    }
                                } else {
                                    d0VarRemove = null;
                                    break;
                                }
                                if (d0VarRemove != null) {
                                    d0VarRemove.resetInternal();
                                    boolean z = RecyclerView.S0;
                                }
                                d0Var = d0VarRemove;
                            }
                            if (d0Var == null) {
                                long nanoTime3 = recyclerView.getNanoTime();
                                if (j != Long.MAX_VALUE) {
                                    j7 = this.g.a(itemViewType2).c;
                                    if (j7 != 0 && j7 + nanoTime3 >= j) {
                                        return null;
                                    }
                                }
                                d0VarCreateViewHolder = recyclerView.B.createViewHolder(recyclerView, itemViewType2);
                                if (RecyclerView.X0 && (recyclerViewJ = RecyclerView.J(d0VarCreateViewHolder.itemView)) != null) {
                                    d0VarCreateViewHolder.mNestedRecyclerView = new WeakReference<>(recyclerViewJ);
                                }
                                nanoTime2 = recyclerView.getNanoTime() - nanoTime3;
                                t.a aVarA = this.g.a(itemViewType2);
                                j6 = aVarA.c;
                                if (j6 != 0) {
                                    nanoTime2 = (nanoTime2 / j3) + ((j6 / j3) * 3);
                                }
                                aVarA.c = nanoTime2;
                                if (RecyclerView.T0) {
                                    Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline created new ViewHolder");
                                }
                                d0Var = d0VarCreateViewHolder;
                            }
                        }
                    }
                    StringBuilder sbA2 = dy5.a("Inconsistency detected. Invalid item position ", i, iF, "(offset:", ").state:");
                    sbA2.append(zVar.b());
                    sbA2.append(recyclerView.D());
                    throw new IndexOutOfBoundsException(sbA2.toString());
                }
                j2 = 3;
                j3 = 4;
                if (i2 != 0 && !zVar.g && d0Var.hasAnyOfTheFlags(8192)) {
                    d0Var.setFlags(0, 8192);
                    if (zVar.j) {
                        l.e(d0Var);
                        l lVar = recyclerView.f0;
                        d0Var.getUnmodifiedPayloads();
                        lVar.getClass();
                        l.b bVar = new l.b();
                        bVar.a(d0Var);
                        recyclerView.f0(d0Var, bVar);
                    }
                }
                if (zVar.g || !d0Var.isBound()) {
                    if (d0Var.isBound() || d0Var.needsUpdate() || d0Var.isInvalid()) {
                        if (!RecyclerView.S0 && d0Var.isRemoved()) {
                            StringBuilder sb2 = new StringBuilder("Removed holder should be bound and it should come here only in pre-layout. Holder: ");
                            sb2.append(d0Var);
                            lpd0.a(sb2, recyclerView.D());
                            return null;
                        }
                        int iF3 = recyclerView.e.f(i, 0);
                        d0Var.mBindingAdapter = null;
                        d0Var.mOwnerRecyclerView = recyclerView;
                        itemViewType = d0Var.getItemViewType();
                        long nanoTime4 = recyclerView.getNanoTime();
                        if (j != Long.MAX_VALUE) {
                            j5 = this.g.a(itemViewType).d;
                            if (j5 != 0 || j5 + nanoTime4 < j) {
                            }
                        }
                        if (d0Var.isTmpDetached()) {
                            recyclerView.attachViewToParent(d0Var.itemView, recyclerView.getChildCount(), d0Var.itemView.getLayoutParams());
                            i4 = i3;
                        } else {
                            i4 = 0;
                        }
                        recyclerView.B.bindViewHolder(d0Var, iF3);
                        if (i4 != 0) {
                            recyclerView.detachViewFromParent(d0Var.itemView);
                        }
                        nanoTime = recyclerView.getNanoTime() - nanoTime4;
                        t.a aVarA2 = this.g.a(d0Var.getItemViewType());
                        j4 = aVarA2.d;
                        if (j4 != 0) {
                            nanoTime = (nanoTime / j3) + ((j4 / j3) * j2);
                        }
                        aVarA2.d = nanoTime;
                        accessibilityManager = recyclerView.R;
                        if (accessibilityManager == null && accessibilityManager.isEnabled()) {
                            View view2 = d0Var.itemView;
                            if (view2.getImportantForAccessibility() == 0) {
                                i5 = i3;
                                view2.setImportantForAccessibility(i5);
                            } else {
                                i5 = i3;
                            }
                            g0 g0Var = recyclerView.E0;
                            if (g0Var != null) {
                                g0.a aVar4 = g0Var.e;
                                if (aVar4 != null) {
                                    View.AccessibilityDelegate accessibilityDelegateE = r6i0.e(view2);
                                    if (accessibilityDelegateE != null) {
                                        e6Var = accessibilityDelegateE instanceof e6.a ? ((e6.a) accessibilityDelegateE).a : new e6(accessibilityDelegateE);
                                    }
                                    if (e6Var != null && e6Var != aVar4) {
                                        aVar4.e.put(view2, e6Var);
                                    }
                                }
                                r6i0.p(view2, aVar4);
                            }
                        } else {
                            i5 = i3;
                        }
                        if (zVar.g) {
                            d0Var.mPreLayoutPosition = i;
                        }
                        i6 = i5;
                    }
                    layoutParams = d0Var.itemView.getLayoutParams();
                    if (layoutParams == null) {
                        layoutParams2 = (LayoutParams) recyclerView.generateDefaultLayoutParams();
                        d0Var.itemView.setLayoutParams(layoutParams2);
                    } else if (recyclerView.checkLayoutParams(layoutParams)) {
                        layoutParams2 = (LayoutParams) layoutParams;
                    } else {
                        layoutParams2 = (LayoutParams) recyclerView.generateLayoutParams(layoutParams);
                        d0Var.itemView.setLayoutParams(layoutParams2);
                    }
                    layoutParams2.a = d0Var;
                    if (i2 != 0 || i6 == 0) {
                        r7 = 0;
                    } else {
                        r7 = i5;
                    }
                    layoutParams2.d = r7;
                    return d0Var;
                }
                d0Var.mPreLayoutPosition = i;
                i6 = 0;
                i5 = i3;
                layoutParams = d0Var.itemView.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams2 = (LayoutParams) recyclerView.generateDefaultLayoutParams();
                    d0Var.itemView.setLayoutParams(layoutParams2);
                } else if (recyclerView.checkLayoutParams(layoutParams)) {
                    layoutParams2 = (LayoutParams) recyclerView.generateLayoutParams(layoutParams);
                    d0Var.itemView.setLayoutParams(layoutParams2);
                } else {
                    layoutParams2 = (LayoutParams) layoutParams;
                }
                layoutParams2.a = d0Var;
                if (i2 != 0) {
                    r7 = 0;
                } else {
                    r7 = 0;
                }
                layoutParams2.d = r7;
                return d0Var;
            }
            d0Var = null;
            i2 = 0;
            arrayList = this.a;
            arrayList2 = this.c;
            if (d0Var == null) {
                size4 = arrayList.size();
                i7 = 0;
                while (true) {
                    if (i7 < size4) {
                        arrayList4 = recyclerView.f.c;
                        size5 = arrayList4.size();
                        i8 = 0;
                        while (true) {
                            if (i8 < size5) {
                                i3 = 1;
                                view = null;
                                break;
                            }
                            view = (View) arrayList4.get(i8);
                            d0VarR2 = RecyclerView.R(view);
                            i3 = 1;
                            if (d0VarR2.getLayoutPosition() != i) {
                            }
                            i8++;
                        }
                        if (view != null) {
                            size6 = arrayList2.size();
                            i9 = 0;
                            while (true) {
                                if (i9 < size6) {
                                    d0Var = null;
                                    break;
                                }
                                d0Var4 = arrayList2.get(i9);
                                if (d0Var4.isInvalid()) {
                                }
                                i9++;
                            }
                        } else {
                            d0VarR = RecyclerView.R(view);
                            eVar = recyclerView.f;
                            aVar2 = eVar.b;
                            iIndexOfChild = eVar.a.a.indexOfChild(view);
                            if (iIndexOfChild >= 0) {
                                z9l.a(view, "view is not a child, cannot hide ");
                                return null;
                            }
                            if (aVar2.d(iIndexOfChild)) {
                                ojh.a(view, "trying to unhide a view that was not hidden");
                                return null;
                            }
                            aVar2.a(iIndexOfChild);
                            eVar.k(view);
                            androidx.recyclerview.widget.e eVar3 = recyclerView.f;
                            aVar3 = eVar3.b;
                            iIndexOfChild2 = eVar3.a.a.indexOfChild(view);
                            if (iIndexOfChild2 == -1) {
                                iB = -1;
                            } else {
                                iB = iIndexOfChild2 - aVar3.b(iIndexOfChild2);
                            }
                            if (iB != -1) {
                                StringBuilder sb3 = new StringBuilder("layout index should not be -1 after unhiding a view:");
                                sb3.append(d0VarR);
                                lpd0.a(sb3, recyclerView.D());
                                return null;
                            }
                            recyclerView.f.c(iB);
                            k(view);
                            d0VarR.addFlags(8224);
                            d0Var = d0VarR;
                            break;
                        }
                    } else {
                        d0Var5 = arrayList.get(i7);
                        if (d0Var5.wasReturnedFromScrap()) {
                        }
                        i7++;
                    }
                }
                if (d0Var != null) {
                    if (d0Var.isRemoved()) {
                        i10 = d0Var.mPosition;
                        if (i10 >= 0) {
                        }
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + d0Var + recyclerView.D());
                    }
                    if (!RecyclerView.S0) {
                    }
                    r8 = zVar.g;
                    if (r8 == 0) {
                        d0Var.addFlags(4);
                        if (d0Var.isScrap()) {
                            recyclerView.removeDetachedView(d0Var.itemView, false);
                            d0Var.unScrap();
                        } else if (d0Var.wasReturnedFromScrap()) {
                            d0Var.clearReturnedFromScrapFlag();
                        }
                        j(d0Var);
                        d0Var = null;
                    } else {
                        i2 = i3;
                    }
                }
            } else {
                i3 = 1;
            }
            if (d0Var == null) {
                iF = recyclerView.e.f(i, 0);
                if (iF >= 0) {
                    j2 = 3;
                    if (iF < recyclerView.B.getItemCount()) {
                        itemViewType2 = recyclerView.B.getItemViewType(iF);
                        if (recyclerView.B.hasStableIds()) {
                            itemId = recyclerView.B.getItemId(iF);
                            size2 = arrayList.size() - 1;
                            while (true) {
                                if (size2 >= 0) {
                                    j3 = 4;
                                    size3 = arrayList2.size() - 1;
                                    while (true) {
                                        if (size3 >= 0) {
                                            d0Var2 = arrayList2.get(size3);
                                            if (d0Var2.getItemId() == itemId) {
                                            }
                                            size3--;
                                        }
                                        d0Var = null;
                                        break;
                                    }
                                }
                                d0Var3 = arrayList.get(size2);
                                if (d0Var3.getItemId() != itemId) {
                                }
                                size2--;
                            }
                            if (d0Var != null) {
                                d0Var.mPosition = iF;
                                i2 = i3;
                            }
                        } else {
                            j3 = 4;
                        }
                        if (d0Var == null) {
                            if (RecyclerView.T0) {
                                Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline(" + i + ") fetching from shared pool");
                            }
                            aVar = c().a.get(itemViewType2);
                            if (aVar != null) {
                                d0VarRemove = null;
                                break;
                            }
                            arrayList3 = aVar.a;
                            if (arrayList3.isEmpty()) {
                                d0VarRemove = null;
                                break;
                            }
                            size = arrayList3.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    d0VarRemove = null;
                                    break;
                                }
                                if (!arrayList3.get(size).isAttachedToTransitionOverlay()) {
                                    d0VarRemove = arrayList3.remove(size);
                                    break;
                                }
                                size--;
                            }
                            if (d0VarRemove != null) {
                                d0VarRemove.resetInternal();
                                boolean z2 = RecyclerView.S0;
                            }
                            d0Var = d0VarRemove;
                        }
                        if (d0Var == null) {
                            long nanoTime5 = recyclerView.getNanoTime();
                            if (j != Long.MAX_VALUE) {
                                j7 = this.g.a(itemViewType2).c;
                                if (j7 != 0) {
                                    return null;
                                }
                            }
                            d0VarCreateViewHolder = recyclerView.B.createViewHolder(recyclerView, itemViewType2);
                            if (RecyclerView.X0) {
                                d0VarCreateViewHolder.mNestedRecyclerView = new WeakReference<>(recyclerViewJ);
                            }
                            nanoTime2 = recyclerView.getNanoTime() - nanoTime5;
                            t.a aVarA3 = this.g.a(itemViewType2);
                            j6 = aVarA3.c;
                            if (j6 != 0) {
                                nanoTime2 = (nanoTime2 / j3) + ((j6 / j3) * 3);
                            }
                            aVarA3.c = nanoTime2;
                            if (RecyclerView.T0) {
                                Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline created new ViewHolder");
                            }
                            d0Var = d0VarCreateViewHolder;
                        }
                    }
                }
                StringBuilder sbA3 = dy5.a("Inconsistency detected. Invalid item position ", i, iF, "(offset:", ").state:");
                sbA3.append(zVar.b());
                sbA3.append(recyclerView.D());
                throw new IndexOutOfBoundsException(sbA3.toString());
            }
            j2 = 3;
            j3 = 4;
            if (i2 != 0) {
                d0Var.setFlags(0, 8192);
                if (zVar.j) {
                    l.e(d0Var);
                    l lVar2 = recyclerView.f0;
                    d0Var.getUnmodifiedPayloads();
                    lVar2.getClass();
                    l.b bVar2 = new l.b();
                    bVar2.a(d0Var);
                    recyclerView.f0(d0Var, bVar2);
                }
            }
            if (zVar.g) {
                if (d0Var.isBound()) {
                    if (!RecyclerView.S0) {
                    }
                    int iF4 = recyclerView.e.f(i, 0);
                    d0Var.mBindingAdapter = null;
                    d0Var.mOwnerRecyclerView = recyclerView;
                    itemViewType = d0Var.getItemViewType();
                    long nanoTime6 = recyclerView.getNanoTime();
                    if (j != Long.MAX_VALUE) {
                        j5 = this.g.a(itemViewType).d;
                        if (j5 != 0) {
                        }
                    }
                    if (d0Var.isTmpDetached()) {
                        recyclerView.attachViewToParent(d0Var.itemView, recyclerView.getChildCount(), d0Var.itemView.getLayoutParams());
                        i4 = i3;
                    } else {
                        i4 = 0;
                    }
                    recyclerView.B.bindViewHolder(d0Var, iF4);
                    if (i4 != 0) {
                        recyclerView.detachViewFromParent(d0Var.itemView);
                    }
                    nanoTime = recyclerView.getNanoTime() - nanoTime6;
                    t.a aVarA4 = this.g.a(d0Var.getItemViewType());
                    j4 = aVarA4.d;
                    if (j4 != 0) {
                        nanoTime = (nanoTime / j3) + ((j4 / j3) * j2);
                    }
                    aVarA4.d = nanoTime;
                    accessibilityManager = recyclerView.R;
                    if (accessibilityManager == null) {
                        i5 = i3;
                    } else {
                        i5 = i3;
                    }
                    if (zVar.g) {
                        d0Var.mPreLayoutPosition = i;
                    }
                    i6 = i5;
                } else {
                    if (!RecyclerView.S0) {
                    }
                    int iF5 = recyclerView.e.f(i, 0);
                    d0Var.mBindingAdapter = null;
                    d0Var.mOwnerRecyclerView = recyclerView;
                    itemViewType = d0Var.getItemViewType();
                    long nanoTime7 = recyclerView.getNanoTime();
                    if (j != Long.MAX_VALUE) {
                        j5 = this.g.a(itemViewType).d;
                        if (j5 != 0) {
                        }
                    }
                    if (d0Var.isTmpDetached()) {
                        recyclerView.attachViewToParent(d0Var.itemView, recyclerView.getChildCount(), d0Var.itemView.getLayoutParams());
                        i4 = i3;
                    } else {
                        i4 = 0;
                    }
                    recyclerView.B.bindViewHolder(d0Var, iF5);
                    if (i4 != 0) {
                        recyclerView.detachViewFromParent(d0Var.itemView);
                    }
                    nanoTime = recyclerView.getNanoTime() - nanoTime7;
                    t.a aVarA5 = this.g.a(d0Var.getItemViewType());
                    j4 = aVarA5.d;
                    if (j4 != 0) {
                        nanoTime = (nanoTime / j3) + ((j4 / j3) * j2);
                    }
                    aVarA5.d = nanoTime;
                    accessibilityManager = recyclerView.R;
                    if (accessibilityManager == null) {
                        i5 = i3;
                    } else {
                        i5 = i3;
                    }
                    if (zVar.g) {
                        d0Var.mPreLayoutPosition = i;
                    }
                    i6 = i5;
                }
            } else if (d0Var.isBound()) {
                if (!RecyclerView.S0) {
                }
                int iF6 = recyclerView.e.f(i, 0);
                d0Var.mBindingAdapter = null;
                d0Var.mOwnerRecyclerView = recyclerView;
                itemViewType = d0Var.getItemViewType();
                long nanoTime8 = recyclerView.getNanoTime();
                if (j != Long.MAX_VALUE) {
                    j5 = this.g.a(itemViewType).d;
                    if (j5 != 0) {
                    }
                }
                if (d0Var.isTmpDetached()) {
                    recyclerView.attachViewToParent(d0Var.itemView, recyclerView.getChildCount(), d0Var.itemView.getLayoutParams());
                    i4 = i3;
                } else {
                    i4 = 0;
                }
                recyclerView.B.bindViewHolder(d0Var, iF6);
                if (i4 != 0) {
                    recyclerView.detachViewFromParent(d0Var.itemView);
                }
                nanoTime = recyclerView.getNanoTime() - nanoTime8;
                t.a aVarA6 = this.g.a(d0Var.getItemViewType());
                j4 = aVarA6.d;
                if (j4 != 0) {
                    nanoTime = (nanoTime / j3) + ((j4 / j3) * j2);
                }
                aVarA6.d = nanoTime;
                accessibilityManager = recyclerView.R;
                if (accessibilityManager == null) {
                    i5 = i3;
                } else {
                    i5 = i3;
                }
                if (zVar.g) {
                    d0Var.mPreLayoutPosition = i;
                }
                i6 = i5;
            } else {
                if (!RecyclerView.S0) {
                }
                int iF7 = recyclerView.e.f(i, 0);
                d0Var.mBindingAdapter = null;
                d0Var.mOwnerRecyclerView = recyclerView;
                itemViewType = d0Var.getItemViewType();
                long nanoTime9 = recyclerView.getNanoTime();
                if (j != Long.MAX_VALUE) {
                    j5 = this.g.a(itemViewType).d;
                    if (j5 != 0) {
                    }
                }
                if (d0Var.isTmpDetached()) {
                    recyclerView.attachViewToParent(d0Var.itemView, recyclerView.getChildCount(), d0Var.itemView.getLayoutParams());
                    i4 = i3;
                } else {
                    i4 = 0;
                }
                recyclerView.B.bindViewHolder(d0Var, iF7);
                if (i4 != 0) {
                    recyclerView.detachViewFromParent(d0Var.itemView);
                }
                nanoTime = recyclerView.getNanoTime() - nanoTime9;
                t.a aVarA7 = this.g.a(d0Var.getItemViewType());
                j4 = aVarA7.d;
                if (j4 != 0) {
                    nanoTime = (nanoTime / j3) + ((j4 / j3) * j2);
                }
                aVarA7.d = nanoTime;
                accessibilityManager = recyclerView.R;
                if (accessibilityManager == null) {
                    i5 = i3;
                } else {
                    i5 = i3;
                }
                if (zVar.g) {
                    d0Var.mPreLayoutPosition = i;
                }
                i6 = i5;
            }
            layoutParams = d0Var.itemView.getLayoutParams();
            if (layoutParams == null) {
                layoutParams2 = (LayoutParams) recyclerView.generateDefaultLayoutParams();
                d0Var.itemView.setLayoutParams(layoutParams2);
            } else if (recyclerView.checkLayoutParams(layoutParams)) {
                layoutParams2 = (LayoutParams) recyclerView.generateLayoutParams(layoutParams);
                d0Var.itemView.setLayoutParams(layoutParams2);
            } else {
                layoutParams2 = (LayoutParams) layoutParams;
            }
            layoutParams2.a = d0Var;
            if (i2 != 0) {
                r7 = 0;
            } else {
                r7 = 0;
            }
            layoutParams2.d = r7;
            return d0Var;
        }

        public final void m(d0 d0Var) {
            if (d0Var.mInChangeScrap) {
                this.b.remove(d0Var);
            } else {
                this.a.remove(d0Var);
            }
            d0Var.mScrapContainer = null;
            d0Var.mInChangeScrap = false;
            d0Var.clearReturnedFromScrapFlag();
        }

        public final void n() {
            o oVar = RecyclerView.this.C;
            this.f = this.e + (oVar != null ? oVar.y : 0);
            ArrayList<d0> arrayList = this.c;
            for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f; size--) {
                h(size);
            }
        }
    }

    public interface v {
        void a();
    }

    public class w extends h {
        public w() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void a() {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.l(null);
            recyclerView.x0.f = true;
            recyclerView.e0(true);
            if (recyclerView.e.g()) {
                return;
            }
            recyclerView.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void c(int i, int i2, Object obj) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.l(null);
            androidx.recyclerview.widget.a aVar = recyclerView.e;
            ArrayList<androidx.recyclerview.widget.a.C0069a> arrayList = aVar.b;
            if (i2 < 1) {
                return;
            }
            arrayList.add(aVar.h(obj, 4, i, i2));
            aVar.f |= 4;
            if (arrayList.size() == 1) {
                h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void d(int i, int i2) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.l(null);
            androidx.recyclerview.widget.a aVar = recyclerView.e;
            ArrayList<androidx.recyclerview.widget.a.C0069a> arrayList = aVar.b;
            if (i2 < 1) {
                return;
            }
            arrayList.add(aVar.h(null, 1, i, i2));
            aVar.f |= 1;
            if (arrayList.size() == 1) {
                h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void e(int i, int i2) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.l(null);
            androidx.recyclerview.widget.a aVar = recyclerView.e;
            ArrayList<androidx.recyclerview.widget.a.C0069a> arrayList = aVar.b;
            if (i == i2) {
                return;
            }
            arrayList.add(aVar.h(null, 8, i, i2));
            aVar.f |= 8;
            if (arrayList.size() == 1) {
                h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void f(int i, int i2) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.l(null);
            androidx.recyclerview.widget.a aVar = recyclerView.e;
            ArrayList<androidx.recyclerview.widget.a.C0069a> arrayList = aVar.b;
            if (i2 < 1) {
                return;
            }
            arrayList.add(aVar.h(null, 2, i, i2));
            aVar.f |= 2;
            if (arrayList.size() == 1) {
                h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void g() {
            f fVar;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.d == null || (fVar = recyclerView.B) == null || !fVar.canRestoreState()) {
                return;
            }
            recyclerView.requestLayout();
        }

        public final void h() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.J || !recyclerView.I) {
                recyclerView.Q = true;
                recyclerView.requestLayout();
            } else {
                a aVar = recyclerView.w;
                WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
                recyclerView.postOnAnimation(aVar);
            }
        }
    }

    public static class x implements r {
        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void e(boolean z) {
        }
    }

    public static abstract class y {
        public int a = -1;
        public RecyclerView b;
        public o c;
        public boolean d;
        public boolean e;
        public View f;
        public final a g;
        public boolean h;

        public static class a {
            public int a;
            public int b;
            public int c;
            public int d;
            public Interpolator e;
            public boolean f;
            public int g;

            public final void a(RecyclerView recyclerView) {
                int i = this.d;
                if (i >= 0) {
                    this.d = -1;
                    recyclerView.W(i);
                    this.f = false;
                    return;
                }
                if (!this.f) {
                    this.g = 0;
                    return;
                }
                Interpolator interpolator = this.e;
                if (interpolator != null && this.c < 1) {
                    ib5.a("If you provide an interpolator, you must set a positive duration");
                    return;
                }
                int i2 = this.c;
                if (i2 < 1) {
                    ib5.a("Scroll duration must be a positive number");
                    return;
                }
                recyclerView.u0.c(this.a, this.b, i2, interpolator);
                int i3 = this.g + 1;
                this.g = i3;
                if (i3 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f = false;
            }

            public final void b(int i, int i2, int i3, BaseInterpolator baseInterpolator) {
                this.a = i;
                this.b = i2;
                this.c = i3;
                this.e = baseInterpolator;
                this.f = true;
            }
        }

        public interface b {
            PointF b(int i);
        }

        public y() {
            a aVar = new a();
            aVar.d = -1;
            aVar.f = false;
            aVar.g = 0;
            aVar.a = 0;
            aVar.b = 0;
            aVar.c = Integer.MIN_VALUE;
            aVar.e = null;
            this.g = aVar;
        }

        public PointF a(int i) {
            Object obj = this.c;
            if (obj instanceof b) {
                return ((b) obj).b(i);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public final void b(int i, int i2) {
            PointF pointFA;
            RecyclerView recyclerView = this.b;
            if (this.a == -1 || recyclerView == null) {
                g();
            }
            if (this.d && this.f == null && this.c != null && (pointFA = a(this.a)) != null) {
                float f = pointFA.x;
                if (f != 0.0f || pointFA.y != 0.0f) {
                    recyclerView.n0((int) Math.signum(f), (int) Math.signum(pointFA.y), null);
                }
            }
            this.d = false;
            View view = this.f;
            a aVar = this.g;
            if (view != null) {
                this.b.getClass();
                d0 d0VarR = RecyclerView.R(view);
                if ((d0VarR != null ? d0VarR.getLayoutPosition() : -1) == this.a) {
                    View view2 = this.f;
                    z zVar = recyclerView.x0;
                    f(view2, aVar);
                    aVar.a(recyclerView);
                    g();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f = null;
                }
            }
            if (this.e) {
                z zVar2 = recyclerView.x0;
                c(i, i2, aVar);
                boolean z = aVar.d >= 0;
                aVar.a(recyclerView);
                if (z && this.e) {
                    this.d = true;
                    recyclerView.u0.b();
                }
            }
        }

        public abstract void c(int i, int i2, a aVar);

        public abstract void d();

        public abstract void e();

        public abstract void f(View view, a aVar);

        public final void g() {
            if (this.e) {
                this.e = false;
                e();
                this.b.x0.a = -1;
                this.f = null;
                this.a = -1;
                this.d = false;
                o oVar = this.c;
                if (oVar.e == this) {
                    oVar.e = null;
                }
                this.c = null;
                this.b = null;
            }
        }
    }

    public static class z {
        public int a;
        public int b;
        public int c;
        public int d;
        public int e;
        public boolean f;
        public boolean g;
        public boolean h;
        public boolean i;
        public boolean j;
        public boolean k;
        public int l;
        public long m;
        public int n;

        public final void a(int i) {
            if ((this.d & i) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.d));
        }

        public final int b() {
            return this.g ? this.b - this.c : this.e;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("State{mTargetPosition=");
            sb.append(this.a);
            sb.append(", mData=null, mItemCount=");
            sb.append(this.e);
            sb.append(", mIsMeasuring=");
            sb.append(this.i);
            sb.append(", mPreviousLayoutItemCount=");
            sb.append(this.b);
            sb.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            sb.append(this.c);
            sb.append(", mStructureChanged=");
            sb.append(this.f);
            sb.append(", mInPreLayout=");
            sb.append(this.g);
            sb.append(", mRunSimpleAnimations=");
            sb.append(this.j);
            sb.append(", mRunPredictiveAnimations=");
            return ruw.a(sb, this.k, '}');
        }
    }

    static {
        Class cls = Integer.TYPE;
        Y0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        Z0 = new c();
        a1 = new a0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RecyclerView(Context context, AttributeSet attributeSet, int i2) throws Throwable {
        float fA;
        char c2;
        int i3;
        Throwable th;
        ClassLoader classLoader;
        Constructor constructor;
        Object[] objArr;
        super(context, attributeSet, i2);
        this.b = new w();
        this.c = new u();
        this.i = new n0();
        this.w = new a();
        this.y = new Rect();
        this.z = new Rect();
        this.A = new RectF();
        this.E = new ArrayList();
        this.F = new ArrayList<>();
        this.G = new ArrayList<>();
        this.L = 0;
        this.T = false;
        this.U = false;
        this.V = 0;
        this.W = 0;
        this.a0 = a1;
        this.f0 = new androidx.recyclerview.widget.h();
        this.g0 = 0;
        this.h0 = -1;
        this.r0 = Float.MIN_VALUE;
        this.s0 = Float.MIN_VALUE;
        this.t0 = true;
        this.u0 = new c0();
        this.w0 = X0 ? new androidx.recyclerview.widget.q.b() : null;
        z zVar = new z();
        zVar.a = -1;
        zVar.b = 0;
        zVar.c = 0;
        zVar.d = 1;
        zVar.e = 0;
        zVar.f = false;
        zVar.g = false;
        zVar.h = false;
        zVar.i = false;
        zVar.j = false;
        zVar.k = false;
        this.x0 = zVar;
        this.A0 = false;
        this.B0 = false;
        m mVar = new m();
        this.C0 = mVar;
        this.D0 = false;
        this.F0 = new int[2];
        this.H0 = new int[2];
        this.I0 = new int[2];
        this.J0 = new int[2];
        this.K0 = new ArrayList();
        this.L0 = new b();
        this.N0 = 0;
        this.O0 = 0;
        this.Q0 = new d();
        this.R0 = new tpe(getContext(), new e());
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.n0 = viewConfiguration.getScaledTouchSlop();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26) {
            Method method = b7i0.a;
            fA = b7i0.a.a(viewConfiguration);
        } else {
            fA = b7i0.a(viewConfiguration, context);
        }
        this.r0 = fA;
        this.s0 = i4 >= 26 ? b7i0.a.b(viewConfiguration) : b7i0.a(viewConfiguration, context);
        this.p0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.q0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.f0.a = mVar;
        this.e = new androidx.recyclerview.widget.a(new f0(this));
        this.f = new androidx.recyclerview.widget.e(new e0(this));
        WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
        if ((i4 >= 26 ? r6i0.g.a(this) : 0) == 0 && i4 >= 26) {
            r6i0.g.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.R = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new g0(this));
        int[] iArr = ek30.a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        r6i0.o(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i2);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.v = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                hb5.a("Trying to set fast scroller without both required drawables.".concat(D()));
                throw null;
            }
            Resources resources = getContext().getResources();
            c2 = 3;
            i3 = 4;
            th = null;
            new androidx.recyclerview.widget.p(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.sportybet.android.gp.tz.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.sportybet.android.gp.tz.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.sportybet.android.gp.tz.R.dimen.fastscroll_margin));
        } else {
            c2 = 3;
            i3 = 4;
            th = null;
        }
        typedArrayObtainStyledAttributes.recycle();
        this.P0 = context.getPackageManager().hasSystemFeature("android.hardware.rotaryencoder.lowres");
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                String str = strTrim;
                try {
                    try {
                        if (isInEditMode()) {
                            classLoader = getClass().getClassLoader();
                        } else {
                            try {
                                classLoader = context.getClassLoader();
                            } catch (ClassNotFoundException e2) {
                                e = e2;
                                th = null;
                                fl40.c(attributeSet.getPositionDescription(), ": Unable to find LayoutManager ", str, e);
                                throw th;
                            } catch (IllegalAccessException e3) {
                                e = e3;
                                th = null;
                                fl40.c(attributeSet.getPositionDescription(), ": Cannot access non-public constructor ", str, e);
                                throw th;
                            } catch (InstantiationException e4) {
                                e = e4;
                                th = null;
                                fl40.c(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e);
                                throw th;
                            } catch (InvocationTargetException e5) {
                                e = e5;
                                th = null;
                                fl40.c(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e);
                                throw th;
                            }
                        }
                        Class<? extends U> clsAsSubclass = Class.forName(str, false, classLoader).asSubclass(o.class);
                        try {
                            constructor = clsAsSubclass.getConstructor(Y0);
                            objArr = new Object[i3];
                            objArr[0] = context;
                            objArr[r10] = attributeSet;
                            objArr[2] = Integer.valueOf(i2);
                            objArr[c2] = 0;
                        } catch (NoSuchMethodException e6) {
                            try {
                                constructor = clsAsSubclass.getConstructor(th);
                                objArr = null;
                            } catch (NoSuchMethodException e7) {
                                e7.initCause(e6);
                                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e7);
                            }
                        }
                        constructor.setAccessible(true);
                        setLayoutManager((o) constructor.newInstance(objArr));
                    } catch (ClassCastException e8) {
                        fl40.c(attributeSet.getPositionDescription(), ": Class is not a LayoutManager ", str, e8);
                        throw null;
                    }
                } catch (ClassNotFoundException e9) {
                    e = e9;
                } catch (IllegalAccessException e10) {
                    e = e10;
                } catch (InstantiationException e11) {
                    e = e11;
                } catch (InvocationTargetException e12) {
                    e = e12;
                }
            }
        }
        int[] iArr2 = U0;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i2, 0);
        r6i0.o(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i2);
        boolean z2 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
        setTag(com.sportybet.android.gp.tz.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    public static RecyclerView J(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            RecyclerView recyclerViewJ = J(viewGroup.getChildAt(i2));
            if (recyclerViewJ != null) {
                return recyclerViewJ;
            }
        }
        return null;
    }

    public static int P(View view) {
        d0 d0VarR = R(view);
        if (d0VarR != null) {
            return d0VarR.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    public static d0 R(View view) {
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).a;
    }

    public static void S(Rect rect, View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect2 = layoutParams.b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
    }

    private qlx getScrollingChildHelper() {
        qlx qlxVar = this.G0;
        if (qlxVar != null) {
            return qlxVar;
        }
        qlx qlxVar2 = new qlx(this);
        this.G0 = qlxVar2;
        return qlxVar2;
    }

    public static void m(d0 d0Var) {
        WeakReference<RecyclerView> weakReference = d0Var.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == d0Var.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            d0Var.mNestedRecyclerView = null;
        }
    }

    public static int p(int i2, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i3) {
        if (i2 > 0 && edgeEffect != null && alf.a(edgeEffect) != 0.0f) {
            int iRound = Math.round(alf.b(edgeEffect, ((-i2) * 4.0f) / i3, 0.5f) * ((-i3) / 4.0f));
            if (iRound != i2) {
                edgeEffect.finish();
            }
            return i2 - iRound;
        }
        if (i2 >= 0 || edgeEffect2 == null || alf.a(edgeEffect2) == 0.0f) {
            return i2;
        }
        float f2 = i3;
        int iRound2 = Math.round(alf.b(edgeEffect2, (i2 * 4.0f) / f2, 0.5f) * (f2 / 4.0f));
        if (iRound2 != i2) {
            edgeEffect2.finish();
        }
        return i2 - iRound2;
    }

    public static void setDebugAssertionsEnabled(boolean z2) {
        S0 = z2;
    }

    public static void setVerboseLoggingEnabled(boolean z2) {
        T0 = z2;
    }

    public final void A() {
        if (this.b0 != null) {
            return;
        }
        ((a0) this.a0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.b0 = edgeEffect;
        if (this.v) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void B() {
        if (this.d0 != null) {
            return;
        }
        ((a0) this.a0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.d0 = edgeEffect;
        if (this.v) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void C() {
        if (this.c0 != null) {
            return;
        }
        ((a0) this.a0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.c0 = edgeEffect;
        if (this.v) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String D() {
        return " " + super.toString() + ", adapter:" + this.B + ", layout:" + this.C + ", context:" + getContext();
    }

    public final void E(z zVar) {
        if (getScrollState() != 2) {
            zVar.getClass();
            return;
        }
        OverScroller overScroller = this.u0.c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        zVar.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public final View F(float f2, float f3) {
        androidx.recyclerview.widget.e eVar = this.f;
        for (int iE = eVar.e() - 1; iE >= 0; iE--) {
            View viewD = eVar.d(iE);
            float translationX = viewD.getTranslationX();
            float translationY = viewD.getTranslationY();
            if (f2 >= viewD.getLeft() + translationX && f2 <= viewD.getRight() + translationX && f3 >= viewD.getTop() + translationY && f3 <= viewD.getBottom() + translationY) {
                return viewD;
            }
        }
        return null;
    }

    public final View G(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public final boolean H(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList<r> arrayList = this.G;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            r rVar = arrayList.get(i2);
            if (rVar.c(this, motionEvent) && action != 3) {
                this.H = rVar;
                return true;
            }
        }
        return false;
    }

    public final void I(int[] iArr) {
        androidx.recyclerview.widget.e eVar = this.f;
        int iE = eVar.e();
        if (iE == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i2 = Reader.READ_DONE;
        int i3 = Integer.MIN_VALUE;
        for (int i4 = 0; i4 < iE; i4++) {
            d0 d0VarR = R(eVar.d(i4));
            if (!d0VarR.shouldIgnore()) {
                int layoutPosition = d0VarR.getLayoutPosition();
                if (layoutPosition < i2) {
                    i2 = layoutPosition;
                }
                if (layoutPosition > i3) {
                    i3 = layoutPosition;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i3;
    }

    public final d0 K(int i2) {
        d0 d0Var = null;
        if (this.T) {
            return null;
        }
        androidx.recyclerview.widget.e eVar = this.f;
        int iH = eVar.h();
        for (int i3 = 0; i3 < iH; i3++) {
            d0 d0VarR = R(eVar.g(i3));
            if (d0VarR != null && !d0VarR.isRemoved() && N(d0VarR) == i2) {
                if (!eVar.c.contains(d0VarR.itemView)) {
                    return d0VarR;
                }
                d0Var = d0VarR;
            }
        }
        return d0Var;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    /* JADX WARN: Code duplicated, block: B:22:0x0034 A[SYNTHETIC] */
    public final d0 L(int i2, boolean z2) {
        androidx.recyclerview.widget.e eVar = this.f;
        int iH = eVar.h();
        d0 d0Var = null;
        for (int i3 = 0; i3 < iH; i3++) {
            d0 d0VarR = R(eVar.g(i3));
            if (d0VarR != null && !d0VarR.isRemoved()) {
                if (z2) {
                    if (d0VarR.mPosition != i2) {
                        continue;
                    } else {
                        if (eVar.c.contains(d0VarR.itemView)) {
                            return d0VarR;
                        }
                        d0Var = d0VarR;
                    }
                } else if (d0VarR.getLayoutPosition() != i2) {
                    continue;
                } else {
                    if (eVar.c.contains(d0VarR.itemView)) {
                        return d0VarR;
                    }
                    d0Var = d0VarR;
                }
            }
        }
        return d0Var;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ba  */
    public final boolean M(int i2, int i3, int i4, int i5) {
        int iMax;
        int i6;
        int minFlingVelocity;
        y yVarC;
        int iE;
        o oVar = this.C;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (!this.N) {
            boolean zS = oVar.s();
            boolean zT = this.C.t();
            if (!zS || Math.abs(i2) < i4) {
                i2 = 0;
            }
            if (!zT || Math.abs(i3) < i4) {
                i3 = 0;
            }
            if (i2 != 0 || i3 != 0) {
                if (i2 == 0) {
                    iMax = 0;
                } else {
                    EdgeEffect edgeEffect = this.b0;
                    if (edgeEffect == null || alf.a(edgeEffect) == 0.0f) {
                        EdgeEffect edgeEffect2 = this.d0;
                        if (edgeEffect2 == null || alf.a(edgeEffect2) == 0.0f) {
                            iMax = 0;
                        } else if (p0(this.d0, i2, getWidth())) {
                            this.d0.onAbsorb(i2);
                            i2 = 0;
                        }
                    } else {
                        int i7 = -i2;
                        if (p0(this.b0, i7, getWidth())) {
                            this.b0.onAbsorb(i7);
                            i2 = 0;
                        }
                    }
                    iMax = i2;
                    i2 = 0;
                }
                if (i3 == 0) {
                    i6 = i3;
                    i3 = 0;
                } else {
                    EdgeEffect edgeEffect3 = this.c0;
                    if (edgeEffect3 == null || alf.a(edgeEffect3) == 0.0f) {
                        EdgeEffect edgeEffect4 = this.e0;
                        if (edgeEffect4 == null || alf.a(edgeEffect4) == 0.0f) {
                            i6 = i3;
                            i3 = 0;
                        } else if (p0(this.e0, i3, getHeight())) {
                            this.e0.onAbsorb(i3);
                            i3 = 0;
                        }
                    } else {
                        int i8 = -i3;
                        if (p0(this.c0, i8, getHeight())) {
                            this.c0.onAbsorb(i8);
                            i3 = 0;
                        }
                    }
                    i6 = 0;
                }
                c0 c0Var = this.u0;
                if (iMax != 0 || i3 != 0) {
                    int i9 = -i5;
                    iMax = Math.max(i9, Math.min(iMax, i5));
                    i3 = Math.max(i9, Math.min(i3, i5));
                    u0(1);
                    c0Var.a(iMax, i3);
                }
                if (i2 != 0 || i6 != 0) {
                    float f2 = i2;
                    float f3 = i6;
                    if (!dispatchNestedPreFling(f2, f3)) {
                        boolean z2 = zS || zT;
                        dispatchNestedFling(f2, f3, z2);
                        q qVar = this.o0;
                        if (qVar != null) {
                            j0 j0Var = (j0) qVar;
                            o layoutManager = j0Var.a.getLayoutManager();
                            if (layoutManager != null && j0Var.a.getAdapter() != null && ((Math.abs(i6) > (minFlingVelocity = j0Var.a.getMinFlingVelocity()) || Math.abs(i2) > minFlingVelocity) && (layoutManager instanceof y.b) && (yVarC = j0Var.c(layoutManager)) != null && (iE = j0Var.e(layoutManager, i2, i6)) != -1)) {
                                yVarC.a = iE;
                                layoutManager.S0(yVarC);
                                return true;
                            }
                        }
                        if (z2) {
                            u0(1);
                            int i10 = -i5;
                            c0Var.a(Math.max(i10, Math.min(i2, i5)), Math.max(i10, Math.min(i6, i5)));
                            return true;
                        }
                    }
                } else if (iMax != 0 || i3 != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int N(d0 d0Var) {
        if (d0Var.hasAnyOfTheFlags(524) || !d0Var.isBound()) {
            return -1;
        }
        int i2 = d0Var.mPosition;
        ArrayList<androidx.recyclerview.widget.a.C0069a> arrayList = this.e.b;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            androidx.recyclerview.widget.a.C0069a c0069a = arrayList.get(i3);
            int i4 = c0069a.a;
            if (i4 != 1) {
                if (i4 == 2) {
                    int i5 = c0069a.b;
                    if (i5 <= i2) {
                        int i6 = c0069a.d;
                        if (i5 + i6 > i2) {
                            return -1;
                        }
                        i2 -= i6;
                    } else {
                        continue;
                    }
                } else if (i4 == 8) {
                    int i7 = c0069a.b;
                    if (i7 == i2) {
                        i2 = c0069a.d;
                    } else {
                        if (i7 < i2) {
                            i2--;
                        }
                        if (c0069a.d <= i2) {
                            i2++;
                        }
                    }
                }
            } else if (c0069a.b <= i2) {
                i2 += c0069a.d;
            }
        }
        return i2;
    }

    public final long O(d0 d0Var) {
        return this.B.hasStableIds() ? d0Var.getItemId() : d0Var.mPosition;
    }

    public final d0 Q(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return R(view);
        }
        nrh0.a(view, "View ", " is not a direct child of ", this);
        return null;
    }

    public final Rect T(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        boolean z2 = layoutParams.c;
        Rect rect = layoutParams.b;
        if (z2) {
            z zVar = this.x0;
            if (!zVar.g || (!layoutParams.a.isUpdated() && !layoutParams.a.isInvalid())) {
                rect.set(0, 0, 0, 0);
                ArrayList<n> arrayList = this.F;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Rect rect2 = this.y;
                    rect2.set(0, 0, 0, 0);
                    arrayList.get(i2).f(rect2, view, this, zVar);
                    rect.left += rect2.left;
                    rect.top += rect2.top;
                    rect.right += rect2.right;
                    rect.bottom += rect2.bottom;
                }
                layoutParams.c = false;
                return rect;
            }
        }
        return rect;
    }

    public final boolean U() {
        return !this.K || this.T || this.e.g();
    }

    public final boolean V() {
        return this.V > 0;
    }

    public final void W(int i2) {
        if (this.C == null) {
            return;
        }
        setScrollState(2);
        this.C.H0(i2);
        awakenScrollBars();
    }

    public final void X() {
        androidx.recyclerview.widget.e eVar = this.f;
        int iH = eVar.h();
        for (int i2 = 0; i2 < iH; i2++) {
            ((LayoutParams) eVar.g(i2).getLayoutParams()).c = true;
        }
        ArrayList<d0> arrayList = this.c.c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            LayoutParams layoutParams = (LayoutParams) arrayList.get(i3).itemView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.c = true;
            }
        }
    }

    public final void Y(int i2, int i3, boolean z2) {
        int i4 = i2 + i3;
        androidx.recyclerview.widget.e eVar = this.f;
        int iH = eVar.h();
        for (int i5 = 0; i5 < iH; i5++) {
            d0 d0VarR = R(eVar.g(i5));
            if (d0VarR != null && !d0VarR.shouldIgnore()) {
                int i6 = d0VarR.mPosition;
                z zVar = this.x0;
                if (i6 >= i4) {
                    if (T0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i5 + " holder " + d0VarR + " now at position " + (d0VarR.mPosition - i3));
                    }
                    d0VarR.offsetPosition(-i3, z2);
                    zVar.f = true;
                } else if (i6 >= i2) {
                    if (T0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i5 + " holder " + d0VarR + " now REMOVED");
                    }
                    d0VarR.flagRemovedAndOffsetPosition(i2 - 1, -i3, z2);
                    zVar.f = true;
                }
            }
        }
        u uVar = this.c;
        ArrayList<d0> arrayList = uVar.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            d0 d0Var = arrayList.get(size);
            if (d0Var != null) {
                int i7 = d0Var.mPosition;
                if (i7 >= i4) {
                    if (T0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + d0Var + " now at position " + (d0Var.mPosition - i3));
                    }
                    d0Var.offsetPosition(-i3, z2);
                } else if (i7 >= i2) {
                    d0Var.addFlags(8);
                    uVar.h(size);
                }
            }
        }
        requestLayout();
    }

    public final void Z() {
        this.V++;
    }

    public final void a0(boolean z2) {
        int i2;
        AccessibilityManager accessibilityManager;
        int i3 = this.V - 1;
        this.V = i3;
        if (i3 < 1) {
            if (S0 && i3 < 0) {
                ib5.a("layout or scroll counter cannot go below zero.Some calls are not matching".concat(D()));
                return;
            }
            this.V = 0;
            if (z2) {
                int i4 = this.P;
                this.P = 0;
                if (i4 != 0 && (accessibilityManager = this.R) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i4);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.K0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    d0 d0Var = (d0) arrayList.get(size);
                    if (d0Var.itemView.getParent() == this && !d0Var.shouldIgnore() && (i2 = d0Var.mPendingAccessibilityState) != -1) {
                        d0Var.itemView.setImportantForAccessibility(i2);
                        d0Var.mPendingAccessibilityState = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        o oVar = this.C;
        if (oVar != null) {
            oVar.getClass();
        }
        super.addFocusables(arrayList, i2, i3);
    }

    public final void b0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.h0) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.h0 = motionEvent.getPointerId(i2);
            int x2 = (int) (motionEvent.getX(i2) + 0.5f);
            this.l0 = x2;
            this.j0 = x2;
            int y2 = (int) (motionEvent.getY(i2) + 0.5f);
            this.m0 = y2;
            this.k0 = y2;
        }
    }

    public final void c0() {
        if (this.D0 || !this.I) {
            return;
        }
        WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
        postOnAnimation(this.L0);
        this.D0 = true;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && this.C.u((LayoutParams) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        o oVar = this.C;
        if (oVar != null && oVar.s()) {
            return this.C.y(this.x0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        o oVar = this.C;
        if (oVar != null && oVar.s()) {
            return this.C.z(this.x0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        o oVar = this.C;
        if (oVar != null && oVar.s()) {
            return this.C.A(this.x0);
        }
        return 0;
    }

    @Override // android.view.View, defpackage.yr70
    public final int computeVerticalScrollExtent() {
        o oVar = this.C;
        if (oVar != null && oVar.t()) {
            return this.C.B(this.x0);
        }
        return 0;
    }

    @Override // android.view.View, defpackage.yr70
    public final int computeVerticalScrollOffset() {
        o oVar = this.C;
        if (oVar != null && oVar.t()) {
            return this.C.C(this.x0);
        }
        return 0;
    }

    @Override // android.view.View, defpackage.yr70
    public final int computeVerticalScrollRange() {
        o oVar = this.C;
        if (oVar != null && oVar.t()) {
            return this.C.D(this.x0);
        }
        return 0;
    }

    public final void d0() {
        boolean z2;
        boolean z3 = this.T;
        androidx.recyclerview.widget.a aVar = this.e;
        boolean z4 = false;
        if (z3) {
            aVar.k(aVar.b);
            aVar.k(aVar.c);
            aVar.f = 0;
            if (this.U) {
                this.C.o0();
            }
        }
        if (this.f0 != null && this.C.T0()) {
            aVar.j();
        } else {
            aVar.c();
        }
        boolean z5 = this.A0 || this.B0;
        boolean z6 = this.K && this.f0 != null && ((z2 = this.T) || z5 || this.C.f) && (!z2 || this.B.hasStableIds());
        z zVar = this.x0;
        zVar.j = z6;
        if (z6 && z5 && !this.T && this.f0 != null && this.C.T0()) {
            z4 = true;
        }
        zVar.k = z4;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        o layoutManager = getLayoutManager();
        int itemCount = 0;
        if (layoutManager != null) {
            if (layoutManager.t()) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 92 || keyCode == 93) {
                    int measuredHeight = getMeasuredHeight();
                    if (keyCode == 93) {
                        r0(0, measuredHeight, null, false);
                        return true;
                    }
                    r0(0, -measuredHeight, null, false);
                    return true;
                }
                if (keyCode == 122 || keyCode == 123) {
                    boolean Z = layoutManager.Z();
                    if (keyCode == 122) {
                        if (Z) {
                            itemCount = getAdapter().getItemCount();
                        }
                    } else if (!Z) {
                        itemCount = getAdapter().getItemCount();
                    }
                    s0(itemCount);
                    return true;
                }
            } else if (layoutManager.s()) {
                int keyCode2 = keyEvent.getKeyCode();
                if (keyCode2 == 92 || keyCode2 == 93) {
                    int measuredWidth = getMeasuredWidth();
                    if (keyCode2 == 93) {
                        r0(measuredWidth, 0, null, false);
                        return true;
                    }
                    r0(-measuredWidth, 0, null, false);
                    return true;
                }
                if (keyCode2 == 122 || keyCode2 == 123) {
                    boolean Z2 = layoutManager.Z();
                    if (keyCode2 == 122) {
                        if (Z2) {
                            itemCount = getAdapter().getItemCount();
                        }
                    } else if (!Z2) {
                        itemCount = getAdapter().getItemCount();
                    }
                    s0(itemCount);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return getScrollingChildHelper().a(f2, f3, z2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f2, float f3) {
        return getScrollingChildHelper().b(f2, f3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i2, i3, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().d(i2, i3, i4, i5, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z2;
        super.draw(canvas);
        ArrayList<n> arrayList = this.F;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.get(i2).i(canvas, this, this.x0);
        }
        EdgeEffect edgeEffect = this.b0;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.v ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.b0;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.c0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.v) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.c0;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.d0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.v ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.d0;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.e0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.v) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.e0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(iSave4);
        }
        if ((z2 || this.f0 == null || arrayList.size() <= 0 || !this.f0.k()) ? z2 : true) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    public final void e0(boolean z2) {
        this.U = z2 | this.U;
        this.T = true;
        androidx.recyclerview.widget.e eVar = this.f;
        int iH = eVar.h();
        for (int i2 = 0; i2 < iH; i2++) {
            d0 d0VarR = R(eVar.g(i2));
            if (d0VarR != null && !d0VarR.shouldIgnore()) {
                d0VarR.addFlags(6);
            }
        }
        X();
        u uVar = this.c;
        ArrayList<d0> arrayList = uVar.c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            d0 d0Var = arrayList.get(i3);
            if (d0Var != null) {
                d0Var.addFlags(6);
                d0Var.addChangePayload(null);
            }
        }
        f fVar = RecyclerView.this.B;
        if (fVar == null || !fVar.hasStableIds()) {
            uVar.g();
        }
    }

    public final void f0(d0 d0Var, l.b bVar) {
        d0Var.setFlags(0, 8192);
        boolean z2 = this.x0.h;
        n0 n0Var = this.i;
        if (z2 && d0Var.isUpdated() && !d0Var.isRemoved() && !d0Var.shouldIgnore()) {
            n0Var.b.f(d0Var, O(d0Var));
        }
        nj90<d0, n0.a> nj90Var = n0Var.a;
        n0.a aVarA = nj90Var.get(d0Var);
        if (aVarA == null) {
            aVarA = n0.a.a();
            nj90Var.put(d0Var, aVarA);
        }
        aVarA.b = bVar;
        aVarA.a |= 4;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0157 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x0159 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x015b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x015d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x015f  */
    /* JADX WARN: Code duplicated, block: B:115:0x0163 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:117:0x0166  */
    /* JADX WARN: Code duplicated, block: B:119:0x0170 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x0173 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x0176 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:125:0x0179  */
    /* JADX WARN: Code duplicated, block: B:126:0x017b  */
    /* JADX WARN: Code duplicated, block: B:127:0x017d  */
    /* JADX WARN: Code duplicated, block: B:130:0x0181  */
    /* JADX WARN: Code duplicated, block: B:131:0x0183  */
    /* JADX WARN: Code duplicated, block: B:132:0x0185  */
    /* JADX WARN: Code duplicated, block: B:24:0x004e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0113  */
    /* JADX WARN: Code duplicated, block: B:81:0x0115  */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0163, code lost:
    
        if (r16 > 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0170, code lost:
    
        if (r5 > 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0173, code lost:
    
        if (r16 < 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0176, code lost:
    
        if (r5 < 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x017e, code lost:
    
        if ((r5 * r6) <= 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0186, code lost:
    
        if ((r5 * r6) >= 0) goto L135;
     */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View focusSearch(android.view.View r19, int r20) {
        /*
            Method dump skipped, instruction units count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final void g0() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.b0;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.b0.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.c0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.c0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.d0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.d0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.e0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.e0.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        o oVar = this.C;
        if (oVar != null) {
            return oVar.G();
        }
        ib5.a("RecyclerView has no LayoutManager".concat(D()));
        return null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        o oVar = this.C;
        if (oVar != null) {
            return oVar.H(getContext(), attributeSet);
        }
        ib5.a("RecyclerView has no LayoutManager".concat(D()));
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public f getAdapter() {
        return this.B;
    }

    @Override // android.view.View
    public int getBaseline() {
        o oVar = this.C;
        if (oVar == null) {
            return super.getBaseline();
        }
        oVar.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i2, int i3) {
        return super.getChildDrawingOrder(i2, i3);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.v;
    }

    public g0 getCompatAccessibilityDelegate() {
        return this.E0;
    }

    public k getEdgeEffectFactory() {
        return this.a0;
    }

    public l getItemAnimator() {
        return this.f0;
    }

    public int getItemDecorationCount() {
        return this.F.size();
    }

    public o getLayoutManager() {
        return this.C;
    }

    public int getMaxFlingVelocity() {
        return this.q0;
    }

    public int getMinFlingVelocity() {
        return this.p0;
    }

    public long getNanoTime() {
        if (X0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public q getOnFlingListener() {
        return this.o0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.t0;
    }

    public t getRecycledViewPool() {
        return this.c.c();
    }

    public int getScrollState() {
        return this.g0;
    }

    public final void h(d0 d0Var) {
        View view = d0Var.itemView;
        boolean z2 = view.getParent() == this;
        this.c.m(Q(view));
        boolean zIsTmpDetached = d0Var.isTmpDetached();
        androidx.recyclerview.widget.e eVar = this.f;
        if (zIsTmpDetached) {
            eVar.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z2) {
            eVar.a(view, -1, true);
            return;
        }
        int iIndexOfChild = eVar.a.a.indexOfChild(view);
        if (iIndexOfChild < 0) {
            z9l.a(view, "view is not a child, cannot hide ");
        } else {
            eVar.b.h(iIndexOfChild);
            eVar.i(view);
        }
    }

    public final int h0(int i2, float f2) {
        float height = f2 / getHeight();
        float width = i2 / getWidth();
        EdgeEffect edgeEffect = this.b0;
        float f3 = 0.0f;
        if (edgeEffect == null || alf.a(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.d0;
            if (edgeEffect2 != null && alf.a(edgeEffect2) != 0.0f) {
                boolean zCanScrollHorizontally = canScrollHorizontally(1);
                EdgeEffect edgeEffect3 = this.d0;
                if (zCanScrollHorizontally) {
                    edgeEffect3.onRelease();
                } else {
                    float fB = alf.b(edgeEffect3, width, height);
                    if (alf.a(this.d0) == 0.0f) {
                        this.d0.onRelease();
                    }
                    f3 = fB;
                }
                invalidate();
            }
        } else {
            boolean zCanScrollHorizontally2 = canScrollHorizontally(-1);
            EdgeEffect edgeEffect4 = this.b0;
            if (zCanScrollHorizontally2) {
                edgeEffect4.onRelease();
            } else {
                float f4 = -alf.b(edgeEffect4, -width, 1.0f - height);
                if (alf.a(this.b0) == 0.0f) {
                    this.b0.onRelease();
                }
                f3 = f4;
            }
            invalidate();
        }
        return Math.round(f3 * getWidth());
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(n nVar) {
        o oVar = this.C;
        if (oVar != null) {
            oVar.q("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList<n> arrayList = this.F;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(nVar);
        X();
        requestLayout();
    }

    public final int i0(int i2, float f2) {
        float width = f2 / getWidth();
        float height = i2 / getHeight();
        EdgeEffect edgeEffect = this.c0;
        float f3 = 0.0f;
        if (edgeEffect == null || alf.a(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.e0;
            if (edgeEffect2 != null && alf.a(edgeEffect2) != 0.0f) {
                boolean zCanScrollVertically = canScrollVertically(1);
                EdgeEffect edgeEffect3 = this.e0;
                if (zCanScrollVertically) {
                    edgeEffect3.onRelease();
                } else {
                    float fB = alf.b(edgeEffect3, height, 1.0f - width);
                    if (alf.a(this.e0) == 0.0f) {
                        this.e0.onRelease();
                    }
                    f3 = fB;
                }
                invalidate();
            }
        } else {
            boolean zCanScrollVertically2 = canScrollVertically(-1);
            EdgeEffect edgeEffect4 = this.c0;
            if (zCanScrollVertically2) {
                edgeEffect4.onRelease();
            } else {
                float f4 = -alf.b(edgeEffect4, -height, width);
                if (alf.a(this.c0) == 0.0f) {
                    this.c0.onRelease();
                }
                f3 = f4;
            }
            invalidate();
        }
        return Math.round(f3 * getHeight());
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.I;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.N;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    public final void j(r rVar) {
        this.G.add(rVar);
    }

    public final void j0(n nVar) {
        o oVar = this.C;
        if (oVar != null) {
            oVar.q("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList<n> arrayList = this.F;
        arrayList.remove(nVar);
        if (arrayList.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        X();
        requestLayout();
    }

    public final void k(s sVar) {
        ArrayList arrayList = this.z0;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.z0 = arrayList;
        }
        arrayList.add(sVar);
    }

    public final void k0(s sVar) {
        ArrayList arrayList = this.z0;
        if (arrayList != null) {
            arrayList.remove(sVar);
        }
    }

    public final void l(String str) {
        if (!V()) {
            if (this.W > 0) {
                Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(D()));
            }
        } else if (str == null) {
            ib5.a("Cannot call this method while RecyclerView is computing a layout or scrolling".concat(D()));
        } else {
            ib5.a(str);
        }
    }

    public final void l0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.y;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            if (!layoutParams2.c) {
                Rect rect2 = layoutParams2.b;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.C.E0(this, view, this.y, !this.K, view2 == null);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00fe A[DONT_INVERT, PHI: r7
      0x00fe: PHI (r7v9 boolean) = (r7v7 boolean), (r7v10 boolean) binds: [B:33:0x00e5, B:31:0x00e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x0100  */
    /* JADX WARN: Code duplicated, block: B:40:0x0108  */
    /* JADX WARN: Code duplicated, block: B:43:0x0111  */
    public final boolean m0(int i2, int i3, MotionEvent motionEvent, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        boolean z3;
        boolean z4;
        q();
        f fVar = this.B;
        int[] iArr = this.J0;
        if (fVar != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            n0(i2, i3, iArr);
            i5 = iArr[0];
            i6 = iArr[1];
            i7 = i2 - i5;
            i8 = i3 - i6;
        } else {
            i5 = 0;
            i6 = 0;
            i7 = 0;
            i8 = 0;
        }
        if (!this.F.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        x(i5, i6, i7, i8, this.H0, i4, iArr);
        int i9 = iArr[0];
        int i10 = i7 - i9;
        int i11 = iArr[1];
        int i12 = i8 - i11;
        boolean z5 = (i9 == 0 && i11 == 0) ? false : true;
        int i13 = this.l0;
        int[] iArr2 = this.H0;
        int i14 = iArr2[0];
        this.l0 = i13 - i14;
        int i15 = this.m0;
        int i16 = iArr2[1];
        this.m0 = i15 - i16;
        int[] iArr3 = this.I0;
        iArr3[0] = iArr3[0] + i14;
        iArr3[1] = iArr3[1] + i16;
        if (getOverScrollMode() != 2) {
            if (motionEvent == null || t39.a(motionEvent, 8194)) {
                z2 = true;
                z3 = false;
            } else {
                float x2 = motionEvent.getX();
                float f2 = i10;
                float y2 = motionEvent.getY();
                float f3 = i12;
                if (f2 < 0.0f) {
                    A();
                    z2 = true;
                    z3 = false;
                    alf.b(this.b0, (-f2) / getWidth(), 1.0f - (y2 / getHeight()));
                } else {
                    z2 = true;
                    z3 = false;
                    if (f2 > 0.0f) {
                        B();
                        alf.b(this.d0, f2 / getWidth(), y2 / getHeight());
                    } else {
                        z4 = false;
                    }
                    if (f3 < 0.0f) {
                        C();
                        alf.b(this.c0, (-f3) / getHeight(), x2 / getWidth());
                    } else if (f3 > 0.0f) {
                        z();
                        alf.b(this.e0, f3 / getHeight(), 1.0f - (x2 / getWidth()));
                    } else {
                        if (z4 || f2 != 0.0f || f3 != 0.0f) {
                            postInvalidateOnAnimation();
                        }
                        if (Build.VERSION.SDK_INT >= 31 && t39.a(motionEvent, 4194304)) {
                            g0();
                        }
                    }
                    z4 = z2;
                    if (z4) {
                        postInvalidateOnAnimation();
                    } else {
                        postInvalidateOnAnimation();
                    }
                    if (Build.VERSION.SDK_INT >= 31) {
                        g0();
                    }
                }
                z4 = z2;
                if (f3 < 0.0f) {
                    C();
                    alf.b(this.c0, (-f3) / getHeight(), x2 / getWidth());
                } else if (f3 > 0.0f) {
                    z();
                    alf.b(this.e0, f3 / getHeight(), 1.0f - (x2 / getWidth()));
                } else {
                    if (z4) {
                        postInvalidateOnAnimation();
                    } else {
                        postInvalidateOnAnimation();
                    }
                    if (Build.VERSION.SDK_INT >= 31) {
                        g0();
                    }
                }
                z4 = z2;
                if (z4) {
                    postInvalidateOnAnimation();
                } else {
                    postInvalidateOnAnimation();
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    g0();
                }
            }
            o(i2, i3);
        } else {
            z2 = true;
            z3 = false;
        }
        if (i5 != 0 || i6 != 0) {
            y(i5, i6);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z5 && i5 == 0 && i6 == 0) ? z3 : z2;
    }

    public final void n() {
        androidx.recyclerview.widget.e eVar = this.f;
        int iH = eVar.h();
        for (int i2 = 0; i2 < iH; i2++) {
            d0 d0VarR = R(eVar.g(i2));
            if (!d0VarR.shouldIgnore()) {
                d0VarR.clearOldPosition();
            }
        }
        u uVar = this.c;
        ArrayList<d0> arrayList = uVar.a;
        ArrayList<d0> arrayList2 = uVar.c;
        int size = arrayList2.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList2.get(i3).clearOldPosition();
        }
        int size2 = arrayList.size();
        for (int i4 = 0; i4 < size2; i4++) {
            arrayList.get(i4).clearOldPosition();
        }
        ArrayList<d0> arrayList3 = uVar.b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i5 = 0; i5 < size3; i5++) {
                uVar.b.get(i5).clearOldPosition();
            }
        }
    }

    public final void n0(int i2, int i3, int[] iArr) {
        d0 d0Var;
        t0();
        Z();
        Trace.beginSection("RV Scroll");
        z zVar = this.x0;
        E(zVar);
        u uVar = this.c;
        int iG0 = i2 != 0 ? this.C.G0(i2, uVar, zVar) : 0;
        int iI0 = i3 != 0 ? this.C.I0(i3, uVar, zVar) : 0;
        Trace.endSection();
        androidx.recyclerview.widget.e eVar = this.f;
        int iE = eVar.e();
        for (int i4 = 0; i4 < iE; i4++) {
            View viewD = eVar.d(i4);
            d0 d0VarQ = Q(viewD);
            if (d0VarQ != null && (d0Var = d0VarQ.mShadowingHolder) != null) {
                View view = d0Var.itemView;
                int left = viewD.getLeft();
                int top = viewD.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        a0(true);
        v0(false);
        if (iArr != null) {
            iArr[0] = iG0;
            iArr[1] = iI0;
        }
    }

    public final void o(int i2, int i3) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.b0;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            zIsFinished = false;
        } else {
            this.b0.onRelease();
            zIsFinished = this.b0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.d0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.d0.onRelease();
            zIsFinished |= this.d0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.c0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.c0.onRelease();
            zIsFinished |= this.c0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.e0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.e0.onRelease();
            zIsFinished |= this.e0.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    public final void o0(int i2) {
        if (this.N) {
            return;
        }
        x0();
        o oVar = this.C;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            oVar.H0(i2);
            awakenScrollBars();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0058  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.V = 0;
        this.I = true;
        this.K = this.K && !isLayoutRequested();
        this.c.e();
        o oVar = this.C;
        if (oVar != null) {
            oVar.i = true;
            oVar.g0(this);
        }
        this.D0 = false;
        if (X0) {
            ThreadLocal<androidx.recyclerview.widget.q> threadLocal = androidx.recyclerview.widget.q.e;
            androidx.recyclerview.widget.q qVar = threadLocal.get();
            this.v0 = qVar;
            if (qVar == null) {
                this.v0 = new androidx.recyclerview.widget.q();
                WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
                Display display = getDisplay();
                if (isInEditMode() || display == null) {
                    refreshRate = 60.0f;
                } else {
                    refreshRate = display.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                }
                androidx.recyclerview.widget.q qVar2 = this.v0;
                qVar2.c = (long) (1.0E9f / refreshRate);
                threadLocal.set(qVar2);
            }
            ArrayList<RecyclerView> arrayList = this.v0.a;
            if (S0 && arrayList.contains(this)) {
                ib5.a("RecyclerView already present in worker list!");
            } else {
                arrayList.add(this);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        androidx.recyclerview.widget.q qVar;
        super.onDetachedFromWindow();
        l lVar = this.f0;
        if (lVar != null) {
            lVar.j();
        }
        x0();
        this.I = false;
        o oVar = this.C;
        u uVar = this.c;
        if (oVar != null) {
            oVar.i = false;
            oVar.h0(this, uVar);
        }
        this.K0.clear();
        removeCallbacks(this.L0);
        this.i.getClass();
        while (n0.a.d.b() != null) {
        }
        ArrayList<d0> arrayList = uVar.c;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            wue.a(arrayList.get(i2).itemView);
        }
        uVar.f(RecyclerView.this.B, false);
        Iterator<View> it = new r7i0(this).iterator();
        while (true) {
            t7i0 t7i0Var = (t7i0) it;
            if (!t7i0Var.hasNext()) {
                break;
            }
            ArrayList<z120> arrayList2 = wue.c((View) t7i0Var.next()).a;
            for (int iJ = kotlin.collections.b.j(arrayList2); -1 < iJ; iJ--) {
                arrayList2.get(iJ).a();
            }
        }
        if (!X0 || (qVar = this.v0) == null) {
            return;
        }
        boolean zRemove = qVar.a.remove(this);
        if (!S0 || zRemove) {
            this.v0 = null;
        } else {
            ib5.a("RecyclerView removal failed!");
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList<n> arrayList = this.F;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.get(i2).g(canvas, this, this.x0);
        }
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue;
        int i2;
        boolean z2;
        if (this.C != null && !this.N && motionEvent.getAction() == 8) {
            float f2 = 0.0f;
            if ((motionEvent.getSource() & 2) != 0) {
                float f3 = this.C.t() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.C.s() ? motionEvent.getAxisValue(10) : 0.0f;
                i2 = 0;
                z2 = false;
                f2 = f3;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                axisValue = motionEvent.getAxisValue(26);
                if (this.C.t()) {
                    float f4 = -axisValue;
                    axisValue = 0.0f;
                    f2 = f4;
                } else if (!this.C.s()) {
                    axisValue = 0.0f;
                }
                i2 = 26;
                z2 = this.P0;
            } else {
                axisValue = 0.0f;
                i2 = 0;
                z2 = false;
            }
            int i3 = (int) (f2 * this.s0);
            int i4 = (int) (axisValue * this.r0);
            if (z2) {
                OverScroller overScroller = this.u0.c;
                r0((overScroller.getFinalX() - overScroller.getCurrX()) + i4, (overScroller.getFinalY() - overScroller.getCurrY()) + i3, null, true);
            } else {
                o oVar = this.C;
                if (oVar == null) {
                    Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                } else if (!this.N) {
                    int[] iArr = this.J0;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    boolean zS = oVar.s();
                    boolean zT = this.C.t();
                    int i5 = zT ? (zS ? 1 : 0) | 2 : zS ? 1 : 0;
                    float y2 = motionEvent.getY();
                    float x2 = motionEvent.getX();
                    int iH0 = i4 - h0(i4, y2);
                    int iI0 = i3 - i0(i3, x2);
                    getScrollingChildHelper().h(i5, 1);
                    if (w(zS ? iH0 : 0, zT ? iI0 : 0, 1, this.J0, this.H0)) {
                        iH0 -= iArr[0];
                        iI0 -= iArr[1];
                    }
                    m0(zS ? iH0 : 0, zT ? iI0 : 0, motionEvent, 1);
                    androidx.recyclerview.widget.q qVar = this.v0;
                    if (qVar != null && (iH0 != 0 || iI0 != 0)) {
                        qVar.a(this, iH0, iI0);
                    }
                    w0(1);
                }
            }
            if (i2 != 0 && !z2) {
                this.R0.a(motionEvent, i2);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean z3;
        if (!this.N) {
            this.H = null;
            if (H(motionEvent)) {
                VelocityTracker velocityTracker = this.i0;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
                w0(0);
                g0();
                setScrollState(0);
                return true;
            }
            o oVar = this.C;
            if (oVar != null) {
                boolean zS = oVar.s();
                boolean zT = this.C.t();
                VelocityTracker velocityTrackerObtain = this.i0;
                if (velocityTrackerObtain == null) {
                    velocityTrackerObtain = VelocityTracker.obtain();
                    this.i0 = velocityTrackerObtain;
                }
                velocityTrackerObtain.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.O) {
                        this.O = false;
                    }
                    this.h0 = motionEvent.getPointerId(0);
                    int x2 = (int) (motionEvent.getX() + 0.5f);
                    this.l0 = x2;
                    this.j0 = x2;
                    int y2 = (int) (motionEvent.getY() + 0.5f);
                    this.m0 = y2;
                    this.k0 = y2;
                    EdgeEffect edgeEffect = this.b0;
                    if (edgeEffect == null || alf.a(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                        z2 = false;
                    } else {
                        alf.b(this.b0, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                        z2 = true;
                    }
                    EdgeEffect edgeEffect2 = this.d0;
                    if (edgeEffect2 != null && alf.a(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
                        alf.b(this.d0, 0.0f, motionEvent.getY() / getHeight());
                        z2 = true;
                    }
                    EdgeEffect edgeEffect3 = this.c0;
                    if (edgeEffect3 != null && alf.a(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
                        alf.b(this.c0, 0.0f, motionEvent.getX() / getWidth());
                        z2 = true;
                    }
                    EdgeEffect edgeEffect4 = this.e0;
                    if (edgeEffect4 != null && alf.a(edgeEffect4) != 0.0f && !canScrollVertically(1)) {
                        alf.b(this.e0, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                        z2 = true;
                    }
                    if (z2 || this.g0 == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        w0(1);
                    }
                    int[] iArr = this.I0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    u0(0);
                } else if (actionMasked == 1) {
                    this.i0.clear();
                    w0(0);
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.h0);
                    if (iFindPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.h0 + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x3 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y3 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    if (this.g0 != 1) {
                        int i2 = x3 - this.j0;
                        int i3 = y3 - this.k0;
                        if (!zS || Math.abs(i2) <= this.n0) {
                            z3 = false;
                        } else {
                            this.l0 = x3;
                            z3 = true;
                        }
                        if (zT && Math.abs(i3) > this.n0) {
                            this.m0 = y3;
                            z3 = true;
                        }
                        if (z3) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    VelocityTracker velocityTracker2 = this.i0;
                    if (velocityTracker2 != null) {
                        velocityTracker2.clear();
                    }
                    w0(0);
                    g0();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.h0 = motionEvent.getPointerId(actionIndex);
                    int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.l0 = x4;
                    this.j0 = x4;
                    int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.m0 = y4;
                    this.k0 = y4;
                } else if (actionMasked == 6) {
                    b0(motionEvent);
                }
                if (this.g0 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        Trace.beginSection("RV OnLayout");
        t();
        Trace.endSection();
        this.K = true;
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        o oVar = this.C;
        if (oVar == null) {
            r(i2, i3);
            return;
        }
        boolean zY = oVar.Y();
        boolean z2 = false;
        z zVar = this.x0;
        if (zY) {
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.C.b.r(i2, i3);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z2 = true;
            }
            this.M0 = z2;
            if (z2 || this.B == null) {
                return;
            }
            if (zVar.d == 1) {
                u();
            }
            this.C.K0(i2, i3);
            zVar.i = true;
            v();
            this.C.M0(i2, i3);
            if (this.C.P0()) {
                this.C.K0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                zVar.i = true;
                v();
                this.C.M0(i2, i3);
            }
            this.N0 = getMeasuredWidth();
            this.O0 = getMeasuredHeight();
            return;
        }
        if (this.J) {
            this.C.b.r(i2, i3);
            return;
        }
        if (this.Q) {
            t0();
            Z();
            d0();
            a0(true);
            if (zVar.k) {
                zVar.g = true;
            } else {
                this.e.c();
                zVar.g = false;
            }
            this.Q = false;
            v0(false);
        } else if (zVar.k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        f fVar = this.B;
        if (fVar != null) {
            zVar.e = fVar.getItemCount();
        } else {
            zVar.e = 0;
        }
        t0();
        this.C.b.r(i2, i3);
        v0(false);
        zVar.g = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (V()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.d = savedState;
        super.onRestoreInstanceState(savedState.a);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.d;
        if (savedState2 != null) {
            savedState.c = savedState2.c;
            return savedState;
        }
        o oVar = this.C;
        if (oVar != null) {
            savedState.c = oVar.w0();
            return savedState;
        }
        savedState.c = null;
        return savedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 == i4 && i3 == i5) {
            return;
        }
        this.e0 = null;
        this.c0 = null;
        this.d0 = null;
        this.b0 = null;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x010f A[PHI: r1
      0x010f: PHI (r1v46 int) = (r1v30 int), (r1v50 int) binds: [B:56:0x00fa, B:61:0x010b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zH;
        boolean z2;
        if (!this.N && !this.O) {
            r rVar = this.H;
            if (rVar == null) {
                zH = motionEvent.getAction() == 0 ? false : H(motionEvent);
            } else {
                rVar.a(this, motionEvent);
                int action = motionEvent.getAction();
                if (action == 3 || action == 1) {
                    this.H = null;
                }
                zH = true;
            }
            if (zH) {
                VelocityTracker velocityTracker = this.i0;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
                w0(0);
                g0();
                setScrollState(0);
                return true;
            }
            o oVar = this.C;
            if (oVar != null) {
                boolean zS = oVar.s();
                boolean zT = this.C.t();
                if (this.i0 == null) {
                    this.i0 = VelocityTracker.obtain();
                }
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                int[] iArr = this.I0;
                if (actionMasked == 0) {
                    iArr[1] = 0;
                    iArr[0] = 0;
                }
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                motionEventObtain.offsetLocation(iArr[0], iArr[1]);
                if (actionMasked != 0) {
                    if (actionMasked == 1) {
                        this.i0.addMovement(motionEventObtain);
                        VelocityTracker velocityTracker2 = this.i0;
                        int i2 = this.q0;
                        velocityTracker2.computeCurrentVelocity(1000, i2);
                        float f2 = zS ? -this.i0.getXVelocity(this.h0) : 0.0f;
                        float f3 = zT ? -this.i0.getYVelocity(this.h0) : 0.0f;
                        if ((f2 == 0.0f && f3 == 0.0f) || !M((int) f2, (int) f3, this.p0, i2)) {
                            setScrollState(0);
                        }
                        VelocityTracker velocityTracker3 = this.i0;
                        if (velocityTracker3 != null) {
                            velocityTracker3.clear();
                        }
                        w0(0);
                        g0();
                    } else if (actionMasked == 2) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(this.h0);
                        if (iFindPointerIndex < 0) {
                            Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.h0 + " not found. Did any MotionEvents get skipped?");
                            return false;
                        }
                        int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                        int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                        int iMax = this.l0 - x2;
                        int iMax2 = this.m0 - y2;
                        if (this.g0 != 1) {
                            if (zS) {
                                int i3 = this.n0;
                                iMax = iMax > 0 ? Math.max(0, iMax - i3) : Math.min(0, iMax + i3);
                                if (iMax != 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            } else {
                                z2 = false;
                            }
                            if (zT) {
                                int i4 = this.n0;
                                iMax2 = iMax2 > 0 ? Math.max(0, iMax2 - i4) : Math.min(0, iMax2 + i4);
                                if (iMax2 != 0) {
                                    z2 = true;
                                }
                            }
                            if (z2) {
                                setScrollState(1);
                            }
                        }
                        if (this.g0 == 1) {
                            int[] iArr2 = this.J0;
                            iArr2[0] = 0;
                            iArr2[1] = 0;
                            int iH0 = iMax - h0(iMax, motionEvent.getY());
                            int iI0 = iMax2 - i0(iMax2, motionEvent.getX());
                            boolean zW = w(zS ? iH0 : 0, zT ? iI0 : 0, 0, this.J0, this.H0);
                            int[] iArr3 = this.H0;
                            if (zW) {
                                iH0 -= iArr2[0];
                                iI0 -= iArr2[1];
                                iArr[0] = iArr[0] + iArr3[0];
                                iArr[1] = iArr[1] + iArr3[1];
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            int i5 = iH0;
                            int i6 = iI0;
                            this.l0 = x2 - iArr3[0];
                            this.m0 = y2 - iArr3[1];
                            if (m0(zS ? i5 : 0, zT ? i6 : 0, motionEvent, 0)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            androidx.recyclerview.widget.q qVar = this.v0;
                            if (qVar != null && (i5 != 0 || i6 != 0)) {
                                qVar.a(this, i5, i6);
                            }
                        }
                    } else if (actionMasked == 3) {
                        VelocityTracker velocityTracker4 = this.i0;
                        if (velocityTracker4 != null) {
                            velocityTracker4.clear();
                        }
                        w0(0);
                        g0();
                        setScrollState(0);
                    } else if (actionMasked == 5) {
                        this.h0 = motionEvent.getPointerId(actionIndex);
                        int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.l0 = x3;
                        this.j0 = x3;
                        int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        this.m0 = y3;
                        this.k0 = y3;
                    } else if (actionMasked == 6) {
                        b0(motionEvent);
                    }
                    motionEventObtain.recycle();
                    return true;
                }
                this.h0 = motionEvent.getPointerId(0);
                int x4 = (int) (motionEvent.getX() + 0.5f);
                this.l0 = x4;
                this.j0 = x4;
                int y4 = (int) (motionEvent.getY() + 0.5f);
                this.m0 = y4;
                this.k0 = y4;
                u0(0);
                this.i0.addMovement(motionEventObtain);
                motionEventObtain.recycle();
                return true;
            }
        }
        return false;
    }

    public final boolean p0(EdgeEffect edgeEffect, int i2, int i3) {
        if (i2 > 0) {
            return true;
        }
        float fA = alf.a(edgeEffect) * i3;
        float fAbs = Math.abs(-i2) * 0.35f;
        float f2 = this.a * 0.015f;
        double dLog = Math.log(fAbs / f2);
        double d2 = V0;
        return ((float) (Math.exp((d2 / (d2 - 1.0d)) * dLog) * ((double) f2))) < fA;
    }

    public final void q() {
        if (!this.K || this.T) {
            Trace.beginSection("RV FullInvalidate");
            t();
            Trace.endSection();
            return;
        }
        androidx.recyclerview.widget.a aVar = this.e;
        if (aVar.g()) {
            int i2 = aVar.f;
            if ((i2 & 4) == 0 || (i2 & 11) != 0) {
                if (aVar.g()) {
                    Trace.beginSection("RV FullInvalidate");
                    t();
                    Trace.endSection();
                    return;
                }
                return;
            }
            Trace.beginSection("RV PartialInvalidate");
            t0();
            Z();
            aVar.j();
            if (!this.M) {
                androidx.recyclerview.widget.e eVar = this.f;
                int iE = eVar.e();
                for (int i3 = 0; i3 < iE; i3++) {
                    d0 d0VarR = R(eVar.d(i3));
                    if (d0VarR != null && !d0VarR.shouldIgnore() && d0VarR.isUpdated()) {
                        t();
                    }
                }
                aVar.b();
            }
            v0(true);
            a0(true);
            Trace.endSection();
        }
    }

    public void q0(int i2, int i3) {
        r0(i2, i3, null, false);
    }

    public final void r(int i2, int i3) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
        setMeasuredDimension(o.v(i2, paddingRight, getMinimumWidth()), o.v(i3, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final void r0(int i2, int i3, Interpolator interpolator, boolean z2) {
        o oVar = this.C;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.N) {
            return;
        }
        if (!oVar.s()) {
            i2 = 0;
        }
        if (!this.C.t()) {
            i3 = 0;
        }
        if (i2 == 0 && i3 == 0) {
            return;
        }
        if (z2) {
            int i4 = i2 != 0 ? 1 : 0;
            if (i3 != 0) {
                i4 |= 2;
            }
            getScrollingChildHelper().h(i4, 1);
        }
        this.u0.c(i2, i3, Integer.MIN_VALUE, interpolator);
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z2) {
        d0 d0VarR = R(view);
        if (d0VarR != null) {
            if (d0VarR.isTmpDetached()) {
                d0VarR.clearTmpDetachFlag();
            } else if (!d0VarR.shouldIgnore()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(d0VarR);
                f87.b(sb, D());
                return;
            }
        } else if (S0) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            f87.b(sb2, D());
            return;
        }
        view.clearAnimation();
        s(view);
        super.removeDetachedView(view, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        y yVar = this.C.e;
        if ((yVar == null || !yVar.e) && !V() && view2 != null) {
            l0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.C.E0(this, view, rect, z2, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        ArrayList<r> arrayList = this.G;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.get(i2).e(z2);
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.L != 0 || this.N) {
            this.M = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s(View view) {
        d0 d0VarR = R(view);
        f fVar = this.B;
        if (fVar != null && d0VarR != null) {
            fVar.onViewDetachedFromWindow(d0VarR);
        }
        ArrayList arrayList = this.S;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((p) this.S.get(size)).b(view);
            }
        }
    }

    public final void s0(int i2) {
        if (this.N) {
            return;
        }
        o oVar = this.C;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            oVar.R0(this, i2);
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i2, int i3) {
        o oVar = this.C;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.N) {
            return;
        }
        boolean zS = oVar.s();
        boolean zT = this.C.t();
        if (zS || zT) {
            if (!zS) {
                i2 = 0;
            }
            if (!zT) {
                i3 = 0;
            }
            m0(i2, i3, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i2, int i3) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!V()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.P |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(g0 g0Var) {
        this.E0 = g0Var;
        r6i0.p(this, g0Var);
    }

    public void setAdapter(f fVar) {
        setLayoutFrozen(false);
        f fVar2 = this.B;
        w wVar = this.b;
        if (fVar2 != null) {
            fVar2.unregisterAdapterDataObserver(wVar);
            this.B.onDetachedFromRecyclerView(this);
        }
        l lVar = this.f0;
        if (lVar != null) {
            lVar.j();
        }
        o oVar = this.C;
        u uVar = this.c;
        if (oVar != null) {
            oVar.B0(uVar);
            this.C.C0(uVar);
        }
        uVar.a.clear();
        uVar.g();
        androidx.recyclerview.widget.a aVar = this.e;
        aVar.k(aVar.b);
        aVar.k(aVar.c);
        aVar.f = 0;
        f<?> fVar3 = this.B;
        this.B = fVar;
        if (fVar != null) {
            fVar.registerAdapterDataObserver(wVar);
            fVar.onAttachedToRecyclerView(this);
        }
        o oVar2 = this.C;
        if (oVar2 != null) {
            oVar2.f0();
        }
        f fVar4 = this.B;
        uVar.a.clear();
        uVar.g();
        uVar.f(fVar3, true);
        t tVarC = uVar.c();
        if (fVar3 != null) {
            tVarC.b--;
        }
        if (tVarC.b == 0) {
            SparseArray<t.a> sparseArray = tVarC.a;
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                t.a aVarValueAt = sparseArray.valueAt(i2);
                ArrayList<d0> arrayList = aVarValueAt.a;
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    d0 d0Var = arrayList.get(i3);
                    i3++;
                    wue.a(d0Var.itemView);
                }
                aVarValueAt.a.clear();
            }
        }
        if (fVar4 != null) {
            tVarC.b++;
        }
        uVar.e();
        this.x0.f = true;
        e0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(j jVar) {
        if (jVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z2) {
        if (z2 != this.v) {
            this.e0 = null;
            this.c0 = null;
            this.d0 = null;
            this.b0 = null;
        }
        this.v = z2;
        super.setClipToPadding(z2);
        if (this.K) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(k kVar) {
        kVar.getClass();
        this.a0 = kVar;
        this.e0 = null;
        this.c0 = null;
        this.d0 = null;
        this.b0 = null;
    }

    public void setHasFixedSize(boolean z2) {
        this.J = z2;
    }

    public void setItemAnimator(l lVar) {
        l lVar2 = this.f0;
        if (lVar2 != null) {
            lVar2.j();
            this.f0.a = null;
        }
        this.f0 = lVar;
        if (lVar != null) {
            lVar.a = this.C0;
        }
    }

    public void setItemViewCacheSize(int i2) {
        u uVar = this.c;
        uVar.e = i2;
        uVar.n();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(o oVar) {
        RecyclerView recyclerView;
        if (oVar == this.C) {
            return;
        }
        x0();
        o oVar2 = this.C;
        u uVar = this.c;
        if (oVar2 != null) {
            l lVar = this.f0;
            if (lVar != null) {
                lVar.j();
            }
            this.C.B0(uVar);
            this.C.C0(uVar);
            uVar.a.clear();
            uVar.g();
            if (this.I) {
                o oVar3 = this.C;
                oVar3.i = false;
                oVar3.h0(this, uVar);
            }
            this.C.N0(null);
            this.C = null;
        } else {
            uVar.a.clear();
            uVar.g();
        }
        androidx.recyclerview.widget.e eVar = this.f;
        eVar.b.g();
        ArrayList arrayList = eVar.c;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = eVar.a.a;
            if (size < 0) {
                break;
            }
            d0 d0VarR = R((View) arrayList.get(size));
            if (d0VarR != null) {
                d0VarR.onLeftHiddenState(recyclerView);
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            recyclerView.s(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.C = oVar;
        if (oVar != null) {
            if (oVar.b != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(oVar);
                mrh0.a(sb, " is already attached to a RecyclerView:", oVar.b.D());
                return;
            } else {
                oVar.N0(this);
                if (this.I) {
                    o oVar4 = this.C;
                    oVar4.i = true;
                    oVar4.g0(this);
                }
            }
        }
        uVar.n();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
        } else {
            hb5.a("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        getScrollingChildHelper().g(z2);
    }

    public void setOnFlingListener(q qVar) {
        this.o0 = qVar;
    }

    @Deprecated
    public void setOnScrollListener(s sVar) {
        this.y0 = sVar;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.t0 = z2;
    }

    public void setRecycledViewPool(t tVar) {
        u uVar = this.c;
        RecyclerView recyclerView = RecyclerView.this;
        uVar.f(recyclerView.B, false);
        t tVar2 = uVar.g;
        if (tVar2 != null) {
            tVar2.b--;
        }
        uVar.g = tVar;
        if (tVar != null && recyclerView.getAdapter() != null) {
            uVar.g.b++;
        }
        uVar.e();
    }

    @Deprecated
    public void setRecyclerListener(v vVar) {
        this.D = vVar;
    }

    public void setScrollState(int i2) {
        y yVar;
        if (i2 == this.g0) {
            return;
        }
        if (T0) {
            StringBuilder sbA = efe0.a(i2, "setting scroll state to ", " from ");
            sbA.append(this.g0);
            Log.d("RecyclerView", sbA.toString(), new Exception());
        }
        this.g0 = i2;
        if (i2 != 2) {
            c0 c0Var = this.u0;
            RecyclerView.this.removeCallbacks(c0Var);
            c0Var.c.abortAnimation();
            o oVar = this.C;
            if (oVar != null && (yVar = oVar.e) != null) {
                yVar.g();
            }
        }
        o oVar2 = this.C;
        if (oVar2 != null) {
            oVar2.x0(i2);
        }
        s sVar = this.y0;
        if (sVar != null) {
            sVar.a(this, i2);
        }
        ArrayList arrayList = this.z0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((s) this.z0.get(size)).a(this, i2);
            }
        }
    }

    public void setScrollingTouchSlop(int i2) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 != 0) {
            if (i2 == 1) {
                this.n0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i2 + "; using default value");
        }
        this.n0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(b0 b0Var) {
        this.c.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().h(i2, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().i(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z2) {
        if (z2 != this.N) {
            l("Do not suppressLayout in layout or scroll");
            if (z2) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.N = true;
                this.O = true;
                x0();
                return;
            }
            this.N = false;
            if (this.M && this.C != null && this.B != null) {
                requestLayout();
            }
            this.M = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:162:0x034b  */
    /* JADX WARN: Code duplicated, block: B:184:0x0397  */
    /* JADX WARN: Code duplicated, block: B:186:0x039a  */
    /* JADX WARN: Code duplicated, block: B:192:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:194:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:197:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:200:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:203:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:206:0x03d5 A[LOOP:4: B:199:0x03c1->B:206:0x03d5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:209:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:212:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:215:0x03f4 A[LOOP:5: B:208:0x03e0->B:215:0x03f4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:216:0x03f7 A[EDGE_INSN: B:216:0x03f7->B:217:0x03f8 BREAK  A[LOOP:5: B:208:0x03e0->B:215:0x03f4]] */
    /* JADX WARN: Code duplicated, block: B:218:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:249:0x03d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:250:0x03d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:251:0x03d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:0x03f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:253:0x03f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:0x03f1 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void t() {
        boolean z2;
        d0 d0Var;
        View view;
        int i2;
        int iB;
        int i3;
        int iMin;
        d0 d0VarK;
        d0 d0VarK2;
        int i4;
        View viewFindViewById;
        int i5;
        boolean z3;
        if (this.B == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.C == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        z zVar = this.x0;
        boolean z4 = false;
        zVar.i = false;
        boolean z5 = true;
        Object[] objArr = this.M0 && !(this.N0 == getWidth() && this.O0 == getHeight());
        this.N0 = 0;
        this.O0 = 0;
        this.M0 = false;
        if (zVar.d == 1) {
            u();
            this.C.J0(this);
            v();
        } else {
            androidx.recyclerview.widget.a aVar = this.e;
            if ((aVar.c.isEmpty() || aVar.b.isEmpty()) && !objArr == true && this.C.C == getWidth() && this.C.D == getHeight()) {
                this.C.J0(this);
            } else {
                this.C.J0(this);
                v();
            }
        }
        zVar.a(4);
        t0();
        Z();
        zVar.d = 1;
        boolean z6 = zVar.j;
        androidx.recyclerview.widget.e eVar = this.f;
        u uVar = this.c;
        n0 n0Var = this.i;
        if (z6) {
            int iE = eVar.e() - 1;
            while (iE >= 0) {
                d0 d0VarR = R(eVar.d(iE));
                if (d0VarR.shouldIgnore()) {
                    z3 = z5;
                } else {
                    long jO = O(d0VarR);
                    this.f0.getClass();
                    l.b bVar = new l.b();
                    bVar.a(d0VarR);
                    qkt<d0> qktVar = n0Var.b;
                    z3 = z5;
                    nj90<d0, n0.a> nj90Var = n0Var.a;
                    d0 d0VarB = qktVar.b(jO);
                    if (d0VarB == null || d0VarB.shouldIgnore()) {
                        n0Var.a(d0VarR, bVar);
                    } else {
                        n0.a aVar2 = nj90Var.get(d0VarB);
                        boolean z7 = (aVar2 == null || (aVar2.a & 1) == 0) ? z4 : z3;
                        n0.a aVar3 = nj90Var.get(d0VarR);
                        boolean z8 = (aVar3 == null || (aVar3.a & 1) == 0) ? z4 : z3;
                        if (z7 && d0VarB == d0VarR) {
                            n0Var.a(d0VarR, bVar);
                        } else {
                            l.b bVarB = n0Var.b(d0VarB, 4);
                            n0Var.a(d0VarR, bVar);
                            l.b bVarB2 = n0Var.b(d0VarR, 8);
                            if (bVarB == null) {
                                int iE2 = eVar.e();
                                for (int i6 = 0; i6 < iE2; i6++) {
                                    d0 d0VarR2 = R(eVar.d(i6));
                                    if (d0VarR2 != d0VarR && O(d0VarR2) == jO) {
                                        f fVar = this.B;
                                        if (fVar == null || !fVar.hasStableIds()) {
                                            StringBuilder sb = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                                            sb.append(d0VarR2);
                                            sb.append(" \n View Holder 2:");
                                            sb.append(d0VarR);
                                            lpd0.a(sb, D());
                                            return;
                                        }
                                        StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                                        sb2.append(d0VarR2);
                                        sb2.append(" \n View Holder 2:");
                                        sb2.append(d0VarR);
                                        lpd0.a(sb2, D());
                                        return;
                                    }
                                }
                                Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + d0VarB + " cannot be found but it is necessary for " + d0VarR + D());
                            } else {
                                d0VarB.setIsRecyclable(false);
                                if (z7) {
                                    h(d0VarB);
                                }
                                if (d0VarB != d0VarR) {
                                    if (z8) {
                                        h(d0VarR);
                                    }
                                    d0VarB.mShadowedHolder = d0VarR;
                                    h(d0VarB);
                                    uVar.m(d0VarB);
                                    d0VarR.setIsRecyclable(false);
                                    d0VarR.mShadowingHolder = d0VarB;
                                }
                                if (this.f0.b(d0VarB, d0VarR, bVarB, bVarB2)) {
                                    c0();
                                }
                            }
                        }
                    }
                }
                iE--;
                z5 = z3;
                z4 = false;
            }
            z2 = z5;
            nj90<d0, n0.a> nj90Var2 = n0Var.a;
            for (int i7 = nj90Var2.c - 1; i7 >= 0; i7--) {
                d0 d0VarG = nj90Var2.g(i7);
                n0.a aVarI = nj90Var2.i(i7);
                int i8 = aVarI.a;
                int i9 = i8 & 3;
                d dVar = this.Q0;
                if (i9 == 3) {
                    RecyclerView recyclerView = RecyclerView.this;
                    recyclerView.C.D0(d0VarG.itemView, recyclerView.c);
                } else if ((i8 & 1) != 0) {
                    l.b bVar2 = aVarI.b;
                    if (bVar2 == null) {
                        RecyclerView recyclerView2 = RecyclerView.this;
                        recyclerView2.C.D0(d0VarG.itemView, recyclerView2.c);
                    } else {
                        l.b bVar3 = aVarI.c;
                        RecyclerView recyclerView3 = RecyclerView.this;
                        recyclerView3.c.m(d0VarG);
                        recyclerView3.h(d0VarG);
                        d0VarG.setIsRecyclable(false);
                        if (recyclerView3.f0.c(d0VarG, bVar2, bVar3)) {
                            recyclerView3.c0();
                        }
                    }
                } else if ((i8 & 14) == 14) {
                    l.b bVar4 = aVarI.b;
                    l.b bVar5 = aVarI.c;
                    RecyclerView recyclerView4 = RecyclerView.this;
                    d0VarG.setIsRecyclable(false);
                    if (recyclerView4.f0.a(d0VarG, bVar4, bVar5)) {
                        recyclerView4.c0();
                    }
                } else if ((i8 & 12) == 12) {
                    l.b bVar6 = aVarI.b;
                    l.b bVar7 = aVarI.c;
                    dVar.getClass();
                    d0VarG.setIsRecyclable(false);
                    RecyclerView recyclerView5 = RecyclerView.this;
                    boolean z9 = recyclerView5.T;
                    l lVar = recyclerView5.f0;
                    if (z9) {
                        if (lVar.b(d0VarG, d0VarG, bVar6, bVar7)) {
                            recyclerView5.c0();
                        }
                    } else if (lVar.d(d0VarG, bVar6, bVar7)) {
                        recyclerView5.c0();
                    }
                } else if ((i8 & 4) != 0) {
                    l.b bVar8 = aVarI.b;
                    RecyclerView recyclerView6 = RecyclerView.this;
                    recyclerView6.c.m(d0VarG);
                    recyclerView6.h(d0VarG);
                    d0VarG.setIsRecyclable(false);
                    if (recyclerView6.f0.c(d0VarG, bVar8, null)) {
                        recyclerView6.c0();
                    }
                } else {
                    if ((i8 & 8) != 0) {
                        l.b bVar9 = aVarI.b;
                        l.b bVar10 = aVarI.c;
                        RecyclerView recyclerView7 = RecyclerView.this;
                        i5 = 0;
                        d0VarG.setIsRecyclable(false);
                        if (recyclerView7.f0.a(d0VarG, bVar9, bVar10)) {
                            recyclerView7.c0();
                        }
                    }
                    aVarI.a = i5;
                    aVarI.b = null;
                    aVarI.c = null;
                    n0.a.d.a(aVarI);
                }
                i5 = 0;
                aVarI.a = i5;
                aVarI.b = null;
                aVarI.c = null;
                n0.a.d.a(aVarI);
            }
        } else {
            z2 = true;
        }
        this.C.C0(uVar);
        zVar.b = zVar.e;
        this.T = false;
        this.U = false;
        zVar.j = false;
        zVar.k = false;
        this.C.f = false;
        ArrayList<d0> arrayList = uVar.b;
        if (arrayList != null) {
            arrayList.clear();
        }
        o oVar = this.C;
        if (oVar.z) {
            oVar.y = 0;
            oVar.z = false;
            uVar.n();
        }
        this.C.u0(zVar);
        boolean z10 = z2;
        a0(z10);
        v0(false);
        n0Var.a.clear();
        n0Var.b.a();
        int[] iArr = this.F0;
        int i10 = iArr[0];
        int i11 = iArr[z10 ? 1 : 0];
        I(iArr);
        if (iArr[0] != i10 || iArr[z10 ? 1 : 0] != i11) {
            y(0, 0);
        }
        if (this.t0 && this.B != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (isFocused()) {
                if (zVar.m == -1) {
                    d0Var = null;
                } else {
                    d0Var = null;
                }
                if (d0Var == null) {
                    if (!eVar.c.contains(d0Var.itemView)) {
                        if (eVar.e() <= 0) {
                            view = null;
                            break;
                        }
                        i2 = zVar.l;
                        if (i2 == -1) {
                            i2 = 0;
                        }
                        iB = zVar.b();
                        i3 = i2;
                        while (true) {
                            if (i3 < iB) {
                                d0VarK2 = K(i3);
                                if (d0VarK2 != null) {
                                    if (d0VarK2.itemView.hasFocusable()) {
                                        view = d0VarK2.itemView;
                                    } else {
                                        i3++;
                                    }
                                }
                            }
                            iMin = Math.min(iB, i2) - 1;
                            while (true) {
                                if (iMin >= 0) {
                                    d0VarK = K(iMin);
                                    if (d0VarK != null) {
                                        if (d0VarK.itemView.hasFocusable()) {
                                            view = d0VarK.itemView;
                                            break;
                                        }
                                        iMin--;
                                    }
                                }
                                view = null;
                                break;
                            }
                        }
                    } else {
                        if (eVar.e() <= 0) {
                            view = null;
                            break;
                        }
                        i2 = zVar.l;
                        if (i2 == -1) {
                            i2 = 0;
                        }
                        iB = zVar.b();
                        i3 = i2;
                        while (true) {
                            if (i3 < iB) {
                                d0VarK2 = K(i3);
                                if (d0VarK2 != null) {
                                    if (d0VarK2.itemView.hasFocusable()) {
                                        view = d0VarK2.itemView;
                                    } else {
                                        i3++;
                                    }
                                }
                            }
                            iMin = Math.min(iB, i2) - 1;
                            while (true) {
                                if (iMin >= 0) {
                                    d0VarK = K(iMin);
                                    if (d0VarK != null) {
                                        if (d0VarK.itemView.hasFocusable()) {
                                            view = d0VarK.itemView;
                                            break;
                                        }
                                        iMin--;
                                    }
                                }
                                view = null;
                                break;
                            }
                        }
                    }
                } else {
                    if (eVar.e() <= 0) {
                        view = null;
                        break;
                    }
                    i2 = zVar.l;
                    if (i2 == -1) {
                        i2 = 0;
                    }
                    iB = zVar.b();
                    i3 = i2;
                    while (true) {
                        if (i3 < iB) {
                            d0VarK2 = K(i3);
                            if (d0VarK2 != null) {
                                if (d0VarK2.itemView.hasFocusable()) {
                                    view = d0VarK2.itemView;
                                } else {
                                    i3++;
                                }
                            }
                        }
                        iMin = Math.min(iB, i2) - 1;
                        while (true) {
                            if (iMin >= 0) {
                                d0VarK = K(iMin);
                                if (d0VarK != null) {
                                    if (d0VarK.itemView.hasFocusable()) {
                                        view = d0VarK.itemView;
                                        break;
                                    }
                                    iMin--;
                                }
                            }
                            view = null;
                            break;
                        }
                    }
                }
                if (view != null) {
                    i4 = zVar.n;
                    if (i4 != -1) {
                        view = viewFindViewById;
                    }
                    view.requestFocus();
                }
            } else if (eVar.c.contains(getFocusedChild())) {
                if (zVar.m == -1 && this.B.hasStableIds()) {
                    long j2 = zVar.m;
                    f fVar2 = this.B;
                    if (fVar2 == null || !fVar2.hasStableIds()) {
                        d0Var = null;
                    } else {
                        int iH = eVar.h();
                        d0Var = null;
                        for (int i12 = 0; i12 < iH; i12++) {
                            d0 d0VarR3 = R(eVar.g(i12));
                            if (d0VarR3 != null && !d0VarR3.isRemoved() && d0VarR3.getItemId() == j2) {
                                if (!eVar.c.contains(d0VarR3.itemView)) {
                                    d0Var = d0VarR3;
                                    break;
                                }
                                d0Var = d0VarR3;
                            }
                        }
                    }
                } else {
                    d0Var = null;
                }
                if (d0Var == null) {
                    if (eVar.e() <= 0) {
                        view = null;
                        break;
                    }
                    i2 = zVar.l;
                    if (i2 == -1) {
                        i2 = 0;
                    }
                    iB = zVar.b();
                    i3 = i2;
                    while (true) {
                        if (i3 < iB) {
                            d0VarK2 = K(i3);
                            if (d0VarK2 != null) {
                                if (d0VarK2.itemView.hasFocusable()) {
                                    view = d0VarK2.itemView;
                                } else {
                                    i3++;
                                }
                            }
                        }
                        iMin = Math.min(iB, i2) - 1;
                        while (true) {
                            if (iMin >= 0) {
                                d0VarK = K(iMin);
                                if (d0VarK != null) {
                                    if (d0VarK.itemView.hasFocusable()) {
                                        view = d0VarK.itemView;
                                        break;
                                    }
                                    iMin--;
                                }
                            }
                            view = null;
                            break;
                        }
                    }
                } else if (!eVar.c.contains(d0Var.itemView) && d0Var.itemView.hasFocusable()) {
                    view = d0Var.itemView;
                } else {
                    if (eVar.e() <= 0) {
                        view = null;
                        break;
                    }
                    i2 = zVar.l;
                    if (i2 == -1) {
                        i2 = 0;
                    }
                    iB = zVar.b();
                    i3 = i2;
                    while (true) {
                        if (i3 < iB) {
                            d0VarK2 = K(i3);
                            if (d0VarK2 != null) {
                                if (d0VarK2.itemView.hasFocusable()) {
                                    view = d0VarK2.itemView;
                                } else {
                                    i3++;
                                }
                            }
                        }
                        iMin = Math.min(iB, i2) - 1;
                        while (true) {
                            if (iMin >= 0) {
                                d0VarK = K(iMin);
                                if (d0VarK != null) {
                                    if (d0VarK.itemView.hasFocusable()) {
                                        view = d0VarK.itemView;
                                        break;
                                    }
                                    iMin--;
                                }
                            }
                            view = null;
                            break;
                        }
                    }
                }
                if (view != null) {
                    i4 = zVar.n;
                    if (i4 != -1 && (viewFindViewById = view.findViewById(i4)) != null && viewFindViewById.isFocusable()) {
                        view = viewFindViewById;
                    }
                    view.requestFocus();
                }
            }
        }
        zVar.m = -1L;
        zVar.l = -1;
        zVar.n = -1;
    }

    public void t0() {
        int i2 = this.L + 1;
        this.L = i2;
        if (i2 != 1 || this.N) {
            return;
        }
        this.M = false;
    }

    public final void u() {
        n0.a aVar;
        View viewG;
        z zVar = this.x0;
        zVar.a(1);
        E(zVar);
        zVar.i = false;
        t0();
        n0 n0Var = this.i;
        nj90<d0, n0.a> nj90Var = n0Var.a;
        nj90<d0, n0.a> nj90Var2 = n0Var.a;
        nj90Var.clear();
        qkt<d0> qktVar = n0Var.b;
        qktVar.a();
        Z();
        d0();
        d0 d0VarQ = null;
        View focusedChild = (this.t0 && hasFocus() && this.B != null) ? getFocusedChild() : null;
        if (focusedChild != null && (viewG = G(focusedChild)) != null) {
            d0VarQ = Q(viewG);
        }
        if (d0VarQ == null) {
            zVar.m = -1L;
            zVar.l = -1;
            zVar.n = -1;
        } else {
            zVar.m = this.B.hasStableIds() ? d0VarQ.getItemId() : -1L;
            zVar.l = this.T ? -1 : d0VarQ.isRemoved() ? d0VarQ.mOldPosition : d0VarQ.getAbsoluteAdapterPosition();
            View focusedChild2 = d0VarQ.itemView;
            int id = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id = focusedChild2.getId();
                }
            }
            zVar.n = id;
        }
        zVar.h = zVar.j && this.B0;
        this.B0 = false;
        this.A0 = false;
        zVar.g = zVar.k;
        zVar.e = this.B.getItemCount();
        I(this.F0);
        boolean z2 = zVar.j;
        androidx.recyclerview.widget.e eVar = this.f;
        if (z2) {
            int iE = eVar.e();
            for (int i2 = 0; i2 < iE; i2++) {
                d0 d0VarR = R(eVar.d(i2));
                if (!d0VarR.shouldIgnore() && (!d0VarR.isInvalid() || this.B.hasStableIds())) {
                    l lVar = this.f0;
                    l.e(d0VarR);
                    d0VarR.getUnmodifiedPayloads();
                    lVar.getClass();
                    l.b bVar = new l.b();
                    bVar.a(d0VarR);
                    n0.a aVarA = nj90Var2.get(d0VarR);
                    if (aVarA == null) {
                        aVarA = n0.a.a();
                        nj90Var2.put(d0VarR, aVarA);
                    }
                    aVarA.b = bVar;
                    aVarA.a |= 4;
                    if (zVar.h && d0VarR.isUpdated() && !d0VarR.isRemoved() && !d0VarR.shouldIgnore() && !d0VarR.isInvalid()) {
                        qktVar.f(d0VarR, O(d0VarR));
                    }
                }
            }
        }
        if (zVar.k) {
            int iH = eVar.h();
            for (int i3 = 0; i3 < iH; i3++) {
                d0 d0VarR2 = R(eVar.g(i3));
                if (S0 && d0VarR2.mPosition == -1 && !d0VarR2.isRemoved()) {
                    ib5.a("view holder cannot have position -1 unless it is removed".concat(D()));
                    return;
                } else {
                    if (!d0VarR2.shouldIgnore()) {
                        d0VarR2.saveOldPosition();
                    }
                }
            }
            boolean z3 = zVar.f;
            zVar.f = false;
            this.C.t0(this.c, zVar);
            zVar.f = z3;
            for (int i4 = 0; i4 < eVar.e(); i4++) {
                d0 d0VarR3 = R(eVar.d(i4));
                if (!d0VarR3.shouldIgnore() && ((aVar = nj90Var2.get(d0VarR3)) == null || (aVar.a & 4) == 0)) {
                    l.e(d0VarR3);
                    boolean zHasAnyOfTheFlags = d0VarR3.hasAnyOfTheFlags(8192);
                    l lVar2 = this.f0;
                    d0VarR3.getUnmodifiedPayloads();
                    lVar2.getClass();
                    l.b bVar2 = new l.b();
                    bVar2.a(d0VarR3);
                    if (zHasAnyOfTheFlags) {
                        f0(d0VarR3, bVar2);
                    } else {
                        n0.a aVarA2 = nj90Var2.get(d0VarR3);
                        if (aVarA2 == null) {
                            aVarA2 = n0.a.a();
                            nj90Var2.put(d0VarR3, aVarA2);
                        }
                        aVarA2.a |= 2;
                        aVarA2.b = bVar2;
                    }
                }
            }
            n();
        } else {
            n();
        }
        a0(true);
        v0(false);
        zVar.d = 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u0(int i2) {
        boolean zS = this.C.s();
        int i3 = zS;
        if (this.C.t()) {
            i3 = (zS ? 1 : 0) | 2;
        }
        getScrollingChildHelper().h(i3, i2);
    }

    public final void v() {
        t0();
        Z();
        z zVar = this.x0;
        zVar.a(6);
        this.e.c();
        zVar.e = this.B.getItemCount();
        zVar.c = 0;
        if (this.d != null && this.B.canRestoreState()) {
            Parcelable parcelable = this.d.c;
            if (parcelable != null) {
                this.C.v0(parcelable);
            }
            this.d = null;
        }
        zVar.g = false;
        this.C.t0(this.c, zVar);
        zVar.f = false;
        zVar.j = zVar.j && this.f0 != null;
        zVar.d = 4;
        a0(true);
        v0(false);
    }

    public void v0(boolean z2) {
        int i2 = this.L;
        if (i2 < 1) {
            if (S0) {
                ib5.a("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.".concat(D()));
                return;
            } else {
                this.L = 1;
                i2 = 1;
            }
        }
        if (!z2 && !this.N) {
            this.M = false;
        }
        if (i2 == 1) {
            if (z2 && this.M && !this.N && this.C != null && this.B != null) {
                t();
            }
            if (!this.N) {
                this.M = false;
            }
        }
        this.L--;
    }

    public final boolean w(int i2, int i3, int i4, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i2, i3, i4, iArr, iArr2);
    }

    public final void w0(int i2) {
        getScrollingChildHelper().i(i2);
    }

    public final void x(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        getScrollingChildHelper().d(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    public final void x0() {
        y yVar;
        setScrollState(0);
        c0 c0Var = this.u0;
        RecyclerView.this.removeCallbacks(c0Var);
        c0Var.c.abortAnimation();
        o oVar = this.C;
        if (oVar == null || (yVar = oVar.e) == null) {
            return;
        }
        yVar.g();
    }

    public final void y(int i2, int i3) {
        this.W++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i2, scrollY - i3);
        s sVar = this.y0;
        if (sVar != null) {
            sVar.b(this, i2, i3);
        }
        ArrayList arrayList = this.z0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((s) this.z0.get(size)).b(this, i2, i3);
            }
        }
        this.W--;
    }

    public final void z() {
        if (this.e0 != null) {
            return;
        }
        ((a0) this.a0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.e0 = edgeEffect;
        if (this.v) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public Parcelable c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readParcelable(classLoader == null ? o.class.getClassLoader() : classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.c, 0);
        }

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        }
    }

    public static abstract class f<VH extends d0> {
        private final g mObservable = new g();
        private boolean mHasStableIds = false;
        private a mStateRestorationPolicy = a.a;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class a {
            public static final a a;
            public static final a b;
            public static final a c;
            public static final /* synthetic */ a[] d;

            static {
                a aVar = new a("ALLOW", 0);
                a = aVar;
                a aVar2 = new a("PREVENT_WHEN_EMPTY", 1);
                b = aVar2;
                a aVar3 = new a("PREVENT", 2);
                c = aVar3;
                d = new a[]{aVar, aVar2, aVar3};
            }

            public a() {
                throw null;
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) d.clone();
            }
        }

        public void C() {
            notifyDataSetChanged();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void bindViewHolder(VH vh, int i) {
            boolean z = vh.mBindingAdapter == null;
            if (z) {
                vh.mPosition = i;
                if (hasStableIds()) {
                    vh.mItemId = getItemId(i);
                }
                vh.setFlags(1, 519);
                if (vig0.a()) {
                    Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(vh.mItemViewType)));
                }
            }
            vh.mBindingAdapter = this;
            if (RecyclerView.S0) {
                if (vh.itemView.getParent() == null && vh.itemView.isAttachedToWindow() != vh.isTmpDetached()) {
                    throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + vh.isTmpDetached() + ", attached to window: " + vh.itemView.isAttachedToWindow() + ", holder: " + vh);
                }
                if (vh.itemView.getParent() == null && vh.itemView.isAttachedToWindow()) {
                    rcp.a(vh, "Attempting to bind attached holder with no parent (AKA temp detached): ");
                    return;
                }
            }
            onBindViewHolder(vh, i, vh.getUnmodifiedPayloads());
            if (z) {
                vh.clearPayload();
                ViewGroup.LayoutParams layoutParams = vh.itemView.getLayoutParams();
                if (layoutParams instanceof LayoutParams) {
                    ((LayoutParams) layoutParams).c = true;
                }
                Trace.endSection();
            }
        }

        public boolean canRestoreState() {
            int iOrdinal = this.mStateRestorationPolicy.ordinal();
            if (iOrdinal != 1) {
                return iOrdinal != 2;
            }
            return getItemCount() > 0;
        }

        public final VH createViewHolder(ViewGroup viewGroup, int i) {
            try {
                if (vig0.a()) {
                    Trace.beginSection(String.format("RV onCreateViewHolder type=0x%X", Integer.valueOf(i)));
                }
                VH vh = (VH) onCreateViewHolder(viewGroup, i);
                if (vh.itemView.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                vh.mItemViewType = i;
                Trace.endSection();
                return vh;
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }

        public int findRelativeAdapterPositionIn(f<? extends d0> fVar, d0 d0Var, int i) {
            if (fVar == this) {
                return i;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i) {
            return -1L;
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public final a getStateRestorationPolicy() {
            return this.mStateRestorationPolicy;
        }

        public final boolean hasObservers() {
            return this.mObservable.a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.b();
        }

        public final void notifyItemChanged(int i) {
            this.mObservable.d(i, 1, null);
        }

        public final void notifyItemInserted(int i) {
            this.mObservable.e(i, 1);
        }

        public final void notifyItemMoved(int i, int i2) {
            this.mObservable.c(i, i2);
        }

        public final void notifyItemRangeChanged(int i, int i2) {
            this.mObservable.d(i, i2, null);
        }

        public final void notifyItemRangeInserted(int i, int i2) {
            this.mObservable.e(i, i2);
        }

        public final void notifyItemRangeRemoved(int i, int i2) {
            this.mObservable.f(i, i2);
        }

        public final void notifyItemRemoved(int i) {
            this.mObservable.f(i, 1);
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(VH vh, int i);

        public void onBindViewHolder(VH vh, int i, List<Object> list) {
            onBindViewHolder(vh, i);
        }

        public abstract VH onCreateViewHolder(ViewGroup viewGroup, int i);

        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(VH vh) {
            return false;
        }

        public void onViewAttachedToWindow(VH vh) {
        }

        public void onViewDetachedFromWindow(VH vh) {
        }

        public void onViewRecycled(VH vh) {
        }

        public void registerAdapterDataObserver(h hVar) {
            this.mObservable.registerObserver(hVar);
        }

        public void setHasStableIds(boolean z) {
            if (hasObservers()) {
                ib5.a("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            } else {
                this.mHasStableIds = z;
            }
        }

        public void setStateRestorationPolicy(a aVar) {
            this.mStateRestorationPolicy = aVar;
            this.mObservable.g();
        }

        public void unregisterAdapterDataObserver(h hVar) {
            this.mObservable.unregisterObserver(hVar);
        }

        public final void notifyItemRangeChanged(int i, int i2, Object obj) {
            this.mObservable.d(i, i2, obj);
        }

        public final void notifyItemChanged(int i, Object obj) {
            this.mObservable.d(i, 1, obj);
        }
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public d0 a;
        public final Rect b;
        public boolean c;
        public boolean d;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.LayoutParams) layoutParams);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }
    }

    public static abstract class o {
        public int A;
        public int B;
        public int C;
        public int D;
        public androidx.recyclerview.widget.e a;
        public RecyclerView b;
        public final m0 c;
        public final m0 d;
        public y e;
        public boolean f;
        public boolean i;
        public final boolean v;
        public final boolean w;
        public int y;
        public boolean z;

        public class a implements m0.b {
            public a() {
            }

            @Override // androidx.recyclerview.widget.m0.b
            public final int a(View view) {
                return o.P(view) - ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.m0.b
            public final int b() {
                return o.this.getPaddingLeft();
            }

            @Override // androidx.recyclerview.widget.m0.b
            public final int c() {
                o oVar = o.this;
                return oVar.C - oVar.getPaddingRight();
            }

            @Override // androidx.recyclerview.widget.m0.b
            public final View d(int i) {
                return o.this.J(i);
            }

            @Override // androidx.recyclerview.widget.m0.b
            public final int e(View view) {
                return o.S(view) + ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).rightMargin;
            }
        }

        public class b implements m0.b {
            public b() {
            }

            @Override // androidx.recyclerview.widget.m0.b
            public final int a(View view) {
                return o.T(view) - ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.m0.b
            public final int b() {
                return o.this.getPaddingTop();
            }

            @Override // androidx.recyclerview.widget.m0.b
            public final int c() {
                o oVar = o.this;
                return oVar.D - oVar.getPaddingBottom();
            }

            @Override // androidx.recyclerview.widget.m0.b
            public final View d(int i) {
                return o.this.J(i);
            }

            @Override // androidx.recyclerview.widget.m0.b
            public final int e(View view) {
                return o.N(view) + ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).bottomMargin;
            }
        }

        public static class c {
            public int a;
            public int b;
            public boolean c;
            public boolean d;
        }

        public o() {
            a aVar = new a();
            b bVar = new b();
            this.c = new m0(aVar);
            this.d = new m0(bVar);
            this.f = false;
            this.i = false;
            this.v = true;
            this.w = true;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001a  */
        /* JADX WARN: Code duplicated, block: B:14:0x0022  */
        /* JADX WARN: Code duplicated, block: B:5:0x0010  */
        public static int L(boolean z, int i, int i2, int i3, int i4) {
            int iMax = Math.max(0, i - i3);
            if (z) {
                if (i4 >= 0) {
                    i2 = 1073741824;
                } else if (i4 != -1 || (i2 != Integer.MIN_VALUE && (i2 == 0 || i2 != 1073741824))) {
                    i2 = 0;
                    i4 = 0;
                } else {
                    i4 = iMax;
                }
            } else if (i4 >= 0) {
                i2 = 1073741824;
            } else if (i4 == -1) {
                i4 = iMax;
            } else if (i4 != -2) {
                i2 = 0;
                i4 = 0;
            } else if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
                i4 = iMax;
                i2 = Integer.MIN_VALUE;
            } else {
                i4 = iMax;
                i2 = 0;
            }
            return View.MeasureSpec.makeMeasureSpec(i4, i2);
        }

        public static int N(View view) {
            return view.getBottom() + ((LayoutParams) view.getLayoutParams()).b.bottom;
        }

        public static int P(View view) {
            return view.getLeft() - ((LayoutParams) view.getLayoutParams()).b.left;
        }

        public static int Q(View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public static int R(View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public static int S(View view) {
            return view.getRight() + ((LayoutParams) view.getLayoutParams()).b.right;
        }

        public static int T(View view) {
            return view.getTop() - ((LayoutParams) view.getLayoutParams()).b.top;
        }

        public static int U(View view) {
            return ((LayoutParams) view.getLayoutParams()).a.getLayoutPosition();
        }

        public static c V(Context context, AttributeSet attributeSet, int i, int i2) {
            c cVar = new c();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ek30.a, i, i2);
            cVar.a = typedArrayObtainStyledAttributes.getInt(0, 1);
            cVar.b = typedArrayObtainStyledAttributes.getInt(10, 1);
            cVar.c = typedArrayObtainStyledAttributes.getBoolean(9, false);
            cVar.d = typedArrayObtainStyledAttributes.getBoolean(11, false);
            typedArrayObtainStyledAttributes.recycle();
            return cVar;
        }

        public static boolean a0(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i;
            }
            return true;
        }

        public static int v(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? Math.max(i2, i3) : size;
            }
            return Math.min(size, Math.max(i2, i3));
        }

        public int A(z zVar) {
            return 0;
        }

        public final void A0() {
            for (int iK = K() - 1; iK >= 0; iK--) {
                this.a.j(iK);
            }
        }

        public int B(z zVar) {
            return 0;
        }

        public final void B0(u uVar) {
            for (int iK = K() - 1; iK >= 0; iK--) {
                if (!RecyclerView.R(J(iK)).shouldIgnore()) {
                    View viewJ = J(iK);
                    if (J(iK) != null) {
                        this.a.j(iK);
                    }
                    uVar.i(viewJ);
                }
            }
        }

        public int C(z zVar) {
            return 0;
        }

        public final void C0(u uVar) {
            ArrayList<d0> arrayList;
            int size = uVar.a.size();
            int i = size - 1;
            while (true) {
                arrayList = uVar.a;
                if (i < 0) {
                    break;
                }
                View view = arrayList.get(i).itemView;
                d0 d0VarR = RecyclerView.R(view);
                if (!d0VarR.shouldIgnore()) {
                    d0VarR.setIsRecyclable(false);
                    if (d0VarR.isTmpDetached()) {
                        this.b.removeDetachedView(view, false);
                    }
                    l lVar = this.b.f0;
                    if (lVar != null) {
                        lVar.i(d0VarR);
                    }
                    d0VarR.setIsRecyclable(true);
                    d0 d0VarR2 = RecyclerView.R(view);
                    d0VarR2.mScrapContainer = null;
                    d0VarR2.mInChangeScrap = false;
                    d0VarR2.clearReturnedFromScrapFlag();
                    uVar.j(d0VarR2);
                }
                i--;
            }
            arrayList.clear();
            ArrayList<d0> arrayList2 = uVar.b;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            if (size > 0) {
                this.b.invalidate();
            }
        }

        public int D(z zVar) {
            return 0;
        }

        public final void D0(View view, u uVar) {
            androidx.recyclerview.widget.e eVar = this.a;
            e0 e0Var = eVar.a;
            int i = eVar.d;
            if (i == 1) {
                ib5.a("Cannot call removeView(At) within removeView(At)");
                return;
            }
            if (i == 2) {
                ib5.a("Cannot call removeView(At) within removeViewIfHidden");
                return;
            }
            try {
                eVar.d = 1;
                eVar.e = view;
                int iIndexOfChild = e0Var.a.indexOfChild(view);
                if (iIndexOfChild >= 0) {
                    if (eVar.b.f(iIndexOfChild)) {
                        eVar.k(view);
                    }
                    e0Var.a(iIndexOfChild);
                }
                eVar.d = 0;
                eVar.e = null;
                uVar.i(view);
            } catch (Throwable th) {
                eVar.d = 0;
                eVar.e = null;
                throw th;
            }
        }

        public final void E(u uVar) {
            for (int iK = K() - 1; iK >= 0; iK--) {
                View viewJ = J(iK);
                d0 d0VarR = RecyclerView.R(viewJ);
                if (d0VarR.shouldIgnore()) {
                    if (RecyclerView.T0) {
                        Log.d("RecyclerView", "ignoring view " + d0VarR);
                    }
                } else if (!d0VarR.isInvalid() || d0VarR.isRemoved() || this.b.B.hasStableIds()) {
                    J(iK);
                    this.a.c(iK);
                    uVar.k(viewJ);
                    this.b.i.c(d0VarR);
                } else {
                    if (J(iK) != null) {
                        this.a.j(iK);
                    }
                    uVar.j(d0VarR);
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:28:0x00b0  */
        /* JADX WARN: Code duplicated, block: B:33:0x00b8  */
        /* JADX WARN: Code duplicated, block: B:35:0x00bc  */
        public boolean E0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int paddingRight = this.C - getPaddingRight();
            int paddingBottom = this.D - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width() + left;
            int iHeight = rect.height() + top;
            int i = left - paddingLeft;
            int iMin = Math.min(0, i);
            int i2 = top - paddingTop;
            int iMin2 = Math.min(0, i2);
            int i3 = iWidth - paddingRight;
            int iMax = Math.max(0, i3);
            int iMax2 = Math.max(0, iHeight - paddingBottom);
            if (this.b.getLayoutDirection() != 1) {
                if (iMin == 0) {
                    iMin = Math.min(i, iMax);
                }
                iMax = iMin;
            } else if (iMax == 0) {
                iMax = Math.max(iMin, i3);
            }
            if (iMin2 == 0) {
                iMin2 = Math.min(i2, iMax2);
            }
            int[] iArr = {iMax, iMin2};
            int i4 = iArr[0];
            int i5 = iArr[1];
            if (z2) {
                View focusedChild = recyclerView.getFocusedChild();
                if (focusedChild != null) {
                    int paddingLeft2 = getPaddingLeft();
                    int paddingTop2 = getPaddingTop();
                    int paddingRight2 = this.C - getPaddingRight();
                    int paddingBottom2 = this.D - getPaddingBottom();
                    Rect rect2 = this.b.y;
                    O(rect2, focusedChild);
                    if (rect2.left - i4 < paddingRight2 && rect2.right - i4 > paddingLeft2 && rect2.top - i5 < paddingBottom2 && rect2.bottom - i5 > paddingTop2) {
                        if (i4 == 0) {
                        }
                        if (z) {
                            recyclerView.scrollBy(i4, i5);
                            return true;
                        }
                        recyclerView.q0(i4, i5);
                        return true;
                    }
                }
            } else if (i4 == 0 || i5 != 0) {
                if (z) {
                    recyclerView.scrollBy(i4, i5);
                    return true;
                }
                recyclerView.q0(i4, i5);
                return true;
            }
            return false;
        }

        public View F(int i) {
            int iK = K();
            for (int i2 = 0; i2 < iK; i2++) {
                View viewJ = J(i2);
                d0 d0VarR = RecyclerView.R(viewJ);
                if (d0VarR != null && d0VarR.getLayoutPosition() == i && !d0VarR.shouldIgnore() && (this.b.x0.g || !d0VarR.isRemoved())) {
                    return viewJ;
                }
            }
            return null;
        }

        public final void F0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public abstract LayoutParams G();

        public int G0(int i, u uVar, z zVar) {
            return 0;
        }

        public LayoutParams H(Context context, AttributeSet attributeSet) {
            return new LayoutParams(context, attributeSet);
        }

        public void H0(int i) {
            if (RecyclerView.T0) {
                Log.e("RecyclerView", "You MUST implement scrollToPosition. It will soon become abstract");
            }
        }

        public LayoutParams I(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof LayoutParams) {
                return new LayoutParams((LayoutParams) layoutParams);
            }
            return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
        }

        public int I0(int i, u uVar, z zVar) {
            return 0;
        }

        public final View J(int i) {
            androidx.recyclerview.widget.e eVar = this.a;
            if (eVar != null) {
                return eVar.d(i);
            }
            return null;
        }

        public final void J0(RecyclerView recyclerView) {
            K0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public final int K() {
            androidx.recyclerview.widget.e eVar = this.a;
            if (eVar != null) {
                return eVar.e();
            }
            return 0;
        }

        public final void K0(int i, int i2) {
            this.C = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.A = mode;
            if (mode == 0 && !RecyclerView.W0) {
                this.C = 0;
            }
            this.D = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.B = mode2;
            if (mode2 != 0 || RecyclerView.W0) {
                return;
            }
            this.D = 0;
        }

        public void L0(Rect rect, int i, int i2) {
            int paddingRight = getPaddingRight() + getPaddingLeft() + rect.width();
            int paddingBottom = getPaddingBottom() + getPaddingTop() + rect.height();
            RecyclerView recyclerView = this.b;
            WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
            this.b.setMeasuredDimension(v(i, paddingRight, recyclerView.getMinimumWidth()), v(i2, paddingBottom, this.b.getMinimumHeight()));
        }

        public int M(u uVar, z zVar) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || recyclerView.B == null || !s()) {
                return 1;
            }
            return this.b.B.getItemCount();
        }

        public final void M0(int i, int i2) {
            int iK = K();
            if (iK == 0) {
                this.b.r(i, i2);
                return;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < iK; i7++) {
                View viewJ = J(i7);
                Rect rect = this.b.y;
                O(rect, viewJ);
                int i8 = rect.left;
                if (i8 < i6) {
                    i6 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i4) {
                    i4 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i5) {
                    i5 = i11;
                }
            }
            this.b.y.set(i6, i4, i3, i5);
            L0(this.b.y, i, i2);
        }

        public final void N0(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.b = null;
                this.a = null;
                this.C = 0;
                this.D = 0;
            } else {
                this.b = recyclerView;
                this.a = recyclerView.f;
                this.C = recyclerView.getWidth();
                this.D = recyclerView.getHeight();
            }
            this.A = 1073741824;
            this.B = 1073741824;
        }

        public void O(Rect rect, View view) {
            RecyclerView.S(rect, view);
        }

        final boolean O0(View view, int i, int i2, LayoutParams layoutParams) {
            return (!view.isLayoutRequested() && this.v && a0(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) layoutParams).width) && a0(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
        }

        public boolean P0() {
            return false;
        }

        public final boolean Q0(View view, int i, int i2, LayoutParams layoutParams) {
            return (this.v && a0(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) layoutParams).width) && a0(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
        }

        public void R0(RecyclerView recyclerView, int i) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public final void S0(y yVar) {
            y yVar2 = this.e;
            if (yVar2 != null && yVar != yVar2 && yVar2.e) {
                yVar2.g();
            }
            this.e = yVar;
            RecyclerView recyclerView = this.b;
            c0 c0Var = recyclerView.u0;
            RecyclerView.this.removeCallbacks(c0Var);
            c0Var.c.abortAnimation();
            if (yVar.h) {
                Log.w("RecyclerView", "An instance of " + yVar.getClass().getSimpleName() + " was started more than once. Each instance of" + yVar.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            yVar.b = recyclerView;
            yVar.c = this;
            int i = yVar.a;
            if (i == -1) {
                hb5.a("Invalid target position");
                return;
            }
            recyclerView.x0.a = i;
            yVar.e = true;
            yVar.d = true;
            yVar.f = recyclerView.C.F(i);
            yVar.d();
            yVar.b.u0.b();
            yVar.h = true;
        }

        public boolean T0() {
            return false;
        }

        public int W(u uVar, z zVar) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || recyclerView.B == null || !t()) {
                return 1;
            }
            return this.b.B.getItemCount();
        }

        public final void X(Rect rect, View view) {
            Matrix matrix;
            Rect rect2 = ((LayoutParams) view.getLayoutParams()).b;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            if (this.b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.b.A;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public boolean Y() {
            return false;
        }

        public boolean Z() {
            return false;
        }

        public final int a() {
            RecyclerView recyclerView = this.b;
            f adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        public void b0(View view, int i, int i2, int i3, int i4) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect rect = layoutParams.b;
            view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        }

        public void c0(View view) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect rectT = this.b.T(view);
            int i = rectT.left + rectT.right;
            int i2 = rectT.top + rectT.bottom;
            int iL = L(s(), this.C, this.A, getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + i, ((ViewGroup.MarginLayoutParams) layoutParams).width);
            int iL2 = L(t(), this.D, this.B, getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + i2, ((ViewGroup.MarginLayoutParams) layoutParams).height);
            if (O0(view, iL, iL2, layoutParams)) {
                view.measure(iL, iL2);
            }
        }

        public void d0(int i) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                int iE = recyclerView.f.e();
                for (int i2 = 0; i2 < iE; i2++) {
                    recyclerView.f.d(i2).offsetLeftAndRight(i);
                }
            }
        }

        public void e0(int i) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                int iE = recyclerView.f.e();
                for (int i2 = 0; i2 < iE; i2++) {
                    recyclerView.f.d(i2).offsetTopAndBottom(i);
                }
            }
        }

        public void g0(RecyclerView recyclerView) {
        }

        public final int getPaddingBottom() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public final int getPaddingEnd() {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null) {
                return 0;
            }
            WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
            return recyclerView.getPaddingEnd();
        }

        public final int getPaddingLeft() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public final int getPaddingRight() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public final int getPaddingStart() {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null) {
                return 0;
            }
            WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
            return recyclerView.getPaddingStart();
        }

        public final int getPaddingTop() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public void h0(RecyclerView recyclerView, u uVar) {
        }

        public View i0(View view, int i, u uVar, z zVar) {
            return null;
        }

        public void j0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.b;
            u uVar = recyclerView.c;
            z zVar = recyclerView.x0;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.b.canScrollVertically(-1) && !this.b.canScrollHorizontally(-1) && !this.b.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            f fVar = this.b.B;
            if (fVar != null) {
                accessibilityEvent.setItemCount(fVar.getItemCount());
            }
        }

        public void k0(u uVar, z zVar, c7 c7Var) {
            if (this.b.canScrollVertically(-1) || this.b.canScrollHorizontally(-1)) {
                c7Var.a(8192);
                c7Var.t(true);
                c7Var.j(67108864, true);
            }
            if (this.b.canScrollVertically(1) || this.b.canScrollHorizontally(1)) {
                c7Var.a(4096);
                c7Var.t(true);
                c7Var.j(67108864, true);
            }
            c7Var.m(c7.e.a(W(uVar, zVar), M(uVar, zVar), 0));
        }

        public final void l0(View view, c7 c7Var) {
            d0 d0VarR = RecyclerView.R(view);
            if (d0VarR == null || d0VarR.isRemoved()) {
                return;
            }
            androidx.recyclerview.widget.e eVar = this.a;
            if (eVar.c.contains(d0VarR.itemView)) {
                return;
            }
            RecyclerView recyclerView = this.b;
            m0(recyclerView.c, recyclerView.x0, view, c7Var);
        }

        public void m0(u uVar, z zVar, View view, c7 c7Var) {
            c7Var.n(c7.f.a(t() ? U(view) : 0, 1, s() ? U(view) : 0, 1, false, false));
        }

        public final void p(View view, int i, boolean z) {
            d0 d0VarR = RecyclerView.R(view);
            if (z || d0VarR.isRemoved()) {
                nj90<d0, n0.a> nj90Var = this.b.i.a;
                n0.a aVarA = nj90Var.get(d0VarR);
                if (aVarA == null) {
                    aVarA = n0.a.a();
                    nj90Var.put(d0VarR, aVarA);
                }
                aVarA.a |= 1;
            } else {
                this.b.i.c(d0VarR);
            }
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (d0VarR.wasReturnedFromScrap() || d0VarR.isScrap()) {
                if (d0VarR.isScrap()) {
                    d0VarR.unScrap();
                } else {
                    d0VarR.clearReturnedFromScrapFlag();
                }
                this.a.b(view, i, view.getLayoutParams(), false);
            } else {
                ViewParent parent = view.getParent();
                RecyclerView recyclerView = this.b;
                androidx.recyclerview.widget.e eVar = this.a;
                if (parent == recyclerView) {
                    androidx.recyclerview.widget.e.a aVar = eVar.b;
                    int iIndexOfChild = eVar.a.a.indexOfChild(view);
                    int iB = (iIndexOfChild == -1 || aVar.d(iIndexOfChild)) ? -1 : iIndexOfChild - aVar.b(iIndexOfChild);
                    if (i == -1) {
                        i = this.a.e();
                    }
                    if (iB == -1) {
                        throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.b.indexOfChild(view) + this.b.D());
                    }
                    if (iB != i) {
                        o oVar = this.b.C;
                        View viewJ = oVar.J(iB);
                        if (viewJ == null) {
                            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iB + oVar.b.toString());
                        }
                        oVar.J(iB);
                        oVar.a.c(iB);
                        LayoutParams layoutParams2 = (LayoutParams) viewJ.getLayoutParams();
                        d0 d0VarR2 = RecyclerView.R(viewJ);
                        boolean zIsRemoved = d0VarR2.isRemoved();
                        RecyclerView recyclerView2 = oVar.b;
                        if (zIsRemoved) {
                            nj90<d0, n0.a> nj90Var2 = recyclerView2.i.a;
                            n0.a aVarA2 = nj90Var2.get(d0VarR2);
                            if (aVarA2 == null) {
                                aVarA2 = n0.a.a();
                                nj90Var2.put(d0VarR2, aVarA2);
                            }
                            aVarA2.a = 1 | aVarA2.a;
                        } else {
                            recyclerView2.i.c(d0VarR2);
                        }
                        oVar.a.b(viewJ, i, layoutParams2, d0VarR2.isRemoved());
                    }
                } else {
                    eVar.a(view, i, false);
                    layoutParams.c = true;
                    y yVar = this.e;
                    if (yVar != null && yVar.e) {
                        yVar.b.getClass();
                        d0 d0VarR3 = RecyclerView.R(view);
                        if ((d0VarR3 != null ? d0VarR3.getLayoutPosition() : -1) == yVar.a) {
                            yVar.f = view;
                            if (RecyclerView.T0) {
                                Log.d("RecyclerView", "smooth scroll target view has been attached");
                            }
                        }
                    }
                }
            }
            if (layoutParams.d) {
                if (RecyclerView.T0) {
                    Log.d("RecyclerView", "consuming pending invalidate on child " + layoutParams.a);
                }
                d0VarR.itemView.invalidate();
                layoutParams.d = false;
            }
        }

        public void q(String str) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.l(str);
            }
        }

        public final void r(Rect rect, View view) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.T(view));
            }
        }

        public boolean s() {
            return false;
        }

        public void s0(RecyclerView recyclerView, int i, int i2) {
            r0(i);
        }

        public boolean t() {
            return false;
        }

        public void t0(u uVar, z zVar) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public boolean u(LayoutParams layoutParams) {
            return true;
        }

        public void u0(z zVar) {
        }

        public void v0(Parcelable parcelable) {
        }

        public Parcelable w0() {
            return null;
        }

        public void x0(int i) {
        }

        public int y(z zVar) {
            return 0;
        }

        public boolean y0(int i, Bundle bundle) {
            RecyclerView recyclerView = this.b;
            return z0(recyclerView.c, recyclerView.x0, i, bundle);
        }

        public int z(z zVar) {
            return 0;
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0062 A[PHI: r8
          0x0062: PHI (r8v8 int) = (r8v5 int), (r8v20 int) binds: [B:27:0x007e, B:19:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
        public boolean z0(u uVar, z zVar, int i, Bundle bundle) {
            int paddingTop;
            int paddingLeft;
            float f;
            if (this.b != null) {
                int iHeight = this.D;
                int iWidth = this.C;
                Rect rect = new Rect();
                if (this.b.getMatrix().isIdentity() && this.b.getGlobalVisibleRect(rect)) {
                    iHeight = rect.height();
                    iWidth = rect.width();
                }
                if (i == 4096) {
                    paddingTop = this.b.canScrollVertically(1) ? (iHeight - getPaddingTop()) - getPaddingBottom() : 0;
                    if (this.b.canScrollHorizontally(1)) {
                        paddingLeft = (iWidth - getPaddingLeft()) - getPaddingRight();
                    } else {
                        paddingLeft = 0;
                    }
                } else if (i != 8192) {
                    paddingTop = 0;
                    paddingLeft = 0;
                } else {
                    paddingTop = this.b.canScrollVertically(-1) ? -((iHeight - getPaddingTop()) - getPaddingBottom()) : 0;
                    if (this.b.canScrollHorizontally(-1)) {
                        paddingLeft = -((iWidth - getPaddingLeft()) - getPaddingRight());
                    } else {
                        paddingLeft = 0;
                    }
                }
                if (paddingTop != 0 || paddingLeft != 0) {
                    if (bundle != null) {
                        f = bundle.getFloat("androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT", 1.0f);
                        if (f < 0.0f) {
                            if (RecyclerView.S0) {
                                throw new IllegalArgumentException("attempting to use ACTION_ARGUMENT_SCROLL_AMOUNT_FLOAT with a negative value (" + f + ")");
                            }
                        }
                    } else {
                        f = 1.0f;
                    }
                    if (Float.compare(f, Float.POSITIVE_INFINITY) != 0) {
                        if (Float.compare(1.0f, f) != 0 && Float.compare(0.0f, f) != 0) {
                            paddingLeft = (int) (paddingLeft * f);
                            paddingTop = (int) (paddingTop * f);
                        }
                        this.b.r0(paddingLeft, paddingTop, null, true);
                        return true;
                    }
                    RecyclerView recyclerView = this.b;
                    f fVar = recyclerView.B;
                    if (fVar != null) {
                        if (i == 4096) {
                            recyclerView.s0(fVar.getItemCount() - 1);
                            return true;
                        }
                        if (i != 8192) {
                            return true;
                        }
                        recyclerView.s0(0);
                        return true;
                    }
                }
            }
            return false;
        }

        public void f0() {
        }

        public void o0() {
        }

        public void r0(int i) {
        }

        public void n0(int i, int i2) {
        }

        public void p0(int i, int i2) {
        }

        public void q0(int i, int i2) {
        }

        public void x(int i, androidx.recyclerview.widget.q.b bVar) {
        }

        public void w(int i, int i2, z zVar, androidx.recyclerview.widget.q.b bVar) {
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        o oVar = this.C;
        if (oVar != null) {
            return oVar.I(layoutParams);
        }
        ib5.a("RecyclerView has no LayoutManager".concat(D()));
        return null;
    }

    public static abstract class h {
        public void a() {
        }

        public void b(int i, int i2) {
        }

        public void c(int i, int i2, Object obj) {
            b(i, i2);
        }

        public void d(int i, int i2) {
        }

        public void f(int i, int i2) {
        }

        public void g() {
        }

        public void e(int i, int i2) {
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.sportybet.android.gp.tz.R.attr.recyclerViewStyle);
    }

    public RecyclerView(Context context) {
        this(context, null);
    }
}
