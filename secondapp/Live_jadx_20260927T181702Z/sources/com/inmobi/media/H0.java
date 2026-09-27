package com.inmobi.media;

import android.content.ContentValues;
import com.inmobi.adquality.models.AdQualityResult;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class H0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3688g9 f54749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f54750b;

    public H0(C3688g9 databaseHelper) {
        kotlin.jvm.internal.m0.p(databaseHelper, "databaseHelper");
        this.f54749a = databaseHelper;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(AdQualityResult adQualityResult, rr.d dVar) {
        G0 g10;
        C4152z0 c4152z0;
        if (dVar instanceof G0) {
            g10 = (G0) dVar;
            int i10 = g10.f54691c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                g10.f54691c = i10 - Integer.MIN_VALUE;
            } else {
                g10 = new G0(this, dVar);
            }
        } else {
            g10 = new G0(this, dVar);
        }
        Object obj = g10.f54689a;
        Object objL = qr.d.l();
        int i11 = g10.f54691c;
        if (i11 == 0) {
            dr.j1.n(obj);
            C3688g9 c3688g9 = this.f54749a;
            kotlin.jvm.internal.m0.p(adQualityResult, "<this>");
            ContentValues contentValues = new ContentValues();
            contentValues.put("image_location", adQualityResult.getImageLocation());
            String sdkModelResult = adQualityResult.getSdkModelResult();
            if (sdkModelResult == null) {
                sdkModelResult = "";
            }
            contentValues.put("sdk_model_result", sdkModelResult);
            contentValues.put("beacon_url", adQualityResult.getBeaconUrl());
            contentValues.put("extras", adQualityResult.getExtras());
            g10.f54691c = 1;
            if (c3688g9.a("ad_quality_db", contentValues, 4, g10) == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dr.j1.n(obj);
        }
        WeakReference weakReference = this.f54750b;
        if (weakReference != null && (c4152z0 = (C4152z0) weakReference.get()) != null && c4152z0.f58233a.f54313b.get()) {
            c4152z0.f58233a.f54313b.set(false);
            c4152z0.f58233a.a();
        }
        return dr.w2.f79517a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(rr.d dVar) {
        F0 f10;
        if (dVar instanceof F0) {
            f10 = (F0) dVar;
            int i10 = f10.f54600c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                f10.f54600c = i10 - Integer.MIN_VALUE;
            } else {
                f10 = new F0(this, dVar);
            }
        } else {
            f10 = new F0(this, dVar);
        }
        Object objA = f10.f54598a;
        Object objL = qr.d.l();
        int i11 = f10.f54600c;
        if (i11 == 0) {
            dr.j1.n(objA);
            C3688g9 c3688g9 = this.f54749a;
            f10.f54600c = 1;
            c3688g9.getClass();
            objA = c3688g9.a(new C3585c9(c3688g9, "SELECT * FROM ad_quality_db", null), f10);
            if (objA == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dr.j1.n(objA);
        }
        Iterable<ContentValues> iterable = (Iterable) objA;
        ArrayList arrayList = new ArrayList(fr.i0.d0(iterable, 10));
        for (ContentValues contentValues : iterable) {
            kotlin.jvm.internal.m0.p(contentValues, "<this>");
            String asString = contentValues.getAsString("image_location");
            kotlin.jvm.internal.m0.o(asString, "getAsString(...)");
            String asString2 = contentValues.getAsString("sdk_model_result");
            String asString3 = contentValues.getAsString("beacon_url");
            kotlin.jvm.internal.m0.o(asString3, "getAsString(...)");
            arrayList.add(new AdQualityResult(asString, asString2, asString3, contentValues.getAsString("extras")));
        }
        return arrayList;
    }
}
