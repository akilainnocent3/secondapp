package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzdf;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public interface vvk0 extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j);

    void endAdUnitExposure(String str, long j);

    void generateEventId(zvk0 zvk0Var);

    void getAppInstanceId(zvk0 zvk0Var);

    void getCachedAppInstanceId(zvk0 zvk0Var);

    void getConditionalUserProperties(String str, String str2, zvk0 zvk0Var);

    void getCurrentScreenClass(zvk0 zvk0Var);

    void getCurrentScreenName(zvk0 zvk0Var);

    void getGmpAppId(zvk0 zvk0Var);

    void getMaxUserProperties(String str, zvk0 zvk0Var);

    void getSessionId(zvk0 zvk0Var);

    void getTestFlag(zvk0 zvk0Var, int i);

    void getUserProperties(String str, String str2, boolean z, zvk0 zvk0Var);

    void initForTests(Map map);

    void initialize(eym eymVar, zzdd zzddVar, long j);

    void isDataCollectionEnabled(zvk0 zvk0Var);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, zvk0 zvk0Var, long j);

    void logHealthData(int i, String str, eym eymVar, eym eymVar2, eym eymVar3);

    void onActivityCreated(eym eymVar, Bundle bundle, long j);

    void onActivityCreatedByScionActivityInfo(zzdf zzdfVar, Bundle bundle, long j);

    void onActivityDestroyed(eym eymVar, long j);

    void onActivityDestroyedByScionActivityInfo(zzdf zzdfVar, long j);

    void onActivityPaused(eym eymVar, long j);

    void onActivityPausedByScionActivityInfo(zzdf zzdfVar, long j);

    void onActivityResumed(eym eymVar, long j);

    void onActivityResumedByScionActivityInfo(zzdf zzdfVar, long j);

    void onActivitySaveInstanceState(eym eymVar, zvk0 zvk0Var, long j);

    void onActivitySaveInstanceStateByScionActivityInfo(zzdf zzdfVar, zvk0 zvk0Var, long j);

    void onActivityStarted(eym eymVar, long j);

    void onActivityStartedByScionActivityInfo(zzdf zzdfVar, long j);

    void onActivityStopped(eym eymVar, long j);

    void onActivityStoppedByScionActivityInfo(zzdf zzdfVar, long j);

    void performAction(Bundle bundle, zvk0 zvk0Var, long j);

    void registerOnMeasurementEventListener(zwk0 zwk0Var);

    void resetAnalyticsData(long j);

    void retrieveAndUploadBatches(cwk0 cwk0Var);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setConsent(Bundle bundle, long j);

    void setConsentThirdParty(Bundle bundle, long j);

    void setCurrentScreen(eym eymVar, String str, String str2, long j);

    void setCurrentScreenByScionActivityInfo(zzdf zzdfVar, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(zwk0 zwk0Var);

    void setInstanceIdProvider(dxk0 dxk0Var);

    void setMeasurementEnabled(boolean z, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, eym eymVar, boolean z, long j);

    void unregisterOnMeasurementEventListener(zwk0 zwk0Var);
}
