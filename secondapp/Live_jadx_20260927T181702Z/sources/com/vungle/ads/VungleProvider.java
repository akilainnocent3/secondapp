package com.vungle.ads;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.vungle.ads.internal.util.ActivityManager;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class VungleProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public int delete(@l Uri uri, @m String str, @m String[] strArr) {
        m0.p(uri, "uri");
        return 0;
    }

    @Override // android.content.ContentProvider
    @m
    public String getType(@l Uri uri) {
        m0.p(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    @m
    public Uri insert(@l Uri uri, @m ContentValues contentValues) {
        m0.p(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            return true;
        }
        ActivityManager.Companion.init(context);
        return true;
    }

    @Override // android.content.ContentProvider
    @m
    public Cursor query(@l Uri uri, @m String[] strArr, @m String str, @m String[] strArr2, @m String str2) {
        m0.p(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@l Uri uri, @m ContentValues contentValues, @m String str, @m String[] strArr) {
        m0.p(uri, "uri");
        return 0;
    }
}
