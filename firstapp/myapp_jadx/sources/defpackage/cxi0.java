package defpackage;

import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.lobby.remote.models.AddFavouriteRequest;
import com.sportygames.lobby.remote.models.AddFavouriteResponse;
import com.sportygames.lobby.remote.models.BannerDetailResponse;
import com.sportygames.lobby.remote.models.CategoriesResponse;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.lobby.remote.models.NotificationResponse;
import com.sportygames.lobby.remote.models.SearchResultResponse;
import com.sportygames.lobby.remote.models.UpdateFavouriteRequest;
import com.sportygames.lobby.remote.models.WalletInfo;
import com.twilio.voice.Constants;
import com.twilio.voice.VoiceURLConnection;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J>\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006H§@¢\u0006\u0004\b\f\u0010\rJ \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0011\u0010\u0012J&\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0013\u0010\u0012J2\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0014\u0010\u0015J&\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u0016H§@¢\u0006\u0004\b\u0017\u0010\u0018J0\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00070\u00062\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001a\u0010\u001bJ\u001c\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00070\u0006H§@¢\u0006\u0004\b\u001d\u0010\rJ0\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00070\u00062\b\b\u0001\u0010\u001f\u001a\u00020\u001e2\b\b\u0001\u0010 \u001a\u00020\u001eH§@¢\u0006\u0004\b\"\u0010#J \u0010%\u001a\b\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0001\u0010\u0004\u001a\u00020$H§@¢\u0006\u0004\b%\u0010&J \u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00062\b\b\u0001\u0010'\u001a\u00020$H§@¢\u0006\u0004\b)\u0010&¨\u0006*À\u0006\u0003"}, d2 = {"Lcxi0;", "", "", "categoryId", "offset", "limit", "Lcom/sportygames/commons/remote/model/HTTPResponse;", "", "Lcom/sportygames/lobby/remote/models/GameDetails;", "i", "(Ljava/lang/Integer;ILjava/lang/Integer;Lv1b;)Ljava/lang/Object;", "Lcom/sportygames/lobby/remote/models/WalletInfo;", "g", "(Lv1b;)Ljava/lang/Object;", "Lcom/sportygames/lobby/remote/models/AddFavouriteRequest;", "addFavouriteRequest", "Lcom/sportygames/lobby/remote/models/AddFavouriteResponse;", "f", "(Lcom/sportygames/lobby/remote/models/AddFavouriteRequest;Lv1b;)Ljava/lang/Object;", "d", "c", "(ILjava/lang/Integer;Lv1b;)Ljava/lang/Object;", "Lcom/sportygames/lobby/remote/models/UpdateFavouriteRequest;", "e", "(Lcom/sportygames/lobby/remote/models/UpdateFavouriteRequest;Lv1b;)Ljava/lang/Object;", "Lcom/sportygames/lobby/remote/models/NotificationResponse;", "j", "(IILv1b;)Ljava/lang/Object;", "Lcom/sportygames/lobby/remote/models/CategoriesResponse;", "b", "", "showGifBanner", "showVideoBanner", "Lcom/sportygames/lobby/remote/models/BannerDetailResponse;", "k", "(ZZLv1b;)Ljava/lang/Object;", "", "h", "(Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "searchString", "Lcom/sportygames/lobby/remote/models/SearchResultResponse;", "a", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface cxi0 {
    @sbj("lobby/v1/search")
    Object a(@db30(JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT) String str, v1b<? super HTTPResponse<SearchResultResponse>> v1bVar);

    @sbj("lobby/v1/categories")
    Object b(v1b<? super HTTPResponse<List<CategoriesResponse>>> v1bVar);

    @sbj("lobby/v1/user/favourites")
    Object c(@db30("offset") int i, @db30("limit") Integer num, v1b<? super HTTPResponse<List<GameDetails>>> v1bVar);

    @fbl(hasBody = Constants.dev, method = VoiceURLConnection.METHOD_TYPE_DELETE, path = "lobby/v1/user/favourites/remove")
    Object d(@jh4 AddFavouriteRequest addFavouriteRequest, v1b<? super HTTPResponse<List<GameDetails>>> v1bVar);

    @gmz("lobby/v1/user/favourites/swap")
    Object e(@jh4 UpdateFavouriteRequest updateFavouriteRequest, v1b<? super HTTPResponse<List<GameDetails>>> v1bVar);

    @flz("lobby/v1/user/favourites/add")
    Object f(@jh4 AddFavouriteRequest addFavouriteRequest, v1b<? super HTTPResponse<AddFavouriteResponse>> v1bVar);

    @sbj("lobby/v1/games/wallet_info")
    Object g(v1b<? super HTTPResponse<WalletInfo>> v1bVar);

    @sbj("lobby/v1/games/searchByName")
    Object h(@db30(JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT) String str, v1b<? super HTTPResponse<GameDetails>> v1bVar);

    @sbj("lobby/v1/games?showOnlineCount=true")
    Object i(@db30("categoryId") Integer num, @db30("offset") int i, @db30("limit") Integer num2, v1b<? super HTTPResponse<List<GameDetails>>> v1bVar);

    @sbj("games-common/v1/notification/get")
    Object j(@db30("limit") int i, @db30("offset") int i2, v1b<? super HTTPResponse<List<NotificationResponse>>> v1bVar);

    @sbj("lobby/v1/banner-config")
    Object k(@db30("showGifBanner") boolean z, @db30("showVideoBanner") boolean z2, v1b<? super HTTPResponse<List<BannerDetailResponse>>> v1bVar);
}
