package com.inmobi.media;

import android.content.ContentValues;
import com.inmobi.media.core.config.models.Config;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.a4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C3528a4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3688g9 f55927a;

    public C3528a4(C3688g9 databaseHelper) {
        kotlin.jvm.internal.m0.p(databaseHelper, "databaseHelper");
        this.f55927a = databaseHelper;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(rr.d dVar) {
        Z3 z10;
        Config config;
        if (dVar instanceof Z3) {
            z10 = (Z3) dVar;
            int i10 = z10.f55871c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                z10.f55871c = i10 - Integer.MIN_VALUE;
            } else {
                z10 = new Z3(this, dVar);
            }
        } else {
            z10 = new Z3(this, dVar);
        }
        Object objA = z10.f55869a;
        Object objL = qr.d.l();
        int i11 = z10.f55871c;
        if (i11 == 0) {
            dr.j1.n(objA);
            C3688g9 c3688g9 = this.f55927a;
            z10.f55871c = 1;
            c3688g9.getClass();
            objA = c3688g9.a(new C3585c9(c3688g9, "SELECT * FROM config_db", null), z10);
            if (objA == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dr.j1.n(objA);
        }
        ((List) objA).toString();
        ArrayList arrayList = new ArrayList();
        for (ContentValues contentValues : (Iterable) objA) {
            kotlin.jvm.internal.m0.p(contentValues, "<this>");
            String asString = contentValues.getAsString("config_value");
            Long asLong = contentValues.getAsLong("update_ts");
            try {
                JSONObject jsonObject = new JSONObject(asString);
                String configType = contentValues.getAsString("config_type");
                kotlin.jvm.internal.m0.o(configType, "getAsString(...)");
                kotlin.jvm.internal.m0.m(asLong);
                long jLongValue = asLong.longValue();
                kotlin.jvm.internal.m0.p(configType, "configType");
                Class type = AbstractC4006t4.a(configType);
                kotlin.jvm.internal.m0.p(jsonObject, "jsonObject");
                kotlin.jvm.internal.m0.p(type, "type");
                config = (Config) type.cast(AbstractC3838ma.a(jsonObject, type, null, null));
                if (config != null) {
                    config.setLastUpdateTimeStamp(jLongValue);
                } else {
                    config = null;
                }
            } catch (Exception unused) {
            }
            String.valueOf(config);
            if (config != null) {
                arrayList.add(config);
            }
        }
        return arrayList;
    }
}
