package zq;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@br.c(applicableTo = String.class)
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface e {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a implements br.f<e> {
        @Override // br.f
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public br.g a(e eVar, Object obj) {
            return Pattern.compile(eVar.value(), eVar.flags()).matcher((String) obj).matches() ? br.g.ALWAYS : br.g.NEVER;
        }
    }

    int flags() default 0;

    @m
    String value();
}
