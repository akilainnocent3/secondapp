package com.bytedance.sdk.component.hv.hww;

import com.bytedance.sdk.component.hv.ny;
import com.bytedance.sdk.component.hv.rs;
import com.bytedance.sdk.component.utils.wgt;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class tq {
    public static ny hww() {
        return new ny() { // from class: com.bytedance.sdk.component.hv.hww.tq.1
            private WeakHashMap<String, String> hww = new WeakHashMap<>();

            @Override // com.bytedance.sdk.component.hv.ny
            public String hww(rs rsVar) {
                return hww(rsVar.hww() + "#width=" + rsVar.tq() + "#height=" + rsVar.sd() + "#scaletype=" + rsVar.vy() + "#bitmapConfig=" + rsVar.hv());
            }

            @Override // com.bytedance.sdk.component.hv.ny
            public String tq(rs rsVar) {
                return hww(rsVar.hww());
            }

            private String hww(String str) {
                String str2 = this.hww.get(str);
                if (str2 != null) {
                    return str2;
                }
                String strHww = wgt.hww(str);
                this.hww.put(str, strHww);
                return strHww;
            }
        };
    }
}
