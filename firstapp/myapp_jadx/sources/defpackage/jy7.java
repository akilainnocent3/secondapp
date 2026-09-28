package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class jy7 {
    public static final boolean a(iy7 iy7Var, int i, int i2) {
        iy7Var.getClass();
        if (iy7Var instanceof iy7.b) {
            iy7.b bVar = (iy7.b) iy7Var;
            return bVar.a == i && bVar.b == i2;
        }
        if (iy7Var instanceof iy7.c) {
            iy7.c cVar = (iy7.c) iy7Var;
            if (cVar.a == i && cVar.b == i2) {
                return true;
            }
        }
        return false;
    }

    public static final boolean b(iy7 iy7Var, iy7 iy7Var2) {
        iy7Var.getClass();
        iy7Var2.getClass();
        if (iy7Var instanceof iy7.b) {
            iy7.b bVar = iy7Var2 instanceof iy7.b ? (iy7.b) iy7Var2 : null;
            if (bVar == null) {
                return false;
            }
            iy7.b bVar2 = (iy7.b) iy7Var;
            return bVar2.a == bVar.a && bVar2.b == bVar.b;
        }
        if (iy7Var instanceof iy7.c) {
            iy7.c cVar = iy7Var2 instanceof iy7.c ? (iy7.c) iy7Var2 : null;
            if (cVar == null) {
                return false;
            }
            iy7.c cVar2 = (iy7.c) iy7Var;
            return cVar2.a == cVar.a && cVar2.b == cVar.b;
        }
        if (iy7Var instanceof iy7.e) {
            iy7.e eVar = iy7Var2 instanceof iy7.e ? (iy7.e) iy7Var2 : null;
            if (eVar == null) {
                return false;
            }
            iy7.e eVar2 = (iy7.e) iy7Var;
            return Intrinsics.g(eVar2.a, eVar.a) && Intrinsics.g(eVar2.b, eVar.b) && eVar2.c == eVar.c && Intrinsics.g(eVar2.d, eVar.d);
        }
        if (iy7Var instanceof iy7.d) {
            iy7.d dVar = iy7Var2 instanceof iy7.d ? (iy7.d) iy7Var2 : null;
            if (dVar == null) {
                return false;
            }
            return ax7.a((iy7.d) iy7Var, dVar);
        }
        if (!(iy7Var instanceof iy7.a)) {
            uhc.a();
            return false;
        }
        if ((iy7Var2 instanceof iy7.a ? (iy7.a) iy7Var2 : null) == null) {
            return false;
        }
        return Intrinsics.g(null, null);
    }
}
