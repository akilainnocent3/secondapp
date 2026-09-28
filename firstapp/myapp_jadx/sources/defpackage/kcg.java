package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public abstract class kcg {
    public final String a;

    public static final class a extends kcg {
        public static final a b = new a(null);
    }

    public static final class b extends kcg {
    }

    public static final class c extends kcg {
    }

    public static final class d extends kcg {
    }

    public static final class e extends kcg {
        public static final e b = new e(null);
    }

    public static final class f extends kcg {
    }

    public static final class g extends kcg {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str) {
            super(str);
            str.getClass();
        }
    }

    public static final class h extends kcg {
        public static final h b = new h(null);
    }

    public kcg(String str) {
        this.a = str;
    }
}
