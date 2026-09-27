package com.bytedance.sdk.openadsdk.core.sd;

import android.graphics.Point;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.bs;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class sd implements View.OnClickListener, View.OnTouchListener {

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private static long f36760hv = 0;
    private static float hww = 0.0f;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private static float f36761sd = 0.0f;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private static float f36762tq = 0.0f;
    private static float vy = 0.0f;

    /* JADX INFO: renamed from: za, reason: collision with root package name */
    protected static int f36763za = 8;
    protected View oxu;
    protected float omn = -1.0f;
    protected float hnv = -1.0f;

    /* JADX INFO: renamed from: kv, reason: collision with root package name */
    protected float f36765kv = -1.0f;
    protected float kub = -1.0f;
    protected long aeg = -1;
    protected long grv = -1;
    protected int aed = -1;
    protected int zvy = -1024;

    /* JADX INFO: renamed from: mw, reason: collision with root package name */
    protected int f36766mw = -1;
    protected boolean blh = true;
    public SparseArray<hww> hwp = new SparseArray<>();

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private int f36764hu = 0;
    private int vgm = 0;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class hww {
        public int hww;

        /* JADX INFO: renamed from: sd, reason: collision with root package name */
        public double f36767sd;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        public double f36768tq;
        public long vy;

        public hww(int i10, double d10, double d11, long j10) {
            this.hww = i10;
            this.f36768tq = d10;
            this.f36767sd = d11;
            this.vy = j10;
        }
    }

    static {
        if (bs.hww() != null) {
            f36763za = bs.tq();
        }
        hww = 0.0f;
        f36762tq = 0.0f;
        f36761sd = 0.0f;
        vy = 0.0f;
        f36760hv = 0L;
    }

    private boolean hww(View view, Point point) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i14 = 0; i14 < viewGroup.getChildCount(); i14++) {
                View childAt = viewGroup.getChildAt(i14);
                if (tq.tq(childAt)) {
                    int[] iArr = new int[2];
                    childAt.getLocationOnScreen(iArr);
                    return view.isShown() && (i10 = point.x) >= (i11 = iArr[0]) && i10 <= i11 + childAt.getWidth() && (i12 = point.y) >= (i13 = iArr[1]) && i12 <= i13 + childAt.getHeight();
                }
                if (hww(childAt, point)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean hu() {
        return this.blh;
    }

    public abstract void hww(View view, float f10, float f11, float f12, float f13, SparseArray<hww> sparseArray, boolean z10);

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (com.bytedance.sdk.openadsdk.core.settings.vgm.hww()) {
            hww(view, this.omn, this.hnv, this.f36765kv, this.kub, this.hwp, this.blh);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0072  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int i10;
        this.zvy = motionEvent.getDeviceId();
        this.aed = motionEvent.getToolType(0);
        this.f36766mw = motionEvent.getSource();
        int actionMasked = motionEvent.getActionMasked();
        int i11 = 1;
        if (actionMasked != 0) {
            int i12 = 3;
            if (actionMasked == 1) {
                this.f36765kv = motionEvent.getRawX();
                this.kub = motionEvent.getRawY();
                this.grv = System.currentTimeMillis();
                if (Math.abs(this.f36765kv - this.f36764hu) >= f36763za || Math.abs(this.kub - this.vgm) >= f36763za) {
                    this.blh = false;
                }
                Point point = new Point((int) this.f36765kv, (int) this.kub);
                if (view != null && !tq.tq(view) && hww((View) view.getParent(), point)) {
                    return true;
                }
            } else if (actionMasked != 2) {
                i12 = actionMasked != 3 ? -1 : 4;
            } else {
                f36761sd += Math.abs(motionEvent.getX() - hww);
                vy += Math.abs(motionEvent.getY() - f36762tq);
                hww = motionEvent.getX();
                f36762tq = motionEvent.getY();
                if (System.currentTimeMillis() - f36760hv > 200) {
                    float f10 = f36761sd;
                    int i13 = f36763za;
                    if (f10 <= i13 && vy <= i13) {
                        i11 = 2;
                    }
                } else {
                    i11 = 2;
                }
                this.f36765kv = motionEvent.getRawX();
                this.kub = motionEvent.getRawY();
                if (Math.abs(this.f36765kv - this.f36764hu) >= f36763za || Math.abs(this.kub - this.vgm) >= f36763za) {
                    this.blh = false;
                }
                i10 = i11;
            }
            i10 = i12;
        } else {
            this.f36764hu = (int) motionEvent.getRawX();
            this.vgm = (int) motionEvent.getRawY();
            this.omn = motionEvent.getRawX();
            this.hnv = motionEvent.getRawY();
            this.aeg = System.currentTimeMillis();
            this.aed = motionEvent.getToolType(0);
            this.zvy = motionEvent.getDeviceId();
            this.f36766mw = motionEvent.getSource();
            f36760hv = System.currentTimeMillis();
            this.blh = true;
            this.oxu = view;
            com.bytedance.sdk.openadsdk.core.nod.sd.hww(motionEvent);
            i10 = 0;
        }
        this.hwp.put(motionEvent.getActionMasked(), new hww(i10, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
        return false;
    }
}
