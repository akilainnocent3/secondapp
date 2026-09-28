package defpackage;

import elh.b;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.FileWalkDirection;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 4, 0}, xi = 49, xs = "kotlin/io/FilesKt")
public class qlh extends olh {
    public static boolean h(File file, File file2) throws IOException {
        final o09 o09Var = new o09(1);
        if (!file.exists()) {
            o09Var.invoke(file, new rwx(file, null, "The source file doesn't exist.", 2, null));
            throw null;
        }
        try {
            elh elhVarG = olh.g(file, FileWalkDirection.a);
            elh.b bVar = new elh(elhVarG.a, elhVarG.b, elhVarG.c, elhVarG.d, new Function2() { // from class: plh
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) throws scf0 {
                    File file3 = (File) obj;
                    IOException iOException = (IOException) obj2;
                    file3.getClass();
                    iOException.getClass();
                    if (o09Var.invoke(file3, iOException) != doy.a) {
                        return Unit.a;
                    }
                    throw new scf0(file3, null, null, 6, null);
                }
            }, elhVarG.f).new b();
            while (bVar.hasNext()) {
                File next = bVar.next();
                if (!next.exists()) {
                    o09Var.invoke(next, new rwx(next, null, "The source file doesn't exist.", 2, null));
                    throw null;
                }
                File file3 = new File(file2, m(next, file));
                if (file3.exists() && (!next.isDirectory() || !file3.isDirectory())) {
                    if (file3.isDirectory()) {
                        if (!j(file3)) {
                            o09Var.invoke(file3, new tjh(next, file3, "The destination file already exists."));
                            throw null;
                        }
                    } else if (!file3.delete()) {
                        o09Var.invoke(file3, new tjh(next, file3, "The destination file already exists."));
                        throw null;
                    }
                }
                if (next.isDirectory()) {
                    file3.mkdirs();
                } else {
                    i(next, file3);
                    if (file3.length() != next.length()) {
                        o09Var.invoke(next, new IOException("Source file wasn't copied completely, length of destination file differs."));
                        throw null;
                    }
                }
            }
            return true;
        } catch (scf0 unused) {
            return false;
        }
    }

    public static void i(File file, File file2) throws IOException {
        if (!file.exists()) {
            throw new rwx(file, null, "The source file doesn't exist.", 2, null);
        }
        if (file2.exists() && !file2.delete()) {
            throw new tjh(file, file2, "Tried to overwrite the destination, but failed to delete it.");
        }
        if (file.isDirectory()) {
            if (!file2.mkdirs()) {
                throw new clh(file, file2, "Failed to create target directory.");
            }
            return;
        }
        File parentFile = file2.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                ll5.a(fileInputStream, fileOutputStream);
                Unit unit = Unit.a;
                fileOutputStream.close();
                fileInputStream.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    ft7.a(fileOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                ft7.a(fileInputStream, th3);
                throw th4;
            }
        }
    }

    public static boolean j(File file) {
        file.getClass();
        elh.b bVar = olh.g(file, FileWalkDirection.b).new b();
        while (true) {
            boolean z = true;
            while (bVar.hasNext()) {
                File next = bVar.next();
                if (next.delete() || !next.exists()) {
                    if (z) {
                    }
                }
                z = false;
            }
            return z;
        }
    }

    public static final lkh k(lkh lkhVar) {
        File file = lkhVar.a;
        List<File> list = lkhVar.b;
        ArrayList arrayList = new ArrayList(list.size());
        for (File file2 : list) {
            String name = file2.getName();
            if (Intrinsics.g(name, ".")) {
                Unit unit = Unit.a;
            } else if (!Intrinsics.g(name, "..")) {
                arrayList.add(file2);
            } else if (arrayList.isEmpty() || Intrinsics.g(((File) CollectionsKt.b0(arrayList)).getName(), "..")) {
                arrayList.add(file2);
            }
        }
        return new lkh(file, arrayList);
    }

    public static File l(File file, String str) {
        file.getClass();
        File file2 = new File(str);
        String path = file2.getPath();
        path.getClass();
        if (mlh.a(path) > 0) {
            return file2;
        }
        String string = file.toString();
        string.getClass();
        if (string.length() != 0) {
            char c = File.separatorChar;
            if (!StringsKt.P(string, c)) {
                return new File(string + c + file2);
            }
        }
        return new File(string + file2);
    }

    public static final String m(File file, File file2) {
        String string;
        lkh lkhVarK = k(mlh.b(file));
        List<File> list = lkhVarK.b;
        lkh lkhVarK2 = k(mlh.b(file2));
        List<File> list2 = lkhVarK2.b;
        if (lkhVarK.a.equals(lkhVarK2.a)) {
            int size = list2.size();
            int size2 = list.size();
            int iMin = Math.min(size2, size);
            int i = 0;
            while (i < iMin && Intrinsics.g(list.get(i), list2.get(i))) {
                i++;
            }
            StringBuilder sb = new StringBuilder();
            int i2 = size - 1;
            if (i <= i2) {
                while (true) {
                    if (Intrinsics.g(list2.get(i2).getName(), "..")) {
                        string = null;
                    } else {
                        sb.append("..");
                        if (i2 != i) {
                            sb.append(File.separatorChar);
                        }
                        if (i2 != i) {
                            i2--;
                        }
                    }
                }
            }
            if (i < size2) {
                if (i < size) {
                    sb.append(File.separatorChar);
                }
                List listO = CollectionsKt.O(list, i);
                String str = File.separator;
                str.getClass();
                CollectionsKt.Z(listO, sb, str, null, 124);
            }
            string = sb.toString();
        } else {
            string = null;
        }
        if (string != null) {
            return string;
        }
        uj5.b("this and base files have different roots: ", file, " and ", file2, 46);
        return null;
    }
}
