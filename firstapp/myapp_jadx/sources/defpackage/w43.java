package defpackage;

import android.content.Context;
import com.sporty.android.book.domain.entity.BetTypeFlexiBetConfig;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final class w43 implements dn20 {
    public static final /* synthetic */ ohp<Object>[] d = {new d630(0, w43.class, "flexiBetConfigJson", "getFlexiBetConfigJson()Lcom/sportybet/core/datastore/Preference;")};
    public final /* synthetic */ zed a;
    public final eal b = new eal();
    public final rkd c = new rkd("key_flexi_bet_config_json", jq40.a(String.class), this);

    public w43(Context context) {
        this.a = new zed(x43.b.a(context, x43.a[0]));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(x1b x1bVar) {
        v43 v43Var;
        Object bVar;
        if (x1bVar instanceof v43) {
            v43Var = (v43) x1bVar;
            int i = v43Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                v43Var.c = i - Integer.MIN_VALUE;
            } else {
                v43Var = new v43(this, x1bVar);
            }
        } else {
            v43Var = new v43(this, x1bVar);
        }
        Object objF = v43Var.a;
        y5b y5bVar = y5b.a;
        int i2 = v43Var.c;
        if (i2 == 0) {
            uj50.b(objF);
            v43Var.c = 1;
            zed zedVar = this.a;
            zedVar.getClass();
            objF = zedVar.f(co20.f("key_flexi_bet_config_json"), v43Var);
            if (objF == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objF);
        }
        String str = (String) objF;
        if (str == null) {
            return null;
        }
        try {
            zi50.a aVar = zi50.b;
            bVar = (BetTypeFlexiBetConfig) this.b.e(str, BetTypeFlexiBetConfig.class);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        return (BetTypeFlexiBetConfig) (bVar instanceof zi50.b ? null : bVar);
    }

    public final Object b(BetTypeFlexiBetConfig betTypeFlexiBetConfig, tje0 tje0Var) {
        return this.c.a(this, d[0]).g(tje0Var, this.b.j(betTypeFlexiBetConfig));
    }

    @Override // defpackage.dn20
    public final <T> Object clearPreference(zn20.a<T> aVar, v1b<? super Unit> v1bVar) {
        return this.a.clearPreference(aVar, v1bVar);
    }

    @Override // defpackage.dn20
    public final Object getBoolean(String str, v1b<? super Boolean> v1bVar) {
        return this.a.getBoolean(str, v1bVar);
    }

    @Override // defpackage.dn20
    public final lyh<Boolean> getBooleanByFlow(String str) {
        str.getClass();
        return this.a.getBooleanByFlow(str);
    }

    @Override // defpackage.dn20
    public final Object getDouble(String str, double d2, v1b<? super Double> v1bVar) {
        return this.a.getDouble(str, d2, v1bVar);
    }

    @Override // defpackage.dn20
    public final lyh<Double> getDoubleByFlow(String str) {
        str.getClass();
        return this.a.getDoubleByFlow(str);
    }

    @Override // defpackage.dn20
    public final Object getFloat(String str, float f, v1b<? super Float> v1bVar) {
        return this.a.getFloat(str, f, v1bVar);
    }

    @Override // defpackage.dn20
    public final lyh<Float> getFloatByFlow(String str) {
        str.getClass();
        return this.a.getFloatByFlow(str);
    }

    @Override // defpackage.dn20
    public final Object getInt(String str, int i, v1b<? super Integer> v1bVar) {
        return this.a.getInt(str, i, v1bVar);
    }

    @Override // defpackage.dn20
    public final lyh<Integer> getIntFlow(String str) {
        str.getClass();
        return this.a.getIntFlow(str);
    }

    @Override // defpackage.dn20
    public final Object getLong(String str, long j, v1b<? super Long> v1bVar) {
        return this.a.getLong(str, j, v1bVar);
    }

    @Override // defpackage.dn20
    public final lyh<Long> getLongByFlow(String str) {
        str.getClass();
        return this.a.getLongByFlow(str);
    }

    @Override // defpackage.dn20
    public final Object getString(String str, v1b<? super String> v1bVar) {
        return this.a.getString(str, v1bVar);
    }

    @Override // defpackage.dn20
    public final lyh<String> getStringByFlow(String str, String str2) {
        str.getClass();
        str2.getClass();
        return this.a.getStringByFlow(str, str2);
    }

    @Override // defpackage.dn20
    public final Object putBoolean(String str, Boolean bool, v1b<? super Unit> v1bVar) {
        return this.a.putBoolean(str, bool, v1bVar);
    }

    @Override // defpackage.dn20
    public final Object putDouble(String str, Double d2, v1b<? super Unit> v1bVar) {
        return this.a.putDouble(str, d2, v1bVar);
    }

    @Override // defpackage.dn20
    public final Object putFloat(String str, Float f, v1b<? super Unit> v1bVar) {
        return this.a.putFloat(str, f, v1bVar);
    }

    @Override // defpackage.dn20
    public final Object putInt(String str, Integer num, v1b<? super Unit> v1bVar) {
        return this.a.putInt(str, num, v1bVar);
    }

    @Override // defpackage.dn20
    public final Object putLong(String str, Long l, v1b<? super Unit> v1bVar) {
        return this.a.putLong(str, l, v1bVar);
    }

    @Override // defpackage.dn20
    public final Object putString(String str, String str2, v1b<? super Unit> v1bVar) {
        return this.a.putString(str, str2, v1bVar);
    }

    @Override // defpackage.dn20
    public final Object getBoolean(String str, boolean z, v1b<? super Boolean> v1bVar) {
        return this.a.getBoolean(str, z, v1bVar);
    }

    @Override // defpackage.dn20
    public final Object getDouble(String str, v1b<? super Double> v1bVar) {
        return this.a.getDouble(str, v1bVar);
    }

    @Override // defpackage.dn20
    public final Object getFloat(String str, v1b<? super Float> v1bVar) {
        return this.a.getFloat(str, v1bVar);
    }

    @Override // defpackage.dn20
    public final Object getInt(String str, v1b<? super Integer> v1bVar) {
        return this.a.getInt(str, v1bVar);
    }

    @Override // defpackage.dn20
    public final Object getLong(String str, v1b<? super Long> v1bVar) {
        return this.a.getLong(str, v1bVar);
    }

    @Override // defpackage.dn20
    public final Object getString(String str, String str2, v1b<? super String> v1bVar) {
        return this.a.getString(str, str2, v1bVar);
    }

    @Override // defpackage.dn20
    public final lyh<Boolean> getBooleanByFlow(String str, boolean z) {
        str.getClass();
        return this.a.getBooleanByFlow(str, z);
    }

    @Override // defpackage.dn20
    public final lyh<Double> getDoubleByFlow(String str, double d2) {
        str.getClass();
        return this.a.getDoubleByFlow(str, d2);
    }

    @Override // defpackage.dn20
    public final lyh<Float> getFloatByFlow(String str, float f) {
        str.getClass();
        return this.a.getFloatByFlow(str, f);
    }

    @Override // defpackage.dn20
    public final lyh<Integer> getIntFlow(String str, int i) {
        str.getClass();
        return this.a.getIntFlow(str, i);
    }

    @Override // defpackage.dn20
    public final lyh<Long> getLongByFlow(String str, long j) {
        str.getClass();
        return this.a.getLongByFlow(str, j);
    }

    @Override // defpackage.dn20
    public final lyh<String> getStringByFlow(String str) {
        str.getClass();
        return this.a.getStringByFlow(str);
    }
}
