package defpackage;

import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.outrights.detail.OutrightsActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class fbz {
    public final Event a;
    public final Market b;
    public final Outcome c;
    public final OutrightsActivity d;

    public fbz(Event event, Market market, Outcome outcome, OutrightsActivity outrightsActivity) {
        event.getClass();
        market.getClass();
        this.a = event;
        this.b = market;
        this.c = outcome;
        this.d = outrightsActivity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fbz) {
            fbz fbzVar = (fbz) obj;
            return Intrinsics.g(this.a, fbzVar.a) && Intrinsics.g(this.b, fbzVar.b) && this.c.equals(fbzVar.c) && this.d == fbzVar.d;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "OutrightItem(event=" + this.a + ", market=" + this.b + ", outcome=" + this.c + ", listener=" + this.d + ")";
    }
}
