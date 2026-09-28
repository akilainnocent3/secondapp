package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class x72 implements u2i0 {
    public final im5 a;
    public final String b;

    public x72(im5 im5Var, int i) {
        this.a = im5Var;
        String str = "start";
        if (i != -2) {
            if (i == -1) {
                str = "end";
            } else if (i == 0) {
                str = "left";
            } else if (i != 1) {
                Log.e("CCL", "verticalAnchorIndexToAnchorName: Unknown vertical index");
            } else {
                str = "right";
            }
        }
        this.b = str;
    }

    @Override // defpackage.u2i0
    public final void b(iwa.b bVar, float f) {
        int i = bVar.b;
        String str = "start";
        if (i != -2) {
            if (i == -1) {
                str = "end";
            } else if (i == 0) {
                str = "left";
            } else if (i != 1) {
                Log.e("CCL", "verticalAnchorIndexToAnchorName: Unknown vertical index");
            } else {
                str = "right";
            }
        }
        cm5 cm5Var = new cm5(new char[0]);
        cm5Var.h(lm5.h(bVar.a.toString()));
        cm5Var.h(lm5.h(str));
        cm5Var.h(new hm5(f));
        cm5Var.h(new hm5(0.0f));
        this.a.t(this.b, cm5Var);
    }
}
