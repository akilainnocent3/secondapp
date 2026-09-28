package defpackage;

import com.sportybet.plugin.realsports.data.Event;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.plugin.event.EventUseCase$fetchRemoteEvent$4", f = "EventUseCase.kt", l = {114}, m = "invokeSuspend", v = 2)
public final class xrg extends tje0 implements Function2<Pair<? extends Event, ? extends Boolean>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ csg c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xrg(csg csgVar, int i, v1b<? super xrg> v1bVar) {
        super(2, v1bVar);
        this.c = csgVar;
        this.d = i;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        xrg xrgVar = new xrg(this.c, this.d, v1bVar);
        xrgVar.b = obj;
        return xrgVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Pair<? extends Event, ? extends Boolean> pair, v1b<? super Unit> v1bVar) {
        return ((xrg) create(pair, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Pair pair = (Pair) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            Event event = (Event) pair.a;
            this.b = null;
            this.a = 1;
            if (this.c.b(event, this.d, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            Object obj2 = ((zi50) obj).a;
        }
        return Unit.a;
    }
}
