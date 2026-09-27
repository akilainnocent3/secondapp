package com.chartboost.sdk.privacy.model;

import com.chartboost.sdk.impl.ci;
import com.chartboost.sdk.impl.ei;
import com.chartboost.sdk.impl.hi;
import com.chartboost.sdk.impl.m7;
import com.chartboost.sdk.impl.o5;
import com.chartboost.sdk.impl.th;
import com.chartboost.sdk.impl.wh;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class GenericDataUseConsent implements DataUseConsent, m7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m7 f41892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f41893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f41894c;

    /* JADX WARN: Multi-variable type inference failed */
    public GenericDataUseConsent() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final Object a() {
        return this.f41894c;
    }

    public final void b(String str) {
        m0.p(str, "<set-?>");
        this.f41893b = str;
    }

    @Override // com.chartboost.sdk.impl.l7
    public void clear(@l String type, @l String location) {
        m0.p(type, "type");
        m0.p(location, "location");
        this.f41892a.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.m7
    @l
    public ei clearFromStorage(@l ei eiVar) {
        m0.p(eiVar, "<this>");
        return this.f41892a.clearFromStorage(eiVar);
    }

    @Override // com.chartboost.sdk.privacy.model.DataUseConsent
    @l
    public String getPrivacyStandard() {
        return this.f41893b;
    }

    @Override // com.chartboost.sdk.impl.m7
    @l
    public ei persist(@l ei eiVar) {
        m0.p(eiVar, "<this>");
        return this.f41892a.persist(eiVar);
    }

    @Override // com.chartboost.sdk.impl.m7
    @l
    public ci refresh(@l ci ciVar) {
        m0.p(ciVar, "<this>");
        return this.f41892a.refresh(ciVar);
    }

    @Override // com.chartboost.sdk.impl.m7
    @l
    public th store(@l th thVar) {
        m0.p(thVar, "<this>");
        return this.f41892a.store(thVar);
    }

    @Override // com.chartboost.sdk.impl.m7
    @l
    public ei track(@l ei eiVar) {
        m0.p(eiVar, "<this>");
        return this.f41892a.track(eiVar);
    }

    public GenericDataUseConsent(@l m7 eventTracker) {
        m0.p(eventTracker, "eventTracker");
        this.f41892a = eventTracker;
        this.f41893b = "";
        this.f41894c = "";
    }

    public final void a(Object obj) {
        m0.p(obj, "<set-?>");
        this.f41894c = obj;
    }

    @Override // com.chartboost.sdk.impl.l7
    /* JADX INFO: renamed from: clearFromStorage */
    public void mo161clearFromStorage(@l ei event) {
        m0.p(event, "event");
        this.f41892a.mo161clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.l7
    /* JADX INFO: renamed from: persist */
    public void mo162persist(@l ei event) {
        m0.p(event, "event");
        this.f41892a.mo162persist(event);
    }

    @Override // com.chartboost.sdk.impl.l7
    /* JADX INFO: renamed from: refresh */
    public void mo163refresh(@l ci config) {
        m0.p(config, "config");
        this.f41892a.mo163refresh(config);
    }

    @Override // com.chartboost.sdk.impl.l7
    /* JADX INFO: renamed from: store */
    public void mo164store(@l th ad2) {
        m0.p(ad2, "ad");
        this.f41892a.mo164store(ad2);
    }

    @Override // com.chartboost.sdk.impl.l7
    /* JADX INFO: renamed from: track */
    public void mo165track(@l ei event) {
        m0.p(event, "event");
        this.f41892a.mo165track(event);
    }

    public final void a(String str) {
        try {
            track((ei) new o5(hi.d.CREATION_ERROR, str == null ? "no message" : str, "", "", null, null, 48, null));
            throw new Exception(str);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public /* synthetic */ GenericDataUseConsent(m7 m7Var, int i10, x xVar) {
        this((i10 & 1) != 0 ? wh.a() : m7Var);
    }
}
