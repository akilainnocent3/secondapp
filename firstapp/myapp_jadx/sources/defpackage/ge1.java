package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.twilio.voice.EventKeys;

/* JADX INFO: loaded from: classes4.dex */
public final class ge1 implements uby<qov> {
    public static final ge1 a = new ge1();
    public static final hjh b = new hjh("projectNumber", be1.a(ae1.a(v630.class, new o11(1))));
    public static final hjh c = new hjh("messageId", be1.a(ae1.a(v630.class, new o11(2))));
    public static final hjh d = new hjh("instanceId", be1.a(ae1.a(v630.class, new o11(3))));
    public static final hjh e = new hjh("messageType", be1.a(ae1.a(v630.class, new o11(4))));
    public static final hjh f = new hjh("sdkPlatform", be1.a(ae1.a(v630.class, new o11(5))));
    public static final hjh g = new hjh("packageName", be1.a(ae1.a(v630.class, new o11(6))));
    public static final hjh h = new hjh("collapseKey", be1.a(ae1.a(v630.class, new o11(7))));
    public static final hjh i = new hjh(EventKeys.PRIORITY, be1.a(ae1.a(v630.class, new o11(8))));
    public static final hjh j = new hjh("ttl", be1.a(ae1.a(v630.class, new o11(9))));
    public static final hjh k = new hjh("topic", be1.a(ae1.a(v630.class, new o11(10))));
    public static final hjh l = new hjh("bulkId", be1.a(ae1.a(v630.class, new o11(11))));
    public static final hjh m = new hjh(AnalyticsEvent.BI_TRACKING_KIND_EVENT, be1.a(ae1.a(v630.class, new o11(12))));
    public static final hjh n = new hjh("analyticsLabel", be1.a(ae1.a(v630.class, new o11(13))));
    public static final hjh o = new hjh("campaignId", be1.a(ae1.a(v630.class, new o11(14))));
    public static final hjh p = new hjh("composerLabel", be1.a(ae1.a(v630.class, new o11(15))));

    @Override // defpackage.e4g
    public final void a(Object obj, vby vbyVar) {
        qov qovVar = (qov) obj;
        vby vbyVar2 = vbyVar;
        vbyVar2.g(b, qovVar.a);
        vbyVar2.a(c, qovVar.b);
        vbyVar2.a(d, qovVar.c);
        vbyVar2.a(e, qovVar.d);
        vbyVar2.a(f, qov.c.ANDROID);
        vbyVar2.a(g, qovVar.e);
        vbyVar2.a(h, qovVar.f);
        vbyVar2.e(i, qovVar.g);
        vbyVar2.e(j, qovVar.h);
        vbyVar2.a(k, qovVar.i);
        vbyVar2.g(l, 0L);
        vbyVar2.a(m, qov.a.MESSAGE_DELIVERED);
        vbyVar2.a(n, qovVar.j);
        vbyVar2.g(o, 0L);
        vbyVar2.a(p, qovVar.k);
    }
}
