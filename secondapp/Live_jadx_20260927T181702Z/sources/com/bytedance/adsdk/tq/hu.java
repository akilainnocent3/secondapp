package com.bytedance.adsdk.tq;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class hu extends ImageView {
    private static final String hww = "hu";

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private static final vhb<Throwable> f31927tq = new vhb<Throwable>() { // from class: com.bytedance.adsdk.tq.hu.1
        @Override // com.bytedance.adsdk.tq.vhb
        public void hww(Throwable th2) {
            com.bytedance.adsdk.tq.hu.hu.hww(th2);
        }
    };
    private String aed;
    private int aeg;
    private hww blh;

    /* JADX INFO: renamed from: bs, reason: collision with root package name */
    private final Handler f31928bs;

    /* JADX INFO: renamed from: ed, reason: collision with root package name */
    private final Set<vy> f31929ed;
    private int grv;
    private com.bytedance.adsdk.tq.sd.sd.sd hnv;

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private int f31930hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private vhb<Throwable> f31931hv;
    private int jpb;
    private final Set<Object> khx;
    private int kub;

    /* JADX INFO: renamed from: kv, reason: collision with root package name */
    private int f31932kv;
    private Handler mrs;

    /* JADX INFO: renamed from: mw, reason: collision with root package name */
    private final Runnable f31933mw;
    private boolean nod;

    /* JADX INFO: renamed from: ny, reason: collision with root package name */
    private boolean f31934ny;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private String f31935ok;
    private long omn;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private int f31936rs;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private final vhb<vgm> f31937sd;
    private final rs vgm;
    private boolean vhb;
    private final vhb<Throwable> vy;
    private ed<vgm> weu;
    private vgm wgt;

    /* JADX INFO: renamed from: za, reason: collision with root package name */
    private tq f31938za;
    private JSONArray zvy;

    /* JADX INFO: renamed from: com.bytedance.adsdk.tq.hu$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] hww;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            hww = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                hww[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                hww[ImageView.ScaleType.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                hww[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface hww {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class sd extends View.BaseSavedState {
        public static final Parcelable.Creator<sd> CREATOR = new Parcelable.Creator<sd>() { // from class: com.bytedance.adsdk.tq.hu.sd.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: hww, reason: merged with bridge method [inline-methods] */
            public sd createFromParcel(Parcel parcel) {
                return new sd(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: hww, reason: merged with bridge method [inline-methods] */
            public sd[] newArray(int i10) {
                return new sd[i10];
            }
        };

        /* JADX INFO: renamed from: hu, reason: collision with root package name */
        int f31947hu;

        /* JADX INFO: renamed from: hv, reason: collision with root package name */
        String f31948hv;
        String hww;

        /* JADX INFO: renamed from: sd, reason: collision with root package name */
        float f31949sd;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        int f31950tq;
        int vgm;
        boolean vy;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.hww);
            parcel.writeFloat(this.f31949sd);
            parcel.writeInt(this.vy ? 1 : 0);
            parcel.writeString(this.f31948hv);
            parcel.writeInt(this.f31947hu);
            parcel.writeInt(this.vgm);
        }

        public sd(Parcelable parcelable) {
            super(parcelable);
        }

        private sd(Parcel parcel) {
            super(parcel);
            this.hww = parcel.readString();
            this.f31949sd = parcel.readFloat();
            this.vy = parcel.readInt() == 1;
            this.f31948hv = parcel.readString();
            this.f31947hu = parcel.readInt();
            this.vgm = parcel.readInt();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface tq {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum vy {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    public hu(Context context) {
        super(context);
        this.f31937sd = new vhb<vgm>() { // from class: com.bytedance.adsdk.tq.hu.6
            @Override // com.bytedance.adsdk.tq.vhb
            public void hww(vgm vgmVar) {
                hu.this.setComposition(vgmVar);
            }
        };
        this.vy = new vhb<Throwable>() { // from class: com.bytedance.adsdk.tq.hu.7
            @Override // com.bytedance.adsdk.tq.vhb
            public void hww(Throwable th2) {
                if (hu.this.f31930hu != 0) {
                    hu huVar = hu.this;
                    huVar.setImageResource(huVar.f31930hu);
                }
                (hu.this.f31931hv == null ? hu.f31927tq : hu.this.f31931hv).hww(th2);
            }
        };
        this.f31930hu = 0;
        this.vgm = new rs();
        this.nod = false;
        this.vhb = false;
        this.f31934ny = true;
        this.f31929ed = new HashSet();
        this.khx = new HashSet();
        this.f31928bs = new Handler(Looper.getMainLooper());
        this.jpb = 0;
        this.omn = 0L;
        this.f31933mw = new Runnable() { // from class: com.bytedance.adsdk.tq.hu.4
            @Override // java.lang.Runnable
            public void run() {
                Log.i("TMe", "--==--- timer callback, timer: " + hu.this.f31932kv + ", " + hu.this.kub);
                if (hu.this.f31932kv > hu.this.kub) {
                    hu.jpb(hu.this);
                    com.bytedance.adsdk.tq.sd.sd.sd sdVar = hu.this.hnv;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(hu.this.f31932kv);
                    sdVar.hww(sb2.toString());
                    hu.this.invalidate();
                    hu.this.weu();
                    return;
                }
                if (hu.this.aeg < 0 || hu.this.grv < 0) {
                    Log.i("TMe", "--==--- timer end, frame invalid: " + hu.this.aeg + "," + hu.this.grv);
                } else {
                    Log.i("TMe", "--==--- timer end, play anim, startframe: " + hu.this.aeg);
                    hu.this.hww();
                    hu huVar = hu.this;
                    huVar.setFrame(huVar.aeg);
                    hu.this.hww(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.tq.hu.4.1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            if (hu.this.getFrame() < hu.this.grv - 1 || hu.this.getFrame() >= hu.this.grv + 2) {
                                return;
                            }
                            Log.i("TMe", "--==--- timer end, play anim, endframe: " + hu.this.grv);
                            hu.this.tq(this);
                            hu.this.hu();
                        }
                    });
                }
                if ((!TextUtils.isEmpty(hu.this.aed) || (hu.this.zvy != null && hu.this.zvy.length() > 0)) && hu.this.f31938za != null) {
                    tq unused = hu.this.f31938za;
                    String unused2 = hu.this.aed;
                    JSONArray unused3 = hu.this.zvy;
                }
            }
        };
        ok();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public vgm.hww getGlobalConfig() {
        vgm vgmVarAed;
        rs rsVar = this.vgm;
        if (rsVar == null || (vgmVarAed = rsVar.aed()) == null) {
            return null;
        }
        return vgmVarAed.vhb();
    }

    private vgm.tq getGlobalEvent() {
        vgm vgmVarAed;
        rs rsVar = this.vgm;
        if (rsVar == null || (vgmVarAed = rsVar.aed()) == null) {
            return null;
        }
        return vgmVarAed.nod();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getPlayDelayedELExpressTimeS() {
        vgm vgmVarAed;
        rs rsVar = this.vgm;
        if (rsVar == null || (vgmVarAed = rsVar.aed()) == null) {
            return null;
        }
        return vgmVarAed.rs();
    }

    public static /* synthetic */ int hv(hu huVar) {
        int i10 = huVar.jpb;
        huVar.jpb = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int jpb(hu huVar) {
        int i10 = huVar.f31932kv;
        huVar.f31932kv = i10 - 1;
        return i10;
    }

    private void setCompositionTask(ed<vgm> edVar) {
        this.f31929ed.add(vy.SET_ANIMATION);
        bs();
        ed();
        this.weu = edVar.hww(this.f31937sd).sd(this.vy);
    }

    public boolean getClipToCompositionBounds() {
        return this.vgm.sd();
    }

    public vgm getComposition() {
        return this.wgt;
    }

    public long getDuration() {
        vgm vgmVar = this.wgt;
        if (vgmVar != null) {
            return (long) vgmVar.hv();
        }
        return 0L;
    }

    public int getFrame() {
        return this.vgm.mrs();
    }

    public String getImageAssetsFolder() {
        return this.vgm.vy();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.vgm.hv();
    }

    public float getMaxFrame() {
        return this.vgm.weu();
    }

    public float getMinFrame() {
        return this.vgm.khx();
    }

    public jpb getPerformanceTracker() {
        return this.vgm.ok();
    }

    public float getProgress() {
        return this.vgm.za();
    }

    public mrs getRenderMode() {
        return this.vgm.hu();
    }

    public int getRepeatCount() {
        return this.vgm.hnv();
    }

    public int getRepeatMode() {
        return this.vgm.omn();
    }

    public float getSpeed() {
        return this.vgm.wgt();
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof rs) && ((rs) drawable).hu() == mrs.SOFTWARE) {
            this.vgm.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        rs rsVar = this.vgm;
        if (drawable2 == rsVar) {
            super.invalidateDrawable(rsVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.vhb) {
            return;
        }
        this.vgm.vhb();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        wgt();
        Handler handler = this.mrs;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        sd();
        tq();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        int i10;
        if (!(parcelable instanceof sd)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        sd sdVar = (sd) parcelable;
        super.onRestoreInstanceState(sdVar.getSuperState());
        this.f31935ok = sdVar.hww;
        Set<vy> set = this.f31929ed;
        vy vyVar = vy.SET_ANIMATION;
        if (!set.contains(vyVar) && !TextUtils.isEmpty(this.f31935ok)) {
            setAnimation(this.f31935ok);
        }
        this.f31936rs = sdVar.f31950tq;
        if (!this.f31929ed.contains(vyVar) && (i10 = this.f31936rs) != 0) {
            setAnimation(i10);
        }
        if (!this.f31929ed.contains(vy.SET_PROGRESS)) {
            hww(sdVar.f31949sd, false);
        }
        if (!this.f31929ed.contains(vy.PLAY_OPTION) && sdVar.vy) {
            hww();
        }
        if (!this.f31929ed.contains(vy.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(sdVar.f31948hv);
        }
        if (!this.f31929ed.contains(vy.SET_REPEAT_MODE)) {
            setRepeatMode(sdVar.f31947hu);
        }
        if (this.f31929ed.contains(vy.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(sdVar.vgm);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        sd sdVar = new sd(super.onSaveInstanceState());
        sdVar.hww = this.f31935ok;
        sdVar.f31950tq = this.f31936rs;
        sdVar.f31949sd = this.vgm.za();
        sdVar.vy = this.vgm.kub();
        sdVar.f31948hv = this.vgm.vy();
        sdVar.f31947hu = this.vgm.omn();
        sdVar.vgm = this.vgm.hnv();
        return sdVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int[][] iArr;
        com.bytedance.adsdk.tq.sd.sd.hww hwwVarHww = hww(motionEvent);
        if (hwwVarHww == null) {
            if (getGlobalConfig() == null || getGlobalConfig().hww != 1) {
                return super.onTouchEvent(motionEvent);
            }
            return false;
        }
        String strRs = hwwVarHww.rs();
        if (hwwVarHww instanceof com.bytedance.adsdk.tq.sd.sd.tq) {
            if (getGlobalConfig() == null || getGlobalConfig().hww != 1) {
                return super.onTouchEvent(motionEvent);
            }
            return false;
        }
        if (strRs != null && strRs.startsWith("CSJCLOSE")) {
            wgt();
        }
        nod nodVarHww = hww(hwwVarHww.hv());
        if (nodVarHww != null && motionEvent.getAction() == 1) {
            hww(strRs, nodVarHww.hv(), nodVarHww.vgm());
            int[][] iArrHu = nodVarHww.hu();
            if (iArrHu != null) {
                hww(iArrHu);
            } else if (getGlobalEvent() != null && (iArr = getGlobalEvent().f32344tq) != null) {
                hww(iArr);
            }
        }
        if (strRs == null || !strRs.startsWith("CSJNTP")) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setAnimation(int i10) {
        this.f31936rs = i10;
        this.f31935ok = null;
        setCompositionTask(hww(i10));
    }

    public void setAnimationFromJson(String str) {
        hww(str, (String) null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.f31934ny ? ok.hww(getContext(), str) : ok.hww(getContext(), str, (String) null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z10) {
        this.vgm.hv(z10);
    }

    public void setCacheComposition(boolean z10) {
        this.f31934ny = z10;
    }

    public void setClipToCompositionBounds(boolean z10) {
        this.vgm.hww(z10);
    }

    public void setComposition(vgm vgmVar) {
        if (hv.hww) {
            Log.v(hww, "Set Composition \n".concat(String.valueOf(vgmVar)));
        }
        this.vgm.setCallback(this);
        this.wgt = vgmVar;
        this.nod = true;
        boolean zHww = this.vgm.hww(vgmVar, getContext().getApplicationContext());
        this.nod = false;
        if (getDrawable() != this.vgm || zHww) {
            if (!zHww) {
                jpb();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator<Object> it = this.khx.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        this.vgm.vgm(str);
    }

    public void setFailureListener(vhb<Throwable> vhbVar) {
        this.f31931hv = vhbVar;
    }

    public void setFallbackResource(int i10) {
        this.f31930hu = i10;
    }

    public void setFontAssetDelegate(com.bytedance.adsdk.tq.sd sdVar) {
        this.vgm.hww(sdVar);
    }

    public void setFontMap(Map<String, Typeface> map) {
        this.vgm.hww(map);
    }

    public void setFrame(int i10) {
        this.vgm.sd(i10);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z10) {
        this.vgm.vgm(z10);
    }

    public void setImageAssetDelegate(com.bytedance.adsdk.tq.vy vyVar) {
        this.vgm.hww(vyVar);
    }

    public void setImageAssetsFolder(String str) {
        this.vgm.hww(str);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        ed();
        super.setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        ed();
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        ed();
        super.setImageResource(i10);
    }

    public void setLottieAnimListener(hww hwwVar) {
        this.blh = hwwVar;
    }

    public void setLottieClicklistener(tq tqVar) {
        this.f31938za = tqVar;
    }

    public void setMaintainOriginalImageBounds(boolean z10) {
        this.vgm.tq(z10);
    }

    public void setMaxFrame(int i10) {
        this.vgm.tq(i10);
    }

    public void setMaxProgress(float f10) {
        this.vgm.tq(f10);
    }

    public void setMinAndMaxFrame(String str) {
        this.vgm.vy(str);
    }

    public void setMinFrame(int i10) {
        this.vgm.hww(i10);
    }

    public void setMinProgress(float f10) {
        this.vgm.hww(f10);
    }

    public void setOutlineMasksAndMattes(boolean z10) {
        this.vgm.vy(z10);
    }

    public void setPerformanceTrackingEnabled(boolean z10) {
        this.vgm.sd(z10);
    }

    public void setProgress(float f10) {
        hww(f10, true);
    }

    public void setRenderMode(mrs mrsVar) {
        this.vgm.hww(mrsVar);
    }

    public void setRepeatCount(int i10) {
        this.f31929ed.add(vy.SET_REPEAT_COUNT);
        this.vgm.hv(i10);
    }

    public void setRepeatMode(int i10) {
        this.f31929ed.add(vy.SET_REPEAT_MODE);
        this.vgm.vy(i10);
    }

    public void setSafeMode(boolean z10) {
        this.vgm.hu(z10);
    }

    public void setSpeed(float f10) {
        this.vgm.sd(f10);
    }

    public void setTextDelegate(omn omnVar) {
        this.vgm.hww(omnVar);
    }

    public void setUseCompositionFrameRate(boolean z10) {
        this.vgm.ok(z10);
    }

    public void setView(View view) {
        this.vgm.hww(view);
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        rs rsVar;
        if (!this.nod && drawable == (rsVar = this.vgm) && rsVar.kv()) {
            hu();
        } else if (!this.nod && (drawable instanceof rs)) {
            rs rsVar2 = (rs) drawable;
            if (rsVar2.kv()) {
                rsVar2.mw();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    private void bs() {
        this.wgt = null;
        this.vgm.nod();
    }

    private void ed() {
        ed<vgm> edVar = this.weu;
        if (edVar != null) {
            edVar.tq(this.f31937sd);
            this.weu.vy(this.vy);
        }
    }

    private void jpb() {
        boolean zVy = vy();
        setImageDrawable(null);
        setImageDrawable(this.vgm);
        if (zVy) {
            this.vgm.ed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void khx() {
        rs rsVar;
        int i10;
        int i11;
        final int i12;
        if (this.wgt == null || (rsVar = this.vgm) == null) {
            return;
        }
        omn omnVarAeg = rsVar.aeg();
        vgm.sd sdVarOk = this.wgt.ok();
        if (sdVarOk == null || omnVarAeg == null) {
            return;
        }
        final int i13 = sdVarOk.hww;
        if (i13 < 0) {
            Log.i("TMe", "--==--- timer fail, ke is invalid: ".concat(String.valueOf(i13)));
            return;
        }
        int[] iArr = sdVarOk.f32340hv;
        final int i14 = -1;
        if (iArr == null || iArr.length < 2) {
            i10 = -1;
            i11 = -1;
        } else {
            i11 = iArr[0];
            i10 = iArr[1];
        }
        String strHww = omnVarAeg.hww(sdVarOk.f32341sd);
        String strHww2 = omnVarAeg.hww(sdVarOk.vy);
        try {
            i12 = Integer.parseInt(strHww);
            try {
                i14 = Integer.parseInt(strHww2);
            } catch (NumberFormatException unused) {
            }
        } catch (NumberFormatException unused2) {
            i12 = -1;
        }
        Log.i("TMe", "--==--- prepare timer, startS: " + i12 + ", lenS: " + i14);
        if (TextUtils.isEmpty(sdVarOk.f32342tq)) {
            Log.i("TMe", "--==--- timer fail, id is invalid: " + sdVarOk.f32342tq);
            return;
        }
        Log.i("TMe", "--==--- timer, id:" + sdVarOk.f32342tq);
        com.bytedance.adsdk.tq.sd.sd.sd sdVarSd = sd(sdVarOk.f32342tq);
        if (sdVarSd != null) {
            Log.i("TMe", "--==--- timer success");
            this.aed = sdVarOk.f32339hu;
            this.zvy = sdVarOk.vgm;
            this.hnv = sdVarSd;
            this.f31932kv = i12;
            this.kub = i12 - i14;
            this.aeg = i11;
            this.grv = i10;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f31932kv);
            sdVarSd.hww(sb2.toString());
            hww(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.tq.hu.3
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (hu.this.getFrame() < i13 - 1 || hu.this.getFrame() >= i13 + 2) {
                        return;
                    }
                    Log.i("TMe", "--==--- enter timer point, frame: " + hu.this.getFrame());
                    hu.this.tq(this);
                    if (i12 < 0 || i14 < 0) {
                        Log.i("TMe", "--==--- enter timer callback, NOT start timer");
                    } else {
                        Log.i("TMe", "--==--- enter timer callback, start timer");
                        hu.this.weu();
                    }
                    hu.this.hu();
                }
            });
        }
    }

    private void nod() {
        hww(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.tq.hu.9
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i10;
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (!(animatedValue instanceof Float) || ((Float) animatedValue).floatValue() < 0.98f) {
                    return;
                }
                hu.hv(hu.this);
                vgm.hww globalConfig = hu.this.getGlobalConfig();
                if (globalConfig != null && (i10 = globalConfig.vy) > 0 && i10 > hu.this.jpb) {
                    hu.this.khx();
                    hu.this.hww();
                    hu.this.setProgress(0.0f);
                } else {
                    hu.this.tq(this);
                    if (hu.this.blh != null) {
                        hww unused = hu.this.blh;
                    }
                }
            }
        });
    }

    private void ny() {
        hww(new Animator.AnimatorListener() { // from class: com.bytedance.adsdk.tq.hu.11
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                omn omnVarAeg;
                final long jElapsedRealtime = SystemClock.elapsedRealtime() - hu.this.omn;
                hu.this.tq(this);
                String playDelayedELExpressTimeS = hu.this.getPlayDelayedELExpressTimeS();
                if (!TextUtils.isEmpty(playDelayedELExpressTimeS) && (omnVarAeg = hu.this.vgm.aeg()) != null) {
                    try {
                        int i10 = Integer.parseInt(omnVarAeg.hww(playDelayedELExpressTimeS)) * 1000;
                        if (hu.this.omn > 0) {
                            long jElapsedRealtime2 = (hu.this.omn + ((long) i10)) - SystemClock.elapsedRealtime();
                            Log.i("TMe", "--==-- lottie delayed time: ".concat(String.valueOf(jElapsedRealtime2)));
                            if (jElapsedRealtime2 > 0) {
                                hu.this.hu();
                                hu.this.setVisibility(8);
                                if (hu.this.mrs == null) {
                                    hu.this.mrs = new Handler(Looper.getMainLooper());
                                }
                                hu.this.mrs.removeCallbacksAndMessages(null);
                                hu.this.mrs.postDelayed(new Runnable() { // from class: com.bytedance.adsdk.tq.hu.11.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        Log.i("TMe", "--==-- lottie real start play");
                                        hu.this.setVisibility(0);
                                        hu.this.hww();
                                        hu.this.hww(jElapsedRealtime);
                                    }
                                }, jElapsedRealtime2);
                                return;
                            }
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
                hu.this.hww(jElapsedRealtime);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }
        });
    }

    private void ok() {
        setSaveEnabled(false);
        this.f31934ny = true;
        setFallbackResource(0);
        setImageAssetsFolder("");
        hww(0.0f, false);
        hww(false, getContext().getApplicationContext());
        setIgnoreDisabledSystemAnimations(false);
        this.vgm.hww(Boolean.valueOf(com.bytedance.adsdk.tq.hu.hu.hww(getContext()) != 0.0f));
        rs();
        nod();
        ny();
    }

    private void rs() {
        hww(new Animator.AnimatorListener() { // from class: com.bytedance.adsdk.tq.hu.8
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                hu.this.tq(this);
                hu.this.khx();
                hu.this.vhb();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }
        });
    }

    private void sd(Matrix matrix, float f10, float f11, float f12, float f13) {
        matrix.postTranslate((f10 - f12) / 2.0f, (f11 - f13) / 2.0f);
    }

    private void tq(RectF rectF, RectF rectF2) {
        float width = getWidth();
        float height = getHeight();
        float fWidth = this.vgm.getBounds().width();
        float fHeight = this.vgm.getBounds().height();
        if (width == 0.0f || height == 0.0f || fWidth == 0.0f || fHeight == 0.0f) {
            return;
        }
        Matrix matrix = new Matrix();
        int i10 = AnonymousClass5.hww[getScaleType().ordinal()];
        if (i10 == 1) {
            hww(matrix, width, height, fWidth, fHeight);
        } else if (i10 == 2) {
            tq(matrix, width, height, fWidth, fHeight);
        } else if (i10 == 3) {
            sd(matrix, width, height, fWidth, fHeight);
        } else if (i10 == 4) {
            vy(matrix, width, height, fWidth, fHeight);
        }
        matrix.mapRect(rectF, rectF2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vhb() {
        final vgm.hww globalConfig = getGlobalConfig();
        if (globalConfig == null || globalConfig.f32336hv <= 0) {
            return;
        }
        if (TextUtils.isEmpty(globalConfig.f32335hu) && globalConfig.vgm == null) {
            return;
        }
        int maxFrame = globalConfig.f32336hv;
        if (maxFrame > getMaxFrame()) {
            maxFrame = (int) getMaxFrame();
        }
        final float maxFrame2 = maxFrame / getMaxFrame();
        hww(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.tq.hu.10
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (!(animatedValue instanceof Float) || ((Float) animatedValue).floatValue() < maxFrame2) {
                    return;
                }
                hu.this.tq(this);
                if (hu.this.f31938za != null) {
                    tq unused = hu.this.f31938za;
                }
            }
        });
    }

    private void vy(Matrix matrix, float f10, float f11, float f12, float f13) {
        if (f12 >= f10 || f13 >= f11) {
            if (f12 / f13 >= f10 / f11) {
                float f14 = f10 / f12;
                matrix.preScale(f14, f14);
                matrix.postTranslate(0.0f, (f11 - (f13 * f14)) / 2.0f);
                return;
            } else {
                float f15 = f11 / f13;
                matrix.preScale(f15, f15);
                matrix.postTranslate((f10 - (f12 * f15)) / 2.0f, 0.0f);
                return;
            }
        }
        if (f12 / f13 >= f10 / f11) {
            float f16 = f10 / f12;
            matrix.preScale(f16, f16);
            matrix.postTranslate(0.0f, (f11 - (f13 * f16)) / 2.0f);
        } else {
            float f17 = f11 / f13;
            matrix.preScale(f17, f17);
            matrix.postTranslate((f10 - (f12 * f17)) / 2.0f, 0.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void weu() {
        this.f31928bs.postDelayed(this.f31933mw, 1000L);
    }

    private void wgt() {
        this.f31928bs.removeCallbacksAndMessages(null);
    }

    public void hu() {
        this.vhb = false;
        this.vgm.mw();
    }

    public void hv() {
        this.f31929ed.add(vy.PLAY_OPTION);
        this.vgm.zvy();
    }

    public void setMaxFrame(String str) {
        this.vgm.sd(str);
    }

    public void setMinFrame(String str) {
        this.vgm.tq(str);
    }

    private com.bytedance.adsdk.tq.sd.sd.sd sd(String str) {
        com.bytedance.adsdk.tq.sd.sd.tq tqVarTq;
        rs rsVar = this.vgm;
        if (rsVar == null || (tqVarTq = rsVar.tq()) == null) {
            return null;
        }
        return hww(tqVarTq, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hww(long j10) {
        Map<String, Object> map;
        vgm.hww globalConfig = getGlobalConfig();
        if (this.blh != null) {
            HashMap map2 = new HashMap();
            map2.put("duration", Long.valueOf(j10));
            if (globalConfig == null || (map = globalConfig.f32338tq) == null || map.isEmpty()) {
                return;
            }
            map2.putAll(globalConfig.f32338tq);
        }
    }

    public void setAnimation(String str) {
        this.f31935ok = str;
        this.f31936rs = 0;
        setCompositionTask(tq(str));
    }

    public void sd() {
        this.vgm.jpb();
    }

    private nod hww(String str) {
        rs rsVar;
        vgm vgmVarAed;
        Map<String, nod> mapWgt;
        if (TextUtils.isEmpty(str) || (rsVar = this.vgm) == null || (vgmVarAed = rsVar.aed()) == null || (mapWgt = vgmVarAed.wgt()) == null) {
            return null;
        }
        return mapWgt.get(str);
    }

    public boolean vy() {
        return this.vgm.kv();
    }

    private void tq(Matrix matrix, float f10, float f11, float f12, float f13) {
        if (f12 < f10 && f13 < f11) {
            matrix.postTranslate((f10 - f12) / 2.0f, (f11 - f13) / 2.0f);
            return;
        }
        if (f12 / f13 >= f10 / f11) {
            float f14 = f10 / f12;
            matrix.preScale(f14, f14);
            matrix.postTranslate(0.0f, (f11 - (f13 * f14)) / 2.0f);
        } else {
            float f15 = f11 / f13;
            matrix.preScale(f15, f15);
            matrix.postTranslate((f10 - (f12 * f15)) / 2.0f, 0.0f);
        }
    }

    private void hww(int[][] iArr) {
        if (iArr == null || iArr.length == 0) {
            return;
        }
        try {
            int[] iArr2 = iArr[0];
            int i10 = iArr2[0];
            final int i11 = iArr2[1];
            if (i10 < 0 || i11 < 0) {
                return;
            }
            Log.i("TMe", "--==--- inel enter, play anim, startframe: ".concat(String.valueOf(i10)));
            wgt();
            hww();
            setFrame(i10);
            hww(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.tq.hu.12
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (hu.this.getFrame() < i11 - 1 || hu.this.getFrame() >= i11 + 2) {
                        return;
                    }
                    Log.i("TMe", "--==--- inel enter, play anim end, endframe: " + i11 + ", realFrame: " + hu.this.getFrame());
                    hu.this.tq(this);
                    hu.this.hu();
                }
            });
        } catch (Throwable unused) {
        }
    }

    private ed<vgm> tq(final String str) {
        if (isInEditMode()) {
            return new ed<>(new Callable<ny<vgm>>() { // from class: com.bytedance.adsdk.tq.hu.2
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: hww, reason: merged with bridge method [inline-methods] */
                public ny<vgm> call() throws Exception {
                    return hu.this.f31934ny ? ok.sd(hu.this.getContext(), str) : ok.sd(hu.this.getContext(), str, null);
                }
            }, true);
        }
        return this.f31934ny ? ok.tq(getContext(), str) : ok.tq(getContext(), str, (String) null);
    }

    public void tq(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.vgm.tq(animatorUpdateListener);
    }

    private void hww(String str, String str2, JSONArray jSONArray) {
        vgm.tq globalEvent = getGlobalEvent();
        if (globalEvent != null && str != null) {
            if (TextUtils.isEmpty(str2) && !str.contains("CSJNO")) {
                str2 = globalEvent.hww;
            }
            if ((jSONArray == null || jSONArray.length() <= 0) && !str.contains("CSJLELNO")) {
                jSONArray = globalEvent.f32343sd;
            }
        }
        if (!TextUtils.isEmpty(str2) || jSONArray == null) {
            return;
        }
        jSONArray.length();
    }

    public void tq() {
        this.vgm.bs();
    }

    public void tq(Animator.AnimatorListener animatorListener) {
        this.vgm.tq(animatorListener);
    }

    private com.bytedance.adsdk.tq.sd.sd.hww hww(MotionEvent motionEvent) {
        com.bytedance.adsdk.tq.sd.sd.tq tqVarTq;
        rs rsVar = this.vgm;
        if (rsVar == null || (tqVarTq = rsVar.tq()) == null) {
            return null;
        }
        return hww(tqVarTq, motionEvent);
    }

    private com.bytedance.adsdk.tq.sd.sd.hww hww(com.bytedance.adsdk.tq.sd.sd.tq tqVar, MotionEvent motionEvent) {
        com.bytedance.adsdk.tq.sd.sd.hww hwwVarHww;
        for (com.bytedance.adsdk.tq.sd.sd.hww hwwVar : tqVar.ny()) {
            if (hwwVar instanceof com.bytedance.adsdk.tq.sd.sd.tq) {
                if (hwwVar.ok() && hwwVar.hu() > 0.0f) {
                    RectF rectF = new RectF();
                    hwwVar.hww(rectF, hwwVar.vy(), true);
                    if (rectF.width() >= 3.0f && rectF.height() >= 3.0f && (hwwVarHww = hww((com.bytedance.adsdk.tq.sd.sd.tq) hwwVar, motionEvent)) != null) {
                        return hwwVarHww;
                    }
                }
            } else if (hwwVar.ok() && hwwVar.hu() > 0.0f) {
                RectF rectF2 = new RectF();
                rs rsVar = this.vgm;
                if (rsVar != null && rsVar.vgm()) {
                    hwwVar.hww(rectF2, hwwVar.vy(), true);
                    RectF rectFBlh = this.vgm.blh();
                    if (rectFBlh != null) {
                        hww(rectF2, rectFBlh);
                    }
                } else {
                    RectF rectF3 = new RectF();
                    hwwVar.hww(rectF3, hwwVar.vy(), true);
                    tq(rectF2, rectF3);
                }
                if (hww(motionEvent, rectF2)) {
                    return hwwVar;
                }
            }
        }
        return null;
    }

    private boolean hww(MotionEvent motionEvent, RectF rectF) {
        if (motionEvent != null && rectF != null) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            if (x10 >= rectF.left && x10 <= rectF.right && y10 >= rectF.top && y10 <= rectF.bottom) {
                return true;
            }
        }
        return false;
    }

    private void hww(RectF rectF, RectF rectF2) {
        float width = getWidth();
        float height = getHeight();
        float fWidth = rectF2.width();
        float fHeight = rectF2.height();
        if (width == 0.0f || height == 0.0f || fWidth == 0.0f || fHeight == 0.0f) {
            return;
        }
        Matrix matrix = new Matrix();
        int i10 = AnonymousClass5.hww[getScaleType().ordinal()];
        if (i10 == 1) {
            hww(matrix, width, height, fWidth, fHeight);
        } else if (i10 == 2) {
            tq(matrix, width, height, fWidth, fHeight);
        } else if (i10 == 3) {
            sd(matrix, width, height, fWidth, fHeight);
        } else if (i10 == 4) {
            vy(matrix, width, height, fWidth, fHeight);
        }
        matrix.mapRect(rectF);
    }

    private void hww(Matrix matrix, float f10, float f11, float f12, float f13) {
        if (f12 / f13 >= f10 / f11) {
            float f14 = f11 / f13;
            matrix.preScale(f14, f14);
            matrix.postTranslate(-(((f12 * f14) - f10) / 2.0f), 0.0f);
        } else {
            float f15 = f10 / f12;
            matrix.preScale(f15, f15);
            matrix.postTranslate(0.0f, -(((f13 * f15) - f11) / 2.0f));
        }
    }

    public void hww(boolean z10, Context context) {
        this.vgm.hww(z10, context);
    }

    private ed<vgm> hww(final int i10) {
        if (isInEditMode()) {
            return new ed<>(new Callable<ny<vgm>>() { // from class: com.bytedance.adsdk.tq.hu.13
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: hww, reason: merged with bridge method [inline-methods] */
                public ny<vgm> call() throws Exception {
                    return hu.this.f31934ny ? ok.tq(hu.this.getContext(), i10) : ok.tq(hu.this.getContext(), i10, (String) null);
                }
            }, true);
        }
        return this.f31934ny ? ok.hww(getContext(), i10) : ok.hww(getContext(), i10, (String) null);
    }

    public void hww(String str, String str2) {
        hww(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void hww(InputStream inputStream, String str) {
        setCompositionTask(ok.hww(inputStream, str));
    }

    private com.bytedance.adsdk.tq.sd.sd.sd hww(com.bytedance.adsdk.tq.sd.sd.tq tqVar, String str) {
        for (com.bytedance.adsdk.tq.sd.sd.hww hwwVar : tqVar.ny()) {
            if (hwwVar instanceof com.bytedance.adsdk.tq.sd.sd.tq) {
                com.bytedance.adsdk.tq.sd.sd.sd sdVarHww = hww((com.bytedance.adsdk.tq.sd.sd.tq) hwwVar, str);
                if (sdVarHww != null) {
                    return sdVarHww;
                }
            } else if (TextUtils.equals(str, hwwVar.rs()) && (hwwVar instanceof com.bytedance.adsdk.tq.sd.sd.sd)) {
                return (com.bytedance.adsdk.tq.sd.sd.sd) hwwVar;
            }
        }
        return null;
    }

    public void hww() {
        if (this.omn == 0) {
            this.omn = SystemClock.elapsedRealtime();
        }
        this.f31929ed.add(vy.PLAY_OPTION);
        this.vgm.vhb();
    }

    public void hww(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.vgm.hww(animatorUpdateListener);
    }

    public void hww(Animator.AnimatorListener animatorListener) {
        this.vgm.hww(animatorListener);
    }

    public void hww(boolean z10) {
        this.vgm.hv(z10 ? -1 : 0);
    }

    public Bitmap hww(String str, Bitmap bitmap) {
        return this.vgm.hww(str, bitmap);
    }

    private void hww(float f10, boolean z10) {
        if (z10) {
            this.f31929ed.add(vy.SET_PROGRESS);
        }
        this.vgm.vy(f10);
    }
}
