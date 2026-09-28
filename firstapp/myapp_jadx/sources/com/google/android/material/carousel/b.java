package com.google.android.material.carousel;

import defpackage.hb5;
import defpackage.ib5;
import defpackage.uts;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class b {
    public final float a;
    public final int b;
    public final List<C0192b> c;
    public final int d;
    public final int e;
    public final int f;

    public static final class a {
        public final float a;
        public final int b;
        public C0192b d;
        public C0192b e;
        public final ArrayList c = new ArrayList();
        public int f = -1;
        public int g = -1;
        public float h = 0.0f;
        public int i = -1;

        public a(int i, float f) {
            this.a = f;
            this.b = i;
        }

        public final void a(float f, float f2, float f3, boolean z, boolean z2) {
            float fAbs;
            float f4 = f3 / 2.0f;
            float f5 = f - f4;
            float f6 = f4 + f;
            float f7 = this.b;
            if (f6 > f7) {
                fAbs = Math.abs(f6 - Math.max(f6 - f3, f7));
            } else {
                fAbs = 0.0f;
                if (f5 < 0.0f) {
                    fAbs = Math.abs(f5 - Math.min(f5 + f3, 0.0f));
                }
            }
            b(f, f2, f3, z, z2, fAbs, 0.0f, 0.0f);
        }

        public final void b(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5, float f6) {
            if (f3 <= 0.0f) {
                return;
            }
            ArrayList arrayList = this.c;
            if (z2) {
                if (z) {
                    hb5.a("Anchor keylines cannot be focal.");
                    return;
                }
                int i = this.i;
                if (i != -1 && i != 0) {
                    hb5.a("Anchor keylines must be either the first or last keyline.");
                    return;
                }
                this.i = arrayList.size();
            }
            C0192b c0192b = new C0192b(Float.MIN_VALUE, f, f2, f3, z2, f4, f5, f6);
            C0192b c0192b2 = this.d;
            if (z) {
                if (c0192b2 == null) {
                    this.d = c0192b;
                    this.f = arrayList.size();
                }
                if (this.g != -1 && arrayList.size() - this.g > 1) {
                    hb5.a("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                    return;
                } else if (f3 != this.d.d) {
                    hb5.a("Keylines that are marked as focal must all have the same masked item size.");
                    return;
                } else {
                    this.e = c0192b;
                    this.g = arrayList.size();
                }
            } else if (c0192b2 == null && f3 < this.h) {
                hb5.a("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                return;
            } else if (this.e != null && f3 > this.h) {
                hb5.a("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                return;
            }
            this.h = f3;
            arrayList.add(c0192b);
        }

        public final void c(float f, float f2, float f3, int i, boolean z) {
            if (i <= 0 || f3 <= 0.0f) {
                return;
            }
            for (int i2 = 0; i2 < i; i2++) {
                a((i2 * f3) + f, f2, f3, z, false);
            }
        }

        public final b d() {
            if (this.d == null) {
                ib5.a("There must be a keyline marked as focal.");
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                ArrayList arrayList2 = this.c;
                if (i >= arrayList2.size()) {
                    return new b(this.a, arrayList, this.f, this.g, this.b);
                }
                C0192b c0192b = (C0192b) arrayList2.get(i);
                float f = this.d.b;
                float f2 = this.f;
                float f3 = this.a;
                arrayList.add(new C0192b((i * f3) + (f - (f2 * f3)), c0192b.b, c0192b.c, c0192b.d, c0192b.e, c0192b.f, c0192b.g, c0192b.h));
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.carousel.b$b, reason: collision with other inner class name */
    public static final class C0192b {
        public final float a;
        public final float b;
        public final float c;
        public final float d;
        public final boolean e;
        public final float f;
        public final float g;
        public final float h;

        public C0192b(float f, float f2, float f3, float f4, boolean z, float f5, float f6, float f7) {
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
            this.e = z;
            this.f = f5;
            this.g = f6;
            this.h = f7;
        }
    }

    public b(float f, ArrayList arrayList, int i, int i2, int i3) {
        this.a = f;
        this.c = Collections.unmodifiableList(arrayList);
        this.d = i;
        this.e = i2;
        while (i <= i2) {
            if (((C0192b) arrayList.get(i)).f == 0.0f) {
                this.b++;
            }
            i++;
        }
        this.f = i3;
    }

    public final C0192b a() {
        return this.c.get(this.d);
    }

    public final C0192b b() {
        return this.c.get(0);
    }

    public final C0192b c() {
        return this.c.get(this.e);
    }

    public final C0192b d() {
        return (C0192b) uts.a(1, this.c);
    }
}
