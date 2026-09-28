package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class x6f {
    public static final e a;
    public static final c b;
    public static final d c;
    public static final f d;
    public static final d e;
    public static final h2z<x6f> f;
    public static final boolean g;

    public static class a extends x6f {
        @Override // defpackage.x6f
        public final g a(int i, int i2, int i3, int i4) {
            return g.b;
        }

        @Override // defpackage.x6f
        public final float b(int i, int i2, int i3, int i4) {
            int iMin = Math.min(i2 / i4, i / i3);
            if (iMin == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(iMin);
        }
    }

    public static class b extends x6f {
        @Override // defpackage.x6f
        public final g a(int i, int i2, int i3, int i4) {
            return g.a;
        }

        @Override // defpackage.x6f
        public final float b(int i, int i2, int i3, int i4) {
            int iCeil = (int) Math.ceil(Math.max(i2 / i4, i / i3));
            int iMax = Math.max(1, Integer.highestOneBit(iCeil));
            return 1.0f / (iMax << (iMax >= iCeil ? 0 : 1));
        }
    }

    public static class c extends x6f {
        @Override // defpackage.x6f
        public final g a(int i, int i2, int i3, int i4) {
            return b(i, i2, i3, i4) == 1.0f ? g.b : x6f.a.a(i, i2, i3, i4);
        }

        @Override // defpackage.x6f
        public final float b(int i, int i2, int i3, int i4) {
            return Math.min(1.0f, x6f.a.b(i, i2, i3, i4));
        }
    }

    public static class d extends x6f {
        @Override // defpackage.x6f
        public final g a(int i, int i2, int i3, int i4) {
            return g.b;
        }

        @Override // defpackage.x6f
        public final float b(int i, int i2, int i3, int i4) {
            return Math.max(i3 / i, i4 / i2);
        }
    }

    public static class e extends x6f {
        @Override // defpackage.x6f
        public final g a(int i, int i2, int i3, int i4) {
            return x6f.g ? g.b : g.a;
        }

        @Override // defpackage.x6f
        public final float b(int i, int i2, int i3, int i4) {
            if (x6f.g) {
                return Math.min(i3 / i, i4 / i2);
            }
            int iMax = Math.max(i2 / i4, i / i3);
            if (iMax == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(iMax);
        }
    }

    public static class f extends x6f {
        @Override // defpackage.x6f
        public final g a(int i, int i2, int i3, int i4) {
            return g.b;
        }

        @Override // defpackage.x6f
        public final float b(int i, int i2, int i3, int i4) {
            return 1.0f;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class g {
        public static final g a;
        public static final g b;
        public static final /* synthetic */ g[] c;

        static {
            g gVar = new g("MEMORY", 0);
            a = gVar;
            g gVar2 = new g("QUALITY", 1);
            b = gVar2;
            c = new g[]{gVar, gVar2};
        }

        public g() {
            throw null;
        }

        public static g valueOf(String str) {
            return (g) Enum.valueOf(g.class, str);
        }

        public static g[] values() {
            return (g[]) c.clone();
        }
    }

    static {
        new a();
        new b();
        a = new e();
        b = new c();
        d dVar = new d();
        c = dVar;
        d = new f();
        e = dVar;
        f = h2z.a(dVar, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
        g = true;
    }

    public abstract g a(int i, int i2, int i3, int i4);

    public abstract float b(int i, int i2, int i3, int i4);
}
