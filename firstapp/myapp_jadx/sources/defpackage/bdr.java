package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import android.widget.Toast;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class bdr {
    public static final void a(final idr idrVar, final Function0 function0, final Function1 function1, a aVar, final int i) {
        int i2;
        b bVar;
        b bVarI = aVar.i(474364714);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(idrVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function1) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            bVar = bVarI;
            v1w.a(function0, h.j(v8j0.c(d.a.b), 0.0f, 24.0f, 0.0f, 0.0f, 13), v1w.g(true, null, bVarI, 6, 2), 0.0f, false, j060.e(8.0f, 8.0f, 0.0f, 0.0f, 12), ((lib0) bVarI.O(oib0.a)).i0, 0L, j58.l, xa9.a, new scr(), null, pp8.b(73777288, new gaj() { // from class: tcr
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((j78) obj).getClass();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        t5q.a(0, aVar2);
                        bdr.d(idrVar, function0, function1, aVar2, 0);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVar, ((i2 >> 3) & 14) | 805306368, 3078, 4504);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ucr
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    bdr.a(idrVar, function0, function1, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(int i, a aVar, Function0 function0, Function1 function1) {
        Function1 function2;
        Function0 function3 = function0;
        b bVarI = aVar.i(-778640763);
        int i2 = (bVarI.A(function3) ? 4 : 2) | i | (bVarI.A(function1) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            w8i0 w8i0VarA = zdt.a(bVarI);
            if (w8i0VarA == null) {
                ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            ber berVar = (ber) p8i0.a(jq40.a(ber.class), w8i0VarA, null, cll.a(w8i0VarA, bVarI), w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, bVarI);
            ytw ytwVarC = wyh.c(berVar.C, bVarI, 0, 7);
            ms7 ms7Var = (ms7) bVarI.O(kna.f);
            qyd0 qyd0Var = AndroidCompositionLocals_androidKt.b;
            Context context = (Context) bVarI.O(qyd0Var);
            Context applicationContext = ((Context) bVarI.O(qyd0Var)).getApplicationContext();
            boolean zM = bVarI.M(applicationContext);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (zM || objY == c0042a) {
                applicationContext.getClass();
                objY = ((hdr) qag.a(applicationContext, hdr.class)).q();
                bVarI.r(objY);
            }
            yha0 yha0Var = (yha0) objY;
            ku90<cdr> ku90Var = berVar.B;
            boolean zA = ((i2 & 14) == 4) | bVarI.A(ms7Var) | bVarI.A(context) | bVarI.A(yha0Var) | ((i2 & 112) == 32);
            Object objY2 = bVarI.y();
            if (zA || objY2 == c0042a) {
                wcr wcrVar = new wcr(function3, ms7Var, context, yha0Var, function1, null);
                bVarI.r(wcrVar);
                objY2 = wcrVar;
            }
            function2 = function1;
            abs.b(ku90Var, null, null, (gaj) objY2, bVarI, 0);
            idr idrVar = (idr) ytwVarC.getValue();
            boolean zA2 = bVarI.A(berVar);
            Object objY3 = bVarI.y();
            if (zA2 || objY3 == c0042a) {
                objY3 = new xcr(1, berVar, ber.class, "handleAction", "handleAction(Lcom/sportybet/feature/luckynumber/showoff/presentation/LNShowOffAction;)V", 0);
                bVarI.r(objY3);
            }
            a(idrVar, function3, (Function1) ((chp) objY3), bVarI, (i2 << 3) & 112);
        } else {
            function3 = function3;
            function2 = function1;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new rx3(function3, function2, i, 1);
        }
    }

    public static final void c(final idr.a aVar, final Function1<? super jcr, Unit> function1, a aVar2, final int i) {
        int i2;
        her herVar = aVar.a;
        b bVarI = aVar2.i(33036498);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function1) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            d5q d5qVar = aVar.b;
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (herVar != null) {
                bVarI.N(642951021);
                String str = herVar.a;
                String str2 = herVar.b;
                String str3 = herVar.c;
                boolean z = (i2 & 112) == 32;
                Object objY = bVarI.y();
                if (z || objY == c0042a) {
                    objY = new Function1() { // from class: mcr
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            function1.invoke(new jcr.e(((Boolean) obj).booleanValue()));
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY);
                }
                hxg0.a(str, str2, str3, (Function1) objY, bVarI, 0);
                bVarI.X(false);
            } else {
                bVarI.N(643261424);
                bVarI.X(false);
            }
            if (d5qVar != null) {
                bVarI.N(643308730);
                boolean z2 = (i2 & 112) == 32;
                Object objY2 = bVarI.y();
                if (z2 || objY2 == c0042a) {
                    objY2 = new Function1() { // from class: pcr
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            function1.invoke(new jcr.a(((Boolean) obj).booleanValue()));
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY2);
                }
                q5q.g(d5qVar, (Function1) objY2, bVarI, 0);
                bVarI.X(false);
            } else {
                bVarI.N(643514384);
                bVarI.X(false);
            }
            d.a aVar3 = d.a.b;
            d dVarI = j.i(j.g(aVar3, 1.0f), 276.0f);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarI);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            q330.a(j.r(aVar3, 39.0f), ((lib0) bVarI.O(oib0.a)).P, 4.5f, 0L, 0, 0.0f, bVarI, 390, 56);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: qcr
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    bdr.c(aVar, function1, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(final idr idrVar, final Function0<Unit> function0, final Function1<? super jcr, Unit> function1, a aVar, final int i) {
        b bVarI = aVar.i(-467857000);
        int i2 = (bVarI.M(idrVar) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function1) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            i78 i78VarA = g78.a(new kw0.i(((cjb0) bVarI.O(ejb0.a)).f, true, new hw0()), ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d.a aVar2 = d.a.b;
            d dVarC = c.c(bVarI, aVar2);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            e(function0, bVarI, (i2 >> 3) & 14);
            d dVarG = j.g(aVar2, 1.0f);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = new vcr();
                bVarI.r(objY);
            }
            Function1 function2 = (Function1) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = new nnc(1);
                bVarI.r(objY2);
            }
            androidx.compose.animation.a.b(idrVar, dVarG, function2, null, null, (Function1) objY2, pp8.b(397559080, new iaj() { // from class: ncr
                @Override // defpackage.iaj
                public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
                    idr idrVar2 = (idr) obj2;
                    a aVar4 = (a) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    ((pf0) obj).getClass();
                    idrVar2.getClass();
                    if ((iIntValue & 48) == 0) {
                        iIntValue |= aVar4.M(idrVar2) ? 32 : 16;
                    }
                    if (aVar4.q(iIntValue & 1, (iIntValue & 145) != 144)) {
                        boolean z = idrVar2 instanceof idr.a;
                        Function1 function3 = function1;
                        if (z) {
                            aVar4.N(-197811080);
                            bdr.c((idr.a) idrVar2, function3, aVar4, (iIntValue >> 3) & 14);
                            aVar4.H();
                        } else {
                            if (!(idrVar2 instanceof idr.b)) {
                                throw rg.a(-197812663, aVar4);
                            }
                            aVar4.N(-197805981);
                            xdr.a((idr.b) idrVar2, function3, aVar4, (iIntValue >> 3) & 14);
                            aVar4.H();
                        }
                    } else {
                        aVar4.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, (i2 & 14) | 1769904, 24);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ocr
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    bdr.d(idrVar, function0, function1, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(final Function0<Unit> function0, a aVar, final int i) {
        int i2;
        b bVarI = aVar.i(-1776592582);
        if ((i & 6) == 0) {
            i2 = (bVarI.A(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            d.a aVar2 = d.a.b;
            d dVarG = j.g(h.h(aVar2, 20.0f, 0.0f, 2), 1.0f);
            d160 d160VarA = b160.a(new kw0.i(16.0f, true, new hw0()), ht.a.j, bVarI, 6);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarG);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            LayoutWeightElement layoutWeightElementA = yy.a(bVarI, dVarC, yka.a.d, 1.0f, true);
            String strA = cb40.a(R.string.common_functions__show_off_your_bet, new Object[0], bVarI);
            imf0 imf0Var = ((ijb0) bVarI.O(kjb0.a)).d;
            qyd0 qyd0Var = oib0.a;
            lkf0.d(strA, layoutWeightElementA, ((lib0) bVarI.O(qyd0Var)).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0Var, bVarI, 0, 0, 131064);
            bVarI = bVarI;
            d dVarR = j.r(aVar2, 16.0f);
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = rzk.a(bVarI);
            }
            h6n.b(erz.a(R.drawable.ic_quick_market_close, 0, bVarI), AnalyticsParam.STORY_SKIP_REASON_CLOSE, h.f(androidx.compose.foundation.d.b(dVarR, (psw) objY, ut50.b(20.0f, 4, 0L, false), false, null, function0, 28), 2.0f), ((lib0) bVarI.O(qyd0Var)).P, bVarI, 48, 0);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: rcr
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    bdr.e(function0, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public static final Object f(cdr.b bVar, Function0 function0, ms7 ms7Var, Context context, yha0 yha0Var, x1b x1bVar) {
        ycr ycrVar;
        Function0 function1;
        Context context2 = context;
        if (x1bVar instanceof ycr) {
            ycrVar = (ycr) x1bVar;
            int i = ycrVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ycrVar.d = i - Integer.MIN_VALUE;
            } else {
                ycrVar = new ycr(x1bVar);
            }
        } else {
            ycrVar = new ycr(x1bVar);
        }
        Object obj = ycrVar.c;
        y5b y5bVar = y5b.a;
        int i2 = ycrVar.d;
        Activity activity = null;
        if (i2 == 0) {
            uj50.b(obj);
            bcr bcrVar = bVar.a;
            String str = bVar.b;
            String str2 = bVar.c;
            ResourceUiText resourceUiText = bVar.d;
            int iOrdinal = bcrVar.ordinal();
            if (iOrdinal == 0) {
                ClipData clipDataNewPlainText = ClipData.newPlainText(sn5.b(context2, R.string.page_instant_virtual__show_off, new Object[0]), resourceUiText.e(context2).toString() + " " + str);
                clipDataNewPlainText.getClass();
                ks7 ks7Var = new ks7(clipDataNewPlainText);
                function1 = function0;
                ycrVar.a = function1;
                ycrVar.b = context2;
                ycrVar.d = 1;
                if (ms7Var.b(ks7Var) == y5bVar) {
                    return y5bVar;
                }
            } else if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4) {
                Context baseContext = context2;
                while (true) {
                    if (!(baseContext instanceof Activity)) {
                        if (!(baseContext instanceof ContextWrapper)) {
                            break;
                        }
                        baseContext = ((ContextWrapper) baseContext).getBaseContext();
                        baseContext.getClass();
                    } else {
                        activity = (Activity) baseContext;
                        break;
                    }
                }
                aga0 aga0Var = bVar.a.a;
                if (activity == null || aga0Var == null || StringsKt.U(str)) {
                    yha0Var.a(context2, new dha0.f(""));
                    return Unit.a;
                }
                if (!yha0Var.e(aga0Var)) {
                    yha0Var.c(activity, new dha0.a(aga0Var));
                    return Unit.a;
                }
                yha0Var.d(activity, new dha0.e(aga0Var, bVar.b, e190.d, null, resourceUiText.g(context2), null, g(context2, str2), null, null, null));
            } else {
                if (iOrdinal != 5) {
                    uhc.a();
                    return null;
                }
                Context baseContext2 = context2;
                while (true) {
                    if (!(baseContext2 instanceof Activity)) {
                        if (!(baseContext2 instanceof ContextWrapper)) {
                            break;
                        }
                        baseContext2 = ((ContextWrapper) baseContext2).getBaseContext();
                        baseContext2.getClass();
                    } else {
                        activity = (Activity) baseContext2;
                        break;
                    }
                }
                if (activity == null) {
                    return Unit.a;
                }
                yha0Var.b(activity, new dha0.c(bVar.b, g(context2, str2), e190.d, null, resourceUiText.g(context2), null));
            }
            return Unit.a;
        }
        if (i2 != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        Context context3 = ycrVar.b;
        Function0 function2 = ycrVar.a;
        uj50.b(obj);
        context2 = context3;
        function1 = function2;
        Toast.makeText(context2, sn5.b(context2, R.string.page_lucky_numbers__copy_link_successfully_toast_message, new Object[0]), 0).show();
        function1.invoke();
        return Unit.a;
    }

    public static final Uri g(Context context, String str) {
        Object bVar;
        File file = new File(str);
        if (!file.exists() || !file.isFile()) {
            file = null;
        }
        if (file == null) {
            return null;
        }
        try {
            zi50.a aVar = zi50.b;
            bVar = mkh.c(context, context.getPackageName() + ".fileprovider", file);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        return (Uri) (bVar instanceof zi50.b ? null : bVar);
    }
}
