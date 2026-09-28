package defpackage;

import java.util.ArrayList;
import kotlin.ranges.IntRange;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
public interface l0e0 {

    public static final class a {
        public static final C0800a a = new C0800a();

        /* JADX INFO: renamed from: l0e0$a$a, reason: collision with other inner class name */
        public static final class C0800a implements l0e0 {
            @Override // defpackage.l0e0
            public final int a(ArrayList arrayList, int i, int i2, int i3, int i4) {
                Object obj;
                int i5;
                int size = arrayList.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size) {
                        obj = null;
                        break;
                    }
                    obj = arrayList.get(i6);
                    if (((pxr) obj).getIndex() != i) {
                        break;
                    }
                    i6++;
                }
                pxr pxrVar = (pxr) obj;
                if (pxrVar != null) {
                    long jM = pxrVar.m(0);
                    i5 = (int) (pxrVar.h() ? jM & 4294967295L : jM >> 32);
                } else {
                    i5 = Integer.MIN_VALUE;
                }
                int iMax = i3 == Integer.MIN_VALUE ? -i4 : Math.max(-i4, i3);
                return i5 != Integer.MIN_VALUE ? Math.min(iMax, i5 - i2) : iMax;
            }

            @Override // defpackage.l0e0
            public final lsw b(int i, int i2, lsw lswVar) {
                int i3;
                if (i2 - i < 0 || (i3 = lswVar.b) == 0) {
                    return bwo.a;
                }
                IntRange intRangeN = f.n(0, i3);
                int i4 = intRangeN.a;
                int i5 = intRangeN.b;
                int iC = -1;
                if (i4 <= i5) {
                    while (lswVar.c(i4) <= i) {
                        iC = lswVar.c(i4);
                        if (i4 == i5) {
                            break;
                        }
                        i4++;
                    }
                }
                if (iC == -1) {
                    return bwo.a;
                }
                lsw lswVar2 = bwo.a;
                lsw lswVar3 = new lsw(1);
                lswVar3.a(iC);
                return lswVar3;
            }
        }
    }

    int a(ArrayList arrayList, int i, int i2, int i3, int i4);

    lsw b(int i, int i2, lsw lswVar);
}
