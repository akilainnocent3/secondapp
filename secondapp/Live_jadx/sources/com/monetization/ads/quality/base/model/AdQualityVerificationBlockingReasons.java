package com.monetization.ads.quality.base.model;

import gi.j;
import java.util.List;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class AdQualityVerificationBlockingReasons {

    @l
    private final List<String> blockReasons;

    @l
    private final List<String> reportReasons;

    public AdQualityVerificationBlockingReasons(@l List<String> list, @l List<String> list2) {
        this.blockReasons = list;
        this.reportReasons = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdQualityVerificationBlockingReasons copy$default(AdQualityVerificationBlockingReasons adQualityVerificationBlockingReasons, List list, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = adQualityVerificationBlockingReasons.blockReasons;
        }
        if ((i10 & 2) != 0) {
            list2 = adQualityVerificationBlockingReasons.reportReasons;
        }
        return adQualityVerificationBlockingReasons.copy(list, list2);
    }

    @l
    public final List<String> component1() {
        return this.blockReasons;
    }

    @l
    public final List<String> component2() {
        return this.reportReasons;
    }

    @l
    public final AdQualityVerificationBlockingReasons copy(@l List<String> list, @l List<String> list2) {
        return new AdQualityVerificationBlockingReasons(list, list2);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdQualityVerificationBlockingReasons)) {
            return false;
        }
        AdQualityVerificationBlockingReasons adQualityVerificationBlockingReasons = (AdQualityVerificationBlockingReasons) obj;
        return m0.g(this.blockReasons, adQualityVerificationBlockingReasons.blockReasons) && m0.g(this.reportReasons, adQualityVerificationBlockingReasons.reportReasons);
    }

    @l
    public final List<String> getBlockReasons() {
        return this.blockReasons;
    }

    @l
    public final List<String> getReportReasons() {
        return this.reportReasons;
    }

    public int hashCode() {
        return this.reportReasons.hashCode() + (this.blockReasons.hashCode() * 31);
    }

    @l
    public String toString() {
        return "AdQualityVerificationBlockingReasons(blockReasons=" + this.blockReasons + ", reportReasons=" + this.reportReasons + j.f86771d;
    }
}
