package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public interface dn20 {
    <T> Object clearPreference(zn20.a<T> aVar, v1b<? super Unit> v1bVar);

    Object getBoolean(String str, v1b<? super Boolean> v1bVar);

    Object getBoolean(String str, boolean z, v1b<? super Boolean> v1bVar);

    lyh<Boolean> getBooleanByFlow(String str);

    lyh<Boolean> getBooleanByFlow(String str, boolean z);

    Object getDouble(String str, double d, v1b<? super Double> v1bVar);

    Object getDouble(String str, v1b<? super Double> v1bVar);

    lyh<Double> getDoubleByFlow(String str);

    lyh<Double> getDoubleByFlow(String str, double d);

    Object getFloat(String str, float f, v1b<? super Float> v1bVar);

    Object getFloat(String str, v1b<? super Float> v1bVar);

    lyh<Float> getFloatByFlow(String str);

    lyh<Float> getFloatByFlow(String str, float f);

    Object getInt(String str, int i, v1b<? super Integer> v1bVar);

    Object getInt(String str, v1b<? super Integer> v1bVar);

    lyh<Integer> getIntFlow(String str);

    lyh<Integer> getIntFlow(String str, int i);

    Object getLong(String str, long j, v1b<? super Long> v1bVar);

    Object getLong(String str, v1b<? super Long> v1bVar);

    lyh<Long> getLongByFlow(String str);

    lyh<Long> getLongByFlow(String str, long j);

    Object getString(String str, String str2, v1b<? super String> v1bVar);

    Object getString(String str, v1b<? super String> v1bVar);

    lyh<String> getStringByFlow(String str);

    lyh<String> getStringByFlow(String str, String str2);

    Object putBoolean(String str, Boolean bool, v1b<? super Unit> v1bVar);

    Object putDouble(String str, Double d, v1b<? super Unit> v1bVar);

    Object putFloat(String str, Float f, v1b<? super Unit> v1bVar);

    Object putInt(String str, Integer num, v1b<? super Unit> v1bVar);

    Object putLong(String str, Long l, v1b<? super Unit> v1bVar);

    Object putString(String str, String str2, v1b<? super Unit> v1bVar);
}
