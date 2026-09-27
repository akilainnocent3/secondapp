package com.inmobi.media;

import com.google.android.gms.cast.CastStatusCodes;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ads.network.common.model.AdResponse;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class U0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final U0 f55591a = new U0();

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object a(String str, rr.d dVar) {
        T0 t10;
        int i10;
        if (dVar instanceof T0) {
            t10 = (T0) dVar;
            int i11 = t10.f55529c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                t10.f55529c = i11 - Integer.MIN_VALUE;
            } else {
                t10 = new T0(this, dVar);
            }
        } else {
            t10 = new T0(this, dVar);
        }
        Object objCast = t10.f55527a;
        Object objL = qr.d.l();
        int i12 = t10.f55529c;
        try {
            if (i12 == 0) {
                dr.j1.n(objCast);
                kotlin.jvm.internal.m0.p(AdResponse.class, "clazz");
                kotlin.jvm.internal.m0.p(AdResponse.class, "type");
                t10.f55529c = 1;
                JSONObject jsonObject = new JSONObject(str);
                kotlin.jvm.internal.m0.p(jsonObject, "jsonObject");
                kotlin.jvm.internal.m0.p(AdResponse.class, "type");
                objCast = AdResponse.class.cast(AbstractC3838ma.a(jsonObject, AdResponse.class, null, null));
                if (objCast == objL) {
                    return objL;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dr.j1.n(objCast);
            }
            AdResponse adResponse = (AdResponse) objCast;
            if (adResponse != null) {
                return adResponse;
            }
            throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new Ni(fr.n1.j0(dr.v1.a("errorCode", rr.b.h((short) 2232)))));
        } catch (Exception e10) {
            if (e10 instanceof JSONException) {
                i10 = CastStatusCodes.ERROR_CAST_PLATFORM_NOT_CONNECTED;
            } else {
                i10 = e10 instanceof ClassCastException ? 2207 : com.ironsource.I9.a.f59255g;
            }
            e10.toString();
            throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new Ni(fr.n1.j0(dr.v1.a("errorCode", rr.b.h((short) i10)))));
        }
    }
}
