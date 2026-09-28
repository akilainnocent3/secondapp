package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.mission.ShowMissionViewModel$getData$1", f = "ShowMissionViewModel.kt", l = {275}, m = "invokeSuspend", v = 2)
public final class ma90 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ sa90 b;

    public static final class a<T> implements myh {
        public final /* synthetic */ sa90 a;

        public a(sa90 sa90Var) {
            this.a = sa90Var;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            lk50 lk50Var = (lk50) obj;
            wwd0 wwd0Var = this.a.w;
            if (lk50Var instanceof lk50.c) {
                List list = (List) ((lk50.c) lk50Var).a;
                Object aVar = list.isEmpty() ? new nsv.a("No active mission") : new nsv.c(list);
                wwd0Var.getClass();
                wwd0Var.k(null, aVar);
            } else if (lk50Var instanceof lk50.a) {
                nsv.a aVar2 = new nsv.a(((lk50.a) lk50Var).toString());
                wwd0Var.getClass();
                wwd0Var.k(null, aVar2);
            } else if (!(lk50Var instanceof lk50.b)) {
                uhc.a();
                return null;
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ma90(v1b v1bVar, sa90 sa90Var) {
        super(2, v1bVar);
        this.b = sa90Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ma90(v1bVar, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ma90) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        sa90 sa90Var = this.b;
        try {
            if (i == 0) {
                uj50.b(obj);
                lyh<lk50<List<da90>>> lyhVarA = sa90Var.d.a();
                a aVar = new a(sa90Var);
                this.a = 1;
                if (lyhVarA.collect(aVar, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
        } catch (Exception e) {
            itf0.a aVar2 = itf0.a;
            aVar2.q("ShowMissionViewModel");
            aVar2.d(inm.a("getData error: ", e.getMessage()), new Object[0]);
            wwd0 wwd0Var = sa90Var.w;
            String message = e.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            nsv.a aVar3 = new nsv.a(message);
            wwd0Var.getClass();
            wwd0Var.k(null, aVar3);
        }
        return Unit.a;
    }
}
