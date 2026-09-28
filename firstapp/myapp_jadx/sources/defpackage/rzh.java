package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1", f = "Delay.kt", l = {413}, m = "invokeSuspend")
public final class rzh extends tje0 implements gaj<v5b, myh<Object>, v1b<? super Unit>, Object> {
    public long a;
    public int b;
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ long e;
    public final /* synthetic */ lyh<Object> f;

    @c0d(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1", f = "Delay.kt", l = {395}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<h77<Object>, v1b<? super Boolean>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ myh<Object> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(myh<Object> myhVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = myhVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(h77<Object> h77Var, v1b<? super Boolean> v1bVar) {
            h77<Object> h77Var2 = h77Var;
            Object obj = h77Var2.a;
            return ((a) create(h77Var2, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0037  */
        /* JADX WARN: Code duplicated, block: B:19:0x003d  */
        /* JADX WARN: Code duplicated, block: B:21:0x0040  */
        /* JADX WARN: Code duplicated, block: B:22:0x0041  */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2;
            Object obj3;
            Throwable thA;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                obj2 = ((h77) this.b).a;
                if (!(obj2 instanceof h77.b)) {
                    this.b = obj2;
                    this.a = 1;
                    if (this.c.emit(obj2, this) == y5bVar) {
                        return y5bVar;
                    }
                    obj3 = obj2;
                }
                if (obj2 instanceof h77.a) {
                    return Boolean.TRUE;
                }
                thA = h77.a(obj2);
                if (thA == null) {
                    return Boolean.FALSE;
                }
                throw thA;
            }
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj3 = this.b;
            uj50.b(obj);
            obj2 = obj3;
            if (obj2 instanceof h77.a) {
                return Boolean.TRUE;
            }
            thA = h77.a(obj2);
            if (thA == null) {
                return Boolean.FALSE;
            }
            throw thA;
        }
    }

    @c0d(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2", f = "Delay.kt", l = {}, m = "invokeSuspend")
    public static final class b extends tje0 implements Function1<v1b<?>, Object> {
        public final /* synthetic */ long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j, v1b<? super b> v1bVar) {
            super(1, v1bVar);
            this.a = j;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(v1b<?> v1bVar) {
            return new b(this.a, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(v1b<?> v1bVar) {
            ((b) create(v1bVar)).invokeSuspend(Unit.a);
            throw null;
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            throw new txf0("Timed out waiting for " + ((Object) kotlin.time.b.k(this.a)), null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rzh(long j, v1b v1bVar, lyh lyhVar) {
        super(3, v1bVar);
        this.e = j;
        this.f = lyhVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(v5b v5bVar, myh<Object> myhVar, v1b<? super Unit> v1bVar) {
        rzh rzhVar = new rzh(this.e, v1bVar, this.f);
        rzhVar.c = v5bVar;
        rzhVar.d = myhVar;
        return rzhVar.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:20:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:22:0x00d8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x00e1  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pz1
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rzh.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
