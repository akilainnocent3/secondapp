package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class Ab {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final E0 f58380a;

    public Ab(E0 e10) {
        this.f58380a = e10;
    }

    public void a(boolean z10) {
        HashMap map = new HashMap();
        if (z10) {
            map.put(IronSourceConstants.EVENTS_PUBLISHER_LOAD, Boolean.TRUE);
        }
        this.f58380a.a(B0.LOAD_AD, map);
    }

    public void b(int i10) {
        HashMap map = new HashMap();
        map.put("errorCode", Integer.valueOf(i10));
        this.f58380a.a(B0.SKIP_RELOAD_AD, map);
    }

    public void a() {
        this.f58380a.a(B0.RELOAD_AD, new HashMap());
    }

    public void b(long j10, int i10) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j10));
        map.put("errorCode", Integer.valueOf(i10));
        this.f58380a.a(B0.RELOAD_AD_NO_FILL, map);
    }

    public void a(int i10) {
        HashMap map = new HashMap();
        map.put("sessionDepth", Integer.valueOf(i10));
        this.f58380a.a(B0.DESTROY_AD, map);
    }

    public void a(long j10, boolean z10) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j10));
        if (z10) {
            map.put(IronSourceConstants.EVENTS_PUBLISHER_LOAD, Boolean.TRUE);
        }
        this.f58380a.a(B0.LOAD_AD_SUCCESS, map);
    }

    public void a(long j10) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j10));
        this.f58380a.a(B0.RELOAD_AD_SUCCESS, map);
    }

    public void a(long j10, int i10, boolean z10) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j10));
        map.put("errorCode", Integer.valueOf(i10));
        if (z10) {
            map.put(IronSourceConstants.EVENTS_PUBLISHER_LOAD, Boolean.TRUE);
        }
        this.f58380a.a(B0.LOAD_AD_FAILED, map);
    }

    public void a(long j10, int i10, String str, boolean z10) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j10));
        map.put("errorCode", Integer.valueOf(i10));
        if (!TextUtils.isEmpty(str)) {
            map.put("reason", str);
        }
        if (z10) {
            map.put(IronSourceConstants.EVENTS_PUBLISHER_LOAD, Boolean.TRUE);
        }
        this.f58380a.a(B0.LOAD_AD_FAILED_WITH_REASON, map);
    }

    public void a(long j10, int i10, String str) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j10));
        map.put("errorCode", Integer.valueOf(i10));
        if (!TextUtils.isEmpty(str)) {
            map.put("reason", str);
        }
        this.f58380a.a(B0.RELOAD_AD_FAILED_WITH_REASON, map);
    }

    public void a(boolean z10, long j10, boolean z11) {
        B0 b10;
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j10));
        if (z11) {
            map.put("errorCode", Integer.valueOf(IronSourceError.ERROR_RV_EXPIRED_ADS));
            map.put("reason", "loaded ads are expired");
        }
        E0 e10 = this.f58380a;
        if (z10) {
            b10 = B0.AD_AVAILABILITY_CHANGED_TRUE;
        } else {
            b10 = B0.AD_AVAILABILITY_CHANGED_FALSE;
        }
        e10.a(b10, map);
    }

    public void a(long j10, int i10) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j10));
        map.put("errorCode", Integer.valueOf(i10));
        this.f58380a.a(B0.LOAD_AD_NO_FILL, map);
    }

    public void a(Boolean bool, String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("reason", str);
        }
        this.f58380a.a(bool.booleanValue() ? B0.AD_READY_TRUE : B0.AD_READY_FALSE, map);
    }
}
