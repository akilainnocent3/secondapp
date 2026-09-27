package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import com.bykv.vk.openvk.hww.hww.hww.hww.tq;
import com.bykv.vk.openvk.hww.hww.tq.hww.hww.hww;
import com.bytedance.sdk.component.utils.vgm;
import com.bytedance.sdk.openadsdk.core.bs;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class CacheDirFactory {
    public static volatile tq MEDIA_CACHE_DIR = null;
    public static String ROOT_DIR = null;
    public static final int SPLASH_USE_INTERNAL_STORAGE = 1;
    private static String hww;

    public static int getCacheType() {
        return 1;
    }

    public static String getDiskCacheDirPath(String str) {
        return getRootDir() + File.separator + str;
    }

    public static tq getICacheDir(int i10) {
        return hww();
    }

    public static String getImageCacheDir(String str) {
        if (hww == null) {
            hww = getDiskCacheDirPath(str);
        }
        return hww;
    }

    public static String getRootDir() {
        if (!TextUtils.isEmpty(ROOT_DIR)) {
            return ROOT_DIR;
        }
        File fileHww = vgm.hww(bs.hww(), com.bytedance.sdk.openadsdk.multipro.tq.sd(), "tt_ad");
        if (fileHww.isFile()) {
            fileHww.delete();
        }
        if (!fileHww.exists()) {
            fileHww.mkdirs();
        }
        String absolutePath = fileHww.getAbsolutePath();
        ROOT_DIR = absolutePath;
        return absolutePath;
    }

    private static tq hww() {
        if (MEDIA_CACHE_DIR == null) {
            synchronized (CacheDirFactory.class) {
                try {
                    if (MEDIA_CACHE_DIR == null) {
                        hww hwwVar = new hww();
                        MEDIA_CACHE_DIR = hwwVar;
                        hwwVar.hww(getRootDir());
                        MEDIA_CACHE_DIR.vy();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return MEDIA_CACHE_DIR;
    }
}
