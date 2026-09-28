package defpackage;

import java.io.File;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class rkh extends qlr implements Function1<File, wxo> {
    public static final rkh a = new rkh(1);

    @Override // kotlin.jvm.functions.Function1
    public final wxo invoke(File file) {
        File file2 = file;
        file2.getClass();
        String absolutePath = file2.getCanonicalFile().getAbsolutePath();
        absolutePath.getClass();
        return new ov90(absolutePath);
    }
}
