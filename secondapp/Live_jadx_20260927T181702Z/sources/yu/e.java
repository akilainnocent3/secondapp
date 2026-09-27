package yu;

import dr.w2;
import ds.p;
import ds.q;
import kotlin.jvm.internal.o0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l
    public static final ds.l<Object, Object> f160020a = f.f160031g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @l
    public static final ds.l<Object, Boolean> f160021b = b.f160027g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @l
    public static final ds.l<Object, Object> f160022c = a.f160026g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @l
    public static final ds.l<Object, w2> f160023d = c.f160028g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @l
    public static final p<Object, Object, w2> f160024e = d.f160029g;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @l
    public static final q<Object, Object, Object, w2> f160025f = C1564e.f160030g;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends o0 implements ds.l {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f160026g = new a();

        public a() {
            super(1);
        }

        @Override // ds.l
        @m
        public final Void invoke(@m Object obj) {
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends o0 implements ds.l<Object, Boolean> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f160027g = new b();

        public b() {
            super(1);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // ds.l
        @l
        public final Boolean invoke(@m Object obj) {
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c extends o0 implements ds.l<Object, w2> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final c f160028g = new c();

        public c() {
            super(1);
        }

        @Override // ds.l
        public /* bridge */ /* synthetic */ w2 invoke(Object obj) {
            invoke2(obj);
            return w2.f79517a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@m Object obj) {
        }
    }

    @l
    public static final <T> ds.l<T, Boolean> a() {
        return (ds.l<T, Boolean>) f160021b;
    }

    @l
    public static final q<Object, Object, Object, w2> b() {
        return f160025f;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class f extends o0 implements ds.l<Object, Object> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final f f160031g = new f();

        public f() {
            super(1);
        }

        @Override // ds.l
        @m
        public final Object invoke(@m Object obj) {
            return obj;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class d extends o0 implements p<Object, Object, w2> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final d f160029g = new d();

        public d() {
            super(2);
        }

        @Override // ds.p
        public /* bridge */ /* synthetic */ w2 invoke(Object obj, Object obj2) {
            a(obj, obj2);
            return w2.f79517a;
        }

        public final void a(@m Object obj, @m Object obj2) {
        }
    }

    /* JADX INFO: renamed from: yu.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C1564e extends o0 implements q<Object, Object, Object, w2> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final C1564e f160030g = new C1564e();

        public C1564e() {
            super(3);
        }

        @Override // ds.q
        public /* bridge */ /* synthetic */ w2 invoke(Object obj, Object obj2, Object obj3) {
            a(obj, obj2, obj3);
            return w2.f79517a;
        }

        public final void a(@m Object obj, @m Object obj2, @m Object obj3) {
        }
    }
}
