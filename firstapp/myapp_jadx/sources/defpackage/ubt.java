package defpackage;

import com.sportygames.compose.lobbyv2.viewmodels.LobbyV2ViewModel;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.lobbyv2.viewmodels.LobbyV2ViewModel", f = "LobbyV2ViewModel.kt", l = {661}, m = "executeRemoveFavourite", v = 1)
public final class ubt extends x1b {
    public lyh a;
    public /* synthetic */ Object b;
    public final /* synthetic */ LobbyV2ViewModel c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ubt(LobbyV2ViewModel lobbyV2ViewModel, x1b x1bVar) {
        super(x1bVar);
        this.c = lobbyV2ViewModel;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.y1(0, this);
    }
}
