package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public enum vu00 {
    ROOMS("sporty-piggy-bash/v1/matchmaking/rooms"),
    JOIN_ROOM("sporty-piggy-bash/v1/matchmaking/join/{roomConfigId}"),
    STATUS("sporty-piggy-bash/v1/game/status"),
    AVAILABLE("sporty-piggy-bash/v1/game/is-available"),
    VALIDATE("sporty-piggy-bash/v1/user/validate"),
    WALLET_INFO("games/lobby/v1/games/wallet_info"),
    CHAT_ROOM("games-common/v1/chat-room/get");

    public final String a;

    vu00(String str) {
        this.a = str;
    }
}
