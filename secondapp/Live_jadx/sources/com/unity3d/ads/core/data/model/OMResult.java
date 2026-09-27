package com.unity3d.ads.core.data.model;

import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class OMResult {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Failure extends OMResult {

        @l
        private final String reason;

        @m
        private final String reasonDebug;

        public /* synthetic */ Failure(String str, String str2, int i10, x xVar) {
            this(str, (i10 & 2) != 0 ? null : str2);
        }

        public static /* synthetic */ Failure copy$default(Failure failure, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = failure.reason;
            }
            if ((i10 & 2) != 0) {
                str2 = failure.reasonDebug;
            }
            return failure.copy(str, str2);
        }

        @l
        public final String component1() {
            return this.reason;
        }

        @m
        public final String component2() {
            return this.reasonDebug;
        }

        @l
        public final Failure copy(@l String reason, @m String str) {
            m0.p(reason, "reason");
            return new Failure(reason, str);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) obj;
            return m0.g(this.reason, failure.reason) && m0.g(this.reasonDebug, failure.reasonDebug);
        }

        @l
        public final String getReason() {
            return this.reason;
        }

        @m
        public final String getReasonDebug() {
            return this.reasonDebug;
        }

        public int hashCode() {
            int iHashCode = this.reason.hashCode() * 31;
            String str = this.reasonDebug;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @l
        public String toString() {
            return "Failure(reason=" + this.reason + ", reasonDebug=" + this.reasonDebug + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(@l String reason, @m String str) {
            super(null);
            m0.p(reason, "reason");
            this.reason = reason;
            this.reasonDebug = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Success extends OMResult {

        @l
        public static final Success INSTANCE = new Success();

        private Success() {
            super(null);
        }
    }

    public /* synthetic */ OMResult(x xVar) {
        this();
    }

    private OMResult() {
    }
}
