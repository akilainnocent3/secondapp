package com.bytedance.adsdk.ugeno.hu.hww;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.adsdk.ugeno.hu.vy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p1.a;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class hww extends LinearLayout {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private int f32449hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private int f32450hv;
    protected Context hww;
    private float nod;

    /* JADX INFO: renamed from: ny, reason: collision with root package name */
    private String f32451ny;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private boolean f32452ok;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private int f32453rs;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    protected int f32454sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    protected int f32455tq;
    private int vgm;
    private float vhb;
    private List<View> vy;

    public hww(Context context) {
        super(context);
        this.f32450hv = a.f120313c;
        this.f32449hu = -16776961;
        this.vgm = 5;
        this.f32455tq = 40;
        this.f32454sd = 20;
        this.f32451ny = "row";
        this.hww = context;
        this.vy = new ArrayList();
        setOrientation(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vy() {
        FrameLayout frameLayout = (FrameLayout) getParent();
        if (frameLayout == null) {
            return;
        }
        float width = frameLayout.getWidth();
        float height = frameLayout.getHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        float width2 = getWidth();
        float height2 = getHeight();
        float f10 = this.vhb;
        layoutParams.topMargin = (int) (((int) ((height * f10) / 100.0f)) - ((height2 * f10) / 100.0f));
        float f11 = this.nod;
        layoutParams.leftMargin = (int) (((int) ((width * f11) / 100.0f)) - ((width2 * f11) / 100.0f));
        setLayoutParams(layoutParams);
    }

    public int getSize() {
        return this.vy.size();
    }

    public void sd() {
        this.vy.clear();
        removeAllViews();
    }

    public void setIndicatorDirection(String str) {
        this.f32451ny = str;
        if (TextUtils.equals(str, "column")) {
            setOrientation(1);
        } else {
            setOrientation(0);
        }
    }

    public void setIndicatorHeight(int i10) {
        this.f32454sd = i10;
    }

    public void setIndicatorWidth(int i10) {
        this.f32455tq = i10;
    }

    public void setIndicatorX(float f10) {
        this.nod = f10;
    }

    public void setIndicatorY(float f10) {
        this.vhb = f10;
    }

    public void setLoop(boolean z10) {
        this.f32452ok = z10;
    }

    public void setSelectedColor(int i10) {
        this.f32450hv = i10;
    }

    public void setUnSelectedColor(int i10) {
        this.f32449hu = i10;
    }

    public abstract Drawable tq(int i10);

    public void tq() {
        View view = new View(getContext());
        view.setClickable(false);
        if (this instanceof tq) {
            this.f32454sd = this.f32455tq;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f32455tq, this.f32454sd);
        if (getOrientation() == 1) {
            int i10 = this.vgm;
            layoutParams.topMargin = i10;
            layoutParams.bottomMargin = i10;
        } else {
            int i11 = this.vgm;
            layoutParams.leftMargin = i11;
            layoutParams.rightMargin = i11;
        }
        addView(view, layoutParams);
        view.setBackground(tq(this.f32449hu));
        this.vy.add(view);
    }

    public void hww(int i10, int i11) {
        Iterator<View> it = this.vy.iterator();
        while (it.hasNext()) {
            it.next().setBackground(tq(this.f32449hu));
        }
        if (i10 < 0 || i10 >= this.vy.size()) {
            i10 = 0;
        }
        if (this.vy.size() > 0) {
            this.vy.get(i10).setBackground(tq(this.f32450hv));
            this.f32453rs = i11;
        }
    }

    public void hww() {
        post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.hu.hww.hww.1
            @Override // java.lang.Runnable
            public void run() {
                hww.this.vy();
            }
        });
    }

    public void hww(int i10) {
        if (this instanceof tq) {
            this.f32454sd = this.f32455tq;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f32455tq, this.f32454sd);
        if (getOrientation() == 1) {
            int i11 = this.vgm;
            layoutParams.topMargin = i11;
            layoutParams.bottomMargin = i11;
        } else {
            int i12 = this.vgm;
            layoutParams.leftMargin = i12;
            layoutParams.rightMargin = i12;
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(this.f32455tq, this.f32454sd);
        if (getOrientation() == 1) {
            int i13 = this.vgm;
            layoutParams2.topMargin = i13;
            layoutParams2.bottomMargin = i13;
        } else {
            int i14 = this.vgm;
            layoutParams2.leftMargin = i14;
            layoutParams2.rightMargin = i14;
        }
        int iHww = vy.hww(this.f32452ok, this.f32453rs, this.vy.size());
        int iHww2 = vy.hww(this.f32452ok, i10, this.vy.size());
        if (this.vy.size() == 0) {
            iHww2 = 0;
        }
        if (!this.vy.isEmpty() && vy.hww(iHww, this.vy) && vy.hww(iHww2, this.vy)) {
            this.vy.get(iHww).setBackground(tq(this.f32449hu));
            this.vy.get(iHww).setLayoutParams(layoutParams2);
            this.vy.get(iHww2).setBackground(tq(this.f32450hv));
            this.vy.get(iHww2).setLayoutParams(layoutParams);
            this.f32453rs = i10;
        }
    }
}
