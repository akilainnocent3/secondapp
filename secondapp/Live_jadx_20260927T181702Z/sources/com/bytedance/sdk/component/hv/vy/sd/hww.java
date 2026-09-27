package com.bytedance.sdk.component.hv.vy.sd;

import com.bytedance.sdk.component.hv.mrs;
import com.bytedance.sdk.component.hv.vhb;
import com.bytedance.sdk.component.hv.wgt;
import com.ironsource.C4235d4;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww<T> {
    private sd hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private mrs f34785tq;

    public hww(sd sdVar, mrs mrsVar) {
        this.hww = sdVar;
        this.f34785tq = mrsVar;
    }

    public void hww(vhb<T> vhbVar) {
        try {
            mrs mrsVar = this.f34785tq;
            if (mrsVar != null) {
                mrsVar.hww("success", this.hww);
            }
            String strOmn = this.hww.omn();
            Map<String, List<sd>> mapRs = this.hww.bs().rs();
            List<sd> list = mapRs.get(strOmn);
            if (list == null) {
                wgt wgtVarOk = this.hww.ok();
                if (wgtVarOk != null) {
                    wgtVarOk.toString();
                    this.hww.nod();
                    wgtVarOk.hww(vhbVar);
                }
            } else {
                synchronized (list) {
                    try {
                        list.size();
                        for (sd sdVar : list) {
                            wgt wgtVarOk2 = sdVar.ok();
                            if (wgtVarOk2 != null) {
                                wgtVarOk2.toString();
                                sdVar.nod();
                                wgtVarOk2.hww(vhbVar);
                            }
                        }
                        list.clear();
                        mapRs.remove(strOmn);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            mrs mrsVar2 = this.f34785tq;
            if (mrsVar2 != null) {
                mrsVar2.tq("success", this.hww);
            }
        } catch (Throwable unused) {
        }
    }

    public void hww(int i10, String str, Throwable th2) {
        try {
            mrs mrsVar = this.f34785tq;
            if (mrsVar != null) {
                mrsVar.hww(C4235d4.i.f61440t, this.hww);
            }
            String strOmn = this.hww.omn();
            Map<String, List<sd>> mapRs = this.hww.bs().rs();
            List<sd> list = mapRs.get(strOmn);
            if (list == null) {
                wgt wgtVarOk = this.hww.ok();
                if (wgtVarOk != null) {
                    wgtVarOk.hww(i10, str, th2);
                }
            } else {
                synchronized (list) {
                    try {
                        Iterator<sd> it = list.iterator();
                        while (it.hasNext()) {
                            wgt wgtVarOk2 = it.next().ok();
                            if (wgtVarOk2 != null) {
                                wgtVarOk2.toString();
                                wgtVarOk2.hww(i10, str, th2);
                            }
                        }
                        list.clear();
                        mapRs.remove(strOmn);
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
            mrs mrsVar2 = this.f34785tq;
            if (mrsVar2 != null) {
                mrsVar2.tq(C4235d4.i.f61440t, this.hww);
            }
        } catch (Throwable unused) {
        }
    }
}
