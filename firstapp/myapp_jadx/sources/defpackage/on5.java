package defpackage;

import com.sportygames.newcms.CMSRes;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public interface on5 {
    static /* synthetic */ CMSRes h(on5 on5Var, jp5 jp5Var, String str, String str2, nn5 nn5Var, Integer num, int i) {
        if ((i & 4) != 0) {
            nn5Var = nn5.String;
        }
        nn5 nn5Var2 = nn5Var;
        if ((i & 8) != 0) {
            num = null;
        }
        return on5Var.r(jp5Var, str, str2, nn5Var2, num);
    }

    List<CMSRes> d();

    CMSRes r(jp5 jp5Var, String str, String str2, nn5 nn5Var, Integer num);
}
