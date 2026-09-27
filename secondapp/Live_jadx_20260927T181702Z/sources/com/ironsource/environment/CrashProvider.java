package com.ironsource.environment;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import com.ironsource.I4;
import to.c;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class CrashProvider extends ContentProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f61696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    I4 f61697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f61698c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Uri f61700e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    String f61703h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    String f61704i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    UriMatcher f61699d = new UriMatcher(-1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f61701f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f61702g = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final String f61705j = "REPORTS";

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        int iMatch = this.f61699d.match(uri);
        if (iMatch == 1) {
            return this.f61703h;
        }
        if (iMatch == 2) {
            return this.f61704i;
        }
        throw new IllegalArgumentException("Invalid URI: " + uri);
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        this.f61696a = getContext();
        this.f61697b = new I4(this.f61696a);
        this.f61698c = this.f61696a.getPackageName();
        this.f61700e = Uri.parse("content://" + this.f61698c + c.userBaseDel + "REPORTS");
        this.f61703h = "vnd.android.cursor.dir/CrashReporter.Reports";
        this.f61704i = "vnd.android.cursor.item/CrashReporter/Reports";
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int iMatch = this.f61699d.match(uri);
        if (iMatch == 1) {
            return I4.c();
        }
        if (iMatch == 2) {
            return I4.a(Integer.parseInt(uri.getLastPathSegment()));
        }
        throw new IllegalArgumentException("Invalid URI: " + uri);
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
