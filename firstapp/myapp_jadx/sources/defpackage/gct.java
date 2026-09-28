package defpackage;

import com.sportygames.compose.lobbyv2.viewmodels.LobbyV2ViewModel;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.lobbyv2.viewmodels.LobbyV2ViewModel", f = "LobbyV2ViewModel.kt", l = {1807, 625, 627}, m = "syncFavouriteWithServer", v = 1)
public final class gct extends x1b {
    public int a;
    public int b;
    public int c;
    public quw d;
    public boolean e;
    public boolean f;
    public /* synthetic */ Object i;
    public final /* synthetic */ LobbyV2ViewModel v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gct(LobbyV2ViewModel lobbyV2ViewModel, x1b x1bVar) {
        super(x1bVar);
        this.v = lobbyV2ViewModel;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.M1(0, this);
    }
}
