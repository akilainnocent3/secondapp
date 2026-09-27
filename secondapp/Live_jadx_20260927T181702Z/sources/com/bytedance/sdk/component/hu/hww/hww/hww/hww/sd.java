package com.bytedance.sdk.component.hu.hww.hww.hww.hww;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.hu.hww.ok;
import com.bytedance.sdk.component.utils.omn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class sd {

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private static int f34539sd = 20;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private boolean f34541hv;
    private final Context hww;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private boolean f34542ok;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    protected final List<com.bytedance.sdk.component.hu.hww.vy.hww> f34544tq = new ArrayList();
    private final List<com.bytedance.sdk.component.hu.hww.vy.hww> vy = new ArrayList();

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private boolean f34540hu = false;
    private volatile boolean vgm = false;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private final Runnable f34543rs = new Runnable() { // from class: com.bytedance.sdk.component.hu.hww.hww.hww.hww.sd.1
        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList;
            synchronized (sd.this) {
                try {
                    sd.this.vgm = false;
                    if (sd.this.f34544tq.isEmpty()) {
                        sd.this.f34540hu = false;
                        return;
                    }
                    if (sd.this.f34541hv) {
                        int size = sd.this.f34544tq.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            sd.this.vy.add(sd.this.f34544tq.get(i10));
                        }
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(sd.this.f34544tq);
                    }
                    sd.this.f34544tq.clear();
                    sd.this.f34540hu = false;
                    if (arrayList != null) {
                        sd.this.vy(arrayList);
                        return;
                    }
                    sd sdVar = sd.this;
                    sdVar.vy(sdVar.vy);
                    sd.this.vy.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    };

    public sd(Context context) {
        this.f34542ok = true;
        this.hww = context;
        try {
            com.bytedance.sdk.component.hu.hww.hv hvVarWgt = ok.vgm().wgt();
            if (hvVarWgt != null) {
                this.f34542ok = hvVarWgt.weu();
                this.f34541hv = hvVarWgt.wgt();
                f34539sd = hvVarWgt.bs();
            }
            omn.hww("DBInsertMemRepo", "enableOpt:" + this.f34542ok + ",BATCH_SIZE:" + f34539sd, Boolean.valueOf(this.f34541hv));
        } catch (Throwable unused) {
        }
    }

    public long hu() {
        return 10000L;
    }

    public Context hv() {
        return this.hww;
    }

    public synchronized void sd(List<String> list) {
        if (list != null) {
            if (!list.isEmpty()) {
                try {
                    Iterator<com.bytedance.sdk.component.hu.hww.vy.hww> it = this.f34544tq.iterator();
                    while (it.hasNext()) {
                        com.bytedance.sdk.component.hu.hww.vy.hww next = it.next();
                        if (next != null) {
                            String strSd = next.sd();
                            if (!TextUtils.isEmpty(strSd) && list.contains(strSd)) {
                                it.remove();
                            }
                        }
                    }
                } catch (Throwable th2) {
                    tq();
                    th2.getMessage();
                }
            }
        }
    }

    public abstract String tq();

    public void vy(List<com.bytedance.sdk.component.hu.hww.vy.hww> list) {
        com.bytedance.sdk.component.hu.hww.hww.hww.sd.hww(hv(), tq(), list);
    }

    private void hww() {
        if (!this.f34540hu) {
            com.bytedance.sdk.component.hu.hww.vgm.hww.hww().postDelayed(this.f34543rs, this.f34541hv ? hu() : com.bytedance.sdk.component.hu.hww.vgm.hww.tq());
            this.f34540hu = true;
        }
        if (this.f34542ok && this.f34544tq.size() >= f34539sd && !this.vgm) {
            com.bytedance.sdk.component.hu.hww.vgm.hww.hww().removeCallbacks(this.f34543rs);
            com.bytedance.sdk.component.hu.hww.vgm.hww.hww().post(this.f34543rs);
            this.f34540hu = true;
            this.vgm = true;
        }
    }

    public synchronized void hww(com.bytedance.sdk.component.hu.hww.vy.hww hwwVar) {
        if (hwwVar.vgm() != null && !TextUtils.isEmpty(hwwVar.sd())) {
            this.f34544tq.add(hwwVar);
            hww();
        }
    }
}
