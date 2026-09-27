package com.bytedance.sdk.component.adexpress.dynamic.animation.hww;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww extends vy {
    public hww(View view, com.bytedance.sdk.component.adexpress.dynamic.vy.hww hwwVar) {
        super(view, hwwVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.hww.vy
    public List<ObjectAnimator> hww() {
        float fJpb = this.f34010tq.jpb() / 100.0f;
        float fMrs = this.f34010tq.mrs() / 100.0f;
        if ("reverse".equals(this.f34010tq.wgt()) && this.f34010tq.khx() <= 0.0d) {
            fMrs = fJpb;
            fJpb = fMrs;
        }
        this.f34009sd.setAlpha(fJpb);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f34009sd, "alpha", fJpb, fMrs).setDuration((int) (this.f34010tq.nod() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(hww(duration));
        return arrayList;
    }
}
