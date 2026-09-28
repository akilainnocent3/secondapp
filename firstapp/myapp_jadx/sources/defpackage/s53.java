package defpackage;

import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes7.dex */
public final class s53 implements v03 {
    public final String a;
    public final String b;

    public s53(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair("subscribed_topics", this.a), new Pair("place_bet_topics", this.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s53)) {
            return false;
        }
        s53 s53Var = (s53) obj;
        return this.a.equals(s53Var.a) && this.b.equals(s53Var.b);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return "betslip__place_bet_with_topic_subscription_status";
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("PlaceBetWithTopicSubStatusEvent(subscribedTopics=", this.a, ", placeBetTopics=", this.b, ")");
    }
}
