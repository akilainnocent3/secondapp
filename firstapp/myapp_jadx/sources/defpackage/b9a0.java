package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.domain.viewmodel.SocialFollowViewModel$syncWithStateAndFilter$2", f = "SocialFollowViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class b9a0 extends tje0 implements Function2<d9a0, v1b<? super Boolean>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ ijf0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b9a0(ijf0 ijf0Var, v1b<? super b9a0> v1bVar) {
        super(2, v1bVar);
        this.b = ijf0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        b9a0 b9a0Var = new b9a0(this.b, v1bVar);
        b9a0Var.a = obj;
        return b9a0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(d9a0 d9a0Var, v1b<? super Boolean> v1bVar) {
        return ((b9a0) create(d9a0Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        d9a0 d9a0Var = (d9a0) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        ijf0 ijf0Var = this.b;
        boolean z = true;
        if (!StringsKt.U(ijf0Var.a.b) && !StringsKt.M(d9a0Var.a, ijf0Var.a.b, true)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
