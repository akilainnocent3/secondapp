package com.mbridge.msdk.config.component.sen;

import android.text.TextUtils;
import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import java.util.HashMap;
import java.util.Map;
import w0.f;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class SenCpt extends com.mbridge.msdk.config.component.base.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static b f65648k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static Map<String, a> f65649l;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f65650h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f65651i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f65652j;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(com.mbridge.msdk.config.component.base.b bVar) {
        a(a(bVar.c(), bVar.b()));
    }

    private void h() {
        if (f65648k == null) {
            f65648k = new b();
        }
        if (f65649l == null) {
            f65649l = new HashMap();
        }
        a aVar = new a() { // from class: com.mbridge.msdk.config.component.sen.c
            @Override // com.mbridge.msdk.config.component.sen.a
            public final void a(com.mbridge.msdk.config.component.base.b bVar) {
                this.f65657a.c(bVar);
            }
        };
        f65649l.put(this.f65651i, aVar);
        f65648k.a(aVar);
        f65648k.a(g(), c(this.f65651i), this.f65652j);
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        this.f65068f = "917001";
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            if (!TextUtils.isEmpty(key)) {
                if (key.equals(com.mbridge.msdk.config.component.common.util.c.a("149"))) {
                    this.f65651i = String.valueOf(entry.getValue());
                } else if (key.equals(com.mbridge.msdk.config.component.common.util.c.a("150"))) {
                    double d10 = Double.parseDouble(String.valueOf(entry.getValue()));
                    if (d10 > 0.0d) {
                        this.f65652j = (int) (d10 * 1000.0d * 1000.0d);
                    }
                } else if (key.equals(com.mbridge.msdk.config.component.common.util.c.a(StatisticData.ERROR_CODE_NOT_FOUND))) {
                    this.f65650h = String.valueOf(entry.getValue());
                }
            }
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        Map<String, a> map;
        super.d();
        if (this.f65650h.equals(com.mbridge.msdk.config.component.common.util.c.a("310"))) {
            h();
        }
        if (!this.f65650h.equals(com.mbridge.msdk.config.component.common.util.c.a("318")) || f65648k == null || (map = f65649l) == null) {
            return;
        }
        f65648k.b(map.get(this.f65651i));
        f65649l.remove(this.f65651i);
        if (f65649l.isEmpty()) {
            f65648k.a();
            f65648k = null;
        }
    }

    private String c(String str) {
        if (com.mbridge.msdk.config.component.common.util.c.a("331").equals(str)) {
            return "accelerometer";
        }
        if (com.mbridge.msdk.config.component.common.util.c.a("332").equals(str)) {
            return "magnetic";
        }
        if (com.mbridge.msdk.config.component.common.util.c.a("333").equals(str)) {
            return "gyroscope";
        }
        return com.mbridge.msdk.config.component.common.util.c.a("334").equals(str) ? f.f141740i : str;
    }

    private int g() {
        if (com.mbridge.msdk.config.component.common.util.c.a("331").equals(this.f65651i)) {
            return 1;
        }
        if (com.mbridge.msdk.config.component.common.util.c.a("332").equals(this.f65651i)) {
            return 2;
        }
        if (com.mbridge.msdk.config.component.common.util.c.a("333").equals(this.f65651i)) {
            return 4;
        }
        return com.mbridge.msdk.config.component.common.util.c.a("334").equals(this.f65651i) ? 11 : -1;
    }
}
