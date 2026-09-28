package com.sportygames.compose.lobbyv2.viewmodels;

import defpackage.c0d;
import defpackage.x1b;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.lobbyv2.viewmodels.LobbyV2ViewModel$TopWinsPagingSource", f = "LobbyV2ViewModel.kt", l = {1412}, m = "load", v = 1)
public final class b extends x1b {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ LobbyV2ViewModel.e c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(LobbyV2ViewModel.e eVar, x1b x1bVar) {
        super(x1bVar);
        this.c = eVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.d(null, this);
    }
}
