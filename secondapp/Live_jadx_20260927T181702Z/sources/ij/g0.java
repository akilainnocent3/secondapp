package ij;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@yi.c
@r
@yi.d
public final class g0 implements FilenameFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pattern f94339a;

    public g0(String patternStr) {
        this(Pattern.compile(patternStr));
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File dir, String fileName) {
        return this.f94339a.matcher(fileName).matches();
    }

    public g0(Pattern pattern) {
        this.f94339a = (Pattern) zi.l0.E(pattern);
    }
}
