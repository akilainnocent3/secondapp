package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.speedybingo.presentation.mapper.SBBallPoolMapper$serveBallsFlow$$inlined$flatMapLatest$1", f = "SBBallPoolMapper.kt", l = {189}, m = "invokeSuspend", v = 1)
public final class a860 extends tje0 implements gaj<myh<? super uf00<? extends Integer>>, w760.a, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ dw1 d;
    public final /* synthetic */ tua0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a860(v1b v1bVar, dw1 dw1Var, tua0 tua0Var) {
        super(3, v1bVar);
        this.d = dw1Var;
        this.e = tua0Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super uf00<? extends Integer>> myhVar, w760.a aVar, v1b<? super Unit> v1bVar) {
        a860 a860Var = new a860(v1bVar, this.d, this.e);
        a860Var.b = myhVar;
        a860Var.c = aVar;
        return a860Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lyh gzhVar;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            w760.a aVar = (w760.a) this.c;
            tx60 tx60Var = aVar.a;
            xc60 xc60Var = aVar.e;
            ia60 ia60Var = aVar.b;
            boolean zG = Intrinsics.g(tx60Var, tx60.b.a);
            dw1 dw1Var = this.d;
            if (zG) {
                qcn<qcn<Integer>> qcnVar = ia60Var.c;
                fg60 fg60Var = aVar.d;
                List listT0 = CollectionsKt.t0(qcnVar, 5);
                ArrayList arrayList = new ArrayList(l48.r(listT0, 10));
                int i2 = 0;
                for (Object obj2 : listT0) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        b.q();
                        throw null;
                    }
                    arrayList.add(new or60(new x760(i2, fg60Var, (qcn) obj2, this.e, dw1Var, null)));
                    i2 = i3;
                }
                gzhVar = new y760((lyh[]) CollectionsKt.A0(arrayList).toArray(new lyh[0]));
            } else if (Intrinsics.g(tx60Var, tx60.a.a) || Intrinsics.g(tx60Var, tx60.d.a)) {
                gzhVar = new gzh(a4h.f(l48.s(ia60Var.c)));
            } else if (Intrinsics.g(tx60Var, tx60.f.a) || Intrinsics.g(tx60Var, tx60.g.a)) {
                Iterable iterable = xc60Var.c;
                if (!((Boolean) ((x5a0) dw1Var.c).getValue()).booleanValue() || ia60Var.a != xc60Var.a) {
                    iterable = null;
                }
                if (iterable == null) {
                    iterable = m2g.a;
                }
                gzhVar = new gzh(a4h.f(CollectionsKt.i0(iterable, l48.s(ia60Var.c))));
            } else {
                if (!Intrinsics.g(tx60Var, tx60.e.a) && !Intrinsics.g(tx60Var, tx60.c.a)) {
                    uhc.a();
                    return null;
                }
                gzhVar = new gzh(n1a0.c);
            }
            this.b = null;
            this.c = null;
            this.a = 1;
            if (kzh.c(myhVar, gzhVar, this) == y5bVar) {
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
