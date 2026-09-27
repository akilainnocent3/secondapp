package com.bytedance.sdk.component.adexpress.dynamic.animation.hww;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class vhb extends vy {
    public vhb(View view, com.bytedance.sdk.component.adexpress.dynamic.vy.hww hwwVar) {
        super(view, hwwVar);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
            if (viewGroup2 == null || !(viewGroup2 instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hv)) {
                return;
            }
            viewGroup2.setClipChildren(false);
            viewGroup2.setClipToPadding(false);
            ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
            if (viewGroup3 == null || !(viewGroup3 instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hv)) {
                return;
            }
            viewGroup3.setClipChildren(false);
            viewGroup3.setClipToPadding(false);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.hww.vy
    public List<ObjectAnimator> hww() {
        float f10;
        float fVhb = (float) this.f34010tq.vhb();
        float fNy = (float) this.f34010tq.ny();
        String strWgt = this.f34010tq.wgt();
        float f11 = 1.0f;
        if ("reverse".equals(strWgt) || "alternate-reverse".equals(strWgt)) {
            f10 = 1.0f;
        } else {
            f10 = fNy;
            fNy = 1.0f;
            f11 = fVhb;
            fVhb = 1.0f;
        }
        this.f34009sd.setTag(2097610710, this.f34010tq.tq());
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f34009sd, "scaleX", fVhb, f11).setDuration((int) (this.f34010tq.nod() * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f34009sd, "scaleY", fNy, f10).setDuration((int) (this.f34010tq.nod() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(hww(duration));
        arrayList.add(hww(duration2));
        return arrayList;
    }
}
