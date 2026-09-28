package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes6.dex */
public final class o4w {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[s9s.a.values().length];
            try {
                iArr[s9s.a.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s9s.a.ON_PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s9s.a.ON_DESTROY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final void a(final int i, final int i2, androidx.compose.runtime.a aVar, d dVar, final String str, final Function0 function0, final boolean z) {
        final d dVar2;
        function0.getClass();
        b bVarI = aVar.i(-336541120);
        int i3 = (bVarI.b(z) ? 4 : 2) | i2 | 48 | (bVarI.A(function0) ? 256 : 128) | (bVarI.M(str) ? 2048 : 1024) | (bVarI.d(i) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if (bVarI.q(i3 & 1, (i3 & 9363) != 9362)) {
            qyd0 qyd0Var = AndroidCompositionLocals_androidKt.b;
            Context context = (Context) bVarI.O(qyd0Var);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = new WebView(context);
                bVarI.r(objY);
            }
            final WebView webView = (WebView) objY;
            webView.getClass();
            boolean zM = bVarI.M(webView);
            Object objY2 = bVarI.y();
            if (zM || objY2 == c0042a) {
                objY2 = new cbs() { // from class: n4w
                    @Override // defpackage.cbs
                    public final void F0(ibs ibsVar, s9s.a aVar2) {
                        int i4 = o4w.a.a[aVar2.ordinal()];
                        WebView webView2 = webView;
                        if (i4 == 1) {
                            webView2.onResume();
                        } else if (i4 == 2) {
                            webView2.onPause();
                        } else {
                            if (i4 != 3) {
                                return;
                            }
                            webView2.destroy();
                        }
                    }
                };
                bVarI.r(objY2);
            }
            final cbs cbsVar = (cbs) objY2;
            final s9s lifecycle = ((ibs) bVarI.O(ndt.a)).getLifecycle();
            boolean zA = bVarI.A(lifecycle) | bVarI.A(cbsVar);
            Object objY3 = bVarI.y();
            if (zA || objY3 == c0042a) {
                objY3 = new Function1() { // from class: m4w
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ((use) obj).getClass();
                        s9s s9sVar = lifecycle;
                        cbs cbsVar2 = cbsVar;
                        s9sVar.a(cbsVar2);
                        return new p4w(s9sVar, cbsVar2);
                    }
                };
                bVarI.r(objY3);
            }
            xvf.c(lifecycle, (Function1) objY3, bVarI);
            u60.a(function0, new yle(false, false, false), pp8.b(-1948418807, new Function2() { // from class: i4w
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        d.a aVar3 = d.a.b;
                        d dVarI = j.i(androidx.compose.foundation.a.b(androidx.compose.ui.platform.d.a(aVar3, "ManualCloseWebViewDialog"), c68.a(R.color.background_general_primary, aVar2), zk40.a), ((Configuration) aVar2.O(AndroidCompositionLocals_androidKt.a)).screenHeightDp);
                        i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar2, 0);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = c.c(aVar2, dVarI);
                        yka.k.getClass();
                        tsr.a aVar4 = yka.a.b;
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar4);
                        } else {
                            aVar2.p();
                        }
                        yka.a.b bVar = yka.a.f;
                        hlh0.a(aVar2, i78VarA, bVar);
                        yka.a.d dVar3 = yka.a.e;
                        hlh0.a(aVar2, ne00VarO, dVar3);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        yka.a.c cVar = yka.a.d;
                        hlh0.a(aVar2, dVarC, cVar);
                        d dVarI2 = j.i(h.h(j.g(aVar3, 1.0f), 16.0f, 0.0f, 2), 48.0f);
                        aiv aivVarC = g75.c(ht.a.a, false);
                        int iHashCode2 = Long.hashCode(aVar2.m());
                        ne00 ne00VarO2 = aVar2.o();
                        d dVarC2 = c.c(aVar2, dVarI2);
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar4);
                        } else {
                            aVar2.p();
                        }
                        hlh0.a(aVar2, aivVarC, bVar);
                        hlh0.a(aVar2, ne00VarO2, dVar3);
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                            j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                        }
                        hlh0.a(aVar2, dVarC2, cVar);
                        crz crzVarA = erz.a(R.drawable.spr_ic_cancel_white, 0, aVar2);
                        long jA = c68.a(R.color.text_type1_secondary, aVar2);
                        final Function0 function1 = function0;
                        boolean zM2 = aVar2.M(function1);
                        Object objY4 = aVar2.y();
                        a.C0041a.C0042a c0042a2 = a.C0041a.a;
                        if (zM2 || objY4 == c0042a2) {
                            objY4 = new k4w(function1, 0);
                            aVar2.r(objY4);
                        }
                        h6n.b(crzVarA, null, androidx.compose.foundation.layout.d.a.b(j.r(g3w.f(aVar3, true, (Function0) objY4), 18.0f), ht.a.f), jA, aVar2, 48, 0);
                        aVar2.s();
                        ty0.a(aVar2, j.w(aVar3, 8.0f));
                        final WebView webView2 = webView;
                        boolean zA2 = aVar2.A(webView2);
                        final boolean z2 = z;
                        boolean zB = zA2 | aVar2.b(z2);
                        final int i4 = i;
                        boolean zD = zB | aVar2.d(i4) | aVar2.M(function1);
                        final String str2 = str;
                        boolean zM3 = aVar2.M(str2) | zD;
                        Object objY5 = aVar2.y();
                        if (zM3 || objY5 == c0042a2) {
                            Function1 function2 = new Function1() { // from class: l4w
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    ((Context) obj3).getClass();
                                    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                                    WebView webView3 = webView2;
                                    webView3.setLayoutParams(layoutParams);
                                    webView3.getSettings().setSupportZoom(true);
                                    webView3.getSettings().setAllowFileAccess(true);
                                    webView3.getSettings().setAllowFileAccessFromFileURLs(true);
                                    webView3.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
                                    webView3.getSettings().setSupportMultipleWindows(true);
                                    webView3.getSettings().setJavaScriptEnabled(true);
                                    webView3.getSettings().setSavePassword(false);
                                    webView3.getSettings().setDomStorageEnabled(true);
                                    if (z2) {
                                        webView3.getSettings().setMixedContentMode(0);
                                    }
                                    webView3.resumeTimers();
                                    int i5 = i4;
                                    Function0 function3 = function1;
                                    webView3.setWebViewClient(new dlc(i5, function3));
                                    webView3.setWebChromeClient(new clc(function3));
                                    webView3.loadData(str2, "text/html", "UTF-8");
                                    return webView3;
                                }
                            };
                            aVar2.r(function2);
                            objY5 = function2;
                        }
                        androidx.compose.ui.viewinterop.b.a((Function1) objY5, null, null, aVar2, 0, 6);
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, ((i3 >> 6) & 14) | 432, 0);
            dVar2 = d.a.b;
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, i2, dVar2, str, function0, z) { // from class: j4w
                public final /* synthetic */ boolean a;
                public final /* synthetic */ d b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ String d;
                public final /* synthetic */ int e;

                {
                    this.a = z;
                    this.b = dVar2;
                    this.c = function0;
                    this.d = str;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    o4w.a(this.e, iA, (a) obj, this.b, this.d, this.c, this.a);
                    return Unit.a;
                }
            };
        }
    }
}
