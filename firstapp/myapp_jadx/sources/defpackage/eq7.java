package defpackage;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class eq7 {
    public final String a;
    public List<? extends Annotation> b = m2g.a;
    public final ArrayList c = new ArrayList();
    public final HashSet d = new HashSet();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();

    public eq7(String str) {
        this.a = str;
    }

    public static void a(eq7 eq7Var, String str, pd80 pd80Var) {
        m2g m2gVar = m2g.a;
        eq7Var.getClass();
        str.getClass();
        pd80Var.getClass();
        m2gVar.getClass();
        if (!eq7Var.d.add(str)) {
            StringBuilder sbA = he.a("Element with name '", str, "' is already registered in ");
            sbA.append(eq7Var.a);
            throw new IllegalArgumentException(sbA.toString().toString());
        }
        eq7Var.c.add(str);
        eq7Var.e.add(pd80Var);
        eq7Var.f.add(m2gVar);
        eq7Var.g.add(false);
    }
}
