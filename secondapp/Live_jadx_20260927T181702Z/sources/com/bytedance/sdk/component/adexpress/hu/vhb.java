package com.bytedance.sdk.component.adexpress.hu;

import android.content.Context;
import android.text.TextUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class vhb extends FrameLayout {
    private final TextView hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private final ny f34373sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final ImageView f34374tq;
    private final RotateAnimation vy;

    public vhb(@NonNull Context context) {
        super(context);
        addView(com.bytedance.sdk.component.adexpress.sd.hww.vy(context));
        this.hww = (TextView) findViewById(2097610742);
        this.f34374tq = (ImageView) findViewById(2097610745);
        this.f34373sd = (ny) findViewById(2097610744);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 30.0f, 1, 0.65f, 1, 0.9f);
        this.vy = rotateAnimation;
        rotateAnimation.setDuration(300L);
        rotateAnimation.setRepeatMode(2);
        rotateAnimation.setRepeatCount(1);
        rotateAnimation.setInterpolator(new LinearInterpolator());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Runnable getHaloAnimation() {
        return new Runnable() { // from class: com.bytedance.sdk.component.adexpress.hu.vhb.1
            @Override // java.lang.Runnable
            public void run() {
                vhb.this.f34374tq.startAnimation(vhb.this.vy);
                vhb.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.hu.vhb.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        vhb.this.f34373sd.hww(4);
                    }
                }, 100L);
                vhb.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.hu.vhb.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        vhb.this.f34373sd.hww(4);
                    }
                }, 300L);
                vhb vhbVar = vhb.this;
                vhbVar.postDelayed(vhbVar.getHaloAnimation(), 1200L);
            }
        };
    }

    public void setText(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "Slide or click to jump to the details page or third-party application";
        }
        TextView textView = this.hww;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void hww() {
        postDelayed(getHaloAnimation(), 300L);
    }

    public void tq() {
        this.vy.cancel();
    }
}
