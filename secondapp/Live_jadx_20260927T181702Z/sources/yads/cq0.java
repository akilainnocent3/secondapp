package yads;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class cq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nl3 f147870a;

    public /* synthetic */ cq0() {
        this(new nl3());
    }

    public final bq0 a(View view) {
        int iA;
        this.f147870a.getClass();
        RectF rectF = null;
        if (nl3.a(view)) {
            iA = kl3.a(view);
            Rect rect = new Rect();
            if (view.getLocalVisibleRect(rect)) {
                rect.offset(view.getLeft(), view.getTop());
            } else {
                rect = null;
            }
            Context context = view.getContext();
            if (rect != null) {
                float fA = kl3.a(context, rect.left);
                float fL0 = is.d.L0(rect.top / context.getResources().getDisplayMetrics().density);
                float fL1 = is.d.L0(rect.right / context.getResources().getDisplayMetrics().density);
                float fL2 = is.d.L0(rect.bottom / context.getResources().getDisplayMetrics().density);
                float f10 = fL2 - fL0;
                if (fL1 - fA > 0.0f && f10 > 0.0f) {
                    rectF = new RectF(fA, fL0, fL1, fL2);
                }
            }
        } else {
            iA = 0;
        }
        return new bq0(iA, rectF);
    }

    public cq0(nl3 nl3Var) {
        this.f147870a = nl3Var;
    }
}
