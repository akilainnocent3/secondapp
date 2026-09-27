package sg.bigo.ads.ad.interstitial;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public class CustomTouchImageView extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AdCountDownButton.a f131135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Rect f131136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f131137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f131138d;

    public CustomTouchImageView(Context context) {
        super(context);
        this.f131136b = new Rect();
        this.f131137c = 1.0f;
        this.f131138d = true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f131138d && motionEvent.getAction() == 0) {
            if (this.f131137c == 1.0f) {
                AdCountDownButton.a aVar = this.f131135a;
                if (aVar != null) {
                    aVar.a();
                }
                return true;
            }
            float x10 = (int) motionEvent.getX();
            float y10 = (int) motionEvent.getY();
            float f10 = this.f131137c;
            float width = getWidth();
            float f11 = width * f10;
            float height = getHeight();
            float f12 = f10 * height;
            float f13 = (width - f11) / 2.0f;
            float f14 = (height - f12) / 2.0f;
            float f15 = f11 + f13;
            float f16 = f12 + f14;
            if (x10 >= f13 && x10 <= f15 && y10 >= f14 && y10 <= f16) {
                AdCountDownButton.a aVar2 = this.f131135a;
                if (aVar2 != null) {
                    aVar2.a();
                }
                return true;
            }
            getGlobalVisibleRect(this.f131136b);
            AdCountDownButton.a aVar3 = this.f131135a;
            if (aVar3 != null) {
                aVar3.a(this.f131136b);
            }
        }
        return false;
    }

    @Override // android.view.View
    public void setClickable(boolean z10) {
        super.setClickable(z10);
        this.f131138d = z10;
    }

    public void setCloseListener(AdCountDownButton.a aVar) {
        this.f131135a = aVar;
    }

    public void setRegionScale(float f10) {
        this.f131137c = f10;
    }

    public CustomTouchImageView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f131136b = new Rect();
        this.f131137c = 1.0f;
        this.f131138d = true;
    }

    public CustomTouchImageView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f131136b = new Rect();
        this.f131137c = 1.0f;
        this.f131138d = true;
    }
}
