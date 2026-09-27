package com.bytedance.sdk.openadsdk.core.sd;

import android.util.SparseArray;
import android.view.MotionEvent;
import com.bytedance.sdk.openadsdk.core.bs;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hu {

    /* JADX INFO: renamed from: bs, reason: collision with root package name */
    private static long f36748bs = 0;

    /* JADX INFO: renamed from: ed, reason: collision with root package name */
    private static float f36749ed = 0.0f;
    private static float khx = 0.0f;
    public static int nod = 8;
    private static float weu;
    private static float wgt;
    public float hww = -1.0f;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    public float f36756tq = -1.0f;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    public float f36755sd = -1.0f;
    public float vy = -1.0f;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    public long f36751hv = -1;

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    public long f36750hu = -1;
    public int vgm = -1;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    public int f36753ok = -1024;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    public int f36754rs = -1;
    public boolean vhb = true;

    /* JADX INFO: renamed from: ny, reason: collision with root package name */
    public SparseArray<sd.hww> f36752ny = new SparseArray<>();
    private int jpb = 0;
    private int mrs = 0;

    static {
        if (bs.hww() != null) {
            nod = bs.tq();
        }
        f36749ed = 0.0f;
        khx = 0.0f;
        weu = 0.0f;
        wgt = 0.0f;
        f36748bs = 0L;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0072  */
    public void hww(MotionEvent motionEvent) {
        int i10;
        this.f36753ok = motionEvent.getDeviceId();
        int i11 = 0;
        this.vgm = motionEvent.getToolType(0);
        this.f36754rs = motionEvent.getSource();
        int actionMasked = motionEvent.getActionMasked();
        int i12 = 1;
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                this.f36755sd = motionEvent.getRawX();
                this.vy = motionEvent.getRawY();
                this.f36750hu = System.currentTimeMillis();
                if (Math.abs(this.f36755sd - this.jpb) >= nod || Math.abs(this.vy - this.mrs) >= nod) {
                    this.vhb = false;
                }
                i10 = 3;
            } else if (actionMasked != 2) {
                i11 = actionMasked != 3 ? -1 : 4;
            } else {
                weu += Math.abs(motionEvent.getX() - f36749ed);
                wgt += Math.abs(motionEvent.getY() - khx);
                f36749ed = motionEvent.getX();
                khx = motionEvent.getY();
                if (System.currentTimeMillis() - f36748bs > 200) {
                    float f10 = weu;
                    int i13 = nod;
                    if (f10 <= i13 && wgt <= i13) {
                        i12 = 2;
                    }
                } else {
                    i12 = 2;
                }
                this.f36755sd = motionEvent.getRawX();
                this.vy = motionEvent.getRawY();
                if (Math.abs(this.f36755sd - this.jpb) >= nod || Math.abs(this.vy - this.mrs) >= nod) {
                    this.vhb = false;
                }
                i10 = i12;
            }
            this.f36752ny.put(motionEvent.getActionMasked(), new sd.hww(i10, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
        }
        this.jpb = (int) motionEvent.getRawX();
        this.mrs = (int) motionEvent.getRawY();
        this.hww = motionEvent.getRawX();
        this.f36756tq = motionEvent.getRawY();
        this.f36751hv = System.currentTimeMillis();
        this.vgm = motionEvent.getToolType(0);
        this.f36753ok = motionEvent.getDeviceId();
        this.f36754rs = motionEvent.getSource();
        f36748bs = System.currentTimeMillis();
        this.vhb = true;
        i10 = i11;
        this.f36752ny.put(motionEvent.getActionMasked(), new sd.hww(i10, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
    }
}
