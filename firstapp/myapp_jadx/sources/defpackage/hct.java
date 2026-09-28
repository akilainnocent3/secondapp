package defpackage;

import com.sportygames.compose.lobbyv2.models.LobbyV2HomeItemModel;
import com.sportygames.compose.lobbyv2.models.LobbyV2HomeModel;
import com.sportygames.compose.lobbyv2.viewmodels.LobbyV2ViewModel;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.lobbyv2.viewmodels.LobbyV2ViewModel", f = "LobbyV2ViewModel.kt", l = {1245}, m = "updateFavouritesForLobbyV2Home", v = 1)
public final class hct extends x1b {
    public LobbyV2HomeModel a;
    public Collection b;
    public Iterator c;
    public LobbyV2HomeItemModel d;
    public Collection e;
    public int f;
    public int i;
    public int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ LobbyV2ViewModel y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hct(LobbyV2ViewModel lobbyV2ViewModel, x1b x1bVar) {
        super(x1bVar);
        this.y = lobbyV2ViewModel;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.z |= Integer.MIN_VALUE;
        return this.y.P1(null, this);
    }
}
