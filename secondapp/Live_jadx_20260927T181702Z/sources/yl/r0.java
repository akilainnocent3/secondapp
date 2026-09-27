package yl;

import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@cr.f
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final a1 f159684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final c1 f159685b;

    @cr.a
    public r0(@oy.l a1 timeProvider, @oy.l c1 uuidGenerator) {
        kotlin.jvm.internal.m0.p(timeProvider, "timeProvider");
        kotlin.jvm.internal.m0.p(uuidGenerator, "uuidGenerator");
        this.f159684a = timeProvider;
        this.f159685b = uuidGenerator;
    }

    @oy.l
    public final l0 a(@oy.m l0 l0Var) {
        String strG;
        String strB = b();
        if (l0Var == null || (strG = l0Var.g()) == null) {
            strG = strB;
        }
        return new l0(strB, strG, l0Var != null ? l0Var.i() + 1 : 0, this.f159684a.b().f());
    }

    public final String b() {
        String string = this.f159685b.next().toString();
        kotlin.jvm.internal.m0.o(string, "toString(...)");
        String lowerCase = cv.k0.z2(string, TokenBuilder.TOKEN_DELIMITER, "", false, 4, null).toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.m0.o(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}
