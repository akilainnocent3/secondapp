package defpackage;

import android.content.Context;
import com.sportygames.compose.lobbyv2.models.LobbyV2HomeItemModel;
import com.sportygames.compose.lobbyv2.models.LobbyV2HomeModel;
import com.sportygames.compose.lobbyv2.viewmodels.LobbyV2ViewModel;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.lobbyv2.viewmodels.LobbyV2ViewModel", f = "LobbyV2ViewModel.kt", l = {692, 721, 750, 787, 855}, m = "modifyGamesIfRequired", v = 1)
public final class act extends x1b {
    public int A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ LobbyV2ViewModel D;
    public int E;
    public Context a;
    public LobbyV2HomeModel b;
    public List c;
    public LobbyV2HomeItemModel d;
    public bq40 e;
    public bq40 f;
    public LobbyV2HomeItemModel i;
    public List v;
    public int w;
    public int y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public act(LobbyV2ViewModel lobbyV2ViewModel, x1b x1bVar) {
        super(x1bVar);
        this.D = lobbyV2ViewModel;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.F1(null, null, this);
    }
}
