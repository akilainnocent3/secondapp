package ik;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.charset.Charset;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@AutoValue
@uk.a
public abstract class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f94639a = Charset.forName("UTF-8");

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @AutoValue
    public static abstract class a {

        /* JADX INFO: renamed from: ik.f0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        @AutoValue
        public static abstract class AbstractC0906a {

            /* JADX INFO: renamed from: ik.f0$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
            @AutoValue.Builder
            public static abstract class AbstractC0907a {
                @NonNull
                public abstract AbstractC0906a a();

                @NonNull
                public abstract AbstractC0907a b(@NonNull String str);

                @NonNull
                public abstract AbstractC0907a c(@NonNull String str);

                @NonNull
                public abstract AbstractC0907a d(@NonNull String str);
            }

            @NonNull
            public static AbstractC0907a a() {
                return new ik.d.b();
            }

            @NonNull
            public abstract String b();

            @NonNull
            public abstract String c();

            @NonNull
            public abstract String d();
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        @AutoValue.Builder
        public static abstract class b {
            @NonNull
            public abstract a a();

            @NonNull
            public abstract b b(@Nullable List<AbstractC0906a> list);

            @NonNull
            public abstract b c(@NonNull int i10);

            @NonNull
            public abstract b d(@NonNull int i10);

            @NonNull
            public abstract b e(@NonNull String str);

            @NonNull
            public abstract b f(@NonNull long j10);

            @NonNull
            public abstract b g(@NonNull int i10);

            @NonNull
            public abstract b h(@NonNull long j10);

            @NonNull
            public abstract b i(@NonNull long j10);

            @NonNull
            public abstract b j(@Nullable String str);
        }

        @NonNull
        public static b a() {
            return new ik.c.b();
        }

        @Nullable
        public abstract List<AbstractC0906a> b();

        @NonNull
        public abstract int c();

        @NonNull
        public abstract int d();

        @NonNull
        public abstract String e();

        @NonNull
        public abstract long f();

        @NonNull
        public abstract int g();

        @NonNull
        public abstract long h();

        @NonNull
        public abstract long i();

        @Nullable
        public abstract String j();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {

        /* JADX INFO: renamed from: a1, reason: collision with root package name */
        public static final int f94640a1 = 5;

        /* JADX INFO: renamed from: b1, reason: collision with root package name */
        public static final int f94641b1 = 6;

        /* JADX INFO: renamed from: c1, reason: collision with root package name */
        public static final int f94642c1 = 9;

        /* JADX INFO: renamed from: d1, reason: collision with root package name */
        public static final int f94643d1 = 0;

        /* JADX INFO: renamed from: e1, reason: collision with root package name */
        public static final int f94644e1 = 1;

        /* JADX INFO: renamed from: f1, reason: collision with root package name */
        public static final int f94645f1 = 7;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @AutoValue.Builder
    public static abstract class c {
        @NonNull
        public abstract f0 a();

        @NonNull
        public abstract c b(a aVar);

        @NonNull
        public abstract c c(@Nullable String str);

        @NonNull
        public abstract c d(@NonNull String str);

        @NonNull
        public abstract c e(@NonNull String str);

        @NonNull
        public abstract c f(@Nullable String str);

        @NonNull
        public abstract c g(@Nullable String str);

        @NonNull
        public abstract c h(@NonNull String str);

        @NonNull
        public abstract c i(@NonNull String str);

        @NonNull
        public abstract c j(e eVar);

        @NonNull
        public abstract c k(int i10);

        @NonNull
        public abstract c l(@NonNull String str);

        @NonNull
        public abstract c m(@NonNull f fVar);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @AutoValue
    public static abstract class d {

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        @AutoValue.Builder
        public static abstract class a {
            @NonNull
            public abstract d a();

            @NonNull
            public abstract a b(@NonNull String str);

            @NonNull
            public abstract a c(@NonNull String str);
        }

        @NonNull
        public static a a() {
            return new ik.e.b();
        }

        @NonNull
        public abstract String b();

        @NonNull
        public abstract String c();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @AutoValue
    public static abstract class e {

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        @AutoValue.Builder
        public static abstract class a {
            public abstract e a();

            public abstract a b(List<b> list);

            public abstract a c(String str);
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        @AutoValue
        public static abstract class b {

            /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
            @AutoValue.Builder
            public static abstract class a {
                public abstract b a();

                public abstract a b(byte[] bArr);

                public abstract a c(String str);
            }

            @NonNull
            public static a a() {
                return new ik.g.b();
            }

            @NonNull
            public abstract byte[] b();

            @NonNull
            public abstract String c();
        }

        @NonNull
        public static a a() {
            return new ik.f.b();
        }

        @NonNull
        public abstract List<b> b();

        @Nullable
        public abstract String c();

        public abstract a d();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @AutoValue
    public static abstract class f {

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        @AutoValue
        public static abstract class a {

            /* JADX INFO: renamed from: ik.f0$f$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
            @AutoValue.Builder
            public static abstract class AbstractC0908a {
                @NonNull
                public abstract a a();

                @NonNull
                public abstract AbstractC0908a b(@Nullable String str);

                @NonNull
                public abstract AbstractC0908a c(@Nullable String str);

                @NonNull
                public abstract AbstractC0908a d(@NonNull String str);

                @NonNull
                public abstract AbstractC0908a e(@NonNull String str);

                @NonNull
                public abstract AbstractC0908a f(@NonNull String str);

                @NonNull
                public abstract AbstractC0908a g(@NonNull b bVar);

                @NonNull
                public abstract AbstractC0908a h(@NonNull String str);
            }

            /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
            @AutoValue
            public static abstract class b {

                /* JADX INFO: renamed from: ik.f0$f$a$b$a, reason: collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
                @AutoValue.Builder
                public static abstract class AbstractC0909a {
                    @NonNull
                    public abstract b a();

                    @NonNull
                    public abstract AbstractC0909a b(@NonNull String str);
                }

                @NonNull
                public static AbstractC0909a a() {
                    return new j.b();
                }

                @NonNull
                public abstract String b();

                @NonNull
                public abstract AbstractC0909a c();
            }

            @NonNull
            public static AbstractC0908a a() {
                return new i.b();
            }

            @Nullable
            public abstract String b();

            @Nullable
            public abstract String c();

            @Nullable
            public abstract String d();

            @NonNull
            public abstract String e();

            @Nullable
            public abstract String f();

            @Nullable
            public abstract b g();

            @NonNull
            public abstract String h();

            @NonNull
            public abstract AbstractC0908a i();

            @NonNull
            public a j(@NonNull String str) {
                b bVarG = g();
                return i().g((bVarG != null ? bVarG.c() : b.a()).b(str).a()).a();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        @AutoValue.Builder
        public static abstract class b {
            @NonNull
            public abstract f a();

            @NonNull
            public abstract b b(@NonNull a aVar);

            @NonNull
            public abstract b c(@Nullable String str);

            @NonNull
            public abstract b d(boolean z10);

            @NonNull
            public abstract b e(@NonNull c cVar);

            @NonNull
            public abstract b f(@NonNull Long l10);

            @NonNull
            public abstract b g(@NonNull List<d> list);

            @NonNull
            public abstract b h(@NonNull String str);

            @NonNull
            public abstract b i(int i10);

            @NonNull
            public abstract b j(@NonNull String str);

            @NonNull
            public b k(@NonNull byte[] bArr) {
                return j(new String(bArr, f0.f94639a));
            }

            @NonNull
            public abstract b l(@NonNull e eVar);

            @NonNull
            public abstract b m(long j10);

            @NonNull
            public abstract b n(@NonNull AbstractC0923f abstractC0923f);
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        @AutoValue
        public static abstract class c {

            /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
            @AutoValue.Builder
            public static abstract class a {
                @NonNull
                public abstract c a();

                @NonNull
                public abstract a b(int i10);

                @NonNull
                public abstract a c(int i10);

                @NonNull
                public abstract a d(long j10);

                @NonNull
                public abstract a e(@NonNull String str);

                @NonNull
                public abstract a f(@NonNull String str);

                @NonNull
                public abstract a g(@NonNull String str);

                @NonNull
                public abstract a h(long j10);

                @NonNull
                public abstract a i(boolean z10);

                @NonNull
                public abstract a j(int i10);
            }

            @NonNull
            public static a a() {
                return new k.b();
            }

            @NonNull
            public abstract int b();

            public abstract int c();

            public abstract long d();

            @NonNull
            public abstract String e();

            @NonNull
            public abstract String f();

            @NonNull
            public abstract String g();

            public abstract long h();

            public abstract int i();

            public abstract boolean j();
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        @AutoValue
        public static abstract class d {

            /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
            @AutoValue
            public static abstract class a {

                /* JADX INFO: renamed from: ik.f0$f$d$a$a, reason: collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
                @AutoValue.Builder
                public static abstract class AbstractC0910a {
                    @NonNull
                    public abstract a a();

                    @NonNull
                    public abstract AbstractC0910a b(@Nullable List<c> list);

                    @NonNull
                    public abstract AbstractC0910a c(@Nullable Boolean bool);

                    @NonNull
                    public abstract AbstractC0910a d(@Nullable c cVar);

                    @NonNull
                    public abstract AbstractC0910a e(@NonNull List<d> list);

                    @NonNull
                    public abstract AbstractC0910a f(@NonNull b bVar);

                    @NonNull
                    public abstract AbstractC0910a g(@NonNull List<d> list);

                    @NonNull
                    public abstract AbstractC0910a h(int i10);
                }

                /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
                @AutoValue
                public static abstract class b {

                    /* JADX INFO: renamed from: ik.f0$f$d$a$b$a, reason: collision with other inner class name */
                    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
                    @AutoValue
                    public static abstract class AbstractC0911a {

                        /* JADX INFO: renamed from: ik.f0$f$d$a$b$a$a, reason: collision with other inner class name */
                        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
                        @AutoValue.Builder
                        public static abstract class AbstractC0912a {
                            @NonNull
                            public abstract AbstractC0911a a();

                            @NonNull
                            public abstract AbstractC0912a b(long j10);

                            @NonNull
                            public abstract AbstractC0912a c(@NonNull String str);

                            @NonNull
                            public abstract AbstractC0912a d(long j10);

                            @NonNull
                            public abstract AbstractC0912a e(@Nullable String str);

                            @NonNull
                            public AbstractC0912a f(@NonNull byte[] bArr) {
                                return e(new String(bArr, f0.f94639a));
                            }
                        }

                        @NonNull
                        public static AbstractC0912a a() {
                            return new o.b();
                        }

                        @NonNull
                        public abstract long b();

                        @NonNull
                        public abstract String c();

                        public abstract long d();

                        @Nullable
                        @uk.a.b
                        public abstract String e();

                        @Nullable
                        @uk.a.InterfaceC1443a(name = CommonUrlParts.UUID)
                        public byte[] f() {
                            String strE = e();
                            if (strE != null) {
                                return strE.getBytes(f0.f94639a);
                            }
                            return null;
                        }
                    }

                    /* JADX INFO: renamed from: ik.f0$f$d$a$b$b, reason: collision with other inner class name */
                    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
                    @AutoValue.Builder
                    public static abstract class AbstractC0913b {
                        @NonNull
                        public abstract b a();

                        @NonNull
                        public abstract AbstractC0913b b(@NonNull a aVar);

                        @NonNull
                        public abstract AbstractC0913b c(@NonNull List<AbstractC0911a> list);

                        @NonNull
                        public abstract AbstractC0913b d(@NonNull c cVar);

                        @NonNull
                        public abstract AbstractC0913b e(@NonNull AbstractC0915d abstractC0915d);

                        @NonNull
                        public abstract AbstractC0913b f(@NonNull List<e> list);
                    }

                    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
                    @AutoValue
                    public static abstract class c {

                        /* JADX INFO: renamed from: ik.f0$f$d$a$b$c$a, reason: collision with other inner class name */
                        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
                        @AutoValue.Builder
                        public static abstract class AbstractC0914a {
                            @NonNull
                            public abstract c a();

                            @NonNull
                            public abstract AbstractC0914a b(@NonNull c cVar);

                            @NonNull
                            public abstract AbstractC0914a c(@NonNull List<e.AbstractC0918b> list);

                            @NonNull
                            public abstract AbstractC0914a d(int i10);

                            @NonNull
                            public abstract AbstractC0914a e(@NonNull String str);

                            @NonNull
                            public abstract AbstractC0914a f(@NonNull String str);
                        }

                        @NonNull
                        public static AbstractC0914a a() {
                            return new p.b();
                        }

                        @Nullable
                        public abstract c b();

                        @NonNull
                        public abstract List<e.AbstractC0918b> c();

                        public abstract int d();

                        @Nullable
                        public abstract String e();

                        @NonNull
                        public abstract String f();
                    }

                    /* JADX INFO: renamed from: ik.f0$f$d$a$b$d, reason: collision with other inner class name */
                    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
                    @AutoValue
                    public static abstract class AbstractC0915d {

                        /* JADX INFO: renamed from: ik.f0$f$d$a$b$d$a, reason: collision with other inner class name */
                        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
                        @AutoValue.Builder
                        public static abstract class AbstractC0916a {
                            @NonNull
                            public abstract AbstractC0915d a();

                            @NonNull
                            public abstract AbstractC0916a b(long j10);

                            @NonNull
                            public abstract AbstractC0916a c(@NonNull String str);

                            @NonNull
                            public abstract AbstractC0916a d(@NonNull String str);
                        }

                        @NonNull
                        public static AbstractC0916a a() {
                            return new q.b();
                        }

                        @NonNull
                        public abstract long b();

                        @NonNull
                        public abstract String c();

                        @NonNull
                        public abstract String d();
                    }

                    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
                    @AutoValue
                    public static abstract class e {

                        /* JADX INFO: renamed from: ik.f0$f$d$a$b$e$a, reason: collision with other inner class name */
                        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
                        @AutoValue.Builder
                        public static abstract class AbstractC0917a {
                            @NonNull
                            public abstract e a();

                            @NonNull
                            public abstract AbstractC0917a b(@NonNull List<AbstractC0918b> list);

                            @NonNull
                            public abstract AbstractC0917a c(int i10);

                            @NonNull
                            public abstract AbstractC0917a d(@NonNull String str);
                        }

                        /* JADX INFO: renamed from: ik.f0$f$d$a$b$e$b, reason: collision with other inner class name */
                        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
                        @AutoValue
                        public static abstract class AbstractC0918b {

                            /* JADX INFO: renamed from: ik.f0$f$d$a$b$e$b$a, reason: collision with other inner class name */
                            /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
                            @AutoValue.Builder
                            public static abstract class AbstractC0919a {
                                @NonNull
                                public abstract AbstractC0918b a();

                                @NonNull
                                public abstract AbstractC0919a b(@NonNull String str);

                                @NonNull
                                public abstract AbstractC0919a c(int i10);

                                @NonNull
                                public abstract AbstractC0919a d(long j10);

                                @NonNull
                                public abstract AbstractC0919a e(long j10);

                                @NonNull
                                public abstract AbstractC0919a f(@NonNull String str);
                            }

                            @NonNull
                            public static AbstractC0919a a() {
                                return new s.b();
                            }

                            @Nullable
                            public abstract String b();

                            public abstract int c();

                            public abstract long d();

                            public abstract long e();

                            @NonNull
                            public abstract String f();
                        }

                        @NonNull
                        public static AbstractC0917a a() {
                            return new r.b();
                        }

                        @NonNull
                        public abstract List<AbstractC0918b> b();

                        public abstract int c();

                        @NonNull
                        public abstract String d();
                    }

                    @NonNull
                    public static AbstractC0913b a() {
                        return new n.b();
                    }

                    @Nullable
                    public abstract a b();

                    @NonNull
                    public abstract List<AbstractC0911a> c();

                    @Nullable
                    public abstract c d();

                    @NonNull
                    public abstract AbstractC0915d e();

                    @Nullable
                    public abstract List<e> f();
                }

                /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
                @AutoValue
                public static abstract class c {

                    /* JADX INFO: renamed from: ik.f0$f$d$a$c$a, reason: collision with other inner class name */
                    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
                    @AutoValue.Builder
                    public static abstract class AbstractC0920a {
                        @NonNull
                        public abstract c a();

                        @NonNull
                        public abstract AbstractC0920a b(boolean z10);

                        @NonNull
                        public abstract AbstractC0920a c(int i10);

                        @NonNull
                        public abstract AbstractC0920a d(int i10);

                        @NonNull
                        public abstract AbstractC0920a e(@NonNull String str);
                    }

                    @NonNull
                    public static AbstractC0920a a() {
                        return new t.b();
                    }

                    public abstract int b();

                    public abstract int c();

                    @NonNull
                    public abstract String d();

                    public abstract boolean e();
                }

                @NonNull
                public static AbstractC0910a a() {
                    return new m.b();
                }

                @Nullable
                public abstract List<c> b();

                @Nullable
                public abstract Boolean c();

                @Nullable
                public abstract c d();

                @Nullable
                public abstract List<d> e();

                @NonNull
                public abstract b f();

                @Nullable
                public abstract List<d> g();

                public abstract int h();

                @NonNull
                public abstract AbstractC0910a i();
            }

            /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
            @AutoValue.Builder
            public static abstract class b {
                @NonNull
                public abstract d a();

                @NonNull
                public abstract b b(@NonNull a aVar);

                @NonNull
                public abstract b c(@NonNull c cVar);

                @NonNull
                public abstract b d(@NonNull AbstractC0921d abstractC0921d);

                @NonNull
                public abstract b e(@NonNull AbstractC0922f abstractC0922f);

                @NonNull
                public abstract b f(long j10);

                @NonNull
                public abstract b g(@NonNull String str);
            }

            /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
            @AutoValue
            public static abstract class c {

                /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
                @AutoValue.Builder
                public static abstract class a {
                    @NonNull
                    public abstract c a();

                    @NonNull
                    public abstract a b(Double d10);

                    @NonNull
                    public abstract a c(int i10);

                    @NonNull
                    public abstract a d(long j10);

                    @NonNull
                    public abstract a e(int i10);

                    @NonNull
                    public abstract a f(boolean z10);

                    @NonNull
                    public abstract a g(long j10);
                }

                @NonNull
                public static a a() {
                    return new u.b();
                }

                @Nullable
                public abstract Double b();

                public abstract int c();

                public abstract long d();

                public abstract int e();

                public abstract long f();

                public abstract boolean g();
            }

            /* JADX INFO: renamed from: ik.f0$f$d$d, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
            @AutoValue
            public static abstract class AbstractC0921d {

                /* JADX INFO: renamed from: ik.f0$f$d$d$a */
                /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
                @AutoValue.Builder
                public static abstract class a {
                    @NonNull
                    public abstract AbstractC0921d a();

                    @NonNull
                    public abstract a b(@NonNull String str);
                }

                @NonNull
                public static a a() {
                    return new v.b();
                }

                @NonNull
                public abstract String b();
            }

            /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
            @AutoValue
            public static abstract class e {

                /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
                @AutoValue.Builder
                public static abstract class a {
                    @NonNull
                    public abstract e a();

                    @NonNull
                    public abstract a b(@NonNull String str);

                    @NonNull
                    public abstract a c(@NonNull String str);

                    @NonNull
                    public abstract a d(@NonNull b bVar);

                    @NonNull
                    public abstract a e(@NonNull long j10);
                }

                /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
                @AutoValue
                public static abstract class b {

                    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
                    @AutoValue.Builder
                    public static abstract class a {
                        @NonNull
                        public abstract b a();

                        @NonNull
                        public abstract a b(@NonNull String str);

                        @NonNull
                        public abstract a c(@NonNull String str);
                    }

                    public static a a() {
                        return new x.b();
                    }

                    @NonNull
                    public abstract String b();

                    @NonNull
                    public abstract String c();
                }

                @NonNull
                public static a a() {
                    return new w.b();
                }

                @NonNull
                public abstract String b();

                @NonNull
                public abstract String c();

                @NonNull
                public abstract b d();

                @NonNull
                public abstract long e();
            }

            /* JADX INFO: renamed from: ik.f0$f$d$f, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
            @AutoValue
            public static abstract class AbstractC0922f {

                /* JADX INFO: renamed from: ik.f0$f$d$f$a */
                /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
                @AutoValue.Builder
                public static abstract class a {
                    @NonNull
                    public abstract AbstractC0922f a();

                    @NonNull
                    public abstract a b(@NonNull List<e> list);
                }

                @NonNull
                public static a a() {
                    return new y.b();
                }

                @NonNull
                @uk.a.InterfaceC1443a(name = "assignments")
                public abstract List<e> b();
            }

            @NonNull
            public static b a() {
                return new l.b();
            }

            @NonNull
            public abstract a b();

            @NonNull
            public abstract c c();

            @Nullable
            public abstract AbstractC0921d d();

            @Nullable
            public abstract AbstractC0922f e();

            public abstract long f();

            @NonNull
            public abstract String g();

            @NonNull
            public abstract b h();
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        @AutoValue
        public static abstract class e {

            /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
            @AutoValue.Builder
            public static abstract class a {
                @NonNull
                public abstract e a();

                @NonNull
                public abstract a b(@NonNull String str);

                @NonNull
                public abstract a c(boolean z10);

                @NonNull
                public abstract a d(int i10);

                @NonNull
                public abstract a e(@NonNull String str);
            }

            @NonNull
            public static a a() {
                return new z.b();
            }

            @NonNull
            public abstract String b();

            public abstract int c();

            @NonNull
            public abstract String d();

            public abstract boolean e();
        }

        /* JADX INFO: renamed from: ik.f0$f$f, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        @AutoValue
        public static abstract class AbstractC0923f {

            /* JADX INFO: renamed from: ik.f0$f$f$a */
            /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
            @AutoValue.Builder
            public static abstract class a {
                @NonNull
                public abstract AbstractC0923f a();

                @NonNull
                public abstract a b(@NonNull String str);
            }

            @NonNull
            public static a a() {
                return new a0.b();
            }

            @NonNull
            public abstract String b();
        }

        @NonNull
        public static b a() {
            return new h.b().d(false);
        }

        @NonNull
        public abstract a b();

        @Nullable
        public abstract String c();

        @Nullable
        public abstract c d();

        @Nullable
        public abstract Long e();

        @Nullable
        public abstract List<d> f();

        @NonNull
        public abstract String g();

        public abstract int h();

        @NonNull
        @uk.a.b
        public abstract String i();

        @NonNull
        @uk.a.InterfaceC1443a(name = "identifier")
        public byte[] j() {
            return i().getBytes(f0.f94639a);
        }

        @Nullable
        public abstract e k();

        public abstract long l();

        @Nullable
        public abstract AbstractC0923f m();

        public abstract boolean n();

        @NonNull
        public abstract b o();

        @NonNull
        public f p(@Nullable String str) {
            return o().c(str).a();
        }

        @NonNull
        public f q(@NonNull List<d> list) {
            return o().g(list).a();
        }

        @NonNull
        public f r(@NonNull String str) {
            return o().b(b().j(str)).a();
        }

        @NonNull
        public f s(long j10, boolean z10, @Nullable String str) {
            b bVarO = o();
            bVarO.f(Long.valueOf(j10));
            bVarO.d(z10);
            if (str != null) {
                bVarO.n(AbstractC0923f.a().b(str).a());
            }
            return bVarO.a();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum g {
        INCOMPLETE,
        JAVA,
        NATIVE
    }

    @NonNull
    public static c b() {
        return new ik.b.C0905b();
    }

    @Nullable
    public abstract a c();

    @Nullable
    public abstract String d();

    @NonNull
    public abstract String e();

    @NonNull
    public abstract String f();

    @Nullable
    public abstract String g();

    @Nullable
    public abstract String h();

    @NonNull
    public abstract String i();

    @NonNull
    public abstract String j();

    @Nullable
    public abstract e k();

    public abstract int l();

    @NonNull
    public abstract String m();

    @Nullable
    public abstract f n();

    @uk.a.b
    public g o() {
        if (n() != null) {
            return g.JAVA;
        }
        return k() != null ? g.NATIVE : g.INCOMPLETE;
    }

    @NonNull
    public abstract c p();

    @NonNull
    public f0 q(@Nullable String str) {
        c cVarC = p().c(str);
        if (n() != null) {
            cVarC.m(n().p(str));
        }
        return cVarC.a();
    }

    @NonNull
    public f0 r(a aVar) {
        return aVar == null ? this : p().b(aVar).a();
    }

    @NonNull
    public f0 s(@NonNull List<f.d> list) {
        if (n() != null) {
            return p().m(n().q(list)).a();
        }
        throw new IllegalStateException("Reports without sessions cannot have events added to them.");
    }

    @NonNull
    public f0 t(@Nullable String str) {
        return p().f(str).a();
    }

    @NonNull
    public f0 u(@Nullable String str) {
        return p().g(str).a();
    }

    @NonNull
    public f0 v(@NonNull e eVar) {
        return p().m(null).j(eVar).a();
    }

    @NonNull
    public f0 w(@NonNull String str) {
        c cVarP = p();
        e eVarK = k();
        if (eVarK != null) {
            cVarP.j(eVarK.d().c(str).a());
        }
        f fVarN = n();
        if (fVarN != null) {
            cVarP.m(fVarN.r(str));
        }
        return cVarP.a();
    }

    @NonNull
    public f0 x(long j10, boolean z10, @Nullable String str) {
        c cVarP = p();
        if (n() != null) {
            cVarP.m(n().s(j10, z10, str));
        }
        return cVarP.a();
    }
}
