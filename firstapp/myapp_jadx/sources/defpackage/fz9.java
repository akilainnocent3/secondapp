package defpackage;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class fz9 {
    public static final op8 a = new op8(1742409811, new bz9(), false);
    public static final op8 b = new op8(1523500734, new cz9(), false);
    public static final op8 c = new op8(1735505816, new dz9(), false);
    public static final op8 d = new op8(-1346805054, new ez9(), false);
    public static final pd80[] e = new pd80[0];

    public static final Set a(pd80 pd80Var) {
        pd80Var.getClass();
        if (pd80Var instanceof gs5) {
            return ((gs5) pd80Var).a();
        }
        HashSet hashSet = new HashSet(pd80Var.d());
        int iD = pd80Var.d();
        for (int i = 0; i < iD; i++) {
            hashSet.add(pd80Var.e(i));
        }
        return hashSet;
    }

    public static final pd80[] b(List list) {
        pd80[] pd80VarArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (pd80VarArr = (pd80[]) list.toArray(new pd80[0])) == null) ? e : pd80VarArr;
    }

    public static final ygp c(qhp qhpVar) {
        qhpVar.getClass();
        ygp ygpVarG = qhpVar.g();
        if (ygpVarG instanceof ygp) {
            return ygpVarG;
        }
        z9l.a(ygpVarG, "Only KClass supported as classifier, got ");
        return null;
    }

    public static final void d(ygp ygpVar) {
        ygpVar.getClass();
        String strK = ygpVar.k();
        if (strK == null) {
            strK = "<local class name not available>";
        }
        throw new ee80(tug.a("Serializer for class '", strK, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n"));
    }
}
