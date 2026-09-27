package yads;

import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import android.webkit.WebView;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class wv3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ia f157548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ha f157549b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public vv3 f157551d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ka f157552e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f157555h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f157556i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f157557j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dx3 f157550c = new dx3();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f157553f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f157554g = false;

    public wv3(ha haVar, ia iaVar, String str) {
        ka rv3Var;
        this.f157549b = haVar;
        this.f157548a = iaVar;
        this.f157555h = str;
        a();
        if (iaVar.a() == ja.f150983c || iaVar.a() == ja.f150985e) {
            rv3Var = new rv3(iaVar.d(), str);
        } else {
            rv3Var = new dw3(str, iaVar.c(), iaVar.b());
        }
        this.f157552e = rv3Var;
        this.f157552e.c();
        nw3.a().a(this);
        this.f157552e.a(haVar);
    }

    public final void a(View view, yx0 yx0Var, String str) {
        xw3 xw3Var;
        if (this.f157554g) {
            return;
        }
        dx3 dx3Var = this.f157550c;
        dx3Var.getClass();
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!dx3.f148405b.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
        Iterator it = dx3Var.f148406a.iterator();
        do {
            if (!it.hasNext()) {
                xw3Var = null;
                break;
            }
            xw3Var = (xw3) it.next();
        } while (xw3Var.f158032a.get() != view);
        if (xw3Var == null) {
            dx3Var.f148406a.add(new xw3(view, yx0Var, str));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        if (this.f157554g) {
            return;
        }
        this.f157551d.clear();
        if (!this.f157554g) {
            this.f157550c.f148406a.clear();
        }
        this.f157554g = true;
        ka kaVar = this.f157552e;
        ix3.f150854a.a((WebView) kaVar.f151443b.get(), "finishSession", kaVar.f151442a);
        nw3 nw3Var = nw3.f153242c;
        boolean z10 = nw3Var.f153244b.size() > 0;
        nw3Var.f153243a.remove(this);
        nw3Var.f153244b.remove(this);
        if (z10 && nw3Var.f153244b.size() <= 0) {
            jx3 jx3VarA = jx3.a();
            jx3VarA.getClass();
            x83 x83Var = x83.f157726g;
            x83Var.getClass();
            Handler handler = x83.f157728i;
            if (handler != null) {
                handler.removeCallbacks(x83.f157730k);
                x83.f157728i = null;
            }
            x83Var.f157731a.clear();
            x83.f157727h.post(new u83(x83Var));
            bw3 bw3Var = bw3.f147384d;
            bw3Var.f155171a = false;
            bw3Var.f155173c = null;
            vw3 vw3Var = jx3VarA.f151307d;
            vw3Var.f157113b.getContentResolver().unregisterContentObserver(vw3Var);
        }
        this.f157552e.b();
        this.f157552e = null;
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
    public final void c() {
        if (this.f157553f || this.f157552e == null) {
            return;
        }
        this.f157553f = true;
        nw3 nw3Var = nw3.f153242c;
        boolean z10 = nw3Var.f153244b.size() > 0;
        nw3Var.f153244b.add(this);
        if (!z10) {
            jx3 jx3VarA = jx3.a();
            jx3VarA.getClass();
            bw3 bw3Var = bw3.f147384d;
            bw3Var.f155173c = jx3VarA;
            bw3Var.b();
            x83.f157726g.getClass();
            if (x83.f157728i == null) {
                Handler handler = new Handler(Looper.getMainLooper());
                x83.f157728i = handler;
                handler.post(x83.f157729j);
                x83.f157728i.postDelayed(x83.f157730k, 200L);
            }
            vw3 vw3Var = jx3VarA.f151307d;
            vw3Var.f157119h.submit(new qw3(vw3Var));
            vw3Var.f157113b.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, vw3Var);
        }
        float f10 = jx3.a().f151304a;
        ka kaVar = this.f157552e;
        ix3 ix3Var = ix3.f150854a;
        ix3Var.a((WebView) kaVar.f151443b.get(), "setDeviceVolume", Float.valueOf(f10), kaVar.f151442a);
        ka kaVar2 = this.f157552e;
        Date date = pv3.f154156f.f154158b;
        Date date2 = date != null ? (Date) date.clone() : null;
        kaVar2.getClass();
        if (date2 != null) {
            JSONObject jSONObject = new JSONObject();
            lw3.a(jSONObject, "timestamp", Long.valueOf(date2.getTime()));
            ix3Var.a((WebView) kaVar2.f151443b.get(), "setLastActivity", jSONObject);
        }
        this.f157552e.a(this, this.f157548a);
    }

    public final void a() {
        this.f157551d = new vv3(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(View view) {
        if (this.f157554g || ((View) this.f157551d.get()) == view) {
            return;
        }
        this.f157551d = new vv3(view);
        this.f157552e.a();
        Collection<wv3> collectionUnmodifiableCollection = Collections.unmodifiableCollection(nw3.f153242c.f153243a);
        if (collectionUnmodifiableCollection == null || collectionUnmodifiableCollection.isEmpty()) {
            return;
        }
        for (wv3 wv3Var : collectionUnmodifiableCollection) {
            if (wv3Var != this && ((View) wv3Var.f157551d.get()) == view) {
                wv3Var.f157551d.clear();
            }
        }
    }
}
