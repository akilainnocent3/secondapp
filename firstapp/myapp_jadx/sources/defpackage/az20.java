package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class az20 {

    @c0d(c = "kotlinx.coroutines.channels.ProduceKt", f = "Produce.kt", l = {302}, m = "awaitClose")
    public static final class a extends x1b {
        public ez20 a;
        public Function0 b;
        public /* synthetic */ Object c;
        public int d;

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.d |= Integer.MIN_VALUE;
            return az20.a(null, null, this);
        }
    }

    public static final class b implements Function1<Throwable, Unit> {
        public final /* synthetic */ bc6 a;

        public b(bc6 bc6Var) {
            this.a = bc6Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th) {
            zi50.a aVar = zi50.b;
            Unit unit = Unit.a;
            this.a.resumeWith(unit);
            return unit;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(ez20<?> ez20Var, Function0<Unit> function0, v1b<? super Unit> v1bVar) {
        a aVar;
        if (v1bVar instanceof a) {
            aVar = (a) v1bVar;
            int i = aVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.d = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(v1bVar);
            }
        } else {
            aVar = new a(v1bVar);
        }
        Object obj = aVar.c;
        y5b y5bVar = y5b.a;
        int i2 = aVar.d;
        try {
            if (i2 == 0) {
                uj50.b(obj);
                if (aVar.getContext().get(c9p.b.a) != ez20Var) {
                    ib5.a("awaitClose() can only be invoked from the producer context");
                    return null;
                }
                aVar.a = ez20Var;
                aVar.b = function0;
                aVar.d = 1;
                bc6 bc6Var = new bc6(1, yzo.b(aVar));
                bc6Var.q();
                ez20Var.b(new b(bc6Var));
                if (bc6Var.o() == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                function0 = aVar.b;
                uj50.b(obj);
            }
            function0.invoke();
            return Unit.a;
        } catch (Throwable th) {
            function0.invoke();
            throw th;
        }
    }
}
