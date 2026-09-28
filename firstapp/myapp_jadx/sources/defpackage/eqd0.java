package defpackage;

import com.sportygames.newcms.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.stacker.presentation.StackerViewModel$downloadCmsData$3", f = "StackerViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
public final class eqd0 extends tje0 implements Function2<b, v1b<? super Unit>, Object> {
    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new eqd0(2, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(b bVar, v1b<? super Unit> v1bVar) {
        return ((eqd0) create(bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return Unit.a;
    }
}
