package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.animation.core.Animatable$runAnimation$2", f = "Animatable.kt", l = {HttpStatusCodesKt.HTTP_PERM_REDIRECT}, m = "invokeSuspend")
public final class vd0 extends tje0 implements Function1<v1b<? super ui0<Object, mj0>>, Object> {
    public aj0 a;
    public yp40 b;
    public int c;
    public final /* synthetic */ wd0<Object, mj0> d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ mh0<Object, mj0> f;
    public final /* synthetic */ long i;
    public final /* synthetic */ Function1<wd0<Object, mj0>, Unit> v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public vd0(wd0<Object, mj0> wd0Var, Object obj, mh0<Object, mj0> mh0Var, long j, Function1<? super wd0<Object, mj0>, Unit> function1, v1b<? super vd0> v1bVar) {
        super(1, v1bVar);
        this.d = wd0Var;
        this.e = obj;
        this.f = mh0Var;
        this.i = j;
        this.v = function1;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new vd0(this.d, this.e, this.f, this.i, this.v, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super ui0<Object, mj0>> v1bVar) {
        return ((vd0) create(v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        aj0 aj0Var;
        yp40 yp40Var;
        mh0<Object, mj0> mh0Var = this.f;
        final wd0<Object, mj0> wd0Var = this.d;
        aj0<Object, V> aj0Var2 = wd0Var.c;
        y5b y5bVar = y5b.a;
        int i = this.c;
        try {
            if (i == 0) {
                uj50.b(obj);
                aj0Var2.c = (V) wd0Var.a.a().invoke(this.e);
                ((x5a0) wd0Var.e).setValue(mh0Var.g());
                ((x5a0) wd0Var.d).setValue(Boolean.TRUE);
                final aj0 aj0Var3 = new aj0(aj0Var2.a, ((x5a0) aj0Var2.b).getValue(), nj0.a(aj0Var2.c), aj0Var2.d, Long.MIN_VALUE, aj0Var2.f);
                final yp40 yp40Var2 = new yp40();
                long j = this.i;
                final Function1<wd0<Object, mj0>, Unit> function1 = this.v;
                Function1 function2 = new Function1() { // from class: ud0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        vi0 vi0Var = (vi0) obj2;
                        wd0 wd0Var2 = wd0Var;
                        aj0<T, V> aj0Var4 = wd0Var2.c;
                        sje0.i(vi0Var, aj0Var4);
                        x5a0 x5a0Var = (x5a0) vi0Var.e;
                        Object objB = wd0Var2.b(x5a0Var.getValue());
                        boolean zG = Intrinsics.g(objB, x5a0Var.getValue());
                        Function1 function3 = function1;
                        if (!zG) {
                            ((x5a0) aj0Var4.b).setValue(objB);
                            ((x5a0) aj0Var3.b).setValue(objB);
                            if (function3 != null) {
                                function3.invoke(wd0Var2);
                            }
                            vi0Var.a();
                            yp40Var2.a = true;
                        } else if (function3 != null) {
                            function3.invoke(wd0Var2);
                        }
                        return Unit.a;
                    }
                };
                this.a = aj0Var3;
                this.b = yp40Var2;
                this.c = 1;
                if (sje0.b(aj0Var3, mh0Var, j, function2, this) == y5bVar) {
                    return y5bVar;
                }
                aj0Var = aj0Var3;
                yp40Var = yp40Var2;
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                yp40Var = this.b;
                aj0Var = this.a;
                uj50.b(obj);
            }
            ph0 ph0Var = yp40Var.a ? ph0.a : ph0.b;
            wd0Var.c();
            return new ui0(aj0Var, ph0Var);
        } catch (CancellationException e) {
            wd0Var.c();
            throw e;
        }
    }
}
