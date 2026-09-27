package com.bytedance.adsdk.tq.sd;

import com.bytedance.adsdk.tq.sd.tq.wgt;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class vy {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private final String f32313hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private final String f32314hv;
    private final List<wgt> hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private final double f32315sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final char f32316tq;
    private final double vy;

    public vy(List<wgt> list, char c10, double d10, double d11, String str, String str2) {
        this.hww = list;
        this.f32316tq = c10;
        this.f32315sd = d10;
        this.vy = d11;
        this.f32314hv = str;
        this.f32313hu = str2;
    }

    public static int hww(char c10, String str, String str2) {
        return (((c10 * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public int hashCode() {
        return hww(this.f32316tq, this.f32313hu, this.f32314hv);
    }

    public double tq() {
        return this.vy;
    }

    public List<wgt> hww() {
        return this.hww;
    }
}
