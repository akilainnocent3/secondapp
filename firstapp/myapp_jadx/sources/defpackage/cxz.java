package defpackage;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class cxz implements Comparable<cxz> {
    public static final String b;
    public final rl5 a;

    public static final class a {
        public static cxz a(String str) {
            str.getClass();
            rl5 rl5Var = i.a;
            lb5 lb5Var = new lb5();
            lb5Var.z0(str);
            return i.d(lb5Var, false);
        }

        public static cxz b(File file) {
            String str = cxz.b;
            file.getClass();
            String string = file.toString();
            string.getClass();
            return a(string);
        }

        public static cxz c(Path path) {
            String str = cxz.b;
            path.getClass();
            return a(path.toString());
        }
    }

    static {
        String str = File.separator;
        str.getClass();
        b = str;
    }

    public cxz(rl5 rl5Var) {
        rl5Var.getClass();
        this.a = rl5Var;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int iC = i.c(this);
        rl5 rl5Var = this.a;
        if (iC == -1) {
            iC = 0;
        } else if (iC < rl5Var.d() && rl5Var.j(iC) == 92) {
            iC++;
        }
        int iD = rl5Var.d();
        int i = iC;
        while (iC < iD) {
            if (rl5Var.j(iC) == 47 || rl5Var.j(iC) == 92) {
                arrayList.add(rl5Var.p(i, iC));
                i = iC + 1;
            }
            iC++;
        }
        if (i < rl5Var.d()) {
            arrayList.add(rl5Var.p(i, rl5Var.d()));
        }
        return arrayList;
    }

    public final String b() {
        rl5 rl5Var = i.a;
        rl5 rl5VarQ = this.a;
        int iL = rl5.l(rl5VarQ, rl5Var);
        if (iL == -1) {
            iL = rl5.l(rl5VarQ, i.b);
        }
        if (iL != -1) {
            rl5VarQ = rl5.q(rl5VarQ, iL + 1, 0, 2);
        } else if (h() != null && rl5VarQ.d() == 2) {
            rl5VarQ = rl5.d;
        }
        return rl5VarQ.s();
    }

    public final cxz c() {
        rl5 rl5Var = i.d;
        rl5 rl5Var2 = this.a;
        if (Intrinsics.g(rl5Var2, rl5Var)) {
            return null;
        }
        rl5 rl5Var3 = i.a;
        if (Intrinsics.g(rl5Var2, rl5Var3)) {
            return null;
        }
        rl5 rl5Var4 = i.b;
        if (Intrinsics.g(rl5Var2, rl5Var4)) {
            return null;
        }
        rl5 rl5Var5 = i.e;
        rl5Var2.getClass();
        rl5Var5.getClass();
        int iD = rl5Var2.d();
        byte[] bArr = rl5Var5.a;
        if (rl5Var2.n(iD - bArr.length, rl5Var5, bArr.length) && (rl5Var2.d() == 2 || rl5Var2.n(rl5Var2.d() - 3, rl5Var3, 1) || rl5Var2.n(rl5Var2.d() - 3, rl5Var4, 1))) {
            return null;
        }
        int iL = rl5.l(rl5Var2, rl5Var3);
        if (iL == -1) {
            iL = rl5.l(rl5Var2, rl5Var4);
        }
        if (iL == 2 && h() != null) {
            if (rl5Var2.d() == 3) {
                return null;
            }
            return new cxz(rl5.q(rl5Var2, 0, 3, 1));
        }
        if (iL == 1) {
            rl5Var4.getClass();
            if (rl5Var2.n(0, rl5Var4, rl5Var4.d())) {
                return null;
            }
        }
        if (iL != -1 || h() == null) {
            if (iL == -1) {
                return new cxz(rl5Var);
            }
            return iL == 0 ? new cxz(rl5.q(rl5Var2, 0, 1, 1)) : new cxz(rl5.q(rl5Var2, 0, iL, 1));
        }
        if (rl5Var2.d() == 2) {
            return null;
        }
        return new cxz(rl5.q(rl5Var2, 0, 2, 1));
    }

    @Override // java.lang.Comparable
    public final int compareTo(cxz cxzVar) {
        cxz cxzVar2 = cxzVar;
        cxzVar2.getClass();
        return this.a.compareTo(cxzVar2.a);
    }

    public final cxz d(cxz cxzVar) {
        cxzVar.getClass();
        rl5 rl5Var = cxzVar.a;
        int iC = i.c(this);
        rl5 rl5Var2 = this.a;
        cxz cxzVar2 = iC == -1 ? null : new cxz(rl5Var2.p(0, iC));
        int iC2 = i.c(cxzVar);
        if (!Intrinsics.g(cxzVar2, iC2 == -1 ? null : new cxz(rl5Var.p(0, iC2)))) {
            axz.a(this, "Paths of different roots cannot be relative to each other: ", " and ", cxzVar);
            return null;
        }
        ArrayList arrayListA = a();
        ArrayList arrayListA2 = cxzVar.a();
        int iMin = Math.min(arrayListA.size(), arrayListA2.size());
        int i = 0;
        while (i < iMin && Intrinsics.g(arrayListA.get(i), arrayListA2.get(i))) {
            i++;
        }
        if (i == iMin && rl5Var2.d() == rl5Var.d()) {
            return a.a(".");
        }
        if (arrayListA2.subList(i, arrayListA2.size()).indexOf(i.e) != -1) {
            axz.a(this, "Impossible relative path to resolve: ", " and ", cxzVar);
            return null;
        }
        if (Intrinsics.g(rl5Var, i.d)) {
            return this;
        }
        lb5 lb5Var = new lb5();
        rl5 rl5VarB = i.b(cxzVar);
        if (rl5VarB == null && (rl5VarB = i.b(this)) == null) {
            rl5VarB = i.f(b);
        }
        int size = arrayListA2.size();
        for (int i2 = i; i2 < size; i2++) {
            lb5Var.c0(i.e);
            lb5Var.c0(rl5VarB);
        }
        int size2 = arrayListA.size();
        while (i < size2) {
            lb5Var.c0((rl5) arrayListA.get(i));
            lb5Var.c0(rl5VarB);
            i++;
        }
        return i.d(lb5Var, false);
    }

    public final cxz e(String str) {
        str.getClass();
        lb5 lb5Var = new lb5();
        lb5Var.z0(str);
        return i.a(this, i.d(lb5Var, false), false);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof cxz) && Intrinsics.g(((cxz) obj).a, this.a);
    }

    public final Path f() {
        Path path = Paths.get(this.a.s(), new String[0]);
        path.getClass();
        return path;
    }

    public final Character h() {
        rl5 rl5Var = i.a;
        rl5 rl5Var2 = this.a;
        if (rl5.h(rl5Var2, rl5Var) != -1 || rl5Var2.d() < 2 || rl5Var2.j(1) != 58) {
            return null;
        }
        char cJ = (char) rl5Var2.j(0);
        if (('a' > cJ || cJ >= '{') && ('A' > cJ || cJ >= '[')) {
            return null;
        }
        return Character.valueOf(cJ);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final File toFile() {
        return new File(this.a.s());
    }

    public final String toString() {
        return this.a.s();
    }
}
