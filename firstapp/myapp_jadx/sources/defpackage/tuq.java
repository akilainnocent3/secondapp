package defpackage;

import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltuq;", "Lj8i0;", "luckynumber"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class tuq extends j8i0 {
    public jvd0 A;
    public final wwd0 B;
    public final ku90<duq> C;
    public final v340 D;
    public final auq a;
    public final dtz b;
    public final lwv c;
    public final bnh0 d;
    public final j5u e;
    public final odd f;
    public final wwd0 i;
    public final wwd0 v;
    public final wwd0 w;
    public final wwd0 y;
    public final wwd0 z;

    @c0d(c = "com.sportybet.feature.luckynumber.rewardcenter.mission.presentation.LNMissionTabViewModel$fetchMissions$1", f = "LNMissionTabViewModel.kt", l = {254, 254}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<myh<? super qcn<? extends osv>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = tuq.this.new a(v1bVar);
            aVar.c = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super qcn<? extends osv>> myhVar, v1b<? super Unit> v1bVar) {
            return ((a) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
        
            if (r0.emit(r7, r6) == r1) goto L15;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.c
                myh r0 = (defpackage.myh) r0
                y5b r1 = defpackage.y5b.a
                int r2 = r6.b
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L21
                if (r2 == r4) goto L1b
                if (r2 != r3) goto L15
                defpackage.uj50.b(r7)
                goto L5a
            L15:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                return r5
            L1b:
                myh r0 = r6.a
                defpackage.uj50.b(r7)
                goto L47
            L21:
                defpackage.uj50.b(r7)
                tuq r7 = defpackage.tuq.this
                auq r7 = r7.a
                r7.getClass()
                ytq r2 = new ytq
                r2.<init>(r7, r5)
                or60 r7 = new or60
                r7.<init>(r2)
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.lang.Object r7 = defpackage.nzh.a(r7, r2, r6)
                if (r7 != r1) goto L47
                goto L59
            L47:
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                qcn r7 = defpackage.a4h.b(r7)
                r6.c = r5
                r6.a = r5
                r6.b = r3
                java.lang.Object r6 = r0.emit(r7, r6)
                if (r6 != r1) goto L5a
            L59:
                return r1
            L5a:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: tuq.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportybet.feature.luckynumber.rewardcenter.mission.presentation.LNMissionTabViewModel$fetchMissions$2", f = "LNMissionTabViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<lk50<? extends qcn<? extends osv>>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ tuq c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z, tuq tuqVar, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.b = z;
            this.c = tuqVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = new b(this.b, this.c, v1bVar);
            bVar.a = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(lk50<? extends qcn<? extends osv>> lk50Var, v1b<? super Unit> v1bVar) {
            return ((b) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            tuq tuqVar = this.c;
            wwd0 wwd0Var = tuqVar.i;
            lk50 lk50Var = (lk50) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            boolean zG = Intrinsics.g(lk50Var, lk50.b.a);
            boolean z = this.b;
            if (zG) {
                if (!z) {
                    wwd0Var.setValue(lk50Var);
                }
            } else if (lk50Var instanceof lk50.a) {
                if (!z) {
                    wwd0Var.getClass();
                    wwd0Var.k(null, lk50Var);
                }
            } else {
                if (!(lk50Var instanceof lk50.c)) {
                    uhc.a();
                    return null;
                }
                wwd0Var.getClass();
                wwd0Var.k(null, lk50Var);
            }
            if (!(lk50Var instanceof lk50.b)) {
                wwd0 wwd0Var2 = tuqVar.z;
                Boolean bool = Boolean.FALSE;
                wwd0Var2.getClass();
                wwd0Var2.k(null, bool);
            }
            return Unit.a;
        }
    }

    public tuq(auq auqVar, dtz dtzVar, lwv lwvVar, bnh0 bnh0Var, j5u j5uVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar) {
        lwvVar.getClass();
        bnh0Var.getClass();
        this.a = auqVar;
        this.b = dtzVar;
        this.c = lwvVar;
        this.d = bnh0Var;
        this.e = j5uVar;
        this.f = oddVar;
        wwd0 wwd0VarA = xwd0.a(lk50.b.a);
        this.i = wwd0VarA;
        xf00 xf00Var = xf00.i;
        xf00Var.getClass();
        wwd0 wwd0VarA2 = xwd0.a(xf00Var);
        this.v = wwd0VarA2;
        pg00 pg00Var = pg00.e;
        wwd0 wwd0VarA3 = xwd0.a(pg00Var);
        this.w = wwd0VarA3;
        wwd0 wwd0VarA4 = xwd0.a(pg00Var);
        this.y = wwd0VarA4;
        Boolean bool = Boolean.FALSE;
        wwd0 wwd0VarA5 = xwd0.a(bool);
        this.z = wwd0VarA5;
        this.B = xwd0.a(bool);
        this.C = new ku90<>();
        this.D = e1i.e(r1i.c(wwd0VarA, wwd0VarA2, wwd0VarA3, wwd0VarA4, wwd0VarA5, new vuq(this, null)), o8i0.d(this), q490.a.a, new ruq(0));
        ej5.c(o8i0.d(this), oddVar, null, new suq(this, null), 2);
    }

    public final void A1(int i, uxs uxsVar) {
        wwd0 wwd0Var;
        Object value;
        LinkedHashMap linkedHashMapM;
        do {
            wwd0Var = this.v;
            value = wwd0Var.getValue();
            linkedHashMapM = kpu.m((scn) value);
            linkedHashMapM.put(Integer.valueOf(i), uxsVar);
        } while (!wwd0Var.g(value, a4h.g(linkedHashMapM)));
    }

    public final void x1() {
        jvd0 jvd0Var = this.A;
        if (jvd0Var == null || !jvd0Var.isActive()) {
            lk50 lk50Var = (lk50) this.i.getValue();
            boolean z = (lk50Var instanceof lk50.c) && !((Collection) ((lk50.c) lk50Var).a).isEmpty();
            if (z) {
                Boolean bool = Boolean.TRUE;
                wwd0 wwd0Var = this.z;
                wwd0Var.getClass();
                wwd0Var.k(null, bool);
            }
            this.A = kzh.d(ozh.c(new g1i(bm50.a(new or60(new a(null))), new b(z, this, null)), this.f), o8i0.d(this));
        }
    }

    public final void y1(nvp nvpVar) {
        this.C.a(new duq.b(nvpVar));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object z1(qcn qcnVar, scn scnVar, ucn ucnVar, ucn ucnVar2, x1b x1bVar) {
        wuq wuqVar;
        int i;
        if (x1bVar instanceof wuq) {
            wuqVar = (wuq) x1bVar;
            int i2 = wuqVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wuqVar.d = i2 - Integer.MIN_VALUE;
            } else {
                wuqVar = new wuq(this, x1bVar);
            }
        } else {
            wuqVar = new wuq(this, x1bVar);
        }
        wuq wuqVar2 = wuqVar;
        Object objA = wuqVar2.b;
        y5b y5bVar = y5b.a;
        int i3 = wuqVar2.d;
        if (i3 == 0) {
            uj50.b(objA);
            if (qcnVar.isEmpty()) {
                return cuq.a.a;
            }
            wuqVar2.a = ucnVar;
            wuqVar2.d = 1;
            objA = this.c.a(qcnVar, scnVar, ucnVar2, true, wuqVar2);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ucnVar = wuqVar2.a;
            uj50.b(objA);
        }
        qcn qcnVarB = a4h.b((Iterable) objA);
        int i4 = 0;
        if (qcnVarB == null || !qcnVarB.isEmpty()) {
            Iterator<E> it = qcnVarB.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((kwv) it.next()).i && (i = i + 1) < 0) {
                    kotlin.collections.b.p();
                    throw null;
                }
            }
        } else {
            i = 0;
        }
        if (qcnVarB == null || !qcnVarB.isEmpty()) {
            Iterator<E> it2 = qcnVarB.iterator();
            while (it2.hasNext()) {
                if (((kwv) it2.next()).j && (i4 = i4 + 1) < 0) {
                    kotlin.collections.b.p();
                    throw null;
                }
            }
        }
        return new cuq.d(qcnVarB, ucnVar, i, i4);
    }
}
