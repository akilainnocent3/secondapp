package androidx.recyclerview.widget;

import android.view.View;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class k0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f18880c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f18881d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f18882e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f18883f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f18884g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f18885h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f18886i = 4;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f18887j = 4;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f18888k = 16;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f18889l = 32;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f18890m = 64;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f18891n = 8;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f18892o = 256;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f18893p = 512;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f18894q = 1024;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f18895r = 12;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f18896s = 4096;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f18897t = 8192;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f18898u = 16384;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f18899v = 7;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f18900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f18901b = new a();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f18902a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f18903b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f18904c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f18905d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f18906e;

        public void a(int i10) {
            this.f18902a = i10 | this.f18902a;
        }

        public boolean b() {
            int i10 = this.f18902a;
            if ((i10 & 7) != 0 && (i10 & c(this.f18905d, this.f18903b)) == 0) {
                return false;
            }
            int i11 = this.f18902a;
            if ((i11 & 112) != 0 && (i11 & (c(this.f18905d, this.f18904c) << 4)) == 0) {
                return false;
            }
            int i12 = this.f18902a;
            if ((i12 & a2.a.b.f3536f) != 0 && (i12 & (c(this.f18906e, this.f18903b) << 8)) == 0) {
                return false;
            }
            int i13 = this.f18902a;
            return (i13 & 28672) == 0 || (i13 & (c(this.f18906e, this.f18904c) << 12)) != 0;
        }

        public int c(int i10, int i11) {
            if (i10 > i11) {
                return 1;
            }
            return i10 == i11 ? 2 : 4;
        }

        public void d() {
            this.f18902a = 0;
        }

        public void e(int i10, int i11, int i12, int i13) {
            this.f18903b = i10;
            this.f18904c = i11;
            this.f18905d = i12;
            this.f18906e = i13;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b {
        View a(int i10);

        int b();

        int c();

        int d(View view);

        int e(View view);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    public k0(b bVar) {
        this.f18900a = bVar;
    }

    public View a(int i10, int i11, int i12, int i13) {
        int iB = this.f18900a.b();
        int iC = this.f18900a.c();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View viewA = this.f18900a.a(i10);
            this.f18901b.e(iB, iC, this.f18900a.d(viewA), this.f18900a.e(viewA));
            if (i12 != 0) {
                this.f18901b.d();
                this.f18901b.a(i12);
                if (this.f18901b.b()) {
                    return viewA;
                }
            }
            if (i13 != 0) {
                this.f18901b.d();
                this.f18901b.a(i13);
                if (this.f18901b.b()) {
                    view = viewA;
                }
            }
            i10 += i14;
        }
        return view;
    }

    public boolean b(View view, int i10) {
        this.f18901b.e(this.f18900a.b(), this.f18900a.c(), this.f18900a.d(view), this.f18900a.e(view));
        if (i10 == 0) {
            return false;
        }
        this.f18901b.d();
        this.f18901b.a(i10);
        return this.f18901b.b();
    }
}
