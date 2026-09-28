package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.social.data.local.CreatorCreditHistoryEntity;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class l2c extends xbs<CreatorCreditHistoryEntity> {
    public final /* synthetic */ j2c e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2c(bw50 bw50Var, j2c j2cVar, lv50 lv50Var, String[] strArr) {
        super(bw50Var, lv50Var, strArr);
        this.e = j2cVar;
    }

    @Override // defpackage.xbs
    public final Object e(final bw50 bw50Var, int i, v1b<? super List<? extends CreatorCreditHistoryEntity>> v1bVar) {
        return qlc.c(v1bVar, this.e.a, new Function1() { // from class: k2c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Exception {
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                bw50 bw50Var2 = bw50Var;
                hq60 hq60VarH1 = vp60Var.H1(bw50Var2.a);
                bw50Var2.b.invoke(hq60VarH1);
                try {
                    int iB = l0b.b(hq60VarH1, "batch_id");
                    int iB2 = l0b.b(hq60VarH1, "claimed_amount");
                    int iB3 = l0b.b(hq60VarH1, "currency");
                    int iB4 = l0b.b(hq60VarH1, "end_time");
                    int iB5 = l0b.b(hq60VarH1, "last_claimed_time");
                    int iB6 = l0b.b(hq60VarH1, "potential_reward");
                    int iB7 = l0b.b(hq60VarH1, "start_time");
                    int iB8 = l0b.b(hq60VarH1, AnalyticsParam.EVENT_STATUS);
                    int iB9 = l0b.b(hq60VarH1, AnalyticsParam.EVENT_PARAM_USER_ID);
                    int iB10 = l0b.b(hq60VarH1, "is_claimed");
                    int iB11 = l0b.b(hq60VarH1, "source_index");
                    ArrayList arrayList = new ArrayList();
                    while (hq60VarH1.D1()) {
                        int i2 = iB;
                        int i3 = iB2;
                        arrayList.add(new CreatorCreditHistoryEntity(hq60VarH1.k1(iB), hq60VarH1.getLong(iB2), hq60VarH1.k1(iB3), hq60VarH1.getLong(iB4), hq60VarH1.getLong(iB5), hq60VarH1.getLong(iB6), hq60VarH1.getLong(iB7), (int) hq60VarH1.getLong(iB8), hq60VarH1.k1(iB9), ((int) hq60VarH1.getLong(iB10)) != 0, (int) hq60VarH1.getLong(iB11)));
                        iB = i2;
                        iB2 = i3;
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
