package defpackage;

import android.content.Context;
import com.sporty.android.core.model.json.JsonSerializeService;
import com.sporty.android.core.model.watchdog.HangWatchdogConfigData;
import com.twilio.voice.EventKeys;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class udl implements dn20 {
    public final /* synthetic */ zed a;
    public final JsonSerializeService b;

    public udl(Context context, JsonSerializeService jsonSerializeService) {
        jsonSerializeService.getClass();
        this.a = new zed(wdl.b.a(context, wdl.a[0]));
        this.b = jsonSerializeService;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(x1b x1bVar) {
        tdl tdlVar;
        Object bVar;
        if (x1bVar instanceof tdl) {
            tdlVar = (tdl) x1bVar;
            int i = tdlVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tdlVar.c = i - Integer.MIN_VALUE;
            } else {
                tdlVar = new tdl(this, x1bVar);
            }
        } else {
            tdlVar = new tdl(this, x1bVar);
        }
        Object objF = tdlVar.a;
        y5b y5bVar = y5b.a;
        int i2 = tdlVar.c;
        if (i2 == 0) {
            uj50.b(objF);
            tdlVar.c = 1;
            objF = this.a.f(co20.f(EventKeys.VALUES_KEY), tdlVar);
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
            bVar = (HangWatchdogConfigData) this.b.fromJson(str, HangWatchdogConfigData.class);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        return (HangWatchdogConfigData) (bVar instanceof zi50.b ? null : bVar);
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
    public final Object getDouble(String str, double d, v1b<? super Double> v1bVar) {
        return this.a.getDouble(str, d, v1bVar);
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
    public final Object putDouble(String str, Double d, v1b<? super Unit> v1bVar) {
        return this.a.putDouble(str, d, v1bVar);
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
    public final lyh<Double> getDoubleByFlow(String str, double d) {
        str.getClass();
        return this.a.getDoubleByFlow(str, d);
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
