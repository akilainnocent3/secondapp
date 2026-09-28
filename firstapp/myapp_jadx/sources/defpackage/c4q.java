package defpackage;

import androidx.compose.foundation.gestures.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.LNBottomSheetKt$LNBottomSheet$dismissWithAnimation$1", f = "LNBottomSheet.kt", l = {148}, m = "invokeSuspend", v = 2)
public final class c4q extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ i20<m4q> b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ osw d;
    public final /* synthetic */ ytw<Boolean> e;
    public final /* synthetic */ ytw<Object> f;
    public final /* synthetic */ ytw<h4q> i;
    public final /* synthetic */ ytw v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4q(i20 i20Var, boolean z, osw oswVar, ytw ytwVar, ytw ytwVar2, ytw ytwVar3, ytw ytwVar4, v1b v1bVar) {
        super(2, v1bVar);
        this.b = i20Var;
        this.c = z;
        this.d = oswVar;
        this.e = ytwVar;
        this.f = ytwVar2;
        this.i = ytwVar3;
        this.v = ytwVar4;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new c4q(this.b, this.c, this.d, this.e, this.f, this.i, this.v, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((c4q) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        osw oswVar = this.d;
        if (i == 0) {
            uj50.b(obj);
            if (oswVar.D() > 0) {
                i20<m4q> i20Var = this.b;
                if (!Float.isNaN(((t5a0) i20Var.j).j())) {
                    m4q m4qVar = m4q.a;
                    this.a = 1;
                    if (a.e(i20Var, m4qVar, this) == y5bVar) {
                        return y5bVar;
                    }
                }
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        this.e.setValue(Boolean.FALSE);
        this.f.setValue(null);
        oswVar.k(0);
        this.i.setValue(h4q.a);
        if (this.c) {
            ((Function0) this.v.getValue()).invoke();
        }
        return Unit.a;
    }
}
