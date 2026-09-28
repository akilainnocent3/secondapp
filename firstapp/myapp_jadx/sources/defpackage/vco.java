package defpackage;

import com.sportybet.android.instantwin.presentation.bethistory2.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.bethistory2.InstantWinBetHistoryViewModel$2", f = "InstantWinBetHistoryViewModel.kt", l = {191}, m = "invokeSuspend", v = 2)
public final class vco extends tje0 implements Function2<vbo.b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ c c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vco(v1b v1bVar, c cVar) {
        super(2, v1bVar);
        this.c = cVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        vco vcoVar = new vco(v1bVar, this.c);
        vcoVar.b = obj;
        return vcoVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(vbo.b bVar, v1b<? super Unit> v1bVar) {
        return ((vco) create(bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        vbo.b bVar = (vbo.b) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            c cVar = this.c;
            cVar.D = bVar;
            b390 b390Var = cVar.E;
            vbo vboVar = new vbo(vbo.a.a, bVar);
            this.b = null;
            this.a = 1;
            if (b390Var.emit(vboVar, this) == y5bVar) {
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
