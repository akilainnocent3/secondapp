package com.bytedance.sdk.component.hv.vy.sd.hww.hww;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.nod;
import com.bytedance.sdk.component.utils.vgm;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww {
    private int hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private File f34786tq;

    private hww(int i10, File file) {
        this.hww = i10;
        this.f34786tq = file;
    }

    public static hww hww(int i10, File file) {
        try {
            hww hwwVar = new hww(i10, file);
            if (file != null) {
                file.mkdirs();
            }
            return hwwVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    private void sd(File file) {
        if (file == null) {
            return;
        }
        try {
            vgm.tq(file);
        } catch (Throwable unused) {
        }
    }

    private List<File> tq(File file) {
        List<File> listHww = hww(file);
        if (listHww == null || listHww.isEmpty()) {
            return null;
        }
        final HashMap map = new HashMap();
        for (File file2 : listHww) {
            map.put(file2, Long.valueOf(file2.lastModified()));
        }
        Collections.sort(listHww, new Comparator<File>() { // from class: com.bytedance.sdk.component.hv.vy.sd.hww.hww.hww.1
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: hww, reason: merged with bridge method [inline-methods] */
            public int compare(File file3, File file4) {
                if (file3 == null && file4 == null) {
                    return 0;
                }
                if (file3 == null) {
                    return 1;
                }
                if (file4 == null) {
                    return -1;
                }
                return Long.compare(((Long) map.get(file4)).longValue(), ((Long) map.get(file3)).longValue());
            }
        });
        return listHww;
    }

    private static void vy(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private File sd(String str) {
        return new File(this.f34786tq, str + ".temp");
    }

    public synchronized InputStream hww(String str) {
        FileInputStream fileInputStream;
        if (this.hww <= 0) {
            return null;
        }
        File fileTq = tq(str);
        try {
            try {
                fileInputStream = new FileInputStream(fileTq);
                try {
                    sd(fileTq);
                    return fileInputStream;
                } catch (FileNotFoundException unused) {
                    nod.hww(fileInputStream);
                    return null;
                }
            } catch (Throwable unused2) {
                return null;
            }
        } catch (FileNotFoundException unused3) {
            fileInputStream = null;
        }
    }

    private File tq(String str) {
        return new File(this.f34786tq, str);
    }

    public synchronized boolean hww(String str, byte[] bArr) {
        if (this.hww > 0 && str != null && bArr != null) {
            File fileSd = sd(str);
            FileOutputStream fileOutputStream = null;
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(fileSd);
                try {
                    fileOutputStream2.write(bArr);
                    if (fileSd.exists()) {
                        hww(fileSd, tq(str), true);
                    }
                    nod.hww(fileOutputStream2);
                    List<File> listHww = hww(this.f34786tq);
                    if (listHww != null) {
                        int size = listHww.size();
                        int i10 = this.hww;
                        if (size > i10) {
                            hww((int) (((double) i10) * 0.7d));
                        }
                    }
                    return true;
                } catch (FileNotFoundException unused) {
                    fileOutputStream = fileOutputStream2;
                    try {
                        File file = this.f34786tq;
                        if (file != null) {
                            file.mkdirs();
                        }
                        nod.hww(fileOutputStream);
                        List<File> listHww2 = hww(this.f34786tq);
                        if (listHww2 != null) {
                            int size2 = listHww2.size();
                            int i11 = this.hww;
                            if (size2 > i11) {
                                hww((int) (((double) i11) * 0.7d));
                            }
                        }
                        return false;
                    } catch (Throwable th2) {
                        nod.hww(fileOutputStream);
                        List<File> listHww3 = hww(this.f34786tq);
                        if (listHww3 != null) {
                            int size3 = listHww3.size();
                            int i12 = this.hww;
                            if (size3 > i12) {
                                hww((int) (((double) i12) * 0.7d));
                            }
                        }
                        throw th2;
                    }
                } catch (Throwable unused2) {
                    fileOutputStream = fileOutputStream2;
                    nod.hww(fileOutputStream);
                    List<File> listHww4 = hww(this.f34786tq);
                    if (listHww4 != null) {
                        int size4 = listHww4.size();
                        int i13 = this.hww;
                        if (size4 > i13) {
                            hww((int) (((double) i13) * 0.7d));
                        }
                    }
                    return false;
                }
            } catch (FileNotFoundException unused3) {
            } catch (Throwable unused4) {
            }
        }
        return false;
    }

    private List<File> hww(File file) {
        File[] fileArrListFiles;
        if (file != null) {
            try {
                if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null && fileArrListFiles.length != 0) {
                    List<File> listAsList = Arrays.asList(fileArrListFiles);
                    ArrayList arrayList = new ArrayList();
                    for (File file2 : listAsList) {
                        if (file2 != null && file2.isFile() && !TextUtils.isEmpty(file2.getName()) && !file2.getName().endsWith(".temp")) {
                            arrayList.add(file2);
                        }
                    }
                    return arrayList;
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public synchronized void hww(int i10) {
        try {
            if (i10 > this.hww) {
                return;
            }
            List<File> listTq = tq(this.f34786tq);
            if (listTq != null && listTq.size() > i10) {
                while (i10 < listTq.size()) {
                    File file = listTq.get(i10);
                    if (file != null && file.exists()) {
                        file.delete();
                    }
                    i10++;
                }
            }
        } catch (Throwable unused) {
        }
    }

    private void hww(File file, File file2, boolean z10) throws IOException {
        if (z10) {
            vy(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }
}
