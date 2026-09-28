package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public abstract class rnn {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final /* synthetic */ a[] c;

        static {
            a aVar = new a("OK", 0);
            a = aVar;
            a aVar2 = new a("BAD_CONFIG", 1);
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

    public abstract qzf0 a();

    public abstract String b();

    public abstract String c();

    public abstract a d();

    public abstract String e();
}
