package defpackage;

import androidx.compose.ui.d;
import androidx.compose.ui.focus.FocusTargetNode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h4i extends saj implements Function0<Unit> {
    /* JADX WARN: Code duplicated, block: B:16:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0058 A[LOOP:0: B:7:0x0021->B:17:0x0058, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:65:0x010d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x010f A[LOOP:4: B:56:0x00df->B:66:0x010f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x0112 A[EDGE_INSN: B:74:0x0112->B:67:0x0112 BREAK  A[LOOP:0: B:7:0x0021->B:17:0x0058], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x0112 A[EDGE_INSN: B:92:0x0112->B:67:0x0112 BREAK  A[LOOP:4: B:56:0x00df->B:66:0x010f], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        wwx wwxVar;
        d.c cVar;
        i4i i4iVar = (i4i) this.receiver;
        stw<FocusTargetNode> stwVar = i4iVar.c;
        stw<w3i> stwVar2 = i4iVar.d;
        t4i t4iVar = i4iVar.a;
        FocusTargetNode focusTargetNode = t4iVar.h;
        if (focusTargetNode == null) {
            Object[] objArr = stwVar2.b;
            long[] jArr = stwVar2.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((j & 255) < 128) {
                                ((w3i) objArr[(i << 3) + i3]).E1(k5i.d);
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                        if (i != length) {
                            break;
                        }
                        i++;
                    }
                }
            }
        } else if (focusTargetNode.C) {
            if (stwVar.a(focusTargetNode)) {
                focusTargetNode.s2();
            }
            k5i k5iVarV = focusTargetNode.V();
            if (!focusTargetNode.a.C) {
                wkn.c("visitAncestors called on an unattached node");
            }
            d.c cVar2 = focusTargetNode.a;
            tsr tsrVarF = pkd.f(focusTargetNode);
            int i4 = 0;
            while (tsrVarF != null) {
                if ((tsrVarF.U.f.d & 5120) != 0) {
                    while (cVar != null) {
                        int i5 = cVar.c;
                        if ((i5 & 5120) != 0) {
                            if ((i5 & 1024) != 0) {
                                i4++;
                            }
                            if ((cVar instanceof w3i) && stwVar2.a((w3i) cVar)) {
                                if (i4 <= 1) {
                                    ((w3i) cVar).E1(k5iVarV);
                                } else {
                                    ((w3i) cVar).E1(k5i.b);
                                }
                                stwVar2.l((w3i) cVar);
                            }
                        }
                        cVar = cVar.e;
                    }
                }
                cVar = cVar2;
                tsrVarF = tsrVarF.H();
                cVar2 = (tsrVarF == null || (wwxVar = tsrVarF.U) == null) ? null : wwxVar.e;
            }
            Object[] objArr2 = stwVar2.b;
            long[] jArr2 = stwVar2.a;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i6 = 0;
                while (true) {
                    long j2 = jArr2[i6];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i6 != length2) {
                            break;
                            break;
                        }
                        i6++;
                    } else {
                        int i7 = 8 - ((~(i6 - length2)) >>> 31);
                        for (int i8 = 0; i8 < i7; i8++) {
                            if ((j2 & 255) < 128) {
                                ((w3i) objArr2[(i6 << 3) + i8]).E1(k5i.d);
                            }
                            j2 >>= 8;
                        }
                        if (i7 != 8) {
                            break;
                        }
                        if (i6 != length2) {
                            break;
                        }
                        i6++;
                    }
                }
            }
        }
        if (t4iVar.h == null || t4iVar.c.V() == k5i.d) {
            t4iVar.v();
        }
        stwVar.e();
        stwVar2.e();
        i4iVar.e = false;
        return Unit.a;
    }
}
