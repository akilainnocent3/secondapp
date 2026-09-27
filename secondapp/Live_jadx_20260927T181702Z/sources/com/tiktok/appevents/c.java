package com.tiktok.appevents;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class c implements Serializable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f76029l = 2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static AtomicLong f76030m = new AtomicLong(new Date().getTime());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static String f76031n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static kp.h f76032o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<String> f76033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f76034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f76035d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Date f76036e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f76037f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f76038g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Boolean f76039h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Long f76040i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public m0 f76041j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f76042k;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum a {
        track,
        identify
    }

    static {
        String canonicalName = a0.class.getCanonicalName();
        f76031n = canonicalName;
        f76032o = new kp.h(canonicalName, dp.c.s());
    }

    public c(a type, String eventName, String propertiesJson, String eventId, String[] ttAppId) {
        this(type, eventName, new Date(), propertiesJson, eventId, ttAppId);
    }

    public Boolean d() {
        return this.f76039h;
    }

    public String g() {
        return this.f76038g;
    }

    public String h() {
        return this.f76035d;
    }

    public String i() {
        return this.f76037f;
    }

    public String j() {
        return this.f76042k;
    }

    public List<String> k() {
        return this.f76033b;
    }

    public Date l() {
        return this.f76036e;
    }

    public String m() {
        return this.f76034c.name();
    }

    public Long n() {
        return this.f76040i;
    }

    public m0 o() {
        return this.f76041j;
    }

    public void p(Boolean edp) {
        this.f76039h = edp;
    }

    public void q(String eventId) {
        this.f76038g = eventId;
    }

    public void r(String eventName) {
        this.f76035d = eventName;
    }

    public void s(String propertiesJson) {
        this.f76037f = propertiesJson;
    }

    public void t() {
        try {
            View decorView = g0.a().get().getWindow().getDecorView();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(decorView.getWidth(), decorView.getHeight(), Bitmap.Config.RGB_565);
            decorView.draw(new Canvas(bitmapCreateBitmap));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 5, byteArrayOutputStream);
            this.f76042k = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
        } catch (Throwable th2) {
            f76032o.b(th2, "taker screen shot error", new Object[0]);
        }
    }

    public String toString() {
        return "TTAppEvent{eventName='" + this.f76035d + "', timeStamp=" + this.f76036e + ", propertiesJson='" + this.f76037f + "', eventId='" + this.f76038g + "', uniqueId=" + this.f76040i + ", tiktokAppIds=" + this.f76033b + fw.b.f85383j;
    }

    public void u(List<String> tiktokAppIds) {
        this.f76033b = tiktokAppIds;
    }

    public void v(Date timeStamp) {
        this.f76036e = timeStamp;
    }

    public c(a type, String eventName, Date timeStamp, String propertiesJson, String eventId, String[] ttAppId) {
        this.f76033b = new ArrayList();
        this.f76034c = type;
        this.f76035d = eventName;
        this.f76036e = timeStamp;
        this.f76037f = propertiesJson;
        this.f76038g = eventId;
        try {
            if (TextUtils.isEmpty(eventId)) {
                this.f76038g = UUID.randomUUID().toString();
            }
        } catch (Throwable th2) {
            f76032o.b(th2, "set eventId error", new Object[0]);
        }
        this.f76040i = Long.valueOf(f76030m.getAndIncrement());
        this.f76041j = m0.f76108i.clone();
        if (ttAppId == null || ttAppId.length <= 0) {
            return;
        }
        for (String str : ttAppId) {
            this.f76033b.add(str);
        }
    }
}
