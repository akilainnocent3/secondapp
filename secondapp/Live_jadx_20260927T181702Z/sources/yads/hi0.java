package yads;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class hi0 extends kotlin.jvm.internal.o0 implements ds.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ii0 f150146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f150147c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hi0(ii0 ii0Var, ArrayList arrayList) {
        super(2);
        this.f150146b = ii0Var;
        this.f150147c = arrayList;
    }

    @Override // ds.p
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        JSONObject jSONObject = (JSONObject) obj;
        xh0 xh0Var = (xh0) obj2;
        this.f150146b.getClass();
        String str = null;
        if (jSONObject.has("view_name")) {
            try {
                obj3 = jSONObject.get("view_name");
            } catch (JSONException unused) {
                obj3 = null;
            }
            if (obj3 instanceof String) {
                str = (String) obj3;
            }
        }
        if (str != null) {
            this.f150147c.add(new wh0(xh0Var, str));
        }
        return dr.w2.f79517a;
    }
}
