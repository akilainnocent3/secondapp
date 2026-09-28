package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.domain.viewmodel.CustomCodeViewModel$concealResetCode$1", f = "CustomCodeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class hcc extends tje0 implements Function2<fac.a, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ bdc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hcc(bdc bdcVar, v1b<? super hcc> v1bVar) {
        super(2, v1bVar);
        this.b = bdcVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        hcc hccVar = new hcc(this.b, v1bVar);
        hccVar.a = obj;
        return hccVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(fac.a aVar, v1b<? super Unit> v1bVar) {
        return ((hcc) create(aVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        fac.a aVar = (fac.a) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.G.setValue(aVar);
        return Unit.a;
    }
}
