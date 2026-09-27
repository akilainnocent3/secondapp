package com.bytedance.sdk.openadsdk.core.vgm.hww;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.component.adexpress.tq.vhb;
import com.bytedance.sdk.openadsdk.core.model.wgt;
import com.bytedance.sdk.openadsdk.core.sd.sd;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww extends sd implements com.bytedance.sdk.component.adexpress.dynamic.hu.hww {
    protected WeakReference<View> hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private vhb f36841tq;

    @Override // com.bytedance.sdk.component.adexpress.dynamic.hu.hww
    public void hww(vhb vhbVar) {
        this.f36841tq = vhbVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.hu.hww
    public void hww(View view) {
        this.hww = new WeakReference<>(view);
    }

    @Override // com.bytedance.sdk.openadsdk.core.sd.sd
    public void hww(View view, float f10, float f11, float f12, float f13, SparseArray<sd.hww> sparseArray, boolean z10) {
        hww(view, ((Integer) view.getTag()).intValue(), f10, f11, f12, f13, sparseArray);
    }

    private void hww(View view, int i10, float f10, float f11, float f12, float f13, SparseArray<sd.hww> sparseArray) {
        if (this.f36841tq != null) {
            String strValueOf = "";
            try {
                int i11 = com.bytedance.sdk.component.adexpress.dynamic.hww.hnv;
                if (view.getTag(i11) != null) {
                    strValueOf = String.valueOf(view.getTag(i11));
                }
            } catch (Exception unused) {
            }
            this.f36841tq.hww(view, i10, new wgt.hww().vy(f10).sd(f11).tq(f12).hww(f13).tq(this.aeg).hww(this.grv).hww(sparseArray).hww(this.blh).hww(strValueOf).hww());
        }
    }
}
