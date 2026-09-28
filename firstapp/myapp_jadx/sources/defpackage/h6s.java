package defpackage;

import android.content.SharedPreferences;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.realsports.StakeConfig;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.betslip.data.datastore.LegacyStakeConfigMigrationKt$legacyStakeConfigMigration$1", f = "LegacyStakeConfigMigration.kt", l = {}, m = "invokeSuspend", v = 2)
public final class h6s extends tje0 implements gaj<u390, zn20, v1b<? super zn20>, Object> {
    public /* synthetic */ u390 a;
    public /* synthetic */ zn20 b;
    public final /* synthetic */ zn20.a<String> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6s(zn20.a<String> aVar, v1b<? super h6s> v1bVar) {
        super(3, v1bVar);
        this.c = aVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(u390 u390Var, zn20 zn20Var, v1b<? super zn20> v1bVar) {
        h6s h6sVar = new h6s(this.c, v1bVar);
        h6sVar.a = u390Var;
        h6sVar.b = zn20Var;
        return h6sVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        u390 u390Var = this.a;
        zn20 zn20Var = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        zn20.a<String> aVar = this.c;
        String strJ = null;
        if (!zn20Var.b(aVar)) {
            u390Var.getClass();
            SharedPreferences sharedPreferences = u390Var.a;
            Set<String> set = u390Var.b;
            if (set != null && !set.contains("pref_stake_config_2")) {
                ib5.a("Can't access key outside migration: pref_stake_config_2");
                return null;
            }
            String string = sharedPreferences.getString("pref_stake_config_2", null);
            if (string != null) {
                try {
                    bcp bcpVarC = qva.c(string).c();
                    BigDecimal bigDecimalA = i6s.a(0, bcpVarC);
                    double dC = dc8.c(6, bcpVarC);
                    double dC2 = dc8.c(7, bcpVarC);
                    double dC3 = dc8.c(8, bcpVarC);
                    if (dC <= 0.0d || dC2 <= 0.0d || dC3 <= 0.0d) {
                        List listK = b.k(bigDecimalA, bigDecimalA.multiply(new BigDecimal(5)), bigDecimalA.multiply(new BigDecimal(10)));
                        arrayList = new ArrayList(l48.r(listK, 10));
                        Iterator it = listK.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((BigDecimal) it.next()).setScale(2, RoundingMode.HALF_UP));
                        }
                    } else {
                        List listK2 = b.k(Double.valueOf(dC), Double.valueOf(dC2), Double.valueOf(dC3));
                        arrayList = new ArrayList(l48.r(listK2, 10));
                        Iterator it2 = listK2.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(BigDecimal.valueOf(((Number) it2.next()).doubleValue()).setScale(2, RoundingMode.HALF_UP));
                        }
                    }
                    ArrayList arrayList2 = arrayList;
                    BigDecimal bigDecimalA2 = i6s.a(1, bcpVarC);
                    BigDecimal bigDecimalA3 = i6s.a(2, bcpVarC);
                    BigDecimal bigDecimalA4 = i6s.a(5, bcpVarC);
                    BigDecimal bigDecimalValueOf = BigDecimal.valueOf(dc8.c(3, bcpVarC));
                    RoundingMode roundingMode = RoundingMode.HALF_UP;
                    BigDecimal scale = bigDecimalValueOf.setScale(2, roundingMode);
                    scale.getClass();
                    BigDecimal scale2 = BigDecimal.valueOf(dc8.c(4, bcpVarC)).setScale(2, roundingMode);
                    scale2.getClass();
                    strJ = new eal().j(new StakeConfig(bigDecimalA, bigDecimalA2, bigDecimalA3, bigDecimalA4, scale, scale2, arrayList2, dc8.d(9, bcpVarC, 30), i6s.a(10, bcpVarC), dc8.d(11, bcpVarC, 0)));
                } catch (Exception e) {
                    itf0.a aVar2 = itf0.a;
                    aVar2.q(MyLog.TAG_CONFIG);
                    aVar2.p(e, "failed to migrate legacy stake config cache", new Object[0]);
                    strJ = null;
                }
            } else {
                strJ = null;
            }
        }
        if (strJ == null) {
            return zn20Var;
        }
        jtw jtwVarD = zn20Var.d();
        jtwVarD.h(aVar, strJ);
        return jtwVarD;
    }
}
