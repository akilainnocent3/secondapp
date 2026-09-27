package com.chartboost.sdk.impl;

import android.view.ViewGroup;
import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.view.CBImpressionActivity;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class x2 implements z9, ha, aa, ra {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fa f41419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z9 f41420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ha f41421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aa f41422d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ra f41423e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public na f41424f;

    public x2(fa impressionDependency, z9 impressionClick, ha impressionDismiss, aa impressionComplete, ra impressionView) {
        kotlin.jvm.internal.m0.p(impressionDependency, "impressionDependency");
        kotlin.jvm.internal.m0.p(impressionClick, "impressionClick");
        kotlin.jvm.internal.m0.p(impressionDismiss, "impressionDismiss");
        kotlin.jvm.internal.m0.p(impressionComplete, "impressionComplete");
        kotlin.jvm.internal.m0.p(impressionView, "impressionView");
        this.f41419a = impressionDependency;
        this.f41420b = impressionClick;
        this.f41421c = impressionDismiss;
        this.f41422d = impressionComplete;
        this.f41423e = impressionView;
        this.f41424f = na.LOADING;
    }

    public final void A() {
        if (j() && kotlin.jvm.internal.m0.g(this.f41419a.a(), a0.c.f38152g)) {
            z();
        }
    }

    public final void B() {
        if (this.f41419a.l().b() <= 1) {
            K();
            ea eaVarL = this.f41419a.l();
            eaVarL.b(eaVarL.b() + 1);
        }
    }

    public final boolean C() {
        if (this.f41419a.r().u() == null) {
            return true;
        }
        ok okVarU = this.f41419a.r().u();
        return (okVarU != null ? okVarU.getRootView() : null) == null;
    }

    public final void D() {
        try {
            if (this.f41419a.r() instanceof hk) {
                ((hk) this.f41419a.r()).I();
            } else {
                this.f41419a.r().v();
                this.f41419a.r().a(qj.VOLUME_CHANGE);
            }
        } catch (Exception e10) {
            sb.b("Invalid mute video command", e10);
        }
    }

    public final void E() {
        b(this.f41419a.n(), Float.valueOf(this.f41419a.r().t()), Float.valueOf(this.f41419a.r().s()));
        d();
    }

    public final void F() {
        if (this.f41419a.l().c() <= 1) {
            B();
            ea eaVarL = this.f41419a.l();
            eaVarL.c(eaVarL.c() + 1);
        }
    }

    public final void G() {
        if (this.f41424f != na.DISPLAYED || j()) {
            return;
        }
        l();
        d(true);
    }

    public final void H() {
        try {
            n3 n3VarR = this.f41419a.r();
            kotlin.jvm.internal.m0.n(n3VarR, "null cannot be cast to non-null type com.chartboost.sdk.internal.video.VideoProtocol");
            ((hk) n3VarR).L();
        } catch (Exception e10) {
            sb.b("Invalid pause video command", e10);
        }
    }

    public final void I() {
        try {
            n3 n3VarR = this.f41419a.r();
            kotlin.jvm.internal.m0.n(n3VarR, "null cannot be cast to non-null type com.chartboost.sdk.internal.video.VideoProtocol");
            ((hk) n3VarR).M();
        } catch (Exception e10) {
            sb.b("Invalid play video command", e10);
        }
    }

    public final void J() {
        this.f41424f = na.LOADING;
        CBError.Impression impressionA = this.f41419a.r().A();
        if (impressionA == null) {
            g();
        } else {
            b(impressionA);
        }
    }

    public final void K() {
        a(this.f41419a.n(), Float.valueOf(this.f41419a.r().t()), Float.valueOf(this.f41419a.r().s()));
    }

    public final boolean L() {
        return this.f41419a.a().c();
    }

    public final void M() {
        if (this.f41419a.l().d() <= 1) {
            z();
            B();
            ea eaVarL = this.f41419a.l();
            eaVarL.d(eaVarL.d() + 1);
        }
    }

    public final void N() {
        try {
            if (this.f41419a.r() instanceof hk) {
                ((hk) this.f41419a.r()).O();
            } else {
                this.f41419a.r().D();
                this.f41419a.r().a(qj.VOLUME_CHANGE);
            }
        } catch (Exception e10) {
            sb.b("Invalid unmute video command", e10);
        }
    }

    public final void O() {
        this.f41419a.r().w();
    }

    public final void P() {
        this.f41419a.r().f();
    }

    @Override // com.chartboost.sdk.impl.z9
    public void a(String str, CBError.Click error) {
        kotlin.jvm.internal.m0.p(error, "error");
        this.f41420b.a(str, error);
    }

    public final void b(CBError.Impression error) {
        kotlin.jvm.internal.m0.p(error, "error");
        if (j()) {
            this.f41419a.c().m();
        } else {
            a(error);
        }
    }

    @Override // com.chartboost.sdk.impl.ha
    public void c() {
        this.f41421c.c();
    }

    @Override // com.chartboost.sdk.impl.z9
    public void d() {
        this.f41420b.d();
    }

    @Override // com.chartboost.sdk.impl.ra
    public boolean e() {
        return this.f41423e.e();
    }

    @Override // com.chartboost.sdk.impl.ra
    public boolean f() {
        return this.f41423e.f();
    }

    @Override // com.chartboost.sdk.impl.ra
    public void g() {
        this.f41423e.g();
    }

    @Override // com.chartboost.sdk.impl.ra
    public boolean h() {
        return this.f41423e.h();
    }

    @Override // com.chartboost.sdk.impl.ra
    public ViewGroup i() {
        return this.f41423e.i();
    }

    @Override // com.chartboost.sdk.impl.ra
    public boolean j() {
        return this.f41423e.j();
    }

    @Override // com.chartboost.sdk.impl.ra
    public void k() {
        this.f41423e.k();
    }

    @Override // com.chartboost.sdk.impl.ra
    public void l() {
        this.f41423e.l();
    }

    public final void m() {
        a(this.f41424f);
    }

    public final void n() {
        try {
            n3 n3VarR = this.f41419a.r();
            kotlin.jvm.internal.m0.n(n3VarR, "null cannot be cast to non-null type com.chartboost.sdk.internal.video.VideoProtocol");
            ((hk) n3VarR).E();
        } catch (Exception e10) {
            sb.b("Invalid close video command", e10);
        }
    }

    public final String o() {
        return this.f41419a.b().m();
    }

    @Override // com.chartboost.sdk.impl.ra
    public void onResume() {
        this.f41423e.onResume();
    }

    @Override // com.chartboost.sdk.impl.ra
    public void onStart() {
        this.f41423e.onStart();
    }

    public final String p() {
        return this.f41419a.b().t();
    }

    public na q() {
        return this.f41424f;
    }

    public final String r() {
        return this.f41419a.n();
    }

    public final String s() {
        return this.f41419a.r().i();
    }

    public final String t() {
        return this.f41419a.r().k();
    }

    public final String u() {
        return this.f41419a.r().m();
    }

    public final String v() {
        return this.f41419a.r().o();
    }

    public final String w() {
        return this.f41419a.r().p();
    }

    public final int x() {
        if (this.f41419a.r() instanceof hk) {
            return ((hk) this.f41419a.r()).G();
        }
        return -1;
    }

    public final ok y() {
        return this.f41419a.r().u();
    }

    public final void z() {
        if (this.f41419a.l().a() <= 1) {
            a();
            ea eaVarL = this.f41419a.l();
            eaVarL.a(eaVarL.a() + 1);
        }
    }

    @Override // com.chartboost.sdk.impl.ra
    public void a(na state, CBImpressionActivity activity) {
        kotlin.jvm.internal.m0.p(state, "state");
        kotlin.jvm.internal.m0.p(activity, "activity");
        this.f41423e.a(state, activity);
    }

    @Override // com.chartboost.sdk.impl.z9
    public void c(l3 cbUrl) {
        kotlin.jvm.internal.m0.p(cbUrl, "cbUrl");
        this.f41420b.c(cbUrl);
    }

    @Override // com.chartboost.sdk.impl.ra
    public void d(boolean z10) {
        this.f41423e.d(z10);
    }

    @Override // com.chartboost.sdk.impl.z9
    public void e(boolean z10) {
        this.f41420b.e(z10);
    }

    @Override // com.chartboost.sdk.impl.ha
    public void f(boolean z10) {
        this.f41421c.f(z10);
    }

    @Override // com.chartboost.sdk.impl.ra
    public void a(ViewGroup viewGroup) {
        this.f41423e.a(viewGroup);
    }

    @Override // com.chartboost.sdk.impl.ra
    public void c(boolean z10) {
        this.f41423e.c(z10);
    }

    public final void d(l3 cbUrl) {
        kotlin.jvm.internal.m0.p(cbUrl, "cbUrl");
        a(cbUrl.b(), cbUrl.a(), this.f41424f);
    }

    @Override // com.chartboost.sdk.impl.aa
    public void a() {
        this.f41422d.a();
    }

    @Override // com.chartboost.sdk.impl.z9
    public boolean a(String urlFromCreative, Boolean bool, na impressionState) {
        kotlin.jvm.internal.m0.p(urlFromCreative, "urlFromCreative");
        kotlin.jvm.internal.m0.p(impressionState, "impressionState");
        return this.f41420b.a(urlFromCreative, bool, impressionState);
    }

    @Override // com.chartboost.sdk.impl.z9
    public void b(l3 cbUrl) {
        kotlin.jvm.internal.m0.p(cbUrl, "cbUrl");
        this.f41420b.b(cbUrl);
    }

    @Override // com.chartboost.sdk.impl.ha
    public void a(na state) {
        kotlin.jvm.internal.m0.p(state, "state");
        this.f41421c.a(state);
    }

    @Override // com.chartboost.sdk.impl.ra
    public void b() {
        this.f41423e.b();
    }

    @Override // com.chartboost.sdk.impl.ra
    public void a(CBError.Impression error) {
        kotlin.jvm.internal.m0.p(error, "error");
        this.f41423e.a(error);
    }

    public void b(na newState) {
        kotlin.jvm.internal.m0.p(newState, "newState");
        this.f41424f = newState;
    }

    @Override // com.chartboost.sdk.impl.z9
    public void a(l3 cbUrl) {
        kotlin.jvm.internal.m0.p(cbUrl, "cbUrl");
        this.f41420b.a(cbUrl);
    }

    public final void a(List verificationScriptResourceList, Integer num) {
        kotlin.jvm.internal.m0.p(verificationScriptResourceList, "verificationScriptResourceList");
        this.f41419a.r().a(verificationScriptResourceList, num);
    }

    @Override // com.chartboost.sdk.impl.ra
    public void b(boolean z10) {
        this.f41423e.b(z10);
    }

    public final void b(float f10) {
        this.f41419a.r().b(f10);
    }

    public final void a(float f10, float f11) {
        this.f41419a.r().a(f10, f11);
    }

    @Override // com.chartboost.sdk.impl.z9
    public void b(String location, Float f10, Float f11) {
        kotlin.jvm.internal.m0.p(location, "location");
        this.f41420b.b(location, f10, f11);
    }

    @Override // com.chartboost.sdk.impl.aa
    public void a(String location, Float f10, Float f11) {
        kotlin.jvm.internal.m0.p(location, "location");
        this.f41422d.a(location, f10, f11);
    }

    public final void a(String event) {
        List list;
        kotlin.jvm.internal.m0.p(event, "event");
        if (event.length() <= 0 || (list = (List) this.f41419a.b().l().get(event)) == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f41419a.r().d((String) it.next());
        }
    }

    public final void a(qj vastVideoEvent) {
        kotlin.jvm.internal.m0.p(vastVideoEvent, "vastVideoEvent");
        this.f41419a.r().a(vastVideoEvent);
    }

    public final void a(boolean z10, String forceOrientation) {
        kotlin.jvm.internal.m0.p(forceOrientation, "forceOrientation");
        this.f41419a.r().a(z10, forceOrientation);
    }

    public final void a(float f10) {
        this.f41419a.r().a(f10);
    }

    @Override // com.chartboost.sdk.impl.ra
    public void a(boolean z10) {
        this.f41423e.a(z10);
    }

    public final void a(re playerState) {
        kotlin.jvm.internal.m0.p(playerState, "playerState");
        this.f41419a.r().a(playerState);
    }
}
