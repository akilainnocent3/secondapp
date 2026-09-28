package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.navigation.compose.NavHostKt$NavHost$28$1", f = "NavHost.kt", l = {636}, m = "invokeSuspend")
public final class lix extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ u480<ifx> b;
    public final /* synthetic */ ytw c;
    public final /* synthetic */ isw d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lix(u480 u480Var, ytw ytwVar, isw iswVar, v1b v1bVar) {
        super(2, v1bVar);
        this.b = u480Var;
        this.c = ytwVar;
        this.d = iswVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new lix(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((lix) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            ytw ytwVar = this.c;
            if (((List) ytwVar.getValue()).size() > 1) {
                ifx ifxVar = (ifx) ((List) ytwVar.getValue()).get(((List) ytwVar.getValue()).size() - 2);
                float fJ = this.d.j();
                this.a = 1;
                if (this.b.s0(fJ, ifxVar, this) == y5bVar) {
                    return y5bVar;
                }
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
