package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.domain.viewmodel.CustomCodeViewModel$displayDeleteCode$1", f = "CustomCodeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class xcc extends tje0 implements Function2<l7c.b, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ bdc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xcc(bdc bdcVar, v1b<? super xcc> v1bVar) {
        super(2, v1bVar);
        this.b = bdcVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        xcc xccVar = new xcc(this.b, v1bVar);
        xccVar.a = obj;
        return xccVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(l7c.b bVar, v1b<? super Unit> v1bVar) {
        return ((xcc) create(bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        l7c.b bVar = (l7c.b) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.C.setValue(bVar);
        return Unit.a;
    }
}
