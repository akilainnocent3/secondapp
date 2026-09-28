package defpackage;

import com.google.gson.reflect.TypeToken;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.cashout.CashOutMetricsSendingDurationDto;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.cashoutphase3.data.repository.CashoutMetricsRepositoryImpl$getCashoutMetricsSendingDuration$2", f = "CashoutMetricsRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class bq6 extends tje0 implements Function2<v5b, v1b<? super Long>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ dq6 b;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/sporty/android/core/model/json/JsonSerializeServiceExtKt$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a extends TypeToken<CashOutMetricsSendingDurationDto> {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bq6(dq6 dq6Var, v1b<? super bq6> v1bVar) {
        super(2, v1bVar);
        this.b = dq6Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        bq6 bq6Var = new bq6(this.b, v1bVar);
        bq6Var.a = obj;
        return bq6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Long> v1bVar) {
        return ((bq6) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        Object next;
        String country;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        dq6 dq6Var = this.b;
        try {
            zi50.a aVar = zi50.b;
            String strG = dq6Var.c.g("cashout_metrics_duration_time");
            itf0.a aVar2 = itf0.a;
            aVar2.q(MyLog.TAG_CASHOUT_METRICS);
            aVar2.g("jsonString in getCashOutMetricsSendingDuration() =\n".concat(strG), new Object[0]);
            bVar = (CashOutMetricsSendingDurationDto) dq6Var.f.fromJson(strG, new a().getType());
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        Long value = null;
        if (bVar instanceof zi50.b) {
            bVar = null;
        }
        CashOutMetricsSendingDurationDto cashOutMetricsSendingDurationDto = (CashOutMetricsSendingDurationDto) bVar;
        if (cashOutMetricsSendingDurationDto == null) {
            return new Long(0L);
        }
        itf0.a aVar4 = itf0.a;
        aVar4.q(MyLog.TAG_CASHOUT_METRICS);
        aVar4.g("cashOutMetricsSendingDurationDto in getCashOutMetricsSendingDuration() = " + cashOutMetricsSendingDurationDto, new Object[0]);
        List<CashOutMetricsSendingDurationDto.ByCountry> countries = cashOutMetricsSendingDurationDto.getCountries();
        if (countries != null) {
            Iterator<T> it = countries.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                country = ((CashOutMetricsSendingDurationDto.ByCountry) next).getCountry();
            } while (!(country != null ? country.equalsIgnoreCase(dq6Var.a.getCountryCode().getCode()) : false));
            CashOutMetricsSendingDurationDto.ByCountry byCountry = (CashOutMetricsSendingDurationDto.ByCountry) next;
            if (byCountry != null) {
                value = byCountry.getValue();
            }
        }
        itf0.a aVar5 = itf0.a;
        aVar5.q(MyLog.TAG_CASHOUT_METRICS);
        aVar5.g("getCashOutMetricsSendingDuration() finally returns " + value, new Object[0]);
        return new Long(value != null ? value.longValue() : 0L);
    }
}
