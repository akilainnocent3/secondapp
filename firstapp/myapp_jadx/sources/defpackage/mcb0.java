package defpackage;

import android.os.Bundle;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.sportygames.commons.SportyGamesManager;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.io.FileWalkDirection;
import kotlin.text.c;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes7.dex */
public final class mcb0 {
    public final List<String> a = b.k(".atlas", ".atlas.txt");
    public final List<String> b = b.k(".skel", ".json", ".skel.bytes");
    public final List<String> c = b.k(".png", ".webp");
    public final ConcurrentHashMap<String, quw> d = new ConcurrentHashMap<>();

    public static boolean a(File file, String str) {
        try {
            Request requestBuild = new Request.Builder().url(str).build();
            mpe0 mpe0Var = on0.a;
            Response responseExecute = FirebasePerfOkHttpClient.execute(((OkHttpClient) on0.x.getValue()).newCall(requestBuild));
            try {
                if (responseExecute.getIsSuccessful()) {
                    File parentFile = file.getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                    }
                    File file2 = new File(file.getParent(), file.getName() + ".tmp");
                    InputStream inputStreamByteStream = responseExecute.body().byteStream();
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        try {
                            ll5.a(inputStreamByteStream, fileOutputStream);
                            fileOutputStream.flush();
                            fileOutputStream.getFD().sync();
                            Unit unit = Unit.a;
                            fileOutputStream.close();
                            inputStreamByteStream.close();
                            if (file2.renameTo(file)) {
                                responseExecute.close();
                                return true;
                            }
                            c("Atomic rename failed");
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
                            ft7.a(inputStreamByteStream, th3);
                            throw th4;
                        }
                    }
                } else {
                    c("Download HTTP Error: " + responseExecute.code());
                }
                responseExecute.close();
                return false;
            } catch (Throwable th5) {
                try {
                    throw th5;
                } catch (Throwable th6) {
                    ft7.a(responseExecute, th5);
                    throw th6;
                }
            }
        } catch (Exception e) {
            c("Download Exception: " + e.getLocalizedMessage());
            return false;
        }
    }

    public static void b(File file) {
        File file2;
        File[] fileArrListFiles;
        Object bVar;
        File[] fileArrListFiles2 = file.listFiles();
        if (fileArrListFiles2 == null) {
            return;
        }
        boolean z = true;
        if (fileArrListFiles2.length == 1 && fileArrListFiles2[0].isDirectory() && (fileArrListFiles = (file2 = fileArrListFiles2[0]).listFiles()) != null) {
            for (File file3 : fileArrListFiles) {
                File file4 = new File(file, file3.getName());
                if (!file3.renameTo(file4)) {
                    try {
                        zi50.a aVar = zi50.b;
                        if (file3.isDirectory()) {
                            bVar = Boolean.valueOf(qlh.h(file3, file4));
                        } else {
                            qlh.i(file3, file4);
                            bVar = file4;
                        }
                    } catch (Throwable th) {
                        zi50.a aVar2 = zi50.b;
                        bVar = new zi50.b(th);
                    }
                    if (bVar instanceof zi50.b) {
                        z = false;
                    } else {
                        qlh.j(file3);
                    }
                }
            }
            if (z) {
                qlh.j(file2);
            } else {
                c("Flatten failed: some files could not be moved");
            }
        }
    }

    public static void c(String str) {
        zj60 bridge;
        Bundle bundleA = mll0.a("spine_reason", str);
        SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
        if (sportyGamesManager == null || (bridge = sportyGamesManager.getBridge()) == null) {
            return;
        }
        ((bk60) bridge).a("spine_download", bundleA);
    }

    public static boolean e(File file, File file2) {
        try {
            file2.mkdirs();
            String str = file2.getCanonicalPath() + File.separator;
            ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(file)));
            try {
                for (ZipEntry nextEntry = zipInputStream.getNextEntry(); nextEntry != null; nextEntry = zipInputStream.getNextEntry()) {
                    File file3 = new File(file2, nextEntry.getName());
                    String canonicalPath = file3.getCanonicalPath();
                    canonicalPath.getClass();
                    if (!c.u(canonicalPath, str, false)) {
                        throw new IOException("Invalid zip entry: " + nextEntry.getName());
                    }
                    if (nextEntry.isDirectory()) {
                        file3.mkdirs();
                    } else {
                        File parentFile = file3.getParentFile();
                        if (parentFile != null) {
                            parentFile.mkdirs();
                        }
                        FileOutputStream fileOutputStream = new FileOutputStream(file3);
                        try {
                            ll5.a(zipInputStream, fileOutputStream);
                            fileOutputStream.close();
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                ft7.a(fileOutputStream, th);
                                throw th2;
                            }
                        }
                    }
                    zipInputStream.closeEntry();
                    c("Unzip Failed: " + e.getLocalizedMessage());
                    return false;
                }
                Unit unit = Unit.a;
                zipInputStream.close();
                return true;
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    ft7.a(zipInputStream, th3);
                    throw th4;
                }
            }
        } catch (Exception e) {
            c("Unzip Failed: " + e.getLocalizedMessage());
            return false;
        }
    }

    public final jcb0 d(File file) {
        Object next;
        Object next2;
        Object next3;
        Object bVar;
        if (file.exists() && file.isDirectory()) {
            List listK = ld80.k(ld80.d(olh.g(file, FileWalkDirection.a), new y8b(1)));
            Iterator it = listK.iterator();
            loop0: while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                File file2 = (File) next;
                List<String> list = this.a;
                if (list == null || !list.isEmpty()) {
                    for (String str : list) {
                        String name = file2.getName();
                        name.getClass();
                        if (c.k(name, str, true)) {
                            break loop0;
                        }
                    }
                }
            }
            File file3 = (File) next;
            if (file3 != null) {
                Iterator it2 = listK.iterator();
                loop2: while (true) {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                    File file4 = (File) next2;
                    List<String> list2 = this.b;
                    if (list2 == null || !list2.isEmpty()) {
                        for (String str2 : list2) {
                            String name2 = file4.getName();
                            name2.getClass();
                            if (c.k(name2, str2, true)) {
                                break loop2;
                            }
                        }
                    }
                }
                File file5 = (File) next2;
                if (file5 != null) {
                    Iterator it3 = listK.iterator();
                    loop4: while (true) {
                        if (!it3.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it3.next();
                        File file6 = (File) next3;
                        List<String> list3 = this.c;
                        if (list3 == null || !list3.isEmpty()) {
                            for (String str3 : list3) {
                                String name3 = file6.getName();
                                name3.getClass();
                                if (c.k(name3, str3, true)) {
                                    break loop4;
                                }
                            }
                        }
                    }
                    File file7 = (File) next3;
                    if (file7 != null && file7.exists()) {
                        if (!file3.canRead() || !file5.canRead()) {
                            c("File read failed");
                            return null;
                        }
                        if (file3.length() < 50 || file5.length() < 500) {
                            c("File size invalid");
                            return null;
                        }
                        try {
                            zi50.a aVar = zi50.b;
                            bVar = kb0.a(file3, file5);
                        } catch (Throwable th) {
                            zi50.a aVar2 = zi50.b;
                            bVar = new zi50.b(th);
                        }
                        if (!(bVar instanceof zi50.b)) {
                            return new jcb0(file3.getPath(), file5.getPath(), file7.getPath());
                        }
                        c("Spine validation failed");
                        return null;
                    }
                    c("PNG file missing");
                }
            }
        }
        return null;
    }
}
