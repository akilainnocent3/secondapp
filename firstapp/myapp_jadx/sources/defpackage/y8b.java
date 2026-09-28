package defpackage;

import java.io.File;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class y8b implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ y8b(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ps6 ps6Var = (ps6) obj;
                ps6Var.getClass();
                return Boolean.valueOf(ps6Var.b == 1);
            default:
                File file = (File) obj;
                file.getClass();
                return Boolean.valueOf(file.isFile());
        }
    }
}
