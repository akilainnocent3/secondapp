package defpackage;

import com.sportygames.commons.SportyGamesManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.commons.remote.token.TokenRefreshUtil$refreshUserToken$1", f = "TokenRefreshUtil.kt", l = {51}, m = "invokeSuspend", v = 1)
public final class ozf0 extends tje0 implements Function2<v5b, v1b<? super String>, Object> {
    public int a;
    public final /* synthetic */ String b;

    @c0d(c = "com.sportygames.commons.remote.token.TokenRefreshUtil$refreshUserToken$1$result$1", f = "TokenRefreshUtil.kt", l = {52}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super String>, Object> {
        public int a;

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(2, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super String> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) throws Throwable {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                dm8 dm8Var = pzf0.b;
                if (dm8Var == null) {
                    return null;
                }
                this.a = 1;
                obj = dm8Var.q(this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return (String) obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ozf0(String str, v1b v1bVar) {
        super(2, v1bVar);
        this.b = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ozf0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super String> v1bVar) {
        return ((ozf0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            if (!Intrinsics.g(pzf0.c, "API_RETURN_NULL")) {
                if (!this.b.equals(pzf0.c)) {
                    return pzf0.c;
                }
                if (SportyGamesManager.getInstance().getUser() != null) {
                    if (pzf0.b != null) {
                        pzf0.b = null;
                    }
                    pzf0.b = em8.a();
                    SportyGamesManager.getInstance().addAccountUpdatedListener(pzf0.a);
                    SportyGamesManager.getInstance().renewUserAccessToken();
                    a aVar = new a(2, null);
                    this.a = 1;
                    obj = vxf0.c(2000L, aVar, this);
                    if (obj == y5bVar) {
                        return y5bVar;
                    }
                }
            }
        }
        if (i != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        String str = (String) obj;
        return str == null ? "API_RETURN_NULL" : str;
    }
}
