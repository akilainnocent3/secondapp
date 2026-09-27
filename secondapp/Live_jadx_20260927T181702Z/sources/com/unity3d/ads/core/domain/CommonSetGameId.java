package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.SessionRepository;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class CommonSetGameId implements SetGameId {

    @l
    private final SessionRepository sessionRepository;

    public CommonSetGameId(@l SessionRepository sessionRepository) {
        m0.p(sessionRepository, "sessionRepository");
        this.sessionRepository = sessionRepository;
    }

    @Override // com.unity3d.ads.core.domain.SetGameId
    public void invoke(@m String str) {
        this.sessionRepository.setGameId(str);
    }
}
