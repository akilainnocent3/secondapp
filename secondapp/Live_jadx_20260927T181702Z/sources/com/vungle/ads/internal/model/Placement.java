package com.vungle.ads.internal.model;

import bw.f;
import com.vungle.ads.internal.Constants;
import cw.e;
import dr.g1;
import dr.o;
import dr.q;
import dw.c3;
import dw.g2;
import dw.w2;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;
import zv.a0;
import zv.b0;
import zv.j;
import zv.s0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@b0
public final class Placement {

    @l
    public static final Companion Companion = new Companion(null);
    private final boolean headerBidding;

    @l
    private final String referenceId;

    @m
    private final String type;

    @m
    private Long wakeupTime;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        public /* synthetic */ Companion(x xVar) {
            this();
        }

        @l
        public final j<Placement> serializer() {
            return Placement$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @o(level = q.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @g1(expression = "", imports = {}))
    public /* synthetic */ Placement(int i10, @a0("placement_ref_id") String str, @a0("is_hb") boolean z10, @a0("type") String str2, w2 w2Var) {
        if (1 != (i10 & 1)) {
            g2.b(i10, 1, Placement$$serializer.INSTANCE.getDescriptor());
        }
        this.referenceId = str;
        if ((i10 & 2) == 0) {
            this.headerBidding = false;
        } else {
            this.headerBidding = z10;
        }
        if ((i10 & 4) == 0) {
            this.type = null;
        } else {
            this.type = str2;
        }
        this.wakeupTime = null;
    }

    public static /* synthetic */ Placement copy$default(Placement placement, String str, boolean z10, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = placement.referenceId;
        }
        if ((i10 & 2) != 0) {
            z10 = placement.headerBidding;
        }
        if ((i10 & 4) != 0) {
            str2 = placement.type;
        }
        return placement.copy(str, z10, str2);
    }

    @cs.o
    public static final void write$Self(@l Placement self, @l e output, @l f serialDesc) {
        m0.p(self, "self");
        m0.p(output, "output");
        m0.p(serialDesc, "serialDesc");
        output.v(serialDesc, 0, self.referenceId);
        if (output.q(serialDesc, 1) || self.headerBidding) {
            output.B(serialDesc, 1, self.headerBidding);
        }
        if (!output.q(serialDesc, 2) && self.type == null) {
            return;
        }
        output.i(serialDesc, 2, c3.f79541a, self.type);
    }

    @l
    public final String component1() {
        return this.referenceId;
    }

    public final boolean component2() {
        return this.headerBidding;
    }

    @m
    public final String component3() {
        return this.type;
    }

    @l
    public final Placement copy(@l String referenceId, boolean z10, @m String str) {
        m0.p(referenceId, "referenceId");
        return new Placement(referenceId, z10, str);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Placement)) {
            return false;
        }
        Placement placement = (Placement) obj;
        return m0.g(this.referenceId, placement.referenceId) && this.headerBidding == placement.headerBidding && m0.g(this.type, placement.type);
    }

    public final boolean getHeaderBidding() {
        return this.headerBidding;
    }

    @l
    public final String getReferenceId() {
        return this.referenceId;
    }

    @m
    public final String getType() {
        return this.type;
    }

    @m
    public final Long getWakeupTime() {
        return this.wakeupTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iHashCode = this.referenceId.hashCode() * 31;
        boolean z10 = this.headerBidding;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = (iHashCode + r10) * 31;
        String str = this.type;
        return i10 + (str == null ? 0 : str.hashCode());
    }

    public final boolean isAppOpen() {
        return m0.g(this.type, Constants.PLACEMENT_TYPE_APP_OPEN);
    }

    public final boolean isBanner() {
        return m0.g(this.type, "banner");
    }

    public final boolean isInline() {
        return m0.g(this.type, "in_line");
    }

    public final boolean isInterstitial() {
        return m0.g(this.type, "interstitial");
    }

    public final boolean isMREC() {
        return m0.g(this.type, "mrec");
    }

    public final boolean isNative() {
        return m0.g(this.type, "native");
    }

    public final boolean isRewardedVideo() {
        return m0.g(this.type, "rewarded");
    }

    public final void setWakeupTime(@m Long l10) {
        this.wakeupTime = l10;
    }

    public final void snooze(long j10) {
        this.wakeupTime = Long.valueOf(System.currentTimeMillis() + (j10 * ((long) 1000)));
    }

    @l
    public String toString() {
        return "Placement(referenceId=" + this.referenceId + ", headerBidding=" + this.headerBidding + ", type=" + this.type + ')';
    }

    public Placement(@l String referenceId, boolean z10, @m String str) {
        m0.p(referenceId, "referenceId");
        this.referenceId = referenceId;
        this.headerBidding = z10;
        this.type = str;
    }

    public /* synthetic */ Placement(String str, boolean z10, String str2, int i10, x xVar) {
        this(str, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? null : str2);
    }

    @a0("is_hb")
    public static /* synthetic */ void getHeaderBidding$annotations() {
    }

    @a0("placement_ref_id")
    public static /* synthetic */ void getReferenceId$annotations() {
    }

    @a0("type")
    public static /* synthetic */ void getType$annotations() {
    }

    @s0
    public static /* synthetic */ void getWakeupTime$annotations() {
    }
}
