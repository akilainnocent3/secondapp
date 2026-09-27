package com.bytedance.sdk.component.hv.vy.sd;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bytedance.sdk.component.hv.bs;
import com.bytedance.sdk.component.hv.ed;
import com.bytedance.sdk.component.hv.hnv;
import com.bytedance.sdk.component.hv.jpb;
import com.bytedance.sdk.component.hv.omn;
import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hu {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private com.bytedance.sdk.component.hv.vy f34767hu;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private ExecutorService f34769ok;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private Context f34770rs;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private volatile bs f34771sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final ed f34772tq;
    private ExecutorService vgm;
    private volatile jpb vy;
    private Map<String, List<sd>> hww = new ConcurrentHashMap();

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private Map<String, com.bytedance.sdk.component.hv.sd> f34768hv = new ConcurrentHashMap();

    public hu(Context context, ed edVar) {
        this.f34772tq = (ed) vgm.hww(edVar);
        this.f34770rs = context;
        com.bytedance.sdk.component.hv.vy.sd.hww.tq.hww(context, edVar.ok());
    }

    private com.bytedance.sdk.component.hv.vy nod() {
        com.bytedance.sdk.component.hv.vy vyVarVy = this.f34772tq.vy();
        return vyVarVy == null ? new com.bytedance.sdk.component.hv.tq.hww() : vyVarVy;
    }

    private ExecutorService vhb() {
        ExecutorService executorServiceTq = this.f34772tq.tq();
        return executorServiceTq != null ? executorServiceTq : com.bytedance.sdk.component.hv.vy.hww.tq.hww();
    }

    private com.bytedance.sdk.component.hv.sd vy(com.bytedance.sdk.component.hv.tq tqVar) {
        com.bytedance.sdk.component.hv.sd sdVarVgm = this.f34772tq.vgm();
        return sdVarVgm != null ? sdVarVgm : new com.bytedance.sdk.component.hv.vy.sd.hww.hww.tq(tqVar.ok(), tqVar.hww());
    }

    public hnv hu() {
        ed edVar = this.f34772tq;
        if (edVar != null) {
            return edVar.rs();
        }
        return null;
    }

    public ExecutorService hv() {
        ExecutorService executorServiceHww;
        omn omnVarSd = this.f34772tq.sd();
        if (omnVarSd != null && (executorServiceHww = omnVarSd.hww()) != null) {
            return executorServiceHww;
        }
        if (this.vgm == null) {
            this.vgm = vhb();
        }
        return this.vgm;
    }

    public Context hww() {
        return this.f34770rs;
    }

    public ExecutorService ok() {
        ExecutorService executorServiceTq;
        omn omnVarSd = this.f34772tq.sd();
        if (omnVarSd != null && (executorServiceTq = omnVarSd.tq()) != null) {
            return executorServiceTq;
        }
        if (this.f34769ok == null) {
            this.f34769ok = com.bytedance.sdk.component.hv.vy.hww.tq.hww();
        }
        return this.f34769ok;
    }

    public Map<String, List<sd>> rs() {
        return this.hww;
    }

    public Collection<com.bytedance.sdk.component.hv.sd> sd() {
        return this.f34768hv.values();
    }

    public jpb tq() {
        return this.vy;
    }

    public boolean vgm() {
        ed edVar = this.f34772tq;
        if (edVar != null) {
            return edVar.nod();
        }
        return false;
    }

    public bs hww(com.bytedance.sdk.component.hv.tq tqVar) {
        if (tqVar == null) {
            tqVar = com.bytedance.sdk.component.hv.vy.sd.hww.tq.nod();
        }
        if (this.f34771sd == null) {
            synchronized (com.bytedance.sdk.component.hv.vy.sd.hww.tq.sd.class) {
                try {
                    if (this.f34771sd == null) {
                        this.f34771sd = new com.bytedance.sdk.component.hv.vy.sd.hww.tq.sd(new com.bytedance.sdk.component.hv.vy.sd.hww.tq.hww(tqVar.tq(), tqVar.sd()));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f34771sd;
    }

    public com.bytedance.sdk.component.hv.sd sd(com.bytedance.sdk.component.hv.tq tqVar) {
        if (tqVar == null) {
            tqVar = com.bytedance.sdk.component.hv.vy.sd.hww.tq.nod();
        }
        String string = tqVar.ok().toString();
        com.bytedance.sdk.component.hv.sd sdVar = this.f34768hv.get(string);
        if (sdVar != null) {
            return sdVar;
        }
        com.bytedance.sdk.component.hv.sd sdVarVy = vy(tqVar);
        this.f34768hv.put(string, sdVarVy);
        return sdVarVy;
    }

    public jpb tq(com.bytedance.sdk.component.hv.tq tqVar) {
        if (tqVar == null) {
            tqVar = com.bytedance.sdk.component.hv.vy.sd.hww.tq.nod();
        }
        if (this.vy == null) {
            synchronized (com.bytedance.sdk.component.hv.vy.sd.hww.tq.tq.class) {
                try {
                    if (this.vy == null) {
                        this.vy = new com.bytedance.sdk.component.hv.vy.sd.hww.tq.tq(tqVar.tq(), tqVar.vy());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.vy;
    }

    public com.bytedance.sdk.component.hv.vy vy() {
        if (this.f34767hu == null) {
            this.f34767hu = nod();
        }
        return this.f34767hu;
    }

    public com.bytedance.sdk.component.hv.sd hww(String str) {
        return sd(com.bytedance.sdk.component.hv.vy.sd.hww.tq.hww(new File(str)));
    }

    public com.bytedance.sdk.component.hv.vy.sd.tq.tq hww(sd sdVar) {
        ImageView.ScaleType scaleTypeVy = sdVar.vy();
        if (scaleTypeVy == null) {
            scaleTypeVy = com.bytedance.sdk.component.hv.vy.sd.tq.tq.hww;
        }
        ImageView.ScaleType scaleType = scaleTypeVy;
        Bitmap.Config configVhb = sdVar.vhb();
        if (configVhb == null) {
            configVhb = com.bytedance.sdk.component.hv.vy.sd.tq.tq.f34833tq;
        }
        return new com.bytedance.sdk.component.hv.vy.sd.tq.tq(sdVar.tq(), sdVar.sd(), scaleType, configVhb, sdVar.hu(), sdVar.vgm());
    }
}
