package io.appmetrica.analytics.coreutils.internal.toggle;

import fw.b;
import io.appmetrica.analytics.coreapi.internal.data.Savable;
import io.appmetrica.analytics.coreapi.internal.data.Updatable;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class SavableToggle extends SimpleThreadSafeToggle implements Updatable<Boolean> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Savable f95377d;

    public SavableToggle(@l String str, @l Savable<Boolean> savable) {
        super(savable.getValue().booleanValue(), "[SavableToggle - " + str + b.f85385l);
        this.f95377d = savable;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Updatable
    public /* bridge */ /* synthetic */ void update(Boolean bool) {
        update(bool.booleanValue());
    }

    public void update(boolean z10) {
        updateState(z10);
        this.f95377d.setValue(Boolean.valueOf(getActualState()));
    }
}
