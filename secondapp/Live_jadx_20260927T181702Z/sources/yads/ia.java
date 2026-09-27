package yads;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ia {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rb2 f150485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WebView f150486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f150487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f150488d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f150489e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f150490f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f150491g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ja f150492h;

    public ia(rb2 rb2Var, String str, List list) {
        ja jaVar = ja.f150984d;
        ArrayList arrayList = new ArrayList();
        this.f150487c = arrayList;
        this.f150488d = new HashMap();
        this.f150485a = rb2Var;
        this.f150486b = null;
        this.f150489e = str;
        this.f150492h = jaVar;
        arrayList.addAll(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            md3 md3Var = (md3) it.next();
            this.f150488d.put(UUID.randomUUID().toString(), md3Var);
        }
        this.f150491g = null;
        this.f150490f = null;
    }

    public final ja a() {
        return this.f150492h;
    }

    public final Map b() {
        return Collections.unmodifiableMap(this.f150488d);
    }

    public final String c() {
        return this.f150489e;
    }

    public final WebView d() {
        return this.f150486b;
    }
}
