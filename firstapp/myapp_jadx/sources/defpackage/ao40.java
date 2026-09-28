package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.redblack.remote.models.RoundRequest;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.redblack.repositories.RedBlackRepository$endRound$2", f = "RedBlackRepository.kt", l = {63}, m = "invokeSuspend", v = 1)
public final class ao40 extends tje0 implements Function1<v1b<? super HTTPResponse<Map<String, ? extends String>>>, Object> {
    public int a;
    public final /* synthetic */ RoundRequest b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao40(RoundRequest roundRequest, v1b<? super ao40> v1bVar) {
        super(1, v1bVar);
        this.b = roundRequest;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new ao40(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<Map<String, ? extends String>>> v1bVar) {
        return ((ao40) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        mpe0 mpe0Var = on0.a;
        zn40 zn40VarL = on0.l();
        this.a = 1;
        Object objA = zn40VarL.a(this.b, this);
        return objA == y5bVar ? y5bVar : objA;
    }
}
