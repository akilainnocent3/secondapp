package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.limits.base.lossLimit.viewmodel.LostLimitViewModel$loadInfo$1", f = "LostLimitViewModel.kt", l = {30}, m = "invokeSuspend", v = 2)
public final class tlt extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ult b;

    public static final class a<T> implements myh {
        public final /* synthetic */ ult a;

        public a(ult ultVar) {
            this.a = ultVar;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            lk50 lk50Var = (lk50) obj;
            ult ultVar = this.a;
            wwd0 wwd0Var = ultVar.a;
            if (lk50Var instanceof lk50.c) {
                olt oltVar = ultVar.f;
                List list = (List) ((lk50.c) lk50Var).a;
                oltVar.getClass();
                list.getClass();
                slt.c cVar = new slt.c(ucs.a(list, scs.LOSS_LIMIT_TYPE));
                wwd0Var.getClass();
                wwd0Var.k(null, cVar);
            } else if (lk50Var instanceof lk50.a) {
                wwd0Var.setValue(slt.a.a);
            } else {
                if (!(lk50Var instanceof lk50.b)) {
                    uhc.a();
                    return null;
                }
                wwd0Var.setValue(slt.b.a);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tlt(ult ultVar, v1b<? super tlt> v1bVar) {
        super(2, v1bVar);
        this.b = ultVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new tlt(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((tlt) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            ult ultVar = this.b;
            yzh yzhVarB = bm50.b(((des) ultVar.e.a).h(), vch0.b);
            a aVar = new a(ultVar);
            this.a = 1;
            if (yzhVarB.collect(aVar, this) == y5bVar) {
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
