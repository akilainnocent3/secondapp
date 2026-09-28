package defpackage;

import com.sportybet.android.instantwin.presentation.racingevent.b;
import com.sportybet.android.instantwin.router.racingevent.InstantRacingEventInput;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.racingevent.InstantRacingEventViewModel$observeSelectionCountSnapshotFlow$1", f = "InstantRacingEventViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class cwn extends tje0 implements Function2<d880, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ b b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwn(v1b v1bVar, b bVar) {
        super(2, v1bVar);
        this.b = bVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        cwn cwnVar = new cwn(v1bVar, this.b);
        cwnVar.a = obj;
        return cwnVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(d880 d880Var, v1b<? super Unit> v1bVar) {
        return ((cwn) create(d880Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        d880 d880Var = (d880) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        int i = d880Var.b;
        int i2 = d880Var.a;
        b bVar = this.b;
        if (i > i2) {
            InstantRacingEventInput instantRacingEventInput = bVar.H;
            bVar.F.a(new a5o.j(instantRacingEventInput != null ? instantRacingEventInput.a : null), k00.d);
        }
        int i3 = d880Var.b;
        wwd0 wwd0Var = bVar.N;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, new hm3(i3)));
        return Unit.a;
    }
}
