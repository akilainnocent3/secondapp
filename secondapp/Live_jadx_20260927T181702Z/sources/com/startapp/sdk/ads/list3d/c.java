package com.startapp.sdk.ads.list3d;

import android.view.View;
import android.view.animation.AnimationUtils;
import com.startapp.sdk.internal.rg;
import com.startapp.sdk.internal.t6;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List3DView f74131a;

    public c(List3DView list3DView) {
        this.f74131a = list3DView;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0049 A[PHI: r8
      0x0049: PHI (r8v1 float) = (r8v0 float), (r8v7 float) binds: [B:13:0x0040, B:16:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // java.lang.Runnable
    public final void run() {
        float f10;
        List3DView list3DView = this.f74131a;
        if (list3DView.f74116l == null) {
            return;
        }
        boolean z10 = false;
        View childAt = list3DView.getChildAt(0);
        if (childAt != null) {
            List3DView list3DView2 = this.f74131a;
            list3DView2.getClass();
            int iA = List3DView.a(childAt);
            List3DView list3DView3 = this.f74131a;
            list3DView2.f74109e = iA - list3DView3.f74111g;
            t6 t6Var = list3DView3.f74116l;
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            long j10 = t6Var.f75537e;
            if (j10 != 0) {
                int i10 = (int) (jCurrentAnimationTimeMillis - j10);
                if (i10 > 50) {
                    i10 = 50;
                }
                rg rgVar = (rg) t6Var;
                float f11 = rgVar.f75534b;
                float f12 = rgVar.f75533a;
                float f13 = rgVar.f75535c;
                if (f12 > f13) {
                    f10 = f13 - f12;
                } else {
                    f13 = rgVar.f75536d;
                    if (f12 < f13) {
                        f10 = f13 - f12;
                    } else {
                        f10 = 0.0f;
                    }
                }
                float f14 = (f10 * rgVar.f75467g) + f11;
                rgVar.f75533a = ((i10 * f14) / 1000.0f) + f12;
                rgVar.f75534b = f14 * rgVar.f75466f;
            }
            t6Var.f75537e = jCurrentAnimationTimeMillis;
            List3DView list3DView4 = this.f74131a;
            list3DView4.b(((int) list3DView4.f74116l.f75533a) - list3DView4.f74109e);
        }
        t6 t6Var2 = this.f74131a.f74116l;
        boolean z11 = Math.abs(t6Var2.f75534b) < 0.5f;
        float f15 = t6Var2.f75533a;
        if (f15 - 0.4f < t6Var2.f75535c && f15 + 0.4f > t6Var2.f75536d) {
            z10 = true;
        }
        if (z11 && z10) {
            return;
        }
        this.f74131a.postDelayed(this, 16L);
    }
}
