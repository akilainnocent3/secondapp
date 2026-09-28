package defpackage;

import android.net.Uri;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class mcd implements o4h {
    public static final int[] d = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    public static final a e = new a(new kcd());
    public static final a f = new a(new lcd());
    public c150 a;
    public ugd b = new ugd();
    public int c;

    public static final class a {
        public final InterfaceC0865a a;
        public final AtomicBoolean b = new AtomicBoolean(false);

        /* JADX INFO: renamed from: mcd$a$a, reason: collision with other inner class name */
        public interface InterfaceC0865a {
            Constructor<? extends k4h> a();
        }

        public a(InterfaceC0865a interfaceC0865a) {
            this.a = interfaceC0865a;
        }

        public final k4h a(Object... objArr) {
            Constructor<? extends k4h> constructorA;
            synchronized (this.b) {
                if (!this.b.get()) {
                    try {
                        constructorA = this.a.a();
                    } catch (ClassNotFoundException unused) {
                        this.b.set(true);
                        constructorA = null;
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating extension", e);
                    }
                }
                constructorA = null;
            }
            if (constructorA == null) {
                return null;
            }
            try {
                return constructorA.newInstance(objArr);
            } catch (Exception e2) {
                rzk.b("Unexpected error creating extractor", e2);
                return null;
            }
        }
    }

    @Override // defpackage.o4h
    public final synchronized k4h[] a(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        try {
            int[] iArr = d;
            arrayList = new ArrayList(21);
            List<String> list = map.get("Content-Type");
            int iA = flh.a((list == null || list.isEmpty()) ? null : list.get(0));
            if (iA != -1) {
                c(iA, arrayList);
            }
            int iB = flh.b(uri);
            if (iB != -1 && iB != iA) {
                c(iB, arrayList);
            }
            for (int i = 0; i < 21; i++) {
                int i2 = iArr[i];
                if (i2 != iA && i2 != iB) {
                    c(i2, arrayList);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (k4h[]) arrayList.toArray(new k4h[0]);
    }

    @Override // defpackage.o4h
    public final synchronized k4h[] b() {
        return a(Uri.EMPTY, new HashMap());
    }

    public final void c(int i, ArrayList arrayList) {
        switch (i) {
            case 0:
                arrayList.add(new n5());
                break;
            case 1:
                arrayList.add(new r5());
                break;
            case 2:
                arrayList.add(new em(0));
                break;
            case 3:
                arrayList.add(new dx());
                break;
            case 4:
                k4h k4hVarA = e.a(0);
                if (k4hVarA == null) {
                    arrayList.add(new cuh());
                } else {
                    arrayList.add(k4hVarA);
                }
                break;
            case 5:
                arrayList.add(new r3i());
                break;
            case 6:
                arrayList.add(new idv(this.b, 0));
                break;
            case 7:
                arrayList.add(new a8w(0));
                break;
            case 8:
                ugd ugdVar = this.b;
                pcn.b bVar = pcn.b;
                arrayList.add(new ezi(ugdVar, 0, null, c150.e));
                arrayList.add(new f8w(this.b, 0));
                break;
            case 9:
                arrayList.add(new tly());
                break;
            case 10:
                arrayList.add(new h830());
                break;
            case 11:
                if (this.a == null) {
                    pcn.b bVar2 = pcn.b;
                    this.a = c150.e;
                }
                arrayList.add(new vxg0(1, 0, this.b, new zxf0(0L), new tid(0, this.a)));
                break;
            case 12:
                arrayList.add(new zxi0());
                break;
            case 14:
                arrayList.add(new pbp(this.c));
                break;
            case 15:
                k4h k4hVarA2 = f.a(new Object[0]);
                if (k4hVarA2 != null) {
                    arrayList.add(k4hVarA2);
                }
                break;
            case 16:
                arrayList.add(new lp1(0, this.b));
                break;
            case 17:
                arrayList.add(new nr10());
                break;
            case 18:
                arrayList.add(new j0j0());
                break;
            case 19:
                arrayList.add(new pg4());
                break;
            case 20:
                arrayList.add(new uil());
                break;
            case 21:
                arrayList.add(new op1());
                break;
        }
    }
}
