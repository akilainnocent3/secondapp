package com.appsflyer.internal;

import android.content.Context;
import android.util.Base64;
import com.appsflyer.AFLogger;
import defpackage.ft7;
import defpackage.kpu;
import defpackage.p48;
import defpackage.pe4;
import defpackage.qlh;
import defpackage.tug;
import defpackage.vl8;
import defpackage.zkh;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1rSDK implements AFc1uSDK {
    private final AFc1sSDK AFAdRevenueData;
    private final AFc1oSDK getCurrencyIso4217Code;
    private final AFc1gSDK getMediationNetwork;
    private final Map<String, Integer> getRevenue;

    public AFc1rSDK(AFc1gSDK aFc1gSDK, AFc1oSDK aFc1oSDK) {
        aFc1gSDK.getClass();
        aFc1oSDK.getClass();
        this.getMediationNetwork = aFc1gSDK;
        this.getCurrencyIso4217Code = aFc1oSDK;
        this.AFAdRevenueData = new AFc1sSDK(kotlin.collections.b.k(new AFc1vSDK("ConversionsCache", kotlin.collections.a.c(AFe1mSDK.CONVERSION), 1), new AFc1vSDK("AttrCache", kotlin.collections.a.c(AFe1mSDK.ATTR), 1), new AFc1vSDK("OtherCache", kotlin.collections.b.k(AFe1mSDK.LAUNCH, AFe1mSDK.INAPP, AFe1mSDK.ADREVENUE, AFe1mSDK.ARS_VALIDATE, AFe1mSDK.PURCHASE_VALIDATE, AFe1mSDK.MANUAL_PURCHASE_VALIDATION, AFe1mSDK.SDK_SERVICES), 40)));
        this.getRevenue = kpu.g(new Pair("ConversionsCache", 0), new Pair("AttrCache", 0), new Pair("OtherCache", 0));
    }

    private final void AFAdRevenueData() {
        for (AFc1vSDK aFc1vSDK : this.AFAdRevenueData.getCurrencyIso4217Code) {
            String str = aFc1vSDK.getCurrencyIso4217Code;
            Context context = this.getMediationNetwork.getRevenue;
            context.getClass();
            File file = new File(new File(context.getFilesDir(), "AFRequestCache"), str);
            if (file.exists()) {
                Map<String, Integer> map = this.getRevenue;
                String str2 = aFc1vSDK.getCurrencyIso4217Code;
                File[] fileArrListFiles = file.listFiles();
                map.put(str2, Integer.valueOf(fileArrListFiles != null ? fileArrListFiles.length : 0));
            } else {
                file.mkdirs();
                this.getRevenue.put(aFc1vSDK.getCurrencyIso4217Code, 0);
            }
        }
    }

    @Override // com.appsflyer.internal.AFc1uSDK
    public final void getCurrencyIso4217Code() {
        try {
            if (this.getCurrencyIso4217Code.getMediationNetwork("AF_CACHE_VERSION", -1) == 1) {
                Context context = this.getMediationNetwork.getRevenue;
                context.getClass();
                if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
                    Context context2 = this.getMediationNetwork.getRevenue;
                    context2.getClass();
                    new File(context2.getFilesDir(), "AFRequestCache").mkdir();
                }
            } else {
                this.getCurrencyIso4217Code.getRevenue("AF_CACHE_VERSION", 1);
                Context context3 = this.getMediationNetwork.getRevenue;
                context3.getClass();
                if (new File(context3.getFilesDir(), "AFRequestCache").exists()) {
                    Context context4 = this.getMediationNetwork.getRevenue;
                    context4.getClass();
                    qlh.j(new File(context4.getFilesDir(), "AFRequestCache"));
                    Context context5 = this.getMediationNetwork.getRevenue;
                    context5.getClass();
                    new File(context5.getFilesDir(), "AFRequestCache").mkdir();
                }
            }
            AFAdRevenueData();
        } catch (Exception e) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not init cache", e, false, false, false, false, 120, null);
        }
    }

    @Override // com.appsflyer.internal.AFc1uSDK
    public final List<AFc1tSDK> getMediationNetwork() {
        int i;
        AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Get Cached Requests", false, 4, null);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            Context context = this.getMediationNetwork.getRevenue;
            context.getClass();
            if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
                Context context2 = this.getMediationNetwork.getRevenue;
                context2.getClass();
                new File(context2.getFilesDir(), "AFRequestCache").mkdir();
            }
            Iterator<T> it = this.AFAdRevenueData.getCurrencyIso4217Code.iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                String str = ((AFc1vSDK) it.next()).getCurrencyIso4217Code;
                Context context3 = this.getMediationNetwork.getRevenue;
                context3.getClass();
                File file = new File(new File(context3.getFilesDir(), "AFRequestCache"), str);
                if (!file.exists()) {
                    file.mkdirs();
                }
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles == null) {
                    fileArrListFiles = new File[0];
                }
                p48.x(arrayList2, fileArrListFiles);
            }
            int size = arrayList2.size();
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                File file2 = (File) obj;
                AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Found cached request: " + file2.getName(), false, 4, null);
                AFc1tSDK aFc1tSDKAFAdRevenueData = AFAdRevenueData(file2);
                if (aFc1tSDKAFAdRevenueData != null) {
                    arrayList.add(aFc1tSDKAFAdRevenueData);
                }
            }
        } catch (Exception e) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not get cached requests", e, false, false, false, false, 120, null);
        }
        AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, pe4.b(arrayList.size(), "Found ", " Cached Requests"), false, 4, null);
        return arrayList;
    }

    @Override // com.appsflyer.internal.AFc1uSDK
    public final String getMonetizationNetwork(AFc1tSDK aFc1tSDK) {
        Exception exc;
        File file;
        String str;
        aFc1tSDK.getClass();
        try {
            AFe1mSDK aFe1mSDK = aFc1tSDK.AFAdRevenueData;
            aFe1mSDK.getClass();
            Context context = this.getMediationNetwork.getRevenue;
            context.getClass();
            File file2 = new File(new File(context.getFilesDir(), "AFRequestCache"), getCurrencyIso4217Code(aFe1mSDK));
            if (!file2.exists()) {
                file2.mkdirs();
            }
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.CACHE;
            AFh1ySDK.i$default(aFLogger, aFg1cSDK, "Caching request with URL: " + aFc1tSDK.getCurrencyIso4217Code, false, 4, null);
            String strValueOf = String.valueOf(System.currentTimeMillis());
            file = new File(file2, strValueOf);
            try {
                file.createNewFile();
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file.getPath(), true), Charset.defaultCharset());
                try {
                    outputStreamWriter.write("version=");
                    outputStreamWriter.write(aFc1tSDK.getRevenue);
                    outputStreamWriter.write(10);
                    outputStreamWriter.write("url=");
                    outputStreamWriter.write(aFc1tSDK.getCurrencyIso4217Code);
                    outputStreamWriter.write(10);
                    outputStreamWriter.write("data=");
                    outputStreamWriter.write(Base64.encodeToString(aFc1tSDK.getMonetizationNetwork(), 2));
                    outputStreamWriter.write(10);
                    AFe1mSDK aFe1mSDK2 = aFc1tSDK.AFAdRevenueData;
                    outputStreamWriter.write("type=");
                    outputStreamWriter.write(aFe1mSDK2.name());
                    outputStreamWriter.write(10);
                    outputStreamWriter.flush();
                    Unit unit = Unit.a;
                    outputStreamWriter.close();
                    AFh1ySDK.i$default(aFLogger, aFg1cSDK, "Cache request: done, cacheKey: " + strValueOf, false, 4, null);
                    AFe1mSDK aFe1mSDK3 = aFc1tSDK.AFAdRevenueData;
                    aFe1mSDK3.getClass();
                    AFc1vSDK monetizationNetwork = getMonetizationNetwork(aFe1mSDK3);
                    Integer numValueOf = monetizationNetwork != null ? Integer.valueOf(monetizationNetwork.getMediationNetwork) : null;
                    if (numValueOf == null) {
                        return strValueOf;
                    }
                    int iIntValue = numValueOf.intValue();
                    Map<String, Integer> map = this.getRevenue;
                    AFc1vSDK monetizationNetwork2 = getMonetizationNetwork(aFe1mSDK3);
                    if (monetizationNetwork2 == null || (str = monetizationNetwork2.getCurrencyIso4217Code) == null) {
                        throw new UnsupportedOperationException("Cache do not support this type of events");
                    }
                    Integer num = map.get(str);
                    int iIntValue2 = num != null ? num.intValue() : 0;
                    if (iIntValue2 >= iIntValue) {
                        int i = (iIntValue2 + 1) - iIntValue;
                        AFh1ySDK.i$default(aFLogger, aFg1cSDK, "Cache overflown for type " + aFe1mSDK3 + ", removing " + i + " item(s)", false, 4, null);
                        Context context2 = this.getMediationNetwork.getRevenue;
                        context2.getClass();
                        File file3 = new File(new File(context2.getFilesDir(), "AFRequestCache"), getCurrencyIso4217Code(aFe1mSDK3));
                        if (!file3.exists()) {
                            file3.mkdirs();
                        }
                        Object[] objArrListFiles = file3.listFiles();
                        if (objArrListFiles != null) {
                            Comparator comparator = new Comparator() { // from class: com.appsflyer.internal.AFc1rSDK.1
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // java.util.Comparator
                                public final int compare(T t, T t2) {
                                    return vl8.b(((File) t).getName(), ((File) t2).getName());
                                }
                            };
                            if (objArrListFiles.length != 0) {
                                objArrListFiles = Arrays.copyOf(objArrListFiles, objArrListFiles.length);
                                if (objArrListFiles.length > 1) {
                                    Arrays.sort(objArrListFiles, comparator);
                                }
                            }
                            List listAsList = Arrays.asList(objArrListFiles);
                            listAsList.getClass();
                            List<File> listT0 = CollectionsKt.t0(listAsList, i);
                            if (listT0 != null) {
                                for (File file4 : listT0) {
                                    file4.delete();
                                    AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Cache entry " + file4.getName() + " removed", false, 4, null);
                                }
                            }
                        }
                    }
                    AFAdRevenueData();
                    return strValueOf;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ft7.a(outputStreamWriter, th);
                        throw th2;
                    }
                }
            } catch (Exception e) {
                exc = e;
                if (file != null) {
                    file.delete();
                }
                AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not cache request", exc, false, false, false, false, 120, null);
                return null;
            }
        } catch (Exception e2) {
            exc = e2;
            file = null;
        }
    }

    private static AFc1tSDK AFAdRevenueData(File file) {
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), Charset.defaultCharset());
            try {
                char[] cArr = new char[(int) file.length()];
                inputStreamReader.read(cArr);
                AFc1tSDK aFc1tSDK = new AFc1tSDK(cArr);
                aFc1tSDK.getMediationNetwork = file.getName();
                inputStreamReader.close();
                return aFc1tSDK;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    ft7.a(inputStreamReader, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            AFLogger.INSTANCE.e(AFg1cSDK.CACHE, "Error while loading request from cache", e, false, false, true, false);
            return null;
        }
    }

    private final String getCurrencyIso4217Code(AFe1mSDK aFe1mSDK) {
        String str;
        AFc1vSDK monetizationNetwork = getMonetizationNetwork(aFe1mSDK);
        if (monetizationNetwork != null && (str = monetizationNetwork.getCurrencyIso4217Code) != null) {
            return str;
        }
        zkh.a("Cache do not support this type of events");
        return null;
    }

    @Override // com.appsflyer.internal.AFc1uSDK
    public final boolean getCurrencyIso4217Code(String str) {
        if (str == null) {
            return false;
        }
        Context context = this.getMediationNetwork.getRevenue;
        context.getClass();
        if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
            Context context2 = this.getMediationNetwork.getRevenue;
            context2.getClass();
            new File(context2.getFilesDir(), "AFRequestCache").mkdir();
            return true;
        }
        AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, tug.a("Deleting ", str, " from cache"), false, 4, null);
        Iterator<T> it = this.AFAdRevenueData.getCurrencyIso4217Code.iterator();
        while (it.hasNext()) {
            String str2 = ((AFc1vSDK) it.next()).getCurrencyIso4217Code;
            Context context3 = this.getMediationNetwork.getRevenue;
            context3.getClass();
            File file = new File(new File(new File(context3.getFilesDir(), "AFRequestCache"), str2), str);
            if (file.exists()) {
                return getMonetizationNetwork(file);
            }
        }
        return true;
    }

    @Override // com.appsflyer.internal.AFc1uSDK
    public final void getMonetizationNetwork() {
        try {
            Context context = this.getMediationNetwork.getRevenue;
            context.getClass();
            if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
                Context context2 = this.getMediationNetwork.getRevenue;
                context2.getClass();
                new File(context2.getFilesDir(), "AFRequestCache").mkdir();
                return;
            }
            Iterator<T> it = this.AFAdRevenueData.getCurrencyIso4217Code.iterator();
            while (it.hasNext()) {
                String str = ((AFc1vSDK) it.next()).getCurrencyIso4217Code;
                Context context3 = this.getMediationNetwork.getRevenue;
                context3.getClass();
                File[] fileArrListFiles = new File(new File(context3.getFilesDir(), "AFRequestCache"), str).listFiles();
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        AFg1cSDK aFg1cSDK = AFg1cSDK.CACHE;
                        AFh1ySDK.i$default(aFLogger, aFg1cSDK, "ClearCache : Found cached request " + file.getName(), false, 4, null);
                        AFh1ySDK.i$default(aFLogger, aFg1cSDK, "Deleting " + file.getName() + " from cache", false, 4, null);
                        file.delete();
                    }
                }
            }
            Context context4 = this.getMediationNetwork.getRevenue;
            context4.getClass();
            qlh.j(new File(context4.getFilesDir(), "AFRequestCache"));
            AFAdRevenueData();
        } catch (Exception e) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not clearCache request", e, false, false, false, false, 120, null);
        }
    }

    private final AFc1vSDK getMonetizationNetwork(AFe1mSDK aFe1mSDK) {
        Object next;
        Iterator<T> it = this.AFAdRevenueData.getCurrencyIso4217Code.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((AFc1vSDK) next).AFAdRevenueData.contains(aFe1mSDK)) {
                return (AFc1vSDK) next;
            }
        }
        next = null;
        return (AFc1vSDK) next;
    }

    private final boolean getMonetizationNetwork(File file) {
        try {
            file.delete();
            AFAdRevenueData();
            return true;
        } catch (Exception e) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, tug.a("Could not delete ", file.getName(), " from cache"), e, false, false, false, false, 120, null);
            return false;
        }
    }
}
