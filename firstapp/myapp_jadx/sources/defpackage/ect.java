package defpackage;

import com.sportygames.compose.lobbyv2.models.LobbyV2GameDetailsModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.lobbyv2.viewmodels.LobbyV2ViewModel$removeFavouriteFromUI$1$1", f = "LobbyV2ViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
public final class ect extends tje0 implements Function2<LobbyV2GameDetailsModel, v1b<? super Boolean>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ect(int i, v1b<? super ect> v1bVar) {
        super(2, v1bVar);
        this.b = i;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ect ectVar = new ect(this.b, v1bVar);
        ectVar.a = obj;
        return ectVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(LobbyV2GameDetailsModel lobbyV2GameDetailsModel, v1b<? super Boolean> v1bVar) {
        return ((ect) create(lobbyV2GameDetailsModel, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        LobbyV2GameDetailsModel lobbyV2GameDetailsModel = (LobbyV2GameDetailsModel) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        Integer id = lobbyV2GameDetailsModel.getId();
        return Boolean.valueOf(id == null || id.intValue() != this.b);
    }
}
