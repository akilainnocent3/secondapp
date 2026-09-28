package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.onetwoup.presentation.viewmodel.OneUpTwoUpConfigViewModel$fetchOneXTwoUpConfigs$2", f = "OneUpTwoUpConfigViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class quy extends tje0 implements gaj<myh<? super uvy>, Throwable, v1b<? super Unit>, Object> {
    public /* synthetic */ Throwable a;

    @Override // defpackage.gaj
    public final Object invoke(myh<? super uvy> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        quy quyVar = new quy(3, v1bVar);
        quyVar.a = th;
        return quyVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Throwable th = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        itf0.a aVar = itf0.a;
        aVar.q("tag_one_up_two_up");
        aVar.b(th);
        return Unit.a;
    }
}
