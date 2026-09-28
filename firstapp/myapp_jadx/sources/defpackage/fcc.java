package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.domain.viewmodel.CustomCodeViewModel$concealDeleteCode$1", f = "CustomCodeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class fcc extends tje0 implements Function2<l7c.a, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ bdc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fcc(bdc bdcVar, v1b<? super fcc> v1bVar) {
        super(2, v1bVar);
        this.b = bdcVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        fcc fccVar = new fcc(this.b, v1bVar);
        fccVar.a = obj;
        return fccVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(l7c.a aVar, v1b<? super Unit> v1bVar) {
        return ((fcc) create(aVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        l7c.a aVar = (l7c.a) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.C.setValue(aVar);
        return Unit.a;
    }
}
