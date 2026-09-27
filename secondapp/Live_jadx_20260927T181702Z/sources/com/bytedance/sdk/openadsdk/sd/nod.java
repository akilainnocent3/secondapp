package com.bytedance.sdk.openadsdk.sd;

import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.omn;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.core.model.kub;
import com.bytedance.sdk.openadsdk.utils.syb;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class nod {

    /* JADX INFO: renamed from: bs, reason: collision with root package name */
    private kub f37589bs;

    /* JADX INFO: renamed from: ed, reason: collision with root package name */
    private String f37590ed;

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    protected IListenerManager f37591hu;
    private int jpb;
    private String khx;
    private int mrs;

    /* JADX INFO: renamed from: ny, reason: collision with root package name */
    private String f37592ny;
    private FilterWord omn;
    private String vhb;
    private JSONObject weu;
    private String wgt;
    public static FilterWord hww = new FilterWord("", "");

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    public static int f37588tq = 1;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    public static int f37587sd = 2;
    public static int vy = 3;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    public static int f37586hv = 4;
    private final Set<sd> vgm = new HashSet();

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private final Set<tq> f37593ok = new HashSet();

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private final Set<vy> f37594rs = new HashSet();
    private final Set<hww> nod = new HashSet();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface hww {
        void hww(List<FilterWord> list);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface sd {
        void hww(FilterWord filterWord);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface tq {
        void hww(int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface vy {
        void hww(String str);
    }

    private void nod() {
        Iterator<sd> it = this.vgm.iterator();
        while (it.hasNext()) {
            it.next().hww(this.omn);
        }
    }

    public void hu() {
        Iterator<tq> it = this.f37593ok.iterator();
        while (it.hasNext()) {
            it.next().hww(f37586hv);
        }
    }

    public void hv() {
        Iterator<tq> it = this.f37593ok.iterator();
        while (it.hasNext()) {
            it.next().hww(f37587sd);
        }
    }

    public int ok() {
        return this.jpb;
    }

    public boolean rs() {
        return this.jpb < this.mrs;
    }

    public boolean sd() {
        FilterWord filterWord = this.omn;
        return (filterWord == null || filterWord.equals(hww)) ? false : true;
    }

    public void tq(String str) {
        this.f37592ny = str;
    }

    public String vgm() {
        return this.khx;
    }

    public void vy() {
        if (!sd() && !TextUtils.isEmpty(this.khx)) {
            this.omn = new FilterWord("0:00", this.khx);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.omn);
        if (!TextUtils.isEmpty(this.vhb)) {
            if (TextUtils.isEmpty(this.khx)) {
                com.bytedance.sdk.openadsdk.sd.tq.hww().hww(this.vhb, arrayList, this.f37592ny);
            } else {
                if (this.weu == null) {
                    kub kubVar = this.f37589bs;
                    if (kubVar != null) {
                        this.weu = kubVar.jp();
                    } else {
                        try {
                            this.weu = new JSONObject(this.wgt);
                        } catch (Throwable th2) {
                            omn.hww("TTDislikeManager", "creative info to json exception", th2);
                        }
                    }
                }
                com.bytedance.sdk.openadsdk.sd.tq.hww().hww(this.vhb, arrayList, this.weu, this.khx, this.f37592ny);
            }
        }
        if (!TextUtils.isEmpty(this.f37590ed)) {
            if (com.bytedance.sdk.openadsdk.multipro.tq.sd()) {
                vy("onItemClickClosed");
            } else {
                com.bytedance.sdk.openadsdk.core.vy.vgm.hww hwwVarHv = com.bytedance.sdk.openadsdk.core.rs.tq().hv(this.f37590ed);
                if (hwwVarHv != null) {
                    hwwVarHv.hww();
                    com.bytedance.sdk.openadsdk.core.rs.tq().hu(this.f37590ed);
                }
            }
        }
        Iterator<tq> it = this.f37593ok.iterator();
        while (it.hasNext()) {
            it.next().hww(f37588tq);
        }
        hww(hww);
        sd("");
    }

    public void hww() {
        this.vgm.clear();
        this.f37593ok.clear();
        this.f37594rs.clear();
        this.nod.clear();
    }

    public void sd(String str) {
        this.khx = str;
        Iterator<vy> it = this.f37594rs.iterator();
        while (it.hasNext()) {
            it.next().hww(this.khx);
        }
    }

    public FilterWord tq() {
        return this.omn;
    }

    public void hww(String str) {
        this.vhb = str;
    }

    public void hww(FilterWord filterWord) {
        this.omn = filterWord;
        nod();
    }

    public void hww(sd sdVar) {
        this.vgm.add(sdVar);
    }

    public void hww(tq tqVar) {
        this.f37593ok.add(tqVar);
    }

    public void hww(vy vyVar) {
        this.f37594rs.add(vyVar);
    }

    public void hww(hww hwwVar) {
        this.nod.add(hwwVar);
    }

    public void hww(List<FilterWord> list) {
        Iterator<hww> it = this.nod.iterator();
        while (it.hasNext()) {
            it.next().hww(list);
        }
    }

    public IListenerManager hww(int i10) {
        if (this.f37591hu == null) {
            this.f37591hu = IListenerManager.Stub.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.hww.hww().hww(i10));
        }
        return this.f37591hu;
    }

    public static void hww(final int i10, final String str, final com.bytedance.sdk.openadsdk.core.vy.vgm.hww hwwVar) {
        if (com.bytedance.sdk.openadsdk.multipro.tq.sd()) {
            syb.sd(new com.bytedance.sdk.component.ok.ok("DislikeClosed_registerMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.sd.nod.2
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.hww hwwVarHww = com.bytedance.sdk.openadsdk.multipro.aidl.hww.hww();
                    if (i10 != 6 || hwwVar == null) {
                        return;
                    }
                    try {
                        com.bytedance.sdk.openadsdk.multipro.aidl.tq.tq tqVar = new com.bytedance.sdk.openadsdk.multipro.aidl.tq.tq(str, hwwVar);
                        IListenerManager iListenerManagerAsInterface = IListenerManager.Stub.asInterface(hwwVarHww.hww(6));
                        if (iListenerManagerAsInterface != null) {
                            iListenerManagerAsInterface.registerDisLikeClosedListener(str, tqVar);
                        }
                    } catch (RemoteException e10) {
                        omn.sd("TTDislikeManager", e10.getMessage());
                    }
                }
            }, 5);
        }
    }

    public static void hww(final int i10, final String str) {
        if (com.bytedance.sdk.openadsdk.multipro.tq.sd()) {
            syb.sd(new com.bytedance.sdk.component.ok.ok("DislikeClosed_unregisterMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.sd.nod.3
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.hww hwwVarHww = com.bytedance.sdk.openadsdk.multipro.aidl.hww.hww();
                    if (i10 == 6) {
                        try {
                            IListenerManager iListenerManagerAsInterface = IListenerManager.Stub.asInterface(hwwVarHww.hww(6));
                            if (iListenerManagerAsInterface != null) {
                                iListenerManagerAsInterface.unregisterDisLikeClosedListener(str);
                            }
                        } catch (RemoteException unused) {
                        }
                    }
                }
            }, 5);
        }
    }

    private void vy(final String str) {
        syb.sd(new com.bytedance.sdk.component.ok.ok("Reward_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.sd.nod.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (TextUtils.isEmpty(nod.this.f37590ed)) {
                        return;
                    }
                    nod.this.hww(6).executeDisLikeClosedCallback(nod.this.f37590ed, str);
                } catch (Throwable th2) {
                    omn.hww("TTDislikeManager", "executeRewardVideoCallback execute throw Exception : ", th2);
                }
            }
        }, 5);
    }

    public void hww(String str, kub kubVar) {
        this.wgt = str;
        this.f37589bs = kubVar;
    }

    public void hww(int i10, int i11) {
        this.jpb = i10;
        this.mrs = i11;
    }
}
