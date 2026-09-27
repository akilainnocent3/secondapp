package com.bytedance.adsdk.ugeno.hv;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class sd {

    /* JADX INFO: renamed from: bs, reason: collision with root package name */
    boolean f32481bs;

    /* JADX INFO: renamed from: ed, reason: collision with root package name */
    int f32482ed;

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    int f32483hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    int f32484hv;
    boolean jpb;
    float nod;

    /* JADX INFO: renamed from: ny, reason: collision with root package name */
    int f32485ny;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    int f32486ok;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    int f32487rs;
    int vgm;
    float vhb;
    int weu;
    int wgt;
    int hww = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    int f32489tq = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    int f32488sd = Integer.MIN_VALUE;
    int vy = Integer.MIN_VALUE;
    List<Integer> khx = new ArrayList();

    public int hww() {
        return this.vgm;
    }

    public int tq() {
        return this.f32486ok - this.f32487rs;
    }

    public void hww(View view, int i10, int i11, int i12, int i13) {
        tq tqVar = (tq) view.getLayoutParams();
        this.hww = Math.min(this.hww, (view.getLeft() - tqVar.ed()) - i10);
        this.f32489tq = Math.min(this.f32489tq, (view.getTop() - tqVar.khx()) - i11);
        this.f32488sd = Math.max(this.f32488sd, view.getRight() + tqVar.weu() + i12);
        this.vy = Math.max(this.vy, view.getBottom() + tqVar.wgt() + i13);
    }
}
