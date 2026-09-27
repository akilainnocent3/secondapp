package com.inmobi.media;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: renamed from: com.inmobi.media.g9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C3688g9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4111x9 f56490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3783k5 f56491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SQLiteDatabase f56492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SQLiteDatabase f56493d;

    public C3688g9(C4111x9 sqLiteOpenHelper, C3783k5 databaseConfig) {
        kotlin.jvm.internal.m0.p(sqLiteOpenHelper, "sqLiteOpenHelper");
        kotlin.jvm.internal.m0.p(databaseConfig, "databaseConfig");
        this.f56490a = sqLiteOpenHelper;
        this.f56491b = databaseConfig;
    }

    public final Object a(String str, ContentValues contentValues, int i10, rr.d dVar) {
        Object objA = a(new C3662f9(this, new C3611d9(str, contentValues, i10, null), null), dVar);
        return objA == qr.d.l() ? objA : dr.w2.f79517a;
    }

    public static Object a(C3688g9 c3688g9, String str, ContentValues contentValues, String str2, String[] strArr, rr.d dVar, int i10) {
        String str3 = (i10 & 4) != 0 ? null : str2;
        String[] strArr2 = (i10 & 8) != 0 ? null : strArr;
        c3688g9.getClass();
        Object objA = c3688g9.a(new C3662f9(c3688g9, new C3636e9(str, contentValues, str3, strArr2, null), null), dVar);
        return objA == qr.d.l() ? objA : dr.w2.f79517a;
    }

    public static /* synthetic */ Object a(C3688g9 c3688g9, String str, String str2, rr.d dVar, int i10) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return c3688g9.a(str, str2, (String[]) null, dVar);
    }

    public final Object a(String str, String str2, String[] strArr, or.f fVar) {
        Object objA = a(new C3662f9(this, new Z8(str, str2, strArr, null), null), fVar);
        return objA == qr.d.l() ? objA : dr.w2.f79517a;
    }

    public final Object a(String str, rr.d dVar) {
        Object objA = a(new C3662f9(this, new C3533a9(str, null), null), dVar);
        return objA == qr.d.l() ? objA : dr.w2.f79517a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ds.l lVar, or.f fVar) {
        C3559b9 c3559b9;
        if (fVar instanceof C3559b9) {
            c3559b9 = (C3559b9) fVar;
            int i10 = c3559b9.f56057d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3559b9.f56057d = i10 - Integer.MIN_VALUE;
            } else {
                c3559b9 = new C3559b9(this, fVar);
            }
        } else {
            c3559b9 = new C3559b9(this, fVar);
        }
        Object obj = c3559b9.f56055b;
        Object objL = qr.d.l();
        int i11 = c3559b9.f56057d;
        if (i11 == 0) {
            dr.j1.n(obj);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dr.j1.n(obj);
                return obj;
            }
            lVar = c3559b9.f56054a;
            dr.j1.n(obj);
            if (obj != null) {
                return obj;
            }
        }
        c3559b9.f56054a = null;
        c3559b9.f56057d = 2;
        Object objInvoke = lVar.invoke(c3559b9);
        return objInvoke == objL ? objL : objInvoke;
    }
}
