package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "okio.internal.-FileSystem$commonDeleteRecursively$sequence$1", f = "FileSystem.kt", l = {75}, m = "invokeSuspend", v = 1)
public final class g extends ji50 implements Function2<wc80<? super cxz>, v1b<? super Unit>, Object> {
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ blh d;
    public final /* synthetic */ cxz e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(blh blhVar, cxz cxzVar, v1b<? super g> v1bVar) {
        super(2, v1bVar);
        this.d = blhVar;
        this.e = cxzVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        g gVar = new g(this.d, this.e, v1bVar);
        gVar.c = obj;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(wc80<? super cxz> wc80Var, v1b<? super Unit> v1bVar) {
        return ((g) create(wc80Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        wc80 wc80Var = (wc80) this.c;
        y5b y5bVar = y5b.a;
        int i = this.b;
        if (i == 0) {
            uj50.b(obj);
            gx0 gx0Var = new gx0();
            this.c = null;
            this.b = 1;
            if (gq40.b(wc80Var, this.d, gx0Var, this.e, false, true, this) == y5bVar) {
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
