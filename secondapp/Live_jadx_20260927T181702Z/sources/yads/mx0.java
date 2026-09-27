package yads;

import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class mx0 implements xq {
    public static final mx0 H = new mx0(new lx0());
    public static final wq I = new wq() { // from class: yads.i64
        @Override // yads.wq
        public final xq fromBundle(Bundle bundle) {
            return mx0.a(bundle);
        }
    };
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public int G;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f152718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f152719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f152720d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f152721e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f152722f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f152723g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f152724h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f152725i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f152726j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ts1 f152727k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f152728l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f152729m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f152730n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List f152731o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final kk0 f152732p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f152733q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f152734r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f152735s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float f152736t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f152737u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float f152738v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final byte[] f152739w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f152740x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final mx f152741y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f152742z;

    public mx0(lx0 lx0Var) {
        this.f152718b = lx0Var.f152182a;
        this.f152719c = lx0Var.f152183b;
        this.f152720d = ib3.e(lx0Var.f152184c);
        this.f152721e = lx0Var.f152185d;
        this.f152722f = lx0Var.f152186e;
        int i10 = lx0Var.f152187f;
        this.f152723g = i10;
        int i11 = lx0Var.f152188g;
        this.f152724h = i11;
        this.f152725i = i11 != -1 ? i11 : i10;
        this.f152726j = lx0Var.f152189h;
        this.f152727k = lx0Var.f152190i;
        this.f152728l = lx0Var.f152191j;
        this.f152729m = lx0Var.f152192k;
        this.f152730n = lx0Var.f152193l;
        List list = lx0Var.f152194m;
        this.f152731o = list == null ? Collections.EMPTY_LIST : list;
        kk0 kk0Var = lx0Var.f152195n;
        this.f152732p = kk0Var;
        this.f152733q = lx0Var.f152196o;
        this.f152734r = lx0Var.f152197p;
        this.f152735s = lx0Var.f152198q;
        this.f152736t = lx0Var.f152199r;
        int i12 = lx0Var.f152200s;
        this.f152737u = i12 == -1 ? 0 : i12;
        float f10 = lx0Var.f152201t;
        this.f152738v = f10 == -1.0f ? 1.0f : f10;
        this.f152739w = lx0Var.f152202u;
        this.f152740x = lx0Var.f152203v;
        this.f152741y = lx0Var.f152204w;
        this.f152742z = lx0Var.f152205x;
        this.A = lx0Var.f152206y;
        this.B = lx0Var.f152207z;
        int i13 = lx0Var.A;
        this.C = i13 == -1 ? 0 : i13;
        int i14 = lx0Var.B;
        this.D = i14 != -1 ? i14 : 0;
        this.E = lx0Var.C;
        int i15 = lx0Var.D;
        if (i15 != 0 || kk0Var == null) {
            this.F = i15;
        } else {
            this.F = 1;
        }
    }

    public final int a() {
        int i10;
        int i11 = this.f152734r;
        if (i11 == -1 || (i10 = this.f152735s) == -1) {
            return -1;
        }
        return i11 * i10;
    }

    public final boolean equals(Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj != null && mx0.class == obj.getClass()) {
            mx0 mx0Var = (mx0) obj;
            int i11 = this.G;
            if ((i11 == 0 || (i10 = mx0Var.G) == 0 || i11 == i10) && this.f152721e == mx0Var.f152721e && this.f152722f == mx0Var.f152722f && this.f152723g == mx0Var.f152723g && this.f152724h == mx0Var.f152724h && this.f152730n == mx0Var.f152730n && this.f152733q == mx0Var.f152733q && this.f152734r == mx0Var.f152734r && this.f152735s == mx0Var.f152735s && this.f152737u == mx0Var.f152737u && this.f152740x == mx0Var.f152740x && this.f152742z == mx0Var.f152742z && this.A == mx0Var.A && this.B == mx0Var.B && this.C == mx0Var.C && this.D == mx0Var.D && this.E == mx0Var.E && this.F == mx0Var.F && Float.compare(this.f152736t, mx0Var.f152736t) == 0 && Float.compare(this.f152738v, mx0Var.f152738v) == 0 && ib3.a(this.f152718b, mx0Var.f152718b) && ib3.a(this.f152719c, mx0Var.f152719c) && ib3.a(this.f152726j, mx0Var.f152726j) && ib3.a(this.f152728l, mx0Var.f152728l) && ib3.a(this.f152729m, mx0Var.f152729m) && ib3.a(this.f152720d, mx0Var.f152720d) && Arrays.equals(this.f152739w, mx0Var.f152739w) && ib3.a(this.f152727k, mx0Var.f152727k) && ib3.a(this.f152741y, mx0Var.f152741y) && ib3.a(this.f152732p, mx0Var.f152732p) && a(mx0Var)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.G == 0) {
            String str = this.f152718b;
            int iHashCode = ((str == null ? 0 : str.hashCode()) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
            String str2 = this.f152719c;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f152720d;
            int iHashCode3 = (((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f152721e) * 31) + this.f152722f) * 31) + this.f152723g) * 31) + this.f152724h) * 31;
            String str4 = this.f152726j;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            ts1 ts1Var = this.f152727k;
            int iHashCode5 = (iHashCode4 + (ts1Var == null ? 0 : Arrays.hashCode(ts1Var.f156040b))) * 31;
            String str5 = this.f152728l;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f152729m;
            this.G = ((((((((((((((((Float.floatToIntBits(this.f152738v) + ((((Float.floatToIntBits(this.f152736t) + ((((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f152730n) * 31) + ((int) this.f152733q)) * 31) + this.f152734r) * 31) + this.f152735s) * 31)) * 31) + this.f152737u) * 31)) * 31) + this.f152740x) * 31) + this.f152742z) * 31) + this.A) * 31) + this.B) * 31) + this.C) * 31) + this.D) * 31) + this.E) * 31) + this.F;
        }
        return this.G;
    }

    public final String toString() {
        return "Format(" + this.f152718b + ", " + this.f152719c + ", " + this.f152728l + ", " + this.f152729m + ", " + this.f152726j + ", " + this.f152725i + ", " + this.f152720d + ", [" + this.f152734r + ", " + this.f152735s + ", " + this.f152736t + "], [" + this.f152742z + ", " + this.A + "])";
    }

    public final boolean a(mx0 mx0Var) {
        if (this.f152731o.size() != mx0Var.f152731o.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f152731o.size(); i10++) {
            if (!Arrays.equals((byte[]) this.f152731o.get(i10), (byte[]) mx0Var.f152731o.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public static mx0 a(Bundle bundle) {
        lx0 lx0Var = new lx0();
        if (bundle != null) {
            ClassLoader classLoader = yq.class.getClassLoader();
            int i10 = ib3.f150516a;
            bundle.setClassLoader(classLoader);
        }
        int i11 = 0;
        String string = bundle.getString(Integer.toString(0, 36));
        mx0 mx0Var = H;
        String str = mx0Var.f152718b;
        if (string == null) {
            string = str;
        }
        lx0Var.f152182a = string;
        String string2 = bundle.getString(Integer.toString(1, 36));
        String str2 = mx0Var.f152719c;
        if (string2 == null) {
            string2 = str2;
        }
        lx0Var.f152183b = string2;
        String string3 = bundle.getString(Integer.toString(2, 36));
        String str3 = mx0Var.f152720d;
        if (string3 == null) {
            string3 = str3;
        }
        lx0Var.f152184c = string3;
        lx0Var.f152185d = bundle.getInt(Integer.toString(3, 36), mx0Var.f152721e);
        lx0Var.f152186e = bundle.getInt(Integer.toString(4, 36), mx0Var.f152722f);
        lx0Var.f152187f = bundle.getInt(Integer.toString(5, 36), mx0Var.f152723g);
        lx0Var.f152188g = bundle.getInt(Integer.toString(6, 36), mx0Var.f152724h);
        String string4 = bundle.getString(Integer.toString(7, 36));
        String str4 = mx0Var.f152726j;
        if (string4 == null) {
            string4 = str4;
        }
        lx0Var.f152189h = string4;
        ts1 ts1Var = (ts1) bundle.getParcelable(Integer.toString(8, 36));
        ts1 ts1Var2 = mx0Var.f152727k;
        if (ts1Var == null) {
            ts1Var = ts1Var2;
        }
        lx0Var.f152190i = ts1Var;
        String string5 = bundle.getString(Integer.toString(9, 36));
        String str5 = mx0Var.f152728l;
        if (string5 == null) {
            string5 = str5;
        }
        lx0Var.f152191j = string5;
        String string6 = bundle.getString(Integer.toString(10, 36));
        String str6 = mx0Var.f152729m;
        if (string6 == null) {
            string6 = str6;
        }
        lx0Var.f152192k = string6;
        lx0Var.f152193l = bundle.getInt(Integer.toString(11, 36), mx0Var.f152730n);
        ArrayList arrayList = new ArrayList();
        while (true) {
            byte[] byteArray = bundle.getByteArray(Integer.toString(12, 36) + lk.e.f104695m + Integer.toString(i11, 36));
            if (byteArray == null) {
                break;
            }
            arrayList.add(byteArray);
            i11++;
        }
        lx0Var.f152194m = arrayList;
        lx0Var.f152195n = (kk0) bundle.getParcelable(Integer.toString(13, 36));
        String string7 = Integer.toString(14, 36);
        mx0 mx0Var2 = H;
        lx0Var.f152196o = bundle.getLong(string7, mx0Var2.f152733q);
        lx0Var.f152197p = bundle.getInt(Integer.toString(15, 36), mx0Var2.f152734r);
        lx0Var.f152198q = bundle.getInt(Integer.toString(16, 36), mx0Var2.f152735s);
        lx0Var.f152199r = bundle.getFloat(Integer.toString(17, 36), mx0Var2.f152736t);
        lx0Var.f152200s = bundle.getInt(Integer.toString(18, 36), mx0Var2.f152737u);
        lx0Var.f152201t = bundle.getFloat(Integer.toString(19, 36), mx0Var2.f152738v);
        lx0Var.f152202u = bundle.getByteArray(Integer.toString(20, 36));
        lx0Var.f152203v = bundle.getInt(Integer.toString(21, 36), mx0Var2.f152740x);
        Bundle bundle2 = bundle.getBundle(Integer.toString(22, 36));
        if (bundle2 != null) {
            lx0Var.f152204w = (mx) mx.f152712g.fromBundle(bundle2);
        }
        lx0Var.f152205x = bundle.getInt(Integer.toString(23, 36), mx0Var2.f152742z);
        lx0Var.f152206y = bundle.getInt(Integer.toString(24, 36), mx0Var2.A);
        lx0Var.f152207z = bundle.getInt(Integer.toString(25, 36), mx0Var2.B);
        lx0Var.A = bundle.getInt(Integer.toString(26, 36), mx0Var2.C);
        lx0Var.B = bundle.getInt(Integer.toString(27, 36), mx0Var2.D);
        lx0Var.C = bundle.getInt(Integer.toString(28, 36), mx0Var2.E);
        lx0Var.D = bundle.getInt(Integer.toString(29, 36), mx0Var2.F);
        return new mx0(lx0Var);
    }
}
