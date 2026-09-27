package ql;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f122530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f122531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f122532c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f122534e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @k.h1
    @k.a0("internalQueue")
    public final ArrayDeque<String> f122533d = new ArrayDeque<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @k.a0("internalQueue")
    public boolean f122535f = false;

    public y0(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f122530a = sharedPreferences;
        this.f122531b = str;
        this.f122532c = str2;
        this.f122534e = executor;
    }

    @k.i1
    public static y0 j(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        y0 y0Var = new y0(sharedPreferences, str, str2, executor);
        y0Var.k();
        return y0Var;
    }

    public boolean b(@NonNull String str) {
        boolean zF;
        if (TextUtils.isEmpty(str) || str.contains(this.f122532c)) {
            return false;
        }
        synchronized (this.f122533d) {
            zF = f(this.f122533d.add(str));
        }
        return zF;
    }

    @k.a0("internalQueue")
    public void c() {
        this.f122535f = true;
    }

    @k.h1
    public void d() {
        synchronized (this.f122533d) {
            c();
        }
    }

    @k.a0("internalQueue")
    public final String e(String str) {
        f(str != null);
        return str;
    }

    @k.a0("internalQueue")
    public final boolean f(boolean z10) {
        if (z10 && !this.f122535f) {
            s();
        }
        return z10;
    }

    public void g() {
        synchronized (this.f122533d) {
            this.f122533d.clear();
            f(true);
        }
    }

    @k.a0("internalQueue")
    public void h() {
        this.f122535f = false;
        s();
    }

    @k.h1
    public void i() {
        synchronized (this.f122533d) {
            h();
        }
    }

    @k.i1
    public final void k() {
        synchronized (this.f122533d) {
            try {
                this.f122533d.clear();
                String string = this.f122530a.getString(this.f122531b, "");
                if (!TextUtils.isEmpty(string) && string.contains(this.f122532c)) {
                    String[] strArrSplit = string.split(this.f122532c, -1);
                    if (strArrSplit.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            this.f122533d.add(str);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Nullable
    public String l() {
        String strPeek;
        synchronized (this.f122533d) {
            strPeek = this.f122533d.peek();
        }
        return strPeek;
    }

    public String m() {
        String strE;
        synchronized (this.f122533d) {
            strE = e(this.f122533d.remove());
        }
        return strE;
    }

    public boolean n(@Nullable Object obj) {
        boolean zF;
        synchronized (this.f122533d) {
            zF = f(this.f122533d.remove(obj));
        }
        return zF;
    }

    @NonNull
    @k.a0("internalQueue")
    public String o() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it = this.f122533d.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            sb2.append(this.f122532c);
        }
        return sb2.toString();
    }

    @k.h1
    public String p() {
        String strO;
        synchronized (this.f122533d) {
            strO = o();
        }
        return strO;
    }

    public int q() {
        int size;
        synchronized (this.f122533d) {
            size = this.f122533d.size();
        }
        return size;
    }

    @k.i1
    public final void r() {
        synchronized (this.f122533d) {
            this.f122530a.edit().putString(this.f122531b, o()).commit();
        }
    }

    public final void s() {
        this.f122534e.execute(new Runnable() { // from class: ql.x0
            @Override // java.lang.Runnable
            public final void run() {
                this.f122527b.r();
            }
        });
    }

    @NonNull
    public List<String> t() {
        ArrayList arrayList;
        synchronized (this.f122533d) {
            arrayList = new ArrayList(this.f122533d);
        }
        return arrayList;
    }
}
