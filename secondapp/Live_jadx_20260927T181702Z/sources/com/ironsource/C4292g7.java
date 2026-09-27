package com.ironsource;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.ironsource.g7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4292g7 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.ironsource.g7$a */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a<T> implements js.f<Object, T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        private WeakReference<T> f61860a;

        public a(T t10) {
            this.f61860a = new WeakReference<>(t10);
        }

        @oy.l
        public final WeakReference<T> a() {
            return this.f61860a;
        }

        @Override // js.f, js.e
        @oy.m
        public T getValue(@oy.l Object thisRef, @oy.l ns.o<?> property) {
            kotlin.jvm.internal.m0.p(thisRef, "thisRef");
            kotlin.jvm.internal.m0.p(property, "property");
            return this.f61860a.get();
        }

        @Override // js.f
        public void setValue(@oy.l Object thisRef, @oy.l ns.o<?> property, @oy.m T t10) {
            kotlin.jvm.internal.m0.p(thisRef, "thisRef");
            kotlin.jvm.internal.m0.p(property, "property");
            this.f61860a = new WeakReference<>(t10);
        }

        public final void a(@oy.l WeakReference<T> weakReference) {
            kotlin.jvm.internal.m0.p(weakReference, "<set-?>");
            this.f61860a = weakReference;
        }
    }

    public static /* synthetic */ js.f a(Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = null;
        }
        return a(obj);
    }

    @oy.l
    public static final <T> js.f<Object, T> a(@oy.m T t10) {
        return new a(t10);
    }
}
