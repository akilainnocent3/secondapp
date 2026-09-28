package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.redblack.views.fragments.RedBlackFragment$onBoardingImageVisibility$1$1", f = "RedBlackFragment.kt", l = {}, m = "invokeSuspend", v = 1)
public final class tn40 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ nn40 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tn40(nn40 nn40Var, v1b<? super tn40> v1bVar) {
        super(2, v1bVar);
        this.a = nn40Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new tn40(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((tn40) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.z0().x1();
        return Unit.a;
    }
}
