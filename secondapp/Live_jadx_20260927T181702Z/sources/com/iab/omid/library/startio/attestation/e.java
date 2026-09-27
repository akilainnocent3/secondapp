package com.iab.omid.library.startio.attestation;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final d f53834a = new d();

    /* JADX WARN: Code duplicated, block: B:24:0x004f  */
    public static void a(Context context, String str, a aVar) {
        StringBuilder sb2;
        String str2;
        if (context == null) {
            str2 = "Attestation failed: Application Context cannot be null";
        } else if (str != null) {
            try {
                if (str.trim().isEmpty()) {
                    str2 = "Attestation failed: Mechanism name cannot be null or empty";
                } else {
                    if (aVar != null) {
                        if (c.a(context).a(str)) {
                            b bVarA = f53834a.a(str, context);
                            if (bVarA != null) {
                                bVarA.a(aVar);
                                return;
                            } else {
                                sb2 = new StringBuilder("Failed to create mechanism: ");
                                sb2.append(str);
                            }
                        } else {
                            sb2 = new StringBuilder("Mechanism not supported on this device: ");
                            sb2.append(str);
                        }
                        com.iab.omid.library.startio.utils.d.d(sb2.toString());
                        return;
                    }
                    str2 = "Attestation failed: Attestation arguments cannot be null";
                }
            } catch (Exception e10) {
                com.iab.omid.library.startio.utils.d.a("Error during attestation with mechanism: " + str, e10);
                return;
            }
        } else {
            str2 = "Attestation failed: Mechanism name cannot be null or empty";
        }
        com.iab.omid.library.startio.utils.d.b(str2);
    }
}
