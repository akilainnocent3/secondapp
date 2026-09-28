package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzdf;
import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.RuntimeVersion;
import com.sporty.android.core.model.patron.KYCBannerItem;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class tvk0 extends ntk0 implements vvk0 {
    public tvk0() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static vvk0 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return iInterfaceQueryLocalInterface instanceof vvk0 ? (vvk0) iInterfaceQueryLocalInterface : new rvk0(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // defpackage.ntk0
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        boolean z;
        zvk0 wvk0Var = null;
        cwk0 bwk0Var = null;
        zvk0 wvk0Var2 = null;
        zvk0 wvk0Var3 = null;
        zvk0 wvk0Var4 = null;
        zvk0 wvk0Var5 = null;
        zwk0 dwk0Var = null;
        zwk0 dwk0Var2 = null;
        zwk0 dwk0Var3 = null;
        zvk0 wvk0Var6 = null;
        zvk0 wvk0Var7 = null;
        zvk0 wvk0Var8 = null;
        zvk0 wvk0Var9 = null;
        zvk0 wvk0Var10 = null;
        zvk0 wvk0Var11 = null;
        dxk0 bxk0Var = null;
        zvk0 wvk0Var12 = null;
        zvk0 wvk0Var13 = null;
        zvk0 wvk0Var14 = null;
        zvk0 wvk0Var15 = null;
        zvk0 wvk0Var16 = null;
        switch (i) {
            case 1:
                eym eymVarB = eym.a.b(parcel.readStrongBinder());
                zzdd zzddVar = (zzdd) ptk0.a(parcel, zzdd.CREATOR);
                long j = parcel.readLong();
                ptk0.d(parcel);
                initialize(eymVarB, zzddVar, j);
                break;
            case 2:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle = (Bundle) ptk0.a(parcel, Bundle.CREATOR);
                boolean z2 = parcel.readInt() != 0;
                boolean z3 = parcel.readInt() != 0;
                long j2 = parcel.readLong();
                ptk0.d(parcel);
                logEvent(string, string2, bundle, z2, z3, j2);
                break;
            case 3:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                Bundle bundle2 = (Bundle) ptk0.a(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    wvk0Var = iInterfaceQueryLocalInterface instanceof zvk0 ? (zvk0) iInterfaceQueryLocalInterface : new wvk0(strongBinder);
                }
                zvk0 zvk0Var = wvk0Var;
                long j3 = parcel.readLong();
                ptk0.d(parcel);
                logEventAndBundle(string3, string4, bundle2, zvk0Var, j3);
                break;
            case 4:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                eym eymVarB2 = eym.a.b(parcel.readStrongBinder());
                ClassLoader classLoader = ptk0.a;
                z = parcel.readInt() != 0;
                long j4 = parcel.readLong();
                ptk0.d(parcel);
                setUserProperty(string5, string6, eymVarB2, z, j4);
                break;
            case 5:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                ClassLoader classLoader2 = ptk0.a;
                z = parcel.readInt() != 0;
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    wvk0Var16 = iInterfaceQueryLocalInterface2 instanceof zvk0 ? (zvk0) iInterfaceQueryLocalInterface2 : new wvk0(strongBinder2);
                }
                ptk0.d(parcel);
                getUserProperties(string7, string8, z, wvk0Var16);
                break;
            case 6:
                String string9 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    wvk0Var15 = iInterfaceQueryLocalInterface3 instanceof zvk0 ? (zvk0) iInterfaceQueryLocalInterface3 : new wvk0(strongBinder3);
                }
                ptk0.d(parcel);
                getMaxUserProperties(string9, wvk0Var15);
                break;
            case 7:
                String string10 = parcel.readString();
                long j5 = parcel.readLong();
                ptk0.d(parcel);
                setUserId(string10, j5);
                break;
            case 8:
                Bundle bundle3 = (Bundle) ptk0.a(parcel, Bundle.CREATOR);
                long j6 = parcel.readLong();
                ptk0.d(parcel);
                setConditionalUserProperty(bundle3, j6);
                break;
            case 9:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                Bundle bundle4 = (Bundle) ptk0.a(parcel, Bundle.CREATOR);
                ptk0.d(parcel);
                clearConditionalUserProperty(string11, string12, bundle4);
                break;
            case 10:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    wvk0Var14 = iInterfaceQueryLocalInterface4 instanceof zvk0 ? (zvk0) iInterfaceQueryLocalInterface4 : new wvk0(strongBinder4);
                }
                ptk0.d(parcel);
                getConditionalUserProperties(string13, string14, wvk0Var14);
                break;
            case 11:
                ClassLoader classLoader3 = ptk0.a;
                z = parcel.readInt() != 0;
                long j7 = parcel.readLong();
                ptk0.d(parcel);
                setMeasurementEnabled(z, j7);
                break;
            case 12:
                long j8 = parcel.readLong();
                ptk0.d(parcel);
                resetAnalyticsData(j8);
                break;
            case 13:
                long j9 = parcel.readLong();
                ptk0.d(parcel);
                setMinimumSessionDuration(j9);
                break;
            case 14:
                long j10 = parcel.readLong();
                ptk0.d(parcel);
                setSessionTimeoutDuration(j10);
                break;
            case 15:
                eym eymVarB3 = eym.a.b(parcel.readStrongBinder());
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                long j11 = parcel.readLong();
                ptk0.d(parcel);
                setCurrentScreen(eymVarB3, string15, string16, j11);
                break;
            case 16:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    wvk0Var13 = iInterfaceQueryLocalInterface5 instanceof zvk0 ? (zvk0) iInterfaceQueryLocalInterface5 : new wvk0(strongBinder5);
                }
                ptk0.d(parcel);
                getCurrentScreenName(wvk0Var13);
                break;
            case 17:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    wvk0Var12 = iInterfaceQueryLocalInterface6 instanceof zvk0 ? (zvk0) iInterfaceQueryLocalInterface6 : new wvk0(strongBinder6);
                }
                ptk0.d(parcel);
                getCurrentScreenClass(wvk0Var12);
                break;
            case 18:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    bxk0Var = iInterfaceQueryLocalInterface7 instanceof dxk0 ? (dxk0) iInterfaceQueryLocalInterface7 : new bxk0(strongBinder7, "com.google.android.gms.measurement.api.internal.IStringProvider");
                }
                ptk0.d(parcel);
                setInstanceIdProvider(bxk0Var);
                break;
            case 19:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    wvk0Var11 = iInterfaceQueryLocalInterface8 instanceof zvk0 ? (zvk0) iInterfaceQueryLocalInterface8 : new wvk0(strongBinder8);
                }
                ptk0.d(parcel);
                getCachedAppInstanceId(wvk0Var11);
                break;
            case 20:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    wvk0Var10 = iInterfaceQueryLocalInterface9 instanceof zvk0 ? (zvk0) iInterfaceQueryLocalInterface9 : new wvk0(strongBinder9);
                }
                ptk0.d(parcel);
                getAppInstanceId(wvk0Var10);
                break;
            case 21:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    wvk0Var9 = iInterfaceQueryLocalInterface10 instanceof zvk0 ? (zvk0) iInterfaceQueryLocalInterface10 : new wvk0(strongBinder10);
                }
                ptk0.d(parcel);
                getGmpAppId(wvk0Var9);
                break;
            case 22:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    wvk0Var8 = iInterfaceQueryLocalInterface11 instanceof zvk0 ? (zvk0) iInterfaceQueryLocalInterface11 : new wvk0(strongBinder11);
                }
                ptk0.d(parcel);
                generateEventId(wvk0Var8);
                break;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                String string17 = parcel.readString();
                long j12 = parcel.readLong();
                ptk0.d(parcel);
                beginAdUnitExposure(string17, j12);
                break;
            case 24:
                String string18 = parcel.readString();
                long j13 = parcel.readLong();
                ptk0.d(parcel);
                endAdUnitExposure(string18, j13);
                break;
            case KYCBannerItem.STATUS_DEPRECATE /* 25 */:
                eym eymVarB4 = eym.a.b(parcel.readStrongBinder());
                long j14 = parcel.readLong();
                ptk0.d(parcel);
                onActivityStarted(eymVarB4, j14);
                break;
            case RuntimeVersion.MINOR /* 26 */:
                eym eymVarB5 = eym.a.b(parcel.readStrongBinder());
                long j15 = parcel.readLong();
                ptk0.d(parcel);
                onActivityStopped(eymVarB5, j15);
                break;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                eym eymVarB6 = eym.a.b(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) ptk0.a(parcel, Bundle.CREATOR);
                long j16 = parcel.readLong();
                ptk0.d(parcel);
                onActivityCreated(eymVarB6, bundle5, j16);
                break;
            case 28:
                eym eymVarB7 = eym.a.b(parcel.readStrongBinder());
                long j17 = parcel.readLong();
                ptk0.d(parcel);
                onActivityDestroyed(eymVarB7, j17);
                break;
            case 29:
                eym eymVarB8 = eym.a.b(parcel.readStrongBinder());
                long j18 = parcel.readLong();
                ptk0.d(parcel);
                onActivityPaused(eymVarB8, j18);
                break;
            case 30:
                eym eymVarB9 = eym.a.b(parcel.readStrongBinder());
                long j19 = parcel.readLong();
                ptk0.d(parcel);
                onActivityResumed(eymVarB9, j19);
                break;
            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                eym eymVarB10 = eym.a.b(parcel.readStrongBinder());
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    wvk0Var7 = iInterfaceQueryLocalInterface12 instanceof zvk0 ? (zvk0) iInterfaceQueryLocalInterface12 : new wvk0(strongBinder12);
                }
                long j20 = parcel.readLong();
                ptk0.d(parcel);
                onActivitySaveInstanceState(eymVarB10, wvk0Var7, j20);
                break;
            case 32:
                Bundle bundle6 = (Bundle) ptk0.a(parcel, Bundle.CREATOR);
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    wvk0Var6 = iInterfaceQueryLocalInterface13 instanceof zvk0 ? (zvk0) iInterfaceQueryLocalInterface13 : new wvk0(strongBinder13);
                }
                long j21 = parcel.readLong();
                ptk0.d(parcel);
                performAction(bundle6, wvk0Var6, j21);
                break;
            case 33:
                int i2 = parcel.readInt();
                String string19 = parcel.readString();
                eym eymVarB11 = eym.a.b(parcel.readStrongBinder());
                eym eymVarB12 = eym.a.b(parcel.readStrongBinder());
                eym eymVarB13 = eym.a.b(parcel.readStrongBinder());
                ptk0.d(parcel);
                logHealthData(i2, string19, eymVarB11, eymVarB12, eymVarB13);
                break;
            case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    dwk0Var3 = iInterfaceQueryLocalInterface14 instanceof zwk0 ? (zwk0) iInterfaceQueryLocalInterface14 : new dwk0(strongBinder14);
                }
                ptk0.d(parcel);
                setEventInterceptor(dwk0Var3);
                break;
            case 35:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    dwk0Var2 = iInterfaceQueryLocalInterface15 instanceof zwk0 ? (zwk0) iInterfaceQueryLocalInterface15 : new dwk0(strongBinder15);
                }
                ptk0.d(parcel);
                registerOnMeasurementEventListener(dwk0Var2);
                break;
            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    dwk0Var = iInterfaceQueryLocalInterface16 instanceof zwk0 ? (zwk0) iInterfaceQueryLocalInterface16 : new dwk0(strongBinder16);
                }
                ptk0.d(parcel);
                unregisterOnMeasurementEventListener(dwk0Var);
                break;
            case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                HashMap hashMap = parcel.readHashMap(ptk0.a);
                ptk0.d(parcel);
                initForTests(hashMap);
                break;
            case 38:
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    wvk0Var5 = iInterfaceQueryLocalInterface17 instanceof zvk0 ? (zvk0) iInterfaceQueryLocalInterface17 : new wvk0(strongBinder17);
                }
                int i3 = parcel.readInt();
                ptk0.d(parcel);
                getTestFlag(wvk0Var5, i3);
                break;
            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                ClassLoader classLoader4 = ptk0.a;
                z = parcel.readInt() != 0;
                ptk0.d(parcel);
                setDataCollectionEnabled(z);
                break;
            case 40:
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    wvk0Var4 = iInterfaceQueryLocalInterface18 instanceof zvk0 ? (zvk0) iInterfaceQueryLocalInterface18 : new wvk0(strongBinder18);
                }
                ptk0.d(parcel);
                isDataCollectionEnabled(wvk0Var4);
                break;
            case 41:
            case 47:
            case 49:
            default:
                return false;
            case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                Bundle bundle7 = (Bundle) ptk0.a(parcel, Bundle.CREATOR);
                ptk0.d(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case 43:
                long j22 = parcel.readLong();
                ptk0.d(parcel);
                clearMeasurementEnabled(j22);
                break;
            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                Bundle bundle8 = (Bundle) ptk0.a(parcel, Bundle.CREATOR);
                long j23 = parcel.readLong();
                ptk0.d(parcel);
                setConsent(bundle8, j23);
                break;
            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                Bundle bundle9 = (Bundle) ptk0.a(parcel, Bundle.CREATOR);
                long j24 = parcel.readLong();
                ptk0.d(parcel);
                setConsentThirdParty(bundle9, j24);
                break;
            case 46:
                IBinder strongBinder19 = parcel.readStrongBinder();
                if (strongBinder19 != null) {
                    IInterface iInterfaceQueryLocalInterface19 = strongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    wvk0Var3 = iInterfaceQueryLocalInterface19 instanceof zvk0 ? (zvk0) iInterfaceQueryLocalInterface19 : new wvk0(strongBinder19);
                }
                ptk0.d(parcel);
                getSessionId(wvk0Var3);
                break;
            case 48:
                Intent intent = (Intent) ptk0.a(parcel, Intent.CREATOR);
                ptk0.d(parcel);
                setSgtmDebugInfo(intent);
                break;
            case 50:
                zzdf zzdfVar = (zzdf) ptk0.a(parcel, zzdf.CREATOR);
                String string20 = parcel.readString();
                String string21 = parcel.readString();
                long j25 = parcel.readLong();
                ptk0.d(parcel);
                setCurrentScreenByScionActivityInfo(zzdfVar, string20, string21, j25);
                break;
            case 51:
                zzdf zzdfVar2 = (zzdf) ptk0.a(parcel, zzdf.CREATOR);
                long j26 = parcel.readLong();
                ptk0.d(parcel);
                onActivityStartedByScionActivityInfo(zzdfVar2, j26);
                break;
            case 52:
                zzdf zzdfVar3 = (zzdf) ptk0.a(parcel, zzdf.CREATOR);
                long j27 = parcel.readLong();
                ptk0.d(parcel);
                onActivityStoppedByScionActivityInfo(zzdfVar3, j27);
                break;
            case 53:
                zzdf zzdfVar4 = (zzdf) ptk0.a(parcel, zzdf.CREATOR);
                Bundle bundle10 = (Bundle) ptk0.a(parcel, Bundle.CREATOR);
                long j28 = parcel.readLong();
                ptk0.d(parcel);
                onActivityCreatedByScionActivityInfo(zzdfVar4, bundle10, j28);
                break;
            case 54:
                zzdf zzdfVar5 = (zzdf) ptk0.a(parcel, zzdf.CREATOR);
                long j29 = parcel.readLong();
                ptk0.d(parcel);
                onActivityDestroyedByScionActivityInfo(zzdfVar5, j29);
                break;
            case 55:
                zzdf zzdfVar6 = (zzdf) ptk0.a(parcel, zzdf.CREATOR);
                long j30 = parcel.readLong();
                ptk0.d(parcel);
                onActivityPausedByScionActivityInfo(zzdfVar6, j30);
                break;
            case 56:
                zzdf zzdfVar7 = (zzdf) ptk0.a(parcel, zzdf.CREATOR);
                long j31 = parcel.readLong();
                ptk0.d(parcel);
                onActivityResumedByScionActivityInfo(zzdfVar7, j31);
                break;
            case 57:
                zzdf zzdfVar8 = (zzdf) ptk0.a(parcel, zzdf.CREATOR);
                IBinder strongBinder20 = parcel.readStrongBinder();
                if (strongBinder20 != null) {
                    IInterface iInterfaceQueryLocalInterface20 = strongBinder20.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    wvk0Var2 = iInterfaceQueryLocalInterface20 instanceof zvk0 ? (zvk0) iInterfaceQueryLocalInterface20 : new wvk0(strongBinder20);
                }
                long j32 = parcel.readLong();
                ptk0.d(parcel);
                onActivitySaveInstanceStateByScionActivityInfo(zzdfVar8, wvk0Var2, j32);
                break;
            case 58:
                IBinder strongBinder21 = parcel.readStrongBinder();
                if (strongBinder21 != null) {
                    IInterface iInterfaceQueryLocalInterface21 = strongBinder21.queryLocalInterface("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
                    bwk0Var = iInterfaceQueryLocalInterface21 instanceof cwk0 ? (cwk0) iInterfaceQueryLocalInterface21 : new bwk0(strongBinder21, "com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
                }
                ptk0.d(parcel);
                retrieveAndUploadBatches(bwk0Var);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
