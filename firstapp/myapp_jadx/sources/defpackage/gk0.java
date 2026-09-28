package defpackage;

import com.google.protobuf.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lgk0;", "Lj8i0;", "Lsh0;", "<init>", "()V", "game-nightnday_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class gk0 extends j8i0 implements sh0 {
    public boolean a;
    public final wwd0 b = xwd0.a(dbx.b.a);
    public final b390 c;
    public final b390 d;
    public final t340 e;
    public LinkedHashMap f;

    @c0d(c = "com.sportygames.nightnday.presentation.ui.animation.AnimationViewModel", f = "AnimationViewModel.kt", l = {49, 52, 57, 61}, m = "processInternalEvent", v = 1)
    public static final class a extends x1b {
        public yh0 a;
        public Iterable b;
        public Iterator c;
        public int d;
        public int e;
        public /* synthetic */ Object f;
        public int v;

        public a(v1b<? super a> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.f = obj;
            this.v |= Integer.MIN_VALUE;
            return gk0.this.y1(null, this);
        }
    }

    public gk0() {
        pb5 pb5Var = pb5.c;
        this.c = d390.b(0, Reader.READ_DONE, pb5Var, 1);
        b390 b390VarB = d390.b(0, 500, pb5Var, 1);
        this.d = b390VarB;
        this.e = e1i.a(b390VarB);
    }

    public static ArrayList z1(int i, uf00 uf00Var) {
        ArrayList arrayList = new ArrayList(l48.r(uf00Var, 10));
        int i2 = 0;
        for (Object obj : uf00Var) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                b.q();
                throw null;
            }
            fcb0 fcb0Var = (fcb0) obj;
            arrayList.add(i2 == 0 ? new nh0.c(i, fcb0Var.a, fcb0Var.b) : new nh0.a(i, fcb0Var.a, fcb0Var.b));
            i2 = i3;
        }
        return arrayList;
    }

    public final void x1(qh0 qh0Var) {
        cm8 cm8Var;
        if (this.a) {
            if (!(qh0Var instanceof qh0.b)) {
                if (!(qh0Var instanceof qh0.a)) {
                    uhc.a();
                    return;
                }
                LinkedHashMap linkedHashMap = this.f;
                if (linkedHashMap == null || (cm8Var = (cm8) linkedHashMap.get(((qh0.a) qh0Var).a)) == null) {
                    return;
                }
                cm8Var.G(Unit.a);
                return;
            }
            dbx dbxVar = ((qh0.b) qh0Var).a;
            wwd0 wwd0Var = this.b;
            dbx dbxVar2 = (dbx) wwd0Var.getValue();
            boolean z = dbxVar2 instanceof dbx.a;
            b390 b390Var = this.c;
            if (!z) {
                dbx.b bVar = dbx.b.a;
                if (!Intrinsics.g(dbxVar2, bVar)) {
                    uhc.a();
                    return;
                }
                if (dbxVar instanceof dbx.a) {
                    dbx.a aVar = (dbx.a) dbxVar;
                    b390Var.getClass();
                    fcb0 fcb0VarL0 = sh0.l0(aVar, true);
                    fcb0 fcb0VarB0 = sh0.B0(aVar, true);
                    b390Var.a(new yh0(a4h.a(fcb0VarL0, new fcb0("BG_Loop_".concat(aVar.a.b), true)), a4h.a(fcb0VarB0), a4h.a(fcb0VarL0.a, fcb0VarB0.a), z8x.n.a));
                } else if (!Intrinsics.g(dbxVar, bVar)) {
                    uhc.a();
                    return;
                }
            } else if (!(dbxVar instanceof dbx.a)) {
                if (!Intrinsics.g(dbxVar, dbx.b.a)) {
                    uhc.a();
                    return;
                }
                dbx.a aVar2 = (dbx.a) dbxVar2;
                b390Var.getClass();
                fcb0 fcb0VarL1 = sh0.l0(aVar2, false);
                fcb0 fcb0VarB1 = sh0.B0(aVar2, false);
                b390Var.a(new yh0(a4h.a(fcb0VarL1, new fcb0("BG_Idle", true)), a4h.a(fcb0VarB1), a4h.a(fcb0VarL1.a, fcb0VarB1.a), z8x.o.a));
            }
            wwd0Var.setValue(dbxVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0086  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f6 A[LOOP:1: B:37:0x00f0->B:39:0x00f6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x011a A[PHI: r4
      0x011a: PHI (r4v10 yh0) = (r4v9 yh0), (r4v14 yh0) binds: [B:41:0x0117, B:17:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x0120  */
    /* JADX WARN: Code duplicated, block: B:51:0x0134 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:? A[LOOP:0: B:28:0x00b4->B:53:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009f, code lost:
    
        if (r8.emit(r15, r2) == r3) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0132, code lost:
    
        if (r8.emit(r1, r2) == r3) goto L47;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x009f -> B:26:0x00a3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y1(defpackage.yh0 r17, defpackage.v1b<? super kotlin.Unit> r18) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gk0.y1(yh0, v1b):java.lang.Object");
    }
}
