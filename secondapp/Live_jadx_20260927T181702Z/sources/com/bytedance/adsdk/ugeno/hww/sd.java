package com.bytedance.adsdk.ugeno.hww;

import fw.b;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class sd {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private hww f32544hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private long f32545hv;
    private Map<String, TreeMap<Float, String>> hww;
    private JSONObject nod;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private String f32546ok;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private int f32547rs = 1;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private int f32548sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private long f32549tq;
    private String vgm;
    private String vy;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class hww {
        public String hww;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        public String f32550tq;
    }

    public long hu() {
        return this.f32545hv;
    }

    public String hv() {
        return this.vy;
    }

    public JSONObject hww() {
        return this.nod;
    }

    public int nod() {
        return this.f32547rs;
    }

    public String ok() {
        return this.vgm;
    }

    public String rs() {
        return this.f32546ok;
    }

    public long sd() {
        return this.f32549tq;
    }

    public String toString() {
        return "AnimationModel{mKeyFramesMap=" + this.hww + ", mDuration=" + this.f32549tq + ", mPlayCount=" + this.f32548sd + ", mPlayDirection=" + this.vy + ", mDelay=" + this.f32545hv + ", mName=" + this.f32546ok + ", mPlayState=" + this.f32547rs + ", mTransformOrigin='" + this.f32544hu + "', mTimingFunction='" + this.vgm + '\'' + b.f85383j;
    }

    public Map<String, TreeMap<Float, String>> tq() {
        return this.hww;
    }

    public hww vgm() {
        return this.f32544hu;
    }

    public int vy() {
        return this.f32548sd;
    }

    public void hww(JSONObject jSONObject) {
        this.nod = jSONObject;
    }

    public void sd(String str) {
        this.f32546ok = str;
    }

    public void tq(long j10) {
        this.f32545hv = j10;
    }

    public void hww(Map<String, TreeMap<Float, String>> map) {
        this.hww = map;
    }

    public void tq(String str) {
        this.vgm = str;
    }

    public void hww(long j10) {
        this.f32549tq = j10;
    }

    public void tq(int i10) {
        this.f32547rs = i10;
    }

    public void hww(int i10) {
        this.f32548sd = i10;
    }

    public void hww(String str) {
        this.vy = str;
    }

    public void hww(hww hwwVar) {
        this.f32544hu = hwwVar;
    }
}
