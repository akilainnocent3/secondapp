package defpackage;

import android.os.Build;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2", f = "LegacyPlatformTextInputServiceAdapter.android.kt", l = {125}, m = "invokeSuspend")
public final class m80 extends tje0 implements Function2<sk10, v1b<?>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Function1<p6s, Unit> c;
    public final /* synthetic */ n80 d;
    public final /* synthetic */ x5s.a e;

    @c0d(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1", f = "LegacyPlatformTextInputServiceAdapter.android.kt", l = {149}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<?>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ sk10 c;
        public final /* synthetic */ Function1<p6s, Unit> d;
        public final /* synthetic */ n80 e;
        public final /* synthetic */ x5s.a f;

        /* JADX INFO: renamed from: m80$a$a, reason: collision with other inner class name */
        @c0d(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1", f = "LegacyPlatformTextInputServiceAdapter.android.kt", l = {140, 141}, m = "invokeSuspend")
        public static final class C0857a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ n80 b;
            public final /* synthetic */ cmn c;

            /* JADX INFO: renamed from: m80$a$a$a, reason: collision with other inner class name */
            public static final class C0858a<T> implements myh {
                public final /* synthetic */ cmn a;

                public C0858a(cmn cmnVar) {
                    this.a = cmnVar;
                }

                @Override // defpackage.myh
                public final Object emit(Object obj, v1b v1bVar) {
                    if (Build.VERSION.SDK_INT >= 34) {
                        cmn cmnVar = this.a;
                        im0.a(cmnVar.a(), cmnVar.a);
                    }
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0857a(n80 n80Var, cmn cmnVar, v1b v1bVar) {
                super(2, v1bVar);
                this.b = n80Var;
                this.c = cmnVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C0857a(this.b, this.c, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C0857a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) throws Throwable {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    k80 k80Var = new k80(0);
                    this.a = 1;
                    if (t4w.a(getContext()).P(new s4w(k80Var), this) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            throw l80.a(obj);
                        }
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                }
                vtw<Unit> vtwVarK = this.b.k();
                if (vtwVarK == null) {
                    return Unit.a;
                }
                C0858a c0858a = new C0858a(this.c);
                this.a = 2;
                b390.m((b390) vtwVarK, c0858a, this);
                return y5bVar;
            }
        }

        public /* synthetic */ class b extends saj implements Function1<ddv, Unit> {
            public final /* synthetic */ x5s.a a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(x5s.a aVar) {
                super(1, Intrinsics.a.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
                this.a = aVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(ddv ddvVar) {
                float[] fArr = ddvVar.a;
                urr urrVarQ = this.a.Q();
                if (urrVarQ != null) {
                    if (!urrVarQ.e()) {
                        urrVarQ = null;
                    }
                    if (urrVarQ != null) {
                        urrVarQ.W(fArr);
                    }
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(sk10 sk10Var, Function1<? super p6s, Unit> function1, n80 n80Var, x5s.a aVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = sk10Var;
            this.d = function1;
            this.e = n80Var;
            this.f = aVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, this.d, this.e, this.f, v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<?> v1bVar) {
            ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            return y5b.a;
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            n80 n80Var = this.e;
            try {
                if (i != 0) {
                    if (i != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                    throw new zrp();
                }
                uj50.b(obj);
                v5b v5bVar = (v5b) this.b;
                y5s.a aVar = y5s.a;
                sk10 sk10Var = this.c;
                View view = sk10Var.getView();
                aVar.getClass();
                cmn cmnVar = new cmn(view);
                p6s p6sVar = new p6s(sk10Var.getView(), new b(this.f), cmnVar);
                if (zbe0.a) {
                    ej5.c(v5bVar, null, null, new C0857a(n80Var, cmnVar, null), 3);
                }
                Function1<p6s, Unit> function1 = this.d;
                if (function1 != null) {
                    function1.invoke(p6sVar);
                }
                n80Var.c = p6sVar;
                this.a = 1;
                sk10Var.a(p6sVar, this);
                return y5bVar;
            } catch (Throwable th) {
                n80Var.c = null;
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m80(Function1<? super p6s, Unit> function1, n80 n80Var, x5s.a aVar, v1b<? super m80> v1bVar) {
        super(2, v1bVar);
        this.c = function1;
        this.d = n80Var;
        this.e = aVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        m80 m80Var = new m80(this.c, this.d, this.e, v1bVar);
        m80Var.b = obj;
        return m80Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(sk10 sk10Var, v1b<?> v1bVar) {
        ((m80) create(sk10Var, v1bVar)).invokeSuspend(Unit.a);
        return y5b.a;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            a aVar = new a((sk10) this.b, this.c, this.d, this.e, null);
            this.a = 1;
            if (w5b.d(aVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        fkd.a();
        return null;
    }
}
