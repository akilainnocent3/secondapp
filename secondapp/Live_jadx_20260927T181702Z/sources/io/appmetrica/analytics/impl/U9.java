package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class U9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ul f96565a = new Ul();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public W9 f96566b = new W9();

    public final synchronized void a(W9 w10) {
        this.f96566b = w10;
    }

    public final synchronized void a(List list, HashMap map) {
        Boolean bool;
        String str;
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.m0.g((String) it.next(), "appmetrica_lib_ssl_enabled") && (bool = this.f96566b.f96671a) != null) {
                    boolean zBooleanValue = bool.booleanValue();
                    W9 w10 = this.f96566b;
                    IdentifierStatus identifierStatus = w10.f96672b;
                    String str2 = w10.f96673c;
                    if (zBooleanValue) {
                        str = "true";
                    } else {
                        if (zBooleanValue) {
                            throw new dr.o0();
                        }
                        str = "false";
                    }
                    map.put("appmetrica_lib_ssl_enabled", this.f96565a.a(new IdentifiersResult(str, identifierStatus, str2)));
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
