package com.bytedance.sdk.openadsdk.core.ed.vy;

import com.bykv.vk.openvk.hww.hww.tq.sd.vy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class sd extends vy {
    private final hww vy;
    private final List<tq> hww = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private int f36146tq = 1;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private int f36145sd = 1;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface tq extends com.bykv.vk.openvk.hww.hww.hww.hww.InterfaceC0290hww {
        void hww(int i10, int i11);
    }

    public sd() {
        hww hwwVar = new hww();
        this.vy = hwwVar;
        super.hww(hwwVar);
        hww(500);
    }

    public static /* synthetic */ int hww(sd sdVar) {
        int i10 = sdVar.f36145sd;
        sdVar.f36145sd = i10 + 1;
        return i10;
    }

    @Override // com.bykv.vk.openvk.hww.hww.tq.sd.vy
    public long bs() {
        return super.bs() * ((long) this.f36146tq);
    }

    public int hnv() {
        return this.f36145sd;
    }

    @Override // com.bykv.vk.openvk.hww.hww.tq.sd.vy
    public long jpb() {
        long jJpb = super.jpb();
        return this.f36146tq == 1 ? jJpb : jJpb + (((long) (this.f36145sd - 1)) * super.bs());
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class hww implements com.bykv.vk.openvk.hww.hww.hww.hww.InterfaceC0290hww {
        private hww() {
        }

        @Override // com.bykv.vk.openvk.hww.hww.hww.hww.InterfaceC0290hww
        public void hv(com.bykv.vk.openvk.hww.hww.hww.hww hwwVar) {
            Iterator it = sd.this.hww.iterator();
            while (it.hasNext()) {
                ((tq) it.next()).hv(hwwVar);
            }
        }

        @Override // com.bykv.vk.openvk.hww.hww.hww.hww.InterfaceC0290hww
        public void hww(com.bykv.vk.openvk.hww.hww.hww.hww hwwVar) {
            sd.hww(sd.this);
            if (sd.this.f36145sd > sd.this.f36146tq) {
                Iterator it = sd.this.hww.iterator();
                while (it.hasNext()) {
                    ((tq) it.next()).hww(hwwVar);
                }
            } else {
                Iterator it2 = sd.this.hww.iterator();
                while (it2.hasNext()) {
                    ((tq) it2.next()).hww(sd.this.f36145sd, sd.this.f36146tq);
                }
                sd.this.rs();
            }
        }

        @Override // com.bykv.vk.openvk.hww.hww.hww.hww.InterfaceC0290hww
        public void sd(com.bykv.vk.openvk.hww.hww.hww.hww hwwVar) {
            Iterator it = sd.this.hww.iterator();
            while (it.hasNext()) {
                ((tq) it.next()).sd(hwwVar);
            }
        }

        @Override // com.bykv.vk.openvk.hww.hww.hww.hww.InterfaceC0290hww
        public void tq(com.bykv.vk.openvk.hww.hww.hww.hww hwwVar) {
            Iterator it = sd.this.hww.iterator();
            while (it.hasNext()) {
                ((tq) it.next()).tq(hwwVar);
            }
        }

        @Override // com.bykv.vk.openvk.hww.hww.hww.hww.InterfaceC0290hww
        public void vy(com.bykv.vk.openvk.hww.hww.hww.hww hwwVar) {
            Iterator it = sd.this.hww.iterator();
            while (it.hasNext()) {
                ((tq) it.next()).vy(hwwVar);
            }
        }

        @Override // com.bykv.vk.openvk.hww.hww.hww.hww.InterfaceC0290hww
        public void tq(com.bykv.vk.openvk.hww.hww.hww.hww hwwVar, int i10) {
            Iterator it = sd.this.hww.iterator();
            while (it.hasNext()) {
                ((tq) it.next()).tq(hwwVar, i10);
            }
        }

        @Override // com.bykv.vk.openvk.hww.hww.hww.hww.InterfaceC0290hww
        public void hww(com.bykv.vk.openvk.hww.hww.hww.hww hwwVar, long j10) {
            Iterator it = sd.this.hww.iterator();
            while (it.hasNext()) {
                ((tq) it.next()).hww(hwwVar, j10);
            }
        }

        @Override // com.bykv.vk.openvk.hww.hww.hww.hww.InterfaceC0290hww
        public void hww(com.bykv.vk.openvk.hww.hww.hww.hww hwwVar, com.bykv.vk.openvk.hww.hww.hww.sd.hww hwwVar2) {
            Iterator it = sd.this.hww.iterator();
            while (it.hasNext()) {
                ((tq) it.next()).hww(hwwVar, hwwVar2);
            }
        }

        @Override // com.bykv.vk.openvk.hww.hww.hww.hww.InterfaceC0290hww
        public void hww(com.bykv.vk.openvk.hww.hww.hww.hww hwwVar, boolean z10) {
            Iterator it = sd.this.hww.iterator();
            while (it.hasNext()) {
                ((tq) it.next()).hww(hwwVar, z10);
            }
        }

        @Override // com.bykv.vk.openvk.hww.hww.hww.hww.InterfaceC0290hww
        public void hww(com.bykv.vk.openvk.hww.hww.hww.hww hwwVar, int i10, int i11) {
            Iterator it = sd.this.hww.iterator();
            while (it.hasNext()) {
                ((tq) it.next()).hww(hwwVar, i10, i11);
            }
        }

        @Override // com.bykv.vk.openvk.hww.hww.hww.hww.InterfaceC0290hww
        public void hww(com.bykv.vk.openvk.hww.hww.hww.hww hwwVar, int i10, int i11, int i12) {
            Iterator it = sd.this.hww.iterator();
            while (it.hasNext()) {
                ((tq) it.next()).hww(hwwVar, i10, i11, i12);
            }
        }

        @Override // com.bykv.vk.openvk.hww.hww.hww.hww.InterfaceC0290hww
        public void hww(com.bykv.vk.openvk.hww.hww.hww.hww hwwVar, int i10) {
            Iterator it = sd.this.hww.iterator();
            while (it.hasNext()) {
                ((tq) it.next()).hww(hwwVar, i10);
            }
        }

        @Override // com.bykv.vk.openvk.hww.hww.hww.hww.InterfaceC0290hww
        public void hww(com.bykv.vk.openvk.hww.hww.hww.hww hwwVar, long j10, long j11) {
            Iterator it = sd.this.hww.iterator();
            while (it.hasNext()) {
                ((tq) it.next()).hww(hwwVar, j10, j11);
            }
        }
    }

    @Override // com.bykv.vk.openvk.hww.hww.tq.sd.vy
    public void hww(com.bykv.vk.openvk.hww.hww.hww.hww.InterfaceC0290hww interfaceC0290hww) {
        if (!(interfaceC0290hww instanceof tq)) {
            super.hww(interfaceC0290hww);
        } else {
            if (this.hww.contains(interfaceC0290hww)) {
                return;
            }
            this.hww.add((tq) interfaceC0290hww);
        }
    }

    public void sd(int i10) {
        this.f36146tq = Math.max(1, i10);
    }
}
