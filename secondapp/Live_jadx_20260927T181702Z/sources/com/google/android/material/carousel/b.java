package com.google.android.material.carousel;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import k.w;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f50491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<c> f50492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f50493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f50494d;

    /* JADX INFO: renamed from: com.google.android.material.carousel.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C0469b {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f50495j = -1;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final float f50496k = Float.MIN_VALUE;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f50497a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f50498b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c f50500d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public c f50501e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<c> f50499c = new ArrayList();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f50502f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f50503g = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f50504h = 0.0f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f50505i = -1;

        public C0469b(float f10, float f11) {
            this.f50497a = f10;
            this.f50498b = f11;
        }

        public static float j(float f10, float f11, int i10, int i11) {
            return (f10 - (i10 * f11)) + (i11 * f11);
        }

        @NonNull
        @qj.a
        public C0469b a(float f10, @w(from = 0.0d, to = 1.0d) float f11, float f12) {
            return d(f10, f11, f12, false, true);
        }

        @NonNull
        @qj.a
        public C0469b b(float f10, @w(from = 0.0d, to = 1.0d) float f11, float f12) {
            return c(f10, f11, f12, false);
        }

        @NonNull
        @qj.a
        public C0469b c(float f10, @w(from = 0.0d, to = 1.0d) float f11, float f12, boolean z10) {
            return d(f10, f11, f12, z10, false);
        }

        @NonNull
        @qj.a
        public C0469b d(float f10, @w(from = 0.0d, to = 1.0d) float f11, float f12, boolean z10, boolean z11) {
            float fAbs;
            float f13 = f12 / 2.0f;
            float f14 = f10 - f13;
            float f15 = f13 + f10;
            float f16 = this.f50498b;
            if (f15 > f16) {
                fAbs = Math.abs(f15 - Math.max(f15 - f12, f16));
            } else {
                fAbs = 0.0f;
                if (f14 < 0.0f) {
                    fAbs = Math.abs(f14 - Math.min(f14 + f12, 0.0f));
                }
            }
            return e(f10, f11, f12, z10, z11, fAbs);
        }

        @NonNull
        @qj.a
        public C0469b e(float f10, @w(from = 0.0d, to = 1.0d) float f11, float f12, boolean z10, boolean z11, float f13) {
            return f(f10, f11, f12, z10, z11, f13, 0.0f, 0.0f);
        }

        @NonNull
        @qj.a
        public C0469b f(float f10, @w(from = 0.0d, to = 1.0d) float f11, float f12, boolean z10, boolean z11, float f13, float f14, float f15) {
            if (f12 <= 0.0f) {
                return this;
            }
            if (z11) {
                if (z10) {
                    throw new IllegalArgumentException("Anchor keylines cannot be focal.");
                }
                int i10 = this.f50505i;
                if (i10 != -1 && i10 != 0) {
                    throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                }
                this.f50505i = this.f50499c.size();
            }
            c cVar = new c(Float.MIN_VALUE, f10, f11, f12, z11, f13, f14, f15);
            if (z10) {
                if (this.f50500d == null) {
                    this.f50500d = cVar;
                    this.f50502f = this.f50499c.size();
                }
                if (this.f50503g != -1 && this.f50499c.size() - this.f50503g > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f12 != this.f50500d.f50509d) {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
                this.f50501e = cVar;
                this.f50503g = this.f50499c.size();
            } else {
                if (this.f50500d == null && cVar.f50509d < this.f50504h) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if (this.f50501e != null && cVar.f50509d > this.f50504h) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.f50504h = cVar.f50509d;
            this.f50499c.add(cVar);
            return this;
        }

        @NonNull
        @qj.a
        public C0469b g(float f10, @w(from = 0.0d, to = 1.0d) float f11, float f12, int i10) {
            return h(f10, f11, f12, i10, false);
        }

        @NonNull
        @qj.a
        public C0469b h(float f10, @w(from = 0.0d, to = 1.0d) float f11, float f12, int i10, boolean z10) {
            if (i10 > 0 && f12 > 0.0f) {
                for (int i11 = 0; i11 < i10; i11++) {
                    c((i11 * f12) + f10, f11, f12, z10);
                }
            }
            return this;
        }

        @NonNull
        public b i() {
            if (this.f50500d == null) {
                throw new IllegalStateException("There must be a keyline marked as focal.");
            }
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < this.f50499c.size(); i10++) {
                c cVar = this.f50499c.get(i10);
                arrayList.add(new c(j(this.f50500d.f50507b, this.f50497a, this.f50502f, i10), cVar.f50507b, cVar.f50508c, cVar.f50509d, cVar.f50510e, cVar.f50511f, cVar.f50512g, cVar.f50513h));
            }
            return new b(this.f50497a, arrayList, this.f50502f, this.f50503g);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f50506a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f50507b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f50508c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f50509d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f50510e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f50511f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final float f50512g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final float f50513h;

        public c(float f10, float f11, float f12, float f13) {
            this(f10, f11, f12, f13, false, 0.0f, 0.0f, 0.0f);
        }

        public static c a(c cVar, c cVar2, @w(from = 0.0d, to = 1.0d) float f10) {
            return new c(jh.b.a(cVar.f50506a, cVar2.f50506a, f10), jh.b.a(cVar.f50507b, cVar2.f50507b, f10), jh.b.a(cVar.f50508c, cVar2.f50508c, f10), jh.b.a(cVar.f50509d, cVar2.f50509d, f10));
        }

        public c(float f10, float f11, float f12, float f13, boolean z10, float f14, float f15, float f16) {
            this.f50506a = f10;
            this.f50507b = f11;
            this.f50508c = f12;
            this.f50509d = f13;
            this.f50510e = z10;
            this.f50511f = f14;
            this.f50512g = f15;
            this.f50513h = f16;
        }
    }

    public static b m(b bVar, b bVar2, float f10) {
        if (bVar.f() != bVar2.f()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
        }
        List<c> listG = bVar.g();
        List<c> listG2 = bVar2.g();
        if (listG.size() != listG2.size()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < bVar.g().size(); i10++) {
            arrayList.add(c.a(listG.get(i10), listG2.get(i10), f10));
        }
        return new b(bVar.f(), arrayList, jh.b.c(bVar.b(), bVar2.b(), f10), jh.b.c(bVar.i(), bVar2.i(), f10));
    }

    public static b n(b bVar, float f10) {
        C0469b c0469b = new C0469b(bVar.f(), f10);
        float f11 = (f10 - bVar.j().f50507b) - (bVar.j().f50509d / 2.0f);
        int size = bVar.g().size() - 1;
        while (size >= 0) {
            c cVar = bVar.g().get(size);
            c0469b.d((cVar.f50509d / 2.0f) + f11, cVar.f50508c, cVar.f50509d, size >= bVar.b() && size <= bVar.i(), cVar.f50510e);
            f11 += cVar.f50509d;
            size--;
        }
        return c0469b.i();
    }

    public c a() {
        return this.f50492b.get(this.f50493c);
    }

    public int b() {
        return this.f50493c;
    }

    public c c() {
        return this.f50492b.get(0);
    }

    @Nullable
    public c d() {
        for (int i10 = 0; i10 < this.f50492b.size(); i10++) {
            c cVar = this.f50492b.get(i10);
            if (!cVar.f50510e) {
                return cVar;
            }
        }
        return null;
    }

    public List<c> e() {
        return this.f50492b.subList(this.f50493c, this.f50494d + 1);
    }

    public float f() {
        return this.f50491a;
    }

    public List<c> g() {
        return this.f50492b;
    }

    public c h() {
        return this.f50492b.get(this.f50494d);
    }

    public int i() {
        return this.f50494d;
    }

    public c j() {
        List<c> list = this.f50492b;
        return list.get(list.size() - 1);
    }

    @Nullable
    public c k() {
        for (int size = this.f50492b.size() - 1; size >= 0; size--) {
            c cVar = this.f50492b.get(size);
            if (!cVar.f50510e) {
                return cVar;
            }
        }
        return null;
    }

    public int l() {
        Iterator<c> it = this.f50492b.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (it.next().f50510e) {
                i10++;
            }
        }
        return this.f50492b.size() - i10;
    }

    public b(float f10, List<c> list, int i10, int i11) {
        this.f50491a = f10;
        this.f50492b = Collections.unmodifiableList(list);
        this.f50493c = i10;
        this.f50494d = i11;
    }
}
