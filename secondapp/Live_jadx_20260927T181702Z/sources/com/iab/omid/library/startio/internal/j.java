package com.iab.omid.library.startio.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.C4235d4;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class j {
    private static Map a(Uri uri) {
        HashMap map = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            map.put(str, uri.getQueryParameter(str));
        }
        return map;
    }

    public static void b(Uri uri) {
        String str;
        try {
            String queryParameter = uri.getQueryParameter("method");
            if (TextUtils.isEmpty(queryParameter)) {
                str = "OmidNativeUrlHandler failed to handle url [" + uri.toString() + "] as 'method' not available";
            } else if (queryParameter.hashCode() == -1407254715 && queryParameter.equals("attest")) {
                a(a(uri));
                return;
            } else {
                str = "Unknown method in OmidNativeUrlHandler.handle :" + queryParameter;
            }
            com.iab.omid.library.startio.utils.d.b(str);
        } catch (Exception e10) {
            com.iab.omid.library.startio.utils.d.a("OmidNativeUrlHandler failed to handle url [" + uri.toString() + C4235d4.j.f61462e, e10);
        }
    }

    private static void a(Map map) {
        try {
            com.iab.omid.library.startio.attestation.e.a(g.b().a().getApplicationContext(), (String) map.get("mechanism"), new com.iab.omid.library.startio.attestation.a(map));
        } catch (Exception e10) {
            com.iab.omid.library.startio.utils.d.a("Error processing attestation request in OmidNativeUrlHandler", e10);
        }
    }
}
