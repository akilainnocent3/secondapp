package com.bytedance.sdk.component.adexpress.vy;

import android.net.Uri;
import android.text.TextUtils;
import sc.c;
import u4.k0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class rs {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum hww {
        HTML("text/html"),
        CSS(c.f129748e),
        JS("application/x-javascript"),
        IMAGE("image/*");


        /* JADX INFO: renamed from: hv, reason: collision with root package name */
        private String f34497hv;

        hww(String str) {
            this.f34497hv = str;
        }

        public String hww() {
            return this.f34497hv;
        }
    }

    public static hww hww(String str) {
        hww hwwVar = hww.IMAGE;
        if (!TextUtils.isEmpty(str)) {
            try {
                String path = Uri.parse(str).getPath();
                if (path != null) {
                    if (path.endsWith(".css")) {
                        return hww.CSS;
                    }
                    if (path.endsWith(".js")) {
                        return hww.JS;
                    }
                    if (!path.endsWith(".jpg") && !path.endsWith(".gif") && !path.endsWith(".png") && !path.endsWith(".jpeg") && !path.endsWith(k0.f138597g0) && !path.endsWith(k0.f138599h0) && !path.endsWith(".ico") && path.endsWith(".html")) {
                        return hww.HTML;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return hwwVar;
    }

    public static boolean tq(String str) {
        Uri uri;
        if (TextUtils.isEmpty(str) || (uri = Uri.parse(str)) == null) {
            return false;
        }
        String path = uri.getPath();
        if (TextUtils.isEmpty(path)) {
            return false;
        }
        return path.endsWith(".gif");
    }
}
