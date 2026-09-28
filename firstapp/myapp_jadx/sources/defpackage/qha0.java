package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.social.data.local.SocShareCodeDetailEntity;
import com.sportybet.android.social.data.local.SocShareCodeEntity;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class qha0 extends xbs<SocShareCodeEntity> {
    public final /* synthetic */ oha0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qha0(bw50 bw50Var, oha0 oha0Var, lv50 lv50Var, String[] strArr) {
        super(bw50Var, lv50Var, strArr);
        this.e = oha0Var;
    }

    @Override // defpackage.xbs
    public final Object e(final bw50 bw50Var, int i, v1b<? super List<? extends SocShareCodeEntity>> v1bVar) {
        final oha0 oha0Var = this.e;
        return qlc.c(v1bVar, oha0Var.a, new Function1() { // from class: pha0
            /* JADX WARN: Code duplicated, block: B:37:0x00f2 A[Catch: all -> 0x0119, TryCatch #0 {all -> 0x0119, blocks: (B:3:0x0018, B:4:0x005f, B:6:0x0065, B:11:0x0094, B:13:0x009c, B:17:0x00ab, B:38:0x00fc, B:43:0x0109, B:21:0x00b6, B:27:0x00cf, B:29:0x00d7, B:37:0x00f2, B:31:0x00dc, B:33:0x00e4, B:34:0x00e7, B:36:0x00ef, B:16:0x00a5, B:46:0x011b, B:47:0x0122, B:10:0x008f), top: B:52:0x0018 }] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Exception {
                oha0 oha0Var2;
                z320 z320Var;
                oha0 oha0Var3 = oha0Var;
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                bw50 bw50Var2 = bw50Var;
                hq60 hq60VarH1 = vp60Var.H1(bw50Var2.a);
                bw50Var2.b.invoke(hq60VarH1);
                try {
                    int iB = l0b.b(hq60VarH1, "username");
                    int iB2 = l0b.b(hq60VarH1, "share_code");
                    int iB3 = l0b.b(hq60VarH1, "total_odds");
                    int iB4 = l0b.b(hq60VarH1, "folds_amount");
                    int iB5 = l0b.b(hq60VarH1, AnalyticsParam.EVENT_PARAM_USER_ID);
                    int iB6 = l0b.b(hq60VarH1, "deadline");
                    int iB7 = l0b.b(hq60VarH1, "create_time");
                    int iB8 = l0b.b(hq60VarH1, "share_code_detail");
                    int iB9 = l0b.b(hq60VarH1, "note");
                    int iB10 = l0b.b(hq60VarH1, "popularity_level");
                    int iB11 = l0b.b(hq60VarH1, "is_creator_code");
                    ArrayList arrayList = new ArrayList();
                    while (hq60VarH1.D1()) {
                        String strK1 = hq60VarH1.k1(iB);
                        String strK2 = hq60VarH1.k1(iB2);
                        double d = hq60VarH1.getDouble(iB3);
                        int i2 = (int) hq60VarH1.getLong(iB4);
                        String strK3 = hq60VarH1.k1(iB5);
                        long j = hq60VarH1.getLong(iB6);
                        long j2 = hq60VarH1.getLong(iB7);
                        z320 z320Var2 = null;
                        int i3 = iB;
                        List<SocShareCodeDetailEntity> listA = oha0Var3.c.a(hq60VarH1.isNull(iB8) ? null : hq60VarH1.k1(iB8));
                        if (listA == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<com.sportybet.android.social.`data`.local.SocShareCodeDetailEntity>', but it was NULL.");
                        }
                        String strK4 = hq60VarH1.isNull(iB9) ? null : hq60VarH1.k1(iB9);
                        if (hq60VarH1.isNull(iB10)) {
                            oha0Var2 = oha0Var3;
                        } else {
                            String strK5 = hq60VarH1.k1(iB10);
                            int iHashCode = strK5.hashCode();
                            oha0Var2 = oha0Var3;
                            if (iHashCode != -117650552) {
                                if (iHashCode != 2537357) {
                                    if (iHashCode == 1921989849 && strK5.equals("NEARLY_FULL")) {
                                        z320Var = z320.NEARLY_FULL;
                                        z320Var2 = z320Var;
                                    } else {
                                        hb5.a("Can't convert value to enum, unknown value: ".concat(strK5));
                                    }
                                } else if (strK5.equals("SAFE")) {
                                    z320Var = z320.SAFE;
                                    z320Var2 = z320Var;
                                } else {
                                    hb5.a("Can't convert value to enum, unknown value: ".concat(strK5));
                                }
                            } else if (strK5.equals("HIGH_DEMAND")) {
                                z320Var = z320.HIGH_DEMAND;
                                z320Var2 = z320Var;
                            } else {
                                hb5.a("Can't convert value to enum, unknown value: ".concat(strK5));
                            }
                        }
                        arrayList.add(new SocShareCodeEntity(strK1, strK2, d, i2, strK3, j, j2, listA, strK4, z320Var2, ((int) hq60VarH1.getLong(iB11)) != 0));
                        iB = i3;
                        oha0Var3 = oha0Var2;
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
