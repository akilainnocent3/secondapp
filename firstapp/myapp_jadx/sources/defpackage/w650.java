package defpackage;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1", f = "RemoteMediatorAccessor.kt", l = {314}, m = "invokeSuspend")
public final class w650 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public yp40 a;
    public int b;
    public final /* synthetic */ s650<Object, Object> c;

    @c0d(c = "androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1$1", f = "RemoteMediatorAccessor.kt", l = {321}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function1<v1b<? super Unit>, Object> {
        public s650 a;
        public yp40 b;
        public int c;
        public final /* synthetic */ s650<Object, Object> d;
        public final /* synthetic */ yp40 e;

        /* JADX INFO: renamed from: w650$a$a, reason: collision with other inner class name */
        public static final class C1239a extends qlr implements Function1<m7<Object, Object>, Boolean> {
            public final /* synthetic */ r650.b.C1034b a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1239a(r650.b.C1034b c1034b) {
                super(1);
                this.a = c1034b;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(m7<Object, Object> m7Var) {
                m7<Object, Object> m7Var2 = m7Var;
                m7Var2.getClass();
                kxs kxsVar = kxs.a;
                m7Var2.a(kxsVar);
                boolean z = this.a.a;
                kxs kxsVar2 = kxs.c;
                kxs kxsVar3 = kxs.b;
                if (z) {
                    m7.a aVar = m7.a.b;
                    m7Var2.d(kxsVar, aVar);
                    m7Var2.d(kxsVar3, aVar);
                    m7Var2.d(kxsVar2, aVar);
                    m7Var2.c.clear();
                } else {
                    m7.a aVar2 = m7.a.a;
                    m7Var2.d(kxsVar3, aVar2);
                    m7Var2.d(kxsVar2, aVar2);
                }
                m7Var2.e(kxsVar3, null);
                m7Var2.e(kxsVar2, null);
                return Boolean.valueOf(m7Var2.c() != null);
            }
        }

        public static final class b extends qlr implements Function1<m7<Object, Object>, Boolean> {
            public final /* synthetic */ r650.b.a a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(r650.b.a aVar) {
                super(1);
                this.a = aVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(m7<Object, Object> m7Var) {
                m7<Object, Object> m7Var2 = m7Var;
                m7Var2.getClass();
                kxs kxsVar = kxs.a;
                m7Var2.a(kxsVar);
                m7Var2.e(kxsVar, new hxs.a(this.a.a));
                return Boolean.valueOf(m7Var2.c() != null);
            }
        }

        public static final class c extends qlr implements Function1<m7<Object, Object>, xqz<Object, Object>> {
            public static final c a = new c(1);

            @Override // kotlin.jvm.functions.Function1
            public final xqz<Object, Object> invoke(m7<Object, Object> m7Var) {
                m7.b<Object, Object> next;
                m7<Object, Object> m7Var2 = m7Var;
                m7Var2.getClass();
                Iterator<m7.b<Object, Object>> it = m7Var2.c.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (next.a != kxs.a);
                m7.b<Object, Object> bVar = next;
                if (bVar != null) {
                    return bVar.b;
                }
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s650<Object, Object> s650Var, yp40 yp40Var, v1b<? super a> v1bVar) {
            super(1, v1bVar);
            this.d = s650Var;
            this.e = yp40Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(v1b<?> v1bVar) {
            return new a(this.d, this.e, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(v1b<? super Unit> v1bVar) {
            return ((a) create(v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            s650<Object, Object> s650Var;
            yp40 yp40Var;
            boolean zBooleanValue;
            y5b y5bVar = y5b.a;
            int i = this.c;
            if (i == 0) {
                uj50.b(obj);
                s650<Object, Object> s650Var2 = this.d;
                xqz xqzVar = (xqz) s650Var2.c.a(c.a);
                if (xqzVar != null) {
                    r650<Object, Object> r650Var = s650Var2.b;
                    this.a = s650Var2;
                    yp40 yp40Var2 = this.e;
                    this.b = yp40Var2;
                    this.c = 1;
                    Object objB = r650Var.b(kxs.a, xqzVar, this);
                    if (objB == y5bVar) {
                        return y5bVar;
                    }
                    obj = objB;
                    s650Var = s650Var2;
                    yp40Var = yp40Var2;
                }
                return Unit.a;
            }
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            yp40Var = this.b;
            s650Var = this.a;
            uj50.b(obj);
            r650.b bVar = (r650.b) obj;
            if (bVar instanceof r650.b.C1034b) {
                zBooleanValue = ((Boolean) s650Var.c.a(new C1239a((r650.b.C1034b) bVar))).booleanValue();
            } else {
                if (!(bVar instanceof r650.b.a)) {
                    uhc.a();
                    return null;
                }
                zBooleanValue = ((Boolean) s650Var.c.a(new b((r650.b.a) bVar))).booleanValue();
            }
            yp40Var.a = zBooleanValue;
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w650(s650<Object, Object> s650Var, v1b<? super w650> v1bVar) {
        super(2, v1bVar);
        this.c = s650Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new w650(this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((w650) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        yp40 yp40Var;
        y5b y5bVar = y5b.a;
        int i = this.b;
        s650<Object, Object> s650Var = this.c;
        if (i == 0) {
            uj50.b(obj);
            yp40 yp40Var2 = new yp40();
            uv90 uv90Var = s650Var.d;
            a aVar = new a(s650Var, yp40Var2, null);
            this.a = yp40Var2;
            this.b = 1;
            if (uv90Var.a(2, aVar, this) == y5bVar) {
                return y5bVar;
            }
            yp40Var = yp40Var2;
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            yp40Var = this.a;
            uj50.b(obj);
        }
        if (yp40Var.a) {
            ej5.c(s650Var.a, null, null, new v650(s650Var, null), 3);
        }
        return Unit.a;
    }
}
