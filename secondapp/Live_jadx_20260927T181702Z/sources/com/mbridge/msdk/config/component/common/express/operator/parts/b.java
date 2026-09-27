package com.mbridge.msdk.config.component.common.express.operator.parts;

import com.mbridge.msdk.config.component.common.express.d;
import com.mbridge.msdk.config.component.common.express.e;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class b implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f65169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e f65170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.express.node.d f65171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.config.dynamic.binddata.wrapper.a f65172d;

    public b(d dVar, e eVar, com.mbridge.msdk.config.component.common.express.node.d dVar2, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        this.f65171c = dVar2;
        this.f65169a = dVar;
        this.f65170b = eVar;
        this.f65172d = aVar;
    }

    public void a(Object obj) {
        this.f65172d.a("this", obj);
    }

    @Override // java.util.concurrent.Callable
    public Object call() throws Exception {
        return this.f65171c.a(this.f65169a, this.f65170b, this.f65172d);
    }
}
