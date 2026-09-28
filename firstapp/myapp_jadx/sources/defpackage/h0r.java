package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetContentKt$revealItemBelowStickyLotteryMenuIfNeeded$3", f = "LNPlaceBetContent.kt", l = {}, m = "invokeSuspend", v = 2)
public final class h0r extends tje0 implements Function2<Integer, v1b<? super Boolean>, Object> {
    public /* synthetic */ int a;
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0r(int i, v1b<? super h0r> v1bVar) {
        super(2, v1bVar);
        this.b = i;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        h0r h0rVar = new h0r(this.b, v1bVar);
        h0rVar.a = ((Number) obj).intValue();
        return h0rVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Integer num, v1b<? super Boolean> v1bVar) {
        return ((h0r) create(Integer.valueOf(num.intValue()), v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return Boolean.valueOf(i > this.b);
    }
}
