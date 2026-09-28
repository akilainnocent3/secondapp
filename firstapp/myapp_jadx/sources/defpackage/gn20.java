package defpackage;

import com.sporty.android.core.model.crypto.IURC.iKBWavCysVP;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class gn20 extends qlr implements Function0<File> {
    public final /* synthetic */ qn20 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gn20(qn20 qn20Var) {
        super(0);
        this.a = qn20Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final File invoke() {
        File file = (File) this.a.invoke();
        String name = file.getName();
        name.getClass();
        if (!StringsKt.l0('.', name, "").equals("preferences_pb")) {
            i0b.b(file, "File extension for file: ", iKBWavCysVP.GUSmgcYqJXrdlx);
            return null;
        }
        File absoluteFile = file.getAbsoluteFile();
        absoluteFile.getClass();
        return absoluteFile;
    }
}
