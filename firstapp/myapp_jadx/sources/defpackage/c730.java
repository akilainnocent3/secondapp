package defpackage;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class c730 {
    public final HashMap a;
    public final HashMap b;

    public static final class a implements h4g<a> {
        public static final b730 a = new b730();
    }

    public c730(HashMap map, HashMap map2) {
        this.a = map;
        this.b = map2;
    }

    public final void a(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap map = this.b;
        HashMap map2 = this.a;
        a730 a730Var = new a730(byteArrayOutputStream, map2, map);
        if (obj == null) {
            return;
        }
        uby ubyVar = (uby) map2.get(obj.getClass());
        if (ubyVar != null) {
            ubyVar.a(obj, a730Var);
            return;
        }
        throw new k4g("No encoder for " + obj.getClass());
    }
}
