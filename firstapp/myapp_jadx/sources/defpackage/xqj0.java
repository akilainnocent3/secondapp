package defpackage;

import android.accounts.Account;
import com.google.android.material.circularreveal.cardview.Kghu.xOgHBQVl;
import com.sporty.android.common.uievent.AlertDialogCallbackType;
import com.sporty.android.common.uievent.a;
import com.sporty.android.common.uievent.b;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.pocket.withdraw.WithdrawRequest;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.account.Qr.QQWMbKFOuTf;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class xqj0 {
    public final brj0 a;
    public final va00 b;
    public final q900 c;
    public final u1i0 d;
    public final kyh0 e;
    public final sr10 f;
    public final psm g;
    public final uqm h;
    public final wsm i;
    public y300 j;
    public fnj0 k;
    public vtw<a> l;
    public vtw<spg0> m;
    public vtw<m480> n;
    public vtw<tng0> o;
    public vtw<kqj0> p;
    public iaj<? super String, ? super m8h0, ? super Boolean, ? super Integer, Unit> q;
    public vtw<pdd0> r;

    public xqj0(brj0 brj0Var, va00 va00Var, q900 q900Var, u1i0 u1i0Var, kyh0 kyh0Var, epg0 epg0Var, sr10 sr10Var, psm psmVar, uqm uqmVar, wsm wsmVar) {
        sr10Var.getClass();
        psmVar.getClass();
        uqmVar.getClass();
        wsmVar.getClass();
        this.a = brj0Var;
        this.b = va00Var;
        this.c = q900Var;
        this.d = u1i0Var;
        this.e = kyh0Var;
        this.f = sr10Var;
        this.g = psmVar;
        this.h = uqmVar;
        this.i = wsmVar;
    }

    public final Object a(y300 y300Var, WithdrawRequest withdrawRequest, vtw vtwVar, vtw vtwVar2, vtw vtwVar3, vtw vtwVar4, vtw vtwVar5, iaj iajVar, vtw vtwVar6, tje0 tje0Var) {
        this.j = y300Var;
        fnj0 fnj0Var = new fnj0(withdrawRequest, null, null);
        this.k = fnj0Var;
        this.l = vtwVar;
        this.m = vtwVar2;
        this.n = vtwVar3;
        this.o = vtwVar4;
        this.p = vtwVar5;
        this.q = iajVar;
        this.r = vtwVar6;
        return f(fnj0Var, tje0Var);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object b(String str, v1i0.c cVar, g0i0.d dVar, x1b x1bVar) throws Throwable {
        qqj0 qqj0Var;
        v1i0.c cVar2;
        g0i0.d dVar2;
        Object objF;
        if (x1bVar instanceof qqj0) {
            qqj0Var = (qqj0) x1bVar;
            int i = qqj0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                qqj0Var.e = i - Integer.MIN_VALUE;
            } else {
                qqj0Var = new qqj0(this, x1bVar);
            }
        } else {
            qqj0Var = new qqj0(this, x1bVar);
        }
        qqj0 qqj0Var2 = qqj0Var;
        Object obj = qqj0Var2.c;
        Object obj2 = y5b.a;
        int i2 = qqj0Var2.e;
        if (i2 == 0) {
            uj50.b(obj);
            vtw<a> vtwVar = this.l;
            if (vtwVar == null) {
                Intrinsics.n("commonUiEventFlow");
                throw null;
            }
            UiText uiTextE = vch0.e(str);
            if (uiTextE == null) {
                uiTextE = vch0.b;
            }
            UiText uiText = uiTextE;
            ResourceUiText resourceUiText = new ResourceUiText(R.string.common_functions__continue);
            ResourceUiText resourceUiText2 = new ResourceUiText(R.string.common_functions__cancel);
            cVar2 = cVar;
            qqj0Var2.a = cVar2;
            dVar2 = dVar;
            qqj0Var2.b = dVar2;
            qqj0Var2.e = 1;
            objF = b.f(vtwVar, null, null, uiText, resourceUiText, resourceUiText2, null, null, qqj0Var2, 195);
            if (objF != obj2) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        g0i0.d dVar3 = qqj0Var2.b;
        v1i0.c cVar3 = qqj0Var2.a;
        uj50.b(obj);
        dVar2 = dVar3;
        objF = obj;
        cVar2 = cVar3;
        if (!(((AlertDialogCallbackType) objF) instanceof AlertDialogCallbackType.Positive)) {
            return Unit.a;
        }
        fnj0 fnj0Var = this.k;
        if (fnj0Var == null) {
            Intrinsics.n("operation");
            throw null;
        }
        fnj0 fnj0Var2 = new fnj0(WithdrawRequest.copy$default(fnj0Var.a, 1, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194302, null), cVar2, dVar2);
        qqj0Var2.a = null;
        qqj0Var2.b = null;
        qqj0Var2.e = 2;
        Object objF2 = f(fnj0Var2, qqj0Var2);
        return objF2 == obj2 ? obj2 : objF2;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00da  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f6, code lost:
    
        if (g(r0, null, null, r11) == r2) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r27, java.lang.String r28, defpackage.x1b r29) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xqj0.c(java.lang.String, java.lang.String, x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, vt40 vt40Var, x1b x1bVar) throws Throwable {
        sqj0 sqj0Var;
        if (x1bVar instanceof sqj0) {
            sqj0Var = (sqj0) x1bVar;
            int i = sqj0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                sqj0Var.d = i - Integer.MIN_VALUE;
            } else {
                sqj0Var = new sqj0(this, x1bVar);
            }
        } else {
            sqj0Var = new sqj0(this, x1bVar);
        }
        Object objO = sqj0Var.b;
        Object obj = y5b.a;
        int i2 = sqj0Var.d;
        if (i2 == 0) {
            uj50.b(objO);
            tt40 tt40Var = new tt40(str, vt40Var);
            sqj0Var.a = str;
            sqj0Var.d = 1;
            bc6 bc6Var = new bc6(1, yzo.b(sqj0Var));
            bc6Var.q();
            vtw<m480> vtwVar = this.n;
            if (vtwVar == null) {
                Intrinsics.n("securityUiEventFlow");
                throw null;
            }
            vtwVar.a(new m480.d(tt40Var, bc6Var));
            objO = bc6Var.o();
            if (objO != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                uj50.b(objO);
                return objO;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = sqj0Var.a;
        uj50.b(objO);
        ut40 ut40Var = (ut40) objO;
        if (ut40Var instanceof ut40.b) {
            iaj<? super String, ? super m8h0, ? super Boolean, ? super Integer, Unit> iajVar = this.q;
            if (iajVar != null) {
                iajVar.d(str, m8h0.a, Boolean.TRUE, new Integer(20));
                return Unit.a;
            }
            Intrinsics.n("goTxSuccess");
            throw null;
        }
        if (!Intrinsics.g(ut40Var, ut40.a.a)) {
            uhc.a();
            return null;
        }
        xoj0 fVar = new xoj0.d.f("Cause canceled BVN verification.", null);
        sqj0Var.a = null;
        sqj0Var.d = 2;
        Object objG = g(fVar, null, null, sqj0Var);
        return objG == obj ? obj : objG;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0078 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(String str, x1b x1bVar) throws Throwable {
        tqj0 tqj0Var;
        Object objG;
        if (x1bVar instanceof tqj0) {
            tqj0Var = (tqj0) x1bVar;
            int i = tqj0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                tqj0Var.d = i - Integer.MIN_VALUE;
            } else {
                tqj0Var = new tqj0(this, x1bVar);
            }
        } else {
            tqj0Var = new tqj0(this, x1bVar);
        }
        Object objC = tqj0Var.b;
        Object obj = y5b.a;
        int i2 = tqj0Var.d;
        if (i2 == 0) {
            uj50.b(objC);
            Account account = this.h.getAccount();
            String str2 = account != null ? account.name : null;
            tqj0Var.a = str;
            tqj0Var.d = 1;
            objC = this.c.c(str2, null, tqj0Var);
            if (objC != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            str = tqj0Var.a;
            uj50.b(objC);
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    uj50.b(objC);
                    return objC;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objC);
        }
        tqj0Var.a = null;
        tqj0Var.d = 3;
        objG = g((xoj0) objC, null, null, tqj0Var);
        if (objG != obj) {
            return obj;
        }
        return objG;
        sgn sgnVar = (sgn) objC;
        vtw<tng0> vtwVar = this.o;
        if (vtwVar == null) {
            Intrinsics.n("tradeAdditionalUiEventFlow");
            throw null;
        }
        tqj0Var.a = null;
        tqj0Var.d = 2;
        objC = cog0.h(vtwVar, str, sgnVar, tqj0Var);
        if (objC != obj) {
            tqj0Var.a = null;
            tqj0Var.d = 3;
            objG = g((xoj0) objC, null, null, tqj0Var);
            if (objG != obj) {
                return objG;
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0072  */
    /* JADX WARN: Code duplicated, block: B:36:0x0075 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(g0i0.d dVar, boolean z, WithdrawRequest withdrawRequest, x1b x1bVar) throws Throwable {
        wqj0 wqj0Var;
        iw1 aVar;
        if (x1bVar instanceof wqj0) {
            wqj0Var = (wqj0) x1bVar;
            int i = wqj0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wqj0Var.c = i - Integer.MIN_VALUE;
            } else {
                wqj0Var = new wqj0(this, x1bVar);
            }
        } else {
            wqj0Var = new wqj0(this, x1bVar);
        }
        Object objA = wqj0Var.a;
        y5b y5bVar = y5b.a;
        int i2 = wqj0Var.c;
        g0i0 g0i0Var = null;
        if (i2 == 0) {
            uj50.b(objA);
            if (dVar != null) {
                return dVar;
            }
            if (!z) {
                return g0i0.e.a;
            }
            Integer bankId = withdrawRequest.getBankId();
            if (bankId != null) {
                aVar = new iw1.b(bankId.intValue());
            } else {
                String bankCode = withdrawRequest.getBankCode();
                aVar = bankCode != null ? new iw1.a(bankCode) : null;
            }
            String bankAccNum = withdrawRequest.getBankAccNum();
            if (aVar != null && bankAccNum != null) {
                lc2 lc2Var = new lc2(this, 1);
                wqj0Var.c = 1;
                objA = this.e.a(aVar, bankAccNum, lc2Var, wqj0Var);
                if (objA == y5bVar) {
                    return y5bVar;
                }
            }
            if (g0i0Var == null) {
                return g0i0.b.a;
            }
            return g0i0Var;
        }
        if (i2 != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(objA);
        g0i0Var = (g0i0) objA;
        if (g0i0Var == null) {
            return g0i0.b.a;
        }
        return g0i0Var;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0184  */
    /* JADX WARN: Code duplicated, block: B:101:0x0189  */
    /* JADX WARN: Code duplicated, block: B:103:0x018d  */
    /* JADX WARN: Code duplicated, block: B:104:0x0190  */
    /* JADX WARN: Code duplicated, block: B:106:0x0193  */
    /* JADX WARN: Code duplicated, block: B:107:0x019a  */
    /* JADX WARN: Code duplicated, block: B:109:0x019e  */
    /* JADX WARN: Code duplicated, block: B:113:0x01a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:115:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:117:0x01af  */
    /* JADX WARN: Code duplicated, block: B:121:0x01b7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:123:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:125:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:126:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:129:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:132:0x0224 A[PHI: r0 r1 r2 r5 r8 r9 r10
      0x0224: PHI (r0v13 ??) = (r0v17 ??), (r0v16 ??) binds: [B:130:0x0221, B:18:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x0224: PHI (r1v12 ??) = (r1v16 ??), (r1v17 ??) binds: [B:130:0x0221, B:18:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x0224: PHI (r2v32 java.lang.Object) = (r2v22 java.lang.Object), (r2v1 java.lang.Object) binds: [B:130:0x0221, B:18:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x0224: PHI (r5v10 int) = (r5v9 int), (r5v13 int) binds: [B:130:0x0221, B:18:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x0224: PHI (r8v8 g0i0$d) = (r8v5 g0i0$d), (r8v10 g0i0$d) binds: [B:130:0x0221, B:18:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x0224: PHI (r9v7 v1i0$c) = (r9v5 v1i0$c), (r9v8 v1i0$c) binds: [B:130:0x0221, B:18:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x0224: PHI (r10v15 ??) = (r10v18 ??), (r10v16 ??) binds: [B:130:0x0221, B:18:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:135:0x0243 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:136:0x0244  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00df  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:66:0x0108  */
    /* JADX WARN: Code duplicated, block: B:70:0x0121  */
    /* JADX WARN: Code duplicated, block: B:73:0x012b  */
    /* JADX WARN: Code duplicated, block: B:75:0x012f  */
    /* JADX WARN: Code duplicated, block: B:77:0x014f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0153  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:81:0x015b  */
    /* JADX WARN: Code duplicated, block: B:83:0x015f  */
    /* JADX WARN: Code duplicated, block: B:85:0x0165  */
    /* JADX WARN: Code duplicated, block: B:87:0x0169  */
    /* JADX WARN: Code duplicated, block: B:89:0x016d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0170  */
    /* JADX WARN: Code duplicated, block: B:93:0x0174  */
    /* JADX WARN: Code duplicated, block: B:94:0x0178  */
    /* JADX WARN: Code duplicated, block: B:97:0x017d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0181  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xqj0] */
    /* JADX WARN: Type inference failed for: r0v13, types: [xqj0] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r10v15, types: [int] */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v12, types: [int] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    public final Object f(fnj0 fnj0Var, x1b x1bVar) throws Throwable {
        uqj0 uqj0Var;
        WithdrawRequest withdrawRequest;
        y300 y300Var;
        int i;
        v1i0 v1i0Var;
        fnj0 fnj0Var2;
        int i2;
        ?? r11;
        Object objH;
        int i3;
        v1i0 v1i0Var2;
        ?? r1;
        vtw<a> vtwVar;
        vtw<kqj0> vtwVar2;
        g0i0 g0i0Var;
        v1i0.c cVar;
        g0i0.d dVar;
        String str;
        String str2;
        String strA;
        String str3;
        String str4;
        boolean z;
        WithdrawRequest withdrawRequestCopy$default;
        vtw<pdd0> vtwVar3;
        vtw<a> vtwVar4;
        vtw<a> vtwVar5;
        ?? r10;
        ?? r2;
        ?? r0;
        Object objG;
        ?? r3 = this;
        fnj0 fnj0Var3 = fnj0Var;
        if (x1bVar instanceof uqj0) {
            uqj0Var = (uqj0) x1bVar;
            int i4 = uqj0Var.B;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                uqj0Var.B = i4 - Integer.MIN_VALUE;
            } else {
                uqj0Var = new uqj0(r3, x1bVar);
            }
        } else {
            uqj0Var = new uqj0(r3, x1bVar);
        }
        Object objA = uqj0Var.z;
        y5b y5bVar = y5b.a;
        int i5 = uqj0Var.B;
        String str5 = QQWMbKFOuTf.tYHK;
        if (i5 != 0) {
            if (i5 == 1) {
                i2 = uqj0Var.v;
                y300Var = uqj0Var.c;
                withdrawRequest = uqj0Var.b;
                fnj0Var2 = uqj0Var.a;
                uj50.b(objA);
            } else {
                if (i5 == 2) {
                    int i6 = uqj0Var.w;
                    i3 = uqj0Var.v;
                    v1i0Var2 = uqj0Var.d;
                    WithdrawRequest withdrawRequest2 = uqj0Var.b;
                    uj50.b(objA);
                    withdrawRequest = withdrawRequest2;
                    r1 = i6;
                    g0i0Var = (g0i0) objA;
                    if (g0i0Var instanceof g0i0.c) {
                        vtwVar5 = r3.l;
                        if (vtwVar5 != null) {
                            Intrinsics.n(str5);
                            throw null;
                        }
                        String str6 = ((g0i0.c) g0i0Var).a;
                        StringUiText stringUiText = vch0.a;
                        b.e(vtwVar5, null, null, new StringUiText(str6), null, null, null, null, 251);
                        return Unit.a;
                    }
                    if (Intrinsics.g(g0i0Var, g0i0.b.a)) {
                        vtwVar4 = r3.l;
                        if (vtwVar4 != null) {
                            b.h(vtwVar4);
                            return Unit.a;
                        }
                        Intrinsics.n(str5);
                        throw null;
                    }
                    if (g0i0Var instanceof g0i0.a) {
                        return Unit.a;
                    }
                    if (v1i0Var2 instanceof v1i0.c) {
                        cVar = (v1i0.c) v1i0Var2;
                    } else {
                        cVar = null;
                    }
                    if (g0i0Var instanceof g0i0.d) {
                        dVar = (g0i0.d) g0i0Var;
                    } else {
                        dVar = null;
                    }
                    if (cVar != null) {
                        str = cVar.a;
                    } else {
                        str = null;
                    }
                    if (cVar != null) {
                        str2 = cVar.b;
                    } else {
                        str2 = null;
                    }
                    if (str2 != null) {
                        strA = nel.a(str2);
                    } else {
                        strA = null;
                    }
                    if (dVar == null && (str = dVar.a) != null) {
                        str3 = str;
                    } else if (cVar != null) {
                        String str7 = cVar.d;
                        str3 = str7;
                    } else {
                        str3 = null;
                    }
                    if (dVar == null && (str = dVar.b) != null) {
                        str4 = str;
                    } else if (cVar != null) {
                        String str8 = cVar.e;
                        str4 = str8;
                    } else {
                        str4 = null;
                    }
                    if (dVar != null) {
                        z = dVar.c;
                    } else {
                        z = false;
                    }
                    withdrawRequestCopy$default = WithdrawRequest.copy$default(withdrawRequest, 0, null, 0, null, null, null, null, null, null, null, null, null, null, str, strA, str3, str4, null, null, null, null, null, 4071423, null);
                    vtwVar3 = r3.r;
                    if (vtwVar3 != null) {
                        Intrinsics.n("sportyTrackingEventFlow");
                        throw null;
                    }
                    vqj0 vqj0Var = new vqj0(2, vtwVar3, vtw.class, "tryEmit", "tryEmit(Ljava/lang/Object;)Z", 12);
                    Boolean boolValueOf = Boolean.valueOf(z);
                    uqj0Var.a = null;
                    uqj0Var.b = null;
                    uqj0Var.c = null;
                    uqj0Var.d = null;
                    uqj0Var.e = cVar;
                    uqj0Var.f = dVar;
                    uqj0Var.i = r3;
                    uqj0Var.v = i3;
                    uqj0Var.w = r1;
                    uqj0Var.y = z ? 1 : 0;
                    uqj0Var.B = 3;
                    objA = r3.a.a(withdrawRequestCopy$default, vqj0Var, boolValueOf, uqj0Var);
                    if (objA != y5bVar) {
                    }
                    r0 = r3;
                    r2 = r1;
                    r10 = z;
                    return y5bVar;
                }
                if (i5 != 3) {
                    if (i5 == 4) {
                        uj50.b(objA);
                        return objA;
                    }
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i7 = uqj0Var.y;
                int i8 = uqj0Var.w;
                i3 = uqj0Var.v;
                xqj0 xqj0Var = uqj0Var.i;
                dVar = uqj0Var.f;
                cVar = uqj0Var.e;
                uj50.b(objA);
                r10 = i7;
                r0 = xqj0Var;
                r2 = i8;
            }
            r0 = r3;
            r2 = r1;
            r10 = z;
            uqj0Var.a = null;
            uqj0Var.b = null;
            uqj0Var.c = null;
            uqj0Var.d = null;
            uqj0Var.e = null;
            uqj0Var.f = null;
            uqj0Var.i = null;
            uqj0Var.v = i3;
            uqj0Var.w = r2;
            uqj0Var.y = r10;
            uqj0Var.B = 4;
            objG = r0.g((xoj0) objA, cVar, dVar, uqj0Var);
            if (objG == y5bVar) {
                return objG;
            }
            r0 = r3;
            r2 = r1;
            r10 = z;
            return y5bVar;
        }
        uj50.b(objA);
        withdrawRequest = fnj0Var3.a;
        y300Var = r3.j;
        if (y300Var == null) {
            Intrinsics.n("method");
            throw null;
        }
        i = ((y300Var instanceof y300.a) && ((y300.a) y300Var).q()) ? 1 : 0;
        v1i0Var = fnj0Var3.b;
        if (v1i0Var == null) {
            if (i == 0) {
                v1i0Var = v1i0.e.a;
                if (Intrinsics.g(v1i0Var, v1i0.a.a)) {
                    vtwVar2 = r3.p;
                    if (vtwVar2 != null) {
                        vtwVar2.a(kqj0.b.a);
                        return Unit.a;
                    }
                    Intrinsics.n("withdrawUiEventFlow");
                    throw null;
                }
                if (Intrinsics.g(v1i0Var, v1i0.b.a)) {
                    vtwVar = r3.l;
                    if (vtwVar != null) {
                        b.h(vtwVar);
                        return Unit.a;
                    }
                    Intrinsics.n(str5);
                    throw null;
                }
                r11 = (!(y300Var instanceof y300.a) && kotlin.collections.a.c(CountryCodeName.NIGERIA).contains(((y300.a) y300Var).a) && withdrawRequest.getBankAssetId() == null) ? 1 : 0;
                g0i0.d dVar2 = fnj0Var3.c;
                uqj0Var.a = null;
                uqj0Var.b = withdrawRequest;
                uqj0Var.c = null;
                uqj0Var.d = v1i0Var;
                uqj0Var.v = i;
                uqj0Var.w = r11;
                uqj0Var.B = 2;
                objH = r3.h(dVar2, r11, withdrawRequest, uqj0Var);
                if (objH != y5bVar) {
                    i3 = i;
                    v1i0Var2 = v1i0Var;
                    objA = objH;
                    r1 = r11;
                    g0i0Var = (g0i0) objA;
                    if (g0i0Var instanceof g0i0.c) {
                        vtwVar5 = r3.l;
                        if (vtwVar5 != null) {
                            Intrinsics.n(str5);
                            throw null;
                        }
                        String str9 = ((g0i0.c) g0i0Var).a;
                        StringUiText stringUiText2 = vch0.a;
                        b.e(vtwVar5, null, null, new StringUiText(str9), null, null, null, null, 251);
                        return Unit.a;
                    }
                    if (Intrinsics.g(g0i0Var, g0i0.b.a)) {
                        vtwVar4 = r3.l;
                        if (vtwVar4 != null) {
                            b.h(vtwVar4);
                            return Unit.a;
                        }
                        Intrinsics.n(str5);
                        throw null;
                    }
                    if (g0i0Var instanceof g0i0.a) {
                        return Unit.a;
                    }
                    if (v1i0Var2 instanceof v1i0.c) {
                        cVar = (v1i0.c) v1i0Var2;
                    } else {
                        cVar = null;
                    }
                    if (g0i0Var instanceof g0i0.d) {
                        dVar = (g0i0.d) g0i0Var;
                    } else {
                        dVar = null;
                    }
                    if (cVar != null) {
                        str = cVar.a;
                    } else {
                        str = null;
                    }
                    if (cVar != null) {
                        str2 = cVar.b;
                    } else {
                        str2 = null;
                    }
                    if (str2 != null) {
                        strA = nel.a(str2);
                    } else {
                        strA = null;
                    }
                    if (dVar == null) {
                        if (cVar != null) {
                            String str10 = cVar.d;
                            str3 = str10;
                        } else {
                            str3 = null;
                        }
                    } else if (cVar != null) {
                        String str11 = cVar.d;
                        str3 = str11;
                    } else {
                        str3 = null;
                    }
                    if (dVar == null) {
                        if (cVar != null) {
                            String str12 = cVar.e;
                            str4 = str12;
                        } else {
                            str4 = null;
                        }
                    } else if (cVar != null) {
                        String str13 = cVar.e;
                        str4 = str13;
                    } else {
                        str4 = null;
                    }
                    if (dVar != null) {
                        z = dVar.c;
                    } else {
                        z = false;
                    }
                    withdrawRequestCopy$default = WithdrawRequest.copy$default(withdrawRequest, 0, null, 0, null, null, null, null, null, null, null, null, null, null, str, strA, str3, str4, null, null, null, null, null, 4071423, null);
                    vtwVar3 = r3.r;
                    if (vtwVar3 != null) {
                        Intrinsics.n("sportyTrackingEventFlow");
                        throw null;
                    }
                    vqj0 vqj0Var2 = new vqj0(2, vtwVar3, vtw.class, "tryEmit", "tryEmit(Ljava/lang/Object;)Z", 12);
                    Boolean boolValueOf2 = Boolean.valueOf(z);
                    uqj0Var.a = null;
                    uqj0Var.b = null;
                    uqj0Var.c = null;
                    uqj0Var.d = null;
                    uqj0Var.e = cVar;
                    uqj0Var.f = dVar;
                    uqj0Var.i = r3;
                    uqj0Var.v = i3;
                    uqj0Var.w = r1;
                    uqj0Var.y = z ? 1 : 0;
                    uqj0Var.B = 3;
                    objA = r3.a.a(withdrawRequestCopy$default, vqj0Var2, boolValueOf2, uqj0Var);
                    if (objA != y5bVar) {
                        r0 = r3;
                        r2 = r1;
                        r10 = z;
                        uqj0Var.a = null;
                        uqj0Var.b = null;
                        uqj0Var.c = null;
                        uqj0Var.d = null;
                        uqj0Var.e = null;
                        uqj0Var.f = null;
                        uqj0Var.i = null;
                        uqj0Var.v = i3;
                        uqj0Var.w = r2;
                        uqj0Var.y = r10;
                        uqj0Var.B = 4;
                        objG = r0.g((xoj0) objA, cVar, dVar, uqj0Var);
                        if (objG == y5bVar) {
                            return objG;
                        }
                    }
                }
            } else {
                boolean z2 = withdrawRequest.getBankAssetId() == null;
                lv20 lv20Var = new lv20(r3, 1);
                uqj0Var.a = fnj0Var3;
                uqj0Var.b = withdrawRequest;
                uqj0Var.c = y300Var;
                uqj0Var.v = i;
                uqj0Var.B = 1;
                Object objA2 = r3.d.a(z2, lv20Var, uqj0Var);
                if (objA2 != y5bVar) {
                    fnj0Var2 = fnj0Var3;
                    i2 = i;
                    objA = objA2;
                }
            }
        } else {
            if (Intrinsics.g(v1i0Var, v1i0.a.a)) {
                vtwVar2 = r3.p;
                if (vtwVar2 != null) {
                    vtwVar2.a(kqj0.b.a);
                    return Unit.a;
                }
                Intrinsics.n("withdrawUiEventFlow");
                throw null;
            }
            if (Intrinsics.g(v1i0Var, v1i0.b.a)) {
                vtwVar = r3.l;
                if (vtwVar != null) {
                    b.h(vtwVar);
                    return Unit.a;
                }
                Intrinsics.n(str5);
                throw null;
            }
            if (!(y300Var instanceof y300.a)) {
            }
            g0i0.d dVar3 = fnj0Var3.c;
            uqj0Var.a = null;
            uqj0Var.b = withdrawRequest;
            uqj0Var.c = null;
            uqj0Var.d = v1i0Var;
            uqj0Var.v = i;
            uqj0Var.w = r11;
            uqj0Var.B = 2;
            objH = r3.h(dVar3, r11, withdrawRequest, uqj0Var);
            if (objH != y5bVar) {
                i3 = i;
                v1i0Var2 = v1i0Var;
                objA = objH;
                r1 = r11;
                g0i0Var = (g0i0) objA;
                if (g0i0Var instanceof g0i0.c) {
                    vtwVar5 = r3.l;
                    if (vtwVar5 != null) {
                        Intrinsics.n(str5);
                        throw null;
                    }
                    String str14 = ((g0i0.c) g0i0Var).a;
                    StringUiText stringUiText3 = vch0.a;
                    b.e(vtwVar5, null, null, new StringUiText(str14), null, null, null, null, 251);
                    return Unit.a;
                }
                if (Intrinsics.g(g0i0Var, g0i0.b.a)) {
                    vtwVar4 = r3.l;
                    if (vtwVar4 != null) {
                        b.h(vtwVar4);
                        return Unit.a;
                    }
                    Intrinsics.n(str5);
                    throw null;
                }
                if (g0i0Var instanceof g0i0.a) {
                    return Unit.a;
                }
                if (v1i0Var2 instanceof v1i0.c) {
                    cVar = (v1i0.c) v1i0Var2;
                } else {
                    cVar = null;
                }
                if (g0i0Var instanceof g0i0.d) {
                    dVar = (g0i0.d) g0i0Var;
                } else {
                    dVar = null;
                }
                if (cVar != null) {
                    str = cVar.a;
                } else {
                    str = null;
                }
                if (cVar != null) {
                    str2 = cVar.b;
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    strA = nel.a(str2);
                } else {
                    strA = null;
                }
                if (dVar == null) {
                    if (cVar != null) {
                        String str15 = cVar.d;
                        str3 = str15;
                    } else {
                        str3 = null;
                    }
                } else if (cVar != null) {
                    String str16 = cVar.d;
                    str3 = str16;
                } else {
                    str3 = null;
                }
                if (dVar == null) {
                    if (cVar != null) {
                        String str17 = cVar.e;
                        str4 = str17;
                    } else {
                        str4 = null;
                    }
                } else if (cVar != null) {
                    String str18 = cVar.e;
                    str4 = str18;
                } else {
                    str4 = null;
                }
                if (dVar != null) {
                    z = dVar.c;
                } else {
                    z = false;
                }
                withdrawRequestCopy$default = WithdrawRequest.copy$default(withdrawRequest, 0, null, 0, null, null, null, null, null, null, null, null, null, null, str, strA, str3, str4, null, null, null, null, null, 4071423, null);
                vtwVar3 = r3.r;
                if (vtwVar3 != null) {
                    Intrinsics.n("sportyTrackingEventFlow");
                    throw null;
                }
                vqj0 vqj0Var3 = new vqj0(2, vtwVar3, vtw.class, "tryEmit", "tryEmit(Ljava/lang/Object;)Z", 12);
                Boolean boolValueOf3 = Boolean.valueOf(z);
                uqj0Var.a = null;
                uqj0Var.b = null;
                uqj0Var.c = null;
                uqj0Var.d = null;
                uqj0Var.e = cVar;
                uqj0Var.f = dVar;
                uqj0Var.i = r3;
                uqj0Var.v = i3;
                uqj0Var.w = r1;
                uqj0Var.y = z ? 1 : 0;
                uqj0Var.B = 3;
                objA = r3.a.a(withdrawRequestCopy$default, vqj0Var3, boolValueOf3, uqj0Var);
                if (objA != y5bVar) {
                    r0 = r3;
                    r2 = r1;
                    r10 = z;
                    uqj0Var.a = null;
                    uqj0Var.b = null;
                    uqj0Var.c = null;
                    uqj0Var.d = null;
                    uqj0Var.e = null;
                    uqj0Var.f = null;
                    uqj0Var.i = null;
                    uqj0Var.v = i3;
                    uqj0Var.w = r2;
                    uqj0Var.y = r10;
                    uqj0Var.B = 4;
                    objG = r0.g((xoj0) objA, cVar, dVar, uqj0Var);
                    if (objG == y5bVar) {
                        return objG;
                    }
                }
            }
        }
        r0 = r3;
        r2 = r1;
        r10 = z;
        return y5bVar;
        v1i0 v1i0Var3 = (v1i0) objA;
        i = i2;
        fnj0Var3 = fnj0Var2;
        v1i0Var = v1i0Var3;
        if (Intrinsics.g(v1i0Var, v1i0.a.a)) {
            vtwVar2 = r3.p;
            if (vtwVar2 != null) {
                vtwVar2.a(kqj0.b.a);
                return Unit.a;
            }
            Intrinsics.n("withdrawUiEventFlow");
            throw null;
        }
        if (Intrinsics.g(v1i0Var, v1i0.b.a)) {
            vtwVar = r3.l;
            if (vtwVar != null) {
                b.h(vtwVar);
                return Unit.a;
            }
            Intrinsics.n(str5);
            throw null;
        }
        if (!(y300Var instanceof y300.a)) {
        }
        g0i0.d dVar4 = fnj0Var3.c;
        uqj0Var.a = null;
        uqj0Var.b = withdrawRequest;
        uqj0Var.c = null;
        uqj0Var.d = v1i0Var;
        uqj0Var.v = i;
        uqj0Var.w = r11;
        uqj0Var.B = 2;
        objH = r3.h(dVar4, r11, withdrawRequest, uqj0Var);
        if (objH != y5bVar) {
            i3 = i;
            v1i0Var2 = v1i0Var;
            objA = objH;
            r1 = r11;
            g0i0Var = (g0i0) objA;
            if (g0i0Var instanceof g0i0.c) {
                vtwVar5 = r3.l;
                if (vtwVar5 != null) {
                    Intrinsics.n(str5);
                    throw null;
                }
                String str19 = ((g0i0.c) g0i0Var).a;
                StringUiText stringUiText4 = vch0.a;
                b.e(vtwVar5, null, null, new StringUiText(str19), null, null, null, null, 251);
                return Unit.a;
            }
            if (Intrinsics.g(g0i0Var, g0i0.b.a)) {
                vtwVar4 = r3.l;
                if (vtwVar4 != null) {
                    b.h(vtwVar4);
                    return Unit.a;
                }
                Intrinsics.n(str5);
                throw null;
            }
            if (g0i0Var instanceof g0i0.a) {
                return Unit.a;
            }
            if (v1i0Var2 instanceof v1i0.c) {
                cVar = (v1i0.c) v1i0Var2;
            } else {
                cVar = null;
            }
            if (g0i0Var instanceof g0i0.d) {
                dVar = (g0i0.d) g0i0Var;
            } else {
                dVar = null;
            }
            if (cVar != null) {
                str = cVar.a;
            } else {
                str = null;
            }
            if (cVar != null) {
                str2 = cVar.b;
            } else {
                str2 = null;
            }
            if (str2 != null) {
                strA = nel.a(str2);
            } else {
                strA = null;
            }
            if (dVar == null) {
                if (cVar != null) {
                    String str110 = cVar.d;
                    str3 = str110;
                } else {
                    str3 = null;
                }
            } else if (cVar != null) {
                String str111 = cVar.d;
                str3 = str111;
            } else {
                str3 = null;
            }
            if (dVar == null) {
                if (cVar != null) {
                    String str112 = cVar.e;
                    str4 = str112;
                } else {
                    str4 = null;
                }
            } else if (cVar != null) {
                String str113 = cVar.e;
                str4 = str113;
            } else {
                str4 = null;
            }
            if (dVar != null) {
                z = dVar.c;
            } else {
                z = false;
            }
            withdrawRequestCopy$default = WithdrawRequest.copy$default(withdrawRequest, 0, null, 0, null, null, null, null, null, null, null, null, null, null, str, strA, str3, str4, null, null, null, null, null, 4071423, null);
            vtwVar3 = r3.r;
            if (vtwVar3 != null) {
                Intrinsics.n("sportyTrackingEventFlow");
                throw null;
            }
            vqj0 vqj0Var4 = new vqj0(2, vtwVar3, vtw.class, "tryEmit", "tryEmit(Ljava/lang/Object;)Z", 12);
            Boolean boolValueOf4 = Boolean.valueOf(z);
            uqj0Var.a = null;
            uqj0Var.b = null;
            uqj0Var.c = null;
            uqj0Var.d = null;
            uqj0Var.e = cVar;
            uqj0Var.f = dVar;
            uqj0Var.i = r3;
            uqj0Var.v = i3;
            uqj0Var.w = r1;
            uqj0Var.y = z ? 1 : 0;
            uqj0Var.B = 3;
            objA = r3.a.a(withdrawRequestCopy$default, vqj0Var4, boolValueOf4, uqj0Var);
            if (objA != y5bVar) {
                r0 = r3;
                r2 = r1;
                r10 = z;
                uqj0Var.a = null;
                uqj0Var.b = null;
                uqj0Var.c = null;
                uqj0Var.d = null;
                uqj0Var.e = null;
                uqj0Var.f = null;
                uqj0Var.i = null;
                uqj0Var.v = i3;
                uqj0Var.w = r2;
                uqj0Var.y = r10;
                uqj0Var.B = 4;
                objG = r0.g((xoj0) objA, cVar, dVar, uqj0Var);
                if (objG == y5bVar) {
                    return objG;
                }
            }
        }
        r0 = r3;
        r2 = r1;
        r10 = z;
        return y5bVar;
    }

    public final Object g(final xoj0 xoj0Var, v1i0.c cVar, g0i0.d dVar, x1b x1bVar) {
        ResourceUiText resourceUiText;
        UiText uiTextE;
        UiText resourceUiText2;
        if (xoj0Var instanceof xoj0.c) {
            ctb.a(this.i, xOgHBQVl.Ioofhdag, "Withdraw", ((xoj0.c) xoj0Var).a(), new Throwable("Withdraw with unknown result."));
        }
        if (xoj0Var instanceof xoj0.b) {
            xoj0.b bVar = (xoj0.b) xoj0Var;
            if (bVar instanceof xoj0.b.d) {
                xoj0.b.d dVar2 = (xoj0.b.d) xoj0Var;
                return d(dVar2.b, dVar2.c, x1bVar);
            }
            if (bVar instanceof xoj0.b.f) {
                xoj0.b.f fVar = (xoj0.b.f) xoj0Var;
                return c(fVar.b, fVar.c, x1bVar);
            }
            if (bVar instanceof xoj0.b.a) {
                return b(((xoj0.b.a) xoj0Var).a, cVar, dVar, x1bVar);
            }
            if (bVar instanceof xoj0.b.C1303b) {
                return e(((xoj0.b.C1303b) xoj0Var).b, x1bVar);
            }
            if (bVar instanceof xoj0.b.c) {
                return e(((xoj0.b.c) xoj0Var).b, x1bVar);
            }
            if (!(bVar instanceof xoj0.b.g) && !(bVar instanceof xoj0.b.e)) {
                uhc.a();
                return null;
            }
        } else {
            if (!(xoj0Var instanceof xoj0.d)) {
                uhc.a();
                return null;
            }
            xoj0.d dVar3 = (xoj0.d) xoj0Var;
            if (dVar3 instanceof xoj0.d.j) {
                iaj<? super String, ? super m8h0, ? super Boolean, ? super Integer, Unit> iajVar = this.q;
                if (iajVar == null) {
                    Intrinsics.n("goTxSuccess");
                    throw null;
                }
                xoj0.d.j jVar = (xoj0.d.j) xoj0Var;
                iajVar.d(jVar.c, jVar.b, Boolean.FALSE, new Integer(jVar.d));
            } else if (dVar3 instanceof xoj0.d.h) {
                vtw<a> vtwVar = this.l;
                if (vtwVar == null) {
                    Intrinsics.n("commonUiEventFlow");
                    throw null;
                }
                StringUiText stringUiText = vch0.a;
                gi8.c(vtwVar, null, new ResourceUiText(R.string.common_payment_providers__pending_request_content), null, null, new Function1() { // from class: mqj0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        AlertDialogCallbackType alertDialogCallbackType = (AlertDialogCallbackType) obj;
                        alertDialogCallbackType.getClass();
                        boolean z = alertDialogCallbackType instanceof AlertDialogCallbackType.Positive;
                        xqj0 xqj0Var = this.a;
                        if (z) {
                            vtw<spg0> vtwVar2 = xqj0Var.m;
                            if (vtwVar2 == null) {
                                Intrinsics.n("tradingUiEventFlow");
                                throw null;
                            }
                            vpg0.a(vtwVar2);
                        } else {
                            vtw<spg0> vtwVar3 = xqj0Var.m;
                            if (vtwVar3 == null) {
                                Intrinsics.n("tradingUiEventFlow");
                                throw null;
                            }
                            vpg0.b(vtwVar3, aqg0.j.c);
                        }
                        return Unit.a;
                    }
                }, 61);
            } else {
                int i = 2;
                if (dVar3 instanceof xoj0.d.c) {
                    vtw<a> vtwVar2 = this.l;
                    if (vtwVar2 == null) {
                        Intrinsics.n("commonUiEventFlow");
                        throw null;
                    }
                    StringUiText stringUiText2 = vch0.a;
                    ResourceUiText resourceUiText3 = new ResourceUiText(R.string.page_withdraw__bvn_verification_failed);
                    UiText uiTextE2 = vch0.e(((xoj0.d.c) xoj0Var).a);
                    if (uiTextE2 == null) {
                        uiTextE2 = new ResourceUiText(R.string.page_withdraw__too_many_failed_verification_attempts_to_ensure_tip);
                    }
                    b.e(vtwVar2, resourceUiText3, null, uiTextE2, new ResourceUiText(R.string.common_functions__ok), new ResourceUiText(R.string.common_functions__live_chat), null, new ndb(this, i), 226);
                } else if (dVar3 instanceof xoj0.d.f) {
                    if (this.g.n()) {
                        iaj<? super String, ? super m8h0, ? super Boolean, ? super Integer, Unit> iajVar2 = this.q;
                        if (iajVar2 == null) {
                            Intrinsics.n("goTxSuccess");
                            throw null;
                        }
                        iajVar2.d(((xoj0.d.f) xoj0Var).b, m8h0.b, Boolean.FALSE, new Integer(72));
                    }
                    vtw<a> vtwVar3 = this.l;
                    if (vtwVar3 == null) {
                        Intrinsics.n("commonUiEventFlow");
                        throw null;
                    }
                    StringUiText stringUiText3 = vch0.a;
                    gi8.c(vtwVar3, null, new ResourceUiText(R.string.page_withdraw__your_account_is_under_review_to_ensure_safety_and_security), null, new ResourceUiText(R.string.common_functions__contact_us), new md7(this, 3), 45);
                } else if (dVar3 instanceof xoj0.d.C1304d) {
                    vtw<a> vtwVar4 = this.l;
                    if (vtwVar4 == null) {
                        Intrinsics.n("commonUiEventFlow");
                        throw null;
                    }
                    StringUiText stringUiText4 = vch0.a;
                    ResourceUiText resourceUiText4 = new ResourceUiText(R.string.page_withdraw__amount_limit);
                    UiText uiTextE3 = vch0.e(((xoj0.d.C1304d) xoj0Var).b);
                    if (uiTextE3 == null) {
                        uiTextE3 = vch0.b;
                    }
                    b.e(vtwVar4, resourceUiText4, null, uiTextE3, null, null, null, new nd7(this, i), 218);
                } else {
                    int i2 = 1;
                    if (dVar3 instanceof xoj0.d.b0) {
                        vtw<spg0> vtwVar5 = this.m;
                        if (vtwVar5 == null) {
                            Intrinsics.n("tradingUiEventFlow");
                            throw null;
                        }
                        StringUiText stringUiText5 = vch0.a;
                        vpg0.e(vtwVar5, new ResourceUiText(R.string.page_withdraw__withdrawal_failed), vch0.d(((xoj0.d.b0) xoj0Var).a), new ResourceUiText(R.string.identity_verification__change_your_name), new od7(this, 1), 132);
                    } else if (dVar3 instanceof xoj0.d.p) {
                        vtw<a> vtwVar6 = this.l;
                        if (vtwVar6 == null) {
                            Intrinsics.n("commonUiEventFlow");
                            throw null;
                        }
                        StringUiText stringUiText6 = vch0.a;
                        vtwVar6.a(new a.i(new ResourceUiText(R.string.page_withdraw__withdrawal_failed), vch0.e(((xoj0.d.p) xoj0Var).a), new ResourceUiText(R.string.page_withdraw__reenter_and_retry), new ResourceUiText(R.string.page_withdraw__upload_bank_statement), new oqj0(this, xoj0Var), new Function0() { // from class: pqj0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                xqj0 xqj0Var = this.a;
                                vtw<kqj0> vtwVar7 = xqj0Var.p;
                                if (vtwVar7 == null) {
                                    Intrinsics.n("withdrawUiEventFlow");
                                    throw null;
                                }
                                vtwVar7.a(kqj0.a.a);
                                vtw<m480> vtwVar8 = xqj0Var.n;
                                if (vtwVar8 != null) {
                                    vtwVar8.a(new m480.g(((xoj0.d.p) xoj0Var).b));
                                    return Unit.a;
                                }
                                Intrinsics.n("securityUiEventFlow");
                                throw null;
                            }
                        }));
                    } else if (dVar3 instanceof xoj0.d.s) {
                        vtw<a> vtwVar7 = this.l;
                        if (vtwVar7 == null) {
                            Intrinsics.n("commonUiEventFlow");
                            throw null;
                        }
                        StringUiText stringUiText7 = vch0.a;
                        b.e(vtwVar7, new ResourceUiText(R.string.page_withdraw__withdrawal_failed), null, vch0.e(((xoj0.d.s) xoj0Var).a), new ResourceUiText(R.string.page_withdraw__upload_bank_statement), new ResourceUiText(R.string.common_functions__cancel), null, new lzp(1, this, xoj0Var), 226);
                    } else if (dVar3 instanceof xoj0.d.q) {
                        this.b.a();
                        vtw<a> vtwVar8 = this.l;
                        if (vtwVar8 == null) {
                            Intrinsics.n("commonUiEventFlow");
                            throw null;
                        }
                        StringUiText stringUiText8 = vch0.a;
                        b.e(vtwVar8, new ResourceUiText(R.string.page_withdraw__withdrawal_failed), null, vch0.e(((xoj0.d.q) xoj0Var).a), new ResourceUiText(R.string.common_functions__identity_verification), new ResourceUiText(R.string.common_functions__cancel), null, new fd7(this, i), 194);
                    } else if (dVar3 instanceof xoj0.d.e) {
                        dpg0 dpg0VarA = epg0.a(((xoj0.d.e) xoj0Var).a);
                        vtw<a> vtwVar9 = this.l;
                        if (vtwVar9 == null) {
                            Intrinsics.n("commonUiEventFlow");
                            throw null;
                        }
                        UiText uiTextE4 = vch0.e(dpg0VarA.a);
                        if (uiTextE4 == null) {
                            uiTextE4 = new ResourceUiText(R.string.page_withdraw__withdrawal_failed);
                        }
                        UiText uiText = uiTextE4;
                        UiText uiTextE5 = vch0.e(dpg0VarA.b);
                        if (uiTextE5 == null) {
                            uiTextE5 = vch0.b;
                        }
                        b.e(vtwVar9, uiText, uiTextE5, null, null, null, null, null, 508);
                    } else if (dVar3 instanceof xoj0.d.v) {
                        vtw<a> vtwVar10 = this.l;
                        if (vtwVar10 == null) {
                            Intrinsics.n("commonUiEventFlow");
                            throw null;
                        }
                        StringUiText stringUiText9 = vch0.a;
                        ResourceUiText resourceUiText5 = new ResourceUiText(R.string.page_withdraw__withdrawals_blocked);
                        UiText uiTextE6 = vch0.e(((xoj0.d.v) xoj0Var).a);
                        if (uiTextE6 == null) {
                            uiTextE6 = vch0.b;
                        }
                        b.e(vtwVar10, resourceUiText5, null, uiTextE6, new ResourceUiText(R.string.common_functions__home), new ResourceUiText(R.string.self_exclusion__contact_customer_service), null, new idb(this, i2), 194);
                    } else {
                        boolean z = dVar3 instanceof xoj0.d.u;
                        vtw<a> vtwVar11 = this.l;
                        if (z) {
                            if (vtwVar11 == null) {
                                Intrinsics.n("commonUiEventFlow");
                                throw null;
                            }
                            StringUiText stringUiText10 = vch0.a;
                            ResourceUiText resourceUiText6 = new ResourceUiText(R.string.page_withdraw__withdrawals_blocked);
                            UiText uiTextE7 = vch0.e(((xoj0.d.u) xoj0Var).a);
                            if (uiTextE7 == null) {
                                uiTextE7 = vch0.b;
                            }
                            b.e(vtwVar11, resourceUiText6, null, uiTextE7, new ResourceUiText(R.string.common_functions__home), new ResourceUiText(R.string.wap_profile__verified_now), null, new Function1() { // from class: nqj0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    AlertDialogCallbackType alertDialogCallbackType = (AlertDialogCallbackType) obj;
                                    alertDialogCallbackType.getClass();
                                    boolean z2 = alertDialogCallbackType instanceof AlertDialogCallbackType.Positive;
                                    xqj0 xqj0Var = this.a;
                                    if (z2) {
                                        vtw<spg0> vtwVar12 = xqj0Var.m;
                                        if (vtwVar12 == null) {
                                            Intrinsics.n("tradingUiEventFlow");
                                            throw null;
                                        }
                                        int i3 = vpg0.a;
                                        vtwVar12.a(spg0.b.a);
                                    } else if (alertDialogCallbackType instanceof AlertDialogCallbackType.Negative) {
                                        vtw<m480> vtwVar13 = xqj0Var.n;
                                        if (vtwVar13 == null) {
                                            Intrinsics.n("securityUiEventFlow");
                                            throw null;
                                        }
                                        vtwVar13.a(new m480.a(ucv.Withdraw));
                                    }
                                    return Unit.a;
                                }
                            }, 194);
                        } else if (dVar3 instanceof xoj0.d.t) {
                            if (vtwVar11 == null) {
                                Intrinsics.n("commonUiEventFlow");
                                throw null;
                            }
                            StringUiText stringUiText11 = vch0.a;
                            ResourceUiText resourceUiText7 = new ResourceUiText(R.string.page_withdraw__withdrawals_blocked);
                            UiText uiTextE8 = vch0.e(((xoj0.d.t) xoj0Var).a);
                            if (uiTextE8 == null) {
                                uiTextE8 = vch0.b;
                            }
                            b.e(vtwVar11, resourceUiText7, null, uiTextE8, new ResourceUiText(R.string.common_functions__home), new ResourceUiText(R.string.common_functions__transactions), null, new q8f0(this, 1), 194);
                        } else {
                            if (vtwVar11 == null) {
                                Intrinsics.n("commonUiEventFlow");
                                throw null;
                            }
                            boolean z2 = dVar3 instanceof xoj0.d.n;
                            if (z2) {
                                StringUiText stringUiText12 = vch0.a;
                                resourceUiText = new ResourceUiText(R.string.page_payment__error_during_transaction);
                            } else if (dVar3 instanceof xoj0.d.i) {
                                StringUiText stringUiText13 = vch0.a;
                                resourceUiText = new ResourceUiText(R.string.page_withdraw__account_limit);
                            } else {
                                StringUiText stringUiText14 = vch0.a;
                                resourceUiText = new ResourceUiText(R.string.page_withdraw__withdrawal_failed);
                            }
                            ResourceUiText resourceUiText8 = resourceUiText;
                            if (z2) {
                                uiTextE = vch0.e(((xoj0.d.n) xoj0Var).a);
                                if (uiTextE == null) {
                                    uiTextE = new ResourceUiText(R.string.page_payment__sorry_your_payment_request_has_a_problem_options_tip);
                                }
                            } else if (dVar3 instanceof xoj0.d.a) {
                                uiTextE = vch0.e(((xoj0.d.a) xoj0Var).a);
                                if (uiTextE == null) {
                                    uiTextE = new ResourceUiText(R.string.page_withdraw__account_already_frozen);
                                }
                            } else {
                                if (dVar3 instanceof xoj0.d.r) {
                                    String str = ((xoj0.d.r) xoj0Var).b;
                                    if (str == null) {
                                        str = "";
                                    }
                                    resourceUiText2 = new ResourceUiText(R.string.page_withdraw__for_the_security_of_your_funds_you_have_confirm_vfirstname_vlastname_tip__GH, ay0.S(new Object[]{str, ""}));
                                } else if (dVar3 instanceof xoj0.d.o) {
                                    uiTextE = new ResourceUiText(R.string.page_withdraw__withdrawals_to_this_bank_account_are_temporarily_restricted_pending_kyc_tip__GH);
                                } else if (dVar3 instanceof xoj0.d.k) {
                                    uiTextE = vch0.e(((xoj0.d.k) xoj0Var).a);
                                    if (uiTextE == null) {
                                        uiTextE = vch0.b;
                                    }
                                } else if (dVar3 instanceof xoj0.d.l) {
                                    uiTextE = vch0.e(((xoj0.d.l) xoj0Var).a);
                                    if (uiTextE == null) {
                                        uiTextE = vch0.b;
                                    }
                                } else if (dVar3 instanceof xoj0.d.m) {
                                    xoj0.d.m mVar = (xoj0.d.m) xoj0Var;
                                    String str2 = mVar.a;
                                    Throwable th = mVar.b;
                                    uiTextE = ((str2 == null || StringsKt.U(str2)) && th != null) ? ppf0.a(th) : vch0.e(str2);
                                } else {
                                    uiTextE = vch0.e(xoj0Var.getMessage());
                                    if (uiTextE == null) {
                                        uiTextE = vch0.b;
                                    }
                                }
                                b.e(vtwVar11, resourceUiText8, null, resourceUiText2, null, null, null, null, 474);
                            }
                            resourceUiText2 = uiTextE;
                            b.e(vtwVar11, resourceUiText8, null, resourceUiText2, null, null, null, null, 474);
                        }
                    }
                }
            }
        }
        return Unit.a;
    }
}
