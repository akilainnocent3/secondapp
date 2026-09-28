package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class l36 {

    public static abstract class a {
        public abstract Throwable a();

        public abstract int b();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b a;
        public static final b b;
        public static final b c;
        public static final b d;
        public static final b e;
        public static final /* synthetic */ b[] f;

        static {
            b bVar = new b("PENDING_OPEN", 0);
            a = bVar;
            b bVar2 = new b("OPENING", 1);
            b = bVar2;
            b bVar3 = new b("OPEN", 2);
            c = bVar3;
            b bVar4 = new b("CLOSING", 3);
            d = bVar4;
            b bVar5 = new b("CLOSED", 4);
            e = bVar5;
            f = new b[]{bVar, bVar2, bVar3, bVar4, bVar5};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f.clone();
        }
    }

    public abstract a a();

    public abstract b b();
}
