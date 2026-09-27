package com.unity3d.ads.core.domain;

import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class CommonValidateGameId implements ValidateGameId {

    @l
    private final GetGameId getGameId;

    @l
    private final SetGameId setGameId;

    public CommonValidateGameId(@l GetGameId getGameId, @l SetGameId setGameId) {
        m0.p(getGameId, "getGameId");
        m0.p(setGameId, "setGameId");
        this.getGameId = getGameId;
        this.setGameId = setGameId;
    }

    @Override // com.unity3d.ads.core.domain.ValidateGameId
    public boolean invoke(@m String str) {
        if (this.getGameId.invoke() != null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        this.setGameId.invoke(str);
        return true;
    }
}
