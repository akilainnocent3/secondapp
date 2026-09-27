package f1;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f82219p = "IntentSanitizer";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f82220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e2.f0<String> f82221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e2.f0<Uri> f82222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e2.f0<String> f82223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e2.f0<String> f82224e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e2.f0<String> f82225f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e2.f0<ComponentName> f82226g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f82227h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Map<String, e2.f0<Object>> f82228i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f82229j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e2.f0<Uri> f82230k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public e2.f0<ClipData> f82231l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f82232m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f82233n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f82234o;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(29)
    public static class b {
        @k.t
        public static String a(Intent intent) {
            return intent.getIdentifier();
        }

        @k.t
        public static Intent b(Intent intent, String str) {
            return intent.setIdentifier(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(31)
    public static class c {
        @k.t
        public static void a(int i10, ClipData.Item item, e2.e<String> eVar) {
            if (item.getHtmlText() == null && item.getIntent() == null && item.getTextLinks() == null) {
                return;
            }
            eVar.accept("ClipData item at position " + i10 + " contains htmlText, textLinks or intent: " + item);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final int f82235q = 2112614400;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final int f82236r = 2015363072;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f82237a;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f82244h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f82245i;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f82250n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f82251o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f82252p;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public e2.f0<String> f82238b = new e2.f0() { // from class: f1.t
            @Override // e2.f0
            public /* synthetic */ e2.f0 a(e2.f0 f0Var) {
                return e2.e0.a(this, f0Var);
            }

            @Override // e2.f0
            public /* synthetic */ e2.f0 b(e2.f0 f0Var) {
                return e2.e0.c(this, f0Var);
            }

            @Override // e2.f0
            public /* synthetic */ e2.f0 negate() {
                return e2.e0.b(this);
            }

            @Override // e2.f0
            public final boolean test(Object obj) {
                return i.d.p((String) obj);
            }
        };

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public e2.f0<Uri> f82239c = new e2.f0() { // from class: f1.u
            @Override // e2.f0
            public /* synthetic */ e2.f0 a(e2.f0 f0Var) {
                return e2.e0.a(this, f0Var);
            }

            @Override // e2.f0
            public /* synthetic */ e2.f0 b(e2.f0 f0Var) {
                return e2.e0.c(this, f0Var);
            }

            @Override // e2.f0
            public /* synthetic */ e2.f0 negate() {
                return e2.e0.b(this);
            }

            @Override // e2.f0
            public final boolean test(Object obj) {
                return i.d.l((Uri) obj);
            }
        };

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public e2.f0<String> f82240d = new e2.f0() { // from class: f1.v
            @Override // e2.f0
            public /* synthetic */ e2.f0 a(e2.f0 f0Var) {
                return e2.e0.a(this, f0Var);
            }

            @Override // e2.f0
            public /* synthetic */ e2.f0 b(e2.f0 f0Var) {
                return e2.e0.c(this, f0Var);
            }

            @Override // e2.f0
            public /* synthetic */ e2.f0 negate() {
                return e2.e0.b(this);
            }

            @Override // e2.f0
            public final boolean test(Object obj) {
                return i.d.b((String) obj);
            }
        };

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public e2.f0<String> f82241e = new e2.f0() { // from class: f1.w
            @Override // e2.f0
            public /* synthetic */ e2.f0 a(e2.f0 f0Var) {
                return e2.e0.a(this, f0Var);
            }

            @Override // e2.f0
            public /* synthetic */ e2.f0 b(e2.f0 f0Var) {
                return e2.e0.c(this, f0Var);
            }

            @Override // e2.f0
            public /* synthetic */ e2.f0 negate() {
                return e2.e0.b(this);
            }

            @Override // e2.f0
            public final boolean test(Object obj) {
                return i.d.k((String) obj);
            }
        };

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public e2.f0<String> f82242f = new e2.f0() { // from class: f1.x
            @Override // e2.f0
            public /* synthetic */ e2.f0 a(e2.f0 f0Var) {
                return e2.e0.a(this, f0Var);
            }

            @Override // e2.f0
            public /* synthetic */ e2.f0 b(e2.f0 f0Var) {
                return e2.e0.c(this, f0Var);
            }

            @Override // e2.f0
            public /* synthetic */ e2.f0 negate() {
                return e2.e0.b(this);
            }

            @Override // e2.f0
            public final boolean test(Object obj) {
                return i.d.f((String) obj);
            }
        };

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public e2.f0<ComponentName> f82243g = new e2.f0() { // from class: f1.y
            @Override // e2.f0
            public /* synthetic */ e2.f0 a(e2.f0 f0Var) {
                return e2.e0.a(this, f0Var);
            }

            @Override // e2.f0
            public /* synthetic */ e2.f0 b(e2.f0 f0Var) {
                return e2.e0.c(this, f0Var);
            }

            @Override // e2.f0
            public /* synthetic */ e2.f0 negate() {
                return e2.e0.b(this);
            }

            @Override // e2.f0
            public final boolean test(Object obj) {
                return i.d.a((ComponentName) obj);
            }
        };

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Map<String, e2.f0<Object>> f82246j = new HashMap();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f82247k = false;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public e2.f0<Uri> f82248l = new e2.f0() { // from class: f1.z
            @Override // e2.f0
            public /* synthetic */ e2.f0 a(e2.f0 f0Var) {
                return e2.e0.a(this, f0Var);
            }

            @Override // e2.f0
            public /* synthetic */ e2.f0 b(e2.f0 f0Var) {
                return e2.e0.c(this, f0Var);
            }

            @Override // e2.f0
            public /* synthetic */ e2.f0 negate() {
                return e2.e0.b(this);
            }

            @Override // e2.f0
            public final boolean test(Object obj) {
                return i.d.m((Uri) obj);
            }
        };

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public e2.f0<ClipData> f82249m = new e2.f0() { // from class: f1.a0
            @Override // e2.f0
            public /* synthetic */ e2.f0 a(e2.f0 f0Var) {
                return e2.e0.a(this, f0Var);
            }

            @Override // e2.f0
            public /* synthetic */ e2.f0 b(e2.f0 f0Var) {
                return e2.e0.c(this, f0Var);
            }

            @Override // e2.f0
            public /* synthetic */ e2.f0 negate() {
                return e2.e0.b(this);
            }

            @Override // e2.f0
            public final boolean test(Object obj) {
                return i.d.q((ClipData) obj);
            }
        };

        public static /* synthetic */ boolean a(ComponentName componentName) {
            return false;
        }

        public static /* synthetic */ boolean b(String str) {
            return false;
        }

        public static /* synthetic */ boolean e(Class cls, e2.f0 f0Var, Object obj) {
            return cls.isInstance(obj) && f0Var.test(cls.cast(obj));
        }

        public static /* synthetic */ boolean f(String str) {
            return false;
        }

        public static /* synthetic */ boolean i(Object obj) {
            return false;
        }

        public static /* synthetic */ boolean j(ComponentName componentName) {
            return true;
        }

        public static /* synthetic */ boolean k(String str) {
            return false;
        }

        public static /* synthetic */ boolean l(Uri uri) {
            return false;
        }

        public static /* synthetic */ boolean m(Uri uri) {
            return false;
        }

        public static /* synthetic */ boolean o(Object obj) {
            return true;
        }

        public static /* synthetic */ boolean p(String str) {
            return false;
        }

        public static /* synthetic */ boolean q(ClipData clipData) {
            return false;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public d A(@NonNull final ComponentName componentName) {
            e2.x.l(componentName);
            Objects.requireNonNull(componentName);
            return B(new e2.f0() { // from class: f1.o
                @Override // e2.f0
                public /* synthetic */ e2.f0 a(e2.f0 f0Var) {
                    return e2.e0.a(this, f0Var);
                }

                @Override // e2.f0
                public /* synthetic */ e2.f0 b(e2.f0 f0Var) {
                    return e2.e0.c(this, f0Var);
                }

                @Override // e2.f0
                public /* synthetic */ e2.f0 negate() {
                    return e2.e0.b(this);
                }

                @Override // e2.f0
                public final boolean test(Object obj) {
                    return componentName.equals((ComponentName) obj);
                }
            });
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public d B(@NonNull e2.f0<ComponentName> f0Var) {
            e2.x.l(f0Var);
            this.f82245i = true;
            this.f82243g = this.f82243g.b(f0Var);
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public d C(@NonNull final String str) {
            e2.x.l(str);
            return B(new e2.f0() { // from class: f1.l
                @Override // e2.f0
                public /* synthetic */ e2.f0 a(e2.f0 f0Var) {
                    return e2.e0.a(this, f0Var);
                }

                @Override // e2.f0
                public /* synthetic */ e2.f0 b(e2.f0 f0Var) {
                    return e2.e0.c(this, f0Var);
                }

                @Override // e2.f0
                public /* synthetic */ e2.f0 negate() {
                    return e2.e0.b(this);
                }

                @Override // e2.f0
                public final boolean test(Object obj) {
                    return str.equals(((ComponentName) obj).getPackageName());
                }
            });
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public d D(@NonNull e2.f0<Uri> f0Var) {
            e2.x.l(f0Var);
            this.f82239c = this.f82239c.b(f0Var);
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public d E(@NonNull final String str) {
            e2.x.l(str);
            D(new e2.f0() { // from class: f1.m
                @Override // e2.f0
                public /* synthetic */ e2.f0 a(e2.f0 f0Var) {
                    return e2.e0.a(this, f0Var);
                }

                @Override // e2.f0
                public /* synthetic */ e2.f0 b(e2.f0 f0Var) {
                    return e2.e0.c(this, f0Var);
                }

                @Override // e2.f0
                public /* synthetic */ e2.f0 negate() {
                    return e2.e0.b(this);
                }

                @Override // e2.f0
                public final boolean test(Object obj) {
                    return str.equals(((Uri) obj).getAuthority());
                }
            });
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public d F(@NonNull String str, @NonNull e2.f0<Object> f0Var) {
            e2.x.l(str);
            e2.x.l(f0Var);
            e2.f0<Object> f0Var2 = this.f82246j.get(str);
            if (f0Var2 == null) {
                f0Var2 = new e2.f0() { // from class: f1.r
                    @Override // e2.f0
                    public /* synthetic */ e2.f0 a(e2.f0 f0Var3) {
                        return e2.e0.a(this, f0Var3);
                    }

                    @Override // e2.f0
                    public /* synthetic */ e2.f0 b(e2.f0 f0Var3) {
                        return e2.e0.c(this, f0Var3);
                    }

                    @Override // e2.f0
                    public /* synthetic */ e2.f0 negate() {
                        return e2.e0.b(this);
                    }

                    @Override // e2.f0
                    public final boolean test(Object obj) {
                        return i.d.i(obj);
                    }
                };
            }
            this.f82246j.put(str, f0Var2.b(f0Var));
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public d G(@NonNull String str, @NonNull Class<?> cls) {
            return H(str, cls, new e2.f0() { // from class: f1.b0
                @Override // e2.f0
                public /* synthetic */ e2.f0 a(e2.f0 f0Var) {
                    return e2.e0.a(this, f0Var);
                }

                @Override // e2.f0
                public /* synthetic */ e2.f0 b(e2.f0 f0Var) {
                    return e2.e0.c(this, f0Var);
                }

                @Override // e2.f0
                public /* synthetic */ e2.f0 negate() {
                    return e2.e0.b(this);
                }

                @Override // e2.f0
                public final boolean test(Object obj) {
                    return i.d.o(obj);
                }
            });
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public <T> d H(@NonNull String str, @NonNull final Class<T> cls, @NonNull final e2.f0<T> f0Var) {
            e2.x.l(str);
            e2.x.l(cls);
            e2.x.l(f0Var);
            return F(str, new e2.f0() { // from class: f1.n
                @Override // e2.f0
                public /* synthetic */ e2.f0 a(e2.f0 f0Var2) {
                    return e2.e0.a(this, f0Var2);
                }

                @Override // e2.f0
                public /* synthetic */ e2.f0 b(e2.f0 f0Var2) {
                    return e2.e0.c(this, f0Var2);
                }

                @Override // e2.f0
                public /* synthetic */ e2.f0 negate() {
                    return e2.e0.b(this);
                }

                @Override // e2.f0
                public final boolean test(Object obj) {
                    return i.d.e(cls, f0Var, obj);
                }
            });
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public d I(@NonNull e2.f0<Uri> f0Var) {
            H("output", Uri.class, f0Var);
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public d J(@NonNull final String str) {
            H("output", Uri.class, new e2.f0() { // from class: f1.j
                @Override // e2.f0
                public /* synthetic */ e2.f0 a(e2.f0 f0Var) {
                    return e2.e0.a(this, f0Var);
                }

                @Override // e2.f0
                public /* synthetic */ e2.f0 b(e2.f0 f0Var) {
                    return e2.e0.c(this, f0Var);
                }

                @Override // e2.f0
                public /* synthetic */ e2.f0 negate() {
                    return e2.e0.b(this);
                }

                @Override // e2.f0
                public final boolean test(Object obj) {
                    return str.equals(((Uri) obj).getAuthority());
                }
            });
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public d K(@NonNull e2.f0<Uri> f0Var) {
            H("android.intent.extra.STREAM", Uri.class, f0Var);
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public d L(@NonNull final String str) {
            e2.x.l(str);
            H("android.intent.extra.STREAM", Uri.class, new e2.f0() { // from class: f1.s
                @Override // e2.f0
                public /* synthetic */ e2.f0 a(e2.f0 f0Var) {
                    return e2.e0.a(this, f0Var);
                }

                @Override // e2.f0
                public /* synthetic */ e2.f0 b(e2.f0 f0Var) {
                    return e2.e0.c(this, f0Var);
                }

                @Override // e2.f0
                public /* synthetic */ e2.f0 negate() {
                    return e2.e0.b(this);
                }

                @Override // e2.f0
                public final boolean test(Object obj) {
                    return str.equals(((Uri) obj).getAuthority());
                }
            });
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public d M(int i10) {
            this.f82237a = i10 | this.f82237a;
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public d N() {
            this.f82237a |= f82235q;
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public d O() {
            this.f82250n = true;
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public d P(@NonNull e2.f0<String> f0Var) {
            e2.x.l(f0Var);
            this.f82242f = this.f82242f.b(f0Var);
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public d Q(@NonNull String str) {
            e2.x.l(str);
            Objects.requireNonNull(str);
            return P(new k(str));
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public d R() {
            this.f82237a |= f82236r;
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public d S() {
            this.f82251o = true;
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public d T() {
            this.f82252p = true;
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public d U(@NonNull e2.f0<String> f0Var) {
            e2.x.l(f0Var);
            this.f82240d = this.f82240d.b(f0Var);
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public d V(@NonNull String str) {
            e2.x.l(str);
            Objects.requireNonNull(str);
            return U(new k(str));
        }

        @NonNull
        public i W() {
            boolean z10 = this.f82244h;
            if ((z10 && this.f82245i) || (!z10 && !this.f82245i)) {
                throw new SecurityException("You must call either allowAnyComponent or one or more of the allowComponent methods; but not both.");
            }
            i iVar = new i();
            iVar.f82220a = this.f82237a;
            iVar.f82221b = this.f82238b;
            iVar.f82222c = this.f82239c;
            iVar.f82223d = this.f82240d;
            iVar.f82224e = this.f82241e;
            iVar.f82225f = this.f82242f;
            iVar.f82227h = this.f82244h;
            iVar.f82226g = this.f82243g;
            iVar.f82228i = this.f82246j;
            iVar.f82229j = this.f82247k;
            iVar.f82230k = this.f82248l;
            iVar.f82231l = this.f82249m;
            iVar.f82232m = this.f82250n;
            iVar.f82233n = this.f82251o;
            iVar.f82234o = this.f82252p;
            return iVar;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public d r(@NonNull e2.f0<String> f0Var) {
            e2.x.l(f0Var);
            this.f82238b = this.f82238b.b(f0Var);
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public d s(@NonNull String str) {
            e2.x.l(str);
            Objects.requireNonNull(str);
            r(new k(str));
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public d t() {
            this.f82244h = true;
            this.f82243g = new e2.f0() { // from class: f1.p
                @Override // e2.f0
                public /* synthetic */ e2.f0 a(e2.f0 f0Var) {
                    return e2.e0.a(this, f0Var);
                }

                @Override // e2.f0
                public /* synthetic */ e2.f0 b(e2.f0 f0Var) {
                    return e2.e0.c(this, f0Var);
                }

                @Override // e2.f0
                public /* synthetic */ e2.f0 negate() {
                    return e2.e0.b(this);
                }

                @Override // e2.f0
                public final boolean test(Object obj) {
                    return i.d.j((ComponentName) obj);
                }
            };
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public d u(@NonNull e2.f0<String> f0Var) {
            e2.x.l(f0Var);
            this.f82241e = this.f82241e.b(f0Var);
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public d v(@NonNull String str) {
            e2.x.l(str);
            Objects.requireNonNull(str);
            return u(new k(str));
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public d w(@NonNull e2.f0<ClipData> f0Var) {
            e2.x.l(f0Var);
            this.f82249m = this.f82249m.b(f0Var);
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public d x() {
            this.f82247k = true;
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public d y(@NonNull e2.f0<Uri> f0Var) {
            e2.x.l(f0Var);
            this.f82248l = this.f82248l.b(f0Var);
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public d z(@NonNull final String str) {
            e2.x.l(str);
            return y(new e2.f0() { // from class: f1.q
                @Override // e2.f0
                public /* synthetic */ e2.f0 a(e2.f0 f0Var) {
                    return e2.e0.a(this, f0Var);
                }

                @Override // e2.f0
                public /* synthetic */ e2.f0 b(e2.f0 f0Var) {
                    return e2.e0.c(this, f0Var);
                }

                @Override // e2.f0
                public /* synthetic */ e2.f0 negate() {
                    return e2.e0.b(this);
                }

                @Override // e2.f0
                public final boolean test(Object obj) {
                    return str.equals(((Uri) obj).getAuthority());
                }
            });
        }
    }

    public static /* synthetic */ void a(String str) {
        throw new SecurityException(str);
    }

    public static void r(int i10, ClipData.Item item, e2.e<String> eVar) {
        if (item.getHtmlText() == null && item.getIntent() == null) {
            return;
        }
        eVar.accept("ClipData item at position " + i10 + " contains htmlText, textLinks or intent: " + item);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00be  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cd  */
    public static void w(@NonNull Intent intent, Intent intent2, e2.f0<ClipData> f0Var, boolean z10, e2.f0<Uri> f0Var2, e2.e<String> eVar) {
        CharSequence text;
        Uri uri;
        ClipData clipData = intent.getClipData();
        if (clipData == null) {
            return;
        }
        if (f0Var != null && f0Var.test(clipData)) {
            intent2.setClipData(clipData);
            return;
        }
        ClipData clipData2 = null;
        for (int i10 = 0; i10 < clipData.getItemCount(); i10++) {
            ClipData.Item itemAt = clipData.getItemAt(i10);
            if (Build.VERSION.SDK_INT >= 31) {
                c.a(i10, itemAt, eVar);
            } else {
                r(i10, itemAt, eVar);
            }
            if (z10) {
                text = itemAt.getText();
            } else {
                if (itemAt.getText() != null) {
                    eVar.accept("Item text cannot contain value. Item position: " + i10 + ". Text: " + ((Object) itemAt.getText()));
                }
                text = null;
            }
            if (f0Var2 != null) {
                if (itemAt.getUri() == null || f0Var2.test(itemAt.getUri())) {
                    uri = itemAt.getUri();
                } else {
                    eVar.accept("Item URI is not allowed. Item position: " + i10 + ". URI: " + itemAt.getUri());
                }
                if (text == null || uri != null) {
                    if (clipData2 == null) {
                        clipData2 = new ClipData(clipData.getDescription(), new ClipData.Item(text, null, uri));
                    } else {
                        clipData2.addItem(new ClipData.Item(text, null, uri));
                    }
                }
            } else if (itemAt.getUri() != null) {
                eVar.accept("Item URI is not allowed. Item position: " + i10 + ". URI: " + itemAt.getUri());
            }
            uri = null;
            if (text == null) {
                if (clipData2 == null) {
                    clipData2 = new ClipData(clipData.getDescription(), new ClipData.Item(text, null, uri));
                } else {
                    clipData2.addItem(new ClipData.Item(text, null, uri));
                }
            } else if (clipData2 == null) {
                clipData2 = new ClipData(clipData.getDescription(), new ClipData.Item(text, null, uri));
            } else {
                clipData2.addItem(new ClipData.Item(text, null, uri));
            }
        }
        if (clipData2 != null) {
            intent2.setClipData(clipData2);
        }
    }

    public final void s(Intent intent, String str, Object obj) {
        if (obj == null) {
            intent.getExtras().putString(str, null);
            return;
        }
        if (obj instanceof Parcelable) {
            intent.putExtra(str, (Parcelable) obj);
            return;
        }
        if (obj instanceof Parcelable[]) {
            intent.putExtra(str, (Parcelable[]) obj);
        } else {
            if (obj instanceof Serializable) {
                intent.putExtra(str, (Serializable) obj);
                return;
            }
            throw new IllegalArgumentException("Unsupported type " + obj.getClass());
        }
    }

    @NonNull
    public Intent t(@NonNull Intent intent, @NonNull e2.e<String> eVar) {
        Intent intent2 = new Intent();
        ComponentName component = intent.getComponent();
        if ((this.f82227h && component == null) || this.f82226g.test(component)) {
            intent2.setComponent(component);
        } else {
            eVar.accept("Component is not allowed: " + component);
            intent2.setComponent(new ComponentName("android", "java.lang.Void"));
        }
        String str = intent.getPackage();
        if (str == null || this.f82225f.test(str)) {
            intent2.setPackage(str);
        } else {
            eVar.accept("Package is not allowed: " + str);
        }
        int flags = this.f82220a | intent.getFlags();
        int i10 = this.f82220a;
        if (flags == i10) {
            intent2.setFlags(intent.getFlags());
        } else {
            intent2.setFlags(intent.getFlags() & i10);
            eVar.accept("The intent contains flags that are not allowed: 0x" + Integer.toHexString(intent.getFlags() & (~this.f82220a)));
        }
        String action = intent.getAction();
        if (action == null || this.f82221b.test(action)) {
            intent2.setAction(action);
        } else {
            eVar.accept("Action is not allowed: " + action);
        }
        Uri data = intent.getData();
        if (data == null || this.f82222c.test(data)) {
            intent2.setData(data);
        } else {
            eVar.accept("Data is not allowed: " + data);
        }
        String type = intent.getType();
        if (type == null || this.f82223d.test(type)) {
            intent2.setDataAndType(intent2.getData(), type);
        } else {
            eVar.accept("Type is not allowed: " + type);
        }
        Set<String> categories = intent.getCategories();
        if (categories != null) {
            for (String str2 : categories) {
                if (this.f82224e.test(str2)) {
                    intent2.addCategory(str2);
                } else {
                    eVar.accept("Category is not allowed: " + str2);
                }
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            for (String str3 : extras.keySet()) {
                if (str3.equals("android.intent.extra.STREAM") && (this.f82220a & 1) == 0) {
                    eVar.accept("Allowing Extra Stream requires also allowing at least  FLAG_GRANT_READ_URI_PERMISSION Flag.");
                } else if (!str3.equals("output") || ((~this.f82220a) & 3) == 0) {
                    Object obj = extras.get(str3);
                    e2.f0<Object> f0Var = this.f82228i.get(str3);
                    if (f0Var == null || !f0Var.test(obj)) {
                        eVar.accept("Extra is not allowed. Key: " + str3 + ". Value: " + obj);
                    } else {
                        s(intent2, str3, obj);
                    }
                } else {
                    eVar.accept("Allowing Extra Output requires also allowing FLAG_GRANT_READ_URI_PERMISSION and FLAG_GRANT_WRITE_URI_PERMISSION Flags.");
                }
            }
        }
        w(intent, intent2, this.f82231l, this.f82229j, this.f82230k, eVar);
        if (Build.VERSION.SDK_INT >= 29) {
            if (this.f82232m) {
                b.b(intent2, b.a(intent));
            } else if (b.a(intent) != null) {
                eVar.accept("Identifier is not allowed: " + b.a(intent));
            }
        }
        if (this.f82233n) {
            intent2.setSelector(intent.getSelector());
        } else if (intent.getSelector() != null) {
            eVar.accept("Selector is not allowed: " + intent.getSelector());
        }
        if (this.f82234o) {
            intent2.setSourceBounds(intent.getSourceBounds());
            return intent2;
        }
        if (intent.getSourceBounds() != null) {
            eVar.accept("SourceBounds is not allowed: " + intent.getSourceBounds());
        }
        return intent2;
    }

    @NonNull
    public Intent u(@NonNull Intent intent) {
        return t(intent, new e2.e() { // from class: f1.h
            @Override // e2.e
            public final void accept(Object obj) {
                i.b((String) obj);
            }
        });
    }

    @NonNull
    public Intent v(@NonNull Intent intent) {
        return t(intent, new e2.e() { // from class: f1.g
            @Override // e2.e
            public final void accept(Object obj) {
                i.a((String) obj);
            }
        });
    }

    public i() {
    }

    public static /* synthetic */ void b(String str) {
    }
}
