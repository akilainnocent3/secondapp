package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.compose.lobbyv2.models.LobbyConfig;
import com.sportygames.compose.lobbyv2.models.LobbyV2AddFavouritesResponse;
import com.sportygames.compose.lobbyv2.models.LobbyV2CategoryItemModel;
import com.sportygames.compose.lobbyv2.models.LobbyV2GameDetailsModel;
import com.sportygames.compose.lobbyv2.models.LobbyV2HomeItemModel;
import com.sportygames.compose.lobbyv2.models.LobbyV2HomeModel;
import com.sportygames.compose.lobbyv2.models.LobbyV2ProviderDetailsModel;
import com.sportygames.compose.lobbyv2.models.LobbyV2ProviderGamesResponseModel;
import com.sportygames.compose.lobbyv2.models.LobbyV2SearchResultsModel;
import com.sportygames.compose.lobbyv2.viewmodels.LobbyV2ViewModel;
import com.twilio.voice.Constants;
import com.twilio.voice.VoiceURLConnection;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J8\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\t\u001a\u00020\u00072\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0004\b\f\u0010\rJ8\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00022\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\t\u001a\u00020\u00072\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0004\b\u0010\u0010\rJ\u001c\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00030\u0002H§@¢\u0006\u0004\b\u0012\u0010\u0006J&\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00030\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0015\u0010\u0016J>\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00030\u00022\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\t\u001a\u00020\u00072\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0004\b\u0019\u0010\rJ2\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00030\u00022\b\b\u0001\u0010\t\u001a\u00020\u00072\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00022\b\b\u0001\u0010\u001d\u001a\u00020\u001cH§@¢\u0006\u0004\b\u001f\u0010 J&\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00030\u00022\b\b\u0001\u0010\u001d\u001a\u00020\u001cH§@¢\u0006\u0004\b!\u0010 J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00130\u0002H§@¢\u0006\u0004\b\"\u0010\u0006J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u0002H§@¢\u0006\u0004\b$\u0010\u0006J \u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00022\b\b\u0001\u0010%\u001a\u00020\u0013H§@¢\u0006\u0004\b'\u0010\u0016J*\u0010*\u001a\b\u0012\u0004\u0012\u00020&0\u00022\b\b\u0001\u0010%\u001a\u00020\u00132\b\b\u0003\u0010)\u001a\u00020(H§@¢\u0006\u0004\b*\u0010+J*\u0010-\u001a\b\u0012\u0004\u0012\u00020&0\u00022\b\b\u0001\u0010,\u001a\u00020\u00072\b\b\u0001\u0010%\u001a\u00020\u0013H§@¢\u0006\u0004\b-\u0010.J*\u0010/\u001a\b\u0012\u0004\u0012\u00020&0\u00022\b\b\u0001\u0010,\u001a\u00020\u00072\b\b\u0001\u0010%\u001a\u00020\u0013H§@¢\u0006\u0004\b/\u0010.J\u0016\u00101\u001a\b\u0012\u0004\u0012\u0002000\u0002H§@¢\u0006\u0004\b1\u0010\u0006J \u00103\u001a\b\u0012\u0004\u0012\u00020#0\u00022\b\b\u0001\u00102\u001a\u00020\u0013H§@¢\u0006\u0004\b3\u0010\u0016¨\u00064À\u0006\u0003"}, d2 = {"Lg2t;", "", "Lcom/sportygames/commons/remote/model/HTTPResponse;", "", "Lcom/sportygames/compose/lobbyv2/models/LobbyV2CategoryItemModel;", "b", "(Lv1b;)Ljava/lang/Object;", "", "sectionId", "offset", "limit", "Lcom/sportygames/compose/lobbyv2/models/LobbyV2HomeItemModel;", "j", "(Ljava/lang/Integer;ILjava/lang/Integer;Lv1b;)Ljava/lang/Object;", "providerId", "Lcom/sportygames/compose/lobbyv2/models/LobbyV2ProviderGamesResponseModel;", "l", "Lcom/sportygames/compose/lobbyv2/models/LobbyV2ProviderDetailsModel;", "i", "", "gameIds", "g", "(Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "categoryId", "Lcom/sportygames/compose/lobbyv2/models/LobbyV2GameDetailsModel;", "n", "c", "(ILjava/lang/Integer;Lv1b;)Ljava/lang/Object;", "Lcom/sportygames/compose/lobbyv2/viewmodels/LobbyV2ViewModel$FavouriteRequest;", "addFavouriteRequest", "Lcom/sportygames/compose/lobbyv2/models/LobbyV2AddFavouritesResponse;", "o", "(Lcom/sportygames/compose/lobbyv2/viewmodels/LobbyV2ViewModel$FavouriteRequest;Lv1b;)Ljava/lang/Object;", "f", "p", "Lcom/sportygames/compose/lobbyv2/models/LobbyV2HomeModel;", "e", "searchString", "Lcom/sportygames/compose/lobbyv2/models/LobbyV2SearchResultsModel;", "a", "", "isMyFavourite", "k", "(Ljava/lang/String;ZLv1b;)Ljava/lang/Object;", AnalyticsParam.EVENT_PARAM_ID, "m", "(ILjava/lang/String;Lv1b;)Ljava/lang/Object;", "h", "Lcom/sportygames/compose/lobbyv2/models/LobbyConfig;", "d", "variant", "q", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface g2t {
    @sbj("lobby/v1/search")
    Object a(@db30(JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT) String str, v1b<? super HTTPResponse<LobbyV2SearchResultsModel>> v1bVar);

    @sbj("lobby/v1/categories")
    Object b(v1b<? super HTTPResponse<List<LobbyV2CategoryItemModel>>> v1bVar);

    @sbj("lobby/v1/user/favourites")
    Object c(@db30("offset") int i, @db30("limit") Integer num, v1b<? super HTTPResponse<List<LobbyV2GameDetailsModel>>> v1bVar);

    @sbj("lobby/v1/configuration")
    Object d(v1b<? super HTTPResponse<LobbyConfig>> v1bVar);

    @sbj("lobby/v5/section/list")
    Object e(v1b<? super HTTPResponse<LobbyV2HomeModel>> v1bVar);

    @fbl(hasBody = Constants.dev, method = VoiceURLConnection.METHOD_TYPE_DELETE, path = "lobby/v1/user/favourites/remove")
    Object f(@jh4 LobbyV2ViewModel.FavouriteRequest favouriteRequest, v1b<? super HTTPResponse<List<LobbyV2GameDetailsModel>>> v1bVar);

    @sbj("lobby/v1/section/games/fetchByGameIds")
    Object g(@db30(encoded = Constants.dev, value = "gameIds") String str, v1b<? super HTTPResponse<List<LobbyV2HomeItemModel>>> v1bVar);

    @sbj("lobby/v1/search/category/{id}")
    Object h(@dxz(AnalyticsParam.EVENT_PARAM_ID) int i, @db30(JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT) String str, v1b<? super HTTPResponse<LobbyV2SearchResultsModel>> v1bVar);

    @sbj("lobby/v1/providers")
    Object i(v1b<? super HTTPResponse<List<LobbyV2ProviderDetailsModel>>> v1bVar);

    @sbj("lobby/v1/section/games")
    Object j(@db30("sectionId") Integer num, @db30("offset") int i, @db30("limit") Integer num2, v1b<? super HTTPResponse<LobbyV2HomeItemModel>> v1bVar);

    @sbj("lobby/v1/search")
    Object k(@db30(JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT) String str, @db30("isMyFavourite") boolean z, v1b<? super HTTPResponse<LobbyV2SearchResultsModel>> v1bVar);

    @sbj("lobby/v1/section/provider/games")
    Object l(@db30("providerId") Integer num, @db30("offset") int i, @db30("limit") Integer num2, v1b<? super HTTPResponse<LobbyV2ProviderGamesResponseModel>> v1bVar);

    @sbj("lobby/v1/search/provider/{id}")
    Object m(@dxz(AnalyticsParam.EVENT_PARAM_ID) int i, @db30(JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT) String str, v1b<? super HTTPResponse<LobbyV2SearchResultsModel>> v1bVar);

    @sbj("lobby/v1/games")
    Object n(@db30("categoryId") Integer num, @db30("offset") int i, @db30("limit") Integer num2, v1b<? super HTTPResponse<List<LobbyV2GameDetailsModel>>> v1bVar);

    @flz("lobby/v1/user/favourites/add")
    Object o(@jh4 LobbyV2ViewModel.FavouriteRequest favouriteRequest, v1b<? super HTTPResponse<LobbyV2AddFavouritesResponse>> v1bVar);

    @sbj("lobby/v1/section/segment/campaign")
    Object p(v1b<? super HTTPResponse<String>> v1bVar);

    @sbj("lobby/an-test/section/list")
    Object q(@db30("variant") String str, v1b<? super HTTPResponse<LobbyV2HomeModel>> v1bVar);
}
