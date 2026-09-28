package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class sv30 {
    public final fgb.u a;

    public sv30(fgb.u uVar) {
        this.a = uVar;
    }

    public final String a(int i, int i2, HashMap<String, String> map) {
        op5 op5Var = op5.a;
        Integer numValueOf = Integer.valueOf(i);
        fgb.u uVar = this.a;
        String str = (String) uVar.invoke(numValueOf);
        String str2 = (String) uVar.invoke(Integer.valueOf(i2));
        op5Var.getClass();
        return op5.b(str, str2, map);
    }

    public final String b(int i) {
        return (String) this.a.invoke(Integer.valueOf(i));
    }
}
