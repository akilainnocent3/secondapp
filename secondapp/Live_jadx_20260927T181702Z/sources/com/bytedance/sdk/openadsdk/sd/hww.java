package com.bytedance.sdk.openadsdk.sd;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.utils.wdz;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww extends com.bytedance.sdk.openadsdk.core.hu.ok {
    private Paint hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private boolean f37584sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private float f37585tq;
    private int vy;

    public hww(Context context) {
        super(context);
        hww();
    }

    private void hww() {
        this.f37585tq = wdz.hww(getContext(), 8.0f);
        this.hww = new Paint();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        hww(getText().toString(), getWidth());
    }

    @Override // com.bytedance.sdk.openadsdk.core.hu.ok, android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.vy = getMeasuredHeight();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, this.vy);
        } else {
            layoutParams.height = this.vy;
        }
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.openadsdk.core.hu.ok, android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        int i10 = this.vy;
        if (i10 == 0 || layoutParams == null) {
            return;
        }
        layoutParams.height = i10;
    }

    public void setMinTextSize(float f10) {
        if (f10 <= 0.0f) {
            return;
        }
        this.f37585tq = f10;
    }

    private void hww(String str, int i10) {
        if (!this.f37584sd && i10 > 0) {
            float textSize = getTextSize();
            this.hww.set(getPaint());
            int paddingLeft = (i10 - getPaddingLeft()) - getPaddingRight();
            float fHww = hww(textSize, str);
            while (fHww > paddingLeft) {
                textSize -= 1.0f;
                this.hww.setTextSize(textSize);
                if (textSize <= this.f37585tq) {
                    break;
                } else {
                    fHww = hww(textSize, str);
                }
            }
            setTextSize(0, textSize);
            this.f37584sd = true;
        }
    }

    private float hww(float f10, String str) {
        this.hww.setTextSize(f10);
        return this.hww.measureText(str);
    }
}
