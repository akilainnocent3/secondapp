package defpackage;

import androidx.work.c;
import androidx.work.d;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.work.impl.WorkerWrapper$launch$1", f = "WorkerWrapper.kt", l = {98}, m = "invokeSuspend")
public final class cyj0 extends tje0 implements Function2<v5b, v1b<? super Boolean>, Object> {
    public int a;
    public final /* synthetic */ ayj0 b;

    @c0d(c = "androidx.work.impl.WorkerWrapper$launch$1$resolution$1", f = "WorkerWrapper.kt", l = {98}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<? super ayj0.b>, Object> {
        public int a;
        public final /* synthetic */ ayj0 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ayj0 ayj0Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = ayj0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super ayj0.b> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                Object objC = this.b.c(this);
                return objC == y5bVar ? y5bVar : objC;
            }
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyj0(ayj0 ayj0Var, v1b<? super cyj0> v1bVar) {
        super(2, v1bVar);
        this.b = ayj0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new cyj0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Boolean> v1bVar) {
        return ((cyj0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        final ayj0.b aVar;
        y5b y5bVar = y5b.a;
        int i = this.a;
        final ayj0 ayj0Var = this.b;
        int i2 = 1;
        try {
            if (i == 0) {
                uj50.b(obj);
                e9p e9pVar = ayj0Var.l;
                a aVar2 = new a(ayj0Var, null);
                this.a = 1;
                obj = ej5.d(e9pVar, aVar2, this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            aVar = (ayj0.b) obj;
        } catch (xxj0 e) {
            aVar = new ayj0.b.c(e.a);
        } catch (CancellationException unused) {
            aVar = new ayj0.b.a(0);
        } catch (Throwable th) {
            jgt.e().d(gyj0.a, "Unexpected error in WorkerWrapper", th);
            aVar = new ayj0.b.a(0);
        }
        Object objU = ayj0Var.g.u(new x1j(new Callable() { // from class: byj0
            /* JADX WARN: Code duplicated, block: B:6:0x0023  */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ayj0 ayj0Var2 = ayj0Var;
                String str = ayj0Var2.c;
                pwj0 pwj0Var = ayj0Var2.h;
                ayj0.b bVar = aVar;
                boolean z = bVar instanceof ayj0.b.C0105b;
                jvj0 jvj0Var = jvj0.a;
                boolean z2 = true;
                boolean z3 = false;
                if (z) {
                    d.a c0078a = ((ayj0.b.C0105b) bVar).a;
                    jvj0 jvj0VarI = pwj0Var.i(str);
                    ayj0Var2.g.B().a(str);
                    if (jvj0VarI == null) {
                        z2 = false;
                    } else if (jvj0VarI == jvj0.b) {
                        owj0 owj0Var = ayj0Var2.a;
                        String str2 = ayj0Var2.k;
                        if (c0078a instanceof d.a.c) {
                            jgt.e().f(gyj0.a, "Worker result SUCCESS for ".concat(str2));
                            if (owj0Var.d()) {
                                ayj0Var2.b();
                            } else {
                                pwj0Var.e(jvj0.c, str);
                                c cVar = ((d.a.c) c0078a).a;
                                cVar.getClass();
                                pwj0Var.s(str, cVar);
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                umd umdVar = ayj0Var2.i;
                                ArrayList arrayListA = umdVar.a(str);
                                int size = arrayListA.size();
                                int i3 = 0;
                                while (i3 < size) {
                                    Object obj2 = arrayListA.get(i3);
                                    i3++;
                                    String str3 = (String) obj2;
                                    if (pwj0Var.i(str3) == jvj0.e && umdVar.b(str3)) {
                                        jgt.e().f(gyj0.a, "Setting status to enqueued for ".concat(str3));
                                        pwj0Var.e(jvj0Var, str3);
                                        pwj0Var.r(jCurrentTimeMillis, str3);
                                    }
                                }
                            }
                        } else if (c0078a instanceof d.a.b) {
                            jgt.e().f(gyj0.a, "Worker result RETRY for ".concat(str2));
                            ayj0Var2.a(-256);
                        } else {
                            jgt.e().f(gyj0.a, "Worker result FAILURE for ".concat(str2));
                            if (owj0Var.d()) {
                                ayj0Var2.b();
                            } else {
                                if (c0078a == null) {
                                    c0078a = new d.a.C0078a();
                                }
                                ayj0Var2.d(c0078a);
                            }
                        }
                        z2 = false;
                    } else if (jvj0VarI.a()) {
                        z2 = false;
                    } else {
                        ayj0Var2.a(-512);
                    }
                    z3 = z2;
                } else if (bVar instanceof ayj0.b.a) {
                    ayj0Var2.d(((ayj0.b.a) bVar).a);
                } else {
                    if (!(bVar instanceof ayj0.b.c)) {
                        uhc.a();
                        return null;
                    }
                    int i4 = ((ayj0.b.c) bVar).a;
                    jvj0 jvj0VarI2 = pwj0Var.i(str);
                    if (jvj0VarI2 == null || jvj0VarI2.a()) {
                        String str4 = gyj0.a;
                        jgt.e().a(str4, "Status for " + str + " is " + jvj0VarI2 + " ; not doing any work");
                        z2 = false;
                    } else {
                        String str5 = gyj0.a;
                        jgt.e().a(str5, "Status for " + str + " is " + jvj0VarI2 + "; not doing any work and rescheduling for later execution");
                        pwj0Var.e(jvj0Var, str);
                        pwj0Var.u(i4, str);
                        pwj0Var.c(-1L, str);
                    }
                    z3 = z2;
                }
                return Boolean.valueOf(z3);
            }
        }, i2));
        objU.getClass();
        return objU;
    }
}
