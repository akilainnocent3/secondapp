package com.sportybet.plugin.realsports.betslip.widget;

import android.util.Pair;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.data.PickMarketMetadata;
import com.sportybet.plugin.realsports.data.PreCannedBBOutcome;
import defpackage.akf;
import defpackage.b3;
import defpackage.b6c;
import defpackage.bby;
import defpackage.j7g;
import defpackage.jez;
import defpackage.oxc;
import defpackage.rlc;
import defpackage.tug;
import defpackage.u7u;
import defpackage.uwx;
import defpackage.w950;
import defpackage.zi50;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    public interface a {

        /* JADX INFO: renamed from: com.sportybet.plugin.realsports.betslip.widget.e$a$a, reason: collision with other inner class name */
        public static final class C0425a implements a {
            public static final C0425a a = new C0425a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0425a);
            }

            public final int hashCode() {
                return -2008398120;
            }

            public final String toString() {
                return "AutoBet";
            }
        }

        public static final class b implements a {
            public final boolean a;

            public b(boolean z) {
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.a == ((b) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return b6c.a("BetSlip(keepOriginalEarlyPayoutDescription=", ")", this.a);
            }
        }

        public static final class c implements a {
            public final boolean a;

            public c(boolean z) {
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.a == ((c) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return b6c.a("QuickBet(keepOriginalEarlyPayoutDescription=", ")", this.a);
            }
        }

        public static final class d implements a {
            public static final d a = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 1672226773;
            }

            public final String toString() {
                return "Share";
            }
        }
    }

    public static final String a(String str, String str2, String str3) {
        if (!Intrinsics.g(str, "60110") || !Intrinsics.g(str2, "10")) {
            return str3 == null ? "" : str3;
        }
        String string = str3 != null ? StringsKt.u0(StringsKt.o0(str3, "-")).toString() : null;
        return string == null ? "" : string;
    }

    public static final CharSequence b(Selection selection, a aVar) {
        Object bVar;
        Object obj;
        aVar.getClass();
        String str = "";
        if (selection == null) {
            return "";
        }
        List<Selection> list = selection.d;
        Market market = selection.b;
        Outcome outcome = selection.c;
        try {
            zi50.a aVar2 = zi50.b;
            j7g j7gVar = new j7g();
            if (selection.p()) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Selection selection2 = list.get(i);
                    j7gVar.k(selection2.c.desc);
                    j7gVar.a("   ");
                    j7gVar.a(selection2.b.desc);
                    if (i != size - 1) {
                        j7gVar.a("\n");
                    }
                }
                Unit unit = Unit.a;
                bVar = j7gVar;
            } else {
                List<PreCannedBBOutcome> list2 = outcome.childOutcomes;
                if (list2 != null && !list2.isEmpty()) {
                    List<PreCannedBBOutcome> list3 = outcome.childOutcomes;
                    list3.getClass();
                    for (PreCannedBBOutcome preCannedBBOutcome : list3) {
                        j7gVar.k(preCannedBBOutcome.getOutcomeDesc());
                        j7gVar.a("   ");
                        j7gVar.a(preCannedBBOutcome.getMarketName());
                        j7gVar.a("\n");
                    }
                    Unit unit2 = Unit.a;
                    bVar = j7gVar;
                } else if (aVar instanceof a.b) {
                    String strE = e(selection);
                    if (strE == null) {
                        strE = c(selection, ((a.b) aVar).a);
                    }
                    j7gVar.k(strE);
                    bVar = j7gVar;
                } else if (aVar instanceof a.c) {
                    String strE2 = e(selection);
                    if (strE2 == null) {
                        strE2 = c(selection, ((a.c) aVar).a);
                    }
                    j7gVar.k(strE2);
                    bVar = j7gVar;
                } else if (aVar instanceof a.d) {
                    j7gVar.k(d(market.id, market.specifier, market.desc));
                    bVar = j7gVar;
                } else {
                    if (!(aVar instanceof a.C0425a)) {
                        throw new uwx();
                    }
                    String strE3 = e(selection);
                    if (strE3 == null) {
                        strE3 = a(market.id, outcome.id, market.desc);
                    }
                    j7gVar.k(strE3);
                    bVar = j7gVar;
                }
            }
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (zi50.a(bVar) == null) {
            obj = bVar;
        } else {
            w950.a("MarketStringUtils", "getDisplayDesc", new Throwable("market description is missing"), kotlin.collections.b.k(new Pair(AnalyticsParam.EVENT_PARAM_EVENT_ID, selection.a.eventId), new Pair("market_id", market.id)));
            obj = str;
        }
        return (CharSequence) obj;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003a  */
    public static final String c(Selection selection, boolean z) {
        boolean z2;
        selection.getClass();
        Market market = selection.b;
        boolean z3 = akf.a(market) != null || u7u.e(selection) || u7u.f(selection) || rlc.b(selection);
        String str = market.desc;
        if (z) {
            String str2 = market.id;
            z2 = (Intrinsics.g(str2, "60200") || Intrinsics.g(str2, "60100")) ? false : true;
        }
        if (!z3 || z2) {
            str.getClass();
            return str;
        }
        str.getClass();
        return StringsKt.u0(StringsKt.p0(str, "-", str)).toString();
    }

    public static final String d(String str, String str2, String str3) {
        Object next;
        if (str == null || str2 == null) {
            return str3 == null ? "" : str3;
        }
        Iterator<T> it = jez.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            bby bbyVar = (bby) next;
            if (bbyVar.c.equals(str) && bbyVar.d.equals(str2)) {
                break;
            }
        }
        bby bbyVar2 = (bby) next;
        String str4 = bbyVar2 != null ? bbyVar2.e : null;
        String str5 = bbyVar2 != null ? bbyVar2.f : null;
        if (str5 == null || str5.length() == 0) {
            return str3 == null ? "" : str3;
        }
        return (str3 == null || str3.length() == 0) ? oxc.a(str4, ": ", str5) : tug.a(str3, ": ", str5);
    }

    public static String e(Selection selection) {
        PickMarketMetadata pickMarketMetadata;
        String marketHeadline;
        Market market = selection.b;
        if (market == null || (pickMarketMetadata = market.pickMarketMetadata) == null || (marketHeadline = pickMarketMetadata.getMarketHeadline()) == null || marketHeadline.length() <= 0 || !b3.U(selection.a.eventId)) {
            return null;
        }
        return marketHeadline;
    }
}
