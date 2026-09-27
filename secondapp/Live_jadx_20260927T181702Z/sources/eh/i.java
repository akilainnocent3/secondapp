package eh;

import android.util.Pair;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f80978a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f80979b = {"", l3.a.W4, "B", "C"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f80980c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f80981d = 32;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f80982e = 15;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f80983f = 0;

    public static String a(int i10, int i11, int i12) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public static List<byte[]> b(boolean z10) {
        return Collections.singletonList(z10 ? new byte[]{1} : new byte[]{0});
    }

    public static String c(int i10, boolean z10, int i11, int i12, int[] iArr, int i13) {
        StringBuilder sb2 = new StringBuilder(o1.M("hvc1.%s%d.%X.%c%d", f80979b[i10], Integer.valueOf(i11), Integer.valueOf(i12), Character.valueOf(z10 ? 'H' : 'L'), Integer.valueOf(i13)));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i14 = 0; i14 < length; i14++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i14])));
        }
        return sb2.toString();
    }

    public static byte[] d(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = f80978a;
        byte[] bArr3 = new byte[bArr2.length + i11];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i10, bArr3, bArr2.length, i11);
        return bArr3;
    }

    public static int e(byte[] bArr, int i10) {
        int length = bArr.length - f80978a.length;
        while (i10 <= length) {
            if (g(bArr, i10)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static Pair<Integer, Integer> f(byte[] bArr) {
        boolean z10;
        t0 t0Var = new t0(bArr);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = i11 + 3;
            if (i12 >= bArr.length) {
                z10 = false;
                break;
            }
            if (t0Var.O() == 1 && (bArr[i12] & 240) == 32) {
                z10 = true;
                break;
            }
            t0Var.Y(t0Var.f() - 2);
            i11++;
        }
        a.b(z10, "Invalid input: VOL not found.");
        s0 s0Var = new s0(bArr);
        s0Var.s((i11 + 4) * 8);
        s0Var.s(1);
        s0Var.s(8);
        if (s0Var.g()) {
            s0Var.s(4);
            s0Var.s(3);
        }
        if (s0Var.h(4) == 15) {
            s0Var.s(8);
            s0Var.s(8);
        }
        if (s0Var.g()) {
            s0Var.s(2);
            s0Var.s(1);
            if (s0Var.g()) {
                s0Var.s(79);
            }
        }
        a.b(s0Var.h(2) == 0, "Only supports rectangular video object layer shape.");
        a.a(s0Var.g());
        int iH = s0Var.h(16);
        a.a(s0Var.g());
        if (s0Var.g()) {
            a.a(iH > 0);
            for (int i13 = iH - 1; i13 > 0; i13 >>= 1) {
                i10++;
            }
            s0Var.s(i10);
        }
        a.a(s0Var.g());
        int iH2 = s0Var.h(13);
        a.a(s0Var.g());
        int iH3 = s0Var.h(13);
        a.a(s0Var.g());
        s0Var.s(1);
        return Pair.create(Integer.valueOf(iH2), Integer.valueOf(iH3));
    }

    public static boolean g(byte[] bArr, int i10) {
        if (bArr.length - i10 <= f80978a.length) {
            return false;
        }
        int i11 = 0;
        while (true) {
            byte[] bArr2 = f80978a;
            if (i11 >= bArr2.length) {
                return true;
            }
            if (bArr[i10 + i11] != bArr2[i11]) {
                return false;
            }
            i11++;
        }
    }

    public static Pair<Integer, Integer> h(byte[] bArr) {
        t0 t0Var = new t0(bArr);
        t0Var.Y(9);
        int iL = t0Var.L();
        t0Var.Y(20);
        return Pair.create(Integer.valueOf(t0Var.P()), Integer.valueOf(iL));
    }

    public static boolean i(List<byte[]> list) {
        return list.size() == 1 && list.get(0).length == 1 && list.get(0)[0] == 1;
    }

    @Nullable
    public static byte[][] j(byte[] bArr) {
        if (!g(bArr, 0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int iE = 0;
        do {
            arrayList.add(Integer.valueOf(iE));
            iE = e(bArr, iE + f80978a.length);
        } while (iE != -1);
        byte[][] bArr2 = new byte[arrayList.size()][];
        int i10 = 0;
        while (i10 < arrayList.size()) {
            int iIntValue = ((Integer) arrayList.get(i10)).intValue();
            int iIntValue2 = (i10 < arrayList.size() + (-1) ? ((Integer) arrayList.get(i10 + 1)).intValue() : bArr.length) - iIntValue;
            byte[] bArr3 = new byte[iIntValue2];
            System.arraycopy(bArr, iIntValue, bArr3, 0, iIntValue2);
            bArr2[i10] = bArr3;
            i10++;
        }
        return bArr2;
    }
}
