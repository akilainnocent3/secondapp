package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes8.dex */
public final class hpd0 {

    @c0d(c = "com.sportygames.stacker.presentation.ui.component.row.StackerRowKt$StackerChip$1$1", f = "StackerRow.kt", l = {174, 178, 184}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ wd0<Float, ij0> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(wd0 wd0Var, v1b v1bVar, boolean z) {
            super(2, v1bVar);
            this.b = z;
            this.c = wd0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.c, v1bVar, this.b);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x002f  */
        /* JADX WARN: Code duplicated, block: B:17:0x004b  */
        /* JADX WARN: Path cross not found for [B:4:0x0010, B:12:0x0028], limit reached: 23 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0061 -> B:14:0x002f). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.pz1
        public final java.lang.Object invokeSuspend(java.lang.Object r16) {
            /*
                r15 = this;
                y5b r7 = defpackage.y5b.a
                int r0 = r15.a
                r8 = 1065353216(0x3f800000, float:1.0)
                r9 = 6
                r10 = 0
                r11 = 500(0x1f4, float:7.0E-43)
                r1 = 3
                r12 = 2
                r13 = 1
                r14 = 0
                if (r0 == 0) goto L28
                if (r0 == r13) goto L24
                if (r0 == r12) goto L20
                if (r0 != r1) goto L1a
                defpackage.uj50.b(r16)
                goto L74
            L1a:
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r0)
                return r14
            L20:
                defpackage.uj50.b(r16)
                goto L2f
            L24:
                defpackage.uj50.b(r16)
                goto L4b
            L28:
                defpackage.uj50.b(r16)
                boolean r0 = r15.b
                if (r0 == 0) goto L64
            L2f:
                java.lang.Float r1 = new java.lang.Float
                r0 = 1066192077(0x3f8ccccd, float:1.1)
                r1.<init>(r0)
                gzg0 r2 = defpackage.yi0.e(r11, r10, r14, r9)
                r15.a = r13
                wd0<java.lang.Float, ij0> r0 = r15.c
                r3 = 0
                r4 = 0
                r6 = 12
                r5 = r15
                java.lang.Object r0 = defpackage.wd0.a(r0, r1, r2, r3, r4, r5, r6)
                if (r0 != r7) goto L4b
                goto L73
            L4b:
                java.lang.Float r1 = new java.lang.Float
                r1.<init>(r8)
                gzg0 r2 = defpackage.yi0.e(r11, r10, r14, r9)
                r15.a = r12
                wd0<java.lang.Float, ij0> r0 = r15.c
                r3 = 0
                r4 = 0
                r6 = 12
                r5 = r15
                java.lang.Object r0 = defpackage.wd0.a(r0, r1, r2, r3, r4, r5, r6)
                if (r0 != r7) goto L2f
                goto L73
            L64:
                java.lang.Float r0 = new java.lang.Float
                r0.<init>(r8)
                r15.a = r1
                wd0<java.lang.Float, ij0> r1 = r15.c
                java.lang.Object r0 = r1.f(r15, r0)
                if (r0 != r7) goto L74
            L73:
                return r7
            L74:
                kotlin.Unit r0 = kotlin.Unit.a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: hpd0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final void a(final boolean z, final float f, final float f2, final float f3, final float f4, final ArrayList arrayList, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        b bVar;
        b bVarI = aVar.i(471474232);
        if ((i & 6) == 0) {
            i2 = (bVarI.b(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.c(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.c(f2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.c(f3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.c(f4) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.A(arrayList) ? 131072 : 65536;
        }
        boolean z2 = true;
        if (!bVarI.q(i2 & 1, (74899 & i2) != 74898)) {
            bVar = bVarI;
            bVar.G();
        } else if (arrayList.isEmpty() || !z) {
            bVar = bVarI;
            bVar.N(1137803978);
            bVar.X(false);
        } else {
            bVarI.N(1146070500);
            d.a aVar2 = d.a.b;
            d dVarJ = h.j(j.e(aVar2, 1.0f), f, 0.0f, f2, 0.0f, 10);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarJ);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar2);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d dVarW = j.w(j.i(androidx.compose.foundation.layout.d.a.b(aVar2, ht.a.f), f3), arrayList.size() * f4);
            d160 d160VarA = b160.a(new kw0.i(2.0f, true, new hw0()), ht.a.j, bVarI, 6);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarW);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar2);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            bVarI.N(811196134);
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                String str = (String) obj;
                d dVarA = zqu.a(1.0f, j.c(androidx.compose.foundation.a.b(aVar2, j58.l, zk40.a), 1.0f), z2);
                aiv aivVarC2 = g75.c(ht.a.e, false);
                int iHashCode3 = Long.hashCode(bVarI.T);
                ne00 ne00VarS3 = bVarI.S();
                d dVarC3 = c.c(bVarI, dVarA);
                yka.k.getClass();
                tsr.a aVar4 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar4);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC2, yka.a.f);
                hlh0.a(bVarI, ne00VarS3, yka.a.e);
                yka.a.C1350a c1350a2 = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                    n30.a(iHashCode3, bVarI, iHashCode3, c1350a2);
                }
                hlh0.a(bVarI, dVarC3, yka.a.d);
                long jD = r58.d(4294963646L);
                boolean z3 = z2;
                t9i t9iVar = t9i.v;
                long jB = i7f.b(24.0f, bVarI);
                uld0 uld0Var = uld0.i0;
                b bVar3 = bVarI;
                lkf0.b(str, null, jD, jB, null, t9iVar, d1a.a(d9i.a(uld0Var.h0, bVarI)), 0L, null, 0L, 0, false, 0, 0, null, new imf0(0L, 0L, null, null, null, 0L, null, new ix80(r58.d(4294947869L), 2, 0L, 10.0f), 0, 0L, null, null, 16769023), bVar3, 196992, 1572864, 65426);
                lkf0.b(str, null, r58.d(4294963646L), i7f.b(24.0f, bVar3), null, t9iVar, d1a.a(d9i.a(uld0Var.h0, bVar3)), 0L, null, 0L, 0, false, 0, 0, null, new imf0(0L, 0L, null, null, null, 0L, null, new ix80(r58.d(4294945280L), 2, 0L, 10.0f), 0, 0L, null, null, 16769023), bVar3, 196992, 1572864, 65426);
                bVar3.X(z3);
                z2 = z3;
                bVarI = bVar3;
            }
            bVar = bVarI;
            boolean z4 = z2;
            mx4.a(bVar, false, z4, z4, false);
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: fpd0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    hpd0.a(z, f, f2, f3, f4, arrayList, (a) obj2, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final float f, final int i, androidx.compose.runtime.a aVar, final String str, String str2, final boolean z) {
        int i2;
        final String str3;
        b bVarI = aVar.i(-1102640113);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.c(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            str3 = str2;
            i2 |= bVarI.M(str3) ? 256 : 128;
        } else {
            str3 = str2;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.b(z) ? 2048 : 1024;
        }
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            if (str3.length() > 0) {
                bVarI.N(-841536481);
                Object objY = bVarI.y();
                androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
                if (objY == c0042a) {
                    objY = ee0.a(1.0f);
                    bVarI.r(objY);
                }
                wd0 wd0Var = (wd0) objY;
                Boolean boolValueOf = Boolean.valueOf(z);
                boolean zA = ((i2 & 7168) == 2048) | bVarI.A(wd0Var);
                Object objY2 = bVarI.y();
                if (zA || objY2 == c0042a) {
                    objY2 = new a(wd0Var, null, z);
                    bVarI.r(objY2);
                }
                xvf.e(bVarI, boolValueOf, (Function2) objY2);
                d.a aVar2 = d.a.b;
                d dVarC = j.c(j.w(aVar2, f), 1.0f);
                boolean zA2 = bVarI.A(wd0Var);
                Object objY3 = bVarI.y();
                if (zA2 || objY3 == c0042a) {
                    objY3 = new ed0(wd0Var, 2);
                    bVarI.r(objY3);
                }
                d dVarA = androidx.compose.ui.graphics.a.a(dVarC, (Function1) objY3);
                aiv aivVarC = g75.c(ht.a.e, false);
                int iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS = bVarI.S();
                d dVarC2 = c.c(bVarI, dVarA);
                yka.k.getClass();
                tsr.a aVar3 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC, yka.a.f);
                hlh0.a(bVarI, ne00VarS, yka.a.e);
                yka.a.C1350a c1350a = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC2, yka.a.d);
                mw90.a(str, "", j.e(aVar2, 1.0f), null, null, d0b.a.b, null, bVarI, (i2 & 14) | 1573296, 1976);
                bVarI.X(true);
            } else {
                bVarI.N(-848431501);
            }
            bVarI.X(false);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: gpd0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    hpd0.b(f, iA, (a) obj, str, str3, z);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:136:0x025c  */
    /* JADX WARN: Code duplicated, block: B:139:0x0267  */
    /* JADX WARN: Code duplicated, block: B:141:0x0280  */
    /* JADX WARN: Code duplicated, block: B:142:0x0283  */
    /* JADX WARN: Code duplicated, block: B:146:0x028d  */
    /* JADX WARN: Code duplicated, block: B:149:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:153:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:156:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:157:0x0303  */
    /* JADX WARN: Code duplicated, block: B:162:0x031e  */
    /* JADX WARN: Code duplicated, block: B:165:0x032a  */
    /* JADX WARN: Code duplicated, block: B:167:0x032e  */
    /* JADX WARN: Code duplicated, block: B:170:0x0339  */
    /* JADX WARN: Code duplicated, block: B:179:0x0353  */
    /* JADX WARN: Code duplicated, block: B:182:0x0364  */
    /* JADX WARN: Code duplicated, block: B:185:0x036f A[LOOP:2: B:180:0x035e->B:185:0x036f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:189:0x0379  */
    /* JADX WARN: Code duplicated, block: B:190:0x037b  */
    /* JADX WARN: Code duplicated, block: B:192:0x037f  */
    /* JADX WARN: Code duplicated, block: B:193:0x0384  */
    /* JADX WARN: Code duplicated, block: B:196:0x038e  */
    /* JADX WARN: Code duplicated, block: B:199:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:200:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:204:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:208:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:211:0x0415  */
    /* JADX WARN: Code duplicated, block: B:212:0x0419  */
    /* JADX WARN: Code duplicated, block: B:217:0x043a  */
    /* JADX WARN: Code duplicated, block: B:220:0x045e  */
    /* JADX WARN: Code duplicated, block: B:221:0x0462  */
    /* JADX WARN: Code duplicated, block: B:226:0x047d  */
    /* JADX WARN: Code duplicated, block: B:229:0x048c  */
    /* JADX WARN: Code duplicated, block: B:231:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:232:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:237:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:240:0x0505  */
    /* JADX WARN: Code duplicated, block: B:243:0x0515  */
    /* JADX WARN: Code duplicated, block: B:266:0x057d  */
    /* JADX WARN: Code duplicated, block: B:270:0x0588  */
    /* JADX WARN: Code duplicated, block: B:284:0x0372 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:285:0x0373 A[EDGE_INSN: B:285:0x0373->B:187:0x0373 BREAK  A[LOOP:2: B:180:0x035e->B:185:0x036f], SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:243:0x0515, please report this as an issue */
    public static final void c(final LayoutWeightElement layoutWeightElement, final boolean z, final boolean z2, final float f, float f2, final String str, final String str2, final long j, final qcn qcnVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        qcn qcnVar2;
        boolean z3;
        ArrayList arrayList;
        Object next;
        tsr.a aVar2;
        tsr.a aVar3;
        Object objY;
        androidx.compose.runtime.a.C0041a.C0042a c0042a;
        wd0 wd0Var;
        boolean z4;
        d.a aVar4;
        boolean zA;
        Object objY2;
        kw0.j jVar;
        n54.b bVar;
        int iHashCode;
        float f3;
        Iterator<E> it;
        int i3;
        Iterator<E> it2;
        boolean z5;
        uf4 uf4Var;
        int iOrdinal;
        Iterator<E> it3;
        int i4;
        Integer numValueOf;
        Integer num;
        int iIntValue;
        float f4;
        Object objY3;
        final wd0 wd0Var2;
        boolean z6;
        boolean z7;
        Object objY4;
        boolean zA2;
        Object objY5;
        int iHashCode2;
        tsr.a aVar5;
        yka.a.C1350a c1350a;
        int iHashCode3;
        int i5;
        int iHashCode4;
        tsr.a aVar6;
        yka.a.C1350a c1350a2;
        boolean z8;
        boolean z9;
        Object objY6;
        final float f5 = f2;
        str2.getClass();
        qcnVar.getClass();
        b bVarI = aVar.i(1427527904);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(layoutWeightElement) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.b(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.b(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.c(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.c(f5) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.M(str) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= bVarI.M(str2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= bVarI.e(j) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            qcnVar2 = qcnVar;
            i2 |= bVarI.M(qcnVar2) ? 67108864 : 33554432;
        } else {
            qcnVar2 = qcnVar;
        }
        if (bVarI.q(i2 & 1, (i2 & 38347923) != 38347922)) {
            float f6 = (((f / 7.5f) - 2.0f) / 2.0f) + 5.0f;
            float f7 = (f - f6) / 7.0f;
            float fC1 = ((mmd) bVarI.O(kna.h)).C1(f7);
            float size = ((7 - qcnVar2.size()) * f7) + (qcnVar2.size() == 7 ? 0.0f : 6 - qcnVar2.size());
            ArrayList arrayList2 = new ArrayList();
            int i6 = 0;
            while (i6 < str2.length()) {
                char cCharAt = str2.charAt(i6);
                int i7 = i2;
                if ((cCharAt == '.' || cCharAt == ',') && !arrayList2.isEmpty()) {
                    arrayList2.set(arrayList2.size() - 1, ((String) CollectionsKt.b0(arrayList2)) + '.');
                } else {
                    arrayList2.add(String.valueOf(cCharAt));
                }
                i6++;
                i2 = i7;
            }
            int i8 = i2;
            if (!qcnVar2.isEmpty()) {
                Iterator<E> it4 = qcnVar2.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        z3 = true;
                        break;
                    } else if (((uf4) it4.next()) != uf4.e) {
                        z3 = false;
                        break;
                    }
                }
            } else {
                z3 = true;
                break;
            }
            Iterator<E> it5 = qcnVar2.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    arrayList = arrayList2;
                    next = null;
                    break;
                } else {
                    next = it5.next();
                    arrayList = arrayList2;
                    if (((uf4) next) == uf4.c) {
                        break;
                    } else {
                        arrayList2 = arrayList;
                    }
                }
            }
            boolean z10 = next != null;
            Double dH = kotlin.text.b.h(str2);
            boolean z11 = (z3 || z10) && (dH != null && (dH.doubleValue() > 0.0d ? 1 : (dH.doubleValue() == 0.0d ? 0 : -1)) >= 0);
            d dVarI = j.i(j.w(layoutWeightElement, f), f5);
            n54 n54Var = ht.a.a;
            aiv aivVarC = g75.c(n54Var, false);
            boolean z12 = z11;
            int iHashCode5 = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarI);
            yka.k.getClass();
            tsr.a aVar7 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar7);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar2);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a3 = yka.a.g;
            if (bVarI.S) {
                aVar2 = aVar7;
            } else {
                aVar2 = aVar7;
                if (!Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode5))) {
                }
                yka.a.c cVar = yka.a.d;
                hlh0.a(bVarI, dVarC, cVar);
                aVar3 = aVar2;
                b(f7, ((i8 >> 15) & 14) | ((i8 >> 12) & 896) | ((i8 << 3) & 7168), bVarI, str, str2, z2);
                a(z12, f6, size, f2, f7, arrayList, bVarI, (i8 >> 3) & 7168);
                f5 = f2;
                bVarI = bVarI;
                objY = bVarI.y();
                c0042a = androidx.compose.runtime.a.C0041a.a;
                if (objY == c0042a) {
                    objY = ee0.a(0.0f);
                    bVarI.r(objY);
                }
                wd0Var = (wd0) objY;
                if (z) {
                    bVarI.N(-110336636);
                    Unit unit = Unit.a;
                    boolean zA3 = bVarI.A(wd0Var);
                    if ((i8 & 57344) == 16384) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    z9 = z8 | zA3;
                    objY6 = bVarI.y();
                    if (z9 || objY6 == c0042a) {
                        objY6 = new ipd0(wd0Var, f5, null);
                        bVarI.r(objY6);
                    }
                    xvf.e(bVarI, unit, (Function2) objY6);
                    z4 = false;
                } else {
                    z4 = false;
                    bVarI.N(-114071640);
                }
                bVarI.X(z4);
                aVar4 = d.a.b;
                d dVarJ = h.j(j.e(aVar4, 1.0f), f6, 0.0f, size, 0.0f, 10);
                zA = bVarI.A(wd0Var);
                objY2 = bVarI.y();
                if (zA || objY2 == c0042a) {
                    objY2 = new jv50(wd0Var, 1);
                    bVarI.r(objY2);
                }
                d dVarA = androidx.compose.ui.graphics.a.a(dVarJ, (Function1) objY2);
                jVar = kw0.a;
                bVar = ht.a.j;
                d160 d160VarA = b160.a(jVar, bVar, bVarI, 0);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS2 = bVarI.S();
                d dVarC2 = c.c(bVarI, dVarA);
                bVarI.D();
                f3 = f7;
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA, bVar2);
                hlh0.a(bVarI, ne00VarS2, dVar);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a3);
                }
                hlh0.a(bVarI, dVarC2, cVar);
                if (qcnVar.isEmpty()) {
                    i3 = 0;
                } else {
                    it = qcnVar.iterator();
                    i3 = 0;
                    while (it.hasNext()) {
                        if (((uf4) it.next()) == uf4.c && (i3 = i3 + 1) < 0) {
                            kotlin.collections.b.p();
                            throw null;
                        }
                    }
                }
                if (i3 > 0) {
                    bVarI.N(-582555154);
                    it3 = qcnVar.iterator();
                    i4 = 0;
                    while (true) {
                        if (it3.hasNext()) {
                            i4 = -1;
                            break;
                        } else if (((uf4) it3.next()) == uf4.c) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    numValueOf = Integer.valueOf(i4);
                    if (i4 >= 0) {
                        num = numValueOf;
                    } else {
                        num = null;
                    }
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    f4 = iIntValue * fC1;
                    objY3 = bVarI.y();
                    if (objY3 == c0042a) {
                        objY3 = ee0.a(f4);
                        bVarI.r(objY3);
                    }
                    wd0Var2 = (wd0) objY3;
                    Float fValueOf = Float.valueOf(f4);
                    boolean zA4 = bVarI.A(wd0Var2) | bVarI.c(f4);
                    if ((i8 & 29360128) == 8388608) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    z7 = zA4 | z6;
                    objY4 = bVarI.y();
                    if (z7 || objY4 == c0042a) {
                        objY4 = new jpd0(wd0Var2, f4, j, null);
                        bVarI.r(objY4);
                    }
                    xvf.e(bVarI, fValueOf, (Function2) objY4);
                    d dVarI2 = j.i(j.w(aVar4, f3 * i3), f5);
                    zA2 = bVarI.A(wd0Var2);
                    objY5 = bVarI.y();
                    if (zA2 || objY5 == c0042a) {
                        objY5 = new Function1() { // from class: dpd0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                a7l a7lVar = (a7l) obj;
                                a7lVar.getClass();
                                a7lVar.B(((Number) wd0Var2.d()).floatValue());
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY5);
                    }
                    d dVarA2 = androidx.compose.ui.graphics.a.a(dVarI2, (Function1) objY5);
                    aiv aivVarC2 = g75.c(n54Var, false);
                    iHashCode2 = Long.hashCode(bVarI.T);
                    ne00 ne00VarS3 = bVarI.S();
                    d dVarC3 = c.c(bVarI, dVarA2);
                    yka.k.getClass();
                    aVar5 = yka.a.b;
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar5);
                    } else {
                        bVarI.p();
                    }
                    yka.a.b bVar3 = yka.a.f;
                    hlh0.a(bVarI, aivVarC2, bVar3);
                    yka.a.d dVar2 = yka.a.e;
                    hlh0.a(bVarI, ne00VarS3, dVar2);
                    c1350a = yka.a.g;
                    if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                        n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                    }
                    yka.a.c cVar2 = yka.a.d;
                    hlh0.a(bVarI, dVarC3, cVar2);
                    d160 d160VarA2 = b160.a(jVar, bVar, bVarI, 0);
                    iHashCode3 = Long.hashCode(bVarI.T);
                    ne00 ne00VarS4 = bVarI.S();
                    d dVarC4 = c.c(bVarI, aVar4);
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar5);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, d160VarA2, bVar3);
                    hlh0.a(bVarI, ne00VarS4, dVar2);
                    if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                        n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
                    }
                    hlh0.a(bVarI, dVarC4, cVar2);
                    bVarI.N(-1047343774);
                    i5 = 0;
                    while (i5 < i3) {
                        float f8 = f3;
                        d dVarI3 = j.i(j.w(aVar4, f8), f5);
                        aiv aivVarC3 = g75.c(n54Var, false);
                        iHashCode4 = Long.hashCode(bVarI.T);
                        ne00 ne00VarS5 = bVarI.S();
                        d dVarC5 = c.c(bVarI, dVarI3);
                        yka.k.getClass();
                        aVar6 = yka.a.b;
                        bVarI.D();
                        if (bVarI.S) {
                            bVarI.F(aVar6);
                        } else {
                            bVarI.p();
                        }
                        hlh0.a(bVarI, aivVarC3, yka.a.f);
                        hlh0.a(bVarI, ne00VarS5, yka.a.e);
                        c1350a2 = yka.a.g;
                        if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode4))) {
                            n30.a(iHashCode4, bVarI, iHashCode4, c1350a2);
                        }
                        hlh0.a(bVarI, dVarC5, yka.a.d);
                        pnd0.b(f5, ((i8 >> 9) & 112) | 390, uf4.c, bVarI, j.e(aVar4, 1.0f));
                        bVarI.X(true);
                        i5++;
                        f3 = f8;
                    }
                    z5 = true;
                    mx4.a(bVarI, false, true, true, false);
                } else {
                    bVarI.N(-581079802);
                    it2 = qcnVar.iterator();
                    while (it2.hasNext()) {
                        uf4Var = (uf4) it2.next();
                        iOrdinal = uf4Var.ordinal();
                        if (iOrdinal != 0 || iOrdinal == 1) {
                            bVarI.N(502652248);
                            if (1.0f <= 0.0d) {
                                ukn.a("invalid weight; must be greater than zero");
                            }
                            pnd0.b(f5, (i8 >> 9) & 112, uf4Var, bVarI, new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true));
                            bVarI.X(false);
                            Unit unit2 = Unit.a;
                        } else if (iOrdinal == 3) {
                            bVarI.N(-1598027105);
                            if (1.0f <= 0.0d) {
                                ukn.a("invalid weight; must be greater than zero");
                            }
                            pnd0.a(f5, (i8 >> 6) & 896, uf4Var, bVarI, new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true));
                            bVarI.X(false);
                            Unit unit3 = Unit.a;
                        } else if (iOrdinal != 4) {
                            bVarI.N(502659571);
                            bVarI.X(false);
                            Unit unit4 = Unit.a;
                        } else {
                            bVarI.N(502652248);
                            if (1.0f <= 0.0d) {
                                ukn.a("invalid weight; must be greater than zero");
                            }
                            pnd0.b(f5, (i8 >> 9) & 112, uf4Var, bVarI, new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true));
                            bVarI.X(false);
                            Unit unit5 = Unit.a;
                        }
                    }
                    z5 = true;
                    bVarI.X(false);
                }
                bVarI.X(z5);
                bVarI.X(z5);
            }
            n30.a(iHashCode5, bVarI, iHashCode5, c1350a3);
            yka.a.c cVar3 = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar3);
            aVar3 = aVar2;
            b(f7, ((i8 >> 15) & 14) | ((i8 >> 12) & 896) | ((i8 << 3) & 7168), bVarI, str, str2, z2);
            a(z12, f6, size, f2, f7, arrayList, bVarI, (i8 >> 3) & 7168);
            f5 = f2;
            bVarI = bVarI;
            objY = bVarI.y();
            c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = ee0.a(0.0f);
                bVarI.r(objY);
            }
            wd0Var = (wd0) objY;
            if (z) {
                bVarI.N(-110336636);
                Unit unit6 = Unit.a;
                boolean zA5 = bVarI.A(wd0Var);
                if ((i8 & 57344) == 16384) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                z9 = z8 | zA5;
                objY6 = bVarI.y();
                if (z9) {
                    objY6 = new ipd0(wd0Var, f5, null);
                    bVarI.r(objY6);
                } else {
                    objY6 = new ipd0(wd0Var, f5, null);
                    bVarI.r(objY6);
                }
                xvf.e(bVarI, unit6, (Function2) objY6);
                z4 = false;
            } else {
                z4 = false;
                bVarI.N(-114071640);
            }
            bVarI.X(z4);
            aVar4 = d.a.b;
            d dVarJ2 = h.j(j.e(aVar4, 1.0f), f6, 0.0f, size, 0.0f, 10);
            zA = bVarI.A(wd0Var);
            objY2 = bVarI.y();
            if (zA) {
                objY2 = new jv50(wd0Var, 1);
                bVarI.r(objY2);
            } else {
                objY2 = new jv50(wd0Var, 1);
                bVarI.r(objY2);
            }
            d dVarA3 = androidx.compose.ui.graphics.a.a(dVarJ2, (Function1) objY2);
            jVar = kw0.a;
            bVar = ht.a.j;
            d160 d160VarA3 = b160.a(jVar, bVar, bVarI, 0);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS6 = bVarI.S();
            d dVarC6 = c.c(bVarI, dVarA3);
            bVarI.D();
            f3 = f7;
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA3, bVar2);
            hlh0.a(bVarI, ne00VarS6, dVar);
            if (bVarI.S) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a3);
            } else {
                n30.a(iHashCode, bVarI, iHashCode, c1350a3);
            }
            hlh0.a(bVarI, dVarC6, cVar3);
            if (qcnVar.isEmpty()) {
                i3 = 0;
            } else {
                it = qcnVar.iterator();
                i3 = 0;
                while (it.hasNext()) {
                    if (((uf4) it.next()) == uf4.c) {
                        kotlin.collections.b.p();
                        throw null;
                    }
                }
            }
            if (i3 > 0) {
                bVarI.N(-582555154);
                it3 = qcnVar.iterator();
                i4 = 0;
                while (true) {
                    if (it3.hasNext()) {
                        i4 = -1;
                        break;
                    } else {
                        if (((uf4) it3.next()) == uf4.c) {
                            break;
                            break;
                        }
                        i4++;
                    }
                }
                numValueOf = Integer.valueOf(i4);
                if (i4 >= 0) {
                    num = numValueOf;
                } else {
                    num = null;
                }
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                f4 = iIntValue * fC1;
                objY3 = bVarI.y();
                if (objY3 == c0042a) {
                    objY3 = ee0.a(f4);
                    bVarI.r(objY3);
                }
                wd0Var2 = (wd0) objY3;
                Float fValueOf2 = Float.valueOf(f4);
                boolean zA6 = bVarI.A(wd0Var2) | bVarI.c(f4);
                if ((i8 & 29360128) == 8388608) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                z7 = zA6 | z6;
                objY4 = bVarI.y();
                if (z7) {
                    objY4 = new jpd0(wd0Var2, f4, j, null);
                    bVarI.r(objY4);
                } else {
                    objY4 = new jpd0(wd0Var2, f4, j, null);
                    bVarI.r(objY4);
                }
                xvf.e(bVarI, fValueOf2, (Function2) objY4);
                d dVarI4 = j.i(j.w(aVar4, f3 * i3), f5);
                zA2 = bVarI.A(wd0Var2);
                objY5 = bVarI.y();
                if (zA2) {
                    objY5 = new Function1() { // from class: dpd0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            a7l a7lVar = (a7l) obj;
                            a7lVar.getClass();
                            a7lVar.B(((Number) wd0Var2.d()).floatValue());
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY5);
                } else {
                    objY5 = new Function1() { // from class: dpd0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            a7l a7lVar = (a7l) obj;
                            a7lVar.getClass();
                            a7lVar.B(((Number) wd0Var2.d()).floatValue());
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY5);
                }
                d dVarA4 = androidx.compose.ui.graphics.a.a(dVarI4, (Function1) objY5);
                aiv aivVarC4 = g75.c(n54Var, false);
                iHashCode2 = Long.hashCode(bVarI.T);
                ne00 ne00VarS7 = bVarI.S();
                d dVarC7 = c.c(bVarI, dVarA4);
                yka.k.getClass();
                aVar5 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar5);
                } else {
                    bVarI.p();
                }
                yka.a.b bVar4 = yka.a.f;
                hlh0.a(bVarI, aivVarC4, bVar4);
                yka.a.d dVar3 = yka.a.e;
                hlh0.a(bVarI, ne00VarS7, dVar3);
                c1350a = yka.a.g;
                if (bVarI.S) {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                } else {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                }
                yka.a.c cVar4 = yka.a.d;
                hlh0.a(bVarI, dVarC7, cVar4);
                d160 d160VarA4 = b160.a(jVar, bVar, bVarI, 0);
                iHashCode3 = Long.hashCode(bVarI.T);
                ne00 ne00VarS8 = bVarI.S();
                d dVarC8 = c.c(bVarI, aVar4);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar5);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA4, bVar4);
                hlh0.a(bVarI, ne00VarS8, dVar3);
                if (bVarI.S) {
                    n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
                } else {
                    n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
                }
                hlh0.a(bVarI, dVarC8, cVar4);
                bVarI.N(-1047343774);
                i5 = 0;
                while (i5 < i3) {
                    float f9 = f3;
                    d dVarI5 = j.i(j.w(aVar4, f9), f5);
                    aiv aivVarC5 = g75.c(n54Var, false);
                    iHashCode4 = Long.hashCode(bVarI.T);
                    ne00 ne00VarS9 = bVarI.S();
                    d dVarC9 = c.c(bVarI, dVarI5);
                    yka.k.getClass();
                    aVar6 = yka.a.b;
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar6);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, aivVarC5, yka.a.f);
                    hlh0.a(bVarI, ne00VarS9, yka.a.e);
                    c1350a2 = yka.a.g;
                    if (bVarI.S) {
                        n30.a(iHashCode4, bVarI, iHashCode4, c1350a2);
                    } else {
                        n30.a(iHashCode4, bVarI, iHashCode4, c1350a2);
                    }
                    hlh0.a(bVarI, dVarC9, yka.a.d);
                    pnd0.b(f5, ((i8 >> 9) & 112) | 390, uf4.c, bVarI, j.e(aVar4, 1.0f));
                    bVarI.X(true);
                    i5++;
                    f3 = f9;
                }
                z5 = true;
                mx4.a(bVarI, false, true, true, false);
            } else {
                bVarI.N(-581079802);
                it2 = qcnVar.iterator();
                while (it2.hasNext()) {
                    uf4Var = (uf4) it2.next();
                    iOrdinal = uf4Var.ordinal();
                    if (iOrdinal != 0) {
                    }
                    bVarI.N(502652248);
                    if (1.0f <= 0.0d) {
                        ukn.a("invalid weight; must be greater than zero");
                    }
                    pnd0.b(f5, (i8 >> 9) & 112, uf4Var, bVarI, new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true));
                    bVarI.X(false);
                    Unit unit7 = Unit.a;
                }
                z5 = true;
                bVarI.X(false);
            }
            bVarI.X(z5);
            bVarI.X(z5);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: epd0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    hpd0.c(layoutWeightElement, z, z2, f, f5, str, str2, j, qcnVar, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
