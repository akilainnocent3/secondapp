package defpackage;

import com.sportybet.plugin.realsports.data.OutrightDisplayData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.outrights.detail.OutrightViewModel$fetchOutright$1", f = "OutrightViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class pbz extends tje0 implements Function2<lk50<? extends List<? extends OutrightDisplayData>>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ qbz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbz(qbz qbzVar, v1b<? super pbz> v1bVar) {
        super(2, v1bVar);
        this.b = qbzVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        pbz pbzVar = new pbz(this.b, v1bVar);
        pbzVar.a = obj;
        return pbzVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends List<? extends OutrightDisplayData>> lk50Var, v1b<? super Unit> v1bVar) {
        return ((pbz) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.c;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, lk50Var));
        return Unit.a;
    }
}
