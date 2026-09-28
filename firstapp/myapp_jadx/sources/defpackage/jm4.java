package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public enum jm4 {
    AVAILABLE("sporty-bonus-cup/v1/game/is-available"),
    USER_VALIDATION("sporty-bonus-cup/v1/user/validate"),
    START("sporty-bonus-cup/v1/round/start"),
    GET_STATUS("sporty-bonus-cup/v1/round/status"),
    CLAIM("sporty-bonus-cup/v1/round/claim"),
    CAMPAIGN("/campaign"),
    SEARCH("/search");

    public final String a;

    jm4(String str) {
        this.a = str;
    }
}
