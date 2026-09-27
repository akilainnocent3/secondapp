package com.bytedance.sdk.component.adexpress.dynamic.animation.hww;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class weu extends vy {
    public weu(View view, com.bytedance.sdk.component.adexpress.dynamic.vy.hww hwwVar) {
        super(view, hwwVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.hww.vy
    public List<ObjectAnimator> hww() {
        float f10;
        float fHww = com.bytedance.sdk.component.adexpress.vy.vgm.hww(com.bytedance.sdk.component.adexpress.vy.hww(), this.f34010tq.hu());
        float fHww2 = com.bytedance.sdk.component.adexpress.vy.vgm.hww(com.bytedance.sdk.component.adexpress.vy.hww(), this.f34010tq.vgm());
        float f11 = 0.0f;
        if ("reverse".equals(this.f34010tq.wgt())) {
            f10 = fHww2;
            fHww2 = 0.0f;
            f11 = fHww;
            fHww = 0.0f;
        } else {
            f10 = 0.0f;
        }
        if (com.bytedance.sdk.component.adexpress.vy.tq.hww(this.f34009sd.getContext())) {
            fHww = -fHww;
            f11 = -f11;
        }
        this.f34009sd.setTranslationX(fHww);
        this.f34009sd.setTranslationY(fHww2);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f34009sd, "translationX", fHww, f11).setDuration((int) (this.f34010tq.nod() * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f34009sd, "translationY", fHww2, f10).setDuration((int) (this.f34010tq.nod() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(hww(duration));
        arrayList.add(hww(duration2));
        return arrayList;
    }
}
