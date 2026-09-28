package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class s12 implements njm {
    public final im5 a;
    public final String b;

    public s12(im5 im5Var, int i) {
        this.a = im5Var;
        String str = "top";
        if (i != 0) {
            if (i != 1) {
                Log.e("CCL", "horizontalAnchorIndexToAnchorName: Unknown horizontal index");
            } else {
                str = "bottom";
            }
        }
        this.b = str;
    }

    @Override // defpackage.njm
    public final void b(iwa.a aVar, float f) {
        int i = aVar.b;
        String str = "top";
        if (i != 0) {
            if (i != 1) {
                Log.e("CCL", "horizontalAnchorIndexToAnchorName: Unknown horizontal index");
            } else {
                str = "bottom";
            }
        }
        cm5 cm5Var = new cm5(new char[0]);
        cm5Var.h(lm5.h(aVar.a.toString()));
        cm5Var.h(lm5.h(str));
        cm5Var.h(new hm5(f));
        cm5Var.h(new hm5(0.0f));
        this.a.t(this.b, cm5Var);
    }
}
