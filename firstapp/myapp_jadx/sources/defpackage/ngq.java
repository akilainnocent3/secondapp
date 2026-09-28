package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNGroupTabKt$animateItemFullyIntoView$4", f = "LNGroupTab.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ngq extends tje0 implements Function2<Boolean, v1b<? super Boolean>, Object> {
    public /* synthetic */ boolean a;

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ngq ngqVar = new ngq(2, v1bVar);
        ngqVar.a = ((Boolean) obj).booleanValue();
        return ngqVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, v1b<? super Boolean> v1bVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((ngq) create(bool2, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return Boolean.valueOf(z);
    }
}
