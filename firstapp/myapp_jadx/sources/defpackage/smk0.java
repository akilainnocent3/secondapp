package defpackage;

import android.util.Log;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class smk0 extends ymk0 {
    public final w1l0 g;
    public final /* synthetic */ knk0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public smk0(knk0 knk0Var, String str, int i, w1l0 w1l0Var) {
        super(str, i);
        this.h = knk0Var;
        this.g = w1l0Var;
    }

    @Override // defpackage.ymk0
    public final int a() {
        return this.g.r();
    }

    @Override // defpackage.ymk0
    public final boolean b() {
        return false;
    }

    @Override // defpackage.ymk0
    public final boolean c() {
        return this.g.w();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0272  */
    /* JADX WARN: Code duplicated, block: B:105:0x0292  */
    /* JADX WARN: Code duplicated, block: B:111:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:115:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:120:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:126:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:131:0x0303  */
    /* JADX WARN: Code duplicated, block: B:133:0x0309  */
    /* JADX WARN: Code duplicated, block: B:135:0x031d  */
    /* JADX WARN: Code duplicated, block: B:137:0x0323  */
    /* JADX WARN: Code duplicated, block: B:139:0x032b  */
    /* JADX WARN: Code duplicated, block: B:141:0x0335  */
    /* JADX WARN: Code duplicated, block: B:150:0x0358  */
    /* JADX WARN: Code duplicated, block: B:153:0x0361  */
    /* JADX WARN: Code duplicated, block: B:158:0x0398 A[EDGE_INSN: B:158:0x0398->B:161:0x03c2 BREAK  A[LOOP:1: B:59:0x0183->B:64:0x01a6]] */
    /* JADX WARN: Code duplicated, block: B:159:0x03ab A[EDGE_INSN: B:159:0x03ab->B:161:0x03c2 BREAK  A[LOOP:1: B:59:0x0183->B:64:0x01a6]] */
    /* JADX WARN: Code duplicated, block: B:205:0x033c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x01ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x0199 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x0237 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x01d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x01f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x01d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x020f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x01f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x0221 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x01bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:0x03bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x0264 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x0280 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x0167 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x02b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:0x02ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x02c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x0167 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x02fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x0392 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x037d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x0368 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x03c2 A[EDGE_INSN: B:234:0x03c2->B:161:0x03c2 BREAK  A[LOOP:1: B:59:0x0183->B:64:0x01a6], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x035e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x027a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:0x02bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0176  */
    /* JADX WARN: Code duplicated, block: B:61:0x0189  */
    /* JADX WARN: Code duplicated, block: B:64:0x01a6 A[LOOP:1: B:59:0x0183->B:64:0x01a6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:74:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:81:0x0200  */
    /* JADX WARN: Code duplicated, block: B:82:0x0209  */
    /* JADX WARN: Code duplicated, block: B:86:0x0215  */
    /* JADX WARN: Code duplicated, block: B:91:0x0245  */
    /* JADX WARN: Code duplicated, block: B:96:0x0259  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean g(Long l, Long l2, d7l0 d7l0Var, long j, msk0 msk0Var, boolean z) {
        HashSet hashSet;
        Iterator it;
        ox0 ox0Var;
        Iterator it2;
        Iterator it3;
        z1l0 z1l0Var;
        boolean z2;
        String strX;
        V v;
        Boolean boolF;
        Boolean boolF2;
        String str;
        d2l0 d2l0VarT;
        long j2;
        Boolean boolF3;
        k7l0 k7l0Var;
        Long lValueOf;
        Double dValueOf;
        z1l0 z1l0Var2;
        Boolean boolF4;
        int i;
        epl0.a();
        knk0 knk0Var = this.h;
        k8l0 k8l0Var = knk0Var.a;
        wok0 wok0Var = k8l0Var.d;
        y4l0 y4l0Var = k8l0Var.f;
        k4l0 k4l0Var = k8l0Var.j;
        t2l0 t2l0Var = v2l0.F0;
        String str2 = this.a;
        boolean zQ = wok0Var.q(str2, t2l0Var);
        w1l0 w1l0Var = this.g;
        long j3 = w1l0Var.B() ? msk0Var.e : j;
        k8l0.m(y4l0Var);
        u4l0 u4l0Var = y4l0Var.n;
        u4l0 u4l0Var2 = y4l0Var.i;
        boolean zIsLoggable = Log.isLoggable(y4l0Var.m(), 2);
        int i2 = this.b;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        Boolean bool = null;
        if (zIsLoggable) {
            k8l0.m(y4l0Var);
            u4l0Var.d(Integer.valueOf(i2), "Evaluating filter. audience, filter, event", w1l0Var.q() ? Integer.valueOf(w1l0Var.r()) : null, k4l0Var.a(w1l0Var.s()));
            k8l0.m(y4l0Var);
            pol0 pol0Var = knk0Var.b.g;
            iol0.U(pol0Var);
            StringBuilder sb = new StringBuilder();
            sb.append("\nevent_filter {\n");
            if (w1l0Var.q()) {
                i = 0;
                pol0.y(sb, 0, "filter_id", Integer.valueOf(w1l0Var.r()));
            } else {
                i = 0;
            }
            pol0.y(sb, i, "event_name", pol0Var.a.j.a(w1l0Var.s()));
            String strU = pol0.u(w1l0Var.y(), w1l0Var.z(), w1l0Var.B());
            if (!strU.isEmpty()) {
                pol0.y(sb, 0, "filter_type", strU);
            }
            if (w1l0Var.w()) {
                pol0.z(sb, 1, "event_count_filter", w1l0Var.x());
            }
            if (w1l0Var.u() > 0) {
                sb.append("  filters {\n");
                Iterator it4 = w1l0Var.t().iterator();
                while (it4.hasNext()) {
                    pol0Var.r(sb, 2, (z1l0) it4.next());
                }
            }
            pol0.s(1, sb);
            sb.append("}\n}\n");
            u4l0Var.b(sb.toString(), "Filter definition");
        }
        if (!w1l0Var.q() || w1l0Var.r() > 256) {
            k8l0.m(y4l0Var);
            u4l0Var2.c(y4l0.k(str2), "Invalid event filter ID. appId, id", String.valueOf(w1l0Var.q() ? Integer.valueOf(w1l0Var.r()) : null));
            return false;
        }
        boolean z3 = w1l0Var.y() || w1l0Var.z() || w1l0Var.B();
        if (z && !z3) {
            k8l0.m(y4l0Var);
            u4l0Var.c(Integer.valueOf(i2), "Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", w1l0Var.q() ? Integer.valueOf(w1l0Var.r()) : null);
            return true;
        }
        String strT = d7l0Var.t();
        if (!w1l0Var.w()) {
            hashSet = new HashSet();
            it = w1l0Var.t().iterator();
            while (true) {
                if (it.hasNext()) {
                    ox0Var = new ox0();
                    it2 = d7l0Var.q().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            it3 = w1l0Var.t().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    zQ = zQ;
                                    y4l0Var = y4l0Var;
                                    bool = Boolean.TRUE;
                                    break;
                                }
                                z1l0Var = (z1l0) it3.next();
                                if (z1l0Var.u()) {
                                    z2 = false;
                                } else {
                                    z2 = false;
                                }
                                strX = z1l0Var.x();
                                if (strX.isEmpty()) {
                                    v = ox0Var.get(strX);
                                    if (v instanceof Long) {
                                        if (v instanceof Double) {
                                            if (v instanceof String) {
                                                zQ = zQ;
                                                y4l0Var = y4l0Var;
                                                if (v == 0) {
                                                    k8l0.m(y4l0Var);
                                                    u4l0Var2.c(k4l0Var.a(strT), "Unknown param type. event, param", k4l0Var.b(strX));
                                                    break;
                                                }
                                                k8l0.m(y4l0Var);
                                                u4l0Var.c(k4l0Var.a(strT), "Missing param for filter. event, param", k4l0Var.b(strX));
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                            if (z1l0Var.q()) {
                                                if (z1l0Var.s()) {
                                                    zQ = zQ;
                                                    y4l0Var = y4l0Var;
                                                    k8l0.m(y4l0Var);
                                                    u4l0Var2.c(k4l0Var.a(strT), "No filter for String param. event, param", k4l0Var.b(strX));
                                                    break;
                                                }
                                                str = (String) v;
                                                if (pol0.H(str)) {
                                                    zQ = zQ;
                                                    y4l0Var = y4l0Var;
                                                    k8l0.m(y4l0Var);
                                                    u4l0Var2.c(k4l0Var.a(strT), "Invalid param value for number filter. event, param", k4l0Var.b(strX));
                                                    break;
                                                }
                                                d2l0VarT = z1l0Var.t();
                                                if (pol0.H(str)) {
                                                    zQ = zQ;
                                                    y4l0Var = y4l0Var;
                                                    j2 = 0;
                                                    boolF3 = ymk0.f(new BigDecimal(str), d2l0VarT, 0.0d);
                                                } else {
                                                    boolF3 = null;
                                                }
                                                if (boolF3 != null) {
                                                    break;
                                                    break;
                                                }
                                                if (boolF3.booleanValue() == z2) {
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                                y4l0Var = y4l0Var;
                                                zQ = zQ;
                                            } else {
                                                k2l0 k2l0VarR = z1l0Var.r();
                                                k8l0.m(y4l0Var);
                                                boolF3 = ymk0.e((String) v, k2l0VarR, y4l0Var);
                                            }
                                            j2 = 0;
                                            if (boolF3 != null) {
                                                break;
                                                break;
                                            }
                                            if (boolF3.booleanValue() == z2) {
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                            y4l0Var = y4l0Var;
                                            zQ = zQ;
                                        } else if (z1l0Var.s()) {
                                            double dDoubleValue = ((Double) v).doubleValue();
                                            boolF2 = ymk0.f(new BigDecimal(dDoubleValue), z1l0Var.t(), Math.ulp(dDoubleValue));
                                            if (boolF2 != null) {
                                                if (boolF2.booleanValue() == z2) {
                                                    bool = Boolean.FALSE;
                                                }
                                            }
                                        } else {
                                            k8l0.m(y4l0Var);
                                            u4l0Var2.c(k4l0Var.a(strT), "No number filter for double param. event, param", k4l0Var.b(strX));
                                        }
                                    } else if (z1l0Var.s()) {
                                        boolF = ymk0.f(new BigDecimal(((Long) v).longValue()), z1l0Var.t(), 0.0d);
                                        if (boolF != null) {
                                            if (boolF.booleanValue() == z2) {
                                                bool = Boolean.FALSE;
                                            }
                                        }
                                    } else {
                                        k8l0.m(y4l0Var);
                                        u4l0Var2.c(k4l0Var.a(strT), "No number filter for long param. event, param", k4l0Var.b(strX));
                                    }
                                } else {
                                    k8l0.m(y4l0Var);
                                    u4l0Var2.b(k4l0Var.a(strT), "Event has empty param name. event");
                                }
                            }
                        } else {
                            k7l0Var = (k7l0) it2.next();
                            if (!hashSet.contains(k7l0Var.r())) {
                                if (k7l0Var.u()) {
                                    String strR = k7l0Var.r();
                                    if (k7l0Var.u()) {
                                        lValueOf = Long.valueOf(k7l0Var.v());
                                    } else {
                                        lValueOf = null;
                                    }
                                    ox0Var.put(strR, lValueOf);
                                } else if (k7l0Var.y()) {
                                    String strR2 = k7l0Var.r();
                                    if (k7l0Var.y()) {
                                        dValueOf = Double.valueOf(k7l0Var.z());
                                    } else {
                                        dValueOf = null;
                                    }
                                    ox0Var.put(strR2, dValueOf);
                                } else if (k7l0Var.s()) {
                                    ox0Var.put(k7l0Var.r(), k7l0Var.t());
                                } else {
                                    k8l0.m(y4l0Var);
                                    u4l0Var2.c(k4l0Var.a(strT), "Unknown value for param. event, param", k4l0Var.b(k7l0Var.r()));
                                }
                            }
                        }
                    }
                } else {
                    z1l0Var2 = (z1l0) it.next();
                    if (z1l0Var2.x().isEmpty()) {
                        k8l0.m(y4l0Var);
                        u4l0Var2.b(k4l0Var.a(strT), "null or empty param name in filter. event");
                    } else {
                        hashSet.add(z1l0Var2.x());
                    }
                }
                zQ = zQ;
                y4l0Var = y4l0Var;
                break;
            }
        }
        try {
            boolF4 = ymk0.f(new BigDecimal(j3), w1l0Var.x(), 0.0d);
        } catch (NumberFormatException unused) {
            boolF4 = null;
        }
        if (boolF4 != null) {
            if (boolF4.booleanValue()) {
                hashSet = new HashSet();
                it = w1l0Var.t().iterator();
                while (true) {
                    if (it.hasNext()) {
                        ox0Var = new ox0();
                        it2 = d7l0Var.q().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                it3 = w1l0Var.t().iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        zQ = zQ;
                                        y4l0Var = y4l0Var;
                                        bool = Boolean.TRUE;
                                        break;
                                    }
                                    z1l0Var = (z1l0) it3.next();
                                    if (z1l0Var.u() || !z1l0Var.v()) {
                                        z2 = false;
                                    } else {
                                        z2 = true;
                                    }
                                    strX = z1l0Var.x();
                                    if (strX.isEmpty()) {
                                        v = ox0Var.get(strX);
                                        if (v instanceof Long) {
                                            if (v instanceof Double) {
                                                if (v instanceof String) {
                                                    zQ = zQ;
                                                    y4l0Var = y4l0Var;
                                                    if (v == 0) {
                                                        k8l0.m(y4l0Var);
                                                        u4l0Var2.c(k4l0Var.a(strT), "Unknown param type. event, param", k4l0Var.b(strX));
                                                        break;
                                                    }
                                                    k8l0.m(y4l0Var);
                                                    u4l0Var.c(k4l0Var.a(strT), "Missing param for filter. event, param", k4l0Var.b(strX));
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                                if (z1l0Var.q()) {
                                                    if (z1l0Var.s()) {
                                                        zQ = zQ;
                                                        y4l0Var = y4l0Var;
                                                        k8l0.m(y4l0Var);
                                                        u4l0Var2.c(k4l0Var.a(strT), "No filter for String param. event, param", k4l0Var.b(strX));
                                                        break;
                                                    }
                                                    str = (String) v;
                                                    if (pol0.H(str)) {
                                                        zQ = zQ;
                                                        y4l0Var = y4l0Var;
                                                        k8l0.m(y4l0Var);
                                                        u4l0Var2.c(k4l0Var.a(strT), "Invalid param value for number filter. event, param", k4l0Var.b(strX));
                                                        break;
                                                    }
                                                    d2l0VarT = z1l0Var.t();
                                                    if (pol0.H(str)) {
                                                        boolF3 = null;
                                                    } else {
                                                        try {
                                                            zQ = zQ;
                                                            y4l0Var = y4l0Var;
                                                            j2 = 0;
                                                            try {
                                                                boolF3 = ymk0.f(new BigDecimal(str), d2l0VarT, 0.0d);
                                                            } catch (NumberFormatException unused2) {
                                                                boolF3 = null;
                                                            }
                                                        } catch (NumberFormatException unused3) {
                                                            zQ = zQ;
                                                            y4l0Var = y4l0Var;
                                                            j2 = 0;
                                                        }
                                                    }
                                                    if (boolF3 != null) {
                                                        break;
                                                    }
                                                    if (boolF3.booleanValue() == z2) {
                                                        bool = Boolean.FALSE;
                                                        break;
                                                    }
                                                    y4l0Var = y4l0Var;
                                                    zQ = zQ;
                                                } else {
                                                    k2l0 k2l0VarR2 = z1l0Var.r();
                                                    k8l0.m(y4l0Var);
                                                    boolF3 = ymk0.e((String) v, k2l0VarR2, y4l0Var);
                                                }
                                                j2 = 0;
                                                if (boolF3 != null) {
                                                    break;
                                                    break;
                                                }
                                                if (boolF3.booleanValue() == z2) {
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                                y4l0Var = y4l0Var;
                                                zQ = zQ;
                                            } else if (z1l0Var.s()) {
                                                k8l0.m(y4l0Var);
                                                u4l0Var2.c(k4l0Var.a(strT), "No number filter for double param. event, param", k4l0Var.b(strX));
                                            } else {
                                                double dDoubleValue2 = ((Double) v).doubleValue();
                                                try {
                                                    boolF2 = ymk0.f(new BigDecimal(dDoubleValue2), z1l0Var.t(), Math.ulp(dDoubleValue2));
                                                } catch (NumberFormatException unused4) {
                                                    boolF2 = null;
                                                }
                                                if (boolF2 != null) {
                                                    if (boolF2.booleanValue() == z2) {
                                                        bool = Boolean.FALSE;
                                                    }
                                                }
                                            }
                                        } else if (z1l0Var.s()) {
                                            k8l0.m(y4l0Var);
                                            u4l0Var2.c(k4l0Var.a(strT), "No number filter for long param. event, param", k4l0Var.b(strX));
                                        } else {
                                            try {
                                                boolF = ymk0.f(new BigDecimal(((Long) v).longValue()), z1l0Var.t(), 0.0d);
                                            } catch (NumberFormatException unused5) {
                                                boolF = null;
                                            }
                                            if (boolF != null) {
                                                if (boolF.booleanValue() == z2) {
                                                    bool = Boolean.FALSE;
                                                }
                                            }
                                        }
                                    } else {
                                        k8l0.m(y4l0Var);
                                        u4l0Var2.b(k4l0Var.a(strT), "Event has empty param name. event");
                                    }
                                }
                            } else {
                                k7l0Var = (k7l0) it2.next();
                                if (!hashSet.contains(k7l0Var.r())) {
                                    if (k7l0Var.u()) {
                                        String strR3 = k7l0Var.r();
                                        if (k7l0Var.u()) {
                                            lValueOf = Long.valueOf(k7l0Var.v());
                                        } else {
                                            lValueOf = null;
                                        }
                                        ox0Var.put(strR3, lValueOf);
                                    } else if (k7l0Var.y()) {
                                        String strR4 = k7l0Var.r();
                                        if (k7l0Var.y()) {
                                            dValueOf = Double.valueOf(k7l0Var.z());
                                        } else {
                                            dValueOf = null;
                                        }
                                        ox0Var.put(strR4, dValueOf);
                                    } else if (k7l0Var.s()) {
                                        ox0Var.put(k7l0Var.r(), k7l0Var.t());
                                    } else {
                                        k8l0.m(y4l0Var);
                                        u4l0Var2.c(k4l0Var.a(strT), "Unknown value for param. event, param", k4l0Var.b(k7l0Var.r()));
                                    }
                                }
                            }
                        }
                    } else {
                        z1l0Var2 = (z1l0) it.next();
                        if (z1l0Var2.x().isEmpty()) {
                            k8l0.m(y4l0Var);
                            u4l0Var2.b(k4l0Var.a(strT), "null or empty param name in filter. event");
                        } else {
                            hashSet.add(z1l0Var2.x());
                        }
                    }
                }
            } else {
                bool = Boolean.FALSE;
            }
        }
        zQ = zQ;
        y4l0Var = y4l0Var;
        break;
        k8l0.m(y4l0Var);
        u4l0Var.b(bool == null ? "null" : bool, "Event filter result");
        if (bool == null) {
            return false;
        }
        Boolean bool2 = Boolean.TRUE;
        this.c = bool2;
        if (!bool.booleanValue()) {
            return true;
        }
        this.d = bool2;
        if (!z3 || !d7l0Var.u()) {
            return true;
        }
        Long lValueOf2 = Long.valueOf(d7l0Var.v());
        if (w1l0Var.z()) {
            if (zQ && w1l0Var.w()) {
                lValueOf2 = l;
            }
            this.f = lValueOf2;
            return true;
        }
        if (zQ && w1l0Var.w()) {
            lValueOf2 = l2;
        }
        this.e = lValueOf2;
        return true;
    }
}
