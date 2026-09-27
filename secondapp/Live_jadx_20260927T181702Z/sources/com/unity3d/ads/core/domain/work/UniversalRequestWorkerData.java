package com.unity3d.ads.core.domain.work;

import androidx.work.e;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class UniversalRequestWorkerData {

    @l
    public static final Companion Companion = new Companion(null);

    @l
    public static final String KEY_UNIVERSAL_REQUEST_ID = "universalRequestId";

    @l
    private final String universalRequestId;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        public /* synthetic */ Companion(x xVar) {
            this();
        }

        private Companion() {
        }
    }

    public UniversalRequestWorkerData(@l String universalRequestId) {
        m0.p(universalRequestId, "universalRequestId");
        this.universalRequestId = universalRequestId;
    }

    @l
    public final e invoke() throws Throwable {
        e eVarA = new e.a().q(KEY_UNIVERSAL_REQUEST_ID, this.universalRequestId).a();
        m0.o(eVarA, "Builder()\n            .p…tId)\n            .build()");
        return eVarA;
    }
}
