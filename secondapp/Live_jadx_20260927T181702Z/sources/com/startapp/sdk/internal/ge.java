package com.startapp.sdk.internal;

import android.content.Context;
import android.text.TextUtils;
import com.startapp.json.JsonParser;
import java.net.CookieManager;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.URI;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ge implements CookieStore {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CookieStore f74873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sf f74874b;

    public ge(Context context) {
        HttpCookie httpCookie;
        sf sfVar = new sf(context.getSharedPreferences("com.startapp.android.publish.CookiePrefsFile", 0));
        this.f74874b = sfVar;
        this.f74873a = new CookieManager().getCookieStore();
        String string = sfVar.getString("names", null);
        if (string != null) {
            for (String str : TextUtils.split(string, ";")) {
                String string2 = this.f74874b.getString("cookie_" + str, null);
                if (string2 != null && (httpCookie = (HttpCookie) JsonParser.fromJson(string2, HttpCookie.class)) != null) {
                    if (httpCookie.hasExpired()) {
                        rf rfVarEdit = this.f74874b.edit();
                        StringBuilder sb2 = new StringBuilder("cookie_");
                        sb2.append(httpCookie.getDomain() + lk.e.f104695m + httpCookie.getName());
                        rfVarEdit.remove(sb2.toString());
                        rfVarEdit.apply();
                        a();
                    } else if (httpCookie.getDomain() != null) {
                        this.f74873a.add(URI.create(httpCookie.getDomain()), httpCookie);
                    }
                }
            }
        }
    }

    public final void a() {
        rf rfVarEdit = this.f74874b.edit();
        HashSet hashSet = new HashSet();
        for (HttpCookie httpCookie : this.f74873a.getCookies()) {
            hashSet.add(httpCookie.getDomain() + lk.e.f104695m + httpCookie.getName());
        }
        String strJoin = TextUtils.join(";", hashSet);
        rfVarEdit.a("names", strJoin);
        rfVarEdit.f75462a.putString("names", strJoin);
        rfVarEdit.apply();
    }

    @Override // java.net.CookieStore
    public final void add(URI uri, HttpCookie httpCookie) {
        String str = httpCookie.getDomain() + lk.e.f104695m + httpCookie.getName();
        this.f74873a.add(uri, httpCookie);
        rf rfVarEdit = this.f74874b.edit();
        String str2 = "cookie_" + str;
        String json = JsonParser.toJson(httpCookie);
        rfVarEdit.a(str2, json);
        rfVarEdit.f75462a.putString(str2, json);
        rfVarEdit.apply();
        a();
    }

    @Override // java.net.CookieStore
    public final List get(URI uri) {
        return this.f74873a.get(uri);
    }

    @Override // java.net.CookieStore
    public final List getCookies() {
        return this.f74873a.getCookies();
    }

    @Override // java.net.CookieStore
    public final List getURIs() {
        return this.f74873a.getURIs();
    }

    @Override // java.net.CookieStore
    public final boolean remove(URI uri, HttpCookie httpCookie) {
        if (!this.f74873a.remove(uri, httpCookie)) {
            return false;
        }
        rf rfVarEdit = this.f74874b.edit();
        StringBuilder sb2 = new StringBuilder("cookie_");
        sb2.append(httpCookie.getDomain() + lk.e.f104695m + httpCookie.getName());
        rfVarEdit.remove(sb2.toString());
        rfVarEdit.apply();
        a();
        return true;
    }

    @Override // java.net.CookieStore
    public final boolean removeAll() {
        if (!this.f74873a.removeAll()) {
            return false;
        }
        rf rfVarEdit = this.f74874b.edit();
        rfVarEdit.clear();
        rfVarEdit.apply();
        a();
        return true;
    }
}
