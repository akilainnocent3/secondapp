package com.mbridge.msdk.foundation.same.report;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f67194a = "DomainReport";

    public static boolean a(com.mbridge.msdk.setting.g gVar, String str) {
        if (gVar != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    int iL = gVar.L();
                    JSONArray jSONArrayJ = gVar.J();
                    JSONArray jSONArrayI = gVar.I();
                    if (jSONArrayI != null) {
                        for (int i10 = 0; i10 < jSONArrayI.length(); i10++) {
                            if (str.contains(jSONArrayI.getString(i10))) {
                                return false;
                            }
                        }
                    }
                    if (iL == 2) {
                        if (jSONArrayJ != null) {
                            for (int i11 = 0; i11 < jSONArrayJ.length(); i11++) {
                                if (str.contains(jSONArrayJ.getString(i11))) {
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                }
            } catch (Exception e10) {
                q0.b(f67194a, e10.getMessage());
            }
        }
        return true;
    }
}
