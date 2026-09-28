package defpackage;

import com.sportygames.externalgames.model.GamesMetadataResponse;
import com.sportygames.externalgames.model.GamesMetadataSortBy;
import com.sportygames.externalgames.model.GamesMetadataSortOrder;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.game.viewmodel.LobbyTabViewModel$getPostBetGames$1", f = "LobbyTabViewModel.kt", l = {70}, m = "invokeSuspend", v = 2)
public final class b2t extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ d2t b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2t(d2t d2tVar, v1b<? super b2t> v1bVar) {
        super(2, v1bVar);
        this.b = d2tVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new b2t(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((b2t) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object objB;
        String strValueOf;
        d2t d2tVar = this.b;
        wwd0 wwd0Var = d2tVar.d;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            wwd0Var.setValue(null);
            jih jihVar = d2tVar.a;
            GamesMetadataSortBy gamesMetadataSortBy = GamesMetadataSortBy.ONLINE_USER_COUNT;
            GamesMetadataSortOrder gamesMetadataSortOrder = GamesMetadataSortOrder.DESC;
            this.a = 1;
            objB = jih.b(jihVar, null, gamesMetadataSortBy, gamesMetadataSortOrder, this, 1);
            if (objB == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objB = ((zi50) obj).a;
        }
        zi50.a aVar = zi50.b;
        if (!(objB instanceof zi50.b)) {
            List<GamesMetadataResponse.GameMetadata> list = (List) objB;
            ArrayList arrayList = new ArrayList(l48.r(list, 10));
            for (GamesMetadataResponse.GameMetadata gameMetadata : list) {
                Integer gameId = gameMetadata.getGameId();
                String str = (gameId == null || (strValueOf = String.valueOf(gameId.intValue())) == null) ? "" : strValueOf;
                String displayName = gameMetadata.getDisplayName();
                String str2 = (displayName == null && (displayName = gameMetadata.getName()) == null) ? "" : displayName;
                String imageUrl = gameMetadata.getImageUrl();
                arrayList.add(new jmh0(str, str2, imageUrl == null ? "" : imageUrl, gameMetadata.getOnlineUserCount(), gameMetadata.getDeepLinkUrl(), String.valueOf(gameMetadata.getCategoryIds())));
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            wwd0Var.setValue(arrayList);
        }
        if (zi50.a(objB) != null) {
            wwd0Var.setValue(null);
        }
        return Unit.a;
    }
}
