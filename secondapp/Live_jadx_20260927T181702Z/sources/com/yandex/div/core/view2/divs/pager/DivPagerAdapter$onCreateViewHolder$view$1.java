package com.yandex.div.core.view2.divs.pager;

import ds.a;
import kotlin.jvm.internal.o0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class DivPagerAdapter$onCreateViewHolder$view$1 extends o0 implements a<Boolean> {
    final /* synthetic */ DivPagerAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivPagerAdapter$onCreateViewHolder$view$1(DivPagerAdapter divPagerAdapter) {
        super(0);
        this.this$0 = divPagerAdapter;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ds.a
    @l
    public final Boolean invoke() {
        return Boolean.valueOf(this.this$0.isHorizontal());
    }
}
