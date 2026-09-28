package defpackage;

import androidx.recyclerview.widget.r;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.LNBottomSheetKt$LNBottomSheet$nestedScrollConnection$1$2$1", f = "LNBottomSheet.kt", l = {r.d.DEFAULT_DRAG_ANIMATION_DURATION}, m = "invokeSuspend", v = 2)
public final class d4q extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ i20<m4q> b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ fkd0<Float> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4q(i20<m4q> i20Var, float f, float f2, fkd0<Float> fkd0Var, v1b<? super d4q> v1bVar) {
        super(2, v1bVar);
        this.b = i20Var;
        this.c = f;
        this.d = f2;
        this.e = fkd0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new d4q(this.b, this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((d4q) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            if (g4q.g(this.b, this.c, this.d, this.e, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
