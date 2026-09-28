package defpackage;

import androidx.compose.runtime.m;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class owr {
    public final v5b a;
    public final t6l b;
    public final mdn c;
    public goh<Float> d;
    public goh<iwo> e;
    public goh<Float> f;
    public boolean g;
    public final ytw h;
    public final ytw i;
    public final ytw j;
    public final ytw k;
    public long l;
    public long m;
    public v6l n;
    public final wd0<iwo, jj0> o;
    public final wd0<Float, ij0> p;
    public final ytw q;
    public long r;

    @c0d(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$1", f = "LazyLayoutItemAnimation.kt", l = {171}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return owr.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                wd0<Float, ij0> wd0Var = owr.this.p;
                Float f = new Float(1.0f);
                this.a = 1;
                if (wd0Var.f(this, f) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$2", f = "LazyLayoutItemAnimation.kt", l = {183, 185}, m = "invokeSuspend")
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ owr c;
        public final /* synthetic */ goh<Float> d;
        public final /* synthetic */ v6l e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z, owr owrVar, goh<Float> gohVar, v6l v6lVar, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.b = z;
            this.c = owrVar;
            this.d = gohVar;
            this.e = v6lVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.b, this.c, this.d, this.e, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
        
            if (r11 == r9) goto L22;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                owr r0 = r10.c
                ytw r1 = r0.i
                wd0<java.lang.Float, ij0> r2 = r0.p
                y5b r9 = defpackage.y5b.a
                int r3 = r10.a
                r4 = 2
                r5 = 1
                if (r3 == 0) goto L24
                if (r3 == r5) goto L20
                if (r3 != r4) goto L19
                defpackage.uj50.b(r11)     // Catch: java.lang.Throwable -> L16
                goto L57
            L16:
                r0 = move-exception
                r10 = r0
                goto L63
            L19:
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r10)
                r10 = 0
                return r10
            L20:
                defpackage.uj50.b(r11)     // Catch: java.lang.Throwable -> L16
                goto L3a
            L24:
                defpackage.uj50.b(r11)
                boolean r11 = r10.b     // Catch: java.lang.Throwable -> L16
                if (r11 == 0) goto L3a
                java.lang.Float r11 = new java.lang.Float     // Catch: java.lang.Throwable -> L16
                r3 = 0
                r11.<init>(r3)     // Catch: java.lang.Throwable -> L16
                r10.a = r5     // Catch: java.lang.Throwable -> L16
                java.lang.Object r11 = r2.f(r10, r11)     // Catch: java.lang.Throwable -> L16
                if (r11 != r9) goto L3a
                goto L56
            L3a:
                java.lang.Float r3 = new java.lang.Float     // Catch: java.lang.Throwable -> L16
                r11 = 1065353216(0x3f800000, float:1.0)
                r3.<init>(r11)     // Catch: java.lang.Throwable -> L16
                r11 = r4
                goh<java.lang.Float> r4 = r10.d     // Catch: java.lang.Throwable -> L16
                v6l r5 = r10.e     // Catch: java.lang.Throwable -> L16
                pwr r6 = new pwr     // Catch: java.lang.Throwable -> L16
                r6.<init>()     // Catch: java.lang.Throwable -> L16
                r10.a = r11     // Catch: java.lang.Throwable -> L16
                r5 = 0
                r8 = 4
                r7 = r10
                java.lang.Object r11 = defpackage.wd0.a(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L16
                if (r11 != r9) goto L57
            L56:
                return r9
            L57:
                ui0 r11 = (defpackage.ui0) r11     // Catch: java.lang.Throwable -> L16
                java.lang.Boolean r10 = java.lang.Boolean.FALSE
                x5a0 r1 = (defpackage.x5a0) r1
                r1.setValue(r10)
                kotlin.Unit r10 = kotlin.Unit.a
                return r10
            L63:
                java.lang.Boolean r11 = java.lang.Boolean.FALSE
                x5a0 r1 = (defpackage.x5a0) r1
                r1.setValue(r11)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: owr.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$release$1", f = "LazyLayoutItemAnimation.kt", l = {218}, m = "invokeSuspend")
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public c(v1b<? super c> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return owr.this.new c(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                wd0<iwo, jj0> wd0Var = owr.this.o;
                this.a = 1;
                if (wd0Var.g(this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$release$2", f = "LazyLayoutItemAnimation.kt", l = {222}, m = "invokeSuspend")
    public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public d(v1b<? super d> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return owr.this.new d(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                wd0<Float, ij0> wd0Var = owr.this.p;
                this.a = 1;
                if (wd0Var.g(this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$release$3", f = "LazyLayoutItemAnimation.kt", l = {226}, m = "invokeSuspend")
    public static final class e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public e(v1b<? super e> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return owr.this.new e(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                wd0<Float, ij0> wd0Var = owr.this.p;
                this.a = 1;
                if (wd0Var.g(this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    public owr(v5b v5bVar, t6l t6lVar, mdn mdnVar) {
        this.a = v5bVar;
        this.b = t6lVar;
        this.c = mdnVar;
        Boolean bool = Boolean.FALSE;
        this.h = m.b(bool);
        this.i = m.b(bool);
        this.j = m.b(bool);
        this.k = m.b(bool);
        this.l = 9223372034707292159L;
        this.m = 0L;
        Object obj = null;
        this.n = t6lVar != null ? t6lVar.c() : null;
        int i = 12;
        this.o = new wd0<>(new iwo(0L), gjs.h, obj, i);
        this.p = new wd0<>(Float.valueOf(1.0f), gjs.b, obj, i);
        this.q = m.b(new iwo(0L));
        this.r = 9223372034707292159L;
    }

    public final void a() {
        v6l v6lVar = this.n;
        goh<Float> gohVar = this.d;
        ytw ytwVar = this.i;
        boolean zBooleanValue = ((Boolean) ((x5a0) ytwVar).getValue()).booleanValue();
        v5b v5bVar = this.a;
        if (zBooleanValue || gohVar == null || v6lVar == null) {
            if (b()) {
                if (v6lVar != null) {
                    v6lVar.g(1.0f);
                }
                ej5.c(v5bVar, null, null, new a(null), 3);
                return;
            }
            return;
        }
        ((x5a0) ytwVar).setValue(Boolean.TRUE);
        boolean zB = b();
        boolean z = !zB;
        if (!zB) {
            v6lVar.g(0.0f);
        }
        ej5.c(v5bVar, null, null, new b(z, this, gohVar, v6lVar, null), 3);
    }

    public final boolean b() {
        return ((Boolean) ((x5a0) this.j).getValue()).booleanValue();
    }

    public final void c() {
        t6l t6lVar;
        ytw ytwVar = this.h;
        boolean zBooleanValue = ((Boolean) ((x5a0) ytwVar).getValue()).booleanValue();
        v5b v5bVar = this.a;
        if (zBooleanValue) {
            ((x5a0) ytwVar).setValue(Boolean.FALSE);
            ej5.c(v5bVar, null, null, new c(null), 3);
        }
        ytw ytwVar2 = this.i;
        if (((Boolean) ((x5a0) ytwVar2).getValue()).booleanValue()) {
            ((x5a0) ytwVar2).setValue(Boolean.FALSE);
            ej5.c(v5bVar, null, null, new d(null), 3);
        }
        if (b()) {
            ((x5a0) this.j).setValue(Boolean.FALSE);
            ej5.c(v5bVar, null, null, new e(null), 3);
        }
        this.g = false;
        d(0L);
        this.l = 9223372034707292159L;
        v6l v6lVar = this.n;
        if (v6lVar != null && (t6lVar = this.b) != null) {
            t6lVar.a(v6lVar);
        }
        this.n = null;
        this.d = null;
        this.f = null;
        this.e = null;
    }

    public final void d(long j) {
        ((x5a0) this.q).setValue(new iwo(j));
    }
}
