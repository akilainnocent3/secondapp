package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.multimaker.presentation.widget.filter.range.OddsRangePopupView$showOddsRangePopup$2", f = "OddsRangePopupView.kt", l = {}, m = "invokeSuspend", v = 2)
public final class rky extends tje0 implements Function2<mhw, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ sky b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rky(sky skyVar, v1b<? super rky> v1bVar) {
        super(2, v1bVar);
        this.b = skyVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        rky rkyVar = new rky(this.b, v1bVar);
        rkyVar.a = obj;
        return rkyVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(mhw mhwVar, v1b<? super Unit> v1bVar) {
        return ((rky) create(mhwVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        mhw mhwVar = (mhw) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        sky skyVar = this.b;
        wwd0 wwd0Var = skyVar.g;
        if (mhwVar == skyVar.a()) {
            return Unit.a;
        }
        ohw ohwVarD = liw.d((ohw) wwd0Var.getValue(), mhwVar, null, null, 125);
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, ohwVarD));
        return Unit.a;
    }
}
