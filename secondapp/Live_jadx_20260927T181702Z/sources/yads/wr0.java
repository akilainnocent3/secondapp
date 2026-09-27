package yads;

import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class wr0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xr0 f157487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vr0 f157488c;

    public wr0(xr0 xr0Var, vr0 vr0Var) {
        this.f157487b = xr0Var;
        this.f157488c = vr0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LinkedHashMap linkedHashMap = this.f157487b.f157970c;
        vr0 vr0Var = this.f157488c;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            View view = (View) entry.getKey();
            int iIntValue = ((Number) entry.getValue()).intValue();
            if (kl3.a(view) >= 1) {
                vr0Var.a(iIntValue);
            }
        }
        this.f157487b.f157969b.postDelayed(this, 200L);
    }
}
