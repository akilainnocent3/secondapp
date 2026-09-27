package io.appmetrica.analytics.appsetid.internal;

import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public interface AppSetIdListener {
    void onAppSetIdRetrieved(@m String str, @l AppSetIdScope appSetIdScope);

    void onFailure(@m Throwable th2);
}
