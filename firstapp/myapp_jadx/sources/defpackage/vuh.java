package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.instantwin.utils.FlexCalculateUtils$combinationProbabilityAsyncWithCache$2", f = "FlexCalculateUtils.kt", l = {46}, m = "invokeSuspend", v = 2)
public final class vuh extends tje0 implements Function2<v5b, v1b<? super Double>, Object> {
    public bc80 a;
    public zp40 b;
    public ConcurrentHashMap c;
    public List d;
    public Iterator e;
    public int f;
    public int i;
    public /* synthetic */ Object v;
    public final /* synthetic */ yc80 w;
    public final /* synthetic */ ConcurrentHashMap<String, Double> y;
    public final /* synthetic */ List<Double> z;

    @c0d(c = "com.sportybet.android.instantwin.utils.FlexCalculateUtils$combinationProbabilityAsyncWithCache$2$1$chunkSum$1$1", f = "FlexCalculateUtils.kt", l = {30}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Double>, Object> {
        public int a;
        public final /* synthetic */ bc80 b;
        public final /* synthetic */ List<Integer> c;
        public final /* synthetic */ ConcurrentHashMap<String, Double> d;
        public final /* synthetic */ List<Double> e;

        /* JADX INFO: renamed from: vuh$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.android.instantwin.utils.FlexCalculateUtils$combinationProbabilityAsyncWithCache$2$1$chunkSum$1$1$1", f = "FlexCalculateUtils.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C1227a extends tje0 implements Function1<v1b<? super Double>, Object> {
            public final /* synthetic */ List<Integer> a;
            public final /* synthetic */ ConcurrentHashMap<String, Double> b;
            public final /* synthetic */ List<Double> c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1227a(List<Integer> list, ConcurrentHashMap<String, Double> concurrentHashMap, List<Double> list2, v1b<? super C1227a> v1bVar) {
                super(1, v1bVar);
                this.a = list;
                this.b = concurrentHashMap;
                this.c = list2;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(v1b<?> v1bVar) {
                return new C1227a(this.a, this.b, this.c, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(v1b<? super Double> v1bVar) {
                return ((C1227a) create(v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                List<Integer> list = this.a;
                String strValueOf = String.valueOf(list.hashCode());
                final tuh tuhVar = new tuh(this.c, list);
                return this.b.computeIfAbsent(strValueOf, new Function() { // from class: uuh
                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return (Double) tuhVar.invoke(obj2);
                    }
                });
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(bc80 bc80Var, List<Integer> list, ConcurrentHashMap<String, Double> concurrentHashMap, List<Double> list2, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = bc80Var;
            this.c = list;
            this.d = concurrentHashMap;
            this.e = list2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, this.d, this.e, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Double> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
            C1227a c1227a = new C1227a(this.c, this.d, this.e, null);
            this.a = 1;
            Object objA = ac80.a(this.b, c1227a, this);
            return objA == y5bVar ? y5bVar : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vuh(yc80 yc80Var, ConcurrentHashMap concurrentHashMap, List list, v1b v1bVar) {
        super(2, v1bVar);
        this.w = yc80Var;
        this.y = concurrentHashMap;
        this.z = list;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        vuh vuhVar = new vuh(this.w, this.y, this.z, v1bVar);
        vuhVar.v = obj;
        return vuhVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Double> v1bVar) {
        return ((vuh) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x005b  */
    /* JADX WARN: Code duplicated, block: B:14:0x0076 A[LOOP:0: B:12:0x0070->B:14:0x0076, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:17:0x00a4 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00a2 -> B:18:0x00a5). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:17:0x00a4
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pz1
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            java.lang.Object r1 = r0.v
            v5b r1 = (defpackage.v5b) r1
            y5b r2 = defpackage.y5b.a
            int r3 = r0.i
            r4 = 1
            if (r3 == 0) goto L2c
            if (r3 != r4) goto L25
            int r3 = r0.f
            java.util.Iterator r5 = r0.e
            java.util.List r6 = r0.d
            java.util.concurrent.ConcurrentHashMap r7 = r0.c
            zp40 r8 = r0.b
            bc80 r9 = r0.a
            defpackage.uj50.b(r17)
            r14 = r6
            r13 = r7
            r11 = r9
            r6 = r17
            goto La5
        L25:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r0)
            r0 = 0
            return r0
        L2c:
            defpackage.uj50.b(r17)
            r3 = 8
            bc80 r3 = defpackage.cc80.a(r3)
            zp40 r5 = new zp40
            r5.<init>()
            r6 = 100
            defpackage.sqi.b(r6, r6)
            yc80 r7 = r0.w
            kotlin.jvm.functions.Function2 r7 = r7.a
            vc80 r7 = defpackage.zc80.a(r7)
            java.util.Iterator r7 = defpackage.sqi.c(r7, r6, r6)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Double> r8 = r0.y
            java.util.List<java.lang.Double> r9 = r0.z
            r11 = r3
            r3 = r6
            r13 = r8
            r14 = r9
            r8 = r5
            r5 = r7
        L55:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto Lb1
            java.lang.Object r6 = r5.next()
            java.util.List r6 = (java.util.List) r6
            java.util.ArrayList r7 = new java.util.ArrayList
            r9 = 10
            int r9 = defpackage.l48.r(r6, r9)
            r7.<init>(r9)
            java.util.Iterator r6 = r6.iterator()
        L70:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L8e
            java.lang.Object r9 = r6.next()
            r12 = r9
            java.util.List r12 = (java.util.List) r12
            pfd r9 = defpackage.zuh.b
            vuh$a r10 = new vuh$a
            r15 = 0
            r10.<init>(r11, r12, r13, r14, r15)
            r12 = 2
            pjd r9 = defpackage.ej5.a(r1, r9, r10, r12)
            r7.add(r9)
            goto L70
        L8e:
            r0.v = r1
            r0.a = r11
            r0.b = r8
            r0.c = r13
            r0.d = r14
            r0.e = r5
            r0.f = r3
            r0.i = r4
            java.lang.Object r6 = defpackage.up1.a(r7, r0)
            if (r6 != r2) goto La5
            return r2
        La5:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            double r6 = kotlin.collections.CollectionsKt.s0(r6)
            double r9 = r8.a
            double r9 = r9 + r6
            r8.a = r9
            goto L55
        Lb1:
            double r0 = r8.a
            java.lang.Double r2 = new java.lang.Double
            r2.<init>(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vuh.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
