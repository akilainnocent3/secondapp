package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class s0i {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class a<T> implements myh<T> {
        public final /* synthetic */ dq40 a;

        public a(dq40 dq40Var) {
            this.a = dq40Var;
        }

        @Override // defpackage.myh
        public final Object emit(T t, v1b<? super Unit> v1bVar) {
            this.a.a = t;
            throw new t1(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class b<T> implements myh<T> {
        public final /* synthetic */ Function2 a;
        public final /* synthetic */ dq40 b;

        @c0d(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2", f = "Reduce.kt", l = {132}, m = "emit")
        public static final class a extends x1b {
            public b a;
            public /* synthetic */ Object b;
            public int c;
            public Object e;

            public a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.b = obj;
                this.c |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        public b(Function2 function2, dq40 dq40Var) {
            this.a = function2;
            this.b = dq40Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.myh
        public final Object emit(T t, v1b<? super Unit> v1bVar) {
            a aVar;
            if (v1bVar instanceof a) {
                aVar = (a) v1bVar;
                int i = aVar.c;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.c = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(v1bVar);
                }
            } else {
                aVar = new a(v1bVar);
            }
            Object objInvoke = aVar.b;
            y5b y5bVar = y5b.a;
            int i2 = aVar.c;
            if (i2 == 0) {
                uj50.b(objInvoke);
                aVar.a = this;
                aVar.e = t;
                aVar.c = 1;
                objInvoke = this.a.invoke(t, aVar);
                if (objInvoke == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                t = (T) aVar.e;
                this = aVar.a;
                uj50.b(objInvoke);
            }
            if (!((Boolean) objInvoke).booleanValue()) {
                return Unit.a;
            }
            this.b.a = t;
            throw new t1(this);
        }
    }

    @c0d(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {179}, m = "first")
    public static final class c<T> extends x1b {
        public dq40 a;
        public a b;
        public /* synthetic */ Object c;
        public int d;

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.d |= Integer.MIN_VALUE;
            return s0i.a(null, this);
        }
    }

    @c0d(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {179}, m = "first")
    public static final class d<T> extends x1b {
        public dq40 a;
        public b b;
        public /* synthetic */ Object c;
        public int d;

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.d |= Integer.MIN_VALUE;
            return s0i.b(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class e<T> implements myh<T> {
        public final /* synthetic */ dq40 a;

        public e(dq40 dq40Var) {
            this.a = dq40Var;
        }

        @Override // defpackage.myh
        public final Object emit(T t, v1b<? super Unit> v1bVar) {
            this.a.a = t;
            throw new t1(this);
        }
    }

    @c0d(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {179}, m = "firstOrNull")
    public static final class f<T> extends x1b {
        public dq40 a;
        public e b;
        public /* synthetic */ Object c;
        public int d;

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.d |= Integer.MIN_VALUE;
            return s0i.c(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x006a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object a(lyh<? extends T> lyhVar, v1b<? super T> v1bVar) {
        c cVar;
        dq40 dq40Var;
        t1 e2;
        a aVar;
        if (v1bVar instanceof c) {
            cVar = (c) v1bVar;
            int i = cVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar.d = i - Integer.MIN_VALUE;
            } else {
                cVar = new c(v1bVar);
            }
        } else {
            cVar = new c(v1bVar);
        }
        Object obj = cVar.c;
        y5b y5bVar = y5b.a;
        int i2 = cVar.d;
        T t = (T) k5y.a;
        if (i2 == 0) {
            dq40 dq40VarA = j6w.a(obj);
            dq40VarA.a = t;
            a aVar2 = new a(dq40VarA);
            try {
                cVar.a = dq40VarA;
                cVar.b = aVar2;
                cVar.d = 1;
                if (lyhVar.collect(aVar2, cVar) == y5bVar) {
                    return y5bVar;
                }
                dq40Var = dq40VarA;
            } catch (t1 e3) {
                dq40Var = dq40VarA;
                e2 = e3;
                aVar = aVar2;
                if (e2.a == aVar) {
                    throw e2;
                }
                i9p.e(cVar.getContext());
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar = cVar.b;
            dq40Var = cVar.a;
            try {
                uj50.b(obj);
            } catch (t1 e4) {
                e2 = e4;
                if (e2.a == aVar) {
                    throw e2;
                }
                i9p.e(cVar.getContext());
            }
        }
        T t2 = dq40Var.a;
        if (t2 != t) {
            return t2;
        }
        ibh0.a("Expected at least one element");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x006a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object b(lyh<? extends T> lyhVar, Function2<? super T, ? super v1b<? super Boolean>, ? extends Object> function2, v1b<? super T> v1bVar) {
        d dVar;
        dq40 dq40Var;
        t1 e2;
        b bVar;
        if (v1bVar instanceof d) {
            dVar = (d) v1bVar;
            int i = dVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                dVar.d = i - Integer.MIN_VALUE;
            } else {
                dVar = new d(v1bVar);
            }
        } else {
            dVar = new d(v1bVar);
        }
        Object obj = dVar.c;
        y5b y5bVar = y5b.a;
        int i2 = dVar.d;
        T t = (T) k5y.a;
        if (i2 == 0) {
            dq40 dq40VarA = j6w.a(obj);
            dq40VarA.a = t;
            b bVar2 = new b(function2, dq40VarA);
            try {
                dVar.a = dq40VarA;
                dVar.b = bVar2;
                dVar.d = 1;
                if (lyhVar.collect(bVar2, dVar) == y5bVar) {
                    return y5bVar;
                }
                dq40Var = dq40VarA;
            } catch (t1 e3) {
                dq40Var = dq40VarA;
                e2 = e3;
                bVar = bVar2;
                if (e2.a == bVar) {
                    throw e2;
                }
                i9p.e(dVar.getContext());
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVar = dVar.b;
            dq40Var = dVar.a;
            try {
                uj50.b(obj);
            } catch (t1 e4) {
                e2 = e4;
                if (e2.a == bVar) {
                    throw e2;
                }
                i9p.e(dVar.getContext());
            }
        }
        T t2 = dq40Var.a;
        if (t2 != t) {
            return t2;
        }
        ibh0.a("Expected at least one element matching the predicate");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object c(lyh<? extends T> lyhVar, v1b<? super T> v1bVar) {
        f fVar;
        dq40 dq40Var;
        t1 e2;
        e eVar;
        if (v1bVar instanceof f) {
            fVar = (f) v1bVar;
            int i = fVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                fVar.d = i - Integer.MIN_VALUE;
            } else {
                fVar = new f(v1bVar);
            }
        } else {
            fVar = new f(v1bVar);
        }
        Object obj = fVar.c;
        y5b y5bVar = y5b.a;
        int i2 = fVar.d;
        if (i2 == 0) {
            dq40 dq40VarA = j6w.a(obj);
            e eVar2 = new e(dq40VarA);
            try {
                fVar.a = dq40VarA;
                fVar.b = eVar2;
                fVar.d = 1;
                if (lyhVar.collect(eVar2, fVar) == y5bVar) {
                    return y5bVar;
                }
                dq40Var = dq40VarA;
            } catch (t1 e3) {
                dq40Var = dq40VarA;
                e2 = e3;
                eVar = eVar2;
                if (e2.a == eVar) {
                    throw e2;
                }
                i9p.e(fVar.getContext());
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            eVar = fVar.b;
            dq40Var = fVar.a;
            try {
                uj50.b(obj);
            } catch (t1 e4) {
                e2 = e4;
                if (e2.a == eVar) {
                    throw e2;
                }
                i9p.e(fVar.getContext());
            }
        }
        return dq40Var.a;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object d(lyh lyhVar, Function2 function2, x1b x1bVar) {
        u0i u0iVar;
        dq40 dq40Var;
        t1 e2;
        t0i t0iVar;
        if (x1bVar instanceof u0i) {
            u0iVar = (u0i) x1bVar;
            int i = u0iVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                u0iVar.d = i - Integer.MIN_VALUE;
            } else {
                u0iVar = new u0i(x1bVar);
            }
        } else {
            u0iVar = new u0i(x1bVar);
        }
        Object obj = u0iVar.c;
        Object obj2 = y5b.a;
        int i2 = u0iVar.d;
        if (i2 == 0) {
            dq40 dq40VarA = j6w.a(obj);
            t0i t0iVar2 = new t0i(function2, dq40VarA);
            try {
                u0iVar.a = dq40VarA;
                u0iVar.b = t0iVar2;
                u0iVar.d = 1;
                if (lyhVar.collect(t0iVar2, u0iVar) == obj2) {
                    return obj2;
                }
                dq40Var = dq40VarA;
            } catch (t1 e3) {
                dq40Var = dq40VarA;
                e2 = e3;
                t0iVar = t0iVar2;
                if (e2.a == t0iVar) {
                    throw e2;
                }
                i9p.e(u0iVar.getContext());
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            t0iVar = u0iVar.b;
            dq40Var = u0iVar.a;
            try {
                uj50.b(obj);
            } catch (t1 e4) {
                e2 = e4;
                if (e2.a == t0iVar) {
                    throw e2;
                }
                i9p.e(u0iVar.getContext());
            }
        }
        return dq40Var.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object e(lyh lyhVar, x1b x1bVar) {
        v0i v0iVar;
        dq40 dq40Var;
        if (x1bVar instanceof v0i) {
            v0iVar = (v0i) x1bVar;
            int i = v0iVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                v0iVar.c = i - Integer.MIN_VALUE;
            } else {
                v0iVar = new v0i(x1bVar);
            }
        } else {
            v0iVar = new v0i(x1bVar);
        }
        Object obj = v0iVar.b;
        Object obj2 = y5b.a;
        int i2 = v0iVar.c;
        if (i2 == 0) {
            dq40 dq40VarA = j6w.a(obj);
            w0i w0iVar = new w0i(dq40VarA);
            v0iVar.a = dq40VarA;
            v0iVar.c = 1;
            if (lyhVar.collect(w0iVar, v0iVar) == obj2) {
                return obj2;
            }
            dq40Var = dq40VarA;
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dq40Var = v0iVar.a;
            uj50.b(obj);
        }
        return dq40Var.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v0, types: [T, toe0] */
    public static final Object f(lyh lyhVar, x1b x1bVar) {
        x0i x0iVar;
        dq40 dq40Var;
        if (x1bVar instanceof x0i) {
            x0iVar = (x0i) x1bVar;
            int i = x0iVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                x0iVar.c = i - Integer.MIN_VALUE;
            } else {
                x0iVar = new x0i(x1bVar);
            }
        } else {
            x0iVar = new x0i(x1bVar);
        }
        Object obj = x0iVar.b;
        Object obj2 = y5b.a;
        int i2 = x0iVar.c;
        ?? r4 = k5y.a;
        if (i2 == 0) {
            dq40 dq40VarA = j6w.a(obj);
            dq40VarA.a = r4;
            y0i y0iVar = new y0i(dq40VarA);
            x0iVar.a = dq40VarA;
            x0iVar.c = 1;
            if (lyhVar.collect(y0iVar, x0iVar) == obj2) {
                return obj2;
            }
            dq40Var = dq40VarA;
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dq40Var = x0iVar.a;
            uj50.b(obj);
        }
        T t = dq40Var.a;
        if (t != r4) {
            return t;
        }
        ibh0.a("Flow is empty");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v0, types: [T, toe0] */
    public static final Object g(or60 or60Var, x1b x1bVar) {
        a1i a1iVar;
        dq40 dq40Var;
        t1 e2;
        z0i z0iVar;
        if (x1bVar instanceof a1i) {
            a1iVar = (a1i) x1bVar;
            int i = a1iVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                a1iVar.d = i - Integer.MIN_VALUE;
            } else {
                a1iVar = new a1i(x1bVar);
            }
        } else {
            a1iVar = new a1i(x1bVar);
        }
        Object obj = a1iVar.c;
        Object obj2 = y5b.a;
        int i2 = a1iVar.d;
        ?? r4 = k5y.a;
        if (i2 == 0) {
            dq40 dq40VarA = j6w.a(obj);
            dq40VarA.a = r4;
            z0i z0iVar2 = new z0i(dq40VarA);
            try {
                a1iVar.a = dq40VarA;
                a1iVar.b = z0iVar2;
                a1iVar.d = 1;
                if (or60Var.collect(z0iVar2, a1iVar) == obj2) {
                    return obj2;
                }
                dq40Var = dq40VarA;
            } catch (t1 e3) {
                dq40Var = dq40VarA;
                e2 = e3;
                z0iVar = z0iVar2;
                if (e2.a == z0iVar) {
                    throw e2;
                }
                i9p.e(a1iVar.getContext());
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z0iVar = a1iVar.b;
            dq40Var = a1iVar.a;
            try {
                uj50.b(obj);
            } catch (t1 e4) {
                e2 = e4;
                if (e2.a == z0iVar) {
                    throw e2;
                }
                i9p.e(a1iVar.getContext());
            }
        }
        T t = dq40Var.a;
        if (t == r4) {
            return null;
        }
        return t;
    }
}
