package defpackage;

import android.net.Uri;
import android.view.InputEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public abstract class kiv {

    /* JADX INFO: loaded from: classes.dex */
    public static final class a extends kiv {
        public final y3l a;

        /* JADX INFO: renamed from: kiv$a$a, reason: collision with other inner class name */
        @c0d(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$getMeasurementApiStatusAsync$1", f = "MeasurementManagerFutures.kt", l = {190}, m = "invokeSuspend")
        public static final class C0765a extends tje0 implements Function2<v5b, v1b<? super Integer>, Object> {
            public int a;

            public C0765a(v1b<? super C0765a> v1bVar) {
                super(2, v1bVar);
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return a.this.new C0765a(v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Integer> v1bVar) {
                return ((C0765a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i != 0) {
                    if (i == 1) {
                        uj50.b(obj);
                        return obj;
                    }
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                y3l y3lVar = a.this.a;
                this.a = 1;
                Object objI = y3lVar.i(this);
                return objI == y5bVar ? y5bVar : objI;
            }
        }

        @c0d(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerSourceAsync$1", f = "MeasurementManagerFutures.kt", l = {143}, m = "invokeSuspend")
        public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ Uri c;
            public final /* synthetic */ InputEvent d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Uri uri, InputEvent inputEvent, v1b<? super b> v1bVar) {
                super(2, v1bVar);
                this.c = uri;
                this.d = inputEvent;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return a.this.new b(this.c, this.d, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    y3l y3lVar = a.this.a;
                    this.a = 1;
                    if (y3lVar.r(this.c, this.d, this) == y5bVar) {
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

        @c0d(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerSourceAsync$2", f = "MeasurementManagerFutures.kt", l = {154}, m = "invokeSuspend")
        public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;

            public c(hqa0 hqa0Var, v1b<? super c> v1bVar) {
                super(2, v1bVar);
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return a.this.new c(null, v1bVar);
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
                    y3l y3lVar = a.this.a;
                    this.a = 1;
                    if (y3lVar.q(null, this) == y5bVar) {
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

        @c0d(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerTriggerAsync$1", f = "MeasurementManagerFutures.kt", l = {162}, m = "invokeSuspend")
        public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ Uri c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Uri uri, v1b<? super d> v1bVar) {
                super(2, v1bVar);
                this.c = uri;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return a.this.new d(this.c, v1bVar);
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
                    y3l y3lVar = a.this.a;
                    this.a = 1;
                    if (y3lVar.s(this.c, this) == y5bVar) {
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

        public a(y3l y3lVar) {
            this.a = y3lVar;
        }

        @Override // defpackage.kiv
        public qis<Integer> a() {
            return b5b.a(ej5.a(w5b.a(fse.a), null, new C0765a(null), 3));
        }

        @Override // defpackage.kiv
        public qis<Unit> b(Uri uri) {
            uri.getClass();
            return b5b.a(ej5.a(w5b.a(fse.a), null, new d(uri, null), 3));
        }

        public qis<Unit> c(gmd gmdVar) {
            throw null;
        }

        public qis<Unit> d(hqa0 hqa0Var) {
            hqa0Var.getClass();
            return b5b.a(ej5.a(w5b.a(fse.a), null, new c(hqa0Var, null), 3));
        }

        public qis<Unit> e(Uri uri, InputEvent inputEvent) {
            uri.getClass();
            return b5b.a(ej5.a(w5b.a(fse.a), null, new b(uri, inputEvent, null), 3));
        }

        public qis<Unit> f(yyi0 yyi0Var) {
            throw null;
        }

        public qis<Unit> g(zyi0 zyi0Var) {
            throw null;
        }
    }

    public abstract qis<Integer> a();

    public abstract qis<Unit> b(Uri uri);
}
