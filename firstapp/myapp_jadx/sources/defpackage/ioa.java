package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class ioa {
    public static final String[] a = {"tab_1", "tab_2", "tab_3"};

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final /* synthetic */ a[] e;

        static {
            a aVar = new a("LOADING", 0);
            a = aVar;
            a aVar2 = new a("EMPTY", 1);
            b = aVar2;
            a aVar3 = new a("ERROR", 2);
            c = aVar3;
            a aVar4 = new a("LOADED", 3);
            d = aVar4;
            e = new a[]{aVar, aVar2, aVar3, aVar4};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) e.clone();
        }
    }

    public static boolean a(int i) {
        StringBuilder sb = new StringBuilder("pref_lights_update_time_");
        sb.append(a[i]);
        return Math.abs(System.currentTimeMillis() - vn20.a("sportybet").getLong(sb.toString(), 0L)) >= vn20.a("sportybet").getLong("high_lights_update_interval", 300000L);
    }

    public static void b(int i, long j) {
        vn20.h(j, "pref_lights_update_time_" + a[i], false);
    }
}
