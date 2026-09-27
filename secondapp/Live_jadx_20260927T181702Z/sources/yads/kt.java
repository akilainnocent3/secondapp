package yads;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class kt {
    public static final int[] A;
    public static final boolean[] B;
    public static final int[] C;
    public static final int[] D;
    public static final int[] E;
    public static final int[] F;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f151673w = a(2, 2, 2, 0);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f151674x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f151675y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f151676z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f151677a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SpannableStringBuilder f151678b = new SpannableStringBuilder();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f151679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f151680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f151681e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f151682f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f151683g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f151684h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f151685i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f151686j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f151687k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f151688l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f151689m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f151690n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f151691o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f151692p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f151693q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f151694r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f151695s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f151696t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f151697u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f151698v;

    static {
        int iA = a(0, 0, 0, 0);
        f151674x = iA;
        int iA2 = a(0, 0, 0, 3);
        f151675y = new int[]{0, 0, 0, 0, 0, 2, 0};
        f151676z = new int[]{0, 0, 0, 0, 0, 0, 2};
        A = new int[]{3, 3, 3, 3, 3, 3, 1};
        B = new boolean[]{false, false, false, true, true, true, false};
        C = new int[]{iA, iA2, iA, iA, iA2, iA, iA};
        D = new int[]{0, 1, 2, 3, 4, 3, 4};
        E = new int[]{0, 0, 0, 0, 0, 3, 3};
        F = new int[]{iA, iA, iA, iA, iA, iA2, iA2};
    }

    public kt() {
        b();
    }

    public final void a(char c10) {
        if (c10 != '\n') {
            this.f151678b.append(c10);
            return;
        }
        this.f151677a.add(a());
        this.f151678b.clear();
        if (this.f151692p != -1) {
            this.f151692p = 0;
        }
        if (this.f151693q != -1) {
            this.f151693q = 0;
        }
        if (this.f151694r != -1) {
            this.f151694r = 0;
        }
        if (this.f151696t != -1) {
            this.f151696t = 0;
        }
        while (true) {
            if ((!this.f151687k || this.f151677a.size() < this.f151686j) && this.f151677a.size() < 15) {
                return;
            } else {
                this.f151677a.remove(0);
            }
        }
    }

    public final void b() {
        this.f151677a.clear();
        this.f151678b.clear();
        this.f151692p = -1;
        this.f151693q = -1;
        this.f151694r = -1;
        this.f151696t = -1;
        this.f151698v = 0;
        this.f151679c = false;
        this.f151680d = false;
        this.f151681e = 4;
        this.f151682f = false;
        this.f151683g = 0;
        this.f151684h = 0;
        this.f151685i = 0;
        this.f151686j = 15;
        this.f151687k = true;
        this.f151688l = 0;
        this.f151689m = 0;
        this.f151690n = 0;
        int i10 = f151674x;
        this.f151691o = i10;
        this.f151695s = f151673w;
        this.f151697u = i10;
    }

    public static int a(int i10, int i11, int i12, int i13) {
        int i14;
        ni.a(i10, 4);
        ni.a(i11, 4);
        ni.a(i12, 4);
        ni.a(i13, 4);
        if (i13 != 2) {
            i14 = i13 != 3 ? 255 : 0;
        } else {
            i14 = 127;
        }
        return Color.argb(i14, i10 > 1 ? 255 : 0, i11 > 1 ? 255 : 0, i12 > 1 ? 255 : 0);
    }

    public final void a(boolean z10, boolean z11) {
        if (this.f151692p != -1) {
            if (!z10) {
                this.f151678b.setSpan(new StyleSpan(2), this.f151692p, this.f151678b.length(), 33);
                this.f151692p = -1;
            }
        } else if (z10) {
            this.f151692p = this.f151678b.length();
        }
        if (this.f151693q == -1) {
            if (z11) {
                this.f151693q = this.f151678b.length();
            }
        } else {
            if (z11) {
                return;
            }
            this.f151678b.setSpan(new UnderlineSpan(), this.f151693q, this.f151678b.length(), 33);
            this.f151693q = -1;
        }
    }

    public final void a(int i10, int i11) {
        if (this.f151694r != -1 && this.f151695s != i10) {
            this.f151678b.setSpan(new ForegroundColorSpan(this.f151695s), this.f151694r, this.f151678b.length(), 33);
        }
        if (i10 != f151673w) {
            this.f151694r = this.f151678b.length();
            this.f151695s = i10;
        }
        if (this.f151696t != -1 && this.f151697u != i11) {
            this.f151678b.setSpan(new BackgroundColorSpan(this.f151697u), this.f151696t, this.f151678b.length(), 33);
        }
        if (i11 != f151674x) {
            this.f151696t = this.f151678b.length();
            this.f151697u = i11;
        }
    }

    public final SpannableString a() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f151678b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f151692p != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f151692p, length, 33);
            }
            if (this.f151693q != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f151693q, length, 33);
            }
            if (this.f151694r != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f151695s), this.f151694r, length, 33);
            }
            if (this.f151696t != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f151697u), this.f151696t, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }
}
