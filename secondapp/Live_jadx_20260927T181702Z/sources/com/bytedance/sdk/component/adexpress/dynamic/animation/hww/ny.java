package com.bytedance.sdk.component.adexpress.dynamic.animation.hww;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class ny extends vy {
    public ny(View view, com.bytedance.sdk.component.adexpress.dynamic.vy.hww hwwVar) {
        super(view, hwwVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.hww.vy
    @SuppressLint({"ObjectAnimatorBinding"})
    public List<ObjectAnimator> hww() {
        int i10;
        int i11;
        this.f34009sd.setTag(2097610711, Integer.valueOf(this.f34010tq.vy()));
        View view = this.f34009sd;
        if (view == null || !com.bytedance.sdk.component.adexpress.vy.tq.hww(view.getContext())) {
            i10 = 0;
            i11 = 1;
        } else {
            i11 = 0;
            i10 = 1;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f34009sd, "shineValue", i10, i11).setDuration((int) (this.f34010tq.nod() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(hww(duration));
        return arrayList;
    }
}
