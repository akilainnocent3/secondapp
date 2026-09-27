package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import androidx.media3.session.fe;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class m extends g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f47001g = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f47002h = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Pattern f47003i = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    public m(String str, long j10, long j11, long j12, File file) {
        super(str, j10, j11, j12, file);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ec A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ed  */
    public static m a(File file, i iVar) {
        File file2;
        String strGroup;
        File file3;
        h hVarA;
        String name = file.getName();
        if (name.endsWith(".v3.exo")) {
            file2 = file;
        } else {
            String name2 = file.getName();
            Matcher matcher = f47002h.matcher(name2);
            if (matcher.matches()) {
                strGroup = matcher.group(1);
                int i10 = z.f47158a;
                int length = strGroup.length();
                int iEnd = 0;
                int i11 = 0;
                for (int i12 = 0; i12 < length; i12++) {
                    if (strGroup.charAt(i12) == '%') {
                        i11++;
                    }
                }
                if (i11 != 0) {
                    int i13 = length - (i11 * 2);
                    StringBuilder sb2 = new StringBuilder(i13);
                    Matcher matcher2 = z.f47164g.matcher(strGroup);
                    while (i11 > 0 && matcher2.find()) {
                        char c10 = (char) Integer.parseInt(matcher2.group(1), 16);
                        sb2.append((CharSequence) strGroup, iEnd, matcher2.start());
                        sb2.append(c10);
                        iEnd = matcher2.end();
                        i11--;
                    }
                    if (iEnd < length) {
                        sb2.append((CharSequence) strGroup, iEnd, length);
                    }
                    strGroup = sb2.length() != i13 ? null : sb2.toString();
                }
                if (strGroup != null) {
                    File parentFile = file.getParentFile();
                    hVarA = (h) iVar.f46984a.get(strGroup);
                    if (hVarA == null) {
                        hVarA = iVar.a(strGroup, -1L);
                    }
                    file3 = new File(parentFile, hVarA.f46980a + fe.F + Long.parseLong(matcher.group(2)) + fe.F + Long.parseLong(matcher.group(3)) + ".v3.exo");
                    if (!file.renameTo(file3)) {
                    }
                }
                if (file3 == null) {
                    return null;
                }
                name = file3.getName();
                file2 = file3;
            } else {
                matcher = f47001g.matcher(name2);
                if (matcher.matches()) {
                    strGroup = matcher.group(1);
                    File parentFile2 = file.getParentFile();
                    hVarA = (h) iVar.f46984a.get(strGroup);
                    if (hVarA == null) {
                        hVarA = iVar.a(strGroup, -1L);
                    }
                    file3 = new File(parentFile2, hVarA.f46980a + fe.F + Long.parseLong(matcher.group(2)) + fe.F + Long.parseLong(matcher.group(3)) + ".v3.exo");
                    if (!file.renameTo(file3)) {
                    }
                }
                if (file3 == null) {
                    return null;
                }
                name = file3.getName();
                file2 = file3;
            }
            file3 = null;
            if (file3 == null) {
                return null;
            }
            name = file3.getName();
            file2 = file3;
        }
        Matcher matcher3 = f47003i.matcher(name);
        if (!matcher3.matches()) {
            return null;
        }
        long length2 = file2.length();
        String str = (String) iVar.f46985b.get(Integer.parseInt(matcher3.group(1)));
        if (str == null) {
            return null;
        }
        return new m(str, Long.parseLong(matcher3.group(2)), length2, Long.parseLong(matcher3.group(3)), file2);
    }
}
