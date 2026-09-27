package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.u4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC5415u4 extends Bd {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f98397f;

    public AbstractC5415u4(int i10, String str, Object obj, to toVar, K2 k10) {
        super(i10, str, toVar, k10);
        this.f98397f = obj;
    }

    @Override // io.appmetrica.analytics.impl.Bd, io.appmetrica.analytics.impl.InterfaceC5056fo
    public final void a(@NonNull C5030eo c5030eo) {
        if (f()) {
            K2 k10 = this.f95616d;
            int i10 = this.f95614b;
            C5082go c5082goA = k10.a(c5030eo, (C5082go) ((HashMap) c5030eo.f97306a.get(i10)).get(this.f95613a), this);
            if (c5082goA != null) {
                a(c5082goA);
            }
        }
    }

    public abstract void a(@NonNull C5082go c5082go);

    @NonNull
    public final Object g() {
        return this.f98397f;
    }
}
