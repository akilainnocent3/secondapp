package com.appsflyer.oaid;

import android.content.Context;
import com.bun.miitmdid.core.MdidSdkHelper;
import com.bun.miitmdid.interfaces.IIdentifierListener;
import com.bun.miitmdid.interfaces.IdSupplier;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import okhttp3.internal.luBk.Chyeyik;

/* JADX INFO: loaded from: classes.dex */
class OaidMsaClient {
    private static final String CER_PATTERN = "%s.cert.pem";
    private static final String MAS_NATIVE_LIB = "msaoaidsec";
    private static boolean isCertInit;

    public static OaidClient.Info fetchMsa(Context context, final Logger logger, long j, TimeUnit timeUnit) {
        String strValueOf;
        try {
            loadNativeLibrary();
            if (!isCertInit) {
                try {
                    isCertInit = MdidSdkHelper.InitCert(context, loadPemFromAssetFile(context, context.getPackageName() + ".cert.pem", logger));
                } catch (Throwable th) {
                    logger.warning(th.getMessage());
                }
                if (!isCertInit) {
                    logger.warning("getDeviceIds: cert init failed");
                }
            }
            final LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
            int iInitSdk = MdidSdkHelper.InitSdk(context, logger.getLevel() == null, new IIdentifierListener() { // from class: com.appsflyer.oaid.OaidMsaClient.1
                public void onSupport(IdSupplier idSupplier) {
                    if (idSupplier != null) {
                        try {
                            linkedBlockingQueue.offer(new OaidClient.Info(idSupplier.getOAID(), Boolean.valueOf(idSupplier.isLimited())));
                        } catch (Throwable th2) {
                            logger.info(th2.getMessage());
                        }
                    }
                }
            });
            if (iInitSdk != 0) {
                switch (iInitSdk) {
                    case 1008610:
                        strValueOf = "result ok (sync)";
                        break;
                    case 1008611:
                        strValueOf = "Unsupported manufacturer";
                        break;
                    case 1008612:
                        strValueOf = "Unsupported device";
                        break;
                    case 1008613:
                        strValueOf = "Error loading configuration file";
                        break;
                    case 1008614:
                        strValueOf = "Callback will be executed in a different thread";
                        break;
                    case 1008615:
                        strValueOf = "Reflection call error";
                        break;
                    case 1008616:
                        strValueOf = "cert not init or check not pass";
                        break;
                    default:
                        strValueOf = String.valueOf(iInitSdk);
                        break;
                }
                logger.warning(strValueOf);
            }
            return (OaidClient.Info) linkedBlockingQueue.poll(j, timeUnit);
        } catch (Throwable th2) {
            logger.info(th2.getMessage());
            th2.printStackTrace();
            return null;
        }
    }

    private static String loadPemFromAssetFile(Context context, String str, Logger logger) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getAssets().open(str)));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    return sb.toString();
                }
                sb.append(line);
                sb.append('\n');
            }
        } catch (IOException unused) {
            logger.warning("loadPemFromAssetFile failed");
            return "";
        }
    }

    public static void loadNativeLibrary() {
        System.loadLibrary(Chyeyik.NbEmTeptTaKjS);
    }
}
