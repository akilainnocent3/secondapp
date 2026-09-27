package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class E0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f58842p = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IronSource.a f58843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f58844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private D0 f58845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AbstractC4501s3 f58846d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C4186a9 f58847e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Ab f58848f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Xf f58849g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public R1 f58850h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public N f58851i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C4211bg f58852j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Tc f58853k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Map<B0, a> f58854l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Map<B0, a> f58855m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Map<B0, a> f58856n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Map<B0, a> f58857o;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f58858a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f58859b;

        public a(D5 d10, D5 d11) {
            if (d10 != null) {
                this.f58858a = d10.b();
            } else {
                this.f58858a = -1;
            }
            if (d11 != null) {
                this.f58859b = d11.b();
            } else {
                this.f58859b = -1;
            }
        }

        public int a(b bVar) {
            return b.MEDIATION.equals(bVar) ? this.f58858a : this.f58859b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum b {
        MEDIATION,
        PROVIDER
    }

    public E0(IronSource.a aVar, b bVar, D0 d10) {
        this(aVar, bVar, d10, a(aVar));
    }

    private static AbstractC4501s3 a(IronSource.a aVar) {
        return aVar.equals(IronSource.a.REWARDED_VIDEO) ? C4209be.i() : J9.i();
    }

    private void d() {
        HashMap map = new HashMap();
        this.f58857o = map;
        map.put(B0.INIT_STARTED, new a(D5.NT_MANAGER_INIT_STARTED, null));
        this.f58857o.put(B0.INIT_ENDED, new a(D5.NT_MANAGER_INIT_ENDED, null));
        this.f58857o.put(B0.PLACEMENT_CAPPED, new a(D5.NT_PLACEMENT_CAPPED, null));
        this.f58857o.put(B0.AUCTION_REQUEST, new a(D5.NT_AUCTION_REQUEST, null));
        this.f58857o.put(B0.AUCTION_SUCCESS, new a(D5.NT_AUCTION_SUCCESS, null));
        Map<B0, a> map2 = this.f58857o;
        B0 b10 = B0.AUCTION_FAILED;
        D5 d10 = D5.NT_AUCTION_FAILED;
        map2.put(b10, new a(d10, null));
        this.f58857o.put(B0.AUCTION_FAILED_NO_CANDIDATES, new a(d10, null));
        this.f58857o.put(B0.AUCTION_REQUEST_WATERFALL, new a(D5.NT_AUCTION_REQUEST_WATERFALL, null));
        this.f58857o.put(B0.AUCTION_RESULT_WATERFALL, new a(D5.NT_AUCTION_RESPONSE_WATERFALL, null));
        this.f58857o.put(B0.INIT_SUCCESS, new a(null, null));
        this.f58857o.put(B0.INIT_FAILED, new a(null, null));
        this.f58857o.put(B0.AD_OPENED, new a(D5.NT_CALLBACK_SHOW, D5.NT_INSTANCE_SHOW));
        this.f58857o.put(B0.AD_CLICKED, new a(D5.NT_CALLBACK_CLICK, D5.NT_INSTANCE_CLICK));
        this.f58857o.put(B0.LOAD_AD, new a(D5.NT_LOAD, D5.NT_INSTANCE_LOAD));
        this.f58857o.put(B0.LOAD_AD_SUCCESS, new a(D5.NT_CALLBACK_LOAD_SUCCESS, D5.NT_INSTANCE_LOAD_SUCCESS));
        this.f58857o.put(B0.LOAD_AD_FAILED_WITH_REASON, new a(D5.NT_CALLBACK_LOAD_ERROR, D5.NT_INSTANCE_LOAD_ERROR));
        this.f58857o.put(B0.LOAD_AD_NO_FILL, new a(null, D5.NT_INSTANCE_LOAD_NO_FILL));
        this.f58857o.put(B0.AD_FORMAT_CAPPED, new a(D5.NT_AD_UNIT_CAPPED, null));
        Map<B0, a> map3 = this.f58857o;
        B0 b11 = B0.COLLECT_TOKEN;
        D5 d11 = D5.NT_COLLECT_TOKENS;
        D5 d12 = D5.NT_INSTANCE_COLLECT_TOKEN;
        map3.put(b11, new a(d11, d12));
        this.f58857o.put(B0.COLLECT_TOKENS_COMPLETED, new a(D5.NT_COLLECT_TOKENS_COMPLETED, null));
        this.f58857o.put(B0.COLLECT_TOKENS_FAILED, new a(D5.NT_COLLECT_TOKENS_FAILED, null));
        this.f58857o.put(B0.INSTANCE_COLLECT_TOKEN, new a(d12, null));
        Map<B0, a> map4 = this.f58857o;
        B0 b12 = B0.INSTANCE_COLLECT_TOKEN_SUCCESS;
        D5 d13 = D5.NT_INSTANCE_COLLECT_TOKEN_SUCCESS;
        map4.put(b12, new a(d13, d13));
        Map<B0, a> map5 = this.f58857o;
        B0 b13 = B0.INSTANCE_COLLECT_TOKEN_FAILED;
        D5 d14 = D5.NT_INSTANCE_COLLECT_TOKEN_FAILED;
        map5.put(b13, new a(d14, d14));
        Map<B0, a> map6 = this.f58857o;
        B0 b14 = B0.INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        D5 d15 = D5.NT_INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        map6.put(b14, new a(d15, d15));
        this.f58857o.put(B0.DESTROY_AD, new a(D5.NT_DESTROY, D5.NT_INSTANCE_DESTROY));
        this.f58857o.put(B0.TROUBLESHOOT_ILR_REVENUE, new a(D5.TROUBLESHOOTING_NT_ILR_REVENUE, null));
        Map<B0, a> map7 = this.f58857o;
        B0 b15 = B0.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING;
        D5 d16 = D5.TROUBLESHOOTING_NT_PROVIDER_SETTINGS_MISSING;
        map7.put(b15, new a(d16, d16));
        Map<B0, a> map8 = this.f58857o;
        B0 b16 = B0.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS;
        D5 d17 = D5.TROUBLESHOOTING_NT_UNEXPECTED_INIT_SUCCESS;
        map8.put(b16, new a(d17, d17));
        Map<B0, a> map9 = this.f58857o;
        B0 b17 = B0.TROUBLESHOOT_UNEXPECTED_INIT_FAILED;
        D5 d18 = D5.TROUBLESHOOTING_NT_UNEXPECTED_INIT_FAILED;
        map9.put(b17, new a(d18, d18));
        Map<B0, a> map10 = this.f58857o;
        B0 b18 = B0.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS;
        D5 d19 = D5.TROUBLESHOOTING_NT_UNEXPECTED_AUCTION_SUCCESS;
        map10.put(b18, new a(d19, d19));
        Map<B0, a> map11 = this.f58857o;
        B0 b19 = B0.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED;
        D5 d20 = D5.TROUBLESHOOTING_NT_UNEXPECTED_AUCTION_FAILED;
        map11.put(b19, new a(d20, d20));
        Map<B0, a> map12 = this.f58857o;
        B0 b20 = B0.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS;
        D5 d21 = D5.TROUBLESHOOTING_NT_UNEXPECTED_LOAD_SUCCESS;
        map12.put(b20, new a(d21, d21));
        Map<B0, a> map13 = this.f58857o;
        B0 b21 = B0.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED;
        D5 d22 = D5.TROUBLESHOOTING_NT_UNEXPECTED_LOAD_FAILED;
        map13.put(b21, new a(d22, d22));
        Map<B0, a> map14 = this.f58857o;
        B0 b22 = B0.TROUBLESHOOT_UNEXPECTED_TIMEOUT;
        D5 d23 = D5.TROUBLESHOOTING_NT_UNEXPECTED_TIMEOUT;
        map14.put(b22, new a(d23, d23));
        Map<B0, a> map15 = this.f58857o;
        B0 b23 = B0.TROUBLESHOOT_UNEXPECTED_OPENED;
        D5 d24 = D5.TROUBLESHOOTING_NT_UNEXPECTED_OPENED;
        map15.put(b23, new a(d24, d24));
        Map<B0, a> map16 = this.f58857o;
        B0 b24 = B0.TROUBLESHOOT_INTERNAL_ERROR;
        D5 d25 = D5.TROUBLESHOOTING_NT_INTERNAL_ERROR;
        map16.put(b24, new a(d25, d25));
        Map<B0, a> map17 = this.f58857o;
        B0 b25 = B0.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        D5 d26 = D5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        map17.put(b25, new a(d26, d26));
        Map<B0, a> map18 = this.f58857o;
        B0 b26 = B0.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        D5 d27 = D5.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        map18.put(b26, new a(d27, d27));
        this.f58857o.put(B0.TROUBLESHOOT_NOTIFICATION_ERROR, new a(D5.TROUBLESHOOTING_NT_NOTIFICATIONS_ERROR, null));
    }

    public void b() {
        c();
        e();
        a();
        d();
    }

    public void c() {
        HashMap map = new HashMap();
        this.f58854l = map;
        map.put(B0.INIT_STARTED, new a(D5.IS_MANAGER_INIT_STARTED, null));
        this.f58854l.put(B0.INIT_ENDED, new a(D5.IS_MANAGER_INIT_ENDED, null));
        this.f58854l.put(B0.SESSION_CAPPED, new a(null, D5.IS_CAP_SESSION));
        this.f58854l.put(B0.PLACEMENT_CAPPED, new a(D5.IS_CAP_PLACEMENT, null));
        this.f58854l.put(B0.CHECK_PLACEMENT_CAPPED, new a(D5.IS_CHECK_PLACEMENT_CAPPED, null));
        this.f58854l.put(B0.AUCTION_REQUEST, new a(D5.IS_AUCTION_REQUEST, null));
        this.f58854l.put(B0.AUCTION_SUCCESS, new a(D5.IS_AUCTION_SUCCESS, null));
        Map<B0, a> map2 = this.f58854l;
        B0 b10 = B0.AUCTION_FAILED;
        D5 d10 = D5.IS_AUCTION_FAILED;
        map2.put(b10, new a(d10, null));
        this.f58854l.put(B0.AUCTION_FAILED_NO_CANDIDATES, new a(d10, null));
        this.f58854l.put(B0.AUCTION_REQUEST_WATERFALL, new a(D5.IS_AUCTION_REQUEST_WATERFALL, null));
        this.f58854l.put(B0.AUCTION_RESULT_WATERFALL, new a(D5.IS_RESULT_WATERFALL, null));
        this.f58854l.put(B0.INIT_SUCCESS, new a(null, null));
        this.f58854l.put(B0.INIT_FAILED, new a(null, null));
        this.f58854l.put(B0.AD_OPENED, new a(null, D5.IS_INSTANCE_OPENED));
        this.f58854l.put(B0.AD_CLOSED, new a(D5.IS_CALLBACK_AD_CLOSED, D5.IS_INSTANCE_CLOSED));
        this.f58854l.put(B0.AD_CLICKED, new a(D5.IS_CALLBACK_AD_CLICKED, D5.IS_INSTANCE_CLICKED));
        this.f58854l.put(B0.AD_INFO_CHANGED, new a(D5.IS_CALLBACK_AD_INFO_CHANGED, null));
        this.f58854l.put(B0.LOAD_AD, new a(D5.IS_LOAD_CALLED, D5.IS_INSTANCE_LOAD));
        this.f58854l.put(B0.LOAD_AD_SUCCESS, new a(D5.IS_CALLBACK_LOAD_SUCCESS, D5.IS_INSTANCE_LOAD_SUCCESS));
        this.f58854l.put(B0.LOAD_AD_FAILED_WITH_REASON, new a(D5.IS_CALLBACK_LOAD_ERROR, D5.IS_INSTANCE_LOAD_FAILED));
        this.f58854l.put(B0.LOAD_AD_NO_FILL, new a(null, D5.IS_INSTANCE_LOAD_NO_FILL));
        this.f58854l.put(B0.SHOW_AD, new a(D5.IS_SHOW_CALLED, D5.IS_INSTANCE_SHOW));
        this.f58854l.put(B0.SHOW_AD_FAILED, new a(D5.IS_CALLBACK_AD_SHOW_ERROR, D5.IS_INSTANCE_SHOW_FAILED));
        this.f58854l.put(B0.AD_FORMAT_CAPPED, new a(D5.IS_AD_FORMAT_CAPPED, null));
        this.f58854l.put(B0.AD_UNIT_CAPPED, new a(D5.IS_AD_UNIT_CAPPED, null));
        this.f58854l.put(B0.COLLECT_TOKEN, new a(D5.IS_COLLECT_TOKENS, null));
        this.f58854l.put(B0.COLLECT_TOKENS_COMPLETED, new a(D5.IS_COLLECT_TOKENS_COMPLETED, null));
        this.f58854l.put(B0.COLLECT_TOKENS_FAILED, new a(D5.IS_COLLECT_TOKENS_FAILED, null));
        this.f58854l.put(B0.INSTANCE_COLLECT_TOKEN, new a(D5.IS_INSTANCE_COLLECT_TOKEN, null));
        this.f58854l.put(B0.INSTANCE_COLLECT_TOKEN_SUCCESS, new a(D5.IS_INSTANCE_COLLECT_TOKEN_SUCCESS, null));
        this.f58854l.put(B0.INSTANCE_COLLECT_TOKEN_FAILED, new a(D5.IS_INSTANCE_COLLECT_TOKEN_FAILED, null));
        this.f58854l.put(B0.INSTANCE_COLLECT_TOKEN_TIMED_OUT, new a(D5.IS_INSTANCE_COLLECT_TOKEN_TIMED_OUT, null));
        this.f58854l.put(B0.AD_READY_TRUE, new a(D5.IS_CHECK_READY_TRUE, null));
        this.f58854l.put(B0.AD_READY_FALSE, new a(D5.IS_CHECK_READY_FALSE, null));
        this.f58854l.put(B0.OPERATIONAL_LOAD_AD, new a(D5.IS_OPERATIONAL_LOAD_AD, null));
        this.f58854l.put(B0.OPERATIONAL_LOAD_SUCCESS, new a(D5.IS_OPERATIONAL_LOAD_SUCCESS, null));
        this.f58854l.put(B0.OPERATIONAL_LOAD_FAILED, new a(D5.IS_OPERATIONAL_LOAD_FAILED, null));
        this.f58854l.put(B0.OPERATIONAL_SET_CONFIGURATIONS, new a(D5.IS_SET_CONFIGURATION, null));
        Map<B0, a> map3 = this.f58854l;
        B0 b11 = B0.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING;
        D5 d11 = D5.TROUBLESHOOTING_IS_PROVIDER_SETTINGS_MISSING;
        map3.put(b11, new a(d11, d11));
        Map<B0, a> map4 = this.f58854l;
        B0 b12 = B0.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS;
        D5 d12 = D5.TROUBLESHOOTING_IS_UNEXPECTED_INIT_SUCCESS;
        map4.put(b12, new a(d12, d12));
        Map<B0, a> map5 = this.f58854l;
        B0 b13 = B0.TROUBLESHOOT_UNEXPECTED_INIT_FAILED;
        D5 d13 = D5.TROUBLESHOOTING_IS_UNEXPECTED_INIT_FAILED;
        map5.put(b13, new a(d13, d13));
        Map<B0, a> map6 = this.f58854l;
        B0 b14 = B0.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS;
        D5 d14 = D5.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_SUCCESS;
        map6.put(b14, new a(d14, d14));
        Map<B0, a> map7 = this.f58854l;
        B0 b15 = B0.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED;
        D5 d15 = D5.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_FAILED;
        map7.put(b15, new a(d15, d15));
        Map<B0, a> map8 = this.f58854l;
        B0 b16 = B0.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS;
        D5 d16 = D5.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_SUCCESS;
        map8.put(b16, new a(d16, d16));
        Map<B0, a> map9 = this.f58854l;
        B0 b17 = B0.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED;
        D5 d17 = D5.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_FAILED;
        map9.put(b17, new a(d17, d17));
        Map<B0, a> map10 = this.f58854l;
        B0 b18 = B0.TROUBLESHOOT_UNEXPECTED_SHOW_FAILED;
        D5 d18 = D5.TROUBLESHOOTING_IS_UNEXPECTED_SHOW_FAILED;
        map10.put(b18, new a(d18, d18));
        Map<B0, a> map11 = this.f58854l;
        B0 b19 = B0.TROUBLESHOOT_UNEXPECTED_CLOSED;
        D5 d19 = D5.TROUBLESHOOTING_IS_UNEXPECTED_CLOSED;
        map11.put(b19, new a(d19, d19));
        Map<B0, a> map12 = this.f58854l;
        B0 b20 = B0.TROUBLESHOOT_UNEXPECTED_TIMEOUT;
        D5 d20 = D5.TROUBLESHOOTING_IS_UNEXPECTED_TIMEOUT;
        map12.put(b20, new a(d20, d20));
        Map<B0, a> map13 = this.f58854l;
        B0 b21 = B0.TROUBLESHOOT_INTERNAL_ERROR;
        D5 d21 = D5.TROUBLESHOOTING_IS_INTERNAL_ERROR;
        map13.put(b21, new a(d21, d21));
        Map<B0, a> map14 = this.f58854l;
        B0 b22 = B0.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        D5 d22 = D5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        map14.put(b22, new a(d22, d22));
        Map<B0, a> map15 = this.f58854l;
        B0 b23 = B0.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        D5 d23 = D5.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        map15.put(b23, new a(d23, d23));
        this.f58854l.put(B0.TROUBLESHOOT_NOTIFICATION_ERROR, new a(D5.TROUBLESHOOTING_IS_NOTIFICATIONS_ERROR, null));
        Map<B0, a> map16 = this.f58854l;
        B0 b24 = B0.TROUBLESHOOT_AD_EXPIRED;
        D5 d24 = D5.TROUBLESHOOTING_IS_AD_EXPIRED;
        map16.put(b24, new a(d24, d24));
        this.f58854l.put(B0.TROUBLESHOOT_LOAD, new a(D5.TROUBLESHOOTING_IS_LOAD, null));
        this.f58854l.put(B0.TROUBLESHOOT_LOAD_WHILE_LOADED, new a(D5.TROUBLESHOOTING_IS_LOAD_WHILE_LOADED, null));
        this.f58854l.put(B0.TROUBLESHOOT_LOAD_SUCCESS, new a(D5.TROUBLESHOOTING_IS_LOAD_SUCCESS, null));
        this.f58854l.put(B0.TROUBLESHOOT_LOAD_FAILED, new a(D5.TROUBLESHOOTING_IS_LOAD_FAILED, null));
        this.f58854l.put(B0.TROUBLESHOOT_SHOW, new a(D5.TROUBLESHOOTING_IS_SHOW, null));
        this.f58854l.put(B0.TROUBLESHOOT_SHOW_SUCCESS, new a(D5.TROUBLESHOOTING_IS_SHOW_SUCCESS, null));
        this.f58854l.put(B0.TROUBLESHOOT_SHOW_FAILED, new a(D5.TROUBLESHOOTING_IS_SHOW_FAILED, null));
        Map<B0, a> map17 = this.f58854l;
        B0 b25 = B0.TROUBLESHOOT_ILLEGAL_STATE;
        D5 d25 = D5.TROUBLESHOOTING_IS_ILLEGAL_STATE;
        map17.put(b25, new a(d25, d25));
        this.f58854l.put(B0.TROUBLESHOOT_AD_INFO_CHANGED, new a(D5.TROUBLESHOOT_IS_AD_INFO_CHANGED, null));
        this.f58854l.put(B0.TROUBLESHOOT_DESTROY_INSTANCES_READY_TO_SHOW, new a(D5.TROUBLESHOOTING_IS_DESTROY_READY_TO_SHOW_INSTANCES, null));
        this.f58854l.put(B0.TROUBLESHOOT_ILR_REVENUE, new a(D5.TROUBLESHOOTING_IS_ILR_REVENUE, null));
        this.f58854l.put(B0.TROUBLESHOOT_SHOW_RECOVERY_INITIATED, new a(D5.TROUBLESHOOT_IS_SHOW_RECOVERY_INITIATED, null));
    }

    public void e() {
        HashMap map = new HashMap();
        this.f58855m = map;
        map.put(B0.INIT_STARTED, new a(D5.RV_MANAGER_INIT_STARTED, null));
        this.f58855m.put(B0.INIT_ENDED, new a(D5.RV_MANAGER_INIT_ENDED, null));
        this.f58855m.put(B0.SESSION_CAPPED, new a(null, D5.RV_CAP_SESSION));
        this.f58855m.put(B0.PLACEMENT_CAPPED, new a(D5.RV_CAP_PLACEMENT, null));
        this.f58855m.put(B0.CHECK_PLACEMENT_CAPPED, new a(D5.RV_CHECK_PLACEMENT_CAPPED, null));
        this.f58855m.put(B0.AUCTION_REQUEST, new a(D5.RV_AUCTION_REQUEST, null));
        this.f58855m.put(B0.AUCTION_SUCCESS, new a(D5.RV_AUCTION_SUCCESS, null));
        Map<B0, a> map2 = this.f58855m;
        B0 b10 = B0.AUCTION_FAILED;
        D5 d10 = D5.RV_AUCTION_FAILED;
        map2.put(b10, new a(d10, null));
        this.f58855m.put(B0.AUCTION_FAILED_NO_CANDIDATES, new a(d10, null));
        this.f58855m.put(B0.AUCTION_REQUEST_WATERFALL, new a(D5.RV_AUCTION_REQUEST_WATERFALL, null));
        this.f58855m.put(B0.AUCTION_RESULT_WATERFALL, new a(D5.RV_AUCTION_RESPONSE_WATERFALL, null));
        this.f58855m.put(B0.INIT_SUCCESS, new a(null, null));
        this.f58855m.put(B0.INIT_FAILED, new a(null, null));
        this.f58855m.put(B0.AD_VISIBLE, new a(null, D5.RV_INSTANCE_VISIBLE));
        this.f58855m.put(B0.AD_OPENED, new a(null, D5.RV_BUSINESS_INSTANCE_OPENED));
        this.f58855m.put(B0.AD_CLOSED, new a(null, D5.RV_INSTANCE_CLOSED));
        this.f58855m.put(B0.AD_STARTED, new a(null, D5.RV_INSTANCE_STARTED));
        this.f58855m.put(B0.AD_ENDED, new a(null, D5.RV_INSTANCE_ENDED));
        this.f58855m.put(B0.AD_CLICKED, new a(D5.RV_CALLBACK_AD_CLICKED, D5.RV_BUSINESS_INSTANCE_CLICKED));
        this.f58855m.put(B0.AD_INFO_CHANGED, new a(D5.RV_CALLBACK_AD_INFO_CHANGED, null));
        this.f58855m.put(B0.AD_REWARDED, new a(null, D5.RV_BUSINESS_INSTANCE_REWARDED));
        this.f58855m.put(B0.AD_AVAILABILITY_CHANGED_TRUE, new a(D5.RV_CALLBACK_AVAILABILITY_TRUE, D5.RV_INSTANCE_AVAILABILITY_TRUE));
        this.f58855m.put(B0.AD_AVAILABILITY_CHANGED_FALSE, new a(D5.RV_CALLBACK_AVAILABILITY_FALSE, D5.RV_INSTANCE_AVAILABILITY_FALSE));
        this.f58855m.put(B0.LOAD_AD, new a(D5.RV_BUSINESS_MEDIATION_LOAD, D5.RV_BUSINESS_INSTANCE_LOAD));
        this.f58855m.put(B0.LOAD_AD_SUCCESS, new a(D5.RV_BUSINESS_MEDIATION_LOAD_SUCCESS, D5.RV_BUSINESS_INSTANCE_LOAD_SUCCESS));
        this.f58855m.put(B0.LOAD_AD_FAILED, new a(null, D5.RV_INSTANCE_LOAD_FAILED));
        this.f58855m.put(B0.LOAD_AD_FAILED_WITH_REASON, new a(D5.RV_MEDIATION_LOAD_ERROR, D5.RV_INSTANCE_LOAD_FAILED_REASON));
        this.f58855m.put(B0.LOAD_AD_NO_FILL, new a(null, D5.RV_INSTANCE_LOAD_NO_FILL));
        this.f58855m.put(B0.SHOW_AD, new a(D5.RV_API_SHOW_CALLED, D5.RV_INSTANCE_SHOW));
        this.f58855m.put(B0.SHOW_AD_CHANCE, new a(null, D5.RV_INSTANCE_SHOW_CHANCE));
        this.f58855m.put(B0.SHOW_AD_FAILED, new a(D5.RV_CALLBACK_SHOW_FAILED, D5.RV_INSTANCE_SHOW_FAILED));
        this.f58855m.put(B0.AD_FORMAT_CAPPED, new a(D5.RV_AD_UNIT_CAPPED, null));
        this.f58855m.put(B0.COLLECT_TOKEN, new a(D5.RV_COLLECT_TOKENS, null));
        this.f58855m.put(B0.COLLECT_TOKENS_COMPLETED, new a(D5.RV_COLLECT_TOKENS_COMPLETED, null));
        this.f58855m.put(B0.COLLECT_TOKENS_FAILED, new a(D5.RV_COLLECT_TOKENS_FAILED, null));
        this.f58855m.put(B0.INSTANCE_COLLECT_TOKEN, new a(D5.RV_INSTANCE_COLLECT_TOKEN, null));
        Map<B0, a> map3 = this.f58855m;
        B0 b11 = B0.INSTANCE_COLLECT_TOKEN_SUCCESS;
        D5 d11 = D5.RV_INSTANCE_COLLECT_TOKEN_SUCCESS;
        map3.put(b11, new a(d11, d11));
        Map<B0, a> map4 = this.f58855m;
        B0 b12 = B0.INSTANCE_COLLECT_TOKEN_FAILED;
        D5 d12 = D5.RV_INSTANCE_COLLECT_TOKEN_FAILED;
        map4.put(b12, new a(d12, d12));
        Map<B0, a> map5 = this.f58855m;
        B0 b13 = B0.INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        D5 d13 = D5.RV_INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        map5.put(b13, new a(d13, d13));
        this.f58855m.put(B0.AD_READY_TRUE, new a(D5.RV_CHECK_READY_TRUE, null));
        this.f58855m.put(B0.AD_READY_FALSE, new a(D5.RV_CHECK_READY_FALSE, null));
        this.f58855m.put(B0.OPERATIONAL_LOAD_AD, new a(D5.RV_OPERATIONAL_LOAD_AD, null));
        this.f58855m.put(B0.OPERATIONAL_LOAD_SUCCESS, new a(D5.RV_OPERATIONAL_LOAD_SUCCESS, null));
        this.f58855m.put(B0.OPERATIONAL_LOAD_FAILED, new a(D5.RV_OPERATIONAL_LOAD_FAILED, null));
        this.f58855m.put(B0.OPERATIONAL_SET_CONFIGURATIONS, new a(D5.RV_SET_CONFIGURATION, null));
        Map<B0, a> map6 = this.f58855m;
        B0 b14 = B0.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING;
        D5 d14 = D5.TROUBLESHOOTING_RV_PROVIDER_SETTINGS_MISSING;
        map6.put(b14, new a(d14, d14));
        Map<B0, a> map7 = this.f58855m;
        B0 b15 = B0.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS;
        D5 d15 = D5.TROUBLESHOOTING_RV_UNEXPECTED_INIT_SUCCESS;
        map7.put(b15, new a(d15, d15));
        Map<B0, a> map8 = this.f58855m;
        B0 b16 = B0.TROUBLESHOOT_UNEXPECTED_INIT_FAILED;
        D5 d16 = D5.TROUBLESHOOTING_RV_UNEXPECTED_INIT_FAILED;
        map8.put(b16, new a(d16, d16));
        Map<B0, a> map9 = this.f58855m;
        B0 b17 = B0.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS;
        D5 d17 = D5.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_SUCCESS;
        map9.put(b17, new a(d17, d17));
        Map<B0, a> map10 = this.f58855m;
        B0 b18 = B0.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED;
        D5 d18 = D5.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_FAILED;
        map10.put(b18, new a(d18, d18));
        Map<B0, a> map11 = this.f58855m;
        B0 b19 = B0.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS;
        D5 d19 = D5.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_SUCCESS;
        map11.put(b19, new a(d19, d19));
        Map<B0, a> map12 = this.f58855m;
        B0 b20 = B0.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED;
        D5 d20 = D5.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_FAILED;
        map12.put(b20, new a(d20, d20));
        Map<B0, a> map13 = this.f58855m;
        B0 b21 = B0.TROUBLESHOOT_UNEXPECTED_SHOW_FAILED;
        D5 d21 = D5.TROUBLESHOOTING_RV_UNEXPECTED_SHOW_FAILED;
        map13.put(b21, new a(d21, d21));
        Map<B0, a> map14 = this.f58855m;
        B0 b22 = B0.TROUBLESHOOT_UNEXPECTED_TIMEOUT;
        D5 d22 = D5.TROUBLESHOOTING_RV_UNEXPECTED_TIMEOUT;
        map14.put(b22, new a(d22, d22));
        Map<B0, a> map15 = this.f58855m;
        B0 b23 = B0.TROUBLESHOOT_UNEXPECTED_CLOSED;
        D5 d23 = D5.TROUBLESHOOTING_RV_UNEXPECTED_CLOSED;
        map15.put(b23, new a(d23, d23));
        Map<B0, a> map16 = this.f58855m;
        B0 b24 = B0.TROUBLESHOOT_LOAD_FAILED;
        D5 d24 = D5.TROUBLESHOOTING_RV_LOAD_FAILED;
        map16.put(b24, new a(d24, d24));
        Map<B0, a> map17 = this.f58855m;
        B0 b25 = B0.TROUBLESHOOT_INTERNAL_ERROR;
        D5 d25 = D5.TROUBLESHOOTING_RV_INTERNAL_ERROR;
        map17.put(b25, new a(d25, d25));
        Map<B0, a> map18 = this.f58855m;
        B0 b26 = B0.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        D5 d26 = D5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        map18.put(b26, new a(d26, d26));
        Map<B0, a> map19 = this.f58855m;
        B0 b27 = B0.TROUBLESHOOT_WATERFALL_OVERHEAD;
        D5 d27 = D5.TROUBLESHOOTING_RV_WATERFALL_OVERHEAD;
        map19.put(b27, new a(d27, d27));
        this.f58855m.put(B0.TROUBLESHOOT_NOTIFICATION_ERROR, new a(D5.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR, null));
        Map<B0, a> map20 = this.f58855m;
        B0 b28 = B0.TROUBLESHOOT_AD_EXPIRED;
        D5 d28 = D5.TROUBLESHOOTING_RV_AD_EXPIRED;
        map20.put(b28, new a(d28, d28));
        this.f58855m.put(B0.TROUBLESHOOT_LOAD, new a(D5.TROUBLESHOOTING_RV_LOAD, null));
        this.f58855m.put(B0.TROUBLESHOOT_LOAD_WHILE_LOADED, new a(D5.TROUBLESHOOTING_RV_LOAD_WHILE_LOADED, null));
        this.f58855m.put(B0.TROUBLESHOOT_LOAD_SUCCESS, new a(D5.TROUBLESHOOTING_RV_LOAD_SUCCESS, null));
        this.f58855m.put(B0.TROUBLESHOOT_SHOW, new a(D5.TROUBLESHOOTING_RV_SHOW, null));
        this.f58855m.put(B0.TROUBLESHOOT_SHOW_SUCCESS, new a(D5.TROUBLESHOOTING_RV_SHOW_SUCCESS, null));
        this.f58855m.put(B0.TROUBLESHOOT_SHOW_FAILED, new a(D5.TROUBLESHOOTING_RV_SHOW_FAILED, null));
        Map<B0, a> map21 = this.f58855m;
        B0 b29 = B0.TROUBLESHOOT_ILLEGAL_STATE;
        D5 d29 = D5.TROUBLESHOOTING_RV_ILLEGAL_STATE;
        map21.put(b29, new a(d29, d29));
        this.f58855m.put(B0.TROUBLESHOOT_AD_INFO_CHANGED, new a(D5.TROUBLESHOOT_RV_AD_INFO_CHANGED, null));
        this.f58855m.put(B0.TROUBLESHOOT_DESTROY_INSTANCES_READY_TO_SHOW, new a(D5.TROUBLESHOOTING_RV_DESTROY_READY_TO_SHOW_INSTANCES, null));
        this.f58855m.put(B0.TROUBLESHOOT_ILR_REVENUE, new a(D5.TROUBLESHOOTING_RV_ILR_REVENUE, null));
        this.f58855m.put(B0.TROUBLESHOOT_SHOW_RECOVERY_INITIATED, new a(D5.TROUBLESHOOT_RV_SHOW_RECOVERY_INITIATED, null));
    }

    public void f() {
        this.f58845c = null;
        this.f58849g = null;
        this.f58850h = null;
        this.f58847e = null;
        this.f58848f = null;
        this.f58851i = null;
        this.f58852j = null;
        this.f58853k = null;
    }

    public E0(IronSource.a aVar, b bVar, D0 d10, AbstractC4501s3 abstractC4501s3) {
        this.f58843a = aVar;
        this.f58844b = bVar;
        this.f58845c = d10;
        this.f58846d = abstractC4501s3 == null ? a(aVar) : abstractC4501s3;
        b();
        this.f58847e = new C4186a9(this);
        this.f58848f = new Ab(this);
        this.f58849g = new Xf(this);
        this.f58850h = new R1(this);
        this.f58851i = new N(this);
        this.f58852j = new C4211bg(this);
        this.f58853k = new Tc(this);
    }

    public void a(B0 b10, Map<String, Object> map) {
        a(b10, map, Calendar.getInstance().getTimeInMillis());
    }

    public void a(B0 b10, Map<String, Object> map, long j10) {
        int iA = a(b10);
        if (-1 == iA) {
            return;
        }
        HashMap map2 = new HashMap();
        D0 d10 = this.f58845c;
        if (d10 != null) {
            map2.putAll(d10.a(b10));
        }
        if (map != null && !map.isEmpty()) {
            map2.putAll(map);
        }
        this.f58846d.a(new C5(iA, j10, new JSONObject(map2)));
    }

    private int a(B0 b10) {
        try {
            if (IronSource.a.INTERSTITIAL.equals(this.f58843a) && this.f58854l.containsKey(b10)) {
                return this.f58854l.get(b10).a(this.f58844b);
            }
            if (IronSource.a.REWARDED_VIDEO.equals(this.f58843a) && this.f58855m.containsKey(b10)) {
                return this.f58855m.get(b10).a(this.f58844b);
            }
            if (IronSource.a.BANNER.equals(this.f58843a) && this.f58856n.containsKey(b10)) {
                return this.f58856n.get(b10).a(this.f58844b);
            }
            if (IronSource.a.NATIVE_AD.equals(this.f58843a) && this.f58857o.containsKey(b10)) {
                return this.f58857o.get(b10).a(this.f58844b);
            }
            return -1;
        } catch (Exception e10) {
            C4485r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return -1;
        }
    }

    public void a() {
        HashMap map = new HashMap();
        this.f58856n = map;
        map.put(B0.INIT_STARTED, new a(D5.BN_MANAGER_INIT_STARTED, null));
        this.f58856n.put(B0.INIT_ENDED, new a(D5.BN_MANAGER_INIT_ENDED, null));
        this.f58856n.put(B0.PLACEMENT_CAPPED, new a(D5.BN_PLACEMENT_CAPPED, null));
        this.f58856n.put(B0.AUCTION_REQUEST, new a(D5.BN_AUCTION_REQUEST, null));
        this.f58856n.put(B0.AUCTION_SUCCESS, new a(D5.BN_AUCTION_SUCCESS, null));
        Map<B0, a> map2 = this.f58856n;
        B0 b10 = B0.AUCTION_FAILED;
        D5 d10 = D5.BN_AUCTION_FAILED;
        map2.put(b10, new a(d10, null));
        this.f58856n.put(B0.AUCTION_FAILED_NO_CANDIDATES, new a(d10, null));
        this.f58856n.put(B0.AUCTION_REQUEST_WATERFALL, new a(D5.BN_AUCTION_REQUEST_WATERFALL, null));
        this.f58856n.put(B0.AUCTION_RESULT_WATERFALL, new a(D5.BN_AUCTION_RESPONSE_WATERFALL, null));
        this.f58856n.put(B0.INIT_SUCCESS, new a(null, null));
        this.f58856n.put(B0.INIT_FAILED, new a(null, null));
        this.f58856n.put(B0.AD_OPENED, new a(D5.BN_CALLBACK_SHOW, D5.BN_INSTANCE_SHOW));
        this.f58856n.put(B0.SHOW_AD_FAILED, new a(D5.BN_CALLBACK_SHOW_FAILED, D5.BN_INSTANCE_SHOW_FAILED));
        this.f58856n.put(B0.AD_CLICKED, new a(D5.BN_CALLBACK_CLICK, D5.BN_INSTANCE_CLICK));
        this.f58856n.put(B0.LOAD_AD, new a(D5.BN_LOAD, D5.BN_INSTANCE_LOAD));
        this.f58856n.put(B0.RELOAD_AD, new a(D5.BN_RELOAD, D5.BN_INSTANCE_RELOAD));
        this.f58856n.put(B0.LOAD_AD_SUCCESS, new a(D5.BN_CALLBACK_LOAD_SUCCESS, D5.BN_INSTANCE_LOAD_SUCCESS));
        this.f58856n.put(B0.RELOAD_AD_SUCCESS, new a(D5.BN_CALLBACK_RELOAD_SUCCESS, D5.BN_INSTANCE_RELOAD_SUCCESS));
        this.f58856n.put(B0.LOAD_AD_FAILED_WITH_REASON, new a(D5.BN_CALLBACK_LOAD_ERROR, D5.BN_INSTANCE_LOAD_ERROR));
        this.f58856n.put(B0.RELOAD_AD_FAILED_WITH_REASON, new a(D5.BN_CALLBACK_RELOAD_ERROR, D5.BN_INSTANCE_RELOAD_ERROR));
        this.f58856n.put(B0.LOAD_AD_NO_FILL, new a(null, D5.BN_INSTANCE_LOAD_NO_FILL));
        this.f58856n.put(B0.RELOAD_AD_NO_FILL, new a(null, D5.BN_INSTANCE_RELOAD_NO_FILL));
        this.f58856n.put(B0.AD_FORMAT_CAPPED, new a(D5.BN_AD_UNIT_CAPPED, null));
        this.f58856n.put(B0.COLLECT_TOKEN, new a(D5.BN_COLLECT_TOKENS, null));
        this.f58856n.put(B0.COLLECT_TOKENS_COMPLETED, new a(D5.BN_COLLECT_TOKENS_COMPLETED, null));
        this.f58856n.put(B0.COLLECT_TOKENS_FAILED, new a(D5.BN_COLLECT_TOKENS_FAILED, null));
        this.f58856n.put(B0.INSTANCE_COLLECT_TOKEN, new a(D5.BN_INSTANCE_COLLECT_TOKEN, null));
        Map<B0, a> map3 = this.f58856n;
        B0 b11 = B0.INSTANCE_COLLECT_TOKEN_SUCCESS;
        D5 d11 = D5.BN_INSTANCE_COLLECT_TOKEN_SUCCESS;
        map3.put(b11, new a(d11, d11));
        Map<B0, a> map4 = this.f58856n;
        B0 b12 = B0.INSTANCE_COLLECT_TOKEN_FAILED;
        D5 d12 = D5.BN_INSTANCE_COLLECT_TOKEN_FAILED;
        map4.put(b12, new a(d12, d12));
        Map<B0, a> map5 = this.f58856n;
        B0 b13 = B0.INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        D5 d13 = D5.BN_INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        map5.put(b13, new a(d13, d13));
        this.f58856n.put(B0.DESTROY_AD, new a(D5.BN_DESTROY, D5.BN_INSTANCE_DESTROY));
        this.f58856n.put(B0.SKIP_RELOAD_AD, new a(D5.BN_SKIP_RELOAD, null));
        this.f58856n.put(B0.AD_LEFT_APPLICATION, new a(D5.BN_CALLBACK_LEAVE_APP, D5.BN_INSTANCE_LEAVE_APP));
        this.f58856n.put(B0.AD_PRESENT_SCREEN, new a(D5.BN_CALLBACK_PRESENT_SCREEN, D5.BN_INSTANCE_PRESENT_SCREEN));
        this.f58856n.put(B0.AD_DISMISS_SCREEN, new a(D5.BN_CALLBACK_DISMISS_SCREEN, D5.BN_INSTANCE_DISMISS_SCREEN));
        this.f58856n.put(B0.AD_VIEW_BOUND, new a(D5.BN_BOUND, D5.BN_INSTANCE_BOUND));
        this.f58856n.put(B0.PAUSE_AD, new a(D5.BN_REFRESH_PAUSE, null));
        this.f58856n.put(B0.RESUME_AD, new a(D5.BN_REFRESH_RESUME, null));
        this.f58856n.put(B0.OPERATIONAL_SET_CONFIGURATIONS, new a(D5.BN_SET_CONFIGURATION, null));
        Map<B0, a> map6 = this.f58856n;
        B0 b14 = B0.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING;
        D5 d14 = D5.TROUBLESHOOTING_BN_PROVIDER_SETTINGS_MISSING;
        map6.put(b14, new a(d14, d14));
        Map<B0, a> map7 = this.f58856n;
        B0 b15 = B0.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS;
        D5 d15 = D5.TROUBLESHOOTING_BN_UNEXPECTED_INIT_SUCCESS;
        map7.put(b15, new a(d15, d15));
        Map<B0, a> map8 = this.f58856n;
        B0 b16 = B0.TROUBLESHOOT_UNEXPECTED_INIT_FAILED;
        D5 d16 = D5.TROUBLESHOOTING_BN_UNEXPECTED_INIT_FAILED;
        map8.put(b16, new a(d16, d16));
        Map<B0, a> map9 = this.f58856n;
        B0 b17 = B0.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS;
        D5 d17 = D5.TROUBLESHOOTING_BN_UNEXPECTED_AUCTION_SUCCESS;
        map9.put(b17, new a(d17, d17));
        Map<B0, a> map10 = this.f58856n;
        B0 b18 = B0.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED;
        D5 d18 = D5.TROUBLESHOOTING_BN_UNEXPECTED_AUCTION_FAILED;
        map10.put(b18, new a(d18, d18));
        Map<B0, a> map11 = this.f58856n;
        B0 b19 = B0.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS;
        D5 d19 = D5.TROUBLESHOOTING_BN_UNEXPECTED_LOAD_SUCCESS;
        map11.put(b19, new a(d19, d19));
        Map<B0, a> map12 = this.f58856n;
        B0 b20 = B0.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED;
        D5 d20 = D5.TROUBLESHOOTING_BN_UNEXPECTED_LOAD_FAILED;
        map12.put(b20, new a(d20, d20));
        Map<B0, a> map13 = this.f58856n;
        B0 b21 = B0.TROUBLESHOOT_UNEXPECTED_RELOAD_SUCCESS;
        D5 d21 = D5.TROUBLESHOOTING_BN_UNEXPECTED_RELOAD_SUCCESS;
        map13.put(b21, new a(d21, d21));
        Map<B0, a> map14 = this.f58856n;
        B0 b22 = B0.TROUBLESHOOT_UNEXPECTED_RELOAD_FAILED;
        D5 d22 = D5.TROUBLESHOOTING_BN_UNEXPECTED_RELOAD_FAILED;
        map14.put(b22, new a(d22, d22));
        Map<B0, a> map15 = this.f58856n;
        B0 b23 = B0.TROUBLESHOOT_UNEXPECTED_TIMEOUT;
        D5 d23 = D5.TROUBLESHOOTING_BN_UNEXPECTED_TIMEOUT;
        map15.put(b23, new a(d23, d23));
        Map<B0, a> map16 = this.f58856n;
        B0 b24 = B0.TROUBLESHOOT_UNEXPECTED_OPENED;
        D5 d24 = D5.TROUBLESHOOTING_BN_UNEXPECTED_OPENED;
        map16.put(b24, new a(d24, d24));
        Map<B0, a> map17 = this.f58856n;
        B0 b25 = B0.TROUBLESHOOT_INTERNAL_ERROR;
        D5 d25 = D5.TROUBLESHOOTING_BN_INTERNAL_ERROR;
        map17.put(b25, new a(d25, d25));
        Map<B0, a> map18 = this.f58856n;
        B0 b26 = B0.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        D5 d26 = D5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        map18.put(b26, new a(d26, d26));
        Map<B0, a> map19 = this.f58856n;
        B0 b27 = B0.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        D5 d27 = D5.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        map19.put(b27, new a(d27, d27));
        this.f58856n.put(B0.TROUBLESHOOT_NOTIFICATION_ERROR, new a(D5.TROUBLESHOOTING_BN_NOTIFICATIONS_ERROR, null));
        this.f58856n.put(B0.TROUBLESHOOT_BN_RELOAD_EXCEPTION, new a(D5.TROUBLESHOOTING_BN_RELOAD_EXCEPTION, null));
        this.f58856n.put(B0.TROUBLESHOOT_IMPRESSION_TIMEOUT, new a(D5.TROUBLESHOOTING_BN_IMPRESSION_TIMEOUT_REACHED, null));
        this.f58856n.put(B0.TROUBLESHOOT_BANNER_REFRESH_PAUSED, new a(D5.TROUBLESHOOT_BN_BANNER_REFRESH_PAUSED, null));
        this.f58856n.put(B0.TROUBLESHOOT_BANNER_REFRESH_RESUMED, new a(D5.TROUBLESHOOT_BN_BANNER_REFRESH_RESUMED, null));
        this.f58856n.put(B0.TROUBLESHOOT_BANNER_REFRESH_TRIGGER_PAUSE, new a(D5.TROUBLESHOOT_BN_BANNER_REFRESH_TRIGGER_PAUSE, null));
        this.f58856n.put(B0.TROUBLESHOOT_BANNER_REFRESH_TRIGGER_RESUME, new a(D5.TROUBLESHOOT_BN_BANNER_REFRESH_TRIGGER_RESUME, null));
        Map<B0, a> map20 = this.f58856n;
        B0 b28 = B0.TROUBLESHOOT_BANNER_REFRESH_TRANSITION;
        D5 d28 = D5.TROUBLESHOOT_BN_BANNER_REFRESH_TRANSITION;
        map20.put(b28, new a(d28, d28));
        Map<B0, a> map21 = this.f58856n;
        B0 b29 = B0.TROUBLESHOOT_BANNER_REFRESH_ANIMATED;
        D5 d29 = D5.TROUBLESHOOT_BN_BANNER_REFRESH_ANIMATED;
        map21.put(b29, new a(d29, d29));
        Map<B0, a> map22 = this.f58856n;
        B0 b30 = B0.TROUBLESHOOT_ILLEGAL_STATE;
        D5 d30 = D5.TROUBLESHOOTING_BN_ILLEGAL_STATE;
        map22.put(b30, new a(d30, d30));
        this.f58856n.put(B0.TROUBLESHOOT_RELOAD, new a(D5.TROUBLESHOOTING_BN_RELOAD, null));
        Map<B0, a> map23 = this.f58856n;
        B0 b31 = B0.TROUBLESHOOT_LOAD_SKIPPED;
        D5 d31 = D5.TROUBLESHOOTING_BN_LOAD_SKIPPED;
        map23.put(b31, new a(d31, d31));
        this.f58856n.put(B0.TROUBLESHOOT_ILR_REVENUE, new a(D5.TROUBLESHOOTING_BN_ILR_REVENUE, null));
    }
}
