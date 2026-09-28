package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.LuckyNumberThemeKt$LuckyNumberThemeContent$1$1", f = "LuckyNumberTheme.kt", l = {}, m = "invokeSuspend", v = 2)
public final class t7u extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ytw<ot50> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7u(boolean z, ytw<ot50> ytwVar, v1b<? super t7u> v1bVar) {
        super(2, v1bVar);
        this.a = z;
        this.b = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new t7u(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((t7u) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.setValue(new ot50(this.a ? j58.f : j58.b, new nt50(0.2f, 0.2f, 0.2f, 0.2f)));
        return Unit.a;
    }
}
