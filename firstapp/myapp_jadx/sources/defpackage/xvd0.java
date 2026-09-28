package defpackage;

import android.webkit.WebView;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class xvd0 {
    public static final void a(final d dVar, final uf00 uf00Var, final String str, final h8f0 h8f0Var, final Function1 function1, a aVar, final int i) {
        b bVar;
        uf00Var.getClass();
        str.getClass();
        b bVarI = aVar.i(891798508);
        int i2 = i | (bVarI.M(uf00Var) ? 32 : 16) | (bVarI.M(str) ? 256 : 128) | (bVarI.M(h8f0Var) ? 2048 : 1024) | (bVarI.A(function1) ? 16384 : 8192);
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256) | ((57344 & i2) == 16384) | ((i2 & 7168) == 2048);
            Object objY = bVarI.y();
            if (z || objY == a.C0041a.a) {
                objY = new Function1() { // from class: tvd0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        szr szrVar = (szr) obj;
                        szrVar.getClass();
                        final uf00 uf00Var2 = uf00Var;
                        if (!uf00Var2.isEmpty()) {
                            final String str2 = str;
                            final Function1 function2 = function1;
                            szr.h(szrVar, null, new op8(-1152801604, new gaj() { // from class: vvd0
                                @Override // defpackage.gaj
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    a aVar2 = (a) obj3;
                                    int iIntValue = ((Integer) obj4).intValue();
                                    ((gwr) obj2).getClass();
                                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        mgz.b(uf00Var2, str2, function2, aVar2, 0);
                                    } else {
                                        aVar2.G();
                                    }
                                    return Unit.a;
                                }
                            }, true), 3);
                        }
                        final h8f0 h8f0Var2 = h8f0Var;
                        szr.h(szrVar, null, new op8(1489308919, new gaj() { // from class: wvd0
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                a aVar2 = (a) obj3;
                                int iIntValue = ((Integer) obj4).intValue();
                                ((gwr) obj2).getClass();
                                if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    ty0.a(aVar2, j.i(d.a.b, ((cjb0) aVar2.O(ejb0.a)).e));
                                    h8f0 h8f0Var3 = h8f0Var2;
                                    WebView webView = h8f0Var3 != null ? h8f0Var3.a : null;
                                    boolean zM = aVar2.M(h8f0Var3);
                                    Object objY2 = aVar2.y();
                                    if (zM || objY2 == a.C0041a.a) {
                                        objY2 = new v6a(h8f0Var3, 1);
                                        aVar2.r(objY2);
                                    }
                                    c0j0.a(webView, (Function0) objY2, aVar2, 0);
                                } else {
                                    aVar2.G();
                                }
                                return Unit.a;
                            }
                        }, true), 3);
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            bVar = bVarI;
            aur.a(dVar, null, null, false, null, null, null, false, null, (Function1) objY, bVar, 6, 510);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(uf00Var, str, h8f0Var, function1, i) { // from class: uvd0
                public final /* synthetic */ uf00 b;
                public final /* synthetic */ String c;
                public final /* synthetic */ h8f0 d;
                public final /* synthetic */ Function1 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(7);
                    xvd0.a(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
