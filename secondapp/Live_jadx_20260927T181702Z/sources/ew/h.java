package ew;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@zv.g
@er.f(allowedTargets = {er.b.CLASS})
@zv.h
public @interface h {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public /* synthetic */ class a implements h {

        /* JADX INFO: renamed from: y2, reason: collision with root package name */
        public final /* synthetic */ String f81773y2;

        public a(@oy.l String discriminator) {
            kotlin.jvm.internal.m0.p(discriminator, "discriminator");
            this.f81773y2 = discriminator;
        }

        @Override // ew.h
        public final /* synthetic */ String discriminator() {
            return this.f81773y2;
        }
    }

    String discriminator();
}
