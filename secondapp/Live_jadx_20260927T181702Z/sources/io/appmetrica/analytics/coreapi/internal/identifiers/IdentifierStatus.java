package io.appmetrica.analytics.coreapi.internal.identifiers;

import cs.o;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public enum IdentifierStatus {
    OK("OK"),
    IDENTIFIER_PROVIDER_UNAVAILABLE("IDENTIFIER_PROVIDER_UNAVAILABLE"),
    INVALID_ADV_ID("INVALID_ADV_ID"),
    NO_STARTUP("NO_STARTUP"),
    FORBIDDEN_BY_CLIENT_CONFIG("FORBIDDEN_BY_CLIENT_CONFIG"),
    FEATURE_DISABLED("FEATURE_DISABLED"),
    UNKNOWN("UNKNOWN");


    @l
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f95238a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        public /* synthetic */ Companion(x xVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001b  */
        /* JADX WARN: Code duplicated, block: B:12:0x001e A[RETURN] */
        @l
        @o
        public final IdentifierStatus from(@m String str) {
            for (IdentifierStatus identifierStatus : IdentifierStatus.values()) {
                if (m0.g(identifierStatus.getValue(), str)) {
                    if (identifierStatus == null) {
                        return IdentifierStatus.UNKNOWN;
                    }
                    return identifierStatus;
                }
            }
            identifierStatus = null;
            if (identifierStatus == null) {
                return IdentifierStatus.UNKNOWN;
            }
            return identifierStatus;
        }

        private Companion() {
        }
    }

    IdentifierStatus(String str) {
        this.f95238a = str;
    }

    @l
    @o
    public static final IdentifierStatus from(@m String str) {
        return Companion.from(str);
    }

    @l
    public final String getValue() {
        return this.f95238a;
    }
}
