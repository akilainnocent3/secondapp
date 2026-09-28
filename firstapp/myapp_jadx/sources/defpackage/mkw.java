package defpackage;

import java.io.File;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class mkw extends qlr implements Function0<File> {
    public final /* synthetic */ jkw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mkw(jkw jkwVar) {
        super(0);
        this.a = jkwVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final File invoke() {
        jkw jkwVar = this.a;
        File file = new File(jkwVar.b.getAbsolutePath() + jkwVar.e);
        jkw.f(file);
        return file;
    }
}
