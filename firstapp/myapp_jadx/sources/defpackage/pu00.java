package defpackage;

import kotlin.text.c;

/* JADX INFO: loaded from: classes7.dex */
public enum pu00 {
    JOIN_ROOM_CARD_CLICK("JoinRoomCard$Click"),
    SESSION_LOBBY_VISIT("SessionLobbyVisit"),
    /* JADX INFO: Fake field, exist only in values array */
    SESSION_LOBBY_BACK("SessionLobbyBack"),
    SESSION_LOBBY_CHAT_CLICK("SessionLobbyChatClick"),
    HOW_TO_PLAY_VISIT("HowToPlayVisit"),
    /* JADX INFO: Fake field, exist only in values array */
    EMOJI_BAR_COLLAPSE("EmojiBarCollapse"),
    /* JADX INFO: Fake field, exist only in values array */
    EMOJI_BAR_CLICK("EmojiBarClick"),
    /* JADX INFO: Fake field, exist only in values array */
    HIT_BUTTON_CLICK("HitButtonClick"),
    /* JADX INFO: Fake field, exist only in values array */
    BET_HISTORY_CLICK("BetHistoryClick"),
    /* JADX INFO: Fake field, exist only in values array */
    BET_HISTORY_DETAILS_CLICK("BetHistoryDetailsClick"),
    /* JADX INFO: Fake field, exist only in values array */
    ACTIVE_GAME_CLICK("ActiveGameClick"),
    RESULT_SCREEN_FLY_AWAY_BACK("ResultScreenFlyAwayBack"),
    RESULT_SCREEN_NO_MAJOR_WIN_BACK("ResultScreenNoMajorWinBack"),
    RESULT_SCREEN_MAJOR_WIN_BACK("ResultScreenMajorWinBack"),
    RESULT_SCREEN_FLY_AWAY_JOIN_ROOM_CARD_CLICK("ResultScreenFlyAwayJoinRoomCard$Click"),
    RESULT_SCREEN_NO_MAJOR_WIN_JOIN_ROOM_CARD_CLICK("ResultScreenNoMajorWinJoinRoomCard$Click"),
    RESULT_SCREEN_MAJOR_WIN_JOIN_ROOM_CARD_CLICK("ResultScreenMajorWinJoinRoomCard$Click"),
    /* JADX INFO: Fake field, exist only in values array */
    RESULT_SCREEN_FLY_AWAY_REJOIN_CLICK("ResultScreenFlyAwayReJoinClick"),
    /* JADX INFO: Fake field, exist only in values array */
    RESULT_SCREEN_NO_MAJOR_WIN_REJOIN_CLICK("ResultScreenNoMajorWinReJoinClick"),
    /* JADX INFO: Fake field, exist only in values array */
    RESULT_SCREEN_MAJOR_WIN_REJOIN_CLICK("ResultScreenMajorWinReJoinClick");

    public final String a;

    pu00(String str) {
        this.a = str;
    }

    public final String a(String str) {
        str.getClass();
        return c.p(this.a, "$", str, false);
    }
}
