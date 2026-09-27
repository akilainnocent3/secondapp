package v2;

import java.io.IOException;
import kotlin.jvm.internal.m0;
import or.f;
import oy.l;
import oy.m;
import u2.g;
import u2.h;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class b<T> implements h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l
    public final ds.l<g, T> f139942a;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@l ds.l<? super g, ? extends T> produceNewData) {
        m0.p(produceNewData, "produceNewData");
        this.f139942a = produceNewData;
    }

    @Override // u2.h
    @m
    public Object a(@l g gVar, @l f<? super T> fVar) throws IOException {
        return this.f139942a.invoke(gVar);
    }
}
