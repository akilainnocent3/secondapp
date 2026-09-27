package com.bytedance.adsdk.tq;

import android.graphics.Bitmap;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class nod {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private final String f32107hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private final String f32108hv;
    private final int hww;
    private final JSONArray nod;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private final String f32109ok;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private final int[][] f32110rs;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private final String f32111sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final int f32112tq;
    private final List<hww> vgm;
    private Bitmap vhb;
    private final String vy;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class hww {

        /* JADX INFO: renamed from: hu, reason: collision with root package name */
        public int f32113hu;

        /* JADX INFO: renamed from: hv, reason: collision with root package name */
        public int f32114hv;
        public int hww;

        /* JADX INFO: renamed from: sd, reason: collision with root package name */
        public String f32115sd;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        public int f32116tq;
        public String vgm;
        public String vy;
    }

    public nod(int i10, int i11, String str, String str2, String str3, String str4, List<hww> list, String str5, int[][] iArr, JSONArray jSONArray) {
        this.hww = i10;
        this.f32112tq = i11;
        this.f32111sd = str;
        this.vy = str2;
        this.f32108hv = str3;
        this.f32107hu = str4;
        this.vgm = list;
        this.f32109ok = str5;
        this.f32110rs = iArr;
        this.nod = jSONArray;
    }

    public int[][] hu() {
        return this.f32110rs;
    }

    public String hv() {
        return this.f32109ok;
    }

    public int hww() {
        return this.hww;
    }

    public String nod() {
        return this.f32108hv;
    }

    public String ok() {
        return this.f32111sd;
    }

    public String rs() {
        return this.vy;
    }

    public List<hww> sd() {
        return this.vgm;
    }

    public int tq() {
        return this.f32112tq;
    }

    public JSONArray vgm() {
        return this.nod;
    }

    public Bitmap vhb() {
        return this.vhb;
    }

    public String vy() {
        return this.f32107hu;
    }

    public void hww(Bitmap bitmap) {
        this.vhb = bitmap;
    }
}
