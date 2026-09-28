package defpackage;

import com.sportygames.common.business.CommonGameDetails;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class mh8 implements kh8 {
    public final ca8 a;
    public volatile List<CommonGameDetails> b;

    public mh8(on50 on50Var) {
        on50Var.getClass();
        this.a = (ca8) on50Var.a(ca8.class);
    }

    @Override // defpackage.kh8
    public final or60 a(String str) {
        str.getClass();
        return new or60(new lh8(this, str, null));
    }
}
