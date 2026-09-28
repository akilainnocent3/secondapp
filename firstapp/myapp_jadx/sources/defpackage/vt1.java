package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class vt1 {
    public static final a a = new a();
    public static final b b = b.a;
    public static final c c = c.a;

    public static final class a implements n3w {
        @Override // defpackage.n3w
        public final <T> T g(i3w<T> i3wVar) {
            return (T) u8j0.a.a.invoke();
        }
    }

    public static final class b extends qlr implements Function1<tt1, Unit> {
        public static final b a = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(tt1 tt1Var) {
            tt1 tt1Var2 = tt1Var;
            tt1Var2.E = true;
            rcf.a(tt1Var2);
            return Unit.a;
        }
    }

    public static final class c extends qlr implements Function1<tt1, Unit> {
        public static final c a = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(tt1 tt1Var) {
            tt1Var.r2();
            return Unit.a;
        }
    }

    public static final boolean a(tt1 tt1Var) {
        g4f0 g4f0Var = pkd.f(tt1Var).U.e;
        g4f0Var.getClass();
        return g4f0Var.D;
    }
}
