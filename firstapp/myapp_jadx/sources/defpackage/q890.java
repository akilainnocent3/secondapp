package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.settings.shortcutwidget.ShortcutWidgetConfigureViewModel$saveShortcuts$1", f = "ShortcutWidgetConfigureViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class q890 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ r890 a;
    public final /* synthetic */ d890 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q890(r890 r890Var, d890 d890Var, v1b v1bVar) {
        super(2, v1bVar);
        this.a = r890Var;
        this.b = d890Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new q890(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((q890) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        r890 r890Var = this.a;
        r890Var.a.b((uf00) r890Var.b.getValue(), this.b);
        return Unit.a;
    }
}
