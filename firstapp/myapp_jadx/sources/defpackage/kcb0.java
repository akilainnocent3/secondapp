package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes7.dex */
public final class kcb0 {
    public static final File a(File file, List<String> list) {
        File fileA;
        if (file.isFile() && (list == null || !list.isEmpty())) {
            for (String str : list) {
                String name = file.getName();
                name.getClass();
                if (c.k(name, str, false)) {
                    return file;
                }
            }
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return null;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isFile() && (list == null || !list.isEmpty())) {
                for (String str2 : list) {
                    String name2 = file2.getName();
                    name2.getClass();
                    if (c.k(name2, str2, false)) {
                        return file2;
                    }
                }
            }
            if (file2.isDirectory() && (fileA = a(file2, list)) != null) {
                return fileA;
            }
        }
        return null;
    }

    public static final File b(File[] fileArr, List<String> list) {
        ArrayList arrayListA = kw5.a(list);
        int i = 0;
        for (File file : fileArr) {
            String name = file.getName();
            name.getClass();
            if (!StringsKt.M(name, "__MACOSX", false)) {
                arrayListA.add(file);
            }
        }
        int size = arrayListA.size();
        while (i < size) {
            Object obj = arrayListA.get(i);
            i++;
            File fileA = a((File) obj, list);
            if (fileA != null) {
                return fileA;
            }
        }
        return null;
    }
}
