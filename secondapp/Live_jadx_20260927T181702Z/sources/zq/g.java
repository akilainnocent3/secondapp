package zq;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@br.c
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface g {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a implements br.f<g> {
        @Override // br.f
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public br.g a(g gVar, Object obj) {
            return obj == null ? br.g.NEVER : br.g.ALWAYS;
        }
    }

    br.g when() default br.g.ALWAYS;
}
