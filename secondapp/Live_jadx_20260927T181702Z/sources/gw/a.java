package gw;

import java.util.List;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a {

    /* JADX INFO: renamed from: gw.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C0862a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @l
        public final zv.j<?> f87414a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0862a(@l zv.j<?> serializer) {
            super(null);
            m0.p(serializer, "serializer");
            this.f87414a = serializer;
        }

        @Override // gw.a
        @l
        public zv.j<?> a(@l List<? extends zv.j<?>> typeArgumentsSerializers) {
            m0.p(typeArgumentsSerializers, "typeArgumentsSerializers");
            return this.f87414a;
        }

        @l
        public final zv.j<?> b() {
            return this.f87414a;
        }

        public boolean equals(@m Object obj) {
            return (obj instanceof C0862a) && m0.g(((C0862a) obj).f87414a, this.f87414a);
        }

        public int hashCode() {
            return this.f87414a.hashCode();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @l
        public final ds.l<List<? extends zv.j<?>>, zv.j<?>> f87415a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(@l ds.l<? super List<? extends zv.j<?>>, ? extends zv.j<?>> provider) {
            super(null);
            m0.p(provider, "provider");
            this.f87415a = provider;
        }

        @Override // gw.a
        @l
        public zv.j<?> a(@l List<? extends zv.j<?>> typeArgumentsSerializers) {
            m0.p(typeArgumentsSerializers, "typeArgumentsSerializers");
            return this.f87415a.invoke(typeArgumentsSerializers);
        }

        @l
        public final ds.l<List<? extends zv.j<?>>, zv.j<?>> b() {
            return this.f87415a;
        }
    }

    public /* synthetic */ a(x xVar) {
        this();
    }

    @l
    public abstract zv.j<?> a(@l List<? extends zv.j<?>> list);

    public a() {
    }
}
