package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import androidx.recyclerview.widget.r;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import kotlin.text.StringsKt;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes4.dex */
public final class bzg0 {

    @c0d(c = "com.sporty.android.compose.ui.bethistory.TutorialBottomSheetKt$TutorialBottomSheetContent$1$1", f = "TutorialBottomSheet.kt", l = {146}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ zpz b;
        public final /* synthetic */ Function1<Integer, Unit> c;

        /* JADX INFO: renamed from: bzg0$a$a, reason: collision with other inner class name */
        public static final class C0148a<T> implements myh {
            public final /* synthetic */ Function1<Integer, Unit> a;

            /* JADX WARN: Multi-variable type inference failed */
            public C0148a(Function1<? super Integer, Unit> function1) {
                this.a = function1;
            }

            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                this.a.invoke(new Integer(((Number) obj).intValue()));
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(zpz zpzVar, Function1<? super Integer, Unit> function1, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = zpzVar;
            this.c = function1;
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
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                final zpz zpzVar = this.b;
                or60 or60VarC = n95.c(new Function0() { // from class: azg0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Integer.valueOf(zpzVar.k());
                    }
                });
                C0148a c0148a = new C0148a(this.c);
                this.a = 1;
                if (or60VarC.collect(c0148a, this) == y5bVar) {
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

    @c0d(c = "com.sporty.android.compose.ui.bethistory.TutorialBottomSheetKt$TutorialBottomSheetContent$3$3$1$1$1", f = "TutorialBottomSheet.kt", l = {r.d.DEFAULT_SWIPE_ANIMATION_DURATION}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ zpz b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(zpz zpzVar, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.b = zpzVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                zpz zpzVar = this.b;
                int iK = zpzVar.k() - 1;
                this.a = 1;
                if (zpzVar.f(iK, yi0.d(0.0f, 0.0f, null, 7), this) == y5bVar) {
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

    @c0d(c = "com.sporty.android.compose.ui.bethistory.TutorialBottomSheetKt$TutorialBottomSheetContent$3$3$3$1$1", f = "TutorialBottomSheet.kt", l = {292}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ zpz b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(zpz zpzVar, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.b = zpzVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new c(this.b, v1bVar);
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
                zpz zpzVar = this.b;
                int iK = zpzVar.k() + 1;
                this.a = 1;
                if (zpzVar.f(iK, yi0.d(0.0f, 0.0f, null, 7), this) == y5bVar) {
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

    public static final void a(final int i, final int i2, final long j, final long j2, d dVar, androidx.compose.runtime.a aVar, final int i3) {
        d dVar2;
        androidx.compose.runtime.b bVarI = aVar.i(-1289395360);
        int i4 = i3 | (bVarI.d(i) ? 4 : 2) | (bVarI.d(i2) ? 32 : 16) | (bVarI.e(j) ? 256 : 128) | (bVarI.e(j2) ? 2048 : 1024) | 24576;
        if (bVarI.q(i4 & 1, (i4 & 9363) != 9362)) {
            d160 d160VarA = b160.a(new kw0.i(8.0f, true, new hw0()), ht.a.j, bVarI, 6);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            dVar2 = d.a.b;
            d dVarC = androidx.compose.ui.c.c(bVarI, dVar2);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            bVarI.N(157955020);
            int i5 = 0;
            while (i5 < i) {
                g75.a(androidx.compose.foundation.a.b(ls7.a(j.r(dVar2, 8.0f), j060.a), i5 == i2 ? j : j2, zk40.a), bVarI, 0);
                i5++;
            }
            bVarI.X(false);
            bVarI.X(true);
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final d dVar3 = dVar2;
            eVarZ.d = new Function2(i, i2, j, j2, dVar3, i3) { // from class: ryg0
                public final /* synthetic */ int a;
                public final /* synthetic */ int b;
                public final /* synthetic */ long c;
                public final /* synthetic */ long d;
                public final /* synthetic */ d e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    bzg0.a(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0086  */
    /* JADX WARN: Code duplicated, block: B:49:0x008a  */
    /* JADX WARN: Code duplicated, block: B:51:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:54:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00af  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:79:0x010f  */
    /* JADX WARN: Code duplicated, block: B:82:0x011c  */
    /* JADX WARN: Code duplicated, block: B:83:0x012d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    public static final void b(final String str, final List list, final Function0 function0, Function1 function1, final String str2, String str3, float f, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        String str4;
        int i4;
        final float f2;
        int i5;
        boolean z;
        androidx.compose.runtime.b bVar;
        final String str5;
        final Function1 function2;
        e eVarZ;
        Function2<? super androidx.compose.runtime.a, ? super Integer, Unit> function3;
        Object objY;
        final Function1 function4;
        int i6;
        final String str6;
        list.getClass();
        function0.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-350921807);
        if ((i & 6) == 0) {
            i3 = (bVarI.M(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? bVarI.M(list) : bVarI.A(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= bVarI.A(function0) ? 256 : 128;
        }
        int i7 = i3 | 27648;
        if ((196608 & i) == 0) {
            i7 |= bVarI.M(str2) ? 131072 : 65536;
        }
        int i8 = i2 & 64;
        if (i8 == 0) {
            if ((1572864 & i) == 0) {
                str4 = str3;
                i7 |= bVarI.M(str4) ? 1048576 : 524288;
            }
            i4 = i2 & 128;
            if (i4 != 0) {
                if ((12582912 & i) == 0) {
                    f2 = f;
                    if (bVarI.c(f2)) {
                        i5 = 8388608;
                    } else {
                        i5 = 4194304;
                    }
                    i7 |= i5;
                }
                if ((4793491 & i7) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (bVarI.q(i7 & 1, z)) {
                    objY = bVarI.y();
                    if (objY == androidx.compose.runtime.a.C0041a.a) {
                        objY = new n0n(1);
                        bVarI.r(objY);
                    }
                    function4 = (Function1) objY;
                    if (i8 != 0) {
                        str6 = "";
                        i6 = i4;
                    } else {
                        i6 = i4;
                        str6 = str4;
                    }
                    if (i6 != 0) {
                        f2 = 1.380531f;
                    }
                    if (list.isEmpty()) {
                        eVarZ = bVarI.Z();
                        if (eVarZ != null) {
                            return;
                        } else {
                            function3 = new Function2() { // from class: syg0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    bzg0.b(str, list, function0, function4, str2, str6, f2, (a) obj, qj40.a(i | 1), i2);
                                    return Unit.a;
                                }
                            };
                        }
                    } else {
                        o0z.a(null, null, null, null, null, pp8.b(364934112, new Function2() { // from class: tyg0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                a aVar2 = (a) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    final List list2 = list;
                                    int iE = f.e(0, 0, b.j(list2));
                                    boolean zA = aVar2.A(list2);
                                    Object objY2 = aVar2.y();
                                    if (zA || objY2 == a.C0041a.a) {
                                        objY2 = new ish(list2, 2);
                                        aVar2.r(objY2);
                                    }
                                    final ved vedVarB = eqz.b(iE, (Function0) objY2, aVar2, 0, 2);
                                    j590 j590VarG = v1w.g(true, null, aVar2, 6, 2);
                                    d dVarB = v8j0.b(g3w.c(d.a.b));
                                    qyd0 qyd0Var = ajb0.a;
                                    i060 i060VarE = j060.e(((zib0) aVar2.O(qyd0Var)).d, ((zib0) aVar2.O(qyd0Var)).d, 0.0f, 0.0f, 12);
                                    long j = ((lib0) aVar2.O(oib0.a)).i0;
                                    final String str7 = str;
                                    final Function0 function5 = function0;
                                    final Function1 function6 = function4;
                                    final String str8 = str2;
                                    final String str9 = str6;
                                    final float f3 = f2;
                                    v1w.a(function5, dVarB, j590VarG, 0.0f, false, i060VarE, j, 0L, 0L, uy9.a, null, null, pp8.b(1010944830, new gaj() { // from class: vyg0
                                        @Override // defpackage.gaj
                                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                            a aVar3 = (a) obj4;
                                            int iIntValue2 = ((Integer) obj5).intValue();
                                            ((j78) obj3).getClass();
                                            if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                bzg0.c(str7, list2, vedVarB, function5, function6, str8, str9, f3, aVar3, 0, 0);
                                            } else {
                                                aVar3.G();
                                            }
                                            return Unit.a;
                                        }
                                    }, aVar2), aVar2, 0, 3078, 7064);
                                } else {
                                    aVar2.G();
                                }
                                return Unit.a;
                            }
                        }, bVarI), bVarI, 196608);
                        bVar = bVarI;
                        function2 = function4;
                        str5 = str6;
                        f2 = f2;
                    }
                    eVarZ.d = function3;
                }
                bVar = bVarI;
                bVar.G();
                str5 = str4;
                function2 = function1;
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    function3 = new Function2() { // from class: uyg0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            bzg0.b(str, list, function0, function2, str2, str5, f2, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                    eVarZ.d = function3;
                }
            }
            i7 |= 12582912;
            f2 = f;
            if ((4793491 & i7) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i7 & 1, z)) {
                objY = bVarI.y();
                if (objY == androidx.compose.runtime.a.C0041a.a) {
                    objY = new n0n(1);
                    bVarI.r(objY);
                }
                function4 = (Function1) objY;
                if (i8 != 0) {
                    str6 = "";
                    i6 = i4;
                } else {
                    i6 = i4;
                    str6 = str4;
                }
                if (i6 != 0) {
                    f2 = 1.380531f;
                }
                if (list.isEmpty()) {
                    eVarZ = bVarI.Z();
                    if (eVarZ != null) {
                        return;
                    } else {
                        function3 = new Function2() { // from class: syg0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                bzg0.b(str, list, function0, function4, str2, str6, f2, (a) obj, qj40.a(i | 1), i2);
                                return Unit.a;
                            }
                        };
                    }
                } else {
                    o0z.a(null, null, null, null, null, pp8.b(364934112, new Function2() { // from class: tyg0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            a aVar2 = (a) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                final List list2 = list;
                                int iE = f.e(0, 0, b.j(list2));
                                boolean zA = aVar2.A(list2);
                                Object objY2 = aVar2.y();
                                if (zA || objY2 == a.C0041a.a) {
                                    objY2 = new ish(list2, 2);
                                    aVar2.r(objY2);
                                }
                                final ved vedVarB = eqz.b(iE, (Function0) objY2, aVar2, 0, 2);
                                j590 j590VarG = v1w.g(true, null, aVar2, 6, 2);
                                d dVarB = v8j0.b(g3w.c(d.a.b));
                                qyd0 qyd0Var = ajb0.a;
                                i060 i060VarE = j060.e(((zib0) aVar2.O(qyd0Var)).d, ((zib0) aVar2.O(qyd0Var)).d, 0.0f, 0.0f, 12);
                                long j = ((lib0) aVar2.O(oib0.a)).i0;
                                final String str7 = str;
                                final Function0 function5 = function0;
                                final Function1 function6 = function4;
                                final String str8 = str2;
                                final String str9 = str6;
                                final float f3 = f2;
                                v1w.a(function5, dVarB, j590VarG, 0.0f, false, i060VarE, j, 0L, 0L, uy9.a, null, null, pp8.b(1010944830, new gaj() { // from class: vyg0
                                    @Override // defpackage.gaj
                                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                        a aVar3 = (a) obj4;
                                        int iIntValue2 = ((Integer) obj5).intValue();
                                        ((j78) obj3).getClass();
                                        if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                            bzg0.c(str7, list2, vedVarB, function5, function6, str8, str9, f3, aVar3, 0, 0);
                                        } else {
                                            aVar3.G();
                                        }
                                        return Unit.a;
                                    }
                                }, aVar2), aVar2, 0, 3078, 7064);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, bVarI), bVarI, 196608);
                    bVar = bVarI;
                    function2 = function4;
                    str5 = str6;
                    f2 = f2;
                }
                eVarZ.d = function3;
            }
            bVar = bVarI;
            bVar.G();
            str5 = str4;
            function2 = function1;
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                function3 = new Function2() { // from class: uyg0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        bzg0.b(str, list, function0, function2, str2, str5, f2, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
                eVarZ.d = function3;
            }
        }
        i7 |= 1572864;
        str4 = str3;
        i4 = i2 & 128;
        if (i4 != 0) {
            if ((12582912 & i) == 0) {
                f2 = f;
                if (bVarI.c(f2)) {
                    i5 = 8388608;
                } else {
                    i5 = 4194304;
                }
                i7 |= i5;
            }
            if ((4793491 & i7) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i7 & 1, z)) {
                objY = bVarI.y();
                if (objY == androidx.compose.runtime.a.C0041a.a) {
                    objY = new n0n(1);
                    bVarI.r(objY);
                }
                function4 = (Function1) objY;
                if (i8 != 0) {
                    str6 = "";
                    i6 = i4;
                } else {
                    i6 = i4;
                    str6 = str4;
                }
                if (i6 != 0) {
                    f2 = 1.380531f;
                }
                if (list.isEmpty()) {
                    eVarZ = bVarI.Z();
                    if (eVarZ != null) {
                        return;
                    } else {
                        function3 = new Function2() { // from class: syg0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                bzg0.b(str, list, function0, function4, str2, str6, f2, (a) obj, qj40.a(i | 1), i2);
                                return Unit.a;
                            }
                        };
                    }
                } else {
                    o0z.a(null, null, null, null, null, pp8.b(364934112, new Function2() { // from class: tyg0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            a aVar2 = (a) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                final List list2 = list;
                                int iE = f.e(0, 0, b.j(list2));
                                boolean zA = aVar2.A(list2);
                                Object objY2 = aVar2.y();
                                if (zA || objY2 == a.C0041a.a) {
                                    objY2 = new ish(list2, 2);
                                    aVar2.r(objY2);
                                }
                                final ved vedVarB = eqz.b(iE, (Function0) objY2, aVar2, 0, 2);
                                j590 j590VarG = v1w.g(true, null, aVar2, 6, 2);
                                d dVarB = v8j0.b(g3w.c(d.a.b));
                                qyd0 qyd0Var = ajb0.a;
                                i060 i060VarE = j060.e(((zib0) aVar2.O(qyd0Var)).d, ((zib0) aVar2.O(qyd0Var)).d, 0.0f, 0.0f, 12);
                                long j = ((lib0) aVar2.O(oib0.a)).i0;
                                final String str7 = str;
                                final Function0 function5 = function0;
                                final Function1 function6 = function4;
                                final String str8 = str2;
                                final String str9 = str6;
                                final float f3 = f2;
                                v1w.a(function5, dVarB, j590VarG, 0.0f, false, i060VarE, j, 0L, 0L, uy9.a, null, null, pp8.b(1010944830, new gaj() { // from class: vyg0
                                    @Override // defpackage.gaj
                                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                        a aVar3 = (a) obj4;
                                        int iIntValue2 = ((Integer) obj5).intValue();
                                        ((j78) obj3).getClass();
                                        if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                            bzg0.c(str7, list2, vedVarB, function5, function6, str8, str9, f3, aVar3, 0, 0);
                                        } else {
                                            aVar3.G();
                                        }
                                        return Unit.a;
                                    }
                                }, aVar2), aVar2, 0, 3078, 7064);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, bVarI), bVarI, 196608);
                    bVar = bVarI;
                    function2 = function4;
                    str5 = str6;
                    f2 = f2;
                }
                eVarZ.d = function3;
            }
            bVar = bVarI;
            bVar.G();
            str5 = str4;
            function2 = function1;
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                function3 = new Function2() { // from class: uyg0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        bzg0.b(str, list, function0, function2, str2, str5, f2, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
                eVarZ.d = function3;
            }
        }
        i7 |= 12582912;
        f2 = f;
        if ((4793491 & i7) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (bVarI.q(i7 & 1, z)) {
            objY = bVarI.y();
            if (objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new n0n(1);
                bVarI.r(objY);
            }
            function4 = (Function1) objY;
            if (i8 != 0) {
                str6 = "";
                i6 = i4;
            } else {
                i6 = i4;
                str6 = str4;
            }
            if (i6 != 0) {
                f2 = 1.380531f;
            }
            if (list.isEmpty()) {
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    return;
                } else {
                    function3 = new Function2() { // from class: syg0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            bzg0.b(str, list, function0, function4, str2, str6, f2, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            } else {
                o0z.a(null, null, null, null, null, pp8.b(364934112, new Function2() { // from class: tyg0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        a aVar2 = (a) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            final List list2 = list;
                            int iE = f.e(0, 0, b.j(list2));
                            boolean zA = aVar2.A(list2);
                            Object objY2 = aVar2.y();
                            if (zA || objY2 == a.C0041a.a) {
                                objY2 = new ish(list2, 2);
                                aVar2.r(objY2);
                            }
                            final ved vedVarB = eqz.b(iE, (Function0) objY2, aVar2, 0, 2);
                            j590 j590VarG = v1w.g(true, null, aVar2, 6, 2);
                            d dVarB = v8j0.b(g3w.c(d.a.b));
                            qyd0 qyd0Var = ajb0.a;
                            i060 i060VarE = j060.e(((zib0) aVar2.O(qyd0Var)).d, ((zib0) aVar2.O(qyd0Var)).d, 0.0f, 0.0f, 12);
                            long j = ((lib0) aVar2.O(oib0.a)).i0;
                            final String str7 = str;
                            final Function0 function5 = function0;
                            final Function1 function6 = function4;
                            final String str8 = str2;
                            final String str9 = str6;
                            final float f3 = f2;
                            v1w.a(function5, dVarB, j590VarG, 0.0f, false, i060VarE, j, 0L, 0L, uy9.a, null, null, pp8.b(1010944830, new gaj() { // from class: vyg0
                                @Override // defpackage.gaj
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    a aVar3 = (a) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    ((j78) obj3).getClass();
                                    if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                        bzg0.c(str7, list2, vedVarB, function5, function6, str8, str9, f3, aVar3, 0, 0);
                                    } else {
                                        aVar3.G();
                                    }
                                    return Unit.a;
                                }
                            }, aVar2), aVar2, 0, 3078, 7064);
                        } else {
                            aVar2.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI, 196608);
                bVar = bVarI;
                function2 = function4;
                str5 = str6;
                f2 = f2;
            }
            eVarZ.d = function3;
        }
        bVar = bVarI;
        bVar.G();
        str5 = str4;
        function2 = function1;
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            function3 = new Function2() { // from class: uyg0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    bzg0.b(str, list, function0, function2, str2, str5, f2, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
            eVarZ.d = function3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:155:0x0446  */
    /* JADX WARN: Code duplicated, block: B:158:0x044f  */
    /* JADX WARN: Code duplicated, block: B:160:0x0453  */
    /* JADX WARN: Code duplicated, block: B:163:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:165:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:168:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:169:0x0501  */
    /* JADX WARN: Code duplicated, block: B:174:0x050d  */
    /* JADX WARN: Code duplicated, block: B:177:0x0562  */
    /* JADX WARN: Code duplicated, block: B:179:0x0568  */
    /* JADX WARN: Code duplicated, block: B:184:0x0586  */
    public static final void c(final String str, final List<ezg0> list, zpz zpzVar, final Function0<Unit> function0, final Function1<? super Integer, Unit> function1, final String str2, String str3, float f, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        String str4;
        int i4;
        final float f2;
        int i5;
        final zpz zpzVar2;
        final float f3;
        final String str5;
        tsr.a aVar2;
        yka.a.C1350a c1350a;
        long j;
        androidx.compose.runtime.a.C0041a.C0042a c0042a;
        yka.a.C1350a c1350a2;
        float f4;
        tsr.a aVar3;
        long j2;
        boolean z;
        boolean z2;
        Object objY;
        int iHashCode;
        androidx.compose.runtime.b bVarI = aVar.i(365990317);
        if ((i & 6) == 0) {
            i3 = (bVarI.M(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i3 | (bVarI.M(list) ? 32 : 16) | (bVarI.M(zpzVar) ? 256 : 128);
        if ((i & 3072) == 0) {
            i6 |= bVarI.A(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i6 |= bVarI.A(function1) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i6 |= bVarI.M(str2) ? 131072 : 65536;
        }
        int i7 = i2 & 64;
        if (i7 != 0) {
            i4 = i6 | 1572864;
            str4 = str3;
        } else {
            str4 = str3;
            i4 = i6 | (bVarI.M(str4) ? 1048576 : 524288);
        }
        int i8 = i2 & 128;
        if (i8 != 0) {
            i5 = i4 | 12582912;
            f2 = f;
        } else {
            f2 = f;
            i5 = i4 | (bVarI.c(f2) ? 8388608 : 4194304);
        }
        if (bVarI.q(i5 & 1, (i5 & 4793491) != 4793490)) {
            String str6 = i7 != 0 ? "" : str4;
            if (i8 != 0) {
                f2 = 1.380531f;
            }
            Object objY2 = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a2 = androidx.compose.runtime.a.C0041a.a;
            if (objY2 == c0042a2) {
                objY2 = xvf.i(kotlin.coroutines.e.a, bVarI);
                bVarI.r(objY2);
            }
            final v5b v5bVar = (v5b) objY2;
            boolean z3 = zpzVar.k() > 0;
            int i9 = i5 & 896;
            final boolean z4 = zpzVar.k() < kotlin.collections.b.j(list);
            boolean z5 = (i9 == 256) | ((i5 & 57344) == 16384);
            Object objY3 = bVarI.y();
            if (z5 || objY3 == c0042a2) {
                objY3 = new a(zpzVar, function1, null);
                bVarI.r(objY3);
            }
            int i10 = (i5 >> 6) & 14;
            xvf.e(bVarI, zpzVar, (Function2) objY3);
            boolean zU = StringsKt.U(str6);
            d.a aVar4 = d.a.b;
            int i11 = i5;
            String str7 = str6;
            d dVarN = androidx.compose.foundation.a.b(j.g(aVar4, 1.0f), fjb0.b(bVarI).i0, zk40.a).n(!zU ? c9j.c(aVar4, AnalyticsEvent.FS_ATTRIBUTE_DATA_OP, str6) : aVar4);
            Object objY4 = bVarI.y();
            if (objY4 == c0042a2) {
                objY4 = new wyg0();
                bVarI.r(objY4);
            }
            d dVarB = xa80.b(dVarN, false, (Function1) objY4);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = androidx.compose.ui.c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar5 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar5);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a3 = yka.a.g;
            final boolean z6 = z3;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a3);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d dVarI = h.i(j.g(aVar4, 1.0f), 24.0f, 8.0f, 8.0f, 16.0f);
            kw0.j jVar = kw0.a;
            n54.b bVar2 = ht.a.k;
            d160 d160VarA = b160.a(jVar, bVar2, bVarI, 48);
            int iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarI);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar5);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a3);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            imf0 imf0Var = fjb0.e(bVarI).d;
            long j3 = fjb0.b(bVarI).a;
            if (1.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            lkf0.d(str, g3w.h(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), str2.concat("_title_text")), j3, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0Var, bVarI, i11 & 14, 0, 131064);
            c6n.a(function0, c9j.c(aVar4, AnalyticsEvent.FS_ATTRIBUTE_DATA_OP, "system__feature_hint_close_btn"), false, null, null, uy9.b, bVarI, ((i11 >> 9) & 14) | 1572864, 60);
            bVarI.X(true);
            float f5 = f2;
            dpz.a(0.0f, 0, i10, 16380, null, pp8.b(1795546980, new iaj() { // from class: xyg0
                /* JADX WARN: Code duplicated, block: B:20:0x006d  */
                @Override // defpackage.iaj
                public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
                    float fIntBitsToFloat;
                    final int iIntValue = ((Integer) obj2).intValue();
                    a aVar6 = (a) obj3;
                    int iIntValue2 = ((Integer) obj4).intValue();
                    ((opz) obj).getClass();
                    if ((iIntValue2 & 48) == 0) {
                        iIntValue2 |= aVar6.d(iIntValue) ? 32 : 16;
                    }
                    if (aVar6.q(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                        final b01 b01VarA = nw90.a(((ezg0) list.get(iIntValue)).a, aVar6);
                        long jI = b01VarA.i();
                        if (jI != 9205357640488583168L) {
                            int i12 = (int) (4294967295L & jI);
                            if (Float.intBitsToFloat(i12) > 0.0f) {
                                fIntBitsToFloat = Float.intBitsToFloat((int) (jI >> 32)) / Float.intBitsToFloat(i12);
                            } else {
                                fIntBitsToFloat = f2;
                            }
                        } else {
                            fIntBitsToFloat = f2;
                        }
                        rg6.a(c.a(j.g(d.a.b, 1.0f), fIntBitsToFloat), j060.c(4.0f), gg6.b(j58.l, 0L, aVar6, 24582, 14), gg6.c(62, 1.0f), null, pp8.b(-1396923050, new gaj() { // from class: qyg0
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                a aVar7 = (a) obj6;
                                int iIntValue3 = ((Integer) obj7).intValue();
                                ((j78) obj5).getClass();
                                if (aVar7.q(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                    h9n.a(b01VarA, "Tutorial Image", c9j.d(j.e(d.a.b, 1.0f), "system__feature_hint_img_" + (iIntValue + 1)), null, d0b.a.b, 0.0f, null, aVar7, 24624, 104);
                                } else {
                                    aVar7.G();
                                }
                                return Unit.a;
                            }
                        }, aVar6), aVar6, 196608, 16);
                    } else {
                        aVar6.G();
                    }
                    return Unit.a;
                }
            }, bVarI), null, null, null, null, zpzVar, null, null, bVarI, k78.a(ht.a.n, j.y(h.h(j.g(aVar4, 1.0f), 24.0f, 0.0f, 2), 0.0f, 312.0f, 1)), null, false);
            zpzVar2 = zpzVar;
            ty0.a(bVarI, j.i(aVar4, 16.0f));
            d dVarI2 = j.i(j.g(h.j(aVar4, 24.0f, 0.0f, 24.0f, 0.0f, 10), 1.0f), 60.0f);
            d160 d160VarA2 = b160.a(kw0.g, bVar2, bVarI, 54);
            int iHashCode4 = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = androidx.compose.ui.c.c(bVarI, dVarI2);
            bVarI.D();
            if (bVarI.S) {
                aVar2 = aVar5;
                bVarI.F(aVar2);
            } else {
                aVar2 = aVar5;
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA2, bVar);
            hlh0.a(bVarI, ne00VarS3, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode4))) {
                c1350a = c1350a3;
                n30.a(iHashCode4, bVarI, iHashCode4, c1350a);
            } else {
                c1350a = c1350a3;
            }
            hlh0.a(bVarI, dVarC3, cVar);
            d dVarR = j.r(aVar4, 44.0f);
            if (z6) {
                bVarI.N(-1698468425);
                j = fjb0.b(bVarI).D;
                bVarI.X(false);
            } else {
                bVarI.N(-1698386213);
                j = fjb0.b(bVarI).s0;
                bVarI.X(false);
            }
            i060 i060Var = j060.a;
            d dVarH = g3w.h(androidx.compose.foundation.a.b(dVarR, j, i060Var), str2.concat("_previous_button"));
            boolean zA = bVarI.A(v5bVar) | (i9 == 256);
            Object objY5 = bVarI.y();
            if (zA) {
                c0042a = c0042a2;
            } else {
                c0042a = c0042a2;
                if (objY5 == c0042a) {
                }
                c1350a2 = c1350a;
                androidx.compose.runtime.a.C0041a.C0042a c0042a3 = c0042a;
                c6n.a((Function0) objY5, dVarH, z6, null, null, pp8.b(-372988132, new Function2() { // from class: zyg0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        long j4;
                        a aVar6 = (a) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (aVar6.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            d dVarR2 = j.r(d.a.b, 15.0f);
                            crz crzVarA = erz.a(R.drawable.ic_arrow_left, 0, aVar6);
                            if (z6) {
                                aVar6.N(-608786467);
                                j4 = ((lib0) aVar6.O(oib0.a)).a0;
                                aVar6.H();
                            } else {
                                aVar6.N(-608708316);
                                j4 = ((lib0) aVar6.O(oib0.a)).Q;
                                aVar6.H();
                            }
                            h6n.b(crzVarA, "previous", dVarR2, j4, aVar6, 432, 0);
                        } else {
                            aVar6.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI, 1572864, 56);
                String str8 = list.get(zpzVar2.k()).b;
                imf0 imf0Var2 = fjb0.e(bVarI).f;
                long j4 = fjb0.b(bVarI).a;
                if (1.0f <= 0.0d) {
                    ukn.a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f4 = Float.MAX_VALUE;
                } else {
                    f4 = 1.0f;
                }
                aVar3 = aVar2;
                lkf0.d(str8, g3w.h(h.h(new LayoutWeightElement(f4, true), 12.0f, 0.0f, 2), str2 + "_description_" + zpzVar2.k()), j4, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, imf0Var2, bVarI, 0, 0, 130040);
                d dVarR2 = j.r(aVar4, 44.0f);
                if (z4) {
                    bVarI.N(-1696853449);
                    j2 = fjb0.b(bVarI).D;
                    bVarI.X(false);
                } else {
                    bVarI.N(-1696771237);
                    j2 = fjb0.b(bVarI).s0;
                    bVarI.X(false);
                }
                d dVarH2 = g3w.h(androidx.compose.foundation.a.b(dVarR2, j2, i060Var), str2.concat("_next_button"));
                boolean zA2 = bVarI.A(v5bVar);
                if (i9 == 256) {
                    z = true;
                } else {
                    z = false;
                }
                z2 = zA2 | z;
                objY = bVarI.y();
                if (z2 || objY == c0042a3) {
                    objY = new Function0() { // from class: nyg0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            ej5.c(v5bVar, null, null, new bzg0.c(zpzVar2, null), 3);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY);
                }
                c6n.a((Function0) objY, dVarH2, z4, null, null, pp8.b(1379584275, new Function2() { // from class: oyg0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        long j5;
                        a aVar6 = (a) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (aVar6.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            d dVarR3 = j.r(d.a.b, 15.0f);
                            crz crzVarA = erz.a(R.drawable.ic_arrow_right, 0, aVar6);
                            if (z4) {
                                aVar6.N(653337318);
                                j5 = ((lib0) aVar6.O(oib0.a)).a0;
                                aVar6.H();
                            } else {
                                aVar6.N(653415469);
                                j5 = ((lib0) aVar6.O(oib0.a)).Q;
                                aVar6.H();
                            }
                            h6n.b(crzVarA, "next", dVarR3, j5, aVar6, 432, 0);
                        } else {
                            aVar6.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI, 1572864, 56);
                szg.a(bVarI, true, aVar4, 8.0f, bVarI);
                d dVarJ = h.j(j.g(aVar4, 1.0f), 0.0f, 10.0f, 0.0f, 24.0f, 5);
                aiv aivVarC = g75.c(ht.a.e, false);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS4 = bVarI.S();
                d dVarC4 = androidx.compose.ui.c.c(bVarI, dVarJ);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC, bVar);
                hlh0.a(bVarI, ne00VarS4, dVar);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a2);
                }
                hlh0.a(bVarI, dVarC4, cVar);
                a(list.size(), zpzVar2.k(), fjb0.b(bVarI).T, fjb0.b(bVarI).B, null, bVarI, 0);
                bVarI = bVarI;
                bVarI.X(true);
                bVarI.X(true);
                f3 = f5;
                str5 = str7;
            }
            objY5 = new Function0() { // from class: yyg0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    ej5.c(v5bVar, null, null, new bzg0.b(zpzVar2, null), 3);
                    return Unit.a;
                }
            };
            bVarI.r(objY5);
            c1350a2 = c1350a;
            androidx.compose.runtime.a.C0041a.C0042a c0042a4 = c0042a;
            c6n.a((Function0) objY5, dVarH, z6, null, null, pp8.b(-372988132, new Function2() { // from class: zyg0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    long j5;
                    a aVar6 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar6.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        d dVarR3 = j.r(d.a.b, 15.0f);
                        crz crzVarA = erz.a(R.drawable.ic_arrow_left, 0, aVar6);
                        if (z6) {
                            aVar6.N(-608786467);
                            j5 = ((lib0) aVar6.O(oib0.a)).a0;
                            aVar6.H();
                        } else {
                            aVar6.N(-608708316);
                            j5 = ((lib0) aVar6.O(oib0.a)).Q;
                            aVar6.H();
                        }
                        h6n.b(crzVarA, "previous", dVarR3, j5, aVar6, 432, 0);
                    } else {
                        aVar6.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 1572864, 56);
            String str9 = list.get(zpzVar2.k()).b;
            imf0 imf0Var3 = fjb0.e(bVarI).f;
            long j5 = fjb0.b(bVarI).a;
            if (1.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f4 = Float.MAX_VALUE;
            } else {
                f4 = 1.0f;
            }
            aVar3 = aVar2;
            lkf0.d(str9, g3w.h(h.h(new LayoutWeightElement(f4, true), 12.0f, 0.0f, 2), str2 + "_description_" + zpzVar2.k()), j5, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, imf0Var3, bVarI, 0, 0, 130040);
            d dVarR3 = j.r(aVar4, 44.0f);
            if (z4) {
                bVarI.N(-1696853449);
                j2 = fjb0.b(bVarI).D;
                bVarI.X(false);
            } else {
                bVarI.N(-1696771237);
                j2 = fjb0.b(bVarI).s0;
                bVarI.X(false);
            }
            d dVarH3 = g3w.h(androidx.compose.foundation.a.b(dVarR3, j2, i060Var), str2.concat("_next_button"));
            boolean zA3 = bVarI.A(v5bVar);
            if (i9 == 256) {
                z = true;
            } else {
                z = false;
            }
            z2 = zA3 | z;
            objY = bVarI.y();
            if (z2) {
                objY = new Function0() { // from class: nyg0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        ej5.c(v5bVar, null, null, new bzg0.c(zpzVar2, null), 3);
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            } else {
                objY = new Function0() { // from class: nyg0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        ej5.c(v5bVar, null, null, new bzg0.c(zpzVar2, null), 3);
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            c6n.a((Function0) objY, dVarH3, z4, null, null, pp8.b(1379584275, new Function2() { // from class: oyg0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    long j6;
                    a aVar6 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar6.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        d dVarR4 = j.r(d.a.b, 15.0f);
                        crz crzVarA = erz.a(R.drawable.ic_arrow_right, 0, aVar6);
                        if (z4) {
                            aVar6.N(653337318);
                            j6 = ((lib0) aVar6.O(oib0.a)).a0;
                            aVar6.H();
                        } else {
                            aVar6.N(653415469);
                            j6 = ((lib0) aVar6.O(oib0.a)).Q;
                            aVar6.H();
                        }
                        h6n.b(crzVarA, "next", dVarR4, j6, aVar6, 432, 0);
                    } else {
                        aVar6.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 1572864, 56);
            szg.a(bVarI, true, aVar4, 8.0f, bVarI);
            d dVarJ2 = h.j(j.g(aVar4, 1.0f), 0.0f, 10.0f, 0.0f, 24.0f, 5);
            aiv aivVarC2 = g75.c(ht.a.e, false);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS5 = bVarI.S();
            d dVarC5 = androidx.compose.ui.c.c(bVarI, dVarJ2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC2, bVar);
            hlh0.a(bVarI, ne00VarS5, dVar);
            if (bVarI.S) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a2);
            } else {
                n30.a(iHashCode, bVarI, iHashCode, c1350a2);
            }
            hlh0.a(bVarI, dVarC5, cVar);
            a(list.size(), zpzVar2.k(), fjb0.b(bVarI).T, fjb0.b(bVarI).B, null, bVarI, 0);
            bVarI = bVarI;
            bVarI.X(true);
            bVarI.X(true);
            f3 = f5;
            str5 = str7;
        } else {
            zpzVar2 = zpzVar;
            bVarI.G();
            f3 = f2;
            str5 = str4;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: pyg0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    bzg0.c(str, list, zpzVar2, function0, function1, str2, str5, f3, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }
}
