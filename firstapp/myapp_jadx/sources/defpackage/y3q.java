package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.LNBottomSheetKt$LNBottomSheet$1$1", f = "LNBottomSheet.kt", l = {}, m = "invokeSuspend", v = 2)
public final class y3q extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ Object a;
    public final /* synthetic */ ytw<Object> b;
    public final /* synthetic */ ytw<Boolean> c;
    public final /* synthetic */ osw d;
    public final /* synthetic */ ytw<h4q> e;
    public final /* synthetic */ v5b f;
    public final /* synthetic */ i20<m4q> i;
    public final /* synthetic */ ytw v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3q(Object obj, ytw ytwVar, ytw ytwVar2, osw oswVar, ytw ytwVar3, v5b v5bVar, i20 i20Var, ytw ytwVar4, v1b v1bVar) {
        super(2, v1bVar);
        this.a = obj;
        this.b = ytwVar;
        this.c = ytwVar2;
        this.d = oswVar;
        this.e = ytwVar3;
        this.f = v5bVar;
        this.i = i20Var;
        this.v = ytwVar4;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new y3q(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((y3q) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        ytw<Boolean> ytwVar = this.c;
        Object obj2 = this.a;
        if (obj2 != null) {
            this.b.setValue(obj2);
            if (!ytwVar.getValue().booleanValue()) {
                ytwVar.setValue(Boolean.TRUE);
                this.d.k(0);
                this.e.setValue(h4q.a);
            }
        } else if (ytwVar.getValue().booleanValue()) {
            g4q.e(this.f, this.e, this.i, this.d, this.c, this.b, this.v, false);
        }
        return Unit.a;
    }
}
