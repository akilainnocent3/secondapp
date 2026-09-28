package defpackage;

import com.sporty.android.core.model.loyalty.TierConfig;
import com.sporty.android.core.model.loyalty.UserTier;
import j$.util.DesugarTimeZone;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public final class jrf0 {
    public final dv0 a;
    public final eg50 b;
    public final DecimalFormat c;

    public jrf0(dv0 dv0Var, eg50 eg50Var) {
        dv0Var.getClass();
        this.a = dv0Var;
        this.b = eg50Var;
        this.c = new DecimalFormat("#.##");
    }

    public static float j(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        Object bVar;
        try {
            zi50.a aVar = zi50.b;
            float fFloatValue = bigDecimal.divide(bigDecimal2, 5, RoundingMode.HALF_UP).floatValue();
            if (fFloatValue > 1.0f) {
                fFloatValue = 1.0f;
            }
            bVar = Float.valueOf(fFloatValue);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (bVar instanceof zi50.b) {
            bVar = null;
        }
        Float f = (Float) bVar;
        if (f != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    public static BigDecimal k(long j) {
        BigDecimal bigDecimalDivide = new BigDecimal(j).divide(new BigDecimal(10000));
        bigDecimalDivide.getClass();
        return bigDecimalDivide;
    }

    public final v25 a(int i, float f) {
        float f2 = (i / 100.0f) + 1.0f;
        float f3 = f * f2;
        String strConcat = h(f).concat("%");
        Float fValueOf = Float.valueOf(f2);
        DecimalFormat decimalFormat = this.c;
        String str = decimalFormat.format(fValueOf);
        str.getClass();
        return new v25(strConcat, str, yk10.a(decimalFormat.format(Float.valueOf(f3)), "%"));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(uqf0 uqf0Var, boolean z, x1b x1bVar) {
        frf0 frf0Var;
        Long minMonthWager;
        BigDecimal bigDecimalK;
        BigDecimal bigDecimal;
        if (x1bVar instanceof frf0) {
            frf0Var = (frf0) x1bVar;
            int i = frf0Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                frf0Var.f = i - Integer.MIN_VALUE;
            } else {
                frf0Var = new frf0(this, x1bVar);
            }
        } else {
            frf0Var = new frf0(this, x1bVar);
        }
        Object obj = frf0Var.d;
        y5b y5bVar = y5b.a;
        int i2 = frf0Var.f;
        if (i2 == 0) {
            uj50.b(obj);
            krf0 krf0Var = uqf0Var.a;
            TierConfig tierConfig = uqf0Var.b;
            if (krf0Var.i) {
                return new crf0(null, null, null, 14);
            }
            if (z && (minMonthWager = tierConfig.getMinMonthWager()) != null) {
                bigDecimalK = k(minMonthWager.longValue());
                Long minLifeTimeWager = tierConfig.getMinLifeTimeWager();
                if (minLifeTimeWager != null) {
                    BigDecimal bigDecimalK2 = k(minLifeTimeWager.longValue());
                    String currency = tierConfig.getCurrency();
                    frf0Var.a = uqf0Var;
                    frf0Var.b = bigDecimalK;
                    frf0Var.c = bigDecimalK2;
                    frf0Var.f = 1;
                    Object objA = this.b.a(currency, frf0Var);
                    if (objA == y5bVar) {
                        return y5bVar;
                    }
                    obj = objA;
                    bigDecimal = bigDecimalK2;
                }
            }
            return null;
        }
        if (i2 != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        bigDecimal = frf0Var.c;
        BigDecimal bigDecimal2 = frf0Var.b;
        uqf0 uqf0Var2 = frf0Var.a;
        uj50.b(obj);
        bigDecimalK = bigDecimal2;
        uqf0Var = uqf0Var2;
        krf0 krf0Var2 = uqf0Var.a;
        String strM = bjb0.M(bigDecimalK);
        h430.a aVar = h430.a.a;
        return new crf0(new erf0(new tsf0(strM, aVar), new tsf0(bjb0.M(bigDecimal), aVar), (String) obj, krf0Var2, null), null, null, 13);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object c(uqf0 uqf0Var, UserTier userTier, boolean z, BigDecimal bigDecimal, krf0 krf0Var, List list, long j, x1b x1bVar) {
        grf0 grf0Var;
        List list2;
        long j2;
        uqf0 uqf0Var2 = uqf0Var;
        if (x1bVar instanceof grf0) {
            grf0Var = (grf0) x1bVar;
            int i = grf0Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                grf0Var.f = i - Integer.MIN_VALUE;
            } else {
                grf0Var = new grf0(this, x1bVar);
            }
        } else {
            grf0Var = new grf0(this, x1bVar);
        }
        grf0 grf0Var2 = grf0Var;
        Object objG = grf0Var2.d;
        y5b y5bVar = y5b.a;
        int i2 = grf0Var2.f;
        if (i2 == 0) {
            uj50.b(objG);
            krf0 krf0Var2 = uqf0Var2.a;
            grf0Var2.a = uqf0Var2;
            list2 = list;
            grf0Var2.b = list2;
            grf0Var2.c = j;
            grf0Var2.f = 1;
            objG = g(userTier, z, bigDecimal, krf0Var2, krf0Var, false, null, null, null, false, grf0Var2);
            if (objG == y5bVar) {
                return y5bVar;
            }
            j2 = j;
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j2 = grf0Var2.c;
            List list3 = grf0Var2.b;
            uqf0 uqf0Var3 = grf0Var2.a;
            uj50.b(objG);
            list2 = list3;
            uqf0Var2 = uqf0Var3;
        }
        wsf0 wsf0Var = (wsf0) objG;
        return new crf0(null, wsf0Var != null ? new drf0(wsf0Var) : null, e(uqf0Var2, list2, j2), 2);
    }

    public final ix30 d(uqf0 uqf0Var, List<bv0> list, long j) {
        u25 u25Var;
        Object next;
        uqf0Var.getClass();
        TierConfig tierConfig = uqf0Var.b;
        list.getClass();
        Iterator<T> it = list.iterator();
        do {
            u25Var = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((bv0) next).a != l25.RakeBack);
        bv0 bv0Var = (bv0) next;
        if (bv0Var != null) {
            int i = bv0Var.c;
            u25Var = new u25(a(i, tierConfig.getRealSport()), a(i, tierConfig.getInstantWin()), a(i, tierConfig.getGame()));
        }
        return new ix30(uqf0Var.a, h(tierConfig.getRealSport()), h(tierConfig.getInstantWin()), h(tierConfig.getGame()), this.a.a(j, list), u25Var);
    }

    public final ix30 e(uqf0 uqf0Var, List<bv0> list, long j) {
        u25 u25Var;
        Object next;
        Iterator<T> it = list.iterator();
        do {
            u25Var = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((bv0) next).a != l25.RakeBack);
        bv0 bv0Var = (bv0) next;
        if (bv0Var != null) {
            int i = bv0Var.c;
            TierConfig tierConfig = uqf0Var.b;
            u25Var = new u25(a(i, tierConfig.getRealSport()), a(i, tierConfig.getInstantWin()), a(i, tierConfig.getGame()));
        }
        krf0 krf0Var = uqf0Var.a;
        TierConfig tierConfig2 = uqf0Var.b;
        return new ix30(krf0Var, h(tierConfig2.getRealSport()), h(tierConfig2.getInstantWin()), h(tierConfig2.getGame()), this.a.a(j, list), u25Var);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:59:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:63:0x0202  */
    /* JADX WARN: Code duplicated, block: B:69:0x0215  */
    /* JADX WARN: Code duplicated, block: B:70:0x021a  */
    /* JADX WARN: Code duplicated, block: B:74:0x023b  */
    /* JADX WARN: Code duplicated, block: B:80:0x024e  */
    /* JADX WARN: Code duplicated, block: B:81:0x026e  */
    /* JADX WARN: Code duplicated, block: B:84:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:85:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Code duplicated, block: B:93:0x0210 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x0249 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r21v0, types: [jrf0] */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v10 */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v6, types: [jrf0] */
    /* JADX WARN: Type inference failed for: r9v7, types: [jrf0] */
    public final Object f(uqf0 uqf0Var, uqf0 uqf0Var2, UserTier userTier, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, boolean z, boolean z2, boolean z3, krf0 krf0Var, List list, long j, x1b x1bVar) {
        hrf0 hrf0Var;
        uqf0 uqf0Var3;
        boolean z4;
        List list2;
        ?? r12;
        BigDecimal bigDecimal4;
        ?? r22;
        float f;
        float f2;
        boolean z5;
        long j2;
        Object obj;
        BigDecimal bigDecimal5;
        UserTier userTier2;
        boolean z6;
        boolean z7;
        boolean z8;
        wsf0 wsf0Var;
        UserTier userTier3;
        uqf0 uqf0Var4;
        float f3;
        BigDecimal bigDecimal6;
        uqf0 uqf0Var5;
        List list3;
        float f4;
        BigDecimal bigDecimal7;
        ?? r9;
        boolean z9;
        boolean z10;
        boolean z11;
        dv0 dv0Var;
        Iterator it;
        Object next;
        bv0 bv0Var;
        ev0 ev0VarB;
        TierConfig tierConfig;
        Iterator it2;
        Object next2;
        bv0 bv0Var2;
        u25 u25Var;
        drf0 drf0Var;
        if (x1bVar instanceof hrf0) {
            hrf0Var = (hrf0) x1bVar;
            int i = hrf0Var.G;
            if ((i & Integer.MIN_VALUE) != 0) {
                hrf0Var.G = i - Integer.MIN_VALUE;
            } else {
                hrf0Var = new hrf0(this, x1bVar);
            }
        } else {
            hrf0Var = new hrf0(this, x1bVar);
        }
        hrf0 hrf0Var2 = hrf0Var;
        Object obj2 = hrf0Var2.E;
        y5b y5bVar = y5b.a;
        int i2 = hrf0Var2.G;
        if (i2 != 0) {
            if (i2 == 1) {
                int i3 = hrf0Var2.D;
                int i4 = hrf0Var2.C;
                float f5 = hrf0Var2.B;
                float f6 = hrf0Var2.A;
                j2 = hrf0Var2.z;
                z6 = hrf0Var2.y;
                z5 = hrf0Var2.w;
                boolean z12 = hrf0Var2.v;
                BigDecimal bigDecimal8 = hrf0Var2.f;
                BigDecimal bigDecimal9 = hrf0Var2.e;
                list2 = hrf0Var2.d;
                UserTier userTier4 = hrf0Var2.c;
                uqf0Var2 = hrf0Var2.b;
                uqf0 uqf0Var6 = hrf0Var2.a;
                uj50.b(obj2);
                obj = obj2;
                userTier2 = userTier4;
                r22 = i3;
                bigDecimal5 = bigDecimal8;
                uqf0Var3 = uqf0Var6;
                f = f6;
                bigDecimal4 = bigDecimal9;
                f2 = f5;
                z4 = z12;
                r12 = i4;
            } else {
                if (i2 != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                f3 = hrf0Var2.B;
                f4 = hrf0Var2.A;
                j2 = hrf0Var2.z;
                z8 = hrf0Var2.w;
                boolean z13 = hrf0Var2.v;
                wsf0Var = hrf0Var2.i;
                bigDecimal6 = hrf0Var2.f;
                bigDecimal7 = hrf0Var2.e;
                list3 = hrf0Var2.d;
                userTier3 = hrf0Var2.c;
                uqf0Var5 = hrf0Var2.b;
                uqf0Var4 = hrf0Var2.a;
                uj50.b(obj2);
                r9 = this;
                z7 = z13;
            }
            String str = (String) obj2;
            krf0 krf0Var2 = uqf0Var5.a;
            z9 = z7;
            String strM = bjb0.M(bigDecimal7);
            if (z9 && userTier3.isProbation()) {
                z10 = false;
            } else {
                z10 = true;
            }
            tsf0 tsf0Var = new tsf0(strM, new h430.b(f4, z10));
            String strM2 = bjb0.M(bigDecimal6);
            if (z8 && userTier3.isProbation()) {
                z11 = false;
            } else {
                z11 = true;
            }
            tsf0 tsf0Var2 = new tsf0(strM2, new h430.b(f3, z11));
            dv0Var = r9.a;
            dv0Var.getClass();
            list3.getClass();
            it = list3.iterator();
            do {
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((bv0) next).a != l25.Wager);
            bv0Var = (bv0) next;
            if (bv0Var != null) {
                ev0VarB = dv0Var.b(bv0Var, j2);
            } else {
                ev0VarB = null;
            }
            erf0 erf0Var = new erf0(tsf0Var, tsf0Var2, str, krf0Var2, ev0VarB);
            uqf0Var4.getClass();
            tierConfig = uqf0Var4.b;
            it2 = list3.iterator();
            do {
                if (it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (((bv0) next2).a != l25.RakeBack);
            bv0Var2 = (bv0) next2;
            if (bv0Var2 != null) {
                int i5 = bv0Var2.c;
                u25Var = new u25(r9.a(i5, tierConfig.getRealSport()), r9.a(i5, tierConfig.getInstantWin()), r9.a(i5, tierConfig.getGame()));
            } else {
                u25Var = null;
            }
            krf0 krf0Var3 = uqf0Var4.a;
            float realSport = tierConfig.getRealSport();
            TierConfig tierConfig2 = uqf0Var5.b;
            ix30 ix30Var = new ix30(krf0Var3, r9.i(realSport, tierConfig2.getRealSport()), r9.i(tierConfig.getInstantWin(), tierConfig2.getInstantWin()), r9.i(tierConfig.getGame(), tierConfig2.getGame()), dv0Var.a(j2, list3), u25Var);
            if (wsf0Var != null) {
                drf0Var = new drf0(wsf0Var);
            } else {
                drf0Var = null;
            }
            return new crf0(erf0Var, drf0Var, ix30Var, 1);
        }
        uj50.b(obj2);
        Long minMonthWager = uqf0Var2.b.getMinMonthWager();
        if (minMonthWager == null) {
            return new crf0(null, null, null, 15);
        }
        BigDecimal bigDecimalK = k(minMonthWager.longValue());
        Long minLifeTimeWager = uqf0Var2.b.getMinLifeTimeWager();
        if (minLifeTimeWager == null) {
            return new crf0(null, null, null, 15);
        }
        BigDecimal bigDecimalK2 = k(minLifeTimeWager.longValue());
        boolean ccfEnough = userTier.getCcfEnough();
        float fJ = j(bigDecimal, bigDecimalK);
        if (!ccfEnough) {
            fJ = Math.min(fJ, 0.95f);
        }
        float f7 = fJ;
        float fJ2 = j(bigDecimal2, bigDecimalK2);
        ?? r6 = (!userTier.getCcfEnough() || bigDecimal.compareTo(bigDecimalK) < 0 || bigDecimal2.compareTo(bigDecimalK2) < 0) ? 0 : 1;
        Boolean quickUpgradeEnabled = uqf0Var.b.getQuickUpgradeEnabled();
        ?? BooleanValue = quickUpgradeEnabled != null ? quickUpgradeEnabled.booleanValue() : 0;
        krf0 krf0Var4 = uqf0Var.a;
        krf0 krf0Var5 = uqf0Var2.a;
        hrf0Var2.a = uqf0Var;
        hrf0Var2.b = uqf0Var2;
        hrf0Var2.c = userTier;
        hrf0Var2.d = list;
        hrf0Var2.e = bigDecimalK;
        hrf0Var2.f = bigDecimalK2;
        hrf0Var2.v = z;
        hrf0Var2.w = z2;
        hrf0Var2.y = z3;
        hrf0Var2.z = j;
        hrf0Var2.A = f7;
        hrf0Var2.B = fJ2;
        hrf0Var2.C = r6;
        hrf0Var2.D = BooleanValue;
        hrf0Var2.G = 1;
        Object objG = g(userTier, z3, bigDecimal3, krf0Var4, krf0Var, r6, krf0Var5, bigDecimalK, bigDecimalK2, BooleanValue, hrf0Var2);
        if (objG == y5bVar) {
            return y5bVar;
        }
        uqf0Var3 = uqf0Var;
        z4 = z;
        list2 = list;
        r12 = r6;
        bigDecimal4 = bigDecimalK;
        r22 = BooleanValue;
        f = f7;
        f2 = fJ2;
        z5 = z2;
        j2 = j;
        obj = objG;
        bigDecimal5 = bigDecimalK2;
        userTier2 = userTier;
        z6 = z3;
        uqf0 uqf0Var7 = uqf0Var2;
        wsf0 wsf0Var2 = (wsf0) obj;
        ?? r18 = r12;
        String currency = uqf0Var7.b.getCurrency();
        hrf0Var2.a = uqf0Var3;
        hrf0Var2.b = uqf0Var7;
        hrf0Var2.c = userTier2;
        hrf0Var2.d = list2;
        hrf0Var2.e = bigDecimal4;
        hrf0Var2.f = bigDecimal5;
        hrf0Var2.i = wsf0Var2;
        hrf0Var2.v = z4;
        hrf0Var2.w = z5;
        hrf0Var2.y = z6;
        hrf0Var2.z = j2;
        hrf0Var2.A = f;
        hrf0Var2.B = f2;
        hrf0Var2.C = r18 == true ? 1 : 0;
        hrf0Var2.D = r22 == true ? 1 : 0;
        hrf0Var2.G = 2;
        ?? r10 = this;
        BigDecimal bigDecimal10 = bigDecimal4;
        Object objA = r10.b.a(currency, hrf0Var2);
        if (objA == y5bVar) {
            return y5bVar;
        }
        UserTier userTier5 = userTier2;
        obj2 = objA;
        z7 = z4;
        z8 = z5;
        wsf0Var = wsf0Var2;
        userTier3 = userTier5;
        uqf0Var4 = uqf0Var3;
        f3 = f2;
        bigDecimal6 = bigDecimal5;
        uqf0Var5 = uqf0Var7;
        list3 = list2;
        f4 = f;
        bigDecimal7 = bigDecimal10;
        r9 = r10;
        String str2 = (String) obj2;
        krf0 krf0Var6 = uqf0Var5.a;
        z9 = z7;
        String strM3 = bjb0.M(bigDecimal7);
        if (z9) {
            z10 = true;
        } else {
            z10 = true;
        }
        tsf0 tsf0Var3 = new tsf0(strM3, new h430.b(f4, z10));
        String strM4 = bjb0.M(bigDecimal6);
        if (z8) {
            z11 = true;
        } else {
            z11 = true;
        }
        tsf0 tsf0Var4 = new tsf0(strM4, new h430.b(f3, z11));
        dv0Var = r9.a;
        dv0Var.getClass();
        list3.getClass();
        it = list3.iterator();
        do {
            if (it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((bv0) next).a != l25.Wager);
        bv0Var = (bv0) next;
        if (bv0Var != null) {
            ev0VarB = dv0Var.b(bv0Var, j2);
        } else {
            ev0VarB = null;
        }
        erf0 erf0Var2 = new erf0(tsf0Var3, tsf0Var4, str2, krf0Var6, ev0VarB);
        uqf0Var4.getClass();
        tierConfig = uqf0Var4.b;
        it2 = list3.iterator();
        do {
            if (it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (((bv0) next2).a != l25.RakeBack);
        bv0Var2 = (bv0) next2;
        if (bv0Var2 != null) {
            int i6 = bv0Var2.c;
            u25Var = new u25(r9.a(i6, tierConfig.getRealSport()), r9.a(i6, tierConfig.getInstantWin()), r9.a(i6, tierConfig.getGame()));
        } else {
            u25Var = null;
        }
        krf0 krf0Var7 = uqf0Var4.a;
        float realSport2 = tierConfig.getRealSport();
        TierConfig tierConfig3 = uqf0Var5.b;
        ix30 ix30Var2 = new ix30(krf0Var7, r9.i(realSport2, tierConfig3.getRealSport()), r9.i(tierConfig.getInstantWin(), tierConfig3.getInstantWin()), r9.i(tierConfig.getGame(), tierConfig3.getGame()), dv0Var.a(j2, list3), u25Var);
        if (wsf0Var != null) {
            drf0Var = new drf0(wsf0Var);
        } else {
            drf0Var = null;
        }
        return new crf0(erf0Var2, drf0Var, ix30Var2, 1);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public final Object g(UserTier userTier, boolean z, BigDecimal bigDecimal, krf0 krf0Var, krf0 krf0Var2, boolean z2, krf0 krf0Var3, BigDecimal bigDecimal2, BigDecimal bigDecimal3, boolean z3, x1b x1bVar) {
        irf0 irf0Var;
        Date time;
        boolean z4;
        BigDecimal bigDecimal4;
        String str;
        BigDecimal bigDecimal5;
        krf0 krf0Var4;
        krf0 krf0Var5;
        Object obj;
        String str2;
        String strM;
        krf0 krf0Var6 = krf0Var3;
        BigDecimal bigDecimal6 = bigDecimal3;
        if (x1bVar instanceof irf0) {
            irf0Var = (irf0) x1bVar;
            int i = irf0Var.z;
            if ((i & Integer.MIN_VALUE) != 0) {
                irf0Var.z = i - Integer.MIN_VALUE;
            } else {
                irf0Var = new irf0(this, x1bVar);
            }
        } else {
            irf0Var = new irf0(this, x1bVar);
        }
        Object obj2 = irf0Var.w;
        y5b y5bVar = y5b.a;
        int i2 = irf0Var.z;
        if (i2 != 0) {
            if (i2 == 1) {
                str2 = irf0Var.f;
                krf0 krf0Var7 = irf0Var.c;
                krf0 krf0Var8 = irf0Var.b;
                bigDecimal5 = irf0Var.a;
                uj50.b(obj2);
                krf0Var5 = krf0Var7;
                obj = obj2;
                krf0Var4 = krf0Var8;
                String str3 = (String) obj;
                if (bigDecimal5 != null) {
                    strM = bjb0.M(bigDecimal5);
                } else {
                    strM = "";
                }
                return new wsf0.a(str2, str3, strM, krf0Var4, krf0Var5);
            }
            if (i2 != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z4 = irf0Var.v;
            krf0Var6 = irf0Var.i;
            str = irf0Var.f;
            bigDecimal6 = irf0Var.e;
            bigDecimal4 = irf0Var.d;
            uj50.b(obj2);
            String string = bigDecimal4.toString();
            string.getClass();
            String string2 = bigDecimal6.toString();
            string2.getClass();
            return new wsf0.b(str, krf0Var6, (String) obj2, string, string2, z4);
        }
        uj50.b(obj2);
        Long nextUpgradeTime = userTier.getNextUpgradeTime();
        if (nextUpgradeTime != null) {
            time = new Date(nextUpgradeTime.longValue());
        } else {
            Calendar calendar = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
            calendar.add(2, 1);
            calendar.set(5, 1);
            time = calendar.getTime();
            time.getClass();
        }
        Locale locale = Locale.ENGLISH;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMM", locale);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        String str4 = simpleDateFormat.format(time);
        str4.getClass();
        if (userTier.getProcessing()) {
            return wsf0.c.a;
        }
        eg50 eg50Var = this.b;
        if (z) {
            Calendar calendar2 = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
            calendar2.add(2, 1);
            calendar2.set(5, 1);
            Date time2 = calendar2.getTime();
            time2.getClass();
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd MMM", locale);
            simpleDateFormat2.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
            String str5 = simpleDateFormat2.format(time2);
            str5.getClass();
            String currency = userTier.getCurrency();
            bigDecimal5 = bigDecimal;
            irf0Var.a = bigDecimal5;
            krf0Var4 = krf0Var;
            irf0Var.b = krf0Var4;
            krf0Var5 = krf0Var2;
            irf0Var.c = krf0Var5;
            irf0Var.d = null;
            irf0Var.e = null;
            irf0Var.f = str5;
            irf0Var.v = z3;
            irf0Var.z = 1;
            Object objA = eg50Var.a(currency, irf0Var);
            if (objA != y5bVar) {
                obj = objA;
                str2 = str5;
                String str6 = (String) obj;
                if (bigDecimal5 != null) {
                    strM = bjb0.M(bigDecimal5);
                } else {
                    strM = "";
                }
                return new wsf0.a(str2, str6, strM, krf0Var4, krf0Var5);
            }
        } else {
            if (z2) {
                return new wsf0.d(str4);
            }
            if (krf0Var6 == null || bigDecimal2 == null || bigDecimal6 == null) {
                return null;
            }
            String currency2 = userTier.getCurrency();
            irf0Var.a = null;
            irf0Var.b = null;
            irf0Var.c = null;
            irf0Var.d = bigDecimal2;
            irf0Var.e = bigDecimal6;
            irf0Var.f = str4;
            irf0Var.i = krf0Var6;
            irf0Var.v = z3;
            irf0Var.z = 2;
            Object objA2 = eg50Var.a(currency2, irf0Var);
            if (objA2 != y5bVar) {
                obj2 = objA2;
                z4 = z3;
                bigDecimal4 = bigDecimal2;
                str = str4;
                String string3 = bigDecimal4.toString();
                string3.getClass();
                String string4 = bigDecimal6.toString();
                string4.getClass();
                return new wsf0.b(str, krf0Var6, (String) obj2, string3, string4, z4);
            }
        }
        return y5bVar;
    }

    public final String h(float f) {
        String str = this.c.format(Float.valueOf(f));
        str.getClass();
        return str;
    }

    public final String i(float f, float f2) {
        return lx5.a(h(f), "% -> ^", h(f2), "%^");
    }
}
