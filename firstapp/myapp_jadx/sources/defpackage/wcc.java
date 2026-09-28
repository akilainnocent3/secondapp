package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.domain.viewmodel.CustomCodeViewModel$dismissEditHint$1", f = "CustomCodeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class wcc extends tje0 implements Function2<Unit, v1b<? super Unit>, Object> {
    public final /* synthetic */ bdc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wcc(bdc bdcVar, v1b<? super wcc> v1bVar) {
        super(2, v1bVar);
        this.a = bdcVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new wcc(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, v1b<? super Unit> v1bVar) {
        return ((wcc) create(unit, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        bdc bdcVar = this.a;
        wwd0 wwd0Var = bdcVar.y;
        wwd0 wwd0Var2 = bdcVar.y;
        jdc jdcVar = (jdc) wwd0Var.getValue();
        if (jdcVar instanceof jdc.a) {
            jdc.a aVar = (jdc.a) jdcVar;
            jdc.a aVar2 = new jdc.a(hdc.a(aVar.a, null, false, 23), aVar.b);
            wwd0Var2.getClass();
            wwd0Var2.k(null, aVar2);
        } else if (jdcVar instanceof jdc.d) {
            jdc.d dVar = (jdc.d) jdcVar;
            jdc.d dVar2 = new jdc.d(hdc.a(dVar.a, null, false, 23), dVar.b);
            wwd0Var2.getClass();
            wwd0Var2.k(null, dVar2);
        }
        return Unit.a;
    }
}
