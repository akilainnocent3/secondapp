package defpackage;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class x050 {
    public final k2w a;
    public final i4g b;
    public final xg50 c;
    public final ah50 d;
    public final com.bumptech.glide.load.data.b e;
    public final erg0 f;
    public final b9n g;
    public final l2w h = new l2w();
    public final gxs i = new gxs();
    public final v7h.c j;

    public static class a extends RuntimeException {
    }

    public static final class b extends a {
    }

    public static class c extends a {
    }

    public static class d extends a {
        public d(Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class e extends a {
    }

    public x050() {
        v7h.c cVar = new v7h.c(new e220(20), new w7h(), new x7h());
        this.j = cVar;
        this.a = new k2w(cVar);
        this.b = new i4g();
        this.c = new xg50();
        this.d = new ah50();
        this.e = new com.bumptech.glide.load.data.b();
        this.f = new erg0();
        this.g = new b9n();
        List listAsList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        xg50 xg50Var = this.c;
        synchronized (xg50Var) {
            try {
                ArrayList arrayList2 = new ArrayList(xg50Var.a);
                xg50Var.a.clear();
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    xg50Var.a.add((String) obj);
                }
                int size2 = arrayList2.size();
                while (i < size2) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    String str = (String) obj2;
                    if (!arrayList.contains(str)) {
                        xg50Var.a.add(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(Class cls, g4g g4gVar) {
        i4g i4gVar = this.b;
        synchronized (i4gVar) {
            i4gVar.a.add(new i4g.a(cls, g4gVar));
        }
    }

    public final void b(Class cls, zg50 zg50Var) {
        ah50 ah50Var = this.d;
        synchronized (ah50Var) {
            ah50Var.a.add(new ah50.a(cls, zg50Var));
        }
    }

    public final void c(Class cls, Class cls2, j2w j2wVar) {
        k2w k2wVar = this.a;
        synchronized (k2wVar) {
            k2wVar.a.a(cls, cls2, j2wVar);
            k2wVar.b.a.clear();
        }
    }

    public final void d(String str, Class cls, Class cls2, wg50 wg50Var) {
        xg50 xg50Var = this.c;
        synchronized (xg50Var) {
            xg50Var.a(str).add(new xg50.a<>(cls, cls2, wg50Var));
        }
    }

    public final ArrayList e() {
        ArrayList arrayList;
        b9n b9nVar = this.g;
        synchronized (b9nVar) {
            arrayList = b9nVar.a;
        }
        if (arrayList.isEmpty()) {
            throw new b("Failed to find image header parser.");
        }
        return arrayList;
    }

    public final <Model> List<i2w<Model, ?>> f(Model model) {
        List<i2w<Model, ?>> listUnmodifiableList;
        k2w k2wVar = this.a;
        k2wVar.getClass();
        Class<?> cls = model.getClass();
        synchronized (k2wVar) {
            k2w.a.C0749a c0749a = (k2w.a.C0749a) k2wVar.b.a.get(cls);
            listUnmodifiableList = c0749a == null ? null : c0749a.a;
            if (listUnmodifiableList == null) {
                listUnmodifiableList = Collections.unmodifiableList(k2wVar.a.c(cls));
                if (((k2w.a.C0749a) k2wVar.b.a.put(cls, new k2w.a.C0749a(listUnmodifiableList))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            throw new c("Failed to find any ModelLoaders registered for model class: " + model.getClass());
        }
        int size = listUnmodifiableList.size();
        List<i2w<Model, ?>> arrayList = Collections.EMPTY_LIST;
        boolean z = true;
        for (int i = 0; i < size; i++) {
            i2w<Model, ?> i2wVar = listUnmodifiableList.get(i);
            if (i2wVar.b(model)) {
                if (z) {
                    arrayList = new ArrayList<>(size - i);
                    z = false;
                }
                arrayList.add(i2wVar);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        throw new c("Found ModelLoaders for model class: " + listUnmodifiableList + ", but none that handle this specific model instance: " + model);
    }

    public final <X> com.bumptech.glide.load.data.a<X> g(X x) {
        com.bumptech.glide.load.data.a<X> aVarB;
        com.bumptech.glide.load.data.b bVar = this.e;
        synchronized (bVar) {
            try {
                gm20.b(x);
                com.bumptech.glide.load.data.a.InterfaceC0183a interfaceC0183a = (com.bumptech.glide.load.data.a.InterfaceC0183a) bVar.a.get(x.getClass());
                if (interfaceC0183a == null) {
                    for (com.bumptech.glide.load.data.a.InterfaceC0183a interfaceC0183a2 : bVar.a.values()) {
                        if (interfaceC0183a2.a().isAssignableFrom(x.getClass())) {
                            interfaceC0183a = interfaceC0183a2;
                            break;
                        }
                    }
                }
                if (interfaceC0183a == null) {
                    interfaceC0183a = com.bumptech.glide.load.data.b.b;
                }
                aVarB = interfaceC0183a.b(x);
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVarB;
    }

    public final void h(com.bumptech.glide.load.data.a.InterfaceC0183a interfaceC0183a) {
        com.bumptech.glide.load.data.b bVar = this.e;
        synchronized (bVar) {
            bVar.a.put(interfaceC0183a.a(), interfaceC0183a);
        }
    }

    public final void i(Class cls, Class cls2, qh50 qh50Var) {
        erg0 erg0Var = this.f;
        synchronized (erg0Var) {
            erg0Var.a.add(new erg0.a(cls, cls2, qh50Var));
        }
    }

    public final void j(com.bumptech.glide.integration.okhttp3.b.a aVar) {
        ArrayList arrayListE;
        k2w k2wVar = this.a;
        synchronized (k2wVar) {
            wjw wjwVar = k2wVar.a;
            synchronized (wjwVar) {
                arrayListE = wjwVar.e();
                wjwVar.a(d0l.class, InputStream.class, aVar);
            }
            int size = arrayListE.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListE.get(i);
                i++;
                ((j2w) obj).getClass();
            }
            k2wVar.b.a.clear();
        }
    }
}
