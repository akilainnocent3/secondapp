package defpackage;

import java.io.FileInputStream;
import java.io.IOException;
import kotlin.Unit;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes4.dex */
public final class zf80 implements ne80<yf80> {
    public static final zf80 a = new zf80();
    public static final yf80 b = new yf80(null, null, null, null, null);

    @Override // defpackage.ne80
    public final Unit a(Object obj, gdh0 gdh0Var) throws IOException {
        byte[] bytes = wbp.d.b(yf80.Companion.serializer(), (yf80) obj).getBytes(Charsets.UTF_8);
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
            return (yf80) aVar.a(yf80.Companion.serializer(), str);
        } catch (Exception e) {
            throw new j6b("Cannot parse session configs", e);
        }
    }

    @Override // defpackage.ne80
    public final yf80 getDefaultValue() {
        return b;
    }
}
