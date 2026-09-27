package com.bytedance.sdk.component.adexpress.hu;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.bytedance.sdk.component.utils.mw;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww extends TextSwitcher implements ViewSwitcher.ViewFactory, mw.hww {

    /* JADX INFO: renamed from: ed, reason: collision with root package name */
    private int f34304ed;

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private TextView f34305hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private Context f34306hv;
    Animation.AnimationListener hww;
    private Handler khx;
    private int nod;

    /* JADX INFO: renamed from: ny, reason: collision with root package name */
    private int f34307ny;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private int f34308ok;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private float f34309rs;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private int f34310sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private List<String> f34311tq;
    private int vgm;
    private int vhb;
    private final int vy;

    public hww(Context context, int i10, float f10, int i11, int i12) {
        super(context);
        this.f34311tq = new ArrayList();
        this.f34310sd = 0;
        this.vy = 1;
        this.khx = new mw(Looper.getMainLooper(), this);
        this.hww = new Animation.AnimationListener() { // from class: com.bytedance.sdk.component.adexpress.hu.hww.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                if (hww.this.f34305hu != null) {
                    hww.this.f34305hu.setText("");
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        };
        this.f34306hv = context;
        this.f34308ok = i10;
        this.f34309rs = f10;
        this.nod = i11;
        this.f34304ed = i12;
        sd();
    }

    private void sd() {
        setFactory(this);
    }

    @Override // android.widget.ViewSwitcher.ViewFactory
    public View makeView() {
        TextView textView = new TextView(getContext());
        this.f34305hu = textView;
        textView.setTextColor(this.f34308ok);
        this.f34305hu.setTextSize(this.f34309rs);
        this.f34305hu.setMaxLines(this.nod);
        this.f34305hu.setTextAlignment(this.f34304ed);
        return this.f34305hu;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.khx.sendEmptyMessageDelayed(1, this.vgm);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.khx.removeMessages(1);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        try {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(com.bytedance.sdk.component.adexpress.dynamic.hv.vhb.tq(this.f34311tq.get(this.vhb), this.f34309rs, false)[0], 1073741824), i10);
        } catch (Exception unused) {
            super.onMeasure(i10, i11);
        }
    }

    public void setAnimationDuration(int i10) {
        this.vgm = i10;
    }

    public void setAnimationText(List<String> list) {
        this.f34311tq = list;
    }

    public void setAnimationType(int i10) {
        this.f34307ny = i10;
    }

    public void setMaxLines(int i10) {
        this.nod = i10;
    }

    public void setTextColor(int i10) {
        this.f34308ok = i10;
    }

    public void setTextSize(float f10) {
        this.f34309rs = f10;
    }

    public void tq() {
        List<String> list = this.f34311tq;
        if (list == null || list.size() <= 0) {
            return;
        }
        int i10 = this.f34310sd;
        this.f34310sd = i10 + 1;
        this.vhb = i10;
        setText(this.f34311tq.get(i10));
        if (this.f34310sd > this.f34311tq.size() - 1) {
            this.f34310sd = 0;
        }
    }

    public void hww() {
        int i10 = this.f34307ny;
        if (i10 == 1) {
            setInAnimation(getContext(), com.bytedance.sdk.component.utils.kub.rs(this.f34306hv, "tt_text_animation_y_in"));
            setOutAnimation(getContext(), com.bytedance.sdk.component.utils.kub.rs(this.f34306hv, "tt_text_animation_y_out"));
        } else if (i10 == 0) {
            setInAnimation(getContext(), com.bytedance.sdk.component.utils.kub.rs(this.f34306hv, "tt_text_animation_x_in"));
            setOutAnimation(getContext(), com.bytedance.sdk.component.utils.kub.rs(this.f34306hv, "tt_text_animation_x_in"));
            getInAnimation().setInterpolator(new LinearInterpolator());
            getOutAnimation().setInterpolator(new LinearInterpolator());
            getInAnimation().setAnimationListener(this.hww);
            getOutAnimation().setAnimationListener(this.hww);
        }
        this.khx.sendEmptyMessage(1);
    }

    @Override // com.bytedance.sdk.component.utils.mw.hww
    public void hww(Message message) {
        if (message.what != 1) {
            return;
        }
        tq();
        this.khx.sendEmptyMessageDelayed(1, this.vgm);
    }
}
