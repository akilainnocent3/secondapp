package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.l;
import androidx.compose.runtime.m;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.layout.v;
import com.sportygames.newcms.CMSRes;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
public final class eqj {
    public static final CMSRes[] a;
    public static final CMSRes[] b;
    public static final CMSRes[] c;
    public static final CMSRes[] d;
    public static final List<CMSRes> e;

    @c0d(c = "com.sportygames.piggybash.presentation.screens.GameplayScreenKt$GameEndedEffect$1$1", f = "GameplayScreen.kt", l = {444}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ Function1<ap20, Unit> c;
        public final /* synthetic */ ap20 d;
        public final /* synthetic */ boolean e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(boolean z, Function1<? super ap20, Unit> function1, ap20 ap20Var, boolean z2, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = z;
            this.c = function1;
            this.d = ap20Var;
            this.e = z2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, this.d, this.e, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0031  */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            ap20 ap20Var = this.d;
            Function1<ap20, Unit> function1 = this.c;
            if (i == 0) {
                uj50.b(obj);
                if (this.b) {
                    this.a = 1;
                    if (hkd.b(6000L, this) == y5bVar) {
                        return y5bVar;
                    }
                }
                if (this.e) {
                    function1.invoke(ap20Var);
                }
                return Unit.a;
            }
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            function1.invoke(ap20Var);
            if (this.e) {
                function1.invoke(ap20Var);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.piggybash.presentation.screens.GameplayScreenKt$GamePlaySoundPlay$1$1", f = "GameplayScreen.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ ytw b;
        public final /* synthetic */ com.sportygames.newcms.b c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z, ytw ytwVar, com.sportygames.newcms.b bVar, v1b v1bVar) {
            super(2, v1bVar);
            this.a = z;
            this.b = ytwVar;
            this.c = bVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.a, this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (this.a && ((Boolean) this.b.getValue()).booleanValue()) {
                this.c.c(lu00.b2.Z1);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.piggybash.presentation.screens.GameplayScreenKt$GamePlaySoundPlay$2$1", f = "GameplayScreen.kt", l = {472}, m = "invokeSuspend", v = 1)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ a390<ooj> b;
        public final /* synthetic */ ytw c;
        public final /* synthetic */ com.sportygames.newcms.b d;
        public final /* synthetic */ int[] e;
        public final /* synthetic */ int[] f;
        public final /* synthetic */ int[] i;
        public final /* synthetic */ int[] v;

        public static final class a<T> implements myh {
            public final /* synthetic */ ytw a;
            public final /* synthetic */ com.sportygames.newcms.b b;
            public final /* synthetic */ int[] c;
            public final /* synthetic */ int[] d;
            public final /* synthetic */ int[] e;
            public final /* synthetic */ int[] f;

            public a(ytw ytwVar, com.sportygames.newcms.b bVar, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
                this.a = ytwVar;
                this.b = bVar;
                this.c = iArr;
                this.d = iArr2;
                this.e = iArr3;
                this.f = iArr4;
            }

            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                ooj oojVar = (ooj) obj;
                ytw ytwVar = this.a;
                boolean zBooleanValue = ((Boolean) ytwVar.getValue()).booleanValue();
                com.sportygames.newcms.b bVar = this.b;
                if (zBooleanValue && (oojVar instanceof ooj.e)) {
                    ooj.e eVar = (ooj.e) oojVar;
                    String str = eVar.a;
                    if (Intrinsics.g(str, "Fly away")) {
                        bVar.c(lu00.b2.V1);
                    } else if (eVar.c) {
                        CMSRes[] cMSResArr = eqj.a;
                        int[] iArr = this.c;
                        bVar.c(cMSResArr[iArr[0]]);
                        iArr[0] = (iArr[0] + 1) % cMSResArr.length;
                    } else if (kotlin.text.c.u(str, "Expression", false)) {
                        CMSRes[] cMSResArr2 = eqj.b;
                        int[] iArr2 = this.d;
                        bVar.c(cMSResArr2[iArr2[0]]);
                        iArr2[0] = (iArr2[0] + 1) % cMSResArr2.length;
                        int i = eVar.d;
                        if (1 <= i) {
                            List<CMSRes> list = eqj.e;
                            if (i <= list.size()) {
                                bVar.c(list.get(i - 1));
                            }
                        }
                    }
                }
                if (((Boolean) ytwVar.getValue()).booleanValue()) {
                    if (oojVar instanceof ooj.d) {
                        CMSRes[] cMSResArr3 = eqj.d;
                        int[] iArr3 = this.e;
                        bVar.c(cMSResArr3[iArr3[0]]);
                        iArr3[0] = (iArr3[0] + 1) % cMSResArr3.length;
                    } else if (oojVar instanceof ooj.c) {
                        CMSRes[] cMSResArr4 = eqj.c;
                        int[] iArr4 = this.f;
                        bVar.c(cMSResArr4[iArr4[0]]);
                        iArr4[0] = (iArr4[0] + 1) % cMSResArr4.length;
                        if (((ooj.c) oojVar).a.c) {
                            bVar.c(lu00.b2.S1);
                        } else {
                            bVar.c(lu00.b2.Y1);
                        }
                    }
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(a390 a390Var, ytw ytwVar, com.sportygames.newcms.b bVar, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, v1b v1bVar) {
            super(2, v1bVar);
            this.b = a390Var;
            this.c = ytwVar;
            this.d = bVar;
            this.e = iArr;
            this.f = iArr2;
            this.i = iArr3;
            this.v = iArr4;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new c(this.b, this.c, this.d, this.e, this.f, this.i, this.v, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            return y5b.a;
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                a aVar = new a(this.c, this.d, this.e, this.f, this.i, this.v);
                this.a = 1;
                if (this.b.collect(aVar, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            fkd.a();
            return null;
        }
    }

    @c0d(c = "com.sportygames.piggybash.presentation.screens.GameplayScreenKt$GameplayScreen$1$1", f = "GameplayScreen.kt", l = {234, 236}, m = "invokeSuspend", v = 1)
    public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ drj b;
        public final /* synthetic */ ytw<Boolean> c;
        public final /* synthetic */ ytw<Boolean> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(drj drjVar, ytw<Boolean> ytwVar, ytw<Boolean> ytwVar2, v1b<? super d> v1bVar) {
            super(2, v1bVar);
            this.b = drjVar;
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

        /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
        
            if (defpackage.hkd.b(1300, r7) == r0) goto L17;
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
                ytw<java.lang.Boolean> r2 = r7.c
                r3 = 2
                ytw<java.lang.Boolean> r4 = r7.d
                r5 = 1
                if (r1 == 0) goto L1f
                if (r1 == r5) goto L1b
                if (r1 != r3) goto L14
                defpackage.uj50.b(r8)
                goto L51
            L14:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r7)
                r7 = 0
                return r7
            L1b:
                defpackage.uj50.b(r8)
                goto L3f
            L1f:
                defpackage.uj50.b(r8)
                drj r8 = r7.b
                boolean r8 = r8.l
                if (r8 == 0) goto L59
                com.sportygames.newcms.CMSRes[] r8 = defpackage.eqj.a
                java.lang.Boolean r8 = java.lang.Boolean.TRUE
                r2.setValue(r8)
                java.lang.Boolean r8 = java.lang.Boolean.FALSE
                r4.setValue(r8)
                r7.a = r5
                r5 = 200(0xc8, double:9.9E-322)
                java.lang.Object r8 = defpackage.hkd.b(r5, r7)
                if (r8 != r0) goto L3f
                goto L50
            L3f:
                com.sportygames.newcms.CMSRes[] r8 = defpackage.eqj.a
                java.lang.Boolean r8 = java.lang.Boolean.TRUE
                r4.setValue(r8)
                r7.a = r3
                r3 = 1300(0x514, double:6.423E-321)
                java.lang.Object r7 = defpackage.hkd.b(r3, r7)
                if (r7 != r0) goto L51
            L50:
                return r0
            L51:
                com.sportygames.newcms.CMSRes[] r7 = defpackage.eqj.a
                java.lang.Boolean r7 = java.lang.Boolean.FALSE
                r2.setValue(r7)
                goto L63
            L59:
                com.sportygames.newcms.CMSRes[] r7 = defpackage.eqj.a
                java.lang.Boolean r7 = java.lang.Boolean.FALSE
                r2.setValue(r7)
                r4.setValue(r7)
            L63:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: eqj.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportygames.piggybash.presentation.screens.GameplayScreenKt$GameplayScreen$2$1", f = "GameplayScreen.kt", l = {244}, m = "invokeSuspend", v = 1)
    public static final class e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ Map<Long, gly> A;
        public final /* synthetic */ ytw B;
        public final /* synthetic */ Map<Long, s28> C;
        public final /* synthetic */ m6a0<Long, Boolean> D;
        public final /* synthetic */ SnapshotStateList<q28> E;
        public final /* synthetic */ ytw<Long> F;
        public final /* synthetic */ Map<Long, c9p> G;
        public final /* synthetic */ m6a0<Long, Long> H;
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ a390<ooj> c;
        public final /* synthetic */ Map<Long, c9p> d;
        public final /* synthetic */ m6a0<Long, String> e;
        public final /* synthetic */ Map<Long, c9p> f;
        public final /* synthetic */ Map<Long, c9p> i;
        public final /* synthetic */ m6a0<Long, pr50> v;
        public final /* synthetic */ m6a0<Long, Boolean> w;
        public final /* synthetic */ long[] y;
        public final /* synthetic */ xsw z;

        public static final class a<T> implements myh {
            public final /* synthetic */ Map<Long, s28> A;
            public final /* synthetic */ m6a0<Long, Boolean> B;
            public final /* synthetic */ SnapshotStateList<q28> C;
            public final /* synthetic */ ytw<Long> D;
            public final /* synthetic */ Map<Long, c9p> E;
            public final /* synthetic */ m6a0<Long, Long> F;
            public final /* synthetic */ Map<Long, c9p> a;
            public final /* synthetic */ m6a0<Long, String> b;
            public final /* synthetic */ v5b c;
            public final /* synthetic */ Map<Long, c9p> d;
            public final /* synthetic */ Map<Long, c9p> e;
            public final /* synthetic */ m6a0<Long, pr50> f;
            public final /* synthetic */ m6a0<Long, Boolean> i;
            public final /* synthetic */ long[] v;
            public final /* synthetic */ xsw w;
            public final /* synthetic */ Map<Long, gly> y;
            public final /* synthetic */ ytw z;

            public a(Map map, m6a0 m6a0Var, v5b v5bVar, Map map2, Map map3, m6a0 m6a0Var2, m6a0 m6a0Var3, long[] jArr, xsw xswVar, Map map4, ytw ytwVar, Map map5, m6a0 m6a0Var4, SnapshotStateList snapshotStateList, ytw ytwVar2, Map map6, m6a0 m6a0Var5) {
                this.a = map;
                this.b = m6a0Var;
                this.c = v5bVar;
                this.d = map2;
                this.e = map3;
                this.f = m6a0Var2;
                this.i = m6a0Var3;
                this.v = jArr;
                this.w = xswVar;
                this.y = map4;
                this.z = ytwVar;
                this.A = map5;
                this.B = m6a0Var4;
                this.C = snapshotStateList;
                this.D = ytwVar2;
                this.E = map6;
                this.F = m6a0Var5;
            }

            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                ooj oojVar = (ooj) obj;
                boolean z = oojVar instanceof ooj.f;
                v5b v5bVar = this.c;
                if (z) {
                    long j = ((ooj.f) oojVar).a;
                    Long l = new Long(j);
                    Map<Long, c9p> map = this.a;
                    c9p c9pVar = map.get(l);
                    if (c9pVar != null) {
                        c9pVar.cancel((CancellationException) null);
                    }
                    Long l2 = new Long(j);
                    m6a0<Long, String> m6a0Var = this.b;
                    m6a0Var.remove(l2);
                    map.put(new Long(j), ej5.c(v5bVar, null, null, new fqj(m6a0Var, oojVar, null), 3));
                } else if (oojVar instanceof ooj.b) {
                    long j2 = ((ooj.b) oojVar).a;
                    Long l3 = new Long(j2);
                    Map<Long, c9p> map2 = this.d;
                    c9p c9pVar2 = map2.get(l3);
                    if (c9pVar2 != null) {
                        c9pVar2.cancel((CancellationException) null);
                    }
                    map2.put(new Long(j2), ej5.c(v5bVar, null, null, new gqj(this.i, oojVar, null), 3));
                } else {
                    boolean z2 = oojVar instanceof ooj.d;
                    ytw ytwVar = this.z;
                    if (z2) {
                        CMSRes[] cMSResArr = eqj.a;
                        long[] jArr = this.v;
                        long j3 = jArr[0] + 1;
                        jArr[0] = j3;
                        this.w.K(j3);
                        ej5.c(v5bVar, null, null, new hqj(oojVar, this.y, ytwVar, this.A, this.B, this.C, this.v, null), 3);
                    } else if (oojVar instanceof ooj.a) {
                        ej5.c(v5bVar, null, null, new iqj(oojVar, this.y, ytwVar, this.A, this.B, this.C, this.v, null), 3);
                    } else {
                        boolean z3 = oojVar instanceof ooj.c;
                        ytw<Long> ytwVar2 = this.D;
                        if (z3) {
                            pr50 pr50Var = ((ooj.c) oojVar).a;
                            long j4 = pr50Var.d;
                            c9p c9pVar3 = this.e.get(new Long(j4));
                            if (c9pVar3 != null) {
                                c9pVar3.cancel((CancellationException) null);
                            }
                            Long l4 = new Long(j4);
                            m6a0<Long, pr50> m6a0Var2 = this.f;
                            m6a0Var2.remove(l4);
                            m6a0Var2.put(new Long(j4), pr50Var);
                            Long l5 = new Long(j4);
                            CMSRes[] cMSResArr2 = eqj.a;
                            ytwVar2.setValue(l5);
                        } else if ((oojVar instanceof ooj.e) && Intrinsics.g(((ooj.e) oojVar).a, "Blast and loot")) {
                            CMSRes[] cMSResArr3 = eqj.a;
                            Long value = ytwVar2.getValue();
                            if (value != null) {
                                long jLongValue = value.longValue();
                                Long l6 = new Long(jLongValue);
                                Map<Long, c9p> map3 = this.E;
                                c9p c9pVar4 = map3.get(l6);
                                if (c9pVar4 != null) {
                                    c9pVar4.cancel((CancellationException) null);
                                }
                                map3.put(new Long(jLongValue), ej5.c(v5bVar, null, null, new jqj(this.F, jLongValue, this.v, null), 3));
                            }
                        }
                    }
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(a390 a390Var, Map map, m6a0 m6a0Var, Map map2, Map map3, m6a0 m6a0Var2, m6a0 m6a0Var3, long[] jArr, xsw xswVar, Map map4, ytw ytwVar, Map map5, m6a0 m6a0Var4, SnapshotStateList snapshotStateList, ytw ytwVar2, Map map6, m6a0 m6a0Var5, v1b v1bVar) {
            super(2, v1bVar);
            this.c = a390Var;
            this.d = map;
            this.e = m6a0Var;
            this.f = map2;
            this.i = map3;
            this.v = m6a0Var2;
            this.w = m6a0Var3;
            this.y = jArr;
            this.z = xswVar;
            this.A = map4;
            this.B = ytwVar;
            this.C = map5;
            this.D = m6a0Var4;
            this.E = snapshotStateList;
            this.F = ytwVar2;
            this.G = map6;
            this.H = m6a0Var5;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            e eVar = new e(this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, v1bVar);
            eVar.b = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            ((e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            return y5b.a;
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            v5b v5bVar = (v5b) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                obj2 = null;
                a aVar = new a(this.d, this.e, v5bVar, this.f, this.i, this.v, this.w, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H);
                this.b = null;
                this.a = 1;
                if (this.c.collect(aVar, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                obj2 = null;
            }
            fkd.a();
            return obj2;
        }
    }

    public static final /* synthetic */ class f extends saj implements Function1<q28, Unit> {
        public final /* synthetic */ SnapshotStateList<q28> a;
        public final /* synthetic */ Map<Long, s28> b;
        public final /* synthetic */ m6a0<Long, Long> c;
        public final /* synthetic */ ytw d;
        public final /* synthetic */ com.sportygames.newcms.b e;
        public final /* synthetic */ Map<Long, c9p> f;
        public final /* synthetic */ v5b i;
        public final /* synthetic */ long[] v;
        public final /* synthetic */ m6a0<Long, pr50> w;
        public final /* synthetic */ m6a0<Long, Boolean> y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(SnapshotStateList snapshotStateList, Map map, m6a0 m6a0Var, ytw ytwVar, com.sportygames.newcms.b bVar, Map map2, v5b v5bVar, long[] jArr, m6a0 m6a0Var2, m6a0 m6a0Var3) {
            super(1, Intrinsics.a.class, "completeCoinFlight", "GameplayScreen$completeCoinFlight(Landroidx/compose/runtime/snapshots/SnapshotStateList;Ljava/util/Map;Landroidx/compose/runtime/snapshots/SnapshotStateMap;Landroidx/compose/runtime/State;Lcom/sportygames/newcms/CMSResource;Ljava/util/Map;Lkotlinx/coroutines/CoroutineScope;[JLandroidx/compose/runtime/snapshots/SnapshotStateMap;Landroidx/compose/runtime/snapshots/SnapshotStateMap;Lcom/sportygames/piggybash/presentation/component/gameplay/overlay/CoinFlightAnimation;)V", 0);
            this.a = snapshotStateList;
            this.b = map;
            this.c = m6a0Var;
            this.d = ytwVar;
            this.e = bVar;
            this.f = map2;
            this.i = v5bVar;
            this.v = jArr;
            this.w = m6a0Var2;
            this.y = m6a0Var3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(q28 q28Var) {
            Integer num;
            q28 q28Var2 = q28Var;
            q28Var2.getClass();
            p48.A(this.a, new cqj(q28Var2, 0));
            s28 s28VarRemove = this.b.remove(Long.valueOf(q28Var2.a));
            if (s28VarRemove != null) {
                boolean z = s28VarRemove.b;
                pr50 pr50Var = s28VarRemove.a;
                long j = pr50Var.d;
                Long lValueOf = Long.valueOf(j);
                long[] jArr = this.v;
                long j2 = jArr[0] + 1;
                jArr[0] = j2;
                this.c.put(lValueOf, Long.valueOf(j2));
                if (((Boolean) this.d.getValue()).booleanValue()) {
                    com.sportygames.newcms.b bVar = this.e;
                    if (z) {
                        CMSRes cMSRes = lu00.b2.X1;
                        bVar.getClass();
                        cMSRes.getClass();
                        qcn<co5> qcnVar = bVar.b;
                        ArrayList arrayList = new ArrayList();
                        for (co5 co5Var : qcnVar) {
                            if (co5Var instanceof spa0) {
                                arrayList.add(co5Var);
                            }
                        }
                        spa0 spa0Var = (spa0) CollectionsKt.firstOrNull(arrayList);
                        if (spa0Var != null) {
                            String strB = bVar.b(cMSRes, "");
                            if (StringsKt.U(strB)) {
                                strB = null;
                            }
                            if (strB != null && (num = spa0Var.a.get(strB)) != null) {
                                int iIntValue = num.intValue();
                                float fD = kotlin.ranges.f.d(0.6f, 0.0f, 1.0f);
                                spa0Var.b.play(iIntValue, fD, fD, 1, 0, 1.0f);
                            }
                        }
                    } else {
                        bVar.c(lu00.b2.X1);
                    }
                }
                long j3 = z ? 3000L : 1500L;
                Long lValueOf2 = Long.valueOf(j);
                Map<Long, c9p> map = this.f;
                c9p c9pVar = map.get(lValueOf2);
                if (c9pVar != null) {
                    c9pVar.cancel((CancellationException) null);
                }
                map.put(Long.valueOf(j), ej5.c(this.i, null, null, new kqj(this.w, pr50Var, j3, this.y, null), 3));
            }
            return Unit.a;
        }
    }

    static {
        lu00 lu00Var = lu00.b2;
        a = new CMSRes[]{lu00Var.x1, lu00Var.y1, lu00Var.z1, lu00Var.A1, lu00Var.B1};
        b = new CMSRes[]{lu00Var.C1, lu00Var.D1, lu00Var.E1, lu00Var.F1};
        c = new CMSRes[]{lu00Var.G1, lu00Var.H1, lu00Var.I1};
        d = new CMSRes[]{lu00Var.J1, lu00Var.K1, lu00Var.L1};
        e = kotlin.collections.b.k(lu00Var.P1, lu00Var.M1, lu00Var.N1, lu00Var.O1);
    }

    public static final void a(final boolean z, final boolean z2, final ap20 ap20Var, final Function1<? super ap20, Unit> function1, androidx.compose.runtime.a aVar, final int i) {
        boolean z3;
        int i2;
        Function1<? super ap20, Unit> function2;
        androidx.compose.runtime.b bVarI = aVar.i(-1615170338);
        if ((i & 6) == 0) {
            z3 = z;
            i2 = (bVarI.b(z3) ? 4 : 2) | i;
        } else {
            z3 = z;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.b(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.d(ap20Var.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function2 = function1;
            i2 |= bVarI.A(function2) ? 2048 : 1024;
        } else {
            function2 = function1;
        }
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            Boolean boolValueOf = Boolean.valueOf(z3);
            Boolean boolValueOf2 = Boolean.valueOf(z2);
            boolean z4 = ((i2 & 14) == 4) | ((i2 & 7168) == 2048) | ((i2 & 896) == 256) | ((i2 & 112) == 32);
            Object objY = bVarI.y();
            if (z4 || objY == androidx.compose.runtime.a.C0041a.a) {
                a aVar2 = new a(z3, function2, ap20Var, z2, null);
                bVarI.r(aVar2);
                objY = aVar2;
            }
            xvf.g(boolValueOf, boolValueOf2, (Function2) objY, bVarI);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: bqj
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    eqj.a(z, z2, ap20Var, function1, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final boolean z, final boolean z2, final a390<? extends ooj> a390Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        Object obj;
        androidx.compose.runtime.b bVarI = aVar.i(1157442272);
        if ((i & 6) == 0) {
            i2 = (bVarI.b(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.b(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(a390Var) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            com.sportygames.newcms.b bVar = (com.sportygames.newcms.b) bVarI.O(com.sportygames.newcms.c.a);
            ytw ytwVarC = m.c(Boolean.valueOf(z), bVarI);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                obj = objY;
                int[] iArr = {0};
                bVarI.r(iArr);
                obj = iArr;
            }
            obj = objY;
            int[] iArr2 = (int[]) obj;
            Object objY2 = bVarI.y();
            Object obj2 = objY2;
            if (objY2 == c0042a) {
                int[] iArr3 = {0};
                bVarI.r(iArr3);
                obj2 = iArr3;
            }
            int[] iArr4 = (int[]) obj2;
            Object objY3 = bVarI.y();
            Object obj3 = objY3;
            if (objY3 == c0042a) {
                int[] iArr5 = {0};
                bVarI.r(iArr5);
                obj3 = iArr5;
            }
            int[] iArr6 = (int[]) obj3;
            Object objY4 = bVarI.y();
            Object obj4 = objY4;
            if (objY4 == c0042a) {
                int[] iArr7 = {0};
                bVarI.r(iArr7);
                obj4 = iArr7;
            }
            int[] iArr8 = (int[]) obj4;
            Boolean boolValueOf = Boolean.valueOf(z2);
            boolean zM = bVarI.M(ytwVarC) | ((i2 & 112) == 32) | bVarI.A(bVar);
            Object objY5 = bVarI.y();
            if (zM || objY5 == c0042a) {
                objY5 = new b(z2, ytwVarC, bVar, null);
                bVarI.r(objY5);
            }
            xvf.e(bVarI, boolValueOf, (Function2) objY5);
            boolean zA = bVarI.A(a390Var) | bVarI.M(ytwVarC) | bVarI.A(bVar) | bVarI.A(iArr2) | bVarI.A(iArr4) | bVarI.A(iArr8) | bVarI.A(iArr6);
            Object objY6 = bVarI.y();
            if (zA || objY6 == c0042a) {
                c cVar = new c(a390Var, ytwVarC, bVar, iArr2, iArr4, iArr8, iArr6, null);
                bVarI.r(cVar);
                objY6 = cVar;
            }
            xvf.e(bVarI, a390Var, (Function2) objY6);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: dqj
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj5, Object obj6) {
                    ((Integer) obj6).intValue();
                    int iA = qj40.a(i | 1);
                    eqj.b(z, z2, a390Var, (a) obj5, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:192:0x0626  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(final r75 r75Var, final poj pojVar, final a390<? extends ooj> a390Var, final a390<? extends dpj> a390Var2, drj drjVar, final boolean z, final Function0<Unit> function0, final Function1<? super ap20, Unit> function1, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final drj drjVar2;
        androidx.compose.runtime.b bVar;
        long j;
        Object obj;
        Object eVar;
        Map map;
        Long l;
        com.sportygames.newcms.b bVar2;
        m6a0 m6a0Var;
        m6a0 m6a0Var2;
        Map map2;
        xsw xswVar;
        final Map map3;
        m6a0 m6a0Var3;
        SnapshotStateList snapshotStateList;
        long[] jArr;
        androidx.compose.runtime.b bVar3;
        final ytw ytwVar;
        final ytw ytwVar2;
        final ytw ytwVar3;
        androidx.compose.runtime.a.C0041a.C0042a c0042a;
        SnapshotStateList snapshotStateList2;
        m6a0 m6a0Var4;
        m6a0 m6a0Var5;
        boolean zA;
        Object objY;
        a390Var.getClass();
        a390Var2.getClass();
        drjVar.getClass();
        boolean z2 = drjVar.l;
        function0.getClass();
        function1.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(1598338649);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(r75Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(pojVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(a390Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(a390Var2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.M(drjVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.b(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= bVarI.A(function0) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= bVarI.A(function1) ? 8388608 : 4194304;
        }
        if (bVarI.q(i2 & 1, (4793491 & i2) != 4793490)) {
            b(z, z2, a390Var, bVarI, ((i2 >> 15) & 14) | (i2 & 896));
            com.sportygames.newcms.b bVar4 = (com.sportygames.newcms.b) bVarI.O(com.sportygames.newcms.c.a);
            Object objY2 = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a2 = androidx.compose.runtime.a.C0041a.a;
            if (objY2 == c0042a2) {
                objY2 = xvf.i(kotlin.coroutines.e.a, bVarI);
                bVarI.r(objY2);
            }
            v5b v5bVar = (v5b) objY2;
            ytw ytwVarC = m.c(Boolean.valueOf(z), bVarI);
            Object objY3 = bVarI.y();
            if (objY3 == c0042a2) {
                objY3 = m.b(new jxo(0L));
                bVarI.r(objY3);
            }
            ytw ytwVar4 = (ytw) objY3;
            jxo jxoVar = (jxo) ytwVar4.getValue();
            long j2 = jxoVar.a;
            ytw ytwVarC2 = m.c(jxoVar, bVarI);
            Object objY4 = bVarI.y();
            if (objY4 == c0042a2) {
                objY4 = m.b(new gly(0L));
                bVarI.r(objY4);
            }
            ytw ytwVar5 = (ytw) objY4;
            float fD = r75Var.d() / r75Var.e();
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarC = fD > 0.5625f ? j.c(aVar2, 1.0f) : j.g(aVar2, 1.0f);
            Object objY5 = bVarI.y();
            if (objY5 == c0042a2) {
                objY5 = new m6a0();
                bVarI.r(objY5);
            }
            m6a0 m6a0Var6 = (m6a0) objY5;
            Object objY6 = bVarI.y();
            if (objY6 == c0042a2) {
                objY6 = new m6a0();
                bVarI.r(objY6);
            }
            m6a0 m6a0Var7 = (m6a0) objY6;
            Object objY7 = bVarI.y();
            if (objY7 == c0042a2) {
                objY7 = new m6a0();
                bVarI.r(objY7);
            }
            m6a0 m6a0Var8 = (m6a0) objY7;
            androidx.compose.ui.d dVar = dVarC;
            Object objY8 = bVarI.y();
            if (objY8 == c0042a2) {
                objY8 = new LinkedHashMap();
                bVarI.r(objY8);
            }
            Map map4 = (Map) objY8;
            Object objY9 = bVarI.y();
            if (objY9 == c0042a2) {
                objY9 = new LinkedHashMap();
                bVarI.r(objY9);
            }
            Map map5 = (Map) objY9;
            Object objY10 = bVarI.y();
            if (objY10 == c0042a2) {
                objY10 = new LinkedHashMap();
                bVarI.r(objY10);
            }
            Map map6 = (Map) objY10;
            int i3 = i2;
            Object objY11 = bVarI.y();
            if (objY11 == c0042a2) {
                objY11 = new LinkedHashMap();
                bVarI.r(objY11);
            }
            Map map7 = (Map) objY11;
            Object objY12 = bVarI.y();
            if (objY12 == c0042a2) {
                objY12 = new LinkedHashMap();
                bVarI.r(objY12);
            }
            Map map8 = (Map) objY12;
            Object objY13 = bVarI.y();
            if (objY13 == c0042a2) {
                objY13 = new m6a0();
                bVarI.r(objY13);
            }
            m6a0 m6a0Var9 = (m6a0) objY13;
            Object objY14 = bVarI.y();
            if (objY14 == c0042a2) {
                objY14 = new m6a0();
                bVarI.r(objY14);
            }
            m6a0 m6a0Var10 = (m6a0) objY14;
            Object objY15 = bVarI.y();
            if (objY15 == c0042a2) {
                objY15 = new m6a0();
                bVarI.r(objY15);
            }
            m6a0 m6a0Var11 = (m6a0) objY15;
            Object objY16 = bVarI.y();
            if (objY16 == c0042a2) {
                objY16 = new SnapshotStateList();
                bVarI.r(objY16);
            }
            SnapshotStateList snapshotStateList3 = (SnapshotStateList) objY16;
            Object objY17 = bVarI.y();
            if (objY17 == c0042a2) {
                objY17 = new LinkedHashMap();
                bVarI.r(objY17);
            }
            Map map9 = (Map) objY17;
            Object objY18 = bVarI.y();
            if (objY18 == c0042a2) {
                objY18 = new LinkedHashMap();
                bVarI.r(objY18);
            }
            Map map10 = (Map) objY18;
            Object objY19 = bVarI.y();
            if (objY19 == c0042a2) {
                j = 0;
                long[] jArr2 = {0};
                bVarI.r(jArr2);
                obj = jArr2;
            } else {
                j = 0;
                obj = objY19;
            }
            long[] jArr3 = (long[]) obj;
            Object objY20 = bVarI.y();
            if (objY20 == c0042a2) {
                objY20 = l.a(j);
                bVarI.r(objY20);
            }
            xsw xswVar2 = (xsw) objY20;
            Object objY21 = bVarI.y();
            if (objY21 == c0042a2) {
                objY21 = m.b(null);
                bVarI.r(objY21);
            }
            ytw ytwVar6 = (ytw) objY21;
            Object objY22 = bVarI.y();
            if (objY22 == c0042a2) {
                objY22 = m.b(Boolean.FALSE);
                bVarI.r(objY22);
            }
            ytw ytwVar7 = (ytw) objY22;
            Object objY23 = bVarI.y();
            if (objY23 == c0042a2) {
                objY23 = m.b(Boolean.FALSE);
                bVarI.r(objY23);
            }
            ytw ytwVar8 = (ytw) objY23;
            Boolean boolValueOf = Boolean.valueOf(z2);
            boolean z3 = (i3 & 57344) == 16384;
            Object objY24 = bVarI.y();
            if (z3 || objY24 == c0042a2) {
                objY24 = new d(drjVar, ytwVar7, ytwVar8, null);
                bVarI.r(objY24);
            }
            xvf.e(bVarI, boolValueOf, (Function2) objY24);
            Unit unit = Unit.a;
            boolean zA2 = bVarI.A(a390Var) | bVarI.A(map5) | bVarI.A(map6) | bVarI.A(jArr3) | bVarI.A(map8) | bVarI.M(ytwVarC2) | bVarI.A(map9) | bVarI.A(map4) | bVarI.A(map10);
            Object objY25 = bVarI.y();
            if (zA2 || objY25 == c0042a2) {
                map = map9;
                l = null;
                bVar2 = bVar4;
                androidx.compose.runtime.b bVar5 = bVarI;
                m6a0Var = m6a0Var10;
                m6a0Var2 = m6a0Var8;
                eVar = new e(a390Var, map5, m6a0Var2, map6, map4, m6a0Var7, m6a0Var6, jArr3, xswVar2, map8, ytwVarC2, map, m6a0Var11, snapshotStateList3, ytwVar6, map10, m6a0Var, null);
                map2 = map4;
                xswVar = xswVar2;
                map3 = map8;
                m6a0Var3 = m6a0Var11;
                snapshotStateList = snapshotStateList3;
                jArr = jArr3;
                bVar5.r(eVar);
                bVar3 = bVar5;
            } else {
                map2 = map4;
                map3 = map8;
                map = map9;
                m6a0Var3 = m6a0Var11;
                xswVar = xswVar2;
                l = null;
                eVar = objY25;
                bVar3 = bVarI;
                jArr = jArr3;
                bVar2 = bVar4;
                snapshotStateList = snapshotStateList3;
                m6a0Var2 = m6a0Var8;
                m6a0Var = m6a0Var10;
            }
            xvf.e(bVar3, unit, (Function2) eVar);
            if (pojVar == null) {
                bVar3.N(2108616918);
                bVar3.X(false);
                drjVar2 = drjVar;
                bVar = bVar3;
            } else {
                ap20 ap20Var = pojVar.g;
                bVar3.N(2108616919);
                androidx.compose.runtime.b bVar6 = bVar3;
                a(drjVar.j, drjVar.k, ap20Var, function1, bVar6, (i3 >> 12) & 7168);
                androidx.compose.ui.d dVarB = ls7.b(androidx.compose.foundation.layout.c.a(dVar, 0.5625f));
                n54 n54Var = ht.a.e;
                androidx.compose.ui.d dVarB2 = r75Var.b(dVarB, n54Var);
                Object objY26 = bVar6.y();
                if (objY26 == c0042a2) {
                    ytwVar = ytwVar5;
                    ytwVar2 = ytwVar4;
                    objY26 = new Function1() { // from class: xpj
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            urr urrVar = (urr) obj2;
                            urrVar.getClass();
                            ytwVar2.setValue(new jxo(urrVar.a()));
                            ytwVar.setValue(new gly(urrVar.i0(0L)));
                            return Unit.a;
                        }
                    };
                    bVar6.r(objY26);
                } else {
                    ytwVar = ytwVar5;
                    ytwVar2 = ytwVar4;
                }
                androidx.compose.ui.d dVarA = v.a(dVarB2, (Function1) objY26);
                aiv aivVarC = g75.c(ht.a.a, r17);
                int iHashCode = Long.hashCode(bVar6.T);
                ne00 ne00VarS = bVar6.S();
                Map map11 = map2;
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVar6, dVarA);
                yka.k.getClass();
                m6a0 m6a0Var12 = m6a0Var2;
                tsr.a aVar3 = yka.a.b;
                bVar6.D();
                if (bVar6.S) {
                    bVar6.F(aVar3);
                } else {
                    bVar6.p();
                }
                hlh0.a(bVar6, aivVarC, yka.a.f);
                hlh0.a(bVar6, ne00VarS, yka.a.e);
                yka.a.C1350a c1350a = yka.a.g;
                if (bVar6.S || !Intrinsics.g(bVar6.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVar6, iHashCode, c1350a);
                }
                hlh0.a(bVar6, dVarC2, yka.a.d);
                Map map12 = map;
                ytw ytwVar9 = ytwVar;
                ytw ytwVar10 = ytwVar2;
                long[] jArr4 = jArr;
                m6a0 m6a0Var13 = m6a0Var3;
                mw90.a(xav.e(ap20Var, bVar6), "Gameplay Screen Background", j.e(aVar2, 1.0f), null, null, null, null, bVar6, 432, 2040);
                brj.a(pojVar.c, pojVar.d, bVar6, 0);
                long j3 = ((jxo) ytwVar10.getValue()).a;
                androidx.compose.foundation.layout.d dVar2 = androidx.compose.foundation.layout.d.a;
                androidx.compose.ui.d dVarB3 = dVar2.b(aVar2, n54Var);
                uf00<tp10> uf00Var = drjVar.g;
                p5a0 p5a0Var = m6a0Var13.c;
                boolean zA3 = bVar6.A(map3);
                Object objY27 = bVar6.y();
                if (zA3 || objY27 == c0042a2) {
                    ytwVar3 = ytwVar9;
                    objY27 = new Function2() { // from class: ypj
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            Long l2 = (Long) obj2;
                            l2.getClass();
                            map3.put(l2, new gly(gly.e(((gly) obj3).a, ((gly) ytwVar3.getValue()).a)));
                            return Unit.a;
                        }
                    };
                    bVar6.r(objY27);
                } else {
                    ytwVar3 = ytwVar9;
                }
                final ytw ytwVar11 = ytwVar3;
                m6a0 m6a0Var14 = m6a0Var;
                dcl.b(j3, dVarB3, ap20Var, uf00Var, m6a0Var7, m6a0Var6, m6a0Var12, map7, m6a0Var14, m6a0Var9, p5a0Var, (Function2) objY27, false, ((Boolean) ytwVar8.getValue()).booleanValue(), false, false, null, null, bVar6, 907763712, 384, 245760);
                long j4 = ((jxo) ytwVar10.getValue()).a;
                String str = pojVar.a;
                String str2 = pojVar.b;
                long jU = xswVar.u();
                Long lValueOf = Long.valueOf(jU);
                if (jU <= 0) {
                    lValueOf = l;
                }
                final Map map13 = map3;
                brj.b(j4, ap20Var, str, str2, a390Var, lValueOf, bVar6, (i3 << 6) & 57344);
                wpj.a(0, bVar6);
                drjVar2 = drjVar;
                dcl.b(((jxo) ytwVar10.getValue()).a, dVar2.b(aVar2, n54Var), ap20Var, drjVar.g, m6a0Var7, m6a0Var6, m6a0Var12, map7, null, null, null, null, false, false, true, ((Boolean) ytwVar7.getValue()).booleanValue(), pojVar.e, pojVar.f, bVar6, 1794048, 24960, 12032);
                com.sportygames.newcms.b bVar7 = bVar2;
                boolean zA4 = bVar6.A(map12) | bVar6.A(jArr4) | bVar6.M(ytwVarC) | bVar6.A(bVar7) | bVar6.A(map11) | bVar6.A(v5bVar);
                Object objY28 = bVar6.y();
                if (zA4) {
                    c0042a = c0042a2;
                } else {
                    c0042a = c0042a2;
                    if (objY28 != c0042a) {
                        m6a0Var5 = m6a0Var13;
                        snapshotStateList2 = snapshotStateList;
                        m6a0Var4 = m6a0Var9;
                    }
                    a38.a(390, bVar6, j.e(aVar2, 1.0f), snapshotStateList2, (Function1) ((chp) objY28));
                    long j5 = ((jxo) ytwVar10.getValue()).a;
                    androidx.compose.ui.d dVarB4 = dVar2.b(aVar2, n54Var);
                    uf00<tp10> uf00Var2 = drjVar2.g;
                    p5a0 p5a0Var2 = m6a0Var5.c;
                    zA = bVar6.A(map13);
                    objY = bVar6.y();
                    if (zA || objY == c0042a) {
                        objY = new Function2() { // from class: zpj
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                Long l2 = (Long) obj2;
                                l2.getClass();
                                map13.put(l2, new gly(gly.e(((gly) obj3).a, ((gly) ytwVar11.getValue()).a)));
                                return Unit.a;
                            }
                        };
                        bVar6.r(objY);
                    }
                    dcl.b(j5, dVarB4, ap20Var, uf00Var2, m6a0Var7, m6a0Var6, m6a0Var12, map7, m6a0Var14, m6a0Var4, p5a0Var2, (Function2) objY, true, ((Boolean) ytwVar8.getValue()).booleanValue(), false, false, null, null, bVar6, 907763712, 384, 245760);
                    int i4 = i3 >> 9;
                    bpj.a(((jxo) ytwVar10.getValue()).a, drjVar2, a390Var2, function0, bVar6, (i4 & 112) | ((i3 >> 3) & 896) | (i4 & 7168));
                    gcl.a(((jxo) ytwVar10.getValue()).a, h.j(dVar2.b(aVar2, z1.b), 0.0f, c4o.a(Float.valueOf(((int) (((jxo) ytwVar10.getValue()).a & 4294967295L)) * 0.065f), bVar6), c4o.a(Float.valueOf(((int) (((jxo) ytwVar10.getValue()).a >> 32)) * 0.027f), bVar6), 0.0f, 9), drjVar2.d, drjVar2.c, bVar6, 0);
                    androidx.compose.runtime.b bVar8 = bVar6;
                    bVar8.X(true);
                    bVar8.X(false);
                    bVar = bVar8;
                }
                SnapshotStateList snapshotStateList4 = snapshotStateList;
                objY28 = new f(snapshotStateList4, map12, m6a0Var9, ytwVarC, bVar7, map11, v5bVar, jArr4, m6a0Var7, m6a0Var13);
                snapshotStateList2 = snapshotStateList4;
                m6a0Var4 = m6a0Var9;
                m6a0Var5 = m6a0Var13;
                bVar6.r(objY28);
                a38.a(390, bVar6, j.e(aVar2, 1.0f), snapshotStateList2, (Function1) ((chp) objY28));
                long j6 = ((jxo) ytwVar10.getValue()).a;
                androidx.compose.ui.d dVarB5 = dVar2.b(aVar2, n54Var);
                uf00<tp10> uf00Var3 = drjVar2.g;
                p5a0 p5a0Var3 = m6a0Var5.c;
                zA = bVar6.A(map13);
                objY = bVar6.y();
                if (zA) {
                    objY = new Function2() { // from class: zpj
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            Long l2 = (Long) obj2;
                            l2.getClass();
                            map13.put(l2, new gly(gly.e(((gly) obj3).a, ((gly) ytwVar11.getValue()).a)));
                            return Unit.a;
                        }
                    };
                    bVar6.r(objY);
                } else {
                    objY = new Function2() { // from class: zpj
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            Long l2 = (Long) obj2;
                            l2.getClass();
                            map13.put(l2, new gly(gly.e(((gly) obj3).a, ((gly) ytwVar11.getValue()).a)));
                            return Unit.a;
                        }
                    };
                    bVar6.r(objY);
                }
                dcl.b(j6, dVarB5, ap20Var, uf00Var3, m6a0Var7, m6a0Var6, m6a0Var12, map7, m6a0Var14, m6a0Var4, p5a0Var3, (Function2) objY, true, ((Boolean) ytwVar8.getValue()).booleanValue(), false, false, null, null, bVar6, 907763712, 384, 245760);
                int i5 = i3 >> 9;
                bpj.a(((jxo) ytwVar10.getValue()).a, drjVar2, a390Var2, function0, bVar6, (i5 & 112) | ((i3 >> 3) & 896) | (i5 & 7168));
                gcl.a(((jxo) ytwVar10.getValue()).a, h.j(dVar2.b(aVar2, z1.b), 0.0f, c4o.a(Float.valueOf(((int) (((jxo) ytwVar10.getValue()).a & 4294967295L)) * 0.065f), bVar6), c4o.a(Float.valueOf(((int) (((jxo) ytwVar10.getValue()).a >> 32)) * 0.027f), bVar6), 0.0f, 9), drjVar2.d, drjVar2.c, bVar6, 0);
                androidx.compose.runtime.b bVar9 = bVar6;
                bVar9.X(true);
                bVar9.X(false);
                bVar = bVar9;
            }
        } else {
            drjVar2 = drjVar;
            androidx.compose.runtime.b bVar10 = bVarI;
            bVar10.G();
            bVar = bVar10;
        }
        androidx.compose.runtime.e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: aqj
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    eqj.c(r75Var, pojVar, a390Var, a390Var2, drjVar2, z, function0, function1, (a) obj2, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object d(Map map, ytw ytwVar, Map map2, m6a0 m6a0Var, SnapshotStateList snapshotStateList, long[] jArr, pr50 pr50Var, boolean z, x1b x1bVar) {
        lqj lqjVar;
        ytw ytwVar2;
        m6a0 m6a0Var2;
        SnapshotStateList snapshotStateList2;
        long[] jArr2;
        boolean z2;
        Object objE;
        Map map3;
        int i;
        pr50 pr50Var2 = pr50Var;
        if (x1bVar instanceof lqj) {
            lqjVar = (lqj) x1bVar;
            int i2 = lqjVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lqjVar.w = i2 - Integer.MIN_VALUE;
            } else {
                lqjVar = new lqj(x1bVar);
            }
        } else {
            lqjVar = new lqj(x1bVar);
        }
        Object obj = lqjVar.v;
        y5b y5bVar = y5b.a;
        int i3 = lqjVar.w;
        if (i3 == 0) {
            uj50.b(obj);
            long j = pr50Var2.d;
            ytwVar2 = ytwVar;
            lqjVar.a = ytwVar2;
            lqjVar.b = map2;
            m6a0Var2 = m6a0Var;
            lqjVar.c = m6a0Var2;
            snapshotStateList2 = snapshotStateList;
            lqjVar.d = snapshotStateList2;
            jArr2 = jArr;
            lqjVar.e = jArr2;
            lqjVar.f = pr50Var2;
            z2 = z;
            lqjVar.i = z2;
            lqjVar.w = 1;
            objE = e(j, map, lqjVar);
            if (objE == y5bVar) {
                return y5bVar;
            }
            map3 = map2;
        } else {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z3 = lqjVar.i;
            pr50 pr50Var3 = lqjVar.f;
            long[] jArr3 = lqjVar.e;
            SnapshotStateList snapshotStateList3 = lqjVar.d;
            m6a0 m6a0Var3 = lqjVar.c;
            map3 = lqjVar.b;
            ytw ytwVar3 = lqjVar.a;
            uj50.b(obj);
            objE = obj;
            ytwVar2 = ytwVar3;
            z2 = z3;
            pr50Var2 = pr50Var3;
            jArr2 = jArr3;
            snapshotStateList2 = snapshotStateList3;
            m6a0Var2 = m6a0Var3;
        }
        gly glyVar = (gly) objE;
        if (glyVar == null) {
            return Unit.a;
        }
        long j2 = glyVar.a;
        long j3 = ((jxo) ytwVar2.getValue()).a;
        int i4 = (int) (j3 >> 32);
        if (i4 == 0 || (i = (int) (j3 & 4294967295L)) == 0) {
            return Unit.a;
        }
        float f2 = i4;
        float f3 = f2 / 360.0f;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i * 0.51f)) & 4294967295L) | (((long) Float.floatToRawIntBits(f2 * 0.49f)) << 32);
        long j4 = jArr2[0] + 1;
        jArr2[0] = j4;
        map3.put(new Long(j4), new s28(pr50Var2, z2));
        m6a0Var2.put(new Long(pr50Var2.d), Boolean.TRUE);
        snapshotStateList2.add(new q28(j4, pr50Var2.d, gly.f(jFloatToRawIntBits, (((long) Float.floatToRawIntBits((-50.0f) * f3)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32)), j2, f3 * 51.0f, f3 * (z2 ? 70.0f : 40.0f), z2 ? 500 : 800));
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0045  */
    /* JADX WARN: Code duplicated, block: B:18:0x0052 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0053  */
    /* JADX WARN: Code duplicated, block: B:21:0x0065 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x0068  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0063 -> B:22:0x0066). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object e(long r7, java.util.Map r9, defpackage.x1b r10) {
        /*
            boolean r0 = r10 instanceof defpackage.mqj
            if (r0 == 0) goto L13
            r0 = r10
            mqj r0 = (defpackage.mqj) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            mqj r0 = new mqj
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.e
            y5b r1 = defpackage.y5b.a
            int r2 = r0.f
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L32
            int r7 = r0.d
            int r8 = r0.c
            long r4 = r0.a
            java.util.Map r9 = r0.b
            defpackage.uj50.b(r10)
            r2 = r8
            r10 = r9
            r8 = r4
            goto L66
        L32:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            r7 = 0
            return r7
        L39:
            defpackage.uj50.b(r10)
            r10 = 0
            r2 = 120(0x78, float:1.68E-43)
            r6 = r10
            r10 = r9
            r8 = r7
            r7 = r6
        L43:
            if (r7 >= r2) goto L68
            java.lang.Long r4 = new java.lang.Long
            r4.<init>(r8)
            java.lang.Object r4 = r10.get(r4)
            gly r4 = (defpackage.gly) r4
            if (r4 == 0) goto L53
            return r4
        L53:
            r0.b = r10
            r0.a = r8
            r0.c = r2
            r0.d = r7
            r0.f = r3
            r4 = 16
            java.lang.Object r4 = defpackage.hkd.b(r4, r0)
            if (r4 != r1) goto L66
            return r1
        L66:
            int r7 = r7 + r3
            goto L43
        L68:
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r8)
            java.lang.Object r7 = r10.get(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eqj.e(long, java.util.Map, x1b):java.lang.Object");
    }
}
