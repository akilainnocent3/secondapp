package defpackage;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sportybet.android.account.Qr.QQWMbKFOuTf;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class t8d {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(u8d u8dVar, a aVar, final int i) {
        final u8d u8dVar2;
        b bVarI = aVar.i(-764266484);
        int i2 = i | 2;
        int i3 = 0;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                w8i0 w8i0VarA = zdt.a(bVarI);
                if (w8i0VarA == null) {
                    ib5.a(QQWMbKFOuTf.fExkeLVL);
                    return;
                }
                u8dVar2 = (u8d) p8i0.a(jq40.a(u8d.class), w8i0VarA, null, cll.a(w8i0VarA, bVarI), w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, bVarI);
            } else {
                bVarI.G();
                u8dVar2 = u8dVar;
            }
            bVarI.Y();
            final Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            d.a aVar2 = d.a.b;
            d dVarF = h.f(j.g(aVar2, 1.0f), 16.0f);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarF);
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
            hlh0.a(bVarI, dVarC, yka.a.d);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b("");
                bVarI.r(objY);
            }
            final ytw ytwVar = (ytw) objY;
            d dVarG = j.g(aVar2, 1.0f);
            String str = (String) ytwVar.getValue();
            imf0 imf0VarL = mla.l(R.style.B1_R_21, bVarI);
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = new p8d(ytwVar, i3);
                bVarI.r(objY2);
            }
            u8dVar = u8dVar2;
            hhf0.a(str, (Function1) objY2, dVarG, false, imf0VarL, jy8.a, pp8.b(-304236145, new Function2() { // from class: q8d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar4 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar4.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        rbn rbnVarB = cl10.a;
                        if (rbnVarB == null) {
                            rbn.a aVar5 = new rbn.a("Filled.PlayArrow", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            m2g m2gVar = lwh0.a;
                            soa0 soa0Var = new soa0(j58.b);
                            ArrayList arrayList = new ArrayList(32);
                            arrayList.add(new qxz.f(8.0f, 5.0f));
                            arrayList.add(new qxz.r(14.0f));
                            arrayList.add(new qxz.m(11.0f, -7.0f));
                            arrayList.add(qxz.b.c);
                            rbn.a.a(aVar5, arrayList, soa0Var);
                            rbnVarB = aVar5.b();
                            cl10.a = rbnVarB;
                        }
                        final u8d u8dVar3 = u8dVar2;
                        boolean zA = aVar4.A(u8dVar3);
                        final Context context2 = context;
                        boolean zA2 = zA | aVar4.A(context2);
                        Object objY3 = aVar4.y();
                        if (zA2 || objY3 == a.C0041a.a) {
                            final ytw ytwVar2 = ytwVar;
                            objY3 = new Function0() { // from class: s8d
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    ytw ytwVar3 = ytwVar2;
                                    String str2 = (String) ytwVar3.getValue();
                                    u8d u8dVar4 = u8dVar3;
                                    u8dVar4.getClass();
                                    str2.getClass();
                                    if (u8dVar4.a.b(str2)) {
                                        ytwVar3.setValue("");
                                    } else {
                                        Toast.makeText(context2, "unsupported", 0).show();
                                    }
                                    return Unit.a;
                                }
                            };
                            aVar4.r(objY3);
                        }
                        h6n.a(rbnVarB, null, androidx.compose.foundation.d.d(d.a.b, false, null, null, (Function0) objY3, 15), 0L, aVar4, 48, 8);
                    } else {
                        aVar4.G();
                    }
                    return Unit.a;
                }
            }, bVarI), null, null, null, false, 1, 0, null, null, bVarI, 806879664, 100663296, 8125848);
            bVarI = bVarI;
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        final u8d u8dVar3 = u8dVar;
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i) { // from class: r8d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    t8d.a(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
