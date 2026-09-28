package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w5i0 extends l8l {
    public static final a c = a.a;
    public final a a = a.b;
    public final kch b = kch.c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final /* synthetic */ a[] c;

        static {
            a aVar = new a("OFF", 0);
            a = aVar;
            a aVar2 = new a("ON", 1);
            a aVar3 = new a("PREVIEW", 2);
            b = aVar3;
            c = new a[]{aVar, aVar2, aVar3};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) c.clone();
        }
    }

    @Override // defpackage.l8l
    public final kch a() {
        return this.b;
    }

    public final String toString() {
        return "VideoStabilizationFeature(mode=" + this.a.name() + ')';
    }
}
