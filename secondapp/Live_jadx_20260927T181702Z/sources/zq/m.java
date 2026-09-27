package zq;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@br.e
@o("RegEx")
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface m {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a implements br.f<m> {
        @Override // br.f
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public br.g a(m mVar, Object obj) {
            if (!(obj instanceof String)) {
                return br.g.NEVER;
            }
            try {
                Pattern.compile((String) obj);
                return br.g.ALWAYS;
            } catch (PatternSyntaxException unused) {
                return br.g.NEVER;
            }
        }
    }

    br.g when() default br.g.ALWAYS;
}
