package defpackage;

import java.io.File;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class pkw extends qlr implements Function1<File, wxo> {
    public final /* synthetic */ j1b a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pkw(j1b j1bVar) {
        super(1);
        this.a = j1bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final wxo invoke(File file) {
        File file2 = file;
        file2.getClass();
        return new jkw(this.a.a, file2);
    }
}
