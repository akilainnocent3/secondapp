package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.event.viewmodel.MatchEventViewModel$eventViewState$2", f = "MatchEventViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class m5v extends tje0 implements Function2<ctg, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ z5v b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5v(v1b v1bVar, z5v z5vVar) {
        super(2, v1bVar);
        this.b = z5vVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        m5v m5vVar = new m5v(v1bVar, this.b);
        m5vVar.a = obj;
        return m5vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ctg ctgVar, v1b<? super Unit> v1bVar) {
        return ((m5v) create(ctgVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ctg ctgVar = (ctg) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.E1(ctgVar);
        return Unit.a;
    }
}
