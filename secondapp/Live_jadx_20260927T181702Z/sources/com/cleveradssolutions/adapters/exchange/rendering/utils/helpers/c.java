package com.cleveradssolutions.adapters.exchange.rendering.utils.helpers;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.cleveradssolutions.adapters.exchange.rendering.views.browser.AdBrowserActivity;
import java.net.URISyntaxException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f42527a = "zt";

    public static void a(Context context, Intent intent) {
        if (context == null || intent == null) {
            Log.e(f42527a, "Can't start activity!");
            return;
        }
        if (!(context instanceof Activity)) {
            Log.d(f42527a, "Context is not Activity type. Intent flag FLAG_ACTIVITY_NEW_TASK added.");
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }

    public static void b(Context context, String str) {
        Intent uri;
        if (str.startsWith("intent:") || str.startsWith("android-app")) {
            try {
                uri = Intent.parseUri(str, 3);
                if (uri.getAction() == null) {
                    uri.setAction("android.intent.action.VIEW");
                }
            } catch (URISyntaxException e10) {
                throw new com.cleveradssolutions.adapters.exchange.rendering.utils.url.b(e10);
            }
        } else {
            Uri uri2 = Uri.parse(str);
            uri = new Intent("android.intent.action.VIEW", uri2);
            if ("play.google.com".equals(uri2.getHost())) {
                uri.setPackage("com.android.vending");
            }
        }
        if (f(context, uri)) {
            try {
                a(context, uri);
            } catch (ActivityNotFoundException e11) {
                throw new com.cleveradssolutions.adapters.exchange.rendering.utils.url.b(e11);
            }
        } else {
            throw new com.cleveradssolutions.adapters.exchange.rendering.utils.url.b("launchApplicationUrl: Failure. No activity was found to handle action for " + str);
        }
    }

    public static String c(String str) {
        int iIndexOf = str.indexOf("browser_fallback_url=");
        if (iIndexOf == -1) {
            return null;
        }
        int i10 = iIndexOf + 21;
        int iIndexOf2 = str.indexOf(59, i10);
        return iIndexOf2 != -1 ? str.substring(i10, iIndexOf2) : str.substring(i10);
    }

    public static void d(Context context, String str) {
        if (context == null || str == null) {
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(Uri.parse(str), "video/*");
        a(context, intent);
    }

    public static void e(Context context, String str, int i10, boolean z10, com.cleveradssolutions.adapters.exchange.rendering.listeners.b bVar) {
        boolean z11 = !com.cleveradssolutions.adapters.exchange.c.f42070b;
        if (!str.startsWith("http") || str.contains("play.google.com") || str.contains("cas_open_in_browser")) {
            z11 = false;
        }
        Intent intent = new Intent(context, (Class<?>) AdBrowserActivity.class);
        if (!z11 || !f(context, intent)) {
            try {
                b(context, str);
            } catch (Throwable th2) {
                com.cleveradssolutions.adapters.exchange.b.i(f42527a, "Start url failed", th2);
            }
            if (bVar != null) {
                bVar.a(com.cleveradssolutions.adapters.exchange.rendering.listeners.b.a.EXTERNAL_BROWSER);
                return;
            }
            return;
        }
        intent.putExtra("EXTRA_URL", str);
        intent.putExtra("densityScalingEnabled", false);
        intent.putExtra("EXTRA_ALLOW_ORIENTATION_CHANGES", true);
        intent.putExtra("EXTRA_SHOULD_FIRE_EVENTS", z10);
        intent.putExtra("EXTRA_BROADCAST_ID", i10);
        a(context, intent);
        if (bVar != null) {
            bVar.a(com.cleveradssolutions.adapters.exchange.rendering.listeners.b.a.INTERNAL_BROWSER);
        }
    }

    public static boolean f(Context context, Intent intent) {
        return context.getPackageManager().resolveActivity(intent, 65536) != null;
    }
}
