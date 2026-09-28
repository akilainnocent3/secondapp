package defpackage;

import com.sporty.android.core.model.cms.CMSResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes4.dex */
public final class ap5 implements wo5 {
    public final rm5 a;
    public final in5 b;

    public ap5(rm5 rm5Var, in5 in5Var) {
        in5Var.getClass();
        this.a = rm5Var;
        this.b = in5Var;
    }

    public static ArrayList f(String str, List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            String value = ((CMSResponse) obj).getValue();
            if (value != null && !StringsKt.U(value)) {
                arrayList.add(obj);
            }
        }
        if (str == null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            String key = ((CMSResponse) obj2).getKey();
            if (key != null ? c.u(key, str, false) : false) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    @Override // defpackage.wo5
    public final lyh a(ArrayList arrayList) {
        yzh yzhVarA = bm50.a(new or60(new yo5(this, arrayList, null)));
        pfd pfdVar = fse.a;
        return ozh.c(yzhVarA, odd.b);
    }

    @Override // defpackage.ipx
    public final or60 c(String str, String str2, String str3) {
        str.getClass();
        return new or60(new xo5(this, str, str3, str2, null));
    }

    @Override // defpackage.wo5
    public final lyh<lk50<List<CMSResponse>>> d(String str, String str2, String str3) {
        str.getClass();
        yzh yzhVarA = bm50.a(c(str, str2, str3));
        pfd pfdVar = fse.a;
        return ozh.c(yzhVarA, odd.b);
    }

    @Override // defpackage.wo5
    public final lyh e() {
        in5 in5Var = this.b;
        in5Var.getClass();
        yzh yzhVarA = bm50.a(new zo5(r0i.f(in5Var.b.getLanguageFlow(), new fn5(null, in5Var)), this));
        pfd pfdVar = fse.a;
        return ozh.c(yzhVarA, odd.b);
    }
}
