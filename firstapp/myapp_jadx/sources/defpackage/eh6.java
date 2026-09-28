package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class eh6 {
    public a a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public float h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final a f;
        public static final a i;
        public static final /* synthetic */ a[] v;

        static {
            a aVar = new a("Idle", 0);
            a = aVar;
            a aVar2 = new a("Dragging", 1);
            b = aVar2;
            a aVar3 = new a("RewindAnimating", 2);
            c = aVar3;
            a aVar4 = new a("AutomaticSwipeAnimating", 3);
            d = aVar4;
            a aVar5 = new a("AutomaticSwipeAnimated", 4);
            e = aVar5;
            a aVar6 = new a("ManualSwipeAnimating", 5);
            f = aVar6;
            a aVar7 = new a("ManualSwipeAnimated", 6);
            i = aVar7;
            v = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) v.clone();
        }
    }

    public final qqe a() {
        if (Math.abs(this.e) < Math.abs(this.d)) {
            return ((float) this.d) < 0.0f ? qqe.a : qqe.b;
        }
        return ((float) this.e) < 0.0f ? qqe.c : qqe.d;
    }

    public final float b() {
        float f;
        int i;
        int iAbs = Math.abs(this.d);
        int iAbs2 = Math.abs(this.e);
        if (iAbs < iAbs2) {
            f = iAbs2;
            i = this.c;
        } else {
            f = iAbs;
            i = this.b;
        }
        return Math.min(f / (i / 2.0f), 1.0f);
    }
}
