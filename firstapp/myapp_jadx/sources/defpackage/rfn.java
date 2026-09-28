package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.material3.IndicatorLineNode$update$1", f = "TextField.kt", l = {1537}, m = "invokeSuspend")
public final class rfn extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ pfn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rfn(pfn pfnVar, v1b<? super rfn> v1bVar) {
        super(2, v1bVar);
        this.b = pfnVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new rfn(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((rfn) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            this.b.t2(this);
            return y5bVar;
        }
        if (i == 1) {
            uj50.b(obj);
            return Unit.a;
        }
        ib5.a("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
