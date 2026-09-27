package com.bumptech.glide;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public vb.k f30392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public wb.e f30393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public wb.b f30394e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public xb.j f30395f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public yb.a f30396g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public yb.a f30397h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public xb.a.InterfaceC1523a f30398i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public xb.l f30399j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public com.bumptech.glide.manager.c f30400k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public com.bumptech.glide.manager.o.b f30403n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public yb.a f30404o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f30405p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public List<lc.h<Object>> f30406q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Class<?>, o<?, ?>> f30390a = new f0.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.e.a f30391b = new com.bumptech.glide.e.a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f30401l = 4;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public com.bumptech.glide.b.a f30402m = new a();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements com.bumptech.glide.b.a {
        public a() {
        }

        @Override // com.bumptech.glide.b.a
        @NonNull
        public lc.i build() {
            return new lc.i();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b implements com.bumptech.glide.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ lc.i f30408a;

        public b(lc.i iVar) {
            this.f30408a = iVar;
        }

        @Override // com.bumptech.glide.b.a
        @NonNull
        public lc.i build() {
            lc.i iVar = this.f30408a;
            return iVar != null ? iVar : new lc.i();
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C0283c implements com.bumptech.glide.e.b {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class d implements com.bumptech.glide.e.b {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class e implements com.bumptech.glide.e.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f30410a;

        public e(int i10) {
            this.f30410a = i10;
        }
    }

    @NonNull
    public c a(@NonNull lc.h<Object> hVar) {
        if (this.f30406q == null) {
            this.f30406q = new ArrayList();
        }
        this.f30406q.add(hVar);
        return this;
    }

    @NonNull
    public com.bumptech.glide.b b(@NonNull Context context, List<jc.c> list, jc.a aVar) {
        if (this.f30396g == null) {
            this.f30396g = yb.a.t();
        }
        if (this.f30397h == null) {
            this.f30397h = yb.a.o();
        }
        if (this.f30404o == null) {
            this.f30404o = yb.a.l();
        }
        if (this.f30399j == null) {
            this.f30399j = new xb.l.a(context).a();
        }
        if (this.f30400k == null) {
            this.f30400k = new com.bumptech.glide.manager.e();
        }
        if (this.f30393d == null) {
            int iB = this.f30399j.b();
            if (iB > 0) {
                this.f30393d = new wb.l(iB);
            } else {
                this.f30393d = new wb.f();
            }
        }
        if (this.f30394e == null) {
            this.f30394e = new wb.j(this.f30399j.a());
        }
        if (this.f30395f == null) {
            this.f30395f = new xb.i(this.f30399j.d());
        }
        if (this.f30398i == null) {
            this.f30398i = new xb.h(context);
        }
        if (this.f30392c == null) {
            this.f30392c = new vb.k(this.f30395f, this.f30398i, this.f30397h, this.f30396g, yb.a.E(), this.f30404o, this.f30405p);
        }
        List<lc.h<Object>> list2 = this.f30406q;
        if (list2 == null) {
            this.f30406q = Collections.EMPTY_LIST;
        } else {
            this.f30406q = Collections.unmodifiableList(list2);
        }
        return new com.bumptech.glide.b(context, this.f30392c, this.f30395f, this.f30393d, this.f30394e, new com.bumptech.glide.manager.o(this.f30403n), this.f30400k, this.f30401l, this.f30402m, this.f30390a, this.f30406q, list, aVar, this.f30391b.c());
    }

    @NonNull
    public c c(@Nullable yb.a aVar) {
        this.f30404o = aVar;
        return this;
    }

    @NonNull
    public c d(@Nullable wb.b bVar) {
        this.f30394e = bVar;
        return this;
    }

    @NonNull
    public c e(@Nullable wb.e eVar) {
        this.f30393d = eVar;
        return this;
    }

    @NonNull
    public c f(@Nullable com.bumptech.glide.manager.c cVar) {
        this.f30400k = cVar;
        return this;
    }

    @NonNull
    public c g(@NonNull com.bumptech.glide.b.a aVar) {
        this.f30402m = (com.bumptech.glide.b.a) pc.m.e(aVar);
        return this;
    }

    @NonNull
    public c h(@Nullable lc.i iVar) {
        return g(new b(iVar));
    }

    @NonNull
    public <T> c i(@NonNull Class<T> cls, @Nullable o<?, T> oVar) {
        this.f30390a.put(cls, oVar);
        return this;
    }

    @NonNull
    public c k(@Nullable xb.a.InterfaceC1523a interfaceC1523a) {
        this.f30398i = interfaceC1523a;
        return this;
    }

    @NonNull
    public c l(@Nullable yb.a aVar) {
        this.f30397h = aVar;
        return this;
    }

    public c m(vb.k kVar) {
        this.f30392c = kVar;
        return this;
    }

    public c n(boolean z10) {
        this.f30391b.d(new C0283c(), z10 && Build.VERSION.SDK_INT >= 29);
        return this;
    }

    @NonNull
    public c o(boolean z10) {
        this.f30405p = z10;
        return this;
    }

    @NonNull
    public c p(int i10) {
        if (i10 < 2 || i10 > 6) {
            throw new IllegalArgumentException("Log level must be one of Log.VERBOSE, Log.DEBUG, Log.INFO, Log.WARN, or Log.ERROR");
        }
        this.f30401l = i10;
        return this;
    }

    public c q(boolean z10) {
        this.f30391b.d(new d(), z10);
        return this;
    }

    @NonNull
    public c r(@Nullable xb.j jVar) {
        this.f30395f = jVar;
        return this;
    }

    @NonNull
    public c s(@NonNull xb.l.a aVar) {
        return t(aVar.a());
    }

    @NonNull
    public c t(@Nullable xb.l lVar) {
        this.f30399j = lVar;
        return this;
    }

    public void u(@Nullable com.bumptech.glide.manager.o.b bVar) {
        this.f30403n = bVar;
    }

    @Deprecated
    public c v(@Nullable yb.a aVar) {
        return w(aVar);
    }

    @NonNull
    public c w(@Nullable yb.a aVar) {
        this.f30396g = aVar;
        return this;
    }

    @Deprecated
    public c j(boolean z10) {
        return this;
    }
}
