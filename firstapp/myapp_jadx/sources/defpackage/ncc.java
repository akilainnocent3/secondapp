package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.domain.viewmodel.CustomCodeViewModel$confirmEditCode$3", f = "CustomCodeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ncc extends tje0 implements Function2<f8c, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ bdc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ncc(bdc bdcVar, v1b<? super ncc> v1bVar) {
        super(2, v1bVar);
        this.b = bdcVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ncc nccVar = new ncc(this.b, v1bVar);
        nccVar.a = obj;
        return nccVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(f8c f8cVar, v1b<? super Unit> v1bVar) {
        return ((ncc) create(f8cVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        f8c f8cVar = (f8c) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.E.setValue(f8cVar);
        return Unit.a;
    }
}
