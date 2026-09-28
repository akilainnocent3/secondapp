package defpackage;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.domain.viewmodel.SocialFollowViewModel$syncWithStateAndFilter$1", f = "SocialFollowViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class a9a0 extends tje0 implements Function2<d9a0, v1b<? super d9a0>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ Map<String, y7i> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a9a0(Map<String, ? extends y7i> map, v1b<? super a9a0> v1bVar) {
        super(2, v1bVar);
        this.b = map;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        a9a0 a9a0Var = new a9a0(this.b, v1bVar);
        a9a0Var.a = obj;
        return a9a0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(d9a0 d9a0Var, v1b<? super d9a0> v1bVar) {
        return ((a9a0) create(d9a0Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        d9a0 d9a0Var = (d9a0) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        y7i y7iVar = this.b.get(d9a0Var.a);
        boolean z = Intrinsics.g(y7iVar, y7i.a.a) || d9a0Var.d;
        if (y7iVar == null) {
            y7iVar = d9a0Var.f;
        }
        return d9a0.a(d9a0Var, z, y7iVar, 2007);
    }
}
