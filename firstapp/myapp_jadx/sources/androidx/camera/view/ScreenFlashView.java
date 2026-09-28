package androidx.camera.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.sportybet.feature.dedicatedteampage.team.data.model.Vc.ACKxwYRsuWyGz;
import defpackage.h8n;
import defpackage.kpf0;
import defpackage.n16;
import defpackage.no70;
import defpackage.pgt;

/* JADX INFO: loaded from: classes.dex */
public final class ScreenFlashView extends View {
    public static final /* synthetic */ int c = 0;
    public Window a;
    public no70 b;

    public ScreenFlashView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        setBackgroundColor(-1);
        setAlpha(0.0f);
        setElevation(Float.MAX_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getBrightness() {
        Window window = this.a;
        if (window != null) {
            return window.getAttributes().screenBrightness;
        }
        pgt.c("ScreenFlashView", "setBrightness: mScreenFlashWindow is null!");
        return Float.NaN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrightness(float f) {
        if (this.a == null) {
            pgt.c("ScreenFlashView", "setBrightness: mScreenFlashWindow is null!");
            return;
        }
        if (Float.isNaN(f)) {
            pgt.c("ScreenFlashView", "setBrightness: value is NaN!");
            return;
        }
        WindowManager.LayoutParams attributes = this.a.getAttributes();
        attributes.screenBrightness = f;
        this.a.setAttributes(attributes);
        pgt.a("ScreenFlashView", "Brightness set to " + attributes.screenBrightness);
    }

    private void setScreenFlashUiInfo(h8n.i iVar) {
        pgt.a("ScreenFlashView", "setScreenFlashUiInfo: mCameraController is null!");
    }

    public h8n.i getScreenFlash() {
        return this.b;
    }

    public long getVisibilityRampUpAnimationDurationMillis() {
        return 1000L;
    }

    public void setController(n16 n16Var) {
        kpf0.a();
    }

    public void setScreenFlashWindow(Window window) {
        boolean z;
        no70 no70Var;
        kpf0.a();
        StringBuilder sb = new StringBuilder("updateScreenFlash: is new window null = ");
        boolean z2 = false;
        if (window == null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        sb.append(",  is new window same as previous = ");
        if (window == this.a) {
            z2 = true;
        }
        sb.append(z2);
        pgt.a(ACKxwYRsuWyGz.NEOvdeytY, sb.toString());
        if (this.a != window) {
            if (window == null) {
                no70Var = null;
            } else {
                no70Var = new no70(this);
            }
            this.b = no70Var;
        }
        this.a = window;
        setScreenFlashUiInfo(getScreenFlash());
    }

    public ScreenFlashView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScreenFlashView(Context context) {
        this(context, null);
    }
}
