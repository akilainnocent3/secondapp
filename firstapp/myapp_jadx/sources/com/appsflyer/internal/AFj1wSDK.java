package com.appsflyer.internal;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import defpackage.kpu;
import defpackage.uhc;
import defpackage.uwx;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1wSDK extends AFi1aSDK {
    private final AFj1xSDK component2;
    private final Runnable component3;
    private final AFc1pSDK getMediationNetwork;
    private final ExecutorService getRevenue;
    private String toString;

    public /* synthetic */ class AFa1vSDK {
        public static final /* synthetic */ int[] getRevenue;

        static {
            int[] iArr = new int[AFj1xSDK.values().length];
            try {
                iArr[AFj1xSDK.getMediationNetwork.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFj1xSDK.INSTAGRAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFj1xSDK.FACEBOOK_LITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            getRevenue = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AFj1wSDK(AFc1pSDK aFc1pSDK, ExecutorService executorService, AFj1xSDK aFj1xSDK, Runnable runnable, Runnable runnable2) {
        String str;
        aFc1pSDK.getClass();
        executorService.getClass();
        aFj1xSDK.getClass();
        runnable.getClass();
        runnable2.getClass();
        int i = AFj1tSDK.AFa1zSDK.AFAdRevenueData[aFj1xSDK.ordinal()];
        if (i == 1) {
            str = "facebook";
        } else if (i == 2) {
            str = "instagram";
        } else {
            if (i != 3) {
                uhc.a();
                throw null;
            }
            str = "facebook_lite";
        }
        super("app", str, aFc1pSDK, runnable);
        this.getMediationNetwork = aFc1pSDK;
        this.getRevenue = executorService;
        this.component2 = aFj1xSDK;
        this.component3 = runnable2;
    }

    private final boolean AFAdRevenueData(Context context) {
        int i = AFa1vSDK.getRevenue[this.component2.ordinal()];
        if (i == 1) {
            return getRevenue(context);
        }
        if (i == 2) {
            return getMediationNetwork(context);
        }
        if (i == 3) {
            return component2(context);
        }
        uhc.a();
        return false;
    }

    private static boolean component2(Context context) {
        return context.getPackageManager().resolveContentProvider("com.facebook.lite.provider.InstallReferrerProvider", 0) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:72:0x020d A[PHI: r10
      0x020d: PHI (r10v4 android.content.ContentProviderClient) = 
      (r10v3 android.content.ContentProviderClient)
      (r21v3 android.content.ContentProviderClient)
      (r21v3 android.content.ContentProviderClient)
     binds: [B:81:0x0251, B:71:0x020b, B:76:0x0221] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x021e  */
    /* JADX WARN: Code duplicated, block: B:80:0x024e  */
    public static final void getCurrencyIso4217Code(AFj1wSDK aFj1wSDK, Context context) {
        Throwable th;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient;
        Cursor cursor;
        AFLogger aFLogger;
        AFg1cSDK aFg1cSDK;
        Uri uri;
        String string;
        String str;
        aFj1wSDK.getClass();
        context.getClass();
        aFj1wSDK.component1 = System.currentTimeMillis();
        aFj1wSDK.areAllFieldsValid = AFj1qSDK.AFa1vSDK.STARTED;
        aFj1wSDK.addObserver(new AFj1qSDK.AnonymousClass1());
        String str2 = aFj1wSDK.toString;
        str2.getClass();
        try {
            AFj1xSDK aFj1xSDK = aFj1wSDK.component2;
            int[] iArr = AFa1vSDK.getRevenue;
            int i = iArr[aFj1xSDK.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new uwx();
                    }
                    if (component2(context)) {
                        aFLogger = AFLogger.INSTANCE;
                        aFg1cSDK = AFg1cSDK.META_REFERRER;
                        AFh1ySDK.d$default(aFLogger, aFg1cSDK, "Found Facebook Lite content provider", false, 4, null);
                        uri = Uri.parse("content://com.facebook.lite.provider.InstallReferrerProvider/".concat(str2));
                    } else {
                        aFLogger = AFLogger.INSTANCE;
                        aFg1cSDK = AFg1cSDK.META_REFERRER;
                        AFh1ySDK.d$default(aFLogger, aFg1cSDK, "Facebook Lite content provider not found", false, 4, null);
                        uri = null;
                    }
                } else if (getMediationNetwork(context)) {
                    aFLogger = AFLogger.INSTANCE;
                    aFg1cSDK = AFg1cSDK.META_REFERRER;
                    AFh1ySDK.d$default(aFLogger, aFg1cSDK, "Found Instagram content provider", false, 4, null);
                    uri = Uri.parse("content://com.instagram.contentprovider.InstallReferrerProvider/".concat(str2));
                } else {
                    aFLogger = AFLogger.INSTANCE;
                    aFg1cSDK = AFg1cSDK.META_REFERRER;
                    AFh1ySDK.d$default(aFLogger, aFg1cSDK, "Instagram content provider not found", false, 4, null);
                    uri = null;
                }
            } else if (getRevenue(context)) {
                aFLogger = AFLogger.INSTANCE;
                aFg1cSDK = AFg1cSDK.META_REFERRER;
                AFh1ySDK.d$default(aFLogger, aFg1cSDK, "Found Facebook content provider", false, 4, null);
                uri = Uri.parse("content://com.facebook.katana.provider.InstallReferrerProvider/".concat(str2));
            } else {
                aFLogger = AFLogger.INSTANCE;
                aFg1cSDK = AFg1cSDK.META_REFERRER;
                AFh1ySDK.d$default(aFLogger, aFg1cSDK, "Facebook content provider not found", false, 4, null);
                uri = null;
            }
            if (uri != null) {
                contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uri);
                try {
                    Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient != null ? contentProviderClientAcquireUnstableContentProviderClient.query(uri, new String[]{"install_referrer", "is_ct", "actual_timestamp"}, null, null, null) : null;
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                int columnIndex = cursorQuery.getColumnIndex("install_referrer");
                                if (columnIndex != -1) {
                                    string = cursorQuery.getString(columnIndex);
                                } else {
                                    AFh1ySDK.d$default(aFLogger, aFg1cSDK, "No such column, " + aFj1wSDK.component2 + " provider", false, 4, null);
                                    string = null;
                                }
                                if (string != null) {
                                    AFh1ySDK.d$default(aFLogger, aFg1cSDK, "Collected " + aFj1wSDK.component2 + " attribution data.", false, 4, null);
                                    Map<String, Object> map = aFj1wSDK.AFAdRevenueData;
                                    map.getClass();
                                    map.put("response", "OK");
                                    Map<String, Object> map2 = aFj1wSDK.AFAdRevenueData;
                                    map2.getClass();
                                    map2.put("referrer", string);
                                    int columnIndex2 = cursorQuery.getColumnIndex("actual_timestamp");
                                    Long lValueOf = columnIndex2 != -1 ? Long.valueOf(cursorQuery.getLong(columnIndex2)) : null;
                                    if (lValueOf != null) {
                                        aFj1wSDK.AFAdRevenueData.put("click_ts", Long.valueOf(lValueOf.longValue()));
                                    }
                                    int columnIndex3 = cursorQuery.getColumnIndex("is_ct");
                                    Integer numValueOf = columnIndex3 != -1 ? Integer.valueOf(cursorQuery.getInt(columnIndex3)) : null;
                                    if (numValueOf != null) {
                                        aFj1wSDK.AFAdRevenueData.put("meta_custom", kpu.g(new Pair("is_ct", Integer.valueOf(numValueOf.intValue()))));
                                    }
                                    int i2 = iArr[aFj1wSDK.component2.ordinal()];
                                    if (i2 == 1) {
                                        str = "com.facebook.katana";
                                    } else if (i2 == 2) {
                                        str = "com.instagram.android";
                                    } else {
                                        if (i2 != 3) {
                                            throw new uwx();
                                        }
                                        str = "com.facebook.lite";
                                    }
                                    Map<String, Object> map3 = aFj1wSDK.AFAdRevenueData;
                                    map3.getClass();
                                    map3.put("api_ver", Long.valueOf(AFj1iSDK.getCurrencyIso4217Code(context, str)));
                                    Map<String, Object> map4 = aFj1wSDK.AFAdRevenueData;
                                    map4.getClass();
                                    map4.put("api_ver_name", AFj1iSDK.getRevenue(context, str));
                                }
                                cursorQuery.close();
                                if (contentProviderClientAcquireUnstableContentProviderClient != 0) {
                                    contentProviderClientAcquireUnstableContentProviderClient.close();
                                }
                            } else {
                                AFh1ySDK.d$default(aFLogger, aFg1cSDK, "Content provider returned no data", false, 4, null);
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                if (contentProviderClientAcquireUnstableContentProviderClient != 0) {
                                    contentProviderClientAcquireUnstableContentProviderClient.close();
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = cursorQuery;
                            try {
                                AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Error while collecting Meta Install Referrer for " + aFj1wSDK.component2.name() + " provider", th, false, false, false, false, 120, null);
                                if (cursor != null) {
                                    cursor.close();
                                }
                                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                                    contentProviderClientAcquireUnstableContentProviderClient.close();
                                }
                            } catch (Throwable th3) {
                                if (cursor != null) {
                                    cursor.close();
                                }
                                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                                    contentProviderClientAcquireUnstableContentProviderClient.close();
                                }
                                throw th3;
                            }
                        }
                    } else {
                        AFh1ySDK.d$default(aFLogger, aFg1cSDK, "Content provider returned no data", false, 4, null);
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (contentProviderClientAcquireUnstableContentProviderClient != 0) {
                            contentProviderClientAcquireUnstableContentProviderClient.close();
                        }
                    }
                } catch (Throwable th4) {
                    contentProviderClientAcquireUnstableContentProviderClient = contentProviderClientAcquireUnstableContentProviderClient;
                    th = th4;
                    cursor = null;
                    AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Error while collecting Meta Install Referrer for " + aFj1wSDK.component2.name() + " provider", th, false, false, false, false, 120, null);
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        contentProviderClientAcquireUnstableContentProviderClient.close();
                    }
                    aFj1wSDK.getMonetizationNetwork();
                    aFj1wSDK.component3.run();
                }
            }
        } catch (Throwable th5) {
            th = th5;
            contentProviderClientAcquireUnstableContentProviderClient = null;
        }
        aFj1wSDK.getMonetizationNetwork();
        aFj1wSDK.component3.run();
    }

    private static boolean getMediationNetwork(Context context) {
        return context.getPackageManager().resolveContentProvider("com.instagram.contentprovider.InstallReferrerProvider", 0) != null;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008d A[PHI: r0
      0x008d: PHI (r0v7 java.lang.String) = (r0v6 java.lang.String), (r0v13 java.lang.String), (r0v19 java.lang.String) binds: [B:14:0x003c, B:23:0x0063, B:32:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    private final boolean getMonetizationNetwork(Context context) {
        String str;
        if (!getMediationNetwork()) {
            AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Referrer collection disallowed by counter.", false, 4, null);
            return false;
        }
        String monetizationNetwork = this.getMediationNetwork.getMonetizationNetwork("com.facebook.sdk.ApplicationId");
        String strA0 = monetizationNetwork != null ? StringsKt.a0(monetizationNetwork, "fb") : null;
        if (strA0 == null || strA0.length() == 0) {
            AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook app id Manifest metadata is not found.", false, 4, null);
            strA0 = null;
        }
        if (strA0 == null) {
            String mediationNetwork = this.getMediationNetwork.getMediationNetwork("facebook_application_id");
            strA0 = mediationNetwork != null ? StringsKt.a0(mediationNetwork, "fb") : null;
            if (strA0 == null || strA0.length() == 0) {
                AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook app id string resource is not found.", false, 4, null);
                strA0 = null;
            }
            if (strA0 == null) {
                String monetizationNetwork2 = this.getMediationNetwork.getMonetizationNetwork("com.appsflyer.FacebookApplicationId");
                strA0 = monetizationNetwork2 != null ? StringsKt.a0(monetizationNetwork2, "fb") : null;
                if (strA0 == null || strA0.length() == 0) {
                    AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "AF Facebook app id Manifest metadata is not found.", false, 4, null);
                    strA0 = null;
                }
                str = strA0 != null ? strA0 : null;
            }
        }
        this.toString = str;
        if (str == null) {
            AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Referrer collection disallowed by missing Facebook app id.", false, 4, null);
            return false;
        }
        if (AFAdRevenueData(context)) {
            return true;
        }
        AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Referrer collection disallowed by missing content providers.", false, 4, null);
        return false;
    }

    private static boolean getRevenue(Context context) {
        return context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.InstallReferrerProvider", 0) != null;
    }

    @Override // com.appsflyer.internal.AFj1qSDK
    public final void getCurrencyIso4217Code(final Context context) {
        context.getClass();
        if (!getMonetizationNetwork(context)) {
            this.component3.run();
        } else {
            this.getRevenue.execute(new Runnable() { // from class: com.appsflyer.internal.n0
                @Override // java.lang.Runnable
                public final void run() {
                    AFj1wSDK.getCurrencyIso4217Code(this.a, context);
                }
            });
        }
    }
}
