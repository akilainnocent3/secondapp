package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.common.uievent.AlertDialogCallbackType;
import com.sporty.android.common.uievent.a;
import com.sporty.android.common.uievent.b;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.pocket.deposit.DepositRequest;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.gp.tz.R;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f9e {
    public UiText A;
    public final k9e a;
    public final bg6 b;
    public final sr10 c;
    public final d100 d;
    public final lyz e;
    public final uqm f;
    public final mgb0 g;
    public final psm h;
    public final wsm i;
    public final ba50 j;
    public final ij7 k;
    public final rfk l;
    public final vb40 m;
    public a300 n;
    public DepositRequest o;
    public ztw<tzs> p;
    public vtw<a> q;
    public vtw<spg0> r;
    public vtw<m480> s;
    public vtw<tng0> t;
    public vtw<z7e> u;
    public vtw<cg6> v;
    public vtw<x7e> w;
    public vtw<pdd0> x;
    public iaj<? super String, ? super m8h0, ? super Boolean, ? super String, Unit> y;
    public wzd z;

    public f9e(k9e k9eVar, bg6 bg6Var, epg0 epg0Var, sr10 sr10Var, d100 d100Var, lyz lyzVar, uqm uqmVar, mgb0 mgb0Var, psm psmVar, wsm wsmVar, ba50 ba50Var, ij7 ij7Var, rfk rfkVar, vb40 vb40Var) {
        sr10Var.getClass();
        d100Var.getClass();
        lyzVar.getClass();
        uqmVar.getClass();
        mgb0Var.getClass();
        psmVar.getClass();
        wsmVar.getClass();
        this.a = k9eVar;
        this.b = bg6Var;
        this.c = sr10Var;
        this.d = d100Var;
        this.e = lyzVar;
        this.f = uqmVar;
        this.g = mgb0Var;
        this.h = psmVar;
        this.i = wsmVar;
        this.j = ba50Var;
        this.k = ij7Var;
        this.l = rfkVar;
        this.m = vb40Var;
        this.z = wzd.b.a;
    }

    public static /* synthetic */ Object d(f9e f9eVar, x7e x7eVar, x1b x1bVar) {
        return f9eVar.c(x7eVar, false, x1bVar);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01f3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:57:0x0124  */
    /* JADX WARN: Code duplicated, block: B:59:0x012d  */
    /* JADX WARN: Code duplicated, block: B:61:0x0137  */
    /* JADX WARN: Code duplicated, block: B:62:0x013c  */
    /* JADX WARN: Code duplicated, block: B:69:0x0187  */
    /* JADX WARN: Code duplicated, block: B:73:0x01a3 A[PHI: r0 r6
      0x01a3: PHI (r0v30 java.lang.Object) = (r0v29 java.lang.Object), (r0v35 java.lang.Object) binds: [B:71:0x01a0, B:19:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x01a3: PHI (r6v26 ??) = (r6v33 ??), (r6v32 ??) binds: [B:71:0x01a0, B:19:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r6v25, types: [com.sporty.android.core.model.pocket.deposit.DepositRequest, v1b, vtw, w7e] */
    /* JADX WARN: Type inference failed for: r6v26, types: [com.sporty.android.core.model.pocket.deposit.DepositRequest, vtw, w7e] */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34 */
    public final Object a(a300 a300Var, DepositRequest depositRequest, ztw ztwVar, vtw vtwVar, vtw vtwVar2, vtw vtwVar3, vtw vtwVar4, vtw vtwVar5, vtw vtwVar6, vtw vtwVar7, iaj iajVar, vtw vtwVar8, wzd wzdVar, w7e w7eVar, UiText uiText, x1b x1bVar) throws Throwable {
        s8e s8eVar;
        w7e w7eVar2;
        vtw vtwVar9;
        vtw vtwVar10;
        Object bVar;
        DepositRequest depositRequest2;
        w7e w7eVar3;
        vtw vtwVar11;
        vtw vtwVar12;
        Throwable thA;
        UiText resourceUiText;
        SprThrowable sprThrowable;
        ?? r6;
        Object objA;
        ?? r7;
        Object objC;
        DepositRequest depositRequest3 = depositRequest;
        vtw vtwVar13 = vtwVar;
        vtw vtwVar14 = vtwVar8;
        if (x1bVar instanceof s8e) {
            s8eVar = (s8e) x1bVar;
            int i = s8eVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                s8eVar.i = i - Integer.MIN_VALUE;
            } else {
                s8eVar = new s8e(this, x1bVar);
            }
        } else {
            s8eVar = new s8e(this, x1bVar);
        }
        s8e s8eVar2 = s8eVar;
        Object obj = s8eVar2.e;
        Object obj2 = y5b.a;
        int i2 = s8eVar2.i;
        if (i2 != 0) {
            if (i2 == 1) {
                w7e w7eVar4 = s8eVar2.d;
                vtw vtwVar15 = s8eVar2.c;
                vtw vtwVar16 = s8eVar2.b;
                DepositRequest depositRequest4 = s8eVar2.a;
                try {
                    uj50.b(obj);
                    w7eVar2 = w7eVar4;
                    depositRequest3 = depositRequest4;
                    vtwVar14 = vtwVar15;
                    vtwVar13 = vtwVar16;
                    vtwVar10 = null;
                    bVar = Unit.a;
                    zi50.a aVar = zi50.b;
                    vtwVar12 = vtwVar10;
                } catch (Throwable th) {
                    th = th;
                    w7eVar2 = w7eVar4;
                    depositRequest3 = depositRequest4;
                    vtwVar14 = vtwVar15;
                    vtwVar13 = vtwVar16;
                    vtwVar10 = null;
                    zi50.a aVar2 = zi50.b;
                    bVar = new zi50.b(th);
                    vtwVar12 = vtwVar10;
                }
                thA = zi50.a(bVar);
                vtwVar9 = vtwVar12;
                if (thA != null) {
                    itf0.a.o(thA);
                    if (thA instanceof SprThrowable) {
                        sprThrowable = (SprThrowable) thA;
                        if (sprThrowable.getD() == 19411) {
                            resourceUiText = sprThrowable.b();
                        } else {
                            StringUiText stringUiText = vch0.a;
                            resourceUiText = new ResourceUiText(R.string.page_payment__this_card_type_is_not_currently_accepted_tip__GH);
                        }
                    } else {
                        StringUiText stringUiText2 = vch0.a;
                        resourceUiText = new ResourceUiText(R.string.page_payment__this_card_type_is_not_currently_accepted_tip__GH);
                    }
                    StringUiText stringUiText3 = vch0.a;
                    b.e(vtwVar13, new ResourceUiText(R.string.page_payment__deposit_failed), null, resourceUiText, null, null, null, null, 506);
                    return Unit.a;
                }
                s8eVar2.a = depositRequest3;
                s8eVar2.b = vtwVar9;
                s8eVar2.c = vtwVar14;
                s8eVar2.d = w7eVar2;
                s8eVar2.i = 2;
                if (this.j.a(s8eVar2) != obj2) {
                    depositRequest2 = depositRequest3;
                    w7eVar3 = w7eVar2;
                    vtwVar11 = vtwVar14;
                    r6 = vtwVar9;
                    t8e t8eVar = new t8e(vtwVar11, w7eVar3, r6);
                    s8eVar2.a = r6;
                    s8eVar2.b = r6;
                    s8eVar2.c = r6;
                    s8eVar2.d = r6;
                    s8eVar2.i = 3;
                    objA = this.a.a(depositRequest2, t8eVar, s8eVar2);
                    r7 = r6;
                    if (objA != obj2) {
                    }
                }
            } else if (i2 == 2) {
                w7eVar3 = s8eVar2.d;
                vtwVar11 = s8eVar2.c;
                depositRequest2 = s8eVar2.a;
                uj50.b(obj);
                r6 = 0;
                t8e t8eVar2 = new t8e(vtwVar11, w7eVar3, r6);
                s8eVar2.a = r6;
                s8eVar2.b = r6;
                s8eVar2.c = r6;
                s8eVar2.d = r6;
                s8eVar2.i = 3;
                objA = this.a.a(depositRequest2, t8eVar2, s8eVar2);
                r7 = r6;
                if (objA != obj2) {
                }
            } else {
                if (i2 != 3) {
                    if (i2 == 4) {
                        uj50.b(obj);
                        return obj;
                    }
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                objA = obj;
                r7 = 0;
            }
            x7e x7eVar = (x7e) objA;
            if (this.h.getCountryCode() == CountryCodeName.NIGERIA && !(x7eVar instanceof x7e.d.n) && !(x7eVar instanceof x7e.d.f) && !(x7eVar instanceof x7e.d.k) && !(x7eVar instanceof x7e.d.i) && !(x7eVar instanceof x7e.d.j) && !(x7eVar instanceof x7e.d.h) && !(x7eVar instanceof x7e.d.r) && !(x7eVar instanceof x7e.d.s) && !(x7eVar instanceof x7e.d.t) && !(x7eVar instanceof x7e.d.p)) {
                f00 f00Var = vgb0.a;
                vgb0.a(AnalyticsEvent.DEPOSIT);
            }
            s8eVar2.a = r7;
            s8eVar2.b = r7;
            s8eVar2.c = r7;
            s8eVar2.d = r7;
            s8eVar2.i = 4;
            objC = c(x7eVar, false, s8eVar2);
            if (objC == obj2) {
                return objC;
            }
        } else {
            uj50.b(obj);
            this.n = a300Var;
            this.o = depositRequest3;
            this.p = ztwVar;
            this.q = vtwVar13;
            this.r = vtwVar2;
            this.s = vtwVar3;
            this.t = vtwVar4;
            this.u = vtwVar5;
            this.v = vtwVar6;
            this.w = vtwVar7;
            this.x = vtwVar14;
            this.y = iajVar;
            this.z = wzdVar;
            this.A = uiText;
            if ((a300Var instanceof a300.b) && kotlin.collections.a.c(CountryCodeName.GHANA).contains(((a300.b) a300Var).a)) {
                BigDecimal payAmount = depositRequest3.getPayAmount();
                String cardCvv = depositRequest3.getCardCvv();
                Integer bankAssetId = depositRequest3.getBankAssetId();
                String cardNum = depositRequest3.getCardNum();
                String cardExpDate = depositRequest3.getCardExpDate();
                if (cardCvv == null) {
                    b.h(vtwVar13);
                    return Unit.a;
                }
                try {
                    zi50.a aVar3 = zi50.b;
                    bg6 bg6Var = this.b;
                    try {
                        o8e o8eVar = new o8e(vtwVar6, 0);
                        s8eVar2.a = depositRequest3;
                        s8eVar2.b = vtwVar13;
                        s8eVar2.c = vtwVar14;
                        w7eVar2 = w7eVar;
                        try {
                            s8eVar2.d = w7eVar2;
                            s8eVar2.i = 1;
                            vtwVar10 = null;
                            try {
                                vtwVar10 = vtwVar10;
                                if (bg6Var.a(payAmount, cardCvv, bankAssetId, cardNum, cardExpDate, o8eVar, s8eVar2) != obj2) {
                                    bVar = Unit.a;
                                    zi50.a aVar4 = zi50.b;
                                    vtwVar12 = vtwVar10;
                                    thA = zi50.a(bVar);
                                    vtwVar9 = vtwVar12;
                                    if (thA != null) {
                                        itf0.a.o(thA);
                                        if (thA instanceof SprThrowable) {
                                            sprThrowable = (SprThrowable) thA;
                                            if (sprThrowable.getD() == 19411) {
                                                resourceUiText = sprThrowable.b();
                                            } else {
                                                StringUiText stringUiText4 = vch0.a;
                                                resourceUiText = new ResourceUiText(R.string.page_payment__this_card_type_is_not_currently_accepted_tip__GH);
                                            }
                                        } else {
                                            StringUiText stringUiText5 = vch0.a;
                                            resourceUiText = new ResourceUiText(R.string.page_payment__this_card_type_is_not_currently_accepted_tip__GH);
                                        }
                                        StringUiText stringUiText6 = vch0.a;
                                        b.e(vtwVar13, new ResourceUiText(R.string.page_payment__deposit_failed), null, resourceUiText, null, null, null, null, 506);
                                        return Unit.a;
                                    }
                                    s8eVar2.a = depositRequest3;
                                    s8eVar2.b = vtwVar9;
                                    s8eVar2.c = vtwVar14;
                                    s8eVar2.d = w7eVar2;
                                    s8eVar2.i = 2;
                                    if (this.j.a(s8eVar2) != obj2) {
                                        depositRequest2 = depositRequest3;
                                        w7eVar3 = w7eVar2;
                                        vtwVar11 = vtwVar14;
                                        r6 = vtwVar9;
                                        t8e t8eVar3 = new t8e(vtwVar11, w7eVar3, r6);
                                        s8eVar2.a = r6;
                                        s8eVar2.b = r6;
                                        s8eVar2.c = r6;
                                        s8eVar2.d = r6;
                                        s8eVar2.i = 3;
                                        objA = this.a.a(depositRequest2, t8eVar3, s8eVar2);
                                        r7 = r6;
                                        if (objA != obj2) {
                                            x7e x7eVar2 = (x7e) objA;
                                            if (this.h.getCountryCode() == CountryCodeName.NIGERIA) {
                                                f00 f00Var2 = vgb0.a;
                                                vgb0.a(AnalyticsEvent.DEPOSIT);
                                            }
                                            s8eVar2.a = r7;
                                            s8eVar2.b = r7;
                                            s8eVar2.c = r7;
                                            s8eVar2.d = r7;
                                            s8eVar2.i = 4;
                                            objC = c(x7eVar2, false, s8eVar2);
                                            if (objC == obj2) {
                                                return objC;
                                            }
                                        }
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                zi50.a aVar5 = zi50.b;
                                bVar = new zi50.b(th);
                                vtwVar12 = vtwVar10;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            vtwVar10 = null;
                            zi50.a aVar6 = zi50.b;
                            bVar = new zi50.b(th);
                            vtwVar12 = vtwVar10;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        w7eVar2 = w7eVar;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    w7eVar2 = w7eVar;
                    vtwVar10 = null;
                    zi50.a aVar7 = zi50.b;
                    bVar = new zi50.b(th);
                    vtwVar12 = vtwVar10;
                    thA = zi50.a(bVar);
                    vtwVar9 = vtwVar12;
                    if (thA != null) {
                        itf0.a.o(thA);
                        if (thA instanceof SprThrowable) {
                            sprThrowable = (SprThrowable) thA;
                            if (sprThrowable.getD() == 19411) {
                                resourceUiText = sprThrowable.b();
                            } else {
                                StringUiText stringUiText7 = vch0.a;
                                resourceUiText = new ResourceUiText(R.string.page_payment__this_card_type_is_not_currently_accepted_tip__GH);
                            }
                        } else {
                            StringUiText stringUiText8 = vch0.a;
                            resourceUiText = new ResourceUiText(R.string.page_payment__this_card_type_is_not_currently_accepted_tip__GH);
                        }
                        StringUiText stringUiText9 = vch0.a;
                        b.e(vtwVar13, new ResourceUiText(R.string.page_payment__deposit_failed), null, resourceUiText, null, null, null, null, 506);
                        return Unit.a;
                    }
                    s8eVar2.a = depositRequest3;
                    s8eVar2.b = vtwVar9;
                    s8eVar2.c = vtwVar14;
                    s8eVar2.d = w7eVar2;
                    s8eVar2.i = 2;
                    if (this.j.a(s8eVar2) != obj2) {
                        depositRequest2 = depositRequest3;
                        w7eVar3 = w7eVar2;
                        vtwVar11 = vtwVar14;
                        r6 = vtwVar9;
                        t8e t8eVar4 = new t8e(vtwVar11, w7eVar3, r6);
                        s8eVar2.a = r6;
                        s8eVar2.b = r6;
                        s8eVar2.c = r6;
                        s8eVar2.d = r6;
                        s8eVar2.i = 3;
                        objA = this.a.a(depositRequest2, t8eVar4, s8eVar2);
                        r7 = r6;
                        if (objA != obj2) {
                            x7e x7eVar3 = (x7e) objA;
                            if (this.h.getCountryCode() == CountryCodeName.NIGERIA) {
                                f00 f00Var3 = vgb0.a;
                                vgb0.a(AnalyticsEvent.DEPOSIT);
                            }
                            s8eVar2.a = r7;
                            s8eVar2.b = r7;
                            s8eVar2.c = r7;
                            s8eVar2.d = r7;
                            s8eVar2.i = 4;
                            objC = c(x7eVar3, false, s8eVar2);
                            if (objC == obj2) {
                                return objC;
                            }
                        }
                    }
                    return obj2;
                }
            } else {
                w7eVar2 = w7eVar;
                vtwVar9 = null;
                s8eVar2.a = depositRequest3;
                s8eVar2.b = vtwVar9;
                s8eVar2.c = vtwVar14;
                s8eVar2.d = w7eVar2;
                s8eVar2.i = 2;
                if (this.j.a(s8eVar2) != obj2) {
                    depositRequest2 = depositRequest3;
                    w7eVar3 = w7eVar2;
                    vtwVar11 = vtwVar14;
                    r6 = vtwVar9;
                    t8e t8eVar5 = new t8e(vtwVar11, w7eVar3, r6);
                    s8eVar2.a = r6;
                    s8eVar2.b = r6;
                    s8eVar2.c = r6;
                    s8eVar2.d = r6;
                    s8eVar2.i = 3;
                    objA = this.a.a(depositRequest2, t8eVar5, s8eVar2);
                    r7 = r6;
                    if (objA != obj2) {
                        x7e x7eVar4 = (x7e) objA;
                        if (this.h.getCountryCode() == CountryCodeName.NIGERIA) {
                            f00 f00Var4 = vgb0.a;
                            vgb0.a(AnalyticsEvent.DEPOSIT);
                        }
                        s8eVar2.a = r7;
                        s8eVar2.b = r7;
                        s8eVar2.c = r7;
                        s8eVar2.d = r7;
                        s8eVar2.i = 4;
                        objC = c(x7eVar4, false, s8eVar2);
                        if (objC == obj2) {
                            return objC;
                        }
                    }
                }
            }
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:102:0x01da  */
    /* JADX WARN: Code duplicated, block: B:105:0x01ed A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:106:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:108:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:97:0x01b4  */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x017b, code lost:
    
        if (d(r22, r0, r3) == r4) goto L104;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ssa r23, defpackage.x1b r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f9e.b(ssa, x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01a1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:116:0x01d5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:130:0x0209 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:150:0x025a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:164:0x028e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:178:0x02c2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:220:0x0360  */
    /* JADX WARN: Code duplicated, block: B:221:0x0363  */
    /* JADX WARN: Code duplicated, block: B:223:0x0366  */
    /* JADX WARN: Code duplicated, block: B:224:0x036b  */
    /* JADX WARN: Code duplicated, block: B:227:0x0374  */
    /* JADX WARN: Code duplicated, block: B:228:0x037c  */
    /* JADX WARN: Code duplicated, block: B:233:0x038b  */
    /* JADX WARN: Code duplicated, block: B:236:0x0390  */
    /* JADX WARN: Code duplicated, block: B:238:0x039a  */
    /* JADX WARN: Code duplicated, block: B:240:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:245:0x03be  */
    /* JADX WARN: Code duplicated, block: B:247:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:249:0x03c6 A[PHI: r1 r2
      0x03c6: PHI (r1v73 x7e) = (r1v0 x7e), (r1v80 x7e) binds: [B:214:0x033c, B:237:0x0398] A[DONT_GENERATE, DONT_INLINE]
      0x03c6: PHI (r2v8 boolean) = (r2v0 boolean), (r2v10 boolean) binds: [B:214:0x033c, B:237:0x0398] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:251:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:253:0x03d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:265:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:266:0x0416  */
    /* JADX WARN: Code duplicated, block: B:268:0x041c  */
    /* JADX WARN: Code duplicated, block: B:284:0x045b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:88:0x0169 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x030c, code lost:
    
        if (b(r3, r10) == r4) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x03b7, code lost:
    
        if (f(r3, r10) == r4) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x03ef, code lost:
    
        if (b(r3, r10) == r4) goto L284;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.x7e r23, boolean r24, defpackage.x1b r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f9e.c(x7e, boolean, x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d3, code lost:
    
        if (d(r10, r13, r0) == r1) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r11, java.lang.String r12, defpackage.x1b r13) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f9e.e(java.lang.String, java.lang.String, x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:66:0x0126  */
    /* JADX WARN: Code duplicated, block: B:68:0x012a  */
    /* JADX WARN: Code duplicated, block: B:70:0x0130  */
    /* JADX WARN: Code duplicated, block: B:75:0x0143  */
    /* JADX WARN: Code duplicated, block: B:77:0x0147  */
    /* JADX WARN: Code duplicated, block: B:79:0x014f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x0155  */
    /* JADX WARN: Code duplicated, block: B:86:0x0167  */
    /* JADX WARN: Code duplicated, block: B:88:0x016b  */
    /* JADX WARN: Code duplicated, block: B:89:0x018f  */
    /* JADX WARN: Code duplicated, block: B:91:0x0193  */
    /* JADX WARN: Code duplicated, block: B:93:0x0199  */
    /* JADX WARN: Code duplicated, block: B:95:0x019d  */
    /* JADX WARN: Code duplicated, block: B:96:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:98:0x01b9  */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00de, code lost:
    
        if (m(r2) == r3) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x013d, code lost:
    
        if (b(r9, r2) == r3) goto L72;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.ssa r21, defpackage.x1b r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f9e.f(ssa, x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(x1b x1bVar) {
        y8e y8eVar;
        if (x1bVar instanceof y8e) {
            y8eVar = (y8e) x1bVar;
            int i = y8eVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                y8eVar.c = i - Integer.MIN_VALUE;
            } else {
                y8eVar = new y8e(this, x1bVar);
            }
        } else {
            y8eVar = new y8e(this, x1bVar);
        }
        Object objP = y8eVar.a;
        y5b y5bVar = y5b.a;
        int i2 = y8eVar.c;
        if (i2 == 0) {
            uj50.b(objP);
            wl50 wl50VarV = this.d.v();
            y8eVar.c = 1;
            objP = bm50.p(wl50VarV, y8eVar);
            if (objP == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objP);
        }
        lk50 lk50Var = (lk50) objP;
        lk50.c cVar = lk50Var instanceof lk50.c ? (lk50.c) lk50Var : null;
        ut60 ut60Var = cVar != null ? (ut60) cVar.a : null;
        String strValueOf = String.valueOf(ut60Var instanceof ut60.a ? ((ut60.a) ut60Var).a : 0);
        vtw<a> vtwVar = this.q;
        if (vtwVar == null) {
            Intrinsics.n("commonUiEventFlow");
            throw null;
        }
        StringUiText stringUiText = vch0.a;
        b.e(vtwVar, new ResourceUiText(R.string.page_payment__deposit_failed), null, new ResourceUiText(R.string.page_payment__the_maximum_number_of_cards_allowed_vnum__GH, ay0.S(new Object[]{strValueOf})), null, null, null, null, 506);
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(String str, x1b x1bVar) throws Throwable {
        z8e z8eVar;
        ResourceUiText resourceUiText;
        if (x1bVar instanceof z8e) {
            z8eVar = (z8e) x1bVar;
            int i = z8eVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                z8eVar.c = i - Integer.MIN_VALUE;
            } else {
                z8eVar = new z8e(this, x1bVar);
            }
        } else {
            z8eVar = new z8e(this, x1bVar);
        }
        Object objO = z8eVar.a;
        y5b y5bVar = y5b.a;
        int i2 = z8eVar.c;
        if (i2 == 0) {
            uj50.b(objO);
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_COMMON);
            aVar.g("[Redirect] jumpUrl =%s", str);
            a300 a300Var = this.n;
            if (a300Var == null) {
                Intrinsics.n("payMethod");
                throw null;
            }
            if (a300Var instanceof a300.e) {
                resourceUiText = a300Var.h();
            } else {
                StringUiText stringUiText = vch0.a;
                resourceUiText = new ResourceUiText(R.string.common_functions__deposit);
            }
            vtw<z7e> vtwVar = this.u;
            if (vtwVar == null) {
                Intrinsics.n("depositUiEventFlow");
                throw null;
            }
            z8eVar.c = 1;
            bc6 bc6Var = new bc6(1, yzo.b(z8eVar));
            bc6Var.q();
            vtwVar.a(new z7e.c(str, resourceUiText, bc6Var));
            objO = bc6Var.o();
            if (objO == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objO);
        }
        if (((Boolean) objO).booleanValue() && (this.z instanceof wzd.a)) {
            vtw<a> vtwVar2 = this.q;
            if (vtwVar2 == null) {
                Intrinsics.n("commonUiEventFlow");
                throw null;
            }
            vtwVar2.a(a.b.a);
        }
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d1 A[Catch: all -> 0x004d, PHI: r3 r6
      0x00d1: PHI (r3v8 ??) = (r3v12 ??), (r3v13 ??) binds: [B:37:0x00ce, B:18:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x00d1: PHI (r6v8 ??) = (r6v11 ??), (r6v12 ??) binds: [B:37:0x00ce, B:18:0x0048] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {all -> 0x004d, blocks: (B:18:0x0048, B:39:0x00d1, B:23:0x0058, B:36:0x00bc), top: B:55:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00fd, code lost:
    
        if (d(r22, r2, r4) == r5) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r6v0, types: [int] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(int r23, defpackage.x1b r24, java.lang.String r25, java.lang.String r26) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f9e.i(int, x1b, java.lang.String, java.lang.String):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008b  */
    /* JADX WARN: Code duplicated, block: B:44:0x008e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
    
        if (c(r10, true, r0) == r1) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.lang.String r9, java.lang.Object r10, defpackage.x1b r11) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.b9e
            if (r0 == 0) goto L13
            r0 = r11
            b9e r0 = (defpackage.b9e) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            b9e r0 = new b9e
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.c
            y5b r1 = defpackage.y5b.a
            int r2 = r0.e
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L44
            if (r2 == r5) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2e
            defpackage.uj50.b(r11)
            return r11
        L2e:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            return r6
        L34:
            int r9 = r0.b
            x7e r10 = r0.a
            defpackage.uj50.b(r11)
            goto L82
        L3c:
            x7e r8 = r0.a
            f9e r8 = (defpackage.f9e) r8
            defpackage.uj50.b(r11)
            goto L62
        L44:
            defpackage.uj50.b(r11)
            zi50$a r11 = defpackage.zi50.b
            boolean r11 = r10 instanceof zi50.b
            if (r11 == 0) goto L4e
            r10 = r6
        L4e:
            x7e r10 = (defpackage.x7e) r10
            if (r10 != 0) goto L65
            x7e$d$t r10 = new x7e$d$t
            r10.<init>(r9)
            r0.a = r6
            r0.e = r5
            java.lang.Object r8 = r8.c(r10, r5, r0)
            if (r8 != r1) goto L62
            goto L9b
        L62:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        L65:
            boolean r11 = r10 instanceof x7e.d.q
            if (r11 != 0) goto L6f
            boolean r11 = r10 instanceof x7e.d.o
            if (r11 != 0) goto L6f
            r11 = r5
            goto L70
        L6f:
            r11 = 0
        L70:
            if (r11 == 0) goto L8f
            r0.a = r10
            r0.b = r11
            r0.e = r4
            java.lang.Object r9 = r8.k(r9, r0)
            if (r9 != r1) goto L7f
            goto L9b
        L7f:
            r7 = r11
            r11 = r9
            r9 = r7
        L82:
            ds r11 = (defpackage.ds) r11
            r11.getClass()
            boolean r11 = r11 instanceof ds.a
            if (r11 == 0) goto L8e
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        L8e:
            r11 = r9
        L8f:
            r0.a = r6
            r0.b = r11
            r0.e = r3
            java.lang.Object r8 = r8.c(r10, r5, r0)
            if (r8 != r1) goto L9c
        L9b:
            return r1
        L9c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f9e.j(java.lang.String, java.lang.Object, x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00fa, code lost:
    
        if (defpackage.f8e.a(r3, new com.sporty.android.common_ui.uitext.ResourceUiText(com.sportybet.android.gp.tz.R.string.page_payment__deposit_failed), r8.b.a(), kyf0.a.b, r4, r5, r14, r1, n67.a.a, r12, r13) == r2) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.lang.String r22, defpackage.x1b r23) {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f9e.k(java.lang.String, x1b):java.lang.Object");
    }

    public final void l() {
        vtw<a> vtwVar = this.q;
        if (vtwVar == null) {
            Intrinsics.n("commonUiEventFlow");
            throw null;
        }
        StringUiText stringUiText = vch0.a;
        gi8.c(vtwVar, null, new ResourceUiText(R.string.page_payment__you_deposit_request_has_been_submitted_tip), null, null, new Function1() { // from class: r8e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                AlertDialogCallbackType alertDialogCallbackType = (AlertDialogCallbackType) obj;
                alertDialogCallbackType.getClass();
                boolean z = alertDialogCallbackType instanceof AlertDialogCallbackType.Positive;
                vtw<spg0> vtwVar2 = this.a.r;
                if (z) {
                    if (vtwVar2 == null) {
                        Intrinsics.n("tradingUiEventFlow");
                        throw null;
                    }
                    int i = vpg0.a;
                    vtwVar2.a(spg0.b.a);
                } else {
                    if (vtwVar2 == null) {
                        Intrinsics.n("tradingUiEventFlow");
                        throw null;
                    }
                    vpg0.b(vtwVar2, aqg0.e.c);
                }
                return Unit.a;
            }
        }, 29);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00af  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(x1b x1bVar) {
        d9e d9eVar;
        yp40 yp40Var;
        yp40 yp40Var2;
        vtw<spg0> vtwVar;
        if (x1bVar instanceof d9e) {
            d9eVar = (d9e) x1bVar;
            int i = d9eVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                d9eVar.d = i - Integer.MIN_VALUE;
            } else {
                d9eVar = new d9e(this, x1bVar);
            }
        } else {
            d9eVar = new d9e(this, x1bVar);
        }
        Object obj = d9eVar.b;
        y5b y5bVar = y5b.a;
        int i2 = d9eVar.d;
        if (i2 == 0) {
            uj50.b(obj);
            yp40 yp40Var3 = new yp40();
            vtw<a> vtwVar2 = this.q;
            if (vtwVar2 == null) {
                Intrinsics.n("commonUiEventFlow");
                throw null;
            }
            StringUiText stringUiText = vch0.a;
            b.i(vtwVar2, new ResourceUiText(R.string.identity_verification__deposit_submitted), new ResourceUiText(R.string.common_functions__ok), new e9e(yp40Var3, this), new Integer(3000), 72);
            d9eVar.a = yp40Var3;
            d9eVar.d = 1;
            Object userCertStatus = this.g.getUserCertStatus(d9eVar);
            if (userCertStatus != y5bVar) {
                yp40Var = yp40Var3;
                obj = userCertStatus;
            }
            return y5bVar;
        }
        if (i2 == 1) {
            yp40Var = d9eVar.a;
            uj50.b(obj);
        } else {
            if (i2 != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            yp40Var2 = d9eVar.a;
            uj50.b(obj);
        }
        if (!yp40Var2.a) {
            yp40Var2.a = true;
            vtwVar = this.r;
            if (vtwVar != null) {
                Intrinsics.n("tradingUiEventFlow");
                throw null;
            }
            vpg0.b(vtwVar, aqg0.e.c);
        }
        return Unit.a;
        int iIntValue = ((Number) obj).intValue();
        boolean z = (iIntValue == 340 || iIntValue == 350) ? false : true;
        vtw<pdd0> vtwVar3 = this.x;
        if (vtwVar3 == null) {
            Intrinsics.n("sportyTrackingEventFlow");
            throw null;
        }
        vtwVar3.a(new ccx(z));
        d9eVar.a = yp40Var;
        d9eVar.d = 2;
        if (hkd.b(3000L, d9eVar) != y5bVar) {
            yp40Var2 = yp40Var;
            if (!yp40Var2.a) {
                yp40Var2.a = true;
                vtwVar = this.r;
                if (vtwVar != null) {
                    Intrinsics.n("tradingUiEventFlow");
                    throw null;
                }
                vpg0.b(vtwVar, aqg0.e.c);
            }
            return Unit.a;
        }
        return y5bVar;
    }
}
