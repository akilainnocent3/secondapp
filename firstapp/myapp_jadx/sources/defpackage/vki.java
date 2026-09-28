package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class vki implements ali {
    public final a a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final /* synthetic */ a[] c;

        static {
            a aVar = new a("HALF_TIME", 0);
            a = aVar;
            a aVar2 = new a("FULL_TIME", 1);
            b = aVar2;
            c = new a[]{aVar, aVar2};
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

    public vki(a aVar) {
        this.a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vki) && this.a == ((vki) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode() - 1663380666;
    }

    public final String toString() {
        return "FootballLottieSimulationMatchPhaseStep(lottieAssetName=lottie/football_base.lottie, phase=" + this.a + ")";
    }
}
