package defpackage;

import com.sporty.android.core.model.json.JsonSerializeService;
import com.sporty.android.core.model.luckywheel.TicketInfo;
import com.sporty.android.core.model.welcomereward.NonFtdEngagement;
import com.sporty.android.core.model.welcomereward.NonFtdRewardType;
import com.sporty.android.core.model.welcomereward.NonFtdTaskType;
import com.sporty.android.core.model.welcomereward.UiConfig;
import com.sporty.android.core.model.welcomereward.WelcomeRewardTimingConfig;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lw4j0;", "Lj8i0;", "Lfjt;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class w4j0 extends j8i0 implements fjt {
    public final ku90<Boolean> A;
    public final t340 B;
    public final wwd0 C;
    public final yl50 D;
    public final v340 E;
    public final v340 F;
    public final ku90<Boolean> G;
    public final t340 H;
    public final ku90<k4j0> I;
    public final t340 J;
    public wae K;
    public final rxx a;
    public final w1j0 b;
    public final mgb0 c;
    public final JsonSerializeService d;
    public final rdd0 e;
    public final psm f;
    public final x9k i;
    public final wbu v;
    public final lyz w;
    public final n4j0 y;
    public jvd0 z;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[NonFtdRewardType.values().length];
            try {
                iArr[NonFtdRewardType.LOYALTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NonFtdRewardType.LUCKY_WHEEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NonFtdRewardType.LOYALTY_MISSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NonFtdRewardType.LIVE_STREAM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
            int[] iArr2 = new int[NonFtdTaskType.values().length];
            try {
                iArr2[NonFtdTaskType.REGISTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[NonFtdTaskType.KYC.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[NonFtdTaskType.FIRST_TIME_DEPOSIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            b = iArr2;
        }
    }

    public w4j0(rxx rxxVar, w1j0 w1j0Var, mgb0 mgb0Var, JsonSerializeService jsonSerializeService, rdd0 rdd0Var, psm psmVar, x9k x9kVar, wbu wbuVar, lyz lyzVar, n4j0 n4j0Var, y1k0 y1k0Var, uqm uqmVar, yqm yqmVar) {
        rxxVar.getClass();
        w1j0Var.getClass();
        mgb0Var.getClass();
        jsonSerializeService.getClass();
        rdd0Var.getClass();
        psmVar.getClass();
        lyzVar.getClass();
        n4j0Var.getClass();
        y1k0Var.getClass();
        uqmVar.getClass();
        yqmVar.getClass();
        this.a = rxxVar;
        this.b = w1j0Var;
        this.c = mgb0Var;
        this.d = jsonSerializeService;
        this.e = rdd0Var;
        this.f = psmVar;
        this.i = x9kVar;
        this.v = wbuVar;
        this.w = lyzVar;
        this.y = n4j0Var;
        ku90<Boolean> ku90Var = new ku90<>();
        this.A = ku90Var;
        this.B = e1i.a(ku90Var);
        wwd0 wwd0VarA = xwd0.a(Boolean.FALSE);
        this.C = wwd0VarA;
        this.D = new yl50(new sl50(yqmVar.j(z76.c)), i4j0.Hidden);
        this.E = e1i.e(r0i.f(r1i.a(x9kVar.a(), wwd0VarA, y1k0Var.getState(), new u5j0(4, null)), new o5j0(null, this)), o8i0.d(this), new mwd0(0L, Long.MAX_VALUE), new q1j0(0));
        this.F = e1i.e(r1i.b(x9kVar.a(), mgb0Var.getUserCertStatusFlow(), mgb0Var.getDocumentAuditStatusFlow(), w1j0Var.h.a(w1j0Var, w1j0.i[6]).d(""), new x5j0(null, this)), o8i0.d(this), q490.a.a, r4j0.a.a);
        ku90<Boolean> ku90Var2 = new ku90<>();
        this.G = ku90Var2;
        this.H = e1i.a(ku90Var2);
        ku90<k4j0> ku90Var3 = new ku90<>();
        this.I = ku90Var3;
        this.J = e1i.a(ku90Var3);
        uqmVar.addLogoutEventListener(this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f0, code lost:
    
        if (C1(r0, r15, r4, r2) == r3) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A1(java.lang.String r20, long r21, java.util.List r23, defpackage.x1b r24) {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w4j0.A1(java.lang.String, long, java.util.List, x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Enum B1(int i, x1b x1bVar) {
        n5j0 n5j0Var;
        if (x1bVar instanceof n5j0) {
            n5j0Var = (n5j0) x1bVar;
            int i2 = n5j0Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                n5j0Var.c = i2 - Integer.MIN_VALUE;
            } else {
                n5j0Var = new n5j0(this, x1bVar);
            }
        } else {
            n5j0Var = new n5j0(this, x1bVar);
        }
        Object objA = n5j0Var.a;
        y5b y5bVar = y5b.a;
        int i3 = n5j0Var.c;
        if (i3 == 0) {
            uj50.b(objA);
            sl50 sl50Var = new sl50(this.v.a(i));
            n5j0Var.c = 1;
            objA = s0i.a(sl50Var, n5j0Var);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objA);
        }
        lk50 lk50Var = (lk50) objA;
        return (!(lk50Var instanceof lk50.c) || ((TicketInfo) ((lk50.c) lk50Var).a).getTicketNum() <= 0) ? wae.ME_GIFTS : wae.LUCKY_WHEEL;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object C1(wm20 wm20Var, String str, Function1 function1, x1b x1bVar) {
        q5j0 q5j0Var;
        String str2;
        Object obj;
        wm20 wm20Var2;
        w4j0 w4j0Var;
        Object bVar;
        if (x1bVar instanceof q5j0) {
            q5j0Var = (q5j0) x1bVar;
            int i = q5j0Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                q5j0Var.v = i - Integer.MIN_VALUE;
            } else {
                q5j0Var = new q5j0(this, x1bVar);
            }
        } else {
            q5j0Var = new q5j0(this, x1bVar);
        }
        Object obj2 = q5j0Var.f;
        y5b y5bVar = y5b.a;
        int i2 = q5j0Var.v;
        if (i2 == 0) {
            uj50.b(obj2);
            o2g o2gVar = o2g.a;
            o2gVar.getClass();
            q5j0Var.a = wm20Var;
            q5j0Var.b = str;
            q5j0Var.c = function1;
            q5j0Var.d = o2gVar;
            q5j0Var.e = this;
            q5j0Var.v = 1;
            Object objE = wm20Var.e(q5j0Var, "");
            if (objE != y5bVar) {
                str2 = str;
                obj = o2gVar;
                obj2 = objE;
                wm20Var2 = wm20Var;
                w4j0Var = this;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                uj50.b(obj2);
                return obj2;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        w4j0Var = q5j0Var.e;
        obj = q5j0Var.d;
        function1 = q5j0Var.c;
        str2 = q5j0Var.b;
        wm20Var2 = q5j0Var.a;
        uj50.b(obj2);
        String str3 = (String) obj2;
        if (!StringsKt.U(str3)) {
            try {
                zi50.a aVar = zi50.b;
                bVar = w4j0Var.d.fromJson(str3, new p5j0().getType());
            } catch (Throwable th) {
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
            if (bVar instanceof zi50.b) {
                bVar = null;
            }
            if (bVar != null) {
                obj = bVar;
            }
        }
        Map map = (Map) obj;
        LinkedHashMap linkedHashMapM = kpu.m(map);
        linkedHashMapM.put(str2, function1.invoke(map.get(str2)));
        q5j0Var.a = null;
        q5j0Var.b = null;
        q5j0Var.c = null;
        q5j0Var.d = null;
        q5j0Var.e = null;
        q5j0Var.v = 2;
        String json = this.d.toJson(linkedHashMapM);
        json.getClass();
        Object objG = wm20Var2.g(q5j0Var, json);
        return objG == y5bVar ? y5bVar : objG;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00da  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:58:0x0101  */
    /* JADX WARN: Code duplicated, block: B:62:0x0110  */
    /* JADX WARN: Code duplicated, block: B:65:0x0124  */
    /* JADX WARN: Code duplicated, block: B:70:0x0138  */
    /* JADX WARN: Code duplicated, block: B:71:0x015d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0162 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:75:0x0163  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:81:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:? A[LOOP:0: B:50:0x00e6->B:83:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:? A[LOOP:1: B:63:0x011e->B:86:?, LOOP_END, SYNTHETIC] */
    public final Object D1(NonFtdEngagement nonFtdEngagement, x1b x1bVar) {
        s5j0 s5j0Var;
        List<Boolean> popupAfterRegistrationEnabled;
        List<Boolean> list;
        w4j0 w4j0Var;
        Object obj;
        Object bVar;
        Map map;
        List<Boolean> list2;
        String str;
        Integer num;
        int iIntValue;
        ListIterator<Boolean> listIterator;
        int iNextIndex;
        boolean z;
        ListIterator<Boolean> listIterator2;
        int iNextIndex2;
        Object objG;
        if (x1bVar instanceof s5j0) {
            s5j0Var = (s5j0) x1bVar;
            int i = s5j0Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                s5j0Var.i = i - Integer.MIN_VALUE;
            } else {
                s5j0Var = new s5j0(this, x1bVar);
            }
        } else {
            s5j0Var = new s5j0(this, x1bVar);
        }
        Object objE = s5j0Var.e;
        y5b y5bVar = y5b.a;
        int i2 = s5j0Var.i;
        w1j0 w1j0Var = this.b;
        if (i2 == 0) {
            uj50.b(objE);
            UiConfig uiConfig = nonFtdEngagement.getUiConfig();
            if (uiConfig == null || (popupAfterRegistrationEnabled = uiConfig.getPopupAfterRegistrationEnabled()) == null) {
                return Unit.a;
            }
            wm20 wm20VarA = w1j0Var.f.a(w1j0Var, w1j0.i[4]);
            o2g o2gVar = o2g.a;
            o2gVar.getClass();
            s5j0Var.a = popupAfterRegistrationEnabled;
            s5j0Var.b = null;
            s5j0Var.c = o2gVar;
            s5j0Var.d = this;
            s5j0Var.i = 1;
            objE = wm20VarA.e(s5j0Var, "");
            if (objE != y5bVar) {
                list = popupAfterRegistrationEnabled;
                w4j0Var = this;
                obj = o2gVar;
            }
            return y5bVar;
        }
        if (i2 == 1) {
            w4j0Var = s5j0Var.d;
            o2g o2gVar2 = s5j0Var.c;
            list = s5j0Var.a;
            uj50.b(objE);
            obj = o2gVar2;
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    uj50.b(objE);
                    return objE;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            map = s5j0Var.b;
            list2 = s5j0Var.a;
            uj50.b(objE);
        }
        str = (String) objE;
        num = (Integer) map.get(str);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        list2.getClass();
        listIterator = list2.listIterator(list2.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            if (listIterator.previous().booleanValue()) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        z = iNextIndex == -1 && iNextIndex > iIntValue;
        this.A.a(Boolean.valueOf(z));
        if (z) {
            return Unit.a;
        }
        s5j0Var.a = null;
        s5j0Var.b = null;
        s5j0Var.i = 3;
        listIterator2 = list2.listIterator(list2.size());
        while (true) {
            if (listIterator2.hasPrevious()) {
                iNextIndex2 = -1;
                break;
            }
            if (listIterator2.previous().booleanValue()) {
                iNextIndex2 = listIterator2.nextIndex();
                break;
            }
        }
        if (iNextIndex2 != -1) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.put(str, new Integer(iNextIndex2));
            wm20 wm20VarA2 = w1j0Var.f.a(w1j0Var, w1j0.i[4]);
            String json = this.d.toJson(linkedHashMap);
            json.getClass();
            objG = wm20VarA2.g(s5j0Var, json);
        } else {
            objG = Unit.a;
        }
        if (objG != y5bVar) {
            return y5bVar;
        }
        return objG;
        String str2 = (String) objE;
        if (!StringsKt.U(str2)) {
            try {
                zi50.a aVar = zi50.b;
                bVar = w4j0Var.d.fromJson(str2, new r5j0().getType());
            } catch (Throwable th) {
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
            if (bVar instanceof zi50.b) {
                bVar = null;
            }
            if (bVar != null) {
                obj = bVar;
            }
        }
        map = (Map) obj;
        s5j0Var.a = list;
        s5j0Var.b = map;
        s5j0Var.c = null;
        s5j0Var.d = null;
        s5j0Var.i = 2;
        objE = this.c.getUserId(s5j0Var);
        if (objE != y5bVar) {
            list2 = list;
            str = (String) objE;
            num = (Integer) map.get(str);
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = -1;
            }
            list2.getClass();
            listIterator = list2.listIterator(list2.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    iNextIndex = -1;
                    break;
                }
                if (listIterator.previous().booleanValue()) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            }
            if (iNextIndex == -1) {
            }
            this.A.a(Boolean.valueOf(z));
            if (z) {
                return Unit.a;
            }
            s5j0Var.a = null;
            s5j0Var.b = null;
            s5j0Var.i = 3;
            listIterator2 = list2.listIterator(list2.size());
            while (true) {
                if (listIterator2.hasPrevious()) {
                    iNextIndex2 = -1;
                    break;
                }
                if (listIterator2.previous().booleanValue()) {
                    iNextIndex2 = listIterator2.nextIndex();
                    break;
                }
            }
            if (iNextIndex2 != -1) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(map);
                linkedHashMap2.put(str, new Integer(iNextIndex2));
                wm20 wm20VarA3 = w1j0Var.f.a(w1j0Var, w1j0.i[4]);
                String json2 = this.d.toJson(linkedHashMap2);
                json2.getClass();
                objG = wm20VarA3.g(s5j0Var, json2);
            } else {
                objG = Unit.a;
            }
            if (objG != y5bVar) {
                return objG;
            }
        }
        return y5bVar;
    }

    @Override // defpackage.fjt
    public final void p() {
        Boolean bool = Boolean.FALSE;
        wwd0 wwd0Var = this.C;
        wwd0Var.getClass();
        wwd0Var.k(null, bool);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object x1(x1b x1bVar) {
        b5j0 b5j0Var;
        WelcomeRewardTimingConfig welcomeRewardTimingConfig;
        Object bVar;
        if (x1bVar instanceof b5j0) {
            b5j0Var = (b5j0) x1bVar;
            int i = b5j0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                b5j0Var.e = i - Integer.MIN_VALUE;
            } else {
                b5j0Var = new b5j0(this, x1bVar);
            }
        } else {
            b5j0Var = new b5j0(this, x1bVar);
        }
        Object objE = b5j0Var.c;
        y5b y5bVar = y5b.a;
        int i2 = b5j0Var.e;
        if (i2 == 0) {
            uj50.b(objE);
            w1j0 w1j0Var = this.b;
            wm20 wm20VarA = w1j0Var.d.a(w1j0Var, w1j0.i[2]);
            welcomeRewardTimingConfig = new WelcomeRewardTimingConfig(0, 0, 0, 7, (DefaultConstructorMarker) null);
            b5j0Var.a = welcomeRewardTimingConfig;
            b5j0Var.b = this;
            b5j0Var.e = 1;
            objE = wm20VarA.e(b5j0Var, "");
            if (objE == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = b5j0Var.b;
            WelcomeRewardTimingConfig welcomeRewardTimingConfig2 = b5j0Var.a;
            uj50.b(objE);
            welcomeRewardTimingConfig = welcomeRewardTimingConfig2;
        }
        String str = (String) objE;
        if (StringsKt.U(str)) {
            return welcomeRewardTimingConfig;
        }
        try {
            zi50.a aVar = zi50.b;
            bVar = this.d.fromJson(str, new a5j0().getType());
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        Object obj = bVar instanceof zi50.b ? null : bVar;
        return obj == null ? welcomeRewardTimingConfig : obj;
    }

    public final void y1() {
        rxx rxxVar = this.a;
        ej5.c(rxxVar.c, null, null, new qxx(rxxVar, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:61:0x014b  */
    /* JADX WARN: Code duplicated, block: B:63:0x016f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:64:0x0170 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:65:0x0171  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ed, code lost:
    
        if (C1(r0, r15, r4, r2) == r3) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z1(long r20, defpackage.x1b r22, java.lang.String r23) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w4j0.z1(long, x1b, java.lang.String):java.lang.Object");
    }
}
