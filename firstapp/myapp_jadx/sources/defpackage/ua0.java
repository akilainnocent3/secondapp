package defpackage;

import androidx.compose.material.ripple.RippleContainer;
import androidx.compose.material.ripple.RippleHostView;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ua0 extends wt50 implements qt50 {
    public RippleContainer N;
    public RippleHostView O;

    @Override // androidx.compose.ui.d.c
    public final void i2() {
        RippleContainer rippleContainer = this.N;
        if (rippleContainer != null) {
            o1();
            rt50 rt50Var = rippleContainer.d;
            RippleHostView rippleHostView = (RippleHostView) rt50Var.a.get(this);
            if (rippleHostView != null) {
                rippleHostView.c();
                LinkedHashMap linkedHashMap = rt50Var.a;
                RippleHostView rippleHostView2 = (RippleHostView) linkedHashMap.get(this);
                if (rippleHostView2 != null) {
                }
                linkedHashMap.remove(this);
                rippleContainer.c.add(rippleHostView);
            }
        }
    }

    @Override // defpackage.qt50
    public final void o1() {
        this.O = null;
        rcf.a(this);
    }
}
