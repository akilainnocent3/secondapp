package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import defpackage.ay0;
import defpackage.l48;
import defpackage.m2g;
import defpackage.nlh;
import defpackage.qlh;
import defpackage.wi80;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class AFd1uSDK implements AFd1zSDK {
    private final AFc1gSDK getCurrencyIso4217Code;

    public AFd1uSDK(AFc1gSDK aFc1gSDK) {
        aFc1gSDK.getClass();
        this.getCurrencyIso4217Code = aFc1gSDK;
    }

    private final File getMonetizationNetwork() {
        Context context = this.getCurrencyIso4217Code.getRevenue;
        if (context == null) {
            return null;
        }
        File file = new File(context.getFilesDir(), "AFExceptionsCache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public final int AFAdRevenueData() {
        Iterator<T> it = getMediationNetwork().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((AFc1cSDK) it.next()).getMonetizationNetwork;
        }
        return i;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public final boolean getCurrencyIso4217Code(String... strArr) {
        boolean zJ;
        strArr.getClass();
        synchronized (this) {
            try {
                File monetizationNetwork = getMonetizationNetwork();
                zJ = true;
                if (monetizationNetwork != null) {
                    if (strArr.length == 0) {
                        AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "delete all exceptions", false, 4, null);
                        zJ = qlh.j(monetizationNetwork);
                    } else {
                        AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "delete all exceptions except for: ".concat(ay0.G(strArr, ", ", null, null, null, 62)), false, 4, null);
                        File[] fileArrListFiles = monetizationNetwork.listFiles();
                        if (fileArrListFiles != null) {
                            ArrayList arrayList = new ArrayList();
                            for (File file : fileArrListFiles) {
                                if (!ay0.s(file.getName(), strArr)) {
                                    arrayList.add(file);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(l48.r(arrayList, 10));
                            int size = arrayList.size();
                            int i = 0;
                            while (i < size) {
                                Object obj = arrayList.get(i);
                                i++;
                                File file2 = (File) obj;
                                file2.getClass();
                                arrayList2.add(Boolean.valueOf(qlh.j(file2)));
                            }
                            Set setE0 = CollectionsKt.E0(arrayList2);
                            if (setE0.isEmpty()) {
                                setE0 = wi80.b(Boolean.TRUE);
                            }
                            Set set = setE0;
                            if (set.size() != 1 || !((Boolean) CollectionsKt.S(set)).booleanValue()) {
                                zJ = false;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zJ;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public final List<AFc1cSDK> getMediationNetwork() {
        List<AFc1cSDK> listS;
        File[] fileArrListFiles;
        ArrayList arrayList;
        synchronized (this) {
            try {
                File monetizationNetwork = getMonetizationNetwork();
                listS = null;
                if (monetizationNetwork != null && (fileArrListFiles = monetizationNetwork.listFiles()) != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (File file : fileArrListFiles) {
                        try {
                            File[] fileArrListFiles2 = file.listFiles();
                            if (fileArrListFiles2 != null) {
                                arrayList = new ArrayList();
                                for (File file2 : fileArrListFiles2) {
                                    AFc1cSDK.Companion companion = AFc1cSDK.INSTANCE;
                                    file2.getClass();
                                    AFc1cSDK currencyIso4217Code = AFc1cSDK.Companion.getCurrencyIso4217Code(nlh.c(file2));
                                    if (currencyIso4217Code != null) {
                                        arrayList.add(currencyIso4217Code);
                                    }
                                }
                            } else {
                                arrayList = null;
                            }
                        } catch (Throwable th) {
                            AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "Could not get stored exceptions\n " + th.getMessage(), false, 4, null);
                        }
                        if (arrayList != null) {
                            arrayList2.add(arrayList);
                        }
                    }
                    listS = l48.s(arrayList2);
                }
                if (listS == null) {
                    listS = m2g.a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return listS;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public final String getRevenue(Throwable th, String str) {
        String str2;
        File file;
        th.getClass();
        str.getClass();
        synchronized (this) {
            File monetizationNetwork = getMonetizationNetwork();
            str2 = null;
            if (monetizationNetwork != null) {
                file = new File(monetizationNetwork, "6.17.3");
                if (!file.exists()) {
                    file.mkdirs();
                }
            } else {
                file = null;
            }
            if (file != null) {
                try {
                    AFc1cSDK aFc1cSDKAFAdRevenueData = AFd1pSDK.AFAdRevenueData(th, str);
                    String str3 = aFc1cSDKAFAdRevenueData.getCurrencyIso4217Code;
                    File file2 = new File(file, str3);
                    if (file2.exists()) {
                        AFc1cSDK.Companion companion = AFc1cSDK.INSTANCE;
                        AFc1cSDK currencyIso4217Code = AFc1cSDK.Companion.getCurrencyIso4217Code(nlh.c(file2));
                        if (currencyIso4217Code != null) {
                            currencyIso4217Code.getMonetizationNetwork++;
                            aFc1cSDKAFAdRevenueData = currencyIso4217Code;
                        }
                    }
                    nlh.e(file2, aFc1cSDKAFAdRevenueData.getMediationNetwork());
                    str2 = str3;
                } catch (Exception e) {
                    AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "Could not cache exception\n " + e.getMessage(), false, 4, null);
                }
            }
        }
        return str2;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public final void getMediationNetwork(int i, int i2) {
        File[] fileArrListFiles;
        synchronized (this) {
            try {
                File monetizationNetwork = getMonetizationNetwork();
                if (monetizationNetwork != null && (fileArrListFiles = monetizationNetwork.listFiles()) != null) {
                    ArrayList arrayList = new ArrayList();
                    int i3 = 0;
                    for (File file : fileArrListFiles) {
                        String name = file.getName();
                        name.getClass();
                        int mediationNetwork = AFk1zSDK.getMediationNetwork(name);
                        if (i > mediationNetwork || mediationNetwork > i2) {
                            arrayList.add(file);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(l48.r(arrayList, 10));
                    int size = arrayList.size();
                    while (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        File file2 = (File) obj;
                        file2.getClass();
                        arrayList2.add(Boolean.valueOf(qlh.j(file2)));
                    }
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public final boolean getCurrencyIso4217Code() {
        return getCurrencyIso4217Code(new String[0]);
    }
}
