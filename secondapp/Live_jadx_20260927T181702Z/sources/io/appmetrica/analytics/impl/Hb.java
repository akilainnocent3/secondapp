package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Hb implements InterfaceC5163k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5241n4 f95887a;

    public Hb(@NonNull C5241n4 c5241n4) {
        this.f95887a = c5241n4;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5163k2
    @Nullable
    public final C5082go a(@NonNull C5030eo c5030eo, @NonNull C5082go c5082go) {
        int i10 = c5030eo.f97307b;
        int i11 = this.f95887a.f97938a;
        if (i10 == i11) {
            if (((C5082go) ((HashMap) c5030eo.f97306a.get(c5082go.f97475b)).get(new String(c5082go.f97474a))) != null) {
                ((HashMap) c5030eo.f97306a.get(c5082go.f97475b)).put(new String(c5082go.f97474a), c5082go);
                return c5082go;
            }
        } else if (i10 < i11) {
            ((HashMap) c5030eo.f97306a.get(c5082go.f97475b)).put(new String(c5082go.f97474a), c5082go);
            c5030eo.f97307b++;
        }
        return c5082go;
    }
}
