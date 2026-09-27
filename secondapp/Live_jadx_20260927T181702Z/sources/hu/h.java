package hu;

import fr.y1;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.o0;
import ws.a1;
import ws.v0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public interface h extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final a f88544a = a.f88545a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f88545a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.l
        public static final ds.l<wt.f, Boolean> f88546b = C0887a.f88547g;

        /* JADX INFO: renamed from: hu.h$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class C0887a extends o0 implements ds.l<wt.f, Boolean> {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final C0887a f88547g = new C0887a();

            public C0887a() {
                super(1);
            }

            @Override // ds.l
            @oy.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@oy.l wt.f it) {
                m0.p(it, "it");
                return Boolean.TRUE;
            }
        }

        @oy.l
        public final ds.l<wt.f, Boolean> a() {
            return f88546b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {
        public static void a(@oy.l h hVar, @oy.l wt.f name, @oy.l et.b location) {
            m0.p(name, "name");
            m0.p(location, "location");
            k.a.b(hVar, name, location);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c extends i {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.l
        public static final c f88548b = new c();

        @Override // hu.i, hu.h
        @oy.l
        public Set<wt.f> c() {
            return y1.k();
        }

        @Override // hu.i, hu.h
        @oy.l
        public Set<wt.f> d() {
            return y1.k();
        }

        @Override // hu.i, hu.h
        @oy.l
        public Set<wt.f> g() {
            return y1.k();
        }
    }

    @Override // hu.k
    @oy.l
    Collection<? extends a1> a(@oy.l wt.f fVar, @oy.l et.b bVar);

    @oy.l
    Collection<? extends v0> b(@oy.l wt.f fVar, @oy.l et.b bVar);

    @oy.l
    Set<wt.f> c();

    @oy.l
    Set<wt.f> d();

    @oy.m
    Set<wt.f> g();
}
