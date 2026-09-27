package bh;

import androidx.annotation.Nullable;
import androidx.media3.session.fe;
import eh.o1;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class w extends j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f21474h = ".exo";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f21475i = ".v3.exo";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f21476j = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Pattern f21477k = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Pattern f21478l = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    public w(String str, long j10, long j11, long j12, @Nullable File file) {
        super(str, j10, j11, j12, file);
    }

    @Nullable
    public static w e(File file, long j10, long j11, m mVar) {
        String strL;
        String name = file.getName();
        if (!name.endsWith(".v3.exo")) {
            file = j(file, mVar);
            if (file == null) {
                return null;
            }
            name = file.getName();
        }
        File file2 = file;
        Matcher matcher = f21478l.matcher(name);
        if (!matcher.matches() || (strL = mVar.l(Integer.parseInt((String) eh.a.g(matcher.group(1))))) == null) {
            return null;
        }
        if (j10 == -1) {
            j10 = file2.length();
        }
        long j12 = j10;
        if (j12 == 0) {
            return null;
        }
        return new w(strL, Long.parseLong((String) eh.a.g(matcher.group(2))), j12, j11 == -9223372036854775807L ? Long.parseLong((String) eh.a.g(matcher.group(3))) : j11, file2);
    }

    @Nullable
    public static w f(File file, long j10, m mVar) {
        return e(file, j10, -9223372036854775807L, mVar);
    }

    public static w g(String str, long j10, long j11) {
        return new w(str, j10, j11, -9223372036854775807L, null);
    }

    public static w h(String str, long j10) {
        return new w(str, j10, -1L, -9223372036854775807L, null);
    }

    public static File i(File file, int i10, long j10, long j11) {
        return new File(file, i10 + fe.F + j10 + fe.F + j11 + ".v3.exo");
    }

    @Nullable
    public static File j(File file, m mVar) {
        String strA2;
        String name = file.getName();
        Matcher matcher = f21477k.matcher(name);
        if (matcher.matches()) {
            strA2 = o1.a2((String) eh.a.g(matcher.group(1)));
        } else {
            matcher = f21476j.matcher(name);
            strA2 = matcher.matches() ? (String) eh.a.g(matcher.group(1)) : null;
        }
        if (strA2 == null) {
            return null;
        }
        File fileI = i((File) eh.a.k(file.getParentFile()), mVar.f(strA2), Long.parseLong((String) eh.a.g(matcher.group(2))), Long.parseLong((String) eh.a.g(matcher.group(3))));
        if (file.renameTo(fileI)) {
            return fileI;
        }
        return null;
    }

    public w d(File file, long j10) {
        eh.a.i(this.f21390e);
        return new w(this.f21387b, this.f21388c, this.f21389d, j10, file);
    }
}
