package sg.bigo.ads.core.b.b;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    sg.bigo.ads.core.b.c.b.AbstractRunnableC1372b f134533a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final b f134534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final sg.bigo.ads.common.g f134535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Context f134536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final sg.bigo.ads.core.b.a.a f134537e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final sg.bigo.ads.common.j f134538f;

    public a(Context context, sg.bigo.ads.core.b.a.a aVar, sg.bigo.ads.common.j jVar, sg.bigo.ads.common.g gVar) {
        this.f134536d = context;
        this.f134534b = new b(aVar);
        this.f134537e = aVar;
        this.f134538f = jVar;
        this.f134535c = gVar;
    }

    public final void a() {
        sg.bigo.ads.core.b.c.b.a(this.f134533a);
        this.f134533a = null;
        final List<sg.bigo.ads.common.g.b.a> listA = this.f134534b.a();
        if (listA.isEmpty()) {
            sg.bigo.ads.common.t.a.b("Callback", "sendGeneralStats but event list is empty!!");
            return;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<sg.bigo.ads.common.g.b.a> it = listA.iterator();
        while (it.hasNext()) {
            try {
                jSONArray.put(new JSONObject(it.next().f133037c));
            } catch (JSONException unused) {
            }
        }
        HashMap map = new HashMap();
        map.put("events", jSONArray);
        this.f134538f.a(map, new sg.bigo.ads.common.j.a() { // from class: sg.bigo.ads.core.b.b.a.3
            @Override // sg.bigo.ads.common.j.a
            public final void a() {
                sg.bigo.ads.core.b.c.b.a(new Runnable() { // from class: sg.bigo.ads.core.b.b.a.3.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                        a.this.f134534b.a(listA, true);
                        a.this.f134534b.d();
                        if (a.this.f134534b.c()) {
                            return;
                        }
                        a.this.b();
                    }
                });
            }

            @Override // sg.bigo.ads.common.j.a
            public final void a(int i10, int i11, String str) {
                sg.bigo.ads.core.b.c.b.a(new Runnable() { // from class: sg.bigo.ads.core.b.b.a.3.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                        a.this.f134534b.a(listA, false);
                        a.this.b();
                    }
                });
            }
        });
    }

    public final void b() {
        if (this.f134533a != null) {
            return;
        }
        this.f134533a = sg.bigo.ads.core.b.c.b.a(new Runnable() { // from class: sg.bigo.ads.core.b.b.a.2
            @Override // java.lang.Runnable
            public final void run() {
                if (sg.bigo.ads.common.aa.c.b(a.this.f134536d)) {
                    a.this.a();
                    return;
                }
                a aVar = a.this;
                aVar.f134533a = null;
                aVar.b();
            }
        }, this.f134537e.f134520b);
    }

    public final void a(@NonNull final String str, @NonNull final JSONObject jSONObject) {
        sg.bigo.ads.core.b.c.b.a(new Runnable() { // from class: sg.bigo.ads.core.b.b.a.1
            @Override // java.lang.Runnable
            public final void run() {
                sg.bigo.ads.common.g.b.a aVar = new sg.bigo.ads.common.g.b.a(str, jSONObject.toString());
                a.this.f134534b.a(aVar);
                if (TextUtils.isEmpty(a.this.f134535c.P())) {
                    return;
                }
                if ("impression".equals(str) || "clicked".equals(str)) {
                    sg.bigo.ads.common.t.a.a(0, 3, "Callback", "SendImmediately -> action=" + str + ", eventInfo=" + aVar.toString());
                    a.this.a();
                    return;
                }
                sg.bigo.ads.common.t.a.a(0, 3, "Callback", "SendDefer -> action=" + str + ", eventInfo=" + aVar.toString());
                a.a(a.this);
            }
        });
    }

    public static /* synthetic */ void a(a aVar) {
        if (aVar.f134534b.b() >= aVar.f134537e.f134519a) {
            aVar.a();
        } else {
            if (aVar.f134534b.c()) {
                return;
            }
            aVar.b();
        }
    }
}
