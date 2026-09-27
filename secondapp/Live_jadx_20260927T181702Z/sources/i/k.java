package i;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.lifecycle.b0;
import androidx.lifecycle.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import k.j0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.s1;
import kotlin.jvm.internal.v1;
import kotlin.jvm.internal.x;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@s1({"SMAP\nActivityResultRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/result/ActivityResultRegistry\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,447:1\n123#2,2:448\n*S KotlinDebug\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/result/ActivityResultRegistry\n*L\n401#1:448,2\n*E\n"})
public abstract class k {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @oy.l
    public static final b f90119h = new b(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @oy.l
    public static final String f90120i = "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @oy.l
    public static final String f90121j = "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @oy.l
    public static final String f90122k = "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @oy.l
    public static final String f90123l = "KEY_COMPONENT_ACTIVITY_PENDING_RESULT";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @oy.l
    public static final String f90124m = "ActivityResultRegistry";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f90125n = 65536;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final Map<Integer, String> f90126a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final Map<String, Integer> f90127b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public final Map<String, c> f90128c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    public final List<String> f90129d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    public final transient Map<String, a<?>> f90130e = new LinkedHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oy.l
    public final Map<String, Object> f90131f = new LinkedHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @oy.l
    public final Bundle f90132g = new Bundle();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a<O> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        public final i.a<O> f90133a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.l
        public final j.a<?, O> f90134b;

        public a(@oy.l i.a<O> callback, @oy.l j.a<?, O> contract) {
            m0.p(callback, "callback");
            m0.p(contract, "contract");
            this.f90133a = callback;
            this.f90134b = contract;
        }

        @oy.l
        public final i.a<O> a() {
            return this.f90133a;
        }

        @oy.l
        public final j.a<?, O> b() {
            return this.f90134b;
        }
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
    @s1({"SMAP\nActivityResultRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/result/ActivityResultRegistry$LifecycleContainer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,447:1\n1855#2,2:448\n*S KotlinDebug\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/result/ActivityResultRegistry$LifecycleContainer\n*L\n425#1:448,2\n*E\n"})
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        public final r f90135a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.l
        public final List<androidx.lifecycle.x> f90136b;

        public c(@oy.l r lifecycle) {
            m0.p(lifecycle, "lifecycle");
            this.f90135a = lifecycle;
            this.f90136b = new ArrayList();
        }

        public final void a(@oy.l androidx.lifecycle.x observer) {
            m0.p(observer, "observer");
            this.f90135a.addObserver(observer);
            this.f90136b.add(observer);
        }

        public final void b() {
            Iterator<T> it = this.f90136b.iterator();
            while (it.hasNext()) {
                this.f90135a.removeObserver((androidx.lifecycle.x) it.next());
            }
            this.f90136b.clear();
        }

        @oy.l
        public final r c() {
            return this.f90135a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class d extends o0 implements ds.a<Integer> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final d f90137g = new d();

        public d() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // ds.a
        @oy.m
        public final Integer invoke() {
            return Integer.valueOf(ks.f.f102880b.q(2147418112) + 65536);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class e<I> extends h<I> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f90139b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j.a<I, O> f90140c;

        public e(String str, j.a<I, O> aVar) {
            this.f90139b = str;
            this.f90140c = aVar;
        }

        @Override // i.h
        @oy.l
        public j.a<I, ?> a() {
            return (j.a<I, ?>) this.f90140c;
        }

        @Override // i.h
        public void c(I i10, @oy.m d1.e eVar) throws Exception {
            Object obj = k.this.f90127b.get(this.f90139b);
            Object obj2 = this.f90140c;
            if (obj != null) {
                int iIntValue = ((Number) obj).intValue();
                k.this.f90129d.add(this.f90139b);
                try {
                    k.this.i(iIntValue, this.f90140c, i10, eVar);
                    return;
                } catch (Exception e10) {
                    k.this.f90129d.remove(this.f90139b);
                    throw e10;
                }
            }
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + obj2 + " and input " + i10 + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }

        @Override // i.h
        public void d() {
            k.this.p(this.f90139b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class f<I> extends h<I> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f90142b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j.a<I, O> f90143c;

        public f(String str, j.a<I, O> aVar) {
            this.f90142b = str;
            this.f90143c = aVar;
        }

        @Override // i.h
        @oy.l
        public j.a<I, ?> a() {
            return (j.a<I, ?>) this.f90143c;
        }

        @Override // i.h
        public void c(I i10, @oy.m d1.e eVar) throws Exception {
            Object obj = k.this.f90127b.get(this.f90142b);
            Object obj2 = this.f90143c;
            if (obj != null) {
                int iIntValue = ((Number) obj).intValue();
                k.this.f90129d.add(this.f90142b);
                try {
                    k.this.i(iIntValue, this.f90143c, i10, eVar);
                    return;
                } catch (Exception e10) {
                    k.this.f90129d.remove(this.f90142b);
                    throw e10;
                }
            }
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + obj2 + " and input " + i10 + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }

        @Override // i.h
        public void d() {
            k.this.p(this.f90142b);
        }
    }

    public static final void n(k this$0, String key, i.a callback, j.a contract, b0 b0Var, r.a event) {
        m0.p(this$0, "this$0");
        m0.p(key, "$key");
        m0.p(callback, "$callback");
        m0.p(contract, "$contract");
        m0.p(b0Var, "<anonymous parameter 0>");
        m0.p(event, "event");
        if (r.a.ON_START != event) {
            if (r.a.ON_STOP == event) {
                this$0.f90130e.remove(key);
                return;
            } else {
                if (r.a.ON_DESTROY == event) {
                    this$0.p(key);
                    return;
                }
                return;
            }
        }
        this$0.f90130e.put(key, new a<>(callback, contract));
        if (this$0.f90131f.containsKey(key)) {
            Object obj = this$0.f90131f.get(key);
            this$0.f90131f.remove(key);
            callback.onActivityResult(obj);
        }
        ActivityResult activityResult = (ActivityResult) u1.c.b(this$0.f90132g, key, ActivityResult.class);
        if (activityResult != null) {
            this$0.f90132g.remove(key);
            callback.onActivityResult(contract.c(activityResult.d(), activityResult.c()));
        }
    }

    public final void d(int i10, String str) {
        this.f90126a.put(Integer.valueOf(i10), str);
        this.f90127b.put(str, Integer.valueOf(i10));
    }

    @j0
    public final boolean e(int i10, int i11, @oy.m Intent intent) {
        String str = this.f90126a.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        g(str, i11, intent, this.f90130e.get(str));
        return true;
    }

    @j0
    public final <O> boolean f(int i10, O o10) {
        String str = this.f90126a.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        a<?> aVar = this.f90130e.get(str);
        if ((aVar != null ? aVar.a() : null) == null) {
            this.f90132g.remove(str);
            this.f90131f.put(str, o10);
            return true;
        }
        i.a<?> aVarA = aVar.a();
        m0.n(aVarA, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
        if (!this.f90129d.remove(str)) {
            return true;
        }
        aVarA.onActivityResult(o10);
        return true;
    }

    public final <O> void g(String str, int i10, Intent intent, a<O> aVar) {
        if ((aVar != null ? aVar.a() : null) == null || !this.f90129d.contains(str)) {
            this.f90131f.remove(str);
            this.f90132g.putParcelable(str, new ActivityResult(i10, intent));
        } else {
            aVar.a().onActivityResult(aVar.b().c(i10, intent));
            this.f90129d.remove(str);
        }
    }

    public final int h() {
        for (Number number : zu.x.t(d.f90137g)) {
            if (!this.f90126a.containsKey(Integer.valueOf(number.intValue()))) {
                return number.intValue();
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    @j0
    public abstract <I, O> void i(int i10, @oy.l j.a<I, O> aVar, I i11, @oy.m d1.e eVar);

    public final void j(@oy.m Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(f90120i);
        ArrayList<String> stringArrayList = bundle.getStringArrayList(f90121j);
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList(f90122k);
        if (stringArrayList2 != null) {
            this.f90129d.addAll(stringArrayList2);
        }
        Bundle bundle2 = bundle.getBundle(f90123l);
        if (bundle2 != null) {
            this.f90132g.putAll(bundle2);
        }
        int size = stringArrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            String str = stringArrayList.get(i10);
            if (this.f90127b.containsKey(str)) {
                Integer numRemove = this.f90127b.remove(str);
                if (!this.f90132g.containsKey(str)) {
                    v1.k(this.f90126a).remove(numRemove);
                }
            }
            Integer num = integerArrayList.get(i10);
            m0.o(num, "rcs[i]");
            int iIntValue = num.intValue();
            String str2 = stringArrayList.get(i10);
            m0.o(str2, "keys[i]");
            d(iIntValue, str2);
        }
    }

    public final void k(@oy.l Bundle outState) {
        m0.p(outState, "outState");
        outState.putIntegerArrayList(f90120i, new ArrayList<>(this.f90127b.values()));
        outState.putStringArrayList(f90121j, new ArrayList<>(this.f90127b.keySet()));
        outState.putStringArrayList(f90122k, new ArrayList<>(this.f90129d));
        outState.putBundle(f90123l, new Bundle(this.f90132g));
    }

    @oy.l
    public final <I, O> h<I> l(@oy.l final String key, @oy.l b0 lifecycleOwner, @oy.l final j.a<I, O> contract, @oy.l final i.a<O> callback) {
        m0.p(key, "key");
        m0.p(lifecycleOwner, "lifecycleOwner");
        m0.p(contract, "contract");
        m0.p(callback, "callback");
        r lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.getCurrentState().e(r.b.STARTED)) {
            throw new IllegalStateException(("LifecycleOwner " + lifecycleOwner + " is attempting to register while current state is " + lifecycle.getCurrentState() + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        o(key);
        c cVar = this.f90128c.get(key);
        if (cVar == null) {
            cVar = new c(lifecycle);
        }
        cVar.a(new androidx.lifecycle.x() { // from class: i.j
            @Override // androidx.lifecycle.x
            public final void onStateChanged(b0 b0Var, r.a aVar) {
                k.n(this.f90115b, key, callback, contract, b0Var, aVar);
            }
        });
        this.f90128c.put(key, cVar);
        return new e(key, contract);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @oy.l
    public final <I, O> h<I> m(@oy.l String key, @oy.l j.a<I, O> contract, @oy.l i.a<O> callback) {
        m0.p(key, "key");
        m0.p(contract, "contract");
        m0.p(callback, "callback");
        o(key);
        this.f90130e.put(key, new a<>(callback, contract));
        if (this.f90131f.containsKey(key)) {
            Object obj = this.f90131f.get(key);
            this.f90131f.remove(key);
            callback.onActivityResult(obj);
        }
        ActivityResult activityResult = (ActivityResult) u1.c.b(this.f90132g, key, ActivityResult.class);
        if (activityResult != null) {
            this.f90132g.remove(key);
            callback.onActivityResult(contract.c(activityResult.d(), activityResult.c()));
        }
        return new f(key, contract);
    }

    public final void o(String str) {
        if (this.f90127b.get(str) != null) {
            return;
        }
        d(h(), str);
    }

    @j0
    public final void p(@oy.l String key) {
        Integer numRemove;
        m0.p(key, "key");
        if (!this.f90129d.contains(key) && (numRemove = this.f90127b.remove(key)) != null) {
            this.f90126a.remove(numRemove);
        }
        this.f90130e.remove(key);
        if (this.f90131f.containsKey(key)) {
            Log.w(f90124m, "Dropping pending result for request " + key + ": " + this.f90131f.get(key));
            this.f90131f.remove(key);
        }
        if (this.f90132g.containsKey(key)) {
            Log.w(f90124m, "Dropping pending result for request " + key + ": " + ((ActivityResult) u1.c.b(this.f90132g, key, ActivityResult.class)));
            this.f90132g.remove(key);
        }
        c cVar = this.f90128c.get(key);
        if (cVar != null) {
            cVar.b();
            this.f90128c.remove(key);
        }
    }
}
