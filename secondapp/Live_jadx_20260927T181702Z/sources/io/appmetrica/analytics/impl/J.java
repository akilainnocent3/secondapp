package io.appmetrica.analytics.impl;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.appmetrica.analytics.coreutils.internal.toggle.ConjunctiveCompositeThreadSafeToggle;
import io.appmetrica.analytics.coreutils.internal.toggle.OuterStateToggle;
import io.appmetrica.analytics.coreutils.internal.toggle.SavableToggle;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4918af f95958a = C5272oa.k().y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SavableToggle f95959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final OuterStateToggle f95960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final OuterStateToggle f95961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConjunctiveCompositeThreadSafeToggle f95962e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConjunctiveCompositeThreadSafeToggle f95963f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SavableToggle f95964g;

    public J(C5080gm c5080gm) {
        SavableToggle savableToggle = new SavableToggle("advIdsFromClientApi", new I(this));
        this.f95959b = savableToggle;
        OuterStateToggle outerStateToggle = new OuterStateToggle(false, "GAID-remote-config");
        this.f95960c = outerStateToggle;
        OuterStateToggle outerStateToggle2 = new OuterStateToggle(false, "HOAID-remote-config");
        this.f95961d = outerStateToggle2;
        this.f95962e = new ConjunctiveCompositeThreadSafeToggle(fr.h0.Q(savableToggle, outerStateToggle), IronSourceConstants.TYPE_GAID);
        this.f95963f = new ConjunctiveCompositeThreadSafeToggle(fr.h0.Q(savableToggle, outerStateToggle2), "HOAID");
        this.f95964g = savableToggle;
        a(c5080gm);
    }

    public final void a(C5080gm c5080gm) {
        boolean z10 = c5080gm.f97455p;
        boolean z11 = true;
        this.f95960c.update(!z10 || c5080gm.f97453n.f97869c);
        OuterStateToggle outerStateToggle = this.f95961d;
        if (z10 && !c5080gm.f97453n.f97871e) {
            z11 = false;
        }
        outerStateToggle.update(z11);
    }

    public final G a() {
        int i10;
        int i11 = 3;
        int i12 = 4;
        if (this.f95962e.getActualState()) {
            i10 = 1;
        } else if (this.f95959b.getActualState()) {
            i10 = !this.f95960c.getActualState() ? 3 : 4;
        } else {
            i10 = 2;
        }
        if (this.f95963f.getActualState()) {
            i11 = 1;
        } else if (!this.f95959b.getActualState()) {
            i11 = 2;
        } else if (this.f95961d.getActualState()) {
            i11 = 4;
        }
        if (this.f95964g.getActualState()) {
            i12 = 1;
        } else if (!this.f95959b.getActualState()) {
            i12 = 2;
        }
        return new G(i10, i11, i12);
    }
}
