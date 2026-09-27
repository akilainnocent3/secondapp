package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* JADX INFO: renamed from: com.ironsource.a9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class C4186a9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final E0 f60587a;

    public C4186a9(E0 e10) {
        this.f60587a = e10;
    }

    public void a(String str, String str2) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_EXT1, str + il.b.f94863g + str2);
        this.f60587a.a(B0.INIT_STARTED, map);
    }

    public void a(long j10) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j10));
        this.f60587a.a(B0.INIT_ENDED, map);
    }

    public void a() {
        this.f60587a.a(B0.INIT_SUCCESS, null);
    }

    public void a(int i10, String str) {
        HashMap map = new HashMap();
        map.put("errorCode", Integer.valueOf(i10));
        map.put("reason", str);
        this.f60587a.a(B0.INIT_FAILED, map);
    }
}
