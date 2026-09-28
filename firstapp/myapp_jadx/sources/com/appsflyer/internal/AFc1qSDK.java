package com.appsflyer.internal;

import android.content.SharedPreferences;
import com.appsflyer.AFLogger;
import defpackage.hwr;
import defpackage.inm;
import defpackage.qlr;
import defpackage.ttr;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1qSDK implements AFc1oSDK {
    private final ttr getCurrencyIso4217Code;
    private final AFc1hSDK<SharedPreferences> getRevenue;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFc1qSDK$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/content/SharedPreferences;", "m_", "()Landroid/content/SharedPreferences;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass4 extends qlr implements Function0<SharedPreferences> {
        public AnonymousClass4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: m_, reason: merged with bridge method [inline-methods] */
        public final SharedPreferences invoke() {
            return (SharedPreferences) AFc1qSDK.this.getRevenue.getRevenue.invoke();
        }
    }

    public AFc1qSDK(AFc1hSDK<SharedPreferences> aFc1hSDK) {
        aFc1hSDK.getClass();
        this.getRevenue = aFc1hSDK;
        this.getCurrencyIso4217Code = hwr.b(new AnonymousClass4());
    }

    @Override // com.appsflyer.internal.AFc1oSDK
    public final void AFAdRevenueData(String str, String str2) {
        ((SharedPreferences) this.getCurrencyIso4217Code.getValue()).edit().putString(str, str2).apply();
    }

    @Override // com.appsflyer.internal.AFc1oSDK
    public final long getCurrencyIso4217Code(String str, long j) {
        try {
            return ((SharedPreferences) this.getCurrencyIso4217Code.getValue()).getLong(str, j);
        } catch (ClassCastException e) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, inm.a("Unexpected data type found for key ", str), e, false, false, false, false, 120, null);
            return j;
        }
    }

    @Override // com.appsflyer.internal.AFc1oSDK
    public final boolean getMediationNetwork(String str, boolean z) {
        try {
            return ((SharedPreferences) this.getCurrencyIso4217Code.getValue()).getBoolean(str, z);
        } catch (ClassCastException e) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, inm.a("Unexpected data type found for key ", str), e, false, false, false, false, 120, null);
            return z;
        }
    }

    @Override // com.appsflyer.internal.AFc1oSDK
    public final String getMonetizationNetwork(String str, String str2) {
        try {
            return ((SharedPreferences) this.getCurrencyIso4217Code.getValue()).getString(str, str2);
        } catch (ClassCastException e) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, inm.a("Unexpected data type found for key ", str), e, false, false, false, false, 120, null);
            return str2;
        }
    }

    @Override // com.appsflyer.internal.AFc1oSDK
    public final void getRevenue(String str, long j) {
        ((SharedPreferences) this.getCurrencyIso4217Code.getValue()).edit().putLong(str, j).apply();
    }

    @Override // com.appsflyer.internal.AFc1oSDK
    public final void getRevenue(String str, int i) {
        ((SharedPreferences) this.getCurrencyIso4217Code.getValue()).edit().putInt(str, i).apply();
    }

    @Override // com.appsflyer.internal.AFc1oSDK
    public final boolean getRevenue(String str) {
        return ((SharedPreferences) this.getCurrencyIso4217Code.getValue()).contains(str);
    }

    @Override // com.appsflyer.internal.AFc1oSDK
    public final void getCurrencyIso4217Code(String str, boolean z) {
        ((SharedPreferences) this.getCurrencyIso4217Code.getValue()).edit().putBoolean(str, z).apply();
    }

    @Override // com.appsflyer.internal.AFc1oSDK
    public final int getMediationNetwork(String str, int i) {
        try {
            return ((SharedPreferences) this.getCurrencyIso4217Code.getValue()).getInt(str, i);
        } catch (ClassCastException e) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, inm.a("Unexpected data type found for key ", str), e, false, false, false, false, 120, null);
            return i;
        }
    }

    @Override // com.appsflyer.internal.AFc1oSDK
    public final void getCurrencyIso4217Code(String str) {
        ((SharedPreferences) this.getCurrencyIso4217Code.getValue()).edit().remove(str).apply();
    }
}
