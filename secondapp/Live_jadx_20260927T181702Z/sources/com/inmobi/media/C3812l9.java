package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.l9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C3812l9 implements Gg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f56915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InMobiJsonResponse f56916b;

    public C3812l9(String content) {
        kotlin.jvm.internal.m0.p(content, "content");
        this.f56915a = content;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // com.inmobi.media.Gg
    public final Object a(or.f fVar) {
        C3787k9 c3787k9;
        int i10;
        C3812l9 c3812l9;
        if (fVar instanceof C3787k9) {
            c3787k9 = (C3787k9) fVar;
            int i11 = c3787k9.f56807d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c3787k9.f56807d = i11 - Integer.MIN_VALUE;
            } else {
                c3787k9 = new C3787k9(this, (rr.d) fVar);
            }
        } else {
            c3787k9 = new C3787k9(this, (rr.d) fVar);
        }
        Object objCast = c3787k9.f56805b;
        Object objL = qr.d.l();
        int i12 = c3787k9.f56807d;
        try {
            if (i12 == 0) {
                dr.j1.n(objCast);
                kotlin.jvm.internal.m0.p(InMobiJsonResponse.class, "clazz");
                kotlin.jvm.internal.m0.p(InMobiJsonResponse.class, "type");
                String str = this.f56915a;
                c3787k9.f56804a = this;
                c3787k9.f56807d = 1;
                JSONObject jsonObject = new JSONObject(str);
                kotlin.jvm.internal.m0.p(jsonObject, "jsonObject");
                kotlin.jvm.internal.m0.p(InMobiJsonResponse.class, "type");
                objCast = InMobiJsonResponse.class.cast(AbstractC3838ma.a(jsonObject, InMobiJsonResponse.class, null, null));
                if (objCast == objL) {
                    return objL;
                }
                c3812l9 = this;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c3812l9 = c3787k9.f56804a;
                dr.j1.n(objCast);
            }
            c3812l9.f56916b = (InMobiJsonResponse) objCast;
            return dr.w2.f79517a;
        } catch (Throwable th2) {
            dr.t.i(th2);
            if (th2 instanceof JSONException) {
                i10 = 2309;
            } else {
                i10 = th2 instanceof ClassCastException ? 2310 : 2311;
            }
            throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new Ni(fr.n1.j0(dr.v1.a("errorCode", rr.b.h((short) i10)))));
        }
    }

    @Override // com.inmobi.media.Gg
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InMobiJsonResponse b() {
        Objects.toString(this.f56916b);
        return this.f56916b;
    }

    @Override // com.inmobi.media.Gg
    public final void a() {
        if (this.f56916b == null || this.f56915a.length() == 0) {
            throw new Ig(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new Ni(fr.n1.j0(dr.v1.a("errorCode", (short) 3))));
        }
    }
}
