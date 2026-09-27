package com.bytedance.sdk.component.adexpress.dynamic.animation.hww;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class wgt extends vy {
    public wgt(View view, com.bytedance.sdk.component.adexpress.dynamic.vy.hww hwwVar) {
        super(view, hwwVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.hww.vy
    public List<ObjectAnimator> hww() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f34009sd, "translationX", 0.0f, com.bytedance.sdk.component.adexpress.vy.vgm.hww(com.bytedance.sdk.component.adexpress.vy.hww(), 20.0f), 0.0f, -com.bytedance.sdk.component.adexpress.vy.vgm.hww(com.bytedance.sdk.component.adexpress.vy.hww(), 20.0f), 0.0f).setDuration((int) (this.f34010tq.nod() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(hww(duration));
        return arrayList;
    }
}
