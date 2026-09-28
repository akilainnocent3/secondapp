package defpackage;

import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.feature.loyalty.impl.notifications.presentation.mission.e;
import com.sportygames.externalgames.model.GamesMetadataSortBy;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.loyalty.impl.notifications.presentation.mission.LoyaltyMissionBottomSheetViewModel", f = "LoyaltyMissionBottomSheetViewModel.kt", l = {297, HttpStatusCodesKt.HTTP_TEMP_REDIRECT}, m = "createInvitationUiState", v = 2)
public final class rwt extends x1b {
    public int a;
    public StringUiText b;
    public /* synthetic */ Object c;
    public final /* synthetic */ e d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rwt(e eVar, x1b x1bVar) {
        super(x1bVar);
        this.d = eVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        GamesMetadataSortBy gamesMetadataSortBy = e.z;
        return this.d.x1(0, this);
    }
}
