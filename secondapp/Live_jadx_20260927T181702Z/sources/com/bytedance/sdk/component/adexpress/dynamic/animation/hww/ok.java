package com.bytedance.sdk.component.adexpress.dynamic.animation.hww;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class ok extends vy {
    public ok(View view, com.bytedance.sdk.component.adexpress.dynamic.vy.hww hwwVar) {
        super(view, hwwVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.hww.vy
    @SuppressLint({"ObjectAnimatorBinding"})
    public List<ObjectAnimator> hww() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f34009sd, "rippleValue", 0.0f, 1.0f).setDuration((int) (this.f34010tq.nod() * 1000.0d));
        ((ViewGroup) this.f34009sd.getParent()).setClipChildren(false);
        ((ViewGroup) this.f34009sd.getParent().getParent()).setClipChildren(false);
        ((ViewGroup) this.f34009sd.getParent().getParent().getParent()).setClipChildren(false);
        this.f34009sd.setTag(2097610712, this.f34010tq.ok());
        ArrayList arrayList = new ArrayList();
        arrayList.add(hww(duration));
        return arrayList;
    }
}
