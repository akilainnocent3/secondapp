package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.compose.ui.component.tabs.GeneralTabsKt$GeneralTabs$2$1", f = "GeneralTabs.kt", l = {}, m = "invokeSuspend", v = 2)
public final class y0k extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ ved a;
    public final /* synthetic */ osw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0k(ved vedVar, osw oswVar, v1b v1bVar) {
        super(2, v1bVar);
        this.a = vedVar;
        this.b = oswVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new y0k(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((y0k) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        ved vedVar = this.a;
        if (!vedVar.k.c()) {
            osw oswVar = this.b;
            if (oswVar.D() != vedVar.k()) {
                oswVar.k(vedVar.k());
            }
        }
        return Unit.a;
    }
}
