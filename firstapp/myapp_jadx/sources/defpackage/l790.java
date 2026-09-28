package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import l790.a;

/* JADX INFO: loaded from: classes5.dex */
public final class l790 {
    public final y690 a;
    public final k5b b;

    @c0d(c = "com.sporty.android.platform.features.homeshortcut.ShortcutUseCase$1$1", f = "ShortcutUseCase.kt", l = {DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return l790.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                y690 y690Var = l790.this.a;
                this.a = 1;
                if (y690Var.e(this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    public l790(y690 y690Var, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar, uqm uqmVar) {
        y690Var.getClass();
        uqmVar.getClass();
        this.a = y690Var;
        this.b = k5bVar;
        uqmVar.addLogoutEventListener(new fjt() { // from class: k790
            @Override // defpackage.fjt
            public final void p() {
                l790 l790Var = this.a;
                ej5.c(w5b.a(l790Var.b), null, null, l790Var.new a(null), 3);
            }
        });
    }

    public final Object a(List list, tje0 tje0Var) {
        Object objD = ej5.d(this.b, new t790(null, this, list), tje0Var);
        return objD == y5b.a ? objD : Unit.a;
    }
}
