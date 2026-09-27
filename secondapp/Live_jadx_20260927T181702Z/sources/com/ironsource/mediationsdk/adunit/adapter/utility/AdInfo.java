package com.ironsource.mediationsdk.adunit.adapter.utility;

import com.ironsource.Bb;
import com.ironsource.C4485r4;
import com.ironsource.Z8;
import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.jvm.internal.m0;
import org.json.JSONObject;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class AdInfo {

    @m
    private final Z8 impressionData;

    @m
    private final Bb loadArmData;

    public AdInfo(@m Z8 z10, @m Bb bb2) {
        this.impressionData = z10;
        this.loadArmData = bb2;
    }

    @l
    public final String getAb() {
        Z8 z10 = this.impressionData;
        return (z10 == null || z10.a() == null) ? "" : this.impressionData.a();
    }

    @l
    public final String getAdNetwork() {
        Z8 z10 = this.impressionData;
        return (z10 == null || z10.c() == null) ? "" : this.impressionData.c();
    }

    @l
    public final String getAuctionId() {
        Z8 z10 = this.impressionData;
        return (z10 == null || z10.e() == null) ? "" : this.impressionData.e();
    }

    @l
    public final String getCountry() {
        Z8 z10 = this.impressionData;
        return (z10 == null || z10.f() == null) ? "" : this.impressionData.f();
    }

    @l
    public final String getEncryptedCPM() {
        Z8 z10 = this.impressionData;
        return (z10 == null || z10.h() == null) ? "" : this.impressionData.h();
    }

    @l
    public final String getInstanceId() {
        Z8 z10 = this.impressionData;
        return (z10 == null || z10.i() == null) ? "" : this.impressionData.i();
    }

    @l
    public final String getInstanceName() {
        Z8 z10 = this.impressionData;
        return (z10 == null || z10.j() == null) ? "" : this.impressionData.j();
    }

    @l
    public final String getPrecision() {
        Bb bb2 = this.loadArmData;
        if (bb2 != null) {
            return bb2.c();
        }
        Z8 z10 = this.impressionData;
        return (z10 == null || z10.n() == null) ? "" : this.impressionData.n();
    }

    public final double getRevenue() {
        Bb bb2 = this.loadArmData;
        if (bb2 != null) {
            return bb2.d();
        }
        Z8 z10 = this.impressionData;
        if (z10 == null) {
            return 0.0d;
        }
        z10.o();
        return this.impressionData.o();
    }

    @l
    public final String getSegmentName() {
        Z8 z10 = this.impressionData;
        return (z10 == null || z10.p() == null) ? "" : this.impressionData.p();
    }

    @l
    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("auctionId", getAuctionId());
            jSONObject.put("country", getCountry());
            jSONObject.put("ab", getAb());
            jSONObject.put("segmentName", getSegmentName());
            jSONObject.put("adNetwork", getAdNetwork());
            jSONObject.put("instanceName", getInstanceName());
            jSONObject.put("instanceId", getInstanceId());
            jSONObject.put("revenue", getRevenue());
            jSONObject.put("precision", getPrecision());
            jSONObject.put("encryptedCPM", getEncryptedCPM());
        } catch (Exception e10) {
            C4485r4.d().a(e10);
            IronLog.INTERNAL.error("error while parsing ad info " + e10.getMessage());
        }
        String string = jSONObject.toString();
        m0.o(string, "adInfoData.toString()");
        return string;
    }
}
