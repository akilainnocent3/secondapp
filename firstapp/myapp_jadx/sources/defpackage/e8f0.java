package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.dedicatedteampage.shared.ui.TeamPagesWebViewKt$rememberTeamPagesWebView$1$1", f = "TeamPagesWebView.kt", l = {}, m = "invokeSuspend", v = 2)
public final class e8f0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ h8f0 a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e8f0(h8f0 h8f0Var, String str, v1b<? super e8f0> v1bVar) {
        super(2, v1bVar);
        this.a = h8f0Var;
        this.b = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new e8f0(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((e8f0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        h8f0 h8f0Var = this.a;
        ((x5a0) h8f0Var.b).setValue(Boolean.TRUE);
        h8f0Var.a.loadUrl(this.b);
        return Unit.a;
    }
}
