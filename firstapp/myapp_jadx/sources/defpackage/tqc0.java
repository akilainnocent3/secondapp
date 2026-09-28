package defpackage;

import com.sportybet.android.instantwin.presentation.legends.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.legends.SportyLegendsViewModel$onHeadToHeadStatsButtonClick$1", f = "SportyLegendsViewModel.kt", l = {1510}, m = "invokeSuspend", v = 2)
public final class tqc0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ d b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tqc0(v1b v1bVar, d dVar) {
        super(2, v1bVar);
        this.b = dVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new tqc0(v1bVar, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((tqc0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        rmc0 rmc0Var;
        Object value;
        v9c0.r.a aVar;
        y5b y5bVar = y5b.a;
        int i = this.a;
        d dVar = this.b;
        if (i == 0) {
            uj50.b(obj);
            yho yhoVar = dVar.i;
            wm20 wm20VarA = yhoVar.l.a(yhoVar, yho.o[11]);
            Boolean bool = Boolean.TRUE;
            this.a = 1;
            if (wm20VarA.g(this, bool) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        wwd0 wwd0Var = dVar.J.b;
        int iOrdinal = ((rmc0) wwd0Var.getValue()).ordinal();
        if (iOrdinal == 0) {
            rmc0Var = rmc0.b;
        } else {
            if (iOrdinal != 1) {
                uhc.a();
                return null;
            }
            rmc0Var = rmc0.a;
        }
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, rmc0Var));
        int iOrdinal2 = rmc0Var.ordinal();
        if (iOrdinal2 == 0) {
            aVar = v9c0.r.a.HIDE;
        } else {
            if (iOrdinal2 != 1) {
                uhc.a();
                return null;
            }
            aVar = v9c0.r.a.SHOW;
        }
        dVar.v.c(new v9c0.r(aVar));
        return Unit.a;
    }
}
