package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class jt60 implements tse {
    public final /* synthetic */ kt60 a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ rt60 c;

    public jt60(kt60 kt60Var, Object obj, rt60 rt60Var) {
        this.a = kt60Var;
        this.b = obj;
        this.c = rt60Var;
    }

    @Override // defpackage.tse
    public final void dispose() {
        kt60 kt60Var = this.a;
        rtw<Object, mt60> rtwVar = kt60Var.b;
        Object obj = this.b;
        mt60 mt60VarK = rtwVar.k(obj);
        rt60 rt60Var = this.c;
        if (mt60VarK == rt60Var) {
            Map<Object, Map<String, List<Object>>> map = kt60Var.a;
            Map<String, List<Object>> mapD = rt60Var.d();
            if (mapD.isEmpty()) {
                map.remove(obj);
            } else {
                map.put(obj, mapD);
            }
        }
    }
}
