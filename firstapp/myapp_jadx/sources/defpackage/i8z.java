package defpackage;

import com.sporty.android.book.domain.entity.Outcome;
import kotlin.text.b;

/* JADX INFO: loaded from: classes4.dex */
public final class i8z {
    public static final String a(String str, String str2) {
        str.getClass();
        str2.getClass();
        return str + "_" + str2;
    }

    public static final Outcome b(com.sportybet.plugin.realsports.data.Outcome outcome) {
        outcome.getClass();
        String str = outcome.id;
        str.getClass();
        String str2 = outcome.odds;
        str2.getClass();
        String strValueOf = String.valueOf(outcome.probability);
        int i = outcome.isActive;
        String str3 = outcome.desc;
        str3.getClass();
        return new Outcome(str, str2, strValueOf, i, str3);
    }

    public static final com.sportybet.plugin.realsports.data.Outcome c(Outcome outcome) {
        Double dH;
        outcome.getClass();
        com.sportybet.plugin.realsports.data.Outcome outcome2 = new com.sportybet.plugin.realsports.data.Outcome();
        outcome2.id = outcome.getId();
        outcome2.odds = outcome.getOdds();
        String probability = outcome.getProbability();
        outcome2.probability = (probability == null || (dH = b.h(probability)) == null) ? 0.0d : dH.doubleValue();
        outcome2.isActive = outcome.isActive();
        outcome2.desc = outcome.getDesc();
        return outcome2;
    }
}
