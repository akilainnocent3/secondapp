package defpackage;

import com.sportybet.android.instantwin.router.event.MatchEventDetailInput;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.eventdetails.MatchEventDetailViewModel$1", f = "MatchEventDetailViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class z2v extends tje0 implements Function2<MatchEventDetailInput, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ m3v b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2v(v1b v1bVar, m3v m3vVar) {
        super(2, v1bVar);
        this.b = m3vVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        z2v z2vVar = new z2v(v1bVar, this.b);
        z2vVar.a = obj;
        return z2vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MatchEventDetailInput matchEventDetailInput, v1b<? super Unit> v1bVar) {
        return ((z2v) create(matchEventDetailInput, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        String str;
        Object value2;
        Object value3;
        MatchEventDetailInput matchEventDetailInput = (MatchEventDetailInput) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        m3v m3vVar = this.b;
        wwd0 wwd0Var = m3vVar.T;
        do {
            value = wwd0Var.getValue();
            str = matchEventDetailInput.a;
            if (str.length() <= 0) {
                str = null;
            }
        } while (!wwd0Var.g(value, str));
        b2v b2vVarD = m3vVar.E.d(matchEventDetailInput.c);
        if (b2vVarD == null) {
            return Unit.a;
        }
        wwd0 wwd0Var2 = m3vVar.U;
        do {
            value2 = wwd0Var2.getValue();
        } while (!wwd0Var2.g(value2, b2vVarD.a));
        wwd0 wwd0Var3 = m3vVar.V;
        do {
            value3 = wwd0Var3.getValue();
        } while (!wwd0Var3.g(value3, b2vVarD.b));
        return Unit.a;
    }
}
