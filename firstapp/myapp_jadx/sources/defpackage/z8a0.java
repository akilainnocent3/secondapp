package defpackage;

import com.sportybet.android.social.domain.SocialRouter$SocialNetwork;
import com.sportybet.android.social.domain.entity.SocialMineType;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.domain.viewmodel.SocialFollowViewModel$onAccountChanged$1", f = "SocialFollowViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class z8a0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ x8a0 a;

    @c0d(c = "com.sportybet.android.social.domain.viewmodel.SocialFollowViewModel$onAccountChanged$1$1", f = "SocialFollowViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<bba0, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ x8a0 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x8a0 x8a0Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = x8a0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.b, v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(bba0 bba0Var, v1b<? super Unit> v1bVar) {
            return ((a) create(bba0Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            bba0 bba0Var = (bba0) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            bba0Var.getClass();
            this.b.J.a(bba0Var);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z8a0(x8a0 x8a0Var, v1b<? super z8a0> v1bVar) {
        super(2, v1bVar);
        this.a = x8a0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new z8a0(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((z8a0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        x8a0 x8a0Var = this.a;
        String lastNickName = x8a0Var.f.getLastNickName();
        v340 v340Var = x8a0Var.y;
        x8a0Var.d.e(SocialRouter$SocialNetwork.Data.copy$default((SocialRouter$SocialNetwork.Data) v340Var.a.getValue(), null, null, Intrinsics.g(lastNickName, ((SocialRouter$SocialNetwork.Data) v340Var.a.getValue()).getUsername()) ? SocialMineType.MINE : SocialMineType.NOT_MINE, null, 11, null), "arg_social_network_data");
        bba0.i iVar = bba0.i.a;
        iVar.getClass();
        x8a0Var.J.a(iVar);
        kzh.d(new g1i(x8a0Var.K, new a(x8a0Var, null)), o8i0.d(x8a0Var));
        return Unit.a;
    }
}
