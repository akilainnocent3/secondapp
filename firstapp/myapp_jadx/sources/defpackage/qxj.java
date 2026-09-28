package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.HashMap;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* JADX INFO: loaded from: classes6.dex */
public final class qxj implements pdd0 {
    public final String a;
    public final String b;
    public final int c;
    public final Integer d;

    public qxj(String str, int i, String str2, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = num;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        xnu xnuVar = new xnu();
        String lowerCase = this.a.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        xnuVar.put(AnalyticsParam.GAMES_RECOMMENDATION_GAME_NAME, c.p(lowerCase, " ", "_", false));
        xnuVar.put(AnalyticsParam.GAMES_RECOMMENDATION_GAME_TYPE, this.b);
        xnuVar.put(AnalyticsParam.GAMES_RECOMMENDATION_CAROUSEL_POSITION, Integer.valueOf(this.c));
        Integer num = this.d;
        if (num != null) {
            xnuVar.put(AnalyticsParam.GAMES_RECOMMENDATION_CURRENT_USERS, Integer.valueOf(num.intValue()));
        }
        return new HashMap<>(xnuVar.c());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qxj)) {
            return false;
        }
        qxj qxjVar = (qxj) obj;
        return this.a.equals(qxjVar.a) && this.b.equals(qxjVar.b) && this.c == qxjVar.c && Intrinsics.g(this.d, qxjVar.d);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return AnalyticsEvent.GAMES_RECOMMENDATION_CLICK;
    }

    public final int hashCode() {
        int iA = gpp.a(this.c, gmf0.a(this.a.hashCode() * 31, 31, this.b), 31);
        Integer num = this.d;
        return iA + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("GamesCarouselGameClicked(gameName=", this.a, ", gameType=", this.b, ", gamePosition=");
        sbA.append(this.c);
        sbA.append(", gameCurrentUsers=");
        sbA.append(this.d);
        sbA.append(")");
        return sbA.toString();
    }
}
