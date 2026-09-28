package defpackage;

import android.os.Bundle;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class a00 implements yz {
    public static volatile a00 c;
    public final gs0 a;
    public final ConcurrentHashMap b;

    public a00(gs0 gs0Var) {
        hm20.h(gs0Var);
        this.a = gs0Var;
        this.b = new ConcurrentHashMap();
    }

    @Override // defpackage.yz
    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : this.a.a.f("frc", "")) {
            tcn tcnVar = wuk0.a;
            hm20.h(bundle);
            yz.a aVar = new yz.a();
            String str = (String) bbl0.b(bundle, "origin", String.class, null);
            hm20.h(str);
            aVar.a = str;
            String str2 = (String) bbl0.b(bundle, "name", String.class, null);
            hm20.h(str2);
            aVar.b = str2;
            aVar.c = bbl0.b(bundle, "value", Object.class, null);
            aVar.d = (String) bbl0.b(bundle, "trigger_event_name", String.class, null);
            aVar.e = ((Long) bbl0.b(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            aVar.f = (String) bbl0.b(bundle, "timed_out_event_name", String.class, null);
            aVar.g = (Bundle) bbl0.b(bundle, "timed_out_event_params", Bundle.class, null);
            aVar.h = (String) bbl0.b(bundle, "triggered_event_name", String.class, null);
            aVar.i = (Bundle) bbl0.b(bundle, "triggered_event_params", Bundle.class, null);
            aVar.j = ((Long) bbl0.b(bundle, "time_to_live", Long.class, 0L)).longValue();
            aVar.k = (String) bbl0.b(bundle, "expired_event_name", String.class, null);
            aVar.l = (Bundle) bbl0.b(bundle, "expired_event_params", Bundle.class, null);
            aVar.n = ((Boolean) bbl0.b(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            aVar.m = ((Long) bbl0.b(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            aVar.o = ((Long) bbl0.b(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(aVar);
        }
        return arrayList;
    }

    @Override // defpackage.yz
    public final void b(yz.a aVar) {
        Throwable th;
        ObjectInputStream objectInputStream;
        ObjectOutputStream objectOutputStream;
        tcn tcnVar = wuk0.a;
        String str = aVar.a;
        if (str == null || str.isEmpty()) {
            return;
        }
        Object obj = aVar.c;
        if (obj != null) {
            Object obj2 = null;
            try {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    try {
                        objectOutputStream.writeObject(obj);
                        objectOutputStream.flush();
                        objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                        try {
                            Object object = objectInputStream.readObject();
                            objectOutputStream.close();
                            objectInputStream.close();
                            obj2 = object;
                            if (obj2 == null) {
                                return;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (objectOutputStream != null) {
                                objectOutputStream.close();
                            }
                            if (objectInputStream == null) {
                                throw th;
                            }
                            objectInputStream.close();
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        objectInputStream = null;
                    }
                } catch (IOException | ClassNotFoundException unused) {
                }
            } catch (Throwable th4) {
                th = th4;
                objectInputStream = null;
                objectOutputStream = null;
            }
        }
        if (wuk0.a(str) && wuk0.c(str, aVar.b)) {
            String str2 = aVar.k;
            if (str2 == null || (wuk0.b(str2, aVar.l) && wuk0.d(str, aVar.k, aVar.l))) {
                String str3 = aVar.h;
                if (str3 == null || (wuk0.b(str3, aVar.i) && wuk0.d(str, aVar.h, aVar.i))) {
                    String str4 = aVar.f;
                    if (str4 == null || (wuk0.b(str4, aVar.g) && wuk0.d(str, aVar.f, aVar.g))) {
                        Bundle bundle = new Bundle();
                        String str5 = aVar.a;
                        if (str5 != null) {
                            bundle.putString("origin", str5);
                        }
                        String str6 = aVar.b;
                        if (str6 != null) {
                            bundle.putString("name", str6);
                        }
                        Object obj3 = aVar.c;
                        if (obj3 != null) {
                            bbl0.a(bundle, obj3);
                        }
                        String str7 = aVar.d;
                        if (str7 != null) {
                            bundle.putString("trigger_event_name", str7);
                        }
                        bundle.putLong("trigger_timeout", aVar.e);
                        String str8 = aVar.f;
                        if (str8 != null) {
                            bundle.putString("timed_out_event_name", str8);
                        }
                        Bundle bundle2 = aVar.g;
                        if (bundle2 != null) {
                            bundle.putBundle("timed_out_event_params", bundle2);
                        }
                        String str9 = aVar.h;
                        if (str9 != null) {
                            bundle.putString("triggered_event_name", str9);
                        }
                        Bundle bundle3 = aVar.i;
                        if (bundle3 != null) {
                            bundle.putBundle("triggered_event_params", bundle3);
                        }
                        bundle.putLong("time_to_live", aVar.j);
                        String str10 = aVar.k;
                        if (str10 != null) {
                            bundle.putString("expired_event_name", str10);
                        }
                        Bundle bundle4 = aVar.l;
                        if (bundle4 != null) {
                            bundle.putBundle("expired_event_params", bundle4);
                        }
                        bundle.putLong("creation_timestamp", aVar.m);
                        bundle.putBoolean("active", aVar.n);
                        bundle.putLong("triggered_timestamp", aVar.o);
                        p1l0 p1l0Var = this.a.a;
                        p1l0Var.c(new mxk0(p1l0Var, bundle));
                    }
                }
            }
        }
    }

    @Override // defpackage.yz
    public final void c(String str, String str2, Bundle bundle) {
        if (wuk0.a(str) && wuk0.b(str2, bundle) && wuk0.d(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            p1l0 p1l0Var = this.a.a;
            p1l0Var.c(new g0l0(p1l0Var, str, str2, bundle, true));
        }
    }

    @Override // defpackage.yz
    public final void d(String str) {
        p1l0 p1l0Var = this.a.a;
        p1l0Var.c(new pxk0(p1l0Var, str, null, null));
    }

    @Override // defpackage.yz
    public final Map<String, Object> e(boolean z) {
        return this.a.a.a(null, null, z);
    }

    @Override // defpackage.yz
    public final zz f(String str, srb srbVar) {
        Object b3l0Var;
        if (wuk0.a(str)) {
            boolean zIsEmpty = str.isEmpty();
            ConcurrentHashMap concurrentHashMap = this.b;
            if (zIsEmpty || !concurrentHashMap.containsKey(str) || concurrentHashMap.get(str) == null) {
                boolean zEquals = "fiam".equals(str);
                gs0 gs0Var = this.a;
                if (zEquals) {
                    b3l0Var = new czk0(gs0Var, srbVar);
                } else {
                    b3l0Var = "clx".equals(str) ? new b3l0(gs0Var, srbVar) : null;
                }
                if (b3l0Var != null) {
                    concurrentHashMap.put(str, b3l0Var);
                    return new zz();
                }
            }
        }
        return null;
    }

    @Override // defpackage.yz
    public final int g() {
        return this.a.a.b("frc");
    }

    @Override // defpackage.yz
    public final void h(String str) {
        if (wuk0.a("fcm") && wuk0.c("fcm", "_ln")) {
            p1l0 p1l0Var = this.a.a;
            p1l0Var.c(new jxk0(p1l0Var, "fcm", "_ln", str, true));
        }
    }
}
