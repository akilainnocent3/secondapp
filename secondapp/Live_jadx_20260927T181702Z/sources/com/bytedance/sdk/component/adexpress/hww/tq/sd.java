package com.bytedance.sdk.component.adexpress.hww.tq;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.sdk.component.utils.oxu;
import com.ironsource.G5;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import s7.d;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class sd {
    public abstract File hww();

    public boolean hww(Map<String, com.bytedance.sdk.component.adexpress.hww.sd.hww> map) {
        if (map == null || map.size() == 0) {
            return false;
        }
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            com.bytedance.sdk.component.adexpress.hww.sd.hww hwwVar = map.get(it.next());
            if (hwwVar != null && !hww(hwwVar.hu())) {
                return false;
            }
        }
        return true;
    }

    public void sd(List<com.bytedance.sdk.component.adexpress.hww.sd.hww.C0319hww> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<com.bytedance.sdk.component.adexpress.hww.sd.hww.C0319hww> it = list.iterator();
        while (it.hasNext()) {
            File file = new File(hww(), com.bytedance.sdk.component.utils.hv.hww(it.next().hww()));
            File file2 = new File(file + ".tmp");
            if (file.exists()) {
                try {
                    file.delete();
                } catch (Throwable unused) {
                }
            }
            if (file2.exists()) {
                try {
                    file2.delete();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public List<com.bytedance.sdk.component.adexpress.hww.sd.hww.C0319hww> tq(com.bytedance.sdk.component.adexpress.hww.sd.hww hwwVar, com.bytedance.sdk.component.adexpress.hww.sd.hww hwwVar2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (hwwVar2 == null || hwwVar2.hu().isEmpty()) {
            arrayList2.addAll(hwwVar.hu());
        } else if (hwwVar.hu().isEmpty()) {
            arrayList.addAll(hwwVar2.hu());
        } else {
            for (com.bytedance.sdk.component.adexpress.hww.sd.hww.C0319hww c0319hww : hwwVar.hu()) {
                if (!hwwVar2.hu().contains(c0319hww) && c0319hww != null && c0319hww.hww() != null && c0319hww.tq() != null) {
                    arrayList2.add(c0319hww);
                }
            }
            for (com.bytedance.sdk.component.adexpress.hww.sd.hww.C0319hww c0319hww2 : hwwVar2.hu()) {
                if (!hwwVar.hu().contains(c0319hww2)) {
                    arrayList.add(c0319hww2);
                }
            }
        }
        if (hww(arrayList2, arrayList3)) {
            return arrayList;
        }
        return null;
    }

    public boolean hww(List<com.bytedance.sdk.component.adexpress.hww.sd.hww.C0319hww> list) {
        if (list == null || list.size() <= 0 || hww() == null) {
            return false;
        }
        for (com.bytedance.sdk.component.adexpress.hww.sd.hww.C0319hww c0319hww : list) {
            String strHww = com.bytedance.sdk.component.utils.hv.hww(c0319hww.hww());
            if (TextUtils.isEmpty(strHww)) {
                return false;
            }
            File file = new File(hww(), strHww);
            String strHww2 = com.bytedance.sdk.component.utils.hv.hww(file);
            if (!file.exists() || !file.isFile() || c0319hww.tq() == null || !c0319hww.tq().equals(strHww2)) {
                return false;
            }
        }
        return true;
    }

    public static boolean sd(com.bytedance.sdk.component.adexpress.hww.sd.hww hwwVar, com.bytedance.sdk.component.adexpress.hww.sd.hww hwwVar2) {
        if (hwwVar != null) {
            try {
                if (!TextUtils.isEmpty(hwwVar.sd())) {
                    if (hwwVar2 == null) {
                        return false;
                    }
                    String strVgm = hwwVar.vgm();
                    String strVgm2 = hwwVar2.vgm();
                    if ((!TextUtils.isEmpty(strVgm2) && !strVgm2.equals(strVgm)) || hww(hwwVar.sd(), hwwVar2.sd())) {
                        return true;
                    }
                    Map<String, com.bytedance.sdk.component.adexpress.hww.sd.hww> mapHww = hwwVar.hww();
                    Map<String, com.bytedance.sdk.component.adexpress.hww.sd.hww> mapHww2 = hwwVar2.hww();
                    if (mapHww.isEmpty()) {
                        return !mapHww2.isEmpty();
                    }
                    if (mapHww2.isEmpty()) {
                        return false;
                    }
                    return hww(mapHww, mapHww2);
                }
            } catch (Throwable th2) {
                th2.getMessage();
                return false;
            }
        }
        return true;
    }

    public boolean hww(com.bytedance.sdk.component.adexpress.hww.sd.hww.tq tqVar) {
        if (tqVar == null || hww() == null) {
            return false;
        }
        List<Pair<String, String>> listTq = tqVar.tq();
        if (listTq == null || listTq.size() <= 0) {
            return true;
        }
        Iterator<Pair<String, String>> it = listTq.iterator();
        while (it.hasNext()) {
            File file = new File(hww(), (String) it.next().first);
            if (!file.exists() || !file.isFile()) {
                return false;
            }
        }
        return true;
    }

    public void tq(List<com.bytedance.sdk.component.adexpress.hww.sd.hww.C0319hww> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<com.bytedance.sdk.component.adexpress.hww.sd.hww.C0319hww> it = list.iterator();
        while (it.hasNext()) {
            File file = new File(hww(), com.bytedance.sdk.component.utils.hv.hww(it.next().hww()));
            File file2 = new File(file + ".tmp");
            if (file.exists()) {
                try {
                    file.delete();
                } catch (Throwable unused) {
                }
            }
            if (file2.exists()) {
                try {
                    file2.delete();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public List<com.bytedance.sdk.component.adexpress.hww.sd.hww.C0319hww> hww(com.bytedance.sdk.component.adexpress.hww.sd.hww hwwVar, com.bytedance.sdk.component.adexpress.hww.sd.hww hwwVar2) {
        Map<String, com.bytedance.sdk.component.adexpress.hww.sd.hww> mapHww = hwwVar.hww();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (mapHww.size() == 0) {
            if (hwwVar2 != null && hwwVar2.hww().size() != 0) {
                Map<String, com.bytedance.sdk.component.adexpress.hww.sd.hww> mapHww2 = hwwVar2.hww();
                Iterator<String> it = mapHww2.keySet().iterator();
                while (it.hasNext()) {
                    com.bytedance.sdk.component.adexpress.hww.sd.hww hwwVar3 = mapHww2.get(it.next());
                    if (hwwVar3 != null) {
                        arrayList.addAll(hwwVar3.hu());
                    }
                }
            }
        } else if (hwwVar2 != null && hwwVar2.hww().size() != 0) {
            Map<String, com.bytedance.sdk.component.adexpress.hww.sd.hww> mapHww3 = hwwVar2.hww();
            for (String str : mapHww.keySet()) {
                com.bytedance.sdk.component.adexpress.hww.sd.hww hwwVar4 = mapHww.get(str);
                com.bytedance.sdk.component.adexpress.hww.sd.hww hwwVar5 = mapHww3.get(str);
                if (hwwVar5 == null && hwwVar4 != null) {
                    arrayList2.addAll(hwwVar4.hu());
                } else if (hwwVar4 == null && hwwVar5 != null) {
                    arrayList.addAll(hwwVar5.hu());
                } else if (hwwVar4 != null) {
                    for (com.bytedance.sdk.component.adexpress.hww.sd.hww.C0319hww c0319hww : hwwVar4.hu()) {
                        if (c0319hww != null && !hwwVar5.hu().contains(c0319hww) && c0319hww.tq() != null && c0319hww.hww() != null) {
                            arrayList2.add(c0319hww);
                        }
                    }
                    for (com.bytedance.sdk.component.adexpress.hww.sd.hww.C0319hww c0319hww2 : hwwVar5.hu()) {
                        if (c0319hww2 != null && !hwwVar4.hu().contains(c0319hww2)) {
                            arrayList.add(c0319hww2);
                        }
                    }
                }
            }
        } else if (mapHww.size() != 0) {
            Iterator<String> it2 = mapHww.keySet().iterator();
            while (it2.hasNext()) {
                com.bytedance.sdk.component.adexpress.hww.sd.hww hwwVar6 = mapHww.get(it2.next());
                if (hwwVar6 != null) {
                    arrayList2.addAll(hwwVar6.hu());
                }
            }
        }
        if (hww(arrayList2, arrayList3)) {
            return arrayList;
        }
        return null;
    }

    public static void tq(File file, com.bytedance.sdk.component.adexpress.hww.sd.hww hwwVar, String str) {
        if (hwwVar == null || file == null) {
            return;
        }
        try {
            new File(file, str).delete();
        } catch (Throwable unused) {
        }
        if (hwwVar.hu() != null) {
            Iterator<com.bytedance.sdk.component.adexpress.hww.sd.hww.C0319hww> it = hwwVar.hu().iterator();
            while (it.hasNext()) {
                try {
                    new File(file, com.bytedance.sdk.component.utils.hv.hww(it.next().hww())).delete();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    private boolean hww(List<com.bytedance.sdk.component.adexpress.hww.sd.hww.C0319hww> list, List<com.bytedance.sdk.component.adexpress.hww.sd.hww.C0319hww> list2) {
        for (com.bytedance.sdk.component.adexpress.hww.sd.hww.C0319hww c0319hww : list) {
            String strHww = c0319hww.hww();
            String strHww2 = com.bytedance.sdk.component.utils.hv.hww(strHww);
            File file = new File(hww(), strHww2);
            File file2 = new File(file + ".tmp");
            if (file.exists()) {
                try {
                    file.delete();
                } catch (Throwable unused) {
                }
            }
            if (file2.exists()) {
                try {
                    file2.delete();
                } catch (Throwable unused2) {
                }
            }
            com.bytedance.sdk.component.vgm.tq.hww hwwVarHu = com.bytedance.sdk.component.adexpress.hww.hww.hww.hww().sd().hu();
            hwwVarHu.tq(strHww);
            hwwVarHu.hww(hww().getAbsolutePath(), strHww2);
            com.bytedance.sdk.component.vgm.tq tqVarHww = hwwVarHu.hww();
            list2.add(c0319hww);
            if (tqVarHww == null || !tqVarHww.hu() || tqVarHww.hv() == null || !tqVarHww.hv().exists()) {
                sd(list2);
                return false;
            }
        }
        return true;
    }

    public boolean hww(String str) {
        String strHww = com.bytedance.sdk.component.utils.hv.hww(str);
        File file = new File(hww().getAbsoluteFile(), strHww + d.f129681l);
        com.bytedance.sdk.component.vgm.tq.hww hwwVarHu = com.bytedance.sdk.component.adexpress.hww.hww.hww.hww().sd().hu();
        hwwVarHu.tq(str);
        hwwVarHu.hww(file.getParent(), file.getName());
        com.bytedance.sdk.component.vgm.tq tqVarHww = hwwVarHu.hww();
        if (tqVarHww.hu() && tqVarHww.hv() != null && tqVarHww.hv().exists()) {
            File fileHv = tqVarHww.hv();
            try {
                oxu.hww(fileHv.getAbsolutePath(), file.getParent());
                if (!fileHv.exists()) {
                    return true;
                }
                fileHv.delete();
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public void hww(int i10) {
        if (com.bytedance.sdk.component.adexpress.hww.hww.hww.hww().vy() != null) {
            com.bytedance.sdk.component.adexpress.hww.hww.hww.hww().vy().hww(i10);
        }
    }

    public static void hww(File file, com.bytedance.sdk.component.adexpress.hww.sd.hww hwwVar, String str) {
        FileOutputStream fileOutputStream;
        if (hwwVar == null) {
            return;
        }
        String strNod = hwwVar.nod();
        if (TextUtils.isEmpty(strNod)) {
            return;
        }
        File file2 = new File(file, str);
        File file3 = new File(file2 + ".tmp");
        if (file3.exists()) {
            file3.delete();
        }
        try {
            try {
                fileOutputStream = new FileOutputStream(file3);
                try {
                    fileOutputStream.write(strNod.getBytes(G5.N));
                    if (file2.exists()) {
                        file2.delete();
                    }
                    file3.renameTo(file2);
                    fileOutputStream.close();
                } catch (Throwable unused) {
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                }
            } catch (Throwable unused2) {
                fileOutputStream = null;
            }
        } catch (IOException unused3) {
        }
    }

    private static boolean hww(Map<String, com.bytedance.sdk.component.adexpress.hww.sd.hww> map, Map<String, com.bytedance.sdk.component.adexpress.hww.sd.hww> map2) {
        if (map.size() != map2.size()) {
            return true;
        }
        for (String str : map2.keySet()) {
            com.bytedance.sdk.component.adexpress.hww.sd.hww hwwVar = map.get(str);
            if (hwwVar == null) {
                return true;
            }
            com.bytedance.sdk.component.adexpress.hww.sd.hww hwwVar2 = map2.get(str);
            if (hwwVar2 == null) {
                return false;
            }
            if (hww(hwwVar.sd(), hwwVar2.sd())) {
                return true;
            }
        }
        return false;
    }

    private static boolean hww(String str, String str2) {
        String[] strArrSplit = str2.split("\\.");
        String[] strArrSplit2 = str.split("\\.");
        int iMin = Math.min(strArrSplit.length, strArrSplit2.length);
        for (int i10 = 0; i10 < iMin; i10++) {
            int length = strArrSplit[i10].length() - strArrSplit2[i10].length();
            if (length == 0) {
                int iCompareTo = strArrSplit[i10].compareTo(strArrSplit2[i10]);
                if (iCompareTo > 0) {
                    return true;
                }
                if (iCompareTo < 0) {
                    return false;
                }
                if (i10 == iMin - 1) {
                    return strArrSplit.length > strArrSplit2.length;
                }
            } else if (length > 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean hww(com.bytedance.sdk.component.adexpress.hww.sd.hww hwwVar, String str) {
        if (hwwVar == null) {
            return true;
        }
        try {
            if (TextUtils.isEmpty(hwwVar.sd())) {
                return true;
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return hww(hwwVar.sd(), str);
        } catch (Throwable unused) {
            return false;
        }
    }
}
