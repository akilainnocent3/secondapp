package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class brs<Key, Value> extends njs<znz<Value>> {
    public final v5b l;
    public final znz.c m;
    public final Function0<wqz<Key, Value>> n;
    public final k5b o;
    public final k5b p;
    public znz<Value> q;
    public jvd0 r;
    public final ars s;

    @c0d(c = "androidx.paging.LivePagedList$invalidate$1", f = "LivePagedList.kt", l = {82, 90}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public wqz a;
        public Object b;
        public int c;
        public final /* synthetic */ brs<Key, Value> d;

        /* JADX INFO: renamed from: brs$a$a, reason: collision with other inner class name */
        @c0d(c = "androidx.paging.LivePagedList$invalidate$1$1", f = "LivePagedList.kt", l = {}, m = "invokeSuspend")
        public static final class C0141a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public final /* synthetic */ brs<Key, Value> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0141a(brs<Key, Value> brsVar, v1b<? super C0141a> v1bVar) {
                super(2, v1bVar);
                this.a = brsVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C0141a(this.a, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C0141a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                this.a.q.m(hxs.b.b);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(brs<Key, Value> brsVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.d = brsVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0098  */
        /* JADX WARN: Code duplicated, block: B:23:0x00a7  */
        /* JADX WARN: Code duplicated, block: B:25:0x00ab  */
        /* JADX WARN: Code duplicated, block: B:26:0x00ba  */
        /* JADX WARN: Code duplicated, block: B:28:0x00be  */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            wqz<Key, Value> wqzVarInvoke;
            wqz<Key, Value> wqzVar;
            Object obj2;
            wqz.b bVar;
            brs<Key, Value> brsVar = this.d;
            znz.c cVar = brsVar.m;
            ars arsVar = brsVar.s;
            y5b y5bVar = y5b.a;
            int i = this.c;
            if (i == 0) {
                uj50.b(obj);
                wqz<?, Value> wqzVarE = brsVar.q.e();
                wqzVarE.getClass();
                arsVar.getClass();
                wqzVarE.a.c(arsVar);
                wqzVarInvoke = brsVar.n.invoke();
                wqzVarInvoke.getClass();
                arsVar.getClass();
                wqzVarInvoke.a.b(arsVar);
                if (wqzVarInvoke instanceof u5s) {
                    ((u5s) wqzVarInvoke).a(cVar.a);
                }
                k5b k5bVar = brsVar.o;
                C0141a c0141a = new C0141a(brsVar, null);
                this.a = wqzVarInvoke;
                this.c = 1;
                if (ej5.d(k5bVar, c0141a, this) != y5bVar) {
                }
                return y5bVar;
            }
            if (i == 1) {
                wqz<Key, Value> wqzVar2 = this.a;
                uj50.b(obj);
                wqzVarInvoke = wqzVar2;
            } else {
                if (i != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Object obj3 = this.b;
                wqz<Key, Value> wqzVar3 = this.a;
                uj50.b(obj);
                wqzVar = wqzVar3;
                obj2 = obj3;
            }
            bVar = (wqz.b) obj;
            if (bVar instanceof wqz.b.C1263b) {
                brsVar.q.m(new hxs.c(false));
                wqzVar.c();
            } else if (bVar instanceof wqz.b.a) {
                brsVar.q.m(new hxs.a(((wqz.b.a) bVar).a));
            } else if (bVar instanceof wqz.b.c) {
                int i2 = znz.w;
                v5b v5bVar = brsVar.l;
                u1b u1bVarA = znz.b.a(brsVar.o, brsVar.p, v5bVar, brsVar.m, (wqz.b.c) bVar, wqzVar, obj2);
                brsVar.q.getClass();
                brsVar.q = u1bVarA;
                brsVar.j(u1bVarA);
            }
            return Unit.a;
            Object objD = brsVar.q.d();
            cVar.getClass();
            wqz.a.c cVar2 = new wqz.a.c(cVar.d, objD, cVar.c);
            this.a = wqzVarInvoke;
            this.b = objD;
            this.c = 2;
            Object objD2 = wqzVarInvoke.d(cVar2, this);
            if (objD2 != y5bVar) {
                wqzVar = wqzVarInvoke;
                obj2 = objD;
                obj = objD2;
                bVar = (wqz.b) obj;
                if (bVar instanceof wqz.b.C1263b) {
                    brsVar.q.m(new hxs.c(false));
                    wqzVar.c();
                } else if (bVar instanceof wqz.b.a) {
                    brsVar.q.m(new hxs.a(((wqz.b.a) bVar).a));
                } else if (bVar instanceof wqz.b.c) {
                    int i3 = znz.w;
                    v5b v5bVar2 = brsVar.l;
                    u1b u1bVarA2 = znz.b.a(brsVar.o, brsVar.p, v5bVar2, brsVar.m, (wqz.b.c) bVar, wqzVar, obj2);
                    brsVar.q.getClass();
                    brsVar.q = u1bVarA2;
                    brsVar.j(u1bVarA2);
                }
                return Unit.a;
            }
            return y5bVar;
        }
    }

    public brs(znz.c cVar, vje0 vje0Var, k5b k5bVar, k5b k5bVar2) {
        cVar.getClass();
        vje0Var.getClass();
        u5s u5sVar = new u5s(k5bVar, new jhn());
        wqz.b.c cVar2 = wqz.b.c.f;
        cVar2.getClass();
        q2l q2lVar = q2l.a;
        super(new khn(k5bVar, k5bVar2, q2lVar, cVar, cVar2, u5sVar, null));
        this.l = q2lVar;
        this.m = cVar;
        this.n = vje0Var;
        this.o = k5bVar;
        this.p = k5bVar2;
        this.s = new ars(this);
        new sb0(this, 2);
        znz<Value> znzVarD = d();
        znzVarD.getClass();
        this.q = znzVarD;
    }

    @Override // defpackage.njs
    public final void h() {
        n(false);
    }

    public final void n(boolean z) {
        jvd0 jvd0Var = this.r;
        if (jvd0Var == null || z) {
            if (jvd0Var != null) {
                jvd0Var.cancel((CancellationException) null);
            }
            this.r = ej5.c(this.l, this.p, null, new a(this, null), 2);
        }
    }
}
