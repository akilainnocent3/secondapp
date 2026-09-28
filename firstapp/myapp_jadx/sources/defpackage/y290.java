package defpackage;

import androidx.compose.animation.j;
import androidx.compose.animation.k;
import androidx.compose.animation.n;
import androidx.compose.runtime.m;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.ListIterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class y290 {
    public final String a;
    public final n b;
    public b75 f;
    public b75 g;
    public int i;
    public boolean j;
    public final ytw c = m.b(Boolean.FALSE);
    public final ytw d = m.b(null);
    public final ytw e = m.b(null);
    public final ytw h = m.b(0);
    public final SnapshotStateList<k> k = new SnapshotStateList<>();
    public final x290 l = new x290(this);
    public final w290 m = new w290(this);

    public y290(String str, n nVar) {
        this.a = str;
        this.b = nVar;
    }

    public final lk40 a() {
        return (lk40) ((x5a0) this.e).getValue();
    }

    public final boolean b() {
        return ((Boolean) ((x5a0) this.c).getValue()).booleanValue();
    }

    public final i5f0 c() {
        if (b()) {
            return (i5f0) ((x5a0) this.d).getValue();
        }
        return null;
    }

    public final boolean d() {
        SnapshotStateList<k> snapshotStateList = this.k;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            if (snapshotStateList.get(i).d().a()) {
                return true;
            }
        }
        return false;
    }

    public final void e() {
        Object next;
        ListIterator<k> listIterator = this.k.listIterator();
        do {
            dxd0 dxd0Var = (dxd0) listIterator;
            if (!dxd0Var.hasNext()) {
                next = null;
                break;
            }
            next = dxd0Var.next();
        } while (!((k) next).d().a());
        k kVar = (k) next;
        if (kVar == null && this.g == null) {
            return;
        }
        if (Intrinsics.g(kVar != null ? kVar.z : null, this.g)) {
            return;
        }
        ((x5a0) this.h).setValue(Integer.valueOf(this.i + 1));
    }

    public final boolean f() {
        SnapshotStateList<k> snapshotStateList = this.k;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            dtg0<?> dtg0Var = snapshotStateList.get(i).d().b;
            while (true) {
                dtg0<?> dtg0Var2 = dtg0Var.b;
                if (dtg0Var2 == null) {
                    break;
                }
                dtg0Var = dtg0Var2;
            }
            if (!Intrinsics.g(dtg0Var.a.V(), ((x5a0) dtg0Var.d).getValue())) {
                if (b()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final lk40 g() {
        if (this.f == null) {
            return null;
        }
        SnapshotStateList<k> snapshotStateList = this.k;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            if (Intrinsics.g(snapshotStateList.get(i).z, this.f)) {
                b75 b75Var = this.f;
                if (b75Var != null) {
                    return b75Var.x1();
                }
                return null;
            }
        }
        return null;
    }

    public final void h() {
        boolean zD = d();
        SnapshotStateList<k> snapshotStateList = this.k;
        int size = snapshotStateList.size();
        ytw ytwVar = this.c;
        n nVar = this.b;
        if (size > 1 && zD) {
            ((x5a0) ytwVar).setValue(Boolean.TRUE);
        } else if (!nVar.i()) {
            ((x5a0) ytwVar).setValue(Boolean.FALSE);
        } else if (!zD) {
            ((x5a0) ytwVar).setValue(Boolean.FALSE);
        }
        if (!snapshotStateList.isEmpty() && !nVar.c) {
            n.z.getValue().d(this, this.l, this.m);
        }
        e();
    }

    public final void i() {
        k kVar;
        ytw ytwVar = this.h;
        if (((Number) ((x5a0) ytwVar).getValue()).intValue() != this.i) {
            SnapshotStateList<k> snapshotStateList = this.k;
            int size = snapshotStateList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    kVar = null;
                    break;
                }
                kVar = snapshotStateList.get(i);
                if (kVar.d().a()) {
                    break;
                } else {
                    i++;
                }
            }
            k kVar2 = kVar;
            if (kVar2 == null) {
                kVar2 = (k) CollectionsKt.firstOrNull(snapshotStateList);
            }
            j jVar = kVar2 != null ? kVar2.z : null;
            if (!Intrinsics.g(jVar, this.g)) {
                b75 b75Var = this.g;
                this.f = b75Var;
                if (!Intrinsics.g(b75Var, jVar)) {
                    this.f = this.g;
                }
                this.g = jVar;
                this.j = true;
            }
            if (jVar == null) {
                if (!Intrinsics.g(this.g, null)) {
                    this.f = this.g;
                }
                this.g = null;
            }
            this.i = ((Number) ((x5a0) ytwVar).getValue()).intValue();
        }
    }
}
