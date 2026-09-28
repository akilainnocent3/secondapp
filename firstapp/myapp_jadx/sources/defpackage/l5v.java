package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.event.viewmodel.MatchEventViewModel$5", f = "MatchEventViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class l5v extends tje0 implements Function2<ctg.a, v1b<? super Unit>, Object> {
    public final /* synthetic */ z5v a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5v(v1b v1bVar, z5v z5vVar) {
        super(2, v1bVar);
        this.a = z5vVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new l5v(v1bVar, this.a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ctg.a aVar, v1b<? super Unit> v1bVar) {
        return ((l5v) create(aVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        z5v z5vVar = this.a;
        z5vVar.g0.a(new i5v.a((String) z5vVar.J.c.getValue()));
        return Unit.a;
    }
}
