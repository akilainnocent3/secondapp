package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation;
import gi.j;
import java.util.ArrayList;
import java.util.List;
import k.k;
import org.json.JSONException;
import org.json.JSONObject;
import to.c;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class hv extends FrameLayout implements IAnimation, syb, yt {

    /* JADX INFO: renamed from: bs, reason: collision with root package name */
    protected com.bytedance.sdk.component.adexpress.dynamic.animation.hww.tq f34039bs;

    /* JADX INFO: renamed from: ed, reason: collision with root package name */
    protected com.bytedance.sdk.component.adexpress.dynamic.vy.ok f34040ed;
    private com.bytedance.sdk.component.utils.grv hnv;

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    protected float f34041hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    protected float f34042hv;
    private float hww;
    com.bytedance.sdk.component.adexpress.dynamic.animation.view.sd jpb;
    protected DynamicRootView khx;
    private float mrs;
    protected int nod;

    /* JADX INFO: renamed from: ny, reason: collision with root package name */
    protected com.bytedance.sdk.component.adexpress.dynamic.vy.vgm f34043ny;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    protected int f34044ok;
    private float omn;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    protected int f34045rs;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    protected float f34046sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private float f34047tq;
    protected int vgm;
    protected Context vhb;
    protected float vy;
    protected View weu;
    protected boolean wgt;

    /* JADX INFO: renamed from: kv, reason: collision with root package name */
    private static final View.OnTouchListener f34038kv = new View.OnTouchListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hv.2
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    };
    private static final View.OnClickListener kub = new View.OnClickListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hv.3
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    };

    public hv(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.vy.ok okVar) {
        super(context);
        this.vhb = context;
        this.khx = dynamicRootView;
        this.f34040ed = okVar;
        this.f34046sd = okVar.hu();
        this.vy = okVar.vgm();
        this.f34042hv = okVar.ok();
        this.f34041hu = okVar.rs();
        this.f34045rs = (int) com.bytedance.sdk.component.adexpress.vy.vgm.hww(this.vhb, this.f34046sd);
        this.nod = (int) com.bytedance.sdk.component.adexpress.vy.vgm.hww(this.vhb, this.vy);
        this.vgm = (int) com.bytedance.sdk.component.adexpress.vy.vgm.hww(this.vhb, this.f34042hv);
        this.f34044ok = (int) com.bytedance.sdk.component.adexpress.vy.vgm.hww(this.vhb, this.f34041hu);
        com.bytedance.sdk.component.adexpress.dynamic.vy.vgm vgmVar = new com.bytedance.sdk.component.adexpress.dynamic.vy.vgm(okVar.nod());
        this.f34043ny = vgmVar;
        if (vgmVar.jpb() > 0) {
            this.vgm += this.f34043ny.jpb() * 2;
            this.f34044ok += this.f34043ny.jpb() * 2;
            this.f34045rs -= this.f34043ny.jpb();
            this.nod -= this.f34043ny.jpb();
            List<com.bytedance.sdk.component.adexpress.dynamic.vy.ok> listVhb = okVar.vhb();
            if (listVhb != null) {
                for (com.bytedance.sdk.component.adexpress.dynamic.vy.ok okVar2 : listVhb) {
                    okVar2.sd(okVar2.hu() + com.bytedance.sdk.component.adexpress.vy.vgm.tq(this.vhb, this.f34043ny.jpb()));
                    okVar2.vy(okVar2.vgm() + com.bytedance.sdk.component.adexpress.vy.vgm.tq(this.vhb, this.f34043ny.jpb()));
                    okVar2.hww(com.bytedance.sdk.component.adexpress.vy.vgm.tq(this.vhb, this.f34043ny.jpb()));
                    okVar2.tq(com.bytedance.sdk.component.adexpress.vy.vgm.tq(this.vhb, this.f34043ny.jpb()));
                }
            }
        }
        this.wgt = this.f34043ny.khx() > 0.0d;
        this.jpb = new com.bytedance.sdk.component.adexpress.dynamic.animation.view.sd();
    }

    public Drawable getBackgroundDrawable() {
        return hww(false, "");
    }

    public boolean getBeginInvisibleAndShow() {
        return this.wgt;
    }

    public int getClickArea() {
        return this.f34043ny.zvy();
    }

    public GradientDrawable getDrawable() {
        return new GradientDrawable();
    }

    public com.bytedance.sdk.component.adexpress.dynamic.hu.hww getDynamicClickListener() {
        return this.khx.getDynamicClickListener();
    }

    public int getDynamicHeight() {
        return this.f34044ok;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.vy.hu getDynamicLayoutBrickValue() {
        com.bytedance.sdk.component.adexpress.dynamic.vy.hv hvVarNod;
        com.bytedance.sdk.component.adexpress.dynamic.vy.ok okVar = this.f34040ed;
        if (okVar == null || (hvVarNod = okVar.nod()) == null) {
            return null;
        }
        return hvVarNod.hv();
    }

    public int getDynamicWidth() {
        return this.vgm;
    }

    public String getImageObjectFit() {
        return this.f34043ny.xe();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getMarqueeValue() {
        return this.mrs;
    }

    public Drawable getMutilBackgroundDrawable() {
        try {
            return new LayerDrawable(hww(tq(this.f34043ny.rpd().replaceAll("/\\*.*\\*/", ""))));
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getRippleValue() {
        return this.hww;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getShineValue() {
        return this.f34047tq;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getStretchValue() {
        return this.omn;
    }

    public void hu() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.vgm, this.f34044ok);
        layoutParams.topMargin = this.nod;
        int i10 = this.f34045rs;
        layoutParams.leftMargin = i10;
        layoutParams.setMarginStart(i10);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    public boolean hv() {
        com.bytedance.sdk.component.adexpress.dynamic.vy.vgm vgmVar = this.f34043ny;
        return (vgmVar == null || vgmVar.zvy() == 0) ? false : true;
    }

    public void hww(int i10) {
        com.bytedance.sdk.component.adexpress.dynamic.vy.vgm vgmVar = this.f34043ny;
        if (vgmVar != null && vgmVar.hww(i10)) {
            rs();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt != null && (getChildAt(i11) instanceof hv)) {
                    ((hv) childAt).hww(i10);
                }
            }
        }
    }

    public boolean ok() {
        com.bytedance.sdk.component.adexpress.dynamic.vy.ok okVar = this.f34040ed;
        return okVar == null || okVar.nod() == null || this.f34040ed.nod().hv() == null || this.f34040ed.nod().hv().sr() == null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        vgm();
        hww();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        tq();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.jpb.hww(canvas, this, this);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        com.bytedance.sdk.component.adexpress.dynamic.animation.view.sd sdVar = this.jpb;
        View view = this.weu;
        if (view == null) {
            view = this;
        }
        sdVar.hww(view, i10, i11);
    }

    public boolean sd() {
        rs();
        hu();
        vy();
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setMarqueeValue(float f10) {
        this.mrs = f10;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setRippleValue(float f10) {
        this.hww = f10;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setShineValue(float f10) {
        this.f34047tq = f10;
        postInvalidate();
    }

    public void setShouldInvisible(boolean z10) {
        this.wgt = z10;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setStretchValue(float f10) {
        this.omn = f10;
        this.jpb.hww(this, f10);
    }

    public void tq(@NonNull View view) {
        com.bytedance.sdk.component.adexpress.dynamic.vy.hu huVarHv;
        com.bytedance.sdk.component.adexpress.dynamic.vy.ok okVar = this.f34040ed;
        if (okVar == null || (huVarHv = okVar.nod().hv()) == null) {
            return;
        }
        view.setTag(2097610716, Boolean.valueOf(huVarHv.ha()));
    }

    public void vgm() {
        if (ok()) {
            return;
        }
        View view = this.weu;
        if (view == null) {
            view = this;
        }
        this.f34039bs = new com.bytedance.sdk.component.adexpress.dynamic.animation.hww.tq(view, this.f34040ed.nod().hv().sr());
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hv.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.component.adexpress.dynamic.animation.hww.tq tqVar = hv.this.f34039bs;
                if (tqVar != null) {
                    tqVar.hww();
                }
            }
        });
    }

    public boolean vy() {
        View.OnTouchListener onTouchListener;
        View.OnClickListener onClickListener;
        View view = this.weu;
        View view2 = view;
        if (view == null) {
            view2 = this;
        }
        if (hv()) {
            onTouchListener = (View.OnTouchListener) getDynamicClickListener();
            onClickListener = (View.OnClickListener) getDynamicClickListener();
        } else {
            onTouchListener = f34038kv;
            onClickListener = kub;
        }
        if (onTouchListener != null && onClickListener != null) {
            view2.setOnTouchListener(onTouchListener);
            view2.setOnClickListener(onClickListener);
            int iHww = com.bytedance.sdk.component.adexpress.dynamic.tq.hww.hww(this.f34043ny);
            if (iHww == 2 || iHww == 3) {
                view2.setOnClickListener(kub);
            } else {
                view2.setOnClickListener(onClickListener);
            }
        }
        hww(view2);
        tq(view2);
        return true;
    }

    private List<String> tq(String str) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        boolean z10 = false;
        int i11 = 0;
        for (int i12 = 0; i12 < str.length(); i12++) {
            if (str.charAt(i12) == '(') {
                i10++;
                z10 = true;
            } else if (str.charAt(i12) == ')' && (i10 = i10 - 1) == 0 && z10) {
                int i13 = i12 + 1;
                arrayList.add(str.substring(i11, i13));
                i11 = i13;
                z10 = false;
            }
        }
        return arrayList;
    }

    public void hww(View view) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", this.f34040ed.ok());
            jSONObject.put("height", this.f34040ed.rs());
            if (com.bytedance.sdk.component.adexpress.vy.tq()) {
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.hww.omn, this.f34043ny.qt());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.hww.hnv, this.f34040ed.nod().tq());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.hww.f34098kv, this.f34040ed.sd());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.hww.kub, jSONObject.toString());
                return;
            }
            view.setTag(2097610717, this.f34043ny.qt());
            view.setTag(2097610715, this.f34040ed.nod().tq());
            view.setTag(2097610714, this.f34040ed.sd());
            view.setTag(2097610713, jSONObject.toString());
            int iHww = com.bytedance.sdk.component.adexpress.dynamic.tq.hww.hww(this.f34043ny);
            if (iHww == 1) {
                view.setTag(2097610707, new Pair(this.f34043ny.grv(), Long.valueOf(this.f34043ny.aed())));
                view.setTag(2097610708, Integer.valueOf(iHww));
            }
        } catch (JSONException unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.syb
    public void tq() {
        com.bytedance.sdk.component.adexpress.dynamic.animation.hww.tq tqVar = this.f34039bs;
        if (tqVar != null) {
            tqVar.tq();
        }
    }

    public Drawable hww(boolean z10, String str) {
        String[] strArrSplit;
        int[] iArr;
        int iMw;
        if (!TextUtils.isEmpty(this.f34043ny.rpd())) {
            try {
                String strRpd = this.f34043ny.rpd();
                String strSubstring = strRpd.substring(strRpd.indexOf(j.f86770c) + 1, strRpd.length() - 1);
                if (strSubstring.contains("rgba") && strSubstring.contains(c.userBaseExtraDel2)) {
                    strArrSplit = new String[]{strSubstring.substring(0, strSubstring.indexOf(",")).trim(), strSubstring.substring(strSubstring.indexOf(",") + 1, strSubstring.indexOf(c.userBaseExtraDel2) + 1).trim(), strSubstring.substring(strSubstring.indexOf(c.userBaseExtraDel2) + 2).trim()};
                    iArr = new int[]{com.bytedance.sdk.component.adexpress.dynamic.vy.vgm.hww(strArrSplit[1]), com.bytedance.sdk.component.adexpress.dynamic.vy.vgm.hww(strArrSplit[2])};
                } else {
                    strArrSplit = strSubstring.split(", ");
                    iArr = new int[]{com.bytedance.sdk.component.adexpress.dynamic.vy.vgm.hww(strArrSplit[1].substring(0, 7)), com.bytedance.sdk.component.adexpress.dynamic.vy.vgm.hww(strArrSplit[2].substring(0, 7))};
                }
                try {
                    double d10 = Double.parseDouble(strSubstring.substring(strSubstring.indexOf("linear-gradient(") + 1, strSubstring.indexOf("deg")));
                    if (d10 > 225.0d && d10 < 315.0d) {
                        int i10 = iArr[1];
                        iArr[1] = iArr[0];
                        iArr[0] = i10;
                    }
                } catch (Exception unused) {
                }
                GradientDrawable gradientDrawableHww = hww(hww(strArrSplit[0]), iArr);
                gradientDrawableHww.setShape(0);
                gradientDrawableHww.setCornerRadius(com.bytedance.sdk.component.adexpress.vy.vgm.hww(this.vhb, this.f34043ny.weu()));
                return gradientDrawableHww;
            } catch (Exception unused2) {
                Drawable mutilBackgroundDrawable = getMutilBackgroundDrawable();
                if (mutilBackgroundDrawable != null) {
                    return mutilBackgroundDrawable;
                }
            }
        }
        GradientDrawable drawable = getDrawable();
        drawable.setShape(0);
        float fHww = com.bytedance.sdk.component.adexpress.vy.vgm.hww(this.vhb, this.f34043ny.weu());
        drawable.setCornerRadius(fHww);
        if (fHww < 1.0f) {
            float fHww2 = com.bytedance.sdk.component.adexpress.vy.vgm.hww(this.vhb, this.f34043ny.blh());
            float fHww3 = com.bytedance.sdk.component.adexpress.vy.vgm.hww(this.vhb, this.f34043ny.oxu());
            float fHww4 = com.bytedance.sdk.component.adexpress.vy.vgm.hww(this.vhb, this.f34043ny.hwp());
            float fHww5 = com.bytedance.sdk.component.adexpress.vy.vgm.hww(this.vhb, this.f34043ny.yt());
            float[] fArr = new float[8];
            if (fHww2 > 0.0f) {
                fArr[0] = fHww2;
                fArr[1] = fHww2;
            }
            if (fHww3 > 0.0f) {
                fArr[2] = fHww3;
                fArr[3] = fHww3;
            }
            if (fHww4 > 0.0f) {
                fArr[4] = fHww4;
                fArr[5] = fHww4;
            }
            if (fHww5 > 0.0f) {
                fArr[6] = fHww5;
                fArr[7] = fHww5;
            }
            drawable.setCornerRadii(fArr);
        }
        if (z10) {
            iMw = Color.parseColor(str);
        } else {
            iMw = this.f34043ny.mw();
        }
        drawable.setColor(iMw);
        if (this.f34043ny.bs() > 0.0f) {
            drawable.setStroke((int) com.bytedance.sdk.component.adexpress.vy.vgm.hww(this.vhb, this.f34043ny.bs()), this.f34043ny.wgt());
        } else if (this.f34043ny.jpb() > 0) {
            drawable.setStroke(this.f34043ny.jpb(), this.f34043ny.wgt());
            drawable.setAlpha(50);
            if (TextUtils.equals(this.f34040ed.nod().tq(), "video-vd")) {
                setLayerType(1, null);
                return new mrs((int) fHww, this.f34043ny.jpb());
            }
        }
        return drawable;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
    }

    public tq hww(Bitmap bitmap) {
        return new hww(bitmap, null);
    }

    private Drawable[] hww(List<String> list) {
        Drawable[] drawableArr = new Drawable[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10);
            if (str.contains("linear-gradient")) {
                String[] strArrSplit = str.substring(str.indexOf(j.f86770c) + 1, str.length() - 1).split(", ");
                int length = strArrSplit.length - 1;
                int[] iArr = new int[length];
                int i11 = 0;
                while (i11 < length) {
                    int i12 = i11 + 1;
                    iArr[i11] = com.bytedance.sdk.component.adexpress.dynamic.vy.vgm.hww(strArrSplit[i12].substring(0, 7));
                    i11 = i12;
                }
                GradientDrawable gradientDrawableHww = hww(hww(strArrSplit[0]), iArr);
                gradientDrawableHww.setShape(0);
                gradientDrawableHww.setCornerRadius(com.bytedance.sdk.component.adexpress.vy.vgm.hww(this.vhb, this.f34043ny.weu()));
                drawableArr[(list.size() - 1) - i10] = gradientDrawableHww;
            }
        }
        return drawableArr;
    }

    public GradientDrawable hww(GradientDrawable.Orientation orientation, @k int[] iArr) {
        if (iArr != null && iArr.length != 0) {
            if (iArr.length == 1) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(iArr[0]);
                return gradientDrawable;
            }
            return new GradientDrawable(orientation, iArr);
        }
        return new GradientDrawable();
    }

    public GradientDrawable.Orientation hww(String str) {
        try {
            int i10 = (int) Float.parseFloat(str.substring(0, str.length() - 3));
            if (i10 <= 90) {
                return GradientDrawable.Orientation.LEFT_RIGHT;
            }
            if (i10 <= 180) {
                return GradientDrawable.Orientation.TOP_BOTTOM;
            }
            if (i10 <= 270) {
                return GradientDrawable.Orientation.RIGHT_LEFT;
            }
            return GradientDrawable.Orientation.BOTTOM_TOP;
        } catch (Exception unused) {
            return GradientDrawable.Orientation.LEFT_RIGHT;
        }
    }

    private void hww() {
        if (isShown()) {
            int iHww = com.bytedance.sdk.component.adexpress.dynamic.tq.hww.hww(this.f34043ny);
            if (iHww == 2) {
                if (this.hnv == null) {
                    this.hnv = new com.bytedance.sdk.component.utils.grv(getContext().getApplicationContext(), 1);
                }
                new Object() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hv.4
                };
                com.bytedance.sdk.component.adexpress.tq.ed renderRequest = this.khx.getRenderRequest();
                if (renderRequest != null) {
                    renderRequest.weu();
                    renderRequest.hnv();
                    renderRequest.mrs();
                    return;
                }
                return;
            }
            if (iHww == 3) {
                if (this.hnv == null) {
                    this.hnv = new com.bytedance.sdk.component.utils.grv(getContext().getApplicationContext(), 2);
                }
                new Object() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hv.5
                };
                com.bytedance.sdk.component.adexpress.tq.ed renderRequest2 = this.khx.getRenderRequest();
                if (renderRequest2 != null) {
                    renderRequest2.bs();
                    renderRequest2.kv();
                    renderRequest2.jpb();
                    renderRequest2.omn();
                }
            }
        }
    }
}
