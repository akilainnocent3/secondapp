package com.fyber.inneractive.sdk.util;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.iab.omid.library.fyber.ScriptInjector;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object[] f47855a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.web.e f47856b;

    public d(com.fyber.inneractive.sdk.web.e eVar) {
        this.f47856b = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0087  */
    /* JADX WARN: Code duplicated, block: B:22:0x0092  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:44:0x0109  */
    /* JADX WARN: Code duplicated, block: B:47:0x011a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0120  */
    /* JADX WARN: Code duplicated, block: B:55:0x012d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0137  */
    /* JADX WARN: Code duplicated, block: B:60:0x0144  */
    /* JADX WARN: Code duplicated, block: B:63:0x0151  */
    /* JADX WARN: Code duplicated, block: B:67:0x0166  */
    /* JADX WARN: Code duplicated, block: B:68:0x016d  */
    /* JADX WARN: Code duplicated, block: B:69:0x016f  */
    /* JADX WARN: Code duplicated, block: B:73:0x019b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:74:0x019c  */
    @Override // java.lang.Runnable
    public final void run() {
        char c10;
        com.fyber.inneractive.sdk.web.e eVar;
        boolean zA;
        String strB;
        com.fyber.inneractive.sdk.flow.x xVar;
        com.fyber.inneractive.sdk.response.e eVarB;
        boolean z10;
        com.fyber.inneractive.sdk.measurement.e eVar2;
        String string;
        StringBuilder sb2;
        com.fyber.inneractive.sdk.web.e eVar3 = this.f47856b;
        Object[] objArr = this.f47855a;
        eVar3.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String string2 = eVar3.f47948g;
        char c11 = 0;
        if (eVar3.f47949h) {
            com.fyber.inneractive.sdk.web.i iVar = eVar3.f47953l;
            String str = eVar3.f47950i;
            String str2 = eVar3.f47951j;
            com.fyber.inneractive.sdk.web.i1 i1Var = (com.fyber.inneractive.sdk.web.i1) iVar;
            i1Var.getClass();
            StringBuilder sb3 = new StringBuilder("<html><title>DigitalTurbine Ad</title><head><link rel=\"icon\" href=\"data:,\">");
            if (TextUtils.isEmpty(string2)) {
                IAlog.a("loadHtml called with an empty HTML!", new Object[0]);
                string2 = null;
            } else if (i1Var.F) {
                String strB2 = o.b("ia_js_load_monitor.txt");
                if (TextUtils.isEmpty(strB2)) {
                    c11 = 0;
                    c10 = 1;
                } else {
                    sb3.append(strB2);
                    sb3.append("<script> window.iaPreCachedAd = true; </script>");
                    IAConfigManager iAConfigManager = IAConfigManager.O;
                    zA = iAConfigManager.f44311u.f44480b.a(false, "use_js_inline");
                    c10 = 1;
                    c11 = 0;
                    if (zA || iAConfigManager.H.f44218b == null) {
                        sb3.append("<script src=\"https://cdn2.inner-active.mobi/client/ia-js-tags/dt-mraid-video-controller.js\"></script>");
                    } else {
                        sb3.append("<script type=\"text/javascript\">");
                        sb3.append(iAConfigManager.H.f44218b);
                        sb3.append("</script>");
                    }
                    if (!TextUtils.isEmpty(str)) {
                        sb3.append(str);
                    }
                    sb3.append("<script>var prevWindowOnError = window.onerror; window.onerror = function(err) {if (typeof prevWindowOnError === 'function') {prevWindowOnError.apply();} console.log('WINDOW.ONERROR Javascript Error: ' + err);};</script></head><style>body{text-align:center !important;margin:0;padding:0;}");
                    if (!TextUtils.isEmpty(str2)) {
                        sb3.append(str2);
                    }
                    sb3.append("</style><body id=\"iaBody\">");
                    if (i1Var.B && i1Var.m()) {
                        if (zA || iAConfigManager.H.f44219c == null) {
                            sb3.append("<link rel=\"stylesheet\" href=\"https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.css\">");
                        } else {
                            sb3.append("<style type=\"text/css\">");
                            sb3.append(iAConfigManager.H.f44219c);
                            sb3.append("</style>");
                        }
                        if (zA || iAConfigManager.H.f44220d == null) {
                            sb3.append("<script src=\"https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.js\"></script>");
                        } else {
                            sb3.append("<script type=\"text/javascript\">");
                            sb3.append(iAConfigManager.H.f44220d);
                            sb3.append("</script>");
                        }
                    }
                    strB = o.b("ia_mraid_bridge.txt");
                    if (!TextUtils.isEmpty(strB)) {
                        sb3.append("<div id='iaScriptBr' style='display:none;'>");
                        sb3.append(strB);
                        sb3.append("</div>");
                        if (IAlog.f47836a >= 2) {
                            sb3.append("<script type=\"text/javascript\">window.mraidbridge.loggingEnabled = true;</script>");
                        }
                    }
                    sb3.append(string2);
                    sb3.append("</body></html>");
                    if (i1Var.H != null) {
                        xVar = i1Var.f47984s;
                        if (xVar != null) {
                            eVarB = xVar.b();
                            if (eVarB == null && eVarB.J) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            eVar2 = i1Var.H;
                            string = sb3.toString();
                            if (z10) {
                                sb2 = new StringBuilder();
                                if (!TextUtils.isEmpty(eVar2.f45093c)) {
                                    sb2.append(eVar2.f45093c);
                                }
                                if (!TextUtils.isEmpty(eVar2.f45094d)) {
                                    sb2.append(eVar2.f45094d);
                                }
                                string = ScriptInjector.injectScriptContentIntoHtml(sb2.toString(), string);
                            }
                            if (TextUtils.isEmpty(eVar2.f45092b)) {
                                string2 = string;
                            } else {
                                string2 = ScriptInjector.injectScriptContentIntoHtml(eVar2.f45092b, string);
                            }
                        }
                    } else {
                        string2 = sb3.toString();
                    }
                }
                string2 = null;
            } else {
                sb3.append("<script> window.iaPreCachedAd = true; </script>");
                IAConfigManager iAConfigManager2 = IAConfigManager.O;
                zA = iAConfigManager2.f44311u.f44480b.a(false, "use_js_inline");
                c10 = 1;
                c11 = 0;
                if (zA) {
                    sb3.append("<script src=\"https://cdn2.inner-active.mobi/client/ia-js-tags/dt-mraid-video-controller.js\"></script>");
                } else {
                    sb3.append("<script src=\"https://cdn2.inner-active.mobi/client/ia-js-tags/dt-mraid-video-controller.js\"></script>");
                }
                if (!TextUtils.isEmpty(str)) {
                    sb3.append(str);
                }
                sb3.append("<script>var prevWindowOnError = window.onerror; window.onerror = function(err) {if (typeof prevWindowOnError === 'function') {prevWindowOnError.apply();} console.log('WINDOW.ONERROR Javascript Error: ' + err);};</script></head><style>body{text-align:center !important;margin:0;padding:0;}");
                if (!TextUtils.isEmpty(str2)) {
                    sb3.append(str2);
                }
                sb3.append("</style><body id=\"iaBody\">");
                if (i1Var.B) {
                    if (zA) {
                        sb3.append("<link rel=\"stylesheet\" href=\"https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.css\">");
                    } else {
                        sb3.append("<link rel=\"stylesheet\" href=\"https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.css\">");
                    }
                    if (zA) {
                        sb3.append("<script src=\"https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.js\"></script>");
                    } else {
                        sb3.append("<script src=\"https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.js\"></script>");
                    }
                }
                strB = o.b("ia_mraid_bridge.txt");
                if (!TextUtils.isEmpty(strB)) {
                    sb3.append("<div id='iaScriptBr' style='display:none;'>");
                    sb3.append(strB);
                    sb3.append("</div>");
                    if (IAlog.f47836a >= 2) {
                        sb3.append("<script type=\"text/javascript\">window.mraidbridge.loggingEnabled = true;</script>");
                    }
                }
                sb3.append(string2);
                sb3.append("</body></html>");
                if (i1Var.H != null) {
                    xVar = i1Var.f47984s;
                    if (xVar != null) {
                        string2 = null;
                    } else {
                        eVarB = xVar.b();
                        if (eVarB == null) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        eVar2 = i1Var.H;
                        string = sb3.toString();
                        if (z10) {
                            sb2 = new StringBuilder();
                            if (!TextUtils.isEmpty(eVar2.f45093c)) {
                                sb2.append(eVar2.f45093c);
                            }
                            if (!TextUtils.isEmpty(eVar2.f45094d)) {
                                sb2.append(eVar2.f45094d);
                            }
                            string = ScriptInjector.injectScriptContentIntoHtml(sb2.toString(), string);
                        }
                        if (TextUtils.isEmpty(eVar2.f45092b)) {
                            string2 = ScriptInjector.injectScriptContentIntoHtml(eVar2.f45092b, string);
                        } else {
                            string2 = string;
                        }
                    }
                } else {
                    string2 = sb3.toString();
                }
            }
            com.fyber.inneractive.sdk.web.i iVar2 = eVar3.f47953l;
            iVar2.getClass();
            String strA = IAlog.a(iVar2);
            Long lValueOf = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
            Object[] objArr2 = new Object[2];
            objArr2[c11] = strA;
            objArr2[c10] = lValueOf;
            IAlog.a("%sbuild html string took %d msec", objArr2);
            eVar = this.f47856b;
            if (eVar.f47947f) {
                return;
            }
            eVar.f47944c = new e(eVar, string2);
            eVar.a().post(this.f47856b.f47944c);
        }
        c10 = 1;
        com.fyber.inneractive.sdk.web.i iVar3 = eVar3.f47953l;
        iVar3.getClass();
        String strA2 = IAlog.a(iVar3);
        Long lValueOf2 = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
        Object[] objArr3 = new Object[2];
        objArr3[c11] = strA2;
        objArr3[c10] = lValueOf2;
        IAlog.a("%sbuild html string took %d msec", objArr3);
        eVar = this.f47856b;
        if (eVar.f47947f) {
            return;
        }
        eVar.f47944c = new e(eVar, string2);
        eVar.a().post(this.f47856b.f47944c);
    }
}
