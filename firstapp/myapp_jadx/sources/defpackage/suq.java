package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.rewardcenter.mission.presentation.LNMissionTabViewModel$1", f = "LNMissionTabViewModel.kt", l = {121, 123}, m = "invokeSuspend", v = 2)
public final class suq extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ tuq b;

    @c0d(c = "com.sportybet.feature.luckynumber.rewardcenter.mission.presentation.LNMissionTabViewModel$1$1", f = "LNMissionTabViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements iaj<Boolean, lk50<? extends qcn<? extends osv>>, Boolean, v1b<? super Boolean>, Object> {
        public /* synthetic */ boolean a;
        public /* synthetic */ lk50 b;
        public /* synthetic */ Boolean c;

        @Override // defpackage.iaj
        public final Object d(Boolean bool, lk50<? extends qcn<? extends osv>> lk50Var, Boolean bool2, v1b<? super Boolean> v1bVar) {
            boolean zBooleanValue = bool.booleanValue();
            a aVar = new a(4, v1bVar);
            aVar.a = zBooleanValue;
            aVar.b = lk50Var;
            aVar.c = bool2;
            return aVar.invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0028  */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z;
            qcn qcnVar;
            boolean z2 = this.a;
            lk50 lk50Var = this.b;
            Boolean bool = this.c;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (z2 && (qcnVar = (qcn) bm50.i(lk50Var)) != null) {
                z = (qcnVar.isEmpty() ^ true) && !Intrinsics.g(bool, Boolean.TRUE);
            }
            return Boolean.valueOf(z);
        }
    }

    @c0d(c = "com.sportybet.feature.luckynumber.rewardcenter.mission.presentation.LNMissionTabViewModel$1$2", f = "LNMissionTabViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<Boolean, v1b<? super Boolean>, Object> {
        public /* synthetic */ boolean a;

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = new b(2, v1bVar);
            bVar.a = ((Boolean) obj).booleanValue();
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Boolean bool, v1b<? super Boolean> v1bVar) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((b) create(bool2, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return Boolean.valueOf(z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public suq(tuq tuqVar, v1b<? super suq> v1bVar) {
        super(2, v1bVar);
        this.b = tuqVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new suq(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((suq) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0068, code lost:
    
        if (r11.g(r10, r0) == r2) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            tuq r0 = r10.b
            j5u r1 = r0.e
            y5b r2 = defpackage.y5b.a
            int r3 = r10.a
            r4 = 0
            r5 = 1
            r6 = 2
            if (r3 == 0) goto L1f
            if (r3 == r5) goto L1b
            if (r3 != r6) goto L15
            defpackage.uj50.b(r11)
            goto L6b
        L15:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r10)
            return r4
        L1b:
            defpackage.uj50.b(r11)
            goto L4c
        L1f:
            defpackage.uj50.b(r11)
            wwd0 r11 = r0.B
            wwd0 r3 = r0.i
            rkd r7 = r1.d
            ohp<java.lang.Object>[] r8 = defpackage.j5u.e
            r8 = r8[r6]
            wm20 r7 = r7.a(r1, r8)
            lyh r7 = r7.c()
            suq$a r8 = new suq$a
            r9 = 4
            r8.<init>(r9, r4)
            k1i r11 = defpackage.r1i.a(r11, r3, r7, r8)
            suq$b r3 = new suq$b
            r3.<init>(r6, r4)
            r10.a = r5
            java.lang.Object r11 = defpackage.s0i.b(r11, r3, r10)
            if (r11 != r2) goto L4c
            goto L6a
        L4c:
            nvp$c r11 = new nvp$c
            m8r r3 = defpackage.m8r.INSTANCE
            r11.<init>(r3)
            r0.y1(r11)
            rkd r11 = r1.d
            ohp<java.lang.Object>[] r0 = defpackage.j5u.e
            r0 = r0[r6]
            wm20 r11 = r11.a(r1, r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r10.a = r6
            java.lang.Object r10 = r11.g(r10, r0)
            if (r10 != r2) goto L6b
        L6a:
            return r2
        L6b:
            kotlin.Unit r10 = kotlin.Unit.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.suq.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
