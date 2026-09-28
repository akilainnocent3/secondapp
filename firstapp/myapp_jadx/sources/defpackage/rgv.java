package defpackage;

import com.sporty.android.common.uievent.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.profile.me.presentation.MeViewModel$bindToAppUpdateState$2", f = "MeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class rgv extends tje0 implements Function2<vt0, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ rhv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rgv(rhv rhvVar, v1b<? super rgv> v1bVar) {
        super(2, v1bVar);
        this.b = rhvVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        rgv rgvVar = new rgv(this.b, v1bVar);
        rgvVar.a = obj;
        return rgvVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(vt0 vt0Var, v1b<? super Unit> v1bVar) {
        return ((rgv) create(vt0Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        vt0 vt0Var = (vt0) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean z = vt0Var instanceof vt0.c;
        rhv rhvVar = this.b;
        if (z) {
            ku90<a> ku90Var = rhvVar.G;
            ku90Var.a.a(((vt0.c) vt0Var).a);
        } else if (vt0Var instanceof vt0.a) {
            ku90<iev> ku90Var2 = rhvVar.M;
            ku90Var2.a.a(((vt0.a) vt0Var).a);
        } else {
            if (!Intrinsics.g(vt0Var, vt0.b.a)) {
                uhc.a();
                return null;
            }
            Unit unit = Unit.a;
        }
        return Unit.a;
    }
}
