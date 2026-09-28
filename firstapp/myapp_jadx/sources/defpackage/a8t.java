package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.compose.lobbyv2.models.LobbyV2GameDetailsModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.lobbyv2.remote.LobbyV2Repository$getFavouritesResponse$2", f = "LobbyV2Repository.kt", l = {95}, m = "invokeSuspend", v = 1)
public final class a8t extends tje0 implements Function1<v1b<? super HTTPResponse<List<? extends LobbyV2GameDetailsModel>>>, Object> {
    public int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Integer c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8t(int i, Integer num, v1b<? super a8t> v1bVar) {
        super(1, v1bVar);
        this.b = i;
        this.c = num;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new a8t(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<List<? extends LobbyV2GameDetailsModel>>> v1bVar) {
        return ((a8t) create(v1bVar)).invokeSuspend(Unit.a);
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
        g2t g2tVarI = on0.i();
        this.a = 1;
        Object objC = g2tVarI.c(this.b, this.c, this);
        return objC == y5bVar ? y5bVar : objC;
    }
}
