package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.google.protobuf.DescriptorProtos;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e870 {

    @c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.component.playback.ScheduledFootballLottiePlaybackKt$ScheduledFootballLottiePlayback$1$1", f = "ScheduledFootballLottiePlayback.kt", l = {DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER, 40}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public float a;
        public int b;
        public final /* synthetic */ xmt c;
        public final /* synthetic */ f870 d;
        public final /* synthetic */ fmt e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xmt xmtVar, f870 f870Var, fmt fmtVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = xmtVar;
            this.d = f870Var;
            this.e = fmtVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.c, this.d, this.e, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
        
            if (fmt.a.a(r12.e, r12.c, 0, false, 0.0f, null, r9, r12, 1982) == r0) goto L20;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r12.b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L17
                if (r1 != r2) goto L10
                defpackage.uj50.b(r13)
                goto L5e
            L10:
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r12)
                r12 = 0
                return r12
            L17:
                float r1 = r12.a
                defpackage.uj50.b(r13)
            L1c:
                r9 = r1
                goto L48
            L1e:
                defpackage.uj50.b(r13)
                xmt r13 = r12.c
                if (r13 != 0) goto L28
                kotlin.Unit r12 = kotlin.Unit.a
                return r12
            L28:
                f870 r1 = r12.d
                long r4 = r1.d
                float r1 = (float) r4
                float r4 = r13.b()
                float r1 = r1 / r4
                r4 = 0
                r5 = 1065353216(0x3f800000, float:1.0)
                float r1 = kotlin.ranges.f.d(r1, r4, r5)
                r12.a = r1
                r12.b = r3
                fmt r3 = r12.e
                r4 = 12
                java.lang.Object r13 = fmt.a.b(r3, r13, r1, r12, r4)
                if (r13 != r0) goto L1c
                goto L5d
            L48:
                r12.a = r9
                r12.b = r2
                fmt r3 = r12.e
                xmt r4 = r12.c
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r11 = 1982(0x7be, float:2.777E-42)
                r10 = r12
                java.lang.Object r12 = fmt.a.a(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r12 != r0) goto L5e
            L5d:
                return r0
            L5e:
                kotlin.Unit r12 = kotlin.Unit.a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: e870.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.component.playback.ScheduledFootballLottiePlaybackKt$ScheduledFootballLottiePlayback$4$1$1", f = "ScheduledFootballLottiePlayback.kt", l = {72, 76}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public float a;
        public int b;
        public final /* synthetic */ xmt c;
        public final /* synthetic */ f870.a d;
        public final /* synthetic */ fmt e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xmt xmtVar, f870.a aVar, fmt fmtVar, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.c = xmtVar;
            this.d = aVar;
            this.e = fmtVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.c, this.d, this.e, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
        
            if (fmt.a.a(r12.e, r12.c, 0, false, 0.0f, null, r9, r12, 1982) == r0) goto L20;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r12.b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L17
                if (r1 != r2) goto L10
                defpackage.uj50.b(r13)
                goto L60
            L10:
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r12)
                r12 = 0
                return r12
            L17:
                float r1 = r12.a
                defpackage.uj50.b(r13)
            L1c:
                r9 = r1
                goto L4a
            L1e:
                defpackage.uj50.b(r13)
                xmt r13 = r12.c
                if (r13 != 0) goto L28
                kotlin.Unit r12 = kotlin.Unit.a
                return r12
            L28:
                f870$a r1 = r12.d
                long r4 = r1.a()
                float r1 = (float) r4
                float r4 = r13.b()
                float r1 = r1 / r4
                r4 = 0
                r5 = 1065353216(0x3f800000, float:1.0)
                float r1 = kotlin.ranges.f.d(r1, r4, r5)
                r12.a = r1
                r12.b = r3
                fmt r3 = r12.e
                r4 = 12
                java.lang.Object r13 = fmt.a.b(r3, r13, r1, r12, r4)
                if (r13 != r0) goto L1c
                goto L5f
            L4a:
                r12.a = r9
                r12.b = r2
                fmt r3 = r12.e
                xmt r4 = r12.c
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r11 = 1982(0x7be, float:2.777E-42)
                r10 = r12
                java.lang.Object r12 = fmt.a.a(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r12 != r0) goto L60
            L5f:
                return r0
            L60:
                kotlin.Unit r12 = kotlin.Unit.a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: e870.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0209  */
    /* JADX WARN: Code duplicated, block: B:71:0x0213  */
    /* JADX WARN: Code duplicated, block: B:74:0x0225  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v16 */
    public static final void a(f870 f870Var, scn<String, ? extends nnt> scnVar, scn<String, ? extends xmt> scnVar2, androidx.compose.runtime.a aVar, int i) {
        int i2;
        d.a aVar2;
        androidx.compose.runtime.a.C0041a.C0042a c0042a;
        int i3;
        androidx.compose.runtime.a.C0041a.C0042a c0042a2;
        boolean zM;
        Object objY;
        scnVar.getClass();
        scnVar2.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-1520829002);
        int i4 = (bVarI.M(f870Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i4 |= bVarI.M(scnVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= bVarI.A(scnVar2) ? 256 : 128;
        }
        if (bVarI.q(i4 & 1, (i4 & 147) != 146)) {
            int i5 = f870Var.b;
            nnt nntVar = scnVar.get(f870Var.c);
            Unit unit = null;
            xmt value = nntVar != null ? nntVar.getValue() : null;
            fmt fmtVarA = lmt.a(bVarI);
            Integer numValueOf = Integer.valueOf(i5);
            boolean zA = ((i4 & 14) == 4) | bVarI.A(value) | bVarI.M(fmtVarA);
            Object objY2 = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a3 = androidx.compose.runtime.a.C0041a.a;
            if (zA || objY2 == c0042a3) {
                objY2 = new a(value, f870Var, fmtVarA, null);
                bVarI.r(objY2);
            }
            xvf.g(numValueOf, value, (Function2) objY2, bVarI);
            d.a aVar3 = d.a.b;
            if (value == null) {
                bVarI.N(594291706);
                bVarI.X(false);
                aVar2 = aVar3;
                i2 = i5;
                i3 = 0;
                c0042a = c0042a3;
            } else {
                bVarI.N(594291707);
                boolean zM2 = bVarI.M(fmtVarA);
                Object objY3 = bVarI.y();
                if (zM2 || objY3 == c0042a3) {
                    objY3 = new ycb(fmtVarA, 1);
                    bVarI.r(objY3);
                }
                i2 = i5;
                aVar2 = aVar3;
                c0042a = c0042a3;
                i3 = 0;
                mmt.b(value, (Function0) objY3, j.e(aVar3, 1.0f), false, false, false, false, null, false, null, null, null, false, false, null, null, false, bVarI, 384, 0, 131064);
                bVarI = bVarI;
                bVarI.X(false);
                unit = Unit.a;
            }
            if (unit == null) {
                bVarI.N(-1227748374);
                d dVarE = j.e(aVar2, 1.0f);
                aiv aivVarC = g75.c(ht.a.a, i3);
                int iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS = bVarI.S();
                d dVarC = c.c(bVarI, dVarE);
                yka.k.getClass();
                tsr.a aVar4 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar4);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC, yka.a.f);
                hlh0.a(bVarI, ne00VarS, yka.a.e);
                yka.a.C1350a c1350a = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC, yka.a.d);
                q330.a(androidx.compose.foundation.layout.d.a.b(h.f(j.r(aVar2, 48.0f), 4.5f), ht.a.e), ((lib0) bVarI.O(oib0.a)).a0, 4.5f, 0L, 0, 0.0f, bVarI, 384, 56);
                bVarI.X(true);
                bVarI.X(i3);
            } else {
                bVarI.N(-1227755814);
                bVarI.X(i3);
            }
            f870.a aVar5 = f870Var.e;
            if (aVar5 == null) {
                bVarI.N(594870197);
                bVarI.X(i3);
            } else {
                bVarI.N(594870198);
                xmt xmtVar = scnVar2.get(cb40.a(aVar5.b(), new Object[i3], bVarI));
                final fmt fmtVarA2 = lmt.a(bVarI);
                Integer numValueOf2 = Integer.valueOf(i2);
                boolean zA2 = bVarI.A(xmtVar) | bVarI.A(aVar5) | bVarI.M(fmtVarA2);
                Object objY4 = bVarI.y();
                if (zA2) {
                    c0042a2 = c0042a;
                } else {
                    c0042a2 = c0042a;
                    if (objY4 == c0042a2) {
                    }
                    xvf.g(numValueOf2, xmtVar, (Function2) objY4, bVarI);
                    if (xmtVar == null) {
                        bVarI.N(1566363143);
                        bVarI.X(i3);
                    } else {
                        bVarI.N(1566363144);
                        zM = bVarI.M(fmtVarA2);
                        objY = bVarI.y();
                        if (zM || objY == c0042a2) {
                            objY = new Function0() { // from class: d870
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(fmtVarA2.g());
                                }
                            };
                            bVarI.r(objY);
                        }
                        androidx.compose.runtime.b bVar = bVarI;
                        mmt.b(xmtVar, (Function0) objY, j.e(aVar2, 1.0f), false, false, false, false, null, false, null, null, null, false, false, null, null, false, bVar, 384, 0, 131064);
                        bVarI = bVar;
                        bVarI.X(i3);
                        Unit unit2 = Unit.a;
                    }
                    bVarI.X(i3);
                }
                objY4 = new b(xmtVar, aVar5, fmtVarA2, null);
                bVarI.r(objY4);
                xvf.g(numValueOf2, xmtVar, (Function2) objY4, bVarI);
                if (xmtVar == null) {
                    bVarI.N(1566363143);
                    bVarI.X(i3);
                } else {
                    bVarI.N(1566363144);
                    zM = bVarI.M(fmtVarA2);
                    objY = bVarI.y();
                    if (zM) {
                        objY = new Function0() { // from class: d870
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(fmtVarA2.g());
                            }
                        };
                        bVarI.r(objY);
                    } else {
                        objY = new Function0() { // from class: d870
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(fmtVarA2.g());
                            }
                        };
                        bVarI.r(objY);
                    }
                    androidx.compose.runtime.b bVar2 = bVarI;
                    mmt.b(xmtVar, (Function0) objY, j.e(aVar2, 1.0f), false, false, false, false, null, false, null, null, null, false, false, null, null, false, bVar2, 384, 0, 131064);
                    bVarI = bVar2;
                    bVarI.X(i3);
                    Unit unit3 = Unit.a;
                }
                bVarI.X(i3);
            }
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new yb2(f870Var, scnVar, scnVar2, i, 1);
        }
    }
}
