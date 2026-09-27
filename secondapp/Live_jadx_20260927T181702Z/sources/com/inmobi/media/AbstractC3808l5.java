package com.inmobi.media;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.inmobi.media.core.config.models.TelemetryConfig;
import java.net.URISyntaxException;
import java.util.List;

/* JADX INFO: renamed from: com.inmobi.media.l5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC3808l5 {
    public static int a(Context context, String url, InterfaceC3870nh redirectionValidator, String api, InterfaceC3837m9 interfaceC3837m9) {
        kotlin.jvm.internal.m0.p(context, "context");
        kotlin.jvm.internal.m0.p(url, "url");
        kotlin.jvm.internal.m0.p(redirectionValidator, "redirectionValidator");
        kotlin.jvm.internal.m0.p(api, "api");
        if (interfaceC3837m9 != null) {
            ((C3862n9) interfaceC3837m9).c("DeeplinkHandler", "In appLinkOrDeepLinkHandled");
        }
        if (url.length() == 0) {
            if (interfaceC3837m9 == null) {
                return 2;
            }
            ((C3862n9) interfaceC3837m9).c("DeeplinkHandler", "AppLink url is Empty or null");
            return 2;
        }
        try {
            List listA = AbstractC4105x3.a(context, url);
            if (listA.isEmpty()) {
                if (interfaceC3837m9 != null) {
                    ((C3862n9) interfaceC3837m9).c("DeeplinkHandler", " Resolve Info Empty");
                }
                return b(context, url, redirectionValidator, api, interfaceC3837m9);
            }
            if (interfaceC3837m9 != null) {
                ((C3862n9) interfaceC3837m9).c("DeeplinkHandler", "Resolve Info " + ((ResolveInfo) listA.get(0)).activityInfo.name);
            }
            return a(context, url, (ResolveInfo) listA.get(0), redirectionValidator, api, interfaceC3837m9);
        } catch (URISyntaxException unused) {
            if (interfaceC3837m9 == null) {
                return 5;
            }
            ((C3862n9) interfaceC3837m9).b("DeeplinkHandler", "URISyntaxException for url: " + url);
            return 5;
        }
    }

    public static int b(Context context, String str, InterfaceC3870nh interfaceC3870nh, String str2, InterfaceC3837m9 interfaceC3837m9) {
        try {
            return AbstractC4105x3.a(context, str, interfaceC3870nh, str2);
        } catch (ActivityNotFoundException unused) {
            return a(context, str, null, interfaceC3870nh, str2, interfaceC3837m9);
        } catch (NullPointerException unused2) {
            return a(context, str, null, interfaceC3870nh, str2, interfaceC3837m9);
        } catch (SecurityException unused3) {
            if (interfaceC3837m9 != null) {
                ((C3862n9) interfaceC3837m9).b("DeeplinkHandler", "SecurityException");
            }
            return 12;
        } catch (URISyntaxException unused4) {
            if (interfaceC3837m9 != null) {
                ((C3862n9) interfaceC3837m9).b("DeeplinkHandler", "uriSyntaxException");
            }
            return 5;
        } catch (Exception e10) {
            if (interfaceC3837m9 != null) {
                ((C3862n9) interfaceC3837m9).b("DeeplinkHandler", "Exception: " + e10);
            }
            return 9;
        }
    }

    public static boolean a(String url, Context context, InterfaceC3870nh redirectionValidator, InterfaceC3837m9 interfaceC3837m9) {
        kotlin.jvm.internal.m0.p(url, "url");
        kotlin.jvm.internal.m0.p(context, "context");
        kotlin.jvm.internal.m0.p(redirectionValidator, "redirectionValidator");
        C4107x5.f58077a.getClass();
        if (!C4107x5.r() || !redirectionValidator.a()) {
            return false;
        }
        C3733i4 c3733i4 = Y3.f55798a;
        kotlin.jvm.internal.m0.p(TelemetryConfig.class, "clazz");
        if (!((TelemetryConfig) c3733i4.a(TelemetryConfig.class)).getLpConfig().getUniversalLinkEnabled()) {
            return false;
        }
        try {
            Uri uri = Uri.parse(url);
            kotlin.jvm.internal.m0.o(uri, "Uri.parse(this)");
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            kotlin.jvm.internal.m0.p(intent, "<this>");
            intent.addCategory("android.intent.category.BROWSABLE");
            kotlin.jvm.internal.m0.p(intent, "<this>");
            intent.setFlags(268436992);
            kotlin.jvm.internal.m0.p(intent, "<this>");
            kotlin.jvm.internal.m0.p(context, "context");
            context.startActivity(intent);
            if (interfaceC3837m9 == null) {
                return true;
            }
            ((C3862n9) interfaceC3837m9).a("DeeplinkHandler", "openDefaultApplication: SUCCESS");
            return true;
        } catch (ActivityNotFoundException unused) {
            if (interfaceC3837m9 != null) {
                ((C3862n9) interfaceC3837m9).b("DeeplinkHandler", "openDefaultApplication: ActivityNotFoundException");
            }
            return false;
        } catch (NullPointerException unused2) {
            if (interfaceC3837m9 != null) {
                ((C3862n9) interfaceC3837m9).b("DeeplinkHandler", "openDefaultApplication: NullPointerException");
            }
            return false;
        }
    }

    public static int a(Context context, String str, ResolveInfo resolveInfo, InterfaceC3870nh interfaceC3870nh, String str2, InterfaceC3837m9 interfaceC3837m9) {
        try {
            return AbstractC4105x3.a(context, str, resolveInfo, interfaceC3870nh, str2);
        } catch (ActivityNotFoundException unused) {
            if (interfaceC3837m9 != null) {
                ((C3862n9) interfaceC3837m9).b("DeeplinkHandler", "ActivityNotFoundException for url: " + str);
            }
            return 6;
        } catch (NullPointerException unused2) {
            if (interfaceC3837m9 != null) {
                ((C3862n9) interfaceC3837m9).b("DeeplinkHandler", "NullPointerException for url: " + str);
            }
            return 13;
        } catch (SecurityException unused3) {
            if (interfaceC3837m9 != null) {
                ((C3862n9) interfaceC3837m9).b("DeeplinkHandler", "SecurityException for url: " + str);
            }
            return 12;
        } catch (URISyntaxException unused4) {
            if (interfaceC3837m9 != null) {
                ((C3862n9) interfaceC3837m9).b("DeeplinkHandler", "URISyntaxException for url: " + str);
            }
            return 5;
        } catch (Exception e10) {
            if (interfaceC3837m9 != null) {
                ((C3862n9) interfaceC3837m9).b("DeeplinkHandler", "Exception: " + e10);
            }
            return 9;
        }
    }
}
