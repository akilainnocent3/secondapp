package androidx.recyclerview.widget;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.recaptchabase.WnDZ.CaxEybC;
import defpackage.bk7;
import defpackage.f87;
import defpackage.ib5;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    public final e0 a;
    public View e;
    public int d = 0;
    public final a b = new a();
    public final ArrayList c = new ArrayList();

    public static class a {
        public long a = 0;
        public a b;

        public final void a(int i) {
            if (i < 64) {
                this.a &= ~(1 << i);
                return;
            }
            a aVar = this.b;
            if (aVar != null) {
                aVar.a(i - 64);
            }
        }

        public final int b(int i) {
            a aVar = this.b;
            if (aVar == null) {
                long j = this.a;
                return i >= 64 ? Long.bitCount(j) : Long.bitCount(((1 << i) - 1) & j);
            }
            if (i < 64) {
                return Long.bitCount(((1 << i) - 1) & this.a);
            }
            return Long.bitCount(this.a) + aVar.b(i - 64);
        }

        public final void c() {
            if (this.b == null) {
                this.b = new a();
            }
        }

        public final boolean d(int i) {
            if (i < 64) {
                return ((1 << i) & this.a) != 0;
            }
            c();
            return this.b.d(i - 64);
        }

        public final void e(int i, boolean z) {
            if (i >= 64) {
                c();
                this.b.e(i - 64, z);
                return;
            }
            long j = this.a;
            boolean z2 = (Long.MIN_VALUE & j) != 0;
            long j2 = (1 << i) - 1;
            this.a = ((j & (~j2)) << 1) | (j & j2);
            if (z) {
                h(i);
            } else {
                a(i);
            }
            if (z2 || this.b != null) {
                c();
                this.b.e(0, z2);
            }
        }

        public final boolean f(int i) {
            if (i >= 64) {
                c();
                return this.b.f(i - 64);
            }
            long j = 1 << i;
            long j2 = this.a;
            boolean z = (j2 & j) != 0;
            long j3 = j2 & (~j);
            this.a = j3;
            long j4 = j - 1;
            this.a = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
            a aVar = this.b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.b.f(0);
            }
            return z;
        }

        public final void g() {
            this.a = 0L;
            a aVar = this.b;
            if (aVar != null) {
                aVar.g();
            }
        }

        public final void h(int i) {
            if (i < 64) {
                this.a |= 1 << i;
            } else {
                c();
                this.b.h(i - 64);
            }
        }

        public final String toString() {
            if (this.b == null) {
                return Long.toBinaryString(this.a);
            }
            return this.b.toString() + "xx" + Long.toBinaryString(this.a);
        }
    }

    public e(e0 e0Var) {
        this.a = e0Var;
    }

    public final void a(View view, int i, boolean z) {
        RecyclerView recyclerView = this.a.a;
        int childCount = i < 0 ? recyclerView.getChildCount() : f(i);
        this.b.e(childCount, z);
        if (z) {
            i(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.d0 d0VarR = RecyclerView.R(view);
        RecyclerView.f fVar = recyclerView.B;
        if (fVar != null && d0VarR != null) {
            fVar.onViewAttachedToWindow(d0VarR);
        }
        ArrayList arrayList = recyclerView.S;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((RecyclerView.p) recyclerView.S.get(size)).d(view);
            }
        }
    }

    public final void b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        RecyclerView recyclerView = this.a.a;
        int childCount = i < 0 ? recyclerView.getChildCount() : f(i);
        this.b.e(childCount, z);
        if (z) {
            i(view);
        }
        RecyclerView.d0 d0VarR = RecyclerView.R(view);
        if (d0VarR != null) {
            if (!d0VarR.isTmpDetached() && !d0VarR.shouldIgnore()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(d0VarR);
                f87.b(sb, recyclerView.D());
                return;
            } else {
                if (RecyclerView.T0) {
                    Log.d("RecyclerView", "reAttach " + d0VarR);
                }
                d0VarR.clearTmpDetachFlag();
            }
        } else if (RecyclerView.S0) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            String strD = recyclerView.D();
            sb2.append(", index: ");
            sb2.append(childCount);
            sb2.append(strD);
            throw new IllegalArgumentException(sb2.toString());
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public final void c(int i) {
        int iF = f(i);
        this.b.f(iF);
        RecyclerView recyclerView = this.a.a;
        View childAt = recyclerView.getChildAt(iF);
        if (childAt != null) {
            RecyclerView.d0 d0VarR = RecyclerView.R(childAt);
            if (d0VarR != null) {
                if (d0VarR.isTmpDetached() && !d0VarR.shouldIgnore()) {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(d0VarR);
                    f87.b(sb, recyclerView.D());
                    return;
                } else {
                    if (RecyclerView.T0) {
                        Log.d("RecyclerView", "tmpDetach " + d0VarR);
                    }
                    d0VarR.addFlags(256);
                }
            }
        } else if (RecyclerView.S0) {
            bk7.a(recyclerView.D(), "No view at offset ", iF);
            return;
        }
        recyclerView.detachViewFromParent(iF);
    }

    public final View d(int i) {
        return this.a.a.getChildAt(f(i));
    }

    public final int e() {
        return this.a.a.getChildCount() - this.c.size();
    }

    public final int f(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = this.a.a.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            a aVar = this.b;
            int iB = i - (i2 - aVar.b(i2));
            if (iB == 0) {
                while (aVar.d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iB;
        }
        return -1;
    }

    public final View g(int i) {
        return this.a.a.getChildAt(i);
    }

    public final int h() {
        return this.a.a.getChildCount();
    }

    public final void i(View view) {
        this.c.add(view);
        RecyclerView.d0 d0VarR = RecyclerView.R(view);
        if (d0VarR != null) {
            d0VarR.onEnteredHiddenState(this.a.a);
        }
    }

    public final void k(View view) {
        RecyclerView.d0 d0VarR;
        if (!this.c.remove(view) || (d0VarR = RecyclerView.R(view)) == null) {
            return;
        }
        d0VarR.onLeftHiddenState(this.a.a);
    }

    public final String toString() {
        return this.b.toString() + ", hidden list:" + this.c.size();
    }

    public final void j(int i) {
        e0 e0Var = this.a;
        int i2 = this.d;
        if (i2 == 1) {
            ib5.a("Cannot call removeView(At) within removeView(At)");
            return;
        }
        if (i2 == 2) {
            ib5.a(CaxEybC.wUvAWTUAjCKtb);
            return;
        }
        try {
            int iF = f(i);
            View childAt = e0Var.a.getChildAt(iF);
            if (childAt == null) {
                return;
            }
            this.d = 1;
            this.e = childAt;
            if (this.b.f(iF)) {
                k(childAt);
            }
            e0Var.a(iF);
        } finally {
            this.d = 0;
            this.e = null;
        }
    }
}
