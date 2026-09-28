package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ta5 implements r4w {
    public final kn00 a;
    public Throwable c;
    public final Object b = new Object();
    public final u11 d = new u11(0);
    public etw<a<?>> e = new etw<>((Object) null);
    public etw<a<?>> f = new etw<>((Object) null);

    public static final class a<R> {
        public Function1<? super Long, ? extends R> a;
        public bc6 b;

        public a() {
            throw null;
        }
    }

    public static final class b implements Function1<Throwable, Unit> {
        public final /* synthetic */ a<R> a;
        public final /* synthetic */ ta5 b;
        public final /* synthetic */ bq40 c;

        public b(a<R> aVar, ta5 ta5Var, bq40 bq40Var) {
            this.a = aVar;
            this.b = ta5Var;
            this.c = bq40Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th) {
            int i;
            a<R> aVar = this.a;
            aVar.a = null;
            aVar.b = null;
            u11 u11Var = this.b.d;
            int i2 = this.c.a;
            do {
                i = u11Var.get();
            } while (!u11Var.compareAndSet(i, ((i >>> 27) & 15) == i2 ? i - 1 : i));
            return Unit.a;
        }
    }

    public ta5(kn00 kn00Var) {
        this.a = kn00Var;
    }

    @Override // defpackage.r4w
    public final <R> Object P(Function1<? super Long, ? extends R> function1, v1b<? super R> v1bVar) throws Throwable {
        int i;
        int i2;
        int i3;
        bc6 bc6Var = new bc6(1, yzo.b(v1bVar));
        bc6Var.q();
        a aVar = new a();
        aVar.a = function1;
        aVar.b = bc6Var;
        bq40 bq40Var = new bq40();
        bq40Var.a = -1;
        synchronized (this.b) {
            Throwable th = this.c;
            if (th != null) {
                zi50.a aVar2 = zi50.b;
                bc6Var.resumeWith(new zi50.b(th));
            } else {
                u11 u11Var = this.d;
                do {
                    i = u11Var.get();
                    i2 = i + 1;
                } while (!u11Var.compareAndSet(i, i2));
                boolean z = (134217727 & i2) == 1;
                bq40Var.a = (i2 >>> 27) & 15;
                this.e.g(aVar);
                bc6Var.t(new b(aVar, this, bq40Var));
                if (z) {
                    try {
                        this.a.invoke();
                    } catch (Throwable th2) {
                        synchronized (this.b) {
                            try {
                                if (this.c == null) {
                                    this.c = th2;
                                    etw<a<?>> etwVar = this.e;
                                    Object[] objArr = etwVar.a;
                                    int i4 = etwVar.b;
                                    for (int i5 = 0; i5 < i4; i5++) {
                                        bc6 bc6Var2 = ((a) objArr[i5]).b;
                                        if (bc6Var2 != null) {
                                            zi50.a aVar3 = zi50.b;
                                            bc6Var2.resumeWith(new zi50.b(th2));
                                        }
                                    }
                                    this.e.i();
                                    u11 u11Var2 = this.d;
                                    do {
                                        i3 = u11Var2.get();
                                    } while (!u11Var2.compareAndSet(i3, ((((i3 >>> 27) & 15) + 1) & 15) << 27));
                                    Unit unit = Unit.a;
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                }
            }
        }
        Object objO = bc6Var.o();
        y5b y5bVar = y5b.a;
        return objO;
    }

    public final void a(long j) {
        int i;
        bc6 bc6Var;
        Object bVar;
        synchronized (this.b) {
            try {
                etw<a<?>> etwVar = this.e;
                this.e = this.f;
                this.f = etwVar;
                u11 u11Var = this.d;
                do {
                    i = u11Var.get();
                } while (!u11Var.compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
                int i2 = etwVar.b;
                for (int i3 = 0; i3 < i2; i3++) {
                    a<?> aVarB = etwVar.b(i3);
                    Function1<? super Long, ? extends Object> function1 = aVarB.a;
                    if (function1 != null && (bc6Var = aVarB.b) != null) {
                        try {
                            zi50.a aVar = zi50.b;
                            bVar = function1.invoke(Long.valueOf(j));
                        } catch (Throwable th) {
                            zi50.a aVar2 = zi50.b;
                            bVar = new zi50.b(th);
                        }
                        bc6Var.resumeWith(bVar);
                    }
                }
                etwVar.i();
                Unit unit = Unit.a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return function2.invoke(r, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final <E extends CoroutineContext.Element> E get(CoroutineContext.a<E> aVar) {
        return (E) CoroutineContext.Element.a.b(this, aVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(CoroutineContext.a<?> aVar) {
        return CoroutineContext.Element.a.c(this, aVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.Element.a.d(this, coroutineContext);
    }
}
