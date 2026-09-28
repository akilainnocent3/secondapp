package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.domain.viewmodel.CustomCodeViewModel$createCustomCode$5", f = "CustomCodeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ucc extends tje0 implements Function2<jdc, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ bdc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ucc(bdc bdcVar, v1b<? super ucc> v1bVar) {
        super(2, v1bVar);
        this.b = bdcVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ucc uccVar = new ucc(this.b, v1bVar);
        uccVar.a = obj;
        return uccVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(jdc jdcVar, v1b<? super Unit> v1bVar) {
        return ((ucc) create(jdcVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        jdc jdcVar = (jdc) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean z = jdcVar instanceof jdc.c;
        bdc bdcVar = this.b;
        if (!z) {
            bdcVar.y.setValue(jdcVar);
            return Unit.a;
        }
        wuw<h8c> wuwVar = bdcVar.I;
        jdc.c cVar = (jdc.c) jdcVar;
        Throwable th = cVar.a;
        if (th == null) {
            th = new Throwable("unknown error");
        }
        h8c.c cVar2 = new h8c.c(th, cVar.b);
        wuwVar.getClass();
        wuwVar.a.c(cVar2);
        bdcVar.y1(true);
        return Unit.a;
    }
}
