package yads;

import android.webkit.WebView;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class ka {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f151442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public hw3 f151443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e4 f151444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public il1 f151445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f151446e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f151447f;

    public ka(String str) {
        a();
        this.f151442a = str;
        this.f151443b = new hw3(null);
    }

    public final void a(WebView webView) {
        this.f151443b = new hw3(webView);
    }

    public void b() {
        this.f151443b.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(String str, JSONObject jSONObject) {
        ix3.f150854a.a((WebView) this.f151443b.get(), "publishMediaEvent", str, jSONObject, this.f151442a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void a(ha haVar) {
        ix3 ix3Var = ix3.f150854a;
        WebView webView = (WebView) this.f151443b.get();
        String str = this.f151442a;
        JSONObject jSONObject = new JSONObject();
        lw3.a(jSONObject, "impressionOwner", haVar.f150023a);
        lw3.a(jSONObject, "mediaEventsOwner", haVar.f150024b);
        lw3.a(jSONObject, "creativeType", haVar.f150026d);
        lw3.a(jSONObject, "impressionType", haVar.f150027e);
        lw3.a(jSONObject, "isolateVerificationScripts", Boolean.valueOf(haVar.f150025c));
        ix3Var.a(webView, "init", jSONObject, str);
    }

    public void a(wv3 wv3Var, ia iaVar) {
        a(wv3Var, iaVar, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(wv3 wv3Var, ia iaVar, JSONObject jSONObject) {
        String str = wv3Var.f157555h;
        JSONObject jSONObject2 = new JSONObject();
        lw3.a(jSONObject2, "environment", "app");
        lw3.a(jSONObject2, "adSessionType", iaVar.f150492h);
        lw3.a(jSONObject2, "deviceInfo", ew3.a());
        lw3.a(jSONObject2, "deviceCategory", gg0.a(sv3.a()));
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        lw3.a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        lw3.a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, iaVar.f150485a.f154857a);
        lw3.a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, iaVar.f150485a.f154858b);
        lw3.a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        lw3.a(jSONObject4, "libraryVersion", "1.5.6-Yandex");
        lw3.a(jSONObject4, "appId", fx3.f149293b.f149294a.getApplicationContext().getPackageName());
        lw3.a(jSONObject2, "app", jSONObject4);
        String str2 = iaVar.f150491g;
        if (str2 != null) {
            lw3.a(jSONObject2, "contentUrl", str2);
        }
        String str3 = iaVar.f150490f;
        if (str3 != null) {
            lw3.a(jSONObject2, "customReferenceData", str3);
        }
        JSONObject jSONObject5 = new JSONObject();
        for (md3 md3Var : Collections.unmodifiableList(iaVar.f150487c)) {
            lw3.a(jSONObject5, md3Var.f152415a, md3Var.f152417c);
        }
        ix3.f150854a.a((WebView) this.f151443b.get(), "startSession", str, jSONObject2, jSONObject5, jSONObject);
    }

    public final void a() {
        this.f151447f = System.nanoTime();
        this.f151446e = 1;
    }

    public void c() {
    }
}
