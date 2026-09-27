package com.bytedance.sdk.openadsdk.kub;

import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import mk.e;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class sd {

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private vy f37456sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private tq f37457tq;
    private hww vy;
    private final String hww = "StrategyCenter";

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private int f37455hv = 0;

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private Runnable f37454hu = new Runnable() { // from class: com.bytedance.sdk.openadsdk.kub.sd.2
        @Override // java.lang.Runnable
        public void run() {
            sd.this.tq();
        }
    };

    public sd(vy vyVar) {
        this.f37457tq = null;
        hv hvVar = new hv(vyVar);
        this.f37456sd = hvVar;
        String strSd = hvVar.sd();
        if (!TextUtils.isEmpty(strSd) && !strSd.startsWith("pag")) {
            strSd = "pag_".concat(strSd);
        }
        this.f37457tq = new tq(this.f37456sd.tq(), strSd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tq() {
        vy vyVar = this.f37456sd;
        if (vyVar == null || vyVar.hv() == null || this.f37456sd.hu() == null) {
            return;
        }
        this.f37456sd.hww().execute(new Runnable() { // from class: com.bytedance.sdk.openadsdk.kub.sd.1
            @Override // java.lang.Runnable
            public void run() {
                OutputStream outputStream;
                sd.this.f37455hv++;
                try {
                    if (sd.this.vy != null) {
                        sd.this.vy.hww();
                    }
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(sd.this.f37456sd.hv()).openConnection();
                    if (sd.this.f37456sd.vgm() != null && sd.this.f37456sd.vgm().size() > 0) {
                        for (Map.Entry<String, String> entry : sd.this.f37456sd.vgm().entrySet()) {
                            httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                        }
                    }
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setRequestProperty("Content-Type", "application/json");
                    try {
                        outputStream = httpURLConnection.getOutputStream();
                        try {
                            outputStream.write(sd.this.f37456sd.hu().toString().getBytes());
                            outputStream.close();
                            int responseCode = httpURLConnection.getResponseCode();
                            Log.i("StrategyCenter", "executing strategy fetch");
                            if (responseCode == 200) {
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                                StringBuffer stringBuffer = new StringBuffer();
                                while (true) {
                                    String line = bufferedReader.readLine();
                                    if (line == null) {
                                        break;
                                    } else {
                                        stringBuffer.append(line);
                                    }
                                }
                                bufferedReader.close();
                                JSONObject jSONObjectHww = sd.this.f37456sd.hww(new JSONObject(stringBuffer.toString()));
                                sd.this.f37457tq.hww();
                                sd.this.f37457tq.hww(jSONObjectHww);
                                if (sd.this.vy != null) {
                                    sd.this.vy.tq();
                                }
                            } else if (sd.this.vy != null) {
                                sd.this.vy.hww(responseCode, httpURLConnection.getResponseMessage());
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        outputStream = null;
                    }
                } catch (Throwable th4) {
                    Log.e("StrategyCenter", th4.getMessage() == null ? "error " : th4.getMessage());
                    if (sd.this.vy != null) {
                        sd.this.vy.hww(-1, th4.getMessage());
                    }
                }
                sd.this.f37457tq.hww("local_last_update_time", System.currentTimeMillis());
                sd.this.hww();
            }
        });
    }

    public void hww(hww hwwVar) {
        this.vy = hwwVar;
    }

    public void hww() {
        if (this.f37456sd != null) {
            tq tqVar = this.f37457tq;
            int i10 = e.f107640n;
            int iHww = tqVar.hww("req_interval", e.f107640n);
            long j10 = 0;
            long jTq = this.f37457tq.tq("local_last_update_time", 0L);
            if (iHww >= 600000 && iHww <= 86400000) {
                i10 = iHww;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - jTq;
            Log.i("StrategyCenter", "before  realInterval=".concat(String.valueOf(jCurrentTimeMillis)));
            if (jCurrentTimeMillis >= 0) {
                long j11 = i10;
                if (jCurrentTimeMillis <= j11) {
                    j10 = j11 - jCurrentTimeMillis;
                }
            }
            Log.i("StrategyCenter", "after  realInterval=".concat(String.valueOf(j10)));
            this.f37456sd.vy().removeCallbacks(this.f37454hu);
            if (this.f37455hv > 24) {
                return;
            }
            this.f37456sd.vy().postDelayed(this.f37454hu, j10);
        }
    }

    public int hww(String str, int i10) {
        tq tqVar = this.f37457tq;
        return tqVar == null ? i10 : tqVar.hww(str, i10);
    }

    public String hww(String str, String str2) {
        tq tqVar = this.f37457tq;
        return tqVar == null ? str2 : tqVar.hww(str, str2);
    }

    public boolean hww(String str, boolean z10) {
        tq tqVar = this.f37457tq;
        return tqVar == null ? z10 : tqVar.hww(str, z10);
    }
}
