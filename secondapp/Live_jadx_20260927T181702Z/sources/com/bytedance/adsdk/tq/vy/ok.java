package com.bytedance.adsdk.tq.vy;

import android.content.Context;
import android.util.Pair;
import com.bytedance.adsdk.tq.ny;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class ok {
    private final vgm hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final hu f32354tq;

    public ok(vgm vgmVar, hu huVar) {
        this.hww = vgmVar;
        this.f32354tq = huVar;
    }

    private ny<com.bytedance.adsdk.tq.vgm> sd(Context context, String str, String str2) {
        Closeable closeable = null;
        try {
            try {
                vy vyVarHww = this.f32354tq.hww(str);
                if (!vyVarHww.hww()) {
                    ny<com.bytedance.adsdk.tq.vgm> nyVar = new ny<>(new IllegalArgumentException(vyVarHww.vy()));
                    try {
                        vyVarHww.close();
                    } catch (IOException unused) {
                    }
                    return nyVar;
                }
                ny<com.bytedance.adsdk.tq.vgm> nyVarHww = hww(context, str, vyVarHww.tq(), vyVarHww.sd(), str2);
                nyVarHww.hww();
                try {
                    vyVarHww.close();
                } catch (IOException unused2) {
                }
                return nyVarHww;
            } catch (Throwable th2) {
                if (0 == 0) {
                    throw th2;
                }
                try {
                    closeable.close();
                    throw th2;
                } catch (IOException unused3) {
                    throw th2;
                }
            }
        } catch (Exception e10) {
            ny<com.bytedance.adsdk.tq.vgm> nyVar2 = new ny<>(e10);
            if (0 != 0) {
                try {
                    closeable.close();
                } catch (IOException unused4) {
                }
            }
            return nyVar2;
        }
    }

    private com.bytedance.adsdk.tq.vgm tq(Context context, String str, String str2) {
        vgm vgmVar;
        Pair<sd, InputStream> pairHww;
        if (str2 == null || (vgmVar = this.hww) == null || (pairHww = vgmVar.hww(str)) == null) {
            return null;
        }
        sd sdVar = (sd) pairHww.first;
        InputStream inputStream = (InputStream) pairHww.second;
        ny<com.bytedance.adsdk.tq.vgm> nyVarHww = sdVar == sd.ZIP ? com.bytedance.adsdk.tq.ok.hww(context, new ZipInputStream(inputStream), str2) : com.bytedance.adsdk.tq.ok.tq(inputStream, str2);
        if (nyVarHww.hww() != null) {
            return nyVarHww.hww();
        }
        return null;
    }

    public ny<com.bytedance.adsdk.tq.vgm> hww(Context context, String str, String str2) {
        com.bytedance.adsdk.tq.vgm vgmVarTq = tq(context, str, str2);
        return vgmVarTq != null ? new ny<>(vgmVarTq) : sd(context, str, str2);
    }

    private ny<com.bytedance.adsdk.tq.vgm> hww(Context context, String str, InputStream inputStream, String str2, String str3) throws IOException {
        ny<com.bytedance.adsdk.tq.vgm> nyVarHww;
        sd sdVar;
        vgm vgmVar;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (!str2.contains("application/zip") && !str2.contains("application/x-zip") && !str2.contains("application/x-zip-compressed") && !str.split("\\?")[0].endsWith(".lottie")) {
            sdVar = sd.JSON;
            nyVarHww = hww(str, inputStream, str3);
        } else {
            sd sdVar2 = sd.ZIP;
            nyVarHww = hww(context, str, inputStream, str3);
            sdVar = sdVar2;
        }
        if (str3 != null && nyVarHww.hww() != null && (vgmVar = this.hww) != null) {
            vgmVar.hww(str, sdVar);
        }
        return nyVarHww;
    }

    private ny<com.bytedance.adsdk.tq.vgm> hww(Context context, String str, InputStream inputStream, String str2) throws IOException {
        vgm vgmVar;
        if (str2 != null && (vgmVar = this.hww) != null) {
            return com.bytedance.adsdk.tq.ok.hww(context, new ZipInputStream(new FileInputStream(vgmVar.hww(str, inputStream, sd.ZIP))), str);
        }
        return com.bytedance.adsdk.tq.ok.hww(context, new ZipInputStream(inputStream), (String) null);
    }

    private ny<com.bytedance.adsdk.tq.vgm> hww(String str, InputStream inputStream, String str2) throws IOException {
        vgm vgmVar;
        if (str2 != null && (vgmVar = this.hww) != null) {
            return com.bytedance.adsdk.tq.ok.tq(new FileInputStream(vgmVar.hww(str, inputStream, sd.JSON).getAbsolutePath()), str);
        }
        return com.bytedance.adsdk.tq.ok.tq(inputStream, (String) null);
    }
}
