package defpackage;

import android.os.SystemClock;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes6.dex */
public final class l8q {

    @c0d(c = "com.sportybet.feature.luckynumber.featurematch.presentation.LNFeatureMatchCountDownViewKt$LNFeatureMatchCountDownView$remainingTimeMillis$2$1", f = "LNFeatureMatchCountDownView.kt", l = {41}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<bz20<Long>, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = j;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(bz20<Long> bz20Var, v1b<? super Unit> v1bVar) {
            return ((a) create(bz20Var, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0028  */
        /* JADX WARN: Code duplicated, block: B:14:0x003f  */
        /* JADX WARN: Code duplicated, block: B:16:0x004b A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:19:0x005a  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x003d -> B:17:0x004c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0049 -> B:17:0x004c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:16:0x004b
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.pz1
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = r10.b
                bz20 r0 = (defpackage.bz20) r0
                y5b r1 = defpackage.y5b.a
                int r2 = r10.a
                r3 = 0
                r5 = 1
                if (r2 == 0) goto L1a
                if (r2 != r5) goto L13
                defpackage.uj50.b(r11)
                goto L4c
            L13:
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r10)
                r10 = 0
                return r10
            L1a:
                defpackage.uj50.b(r11)
            L1d:
                long r6 = r10.c
                long r8 = android.os.SystemClock.elapsedRealtime()
                long r6 = r6 - r8
                int r11 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
                if (r11 >= 0) goto L29
                r6 = r3
            L29:
                java.lang.Long r11 = new java.lang.Long
                r11.<init>(r6)
                r0.setValue(r11)
                java.lang.Object r11 = r0.getValue()
                java.lang.Number r11 = (java.lang.Number) r11
                long r6 = r11.longValue()
                int r11 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
                if (r11 <= 0) goto L4c
                r10.b = r0
                r10.a = r5
                r6 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r11 = defpackage.hkd.b(r6, r10)
                if (r11 != r1) goto L4c
                return r1
            L4c:
                java.lang.Object r11 = r0.getValue()
                java.lang.Number r11 = (java.lang.Number) r11
                long r6 = r11.longValue()
                int r11 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
                if (r11 > 0) goto L1d
                kotlin.Unit r10 = kotlin.Unit.a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: l8q.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final void a(final String str, androidx.compose.runtime.a aVar, final int i) {
        b bVar;
        b bVarI = aVar.i(614931290);
        int i2 = (bVarI.M(str) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            String strZ = StringsKt.Z(2, wae0.L(2, str));
            d.a aVar2 = d.a.b;
            d dVarA = ls7.a(j.r(aVar2, 27.0f), j060.c(4.0f));
            qyd0 qyd0Var = oib0.a;
            long j = ((lib0) bVarI.O(qyd0Var)).i1;
            zk40.a aVar3 = zk40.a;
            d dVarA2 = d35.a(androidx.compose.foundation.a.b(dVarA, j, aVar3), 0.5f, ((lib0) bVarI.O(qyd0Var)).G, j060.c(4.0f));
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarA2);
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
            g75.a(androidx.compose.foundation.a.b(j.c(j.g(aVar2, 1.0f), 0.5f), ((lib0) bVarI.O(qyd0Var)).e1, aVar3), bVarI, 0);
            lkf0.d(strZ, androidx.compose.foundation.layout.d.a.b(aVar2, ht.a.e), ((lib0) bVarI.O(qyd0Var)).o, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(kjb0.a)).f, bVarI, 0, 0, 131064);
            bVar = bVarI;
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, i) { // from class: k8q
                public final /* synthetic */ String a;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    l8q.a(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(int i, androidx.compose.runtime.a aVar) {
        b bVar;
        b bVarI = aVar.i(-1620019633);
        if (bVarI.q(i & 1, i != 0)) {
            bVar = bVarI;
            lkf0.d(":", null, ((lib0) bVarI.O(oib0.a)).b, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(kjb0.a)).f, bVar, 6, 0, 131066);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new j8q();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(final d dVar, final long j, androidx.compose.runtime.a aVar, final int i) {
        dVar.getClass();
        b bVarI = aVar.i(-434555194);
        int i2 = (bVarI.e(j) ? 32 : 16) | i;
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            long jElapsedRealtime = j - SystemClock.elapsedRealtime();
            if (jElapsedRealtime < 0) {
                jElapsedRealtime = 0;
            }
            Long lValueOf = Long.valueOf(jElapsedRealtime);
            Long lValueOf2 = Long.valueOf(j);
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objY = bVarI.y();
            if (z || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new a(j, null);
                bVarI.r(objY);
            }
            ytw ytwVarA = bl50.a(lValueOf, lValueOf2, (Function2) objY, bVarI, i3);
            long jLongValue = ((Number) ytwVarA.getValue()).longValue() / 3600000;
            long jLongValue2 = (((Number) ytwVarA.getValue()).longValue() / RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS) % 60;
            long jLongValue3 = (((Number) ytwVarA.getValue()).longValue() / 1000) % 60;
            d160 d160VarA = b160.a(new kw0.i(((cjb0) bVarI.O(ejb0.a)).c, true, new hw0()), ht.a.k, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVar);
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
            a(String.valueOf(jLongValue), bVarI, 0);
            b(0, bVarI);
            a(String.valueOf(jLongValue2), bVarI, 0);
            b(0, bVarI);
            a(String.valueOf(jLongValue3), bVarI, 0);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(j, i) { // from class: i8q
                public final /* synthetic */ long b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(7);
                    l8q.c(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
