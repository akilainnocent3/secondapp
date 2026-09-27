package com.bytedance.sdk.component.adexpress.hww.tq;

import com.ironsource.G5;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class ok {
    private static com.bytedance.sdk.component.adexpress.hww.sd.hww hww;

    public static void hww() {
        FileInputStream fileInputStream = null;
        try {
            try {
                File file = new File(hv.ok(), "temp_pkg_info.json");
                long length = file.length();
                Long lValueOf = Long.valueOf(length);
                if (length > 0 && file.exists() && file.isFile()) {
                    byte[] bArr = new byte[lValueOf.intValue()];
                    FileInputStream fileInputStream2 = new FileInputStream(file);
                    try {
                        fileInputStream2.read(bArr);
                        com.bytedance.sdk.component.adexpress.hww.sd.hww hwwVarHww = com.bytedance.sdk.component.adexpress.hww.sd.hww.hww(new JSONObject(new String(bArr, G5.N)));
                        if (hwwVarHww != null) {
                            hww = hwwVarHww;
                            hww.sd();
                        }
                        fileInputStream = fileInputStream2;
                    } catch (Throwable unused) {
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            fileInputStream.close();
                            return;
                        }
                        return;
                    }
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (Throwable unused2) {
            }
        } catch (IOException unused3) {
        }
    }

    public static void sd() {
        sd.hww(hv.ok(), tq(), "temp_pkg_info.json");
    }

    public static synchronized com.bytedance.sdk.component.adexpress.hww.sd.hww tq() {
        return hww;
    }

    public static void vy() {
        sd.tq(hv.ok(), tq(), "temp_pkg_info.json");
        hww = null;
    }

    public static boolean tq(com.bytedance.sdk.component.adexpress.hww.sd.hww hwwVar) {
        return sd.sd(tq(), hwwVar);
    }

    public static synchronized void hww(com.bytedance.sdk.component.adexpress.hww.sd.hww hwwVar) {
        if (hwwVar != null) {
            if (hwwVar.ok()) {
                hww = hwwVar;
            }
        }
    }

    public static boolean hww(String str) {
        return sd.hww(tq(), str);
    }
}
