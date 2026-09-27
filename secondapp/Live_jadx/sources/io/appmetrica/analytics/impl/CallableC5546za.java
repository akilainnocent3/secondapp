package io.appmetrica.analytics.impl;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.za, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class CallableC5546za implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Aa f98699a;

    public CallableC5546za(Aa aa2) {
        this.f98699a = aa2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Uri uri = Uri.parse("content://com.huawei.appmarket.commondata/item/5");
        ContentResolver contentResolver = this.f98699a.f95548a.getContentResolver();
        Aa aa2 = this.f98699a;
        aa2.f95549b = contentResolver.query(uri, null, null, new String[]{aa2.f95548a.getPackageName()}, null);
        Cursor cursor = this.f98699a.f95549b;
        if (cursor == null || !cursor.moveToFirst()) {
            return null;
        }
        String string = this.f98699a.f95549b.getString(0);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new C5278og(string, this.f98699a.f95549b.getLong(1), this.f98699a.f95549b.getLong(2), EnumC5253ng.f97980d);
    }
}
