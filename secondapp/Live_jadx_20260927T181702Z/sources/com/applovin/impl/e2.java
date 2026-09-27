package com.applovin.impl;

import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.AppLovinExtras;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f26845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f26846b;

    public e2(Map map, com.applovin.impl.sdk.l lVar) {
        this.f26845a = map == null ? Collections.EMPTY_MAP : map;
        this.f26846b = lVar;
    }

    public Drawable a() {
        Object obj = this.f26845a.get(AppLovinExtras.Keys.KEY_WATERMARK);
        if (!a(obj)) {
            this.f26846b.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f26846b.Q().b("GoogleWatermarkGenerator", "Unable to render invalid watermark: " + obj);
            }
            return null;
        }
        try {
            byte[] bArrDecode = Base64.decode((String) obj, 0);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(com.applovin.impl.sdk.l.p().getResources(), BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            bitmapDrawable.setTileModeXY(tileMode, tileMode);
            return bitmapDrawable;
        } catch (Throwable th2) {
            this.f26846b.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f26846b.Q().a("GoogleWatermarkGenerator", "Failed to render watermark", th2);
            }
            return null;
        }
    }

    public String b() {
        return "google watermark";
    }

    public boolean c() {
        return a(this.f26845a.get(AppLovinExtras.Keys.KEY_WATERMARK));
    }

    private boolean a(Object obj) {
        return (obj instanceof String) && StringUtils.isValidString((String) obj);
    }
}
