package com.iab.omid.library.bigosg.walking;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.VisibleForTesting;
import android.view.View;
import com.iab.omid.library.bigosg.d.d;
import com.iab.omid.library.bigosg.d.f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class TreeWalker implements com.iab.omid.library.bigosg.c.a.InterfaceC0492a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static TreeWalker f52812a = new TreeWalker();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Handler f52813b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Handler f52814c = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Runnable f52815j = new Runnable() { // from class: com.iab.omid.library.bigosg.walking.TreeWalker.2
        @Override // java.lang.Runnable
        public final void run() {
            TreeWalker.getInstance().h();
        }
    };

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Runnable f52816k = new Runnable() { // from class: com.iab.omid.library.bigosg.walking.TreeWalker.3
        @Override // java.lang.Runnable
        public final void run() {
            if (TreeWalker.f52814c != null) {
                TreeWalker.f52814c.post(TreeWalker.f52815j);
                TreeWalker.f52814c.postDelayed(TreeWalker.f52816k, 200L);
            }
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f52818e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f52822i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f52817d = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a f52820g = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.bigosg.c.b f52819f = new com.iab.omid.library.bigosg.c.b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b f52821h = new b(new com.iab.omid.library.bigosg.walking.a.c());

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i10, long j10);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i10, long j10);
    }

    public static TreeWalker getInstance() {
        return f52812a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        i();
        d();
        j();
    }

    private void i() {
        this.f52818e = 0;
        this.f52822i = d.a();
    }

    private void j() {
        a(d.a() - this.f52822i);
    }

    private void k() {
        if (f52814c == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f52814c = handler;
            handler.post(f52815j);
            f52814c.postDelayed(f52816k, 200L);
        }
    }

    private void l() {
        Handler handler = f52814c;
        if (handler != null) {
            handler.removeCallbacks(f52816k);
            f52814c = null;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f52817d.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f52817d.add(treeWalkerTimeLogger);
    }

    public void b() {
        c();
        this.f52817d.clear();
        f52813b.post(new Runnable() { // from class: com.iab.omid.library.bigosg.walking.TreeWalker.1
            @Override // java.lang.Runnable
            public void run() {
                TreeWalker.this.f52821h.a();
            }
        });
    }

    public void c() {
        l();
    }

    @VisibleForTesting
    public void d() {
        this.f52820g.c();
        long jA = d.a();
        com.iab.omid.library.bigosg.c.a aVarA = this.f52819f.a();
        if (this.f52820g.b().size() > 0) {
            for (String str : this.f52820g.b()) {
                JSONObject jSONObjectA = aVarA.a(null);
                a(str, this.f52820g.b(str), jSONObjectA);
                com.iab.omid.library.bigosg.d.b.a(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.f52821h.b(jSONObjectA, hashSet, jA);
            }
        }
        if (this.f52820g.a().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            a(null, aVarA, jSONObjectA2, c.PARENT_VIEW);
            com.iab.omid.library.bigosg.d.b.a(jSONObjectA2);
            this.f52821h.a(jSONObjectA2, this.f52820g.a(), jA);
        } else {
            this.f52821h.a();
        }
        this.f52820g.d();
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f52817d.contains(treeWalkerTimeLogger)) {
            this.f52817d.remove(treeWalkerTimeLogger);
        }
    }

    private void b(View view, JSONObject jSONObject) {
        a.C0493a c0493aB = this.f52820g.b(view);
        if (c0493aB != null) {
            com.iab.omid.library.bigosg.d.b.a(jSONObject, c0493aB);
        }
    }

    public void a() {
        k();
    }

    private void a(long j10) {
        if (this.f52817d.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f52817d) {
                treeWalkerTimeLogger.onTreeProcessed(this.f52818e, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f52818e, j10);
                }
            }
        }
    }

    @Override // com.iab.omid.library.bigosg.c.a.InterfaceC0492a
    public void a(View view, com.iab.omid.library.bigosg.c.a aVar, JSONObject jSONObject) {
        c cVarC;
        if (f.d(view) && (cVarC = this.f52820g.c(view)) != c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.bigosg.d.b.a(jSONObject, jSONObjectA);
            if (!a(view, jSONObjectA)) {
                b(view, jSONObjectA);
                a(view, aVar, jSONObjectA, cVarC);
            }
            this.f52818e++;
        }
    }

    private void a(View view, com.iab.omid.library.bigosg.c.a aVar, JSONObject jSONObject, c cVar) {
        aVar.a(view, jSONObject, this, cVar == c.PARENT_VIEW);
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.bigosg.c.a aVarB = this.f52819f.b();
        String strA = this.f52820g.a(str);
        if (strA != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.bigosg.d.b.a(jSONObjectA, str);
            com.iab.omid.library.bigosg.d.b.b(jSONObjectA, strA);
            com.iab.omid.library.bigosg.d.b.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        String strA = this.f52820g.a(view);
        if (strA == null) {
            return false;
        }
        com.iab.omid.library.bigosg.d.b.a(jSONObject, strA);
        this.f52820g.e();
        return true;
    }
}
