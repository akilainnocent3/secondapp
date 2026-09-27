package com.bytedance.sdk.component.tq.hww;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ny {
    public vhb hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    public com.bytedance.sdk.component.sd.hww.hww f35045tq = new com.bytedance.sdk.component.sd.hww.hww();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class hww {

        /* JADX INFO: renamed from: hu, reason: collision with root package name */
        ed f35046hu;

        /* JADX INFO: renamed from: hv, reason: collision with root package name */
        Object f35047hv;
        com.bytedance.sdk.component.tq.hww.hww hww;

        /* JADX INFO: renamed from: ok, reason: collision with root package name */
        String f35048ok;

        /* JADX INFO: renamed from: sd, reason: collision with root package name */
        vgm f35049sd;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        Map<String, List<String>> f35050tq;
        int vgm;
        String vy;

        public hww() {
            this.f35050tq = new HashMap();
        }

        public hww hww(com.bytedance.sdk.component.tq.hww.hww hwwVar) {
            this.hww = hwwVar;
            return this;
        }

        public hww tq(String str) {
            return hww(vgm.sd(str));
        }

        public hww hww(String str) {
            this.f35048ok = str;
            return this;
        }

        public hww tq(String str, String str2) {
            if (!this.f35050tq.containsKey(str)) {
                this.f35050tq.put(str, new ArrayList());
            }
            this.f35050tq.get(str).add(str2);
            return this;
        }

        public hww(ny nyVar) {
            this.f35049sd = nyVar.tq();
            this.vy = nyVar.sd();
            this.f35050tq = nyVar.vy();
            this.f35047hv = nyVar.hww();
            this.f35046hu = nyVar.ok();
            this.hww = nyVar.hv();
            this.vgm = nyVar.vgm();
            this.f35048ok = nyVar.hu();
        }

        public hww hww(int i10) {
            this.vgm = i10;
            return this;
        }

        public hww hww(Object obj) {
            this.f35047hv = obj;
            return this;
        }

        public hww hww(vgm vgmVar) {
            this.f35049sd = vgmVar;
            return this;
        }

        public ny tq() {
            return new ny() { // from class: com.bytedance.sdk.component.tq.hww.ny.hww.1
                @Override // com.bytedance.sdk.component.tq.hww.ny
                public String hu() {
                    return hww.this.f35048ok;
                }

                @Override // com.bytedance.sdk.component.tq.hww.ny
                public com.bytedance.sdk.component.tq.hww.hww hv() {
                    return hww.this.hww;
                }

                @Override // com.bytedance.sdk.component.tq.hww.ny
                public Object hww() {
                    return hww.this.f35047hv;
                }

                @Override // com.bytedance.sdk.component.tq.hww.ny
                public ed ok() {
                    return hww.this.f35046hu;
                }

                @Override // com.bytedance.sdk.component.tq.hww.ny
                public String sd() {
                    return hww.this.vy;
                }

                public String toString() {
                    return "";
                }

                @Override // com.bytedance.sdk.component.tq.hww.ny
                public vgm tq() {
                    return hww.this.f35049sd;
                }

                @Override // com.bytedance.sdk.component.tq.hww.ny
                public int vgm() {
                    return hww.this.vgm;
                }

                @Override // com.bytedance.sdk.component.tq.hww.ny
                public Map vy() {
                    return hww.this.f35050tq;
                }
            };
        }

        public hww hww(String str, String str2) {
            return tq(str, str2);
        }

        public hww hww() {
            return hww("GET", (ed) null);
        }

        private hww hww(String str, ed edVar) {
            this.vy = str;
            this.f35046hu = edVar;
            return this;
        }

        public hww hww(ed edVar) {
            return hww("POST", edVar);
        }
    }

    public abstract String hu();

    public abstract com.bytedance.sdk.component.tq.hww.hww hv();

    public abstract Object hww();

    public void hww(vhb vhbVar) {
        this.hww = vhbVar;
    }

    public ed ok() {
        return null;
    }

    public hww rs() {
        return new hww(this);
    }

    public abstract String sd();

    public abstract vgm tq();

    public abstract int vgm();

    public abstract Map<String, List<String>> vy();
}
