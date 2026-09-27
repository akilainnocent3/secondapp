package com.bytedance.sdk.openadsdk.vy;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class vgm {

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private long f38053hv;
    private long hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private long f38054sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private long f38055tq;
    private long vy;

    public void hv(long j10) {
        if (this.f38053hv <= 0) {
            this.f38053hv = j10;
        }
    }

    public void hww(long j10) {
        if (this.hww <= 0) {
            this.hww = j10;
        }
    }

    public void sd(long j10) {
        if (this.f38054sd <= 0) {
            this.f38054sd = j10;
        }
    }

    public void tq(long j10) {
        if (this.f38055tq <= 0) {
            this.f38055tq = j10;
        }
    }

    public void vy(long j10) {
        if (this.vy <= 0) {
            this.vy = j10;
        }
    }

    public boolean hww() {
        return this.hww > 0;
    }

    public JSONObject tq() {
        return hww((JSONObject) null);
    }

    public void hww(long j10, float f10) {
        if (f10 > 0.0f) {
            hww(j10);
        }
        double d10 = f10;
        if (d10 >= 0.25d) {
            hww(j10);
            tq(j10);
        }
        if (d10 >= 0.5d) {
            hww(j10);
            tq(j10);
            sd(j10);
        }
        if (d10 >= 0.75d) {
            hww(j10);
            tq(j10);
            sd(j10);
            vy(j10);
        }
        if (f10 >= 1.0f) {
            hww(j10);
            tq(j10);
            sd(j10);
            vy(j10);
            hv(j10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026 A[Catch: Exception -> 0x0041, TryCatch #0 {Exception -> 0x0041, blocks: (B:3:0x0002, B:4:0x0008, B:6:0x0010, B:8:0x001b, B:10:0x0026, B:12:0x0031, B:14:0x003c), top: B:17:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:12:0x0031 A[Catch: Exception -> 0x0041, TryCatch #0 {Exception -> 0x0041, blocks: (B:3:0x0002, B:4:0x0008, B:6:0x0010, B:8:0x001b, B:10:0x0026, B:12:0x0031, B:14:0x003c), top: B:17:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x003c A[Catch: Exception -> 0x0041, TRY_LEAVE, TryCatch #0 {Exception -> 0x0041, blocks: (B:3:0x0002, B:4:0x0008, B:6:0x0010, B:8:0x001b, B:10:0x0026, B:12:0x0031, B:14:0x003c), top: B:17:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:6:0x0010 A[Catch: Exception -> 0x0041, TryCatch #0 {Exception -> 0x0041, blocks: (B:3:0x0002, B:4:0x0008, B:6:0x0010, B:8:0x001b, B:10:0x0026, B:12:0x0031, B:14:0x003c), top: B:17:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001b A[Catch: Exception -> 0x0041, TryCatch #0 {Exception -> 0x0041, blocks: (B:3:0x0002, B:4:0x0008, B:6:0x0010, B:8:0x001b, B:10:0x0026, B:12:0x0031, B:14:0x003c), top: B:17:0x0002 }] */
    public JSONObject hww(JSONObject jSONObject) {
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
                j10 = this.hww;
                if (j10 > 0) {
                    jSONObject.put("show_start", j10);
                    j11 = this.f38055tq;
                    if (j11 > 0) {
                        jSONObject.put("show_firstQuartile", j11);
                        j12 = this.f38054sd;
                        if (j12 > 0) {
                            jSONObject.put("show_mid", j12);
                            j13 = this.vy;
                            if (j13 > 0) {
                                jSONObject.put("show_thirdQuartile", j13);
                                j14 = this.f38053hv;
                                if (j14 > 0) {
                                    jSONObject.put("show_full", j14);
                                }
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        } else {
            j10 = this.hww;
            if (j10 > 0) {
                jSONObject.put("show_start", j10);
                j11 = this.f38055tq;
                if (j11 > 0) {
                    jSONObject.put("show_firstQuartile", j11);
                    j12 = this.f38054sd;
                    if (j12 > 0) {
                        jSONObject.put("show_mid", j12);
                        j13 = this.vy;
                        if (j13 > 0) {
                            jSONObject.put("show_thirdQuartile", j13);
                            j14 = this.f38053hv;
                            if (j14 > 0) {
                                jSONObject.put("show_full", j14);
                            }
                        }
                    }
                }
            }
        }
        return jSONObject;
    }
}
