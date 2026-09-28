package androidx.compose.animation;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import defpackage.bxz;
import defpackage.d490;
import defpackage.dxd0;
import defpackage.ej5;
import defpackage.gly;
import defpackage.grr;
import defpackage.hrh;
import defpackage.isw;
import defpackage.j350;
import defpackage.lk40;
import defpackage.lza;
import defpackage.qc6;
import defpackage.t5a0;
import defpackage.t65;
import defpackage.v6l;
import defpackage.w290;
import defpackage.x290;
import defpackage.x5a0;
import defpackage.y290;
import defpackage.y6l;
import defpackage.ytw;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class k implements grr, j350 {
    public final ytw c;
    public final ytw d;
    public final ytw f;
    public final ytw i;
    public final ytw v;
    public bxz w;
    public k y;
    public j z;
    public final isw a = androidx.compose.runtime.j.a(0.0f);
    public final ytw b = androidx.compose.runtime.m.b(Boolean.TRUE);
    public final ytw e = androidx.compose.runtime.m.b(l.b.a.C0036a.b);
    public final ytw A = androidx.compose.runtime.m.b(null);

    public k(y290 y290Var, t65 t65Var, boolean z, l.a aVar, l.d dVar) {
        this.c = androidx.compose.runtime.m.b(y290Var);
        this.d = androidx.compose.runtime.m.b(t65Var);
        this.f = androidx.compose.runtime.m.b(Boolean.valueOf(z));
        this.i = androidx.compose.runtime.m.b(aVar);
        this.v = androidx.compose.runtime.m.b(dVar);
    }

    @Override // defpackage.grr
    public final void a(lza lzaVar) {
        v6l v6lVar = (v6l) ((x5a0) this.A).getValue();
        if (v6lVar == null || !i() || g().a() == null) {
            return;
        }
        lk40 lk40VarA = g().a();
        gly glyVar = lk40VarA != null ? new gly(lk40VarA.e()) : null;
        glyVar.getClass();
        long j = glyVar.a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        bxz bxzVar = this.w;
        if (bxzVar == null) {
            lzaVar.F1().a.i(fIntBitsToFloat, fIntBitsToFloat2);
            try {
                y6l.a(lzaVar, v6lVar);
                return;
            } finally {
                lzaVar.F1().a.i(-fIntBitsToFloat, -fIntBitsToFloat2);
            }
        }
        qc6.b bVarF1 = lzaVar.F1();
        long jD = bVarF1.d();
        bVarF1.a().p();
        try {
            bVarF1.a.a(bxzVar, 1);
            lzaVar.F1().a.i(fIntBitsToFloat, fIntBitsToFloat2);
            try {
                y6l.a(lzaVar, v6lVar);
                lzaVar.F1().a.i(-fIntBitsToFloat, -fIntBitsToFloat2);
                hrh.a(bVarF1, jD);
            } catch (Throwable th) {
                lzaVar.F1().a.i(-fIntBitsToFloat, -fIntBitsToFloat2);
                throw th;
            }
        } catch (Throwable th2) {
            hrh.a(bVarF1, jD);
            throw th2;
        }
    }

    @Override // defpackage.grr
    public final float b() {
        return ((t5a0) this.a).j();
    }

    @Override // defpackage.j350
    public final void c() {
        n nVar = g().b;
        y290 y290VarG = g();
        y290VarG.k.add(this);
        n nVar2 = y290VarG.b;
        x290 x290Var = y290VarG.l;
        w290 w290Var = y290VarG.m;
        if (!nVar2.c) {
            n.z.getValue().d(y290VarG, x290Var, w290Var);
        }
        nVar.f.invoke(nVar);
        nVar2.a();
        SnapshotStateList<grr> snapshotStateList = nVar.w;
        ListIterator<grr> listIterator = snapshotStateList.listIterator();
        int i = 0;
        while (true) {
            dxd0 dxd0Var = (dxd0) listIterator;
            if (!dxd0Var.hasNext()) {
                i = -1;
                break;
            }
            grr grrVar = (grr) dxd0Var.next();
            k kVar = grrVar instanceof k ? (k) grrVar : null;
            if (Intrinsics.g(kVar != null ? kVar.g() : null, g())) {
                break;
            } else {
                i++;
            }
        }
        if (i == snapshotStateList.size() - 1 || i == -1) {
            snapshotStateList.add(this);
        } else {
            snapshotStateList.add(i + 1, this);
        }
        g().e();
    }

    public final t65 d() {
        return (t65) ((x5a0) this.d).getValue();
    }

    @Override // defpackage.j350
    public final void e() {
    }

    @Override // defpackage.j350
    public final void f() {
        n nVar = g().b;
        y290 y290VarG = g();
        n nVar2 = y290VarG.b;
        SnapshotStateList<k> snapshotStateList = y290VarG.k;
        snapshotStateList.remove(this);
        if (snapshotStateList.isEmpty()) {
            y290VarG.h();
            n.z.getValue().b(y290VarG);
        } else {
            x290 x290Var = y290VarG.l;
            w290 w290Var = y290VarG.m;
            if (!nVar2.c) {
                n.z.getValue().d(y290VarG, x290Var, w290Var);
            }
        }
        nVar.f.invoke(nVar);
        nVar2.a();
        nVar.w.remove(this);
        if (snapshotStateList.isEmpty()) {
            ej5.c(nVar2.b, null, null, new d490(y290VarG, null), 3);
        }
        g().e();
    }

    public final y290 g() {
        return (y290) ((x5a0) this.c).getValue();
    }

    public final boolean h() {
        return Intrinsics.g(g().g, this.z) || !((Boolean) ((x5a0) this.f).getValue()).booleanValue();
    }

    public final boolean i() {
        return h() && g().b() && ((Boolean) ((x5a0) this.b).getValue()).booleanValue() && g().b.i();
    }
}
