package z7;

import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@s1({"SMAP\nRouteDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RouteDecoder.kt\nandroidx/navigation/serialization/Decoder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,189:1\n1#2:190\n*E\n"})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final a f160834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f160835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public String f160836c;

    public c(@oy.l a store) {
        m0.p(store, "store");
        this.f160834a = store;
        this.f160835b = -1;
        this.f160836c = "";
    }

    public final int a(@oy.l bw.f descriptor) {
        String strF;
        m0.p(descriptor, "descriptor");
        int i10 = this.f160835b;
        do {
            i10++;
            if (i10 >= descriptor.e()) {
                return -1;
            }
            strF = descriptor.f(i10);
        } while (!this.f160834a.a(strF));
        this.f160835b = i10;
        this.f160836c = strF;
        return i10;
    }

    @oy.l
    public final Object b() {
        Object objB = this.f160834a.b(this.f160836c);
        if (objB != null) {
            return objB;
        }
        throw new IllegalStateException(("Unexpected null value for non-nullable argument " + this.f160836c).toString());
    }

    public final boolean c() {
        return this.f160834a.b(this.f160836c) == null;
    }
}
