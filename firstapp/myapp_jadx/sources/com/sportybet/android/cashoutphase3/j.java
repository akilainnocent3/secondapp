package com.sportybet.android.cashoutphase3;

import com.sporty.android.common.network.data.SprDataThrowable;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.OrderBetType;
import com.sporty.android.core.model.cashout.CashOutFallbackData;
import com.sporty.android.core.model.cashout.CashOutInfo;
import com.sporty.android.core.model.cashout.CashOutResponse;
import com.sporty.android.core.model.cashout.FallbackQuota;
import com.sporty.android.core.model.cashout.FallbackUserCashOutQuota;
import com.sportybet.android.cashoutphase3.h;
import com.sportybet.ntespm.socket.MultiTopic;
import defpackage.bq40;
import defpackage.c0d;
import defpackage.ej5;
import defpackage.lk50;
import defpackage.o8i0;
import defpackage.pl6;
import defpackage.pm6;
import defpackage.ro6;
import defpackage.sm6;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.wp6;
import defpackage.y5b;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.text.b;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.cashoutphase3.CashOutViewModel$doInstantCashout$1", f = "CashOutViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class j extends tje0 implements Function2<lk50<? extends CashOutResponse>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ int b;
    public final /* synthetic */ pl6 c;
    public final /* synthetic */ h d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;

    @c0d(c = "com.sportybet.android.cashoutphase3.CashOutViewModel$doInstantCashout$1$1", f = "CashOutViewModel.kt", l = {843, 859}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ h A;
        public final /* synthetic */ pl6 B;
        public final /* synthetic */ String C;
        public final /* synthetic */ String D;
        public final /* synthetic */ bq40 E;
        public int a;
        public int b;
        public int c;
        public int d;
        public String e;
        public String f;
        public String i;
        public int v;
        public final /* synthetic */ boolean w;
        public final /* synthetic */ boolean y;
        public final /* synthetic */ boolean z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z, boolean z2, boolean z3, h hVar, pl6 pl6Var, String str, String str2, bq40 bq40Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.w = z;
            this.y = z2;
            this.z = z3;
            this.A = hVar;
            this.B = pl6Var;
            this.C = str;
            this.D = str2;
            this.E = bq40Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.w, this.y, this.z, this.A, this.B, this.C, this.D, this.E, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:83:0x0186, code lost:
        
            if (r1.a.emit(r2, r28) == r3) goto L84;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r29) {
            /*
                Method dump skipped, instruction units count: 400
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sportybet.android.cashoutphase3.j.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(int i, pl6 pl6Var, h hVar, String str, String str2, v1b<? super j> v1bVar) {
        super(2, v1bVar);
        this.b = i;
        this.c = pl6Var;
        this.d = hVar;
        this.e = str;
        this.f = str2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        j jVar = new j(this.b, this.c, this.d, this.e, this.f, v1bVar);
        jVar.a = obj;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends CashOutResponse> lk50Var, v1b<? super Unit> v1bVar) {
        return ((j) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean z = lk50Var instanceof lk50.c;
        pl6 pl6Var = this.c;
        final h hVar = this.d;
        if (z) {
            CashOutResponse cashOutResponse = (CashOutResponse) ((lk50.c) lk50Var).a;
            bq40 bq40Var = new bq40();
            bq40Var.a = cashOutResponse.remainCount;
            boolean z2 = this.b == 1000000;
            if (z2) {
                bq40Var.a = -1;
            }
            ej5.c(o8i0.d(hVar), null, null, new a(hVar.O.length() > 0, z2, pl6Var.a.type == OrderBetType.SINGLE.getValue(), hVar, pl6Var, this.e, this.f, bq40Var, null), 3);
            hVar.c.g();
            wp6 wp6Var = hVar.v;
            String str = pl6Var.a.id;
            str.getClass();
            wp6Var.c(str);
            String str2 = pl6Var.a.id;
            str2.getClass();
            hVar.I1(str2);
        } else if (lk50Var instanceof lk50.a) {
            lk50.a aVar = (lk50.a) lk50Var;
            final Throwable th = aVar.a;
            UiText uiText = aVar.b;
            if (th instanceof SprDataThrowable) {
                SprDataThrowable sprDataThrowable = (SprDataThrowable) th;
                int i = sprDataThrowable.d;
                if (i != 32000) {
                    switch (i) {
                        case 33001:
                        case 33003:
                            String str3 = pl6Var.a.id;
                            str3.getClass();
                            hVar.A1(new com.sportybet.android.cashoutphase3.a.c.b(str3));
                            break;
                        case 33002:
                            hVar.A1(new com.sportybet.android.cashoutphase3.a.c.e(pl6Var));
                            break;
                        case 33004:
                            hVar.A1(new com.sportybet.android.cashoutphase3.a.c.C0223c(pl6Var, sprDataThrowable.e));
                            break;
                        default:
                            switch (i) {
                                case 34010:
                                case 34011:
                                case 34012:
                                case 34013:
                                case 34014:
                                    hVar.A1(new com.sportybet.android.cashoutphase3.a.c.d(th));
                                    final String str4 = pl6Var.a.id;
                                    str4.getClass();
                                    ej5.c(o8i0.d(hVar), null, null, new ro6(new Function0() { // from class: rn6
                                        /* JADX WARN: Code duplicated, block: B:70:0x012f A[Catch: all -> 0x012d, TryCatch #1 {all -> 0x012d, blocks: (B:43:0x00df, B:45:0x00e7, B:47:0x00ed, B:49:0x00f3, B:51:0x00f9, B:53:0x0103, B:55:0x010d, B:67:0x0129, B:71:0x0132, B:70:0x012f), top: B:89:0x00df, outer: #0 }] */
                                        /* JADX WARN: Code duplicated, block: B:77:0x0163 A[Catch: Exception -> 0x00bc, TryCatch #0 {Exception -> 0x00bc, blocks: (B:3:0x0038, B:5:0x003e, B:8:0x0046, B:10:0x004e, B:14:0x005a, B:16:0x0060, B:20:0x0069, B:22:0x006f, B:27:0x007b, B:28:0x0088, B:30:0x008e, B:32:0x00a0, B:34:0x00a6, B:36:0x00b0, B:39:0x00bf, B:40:0x00c7, B:42:0x00cd, B:74:0x013d, B:76:0x0143, B:73:0x0135, B:77:0x0163, B:78:0x016d, B:80:0x0173, B:43:0x00df, B:45:0x00e7, B:47:0x00ed, B:49:0x00f3, B:51:0x00f9, B:53:0x0103, B:55:0x010d, B:67:0x0129, B:71:0x0132, B:70:0x012f), top: B:88:0x0038, inners: #1 }] */
                                        /* JADX WARN: Code duplicated, block: B:80:0x0173 A[Catch: Exception -> 0x00bc, LOOP:2: B:78:0x016d->B:80:0x0173, LOOP_END, TRY_LEAVE, TryCatch #0 {Exception -> 0x00bc, blocks: (B:3:0x0038, B:5:0x003e, B:8:0x0046, B:10:0x004e, B:14:0x005a, B:16:0x0060, B:20:0x0069, B:22:0x006f, B:27:0x007b, B:28:0x0088, B:30:0x008e, B:32:0x00a0, B:34:0x00a6, B:36:0x00b0, B:39:0x00bf, B:40:0x00c7, B:42:0x00cd, B:74:0x013d, B:76:0x0143, B:73:0x0135, B:77:0x0163, B:78:0x016d, B:80:0x0173, B:43:0x00df, B:45:0x00e7, B:47:0x00ed, B:49:0x00f3, B:51:0x00f9, B:53:0x0103, B:55:0x010d, B:67:0x0129, B:71:0x0132, B:70:0x012f), top: B:88:0x0038, inners: #1 }] */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Iterator it;
                                            Object bVar;
                                            Double dH;
                                            h hVar2 = hVar;
                                            yi6 yi6Var = hVar2.z;
                                            LinkedHashMap linkedHashMap = hVar2.c0;
                                            CashOutFallbackData cashOutFallbackData = (CashOutFallbackData) hVar2.r0.a.getValue();
                                            eo6 eo6Var = new eo6(1, hVar2, h.class, "markUnavailableAndStopTimer", "markUnavailableAndStopTimer(Ljava/lang/String;)V", 0);
                                            fo6 fo6Var = new fo6(1, hVar2, h.class, "startFallbackTimer", "startFallbackTimer(Lcom/sporty/android/core/model/cashout/CashOutInfo;)V", 0);
                                            yi6Var.getClass();
                                            linkedHashMap.getClass();
                                            cashOutFallbackData.getClass();
                                            try {
                                                Boolean ccfBlocked = cashOutFallbackData.getCcfBlocked();
                                                if (ccfBlocked != null ? ccfBlocked.booleanValue() : false) {
                                                    it = linkedHashMap.keySet().iterator();
                                                    while (it.hasNext()) {
                                                        eo6Var.invoke((String) it.next());
                                                    }
                                                } else {
                                                    FallbackUserCashOutQuota userCashOutQuota = cashOutFallbackData.getUserCashOutQuota();
                                                    if ((userCashOutQuota != null ? userCashOutQuota.getQuota() : 0.0d) < 1.0d) {
                                                        it = linkedHashMap.keySet().iterator();
                                                        while (it.hasNext()) {
                                                            eo6Var.invoke((String) it.next());
                                                        }
                                                    } else {
                                                        FallbackUserCashOutQuota userCashOutQuota2 = cashOutFallbackData.getUserCashOutQuota();
                                                        if ((userCashOutQuota2 != null ? userCashOutQuota2.getCashoutCountQuota() : 0) < 1) {
                                                            it = linkedHashMap.keySet().iterator();
                                                            while (it.hasNext()) {
                                                                eo6Var.invoke((String) it.next());
                                                            }
                                                        } else {
                                                            FallbackQuota globalCashOutQuota = cashOutFallbackData.getGlobalCashOutQuota();
                                                            if ((globalCashOutQuota != null ? globalCashOutQuota.getQuota() : 0.0d) < 1.0d) {
                                                                it = linkedHashMap.keySet().iterator();
                                                                while (it.hasNext()) {
                                                                    eo6Var.invoke((String) it.next());
                                                                }
                                                            } else {
                                                                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                                                for (Map.Entry entry : linkedHashMap.entrySet()) {
                                                                    CashOutInfo cashOutInfo = (CashOutInfo) entry.getValue();
                                                                    if (cashOutInfo.isCashAble() && cashOutInfo.isFallbackCashOut() && yi6Var.a.d().n) {
                                                                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                                                                    }
                                                                }
                                                                for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                                                                    String str5 = (String) entry2.getKey();
                                                                    CashOutInfo cashOutInfo2 = (CashOutInfo) entry2.getValue();
                                                                    try {
                                                                        zi50.a aVar2 = zi50.b;
                                                                        String maxCashOutAmount = cashOutInfo2.getMaxCashOutAmount();
                                                                        double dDoubleValue = (maxCashOutAmount == null || (dH = b.h(maxCashOutAmount)) == null) ? 0.0d : dH.doubleValue();
                                                                        FallbackUserCashOutQuota userCashOutQuota3 = cashOutFallbackData.getUserCashOutQuota();
                                                                        if (userCashOutQuota3 != null) {
                                                                            double quota = userCashOutQuota3.getQuota();
                                                                            FallbackQuota globalCashOutQuota2 = cashOutFallbackData.getGlobalCashOutQuota();
                                                                            if (globalCashOutQuota2 != null) {
                                                                                double quota2 = globalCashOutQuota2.getQuota();
                                                                                Double maxCashOutPayoutAmount = cashOutFallbackData.getMaxCashOutPayoutAmount();
                                                                                if (maxCashOutPayoutAmount != null) {
                                                                                    double dDoubleValue2 = maxCashOutPayoutAmount.doubleValue();
                                                                                    if ((quota <= 0.0d || dDoubleValue <= quota) && ((quota2 <= 0.0d || dDoubleValue <= quota2) && (dDoubleValue2 <= 0.0d || dDoubleValue <= dDoubleValue2))) {
                                                                                        fo6Var.invoke(cashOutInfo2);
                                                                                    } else {
                                                                                        eo6Var.invoke(str5);
                                                                                    }
                                                                                } else {
                                                                                    fo6Var.invoke(cashOutInfo2);
                                                                                }
                                                                            } else {
                                                                                fo6Var.invoke(cashOutInfo2);
                                                                            }
                                                                        } else {
                                                                            fo6Var.invoke(cashOutInfo2);
                                                                        }
                                                                        bVar = Unit.a;
                                                                    } catch (Throwable th2) {
                                                                        zi50.a aVar3 = zi50.b;
                                                                        bVar = new zi50.b(th2);
                                                                    }
                                                                    Throwable thA = zi50.a(bVar);
                                                                    if (thA != null) {
                                                                        itf0.a aVar4 = itf0.a;
                                                                        aVar4.q(MyLog.TAG_CASHOUT_FALLBACK);
                                                                        aVar4.f(thA, "Error processing fallback for betId: " + str5, new Object[0]);
                                                                        eo6Var.invoke(str5);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } catch (Exception e) {
                                                itf0.a aVar5 = itf0.a;
                                                aVar5.q(MyLog.TAG_CASHOUT_FALLBACK);
                                                aVar5.f(e, "Critical error in processFallbackCashOut", new Object[0]);
                                            }
                                            if (((SprDataThrowable) th).d != 34014) {
                                                String str6 = str4;
                                                str6.getClass();
                                                hVar2.C1(str6);
                                            }
                                            return Unit.a;
                                        }
                                    }, hVar, str4, null), 3);
                                    break;
                                default:
                                    hVar.A1(new com.sportybet.android.cashoutphase3.a.c.g(th, uiText));
                                    break;
                            }
                            break;
                    }
                } else {
                    Object obj2 = sprDataThrowable.f;
                    if (!(obj2 instanceof CashOutResponse)) {
                        obj2 = null;
                    }
                    final CashOutResponse cashOutResponse2 = (CashOutResponse) obj2;
                    if (cashOutResponse2 != null) {
                        final String str5 = pl6Var.a.id;
                        sm6 sm6Var = hVar.a.b;
                        if (!sm6Var.c.isConnected()) {
                            sm6Var.d(true);
                        }
                        sm6Var.e(true, false);
                        pm6 pm6Var = sm6Var.A;
                        MultiTopic multiTopic = sm6Var.y;
                        if (multiTopic != null) {
                            sm6Var.c.subscribeTopic(multiTopic, pm6Var);
                        }
                        hVar.A1(new com.sportybet.android.cashoutphase3.a.c.f(pl6Var, th, uiText));
                        if (cashOutResponse2.isFallbackCashOut) {
                            String str6 = pl6Var.a.id;
                            str6.getClass();
                            ej5.c(o8i0.d(hVar), null, null, new ro6(new Function0() { // from class: qn6
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    CashOutResponse cashOutResponse3 = cashOutResponse2;
                                    String str7 = cashOutResponse3.availableStake;
                                    String str8 = cashOutResponse3.coefficient;
                                    boolean z3 = cashOutResponse3.isSupportPartial;
                                    String str9 = cashOutResponse3.maxCashOutAmount;
                                    if (str9 == null) {
                                        str9 = "";
                                    }
                                    Long oddsChangeTimeForFallback = cashOutResponse3.cashOutFallback.getOddsChangeTimeForFallback();
                                    Boolean bool = Boolean.FALSE;
                                    hVar.H1(new CashOutInfo(str5, str7, str8, z3, str9, true, "", false, bool, false, null, null, null, true, oddsChangeTimeForFallback, null, null, null, null, null, false, 2072192, null));
                                    return Unit.a;
                                }
                            }, hVar, str6, null), 3);
                        } else {
                            str5.getClass();
                            hVar.I1(str5);
                        }
                    }
                }
            } else {
                hVar.A1(new com.sportybet.android.cashoutphase3.a.c.g(th, uiText));
            }
        }
        return Unit.a;
    }
}
