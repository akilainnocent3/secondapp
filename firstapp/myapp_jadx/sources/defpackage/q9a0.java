package defpackage;

import com.sportybet.android.social.data.local.SocialFollowerEntity;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class q9a0 extends xbs<SocialFollowerEntity> {
    public final /* synthetic */ o9a0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q9a0(bw50 bw50Var, o9a0 o9a0Var, lv50 lv50Var, String[] strArr) {
        super(bw50Var, lv50Var, strArr);
        this.e = o9a0Var;
    }

    @Override // defpackage.xbs
    public final Object e(final bw50 bw50Var, int i, v1b<? super List<? extends SocialFollowerEntity>> v1bVar) {
        return qlc.c(v1bVar, this.e.a, new Function1() { // from class: p9a0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Exception {
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                bw50 bw50Var2 = bw50Var;
                hq60 hq60VarH1 = vp60Var.H1(bw50Var2.a);
                bw50Var2.b.invoke(hq60VarH1);
                try {
                    int iB = l0b.b(hq60VarH1, "account");
                    int iB2 = l0b.b(hq60VarH1, "nickname");
                    int iB3 = l0b.b(hq60VarH1, "avatar_url");
                    int iB4 = l0b.b(hq60VarH1, "is_followed");
                    int iB5 = l0b.b(hq60VarH1, "user_type");
                    int iB6 = l0b.b(hq60VarH1, "page_index");
                    ArrayList arrayList = new ArrayList();
                    while (hq60VarH1.D1()) {
                        arrayList.add(new SocialFollowerEntity(hq60VarH1.k1(iB), hq60VarH1.k1(iB2), hq60VarH1.k1(iB3), ((int) hq60VarH1.getLong(iB4)) != 0, hq60VarH1.k1(iB5), (int) hq60VarH1.getLong(iB6)));
                    }
                    hq60VarH1.close();
                    return arrayList;
                } catch (Throwable th) {
                    hq60VarH1.close();
                    throw th;
                }
            }
        }, true, false);
    }
}
