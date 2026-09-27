package com.mbridge.msdk.config.component.common.file;

import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.session.fe;
import com.mbridge.msdk.foundation.download.download.ResourceManager;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.foundation.tools.q0;
import com.vungle.ads.internal.model.AdPayload;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import lk.e;
import s7.d;
import to.c;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class a {
    public static b a(String str, int i10, String str2) {
        b bVar;
        b bVar2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            String strD = d(str);
            String strF = f(str);
            bVar = new b();
            try {
                bVar.a(a());
                bVar.c(strD);
                if (!strD.contains("mp4")) {
                    strF = strF.concat(strD);
                }
                bVar.b(strF);
                if (strD.contains("zip")) {
                    bVar.d(j(str));
                    String strB = b(str, i10, str2);
                    bVar.a(b(strB));
                    bVar.e(strB);
                } else {
                    bVar.a(b(bVar.a()));
                }
            } catch (Throwable th2) {
                th = th2;
                bVar2 = bVar;
                q0.b("ComponentFileUtil", th.getMessage());
                bVar = bVar2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        if (bVar != null) {
            a(bVar.a());
        }
        return bVar;
    }

    /* JADX WARN: Code duplicated, block: B:133:0x0132 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x014e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:0x013c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x0158 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:? A[SYNTHETIC] */
    public static boolean b(String str, String str2) throws Throwable {
        Throwable th2;
        InputStream inputStream;
        IOException iOException;
        InputStream inputStream2;
        FileOutputStream fileOutputStream;
        IOException e10;
        Throwable th3;
        String canonicalPath;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        if (!file.exists()) {
            return false;
        }
        FileOutputStream fileOutputStream2 = null;
        InputStream inputStream3 = null;
        FileOutputStream fileOutputStream3 = null;
        try {
            ZipFile zipFile = new ZipFile(file);
            Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
            FileOutputStream fileOutputStream4 = null;
            while (enumerationEntries.hasMoreElements()) {
                try {
                    try {
                        ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                        if (zipEntryNextElement == null) {
                            if (inputStream3 != null) {
                                try {
                                    inputStream3.close();
                                } catch (IOException e11) {
                                    q0.b("ComponentFileUtil", "unzip error", e11);
                                }
                            }
                            if (fileOutputStream4 != null) {
                                try {
                                    fileOutputStream4.close();
                                } catch (IOException e12) {
                                    q0.b("ComponentFileUtil", "unzip error", e12);
                                }
                            }
                            return false;
                        }
                        String name = zipEntryNextElement.getName();
                        if (!TextUtils.isEmpty(name) && !name.startsWith("..") && !name.startsWith("../")) {
                            File file2 = new File(str2 + name);
                            try {
                                canonicalPath = file2.getCanonicalPath();
                            } catch (IOException unused) {
                                canonicalPath = "";
                            }
                            if (!TextUtils.isEmpty(canonicalPath) && !canonicalPath.startsWith("..") && !canonicalPath.startsWith("../")) {
                                if (zipEntryNextElement.isDirectory()) {
                                    file2.mkdirs();
                                } else {
                                    if (file2.getParentFile() != null && !file2.getParentFile().exists()) {
                                        file2.getParentFile().mkdirs();
                                    }
                                    fileOutputStream = new FileOutputStream(file2);
                                    try {
                                        inputStream3 = zipFile.getInputStream(zipEntryNextElement);
                                        byte[] bArr = new byte[1024];
                                        while (true) {
                                            int i10 = inputStream3.read(bArr, 0, 1024);
                                            if (i10 == -1) {
                                                break;
                                            }
                                            fileOutputStream.write(bArr, 0, i10);
                                            fileOutputStream.flush();
                                        }
                                        fileOutputStream4 = fileOutputStream;
                                    } catch (IOException e13) {
                                        e10 = e13;
                                        try {
                                            q0.b("ComponentFileUtil", "unzip error", e10);
                                            if (inputStream3 != null) {
                                                try {
                                                    inputStream3.close();
                                                } catch (IOException e14) {
                                                    q0.b("ComponentFileUtil", "unzip error", e14);
                                                }
                                            }
                                            if (fileOutputStream != null) {
                                                try {
                                                    fileOutputStream.close();
                                                } catch (IOException e15) {
                                                    q0.b("ComponentFileUtil", "unzip error", e15);
                                                }
                                            }
                                            return false;
                                        } catch (Throwable th4) {
                                            th2 = th4;
                                            inputStream = inputStream3;
                                            fileOutputStream2 = fileOutputStream;
                                            fileOutputStream = fileOutputStream2;
                                            inputStream3 = inputStream;
                                            th3 = th2;
                                            if (inputStream3 != null) {
                                                try {
                                                    inputStream3.close();
                                                } catch (IOException e16) {
                                                    q0.b("ComponentFileUtil", "unzip error", e16);
                                                }
                                            }
                                            if (fileOutputStream == null) {
                                                throw th3;
                                            }
                                            try {
                                                fileOutputStream.close();
                                                throw th3;
                                            } catch (IOException e17) {
                                                q0.b("ComponentFileUtil", "unzip error", e17);
                                                throw th3;
                                            }
                                        }
                                    } catch (Throwable th5) {
                                        th3 = th5;
                                        if (inputStream3 != null) {
                                            inputStream3.close();
                                        }
                                        if (fileOutputStream == null) {
                                            throw th3;
                                        }
                                        fileOutputStream.close();
                                        throw th3;
                                    }
                                }
                            }
                            if (inputStream3 != null) {
                                try {
                                    inputStream3.close();
                                } catch (IOException e18) {
                                    q0.b("ComponentFileUtil", "unzip error", e18);
                                }
                            }
                            if (fileOutputStream4 != null) {
                                try {
                                    fileOutputStream4.close();
                                } catch (IOException e19) {
                                    q0.b("ComponentFileUtil", "unzip error", e19);
                                }
                            }
                            return false;
                        }
                        if (inputStream3 != null) {
                            try {
                                inputStream3.close();
                            } catch (IOException e20) {
                                q0.b("ComponentFileUtil", "unzip error", e20);
                            }
                        }
                        if (fileOutputStream4 != null) {
                            try {
                                fileOutputStream4.close();
                            } catch (IOException e21) {
                                q0.b("ComponentFileUtil", "unzip error", e21);
                            }
                        }
                        return false;
                    } catch (IOException e22) {
                        iOException = e22;
                        inputStream2 = inputStream3;
                        fileOutputStream3 = fileOutputStream4;
                        fileOutputStream = fileOutputStream3;
                        inputStream3 = inputStream2;
                        e10 = iOException;
                        q0.b("ComponentFileUtil", "unzip error", e10);
                        if (inputStream3 != null) {
                            inputStream3.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        return false;
                    }
                } catch (Throwable th6) {
                    th2 = th6;
                    inputStream = inputStream3;
                    fileOutputStream2 = fileOutputStream4;
                    fileOutputStream = fileOutputStream2;
                    inputStream3 = inputStream;
                    th3 = th2;
                    if (inputStream3 != null) {
                        inputStream3.close();
                    }
                    if (fileOutputStream == null) {
                        throw th3;
                    }
                    fileOutputStream.close();
                    throw th3;
                }
            }
            zipFile.close();
            if (inputStream3 != null) {
                try {
                    inputStream3.close();
                } catch (IOException e23) {
                    q0.b("ComponentFileUtil", "unzip error", e23);
                }
            }
            if (fileOutputStream4 == null) {
                return true;
            }
            try {
                fileOutputStream4.close();
                return true;
            } catch (IOException e24) {
                q0.b("ComponentFileUtil", "unzip error", e24);
                return true;
            }
        } catch (IOException e25) {
            iOException = e25;
            inputStream2 = null;
        } catch (Throwable th7) {
            th2 = th7;
            inputStream = null;
        }
    }

    public static String c(String str) {
        String strHexEncode = "";
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        File file = new File(str);
        if (file.exists() && file.length() > 0) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i10 = fileInputStream.read(bArr);
                        if (i10 == -1) {
                            strHexEncode = SameMD5.hexEncode(messageDigest.digest());
                            messageDigest.reset();
                            fileInputStream.close();
                            return strHexEncode;
                        }
                        messageDigest.update(bArr, 0, i10);
                        q0.b("ComponentFileUtil", th.getMessage());
                    }
                } catch (Throwable th2) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                q0.b("ComponentFileUtil", th4.getMessage());
            }
        }
        return strHexEncode;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021  */
    public static String d(String str) {
        String str2;
        String str3 = "";
        try {
            String lastPathSegment = Uri.parse(str).getLastPathSegment();
            if (TextUtils.isEmpty(lastPathSegment)) {
                str2 = "";
            } else {
                String[] strArrSplit = lastPathSegment.split("\\.");
                if (strArrSplit.length > 0) {
                    str2 = strArrSplit[strArrSplit.length - 1];
                } else {
                    str2 = "";
                }
            }
            try {
                return TextUtils.isEmpty(str2) ? "" : fe.F.concat(str2);
            } catch (Throwable th2) {
                str3 = str2;
                th = th2;
                q0.b("ComponentFileUtil", th.getMessage());
                return str3;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static b e(String str) {
        return a(str, 0, null);
    }

    public static String f(String str) {
        return !TextUtils.isEmpty(str) ? SameMD5.getMD5(c1.b(str.trim())) : "";
    }

    public static String g(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return a() + c.userBaseDel + f(str) + c.userBaseDel;
    }

    private static String h(String str) {
        List<String> queryParameters;
        if (!TextUtils.isEmpty(str) && (queryParameters = Uri.parse(str).getQueryParameters("filename")) != null && !queryParameters.isEmpty()) {
            String str2 = queryParameters.get(0);
            if (!TextUtils.isEmpty(str2)) {
                return str2;
            }
        }
        return "";
    }

    private static String i(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                Uri uri = Uri.parse(str);
                List<String> queryParameters = uri.getQueryParameters(ResourceManager.KEY_INDEX_HTML);
                if (queryParameters != null && !queryParameters.isEmpty()) {
                    return queryParameters.get(0);
                }
                String path = uri.getPath();
                if (!TextUtils.isEmpty(path)) {
                    String strSubstring = path.substring(path.lastIndexOf(47) + 1);
                    if (!TextUtils.isEmpty(strSubstring)) {
                        return strSubstring.replace(d.f129681l, "");
                    }
                }
            } catch (Exception unused) {
            }
        }
        return "";
    }

    public static String j(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strA = a();
        String strF = f(str);
        String strI = i(str);
        if (!TextUtils.isEmpty(strI)) {
            String str2 = strA + strF + c.userBaseDel + strI + c.userBaseDel;
            if (!TextUtils.isEmpty(str2)) {
                return str2;
            }
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void k(String str) {
        com.mbridge.msdk.config.component.database.a.a().c("UPDATE FileDB SET touchTime=" + System.currentTimeMillis() + " WHERE filePath='" + str + "'");
    }

    public static String a() {
        File file = new File(com.mbridge.msdk.foundation.controller.c.n().d().getFilesDir(), "mbCache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath().concat(File.separator);
    }

    private static void a(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        File file = new File(str);
        if (!file.exists() || file.length() <= 0) {
            return;
        }
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new Runnable() { // from class: gn.a
            @Override // java.lang.Runnable
            public final void run() {
                com.mbridge.msdk.config.component.common.file.a.k(str);
            }
        });
    }

    public static String a(String str, String str2) {
        String str3 = "";
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strSubstring = str.substring(str.indexOf("?") + 1);
        if (!TextUtils.isEmpty(strSubstring)) {
            str3 = "?" + strSubstring;
        }
        return AdPayload.FILE_SCHEME + str2 + str3;
    }

    private static String b(String str, int i10, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strJ = j(str);
        String strI = i(str);
        String strH = h(str);
        if (!TextUtils.isEmpty(strI)) {
            if (i10 == 0) {
                return strJ + strI + c.userBaseDel + strH;
            }
            if (i10 == 1) {
                return strJ + strI + ".html";
            }
            if (i10 == 2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(strJ);
                if (!TextUtils.isEmpty(strH)) {
                    strI = strH;
                }
                sb2.append(strI);
                sb2.append(e.f104695m);
                if (str2.equals("0")) {
                    str2 = "";
                }
                sb2.append(str2);
                sb2.append(androidx.appcompat.widget.c.f6977y);
                return sb2.toString();
            }
        }
        return "";
    }

    private static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return new File(str).exists();
        } catch (Throwable th2) {
            q0.b("ComponentFileUtil", th2.getMessage(), th2);
        }
    }
}
