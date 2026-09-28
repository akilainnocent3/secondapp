package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class i6b {

    public static final class a implements pya {
        public final /* synthetic */ Function1 a;

        public a(Function1 function1) {
            this.a = function1;
        }

        @Override // defpackage.pya
        public final /* synthetic */ void accept(Object obj) {
            this.a.invoke(obj);
        }
    }

    public static final Object a(ct90 ct90Var, ugn ugnVar) throws Throwable {
        bc6 bc6Var = new bc6(1, yzo.b(ugnVar));
        bc6Var.q();
        a aVar = new a(new g6b(bc6Var));
        a aVar2 = new a(new h6b(bc6Var));
        ct90Var.getClass();
        rya ryaVar = new rya(aVar, aVar2);
        ct90Var.a(ryaVar);
        bc6Var.t(new f6b(ryaVar));
        Object objO = bc6Var.o();
        y5b y5bVar = y5b.a;
        return objO;
    }
}
