package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.compose.lobbyv2.models.LobbyConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.LobbyTabViewModel$getLobby$1", f = "LobbyTabViewModel.kt", l = {22}, m = "invokeSuspend", v = 1)
public final class z1t extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ r8t b;
    public final /* synthetic */ Function1<LobbyConfig, Unit> c;
    public final /* synthetic */ c2t d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public z1t(r8t r8tVar, Function1<? super LobbyConfig, Unit> function1, c2t c2tVar, v1b<? super z1t> v1bVar) {
        super(2, v1bVar);
        this.b = r8tVar;
        this.c = function1;
        this.d = c2tVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new z1t(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((z1t) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        LobbyConfig lobbyConfig = null;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            obj = r8t.c(this);
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
        ResultWrapper resultWrapper = (ResultWrapper) obj;
        boolean z = resultWrapper instanceof ResultWrapper.Success;
        Function1<LobbyConfig, Unit> function1 = this.c;
        if (z) {
            ResultWrapper.Success success = (ResultWrapper.Success) resultWrapper;
            Integer bizCode = ((HTTPResponse) success.getValue()).getBizCode();
            if (bizCode != null && bizCode.intValue() == 10000) {
                LobbyConfig lobbyConfig2 = (LobbyConfig) ((HTTPResponse) success.getValue()).getData();
                if (lobbyConfig2 != null) {
                    this.d.b = lobbyConfig2;
                    lobbyConfig = lobbyConfig2;
                }
                function1.invoke(lobbyConfig);
            } else {
                function1.invoke(null);
            }
        } else if (!(resultWrapper instanceof ResultWrapper.GenericError) || ((ResultWrapper.GenericError) resultWrapper).getCode() != null) {
            function1.invoke(null);
        }
        return Unit.a;
    }
}
