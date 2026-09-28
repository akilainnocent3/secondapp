package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.runtime.j;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.d;
import java.util.ArrayList;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes8.dex */
public final class h54 {

    @c0d(c = "com.sportygames.sportyherov2.components.BgStarViewShKt$BgStarViewSh$2$1", f = "BgStarViewSh.kt", l = {79, 118}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ SnapshotStateList<yvd0> d;
        public final /* synthetic */ String e;
        public final /* synthetic */ float f;
        public final /* synthetic */ isw i;
        public final /* synthetic */ isw v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z, SnapshotStateList<yvd0> snapshotStateList, String str, float f, isw iswVar, isw iswVar2, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = z;
            this.d = snapshotStateList;
            this.e = str;
            this.f = f;
            this.i = iswVar;
            this.v = iswVar2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, this.d, this.e, this.f, this.i, this.v, v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x001f  */
        /* JADX WARN: Code duplicated, block: B:13:0x0025  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0055 -> B:11:0x001f). Please report as a decompilation issue!!! */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            v5b v5bVar = (v5b) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    uj50.b(obj);
                } else if (i != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this.b = v5bVar;
                this.a = 2;
                if (hkd.b(16L, this) != y5bVar) {
                    if (w5b.e(v5bVar) || this.c) {
                        return Unit.a;
                    }
                    final SnapshotStateList<yvd0> snapshotStateList = this.d;
                    final String str = this.e;
                    final float f = this.f;
                    final isw iswVar = this.i;
                    final isw iswVar2 = this.v;
                    Function1 function1 = new Function1() { // from class: f54
                        /* JADX WARN: Code duplicated, block: B:18:0x00cd  */
                        /* JADX WARN: Code duplicated, block: B:22:0x00eb  */
                        /* JADX WARN: Code duplicated, block: B:24:0x00f8  */
                        /* JADX WARN: Code duplicated, block: B:25:0x0112  */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            p4 p4Var;
                            long jFloatToRawIntBits;
                            int iFloatToRawIntBits;
                            ((Long) obj2).getClass();
                            SnapshotStateList snapshotStateList2 = snapshotStateList;
                            int size = snapshotStateList2.size();
                            int i2 = 0;
                            for (int i3 = 0; i3 < size; i3++) {
                                yvd0 yvd0Var = (yvd0) snapshotStateList2.get(i3);
                                long j = yvd0Var.a;
                                float f2 = yvd0Var.c;
                                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (yvd0Var.a & 4294967295L)) + f2)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) - (100.0f * f2))) << 32);
                                isw iswVar3 = iswVar;
                                isw iswVar4 = iswVar2;
                                if (i2 < 1) {
                                    lx30.INSTANCE.getClass();
                                    p4 p4Var2 = lx30.b;
                                    if (p4Var2.d() < 7.0E-4f) {
                                        if (p4Var2.i()) {
                                            jFloatToRawIntBits = Float.floatToRawIntBits(iswVar3.j() * p4Var2.d());
                                            iFloatToRawIntBits = Float.floatToRawIntBits(-20.0f);
                                        } else {
                                            float fJ = iswVar3.j() + 20.0f;
                                            float fJ2 = iswVar4.j() * 0.3f * p4Var2.d();
                                            jFloatToRawIntBits = Float.floatToRawIntBits(fJ);
                                            iFloatToRawIntBits = Float.floatToRawIntBits(fJ2);
                                        }
                                        long j2 = (jFloatToRawIntBits << 32) | (((long) iFloatToRawIntBits) & 4294967295L);
                                        snapshotStateList2.set(i3, yvd0.a(yvd0Var, j2, iswVar3.j() / (f / (Intrinsics.g(str, "ROUND_END_WAIT") ? 3.0f : 1.0f)), b.l(new gly(j2)), 18));
                                        i2++;
                                    } else {
                                        if (Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L)) <= iswVar4.j() + 20.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32)) < -20.0f) {
                                            lx30.INSTANCE.getClass();
                                            p4Var = lx30.b;
                                            if (p4Var.i()) {
                                                jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(iswVar3.j() * p4Var.d())) << 32) | (((long) Float.floatToRawIntBits(-10.0f)) & 4294967295L);
                                            } else {
                                                jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(iswVar4.j() * p4Var.d())) & 4294967295L) | (((long) Float.floatToRawIntBits(iswVar3.j() + 10.0f)) << 32);
                                            }
                                        }
                                        snapshotStateList2.set(i3, yvd0.a(yvd0Var, jFloatToRawIntBits2, 0.0f, null, WebSocketProtocol.PAYLOAD_SHORT));
                                    }
                                } else {
                                    if (Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L)) <= iswVar4.j() + 20.0f) {
                                        lx30.INSTANCE.getClass();
                                        p4Var = lx30.b;
                                        if (p4Var.i()) {
                                            jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(iswVar3.j() * p4Var.d())) << 32) | (((long) Float.floatToRawIntBits(-10.0f)) & 4294967295L);
                                        } else {
                                            jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(iswVar4.j() * p4Var.d())) & 4294967295L) | (((long) Float.floatToRawIntBits(iswVar3.j() + 10.0f)) << 32);
                                        }
                                    } else {
                                        lx30.INSTANCE.getClass();
                                        p4Var = lx30.b;
                                        if (p4Var.i()) {
                                            jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(iswVar3.j() * p4Var.d())) << 32) | (((long) Float.floatToRawIntBits(-10.0f)) & 4294967295L);
                                        } else {
                                            jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(iswVar4.j() * p4Var.d())) & 4294967295L) | (((long) Float.floatToRawIntBits(iswVar3.j() + 10.0f)) << 32);
                                        }
                                    }
                                    snapshotStateList2.set(i3, yvd0.a(yvd0Var, jFloatToRawIntBits2, 0.0f, null, WebSocketProtocol.PAYLOAD_SHORT));
                                }
                            }
                            return Unit.a;
                        }
                    };
                    this.b = v5bVar;
                    this.a = 1;
                    if (t4w.a(getContext()).P(function1, this) != y5bVar) {
                        this.b = v5bVar;
                        this.a = 2;
                        if (hkd.b(16L, this) != y5bVar) {
                            if (w5b.e(v5bVar)) {
                            }
                            return Unit.a;
                        }
                    }
                }
                return y5bVar;
            }
            uj50.b(obj);
            if (w5b.e(v5bVar)) {
            }
            return Unit.a;
        }
    }

    public static final void a(int i, final boolean z, final float f, final String str, androidx.compose.runtime.a aVar, final int i2, final int i3) {
        int i4;
        int i5;
        float f2;
        final int i6;
        final isw iswVar;
        Object obj;
        final SnapshotStateList snapshotStateList;
        int i7;
        int i8;
        int i9;
        str.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(185298920);
        int i10 = i3 & 1;
        if (i10 != 0) {
            i5 = i2 | 6;
            i4 = i;
        } else if ((i2 & 6) == 0) {
            i4 = i;
            i5 = (bVarI.d(i4) ? 4 : 2) | i2;
        } else {
            i4 = i;
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= bVarI.b(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            f2 = f;
            i5 |= bVarI.c(f2) ? 256 : 128;
        } else {
            f2 = f;
        }
        if ((i2 & 3072) == 0) {
            i5 |= bVarI.M(str) ? 2048 : 1024;
        }
        if (bVarI.q(i5 & 1, (i5 & 1171) != 1170)) {
            final int i11 = i10 != 0 ? 3 : i4;
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = new SnapshotStateList();
                bVarI.r(objY);
            }
            SnapshotStateList snapshotStateList2 = (SnapshotStateList) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = j.a(1080.0f);
                bVarI.r(objY2);
            }
            isw iswVar2 = (isw) objY2;
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = j.a(1920.0f);
                bVarI.r(objY3);
            }
            final isw iswVar3 = (isw) objY3;
            d dVarC = androidx.compose.ui.graphics.a.c(androidx.compose.foundation.layout.j.e(d.a.b, 1.0f), 0.0f, 0.0f, z ? 0.0f : 1.0f, 0.0f, 0.0f, 0.0f, 0L, null, 524283);
            int i12 = i5 & 7168;
            int i13 = i5 & 896;
            boolean z2 = ((i5 & 14) == 4) | (i12 == 2048) | (i13 == 256);
            Object objY4 = bVarI.y();
            if (z2 || objY4 == c0042a) {
                iswVar = iswVar2;
                snapshotStateList = snapshotStateList2;
                final float f3 = f2;
                i7 = 2048;
                i8 = i12;
                i9 = 0;
                obj = new Function1() { // from class: b54
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        tcf tcfVar = (tcf) obj2;
                        tcfVar.getClass();
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() >> 32));
                        isw iswVar4 = iswVar;
                        iswVar4.A(fIntBitsToFloat);
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L));
                        isw iswVar5 = iswVar3;
                        iswVar5.A(fIntBitsToFloat2);
                        SnapshotStateList snapshotStateList3 = snapshotStateList;
                        if (snapshotStateList3.isEmpty()) {
                            for (int i14 = 0; i14 < i11; i14++) {
                                float fJ = iswVar4.j() / 350.0f;
                                float fJ2 = iswVar4.j() / (f3 / (Intrinsics.g(str, "ROUND_END_WAIT") ? 3.0f : 1.0f));
                                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(iswVar4.j())) << 32) | (((long) Float.floatToRawIntBits(iswVar5.j())) & 4294967295L);
                                lx30.INSTANCE.getClass();
                                p4 p4Var = lx30.b;
                                snapshotStateList3.add(new yvd0(jFloatToRawIntBits, (fJ * 0.5f) + (p4Var.d() * fJ), fJ2, new ArrayList(), r58.d(p4Var.i() ? 4294964965L : 4293259519L), 1.0f, 0.015f));
                            }
                        }
                        ListIterator listIterator = snapshotStateList3.listIterator();
                        while (true) {
                            dxd0 dxd0Var = (dxd0) listIterator;
                            if (!dxd0Var.hasNext()) {
                                return Unit.a;
                            }
                            yvd0 yvd0Var = (yvd0) dxd0Var.next();
                            long j = yvd0Var.e;
                            float f4 = yvd0Var.b;
                            tcf tcfVar2 = tcfVar;
                            tcf.n0(tcfVar2, j58.c(0.1f, j), 2.0f * f4, yvd0Var.a, 0.0f, null, 120);
                            tcf.n0(tcfVar2, j58.c(0.25f, yvd0Var.e), 1.5f * f4, yvd0Var.a, 0.0f, null, 120);
                            tcf.n0(tcfVar2, j58.c(0.6f, j58.f), yvd0Var.b, yvd0Var.a, 0.0f, null, 120);
                            tcfVar = tcfVar2;
                        }
                    }
                };
                bVarI.r(obj);
            } else {
                i9 = 0;
                i7 = 2048;
                i8 = i12;
                iswVar = iswVar2;
                obj = objY4;
                snapshotStateList = snapshotStateList2;
            }
            rxo.b(dVarC, (Function1) obj, bVarI, i9);
            Unit unit = Unit.a;
            int i14 = ((i5 & 112) == 32 ? 1 : i9) | (i8 == i7 ? 1 : i9) | (i13 != 256 ? i9 : 1);
            Object objY5 = bVarI.y();
            if (i14 != 0 || objY5 == c0042a) {
                a aVar2 = new a(z, snapshotStateList, str, f, iswVar, iswVar3, null);
                bVarI.r(aVar2);
                objY5 = aVar2;
            }
            xvf.e(bVarI, unit, (Function2) objY5);
            i6 = i11;
        } else {
            bVarI.G();
            i6 = i4;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: d54
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    h54.a(i6, z, f, str, (a) obj2, qj40.a(i2 | 1), i3);
                    return Unit.a;
                }
            };
        }
    }
}
