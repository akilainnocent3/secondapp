package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes.dex */
public final class jch {
    /* JADX WARN: Multi-variable type inference failed */
    public static final ArrayList a(ngs ngsVar, ngs ngsVar2) {
        Iterator<Integer> it = b.i(ngsVar2).iterator();
        mwo mwoVar = (mwo) it;
        if (!mwoVar.c) {
            lrh0.a();
            return null;
        }
        zvo zvoVar = (zvo) it;
        int iNextInt = zvoVar.nextInt();
        if (mwoVar.c) {
            float fB = b(((i430) ngsVar.get(0)).b, ((i430) ngsVar2.get(iNextInt)).b);
            do {
                int iNextInt2 = zvoVar.nextInt();
                float fB2 = b(((i430) ngsVar.get(0)).b, ((i430) ngsVar2.get(iNextInt2)).b);
                if (Float.compare(fB, fB2) > 0) {
                    iNextInt = iNextInt2;
                    fB = fB2;
                }
            } while (mwoVar.c);
        }
        int b = ngsVar.getB();
        int b2 = ngsVar2.getB();
        ArrayList arrayListL = b.l(ngsVar2.get(iNextInt));
        int i = iNextInt;
        for (int i2 = 1; i2 < b; i2++) {
            int i3 = iNextInt - (b - i2);
            if (i3 <= i) {
                i3 += b2;
            }
            Iterator<Integer> it2 = new IntRange(i + 1, i3, 1).iterator();
            mwo mwoVar2 = (mwo) it2;
            if (!mwoVar2.c) {
                lrh0.a();
                return null;
            }
            zvo zvoVar2 = (zvo) it2;
            int iNextInt3 = zvoVar2.nextInt();
            if (mwoVar2.c) {
                float fB3 = b(((i430) ngsVar.get(i2)).b, ((i430) ngsVar2.get(iNextInt3 % b2)).b);
                do {
                    int iNextInt4 = zvoVar2.nextInt();
                    float fB4 = b(((i430) ngsVar.get(i2)).b, ((i430) ngsVar2.get(iNextInt4 % b2)).b);
                    if (Float.compare(fB3, fB4) > 0) {
                        iNextInt3 = iNextInt4;
                        fB3 = fB4;
                    }
                } while (mwoVar2.c);
            }
            i = iNextInt3;
            arrayListL.add(ngsVar2.get(i % b2));
        }
        return arrayListL;
    }

    public static final float b(ubh ubhVar, ubh ubhVar2) {
        ubhVar.getClass();
        ubhVar2.getClass();
        if ((ubhVar instanceof ubh.a) && (ubhVar2 instanceof ubh.a) && ((ubh.a) ubhVar).d != ((ubh.a) ubhVar2).d) {
            return Float.MAX_VALUE;
        }
        List<e4c> list = ubhVar.a;
        List<e4c> list2 = ubhVar.a;
        float fA = (((e4c) CollectionsKt.b0(list2)).a() + ((e4c) CollectionsKt.T(list)).a[0]) / 2.0f;
        float fB = (((e4c) CollectionsKt.b0(list2)).b() + ((e4c) CollectionsKt.T(list2)).a[1]) / 2.0f;
        List<e4c> list3 = ubhVar2.a;
        List<e4c> list4 = ubhVar2.a;
        float fA2 = (((e4c) CollectionsKt.b0(list4)).a() + ((e4c) CollectionsKt.T(list3)).a[0]) / 2.0f;
        float f = fA - fA2;
        float fB2 = fB - ((((e4c) CollectionsKt.b0(list4)).b() + ((e4c) CollectionsKt.T(list4)).a[1]) / 2.0f);
        return (fB2 * fB2) + (f * f);
    }
}
