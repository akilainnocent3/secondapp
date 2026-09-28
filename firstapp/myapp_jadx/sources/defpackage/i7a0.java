package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.commons.utils.SnowfallComposeViewKt$SnowfallComposeView$1$2$1", f = "SnowfallComposeView.kt", l = {112}, m = "invokeSuspend", v = 1)
public final class i7a0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ List<z6a0> c;
    public final /* synthetic */ osw d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7a0(List<z6a0> list, osw oswVar, v1b<? super i7a0> v1bVar) {
        super(2, v1bVar);
        this.c = list;
        this.d = oswVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        i7a0 i7a0Var = new i7a0(this.c, this.d, v1bVar);
        i7a0Var.b = obj;
        return i7a0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((i7a0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        v5b v5bVar = (v5b) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0 && i != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        while (w5b.e(v5bVar)) {
            final List<z6a0> list = this.c;
            final osw oswVar = this.d;
            Function1 function1 = new Function1() { // from class: h7a0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    ((Long) obj2).getClass();
                    for (z6a0 z6a0Var : list) {
                        z6a0Var.e += z6a0Var.g;
                        float f = z6a0Var.f + z6a0Var.h;
                        z6a0Var.f = f;
                        if (f > z6a0Var.a.b) {
                            z6a0Var.a(Float.valueOf(-z6a0Var.c));
                        }
                    }
                    osw oswVar2 = oswVar;
                    int iD = oswVar2.D();
                    oswVar2.k(iD + 1);
                    return Integer.valueOf(iD);
                }
            };
            this.b = v5bVar;
            this.a = 1;
            if (t4w.a(getContext()).P(function1, this) == y5bVar) {
                return y5bVar;
            }
        }
        return Unit.a;
    }
}
