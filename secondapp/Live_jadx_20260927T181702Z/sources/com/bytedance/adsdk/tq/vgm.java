package com.bytedance.adsdk.tq;

import android.graphics.Rect;
import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class vgm {

    /* JADX INFO: renamed from: ed, reason: collision with root package name */
    private float f32327ed;

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private List<com.bytedance.adsdk.tq.sd.hu> f32328hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private Map<String, com.bytedance.adsdk.tq.sd.sd> f32329hv;
    private hww jpb;
    private boolean khx;
    private tq mrs;
    private Rect nod;

    /* JADX INFO: renamed from: ny, reason: collision with root package name */
    private float f32330ny;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private LongSparseArray<com.bytedance.adsdk.tq.sd.sd.hv> f32331ok;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private List<com.bytedance.adsdk.tq.sd.sd.hv> f32332rs;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private Map<String, List<com.bytedance.adsdk.tq.sd.sd.hv>> f32333sd;
    private SparseArray<com.bytedance.adsdk.tq.sd.vy> vgm;
    private float vhb;
    private Map<String, nod> vy;
    private sd wgt;
    private final jpb hww = new jpb();

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final HashSet<String> f32334tq = new HashSet<>();
    private int weu = 0;

    /* JADX INFO: renamed from: bs, reason: collision with root package name */
    private String f32326bs = "";

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class hww {

        /* JADX INFO: renamed from: hu, reason: collision with root package name */
        public String f32335hu;

        /* JADX INFO: renamed from: hv, reason: collision with root package name */
        public int f32336hv;
        public int hww;

        /* JADX INFO: renamed from: sd, reason: collision with root package name */
        public Map<String, Object> f32337sd;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        public Map<String, Object> f32338tq;
        public JSONArray vgm;
        public int vy;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class sd {

        /* JADX INFO: renamed from: hu, reason: collision with root package name */
        public String f32339hu;

        /* JADX INFO: renamed from: hv, reason: collision with root package name */
        public int[] f32340hv;
        public int hww;

        /* JADX INFO: renamed from: sd, reason: collision with root package name */
        public String f32341sd;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        public String f32342tq;
        public JSONArray vgm;
        public String vy;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class tq {
        public String hww;

        /* JADX INFO: renamed from: sd, reason: collision with root package name */
        public JSONArray f32343sd;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        public int[][] f32344tq;
    }

    public float bs() {
        return this.f32330ny - this.vhb;
    }

    public List<com.bytedance.adsdk.tq.sd.sd.hv> ed() {
        return this.f32332rs;
    }

    public float hu() {
        return this.vhb;
    }

    public float hv() {
        return (long) ((bs() / this.f32327ed) * 1000.0f);
    }

    public void hww(Rect rect, float f10, float f11, float f12, List<com.bytedance.adsdk.tq.sd.sd.hv> list, LongSparseArray<com.bytedance.adsdk.tq.sd.sd.hv> longSparseArray, Map<String, List<com.bytedance.adsdk.tq.sd.sd.hv>> map, Map<String, nod> map2, SparseArray<com.bytedance.adsdk.tq.sd.vy> sparseArray, Map<String, com.bytedance.adsdk.tq.sd.sd> map3, List<com.bytedance.adsdk.tq.sd.hu> list2, sd sdVar, String str, hww hwwVar, tq tqVar) {
        this.nod = rect;
        this.vhb = f10;
        this.f32330ny = f11;
        this.f32327ed = f12;
        this.f32332rs = list;
        this.f32331ok = longSparseArray;
        this.f32333sd = map;
        this.vy = map2;
        this.vgm = sparseArray;
        this.f32329hv = map3;
        this.f32328hu = list2;
        this.wgt = sdVar;
        this.f32326bs = str;
        this.jpb = hwwVar;
        this.mrs = tqVar;
    }

    public SparseArray<com.bytedance.adsdk.tq.sd.vy> khx() {
        return this.vgm;
    }

    public tq nod() {
        return this.mrs;
    }

    public float ny() {
        return this.f32327ed;
    }

    public sd ok() {
        return this.wgt;
    }

    public String rs() {
        return this.f32326bs;
    }

    public jpb sd() {
        return this.hww;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("LottieComposition:\n");
        Iterator<com.bytedance.adsdk.tq.sd.sd.hv> it = this.f32332rs.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().hww("\t"));
        }
        return sb2.toString();
    }

    public int tq() {
        return this.weu;
    }

    public float vgm() {
        return this.f32330ny;
    }

    public hww vhb() {
        return this.jpb;
    }

    public Rect vy() {
        return this.nod;
    }

    public Map<String, com.bytedance.adsdk.tq.sd.sd> weu() {
        return this.f32329hv;
    }

    public Map<String, nod> wgt() {
        return this.vy;
    }

    public com.bytedance.adsdk.tq.sd.hu sd(String str) {
        int size = this.f32328hu.size();
        for (int i10 = 0; i10 < size; i10++) {
            com.bytedance.adsdk.tq.sd.hu huVar = this.f32328hu.get(i10);
            if (huVar.hww(str)) {
                return huVar;
            }
        }
        return null;
    }

    public void tq(boolean z10) {
        this.hww.hww(z10);
    }

    public List<com.bytedance.adsdk.tq.sd.sd.hv> tq(String str) {
        return this.f32333sd.get(str);
    }

    public void hww(String str) {
        this.f32334tq.add(str);
    }

    public void hww(boolean z10) {
        this.khx = z10;
    }

    public void hww(int i10) {
        this.weu += i10;
    }

    public boolean hww() {
        return this.khx;
    }

    public com.bytedance.adsdk.tq.sd.sd.hv hww(long j10) {
        return this.f32331ok.get(j10);
    }

    public float hww(float f10) {
        return com.bytedance.adsdk.tq.hu.hv.hww(this.vhb, this.f32330ny, f10);
    }
}
