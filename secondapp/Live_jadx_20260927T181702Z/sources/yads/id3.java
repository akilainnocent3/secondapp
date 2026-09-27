package yads;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class id3 extends RuntimeException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gd3 f150558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hd3 f150559c;

    /* JADX WARN: Illegal instructions before constructor call */
    public id3(gd3 gd3Var, hd3 hd3Var) {
        String lowerCase = hd3Var.name().toLowerCase(Locale.US);
        kotlin.jvm.internal.m0.o(lowerCase, "toLowerCase(...)");
        super("Verification not executed with reason = " + lowerCase);
        this.f150558b = gd3Var;
        this.f150559c = hd3Var;
    }
}
