package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetContentKt$scrollToTopWhenReady$3", f = "LNPlaceBetContent.kt", l = {}, m = "invokeSuspend", v = 2)
public final class j0r extends tje0 implements Function2<Integer, v1b<? super Boolean>, Object> {
    public /* synthetic */ int a;

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        j0r j0rVar = new j0r(2, v1bVar);
        j0rVar.a = ((Number) obj).intValue();
        return j0rVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Integer num, v1b<? super Boolean> v1bVar) {
        return ((j0r) create(Integer.valueOf(num.intValue()), v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return Boolean.valueOf(i > 0);
    }
}
