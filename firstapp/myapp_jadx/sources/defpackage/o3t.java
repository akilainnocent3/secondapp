package defpackage;

import com.sportygames.compose.lobbyv2.models.LobbyV2GameDetailsModel;
import com.sportygames.compose.lobbyv2.models.LobbyV2HomeItemModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.lobbyv2.components.LobbyV2DoubleHorizontalRowComponentKt$LobbyV2DoubleHorizontalRowComponent$3$1", f = "LobbyV2DoubleHorizontalRowComponent.kt", l = {111}, m = "invokeSuspend", v = 1)
public final class o3t extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ twd0<Boolean> b;
    public final /* synthetic */ List<LobbyV2GameDetailsModel> c;
    public final /* synthetic */ l1z d;
    public final /* synthetic */ LobbyV2HomeItemModel e;

    public static final class a<T> implements myh {
        public final /* synthetic */ List<LobbyV2GameDetailsModel> a;
        public final /* synthetic */ l1z b;
        public final /* synthetic */ LobbyV2HomeItemModel c;

        public a(List<LobbyV2GameDetailsModel> list, l1z l1zVar, LobbyV2HomeItemModel lobbyV2HomeItemModel) {
            this.a = list;
            this.b = l1zVar;
            this.c = lobbyV2HomeItemModel;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            if (((Boolean) obj).booleanValue()) {
                List<LobbyV2GameDetailsModel> list = this.a;
                int iMin = Math.min(list.size() - 1, 5);
                if (3 <= iMin) {
                    int i = 3;
                    while (true) {
                        LobbyV2GameDetailsModel lobbyV2GameDetailsModel = list.get(i);
                        this.b.i(lobbyV2GameDetailsModel.getDisplayName(), "lobby_home", i, this.c.getKey(), lobbyV2GameDetailsModel.getGameId$SGLibrary_sportybetRelease());
                        if (i == iMin) {
                            break;
                        }
                        i++;
                    }
                }
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3t(twd0<Boolean> twd0Var, List<LobbyV2GameDetailsModel> list, l1z l1zVar, LobbyV2HomeItemModel lobbyV2HomeItemModel, v1b<? super o3t> v1bVar) {
        super(2, v1bVar);
        this.b = twd0Var;
        this.c = list;
        this.d = l1zVar;
        this.e = lobbyV2HomeItemModel;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new o3t(this.b, this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((o3t) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            lyh lyhVarB = uzh.b(n95.c(new gcj(this.b, 1)));
            a aVar = new a(this.c, this.d, this.e);
            this.a = 1;
            if (lyhVarB.collect(aVar, this) == y5bVar) {
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
