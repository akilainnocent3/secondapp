package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "coil3.network.NetworkFetcher$executeNetworkRequest$2", f = "NetworkFetcher.kt", l = {205}, m = "invokeSuspend")
public final class wmx extends tje0 implements Function2<iox, v1b<Object>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Function2<iox, v1b<Object>, Object> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public wmx(Function2<? super iox, ? super v1b<Object>, ? extends Object> function2, v1b<? super wmx> v1bVar) {
        super(2, v1bVar);
        this.c = function2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        wmx wmxVar = new wmx(this.c, v1bVar);
        wmxVar.b = obj;
        return wmxVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(iox ioxVar, v1b<Object> v1bVar) {
        return ((wmx) create(ioxVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        iox ioxVar = (iox) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        int i2 = ioxVar.a;
        if ((200 > i2 || i2 >= 300) && i2 != 304) {
            throw new vom("HTTP " + ioxVar.a);
        }
        this.b = null;
        this.a = 1;
        Object objInvoke = this.c.invoke(ioxVar, this);
        return objInvoke == y5bVar ? y5bVar : objInvoke;
    }
}
