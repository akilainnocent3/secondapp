package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class sho {
    public static final boolean a(ogo ogoVar) {
        if (ogoVar != null && (ogoVar instanceof ogo.b)) {
            ogo.b bVar = (ogo.b) ogoVar;
            if (bVar.a == null && bVar.b == null) {
                return true;
            }
        }
        return false;
    }

    public static final boolean b(ogo ogoVar, ogo ogoVar2) {
        ogoVar2.getClass();
        if ((ogoVar instanceof ogo.c) && (ogoVar2 instanceof ogo.c)) {
            return ((ogo.c) ogoVar).d == ((ogo.c) ogoVar2).d;
        }
        if (!(ogoVar instanceof ogo.b) || !(ogoVar2 instanceof ogo.b)) {
            return (ogoVar instanceof ogo.a) && (ogoVar2 instanceof ogo.a);
        }
        ogo.b bVar = (ogo.b) ogoVar;
        ogo.b bVar2 = (ogo.b) ogoVar2;
        return Intrinsics.f(bVar.a, bVar2.a) && Intrinsics.f(bVar.b, bVar2.b);
    }
}
