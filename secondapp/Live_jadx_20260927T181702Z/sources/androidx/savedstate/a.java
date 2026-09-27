package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.b0;
import androidx.lifecycle.r;
import i9.d;
import java.util.Map;
import k.j0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@s1({"SMAP\nSavedStateRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateRegistry.kt\nandroidx/savedstate/SavedStateRegistry\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,272:1\n1#2:273\n*E\n"})
@SuppressLint({"RestrictedApi"})
public final class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @l
    public static final b f19203g = new b(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @l
    @Deprecated
    public static final String f19204h = "androidx.lifecycle.BundlableSavedStateRegistry.key";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f19206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @m
    public Bundle f19207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f19208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @m
    public Recreator.b f19209e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l
    public final v.b<String, c> f19205a = new v.b<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f19210f = true;

    /* JADX INFO: renamed from: androidx.savedstate.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface InterfaceC0161a {
        void a(@l d dVar);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {
        public /* synthetic */ b(x xVar) {
            this();
        }

        public b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface c {
        @l
        Bundle d();
    }

    public static final void f(a this$0, b0 b0Var, r.a event) {
        m0.p(this$0, "this$0");
        m0.p(b0Var, "<anonymous parameter 0>");
        m0.p(event, "event");
        if (event == r.a.ON_START) {
            this$0.f19210f = true;
        } else if (event == r.a.ON_STOP) {
            this$0.f19210f = false;
        }
    }

    @j0
    @m
    public final Bundle b(@l String key) {
        m0.p(key, "key");
        if (!this.f19208d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f19207c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
        Bundle bundle3 = this.f19207c;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.f19207c;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.f19207c = null;
        return bundle2;
    }

    @m
    public final c c(@l String key) {
        m0.p(key, "key");
        for (Map.Entry<String, c> components : this.f19205a) {
            m0.o(components, "components");
            String key2 = components.getKey();
            c value = components.getValue();
            if (m0.g(key2, key)) {
                return value;
            }
        }
        return null;
    }

    public final boolean d() {
        return this.f19210f;
    }

    @j0
    public final boolean e() {
        return this.f19208d;
    }

    @j0
    public final void g(@l r lifecycle) {
        m0.p(lifecycle, "lifecycle");
        if (this.f19206b) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        lifecycle.addObserver(new androidx.lifecycle.x() { // from class: i9.b
            @Override // androidx.lifecycle.x
            public final void onStateChanged(b0 b0Var, r.a aVar) {
                androidx.savedstate.a.f(this.f90562b, b0Var, aVar);
            }
        });
        this.f19206b = true;
    }

    @j0
    public final void h(@m Bundle bundle) {
        if (!this.f19206b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (this.f19208d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        this.f19207c = bundle != null ? bundle.getBundle(f19204h) : null;
        this.f19208d = true;
    }

    @j0
    public final void i(@l Bundle outBundle) {
        m0.p(outBundle, "outBundle");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f19207c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        v.b<String, c>.d dVarF = this.f19205a.f();
        m0.o(dVarF, "this.components.iteratorWithAdditions()");
        while (dVarF.hasNext()) {
            Map.Entry next = dVarF.next();
            bundle.putBundle((String) next.getKey(), ((c) next.getValue()).d());
        }
        if (bundle.isEmpty()) {
            return;
        }
        outBundle.putBundle(f19204h, bundle);
    }

    @j0
    public final void j(@l String key, @l c provider) {
        m0.p(key, "key");
        m0.p(provider, "provider");
        if (this.f19205a.i(key, provider) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    @j0
    public final void k(@l Class<? extends InterfaceC0161a> clazz) {
        m0.p(clazz, "clazz");
        if (!this.f19210f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        Recreator.b bVar = this.f19209e;
        if (bVar == null) {
            bVar = new Recreator.b(this);
        }
        this.f19209e = bVar;
        try {
            clazz.getDeclaredConstructor(null);
            Recreator.b bVar2 = this.f19209e;
            if (bVar2 != null) {
                String name = clazz.getName();
                m0.o(name, "clazz.name");
                bVar2.a(name);
            }
        } catch (NoSuchMethodException e10) {
            throw new IllegalArgumentException("Class " + clazz.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
        }
    }

    public final void l(boolean z10) {
        this.f19210f = z10;
    }

    @j0
    public final void m(@l String key) {
        m0.p(key, "key");
        this.f19205a.j(key);
    }
}
