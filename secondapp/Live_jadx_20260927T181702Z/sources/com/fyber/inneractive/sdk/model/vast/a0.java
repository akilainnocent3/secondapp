package com.fyber.inneractive.sdk.model.vast;

import com.fyber.inneractive.sdk.util.w1;
import org.w3c.dom.Node;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class a0 extends g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f45156i;

    public a0() {
        this.f45194f = 1;
    }

    public static a0 c(Node node) {
        a0 a0Var = new a0();
        super.b(node);
        a0Var.f45156i = w1.a(w1.d(node, "VASTAdTagURI"));
        return a0Var;
    }
}
