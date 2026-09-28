package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class oov implements xsg0 {
    @Override // defpackage.xsg0
    public final Object apply(Object obj) {
        rov rovVar = (rov) obj;
        rovVar.getClass();
        c730 c730Var = k630.a;
        c730Var.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            c730Var.a(rovVar, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
