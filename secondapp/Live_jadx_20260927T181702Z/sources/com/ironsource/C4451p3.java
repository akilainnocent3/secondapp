package com.ironsource;

import com.ironsource.V0;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.p3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class C4451p3<Listener extends V0> extends AbstractC4395m3<Listener> implements AdapterAdRewardListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private C4379l5 f63274r;

    /* JADX INFO: renamed from: com.ironsource.p3$a */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends AbstractRunnableC4335ie {
        public a() {
        }

        @Override // com.ironsource.AbstractRunnableC4335ie
        public void a() {
            C4451p3.this.U();
        }
    }

    public C4451p3(InterfaceC4461pd interfaceC4461pd, C4392m0 c4392m0, BaseAdAdapter<?, AdapterAdRewardListener> baseAdAdapter, C4214c1 c4214c1, C4414n2 c4414n2, Listener listener) {
        super(interfaceC4461pd, c4392m0, baseAdAdapter, c4214c1, c4414n2, listener);
    }

    @Override // com.ironsource.AbstractC4395m3, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdClosed() {
        this.f63274r = new C4379l5();
        super.onAdClosed();
    }

    @Override // com.ironsource.AbstractC4468q3, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        this.f63274r = null;
        super.onAdOpened();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener
    public /* synthetic */ void onAdRewarded(Map map) {
        cn.c.a(this, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U() {
        if (this.f63361g == null) {
            IronLog.INTERNAL.verbose(a("placement is null "));
            E0 e10 = this.f63358d;
            if (e10 != null) {
                e10.f58852j.g("mCurrentPlacement is null state = " + this.f63359e);
                return;
            }
            return;
        }
        IronLog.INTERNAL.verbose(a("placement name = " + j()));
        if (this.f63358d != null) {
            HashMap map = new HashMap();
            if (com.ironsource.mediationsdk.r.m().r() != null) {
                for (String str : com.ironsource.mediationsdk.r.m().r().keySet()) {
                    map.put("custom_" + str, com.ironsource.mediationsdk.r.m().r().get(str));
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f63358d.f58851i.a(j(), this.f63361g.f(), this.f63361g.e(), jCurrentTimeMillis, IronSourceUtils.a(jCurrentTimeMillis, c()), C4379l5.a(this.f63274r), map, com.ironsource.mediationsdk.r.m().l());
        }
        ((V0) this.f63356b).a((C4451p3<?>) this, this.f63361g);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener
    public void onAdRewarded() {
        if (u().e()) {
            u().a(new a());
        } else {
            U();
        }
    }
}
