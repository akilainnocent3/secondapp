package ew;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@Target({})
@zv.z
@Retention(RetentionPolicy.RUNTIME)
@zv.g
@er.f(allowedTargets = {er.b.PROPERTY})
public @interface e0 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public /* synthetic */ class a implements e0 {

        /* JADX INFO: renamed from: y2, reason: collision with root package name */
        public final /* synthetic */ String[] f81744y2;

        public a(@oy.l String[] names) {
            kotlin.jvm.internal.m0.p(names, "names");
            this.f81744y2 = names;
        }

        @Override // ew.e0
        public final /* synthetic */ String[] names() {
            return this.f81744y2;
        }
    }

    String[] names();
}
