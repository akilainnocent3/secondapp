package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import defpackage.b9p;
import defpackage.jk40;
import defpackage.km20;
import defpackage.pe4;
import defpackage.rc;
import defpackage.u8i;
import defpackage.v8i;
import defpackage.v9i;
import defpackage.xna;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class g extends d.c {

    public static class a {
    }

    public static class b implements d.h {
        public final Context a;
        public final v8i b;
        public final Object c = new Object();
        public Handler d;
        public ThreadPoolExecutor e;
        public ThreadPoolExecutor f;
        public d.i g;

        public b(Context context, v8i v8iVar) {
            km20.f(context, "Context cannot be null");
            this.a = context.getApplicationContext();
            this.b = v8iVar;
        }

        @Override // androidx.emoji2.text.d.h
        public final void a(d.i iVar) {
            synchronized (this.c) {
                this.g = iVar;
            }
            synchronized (this.c) {
                try {
                    if (this.g == null) {
                        return;
                    }
                    ThreadPoolExecutor threadPoolExecutor = this.e;
                    int i = 1;
                    if (threadPoolExecutor == null) {
                        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new xna("emojiCompat"));
                        threadPoolExecutor2.allowCoreThreadTimeOut(true);
                        this.f = threadPoolExecutor2;
                        this.e = threadPoolExecutor2;
                        threadPoolExecutor = threadPoolExecutor2;
                    }
                    threadPoolExecutor.execute(new rc(this, i));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void b() {
            synchronized (this.c) {
                try {
                    this.g = null;
                    Handler handler = this.d;
                    if (handler != null) {
                        handler.removeCallbacks(null);
                    }
                    this.d = null;
                    ThreadPoolExecutor threadPoolExecutor = this.f;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.e = null;
                    this.f = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final v9i.b c() {
            try {
                Context context = this.a;
                Object[] objArr = {this.b};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
                v9i.a aVarA = u8i.a(context, Collections.unmodifiableList(arrayList));
                int i = aVarA.a;
                if (i != 0) {
                    b9p.a(pe4.b(i, "fetchFonts failed (", ")"));
                    return null;
                }
                v9i.b[] bVarArr = aVarA.b.get(0);
                if (bVarArr != null && bVarArr.length != 0) {
                    return bVarArr[0];
                }
                b9p.a("fetchFonts failed (empty result)");
                return null;
            } catch (PackageManager.NameNotFoundException e) {
                jk40.a("provider not found", e);
                return null;
            }
        }
    }
}
