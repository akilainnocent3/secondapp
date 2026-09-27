package com.mbridge.msdk.config.component.pipeline.util;

import android.text.TextUtils;
import androidx.media3.session.fe;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class a {
    public static int a(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Throwable unused) {
            q0.b("PipelineUtil", "Pipeline convert delay time error, will use 0");
            return 0;
        }
    }

    public static String a() {
        int iLastIndexOf;
        Package r10 = com.mbridge.msdk.config.component.pipeline.a.class.getPackage();
        if (r10 != null) {
            String name = r10.getName();
            if (!TextUtils.isEmpty(name) && (iLastIndexOf = name.lastIndexOf(fe.F)) != 0) {
                String strSubstring = name.substring(0, iLastIndexOf);
                return !TextUtils.isEmpty(strSubstring) ? strSubstring : "com.mbridge.msdk.config.component";
            }
            return "com.mbridge.msdk.config.component";
        }
        return "com.mbridge.msdk.config.component";
    }
}
