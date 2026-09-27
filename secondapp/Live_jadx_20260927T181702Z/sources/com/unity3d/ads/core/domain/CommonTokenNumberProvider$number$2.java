package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.SessionRepository;
import kotlin.jvm.internal.o0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class CommonTokenNumberProvider$number$2 extends o0 implements ds.a<Integer> {
    final /* synthetic */ SessionRepository $sessionRepository;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonTokenNumberProvider$number$2(SessionRepository sessionRepository) {
        super(0);
        this.$sessionRepository = sessionRepository;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ds.a
    @l
    public final Integer invoke() {
        return Integer.valueOf(this.$sessionRepository.getHeaderBiddingTokenCounter());
    }
}
