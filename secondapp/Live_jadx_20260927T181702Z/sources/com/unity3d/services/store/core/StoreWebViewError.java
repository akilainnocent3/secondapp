package com.unity3d.services.store.core;

import com.unity3d.scar.adapter.common.n;
import com.unity3d.services.core.webview.WebViewEventCategory;
import java.util.Arrays;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class StoreWebViewError extends n {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoreWebViewError(@m Enum<?> r10, @m String str, @l Object... errorArguments) {
        super(r10, str, Arrays.copyOf(errorArguments, errorArguments.length));
        m0.p(errorArguments, "errorArguments");
    }

    @Override // com.unity3d.scar.adapter.common.n, com.unity3d.scar.adapter.common.j
    @l
    public String getDomain() {
        return WebViewEventCategory.STORE.name();
    }
}
