package j0;

import com.ironsource.C4235d4;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f99464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f99465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f99466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f99467d;

    public s(String str) {
        this.f99465b = Float.NaN;
        this.f99466c = Float.NaN;
        this.f99467d = Float.NaN;
        this.f99464a = str;
    }

    public static void a(String str, ArrayList<s> arrayList) {
        Object obj;
        if (str == null || str.length() == 0) {
            return;
        }
        Object[] objArr = new Object[4];
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < str.length(); i12++) {
            char cCharAt = str.charAt(i12);
            if (cCharAt != ' ' && cCharAt != '\'') {
                if (cCharAt == ',') {
                    if (i10 < 3) {
                        objArr[i10] = sb2.toString();
                        sb2.setLength(0);
                        i10++;
                    }
                    if (i11 == 1 && (obj = objArr[0]) != null) {
                        arrayList.add(new s(obj.toString()));
                        objArr[0] = null;
                        i10 = 0;
                    }
                } else if (cCharAt == '[') {
                    i11++;
                } else if (cCharAt != ']') {
                    sb2.append(cCharAt);
                } else if (i11 > 0) {
                    i11--;
                    objArr[i10] = sb2.toString();
                    sb2.setLength(0);
                    Object obj2 = objArr[0];
                    if (obj2 != null) {
                        arrayList.add(new s(obj2.toString(), f(objArr[1]), f(objArr[2]), f(objArr[3])));
                        Arrays.fill(objArr, (Object) null);
                        i10 = 0;
                    }
                }
            }
        }
    }

    public static float f(Object obj) {
        try {
            return Float.parseFloat(obj.toString());
        } catch (Exception unused) {
            return Float.NaN;
        }
    }

    public static s g(String str) {
        String[] strArrSplit = str.replaceAll("[\\[\\]\\']", "").split(",");
        if (strArrSplit.length == 0) {
            return null;
        }
        Object[] objArr = new Object[4];
        for (int i10 = 0; i10 < strArrSplit.length && i10 < 4; i10++) {
            objArr[i10] = strArrSplit[i10];
        }
        return new s(objArr[0].toString().replace("'", ""), f(objArr[1]), f(objArr[2]), f(objArr[3]));
    }

    public String b() {
        return this.f99464a;
    }

    public float c() {
        return this.f99467d;
    }

    public float d() {
        return this.f99466c;
    }

    public float e() {
        return this.f99465b;
    }

    public void h(String str) {
        this.f99464a = str;
    }

    public void i(float f10) {
        this.f99467d = f10;
    }

    public void j(float f10) {
        this.f99466c = f10;
    }

    public void k(float f10) {
        this.f99465b = f10;
    }

    public String toString() {
        String str = this.f99464a;
        if (str == null || str.length() == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = (Float.isNaN(this.f99465b) && Float.isNaN(this.f99466c) && Float.isNaN(this.f99467d)) ? false : true;
        if (z10) {
            sb2.append(C4235d4.j.f61460d);
        }
        sb2.append("'");
        sb2.append(this.f99464a);
        sb2.append("'");
        if (!Float.isNaN(this.f99467d)) {
            sb2.append(",");
            sb2.append(!Float.isNaN(this.f99465b) ? this.f99465b : 0.0f);
            sb2.append(",");
            sb2.append(Float.isNaN(this.f99466c) ? 0.0f : this.f99466c);
            sb2.append(",");
            sb2.append(this.f99467d);
        } else if (!Float.isNaN(this.f99466c)) {
            sb2.append(",");
            sb2.append(Float.isNaN(this.f99465b) ? 0.0f : this.f99465b);
            sb2.append(",");
            sb2.append(this.f99466c);
        } else if (!Float.isNaN(this.f99465b)) {
            sb2.append(",");
            sb2.append(this.f99465b);
        }
        if (z10) {
            sb2.append(C4235d4.j.f61462e);
        }
        sb2.append(",");
        return sb2.toString();
    }

    public s(String str, float f10) {
        this.f99466c = Float.NaN;
        this.f99467d = Float.NaN;
        this.f99464a = str;
        this.f99465b = f10;
    }

    public s(String str, float f10, float f11) {
        this.f99467d = Float.NaN;
        this.f99464a = str;
        this.f99465b = f10;
        this.f99466c = f11;
    }

    public s(String str, float f10, float f11, float f12) {
        this.f99464a = str;
        this.f99465b = f10;
        this.f99466c = f11;
        this.f99467d = f12;
    }
}
