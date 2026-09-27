package com.cleveradssolutions.internal.content;

import java.util.HashMap;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class f0 extends n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f43401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f43402e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.cleveradssolutions.internal.mediation.h f43403f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(HashMap map, String unitLabel, String mediation, com.cleveradssolutions.internal.mediation.h source) {
        super(map);
        m0.p(unitLabel, "unitLabel");
        m0.p(mediation, "mediation");
        m0.p(source, "source");
        this.f43401d = unitLabel;
        this.f43402e = mediation;
        this.f43403f = source;
    }

    @Override // com.cleveradssolutions.mediation.core.u
    public final String j() {
        return this.f43401d;
    }
}
