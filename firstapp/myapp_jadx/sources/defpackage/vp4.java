package defpackage;

import com.sportygames.newcms.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.bonuscup.presentation.BonusCupViewModel$downloadCmsData$3", f = "BonusCupViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
public final class vp4 extends tje0 implements Function2<b, v1b<? super Unit>, Object> {
    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new vp4(2, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(b bVar, v1b<? super Unit> v1bVar) {
        return ((vp4) create(bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return Unit.a;
    }
}
