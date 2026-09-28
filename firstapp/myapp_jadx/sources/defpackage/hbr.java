package defpackage;

import androidx.recyclerview.widget.r;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.search.presentation.LNSearchViewModel$4", f = "LNSearchViewModel.kt", l = {r.d.DEFAULT_DRAG_ANIMATION_DURATION}, m = "invokeSuspend", v = 2)
public final class hbr extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ xbr b;

    @c0d(c = "com.sportybet.feature.luckynumber.search.presentation.LNSearchViewModel$4$1", f = "LNSearchViewModel.kt", l = {201, 202, 205}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<String, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ xbr b;

        /* JADX INFO: renamed from: hbr$a$a, reason: collision with other inner class name */
        public static final class C0632a<T> implements myh {
            public final /* synthetic */ xbr a;

            public C0632a(xbr xbrVar) {
                this.a = xbrVar;
            }

            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                String str = (String) CollectionsKt.firstOrNull((uf00) obj);
                if (str == null) {
                    return Unit.a;
                }
                wwd0 wwd0Var = this.a.z;
                Pair[] pairArr = {new Pair(str, Boolean.TRUE)};
                xf00 xf00Var = xf00.i;
                xf00Var.getClass();
                yf00 yf00Var = new yf00(xf00Var);
                kpu.j(yf00Var, pairArr);
                wf00 wf00VarBuild = yf00Var.build();
                wwd0Var.getClass();
                wwd0Var.k(null, wf00VarBuild);
                return Unit.a;
            }
        }

        public static final class b implements lyh<uf00<? extends String>> {
            public final /* synthetic */ lyh a;

            /* JADX INFO: renamed from: hbr$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.feature.luckynumber.search.presentation.LNSearchViewModel$4$1$invokeSuspend$$inlined$map$1", f = "LNSearchViewModel.kt", l = {109}, m = "collect", v = 2)
            public static final class C0633a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0633a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return b.this.collect(null, this);
                }
            }

            /* JADX INFO: renamed from: hbr$a$b$b, reason: collision with other inner class name */
            public static final class C0634b<T> implements myh {
                public final /* synthetic */ myh a;

                /* JADX INFO: renamed from: hbr$a$b$b$a, reason: collision with other inner class name */
                @c0d(c = "com.sportybet.feature.luckynumber.search.presentation.LNSearchViewModel$4$1$invokeSuspend$$inlined$map$1$2", f = "LNSearchViewModel.kt", l = {50}, m = "emit", v = 2)
                public static final class C0635a extends x1b {
                    public /* synthetic */ Object a;
                    public int b;

                    public C0635a(v1b v1bVar) {
                        super(v1bVar);
                    }

                    @Override // defpackage.pz1
                    public final Object invokeSuspend(Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return C0634b.this.emit(null, this);
                    }
                }

                public C0634b(myh myhVar) {
                    this.a = myhVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // defpackage.myh
                public final Object emit(Object obj, v1b v1bVar) {
                    C0635a c0635a;
                    if (v1bVar instanceof C0635a) {
                        c0635a = (C0635a) v1bVar;
                        int i = c0635a.b;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            c0635a.b = i - Integer.MIN_VALUE;
                        } else {
                            c0635a = new C0635a(v1bVar);
                        }
                    } else {
                        c0635a = new C0635a(v1bVar);
                    }
                    Object obj2 = c0635a.a;
                    y5b y5bVar = y5b.a;
                    int i2 = c0635a.b;
                    if (i2 == 0) {
                        uj50.b(obj2);
                        qcn<dar> qcnVar = ((sx70.e) obj).a;
                        ArrayList arrayList = new ArrayList(l48.r(qcnVar, 10));
                        Iterator<dar> it = qcnVar.iterator();
                        while (it.hasNext()) {
                            arrayList.add(it.next().a);
                        }
                        uf00 uf00VarF = a4h.f(arrayList);
                        c0635a.b = 1;
                        if (this.a.emit(uf00VarF, c0635a) == y5bVar) {
                            return y5bVar;
                        }
                    } else {
                        if (i2 != 1) {
                            ib5.a("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        uj50.b(obj2);
                    }
                    return Unit.a;
                }
            }

            public b(v340 v340Var) {
                this.a = v340Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.lyh
            public final Object collect(myh<? super uf00<? extends String>> myhVar, v1b v1bVar) {
                C0633a c0633a;
                if (v1bVar instanceof C0633a) {
                    c0633a = (C0633a) v1bVar;
                    int i = c0633a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0633a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0633a = new C0633a(v1bVar);
                    }
                } else {
                    c0633a = new C0633a(v1bVar);
                }
                Object obj = c0633a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0633a.b;
                if (i2 == 0) {
                    uj50.b(obj);
                    C0634b c0634b = new C0634b(myhVar);
                    c0633a.b = 1;
                    if (this.a.collect(c0634b, c0633a) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i2 != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xbr xbrVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = xbrVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, v1b<? super Unit> v1bVar) {
            return ((a) create(str, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
        
            if (r8.collect(r1, r7) == r0) goto L20;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r7.a
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                xbr r6 = r7.b
                if (r1 == 0) goto L24
                if (r1 == r5) goto L20
                if (r1 == r4) goto L1c
                if (r1 != r3) goto L16
                defpackage.uj50.b(r8)
                goto L6e
            L16:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r7)
                return r2
            L1c:
                defpackage.uj50.b(r8)
                goto L55
            L20:
                defpackage.uj50.b(r8)
                goto L3b
            L24:
                defpackage.uj50.b(r8)
                wwd0 r8 = r6.w
                xf00 r1 = defpackage.xf00.i
                r1.getClass()
                r7.a = r5
                r8.getClass()
                r8.k(r2, r1)
                kotlin.Unit r8 = kotlin.Unit.a
                if (r8 != r0) goto L3b
                goto L6d
            L3b:
                wwd0 r8 = r6.e
                v340 r1 = r6.d
                uwd0<T> r1 = r1.a
                java.lang.Object r1 = r1.getValue()
                qcn r1 = (defpackage.qcn) r1
                uf00 r1 = defpackage.xbr.x1(r1)
                r7.a = r4
                r8.setValue(r1)
                kotlin.Unit r8 = kotlin.Unit.a
                if (r8 != r0) goto L55
                goto L6d
            L55:
                v340 r8 = r6.B
                hbr$a$b r1 = new hbr$a$b
                r1.<init>(r8)
                lyh r8 = defpackage.uzh.b(r1)
                hbr$a$a r1 = new hbr$a$a
                r1.<init>(r6)
                r7.a = r3
                java.lang.Object r7 = r8.collect(r1, r7)
                if (r7 != r0) goto L6e
            L6d:
                return r0
            L6e:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: hbr.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hbr(xbr xbrVar, v1b<? super hbr> v1bVar) {
        super(2, v1bVar);
        this.b = xbrVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new hbr(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((hbr) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            xbr xbrVar = this.b;
            v340 v340Var = xbrVar.i;
            a aVar = new a(xbrVar, null);
            this.a = 1;
            if (kzh.b(v340Var, aVar, this) == y5bVar) {
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
