package defpackage;

import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class dm5 extends fm5 {
    public ArrayList<fm5> e;

    public dm5(char[] cArr) {
        super(cArr);
        this.e = new ArrayList<>();
    }

    @Override // defpackage.fm5
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dm5) {
            return this.e.equals(((dm5) obj).e);
        }
        return false;
    }

    public final float getFloat(int i) throws jm5 {
        fm5 fm5VarJ = j(i);
        if (fm5VarJ != null) {
            return fm5VarJ.c();
        }
        throw new jm5(hce0.a(i, "no float at index "), this);
    }

    public final int getInt(int i) throws jm5 {
        fm5 fm5VarJ = j(i);
        if (fm5VarJ != null) {
            return fm5VarJ.d();
        }
        throw new jm5(hce0.a(i, "no int at index "), this);
    }

    public final void h(fm5 fm5Var) {
        this.e.add(fm5Var);
    }

    @Override // defpackage.fm5
    public int hashCode() {
        return Objects.hash(this.e, Integer.valueOf(super.hashCode()));
    }

    @Override // defpackage.fm5
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public dm5 clone() {
        dm5 dm5Var = (dm5) super.a();
        ArrayList<fm5> arrayList = new ArrayList<>(this.e.size());
        ArrayList<fm5> arrayList2 = this.e;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            fm5 fm5Var = arrayList2.get(i);
            i++;
            fm5 fm5VarClone = fm5Var.a();
            fm5VarClone.d = dm5Var;
            arrayList.add(fm5VarClone);
        }
        dm5Var.e = arrayList;
        return dm5Var;
    }

    public final fm5 j(int i) throws jm5 {
        if (i < 0 || i >= this.e.size()) {
            throw new jm5(hce0.a(i, "no element at index "), this);
        }
        return this.e.get(i);
    }

    public final fm5 k(String str) throws jm5 {
        ArrayList<fm5> arrayList = this.e;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            fm5 fm5Var = arrayList.get(i);
            i++;
            gm5 gm5Var = (gm5) fm5Var;
            if (gm5Var.b().equals(str)) {
                if (gm5Var.e.size() > 0) {
                    return gm5Var.e.get(0);
                }
                return null;
            }
        }
        throw new jm5(tug.a("no element for key <", str, ">"), this);
    }

    public final float l(String str) throws jm5 {
        fm5 fm5VarK = k(str);
        if (fm5VarK != null) {
            return fm5VarK.c();
        }
        StringBuilder sbA = he.a("no float found for key <", str, ">, found [");
        sbA.append(fm5VarK.e());
        sbA.append("] : ");
        sbA.append(fm5VarK);
        throw new jm5(sbA.toString(), this);
    }

    public final fm5 m(int i) {
        if (i < 0 || i >= this.e.size()) {
            return null;
        }
        return this.e.get(i);
    }

    public final fm5 n(String str) {
        ArrayList<fm5> arrayList = this.e;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            fm5 fm5Var = arrayList.get(i);
            i++;
            gm5 gm5Var = (gm5) fm5Var;
            if (gm5Var.b().equals(str)) {
                if (gm5Var.e.size() <= 0) {
                    break;
                }
                return gm5Var.e.get(0);
            }
        }
        return null;
    }

    public final String o(int i) throws jm5 {
        fm5 fm5VarJ = j(i);
        if (fm5VarJ instanceof lm5) {
            return fm5VarJ.b();
        }
        throw new jm5(hce0.a(i, "no string at index "), this);
    }

    public final String p(String str) throws jm5 {
        fm5 fm5VarK = k(str);
        if (fm5VarK instanceof lm5) {
            return fm5VarK.b();
        }
        StringBuilder sbA = ux5.a("no string found for key <", str, ">, found [", fm5VarK != null ? fm5VarK.e() : null, "] : ");
        sbA.append(fm5VarK);
        throw new jm5(sbA.toString(), this);
    }

    public final String q(String str) {
        fm5 fm5VarN = n(str);
        if (fm5VarN instanceof lm5) {
            return fm5VarN.b();
        }
        return null;
    }

    public final boolean r(String str) {
        ArrayList<fm5> arrayList = this.e;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            fm5 fm5Var = arrayList.get(i);
            i++;
            fm5 fm5Var2 = fm5Var;
            if ((fm5Var2 instanceof gm5) && ((gm5) fm5Var2).b().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final ArrayList<String> s() {
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<fm5> arrayList2 = this.e;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            fm5 fm5Var = arrayList2.get(i);
            i++;
            fm5 fm5Var2 = fm5Var;
            if (fm5Var2 instanceof gm5) {
                arrayList.add(((gm5) fm5Var2).b());
            }
        }
        return arrayList;
    }

    public final void t(String str, fm5 fm5Var) {
        ArrayList<fm5> arrayList = this.e;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            fm5 fm5Var2 = arrayList.get(i);
            i++;
            gm5 gm5Var = (gm5) fm5Var2;
            if (gm5Var.b().equals(str)) {
                int size2 = gm5Var.e.size();
                ArrayList<fm5> arrayList2 = gm5Var.e;
                if (size2 > 0) {
                    arrayList2.set(0, fm5Var);
                    return;
                } else {
                    arrayList2.add(fm5Var);
                    return;
                }
            }
        }
        gm5 gm5Var2 = new gm5(str.toCharArray());
        gm5Var2.b = 0L;
        gm5Var2.f(str.length() - 1);
        int size3 = gm5Var2.e.size();
        ArrayList<fm5> arrayList3 = gm5Var2.e;
        if (size3 > 0) {
            arrayList3.set(0, fm5Var);
        } else {
            arrayList3.add(fm5Var);
        }
        this.e.add(gm5Var2);
    }

    @Override // defpackage.fm5
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        ArrayList<fm5> arrayList = this.e;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            fm5 fm5Var = arrayList.get(i);
            i++;
            fm5 fm5Var2 = fm5Var;
            if (sb.length() > 0) {
                sb.append("; ");
            }
            sb.append(fm5Var2);
        }
        return super.toString() + " = <" + ((Object) sb) + " >";
    }

    public final void v(float f, String str) {
        t(str, new hm5(f));
    }

    public final void w(String str) {
        lm5 lm5Var = new lm5(str.toCharArray());
        lm5Var.b = 0L;
        lm5Var.f(str.length() - 1);
        t("type", lm5Var);
    }
}
