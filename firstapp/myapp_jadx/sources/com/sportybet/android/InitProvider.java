package com.sportybet.android;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import defpackage.bqe;
import defpackage.rpm;
import defpackage.ur60;
import java.net.ProxySelector;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sportybet/android/InitProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class InitProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        uri.getClass();
        throw new UnsupportedOperationException("This method is not provided. You shouldn't use this.");
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        uri.getClass();
        throw new UnsupportedOperationException("This method is not provided. You shouldn't use this.");
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        uri.getClass();
        throw new UnsupportedOperationException("This method is not provided. You shouldn't use this.");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        int i = rpm.a;
        ProxySelector proxySelector = ProxySelector.getDefault();
        if (!(proxySelector instanceof ur60)) {
            ProxySelector.setDefault(new ur60(proxySelector));
        }
        Context context = getContext();
        synchronized (bqe.class) {
            if (bqe.a != null) {
                return true;
            }
            if (context == null) {
                return true;
            }
            Resources resources = context.getResources();
            bqe.b = resources;
            if (resources == null) {
                return true;
            }
            bqe.a = resources.getDisplayMetrics();
            return true;
        }
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        uri.getClass();
        throw new UnsupportedOperationException("This method is not provided. You shouldn't use this.");
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        uri.getClass();
        throw new UnsupportedOperationException("This method is not provided. You shouldn't use this.");
    }
}
