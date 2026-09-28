package com.appsflyer.internal;

import android.os.Build;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.twilio.voice.PublisherMetadata;
import defpackage.f380;
import defpackage.hwr;
import defpackage.kpu;
import defpackage.qlr;
import defpackage.ttr;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.text.Charsets;
import okhttp3.internal.http.HttpStatusCodesKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFd1ySDK implements AFd1xSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long copy = -1417917781629150226L;
    private static int copydefault = 1;
    private static int equals;
    private final ttr AFAdRevenueData;
    private final ttr areAllFieldsValid;
    private final String component1;
    private final ttr component2;
    private final ttr component3;
    private AFd1xSDK.AFa1ySDK component4;
    private final ttr getCurrencyIso4217Code;
    private final ttr getMediationNetwork;
    private final ttr getMonetizationNetwork;
    private AFc1bSDK getRevenue;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1ySDK$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFf1lSDK;", "getCurrencyIso4217Code", "()Lcom/appsflyer/internal/AFf1lSDK;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 extends qlr implements Function0<AFf1lSDK> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
        public final AFf1lSDK invoke() {
            AFf1lSDK aFf1lSDKComponent1 = AFd1ySDK.getMonetizationNetwork(AFd1ySDK.this).component1();
            aFf1lSDKComponent1.getClass();
            return aFf1lSDKComponent1;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1ySDK$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/util/concurrent/ExecutorService;", "getCurrencyIso4217Code", "()Ljava/util/concurrent/ExecutorService;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass2 extends qlr implements Function0<ExecutorService> {
        public AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
        public final ExecutorService invoke() {
            ExecutorService mediationNetwork = AFd1ySDK.getMonetizationNetwork(AFd1ySDK.this).getMediationNetwork();
            mediationNetwork.getClass();
            return mediationNetwork;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1ySDK$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFc1oSDK;", "getMonetizationNetwork", "()Lcom/appsflyer/internal/AFc1oSDK;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass3 extends qlr implements Function0<AFc1oSDK> {
        public AnonymousClass3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: getMonetizationNetwork, reason: merged with bridge method [inline-methods] */
        public final AFc1oSDK invoke() {
            AFc1oSDK aFc1oSDKComponent2 = AFd1ySDK.getMonetizationNetwork(AFd1ySDK.this).component2();
            aFc1oSDKComponent2.getClass();
            return aFc1oSDKComponent2;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1ySDK$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFd1uSDK;", "getMediationNetwork", "()Lcom/appsflyer/internal/AFd1uSDK;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass4 extends qlr implements Function0<AFd1uSDK> {
        public AnonymousClass4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
        public final AFd1uSDK invoke() {
            AFc1gSDK aFc1gSDKRegisterClient = AFd1ySDK.getMonetizationNetwork(AFd1ySDK.this).registerClient();
            aFc1gSDKRegisterClient.getClass();
            return new AFd1uSDK(aFc1gSDKRegisterClient);
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1ySDK$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFc1pSDK;", "getMonetizationNetwork", "()Lcom/appsflyer/internal/AFc1pSDK;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass5 extends qlr implements Function0<AFc1pSDK> {
        public AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: getMonetizationNetwork, reason: merged with bridge method [inline-methods] */
        public final AFc1pSDK invoke() {
            AFc1pSDK currencyIso4217Code = AFd1ySDK.getMonetizationNetwork(AFd1ySDK.this).getCurrencyIso4217Code();
            currencyIso4217Code.getClass();
            return currencyIso4217Code;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1ySDK$6, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFd1vSDK;", "AFAdRevenueData", "()Lcom/appsflyer/internal/AFd1vSDK;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass6 extends qlr implements Function0<AFd1vSDK> {
        public AnonymousClass6() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
        public final AFd1vSDK invoke() {
            return new AFd1vSDK(AFd1ySDK.this.AFAdRevenueData());
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1ySDK$9, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFf1cSDK;", "AFAdRevenueData", "()Lcom/appsflyer/internal/AFf1cSDK;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass9 extends qlr implements Function0<AFf1cSDK> {
        public AnonymousClass9() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
        public final AFf1cSDK invoke() {
            AFf1cSDK aFf1cSDKAFKeystoreWrapper = AFd1ySDK.getMonetizationNetwork(AFd1ySDK.this).AFKeystoreWrapper();
            aFf1cSDKAFKeystoreWrapper.getClass();
            return aFf1cSDKAFKeystoreWrapper;
        }
    }

    public AFd1ySDK(AFc1bSDK aFc1bSDK) {
        aFc1bSDK.getClass();
        this.getRevenue = aFc1bSDK;
        this.getCurrencyIso4217Code = hwr.b(new AnonymousClass1());
        this.getMediationNetwork = hwr.b(new AnonymousClass5());
        this.getMonetizationNetwork = hwr.b(new AnonymousClass3());
        this.AFAdRevenueData = hwr.b(new AnonymousClass9());
        this.component2 = hwr.b(new AnonymousClass2());
        this.component1 = "6.17.3";
        this.areAllFieldsValid = hwr.b(new AnonymousClass4());
        this.component3 = hwr.b(new AnonymousClass6());
    }

    private final boolean AFAdRevenueData(AFh1aSDK aFh1aSDK) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long currencyIso4217Code = component3().getCurrencyIso4217Code("af_send_exc_to_server_window", -1L);
        if (aFh1aSDK.getMediationNetwork >= jCurrentTimeMillis / 1000 && currencyIso4217Code != -1) {
            int i = copydefault + 51;
            equals = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
            if (currencyIso4217Code >= jCurrentTimeMillis) {
                int mediationNetwork = component3().getMediationNetwork("af_send_exc_min", -1);
                if (mediationNetwork != -1 && AFAdRevenueData().AFAdRevenueData() >= mediationNetwork) {
                    return getRevenue(aFh1aSDK);
                }
                int i2 = copydefault + HttpStatusCodesKt.HTTP_EARLY_HINTS;
                equals = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 15 / 0;
                }
                return false;
            }
        }
        return false;
    }

    private static void a(String str, int i, Object[] objArr) {
        Object charArray = str;
        if (str != null) {
            $11 = ($10 + 37) % 128;
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        AFk1lSDK aFk1lSDK = new AFk1lSDK();
        aFk1lSDK.getMonetizationNetwork = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        aFk1lSDK.getRevenue = 0;
        while (true) {
            int i2 = aFk1lSDK.getRevenue;
            if (i2 >= cArr.length) {
                break;
            }
            $11 = ($10 + 29) % 128;
            jArr[i2] = (((long) cArr[i2]) ^ (((long) i2) * ((long) aFk1lSDK.getMonetizationNetwork))) ^ (copy ^ (-2523060390901184290L));
            aFk1lSDK.getRevenue = i2 + 1;
        }
        char[] cArr2 = new char[length];
        aFk1lSDK.getRevenue = 0;
        while (true) {
            int i3 = aFk1lSDK.getRevenue;
            if (i3 >= cArr.length) {
                break;
            }
            $11 = ($10 + 77) % 128;
            cArr2[i3] = (char) jArr[i3];
            aFk1lSDK.getRevenue = i3 + 1;
        }
        String str2 = new String(cArr2);
        int i4 = $11 + 87;
        $10 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        objArr[0] = str2;
    }

    private final AFh1aSDK areAllFieldsValid() {
        AFi1zSDK aFi1zSDK;
        int i = copydefault + 53;
        equals = i % 128;
        int i2 = i % 2;
        AFf1lSDK mediationNetwork = getMediationNetwork();
        if (i2 != 0) {
            AFi1wSDK aFi1wSDK = mediationNetwork.AFAdRevenueData.AFAdRevenueData;
            throw null;
        }
        AFi1wSDK aFi1wSDK2 = mediationNetwork.AFAdRevenueData.AFAdRevenueData;
        if (aFi1wSDK2 != null && (aFi1zSDK = aFi1wSDK2.getMonetizationNetwork) != null) {
            equals = (copydefault + 37) % 128;
            return aFi1zSDK.getCurrencyIso4217Code;
        }
        int i3 = copydefault + 79;
        equals = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private final AFf1cSDK component1() {
        equals = (copydefault + 17) % 128;
        AFf1cSDK aFf1cSDK = (AFf1cSDK) this.AFAdRevenueData.getValue();
        int i = copydefault + 113;
        equals = i % 128;
        if (i % 2 == 0) {
            return aFf1cSDK;
        }
        throw null;
    }

    private AFd1wSDK component2() {
        int i = equals + 29;
        copydefault = i % 128;
        int i2 = i % 2;
        AFd1wSDK aFd1wSDK = (AFd1wSDK) this.component3.getValue();
        if (i2 != 0) {
            return aFd1wSDK;
        }
        throw null;
    }

    private final AFc1oSDK component3() {
        equals = (copydefault + 97) % 128;
        AFc1oSDK aFc1oSDK = (AFc1oSDK) this.getMonetizationNetwork.getValue();
        copydefault = (equals + 29) % 128;
        return aFc1oSDK;
    }

    private final ExecutorService component4() {
        return (ExecutorService) getRevenue(new Object[]{this}, -1221964614, 1221964616, System.identityHashCode(this));
    }

    private final void copy() {
        String mediationNetwork;
        int i = equals + HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS;
        copydefault = i % 128;
        if (i % 2 == 0) {
            areAllFieldsValid();
            throw null;
        }
        AFh1aSDK aFh1aSDKAreAllFieldsValid = areAllFieldsValid();
        if (aFh1aSDKAreAllFieldsValid != null) {
            if (!AFAdRevenueData(aFh1aSDKAreAllFieldsValid)) {
                AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "skipping", false, 4, null);
                return;
            }
            int i2 = equals + 23;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                mediationNetwork = component1().getMediationNetwork();
                int i3 = 66 / 0;
                if (mediationNetwork == null) {
                    return;
                }
            } else {
                mediationNetwork = component1().getMediationNetwork();
                if (mediationNetwork == null) {
                    return;
                }
            }
            String string = new JSONObject((Map) getRevenue(new Object[]{getCurrencyIso4217Code(aFh1aSDKAreAllFieldsValid), AFAdRevenueData().getMediationNetwork()}, -1519321264, 1519321264, (int) System.currentTimeMillis())).toString();
            string.getClass();
            getRevenue(new Object[]{this, string, mediationNetwork}, -1047452469, 1047452473, System.identityHashCode(this));
        }
    }

    private final synchronized void copydefault() {
        boolean monetizationNetwork;
        try {
            AFh1aSDK aFh1aSDKAreAllFieldsValid = areAllFieldsValid();
            if (aFh1aSDKAreAllFieldsValid != null) {
                if (aFh1aSDKAreAllFieldsValid.getRevenue == -1) {
                    equals = (copydefault + 109) % 128;
                    component3().getCurrencyIso4217Code("af_send_exc_to_server_window");
                } else if (component3().getCurrencyIso4217Code("af_send_exc_to_server_window", -1L) == -1) {
                    getMediationNetwork(aFh1aSDKAreAllFieldsValid);
                }
                monetizationNetwork = getMonetizationNetwork(aFh1aSDKAreAllFieldsValid);
            } else {
                monetizationNetwork = false;
            }
            AFd1xSDK.AFa1ySDK aFa1ySDK = this.component4;
            if (aFa1ySDK != null) {
                int i = equals + 67;
                copydefault = i % 128;
                if (i % 2 != 0) {
                    aFa1ySDK.onConfigurationChanged(monetizationNetwork);
                } else {
                    aFa1ySDK.onConfigurationChanged(monetizationNetwork);
                    throw null;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a3 A[Catch: all -> 0x0017, TRY_ENTER, TryCatch #2 {all -> 0x0017, blocks: (B:3:0x0001, B:5:0x000e, B:7:0x0014, B:11:0x001c, B:13:0x0027, B:16:0x0045, B:18:0x004c, B:20:0x0053, B:22:0x0062, B:24:0x0066, B:26:0x0073, B:28:0x007e, B:33:0x008f, B:41:0x00a3, B:43:0x00a9, B:45:0x00af, B:47:0x00bb, B:49:0x00bf, B:51:0x00c5, B:53:0x00d3, B:55:0x00df, B:57:0x00e3, B:59:0x00e9, B:61:0x00ef, B:63:0x00f2, B:65:0x00f8, B:67:0x00fe, B:69:0x0102, B:71:0x0108, B:73:0x010e, B:75:0x0112, B:77:0x011d, B:83:0x0127, B:89:0x0136, B:96:0x0199, B:98:0x019d, B:100:0x01a3, B:101:0x01a7, B:91:0x0146, B:93:0x0160, B:94:0x0178, B:86:0x012e, B:82:0x0126, B:31:0x0087, B:95:0x0189, B:106:0x01ae, B:109:0x01b3, B:107:0x01b1, B:37:0x009d, B:79:0x0123), top: B:116:0x0001, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00a9 A[Catch: all -> 0x0017, TryCatch #2 {all -> 0x0017, blocks: (B:3:0x0001, B:5:0x000e, B:7:0x0014, B:11:0x001c, B:13:0x0027, B:16:0x0045, B:18:0x004c, B:20:0x0053, B:22:0x0062, B:24:0x0066, B:26:0x0073, B:28:0x007e, B:33:0x008f, B:41:0x00a3, B:43:0x00a9, B:45:0x00af, B:47:0x00bb, B:49:0x00bf, B:51:0x00c5, B:53:0x00d3, B:55:0x00df, B:57:0x00e3, B:59:0x00e9, B:61:0x00ef, B:63:0x00f2, B:65:0x00f8, B:67:0x00fe, B:69:0x0102, B:71:0x0108, B:73:0x010e, B:75:0x0112, B:77:0x011d, B:83:0x0127, B:89:0x0136, B:96:0x0199, B:98:0x019d, B:100:0x01a3, B:101:0x01a7, B:91:0x0146, B:93:0x0160, B:94:0x0178, B:86:0x012e, B:82:0x0126, B:31:0x0087, B:95:0x0189, B:106:0x01ae, B:109:0x01b3, B:107:0x01b1, B:37:0x009d, B:79:0x0123), top: B:116:0x0001, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:90:0x0144 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0146 A[Catch: all -> 0x0017, TryCatch #2 {all -> 0x0017, blocks: (B:3:0x0001, B:5:0x000e, B:7:0x0014, B:11:0x001c, B:13:0x0027, B:16:0x0045, B:18:0x004c, B:20:0x0053, B:22:0x0062, B:24:0x0066, B:26:0x0073, B:28:0x007e, B:33:0x008f, B:41:0x00a3, B:43:0x00a9, B:45:0x00af, B:47:0x00bb, B:49:0x00bf, B:51:0x00c5, B:53:0x00d3, B:55:0x00df, B:57:0x00e3, B:59:0x00e9, B:61:0x00ef, B:63:0x00f2, B:65:0x00f8, B:67:0x00fe, B:69:0x0102, B:71:0x0108, B:73:0x010e, B:75:0x0112, B:77:0x011d, B:83:0x0127, B:89:0x0136, B:96:0x0199, B:98:0x019d, B:100:0x01a3, B:101:0x01a7, B:91:0x0146, B:93:0x0160, B:94:0x0178, B:86:0x012e, B:82:0x0126, B:31:0x0087, B:95:0x0189, B:106:0x01ae, B:109:0x01b3, B:107:0x01b1, B:37:0x009d, B:79:0x0123), top: B:116:0x0001, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x015e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x0160 A[Catch: all -> 0x0017, TryCatch #2 {all -> 0x0017, blocks: (B:3:0x0001, B:5:0x000e, B:7:0x0014, B:11:0x001c, B:13:0x0027, B:16:0x0045, B:18:0x004c, B:20:0x0053, B:22:0x0062, B:24:0x0066, B:26:0x0073, B:28:0x007e, B:33:0x008f, B:41:0x00a3, B:43:0x00a9, B:45:0x00af, B:47:0x00bb, B:49:0x00bf, B:51:0x00c5, B:53:0x00d3, B:55:0x00df, B:57:0x00e3, B:59:0x00e9, B:61:0x00ef, B:63:0x00f2, B:65:0x00f8, B:67:0x00fe, B:69:0x0102, B:71:0x0108, B:73:0x010e, B:75:0x0112, B:77:0x011d, B:83:0x0127, B:89:0x0136, B:96:0x0199, B:98:0x019d, B:100:0x01a3, B:101:0x01a7, B:91:0x0146, B:93:0x0160, B:94:0x0178, B:86:0x012e, B:82:0x0126, B:31:0x0087, B:95:0x0189, B:106:0x01ae, B:109:0x01b3, B:107:0x01b1, B:37:0x009d, B:79:0x0123), top: B:116:0x0001, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0178 A[Catch: all -> 0x0017, TryCatch #2 {all -> 0x0017, blocks: (B:3:0x0001, B:5:0x000e, B:7:0x0014, B:11:0x001c, B:13:0x0027, B:16:0x0045, B:18:0x004c, B:20:0x0053, B:22:0x0062, B:24:0x0066, B:26:0x0073, B:28:0x007e, B:33:0x008f, B:41:0x00a3, B:43:0x00a9, B:45:0x00af, B:47:0x00bb, B:49:0x00bf, B:51:0x00c5, B:53:0x00d3, B:55:0x00df, B:57:0x00e3, B:59:0x00e9, B:61:0x00ef, B:63:0x00f2, B:65:0x00f8, B:67:0x00fe, B:69:0x0102, B:71:0x0108, B:73:0x010e, B:75:0x0112, B:77:0x011d, B:83:0x0127, B:89:0x0136, B:96:0x0199, B:98:0x019d, B:100:0x01a3, B:101:0x01a7, B:91:0x0146, B:93:0x0160, B:94:0x0178, B:86:0x012e, B:82:0x0126, B:31:0x0087, B:95:0x0189, B:106:0x01ae, B:109:0x01b3, B:107:0x01b1, B:37:0x009d, B:79:0x0123), top: B:116:0x0001, inners: #0, #1 }] */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008d, code lost:
    
        if (r4 != null) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized void equals() {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1ySDK.equals():void");
    }

    private final Map<String, String> getCurrencyIso4217Code(AFh1aSDK aFh1aSDK) {
        Object[] objArr = new Object[1];
        a("퍒䪹\ue0a7ắ뒸", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 39419, objArr);
        Map<String, String> mapF = kpu.f(new Pair(((String) objArr[0]).intern(), Build.BRAND), new Pair("model", Build.MODEL), new Pair(PublisherMetadata.APP_ID, getMonetizationNetwork().getRevenue.getRevenue.getPackageName()), new Pair("p_ex", new AFa1ySDK().getMediationNetwork()), new Pair("api", String.valueOf(Build.VERSION.SDK_INT)), new Pair("sdk", this.component1), new Pair("uid", AFb1jSDK.getRevenue(getMonetizationNetwork().getMonetizationNetwork)), new Pair("exc_config", aFh1aSDK.getMonetizationNetwork()));
        copydefault = (equals + 109) % 128;
        return mapF;
    }

    private final void getMediationNetwork(AFh1aSDK aFh1aSDK) {
        int i;
        AFc1oSDK aFc1oSDKComponent3;
        int i2 = equals + 93;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        TimeUnit timeUnit = TimeUnit.DAYS;
        if (i3 == 0) {
            i = aFh1aSDK.getCurrencyIso4217Code;
            long jCurrentTimeMillis = System.currentTimeMillis() ^ timeUnit.toMillis(aFh1aSDK.getRevenue);
            aFc1oSDKComponent3 = component3();
            aFc1oSDKComponent3.getRevenue("af_send_exc_to_server_window", jCurrentTimeMillis);
        } else {
            i = aFh1aSDK.getCurrencyIso4217Code;
            long millis = timeUnit.toMillis(aFh1aSDK.getRevenue) + System.currentTimeMillis();
            aFc1oSDKComponent3 = component3();
            aFc1oSDKComponent3.getRevenue("af_send_exc_to_server_window", millis);
        }
        aFc1oSDKComponent3.getRevenue("af_send_exc_min", i);
    }

    private final boolean getMonetizationNetwork(AFh1aSDK aFh1aSDK) {
        int i = copydefault + 105;
        equals = i % 128;
        if (i % 2 != 0) {
            System.currentTimeMillis();
            component3().getCurrencyIso4217Code("af_send_exc_to_server_window", -1L);
            long j = aFh1aSDK.getMediationNetwork;
            throw null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long currencyIso4217Code = component3().getCurrencyIso4217Code("af_send_exc_to_server_window", -1L);
        if (aFh1aSDK.getMediationNetwork >= jCurrentTimeMillis / 1000) {
            if (currencyIso4217Code == -1 || currencyIso4217Code < jCurrentTimeMillis) {
                return false;
            }
            return getRevenue(aFh1aSDK);
        }
        int i2 = equals + 123;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public static Object getRevenue(Object[] objArr, int i, int i2, int i3) {
        int i4 = (i2 * (-929)) + (i * (-464));
        int i5 = ~i;
        int i6 = i2 | i3;
        int i7 = ((i5 | i6) * 465) + ((i2 | (~(i3 | i5))) * 930) + (((~i6) | i5) * (-465)) + i4;
        if (i7 == 1) {
            final AFd1ySDK aFd1ySDK = (AFd1ySDK) objArr[0];
            AFd1xSDK.AFa1ySDK aFa1ySDK = (AFd1xSDK.AFa1ySDK) objArr[1];
            copydefault = (equals + 57) % 128;
            aFd1ySDK.component4 = aFa1ySDK;
            ((ExecutorService) getRevenue(new Object[]{aFd1ySDK}, -1221964614, 1221964616, System.identityHashCode(aFd1ySDK))).execute(new Runnable() { // from class: com.appsflyer.internal.s
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1ySDK.getMediationNetwork(this.a);
                }
            });
            copydefault = (equals + 61) % 128;
            return null;
        }
        if (i7 == 2) {
            return getMediationNetwork(objArr);
        }
        if (i7 == 3) {
            return AFAdRevenueData(objArr);
        }
        if (i7 == 4) {
            return getCurrencyIso4217Code(objArr);
        }
        Map map = (Map) objArr[0];
        List list = (List) objArr[1];
        equals = (copydefault + 47) % 128;
        Map mapF = kpu.f(new Pair("deviceInfo", map), new Pair("excs", AFd1tSDK.AFAdRevenueData(list)));
        copydefault = (equals + 11) % 128;
        return mapF;
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        AFd1ySDK aFd1ySDK = (AFd1ySDK) objArr[0];
        equals = (copydefault + 39) % 128;
        ExecutorService executorService = (ExecutorService) aFd1ySDK.component2.getValue();
        int i = copydefault + 45;
        equals = i % 128;
        if (i % 2 == 0) {
            return executorService;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMediationNetwork(AFd1ySDK aFd1ySDK, Throwable th, String str) {
        copydefault = (equals + 67) % 128;
        aFd1ySDK.getClass();
        th.getClass();
        str.getClass();
        AFh1aSDK aFh1aSDKAreAllFieldsValid = aFd1ySDK.areAllFieldsValid();
        if (aFh1aSDKAreAllFieldsValid == null || !aFd1ySDK.getMonetizationNetwork(aFh1aSDKAreAllFieldsValid)) {
            return;
        }
        copydefault = (equals + 33) % 128;
        aFd1ySDK.AFAdRevenueData().getRevenue(th, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMediationNetwork(AFd1ySDK aFd1ySDK) {
        int i = copydefault + 121;
        equals = i % 128;
        if (i % 2 == 0) {
            aFd1ySDK.getClass();
            aFd1ySDK.equals();
        } else {
            aFd1ySDK.getClass();
            aFd1ySDK.equals();
            throw null;
        }
    }

    private final AFf1lSDK getMediationNetwork() {
        int i = copydefault + 121;
        equals = i % 128;
        int i2 = i % 2;
        AFf1lSDK aFf1lSDK = (AFf1lSDK) this.getCurrencyIso4217Code.getValue();
        if (i2 != 0) {
            int i3 = 71 / 0;
        }
        equals = (copydefault + 31) % 128;
        return aFf1lSDK;
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final void getMediationNetwork(AFd1xSDK.AFa1ySDK aFa1ySDK) {
        getRevenue(new Object[]{this, aFa1ySDK}, -704073125, 704073126, System.identityHashCode(this));
    }

    private final AFc1pSDK getMonetizationNetwork() {
        int i = copydefault + 49;
        equals = i % 128;
        int i2 = i % 2;
        AFc1pSDK aFc1pSDK = (AFc1pSDK) this.getMediationNetwork.getValue();
        if (i2 != 0) {
            int i3 = 51 / 0;
        }
        int i4 = equals + 63;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return aFc1pSDK;
        }
        throw null;
    }

    public static final /* synthetic */ AFc1bSDK getMonetizationNetwork(AFd1ySDK aFd1ySDK) {
        int i = copydefault;
        equals = (i + 19) % 128;
        AFc1bSDK aFc1bSDK = aFd1ySDK.getRevenue;
        equals = (i + 97) % 128;
        return aFc1bSDK;
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        final AFd1ySDK aFd1ySDK = (AFd1ySDK) objArr[0];
        final Throwable th = (Throwable) objArr[1];
        final String str = (String) objArr[2];
        int i = equals + 121;
        copydefault = i % 128;
        if (i % 2 != 0) {
            th.getClass();
            str.getClass();
            ((ExecutorService) getRevenue(new Object[]{aFd1ySDK}, -1221964614, 1221964616, System.identityHashCode(aFd1ySDK))).execute(new Runnable() { // from class: com.appsflyer.internal.t
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1ySDK.getMediationNetwork(this.a, th, str);
                }
            });
            return null;
        }
        th.getClass();
        str.getClass();
        ((ExecutorService) getRevenue(new Object[]{aFd1ySDK}, -1221964614, 1221964616, System.identityHashCode(aFd1ySDK))).execute(new Runnable() { // from class: com.appsflyer.internal.t
            @Override // java.lang.Runnable
            public final void run() {
                AFd1ySDK.getMediationNetwork(this.a, th, str);
            }
        });
        throw null;
    }

    public final AFd1zSDK AFAdRevenueData() {
        equals = (copydefault + 119) % 128;
        AFd1zSDK aFd1zSDK = (AFd1zSDK) this.areAllFieldsValid.getValue();
        int i = equals + 95;
        copydefault = i % 128;
        if (i % 2 != 0) {
            return aFd1zSDK;
        }
        throw null;
    }

    private final void AFAdRevenueData(String str, String str2) {
        getRevenue(new Object[]{this, str, str2}, -1047452469, 1047452473, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final void getCurrencyIso4217Code() {
        int i = copydefault + 51;
        equals = i % 128;
        if (i % 2 == 0) {
            ((ExecutorService) getRevenue(new Object[]{this}, -1221964614, 1221964616, System.identityHashCode(this))).execute(new f380(this, 1));
            equals = (copydefault + 113) % 128;
        } else {
            ((ExecutorService) getRevenue(new Object[]{this}, -1221964614, 1221964616, System.identityHashCode(this))).execute(new f380(this, 1));
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getCurrencyIso4217Code(AFd1ySDK aFd1ySDK) {
        equals = (copydefault + 119) % 128;
        aFd1ySDK.getClass();
        aFd1ySDK.copy();
        equals = (copydefault + 11) % 128;
    }

    private static Object getCurrencyIso4217Code(Object[] objArr) {
        AFd1ySDK aFd1ySDK = (AFd1ySDK) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        equals = (copydefault + 41) % 128;
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        bytes.getClass();
        aFd1ySDK.component2().getRevenue(bytes, u.a("Authorization", AFj1bSDK.getRevenue(str, str2)), 2000);
        int i = copydefault + 37;
        equals = i % 128;
        if (i % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getRevenue(AFd1ySDK aFd1ySDK) {
        int i = equals + 85;
        copydefault = i % 128;
        if (i % 2 != 0) {
            aFd1ySDK.getClass();
            aFd1ySDK.copydefault();
        } else {
            aFd1ySDK.getClass();
            aFd1ySDK.copydefault();
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final void getRevenue() {
        int i = equals + 41;
        copydefault = i % 128;
        if (i % 2 == 0) {
            ((ExecutorService) getRevenue(new Object[]{this}, -1221964614, 1221964616, System.identityHashCode(this))).execute(new Runnable() { // from class: com.appsflyer.internal.r
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1ySDK.getRevenue(this.a);
                }
            });
            int i2 = 23 / 0;
        } else {
            ((ExecutorService) getRevenue(new Object[]{this}, -1221964614, 1221964616, System.identityHashCode(this))).execute(new Runnable() { // from class: com.appsflyer.internal.r
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1ySDK.getRevenue(this.a);
                }
            });
        }
        equals = (copydefault + 121) % 128;
    }

    private final boolean getRevenue(AFh1aSDK aFh1aSDK) {
        new AFd1sSDK();
        String str = this.component1;
        String str2 = aFh1aSDK.AFAdRevenueData;
        str2.getClass();
        boolean currencyIso4217Code = AFd1sSDK.getCurrencyIso4217Code(str, str2);
        int i = equals + 23;
        copydefault = i % 128;
        if (i % 2 != 0) {
            return currencyIso4217Code;
        }
        throw null;
    }

    private static Map<String, Object> getRevenue(Map<String, ? extends Object> map, List<AFc1cSDK> list) {
        return (Map) getRevenue(new Object[]{map, list}, -1519321264, 1519321264, (int) System.currentTimeMillis());
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final void getRevenue(Throwable th, String str) {
        getRevenue(new Object[]{this, th, str}, 1146782962, -1146782959, System.identityHashCode(this));
    }
}
