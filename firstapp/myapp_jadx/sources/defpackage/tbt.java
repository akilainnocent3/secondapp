package defpackage;

import com.sportygames.compose.lobbyv2.viewmodels.LobbyV2ViewModel;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.lobbyv2.viewmodels.LobbyV2ViewModel", f = "LobbyV2ViewModel.kt", l = {643}, m = "executeAddFavourite", v = 1)
public final class tbt extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ LobbyV2ViewModel b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tbt(LobbyV2ViewModel lobbyV2ViewModel, x1b x1bVar) {
        super(x1bVar);
        this.b = lobbyV2ViewModel;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.x1(0, this);
    }
}
