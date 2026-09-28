package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.feature.dedicatedteampage.team.data.model.Vc.ACKxwYRsuWyGz;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class j88 {
    public static final j88 a;
    public static final /* synthetic */ j88[] b;

    /* JADX INFO: Fake field, exist only in values array */
    j88 EF0;

    public j88() {
        throw null;
    }

    public static j88 valueOf(String str) {
        return (j88) Enum.valueOf(j88.class, str);
    }

    public static j88[] values() {
        return (j88[]) b.clone();
    }

    static {
        j88 j88Var = new j88("NONE", 0);
        j88 j88Var2 = new j88(ACKxwYRsuWyGz.RIGMrCjhqM, 1);
        j88 j88Var3 = new j88(AnalyticsEvent.LOGIN, 2);
        j88 j88Var4 = new j88("LOGIN_POP", 3);
        j88 j88Var5 = new j88("MINIMIZE", 4);
        j88 j88Var6 = new j88("CLOSE", 5);
        j88 j88Var7 = new j88("NEW_MESSAGE", 6);
        a = j88Var7;
        b = new j88[]{j88Var, j88Var2, j88Var3, j88Var4, j88Var5, j88Var6, j88Var7, new j88("GO_VERIFY_EMAIL", 7), new j88("APP_HAS_VOICE_PERMISSION", 8), new j88("APP_GO_SETTING", 9), new j88("GO_TO_ACTION", 10), new j88("START_CALL", 11), new j88("NATIVE_END_CALL", 12)};
    }
}
