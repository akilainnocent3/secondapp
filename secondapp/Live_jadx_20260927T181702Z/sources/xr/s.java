package xr;

import androidx.media3.session.fe;
import cv.k0;
import cv.p0;
import dr.w2;
import fr.r0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@s1({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\nkotlin/io/FilesKt__UtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,473:1\n1#2:474\n1292#3,3:475\n*S KotlinDebug\n*F\n+ 1 Utils.kt\nkotlin/io/FilesKt__UtilsKt\n*L\n347#1:475,3\n*E\n"})
public class s extends q {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements ds.p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f145536b = new a();

        @Override // ds.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(File file, IOException exception) throws IOException {
            m0.p(file, "<unused var>");
            m0.p(exception, "exception");
            throw exception;
        }
    }

    public static final boolean T(@oy.l File file, @oy.l File target, boolean z10, @oy.l final ds.p<? super File, ? super IOException, ? extends w> onError) {
        m0.p(file, "<this>");
        m0.p(target, "target");
        m0.p(onError, "onError");
        if (!file.exists()) {
            return onError.invoke(file, new v(file, null, "The source file doesn't exist.", 2, null)) != w.TERMINATE;
        }
        try {
            for (File file2 : q.R(file).k(new ds.p() { // from class: xr.r
                @Override // ds.p
                public final Object invoke(Object obj, Object obj2) {
                    return s.V(onError, (File) obj, (IOException) obj2);
                }
            })) {
                if (file2.exists()) {
                    File file3 = new File(target, u0(file2, file));
                    if (file3.exists() && (!file2.isDirectory() || !file3.isDirectory())) {
                        if (z10) {
                            if (file3.isDirectory()) {
                                if (!c0(file3)) {
                                }
                            } else if (!file3.delete()) {
                            }
                        }
                        if (onError.invoke(file3, new h(file2, file3, "The destination file already exists.")) == w.TERMINATE) {
                            return false;
                        }
                    }
                    if (file2.isDirectory()) {
                        file3.mkdirs();
                    } else {
                        boolean z11 = z10;
                        if (X(file2, file3, z11, 0, 4, null).length() != file2.length() && onError.invoke(file2, new IOException("Source file wasn't copied completely, length of destination file differs.")) == w.TERMINATE) {
                            return false;
                        }
                        z10 = z11;
                    }
                } else {
                    if (onError.invoke(file2, new v(file2, null, "The source file doesn't exist.", 2, null)) == w.TERMINATE) {
                        return false;
                    }
                }
            }
            return true;
        } catch (z unused) {
            return false;
        }
    }

    public static /* synthetic */ boolean U(File file, File file2, boolean z10, ds.p pVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            pVar = a.f145536b;
        }
        return T(file, file2, z10, pVar);
    }

    public static final w2 V(ds.p pVar, File f10, IOException e10) throws z {
        m0.p(f10, "f");
        m0.p(e10, "e");
        if (pVar.invoke(f10, e10) != w.TERMINATE) {
            return w2.f79517a;
        }
        throw new z(f10);
    }

    @oy.l
    public static final File W(@oy.l File file, @oy.l File target, boolean z10, int i10) throws IllegalAccessException, IOException, InvocationTargetException {
        m0.p(file, "<this>");
        m0.p(target, "target");
        if (!file.exists()) {
            throw new v(file, null, "The source file doesn't exist.", 2, null);
        }
        if (target.exists()) {
            if (!z10) {
                throw new h(file, target, "The destination file already exists.");
            }
            if (!target.delete()) {
                throw new h(file, target, "Tried to overwrite the destination, but failed to delete it.");
            }
        }
        if (file.isDirectory()) {
            if (target.mkdirs()) {
                return target;
            }
            throw new j(file, target, "Failed to create target directory.");
        }
        File parentFile = target.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(target);
            try {
                b.k(fileInputStream, fileOutputStream, i10);
                c.a(fileOutputStream, null);
                c.a(fileInputStream, null);
                return target;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    c.a(fileOutputStream, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                c.a(fileInputStream, th4);
                throw th5;
            }
        }
    }

    public static /* synthetic */ File X(File file, File file2, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 8192;
        }
        return W(file, file2, z10, i10);
    }

    @oy.l
    @dr.o(message = "Avoid creating temporary directories in the default temp location with this function due to too wide permissions on the newly created directory. Use kotlin.io.path.createTempDirectory instead.")
    public static final File Y(@oy.l String prefix, @oy.m String str, @oy.m File file) throws IOException {
        m0.p(prefix, "prefix");
        File fileCreateTempFile = File.createTempFile(prefix, str, file);
        fileCreateTempFile.delete();
        if (fileCreateTempFile.mkdir()) {
            m0.m(fileCreateTempFile);
            return fileCreateTempFile;
        }
        throw new IOException("Unable to create temporary directory " + fileCreateTempFile + kj.e.f102543c);
    }

    public static /* synthetic */ File Z(String str, String str2, File file, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "tmp";
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            file = null;
        }
        return Y(str, str2, file);
    }

    @oy.l
    @dr.o(message = "Avoid creating temporary files in the default temp location with this function due to too wide permissions on the newly created file. Use kotlin.io.path.createTempFile instead or resort to java.io.File.createTempFile.")
    public static final File a0(@oy.l String prefix, @oy.m String str, @oy.m File file) throws IOException {
        m0.p(prefix, "prefix");
        File fileCreateTempFile = File.createTempFile(prefix, str, file);
        m0.o(fileCreateTempFile, "createTempFile(...)");
        return fileCreateTempFile;
    }

    public static /* synthetic */ File b0(String str, String str2, File file, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "tmp";
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            file = null;
        }
        return a0(str, str2, file);
    }

    public static final boolean c0(@oy.l File file) {
        m0.p(file, "<this>");
        while (true) {
            boolean z10 = true;
            for (File file2 : q.Q(file)) {
                if (file2.delete() || !file2.exists()) {
                    if (z10) {
                    }
                }
                z10 = false;
            }
            return z10;
        }
    }

    public static final boolean d0(@oy.l File file, @oy.l File other) {
        m0.p(file, "<this>");
        m0.p(other, "other");
        i iVarF = n.f(file);
        i iVarF2 = n.f(other);
        if (iVarF2.i()) {
            return m0.g(file, other);
        }
        int iH = iVarF.h() - iVarF2.h();
        if (iH < 0) {
            return false;
        }
        return iVarF.g().subList(iH, iVarF.h()).equals(iVarF2.g());
    }

    public static final boolean e0(@oy.l File file, @oy.l String other) {
        m0.p(file, "<this>");
        m0.p(other, "other");
        return d0(file, new File(other));
    }

    @oy.l
    public static String f0(@oy.l File file) {
        m0.p(file, "<this>");
        String name = file.getName();
        m0.o(name, "getName(...)");
        return p0.N5(name, kj.e.f102543c, "");
    }

    @oy.l
    public static final String g0(@oy.l File file) {
        m0.p(file, "<this>");
        char c10 = File.separatorChar;
        if (c10 != '/') {
            String path = file.getPath();
            m0.o(path, "getPath(...)");
            return k0.y2(path, c10, '/', false, 4, null);
        }
        String path2 = file.getPath();
        m0.o(path2, "getPath(...)");
        return path2;
    }

    @oy.l
    public static final String h0(@oy.l File file) {
        m0.p(file, "<this>");
        String name = file.getName();
        m0.o(name, "getName(...)");
        return p0.Y5(name, fe.F, null, 2, null);
    }

    @oy.l
    public static final File i0(@oy.l File file) {
        m0.p(file, "<this>");
        i iVarF = n.f(file);
        File fileE = iVarF.e();
        List<File> listJ0 = j0(iVarF.g());
        String separator = File.separator;
        m0.o(separator, "separator");
        return p0(fileE, r0.r3(listJ0, separator, null, null, 0, null, null, 62, null));
    }

    public static final List<File> j0(List<? extends File> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (File file : list) {
            String name = file.getName();
            if (m0.g(name, fe.F)) {
                w2 w2Var = w2.f79517a;
            } else if (!m0.g(name, "..")) {
                arrayList.add(file);
            } else if (arrayList.isEmpty() || m0.g(((File) r0.u3(arrayList)).getName(), "..")) {
                arrayList.add(file);
            }
        }
        return arrayList;
    }

    public static final i k0(i iVar) {
        return new i(iVar.e(), j0(iVar.g()));
    }

    @oy.l
    public static final File l0(@oy.l File file, @oy.l File base) {
        m0.p(file, "<this>");
        m0.p(base, "base");
        return new File(u0(file, base));
    }

    @oy.m
    public static final File m0(@oy.l File file, @oy.l File base) throws IOException {
        m0.p(file, "<this>");
        m0.p(base, "base");
        String strV0 = v0(file, base);
        if (strV0 != null) {
            return new File(strV0);
        }
        return null;
    }

    @oy.l
    public static final File n0(@oy.l File file, @oy.l File base) throws IOException {
        m0.p(file, "<this>");
        m0.p(base, "base");
        String strV0 = v0(file, base);
        return strV0 != null ? new File(strV0) : file;
    }

    @oy.l
    public static final File o0(@oy.l File file, @oy.l File relative) {
        m0.p(file, "<this>");
        m0.p(relative, "relative");
        if (n.d(relative)) {
            return relative;
        }
        String string = file.toString();
        m0.o(string, "toString(...)");
        if (string.length() != 0) {
            char c10 = File.separatorChar;
            if (!p0.s3(string, c10, false, 2, null)) {
                return new File(string + c10 + relative);
            }
        }
        return new File(string + relative);
    }

    @oy.l
    public static File p0(@oy.l File file, @oy.l String relative) {
        m0.p(file, "<this>");
        m0.p(relative, "relative");
        return o0(file, new File(relative));
    }

    @oy.l
    public static final File q0(@oy.l File file, @oy.l File relative) {
        m0.p(file, "<this>");
        m0.p(relative, "relative");
        i iVarF = n.f(file);
        return o0(o0(iVarF.e(), iVarF.h() == 0 ? new File("..") : iVarF.j(0, iVarF.h() - 1)), relative);
    }

    @oy.l
    public static final File r0(@oy.l File file, @oy.l String relative) {
        m0.p(file, "<this>");
        m0.p(relative, "relative");
        return q0(file, new File(relative));
    }

    public static final boolean s0(@oy.l File file, @oy.l File other) {
        m0.p(file, "<this>");
        m0.p(other, "other");
        i iVarF = n.f(file);
        i iVarF2 = n.f(other);
        if (m0.g(iVarF.e(), iVarF2.e()) && iVarF.h() >= iVarF2.h()) {
            return iVarF.g().subList(0, iVarF2.h()).equals(iVarF2.g());
        }
        return false;
    }

    public static final boolean t0(@oy.l File file, @oy.l String other) {
        m0.p(file, "<this>");
        m0.p(other, "other");
        return s0(file, new File(other));
    }

    @oy.l
    public static final String u0(@oy.l File file, @oy.l File base) throws IOException {
        m0.p(file, "<this>");
        m0.p(base, "base");
        String strV0 = v0(file, base);
        if (strV0 != null) {
            return strV0;
        }
        throw new IllegalArgumentException("this and base files have different roots: " + file + " and " + base + kj.e.f102543c);
    }

    public static final String v0(File file, File file2) throws IOException {
        i iVarK0 = k0(n.f(file));
        i iVarK1 = k0(n.f(file2));
        if (!m0.g(iVarK0.e(), iVarK1.e())) {
            return null;
        }
        int iH = iVarK1.h();
        int iH2 = iVarK0.h();
        int iMin = Math.min(iH2, iH);
        int i10 = 0;
        while (i10 < iMin && m0.g(iVarK0.g().get(i10), iVarK1.g().get(i10))) {
            i10++;
        }
        StringBuilder sb2 = new StringBuilder();
        int i11 = iH - 1;
        if (i10 <= i11) {
            while (!m0.g(iVarK1.g().get(i11).getName(), "..")) {
                sb2.append("..");
                if (i11 != i10) {
                    sb2.append(File.separatorChar);
                }
                if (i11 != i10) {
                    i11--;
                }
            }
            return null;
        }
        if (i10 < iH2) {
            if (i10 < iH) {
                sb2.append(File.separatorChar);
            }
            List listG2 = r0.g2(iVarK0.g(), i10);
            String separator = File.separator;
            m0.o(separator, "separator");
            r0.o3(listG2, sb2, (112 & 2) != 0 ? ", " : separator, (112 & 4) != 0 ? "" : null, (112 & 8) == 0 ? null : "", (112 & 16) != 0 ? -1 : 0, (112 & 32) != 0 ? "..." : null, (112 & 64) != 0 ? null : null);
        }
        return sb2.toString();
    }
}
