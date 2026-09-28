package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.j;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import com.sportygames.newcms.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class vse0 {

    @c0d(c = "com.sportygames.goldmine.ui.TGBetButtonKt$LoadingIcon$1$1", f = "TGBetButton.kt", l = {84, 91, 92, 99, 106}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ gzg0<Float> b;
        public final /* synthetic */ gzg0<Float> c;
        public final /* synthetic */ gzg0<Float> d;
        public final /* synthetic */ isw e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(gzg0<Float> gzg0Var, gzg0<Float> gzg0Var2, gzg0<Float> gzg0Var3, isw iswVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = gzg0Var;
            this.c = gzg0Var2;
            this.d = gzg0Var3;
            this.e = iswVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, this.d, this.e, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            return y5b.a;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0032  */
        /* JADX WARN: Code duplicated, block: B:20:0x0048  */
        /* JADX WARN: Code duplicated, block: B:23:0x0053  */
        /* JADX WARN: Code duplicated, block: B:26:0x006a  */
        /* JADX WARN: Code duplicated, block: B:29:0x0080  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0088 -> B:17:0x0032). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.pz1
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                y5b r7 = defpackage.y5b.a
                int r0 = r14.a
                r8 = 5
                r9 = 4
                r10 = 3
                r11 = 2
                r12 = 1
                isw r13 = r14.e
                if (r0 == 0) goto L2f
                if (r0 == r12) goto L2b
                if (r0 == r11) goto L27
                if (r0 == r10) goto L23
                if (r0 == r9) goto L1f
                if (r0 != r8) goto L18
                goto L2f
            L18:
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r0)
                r0 = 0
                return r0
            L1f:
                defpackage.uj50.b(r15)
                goto L80
            L23:
                defpackage.uj50.b(r15)
                goto L6a
            L27:
                defpackage.uj50.b(r15)
                goto L53
            L2b:
                defpackage.uj50.b(r15)
                goto L48
            L2f:
                defpackage.uj50.b(r15)
            L32:
                sse0 r4 = new sse0
                r4.<init>()
                r14.a = r12
                r0 = 0
                r1 = -1049624576(0xffffffffc1700000, float:-15.0)
                r2 = 0
                gzg0<java.lang.Float> r3 = r14.b
                r6 = 4
                r5 = r14
                java.lang.Object r0 = defpackage.sje0.c(r0, r1, r2, r3, r4, r5, r6)
                if (r0 != r7) goto L48
                goto L8a
            L48:
                r14.a = r11
                r0 = 100
                java.lang.Object r0 = defpackage.hkd.b(r0, r14)
                if (r0 != r7) goto L53
                goto L8a
            L53:
                tse0 r4 = new tse0
                r4.<init>()
                r14.a = r10
                r0 = -1049624576(0xffffffffc1700000, float:-15.0)
                r1 = 1097859072(0x41700000, float:15.0)
                r2 = 0
                gzg0<java.lang.Float> r3 = r14.c
                r6 = 4
                r5 = r14
                java.lang.Object r0 = defpackage.sje0.c(r0, r1, r2, r3, r4, r5, r6)
                if (r0 != r7) goto L6a
                goto L8a
            L6a:
                use0 r4 = new use0
                r4.<init>()
                r14.a = r9
                r0 = 1097859072(0x41700000, float:15.0)
                r1 = 0
                r2 = 0
                gzg0<java.lang.Float> r3 = r14.d
                r6 = 4
                r5 = r14
                java.lang.Object r0 = defpackage.sje0.c(r0, r1, r2, r3, r4, r5, r6)
                if (r0 != r7) goto L80
                goto L8a
            L80:
                r14.a = r8
                r0 = 200(0xc8, double:9.9E-322)
                java.lang.Object r0 = defpackage.hkd.b(r0, r14)
                if (r0 != r7) goto L32
            L8a:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: vse0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final void a(final d dVar, androidx.compose.runtime.a aVar, final int i) {
        b bVarI = aVar.i(-387670946);
        if (bVarI.q(i & 1, (i & 3) != 2)) {
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = j.a(0.0f);
                bVarI.r(objY);
            }
            isw iswVar = (isw) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = yi0.e(300, 0, xkf.a, 2);
                bVarI.r(objY2);
            }
            gzg0 gzg0Var = (gzg0) objY2;
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = yi0.e(100, 0, xkf.d, 2);
                bVarI.r(objY3);
            }
            gzg0 gzg0Var2 = (gzg0) objY3;
            Object objY4 = bVarI.y();
            if (objY4 == c0042a) {
                objY4 = yi0.e(80, 0, xkf.d, 2);
                bVarI.r(objY4);
            }
            gzg0 gzg0Var3 = (gzg0) objY4;
            Unit unit = Unit.a;
            Object objY5 = bVarI.y();
            if (objY5 == c0042a) {
                a aVar2 = new a(gzg0Var, gzg0Var2, gzg0Var3, iswVar, null);
                bVarI.r(aVar2);
                objY5 = aVar2;
            }
            xvf.e(bVarI, unit, (Function2) objY5);
            h9n.a(erz.a(R.drawable.sg_pickaxe, 0, bVarI), "loading", androidx.compose.foundation.layout.j.r(androidx.compose.ui.graphics.a.c(dVar, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, iswVar.j(), n09.a(0.0f, 1.0f), null, 523007), 20.0f), null, null, 0.0f, null, bVarI, 48, 120);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i) { // from class: rse0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(7);
                    vse0.a(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final d dVar, final wse0 wse0Var, final Function0 function0, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        dVar.getClass();
        wse0Var.getClass();
        b bVarI = aVar.i(-525939878);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(wse0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function0) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            umz umzVar = ek5.a;
            ak5 ak5VarC = ek5.c((d68) bVarI.O(g68.a));
            long j = j58.f;
            ak5 ak5VarA = ak5VarC.a(r58.d(4286989353L), j, r58.d(4286989353L), j);
            nk5.a(function0, dw.a(androidx.compose.foundation.layout.j.i(dVar, 48.0f), wse0Var.b() ? 1.0f : 0.6f), wse0Var.b(), j060.c(8.0f), ak5VarA, null, null, h.a(3, 0.0f, 0.0f), null, pp8.b(1402985834, new gaj() { // from class: pse0
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((e160) obj).getClass();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        wse0 wse0Var2 = wse0Var;
                        lkf0.b(c.c(wse0Var2.getText(), new String[0], aVar2), null, 0L, i7f.b(16.0f, aVar2), null, new t9i(700), null, 0L, null, i7f.b(18.75f, aVar2), 0, false, 0, 0, null, null, aVar2, 196608, 0, 130006);
                        if (wse0Var2.a()) {
                            aVar2.N(2024469026);
                            vse0.a(h.j(d.a.b, 8.0f, 0.0f, 0.0f, 0.0f, 14), aVar2, 6);
                        } else {
                            aVar2.N(2021997272);
                        }
                        aVar2.H();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, ((i2 >> 6) & 14) | 817889280, 352);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: qse0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    vse0.b(dVar, wse0Var, function0, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
