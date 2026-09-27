package pu;

import java.util.Collection;
import kotlin.jvm.internal.m0;
import ou.g0;
import ou.g1;
import ws.i0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public abstract class g extends ou.i {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        public static final a f121073a = new a();

        @Override // pu.g
        @oy.m
        public ws.e b(@oy.l wt.b classId) {
            m0.p(classId, "classId");
            return null;
        }

        @Override // pu.g
        @oy.l
        public <S extends hu.h> S c(@oy.l ws.e classDescriptor, @oy.l ds.a<? extends S> compute) {
            m0.p(classDescriptor, "classDescriptor");
            m0.p(compute, "compute");
            return compute.invoke();
        }

        @Override // pu.g
        public boolean d(@oy.l i0 moduleDescriptor) {
            m0.p(moduleDescriptor, "moduleDescriptor");
            return false;
        }

        @Override // pu.g
        public boolean e(@oy.l g1 typeConstructor) {
            m0.p(typeConstructor, "typeConstructor");
            return false;
        }

        @Override // pu.g
        @oy.l
        public Collection<g0> g(@oy.l ws.e classDescriptor) {
            m0.p(classDescriptor, "classDescriptor");
            Collection<g0> collectionI = classDescriptor.p().i();
            m0.o(collectionI, "classDescriptor.typeConstructor.supertypes");
            return collectionI;
        }

        @Override // ou.i
        @oy.l
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public g0 a(@oy.l su.i type) {
            m0.p(type, "type");
            return (g0) type;
        }

        @Override // pu.g
        @oy.m
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public ws.e f(@oy.l ws.m descriptor) {
            m0.p(descriptor, "descriptor");
            return null;
        }
    }

    @oy.m
    public abstract ws.e b(@oy.l wt.b bVar);

    @oy.l
    public abstract <S extends hu.h> S c(@oy.l ws.e eVar, @oy.l ds.a<? extends S> aVar);

    public abstract boolean d(@oy.l i0 i0Var);

    public abstract boolean e(@oy.l g1 g1Var);

    @oy.m
    public abstract ws.h f(@oy.l ws.m mVar);

    @oy.l
    public abstract Collection<g0> g(@oy.l ws.e eVar);

    @oy.l
    /* JADX INFO: renamed from: h */
    public abstract g0 a(@oy.l su.i iVar);
}
