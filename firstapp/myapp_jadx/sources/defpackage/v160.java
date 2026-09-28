package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class v160 {
    public x6j0 a;
    public ArrayList<x6j0> b;

    public static long a(zmd zmdVar, long j) {
        x6j0 x6j0Var = zmdVar.d;
        ArrayList arrayList = zmdVar.k;
        if (x6j0Var instanceof xil) {
            return j;
        }
        int size = arrayList.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            smd smdVar = (smd) arrayList.get(i);
            if (smdVar instanceof zmd) {
                zmd zmdVar2 = (zmd) smdVar;
                if (zmdVar2.d != x6j0Var) {
                    jMin = Math.min(jMin, a(zmdVar2, ((long) zmdVar2.f) + j));
                }
            }
        }
        zmd zmdVar3 = x6j0Var.i;
        zmd zmdVar4 = x6j0Var.h;
        if (zmdVar != zmdVar3) {
            return jMin;
        }
        long j2 = j - x6j0Var.j();
        return Math.min(Math.min(jMin, a(zmdVar4, j2)), j2 - ((long) zmdVar4.f));
    }

    public static long b(zmd zmdVar, long j) {
        x6j0 x6j0Var = zmdVar.d;
        ArrayList arrayList = zmdVar.k;
        if (x6j0Var instanceof xil) {
            return j;
        }
        int size = arrayList.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            smd smdVar = (smd) arrayList.get(i);
            if (smdVar instanceof zmd) {
                zmd zmdVar2 = (zmd) smdVar;
                if (zmdVar2.d != x6j0Var) {
                    jMax = Math.max(jMax, b(zmdVar2, ((long) zmdVar2.f) + j));
                }
            }
        }
        zmd zmdVar3 = x6j0Var.h;
        zmd zmdVar4 = x6j0Var.i;
        if (zmdVar != zmdVar3) {
            return jMax;
        }
        long j2 = x6j0Var.j() + j;
        return Math.max(Math.max(jMax, b(zmdVar4, j2)), j2 - ((long) zmdVar4.f));
    }
}
