package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.onetwoup.presentation.viewmodel.OneUpTwoUpConfigViewModel$fetchOneXTwoUpConfigs$1", f = "OneUpTwoUpConfigViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class puy extends tje0 implements Function2<uvy, v1b<? super Unit>, Object> {
    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new puy(2, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(uvy uvyVar, v1b<? super Unit> v1bVar) {
        return ((puy) create(uvyVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return Unit.a;
    }
}
