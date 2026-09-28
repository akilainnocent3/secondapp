package defpackage;

import java.io.FileInputStream;
import java.io.IOException;
import kotlin.Unit;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes4.dex */
public final class cg80 implements ne80<bg80> {
    public final pg80 a;

    public cg80(pg80 pg80Var) {
        pg80Var.getClass();
        this.a = pg80Var;
    }

    @Override // defpackage.ne80
    public final Unit a(Object obj, gdh0 gdh0Var) throws IOException {
        byte[] bytes = wbp.d.b(bg80.Companion.serializer(), (bg80) obj).getBytes(Charsets.UTF_8);
        bytes.getClass();
        gdh0Var.a.write(bytes);
        return Unit.a;
    }

    @Override // defpackage.ne80
    public final Object b(FileInputStream fileInputStream) throws j6b {
        try {
            wbp.a aVar = wbp.d;
            String str = new String(ll5.c(fileInputStream), Charsets.UTF_8);
            y3l y3lVar = aVar.b;
            return (bg80) aVar.a(bg80.Companion.serializer(), str);
        } catch (Exception e) {
            throw new j6b("Cannot parse session data", e);
        }
    }

    @Override // defpackage.ne80
    public final bg80 getDefaultValue() {
        return new bg80(this.a.a(null), null, null);
    }
}
