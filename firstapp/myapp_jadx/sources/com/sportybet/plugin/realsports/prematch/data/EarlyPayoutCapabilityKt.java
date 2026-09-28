package com.sportybet.plugin.realsports.prematch.data;

import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Tournament;
import defpackage.akf;
import defpackage.cby;
import defpackage.tlc;
import defpackage.xvy;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0003¨\u0006\u0004"}, d2 = {"toEarlyPayoutCapability", "Lcom/sportybet/plugin/realsports/prematch/data/EarlyPayoutCapability;", "Lcom/sportybet/plugin/realsports/data/Event;", "Lcom/sportybet/plugin/realsports/data/Tournament;", "africa-bet-android"}, k = 2, mv = {2, 4, 0}, xi = 48)
public final class EarlyPayoutCapabilityKt {
    public static final EarlyPayoutCapability toEarlyPayoutCapability(Event event) {
        boolean zD = xvy.d(event, false, 3);
        boolean zD2 = xvy.d(event, true, 1);
        boolean zG = xvy.g(event, false, 3);
        boolean zG2 = xvy.g(event, true, 1);
        tlc tlcVar = tlc.a;
        boolean zE = akf.e(event, tlcVar, false, 6);
        boolean zE2 = akf.e(event, tlcVar, true, 2);
        cby cbyVar = cby.a;
        return new EarlyPayoutCapability(zD, zD2, zG, zG2, zE, zE2, akf.e(event, cbyVar, false, 6), akf.e(event, cbyVar, true, 2));
    }

    public static final EarlyPayoutCapability toEarlyPayoutCapability(Tournament tournament) {
        boolean zE = xvy.e(tournament, false, 3);
        boolean zE2 = xvy.e(tournament, true, 1);
        boolean zH = xvy.h(tournament, false, 3);
        boolean zH2 = xvy.h(tournament, true, 1);
        tlc tlcVar = tlc.a;
        boolean zF = akf.f(tournament, tlcVar, false, 6);
        boolean zF2 = akf.f(tournament, tlcVar, true, 2);
        cby cbyVar = cby.a;
        return new EarlyPayoutCapability(zE, zE2, zH, zH2, zF, zF2, akf.f(tournament, cbyVar, false, 6), akf.f(tournament, cbyVar, true, 2));
    }
}
