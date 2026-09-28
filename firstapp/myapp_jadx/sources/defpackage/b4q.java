package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.LNBottomSheetKt$LNBottomSheet$5$1$1$1", f = "LNBottomSheet.kt", l = {}, m = "invokeSuspend", v = 2)
public final class b4q extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ osw a;
    public final /* synthetic */ i20<m4q> b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ytw<h4q> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4q(osw oswVar, i20<m4q> i20Var, int i, boolean z, ytw<h4q> ytwVar, v1b<? super b4q> v1bVar) {
        super(2, v1bVar);
        this.a = oswVar;
        this.b = i20Var;
        this.c = i;
        this.d = z;
        this.e = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new b4q(this.a, this.b, this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((b4q) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        osw oswVar = this.a;
        if (oswVar.D() > 0) {
            g4q.f(this.b, this.c, this.d, this.e, oswVar.D());
        }
        return Unit.a;
    }
}
