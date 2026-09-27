package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.manager.p;
import com.bumptech.glide.manager.q;
import com.bumptech.glide.manager.t;
import java.io.File;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import k.a0;
import k.r0;
import k.u;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class n implements ComponentCallbacks2, com.bumptech.glide.manager.k, h<m<Drawable>> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final lc.i f31538n = lc.i.Z0(Bitmap.class).k0();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final lc.i f31539o = lc.i.Z0(hc.c.class).k0();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final lc.i f31540p = lc.i.a1(vb.j.f140734c).y0(i.LOW).H0(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.b f31541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f31542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.bumptech.glide.manager.j f31543d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @a0("this")
    public final q f31544e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @a0("this")
    public final p f31545f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @a0("this")
    public final t f31546g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Runnable f31547h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.bumptech.glide.manager.b f31548i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CopyOnWriteArrayList<lc.h<Object>> f31549j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @a0("this")
    public lc.i f31550k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f31551l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f31552m;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            n nVar = n.this;
            nVar.f31543d.d(nVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class c implements com.bumptech.glide.manager.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @a0("RequestManager.this")
        public final q f31554a;

        public c(q qVar) {
            this.f31554a = qVar;
        }

        @Override // com.bumptech.glide.manager.b.a
        public void a(boolean z10) {
            if (z10) {
                synchronized (n.this) {
                    this.f31554a.g();
                }
            }
        }
    }

    public n(@NonNull com.bumptech.glide.b bVar, @NonNull com.bumptech.glide.manager.j jVar, @NonNull p pVar, @NonNull Context context) {
        this(bVar, jVar, pVar, new q(), bVar.i(), context);
    }

    @NonNull
    @CheckResult
    public m<File> A(@Nullable Object obj) {
        return B().load(obj);
    }

    @NonNull
    @CheckResult
    public m<File> B() {
        return r(File.class).d(f31540p);
    }

    public List<lc.h<Object>> C() {
        return this.f31549j;
    }

    public synchronized lc.i D() {
        return this.f31550k;
    }

    @NonNull
    public <T> o<?, T> E(Class<T> cls) {
        return this.f31541b.k().e(cls);
    }

    public synchronized boolean F() {
        return this.f31544e.d();
    }

    @Override // com.bumptech.glide.h
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public m<Drawable> m(@Nullable Bitmap bitmap) {
        return t().m(bitmap);
    }

    @Override // com.bumptech.glide.h
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public m<Drawable> c(@Nullable Drawable drawable) {
        return t().c(drawable);
    }

    @Override // com.bumptech.glide.h
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public m<Drawable> i(@Nullable Uri uri) {
        return t().i(uri);
    }

    @Override // com.bumptech.glide.h
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public m<Drawable> b(@Nullable File file) {
        return t().b(file);
    }

    @Override // com.bumptech.glide.h
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public m<Drawable> o(@Nullable @r0 @u Integer num) {
        return t().o(num);
    }

    @Override // com.bumptech.glide.h
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public m<Drawable> load(@Nullable Object obj) {
        return t().load(obj);
    }

    @Override // com.bumptech.glide.h
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public m<Drawable> load(@Nullable String str) {
        return t().load(str);
    }

    @Override // com.bumptech.glide.h
    @CheckResult
    @Deprecated
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public m<Drawable> a(@Nullable URL url) {
        return t().a(url);
    }

    @Override // com.bumptech.glide.h
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public m<Drawable> j(@Nullable byte[] bArr) {
        return t().j(bArr);
    }

    public synchronized void P() {
        this.f31544e.e();
    }

    public synchronized void Q() {
        P();
        Iterator<n> it = this.f31545f.a().iterator();
        while (it.hasNext()) {
            it.next().P();
        }
    }

    public synchronized void R() {
        this.f31544e.f();
    }

    public synchronized void S() {
        R();
        Iterator<n> it = this.f31545f.a().iterator();
        while (it.hasNext()) {
            it.next().R();
        }
    }

    public synchronized void T() {
        this.f31544e.h();
    }

    public synchronized void U() {
        pc.o.b();
        T();
        Iterator<n> it = this.f31545f.a().iterator();
        while (it.hasNext()) {
            it.next().T();
        }
    }

    @NonNull
    public synchronized n V(@NonNull lc.i iVar) {
        X(iVar);
        return this;
    }

    public void W(boolean z10) {
        this.f31551l = z10;
    }

    public synchronized void X(@NonNull lc.i iVar) {
        this.f31550k = iVar.clone().e();
    }

    public synchronized void Y(@NonNull mc.p<?> pVar, @NonNull lc.e eVar) {
        this.f31546g.c(pVar);
        this.f31544e.i(eVar);
    }

    public synchronized boolean Z(@NonNull mc.p<?> pVar) {
        lc.e eVarE = pVar.e();
        if (eVarE == null) {
            return true;
        }
        if (!this.f31544e.b(eVarE)) {
            return false;
        }
        this.f31546g.i(pVar);
        pVar.g(null);
        return true;
    }

    public final void a0(@NonNull mc.p<?> pVar) {
        boolean Z = Z(pVar);
        lc.e eVarE = pVar.e();
        if (Z || this.f31541b.x(pVar) || eVarE == null) {
            return;
        }
        pVar.g(null);
        eVarE.clear();
    }

    public final synchronized void b0(@NonNull lc.i iVar) {
        this.f31550k = this.f31550k.d(iVar);
    }

    @Override // com.bumptech.glide.manager.k
    public synchronized void onDestroy() {
        this.f31546g.onDestroy();
        z();
        this.f31544e.c();
        this.f31543d.a(this);
        this.f31543d.a(this.f31548i);
        pc.o.z(this.f31547h);
        this.f31541b.C(this);
    }

    @Override // com.bumptech.glide.manager.k
    public synchronized void onStart() {
        T();
        this.f31546g.onStart();
    }

    @Override // com.bumptech.glide.manager.k
    public synchronized void onStop() {
        try {
            this.f31546g.onStop();
            if (this.f31552m) {
                z();
            } else {
                R();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        if (i10 == 60 && this.f31551l) {
            Q();
        }
    }

    public n p(lc.h<Object> hVar) {
        this.f31549j.add(hVar);
        return this;
    }

    @NonNull
    public synchronized n q(@NonNull lc.i iVar) {
        b0(iVar);
        return this;
    }

    @NonNull
    @CheckResult
    public <ResourceType> m<ResourceType> r(@NonNull Class<ResourceType> cls) {
        return new m<>(this.f31541b, this, cls, this.f31542c);
    }

    @NonNull
    @CheckResult
    public m<Bitmap> s() {
        return r(Bitmap.class).d(f31538n);
    }

    @NonNull
    @CheckResult
    public m<Drawable> t() {
        return r(Drawable.class);
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f31544e + ", treeNode=" + this.f31545f + "}";
    }

    @NonNull
    @CheckResult
    public m<File> u() {
        return r(File.class).d(lc.i.t1(true));
    }

    @NonNull
    @CheckResult
    public m<hc.c> v() {
        return r(hc.c.class).d(f31539o);
    }

    public void w(@NonNull View view) {
        x(new b(view));
    }

    public void x(@Nullable mc.p<?> pVar) {
        if (pVar == null) {
            return;
        }
        a0(pVar);
    }

    @NonNull
    public synchronized n y() {
        this.f31552m = true;
        return this;
    }

    public final synchronized void z() {
        try {
            Iterator<mc.p<?>> it = this.f31546g.b().iterator();
            while (it.hasNext()) {
                x(it.next());
            }
            this.f31546g.a();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public n(com.bumptech.glide.b bVar, com.bumptech.glide.manager.j jVar, p pVar, q qVar, com.bumptech.glide.manager.c cVar, Context context) {
        this.f31546g = new t();
        a aVar = new a();
        this.f31547h = aVar;
        this.f31541b = bVar;
        this.f31543d = jVar;
        this.f31545f = pVar;
        this.f31544e = qVar;
        this.f31542c = context;
        com.bumptech.glide.manager.b bVarA = cVar.a(context.getApplicationContext(), new c(qVar));
        this.f31548i = bVarA;
        bVar.w(this);
        if (pc.o.u()) {
            pc.o.y(aVar);
        } else {
            jVar.d(this);
        }
        jVar.d(bVarA);
        this.f31549j = new CopyOnWriteArrayList<>(bVar.k().c());
        X(bVar.k().d());
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b extends mc.f<View, Object> {
        public b(@NonNull View view) {
            super(view);
        }

        @Override // mc.f
        public void m(@Nullable Drawable drawable) {
        }

        @Override // mc.p
        public void n(@Nullable Drawable drawable) {
        }

        @Override // mc.p
        public void l(@NonNull Object obj, @Nullable nc.f<? super Object> fVar) {
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }
}
