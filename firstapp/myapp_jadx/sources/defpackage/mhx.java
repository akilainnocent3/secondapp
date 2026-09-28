package defpackage;

import android.os.Bundle;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mhx implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Serializable b;

    public /* synthetic */ mhx(int i, Serializable serializable) {
        this.a = i;
        this.b = serializable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        int i = this.a;
        boolean z = true;
        Serializable serializable = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                T t = ((dq40) serializable).a;
                if (t != 0 && ((Bundle) t).containsKey(str)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                String str2 = (String) serializable;
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                hq60 hq60VarH1 = vp60Var.H1("DELETE FROM social_share_code_table WHERE username = ?");
                try {
                    hq60VarH1.L(1, str2);
                    hq60VarH1.D1();
                    return Unit.a;
                } finally {
                    hq60VarH1.close();
                }
        }
    }
}
