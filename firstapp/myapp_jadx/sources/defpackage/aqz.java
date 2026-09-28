package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.pager.PagerState$scrollToPage$2", f = "PagerState.kt", l = {509}, m = "invokeSuspend")
public final class aqz extends tje0 implements Function2<tp70, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ zpz b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqz(int i, v1b v1bVar, zpz zpzVar) {
        super(2, v1bVar);
        this.b = zpzVar;
        this.c = i;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new aqz(this.c, v1bVar, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(tp70 tp70Var, v1b<? super Unit> v1bVar) {
        return ((aqz) create(tp70Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        zpz zpzVar = this.b;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            Object objA = zpzVar.x.a(this);
            if (objA != y5bVar) {
                objA = Unit.a;
            }
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        zpzVar.w(zpzVar.j(this.c), 0.0f, true);
        return Unit.a;
    }
}
