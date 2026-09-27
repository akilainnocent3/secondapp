package com.facebook.ads.internal.dynamicloading;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import ba.w1;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.infer.annotation.Nullsafe;
import com.ironsource.C4235d4;
import io.appmetrica.analytics.impl.Vk;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kj.d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ql.g0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@Nullsafe(Nullsafe.Mode.LOCAL)
public class DexLoadErrorReporter {
    public static final double SAMPLING = 0.1d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f44072a = "https://www.facebook.com/adnw_logging/";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f44073b = new AtomicBoolean();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f44074b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f44075c;

        public a(Context context, String str) {
            this.f44074b = context;
            this.f44075c = str;
        }

        /* JADX WARN: Code duplicated, block: B:61:0x016b A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:73:0x0175 A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            DataOutputStream dataOutputStream;
            InputStream inputStream;
            HttpURLConnection httpURLConnection;
            super.run();
            try {
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(DexLoadErrorReporter.f44072a).openConnection();
                try {
                    httpURLConnection2.setRequestMethod("POST");
                    httpURLConnection2.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
                    httpURLConnection2.setRequestProperty("Accept", "application/json");
                    httpURLConnection2.setRequestProperty(d.f102477i, "UTF-8");
                    httpURLConnection2.setRequestProperty("user-agent", "[FBAN/AudienceNetworkForAndroid;FBSN/Android]");
                    httpURLConnection2.setDoOutput(true);
                    httpURLConnection2.setDoInput(true);
                    httpURLConnection2.connect();
                    String string = UUID.randomUUID().toString();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("attempt", "0");
                    DexLoadErrorReporter.b(this.f44074b, jSONObject, string);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(g0.f122415s, "generic");
                    jSONObject2.put("subtype_code", "1320");
                    jSONObject2.put("caught_exception", "1");
                    jSONObject2.put("stacktrace", this.f44075c);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("id", UUID.randomUUID().toString());
                    jSONObject3.put("type", "debug");
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("");
                    httpURLConnection = httpURLConnection2;
                    try {
                        sb2.append(System.currentTimeMillis() / 1000);
                        jSONObject3.put("session_time", sb2.toString());
                        jSONObject3.put("time", "" + (System.currentTimeMillis() / 1000));
                        jSONObject3.put("session_id", string);
                        jSONObject3.put("data", jSONObject2);
                        jSONObject3.put("attempt", "0");
                        DexLoadErrorReporter.b(this.f44074b, jSONObject2, string);
                        JSONArray jSONArray = new JSONArray();
                        jSONArray.put(jSONObject3);
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("data", jSONObject);
                        jSONObject4.put("events", jSONArray);
                        String string2 = jSONObject4.toString();
                        DataOutputStream dataOutputStream2 = new DataOutputStream(httpURLConnection.getOutputStream());
                        try {
                            dataOutputStream2.writeBytes("payload=" + URLEncoder.encode(string2, "UTF-8"));
                            dataOutputStream2.flush();
                            byte[] bArr = new byte[16384];
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            InputStream inputStream2 = httpURLConnection.getInputStream();
                            while (true) {
                                try {
                                    int i10 = inputStream2.read(bArr);
                                    if (i10 == -1) {
                                        break;
                                    } else {
                                        byteArrayOutputStream.write(bArr, 0, i10);
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    inputStream = inputStream2;
                                    dataOutputStream = dataOutputStream2;
                                    try {
                                        Log.e(AudienceNetworkAds.TAG, "Can't send error.", th);
                                    } finally {
                                        if (dataOutputStream != null) {
                                            try {
                                                dataOutputStream.close();
                                            } catch (Exception e10) {
                                                Log.e(AudienceNetworkAds.TAG, "Can't close connection.", e10);
                                            }
                                        }
                                        if (inputStream != null) {
                                            try {
                                                inputStream.close();
                                            } catch (Exception e11) {
                                                Log.e(AudienceNetworkAds.TAG, "Can't close connection.", e11);
                                            }
                                        }
                                        if (httpURLConnection != null) {
                                            httpURLConnection.disconnect();
                                        }
                                    }
                                }
                            }
                            byteArrayOutputStream.flush();
                            try {
                                dataOutputStream2.close();
                            } catch (Exception e12) {
                                Log.e(AudienceNetworkAds.TAG, "Can't close connection.", e12);
                            }
                            try {
                                inputStream2.close();
                            } catch (Exception e13) {
                                Log.e(AudienceNetworkAds.TAG, "Can't close connection.", e13);
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            dataOutputStream = dataOutputStream2;
                            inputStream = null;
                            Log.e(AudienceNetworkAds.TAG, "Can't send error.", th);
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        dataOutputStream = null;
                        inputStream = null;
                        Log.e(AudienceNetworkAds.TAG, "Can't send error.", th);
                    }
                } catch (Throwable th5) {
                    th = th5;
                    httpURLConnection = httpURLConnection2;
                }
            } catch (Throwable th6) {
                th = th6;
                dataOutputStream = null;
                inputStream = null;
                httpURLConnection = null;
            }
        }
    }

    public static void b(Context context, JSONObject jSONObject, String str) throws JSONException, PackageManager.NameNotFoundException {
        String packageName = context.getPackageName();
        jSONObject.put("APPBUILD", context.getPackageManager().getPackageInfo(packageName, 0).versionCode);
        jSONObject.put("APPNAME", context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(packageName, 0)));
        jSONObject.put("APPVERS", context.getPackageManager().getPackageInfo(packageName, 0).versionName);
        jSONObject.put("OSVERS", Build.VERSION.RELEASE);
        jSONObject.put("SDK", "android");
        jSONObject.put(Vk.f96628f, str);
        jSONObject.put(w1.f21009g, Build.MODEL);
        jSONObject.put("BUNDLE", packageName);
        jSONObject.put("SDK_VERSION", BuildConfigApi.getVersionName(context));
        jSONObject.put("OS", C4235d4.f61260d);
    }

    @SuppressLint({"CatchGeneralException"})
    public static void reportDexLoadingIssue(Context context, String str, double d10) {
        AtomicBoolean atomicBoolean = f44073b;
        if (atomicBoolean.get() || Math.random() >= d10) {
            return;
        }
        atomicBoolean.set(true);
        new a(context, str).start();
    }
}
