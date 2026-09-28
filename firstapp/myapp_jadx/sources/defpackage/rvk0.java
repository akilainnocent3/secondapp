package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzdf;

/* JADX INFO: loaded from: classes4.dex */
public final class rvk0 extends mtk0 implements vvk0 {
    @Override // defpackage.vvk0
    public final void beginAdUnitExposure(String str, long j) {
        Parcel parcelB = b();
        parcelB.writeString(str);
        parcelB.writeLong(j);
        d(parcelB, 23);
    }

    @Override // defpackage.vvk0
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel parcelB = b();
        parcelB.writeString(str);
        parcelB.writeString(str2);
        ptk0.b(parcelB, bundle);
        d(parcelB, 9);
    }

    @Override // defpackage.vvk0
    public final void endAdUnitExposure(String str, long j) {
        Parcel parcelB = b();
        parcelB.writeString(str);
        parcelB.writeLong(j);
        d(parcelB, 24);
    }

    @Override // defpackage.vvk0
    public final void generateEventId(zvk0 zvk0Var) {
        Parcel parcelB = b();
        ptk0.c(parcelB, zvk0Var);
        d(parcelB, 22);
    }

    @Override // defpackage.vvk0
    public final void getAppInstanceId(zvk0 zvk0Var) {
        Parcel parcelB = b();
        ptk0.c(parcelB, zvk0Var);
        d(parcelB, 20);
    }

    @Override // defpackage.vvk0
    public final void getCachedAppInstanceId(zvk0 zvk0Var) {
        Parcel parcelB = b();
        ptk0.c(parcelB, zvk0Var);
        d(parcelB, 19);
    }

    @Override // defpackage.vvk0
    public final void getConditionalUserProperties(String str, String str2, zvk0 zvk0Var) {
        Parcel parcelB = b();
        parcelB.writeString(str);
        parcelB.writeString(str2);
        ptk0.c(parcelB, zvk0Var);
        d(parcelB, 10);
    }

    @Override // defpackage.vvk0
    public final void getCurrentScreenClass(zvk0 zvk0Var) {
        Parcel parcelB = b();
        ptk0.c(parcelB, zvk0Var);
        d(parcelB, 17);
    }

    @Override // defpackage.vvk0
    public final void getCurrentScreenName(zvk0 zvk0Var) {
        Parcel parcelB = b();
        ptk0.c(parcelB, zvk0Var);
        d(parcelB, 16);
    }

    @Override // defpackage.vvk0
    public final void getGmpAppId(zvk0 zvk0Var) {
        Parcel parcelB = b();
        ptk0.c(parcelB, zvk0Var);
        d(parcelB, 21);
    }

    @Override // defpackage.vvk0
    public final void getMaxUserProperties(String str, zvk0 zvk0Var) {
        Parcel parcelB = b();
        parcelB.writeString(str);
        ptk0.c(parcelB, zvk0Var);
        d(parcelB, 6);
    }

    @Override // defpackage.vvk0
    public final void getUserProperties(String str, String str2, boolean z, zvk0 zvk0Var) {
        Parcel parcelB = b();
        parcelB.writeString(str);
        parcelB.writeString(str2);
        ClassLoader classLoader = ptk0.a;
        parcelB.writeInt(z ? 1 : 0);
        ptk0.c(parcelB, zvk0Var);
        d(parcelB, 5);
    }

    @Override // defpackage.vvk0
    public final void initialize(eym eymVar, zzdd zzddVar, long j) {
        Parcel parcelB = b();
        ptk0.c(parcelB, eymVar);
        ptk0.b(parcelB, zzddVar);
        parcelB.writeLong(j);
        d(parcelB, 1);
    }

    @Override // defpackage.vvk0
    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        Parcel parcelB = b();
        parcelB.writeString(str);
        parcelB.writeString(str2);
        ptk0.b(parcelB, bundle);
        parcelB.writeInt(z ? 1 : 0);
        parcelB.writeInt(1);
        parcelB.writeLong(j);
        d(parcelB, 2);
    }

    @Override // defpackage.vvk0
    public final void logHealthData(int i, String str, eym eymVar, eym eymVar2, eym eymVar3) {
        Parcel parcelB = b();
        parcelB.writeInt(5);
        parcelB.writeString(str);
        ptk0.c(parcelB, eymVar);
        ptk0.c(parcelB, eymVar2);
        ptk0.c(parcelB, eymVar3);
        d(parcelB, 33);
    }

    @Override // defpackage.vvk0
    public final void onActivityCreatedByScionActivityInfo(zzdf zzdfVar, Bundle bundle, long j) {
        Parcel parcelB = b();
        ptk0.b(parcelB, zzdfVar);
        ptk0.b(parcelB, bundle);
        parcelB.writeLong(j);
        d(parcelB, 53);
    }

    @Override // defpackage.vvk0
    public final void onActivityDestroyedByScionActivityInfo(zzdf zzdfVar, long j) {
        Parcel parcelB = b();
        ptk0.b(parcelB, zzdfVar);
        parcelB.writeLong(j);
        d(parcelB, 54);
    }

    @Override // defpackage.vvk0
    public final void onActivityPausedByScionActivityInfo(zzdf zzdfVar, long j) {
        Parcel parcelB = b();
        ptk0.b(parcelB, zzdfVar);
        parcelB.writeLong(j);
        d(parcelB, 55);
    }

    @Override // defpackage.vvk0
    public final void onActivityResumedByScionActivityInfo(zzdf zzdfVar, long j) {
        Parcel parcelB = b();
        ptk0.b(parcelB, zzdfVar);
        parcelB.writeLong(j);
        d(parcelB, 56);
    }

    @Override // defpackage.vvk0
    public final void onActivitySaveInstanceStateByScionActivityInfo(zzdf zzdfVar, zvk0 zvk0Var, long j) {
        Parcel parcelB = b();
        ptk0.b(parcelB, zzdfVar);
        ptk0.c(parcelB, zvk0Var);
        parcelB.writeLong(j);
        d(parcelB, 57);
    }

    @Override // defpackage.vvk0
    public final void onActivityStartedByScionActivityInfo(zzdf zzdfVar, long j) {
        Parcel parcelB = b();
        ptk0.b(parcelB, zzdfVar);
        parcelB.writeLong(j);
        d(parcelB, 51);
    }

    @Override // defpackage.vvk0
    public final void onActivityStoppedByScionActivityInfo(zzdf zzdfVar, long j) {
        Parcel parcelB = b();
        ptk0.b(parcelB, zzdfVar);
        parcelB.writeLong(j);
        d(parcelB, 52);
    }

    @Override // defpackage.vvk0
    public final void registerOnMeasurementEventListener(zwk0 zwk0Var) {
        Parcel parcelB = b();
        ptk0.c(parcelB, zwk0Var);
        d(parcelB, 35);
    }

    @Override // defpackage.vvk0
    public final void retrieveAndUploadBatches(cwk0 cwk0Var) {
        Parcel parcelB = b();
        ptk0.c(parcelB, cwk0Var);
        d(parcelB, 58);
    }

    @Override // defpackage.vvk0
    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel parcelB = b();
        ptk0.b(parcelB, bundle);
        parcelB.writeLong(j);
        d(parcelB, 8);
    }

    @Override // defpackage.vvk0
    public final void setConsentThirdParty(Bundle bundle, long j) {
        Parcel parcelB = b();
        ptk0.b(parcelB, bundle);
        parcelB.writeLong(j);
        d(parcelB, 45);
    }

    @Override // defpackage.vvk0
    public final void setCurrentScreenByScionActivityInfo(zzdf zzdfVar, String str, String str2, long j) {
        Parcel parcelB = b();
        ptk0.b(parcelB, zzdfVar);
        parcelB.writeString(str);
        parcelB.writeString(str2);
        parcelB.writeLong(j);
        d(parcelB, 50);
    }

    @Override // defpackage.vvk0
    public final void setDataCollectionEnabled(boolean z) {
        throw null;
    }

    @Override // defpackage.vvk0
    public final void setMeasurementEnabled(boolean z, long j) {
        Parcel parcelB = b();
        ClassLoader classLoader = ptk0.a;
        parcelB.writeInt(z ? 1 : 0);
        parcelB.writeLong(j);
        d(parcelB, 11);
    }

    @Override // defpackage.vvk0
    public final void setUserId(String str, long j) {
        Parcel parcelB = b();
        parcelB.writeString(str);
        parcelB.writeLong(j);
        d(parcelB, 7);
    }

    @Override // defpackage.vvk0
    public final void setUserProperty(String str, String str2, eym eymVar, boolean z, long j) {
        Parcel parcelB = b();
        parcelB.writeString(str);
        parcelB.writeString(str2);
        ptk0.c(parcelB, eymVar);
        parcelB.writeInt(z ? 1 : 0);
        parcelB.writeLong(j);
        d(parcelB, 4);
    }
}
