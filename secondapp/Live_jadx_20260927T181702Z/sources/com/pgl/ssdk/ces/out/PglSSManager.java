package com.pgl.ssdk.ces.out;

import android.content.Context;
import android.view.MotionEvent;
import com.pgl.ssdk.ces.b;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class PglSSManager {
    public static final int INIT_STATUS_FAIL_CONTEXT_NULL = 4;
    public static final int INIT_STATUS_FAIL_SO_LOADFAIL = 3;
    public static final int INIT_STATUS_FAIL_SO_MISSING = 2;
    public static final int INIT_STATUS_OK = 0;
    public static final int INIT_STATUS_UNINITIALIZE = 1;
    public static final String REPORT_SCENE_ADSHOW = "AdShow";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile PglSSManager f72066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f72067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile int f72068c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile PglSSCallBack f72069d;

    private PglSSManager(Context context, PglSSConfig pglSSConfig) {
        this.f72067b = b.a(context, pglSSConfig.getAppId(), pglSSConfig.getOVRegionType(), pglSSConfig.getCollectMode(), pglSSConfig.getAdSdkVersion());
    }

    public static int getInitStatus() {
        return b.d();
    }

    public static PglSSManager getInstance() {
        return f72066a;
    }

    public static String getLoadError() {
        if (b.f() != null) {
            return b.f().f72033b;
        }
        return null;
    }

    @DungeonFlag
    public static PglSSManager init(Context context, PglSSConfig pglSSConfig, String str, String str2, String str3, String str4) {
        if (context == null && pglSSConfig == null) {
            return null;
        }
        if (f72066a == null) {
            synchronized (PglSSManager.class) {
                try {
                    if (f72066a == null) {
                        f72066a = new PglSSManager(context, pglSSConfig);
                        if (b.d() == 0) {
                            f72066a.f72069d = pglSSConfig.getCallBack();
                            f72066a.f72067b.a(pglSSConfig.getCustomInfo());
                            f72066a.f72067b.a(str, str3, str2, str4);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f72066a;
    }

    public void checkEventVirtual(MotionEvent motionEvent) {
        if (b.d() == 0) {
            this.f72067b.a(motionEvent);
        }
    }

    public long getECForBidding() {
        return 0L;
    }

    public Map<String, String> getFeatureHash(String str, byte[] bArr) {
        if (b.d() == 0) {
            return this.f72067b.a(str, bArr);
        }
        return null;
    }

    public PglSSCallBack getPglCallBack() {
        return this.f72069d;
    }

    public String getSofChara() {
        return null;
    }

    public String getToken() {
        if (b.d() == 0) {
            return this.f72067b.g();
        }
        return null;
    }

    public void reportNow(String str, Map<String, Object> map) {
        if (b.d() == 0) {
            this.f72067b.a(str);
            int i10 = this.f72068c;
            b bVar = this.f72067b;
            if (i10 % bVar.f72050p == 0) {
                bVar.a(str, map);
            }
            this.f72068c++;
        }
    }

    public void setCustomInfo(Map<String, Object> map) {
        if (b.d() == 0) {
            this.f72067b.a(map);
        }
    }

    public void setDeviceId(String str) {
        if (b.d() == 0) {
            this.f72067b.c(str);
        }
    }

    public void setGaid(String str) {
        if (b.d() == 0) {
            this.f72067b.d(str);
        }
    }
}
