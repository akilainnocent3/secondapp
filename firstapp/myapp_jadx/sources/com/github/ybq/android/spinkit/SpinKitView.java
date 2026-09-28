package com.github.ybq.android.spinkit;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.sportybet.android.gp.tz.R;
import defpackage.d4c;
import defpackage.da30;
import defpackage.dyi0;
import defpackage.ea30;
import defpackage.fze;
import defpackage.g87;
import defpackage.hb5;
import defpackage.hkd0;
import defpackage.jnw;
import defpackage.knw;
import defpackage.kw50;
import defpackage.lpf0;
import defpackage.lw50;
import defpackage.mk30;
import defpackage.un7;
import defpackage.wbe0;
import defpackage.wxi0;
import defpackage.x5i;
import defpackage.x8h;

/* JADX INFO: loaded from: classes.dex */
public class SpinKitView extends ProgressBar {
    public int a;
    public hkd0 b;

    public SpinKitView(Context context, AttributeSet attributeSet, int i) {
        hkd0 lw50Var;
        super(context, attributeSet, i, R.style.SpinKitView);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mk30.a, i, R.style.SpinKitView);
        wbe0 wbe0Var = wbe0.values()[typedArrayObtainStyledAttributes.getInt(1, 0)];
        this.a = typedArrayObtainStyledAttributes.getColor(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        switch (wbe0Var.ordinal()) {
            case 0:
                lw50Var = new lw50();
                break;
            case 1:
                lw50Var = new fze();
                break;
            case 2:
                lw50Var = new dyi0();
                break;
            case 3:
                lw50Var = new wxi0();
                break;
            case 4:
                lw50Var = new da30();
                break;
            case 5:
                lw50Var = new g87();
                break;
            case 6:
                lw50Var = new lpf0();
                break;
            case 7:
                lw50Var = new un7();
                break;
            case 8:
                lw50Var = new d4c();
                break;
            case 9:
                lw50Var = new x8h();
                break;
            case 10:
                lw50Var = new x5i();
                break;
            case 11:
                lw50Var = new kw50();
                break;
            case 12:
                lw50Var = new jnw();
                break;
            case 13:
                lw50Var = new ea30();
                break;
            case 14:
                lw50Var = new knw();
                break;
            default:
                lw50Var = null;
                break;
        }
        lw50Var.e(this.a);
        setIndeterminateDrawable(lw50Var);
        setIndeterminate(true);
    }

    @Override // android.view.View
    public final void onScreenStateChanged(int i) {
        hkd0 hkd0Var;
        super.onScreenStateChanged(i);
        if (i != 0 || (hkd0Var = this.b) == null) {
            return;
        }
        hkd0Var.stop();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z && this.b != null && getVisibility() == 0) {
            this.b.start();
        }
    }

    public void setColor(int i) {
        this.a = i;
        hkd0 hkd0Var = this.b;
        if (hkd0Var != null) {
            hkd0Var.e(i);
        }
        invalidate();
    }

    public void setIndeterminateDrawable(hkd0 hkd0Var) {
        super.setIndeterminateDrawable((Drawable) hkd0Var);
        this.b = hkd0Var;
        if (hkd0Var.c() == 0) {
            this.b.e(this.a);
        }
        onSizeChanged(getWidth(), getHeight(), getWidth(), getHeight());
        if (getVisibility() == 0) {
            this.b.start();
        }
    }

    @Override // android.view.View
    public final void unscheduleDrawable(Drawable drawable) {
        super.unscheduleDrawable(drawable);
        if (drawable instanceof hkd0) {
            ((hkd0) drawable).stop();
        }
    }

    @Override // android.widget.ProgressBar
    public hkd0 getIndeterminateDrawable() {
        return this.b;
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable instanceof hkd0) {
            setIndeterminateDrawable((hkd0) drawable);
        } else {
            hb5.a("this d must be instanceof Sprite");
        }
    }

    public SpinKitView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.SpinKitViewStyle);
    }

    public SpinKitView(Context context) {
        this(context, null);
    }
}
