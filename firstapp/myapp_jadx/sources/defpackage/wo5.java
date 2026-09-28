package defpackage;

import com.sporty.android.core.model.cms.CMSResponse;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface wo5 extends ipx {
    static /* synthetic */ lyh b(wo5 wo5Var, String str, String str2, int i) {
        String str3 = (i & 2) != 0 ? null : "card_img_src_";
        if ((i & 4) != 0) {
            str2 = null;
        }
        return wo5Var.d(str, str3, str2);
    }

    lyh a(ArrayList arrayList);

    lyh<lk50<List<CMSResponse>>> d(String str, String str2, String str3);

    lyh e();
}
