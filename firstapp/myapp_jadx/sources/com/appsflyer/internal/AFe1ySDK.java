package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import defpackage.hwr;
import defpackage.qlr;
import defpackage.ttr;
import defpackage.uhc;
import defpackage.yk10;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0015\u0010\u0010\u001a\u00020\r8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0011\u001a\u00020\r8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0013\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0015R\u0011\u0010\b\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0015"}, d2 = {"Lcom/appsflyer/internal/AFe1ySDK;", "", "Lcom/appsflyer/internal/AFc1pSDK;", "p0", "Lcom/appsflyer/internal/AFc1oSDK;", "p1", "<init>", "(Lcom/appsflyer/internal/AFc1pSDK;Lcom/appsflyer/internal/AFc1oSDK;)V", "getMediationNetwork", "Lcom/appsflyer/internal/AFc1pSDK;", "AFAdRevenueData", "Lcom/appsflyer/internal/AFc1oSDK;", "areAllFieldsValid", "", "component4", "Lttr;", "getMonetizationNetwork", "getCurrencyIso4217Code", "", "getRevenue", "()Z", "()Ljava/lang/String;", "component1", "AFa1uSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AFe1ySDK {
    private static AFe1wSDK component1;

    /* JADX INFO: renamed from: AFAdRevenueData, reason: from kotlin metadata */
    private final AFc1oSDK areAllFieldsValid;

    /* JADX INFO: renamed from: component4, reason: from kotlin metadata */
    private final ttr getMonetizationNetwork;
    public final ttr getCurrencyIso4217Code;

    /* JADX INFO: renamed from: getMediationNetwork, reason: from kotlin metadata */
    private final AFc1pSDK AFAdRevenueData;

    /* JADX INFO: renamed from: AFa1uSDK, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static String getRevenue = "https://%scdn-%ssettings.%s/android/v1/%s/settings";
    public static String getMonetizationNetwork = "https://%scdn-%stestsettings.%s/android/v1/%s/settings";
    private static final List<String> component2 = kotlin.collections.b.k("googleplay", "playstore", "googleplaystore");

    /* JADX INFO: renamed from: com.appsflyer.internal.AFe1ySDK$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "AFAdRevenueData", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass3 extends qlr implements Function0<String> {
        public AnonymousClass3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            String packageName = AFe1ySDK.this.AFAdRevenueData.getRevenue.getRevenue.getPackageName();
            packageName.getClass();
            return AFe1ySDK.getCurrencyIso4217Code(packageName, AFe1ySDK.AFAdRevenueData(AFe1ySDK.this));
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFe1ySDK$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "getRevenue", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass4 extends qlr implements Function0<String> {
        public AnonymousClass4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            String currencyIso4217Code = AFa1uSDK.getCurrencyIso4217Code(AFe1ySDK.this.areAllFieldsValid, AFe1ySDK.this.AFAdRevenueData.areAllFieldsValid());
            if (currencyIso4217Code != null && !StringsKt.U(currencyIso4217Code)) {
                String string = StringsKt.t0(currencyIso4217Code).toString();
                List<String> listAFAdRevenueData = Companion.AFAdRevenueData();
                Locale locale = Locale.getDefault();
                locale.getClass();
                String lowerCase = string.toLowerCase(locale);
                lowerCase.getClass();
                if (listAFAdRevenueData.contains(lowerCase)) {
                    AFLogger.afWarnLog(String.format("AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", Arrays.copyOf(new Object[]{string}, 1)));
                    currencyIso4217Code = "";
                } else {
                    currencyIso4217Code = "-".concat(string);
                }
            }
            return StringsKt.t0(currencyIso4217Code != null ? currencyIso4217Code : "").toString();
        }
    }

    public /* synthetic */ class AFa1zSDK {
        public static final /* synthetic */ int[] getRevenue;

        static {
            int[] iArr = new int[AFe1tSDK.values().length];
            try {
                iArr[AFe1tSDK.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFe1tSDK.API.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFe1tSDK.RC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            getRevenue = iArr;
        }
    }

    public AFe1ySDK(AFc1pSDK aFc1pSDK, AFc1oSDK aFc1oSDK) {
        aFc1pSDK.getClass();
        aFc1oSDK.getClass();
        this.AFAdRevenueData = aFc1pSDK;
        this.areAllFieldsValid = aFc1oSDK;
        this.getMonetizationNetwork = hwr.b(new AnonymousClass4());
        this.getCurrencyIso4217Code = hwr.b(new AnonymousClass3());
    }

    public static final /* synthetic */ String AFAdRevenueData(AFe1ySDK aFe1ySDK) {
        return (String) aFe1ySDK.getMonetizationNetwork.getValue();
    }

    public static final /* synthetic */ String getCurrencyIso4217Code(String str, String str2) throws NoSuchAlgorithmException {
        String strA = yk10.a(str, str2);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = strA.getBytes(Charsets.UTF_8);
        bytes.getClass();
        byte[] bArrDigest = messageDigest.digest(bytes);
        bArrDigest.getClass();
        String strEncodeToString = Base64.encodeToString(bArrDigest, 2);
        strEncodeToString.getClass();
        String lowerCase = strEncodeToString.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return new Regex("[^\\w]+").replace(lowerCase, "").substring(0, 6).concat(".");
    }

    public static final void getMediationNetwork(AFe1wSDK aFe1wSDK) {
        Companion.AFAdRevenueData(aFe1wSDK);
    }

    public static boolean getRevenue() {
        return component1 == null;
    }

    public final String getMonetizationNetwork() {
        int i = AFa1zSDK.getRevenue[(getRevenue() ? AFe1tSDK.DEFAULT : AFe1tSDK.API).ordinal()];
        if (i == 1) {
            return (String) this.getCurrencyIso4217Code.getValue();
        }
        if (i == 2) {
            AFe1wSDK aFe1wSDK = component1;
            String str = aFe1wSDK != null ? aFe1wSDK.AFAdRevenueData : null;
            return str == null ? "" : str;
        }
        if (i == 3) {
            return "";
        }
        uhc.a();
        return null;
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFe1ySDK$AFa1uSDK, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\"\u0004\b\b\u0010\u0011"}, d2 = {"Lcom/appsflyer/internal/AFe1ySDK$AFa1uSDK;", "", "<init>", "()V", "", "", "component2", "Ljava/util/List;", "AFAdRevenueData", "()Ljava/util/List;", "getCurrencyIso4217Code", "getRevenue", "Ljava/lang/String;", "getMonetizationNetwork", "Lcom/appsflyer/internal/AFe1wSDK;", "component1", "Lcom/appsflyer/internal/AFe1wSDK;", "(Lcom/appsflyer/internal/AFe1wSDK;)V", "getMediationNetwork"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static List<String> AFAdRevenueData() {
            return AFe1ySDK.component2;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static void AFAdRevenueData(AFe1wSDK aFe1wSDK) {
            AFe1ySDK.component1 = aFe1wSDK;
        }
    }

    public final String getCurrencyIso4217Code() {
        AFe1tSDK aFe1tSDK;
        if (getRevenue()) {
            aFe1tSDK = AFe1tSDK.DEFAULT;
        } else {
            aFe1tSDK = AFe1tSDK.API;
        }
        int i = AFa1zSDK.getRevenue[aFe1tSDK.ordinal()];
        if (i == 1) {
            return "appsflyersdk.com";
        }
        if (i == 2) {
            AFe1wSDK aFe1wSDK = component1;
            String str = aFe1wSDK != null ? aFe1wSDK.getRevenue : null;
            return str == null ? "" : str;
        }
        if (i == 3) {
            return "";
        }
        uhc.a();
        return null;
    }
}
