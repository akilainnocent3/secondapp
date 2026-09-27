package com.ironsource.mediationsdk;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.ironsource.C4259ea;
import com.ironsource.C4414n2;
import com.ironsource.C4450p2;
import com.ironsource.C4453p5;
import com.ironsource.C4485r4;
import com.ironsource.N9;
import com.ironsource.Ne;
import com.ironsource.S1;
import com.ironsource.Y1;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f62631a = "1";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f62632b = "102";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f62633c = "102";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f62634d = "GenericNotifications";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f f62635e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private IronSource.a f62636f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C4450p2 f62637g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private S1 f62638h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ISBannerSize f62639i;

    public e(f fVar) {
        this.f62635e = fVar;
    }

    @Deprecated
    public void a(Context context, Map<String, Object> map, List<String> list, h hVar, int i10, C4259ea c4259ea, ISBannerSize iSBannerSize) {
        this.f62639i = iSBannerSize;
        a(context, map, list, hVar, i10, c4259ea);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected S1 f62640a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected d.a f62641b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected int f62642c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected String f62643d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        protected long f62644e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        protected int f62645f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f62647h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final URL f62650k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final JSONObject f62651l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final boolean f62652m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f62653n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final long f62654o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final boolean f62655p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final boolean f62656q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final boolean f62657r;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        protected String f62648i = "";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        protected int f62649j = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        protected String f62646g = a((Integer) null);

        public a(S1 s10, URL url, JSONObject jSONObject, boolean z10, C4450p2 c4450p2) {
            this.f62640a = s10;
            this.f62650k = url;
            this.f62651l = jSONObject;
            this.f62652m = z10;
            this.f62653n = c4450p2.g();
            this.f62654o = c4450p2.m();
            this.f62655p = c4450p2.o();
            this.f62656q = c4450p2.p();
            this.f62647h = c4450p2.d();
            this.f62657r = c4450p2.n();
        }

        private void a(long j10, long j11) {
            long time = j10 - (new Date().getTime() - j11);
            if (time > 0) {
                SystemClock.sleep(time);
            }
        }

        public boolean b() {
            this.f62644e = new Date().getTime();
            try {
                this.f62647h = this.f62649j == 1015 ? 1 : this.f62647h;
                this.f62645f = 0;
                HttpURLConnection httpURLConnectionA = null;
                while (true) {
                    int i10 = this.f62645f;
                    int i11 = this.f62653n;
                    if (i10 >= i11) {
                        this.f62645f = i11 - 1;
                        this.f62646g = a(Integer.valueOf(this.f62642c));
                        return false;
                    }
                    try {
                        long time = new Date().getTime();
                        String str = "Auction Handler: auction trial " + (this.f62645f + 1) + " out of " + this.f62653n + " max trials";
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, str, 0);
                        IronSourceUtils.i(str);
                        httpURLConnectionA = a(this.f62650k, this.f62654o);
                        IronLog ironLog = IronLog.INTERNAL;
                        ironLog.verbose("parameters for auction url: " + this.f62650k.getQuery());
                        ironLog.verbose("parameters for auction POST data: " + this.f62651l);
                        a(httpURLConnectionA, this.f62651l, this.f62655p);
                        int responseCode = httpURLConnectionA.getResponseCode();
                        if (responseCode == 200 || responseCode == 204) {
                            try {
                                a(a(httpURLConnectionA), this.f62652m, this.f62656q);
                                httpURLConnectionA.disconnect();
                                return true;
                            } catch (JSONException e10) {
                                C4485r4.d().a(e10);
                                if (e10.getMessage() != null && e10.getMessage().equalsIgnoreCase("decryption error")) {
                                    this.f62642c = 1003;
                                    this.f62643d = "Auction decryption error";
                                } else if (e10.getMessage() == null || !e10.getMessage().equalsIgnoreCase("decompression error")) {
                                    this.f62642c = 1002;
                                    this.f62643d = "Auction parsing error";
                                } else {
                                    this.f62642c = 1008;
                                    this.f62643d = "Auction decompression error";
                                }
                                this.f62646g = a(Integer.valueOf(this.f62642c));
                                IronLog.INTERNAL.error("Auction handle response exception " + e10.getMessage());
                                httpURLConnectionA.disconnect();
                                return false;
                            }
                        }
                        this.f62642c = 1001;
                        String str2 = "Auction response code not valid, error code response from server - " + responseCode;
                        this.f62643d = str2;
                        ironLog.error(str2);
                        httpURLConnectionA.disconnect();
                        if (this.f62645f < this.f62653n - 1) {
                            a(this.f62654o, time);
                        }
                        this.f62645f++;
                    } catch (SocketTimeoutException e11) {
                        C4485r4.d().a(e11);
                        if (httpURLConnectionA != null) {
                            httpURLConnectionA.disconnect();
                        }
                        this.f62642c = 1006;
                        this.f62643d = "Connection timed out";
                        IronLog.INTERNAL.error("Auction socket timeout exception " + e11.getMessage());
                    } catch (Throwable th2) {
                        C4485r4.d().a(th2);
                        IronLog.INTERNAL.error("getting exception " + th2);
                        if (httpURLConnectionA != null) {
                            httpURLConnectionA.disconnect();
                        }
                        this.f62642c = 1000;
                        this.f62643d = th2.getMessage();
                        this.f62646g = a(Integer.valueOf(this.f62642c));
                        return false;
                    }
                }
            } catch (Exception e12) {
                C4485r4.d().a(e12);
                this.f62642c = 1007;
                this.f62643d = e12.getMessage();
                this.f62645f = 0;
                this.f62646g = a(Integer.valueOf(this.f62642c));
                IronLog.INTERNAL.error("Auction request exception " + e12.getMessage());
                return false;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean zB = b();
            S1 s10 = this.f62640a;
            if (s10 == null) {
                return;
            }
            a(zB, s10, new Date().getTime() - this.f62644e);
        }

        private String a() {
            if (this.f62647h == 2) {
                return C4453p5.b().d();
            }
            return C4453p5.b().c();
        }

        private void a(HttpURLConnection httpURLConnection, JSONObject jSONObject, boolean z10) throws Exception {
            String strA;
            String strE;
            String str;
            OutputStream outputStream = httpURLConnection.getOutputStream();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-8");
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
            if (this.f62647h == 2) {
                try {
                    strA = C4453p5.b().a();
                } catch (JSONException e10) {
                    C4485r4.d().a(e10);
                    this.f62648i = e10.getLocalizedMessage();
                    this.f62649j = 1015;
                    this.f62647h = 1;
                    IronLog.INTERNAL.error("get encrypted session key exception " + e10.getMessage());
                    strA = "";
                }
            } else {
                strA = "";
            }
            String string = jSONObject.toString();
            String strA2 = a();
            if (z10) {
                IronLog.INTERNAL.verbose("compressing and encrypting auction request");
                strE = N9.a(strA2, string);
            } else {
                strE = N9.e(strA2, string);
            }
            if (this.f62647h == 2) {
                str = String.format("{\"sk\" : \"%1$s\", \"ct\" : \"%2$s\"}", strA, strE);
            } else {
                str = String.format("{\"request\" : \"%1$s\"}", strE);
            }
            bufferedWriter.write(str);
            bufferedWriter.flush();
            bufferedWriter.close();
            outputStreamWriter.close();
            outputStream.close();
        }

        private HttpURLConnection a(URL url, long j10) throws IOException {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
            httpURLConnection.setReadTimeout((int) j10);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            return httpURLConnection;
        }

        public JSONObject a(JSONObject jSONObject, boolean z10) throws JSONException {
            String str;
            String strA = a();
            if (this.f62647h == 2) {
                str = "ct";
            } else {
                str = Ne.f59595n;
            }
            String string = jSONObject.getString(str);
            if (z10) {
                return b(strA, string);
            }
            return a(strA, string);
        }

        public void a(String str, boolean z10, boolean z11) throws JSONException {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                if (z10) {
                    jSONObject = a(jSONObject, z11);
                }
                d.a aVarA = d.b().a(jSONObject);
                this.f62641b = aVarA;
                this.f62642c = aVarA.c();
                this.f62643d = this.f62641b.d();
                return;
            }
            throw new JSONException("empty response");
        }

        private JSONObject a(String str, String str2) throws JSONException {
            String strB = N9.b(str, str2);
            if (!TextUtils.isEmpty(strB)) {
                return new JSONObject(strB);
            }
            throw new JSONException("decryption error");
        }

        private String a(HttpURLConnection httpURLConnection) throws IOException {
            InputStreamReader inputStreamReader = new InputStreamReader(httpURLConnection.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb2.append(line);
                } else {
                    bufferedReader.close();
                    inputStreamReader.close();
                    return sb2.toString();
                }
            }
        }

        private JSONObject b(String str, String str2) throws JSONException {
            IronLog.INTERNAL.verbose("decrypting and decompressing auction response");
            String strD = N9.d(str, str2);
            if (strD != null) {
                return new JSONObject(strD);
            }
            throw new JSONException("decompression error");
        }

        public void a(boolean z10, S1 s10, long j10) {
            if (z10) {
                s10.a(this.f62641b.h(), this.f62641b.a(), this.f62641b.e(), this.f62641b.f(), this.f62641b.b(), this.f62645f + 1, j10, this.f62649j, this.f62648i);
            } else {
                s10.a(this.f62642c, this.f62643d, this.f62645f + 1, this.f62646g, j10);
            }
        }

        private String a(Integer num) {
            return Y1.f60328a.a(this.f62657r, num);
        }
    }

    public void a(Context context, i iVar, S1 s10) {
        try {
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.f62635e.a(context, iVar, s10));
        } catch (Exception e10) {
            C4485r4.d().a(e10);
            IronLog.INTERNAL.error("execute auction exception " + e10.getMessage());
            if (s10 != null) {
                s10.a(1000, e10.getMessage(), 0, Y1.f60328a.a(this.f62635e.a(), 1000), 0L);
            }
        }
    }

    @Deprecated
    public e(IronSource.a aVar, C4450p2 c4450p2, S1 s10) {
        this.f62636f = aVar;
        this.f62637g = c4450p2;
        this.f62638h = s10;
    }

    @Deprecated
    public void a(Context context, Map<String, Object> map, List<String> list, h hVar, int i10, C4259ea c4259ea) {
        e eVar;
        try {
            boolean zG = IronSourceUtils.g();
            eVar = this;
            try {
                IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new a(eVar.f62638h, new URL(eVar.f62637g.a(false)), eVar.a(map, list, hVar, i10, zG, c4259ea), zG, eVar.f62637g));
            } catch (Exception e10) {
                e = e10;
                Exception exc = e;
                C4485r4.d().a(exc);
                IronLog.INTERNAL.error("execute auction exception " + exc.getMessage());
                eVar.f62638h.a(1000, exc.getMessage(), 0, Y1.f60328a.a(eVar.f62637g.n(), 1000), 0L);
            }
        } catch (Exception e11) {
            e = e11;
            eVar = this;
        }
    }

    public void a(C4414n2 c4414n2, int i10, C4414n2 c4414n3, String str) {
        Iterator<String> it = c4414n2.b().iterator();
        while (it.hasNext()) {
            C4414n2 c4414n4 = c4414n2;
            int i11 = i10;
            String str2 = str;
            d.b().a("reportImpression", c4414n4.c(), d.b().a(it.next(), i11, c4414n4, "", "", str2));
            i10 = i11;
            c4414n2 = c4414n4;
            str = str2;
        }
        C4414n2 c4414n5 = c4414n2;
        int i12 = i10;
        String str3 = str;
        if (c4414n3 != null) {
            Iterator<String> it2 = c4414n3.b().iterator();
            while (it2.hasNext()) {
                d.b().a("reportImpression", "GenericNotifications", d.b().a(it2.next(), i12, c4414n5, "", "102", str3));
            }
        }
    }

    public void a(C4414n2 c4414n2, int i10, C4414n2 c4414n3) {
        Iterator<String> it = c4414n2.h().iterator();
        while (it.hasNext()) {
            C4414n2 c4414n4 = c4414n2;
            int i11 = i10;
            d.b().a("reportLoadSuccess", c4414n4.c(), d.b().a(it.next(), i11, c4414n4, "", "", ""));
            i10 = i11;
            c4414n2 = c4414n4;
        }
        C4414n2 c4414n5 = c4414n2;
        int i12 = i10;
        if (c4414n3 != null) {
            Iterator<String> it2 = c4414n3.h().iterator();
            while (it2.hasNext()) {
                d.b().a("reportLoadSuccess", "GenericNotifications", d.b().a(it2.next(), i12, c4414n5, "", "102", ""));
            }
        }
    }

    public void a(CopyOnWriteArrayList<A> copyOnWriteArrayList, ConcurrentHashMap<String, C4414n2> concurrentHashMap, int i10, C4414n2 c4414n2, C4414n2 c4414n3) {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<A> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().c());
        }
        a(arrayList, concurrentHashMap, i10, c4414n2, c4414n3);
    }

    public void a(ArrayList<String> arrayList, ConcurrentHashMap<String, C4414n2> concurrentHashMap, int i10, C4414n2 c4414n2, C4414n2 c4414n3) {
        int iJ = c4414n3.j();
        for (String str : arrayList) {
            if (!str.equals(c4414n3.c())) {
                C4414n2 c4414n4 = concurrentHashMap.get(str);
                int iJ2 = c4414n4.j();
                String strI = c4414n4.i();
                String str2 = iJ2 < iJ ? "1" : "102";
                IronLog.INTERNAL.verbose("instance=" + c4414n4.c() + ", instancePriceOrder= " + iJ2 + ", loseReasonCode=" + str2 + ", winnerInstance=" + c4414n3.c() + ", winnerInstancePriceOrder=" + iJ);
                Iterator<String> it = c4414n4.g().iterator();
                while (it.hasNext()) {
                    d.b().a("reportAuctionLose", c4414n4.c(), d.b().a(it.next(), i10, c4414n3, strI, str2, ""));
                }
            }
        }
        if (c4414n2 != null) {
            Iterator<String> it2 = c4414n2.g().iterator();
            while (it2.hasNext()) {
                d.b().a("reportAuctionLose", "GenericNotifications", d.b().a(it2.next(), i10, c4414n3, "", "102", ""));
            }
        }
    }

    private JSONObject a(Map<String, Object> map, List<String> list, h hVar, int i10, boolean z10, C4259ea c4259ea) throws JSONException {
        i iVar = new i(this.f62636f);
        iVar.a(map);
        iVar.a(list);
        iVar.a(hVar);
        iVar.a(i10);
        iVar.a(this.f62639i);
        iVar.a(c4259ea);
        iVar.b(z10);
        return d.b().a(iVar);
    }

    public boolean a() {
        return this.f62635e.b();
    }
}
