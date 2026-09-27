package com.unity3d.ads.core.domain.offerwall;

import com.unity3d.services.ads.offerwall.OfferwallEvent;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class OfferwallEventData {

    @m
    private final Integer errorCode;

    @m
    private final String errorMessage;

    @l
    private final OfferwallEvent offerwallEvent;

    @m
    private final String placementName;

    public OfferwallEventData(@l OfferwallEvent offerwallEvent, @m String str, @m String str2, @m Integer num) {
        m0.p(offerwallEvent, "offerwallEvent");
        this.offerwallEvent = offerwallEvent;
        this.placementName = str;
        this.errorMessage = str2;
        this.errorCode = num;
    }

    public static /* synthetic */ OfferwallEventData copy$default(OfferwallEventData offerwallEventData, OfferwallEvent offerwallEvent, String str, String str2, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            offerwallEvent = offerwallEventData.offerwallEvent;
        }
        if ((i10 & 2) != 0) {
            str = offerwallEventData.placementName;
        }
        if ((i10 & 4) != 0) {
            str2 = offerwallEventData.errorMessage;
        }
        if ((i10 & 8) != 0) {
            num = offerwallEventData.errorCode;
        }
        return offerwallEventData.copy(offerwallEvent, str, str2, num);
    }

    @l
    public final OfferwallEvent component1() {
        return this.offerwallEvent;
    }

    @m
    public final String component2() {
        return this.placementName;
    }

    @m
    public final String component3() {
        return this.errorMessage;
    }

    @m
    public final Integer component4() {
        return this.errorCode;
    }

    @l
    public final OfferwallEventData copy(@l OfferwallEvent offerwallEvent, @m String str, @m String str2, @m Integer num) {
        m0.p(offerwallEvent, "offerwallEvent");
        return new OfferwallEventData(offerwallEvent, str, str2, num);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferwallEventData)) {
            return false;
        }
        OfferwallEventData offerwallEventData = (OfferwallEventData) obj;
        return this.offerwallEvent == offerwallEventData.offerwallEvent && m0.g(this.placementName, offerwallEventData.placementName) && m0.g(this.errorMessage, offerwallEventData.errorMessage) && m0.g(this.errorCode, offerwallEventData.errorCode);
    }

    @m
    public final Integer getErrorCode() {
        return this.errorCode;
    }

    @m
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @l
    public final OfferwallEvent getOfferwallEvent() {
        return this.offerwallEvent;
    }

    @m
    public final String getPlacementName() {
        return this.placementName;
    }

    public int hashCode() {
        int iHashCode = this.offerwallEvent.hashCode() * 31;
        String str = this.placementName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.errorMessage;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.errorCode;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    @l
    public String toString() {
        return "OfferwallEventData(offerwallEvent=" + this.offerwallEvent + ", placementName=" + this.placementName + ", errorMessage=" + this.errorMessage + ", errorCode=" + this.errorCode + ')';
    }

    public /* synthetic */ OfferwallEventData(OfferwallEvent offerwallEvent, String str, String str2, Integer num, int i10, x xVar) {
        this(offerwallEvent, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : num);
    }
}
