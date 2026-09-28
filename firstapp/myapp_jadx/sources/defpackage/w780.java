package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface w780 {

    public static final class a {
        public static final t780 a = new t780();
        public static final u780 b = new u780();
        public static final v780 c = new v780();
        public static final tg8 d = new tg8();

        /* JADX INFO: renamed from: w780$a$a, reason: collision with other inner class name */
        public static final class C1240a implements n65 {
            public static final C1240a a = new C1240a();

            @Override // defpackage.n65
            public final long a(j780 j780Var, int i) {
                String str = j780Var.d.a.a.b;
                return vlf0.a(h020.b(i, str), h020.a(i, str));
            }
        }

        public static final class b implements n65 {
            public static final b a = new b();

            @Override // defpackage.n65
            public final long a(j780 j780Var, int i) {
                return j780Var.d.l(i);
            }
        }
    }

    s780 a(cw90 cw90Var);
}
