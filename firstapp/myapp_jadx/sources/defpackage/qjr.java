package defpackage;

import android.content.Context;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.viewinterop.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class qjr {

    @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.webview.LNWebViewKt$LNWebView$1$1", f = "LNWebView.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ Context a;
        public final /* synthetic */ sjr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, sjr sjrVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.a = context;
            this.b = sjrVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.a, this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            this.b.i.a(r0b.b(this.a));
            return Unit.a;
        }
    }

    public static final class b implements tse {
        public final /* synthetic */ ytw a;
        public final /* synthetic */ Function1 b;

        public b(ytw ytwVar, Function1 function1) {
            this.a = ytwVar;
            this.b = function1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.tse
        public final void dispose() {
            WebView webView = (WebView) this.a.getValue();
            if (webView != null) {
                this.b.invoke(webView);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final gaj<? super WebView, ? super WebViewClient, ? super WebChromeClient, Unit> gajVar, final Function1<? super WebView, Unit> function1, final Function1<? super nvp, Unit> function2, androidx.compose.runtime.a aVar, final int i) {
        gajVar.getClass();
        function1.getClass();
        function2.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(1935681779);
        int i2 = (bVarI.A(gajVar) ? 4 : 2) | i | (bVarI.A(function1) ? 32 : 16) | (bVarI.A(function2) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            w8i0 w8i0VarA = zdt.a(bVarI);
            if (w8i0VarA == null) {
                ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            sjr sjrVar = (sjr) p8i0.a(jq40.a(sjr.class), w8i0VarA, null, cll.a(w8i0VarA, bVarI), w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, bVarI);
            final ytw ytwVarC = wyh.c(sjrVar.v, bVarI, 0, 7);
            Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            boolean zA = bVarI.A(context) | bVarI.A(sjrVar);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            String strA = null;
            if (zA || objY == c0042a) {
                objY = new a(context, sjrVar, null);
                bVarI.r(objY);
            }
            xvf.e(bVarI, context, (Function2) objY);
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = m.b(null);
                bVarI.r(objY2);
            }
            final ytw ytwVar = (ytw) objY2;
            gjr gjrVar = (gjr) ytwVarC.getValue();
            Integer numValueOf = gjrVar != null ? Integer.valueOf(gjrVar.a) : null;
            if (numValueOf == null) {
                bVarI.N(1665538105);
            } else {
                bVarI.N(1665538106);
                strA = cb40.a(numValueOf.intValue(), new Object[0], bVarI);
            }
            bVarI.X(false);
            if (strA == null) {
                strA = "";
            }
            b(strA, function2, pp8.b(1122386460, new gaj() { // from class: hjr
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    d dVar = (d) obj;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    dVar.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar2.M(dVar) ? 4 : 2;
                    }
                    if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        final gaj gajVar2 = gajVar;
                        boolean zM = aVar2.M(gajVar2);
                        Object objY3 = aVar2.y();
                        final ytw ytwVar2 = ytwVar;
                        a.C0041a.C0042a c0042a2 = a.C0041a.a;
                        if (zM || objY3 == c0042a2) {
                            objY3 = new Function1() { // from class: mjr
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    Context context2 = (Context) obj4;
                                    context2.getClass();
                                    WebView webView = new WebView(context2);
                                    webView.getSettings().setJavaScriptEnabled(true);
                                    webView.getSettings().setDomStorageEnabled(true);
                                    webView.getSettings().setMixedContentMode(2);
                                    webView.getSettings().setUseWideViewPort(true);
                                    webView.getSettings().setDatabaseEnabled(true);
                                    webView.getSettings().setLoadWithOverviewMode(true);
                                    gajVar2.invoke(webView, new WebViewClient(), new WebChromeClient());
                                    ytwVar2.setValue(webView);
                                    return webView;
                                }
                            };
                            aVar2.r(objY3);
                        }
                        Function1 function3 = (Function1) objY3;
                        ytw ytwVar3 = ytwVarC;
                        boolean zM2 = aVar2.M(ytwVar3);
                        Object objY4 = aVar2.y();
                        if (zM2 || objY4 == c0042a2) {
                            objY4 = new njr(ytwVar3, 0);
                            aVar2.r(objY4);
                        }
                        b.a(function3, dVar, (Function1) objY4, aVar2, (iIntValue << 3) & 112, 0);
                        Unit unit = Unit.a;
                        final Function1 function4 = function1;
                        boolean zM3 = aVar2.M(function4);
                        Object objY5 = aVar2.y();
                        if (zM3 || objY5 == c0042a2) {
                            objY5 = new Function1() { // from class: ojr
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    ((use) obj4).getClass();
                                    return new qjr.b(ytwVar2, function4);
                                }
                            };
                            aVar2.r(objY5);
                        }
                        xvf.c(unit, (Function1) objY5, aVar2);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, ((i2 >> 3) & 112) | 384);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function1, function2, i) { // from class: ijr
                public final /* synthetic */ Function1 b;
                public final /* synthetic */ Function1 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    qjr.a(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final String str, final Function1 function1, final op8 op8Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.b bVar;
        androidx.compose.runtime.b bVarI = aVar.i(-1645052254);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(op8Var) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            bVar = bVarI;
            hy60.a(null, pp8.b(1159899750, new jjr(str, function1), bVarI), null, null, null, 0, ((lib0) bVarI.O(oib0.a)).l0, 0L, null, pp8.b(-770864015, new gaj() { // from class: kjr
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    tmz tmzVar = (tmz) obj;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    tmzVar.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar2.M(tmzVar) ? 4 : 2;
                    }
                    if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        op8Var.invoke(j.e(h.e(d.a.b, tmzVar), 1.0f), aVar2, 0);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVar, 805306416, 445);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ljr
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    qjr.b(str, function1, op8Var, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
