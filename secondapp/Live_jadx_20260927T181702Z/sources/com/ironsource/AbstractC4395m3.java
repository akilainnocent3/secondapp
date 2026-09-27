package com.ironsource;

import android.app.Activity;
import com.ironsource.J0;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.m3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC4395m3<Listener extends J0> extends AbstractC4468q3<Listener> implements AdapterAdInteractionListener {

    /* JADX INFO: renamed from: com.ironsource.m3$a */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends AbstractRunnableC4335ie {
        public a() {
        }

        @Override // com.ironsource.AbstractRunnableC4335ie
        public void a() {
            AbstractC4395m3.this.P();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m3$b */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b extends AbstractRunnableC4335ie {
        public b() {
        }

        @Override // com.ironsource.AbstractRunnableC4335ie
        public void a() {
            AbstractC4395m3.this.S();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m3$c */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class c extends AbstractRunnableC4335ie {
        public c() {
        }

        @Override // com.ironsource.AbstractRunnableC4335ie
        public void a() {
            AbstractC4395m3.this.Q();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m3$d */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class d extends AbstractRunnableC4335ie {
        public d() {
        }

        @Override // com.ironsource.AbstractRunnableC4335ie
        public void a() {
            AbstractC4395m3.this.T();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m3$e */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class e extends AbstractRunnableC4335ie {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f62349b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f62350c;

        public e(int i10, String str) {
            this.f62349b = i10;
            this.f62350c = str;
        }

        @Override // com.ironsource.AbstractRunnableC4335ie
        public void a() {
            AbstractC4395m3.this.b(this.f62349b, this.f62350c);
        }
    }

    public AbstractC4395m3(InterfaceC4461pd interfaceC4461pd, C4392m0 c4392m0, BaseAdAdapter<?, ?> baseAdAdapter, C4214c1 c4214c1, C4414n2 c4414n2, Listener listener) {
        super(interfaceC4461pd, c4392m0, baseAdAdapter, c4214c1, c4414n2, listener);
    }

    @Override // com.ironsource.AbstractC4468q3
    public boolean B() {
        if (this.f63365k == null || !y()) {
            return false;
        }
        try {
            Object obj = this.f63357c;
            if (obj instanceof AdapterAdFullScreenInterface) {
                return ((AdapterAdFullScreenInterface) obj).isAdAvailable(this.f63365k);
            }
            IronLog.INTERNAL.error(a("isReadyToShow - adapter not instance of AdapterAdFullScreenInterface"));
            E0 e10 = this.f63358d;
            if (e10 != null) {
                e10.f58852j.g("isReadyToShow - adapter not instance of AdapterAdFullScreenInterface");
            }
            return false;
        } catch (Throwable th2) {
            C4485r4.d().a(th2);
            String str = "isReadyToShow - exception = " + th2.getMessage() + " - state = " + this.f63359e;
            IronLog.INTERNAL.error(a(str));
            E0 e11 = this.f63358d;
            if (e11 != null) {
                e11.f58852j.g(str);
            }
        }
    }

    public void a(Activity activity, C4298gd c4298gd) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("placementName = " + c4298gd.c()));
        try {
            this.f63361g = c4298gd;
            a(AbstractC4468q3.h.SHOWING);
            this.f63358d.f58851i.a(activity, j());
            Object obj = this.f63357c;
            if (obj instanceof AdapterAdFullScreenInterface) {
                ((AdapterAdFullScreenInterface) obj).showAd(this.f63365k, activity, this);
                return;
            }
            ironLog.error(a("showAd - adapter not instance of AdapterAdFullScreenInterface"));
            E0 e10 = this.f63358d;
            if (e10 != null) {
                e10.f58852j.g("showAd - adapter not instance of AdapterAdFullScreenInterface");
            }
        } catch (Throwable th2) {
            C4485r4.d().a(th2);
            a(AbstractC4468q3.h.FAILED);
            String str = "showAd - exception = " + th2.getMessage() + " - state = " + this.f63359e;
            IronLog.INTERNAL.error(a(str));
            E0 e11 = this.f63358d;
            if (e11 != null) {
                e11.f58852j.g(str);
            }
            onAdShowFailed(A0.h(this.f63355a.a()), str);
        }
    }

    public void b(boolean z10) {
        E0 e10 = this.f63358d;
        if (e10 != null) {
            e10.f58851i.a(z10);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public /* synthetic */ void onAdClosed(Map map) {
        cn.a.a(this, map);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public /* synthetic */ void onAdEnded(Map map) {
        cn.a.b(this, map);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdShowFailed(int i10, String str) {
        if (u().e()) {
            u().a(new e(i10, str));
        } else {
            b(i10, str);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public /* synthetic */ void onAdStarted(Map map) {
        cn.a.c(this, map);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public /* synthetic */ void onAdVisible(Map map) {
        cn.a.d(this, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P() {
        String str;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        synchronized (this.f63371q) {
            try {
                if (this.f63359e != AbstractC4468q3.h.SHOWING) {
                    ironLog.error("unexpected ad closed for " + k() + " - state = " + this.f63359e);
                    E0 e10 = this.f63358d;
                    if (e10 != null) {
                        e10.f58852j.l("unexpected ad closed - state = " + this.f63359e);
                    }
                    return;
                }
                a(AbstractC4468q3.h.NONE);
                if (this.f63358d != null) {
                    String string = "";
                    if (this.f63355a.a() == IronSource.a.REWARDED_VIDEO) {
                        String strF = ((J0) this.f63356b).f();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("otherInstanceAvailable = ");
                        if (strF.length() > 0) {
                            str = "true|" + strF;
                        } else {
                            str = "false";
                        }
                        sb2.append(str);
                        string = sb2.toString();
                    }
                    this.f63358d.f58851i.a(j(), string);
                }
                ((J0) this.f63356b).a((AbstractC4395m3<?>) this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q() {
        IronLog.INTERNAL.verbose(d());
        E0 e10 = this.f63358d;
        if (e10 != null) {
            e10.f58851i.d(j());
        }
        ((J0) this.f63356b).c(this);
    }

    private void R() {
        IronLog.INTERNAL.verbose(d());
        ((J0) this.f63356b).b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S() {
        IronLog.INTERNAL.verbose(d());
        E0 e10 = this.f63358d;
        if (e10 != null) {
            e10.f58851i.i(j());
        }
        ((J0) this.f63356b).d((AbstractC4395m3<?>) this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        IronLog.INTERNAL.verbose(d());
        E0 e10 = this.f63358d;
        if (e10 != null) {
            e10.f58851i.k(j());
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdClosed() {
        if (u().e()) {
            u().a(new a());
        } else {
            P();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdEnded() {
        if (u().e()) {
            u().a(new c());
        } else {
            Q();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdStarted() {
        if (u().e()) {
            u().a(new b());
        } else {
            S();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdVisible() {
        if (u().e()) {
            u().a(new d());
        } else {
            T();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i10, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("error = " + i10 + ", " + str));
        AbstractC4468q3.h hVar = this.f63359e;
        if (hVar == AbstractC4468q3.h.SHOWING) {
            a(AbstractC4468q3.h.FAILED);
            E0 e10 = this.f63358d;
            if (e10 != null) {
                e10.f58851i.a(j(), i10, str, null);
            }
            ((J0) this.f63356b).a(new IronSourceError(i10, str), (AbstractC4395m3<?>) this);
            return;
        }
        String strA = a(hVar, i10, str);
        ironLog.error(a(strA));
        E0 e11 = this.f63358d;
        if (e11 != null) {
            e11.f58852j.t(strA);
        }
    }

    public static String a(AbstractC4468q3.h hVar, int i10, String str) {
        return String.format(Locale.ENGLISH, "unexpected show failed, state - %s, error - %d %s", hVar, Integer.valueOf(i10), str);
    }
}
