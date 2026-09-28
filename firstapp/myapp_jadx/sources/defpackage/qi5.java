package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.Round;
import com.sportybet.android.instantwin.presentation.buildandgo.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.buildandgo.BuildAndGoViewModel$placeBet$1", f = "BuildAndGoViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class qi5 extends tje0 implements Function2<lk50<? extends Round>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ f b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi5(f fVar, v1b<? super qi5> v1bVar) {
        super(2, v1bVar);
        this.b = fVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        qi5 qi5Var = new qi5(this.b, v1bVar);
        qi5Var.a = obj;
        return qi5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends Round> lk50Var, v1b<? super Unit> v1bVar) {
        return ((qi5) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        f fVar = this.b;
        qc5 qc5Var = fVar.d;
        wwd0 wwd0Var = fVar.H;
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (lk50Var instanceof lk50.b) {
            do {
                value5 = wwd0Var.getValue();
            } while (!wwd0Var.g(value5, ni5.a((ni5) value5, null, null, null, null, false, jh10.d.a, null, null, false, false, 0, 2015)));
        } else if (lk50Var instanceof lk50.c) {
            Round round = (Round) ((lk50.c) lk50Var).a;
            if (round != null) {
                yy50.a.m(new nqc(round));
                do {
                    value4 = wwd0Var.getValue();
                } while (!wwd0Var.g(value4, ni5.a((ni5) value4, null, null, null, null, false, jh10.a.a, null, null, false, false, 0, 1823)));
            } else {
                yy50.a.m(new jqc());
                do {
                    value3 = wwd0Var.getValue();
                } while (!wwd0Var.g(value3, ni5.a((ni5) value3, null, null, null, null, false, jh10.b.a, null, null, false, false, 0, 2015)));
            }
            qc5Var.a();
            fVar.e.a();
        } else {
            if (!(lk50Var instanceof lk50.a)) {
                uhc.a();
                return null;
            }
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, ni5.a((ni5) value, null, null, null, null, false, jh10.b.a, null, null, false, false, 0, 2015)));
            qc5Var.a();
            fVar.i.c("sr:sport:1-1", ((lk50.a) lk50Var).a);
            yy50.a.m(new jqc());
            do {
                value2 = wwd0Var.getValue();
            } while (!wwd0Var.g(value2, ni5.a((ni5) value2, null, null, null, null, false, jh10.c.a, null, null, false, false, 0, 2015)));
        }
        return Unit.a;
    }
}
