package defpackage;

import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;

/* JADX INFO: loaded from: classes7.dex */
public final class o980 {
    public static final String a(Selection selection) {
        selection.getClass();
        Event event = selection.a;
        String str = event != null ? event.eventId : null;
        if (str == null) {
            str = "";
        }
        Market market = selection.b;
        String str2 = market != null ? market.id : null;
        if (str2 == null) {
            str2 = "";
        }
        Outcome outcome = selection.c;
        String str3 = outcome != null ? outcome.id : null;
        if (str3 == null) {
            str3 = "";
        }
        String specifier = selection.getSpecifier();
        return uf80.a(ux5.a(str, "|", str2, "|", str3), "|", specifier != null ? specifier : "");
    }
}
