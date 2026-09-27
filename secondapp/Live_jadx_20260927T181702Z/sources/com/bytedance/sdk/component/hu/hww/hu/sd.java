package com.bytedance.sdk.component.hu.hww.hu;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.component.hu.hww.ok;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import lk.e;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class sd implements tq {
    private final Context hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final hv f34499tq;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @SuppressLint({"StaticFieldLeak"})
    public class hww extends com.bytedance.sdk.component.hu.hww.hv.hv {

        /* JADX INFO: renamed from: sd, reason: collision with root package name */
        private final String f34504sd;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        private final vy f34505tq;
        private final Map<String, String> vy;

        private String sd(String str) {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            if (str.contains("{TS}") || str.contains("__TS__")) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                str = str.replace("{TS}", String.valueOf(jCurrentTimeMillis)).replace("__TS__", String.valueOf(jCurrentTimeMillis));
            }
            return ((str.contains("{UID}") || str.contains("__UID__")) && !TextUtils.isEmpty(this.f34504sd)) ? str.replace("{UID}", this.f34504sd).replace("__UID__", this.f34504sd) : str;
        }

        public boolean hww(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return str.startsWith("http://") || str.startsWith("https://");
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.component.hu.hww.hv.vy vyVarHww;
            com.bytedance.sdk.component.hu.hww.hv hvVarWgt = ok.vgm().wgt();
            if (hvVarWgt == null || ok.vgm().hu() == null || !hvVarWgt.sd() || !hww(this.f34505tq.tq())) {
                return;
            }
            if (this.f34505tq.vy() >= hvVarWgt.sd(this.f34505tq.hu())) {
                sd.this.f34499tq.sd(this.f34505tq);
                return;
            }
            try {
                if (this.f34505tq.vhb()) {
                    sd.this.f34499tq.hww(this.f34505tq);
                }
                if (hvVarWgt.hww(sd.this.hww())) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    String strTq = this.f34505tq.tq();
                    if (hvVarWgt.hu() == 0) {
                        strTq = sd(this.f34505tq.tq());
                        if (this.f34505tq.sd()) {
                            strTq = tq(strTq);
                        }
                    }
                    com.bytedance.sdk.component.hu.hww.hv.sd sdVarNod = hvVarWgt.nod();
                    if (sdVarNod == null) {
                        return;
                    }
                    sdVarNod.hww("User-Agent", hvVarWgt.rs());
                    sdVarNod.hww("csj_client_source_from", "1");
                    if (this.vy != null) {
                        JSONObject jSONObject = new JSONObject();
                        for (Map.Entry<String, String> entry : this.vy.entrySet()) {
                            jSONObject.put(entry.getKey(), entry.getValue());
                        }
                        sdVarNod.hww("csj_extra_info", jSONObject.toString());
                    }
                    sdVarNod.hww(strTq);
                    try {
                        vyVarHww = sdVarNod.hww();
                        try {
                            vyVarHww.hww();
                        } catch (Throwable unused) {
                        }
                    } catch (Throwable unused2) {
                        vyVarHww = null;
                    }
                    vy vyVar = this.f34505tq;
                    vyVar.hww(vyVar.vy() + 1);
                    if (vyVarHww != null && vyVarHww.hww()) {
                        sd.this.f34499tq.sd(this.f34505tq);
                        this.f34505tq.tq();
                        hvVarWgt.hww(true, 200, System.currentTimeMillis() - jCurrentTimeMillis, this.f34505tq);
                        return;
                    }
                    if (vyVarHww != null) {
                        this.f34505tq.tq(vyVarHww.tq());
                        this.f34505tq.sd(vyVarHww.sd());
                    }
                    if (vyVarHww == null || vyVarHww.tq() != 8848) {
                        this.f34505tq.tq();
                        if (this.f34505tq.vy() >= hvVarWgt.sd(this.f34505tq.hu())) {
                            sd.this.f34499tq.sd(this.f34505tq);
                            this.f34505tq.tq();
                        } else {
                            sd.this.f34499tq.tq(this.f34505tq);
                        }
                    } else {
                        vyVarHww.sd();
                        sd.this.f34499tq.sd(this.f34505tq);
                    }
                    hvVarWgt.hww(false, this.f34505tq.ok(), System.currentTimeMillis() - jCurrentTimeMillis, this.f34505tq);
                }
            } catch (Throwable unused3) {
            }
        }

        public String tq(String str) {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            try {
                return str.replace("[ss_random]", String.valueOf(sd.sd().nextLong())).replace("[ss_timestamp]", String.valueOf(System.currentTimeMillis()));
            } catch (Exception unused) {
                return str;
            }
        }

        private hww(vy vyVar, String str, Map<String, String> map) {
            super("AdsStats");
            this.f34505tq = vyVar;
            this.f34504sd = str;
            this.vy = map;
        }
    }

    public sd(Context context, hv hvVar) {
        this.hww = context;
        this.f34499tq = hvVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Random sd() {
        if (Build.VERSION.SDK_INT < 26) {
            return new SecureRandom();
        }
        try {
            return SecureRandom.getInstanceStrong();
        } catch (Throwable unused) {
            return new SecureRandom();
        }
    }

    public Context hww() {
        Context context = this.hww;
        return context == null ? ok.vgm().hu() : context;
    }

    @Override // com.bytedance.sdk.component.hu.hww.hu.tq
    public void hww(String str, List<String> list, boolean z10, Map<String, String> map, int i10, String str2) {
        com.bytedance.sdk.component.hu.hww.hv hvVarWgt = ok.vgm().wgt();
        if (hvVarWgt == null || ok.vgm().hu() == null || hvVarWgt.vy() == null || !hvVarWgt.sd() || list == null || list.size() == 0) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            hvVarWgt.vy().execute(new hww(new vy(UUID.randomUUID().toString() + e.f104695m + System.currentTimeMillis(), it.next(), z10, i10, str2), str, map));
        }
    }

    @Override // com.bytedance.sdk.component.hu.hww.hu.tq
    public Runnable hww(final vy vyVar, final String str, final Map<String, String> map) {
        if (vyVar == null || TextUtils.isEmpty(vyVar.hww())) {
            return null;
        }
        return new Runnable() { // from class: com.bytedance.sdk.component.hu.hww.hu.sd.1
            @Override // java.lang.Runnable
            public void run() {
                if (sd.this.f34499tq.hww(vyVar.hww()) != null) {
                    new hww(vyVar, str, map).run();
                }
            }
        };
    }

    @Override // com.bytedance.sdk.component.hu.hww.hu.tq
    public void hww(final String str, final boolean z10) {
        com.bytedance.sdk.component.hu.hww.hv hvVarWgt = ok.vgm().wgt();
        if (hvVarWgt == null || ok.vgm().hu() == null || !hvVarWgt.sd()) {
            return;
        }
        com.bytedance.sdk.component.hu.hww.hv.hv hvVar = new com.bytedance.sdk.component.hu.hww.hv.hv("trackFailedUrls") { // from class: com.bytedance.sdk.component.hu.hww.hu.sd.2
            @Override // java.lang.Runnable
            public void run() {
                sd.this.hww(sd.this.f34499tq.hww(), str, z10);
            }
        };
        hvVar.hww(1);
        if (hvVarWgt.vy() != null) {
            hvVarWgt.vy().execute(hvVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hww(List<vy> list, String str, boolean z10) {
        String str2;
        if (list == null || list.size() == 0) {
            return;
        }
        com.bytedance.sdk.component.hu.hww.hv hvVarWgt = ok.vgm().wgt();
        for (vy vyVar : list) {
            if (hvVarWgt == null || hvVarWgt.vy() == null) {
                str2 = str;
            } else {
                vyVar.hww(z10);
                str2 = str;
                hvVarWgt.vy().execute(new hww(vyVar, str2, null));
            }
            str = str2;
        }
    }
}
