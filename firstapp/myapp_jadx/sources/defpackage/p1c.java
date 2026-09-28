package defpackage;

import com.sportybet.android.social.data.local.CreatorCreditEntity;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class p1c extends xbs<CreatorCreditEntity> {
    public final /* synthetic */ o1c e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1c(bw50 bw50Var, o1c o1cVar, lv50 lv50Var, String[] strArr) {
        super(bw50Var, lv50Var, strArr);
        this.e = o1cVar;
    }

    @Override // defpackage.xbs
    public final Object e(bw50 bw50Var, int i, v1b<? super List<? extends CreatorCreditEntity>> v1bVar) {
        return qlc.c(v1bVar, this.e.a, new fe8(bw50Var, 1), true, false);
    }
}
