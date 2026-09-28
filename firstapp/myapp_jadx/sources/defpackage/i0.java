package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class i0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class a<T> extends ko50<T> {
        public final /* synthetic */ gv5 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(su5 su5Var, int i, gv5 gv5Var) {
            super(su5Var, i);
            this.d = gv5Var;
        }
    }

    public static <T> void a(su5<T> su5Var, int i, gv5<T> gv5Var) {
        su5Var.G(new a(su5Var, i, gv5Var));
    }
}
