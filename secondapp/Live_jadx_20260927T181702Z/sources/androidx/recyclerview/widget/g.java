package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f18745f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f18746g = "ChildrenHelper";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f18747h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f18748i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f18749j = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f18750a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f18754e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18753d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f18751b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<View> f18752c = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f18755c = 64;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final long f18756d = Long.MIN_VALUE;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f18757a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public a f18758b;

        public void a(int i10) {
            if (i10 < 64) {
                this.f18757a &= ~(1 << i10);
                return;
            }
            a aVar = this.f18758b;
            if (aVar != null) {
                aVar.a(i10 - 64);
            }
        }

        public int b(int i10) {
            a aVar = this.f18758b;
            if (aVar == null) {
                return i10 >= 64 ? Long.bitCount(this.f18757a) : Long.bitCount(this.f18757a & ((1 << i10) - 1));
            }
            return i10 < 64 ? Long.bitCount(this.f18757a & ((1 << i10) - 1)) : aVar.b(i10 - 64) + Long.bitCount(this.f18757a);
        }

        public final void c() {
            if (this.f18758b == null) {
                this.f18758b = new a();
            }
        }

        public boolean d(int i10) {
            if (i10 < 64) {
                return (this.f18757a & (1 << i10)) != 0;
            }
            c();
            return this.f18758b.d(i10 - 64);
        }

        public void e(int i10, boolean z10) {
            if (i10 >= 64) {
                c();
                this.f18758b.e(i10 - 64, z10);
                return;
            }
            long j10 = this.f18757a;
            boolean z11 = (Long.MIN_VALUE & j10) != 0;
            long j11 = (1 << i10) - 1;
            this.f18757a = ((j10 & (~j11)) << 1) | (j10 & j11);
            if (z10) {
                h(i10);
            } else {
                a(i10);
            }
            if (z11 || this.f18758b != null) {
                c();
                this.f18758b.e(0, z11);
            }
        }

        public boolean f(int i10) {
            if (i10 >= 64) {
                c();
                return this.f18758b.f(i10 - 64);
            }
            long j10 = 1 << i10;
            long j11 = this.f18757a;
            boolean z10 = (j11 & j10) != 0;
            long j12 = j11 & (~j10);
            this.f18757a = j12;
            long j13 = j10 - 1;
            this.f18757a = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
            a aVar = this.f18758b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f18758b.f(0);
            }
            return z10;
        }

        public void g() {
            this.f18757a = 0L;
            a aVar = this.f18758b;
            if (aVar != null) {
                aVar.g();
            }
        }

        public void h(int i10) {
            if (i10 < 64) {
                this.f18757a |= 1 << i10;
            } else {
                c();
                this.f18758b.h(i10 - 64);
            }
        }

        public String toString() {
            if (this.f18758b == null) {
                return Long.toBinaryString(this.f18757a);
            }
            return this.f18758b.toString() + "xx" + Long.toBinaryString(this.f18757a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b {
        View a(int i10);

        void addView(View view, int i10);

        void b(View view);

        int c();

        RecyclerView.f0 d(View view);

        void e();

        void f(View view, int i10, ViewGroup.LayoutParams layoutParams);

        void g(int i10);

        int h(View view);

        void i(View view);

        void j(int i10);
    }

    public g(b bVar) {
        this.f18750a = bVar;
    }

    public void a(View view, int i10, boolean z10) {
        int iC = i10 < 0 ? this.f18750a.c() : h(i10);
        this.f18751b.e(iC, z10);
        if (z10) {
            l(view);
        }
        this.f18750a.addView(view, iC);
    }

    public void b(View view, boolean z10) {
        a(view, -1, z10);
    }

    public void c(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        int iC = i10 < 0 ? this.f18750a.c() : h(i10);
        this.f18751b.e(iC, z10);
        if (z10) {
            l(view);
        }
        this.f18750a.f(view, iC, layoutParams);
    }

    public void d(int i10) {
        int iH = h(i10);
        this.f18751b.f(iH);
        this.f18750a.g(iH);
    }

    public View e(int i10) {
        int size = this.f18752c.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view = this.f18752c.get(i11);
            RecyclerView.f0 f0VarD = this.f18750a.d(view);
            if (f0VarD.getLayoutPosition() == i10 && !f0VarD.isInvalid() && !f0VarD.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    public View f(int i10) {
        return this.f18750a.a(h(i10));
    }

    public int g() {
        return this.f18750a.c() - this.f18752c.size();
    }

    public final int h(int i10) {
        if (i10 < 0) {
            return -1;
        }
        int iC = this.f18750a.c();
        int i11 = i10;
        while (i11 < iC) {
            int iB = i10 - (i11 - this.f18751b.b(i11));
            if (iB == 0) {
                while (this.f18751b.d(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += iB;
        }
        return -1;
    }

    public View i(int i10) {
        return this.f18750a.a(i10);
    }

    public int j() {
        return this.f18750a.c();
    }

    public void k(View view) {
        int iH = this.f18750a.h(view);
        if (iH >= 0) {
            this.f18751b.h(iH);
            l(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final void l(View view) {
        this.f18752c.add(view);
        this.f18750a.b(view);
    }

    public int m(View view) {
        int iH = this.f18750a.h(view);
        if (iH == -1 || this.f18751b.d(iH)) {
            return -1;
        }
        return iH - this.f18751b.b(iH);
    }

    public boolean n(View view) {
        return this.f18752c.contains(view);
    }

    public void o() {
        this.f18751b.g();
        for (int size = this.f18752c.size() - 1; size >= 0; size--) {
            this.f18750a.i(this.f18752c.get(size));
            this.f18752c.remove(size);
        }
        this.f18750a.e();
    }

    public void p(View view) {
        int i10 = this.f18753d;
        if (i10 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i10 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            this.f18753d = 1;
            this.f18754e = view;
            int iH = this.f18750a.h(view);
            if (iH >= 0) {
                if (this.f18751b.f(iH)) {
                    t(view);
                }
                this.f18750a.j(iH);
            }
        } finally {
            this.f18753d = 0;
            this.f18754e = null;
        }
    }

    public void q(int i10) {
        int i11 = this.f18753d;
        if (i11 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i11 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            int iH = h(i10);
            View viewA = this.f18750a.a(iH);
            if (viewA != null) {
                this.f18753d = 1;
                this.f18754e = viewA;
                if (this.f18751b.f(iH)) {
                    t(viewA);
                }
                this.f18750a.j(iH);
            }
        } finally {
            this.f18753d = 0;
            this.f18754e = null;
        }
    }

    public boolean r(View view) {
        int i10 = this.f18753d;
        if (i10 == 1) {
            if (this.f18754e == view) {
                return false;
            }
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
        }
        if (i10 == 2) {
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
        }
        try {
            this.f18753d = 2;
            int iH = this.f18750a.h(view);
            if (iH == -1) {
                t(view);
                return true;
            }
            if (!this.f18751b.d(iH)) {
                return false;
            }
            this.f18751b.f(iH);
            t(view);
            this.f18750a.j(iH);
            return true;
        } finally {
            this.f18753d = 0;
        }
    }

    public void s(View view) {
        int iH = this.f18750a.h(view);
        if (iH < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.f18751b.d(iH)) {
            this.f18751b.a(iH);
            t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public final boolean t(View view) {
        if (!this.f18752c.remove(view)) {
            return false;
        }
        this.f18750a.i(view);
        return true;
    }

    public String toString() {
        return this.f18751b.toString() + ", hidden list:" + this.f18752c.size();
    }
}
