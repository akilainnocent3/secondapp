package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class zjs<T> implements yjs<T> {
    public final r5b<T> a;
    public final CoroutineContext b;

    @c0d(c = "androidx.lifecycle.LiveDataScopeImpl$emit$2", f = "CoroutineLiveData.kt", l = {98}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ zjs<T> b;
        public final /* synthetic */ T c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(zjs<T> zjsVar, T t, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = zjsVar;
            this.c = t;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            r5b<T> r5bVar = this.b.a;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (r5bVar.o(this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            r5bVar.m(this.c);
            return Unit.a;
        }
    }

    public zjs(r5b<T> r5bVar, CoroutineContext coroutineContext) {
        coroutineContext.getClass();
        this.a = r5bVar;
        pfd pfdVar = fse.a;
        this.b = coroutineContext.plus(gku.a.h0());
    }

    @Override // defpackage.yjs
    public final Object emit(T t, v1b<? super Unit> v1bVar) {
        Object objD = ej5.d(this.b, new a(this, t, null), v1bVar);
        return objD == y5b.a ? objD : Unit.a;
    }
}
