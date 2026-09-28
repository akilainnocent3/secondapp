package defpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes8.dex */
public final class ch50 extends blh {
    public static final cxz d;
    public final ClassLoader a;
    public final blh b;
    public final mpe0 c;

    public static final class a {
        public static boolean a(cxz cxzVar) {
            return !c.k(cxzVar.b(), ".class", true);
        }

        public static cxz b(cxz cxzVar, cxz cxzVar2) {
            cxzVar.getClass();
            String strS = cxzVar2.a.s();
            cxz cxzVar3 = ch50.d;
            String strReplace = StringsKt.a0(cxzVar.a.s(), strS).replace('\\', '/');
            strReplace.getClass();
            return cxzVar3.e(strReplace);
        }
    }

    static {
        String str = cxz.b;
        d = cxz.a.a("/");
    }

    public ch50(ClassLoader classLoader) {
        blh blhVar = blh.SYSTEM;
        classLoader.getClass();
        blhVar.getClass();
        this.a = classLoader;
        this.b = blhVar;
        this.c = hwr.b(new Function0() { // from class: bh50
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws IOException {
                int iV;
                Pair pair;
                ch50 ch50Var = this.a;
                ClassLoader classLoader2 = ch50Var.a;
                blh blhVar2 = ch50Var.b;
                Enumeration<URL> resources = classLoader2.getResources("");
                resources.getClass();
                ArrayList list = Collections.list(resources);
                list.getClass();
                ArrayList arrayList = new ArrayList();
                int size = list.size();
                int i = 0;
                while (true) {
                    Pair pair2 = null;
                    if (i >= size) {
                        break;
                    }
                    Object obj = list.get(i);
                    i++;
                    URL url = (URL) obj;
                    url.getClass();
                    if (Intrinsics.g(url.getProtocol(), "file")) {
                        String str = cxz.b;
                        pair2 = new Pair(blhVar2, cxz.a.b(new File(url.toURI())));
                    }
                    if (pair2 != null) {
                        arrayList.add(pair2);
                    }
                }
                Enumeration<URL> resources2 = classLoader2.getResources("META-INF/MANIFEST.MF");
                resources2.getClass();
                ArrayList list2 = Collections.list(resources2);
                list2.getClass();
                ArrayList arrayList2 = new ArrayList();
                int size2 = list2.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = list2.get(i2);
                    i2++;
                    URL url2 = (URL) obj2;
                    url2.getClass();
                    String string = url2.toString();
                    string.getClass();
                    if (c.u(string, "jar:file:", false) && (iV = StringsKt.V(6, string, "!")) != -1) {
                        String str2 = cxz.b;
                        pair = new Pair(ick0.c(cxz.a.b(new File(URI.create(string.substring(4, iV)))), blhVar2, new oxn(1)), ch50.d);
                    } else {
                        pair = null;
                    }
                    if (pair != null) {
                        arrayList2.add(pair);
                    }
                }
                return CollectionsKt.i0(arrayList2, arrayList);
            }
        });
    }

    public static String d(cxz cxzVar) {
        cxz cxzVar2 = d;
        cxzVar2.getClass();
        cxzVar.getClass();
        return i.a(cxzVar2, cxzVar, true).d(cxzVar2).a.s();
    }

    @Override // defpackage.blh
    public final uw90 appendingSink(cxz cxzVar, boolean z) throws IOException {
        cxzVar.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.blh
    public final void atomicMove(cxz cxzVar, cxz cxzVar2) throws IOException {
        cxzVar.getClass();
        cxzVar2.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.blh
    public final cxz canonicalize(cxz cxzVar) {
        cxzVar.getClass();
        cxz cxzVar2 = d;
        cxzVar2.getClass();
        return i.a(cxzVar2, cxzVar, true);
    }

    @Override // defpackage.blh
    public final void createDirectory(cxz cxzVar, boolean z) throws IOException {
        cxzVar.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.blh
    public final void createSymlink(cxz cxzVar, cxz cxzVar2) throws IOException {
        cxzVar.getClass();
        cxzVar2.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.blh
    public final void delete(cxz cxzVar, boolean z) throws IOException {
        cxzVar.getClass();
        throw new IOException(this + " is read-only");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.blh
    public final List<cxz> list(cxz cxzVar) throws FileNotFoundException {
        cxzVar.getClass();
        String strD = d(cxzVar);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z = false;
        for (Pair pair : (List) this.c.getValue()) {
            blh blhVar = (blh) pair.a;
            cxz cxzVar2 = (cxz) pair.b;
            try {
                List<cxz> list = blhVar.list(cxzVar2.e(strD));
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (a.a((cxz) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(l48.r(arrayList, 10));
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    arrayList2.add(a.b((cxz) obj2, cxzVar2));
                }
                p48.w(arrayList2, linkedHashSet);
                z = true;
            } catch (IOException unused) {
            }
        }
        if (z) {
            return CollectionsKt.A0(linkedHashSet);
        }
        throw new FileNotFoundException(alh.a(cxzVar, "file not found: "));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.blh
    public final List<cxz> listOrNull(cxz cxzVar) {
        cxzVar.getClass();
        String strD = d(cxzVar);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = ((List) this.c.getValue()).iterator();
        boolean z = false;
        while (true) {
            ArrayList arrayList = null;
            if (!it.hasNext()) {
                break;
            }
            Pair pair = (Pair) it.next();
            blh blhVar = (blh) pair.a;
            cxz cxzVar2 = (cxz) pair.b;
            List<cxz> listListOrNull = blhVar.listOrNull(cxzVar2.e(strD));
            if (listListOrNull != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listListOrNull) {
                    if (a.a((cxz) obj)) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(l48.r(arrayList2, 10));
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    arrayList3.add(a.b((cxz) obj2, cxzVar2));
                }
                arrayList = arrayList3;
            }
            if (arrayList != null) {
                p48.w(arrayList, linkedHashSet);
                z = true;
            }
        }
        if (z) {
            return CollectionsKt.A0(linkedHashSet);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.blh
    public final kkh metadataOrNull(cxz cxzVar) {
        cxzVar.getClass();
        if (!a.a(cxzVar)) {
            return null;
        }
        String strD = d(cxzVar);
        for (Pair pair : (List) this.c.getValue()) {
            kkh kkhVarMetadataOrNull = ((blh) pair.a).metadataOrNull(((cxz) pair.b).e(strD));
            if (kkhVarMetadataOrNull != null) {
                return kkhVarMetadataOrNull;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.blh
    public final bkh openReadOnly(cxz cxzVar) throws FileNotFoundException {
        cxzVar.getClass();
        if (!a.a(cxzVar)) {
            throw new FileNotFoundException(alh.a(cxzVar, "file not found: "));
        }
        String strD = d(cxzVar);
        Iterator it = ((List) this.c.getValue()).iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            try {
                return ((blh) pair.a).openReadOnly(((cxz) pair.b).e(strD));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException(alh.a(cxzVar, "file not found: "));
    }

    @Override // defpackage.blh
    public final bkh openReadWrite(cxz cxzVar, boolean z, boolean z2) throws IOException {
        cxzVar.getClass();
        throw new IOException("resources are not writable");
    }

    @Override // defpackage.blh
    public final uw90 sink(cxz cxzVar, boolean z) throws IOException {
        cxzVar.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.blh
    public final zpa0 source(cxz cxzVar) throws IOException {
        cxzVar.getClass();
        if (!a.a(cxzVar)) {
            throw new FileNotFoundException(alh.a(cxzVar, "file not found: "));
        }
        cxz cxzVar2 = d;
        cxzVar2.getClass();
        URL resource = this.a.getResource(i.a(cxzVar2, cxzVar, false).d(cxzVar2).a.s());
        if (resource == null) {
            throw new FileNotFoundException(alh.a(cxzVar, "file not found: "));
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        if (uRLConnectionOpenConnection instanceof JarURLConnection) {
            ((JarURLConnection) uRLConnectionOpenConnection).setUseCaches(false);
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        inputStream.getClass();
        return tmy.c(inputStream);
    }
}
