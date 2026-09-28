package defpackage;

import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class kcp implements h4g<kcp> {
    public static final gcp e = new gcp();
    public static final hcp f = new hcp();
    public static final icp g = new icp();
    public static final a h = new a();
    public final HashMap a;
    public final HashMap b;
    public final gcp c;
    public boolean d;

    public static final class a implements yuh0<Date> {
        public static final SimpleDateFormat a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            a = simpleDateFormat;
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        }

        @Override // defpackage.e4g
        public final void a(Object obj, zuh0 zuh0Var) {
            zuh0Var.b(a.format((Date) obj));
        }
    }

    public kcp() {
        HashMap map = new HashMap();
        this.a = map;
        HashMap map2 = new HashMap();
        this.b = map2;
        this.c = e;
        this.d = false;
        map2.put(String.class, f);
        map.remove(String.class);
        map2.put(Boolean.class, g);
        map.remove(Boolean.class);
        map2.put(Date.class, h);
        map.remove(Date.class);
    }

    public final h4g a(Class cls, uby ubyVar) {
        this.a.put(cls, ubyVar);
        this.b.remove(cls);
        return this;
    }
}
