package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.sportystories.presentation.viewer.StoriesViewerKt$StoryCarousel$2$1", f = "StoriesViewer.kt", l = {}, m = "invokeSuspend", v = 2)
public final class v2e0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ c2e0 a;
    public final /* synthetic */ ved b;
    public final /* synthetic */ ytw<Boolean> c;
    public final /* synthetic */ osw d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2e0(c2e0 c2e0Var, ved vedVar, ytw ytwVar, osw oswVar, v1b v1bVar) {
        super(2, v1bVar);
        this.a = c2e0Var;
        this.b = vedVar;
        this.c = ytwVar;
        this.d = oswVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new v2e0(this.a, this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((v2e0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        ytw<Boolean> ytwVar = this.c;
        c2e0.c cVar = ytwVar.getValue().booleanValue() ? c2e0.c.b : c2e0.c.a;
        c2e0 c2e0Var = this.a;
        ved vedVar = this.b;
        c2e0Var.E1(vedVar.k(), cVar);
        ytwVar.setValue(Boolean.FALSE);
        this.d.k(vedVar.k());
        return Unit.a;
    }
}
