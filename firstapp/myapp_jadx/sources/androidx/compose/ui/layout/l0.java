package androidx.compose.ui.layout;

import defpackage.jln;
import defpackage.uk40;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public interface l0 {
    public static final a a = a.a;

    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final m0 b;
        public static final m0 c;
        public static final m0 d;
        public static final m0 e;
        public static final m0 f;
        public static final m0 g;
        public static final m0 h;
        public static final m0 i;
        public static final m0 j;

        static {
            m0 m0Var = new m0("caption bar");
            b = m0Var;
            m0 m0Var2 = new m0("display cutout");
            c = m0Var2;
            m0 m0Var3 = new m0("ime");
            d = m0Var3;
            m0 m0Var4 = new m0("mandatory system gestures");
            e = m0Var4;
            m0 m0Var5 = new m0("navigation bars");
            f = m0Var5;
            m0 m0Var6 = new m0("status bars");
            g = m0Var6;
            char c2 = 2;
            l0[] l0VarArr = {m0Var6, m0Var5, m0Var};
            ArrayList arrayList = new ArrayList(3);
            for (int i2 = 0; i2 < 3; i2++) {
                arrayList.add(l0VarArr[i2].b());
            }
            uk40[] uk40VarArr = (uk40[]) arrayList.toArray(new uk40[0]);
            new jln((uk40[]) Arrays.copyOf(uk40VarArr, uk40VarArr.length));
            ArrayList arrayList2 = new ArrayList(3);
            for (int i3 = 0; i3 < 3; i3++) {
                arrayList2.add(l0VarArr[i3].a());
            }
            uk40[] uk40VarArr2 = (uk40[]) arrayList2.toArray(new uk40[0]);
            new jln((uk40[]) Arrays.copyOf(uk40VarArr2, uk40VarArr2.length));
            m0 m0Var7 = new m0("system gestures");
            h = m0Var7;
            m0 m0Var8 = new m0("tappable element");
            i = m0Var8;
            m0 m0Var9 = new m0("waterfall");
            j = m0Var9;
            l0[] l0VarArr2 = {m0Var6, m0Var5, m0Var, m0Var2, m0Var3, m0Var8};
            ArrayList arrayList3 = new ArrayList(6);
            int i4 = 0;
            while (i4 < 6) {
                arrayList3.add(l0VarArr2[i4].b());
                i4++;
                c2 = c2;
            }
            char c3 = c2;
            uk40[] uk40VarArr3 = (uk40[]) arrayList3.toArray(new uk40[0]);
            new jln((uk40[]) Arrays.copyOf(uk40VarArr3, uk40VarArr3.length));
            ArrayList arrayList4 = new ArrayList(6);
            for (int i5 = 0; i5 < 6; i5++) {
                arrayList4.add(l0VarArr2[i5].a());
            }
            uk40[] uk40VarArr4 = (uk40[]) arrayList4.toArray(new uk40[0]);
            new jln((uk40[]) Arrays.copyOf(uk40VarArr4, uk40VarArr4.length));
            l0[] l0VarArr3 = new l0[4];
            l0VarArr3[0] = m0Var4;
            l0VarArr3[1] = m0Var7;
            l0VarArr3[c3] = m0Var8;
            l0VarArr3[3] = m0Var9;
            ArrayList arrayList5 = new ArrayList(4);
            for (int i6 = 0; i6 < 4; i6++) {
                arrayList5.add(l0VarArr3[i6].b());
            }
            uk40[] uk40VarArr5 = (uk40[]) arrayList5.toArray(new uk40[0]);
            new jln((uk40[]) Arrays.copyOf(uk40VarArr5, uk40VarArr5.length));
            ArrayList arrayList6 = new ArrayList(4);
            for (int i7 = 0; i7 < 4; i7++) {
                arrayList6.add(l0VarArr3[i7].a());
            }
            uk40[] uk40VarArr6 = (uk40[]) arrayList6.toArray(new uk40[0]);
            new jln((uk40[]) Arrays.copyOf(uk40VarArr6, uk40VarArr6.length));
            l0[] l0VarArr4 = new l0[9];
            l0VarArr4[0] = m0Var6;
            l0VarArr4[1] = m0Var5;
            l0VarArr4[c3] = m0Var;
            l0VarArr4[3] = m0Var3;
            l0VarArr4[4] = m0Var7;
            l0VarArr4[5] = m0Var4;
            l0VarArr4[6] = m0Var8;
            l0VarArr4[7] = m0Var2;
            l0VarArr4[8] = m0Var9;
            ArrayList arrayList7 = new ArrayList(9);
            for (int i8 = 0; i8 < 9; i8++) {
                arrayList7.add(l0VarArr4[i8].b());
            }
            uk40[] uk40VarArr7 = (uk40[]) arrayList7.toArray(new uk40[0]);
            new jln((uk40[]) Arrays.copyOf(uk40VarArr7, uk40VarArr7.length));
            ArrayList arrayList8 = new ArrayList(9);
            for (int i9 = 0; i9 < 9; i9++) {
                arrayList8.add(l0VarArr4[i9].a());
            }
            uk40[] uk40VarArr8 = (uk40[]) arrayList8.toArray(new uk40[0]);
            new jln((uk40[]) Arrays.copyOf(uk40VarArr8, uk40VarArr8.length));
        }
    }

    uk40 a();

    uk40 b();
}
