package com.iab.omid.library.startio.attestation;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class d {
    public b a(String str, Context context) {
        try {
            if (str == null) {
                com.iab.omid.library.startio.utils.d.b("Cannot create mechanism: Mechanism name cannot be null");
                return null;
            }
            if (context == null) {
                com.iab.omid.library.startio.utils.d.b("Cannot create mechanism: Context cannot be null");
                return null;
            }
            if ("FireTVFOSDAT".equals(str)) {
                return new i(context);
            }
            return null;
        } catch (Exception e10) {
            com.iab.omid.library.startio.utils.d.a("Error creating attestation mechanism: " + str, e10);
            return null;
        }
    }
}
