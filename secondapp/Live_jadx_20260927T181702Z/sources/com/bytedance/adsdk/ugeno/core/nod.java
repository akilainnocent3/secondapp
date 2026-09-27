package com.bytedance.adsdk.ugeno.core;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class nod {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private int f32387hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private int f32388hv;
    Paint hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private AnimatorSet f32389sd = new AnimatorSet();

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private hww f32390tq;
    private String vgm;
    private View vy;

    public nod(View view, hww hwwVar) {
        this.vy = view;
        this.f32390tq = hwwVar;
        Paint paint = new Paint();
        this.hww = paint;
        paint.setAntiAlias(true);
    }

    public void tq() {
        AnimatorSet animatorSet = this.f32389sd;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public void hww() {
        ArrayList arrayList = new ArrayList();
        List<hww.C0298hww> listSd = this.f32390tq.sd();
        if (listSd == null || listSd.size() <= 0) {
            return;
        }
        for (hww.C0298hww c0298hww : listSd) {
            if (c0298hww != null) {
                ObjectAnimator objectAnimator = new ObjectAnimator();
                objectAnimator.setDuration(c0298hww.hww());
                if (TextUtils.equals(c0298hww.hv(), "translateX")) {
                    objectAnimator.setPropertyName("translationX");
                } else if (TextUtils.equals(c0298hww.hv(), "translateY")) {
                    objectAnimator.setPropertyName("translationY");
                } else {
                    objectAnimator.setPropertyName(c0298hww.hv());
                }
                objectAnimator.setStartDelay(c0298hww.vy());
                objectAnimator.setTarget(this.vy);
                if (TextUtils.equals(c0298hww.hv(), "backgroundColor")) {
                    objectAnimator.setIntValues((int) c0298hww.hu(), (int) c0298hww.vgm());
                    Log.d("UGenAnimation", "playAnimation: from = " + c0298hww.hu() + "; to=" + c0298hww.vgm());
                } else {
                    objectAnimator.setFloatValues(c0298hww.hu(), c0298hww.vgm());
                }
                int iTq = (int) this.f32390tq.tq();
                if (iTq != 0) {
                    objectAnimator.setRepeatCount(iTq);
                } else {
                    objectAnimator.setRepeatCount((int) c0298hww.tq());
                }
                if (TextUtils.equals(c0298hww.hv(), "backgroundColor")) {
                    objectAnimator.setEvaluator(new ArgbEvaluator());
                }
                String strHu = this.f32390tq.hu();
                if (TextUtils.isEmpty(strHu)) {
                    strHu = c0298hww.sd();
                }
                if (TextUtils.equals(strHu, "reverse")) {
                    objectAnimator.setRepeatMode(2);
                } else {
                    objectAnimator.setRepeatMode(1);
                }
                if (c0298hww.ok() != null && c0298hww.ok().length > 0) {
                    objectAnimator.setFloatValues(c0298hww.ok());
                }
                if (TextUtils.equals(c0298hww.hv(), "rotationX")) {
                    this.vy.post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.core.nod.1
                        @Override // java.lang.Runnable
                        public void run() {
                            nod.this.vy.setPivotX(nod.this.vy.getWidth() / 2.0f);
                            nod.this.vy.setPivotY(nod.this.vy.getHeight());
                        }
                    });
                }
                if (TextUtils.equals(c0298hww.hv(), "ripple")) {
                    this.vgm = c0298hww.nod();
                }
                String strRs = c0298hww.rs();
                strRs.getClass();
                switch (strRs) {
                    case "accelerate":
                        objectAnimator.setInterpolator(new AccelerateInterpolator());
                        break;
                    case "decelerate":
                        objectAnimator.setInterpolator(new DecelerateInterpolator());
                        break;
                    case "linear":
                    case "standard":
                        objectAnimator.setInterpolator(new LinearInterpolator());
                        break;
                    case "accelerateDecelerate":
                        objectAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
                        break;
                }
                arrayList.add(objectAnimator);
            }
        }
        if (this.f32390tq.vy() != 0) {
            this.f32389sd.setDuration(this.f32390tq.vy());
        }
        this.f32389sd.setStartDelay(this.f32390tq.hv());
        if (TextUtils.equals(this.f32390tq.hww(), "sequentially")) {
            this.f32389sd.playSequentially(arrayList);
        } else {
            this.f32389sd.playTogether(arrayList);
        }
        this.f32389sd.start();
    }

    public void hww(Canvas canvas, IAnimation iAnimation) {
        try {
            if (iAnimation.getRipple() == 0.0f || TextUtils.isEmpty(this.vgm)) {
                return;
            }
            this.hww.setColor(com.bytedance.adsdk.ugeno.vgm.hww.hww(this.vgm));
            this.hww.setAlpha(90);
            ((ViewGroup) this.vy.getParent()).setClipChildren(true);
            int i10 = this.f32388hv;
            int i11 = this.f32387hu;
            canvas.drawCircle(i10, i11, Math.min(i10, i11) * 2 * iAnimation.getRipple(), this.hww);
        } catch (Throwable th2) {
            Log.d("UGenAnimation", "ripple animation error " + th2.getMessage());
        }
    }

    public void hww(int i10, int i11) {
        this.f32388hv = i10 / 2;
        this.f32387hu = i11 / 2;
    }
}
