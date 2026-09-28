package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class qqh extends pd00 {
    public static final p80 c = p80.d();
    public final xig0 b;

    public qqh(xig0 xig0Var) {
        this.b = xig0Var;
    }

    public static boolean d(xig0 xig0Var, int i) {
        if (xig0Var != null) {
            p80 p80Var = c;
            if (i > 1) {
                p80Var.f("Exceed MAX_SUBTRACE_DEEP:1");
                return false;
            }
            for (Map.Entry<String, Long> entry : xig0Var.n().entrySet()) {
                String key = entry.getKey();
                if (key != null) {
                    String strTrim = key.trim();
                    if (strTrim.isEmpty()) {
                        p80Var.f("counterId is empty");
                    } else if (strTrim.length() > 100) {
                        p80Var.f("counterId exceeded max length 100");
                    } else if (entry.getValue() == null) {
                        p80Var.f("invalid CounterValue:" + entry.getValue());
                        return false;
                    }
                }
                p80Var.f("invalid CounterId:" + entry.getKey());
                return false;
            }
            Iterator<E> it = xig0Var.s().iterator();
            while (it.hasNext()) {
                if (!d((xig0) it.next(), i + 1)) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean e(xig0 xig0Var, int i) {
        Long l;
        p80 p80Var = c;
        if (xig0Var == null) {
            p80Var.f("TraceMetric is null");
            return false;
        }
        if (i > 1) {
            p80Var.f("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        String name = xig0Var.getName();
        if (name != null) {
            String strTrim = name.trim();
            if (!strTrim.isEmpty() && strTrim.length() <= 100) {
                if (xig0Var.q() <= 0) {
                    p80Var.f("invalid TraceDuration:" + xig0Var.q());
                    return false;
                }
                if (!xig0Var.t()) {
                    p80Var.f("clientStartTimeUs is null.");
                    return false;
                }
                if (xig0Var.getName().startsWith("_st_") && ((l = xig0Var.n().get("_fr_tot")) == null || l.compareTo((Long) 0L) <= 0)) {
                    p80Var.f("non-positive totalFrames in screen trace " + xig0Var.getName());
                    return false;
                }
                Iterator<E> it = xig0Var.s().iterator();
                while (it.hasNext()) {
                    if (!e((xig0) it.next(), i + 1)) {
                        return false;
                    }
                }
                for (Map.Entry<String, String> entry : xig0Var.o().entrySet()) {
                    try {
                        pd00.b(entry.getKey(), entry.getValue());
                    } catch (IllegalArgumentException e) {
                        p80Var.f(e.getLocalizedMessage());
                        return false;
                    }
                }
                return true;
            }
        }
        p80Var.f("invalid TraceId:" + xig0Var.getName());
        return false;
    }

    @Override // defpackage.pd00
    public final boolean a() {
        xig0 xig0Var = this.b;
        boolean zE = e(xig0Var, 0);
        p80 p80Var = c;
        if (!zE) {
            p80Var.f("Invalid Trace:" + xig0Var.getName());
            return false;
        }
        if (xig0Var.m() <= 0) {
            Iterator<E> it = xig0Var.s().iterator();
            while (it.hasNext()) {
                if (((xig0) it.next()).m() > 0) {
                }
            }
            return true;
        }
        if (d(xig0Var, 0)) {
            return true;
        }
        p80Var.f("Invalid Counters for Trace:" + xig0Var.getName());
        return false;
    }
}
