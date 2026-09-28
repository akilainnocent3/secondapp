package defpackage;

import com.sportybet.android.instantwin.presentation.racingrace.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.racingrace.InstantRacingRaceViewModel$2", f = "InstantRacingRaceViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class d2o extends tje0 implements Function2<x1o, v1b<? super Unit>, Object> {
    public final /* synthetic */ c a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2o(c cVar, v1b<? super d2o> v1bVar) {
        super(2, v1bVar);
        this.a = cVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new d2o(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(x1o x1oVar, v1b<? super Unit> v1bVar) {
        return ((d2o) create(x1oVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        c cVar = this.a;
        cVar.b.a(new a5o.h0(cVar.x1()), k00.d);
        return Unit.a;
    }
}
