package defpackage;

import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import coil3.compose.internal.CBvK.lobGSRIlnSGJY;
import com.google.protobuf.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class u2f0 implements z8w {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ v2f0 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ jr70 e;

    public u2f0(float f, float f2, v2f0 v2f0Var, int i, jr70 jr70Var) {
        this.a = f;
        this.b = f2;
        this.c = v2f0Var;
        this.d = i;
        this.e = jr70Var;
    }

    @Override // defpackage.z8w
    public final biv c(final t tVar, List<? extends List<? extends vhv>> list, long j) {
        ArrayList arrayList = (ArrayList) list;
        List list2 = (List) arrayList.get(0);
        List list3 = (List) arrayList.get(1);
        float f = this.a;
        int iY0 = tVar.y0(f);
        int size = list2.size();
        Integer numValueOf = 0;
        int size2 = list2.size();
        for (int i = 0; i < size2; i++) {
            numValueOf = Integer.valueOf(Math.max(numValueOf.intValue(), ((vhv) list2.get(i)).x(Reader.READ_DONE)));
        }
        final int iIntValue = numValueOf.intValue();
        int i2 = iY0 * 2;
        float f2 = this.b;
        long jB = kxa.b(tVar.y0(f2), 0, iIntValue, iIntValue, 2, j);
        final aq40 aq40Var = new aq40();
        aq40Var.a = f;
        ArrayList arrayList2 = new ArrayList(list2.size());
        int size3 = list2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            arrayList2.add(((vhv) list2.get(i3)).d0(jB));
        }
        int[] iArrCopyOf = new int[16];
        int size4 = list2.size();
        int i4 = 0;
        int i5 = 0;
        while (i4 < size4) {
            List list4 = list2;
            int iB0 = ((vhv) list2.get(i4)).b0(Reader.READ_DONE);
            int i6 = i5 + 1;
            int i7 = iY0;
            if (iArrCopyOf.length < i6) {
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i6, (iArrCopyOf.length * 3) / 2));
            }
            iArrCopyOf[i5] = iB0;
            i4++;
            i5 = i6;
            list2 = list4;
            iY0 = i7;
        }
        final int i8 = iY0;
        final ArrayList arrayList3 = new ArrayList(size);
        int iY1 = i2;
        int i9 = 0;
        while (i9 < size) {
            float f3 = ((g7f) wl8.d(new g7f(f2), new g7f(tVar.u1(((y) arrayList2.get(i9)).a)))).a;
            iY1 += tVar.y0(f3);
            if (i9 < 0 || i9 >= i5) {
                mae0.a(lobGSRIlnSGJY.KwyUXYVsQZwKwEZ);
                return null;
            }
            int[] iArr = iArrCopyOf;
            float f4 = ((g7f) wl8.d(new g7f(tVar.u1(iArrCopyOf[i9]) - (w1f0.b * 2.0f)), new g7f(24.0f))).a;
            float f5 = aq40Var.a;
            z1f0 z1f0Var = new z1f0(f5, f3, f4);
            aq40Var.a = f5 + f3;
            arrayList3.add(z1f0Var);
            i9++;
            iArrCopyOf = iArr;
        }
        ((x5a0) this.c.a).setValue(arrayList3);
        ArrayList arrayList4 = arrayList2;
        final ArrayList arrayList5 = new ArrayList(list3.size());
        int size5 = list3.size();
        int i10 = 0;
        while (i10 < size5) {
            arrayList5.add(((vhv) list3.get(i10)).d0(kxa.a(0, tVar.y0(((z1f0) arrayList3.get(this.d)).c), 0, iIntValue)));
            i10++;
            list3 = list3;
            arrayList4 = arrayList4;
        }
        final ArrayList arrayList6 = arrayList4;
        final float f6 = this.a;
        final jr70 jr70Var = this.e;
        final int i11 = this.d;
        return t.z1(tVar, iY1, iIntValue, new Function1() { // from class: t2f0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                t tVar2;
                ArrayList arrayList7;
                y.a aVar = (y.a) obj;
                aq40 aq40Var2 = aq40Var;
                aq40Var2.a = f6;
                ArrayList arrayList8 = arrayList6;
                int size6 = arrayList8.size();
                int i12 = 0;
                while (true) {
                    tVar2 = tVar;
                    arrayList7 = arrayList3;
                    if (i12 >= size6) {
                        break;
                    }
                    y.a.A(aVar, (y) arrayList8.get(i12), tVar2.y0(aq40Var2.a), 0);
                    aq40Var2.a += ((z1f0) arrayList7.get(i12)).b;
                    i12++;
                }
                ArrayList arrayList9 = arrayList5;
                int size7 = arrayList9.size();
                int i13 = 0;
                while (true) {
                    int i14 = i11;
                    if (i13 >= size7) {
                        jr70Var.a(tVar2, i8, arrayList7, i14);
                        return Unit.a;
                    }
                    y yVar = (y) arrayList9.get(i13);
                    y.a.A(aVar, yVar, Math.max(0, (tVar2.y0(((z1f0) arrayList7.get(i14)).b) - yVar.a) / 2), iIntValue - yVar.b);
                    i13++;
                }
            }
        });
    }
}
