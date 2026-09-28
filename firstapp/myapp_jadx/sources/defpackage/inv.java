package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class inv implements jxz, n7l {
    public final Path a = new Path();
    public final Path b = new Path();
    public final Path c = new Path();
    public final ArrayList d = new ArrayList();
    public final hnv e;

    public inv(hnv hnvVar) {
        this.e = hnvVar;
    }

    public final void a(Path.Op op) {
        Path path = this.b;
        path.reset();
        Path path2 = this.a;
        path2.reset();
        ArrayList arrayList = this.d;
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            jxz jxzVar = (jxz) arrayList.get(size);
            if (jxzVar instanceof mza) {
                mza mzaVar = (mza) jxzVar;
                ArrayList arrayList2 = (ArrayList) mzaVar.g();
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    Path pathD = ((jxz) arrayList2.get(size2)).d();
                    Matrix matrixE = mzaVar.d;
                    isg0 isg0Var = mzaVar.l;
                    if (isg0Var != null) {
                        matrixE = isg0Var.e();
                    } else {
                        matrixE.reset();
                    }
                    pathD.transform(matrixE);
                    path.addPath(pathD);
                }
            } else {
                path.addPath(jxzVar.d());
            }
        }
        int i = 0;
        jxz jxzVar2 = (jxz) arrayList.get(0);
        if (jxzVar2 instanceof mza) {
            mza mzaVar2 = (mza) jxzVar2;
            List<jxz> listG = mzaVar2.g();
            while (true) {
                ArrayList arrayList3 = (ArrayList) listG;
                if (i >= arrayList3.size()) {
                    break;
                }
                Path pathD2 = ((jxz) arrayList3.get(i)).d();
                Matrix matrixE2 = mzaVar2.d;
                isg0 isg0Var2 = mzaVar2.l;
                if (isg0Var2 != null) {
                    matrixE2 = isg0Var2.e();
                } else {
                    matrixE2.reset();
                }
                pathD2.transform(matrixE2);
                path2.addPath(pathD2);
                i++;
            }
        } else {
            path2.set(jxzVar2.d());
        }
        this.c.op(path2, path, op);
    }

    @Override // defpackage.cza
    public final void b(List<cza> list, List<cza> list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                return;
            }
            ((jxz) arrayList.get(i)).b(list, list2);
            i++;
        }
    }

    @Override // defpackage.jxz
    public final Path d() {
        Path path = this.c;
        path.reset();
        hnv hnvVar = this.e;
        if (!hnvVar.b) {
            int iOrdinal = hnvVar.a.ordinal();
            if (iOrdinal == 0) {
                int i = 0;
                while (true) {
                    ArrayList arrayList = this.d;
                    if (i >= arrayList.size()) {
                        break;
                    }
                    path.addPath(((jxz) arrayList.get(i)).d());
                    i++;
                }
            } else {
                if (iOrdinal == 1) {
                    a(Path.Op.UNION);
                    return path;
                }
                if (iOrdinal == 2) {
                    a(Path.Op.REVERSE_DIFFERENCE);
                    return path;
                }
                if (iOrdinal == 3) {
                    a(Path.Op.INTERSECT);
                    return path;
                }
                if (iOrdinal == 4) {
                    a(Path.Op.XOR);
                    return path;
                }
            }
        }
        return path;
    }

    @Override // defpackage.n7l
    public final void g(ListIterator<cza> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            cza czaVarPrevious = listIterator.previous();
            if (czaVarPrevious instanceof jxz) {
                this.d.add((jxz) czaVarPrevious);
                listIterator.remove();
            }
        }
    }
}
