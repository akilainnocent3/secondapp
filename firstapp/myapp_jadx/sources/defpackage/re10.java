package defpackage;

import com.sportybet.android.globalpay.pixBtg.deposit.c;
import com.sportybet.android.globalpay.pixBtg.deposit.e;
import com.sportybet.android.globalpay.pixBtg.deposit.f;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.pixBtg.deposit.delegates.PixPendingDepositsDelegate$bindPendingDepositsToUiState$1", f = "PixPendingDepositsDelegate.kt", l = {139}, m = "invokeSuspend", v = 2)
public final class re10 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ qe10 b;

    public static final class a<T> implements myh {
        public final /* synthetic */ qe10 a;
        public final /* synthetic */ yp40 b;

        public a(qe10 qe10Var, yp40 yp40Var) {
            this.a = qe10Var;
            this.b = yp40Var;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            kme kmeVar;
            sb00 sb00Var;
            List<ib00> list = (List) obj;
            qe10 qe10Var = this.a;
            qe10Var.h = list;
            qe10Var.i = list.size();
            ztw<f> ztwVar = qe10Var.b;
            et7 et7Var = qe10Var.a;
            final dui duiVar = new dui(qe10Var, 2);
            ztwVar.getClass();
            e.b(ztwVar, et7Var, new Function1() { // from class: j810
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    f.c cVar = (f.c) obj2;
                    cVar.getClass();
                    return f.c.a(cVar, null, 0.0d, null, null, null, null, (qpi) duiVar.invoke(cVar.g), null, 191);
                }
            });
            yp40 yp40Var = this.b;
            int i = 0;
            if (yp40Var.a) {
                yp40Var.a = false;
                int size = list.size();
                ebk.a aVar = qe10Var.g;
                if (aVar == null) {
                    Intrinsics.n("pendingDepositsResult");
                    throw null;
                }
                if (size >= aVar.b) {
                    ne10 ne10Var = new ne10(qe10Var, false);
                    ztwVar.getClass();
                    e.a(ztwVar, et7Var, new h810(ne10Var, 0));
                    qe10Var.c.invoke(new c.a(list.size()));
                } else if (!list.isEmpty()) {
                    ne10 ne10Var2 = new ne10(qe10Var, true);
                    ztwVar.getClass();
                    e.a(ztwVar, et7Var, new h810(ne10Var2, 0));
                }
            } else {
                f value = ztwVar.getValue();
                f.c cVar = value instanceof f.c ? (f.c) value : null;
                if (cVar != null && (kmeVar = cVar.h) != null && (sb00Var = kmeVar.a) != null && sb00Var.a) {
                    e.a(ztwVar, et7Var, new i810(new oe10(list, qe10Var), i));
                }
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public re10(qe10 qe10Var, v1b<? super re10> v1bVar) {
        super(2, v1bVar);
        this.b = qe10Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new re10(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((re10) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            yp40 yp40Var = new yp40();
            yp40Var.a = true;
            qe10 qe10Var = this.b;
            or60 or60Var = new or60(new te10(qe10Var, null));
            a aVar = new a(qe10Var, yp40Var);
            this.a = 1;
            if (or60Var.collect(aVar, this) == y5bVar) {
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
