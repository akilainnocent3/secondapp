package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.k;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.w;
import com.google.protobuf.Reader;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class fsf0 {

    @c0d(c = "com.sporty.android.platform.features.loyalty.home.ui.TierMenuKt$TierListView$1$1$1", f = "TierMenu.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ ib50 a;
        public final /* synthetic */ float b;
        public final /* synthetic */ float c;
        public final /* synthetic */ float d;
        public final /* synthetic */ Function0<Unit> e;
        public final /* synthetic */ ytw<ep70> f;
        public final /* synthetic */ ytw<Integer> i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ib50 ib50Var, float f, float f2, float f3, Function0<Unit> function0, ytw<ep70> ytwVar, ytw<Integer> ytwVar2, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.a = ib50Var;
            this.b = f;
            this.c = f2;
            this.d = f3;
            this.e = function0;
            this.f = ytwVar;
            this.i = ytwVar2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            krf0 krf0Var;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            int iB = krf0.I.b();
            ib50 ib50Var = this.a;
            if (!(ib50Var instanceof ib50.b)) {
                ib50Var = null;
            }
            ib50.b bVar = (ib50.b) ib50Var;
            if (bVar == null || (krf0Var = bVar.a) == null) {
                return Unit.a;
            }
            Integer num = new Integer((((1073741823 - (1073741823 % iB)) + krf0Var.ordinal()) - ((int) (this.b / this.c))) - 1);
            Integer num2 = num.intValue() > 0 ? num : null;
            int iIntValue = num2 != null ? num2.intValue() : 0;
            this.f.setValue(new ep70(iIntValue, (int) this.d, false));
            this.i.setValue(new Integer(iIntValue));
            this.e.invoke();
            return Unit.a;
        }
    }

    @c0d(c = "com.sporty.android.platform.features.loyalty.home.ui.TierMenuKt$TierListView$1$2$1", f = "TierMenu.kt", l = {254, 256, 258}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ zzr b;
        public final /* synthetic */ ytw<ep70> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(zzr zzrVar, ytw<ep70> ytwVar, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.b = zzrVar;
            this.c = ytwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
        
            if (r3.f(r1, r8, r7) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0074, code lost:
        
            if (r3.k(r1, r8, r7) == r0) goto L25;
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
                zzr r3 = r7.b
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L21
                if (r1 == r6) goto L1d
                if (r1 == r5) goto L19
                if (r1 != r4) goto L13
                goto L19
            L13:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r7)
                return r2
            L19:
                defpackage.uj50.b(r8)
                goto L77
            L1d:
                defpackage.uj50.b(r8)
                goto L39
            L21:
                defpackage.uj50.b(r8)
                r7.a = r6
                huw r8 = defpackage.huw.a
                kp70 r1 = new kp70
                r1.<init>(r5, r2)
                java.lang.Object r8 = r3.b(r8, r1, r7)
                if (r8 != r0) goto L34
                goto L36
            L34:
                kotlin.Unit r8 = kotlin.Unit.a
            L36:
                if (r8 != r0) goto L39
                goto L76
            L39:
                ytw<ep70> r8 = r7.c
                java.lang.Object r1 = r8.getValue()
                ep70 r1 = (defpackage.ep70) r1
                boolean r1 = r1.c
                if (r1 == 0) goto L5e
                java.lang.Object r1 = r8.getValue()
                ep70 r1 = (defpackage.ep70) r1
                int r1 = r1.a
                java.lang.Object r8 = r8.getValue()
                ep70 r8 = (defpackage.ep70) r8
                int r8 = r8.b
                r7.a = r5
                java.lang.Object r7 = r3.f(r1, r8, r7)
                if (r7 != r0) goto L77
                goto L76
            L5e:
                java.lang.Object r1 = r8.getValue()
                ep70 r1 = (defpackage.ep70) r1
                int r1 = r1.a
                java.lang.Object r8 = r8.getValue()
                ep70 r8 = (defpackage.ep70) r8
                int r8 = r8.b
                r7.a = r4
                java.lang.Object r7 = r3.k(r1, r8, r7)
                if (r7 != r0) goto L77
            L76:
                return r0
            L77:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: fsf0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.platform.features.loyalty.home.ui.TierMenuKt$TierListView$1$3$1", f = "TierMenu.kt", l = {268}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ float b;
        public final /* synthetic */ float c;
        public final /* synthetic */ zzr d;
        public final /* synthetic */ Function1<trf0, Unit> e;
        public final /* synthetic */ ytw<trf0> f;

        public static final class a<T> implements myh {
            public final /* synthetic */ zzr a;
            public final /* synthetic */ float b;
            public final /* synthetic */ float c;
            public final /* synthetic */ float d;
            public final /* synthetic */ Function1<trf0, Unit> e;
            public final /* synthetic */ ytw<trf0> f;

            /* JADX WARN: Multi-variable type inference failed */
            public a(zzr zzrVar, float f, float f2, float f3, Function1<? super trf0, Unit> function1, ytw<trf0> ytwVar) {
                this.a = zzrVar;
                this.b = f;
                this.c = f2;
                this.d = f3;
                this.e = function1;
                this.f = ytwVar;
            }

            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                zzr zzrVar = this.a;
                int iH = zzrVar.h();
                float f = this.c;
                int i = iH + ((int) ((this.b - (f / 2.0f)) / f)) + 1;
                float fI = zzrVar.i();
                float f2 = this.d;
                trf0 trf0Var = new trf0(i + (fI <= f2 ? 0 : 1), (((float) zzrVar.i()) > f2 ? (zzrVar.i() - f2) / f : g70.a(f, f2, f, zzrVar.i() / f)) - 0.5f);
                ytw<trf0> ytwVar = this.f;
                ytwVar.setValue(trf0Var);
                this.e.invoke(ytwVar.getValue());
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(float f, float f2, zzr zzrVar, Function1<? super trf0, Unit> function1, ytw<trf0> ytwVar, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.b = f;
            this.c = f2;
            this.d = zzrVar;
            this.e = function1;
            this.f = ytwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new c(this.b, this.c, this.d, this.e, this.f, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                float f = this.c;
                float f2 = f - ((this.b - (f / 2.0f)) % f);
                or60 or60VarC = n95.c(new seq(this.d, 2));
                a aVar = new a(this.d, this.b, this.c, f2, this.e, this.f);
                this.a = 1;
                if (or60VarC.collect(aVar, this) == y5bVar) {
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

    @c0d(c = "com.sporty.android.platform.features.loyalty.home.ui.TierMenuKt$TierListView$1$4$1", f = "TierMenu.kt", l = {298}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ zzr b;
        public final /* synthetic */ ytw<Integer> c;
        public final /* synthetic */ ytw<Integer> d;

        public static final class a<T> implements myh {
            public final /* synthetic */ zzr a;
            public final /* synthetic */ ytw<Integer> b;
            public final /* synthetic */ ytw<Integer> c;

            public a(zzr zzrVar, ytw<Integer> ytwVar, ytw<Integer> ytwVar2) {
                this.a = zzrVar;
                this.b = ytwVar;
                this.c = ytwVar2;
            }

            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                zzr zzrVar = this.a;
                this.b.setValue(new Integer(zzrVar.h()));
                this.c.setValue(new Integer(zzrVar.i()));
                return Unit.a;
            }
        }

        public static final class b implements lyh<Object> {
            public final /* synthetic */ b390 a;

            @c0d(c = "com.sporty.android.platform.features.loyalty.home.ui.TierMenuKt$TierListView$1$4$1$invokeSuspend$$inlined$filterIsInstance$1", f = "TierMenu.kt", l = {109}, m = "collect", v = 2)
            public static final class a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return b.this.collect(null, this);
                }
            }

            /* JADX INFO: renamed from: fsf0$d$b$b, reason: collision with other inner class name */
            public static final class C0583b<T> implements myh {
                public final /* synthetic */ myh a;

                /* JADX INFO: renamed from: fsf0$d$b$b$a */
                @c0d(c = "com.sporty.android.platform.features.loyalty.home.ui.TierMenuKt$TierListView$1$4$1$invokeSuspend$$inlined$filterIsInstance$1$2", f = "TierMenu.kt", l = {50}, m = "emit", v = 2)
                public static final class a extends x1b {
                    public /* synthetic */ Object a;
                    public int b;

                    public a(v1b v1bVar) {
                        super(v1bVar);
                    }

                    @Override // defpackage.pz1
                    public final Object invokeSuspend(Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return C0583b.this.emit(null, this);
                    }
                }

                public C0583b(myh myhVar) {
                    this.a = myhVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // defpackage.myh
                public final Object emit(Object obj, v1b v1bVar) {
                    a aVar;
                    if (v1bVar instanceof a) {
                        aVar = (a) v1bVar;
                        int i = aVar.b;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            aVar.b = i - Integer.MIN_VALUE;
                        } else {
                            aVar = new a(v1bVar);
                        }
                    } else {
                        aVar = new a(v1bVar);
                    }
                    Object obj2 = aVar.a;
                    y5b y5bVar = y5b.a;
                    int i2 = aVar.b;
                    if (i2 == 0) {
                        uj50.b(obj2);
                        if (obj instanceof i9f.b) {
                            aVar.b = 1;
                            if (this.a.emit(obj, aVar) == y5bVar) {
                                return y5bVar;
                            }
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

            public b(b390 b390Var) {
                this.a = b390Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.lyh
            public final Object collect(myh<? super Object> myhVar, v1b v1bVar) throws Throwable {
                a aVar;
                if (v1bVar instanceof a) {
                    aVar = (a) v1bVar;
                    int i = aVar.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        aVar.b = i - Integer.MIN_VALUE;
                    } else {
                        aVar = new a(v1bVar);
                    }
                } else {
                    aVar = new a(v1bVar);
                }
                Object obj = aVar.a;
                y5b y5bVar = y5b.a;
                int i2 = aVar.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        uj50.b(obj);
                        return Unit.a;
                    }
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                C0583b c0583b = new C0583b(myhVar);
                aVar.b = 1;
                this.a.collect(c0583b, aVar);
                return y5bVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(zzr zzrVar, ytw<Integer> ytwVar, ytw<Integer> ytwVar2, v1b<? super d> v1bVar) {
            super(2, v1bVar);
            this.b = zzrVar;
            this.c = ytwVar;
            this.d = ytwVar2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new d(this.b, this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                zzr zzrVar = this.b;
                b bVar = new b(zzrVar.g.a);
                a aVar = new a(zzrVar, this.c, this.d);
                this.a = 1;
                if (bVar.collect(aVar, this) == y5bVar) {
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

    @c0d(c = "com.sporty.android.platform.features.loyalty.home.ui.TierMenuKt$TierListView$1$5$1", f = "TierMenu.kt", l = {320}, m = "invokeSuspend", v = 2)
    public static final class e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ zzr b;
        public final /* synthetic */ float c;
        public final /* synthetic */ float d;
        public final /* synthetic */ ytw<Integer> e;
        public final /* synthetic */ ytw<Integer> f;
        public final /* synthetic */ ytw<Integer> i;
        public final /* synthetic */ ytw<ep70> v;

        public static final class a<T> implements myh {
            public final /* synthetic */ zzr a;
            public final /* synthetic */ float b;
            public final /* synthetic */ float c;
            public final /* synthetic */ ytw<Integer> d;
            public final /* synthetic */ ytw<Integer> e;
            public final /* synthetic */ ytw<Integer> f;
            public final /* synthetic */ ytw<ep70> i;

            public a(zzr zzrVar, float f, float f2, ytw<Integer> ytwVar, ytw<Integer> ytwVar2, ytw<Integer> ytwVar3, ytw<ep70> ytwVar4) {
                this.a = zzrVar;
                this.b = f;
                this.c = f2;
                this.d = ytwVar;
                this.e = ytwVar2;
                this.f = ytwVar3;
                this.i = ytwVar4;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Multi-variable type inference failed */
            public final Object c(v1b v1bVar) {
                isf0 isf0Var;
                if (v1bVar instanceof isf0) {
                    isf0Var = (isf0) v1bVar;
                    int i = isf0Var.c;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        isf0Var.c = i - Integer.MIN_VALUE;
                    } else {
                        isf0Var = new isf0(this, v1bVar);
                    }
                } else {
                    isf0Var = new isf0(this, v1bVar);
                }
                Object obj = isf0Var.a;
                y5b y5bVar = y5b.a;
                int i2 = isf0Var.c;
                final zzr zzrVar = this.a;
                if (i2 == 0) {
                    uj50.b(obj);
                    or60 or60VarC = n95.c(new Function0() { // from class: gsf0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Boolean.valueOf(zzrVar.i.c());
                        }
                    });
                    hsf0 hsf0Var = new hsf0(2, null);
                    isf0Var.c = 1;
                    if (s0i.b(or60VarC, hsf0Var, isf0Var) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i2 != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                }
                ytw<Integer> ytwVar = this.d;
                Integer value = ytwVar.getValue();
                ytw<Integer> ytwVar2 = this.e;
                Integer value2 = ytwVar2.getValue();
                ytwVar.setValue(null);
                ytwVar2.setValue(null);
                float f = this.b;
                float fAbs = (value == null || value2 == null) ? Float.MAX_VALUE : (Math.abs(zzrVar.h() - value.intValue()) * f) + Math.abs(zzrVar.i() - value2.intValue());
                float f2 = f / 2.0f;
                ytw<ep70> ytwVar3 = this.i;
                float f3 = this.c;
                ytw<Integer> ytwVar4 = this.f;
                if (fAbs < f2) {
                    Integer value3 = ytwVar4.getValue();
                    if (value3 != null) {
                        ytwVar3.setValue(new ep70(value3.intValue(), (int) f3, true));
                    }
                    return Unit.a;
                }
                ytwVar4.setValue(null);
                List listK = kotlin.collections.b.k(new Pair(new Integer(zzrVar.h() - 1), new Float((f - f3) + zzrVar.i())), new Pair(new Integer(zzrVar.h()), new Float(Math.abs(f3 - zzrVar.i()))), new Pair(new Integer(zzrVar.h() + 1), new Float((f - zzrVar.i()) + f3)));
                ArrayList arrayList = new ArrayList();
                for (T t : listK) {
                    if (((Number) ((Pair) t).a).intValue() >= 0) {
                        arrayList.add(t);
                    }
                }
                Iterator it = arrayList.iterator();
                if (!it.hasNext()) {
                    lrh0.a();
                    return null;
                }
                Object next = it.next();
                if (it.hasNext()) {
                    float fFloatValue = ((Number) ((Pair) next).b).floatValue();
                    do {
                        Object next2 = it.next();
                        float fFloatValue2 = ((Number) ((Pair) next2).b).floatValue();
                        if (Float.compare(fFloatValue, fFloatValue2) > 0) {
                            next = next2;
                            fFloatValue = fFloatValue2;
                        }
                    } while (it.hasNext());
                }
                ytwVar3.setValue(new ep70(((Number) ((Pair) next).a).intValue(), ycv.b(f3), true));
                return Unit.a;
            }

            @Override // defpackage.myh
            public final /* bridge */ /* synthetic */ Object emit(Object obj, v1b v1bVar) {
                return c(v1bVar);
            }
        }

        public static final class b implements lyh<Object> {
            public final /* synthetic */ b390 a;

            @c0d(c = "com.sporty.android.platform.features.loyalty.home.ui.TierMenuKt$TierListView$1$5$1$invokeSuspend$$inlined$filterIsInstance$1", f = "TierMenu.kt", l = {109}, m = "collect", v = 2)
            public static final class a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return b.this.collect(null, this);
                }
            }

            /* JADX INFO: renamed from: fsf0$e$b$b, reason: collision with other inner class name */
            public static final class C0584b<T> implements myh {
                public final /* synthetic */ myh a;

                /* JADX INFO: renamed from: fsf0$e$b$b$a */
                @c0d(c = "com.sporty.android.platform.features.loyalty.home.ui.TierMenuKt$TierListView$1$5$1$invokeSuspend$$inlined$filterIsInstance$1$2", f = "TierMenu.kt", l = {50}, m = "emit", v = 2)
                public static final class a extends x1b {
                    public /* synthetic */ Object a;
                    public int b;

                    public a(v1b v1bVar) {
                        super(v1bVar);
                    }

                    @Override // defpackage.pz1
                    public final Object invokeSuspend(Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return C0584b.this.emit(null, this);
                    }
                }

                public C0584b(myh myhVar) {
                    this.a = myhVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // defpackage.myh
                public final Object emit(Object obj, v1b v1bVar) {
                    a aVar;
                    if (v1bVar instanceof a) {
                        aVar = (a) v1bVar;
                        int i = aVar.b;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            aVar.b = i - Integer.MIN_VALUE;
                        } else {
                            aVar = new a(v1bVar);
                        }
                    } else {
                        aVar = new a(v1bVar);
                    }
                    Object obj2 = aVar.a;
                    y5b y5bVar = y5b.a;
                    int i2 = aVar.b;
                    if (i2 == 0) {
                        uj50.b(obj2);
                        if (obj instanceof i9f.c) {
                            aVar.b = 1;
                            if (this.a.emit(obj, aVar) == y5bVar) {
                                return y5bVar;
                            }
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

            public b(b390 b390Var) {
                this.a = b390Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.lyh
            public final Object collect(myh<? super Object> myhVar, v1b v1bVar) throws Throwable {
                a aVar;
                if (v1bVar instanceof a) {
                    aVar = (a) v1bVar;
                    int i = aVar.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        aVar.b = i - Integer.MIN_VALUE;
                    } else {
                        aVar = new a(v1bVar);
                    }
                } else {
                    aVar = new a(v1bVar);
                }
                Object obj = aVar.a;
                y5b y5bVar = y5b.a;
                int i2 = aVar.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        uj50.b(obj);
                        return Unit.a;
                    }
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                C0584b c0584b = new C0584b(myhVar);
                aVar.b = 1;
                this.a.collect(c0584b, aVar);
                return y5bVar;
            }
        }

        public static final class c implements lyh<Object> {
            public final /* synthetic */ b390 a;

            @c0d(c = "com.sporty.android.platform.features.loyalty.home.ui.TierMenuKt$TierListView$1$5$1$invokeSuspend$$inlined$filterIsInstance$2", f = "TierMenu.kt", l = {109}, m = "collect", v = 2)
            public static final class a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return c.this.collect(null, this);
                }
            }

            public static final class b<T> implements myh {
                public final /* synthetic */ myh a;

                @c0d(c = "com.sporty.android.platform.features.loyalty.home.ui.TierMenuKt$TierListView$1$5$1$invokeSuspend$$inlined$filterIsInstance$2$2", f = "TierMenu.kt", l = {50}, m = "emit", v = 2)
                public static final class a extends x1b {
                    public /* synthetic */ Object a;
                    public int b;

                    public a(v1b v1bVar) {
                        super(v1bVar);
                    }

                    @Override // defpackage.pz1
                    public final Object invokeSuspend(Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return b.this.emit(null, this);
                    }
                }

                public b(myh myhVar) {
                    this.a = myhVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // defpackage.myh
                public final Object emit(Object obj, v1b v1bVar) {
                    a aVar;
                    if (v1bVar instanceof a) {
                        aVar = (a) v1bVar;
                        int i = aVar.b;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            aVar.b = i - Integer.MIN_VALUE;
                        } else {
                            aVar = new a(v1bVar);
                        }
                    } else {
                        aVar = new a(v1bVar);
                    }
                    Object obj2 = aVar.a;
                    y5b y5bVar = y5b.a;
                    int i2 = aVar.b;
                    if (i2 == 0) {
                        uj50.b(obj2);
                        if (obj instanceof i9f.a) {
                            aVar.b = 1;
                            if (this.a.emit(obj, aVar) == y5bVar) {
                                return y5bVar;
                            }
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

            public c(b390 b390Var) {
                this.a = b390Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.lyh
            public final Object collect(myh<? super Object> myhVar, v1b v1bVar) throws Throwable {
                a aVar;
                if (v1bVar instanceof a) {
                    aVar = (a) v1bVar;
                    int i = aVar.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        aVar.b = i - Integer.MIN_VALUE;
                    } else {
                        aVar = new a(v1bVar);
                    }
                } else {
                    aVar = new a(v1bVar);
                }
                Object obj = aVar.a;
                y5b y5bVar = y5b.a;
                int i2 = aVar.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        uj50.b(obj);
                        return Unit.a;
                    }
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                b bVar = new b(myhVar);
                aVar.b = 1;
                this.a.collect(bVar, aVar);
                return y5bVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(zzr zzrVar, float f, float f2, ytw<Integer> ytwVar, ytw<Integer> ytwVar2, ytw<Integer> ytwVar3, ytw<ep70> ytwVar4, v1b<? super e> v1bVar) {
            super(2, v1bVar);
            this.b = zzrVar;
            this.c = f;
            this.d = f2;
            this.e = ytwVar;
            this.f = ytwVar2;
            this.i = ytwVar3;
            this.v = ytwVar4;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new e(this.b, this.c, this.d, this.e, this.f, this.i, this.v, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                b390 b390Var = this.b.g.a;
                e77 e77VarE = r0i.e(new b(b390Var), new c(b390Var));
                a aVar = new a(this.b, this.c, this.d, this.e, this.f, this.i, this.v);
                this.a = 1;
                if (e77VarE.collect(aVar, this) == y5bVar) {
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

    @c0d(c = "com.sporty.android.platform.features.loyalty.home.ui.TierMenuKt$TierListView$1$7$1$3$1$1", f = "TierMenu.kt", l = {388}, m = "invokeSuspend", v = 2)
    public static final class f extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ isw A;
        public final /* synthetic */ ytw<k7f> B;
        public final /* synthetic */ ytw<g7f> C;
        public int a;
        public final /* synthetic */ ytw<trf0> b;
        public final /* synthetic */ int c;
        public final /* synthetic */ krf0[] d;
        public final /* synthetic */ float e;
        public final /* synthetic */ float f;
        public final /* synthetic */ float i;
        public final /* synthetic */ float v;
        public final /* synthetic */ float w;
        public final /* synthetic */ float y;
        public final /* synthetic */ float z;

        public static final class a<T> implements myh {
            public final /* synthetic */ ytw<k7f> A;
            public final /* synthetic */ ytw<g7f> B;
            public final /* synthetic */ int a;
            public final /* synthetic */ krf0[] b;
            public final /* synthetic */ float c;
            public final /* synthetic */ float d;
            public final /* synthetic */ float e;
            public final /* synthetic */ float f;
            public final /* synthetic */ float i;
            public final /* synthetic */ float v;
            public final /* synthetic */ float w;
            public final /* synthetic */ ytw<trf0> y;
            public final /* synthetic */ isw z;

            public a(int i, krf0[] krf0VarArr, float f, float f2, float f3, float f4, float f5, float f6, float f7, ytw<trf0> ytwVar, isw iswVar, ytw<k7f> ytwVar2, ytw<g7f> ytwVar3) {
                this.a = i;
                this.b = krf0VarArr;
                this.c = f;
                this.d = f2;
                this.e = f3;
                this.f = f4;
                this.i = f5;
                this.v = f6;
                this.w = f7;
                this.y = ytwVar;
                this.z = iswVar;
                this.A = ytwVar2;
                this.B = ytwVar3;
            }

            /* JADX WARN: Code duplicated, block: B:12:0x0049  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                Float f;
                float fFloatValue;
                float f2 = ((trf0) obj).b;
                krf0[] krf0VarArr = this.b;
                int length = this.a % krf0VarArr.length;
                ytw<trf0> ytwVar = this.y;
                if (length == ytwVar.getValue().a % krf0VarArr.length) {
                    fFloatValue = 1.0f - Math.abs(f2);
                } else {
                    if (length == (ytwVar.getValue().a - 1) % krf0VarArr.length) {
                        Float f3 = new Float(f2);
                        f = f3.floatValue() < 0.0f ? f3 : null;
                        if (f != null) {
                            fFloatValue = Math.abs(f.floatValue());
                        } else {
                            fFloatValue = 0.0f;
                        }
                    } else if (length == (ytwVar.getValue().a + 1) % krf0VarArr.length) {
                        Float f4 = new Float(f2);
                        f = f4.floatValue() >= 0.0f ? f4 : null;
                        if (f != null) {
                            fFloatValue = f.floatValue();
                        } else {
                            fFloatValue = 0.0f;
                        }
                    } else {
                        fFloatValue = 0.0f;
                    }
                }
                isw iswVar = this.z;
                iswVar.A(fFloatValue);
                this.A.setValue(new k7f(jc1.a(((iswVar.j() * this.d) + this.c) - this.e, (iswVar.j() * this.i) + this.f)));
                this.B.setValue(new g7f(this.v - (iswVar.j() * this.w)));
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ytw<trf0> ytwVar, int i, krf0[] krf0VarArr, float f, float f2, float f3, float f4, float f5, float f6, float f7, isw iswVar, ytw<k7f> ytwVar2, ytw<g7f> ytwVar3, v1b<? super f> v1bVar) {
            super(2, v1bVar);
            this.b = ytwVar;
            this.c = i;
            this.d = krf0VarArr;
            this.e = f;
            this.f = f2;
            this.i = f3;
            this.v = f4;
            this.w = f5;
            this.y = f6;
            this.z = f7;
            this.A = iswVar;
            this.B = ytwVar2;
            this.C = ytwVar3;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new f(this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, this.B, this.C, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((f) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            int i2 = 1;
            if (i == 0) {
                uj50.b(obj);
                or60 or60VarC = n95.c(new w8l(this.b, i2));
                a aVar = new a(this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.b, this.A, this.B, this.C);
                this.a = 1;
                if (or60VarC.collect(aVar, this) == y5bVar) {
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

    public static final void a(final androidx.compose.ui.d dVar, final int i, final trf0 trf0Var, final float f2, androidx.compose.runtime.a aVar, final int i2) {
        androidx.compose.runtime.b bVarI = aVar.i(2025993027);
        int i3 = i2 | (bVarI.d(i) ? 32 : 16) | (bVarI.M(trf0Var) ? 256 : 128) | (bVarI.c(f2) ? 2048 : 1024);
        if (bVarI.q(i3 & 1, (i3 & 1171) != 1170)) {
            final float f3 = (13.860001f * trf0Var.b) + ((trf0Var.a % i) * 13.860001f);
            final long jC = j58.c(0.3f, j58.b);
            final long jC2 = j58.c(0.6f, j58.f);
            rg6.a(j.i(dVar, 4.0f), j060.c(14.0f), gg6.b(j58.l, 0L, bVarI, 24582, 14), gg6.c(62, 0.0f), null, pp8.b(-1581530223, new gaj() { // from class: csf0
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((j78) obj).getClass();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        aiv aivVarC = g75.c(ht.a.a, false);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d.a aVar3 = d.a.b;
                        d dVarC = c.c(aVar2, aVar3);
                        yka.k.getClass();
                        tsr.a aVar4 = yka.a.b;
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar4);
                        } else {
                            aVar2.p();
                        }
                        yka.a.b bVar = yka.a.f;
                        hlh0.a(aVar2, aivVarC, bVar);
                        yka.a.d dVar2 = yka.a.e;
                        hlh0.a(aVar2, ne00VarO, dVar2);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        yka.a.c cVar = yka.a.d;
                        hlh0.a(aVar2, dVarC, cVar);
                        d160 d160VarA = b160.a(new kw0.i(6.0f, true, new hw0()), ht.a.j, aVar2, 6);
                        int iHashCode2 = Long.hashCode(aVar2.m());
                        ne00 ne00VarO2 = aVar2.o();
                        d dVarC2 = c.c(aVar2, aVar3);
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar4);
                        } else {
                            aVar2.p();
                        }
                        hlh0.a(aVar2, d160VarA, bVar);
                        hlh0.a(aVar2, ne00VarO2, dVar2);
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                            j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                        }
                        hlh0.a(aVar2, dVarC2, cVar);
                        aVar2.N(807751454);
                        for (int i4 = 0; i4 < i; i4++) {
                            g75.a(androidx.compose.foundation.a.b(j.t(aVar3, 7.86f, 4.0f), fsf0.d(f2, jC2, jC), j060.c(14.0f)), aVar2, 0);
                        }
                        aVar2.H();
                        aVar2.s();
                        g75.a(androidx.compose.foundation.a.b(j.t(g.c(aVar3, f3, 0.0f), 7.86f, 4.0f), j58.f, j060.c(14.0f)), aVar2, 0);
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 196608, 16);
            bVarI = bVarI;
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, trf0Var, f2, i2) { // from class: dsf0
                public final /* synthetic */ int b;
                public final /* synthetic */ trf0 c;
                public final /* synthetic */ float d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(7);
                    fsf0.a(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(androidx.compose.ui.d dVar, final ib50 ib50Var, final zzr zzrVar, final krf0 krf0Var, final krf0 krf0Var2, final boolean z, final Function1<? super trf0, Unit> function1, final Function0<Unit> function0, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.ui.d dVar2;
        androidx.compose.runtime.b bVarI = aVar.i(-1722103519);
        int i2 = i | (bVarI.M(ib50Var) ? 32 : 16) | (bVarI.M(zzrVar) ? 256 : 128) | (bVarI.d(krf0Var.ordinal()) ? 2048 : 1024) | (bVarI.d(krf0Var2.ordinal()) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.b(z) ? 131072 : 65536) | (bVarI.A(function1) ? 1048576 : 524288) | (bVarI.A(function0) ? 8388608 : 4194304);
        if (bVarI.q(i2 & 1, (4793491 & i2) != 4793490)) {
            uag uagVar = krf0.I;
            uagVar.getClass();
            final krf0[] krf0VarArr = (krf0[]) e48.b(uagVar, new krf0[0]);
            dVar2 = dVar;
            q75.a(j.g(dVar2, 1.0f), null, false, pp8.b(-1933561461, new gaj() { // from class: asf0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ib50 ib50Var2;
                    float f2;
                    float f3;
                    float f4;
                    float f5;
                    float f6;
                    zzr zzrVar2;
                    ytw ytwVar;
                    Object obj4;
                    zzr zzrVar3;
                    float f7;
                    r75 r75Var = (r75) obj;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    r75Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar2.M(r75Var) ? 4 : 2;
                    }
                    if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        Object objY = aVar2.y();
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (objY == c0042a) {
                            objY = k.a(0);
                            aVar2.r(objY);
                        }
                        osw oswVar = (osw) objY;
                        final float fE = fsf0.e(5.125f, r75Var.d());
                        final float f8 = fE * 2.0f;
                        final float fE2 = fsf0.e(102.0f, r75Var.d()) + f8;
                        final float fE3 = fsf0.e(88.0f, r75Var.d());
                        final float fE4 = fsf0.e(65.0f, r75Var.d()) + f8;
                        final float fE5 = fsf0.e(52.0f, r75Var.d());
                        final float f9 = fE2 - fE4;
                        final float f10 = fE3 - fE5;
                        final float fE6 = fsf0.e(8.0f, r75Var.d());
                        final float fE7 = fE6 - fsf0.e(4.0f, r75Var.d());
                        float fD = (r75Var.d() / 2.0f) - (fE2 / 2.0f);
                        float fB = mla.b(fE4, aVar2);
                        float fB2 = mla.b(fD, aVar2);
                        float f11 = fB - (fB2 % fB);
                        Object objY2 = aVar2.y();
                        if (objY2 == c0042a) {
                            objY2 = m.b(new trf0(0));
                            aVar2.r(objY2);
                        }
                        ytw ytwVar2 = (ytw) objY2;
                        Object objY3 = aVar2.y();
                        final krf0[] krf0VarArr2 = krf0VarArr;
                        if (objY3 == c0042a) {
                            objY3 = m.b(new ep70(krf0.I.indexOf(krf0Var2) + (1073741823 - (1073741823 % krf0VarArr2.length)), ycv.b(fB2) * (-1), false));
                            aVar2.r(objY3);
                        }
                        ytw ytwVar3 = (ytw) objY3;
                        Object objY4 = aVar2.y();
                        if (objY4 == c0042a) {
                            objY4 = m.b(null);
                            aVar2.r(objY4);
                        }
                        ytw ytwVar4 = (ytw) objY4;
                        ib50 ib50Var3 = ib50Var;
                        boolean zM = aVar2.M(ib50Var3) | aVar2.c(fB2) | aVar2.c(fB) | aVar2.c(f11);
                        Function0 function2 = function0;
                        boolean zM2 = zM | aVar2.M(function2);
                        Object objY5 = aVar2.y();
                        if (zM2 || objY5 == c0042a) {
                            objY5 = new fsf0.a(ib50Var3, fB2, fB, f11, function2, ytwVar3, ytwVar4, null);
                            ib50Var2 = ib50Var3;
                            f2 = fB2;
                            f3 = fB;
                            f4 = f11;
                            aVar2.r(objY5);
                        } else {
                            ib50Var2 = ib50Var3;
                            f2 = fB2;
                            f3 = fB;
                            f4 = f11;
                        }
                        xvf.e(aVar2, ib50Var2, (Function2) objY5);
                        ep70 ep70Var = (ep70) ytwVar3.getValue();
                        zzr zzrVar4 = zzrVar;
                        boolean zM3 = aVar2.M(zzrVar4);
                        Object objY6 = aVar2.y();
                        if (zM3 || objY6 == c0042a) {
                            objY6 = new fsf0.b(zzrVar4, ytwVar3, null);
                            aVar2.r(objY6);
                        }
                        xvf.e(aVar2, ep70Var, (Function2) objY6);
                        Unit unit = Unit.a;
                        boolean zC = aVar2.c(f2) | aVar2.c(f3) | aVar2.M(zzrVar4);
                        Function1 function3 = function1;
                        boolean zM4 = zC | aVar2.M(function3);
                        float f12 = f3;
                        Object objY7 = aVar2.y();
                        if (zM4 || objY7 == c0042a) {
                            float f13 = f2;
                            objY7 = new fsf0.c(f13, f12, zzrVar4, function3, ytwVar2, null);
                            f5 = f13;
                            f6 = f12;
                            zzrVar2 = zzrVar4;
                            ytwVar = ytwVar2;
                            aVar2.r(objY7);
                        } else {
                            f5 = f2;
                            zzrVar2 = zzrVar4;
                            f6 = f12;
                            ytwVar = ytwVar2;
                        }
                        xvf.e(aVar2, unit, (Function2) objY7);
                        Object objY8 = aVar2.y();
                        if (objY8 == c0042a) {
                            obj4 = null;
                            objY8 = m.b(null);
                            aVar2.r(objY8);
                        } else {
                            obj4 = null;
                        }
                        ytw ytwVar5 = (ytw) objY8;
                        ytw ytwVar6 = ytwVar3;
                        Object objY9 = aVar2.y();
                        if (objY9 == c0042a) {
                            objY9 = m.b(obj4);
                            aVar2.r(objY9);
                        }
                        ytw ytwVar7 = (ytw) objY9;
                        boolean zM5 = aVar2.M(zzrVar2);
                        final ytw ytwVar8 = ytwVar;
                        Object objY10 = aVar2.y();
                        if (zM5 || objY10 == c0042a) {
                            objY10 = new fsf0.d(zzrVar2, ytwVar5, ytwVar7, null);
                            aVar2.r(objY10);
                        }
                        xvf.e(aVar2, unit, (Function2) objY10);
                        boolean zM6 = aVar2.M(zzrVar2) | aVar2.c(f6) | aVar2.c(f4);
                        Object objY11 = aVar2.y();
                        if (zM6 || objY11 == c0042a) {
                            float f14 = f6;
                            zzr zzrVar5 = zzrVar2;
                            fsf0.e eVar = new fsf0.e(zzrVar5, f14, f4, ytwVar5, ytwVar7, ytwVar4, ytwVar6, null);
                            ytwVar4 = ytwVar4;
                            ytwVar6 = ytwVar6;
                            objY11 = eVar;
                            zzrVar3 = zzrVar5;
                            f7 = f14;
                            aVar2.r(objY11);
                        } else {
                            f7 = f6;
                            zzrVar3 = zzrVar2;
                        }
                        xvf.e(aVar2, unit, (Function2) objY11);
                        int i3 = 2;
                        d dVarK = j.k(j.g(d.a.b, 1.0f), mla.f(oswVar.D(), aVar2), 0.0f, 2);
                        Object objY12 = aVar2.y();
                        if (objY12 == c0042a) {
                            objY12 = new sx7(oswVar, i3);
                            aVar2.r(objY12);
                        }
                        d dVarH = g3w.h(w.a(dVarK, (Function1) objY12), "tier_menu");
                        boolean zM7 = aVar2.M(zzrVar3);
                        Object objY13 = aVar2.y();
                        if (zM7 || objY13 == c0042a) {
                            objY13 = new vzr(zzrVar3, z4a0.a.a);
                            aVar2.r(objY13);
                        }
                        y4a0 y4a0Var = (y4a0) objY13;
                        mmd mmdVar = (mmd) aVar2.O(kna.h);
                        h4d h4dVarA = zdb0.a(aVar2);
                        boolean zM8 = aVar2.M(mmdVar) | aVar2.M(y4a0Var) | aVar2.M(h4dVarA);
                        Object objY14 = aVar2.y();
                        if (zM8 || objY14 == c0042a) {
                            objY14 = new t4a0(y4a0Var, h4dVarA, yi0.d(0.0f, 400.0f, null, 5));
                            aVar2.r(objY14);
                        }
                        l5f0 l5f0Var = (l5f0) objY14;
                        boolean zC2 = aVar2.c(fE4) | aVar2.c(f8) | aVar2.c(fE5) | aVar2.c(fE6) | aVar2.A(krf0VarArr2) | aVar2.c(f9) | aVar2.c(f10) | aVar2.c(fE7) | aVar2.c(f5) | aVar2.c(f7) | aVar2.c(f4);
                        final float f15 = f7;
                        final boolean z2 = z;
                        boolean zB = zC2 | aVar2.b(z2);
                        final krf0 krf0Var3 = krf0Var;
                        boolean zD = aVar2.d(krf0Var3.ordinal()) | zB | aVar2.c(fE) | aVar2.c(fE2) | aVar2.c(fE3);
                        Object objY15 = aVar2.y();
                        if (zD || objY15 == c0042a) {
                            final float f16 = f5;
                            final ytw ytwVar9 = ytwVar6;
                            final ytw ytwVar10 = ytwVar4;
                            final float f17 = f4;
                            Function1 function4 = new Function1() { // from class: esf0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    szr szrVar = (szr) obj5;
                                    szrVar.getClass();
                                    ux7 ux7Var = new ux7(1);
                                    vrf0 vrf0Var = new vrf0();
                                    final krf0[] krf0VarArr3 = krf0VarArr2;
                                    final float f18 = fE4;
                                    final float f19 = f9;
                                    final float f20 = f8;
                                    final float f21 = fE5;
                                    final float f22 = f10;
                                    final float f23 = fE6;
                                    final float f24 = fE7;
                                    final float f25 = f16;
                                    final float f26 = f15;
                                    final float f27 = f17;
                                    final ytw ytwVar11 = ytwVar8;
                                    final ytw ytwVar12 = ytwVar9;
                                    final ytw ytwVar13 = ytwVar10;
                                    final boolean z3 = z2;
                                    final krf0 krf0Var4 = krf0Var3;
                                    final float f28 = fE;
                                    final float f29 = fE2;
                                    final float f30 = fE3;
                                    szrVar.d(Reader.READ_DONE, ux7Var, vrf0Var, new op8(-1708437705, new iaj() { // from class: wrf0
                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // defpackage.iaj
                                        public final Object d(Object obj6, Object obj7, Object obj8, Object obj9) {
                                            int i4;
                                            a.C0041a.C0042a c0042a2;
                                            int iIntValue2 = ((Integer) obj7).intValue();
                                            a aVar3 = (a) obj8;
                                            int iIntValue3 = ((Integer) obj9).intValue();
                                            ((gwr) obj6).getClass();
                                            if ((iIntValue3 & 48) == 0) {
                                                iIntValue3 |= aVar3.d(iIntValue2) ? 32 : 16;
                                            }
                                            if (aVar3.q(iIntValue3 & 1, (iIntValue3 & 145) != 144)) {
                                                Object objY16 = aVar3.y();
                                                float f31 = f18;
                                                float f32 = f20;
                                                float f33 = f21;
                                                a.C0041a.C0042a c0042a3 = a.C0041a.a;
                                                if (objY16 == c0042a3) {
                                                    objY16 = m.b(new k7f(jc1.a(f31 - f32, f33)));
                                                    aVar3.r(objY16);
                                                }
                                                ytw ytwVar14 = (ytw) objY16;
                                                Object objY17 = aVar3.y();
                                                if (objY17 == c0042a3) {
                                                    objY17 = androidx.compose.runtime.j.a(0.0f);
                                                    aVar3.r(objY17);
                                                }
                                                isw iswVar = (isw) objY17;
                                                Object objY18 = aVar3.y();
                                                float f34 = f23;
                                                if (objY18 == c0042a3) {
                                                    objY18 = m.b(new g7f(f34));
                                                    aVar3.r(objY18);
                                                }
                                                ytw ytwVar15 = (ytw) objY18;
                                                Unit unit2 = Unit.a;
                                                int i5 = iIntValue3 & 112;
                                                boolean z4 = i5 == 32;
                                                krf0[] krf0VarArr4 = krf0VarArr3;
                                                boolean zA = z4 | aVar3.A(krf0VarArr4) | aVar3.c(f31);
                                                float f35 = f19;
                                                boolean zC3 = zA | aVar3.c(f35) | aVar3.c(f32) | aVar3.c(f33);
                                                float f36 = f22;
                                                boolean zC4 = zC3 | aVar3.c(f36) | aVar3.c(f34);
                                                float f37 = f24;
                                                boolean zC5 = zC4 | aVar3.c(f37);
                                                Object objY19 = aVar3.y();
                                                if (zC5 || objY19 == c0042a3) {
                                                    i4 = iIntValue2;
                                                    c0042a2 = c0042a3;
                                                    objY19 = new fsf0.f(ytwVar11, i4, krf0VarArr4, f31, f35, f32, f33, f36, f34, f37, iswVar, ytwVar14, ytwVar15, null);
                                                    aVar3.r(objY19);
                                                } else {
                                                    i4 = iIntValue2;
                                                    c0042a2 = c0042a3;
                                                }
                                                xvf.e(aVar3, unit2, (Function2) objY19);
                                                krf0 krf0Var5 = krf0VarArr4[i4 % krf0VarArr4.length];
                                                boolean z5 = i5 == 32;
                                                final int i6 = i4;
                                                final float f38 = f25;
                                                boolean zC6 = aVar3.c(f38) | z5;
                                                final float f39 = f26;
                                                boolean zC7 = zC6 | aVar3.c(f39);
                                                final float f40 = f27;
                                                boolean zC8 = zC7 | aVar3.c(f40);
                                                Object objY20 = aVar3.y();
                                                if (zC8 || objY20 == c0042a2) {
                                                    final ytw ytwVar16 = ytwVar12;
                                                    final ytw ytwVar17 = ytwVar13;
                                                    Function0 function5 = new Function0() { // from class: xrf0
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            int i7 = (i6 - ((int) (f38 / f39))) - 1;
                                                            Integer numValueOf = Integer.valueOf(i7);
                                                            if (i7 <= 0) {
                                                                numValueOf = null;
                                                            }
                                                            int iIntValue4 = numValueOf != null ? numValueOf.intValue() : 0;
                                                            ytwVar16.setValue(new ep70(iIntValue4, (int) f40, true));
                                                            ytwVar17.setValue(Integer.valueOf(iIntValue4));
                                                            return Unit.a;
                                                        }
                                                    };
                                                    aVar3.r(function5);
                                                    objY20 = function5;
                                                }
                                                d.a aVar4 = d.a.b;
                                                d dVarH2 = g3w.h(g3w.f(aVar4, true, (Function0) objY20), krf0Var5.name());
                                                i78 i78VarA = g78.a(kw0.c, ht.a.n, aVar3, 48);
                                                int iHashCode = Long.hashCode(aVar3.m());
                                                ne00 ne00VarO = aVar3.o();
                                                d dVarC = c.c(aVar3, dVarH2);
                                                yka.k.getClass();
                                                tsr.a aVar5 = yka.a.b;
                                                if (aVar3.k() == null) {
                                                    l2a.b();
                                                    throw null;
                                                }
                                                aVar3.D();
                                                if (aVar3.g()) {
                                                    aVar3.F(aVar5);
                                                } else {
                                                    aVar3.p();
                                                }
                                                hlh0.a(aVar3, i78VarA, yka.a.f);
                                                hlh0.a(aVar3, ne00VarO, yka.a.e);
                                                yka.a.C1350a c1350a = yka.a.g;
                                                if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode))) {
                                                    j3c.a(iHashCode, aVar3, iHashCode, c1350a);
                                                }
                                                hlh0.a(aVar3, dVarC, yka.a.d);
                                                rrf0 aVar6 = (z3 && krf0Var5.a <= krf0Var4.a) ? new rrf0.a(iswVar.j()) : new rrf0.b(iswVar.j());
                                                qrf0.a(j.s(((k7f) ytwVar14.getValue()).a, h.h(aVar4, f28, 0.0f, 2)), krf0Var5, aVar6, new k7f(jc1.a(f29 - f32, f30 - f32)), aVar3, 0, 0);
                                                d dVarJ = h.j(aVar4, 0.0f, ((g7f) ytwVar15.getValue()).a, 0.0f, 0.0f, 13);
                                                String strA = cb40.a(krf0Var5.b, new Object[0], aVar3);
                                                long jM = mla.m(12.0f, aVar3);
                                                long jM2 = mla.m(16.0f, aVar3);
                                                lkf0.d(strA, dVarJ, fsf0.d(iswVar.j(), krf0Var5.c, c68.a(R.color.text_type2_primary, aVar3)), null, jM, null, new t9i(((int) (iswVar.j() * 400.0f)) + 500), f8i.b, 0L, null, null, jM2, 0, false, 0, 0, null, null, aVar3, 0, 0, 259880);
                                                aVar3.s();
                                            } else {
                                                aVar3.G();
                                            }
                                            return Unit.a;
                                        }
                                    }, true));
                                    return Unit.a;
                                }
                            };
                            aVar2.r(function4);
                            objY15 = function4;
                        }
                        aur.b(dVarH, zzrVar3, null, null, ht.a.k, l5f0Var, false, null, (Function1) objY15, aVar2, 196608, 412);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 3072, 6);
        } else {
            dVar2 = dVar;
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final androidx.compose.ui.d dVar3 = dVar2;
            eVarZ.d = new Function2(ib50Var, zzrVar, krf0Var, krf0Var2, z, function1, function0, i) { // from class: bsf0
                public final /* synthetic */ ib50 b;
                public final /* synthetic */ zzr c;
                public final /* synthetic */ krf0 d;
                public final /* synthetic */ krf0 e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ Function1 i;
                public final /* synthetic */ Function0 v;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(7);
                    fsf0.b(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final zzr zzrVar, final krf0 krf0Var, final krf0 krf0Var2, final String str, final String str2, final boolean z, final ib50 ib50Var, final Function1 function1, final Function1 function2, final Function0 function0, androidx.compose.runtime.a aVar, final int i) {
        zzrVar.getClass();
        krf0Var.getClass();
        krf0Var2.getClass();
        ib50Var.getClass();
        function1.getClass();
        function2.getClass();
        function0.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(2036941825);
        int i2 = i | (bVarI.M(zzrVar) ? 4 : 2) | (bVarI.d(krf0Var.ordinal()) ? 256 : 128) | (bVarI.d(krf0Var2.ordinal()) ? 2048 : 1024) | (bVarI.M(str) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.M(str2) ? 131072 : 65536) | (bVarI.b(z) ? 1048576 : 524288) | (bVarI.M(ib50Var) ? 8388608 : 4194304) | (bVarI.A(function1) ? 67108864 : 33554432) | (bVarI.A(function2) ? 536870912 : 268435456);
        if (bVarI.q(i2 & 1, ((306783379 & i2) == 306783378 && ((bVarI.A(function0) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(new trf0(0));
                bVarI.r(objY);
            }
            final ytw ytwVar = (ytw) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = androidx.compose.runtime.j.a(0.0f);
                bVarI.r(objY2);
            }
            final isw iswVar = (isw) objY2;
            q75.a(null, null, false, pp8.b(1880271595, new gaj() { // from class: urf0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    krf0 krf0Var3;
                    isw iswVar2;
                    final ytw ytwVar2;
                    r75 r75Var = (r75) obj;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    r75Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar2.M(r75Var) ? 4 : 2;
                    }
                    if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        float fD = r75Var.d() / 360.0f;
                        float f2 = (fD * 44.0f) - 44.0f;
                        float f3 = (-1.0f) * f2;
                        d.a aVar3 = d.a.b;
                        mw90.a(str, "banner", j.i(j.g(g.d(aVar3, 0.0f, f3, 1), 1.0f), 167.0f * fD), null, null, null, null, aVar2, 48, 2040);
                        mw90.a(str2, "logo", j.i(h.j(g.d(r75Var.b(aVar3, ht.a.b), 0.0f, f3, 1), 0.0f, (8.0f * fD) + 44.0f, 0.0f, 0.0f, 13), 60.0f * fD), null, null, d0b.a.c, null, aVar2, 1572912, 1976);
                        d dVarG = j.g(h.j(aVar3, 0.0f, (fD * 104.0f) - f2, 0.0f, 0.0f, 13), 1.0f);
                        i78 i78VarA = g78.a(kw0.c, ht.a.n, aVar2, 48);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = c.c(aVar2, dVarG);
                        yka.k.getClass();
                        tsr.a aVar4 = yka.a.b;
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar4);
                        } else {
                            aVar2.p();
                        }
                        hlh0.a(aVar2, i78VarA, yka.a.f);
                        hlh0.a(aVar2, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        hlh0.a(aVar2, dVarC, yka.a.d);
                        Object objY3 = aVar2.y();
                        a.C0041a.C0042a c0042a2 = a.C0041a.a;
                        if (objY3 == c0042a2) {
                            objY3 = androidx.compose.runtime.j.a(0.0f);
                            aVar2.r(objY3);
                        }
                        isw iswVar3 = (isw) objY3;
                        Unit unit = Unit.a;
                        krf0 krf0Var4 = krf0Var;
                        boolean zD = aVar2.d(krf0Var4.ordinal());
                        boolean z2 = z;
                        boolean zB = zD | aVar2.b(z2);
                        Function1 function3 = function2;
                        boolean zM = zB | aVar2.M(function3);
                        Object objY4 = aVar2.y();
                        ytw ytwVar3 = ytwVar;
                        isw iswVar4 = iswVar;
                        if (zM || objY4 == c0042a2) {
                            ksf0 ksf0Var = new ksf0(krf0Var4, z2, ytwVar3, function3, iswVar3, iswVar4, null);
                            krf0Var3 = krf0Var4;
                            iswVar2 = iswVar4;
                            aVar2.r(ksf0Var);
                            objY4 = ksf0Var;
                        } else {
                            krf0Var3 = krf0Var4;
                            iswVar2 = iswVar4;
                        }
                        xvf.e(aVar2, unit, (Function2) objY4);
                        lkf0.d(cb40.a(R.string.page_loyalty__current_tier, new Object[0], aVar2), dw.a(aVar3, iswVar3.j()), c68.a(R.color.text_type2_primary, aVar2), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, imf0.b(mla.l(R.style.B2_M, aVar2), 0L, 0L, new t9i(500), null, null, 0L, null, null, null, 0, 0L, null, null, 16777211), aVar2, 0, 0, 130040);
                        d dVarJ = h.j(aVar3, 0.0f, 4.0f, 0.0f, 0.0f, 13);
                        final Function1 function4 = function1;
                        boolean zM2 = aVar2.M(function4);
                        Object objY5 = aVar2.y();
                        if (zM2 || objY5 == c0042a2) {
                            ytwVar2 = ytwVar3;
                            objY5 = new Function1() { // from class: zrf0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    trf0 trf0Var = (trf0) obj4;
                                    trf0Var.getClass();
                                    ytwVar2.setValue(trf0Var);
                                    int i3 = trf0Var.a;
                                    uag uagVar = krf0.I;
                                    function4.invoke((krf0) uagVar.get(i3 % uagVar.b()));
                                    return Unit.a;
                                }
                            };
                            aVar2.r(objY5);
                        } else {
                            ytwVar2 = ytwVar3;
                        }
                        fsf0.b(dVarJ, ib50Var, zzrVar, krf0Var3, krf0Var2, z2, (Function1) objY5, function0, aVar2, 6);
                        fsf0.a(h.j(aVar3, 0.0f, 16.0f, 0.0f, 24.0f, 5), krf0.I.b(), (trf0) ytwVar2.getValue(), iswVar2.j(), aVar2, 6);
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 3072, 7);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(krf0Var, krf0Var2, str, str2, z, ib50Var, function1, function2, function0, i) { // from class: yrf0
                public final /* synthetic */ krf0 b;
                public final /* synthetic */ krf0 c;
                public final /* synthetic */ String d;
                public final /* synthetic */ String e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ ib50 i;
                public final /* synthetic */ Function1 v;
                public final /* synthetic */ Function1 w;
                public final /* synthetic */ Function0 y;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(49);
                    fsf0.c(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final long d(float f2, long j, long j2) {
        float fH = j58.h(j) - j58.h(j2);
        float fG = j58.g(j) - j58.g(j2);
        float fE = j58.e(j) - j58.e(j2);
        float fD = j58.d(j) - j58.d(j2);
        return r58.e(j58.h(j2) + (fH * f2), j58.g(j2) + (fG * f2), j58.g(j2) + (fE * f2), j58.d(j2) + (fD * f2), 16);
    }

    public static final float e(float f2, float f3) {
        return (f2 / 360.0f) * f3;
    }
}
