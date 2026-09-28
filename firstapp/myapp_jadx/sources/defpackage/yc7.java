package defpackage;

import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;
import com.sportygames.common.framework.network.HTTPResponse;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lyc7;", "", "", JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT, "Lcom/sportygames/common/framework/network/HTTPResponse;", "", "Lae7;", "getChatRoom", "(Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "common_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface yc7 {
    @sbj("games-common/v1/chat-room/get")
    Object getChatRoom(@db30(JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT) String str, v1b<? super HTTPResponse<List<ae7>>> v1bVar);
}
