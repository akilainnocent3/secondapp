package com.sportybet.feature.loyalty.impl.notifications.presentation.mission;

import com.sportygames.externalgames.model.GamesMetadataSortBy;
import defpackage.c0d;
import defpackage.x1b;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.loyalty.impl.notifications.presentation.mission.LoyaltyMissionBottomSheetViewModel", f = "LoyaltyMissionBottomSheetViewModel.kt", l = {185, 197}, m = "resolveGamesCarouselUiState", v = 2)
public final class f extends x1b {
    public LoyaltyMissionBottomSheetActivity.MissionBottomSheetArgument.GamesCarouselMission a;
    public /* synthetic */ Object b;
    public final /* synthetic */ e c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, x1b x1bVar) {
        super(x1bVar);
        this.c = eVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        GamesMetadataSortBy gamesMetadataSortBy = e.z;
        return this.c.z1(null, this);
    }
}
