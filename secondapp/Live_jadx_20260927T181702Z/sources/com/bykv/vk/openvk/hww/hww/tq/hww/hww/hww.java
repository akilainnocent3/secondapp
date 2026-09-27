package com.bykv.vk.openvk.hww.hww.tq.hww.hww;

import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class hww implements com.bykv.vk.openvk.hww.hww.hww.hww.tq {
    private String hww = "video_reward_full";

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private String f31603tq = "video_brand";

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private String f31602sd = "video_splash";
    private String vy = "video_default";

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private String f31599hv = null;

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private String f31598hu = null;
    private String vgm = null;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private String f31600ok = null;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private String f31601rs = null;

    private List<com.bykv.vk.openvk.hww.hww.hww.hww.hww> hu() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.bykv.vk.openvk.hww.hww.hww.hww.hww(new File(hww()).listFiles(), com.bykv.vk.openvk.hww.hww.tq.hww.sd()));
        arrayList.add(new com.bykv.vk.openvk.hww.hww.hww.hww.hww(new File(tq()).listFiles(), com.bykv.vk.openvk.hww.hww.tq.hww.tq()));
        arrayList.add(new com.bykv.vk.openvk.hww.hww.hww.hww.hww(new File(hv()).listFiles(), com.bykv.vk.openvk.hww.hww.tq.hww.vy()));
        arrayList.add(new com.bykv.vk.openvk.hww.hww.hww.hww.hww(new File(sd()).listFiles(), com.bykv.vk.openvk.hww.hww.tq.hww.hv()));
        return arrayList;
    }

    private Set<String> vgm() {
        HashSet hashSet = new HashSet();
        for (com.bykv.vk.openvk.hww.hww.tq.hww.hww hwwVar : com.bykv.vk.openvk.hww.hww.tq.hww.hww.hww.values()) {
            if (hwwVar != null && hwwVar.hww() != null) {
                com.bykv.vk.openvk.hww.hww.hww.sd.sd sdVarHww = hwwVar.hww();
                hashSet.add(com.bykv.vk.openvk.hww.hww.tq.vy.tq.tq(sdVarHww.hv(), sdVarHww.bs()).getAbsolutePath());
                hashSet.add(com.bykv.vk.openvk.hww.hww.tq.vy.tq.sd(sdVarHww.hv(), sdVarHww.bs()).getAbsolutePath());
            }
        }
        for (com.bykv.vk.openvk.hww.hww.tq.hww.tq.tq tqVar : com.bykv.vk.openvk.hww.hww.tq.hww.tq.sd.hww.values()) {
            if (tqVar != null && tqVar.hww() != null) {
                com.bykv.vk.openvk.hww.hww.hww.sd.sd sdVarHww2 = tqVar.hww();
                hashSet.add(com.bykv.vk.openvk.hww.hww.tq.vy.tq.tq(sdVarHww2.hv(), sdVarHww2.bs()).getAbsolutePath());
                hashSet.add(com.bykv.vk.openvk.hww.hww.tq.vy.tq.sd(sdVarHww2.hv(), sdVarHww2.bs()).getAbsolutePath());
            }
        }
        return hashSet;
    }

    public String hv() {
        if (this.vgm == null) {
            this.vgm = this.f31599hv + File.separator + this.f31603tq;
            File file = new File(this.vgm);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.vgm;
    }

    @Override // com.bykv.vk.openvk.hww.hww.hww.hww.tq
    public void hww(String str) {
        this.f31599hv = str;
    }

    @Override // com.bykv.vk.openvk.hww.hww.hww.hww.tq
    public String sd() {
        if (this.f31601rs == null) {
            this.f31601rs = this.f31599hv + File.separator + this.vy;
            File file = new File(this.f31601rs);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.f31601rs;
    }

    @Override // com.bykv.vk.openvk.hww.hww.hww.hww.tq
    public String tq() {
        if (this.f31600ok == null) {
            this.f31600ok = this.f31599hv + File.separator + this.f31602sd;
            File file = new File(this.f31600ok);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.f31600ok;
    }

    @Override // com.bykv.vk.openvk.hww.hww.hww.hww.tq
    public synchronized void vy() {
        try {
            Set<String> setVgm = null;
            for (com.bykv.vk.openvk.hww.hww.hww.hww.hww hwwVar : hu()) {
                File[] fileArrHww = hwwVar.hww();
                if (fileArrHww != null && fileArrHww.length >= hwwVar.tq()) {
                    if (setVgm == null) {
                        setVgm = vgm();
                    }
                    int iTq = hwwVar.tq() - 2;
                    if (iTq < 0) {
                        iTq = 0;
                    }
                    hww(hwwVar.hww(), iTq, setVgm);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.bykv.vk.openvk.hww.hww.hww.hww.tq
    public String hww() {
        if (this.f31598hu == null) {
            this.f31598hu = this.f31599hv + File.separator + this.hww;
            File file = new File(this.f31598hu);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.f31598hu;
    }

    @Override // com.bykv.vk.openvk.hww.hww.hww.hww.tq
    public long tq(com.bykv.vk.openvk.hww.hww.hww.sd.sd sdVar) {
        if (TextUtils.isEmpty(sdVar.hv()) || TextUtils.isEmpty(sdVar.bs())) {
            return 0L;
        }
        return com.bykv.vk.openvk.hww.hww.tq.vy.tq.hww(sdVar.hv(), sdVar.bs());
    }

    @Override // com.bykv.vk.openvk.hww.hww.hww.hww.tq
    public boolean hww(com.bykv.vk.openvk.hww.hww.hww.sd.sd sdVar) {
        if (TextUtils.isEmpty(sdVar.hv()) || TextUtils.isEmpty(sdVar.bs())) {
            return false;
        }
        return new File(sdVar.hv(), sdVar.bs()).exists();
    }

    private static void hww(File[] fileArr, int i10, Set<String> set) {
        if (i10 >= 0 && fileArr != null) {
            try {
                if (fileArr.length > i10) {
                    List listAsList = Arrays.asList(fileArr);
                    Collections.sort(listAsList, new Comparator<File>() { // from class: com.bykv.vk.openvk.hww.hww.tq.hww.hww.hww.1
                        @Override // java.util.Comparator
                        /* JADX INFO: renamed from: hww, reason: merged with bridge method [inline-methods] */
                        public int compare(File file, File file2) {
                            long jLastModified = file2.lastModified() - file.lastModified();
                            if (jLastModified == 0) {
                                return 0;
                            }
                            return jLastModified < 0 ? -1 : 1;
                        }
                    });
                    while (i10 < listAsList.size()) {
                        File file = (File) listAsList.get(i10);
                        if (set != null && !set.contains(file.getAbsolutePath())) {
                            ((File) listAsList.get(i10)).delete();
                        }
                        i10++;
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
