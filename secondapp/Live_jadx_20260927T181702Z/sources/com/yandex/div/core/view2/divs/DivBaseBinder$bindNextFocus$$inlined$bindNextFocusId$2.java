package com.yandex.div.core.view2.divs;

import android.view.View;
import com.yandex.div.core.view2.DivViewIdProvider;
import dr.w2;
import kotlin.jvm.internal.o0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class DivBaseBinder$bindNextFocus$$inlined$bindNextFocusId$2 extends o0 implements ds.l<String, w2> {
    final /* synthetic */ View $this_bindNextFocus$inlined;
    final /* synthetic */ DivViewIdProvider $viewIdProvider$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivBaseBinder$bindNextFocus$$inlined$bindNextFocusId$2(View view, DivViewIdProvider divViewIdProvider) {
        super(1);
        this.$this_bindNextFocus$inlined = view;
        this.$viewIdProvider$inlined = divViewIdProvider;
    }

    @Override // ds.l
    public /* bridge */ /* synthetic */ w2 invoke(String str) {
        invoke2(str);
        return w2.f79517a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@oy.l String str) {
        this.$this_bindNextFocus$inlined.setNextFocusLeftId(this.$viewIdProvider$inlined.getViewId(str));
    }
}
