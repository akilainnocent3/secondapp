package defpackage;

import android.content.Context;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@fae
public final class iu2 {
    public static final iu2 a = new iu2();
    public static volatile jrm b;
    public static volatile boolean c;

    public interface a {
        void C();
    }

    public interface b extends a {
    }

    public static final void a(a aVar) {
        aVar.getClass();
        a.j().m1(aVar);
    }

    public static void b() {
        a.j().G(true);
    }

    public static final k53 c() {
        return a.j().K0();
    }

    public static final List<Selection> d() {
        return a.j().U();
    }

    public static final void e(Context context, Selection selection) {
        selection.getClass();
        a.j().L(context, selection);
    }

    public static final boolean f(Selection selection) {
        selection.getClass();
        return a.j().e0(selection);
    }

    public static final boolean g(Event event) {
        event.getClass();
        return a.j().y1(event);
    }

    public static final boolean h(Event event, Market market, Outcome outcome) {
        if (event != null && market != null && outcome != null) {
            ArrayList arrayListU = a.j().U();
            if (outcome.isJokerOutcome()) {
                if (arrayListU == null || !arrayListU.isEmpty()) {
                    int size = arrayListU.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayListU.get(i);
                        i++;
                        Selection selection = (Selection) obj;
                        if (Intrinsics.g(selection.a.eventId, event.eventId) && Intrinsics.g(selection.b, market)) {
                            return true;
                        }
                    }
                }
            } else if (arrayListU == null || !arrayListU.isEmpty()) {
                int size2 = arrayListU.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayListU.get(i2);
                    i2++;
                    Selection selection2 = (Selection) obj2;
                    if (Intrinsics.g(selection2.a.eventId, event.eventId) && Intrinsics.g(selection2.b, market) && selection2.c.isJokerOutcome()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean i() {
        ArrayList arrayListU = a.j().U();
        if (arrayListU == null || !arrayListU.isEmpty()) {
            int size = arrayListU.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListU.get(i);
                i++;
                if (b3.T(((Selection) obj).a.eventId)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean k() {
        return a.j().D();
    }

    public static final boolean l() {
        return a.j().R();
    }

    public static final boolean m() {
        return a.j().W();
    }

    public static final boolean n(Event event, Market market, Outcome outcome) {
        event.getClass();
        market.getClass();
        outcome.getClass();
        return a.j().w0(event, market, outcome);
    }

    public static final boolean o(Selection selection) {
        selection.getClass();
        return a.j().u1(selection);
    }

    public static final boolean p() {
        return a.j().m0();
    }

    public static final void q(a aVar) {
        aVar.getClass();
        a.j().j1(aVar);
    }

    public static final void r(Context context) {
        a.j().c(context);
    }

    public static final boolean s(Event event, Market market, Outcome outcome, boolean z) {
        return t(event, market, outcome, z, false, null, 16368);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean t(Event event, Market market, Outcome outcome, boolean z, boolean z2, List list, int i) {
        return a.j().N0(event, market, outcome, z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? null : list, k980.DEFAULT, false, false, false, null, false, false, (i & 8192) == 0);
    }

    public final jrm j() {
        jrm jrmVarK;
        jrm jrmVar = b;
        if (jrmVar != null) {
            return jrmVar;
        }
        synchronized (this) {
            try {
                jrm jrmVar2 = b;
                if (jrmVar2 != null) {
                    return jrmVar2;
                }
                try {
                    hp0 hp0Var = hp0.A;
                    hp0Var.getClass();
                    jrmVarK = ((z03) qag.a(hp0Var, z03.class)).K();
                    if (!c) {
                        d13.b(jrmVarK);
                        c = true;
                    }
                    b = jrmVarK;
                } catch (IllegalStateException e) {
                    itf0.a.p(e, "BetItem: Hilt not ready, fall back to local state", new Object[0]);
                    jrmVarK = d13.a.e().a;
                } catch (NullPointerException e2) {
                    itf0.a.p(e2, "BetItem: Hilt not ready, fall back to local state", new Object[0]);
                    jrmVarK = d13.a.e().a;
                }
                return jrmVarK;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
