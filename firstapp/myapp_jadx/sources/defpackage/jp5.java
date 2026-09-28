package defpackage;

import com.sportygames.newcms.CMSRes;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class jp5 implements on5 {
    public final on5 a;

    public jp5(on5 on5Var) {
        on5Var.getClass();
        this.a = on5Var;
    }

    @Override // defpackage.on5
    public final List<CMSRes> d() {
        return this.a.d();
    }

    @Override // defpackage.on5
    public final CMSRes r(jp5 jp5Var, String str, String str2, nn5 nn5Var, Integer num) {
        jp5Var.getClass();
        nn5Var.getClass();
        return this.a.r(jp5Var, str, str2, nn5Var, num);
    }

    public abstract int t();
}
