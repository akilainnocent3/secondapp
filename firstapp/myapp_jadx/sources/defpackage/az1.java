package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class az1 implements se0, n340 {
    public final /* synthetic */ int a = 1;
    public Object b;

    public az1(List list) {
        this.b = list;
    }

    @Override // defpackage.n340
    public Object a(Object obj, ohp ohpVar) {
        ohpVar.getClass();
        return this.b;
    }

    @Override // defpackage.se0
    public List c() {
        return (List) this.b;
    }

    @Override // defpackage.se0
    public boolean d() {
        List list = (List) this.b;
        return list.isEmpty() || (list.size() == 1 && ((cpp) list.get(0)).c());
    }

    public void e(Object obj, ohp ohpVar, Object obj2) {
        fm5 fm5VarA;
        ohpVar.getClass();
        Object obj3 = this.b;
        this.b = obj2;
        im5 im5Var = ((bwa.a) this).c.b;
        String name = ohpVar.getName();
        gqe gqeVar = (gqe) ((eqe) obj2);
        lpa0 lpa0Var = gqeVar.a;
        lpa0 lpa0Var2 = gqeVar.c;
        String str = (String) lpa0Var2.a;
        lpa0 lpa0Var3 = gqeVar.b;
        String str2 = (String) lpa0Var3.a;
        if (str2 == null && str == null) {
            fm5VarA = lpa0Var.a();
        } else {
            im5 im5Var2 = new im5(new char[0]);
            if (str2 != null) {
                im5Var2.t("min", lpa0Var3.a());
            }
            if (str != null) {
                im5Var2.t("max", lpa0Var2.a());
            }
            im5Var2.t("value", lpa0Var.a());
            fm5VarA = im5Var2;
        }
        im5Var.t(name, fm5VarA);
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                List list = (List) this.b;
                if (!list.isEmpty()) {
                    sb.append("values=");
                    sb.append(Arrays.toString(list.toArray()));
                }
                return sb.toString();
            default:
                return ekw.a(new StringBuilder("ObservableProperty(value="), this.b, ')');
        }
    }

    public /* synthetic */ az1() {
    }
}
