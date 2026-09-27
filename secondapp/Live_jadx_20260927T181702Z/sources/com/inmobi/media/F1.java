package com.inmobi.media;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class F1 {
    public static boolean a(Context context, String url, InterfaceC3870nh redirectionValidator, String api, InterfaceC3837m9 interfaceC3837m9) {
        kotlin.jvm.internal.m0.p(context, "context");
        kotlin.jvm.internal.m0.p(url, "url");
        kotlin.jvm.internal.m0.p(redirectionValidator, "redirectionValidator");
        kotlin.jvm.internal.m0.p(api, "api");
        if (interfaceC3837m9 != null) {
            ((C3862n9) interfaceC3837m9).c("AppstoreLinkHandler", "In appStoreLinkHandled");
        }
        kotlin.jvm.internal.m0.p(url, "url");
        if (url.length() != 0) {
            Uri uri = Uri.parse(url);
            if (kotlin.jvm.internal.m0.g("market", uri.getScheme()) || kotlin.jvm.internal.m0.g("play.google.com", uri.getHost()) || kotlin.jvm.internal.m0.g("market.android.com", uri.getHost())) {
                Uri uri2 = Uri.parse(url);
                if (context != null) {
                    try {
                        context.getPackageManager().getPackageInfo("com.android.vending", 0);
                        if (!redirectionValidator.c()) {
                            redirectionValidator.a("EX_" + api);
                            return false;
                        }
                        try {
                            Intent intent = new Intent("android.intent.action.VIEW", uri2);
                            intent.setPackage("com.android.vending");
                            intent.addFlags(268435456);
                            context.startActivity(intent);
                            if (interfaceC3837m9 != null) {
                                ((C3862n9) interfaceC3837m9).c("AppstoreLinkHandler", "Playstore link handled successfully");
                            }
                            return true;
                        } catch (IllegalArgumentException e10) {
                            if (interfaceC3837m9 != null) {
                                ((C3862n9) interfaceC3837m9).c("AppstoreLinkHandler", "IllegalArgumentException: Processing appStoreLinkHandling: " + e10.getMessage());
                            }
                            return false;
                        } catch (Exception e11) {
                            if (interfaceC3837m9 != null) {
                                ((C3862n9) interfaceC3837m9).c("AppstoreLinkHandler", "ActivityNotFoundException: Processing appStoreLinkHandling: " + e11.getMessage());
                            }
                            return false;
                        }
                    } catch (PackageManager.NameNotFoundException e12) {
                        e12.printStackTrace();
                    }
                }
                int iA = AbstractC3808l5.a(context, url, redirectionValidator, api, interfaceC3837m9);
                if (iA != 0 && iA != 1) {
                    return false;
                }
                if (interfaceC3837m9 != null) {
                    ((C3862n9) interfaceC3837m9).c("AppstoreLinkHandler", "Playstore link handled successfully");
                }
                return true;
            }
        }
        return false;
    }
}
