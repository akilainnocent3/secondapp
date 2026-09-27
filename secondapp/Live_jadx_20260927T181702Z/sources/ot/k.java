package ot;

import fr.h0;
import java.util.List;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.m
    public final q f119636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final List<q> f119637b;

    /* JADX WARN: Multi-variable type inference failed */
    public k() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @oy.l
    public final List<q> a() {
        return this.f119637b;
    }

    @oy.m
    public final q b() {
        return this.f119636a;
    }

    public k(@oy.m q qVar, @oy.l List<q> parametersInfo) {
        m0.p(parametersInfo, "parametersInfo");
        this.f119636a = qVar;
        this.f119637b = parametersInfo;
    }

    public /* synthetic */ k(q qVar, List list, int i10, x xVar) {
        this((i10 & 1) != 0 ? null : qVar, (i10 & 2) != 0 ? h0.J() : list);
    }
}
