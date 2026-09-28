package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.domain.viewmodel.CustomCodeViewModel$confirmDeleteCode$3", f = "CustomCodeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class kcc extends tje0 implements Function2<l7c, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ bdc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kcc(bdc bdcVar, v1b<? super kcc> v1bVar) {
        super(2, v1bVar);
        this.b = bdcVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        kcc kccVar = new kcc(this.b, v1bVar);
        kccVar.a = obj;
        return kccVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(l7c l7cVar, v1b<? super Unit> v1bVar) {
        return ((kcc) create(l7cVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        l7c l7cVar = (l7c) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.C.setValue(l7cVar);
        return Unit.a;
    }
}
