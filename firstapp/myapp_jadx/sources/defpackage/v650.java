package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1", f = "RemoteMediatorAccessor.kt", l = {386}, m = "invokeSuspend")
public final class v650 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ s650<Object, Object> b;

    @c0d(c = "androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1", f = "RemoteMediatorAccessor.kt", l = {393}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function1<v1b<? super Unit>, Object> {
        public kxs a;
        public int b;
        public final /* synthetic */ s650<Object, Object> c;

        /* JADX INFO: renamed from: v650$a$a, reason: collision with other inner class name */
        public static final class C1207a extends qlr implements Function1<m7<Object, Object>, Pair<? extends kxs, ? extends xqz<Object, Object>>> {
            public static final C1207a a = new C1207a(1);

            @Override // kotlin.jvm.functions.Function1
            public final Pair<? extends kxs, ? extends xqz<Object, Object>> invoke(m7<Object, Object> m7Var) {
                m7<Object, Object> m7Var2 = m7Var;
                m7Var2.getClass();
                return m7Var2.c();
            }
        }

        public static final class b extends qlr implements Function1<m7<Object, Object>, Unit> {
            public final /* synthetic */ kxs a;
            public final /* synthetic */ r650.b.C1034b b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(kxs kxsVar, r650.b.C1034b c1034b) {
                super(1);
                this.a = kxsVar;
                this.b = c1034b;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(m7<Object, Object> m7Var) {
                m7<Object, Object> m7Var2 = m7Var;
                m7Var2.getClass();
                kxs kxsVar = this.a;
                m7Var2.a(kxsVar);
                if (this.b.a) {
                    m7Var2.d(kxsVar, m7.a.b);
                }
                return Unit.a;
            }
        }

        public static final class c extends qlr implements Function1<m7<Object, Object>, Unit> {
            public final /* synthetic */ kxs a;
            public final /* synthetic */ r650.b.a b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(kxs kxsVar, r650.b.a aVar) {
                super(1);
                this.a = kxsVar;
                this.b = aVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(m7<Object, Object> m7Var) {
                m7<Object, Object> m7Var2 = m7Var;
                m7Var2.getClass();
                kxs kxsVar = this.a;
                m7Var2.a(kxsVar);
                m7Var2.e(kxsVar, new hxs.a(this.b.a));
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s650<Object, Object> s650Var, v1b<? super a> v1bVar) {
            super(1, v1bVar);
            this.c = s650Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(v1b<?> v1bVar) {
            return new a(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(v1b<? super Unit> v1bVar) {
            return ((a) create(v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0027  */
        /* JADX WARN: Code duplicated, block: B:13:0x002a  */
        /* JADX WARN: Code duplicated, block: B:15:0x003e A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:18:0x0045  */
        /* JADX WARN: Code duplicated, block: B:19:0x0050  */
        /* JADX WARN: Code duplicated, block: B:21:0x0054  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x003c -> B:16:0x003f). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:18:0x0045
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.pz1
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                s650<java.lang.Object, java.lang.Object> r0 = r6.c
                n7<Key, Value> r1 = r0.c
                y5b r2 = defpackage.y5b.a
                int r3 = r6.b
                r4 = 1
                if (r3 == 0) goto L1a
                if (r3 != r4) goto L13
                kxs r3 = r6.a
                defpackage.uj50.b(r7)
                goto L3f
            L13:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                r6 = 0
                return r6
            L1a:
                defpackage.uj50.b(r7)
            L1d:
                v650$a$a r7 = v650.a.C1207a.a
                java.lang.Object r7 = r1.a(r7)
                kotlin.Pair r7 = (kotlin.Pair) r7
                if (r7 != 0) goto L2a
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            L2a:
                A r3 = r7.a
                kxs r3 = (defpackage.kxs) r3
                B r7 = r7.b
                xqz r7 = (defpackage.xqz) r7
                r650<Key, Value> r5 = r0.b
                r6.a = r3
                r6.b = r4
                java.lang.Object r7 = r5.b(r3, r7, r6)
                if (r7 != r2) goto L3f
                return r2
            L3f:
                r650$b r7 = (r650.b) r7
                boolean r5 = r7 instanceof r650.b.C1034b
                if (r5 == 0) goto L50
                v650$a$b r5 = new v650$a$b
                r650$b$b r7 = (r650.b.C1034b) r7
                r5.<init>(r3, r7)
                r1.a(r5)
                goto L1d
            L50:
                boolean r5 = r7 instanceof r650.b.a
                if (r5 == 0) goto L1d
                v650$a$c r5 = new v650$a$c
                r650$b$a r7 = (r650.b.a) r7
                r5.<init>(r3, r7)
                r1.a(r5)
                goto L1d
            */
            throw new UnsupportedOperationException("Method not decompiled: v650.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v650(s650<Object, Object> s650Var, v1b<? super v650> v1bVar) {
        super(2, v1bVar);
        this.b = s650Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new v650(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((v650) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            s650<Object, Object> s650Var = this.b;
            uv90 uv90Var = s650Var.d;
            a aVar = new a(s650Var, null);
            this.a = 1;
            if (uv90Var.a(1, aVar, this) == y5bVar) {
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
