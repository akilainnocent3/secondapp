package com.appsflyer.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import defpackage.ib5;
import defpackage.snq;
import java.lang.reflect.Constructor;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1dSDK implements AFc1bSDK {
    private static final int getCurrencyIso4217Code = 30000;
    private ScheduledExecutorService AFAdRevenueData;
    private AFc1uSDK AFInAppEventParameterName;
    private AFj1rSDK AFInAppEventType;
    private AFf1cSDK AFKeystoreWrapper;
    private AFe1ySDK AFLogger;
    private AFh1qSDK AFPurchaseDetails;
    private AFa1rSDK afDebugLog;
    private AFg1vSDK afErrorLog;
    private AFi1kSDK afInfoLog;
    private AFf1gSDK afLogForce;
    private AFi1jSDK afRDLog;
    private AFg1aSDK afVerboseLog;
    private AFe1qSDK afWarnLog;
    private PurchaseHandler areAllFieldsValid;
    private AFc1qSDK component1;
    private AFc1pSDK component2;
    private AFf1lSDK component3;
    private AFd1kSDK component4;
    private AFj1pSDK copy;
    private AFg1rSDK copydefault;
    private AFi1sSDK d;
    private AFj1eSDK e;
    private AFd1mSDK equals;
    private AFa1hSDK force;
    private AFc1eSDK getLevel;
    private ExecutorService getMediationNetwork;
    private ExecutorService getRevenue;
    private AFe1nSDK hashCode;
    private AFg1sSDK i;
    private AFd1ySDK registerClient;
    private AFh1tSDK toString;
    private AFi1lSDK unregisterClient;
    private AFa1bSDK v;
    private AFg1xSDK values;
    private AFb1aSDK w;
    private String afErrorLogForExcManagerOnly = null;
    public final AFc1gSDK getMonetizationNetwork = new AFc1gSDK();

    public static class AFa1ySDK implements ThreadFactory {
        private static final AtomicInteger getRevenue = new AtomicInteger();
        private final AtomicInteger getMediationNetwork = new AtomicInteger();

        public AFa1ySDK() {
            getRevenue.incrementAndGet();
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            int i = getRevenue.get();
            int iIncrementAndGet = this.getMediationNetwork.incrementAndGet();
            StringBuilder sb = new StringBuilder("queue-");
            sb.append(i);
            sb.append("-");
            sb.append(iIncrementAndGet);
            return new Thread(runnable, sb.toString());
        }
    }

    private String AFLoggerLogLevel() {
        String str = this.afErrorLogForExcManagerOnly;
        if (str != null) {
            return str;
        }
        String mediationNetwork = new com.appsflyer.internal.AFa1ySDK().getMediationNetwork();
        this.afErrorLogForExcManagerOnly = mediationNetwork;
        return mediationNetwork;
    }

    private synchronized AFg1xSDK AFPurchaseDetails() {
        AFg1xSDK aFg1xSDK;
        aFg1xSDK = this.values;
        if (aFg1xSDK == null) {
            aFg1xSDK = new AFg1xSDK(registerClient(), getCurrencyIso4217Code());
            this.values = aFg1xSDK;
        }
        return aFg1xSDK;
    }

    private synchronized AFj1eSDK AFPurchaseType() {
        AFj1eSDK aFj1eSDK;
        aFj1eSDK = this.e;
        if (aFj1eSDK == null) {
            aFj1eSDK = new AFj1eSDK(getCurrencyIso4217Code());
            this.e = aFj1eSDK;
        }
        return aFj1eSDK;
    }

    private synchronized AFd1kSDK afVerboseLog() {
        AFd1kSDK aFd1kSDK;
        aFd1kSDK = this.component4;
        if (aFd1kSDK == null) {
            aFd1kSDK = new AFd1kSDK(new AFd1fSDK(getCurrencyIso4217Code), getMediationNetwork());
            this.component4 = aFd1kSDK;
        }
        return aFd1kSDK;
    }

    private synchronized ScheduledExecutorService getLevel() {
        ScheduledExecutorService mediationNetwork;
        mediationNetwork = this.AFAdRevenueData;
        if (mediationNetwork == null) {
            mediationNetwork = AFc1jSDK.getMediationNetwork();
            this.AFAdRevenueData = mediationNetwork;
        }
        return mediationNetwork;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ SharedPreferences o_() {
        Context context = this.getMonetizationNetwork.getRevenue;
        if (context != null) {
            return AFa1uSDK.d_(context);
        }
        ib5.a("Context must be set via setContext method before calling this dependency.");
        return null;
    }

    private synchronized ExecutorService valueOf() {
        ExecutorService currencyIso4217Code;
        currencyIso4217Code = this.getMediationNetwork;
        if (currencyIso4217Code == null) {
            currencyIso4217Code = AFc1jSDK.getCurrencyIso4217Code();
            this.getMediationNetwork = currencyIso4217Code;
        }
        return currencyIso4217Code;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.appsflyer.internal.AFc1bSDK
    /* JADX INFO: renamed from: values, reason: merged with bridge method [inline-methods] */
    public synchronized AFd1ySDK afWarnLog() {
        AFd1ySDK aFd1ySDK;
        aFd1ySDK = this.registerClient;
        if (aFd1ySDK == null) {
            aFd1ySDK = new AFd1ySDK(this);
            this.registerClient = aFd1ySDK;
        }
        return aFd1ySDK;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final AFe1qSDK AFAdRevenueData() {
        AFe1qSDK aFe1qSDK = this.afWarnLog;
        if (aFe1qSDK != null) {
            return aFe1qSDK;
        }
        AFe1qSDK aFe1qSDK2 = new AFe1qSDK(component2(), registerClient(), getCurrencyIso4217Code(), getMediationNetwork(), component4(), AFKeystoreWrapper(), copydefault());
        this.afWarnLog = aFe1qSDK2;
        return aFe1qSDK2;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final synchronized AFe1ySDK AFInAppEventParameterName() {
        AFe1ySDK aFe1ySDK;
        aFe1ySDK = this.AFLogger;
        if (aFe1ySDK == null) {
            aFe1ySDK = new AFe1ySDK(getCurrencyIso4217Code(), component2());
            this.AFLogger = aFe1ySDK;
        }
        return aFe1ySDK;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final synchronized AFc1uSDK AFInAppEventType() {
        AFc1uSDK aFc1rSDK;
        aFc1rSDK = this.AFInAppEventParameterName;
        if (aFc1rSDK == null) {
            aFc1rSDK = new AFc1rSDK(registerClient(), component2());
            this.AFInAppEventParameterName = aFc1rSDK;
        }
        return aFc1rSDK;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final synchronized AFf1cSDK AFKeystoreWrapper() {
        AFf1cSDK aFf1cSDK;
        aFf1cSDK = this.AFKeystoreWrapper;
        if (aFf1cSDK == null) {
            aFf1cSDK = new AFf1cSDK(registerClient(), new AFf1eSDK());
            this.AFKeystoreWrapper = aFf1cSDK;
        }
        return aFf1cSDK;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final synchronized AFj1rSDK AFLogger() {
        AFj1rSDK aFj1rSDK;
        aFj1rSDK = this.AFInAppEventType;
        if (aFj1rSDK == null) {
            aFj1rSDK = new AFj1rSDK(this);
            this.AFInAppEventType = aFj1rSDK;
        }
        return aFj1rSDK;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final AFb1aSDK afDebugLog() {
        AFb1aSDK aFb1cSDK = this.w;
        if (aFb1cSDK == null) {
            ScheduledExecutorService level = getLevel();
            AFa1rSDK aFa1rSDKI = i();
            AFi1kSDK aFi1nSDK = this.afInfoLog;
            if (aFi1nSDK == null) {
                aFi1nSDK = new AFi1nSDK();
                this.afInfoLog = aFi1nSDK;
            }
            aFb1cSDK = new AFb1cSDK(level, aFa1rSDKI, aFi1nSDK);
            this.w = aFb1cSDK;
        }
        return aFb1cSDK;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final AFg1aSDK afErrorLog() {
        AFg1aSDK aFg1aSDK = this.afVerboseLog;
        if (aFg1aSDK != null) {
            return aFg1aSDK;
        }
        AFh1vSDK aFh1vSDK = new AFh1vSDK(this);
        this.afVerboseLog = aFh1vSDK;
        return aFh1vSDK;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final AFa1hSDK afErrorLogForExcManagerOnly() {
        AFa1hSDK aFa1hSDK = this.force;
        if (aFa1hSDK != null) {
            return aFa1hSDK;
        }
        AFa1lSDK aFa1lSDK = new AFa1lSDK(component2());
        this.force = aFa1lSDK;
        return aFa1lSDK;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final AFc1eSDK afInfoLog() {
        AFc1eSDK aFc1eSDK = this.getLevel;
        if (aFc1eSDK != null) {
            return aFc1eSDK;
        }
        AFc1eSDK aFc1eSDK2 = new AFc1eSDK();
        this.getLevel = aFc1eSDK2;
        return aFc1eSDK2;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final AFh1qSDK afLogForce() {
        if (AFh1sSDK.getMonetizationNetwork() && this.AFPurchaseDetails == null) {
            this.AFPurchaseDetails = new AFh1oSDK(getCurrencyIso4217Code(), AFLogger());
        }
        return this.AFPurchaseDetails;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final AFb1bSDK afRDLog() {
        AFc1eSDK aFc1eSDK = this.getLevel;
        if (aFc1eSDK == null) {
            aFc1eSDK = new AFc1eSDK();
            this.getLevel = aFc1eSDK;
        }
        return new AFb1hSDK(aFc1eSDK, registerClient(), AFKeystoreWrapper());
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final synchronized PurchaseHandler areAllFieldsValid() {
        PurchaseHandler purchaseHandler;
        purchaseHandler = this.areAllFieldsValid;
        if (purchaseHandler == null) {
            purchaseHandler = new PurchaseHandler(this);
            this.areAllFieldsValid = purchaseHandler;
        }
        return purchaseHandler;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final synchronized AFf1lSDK component1() {
        AFf1lSDK aFf1lSDK;
        aFf1lSDK = this.component3;
        if (aFf1lSDK == null) {
            AFf1iSDK aFf1iSDK = new AFf1iSDK(component2());
            AFf1lSDK aFf1lSDK2 = new AFf1lSDK(new AFf1qSDK(), getCurrencyIso4217Code(), AFKeystoreWrapper(), aFf1iSDK, new AFd1lSDK(afVerboseLog(), getCurrencyIso4217Code(), AppsFlyerProperties.getInstance(), AFInAppEventParameterName(), AFPurchaseType()), new AFf1hSDK(getCurrencyIso4217Code(), aFf1iSDK), copydefault());
            this.component3 = aFf1lSDK2;
            aFf1lSDK = aFf1lSDK2;
        }
        return aFf1lSDK;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final AFc1oSDK component2() {
        AFc1qSDK aFc1qSDK = this.component1;
        if (aFc1qSDK != null) {
            return aFc1qSDK;
        }
        AFc1qSDK aFc1qSDK2 = new AFc1qSDK(new AFc1hSDK(new snq(this, 3)));
        this.component1 = aFc1qSDK2;
        return aFc1qSDK2;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final synchronized AFh1tSDK component3() {
        AFh1tSDK aFh1tSDK;
        aFh1tSDK = this.toString;
        if (aFh1tSDK == null) {
            aFh1tSDK = new AFh1tSDK(component2(), getCurrencyIso4217Code());
            this.toString = aFh1tSDK;
        }
        return aFh1tSDK;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final AFg1rSDK component4() {
        AFg1rSDK aFg1rSDK = this.copydefault;
        if (aFg1rSDK == null) {
            String strAFLoggerLogLevel = AFLoggerLogLevel();
            Context context = this.getMonetizationNetwork.getRevenue;
            aFg1rSDK = null;
            if (context != null) {
                AFi1lSDK aFi1gSDK = this.unregisterClient;
                if (aFi1gSDK == null) {
                    aFi1gSDK = new AFi1gSDK();
                    this.unregisterClient = aFi1gSDK;
                }
                AFg1sSDK aFg1wSDK = this.i;
                if (aFg1wSDK == null) {
                    aFg1wSDK = new AFg1wSDK();
                    this.i = aFg1wSDK;
                }
                AFj1pSDK aFj1oSDK = this.copy;
                if (aFj1oSDK == null) {
                    Context context2 = this.getMonetizationNetwork.getRevenue;
                    if (context2 == null) {
                        ib5.a("Context must be set via setContext method before calling this dependency.");
                        return null;
                    }
                    aFj1oSDK = new AFj1oSDK(context2, valueOf());
                    this.copy = aFj1oSDK;
                }
                AFg1vSDK aFg1oSDK = this.afErrorLog;
                if (aFg1oSDK == null) {
                    aFg1oSDK = new AFg1oSDK();
                    this.afErrorLog = aFg1oSDK;
                }
                AFh1tSDK aFh1tSDKComponent3 = component3();
                AFi1lSDK aFi1lSDK = aFi1gSDK;
                AFg1sSDK aFg1sSDK = aFg1wSDK;
                AFj1pSDK aFj1pSDK = aFj1oSDK;
                AFg1vSDK aFg1vSDK = aFg1oSDK;
                AFc1oSDK aFc1oSDKComponent2 = component2();
                AFc1pSDK currencyIso4217Code = getCurrencyIso4217Code();
                AFi1sSDK aFi1sSDK = this.d;
                if (aFi1sSDK == null) {
                    Context context3 = this.getMonetizationNetwork.getRevenue;
                    if (context3 == null) {
                        ib5.a("Context must be set via setContext method before calling this dependency.");
                        return null;
                    }
                    aFi1sSDK = new AFi1sSDK(context3);
                    this.d = aFi1sSDK;
                }
                AFi1sSDK aFi1sSDK2 = aFi1sSDK;
                AFf1cSDK aFf1cSDKAFKeystoreWrapper = AFKeystoreWrapper();
                AFc1gSDK aFc1gSDKRegisterClient = registerClient();
                AFg1xSDK aFg1xSDKAFPurchaseDetails = AFPurchaseDetails();
                AFc1eSDK aFc1eSDK = this.getLevel;
                if (aFc1eSDK == null) {
                    aFc1eSDK = new AFc1eSDK();
                    this.getLevel = aFc1eSDK;
                }
                AFg1qSDK aFg1qSDK = new AFg1qSDK(strAFLoggerLogLevel, context, aFi1lSDK, aFg1sSDK, aFj1pSDK, aFg1vSDK, aFh1tSDKComponent3, aFc1oSDKComponent2, currencyIso4217Code, aFi1sSDK2, aFf1cSDKAFKeystoreWrapper, aFc1gSDKRegisterClient, aFg1xSDKAFPurchaseDetails, aFc1eSDK);
                this.copydefault = aFg1qSDK;
                return aFg1qSDK;
            }
            ib5.a("Context must be set via setContext method before calling this dependency.");
        }
        return aFg1rSDK;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final AFj1pSDK copy() {
        AFj1pSDK aFj1pSDK = this.copy;
        if (aFj1pSDK != null) {
            return aFj1pSDK;
        }
        Context context = this.getMonetizationNetwork.getRevenue;
        if (context == null) {
            ib5.a("Context must be set via setContext method before calling this dependency.");
            return null;
        }
        AFj1oSDK aFj1oSDK = new AFj1oSDK(context, valueOf());
        this.copy = aFj1oSDK;
        return aFj1oSDK;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final synchronized AFe1nSDK copydefault() {
        AFe1nSDK aFe1nSDK;
        aFe1nSDK = this.hashCode;
        if (aFe1nSDK == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 6, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>() { // from class: com.appsflyer.internal.AFc1dSDK.1
                /* JADX INFO: Access modifiers changed from: private */
                @Override // java.util.concurrent.LinkedBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
                /* JADX INFO: renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
                public boolean offer(Runnable runnable) {
                    if (isEmpty()) {
                        return super.offer(runnable);
                    }
                    return false;
                }
            }, new AFa1ySDK());
            threadPoolExecutor.setRejectedExecutionHandler(new n());
            aFe1nSDK = new AFe1nSDK(threadPoolExecutor);
            this.hashCode = aFe1nSDK;
        }
        return aFe1nSDK;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final AFi1kSDK d() {
        AFi1kSDK aFi1kSDK = this.afInfoLog;
        if (aFi1kSDK != null) {
            return aFi1kSDK;
        }
        AFi1nSDK aFi1nSDK = new AFi1nSDK();
        this.afInfoLog = aFi1nSDK;
        return aFi1nSDK;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final AFi1lSDK e() {
        AFi1lSDK aFi1lSDK = this.unregisterClient;
        if (aFi1lSDK != null) {
            return aFi1lSDK;
        }
        AFi1gSDK aFi1gSDK = new AFi1gSDK();
        this.unregisterClient = aFi1gSDK;
        return aFi1gSDK;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final synchronized AFd1mSDK equals() {
        AFd1mSDK aFd1nSDK;
        aFd1nSDK = this.equals;
        if (aFd1nSDK == null) {
            aFd1nSDK = new AFd1nSDK(this);
            this.equals = aFd1nSDK;
        }
        return aFd1nSDK;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final AFf1gSDK force() {
        AFf1gSDK aFf1gSDK = this.afLogForce;
        if (aFf1gSDK != null) {
            return aFf1gSDK;
        }
        Context context = this.getMonetizationNetwork.getRevenue;
        if (context == null) {
            ib5.a("Context must be set via setContext method before calling this dependency.");
            return null;
        }
        AFg1zSDK aFg1zSDK = new AFg1zSDK(context, AppsFlyerProperties.getInstance());
        AFc1eSDK aFc1eSDK = this.getLevel;
        if (aFc1eSDK == null) {
            aFc1eSDK = new AFc1eSDK();
            this.getLevel = aFc1eSDK;
        }
        AFf1fSDK aFf1fSDK = new AFf1fSDK(aFg1zSDK, aFc1eSDK, AppsFlyerProperties.getInstance());
        this.afLogForce = aFf1fSDK;
        return aFf1fSDK;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final synchronized AFc1pSDK getCurrencyIso4217Code() {
        AFc1pSDK aFc1pSDK;
        try {
            aFc1pSDK = this.component2;
            if (aFc1pSDK == null) {
                AFc1gSDK aFc1gSDKRegisterClient = registerClient();
                AFc1oSDK aFc1oSDKComponent2 = component2();
                AFc1eSDK aFc1eSDK = this.getLevel;
                if (aFc1eSDK == null) {
                    aFc1eSDK = new AFc1eSDK();
                    this.getLevel = aFc1eSDK;
                }
                aFc1pSDK = new AFc1pSDK(aFc1gSDKRegisterClient, aFc1oSDKComponent2, aFc1eSDK, getMediationNetwork());
                this.component2 = aFc1pSDK;
            }
        } catch (Throwable th) {
            throw th;
        }
        return aFc1pSDK;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final synchronized ExecutorService getMediationNetwork() {
        ExecutorService executorServiceAFAdRevenueData;
        executorServiceAFAdRevenueData = this.getRevenue;
        if (executorServiceAFAdRevenueData == null) {
            executorServiceAFAdRevenueData = AFc1jSDK.AFAdRevenueData();
            this.getRevenue = executorServiceAFAdRevenueData;
        }
        return executorServiceAFAdRevenueData;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final synchronized ScheduledExecutorService getMonetizationNetwork() {
        ScheduledExecutorService monetizationNetwork;
        monetizationNetwork = this.AFAdRevenueData;
        if (monetizationNetwork == null) {
            monetizationNetwork = AFc1jSDK.getMonetizationNetwork();
            this.AFAdRevenueData = monetizationNetwork;
        }
        return monetizationNetwork;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final AFd1lSDK getRevenue() {
        return new AFd1lSDK(afVerboseLog(), getCurrencyIso4217Code(), AppsFlyerProperties.getInstance(), AFInAppEventParameterName(), AFPurchaseType());
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final synchronized AFa1rSDK i() {
        AFa1rSDK aFa1rSDK;
        aFa1rSDK = this.afDebugLog;
        if (aFa1rSDK == null) {
            aFa1rSDK = new AFa1rSDK(this);
            this.afDebugLog = aFa1rSDK;
        }
        return aFa1rSDK;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final synchronized AFc1gSDK registerClient() {
        return this.getMonetizationNetwork;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final synchronized AFa1bSDK unregisterClient() {
        AFa1bSDK aFa1aSDK;
        aFa1aSDK = this.v;
        if (aFa1aSDK == null) {
            aFa1aSDK = new AFa1aSDK(registerClient());
            this.v = aFa1aSDK;
        }
        return aFa1aSDK;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final AFi1jSDK v() {
        try {
            if (this.afRDLog == null) {
                try {
                    Object[] objArr = {getCurrencyIso4217Code(), registerClient(), AFKeystoreWrapper()};
                    Map map = AFi1hSDK.d;
                    Object declaredConstructor = map.get(-737518627);
                    if (declaredConstructor == null) {
                        declaredConstructor = ((Class) AFi1hSDK.getCurrencyIso4217Code((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 36 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), TextUtils.getCapsMode("", 0, 0))).getDeclaredConstructor(AFc1pSDK.class, AFc1gSDK.class, AFf1cSDK.class);
                        map.put(-737518627, declaredConstructor);
                    }
                    this.afRDLog = (AFi1jSDK) ((Constructor) declaredConstructor).newInstance(objArr);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFg1cSDK.PLAY_INTEGRITY_API, th2.getMessage() != null ? th2.getMessage() : "", th2, false, false);
        }
        return this.afRDLog;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final AFi1sSDK w() {
        AFi1sSDK aFi1sSDK = this.d;
        if (aFi1sSDK != null) {
            return aFi1sSDK;
        }
        Context context = this.getMonetizationNetwork.getRevenue;
        if (context == null) {
            ib5.a("Context must be set via setContext method before calling this dependency.");
            return null;
        }
        AFi1sSDK aFi1sSDK2 = new AFi1sSDK(context);
        this.d = aFi1sSDK2;
        return aFi1sSDK2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void getCurrencyIso4217Code(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        try {
            threadPoolExecutor.getQueue().put(runnable);
        } catch (InterruptedException e) {
            AFLogger.afErrorLogForExcManagerOnly("could not create executor for queue", e);
            Thread.currentThread().interrupt();
        }
    }
}
